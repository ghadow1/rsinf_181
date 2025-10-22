import java.io.File;

final class SceneNode implements class0 {

   static File field2;
   static int field1;
   static int field3;

   void method6(Integer integer_1, ByteBuffer class300_2) {
      class300_2.writeIntBigEndian(integer_1.intValue());
   }

   static final void addSceneNode(RenderableSceneNode RenderableSceneNode_0) {
      System.out.println("Adding scene node " + RenderableSceneNode_0.toString());
      PacketBuffer buffer3_2 = Client.data.packetBuffer;
      int i_3;
      int i_4;
      int i_5;
      int i_6;
      int i_7;
      int i_8;
      int i_9;
      if (RenderableSceneNode.field2320 == RenderableSceneNode_0) {
         System.out.println("Debug marker 678");

         i_3 = buffer3_2.readInvertedUnsignedByte();
         i_4 = i_3 >> 2;
         i_5 = i_3 & 0x3;
         i_6 = Client.field713[i_4];
         i_7 = buffer3_2.readInvertedUnsignedByte();
         i_8 = (i_7 >> 4 & 0x7) + class311.localSceneX;
         i_9 = (i_7 & 0x7) + UserComparator10.localSceneY;
         if (i_8 >= 0 && i_9 >= 0 && i_8 < 104 && i_9 < 104) {
            SceneSound.method3885(WorldMapRectangle.plane, i_8, i_9, i_6, -1, i_4, i_5, 0, -1);
         }

      } else {
         class87 class87_33;
         if (RenderableSceneNode.field2321 == RenderableSceneNode_0) {
            System.out.println("Debug marker 444");
            i_3 = buffer3_2.readOffsetUnsignedByte();
            i_4 = (i_3 >> 4 & 0x7) + class311.localSceneX;
            i_5 = (i_3 & 0x7) + UserComparator10.localSceneY;
            i_6 = buffer3_2.readShortWithOffset2();
            if (i_4 >= 0 && i_5 >= 0 && i_4 < 104 && i_5 < 104) {
               NodeDeque nodeDeque_32 = Client.groundItems[WorldMapRectangle.plane][i_4][i_5];
               if (nodeDeque_32 != null) {
                  for (class87_33 = (class87) nodeDeque_32.method4892(); class87_33 != null; class87_33 = (class87) nodeDeque_32.method4894()) {
                     if ((i_6 & 0x7fff) == class87_33.field1244) {
                        class87_33.unlink();
                        break;
                     }
                  }

                  if (nodeDeque_32.method4892() == null) {
                     Client.groundItems[WorldMapRectangle.plane][i_4][i_5] = null;
                  }

                  class5.updatePendingSpawn(i_4, i_5);
               }
            }

         } else {
            int i_10;
            int i_11;
            int i_13;
            byte b_14;
            int i_15;
            int i_40;
            if (RenderableSceneNode.projectileNode == RenderableSceneNode_0) { //..15
               //..Handle incoming projectiles to render
               System.out.println("Node to add is a projectile, attempting to read projectile data.");
               Projectile.decode(buffer3_2);
            } else if (RenderableSceneNode.field2322 == RenderableSceneNode_0) {
               System.out.println("Some other node type");

               i_3 = buffer3_2.readShortLittleEndian();
               i_4 = buffer3_2.readShortWithOffset2();
               i_5 = buffer3_2.readShortLittleEndian();
               i_6 = buffer3_2.readOffsetUnsignedByte();
               i_7 = (i_6 >> 4 & 0x7) + class311.localSceneX;
               i_8 = (i_6 & 0x7) + UserComparator10.localSceneY;
               if (i_7 >= 0 && i_8 >= 0 && i_7 < 104 && i_8 < 104) {
                  NodeDeque nodeDeque_43 = Client.groundItems[WorldMapRectangle.plane][i_7][i_8];
                  if (nodeDeque_43 != null) {
                     for (class87 class87_35 = (class87) nodeDeque_43.method4892(); class87_35 != null; class87_35 = (class87) nodeDeque_43.method4894()) {
                        if ((i_3 & 0x7fff) == class87_35.field1244 && i_5 == class87_35.field1245) {
                           class87_35.field1245 = i_4;
                           break;
                        }
                     }

                     class5.updatePendingSpawn(i_7, i_8);
                  }
               }

            } else if (RenderableSceneNode.field2315 == RenderableSceneNode_0) {
               System.out.println("Here 5 clear something");

               i_3 = buffer3_2.readShortWithOffset();
               i_4 = buffer3_2.readShortWithOffset2();
               i_5 = buffer3_2.readOffsetUnsignedByte();
               i_6 = (i_5 >> 4 & 0x7) + class311.localSceneX;
               i_7 = (i_5 & 0x7) + UserComparator10.localSceneY;
               if (i_6 >= 0 && i_7 >= 0 && i_6 < 104 && i_7 < 104) {
                  class87_33 = new class87();
                  class87_33.field1244 = i_4;
                  class87_33.field1245 = i_3;
                  if (Client.groundItems[WorldMapRectangle.plane][i_6][i_7] == null) {
                     Client.groundItems[WorldMapRectangle.plane][i_6][i_7] = new NodeDeque();
                  }

                  Client.groundItems[WorldMapRectangle.plane][i_6][i_7].addFirst(class87_33);
                  class5.updatePendingSpawn(i_6, i_7);
               }

            } else {
               if (RenderableSceneNode.field2319 == RenderableSceneNode_0) {
                  System.out.println("Here 5 clear something also");
                  i_3 = buffer3_2.readUnsignedByte();
                  i_4 = (i_3 >> 4 & 0x7) + class311.localSceneX;
                  i_5 = (i_3 & 0x7) + UserComparator10.localSceneY;
                  i_6 = buffer3_2.readInvertedUnsignedByte();
                  i_7 = buffer3_2.readOffsetUnsignedByte();
                  i_8 = i_7 >> 4 & 0xf;
                  i_9 = i_7 & 0x7;
                  i_10 = buffer3_2.readShortWithOffset2();
                  if (i_4 >= 0 && i_5 >= 0 && i_4 < 104 && i_5 < 104) {
                     i_11 = i_8 + 1;
                     if (Client.localPlayer.field994[0] >= i_4 - i_11 && Client.localPlayer.field994[0] <= i_4 + i_11 && Client.localPlayer.field962[0] >= i_5 - i_11 && Client.localPlayer.field962[0] <= i_5 + i_11 && Client.field892 != 0 && i_9 > 0 && Client.field893 < 50) {
                        Client.field894[Client.field893] = i_10;
                        Client.field895[Client.field893] = i_9;
                        Client.field897[Client.field893] = i_6;
                        Client.field898[Client.field893] = null;
                        Client.field841[Client.field893] = i_8 + (i_5 << 8) + (i_4 << 16);
                        ++Client.field893;
                     }
                  }
               }

               if (RenderableSceneNode.clearItem == RenderableSceneNode_0) {
                  System.out.println("Here 14 clear something");
                  byte b_38 = buffer3_2.readNegatedByte();
                  i_4 = buffer3_2.readShortWithOffset2();
                  byte b_39 = buffer3_2.readNegatedByte();
                  i_6 = buffer3_2.readShortWithOffset();
                  i_7 = buffer3_2.readUnsignedShort();
                  i_8 = buffer3_2.readOffsetUnsignedByte();
                  i_9 = i_8 >> 2;
                  i_10 = i_8 & 0x3;
                  i_11 = Client.field713[i_9];
                  byte b_12 = buffer3_2.readOffsetByte();
                  i_13 = buffer3_2.readShortLittleEndian();
                  b_14 = buffer3_2.readNegatedByte();
                  i_15 = buffer3_2.readNegatedUnsignedByte();
                  int i_36 = (i_15 >> 4 & 0x7) + class311.localSceneX;
                  int i_17 = (i_15 & 0x7) + UserComparator10.localSceneY;
                  class66 class66_18;
                  if (i_13 == Client.field770) {
                     class66_18 = Client.localPlayer;
                  } else {
                     class66_18 = Client.field909[i_13];
                  }

                  if (class66_18 != null) {
                     class253 class253_19 = class128.method2970(i_6);
                     int i_20;
                     int i_21;
                     if (i_10 != 1 && i_10 != 3) {
                        i_20 = class253_19.field3365;
                        i_21 = class253_19.field3366;
                     } else {
                        i_20 = class253_19.field3366;
                        i_21 = class253_19.field3365;
                     }

                     int i_22 = i_36 + (i_20 >> 1);
                     int i_23 = i_36 + (i_20 + 1 >> 1);
                     int i_24 = i_17 + (i_21 >> 1);
                     int i_25 = i_17 + (i_21 + 1 >> 1);
                     int[][] ints_26 = class55.field516[WorldMapRectangle.plane];
                     int i_27 = ints_26[i_23][i_24] + ints_26[i_22][i_24] + ints_26[i_22][i_25] + ints_26[i_23][i_25] >> 2;
                     int i_28 = (i_36 << 7) + (i_20 << 6);
                     int i_29 = (i_17 << 7) + (i_21 << 6);
                     class127 class127_30 = class253_19.method4592(i_9, i_10, ints_26, i_28, i_27, i_29);
                     if (class127_30 != null) {
                        SceneSound.method3885(WorldMapRectangle.plane, i_36, i_17, i_11, -1, 0, 0, i_7 + 1, i_4 + 1);
                        class66_18.field614 = i_7 + Client.cycle;
                        class66_18.field622 = i_4 + Client.cycle;
                        class66_18.field626 = class127_30;
                        class66_18.field633 = i_36 * 128 + i_20 * 64;
                        class66_18.field620 = i_17 * 128 + i_21 * 64;
                        class66_18.field624 = i_27;
                        byte b_31;
                        if (b_38 > b_14) {
                           b_31 = b_38;
                           b_38 = b_14;
                           b_14 = b_31;
                        }

                        if (b_12 > b_39) {
                           b_31 = b_12;
                           b_12 = b_39;
                           b_39 = b_31;
                        }

                        class66_18.field627 = i_36 + b_38;
                        class66_18.field612 = i_36 + b_14;
                        class66_18.field625 = b_12 + i_17;
                        class66_18.field630 = i_17 + b_39;
                     }
                  }
               }

               if (RenderableSceneNode.field2323 == RenderableSceneNode_0) {
                  System.out.println("Debug marker 448888884");

                  i_3 = buffer3_2.readOffsetUnsignedByte();
                  i_4 = (i_3 >> 4 & 0x7) + class311.localSceneX;
                  i_5 = (i_3 & 0x7) + UserComparator10.localSceneY;
                  i_6 = buffer3_2.readInvertedUnsignedByte();
                  i_7 = i_6 >> 2;
                  i_8 = i_6 & 0x3;
                  i_9 = Client.field713[i_7];
                  i_10 = buffer3_2.readShortWithOffset();
                  if (i_4 >= 0 && i_5 >= 0 && i_4 < 104 && i_5 < 104) {
                     SceneSound.method3885(WorldMapRectangle.plane, i_4, i_5, i_9, i_10, i_7, i_8, 0, -1);
                  }

               } else if (RenderableSceneNode.field2317 == RenderableSceneNode_0) {
                  System.out.println("Debug marker 345345345");

                  i_3 = buffer3_2.readUnsignedShort();
                  i_4 = buffer3_2.readOffsetUnsignedByte();
                  i_5 = buffer3_2.readShortWithOffset();
                  i_6 = buffer3_2.readUnsignedByte();
                  i_7 = (i_6 >> 4 & 0x7) + class311.localSceneX;
                  i_8 = (i_6 & 0x7) + UserComparator10.localSceneY;
                  if (i_7 >= 0 && i_8 >= 0 && i_7 < 104 && i_8 < 104) {
                     i_7 = i_7 * 128 + 64;
                     i_8 = i_8 * 128 + 64;
                     class77 class77_34 = new class77(i_3, WorldMapRectangle.plane, i_7, i_8, MusicPatchPcmStream.getTileHeight(i_7, i_8, WorldMapRectangle.plane) - i_4, i_5, Client.cycle);
                     Client.field785.addFirst(class77_34);
                  }

               } else if (RenderableSceneNode.field2324 == RenderableSceneNode_0) {
                  i_3 = buffer3_2.readInvertedUnsignedByte();
                  i_4 = i_3 >> 2;
                  i_5 = i_3 & 0x3;
                  i_6 = Client.field713[i_4];
                  i_7 = buffer3_2.readNegatedUnsignedByte();
                  i_8 = (i_7 >> 4 & 0x7) + class311.localSceneX;
                  i_9 = (i_7 & 0x7) + UserComparator10.localSceneY;
                  i_10 = buffer3_2.readUnsignedShort();
                  if (i_8 >= 0 && i_9 >= 0 && i_8 < 103 && i_9 < 103) {
                     if (i_6 == 0) {
                        class136 class136_37 = class5.field22.method3088(WorldMapRectangle.plane, i_8, i_9);
                        if (class136_37 != null) {
                           i_40 = GCMonitor.method770(class136_37.field1882);
                           if (i_4 == 2) {
                              class136_37.field1884 = new class93(i_40, 2, i_5 + 4, WorldMapRectangle.plane, i_8, i_9, i_10, false, class136_37.field1884);
                              class136_37.field1881 = new class93(i_40, 2, i_5 + 1 & 0x3, WorldMapRectangle.plane, i_8, i_9, i_10, false, class136_37.field1881);
                           } else {
                              class136_37.field1884 = new class93(i_40, i_4, i_5, WorldMapRectangle.plane, i_8, i_9, i_10, false, class136_37.field1884);
                           }
                        }
                     }

                     if (i_6 == 1) {
                        class141 class141_44 = class5.field22.method3118(WorldMapRectangle.plane, i_8, i_9);
                        if (class141_44 != null) {
                           i_40 = GCMonitor.method770(class141_44.field1917);
                           if (i_4 != 4 && i_4 != 5) {
                              if (i_4 == 6) {
                                 class141_44.field1924 = new class93(i_40, 4, i_5 + 4, WorldMapRectangle.plane, i_8, i_9, i_10, false, class141_44.field1924);
                              } else if (i_4 == 7) {
                                 class141_44.field1924 = new class93(i_40, 4, (i_5 + 2 & 0x3) + 4, WorldMapRectangle.plane, i_8, i_9, i_10, false, class141_44.field1924);
                              } else if (i_4 == 8) {
                                 class141_44.field1924 = new class93(i_40, 4, i_5 + 4, WorldMapRectangle.plane, i_8, i_9, i_10, false, class141_44.field1924);
                                 class141_44.field1925 = new class93(i_40, 4, (i_5 + 2 & 0x3) + 4, WorldMapRectangle.plane, i_8, i_9, i_10, false, class141_44.field1925);
                              }
                           } else {
                              class141_44.field1924 = new class93(i_40, 4, i_5, WorldMapRectangle.plane, i_8, i_9, i_10, false, class141_44.field1924);
                           }
                        }
                     }

                     if (i_6 == 2) {
                        GameObject fileSystem_45 = class5.field22.method3195(WorldMapRectangle.plane, i_8, i_9);
                        if (i_4 == 11) {
                           i_4 = 10;
                        }

                        if (fileSystem_45 != null) {
                           fileSystem_45.field1933 = new class93(GCMonitor.method770(fileSystem_45.field1941), i_4, i_5, WorldMapRectangle.plane, i_8, i_9, i_10, false, fileSystem_45.field1933);
                        }
                     }

                     if (i_6 == 3) {
                        class123 class123_46 = class5.field22.method3091(WorldMapRectangle.plane, i_8, i_9);
                        if (class123_46 != null) {
                           class123_46.field1614 = new class93(GCMonitor.method770(class123_46.field1617), 22, i_5, WorldMapRectangle.plane, i_8, i_9, i_10, false, class123_46.field1614);
                        }
                     }
                  }

               }
            }
         }
      }
   }

   public void vmethod43(Object object_1, ByteBuffer class300_2, int i_3) {
      this.method6((Integer) object_1, class300_2);
   }

   public Object vmethod42(ByteBuffer class300_1, int i_2) {
      return Integer.valueOf(class300_1.readIntMedEndian());
   }

   static boolean method5(int i_0) {
      return i_0 == 57 || i_0 == 58 || i_0 == 1007 || i_0 == 25 || i_0 == 30;
   }

   public static String method17(String string_0) {
      int i_2 = string_0.length();
      char[] arr_3 = new char[i_2];
      byte b_4 = 2;

      for (int i_5 = 0; i_5 < i_2; i_5++) {
         char var_6 = string_0.charAt(i_5);
         if (b_4 == 0) {
            var_6 = Character.toLowerCase(var_6);
         } else if (b_4 == 2 || Character.isUpperCase(var_6)) {
            char var_7;
            if (var_6 != 181 && var_6 != 402) {
               var_7 = Character.toTitleCase(var_6);
            } else {
               var_7 = var_6;
            }

            var_6 = var_7;
         }

         if (Character.isLetter(var_6)) {
            b_4 = 0;
         } else if (var_6 != 46 && var_6 != 63 && var_6 != 33) {
            if (Character.isSpaceChar(var_6)) {
               if (b_4 != 2) {
                  b_4 = 1;
               }
            } else {
               b_4 = 1;
            }
         } else {
            b_4 = 2;
         }

         arr_3[i_5] = var_6;
      }

      return new String(arr_3);
   }

   static final int method14(int i_0, int i_1) {
      int i_3 = class257.method4757(45365 + i_0, 91923 + i_1, 4) - 128 + (class257.method4757(i_0 + 10294, i_1 + 37821, 2) - 128 >> 1) + (class257.method4757(i_0, i_1, 1) - 128 >> 2);
      i_3 = (int)((double)i_3 * 0.3D) + 35;
      if (i_3 < 10) {
         i_3 = 10;
      } else if (i_3 > 60) {
         i_3 = 60;
      }

      return i_3;
   }

}
