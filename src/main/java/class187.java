public class class187 extends LinkedListNode {

   static class229 field2337;
   public PacketBuffer outBuffer;
   public int field2331;
   public ClientPacketProt field2338;
   public int field2332;
   public static class187[] field2335 = new class187[300];
   public static int field2336 = 0;

   public void method3620(byte b_1) {
      if (field2336 < field2335.length) {
         field2335[++field2336 - 1] = this;
      }
   }

   static final void method3628() {
      class241.method4368(false);
      Client.field705 = 0;
      boolean bool_1 = true;

      int i_2;
      for (i_2 = 0; i_2 < class13.field90.length; i_2++) {
         if (class88.field1248[i_2] != -1 && class13.field90[i_2] == null) {
            class13.field90[i_2] = WorldMapCacheName.field307.method4144(class88.field1248[i_2], 0);
            if (class13.field90[i_2] == null) {
               bool_1 = false;
               ++Client.field705;
            }
         }

         if (class22.field178[i_2] != -1 && WorldMapElement.field1145[i_2] == null) {
            WorldMapElement.field1145[i_2] = WorldMapCacheName.field307.method4181(class22.field178[i_2], 0, class29.field255[i_2]);
            if (WorldMapElement.field1145[i_2] == null) {
               bool_1 = false;
               ++Client.field705;
            }
         }
      }

      if (!bool_1) {
         Client.field709 = 1;
      } else {
         Client.field707 = 0;
         bool_1 = true;

         int i_4;
         int i_5;
         for (i_2 = 0; i_2 < class13.field90.length; i_2++) {
            byte[] bytes_3 = WorldMapElement.field1145[i_2];
            if (bytes_3 != null) {
               i_4 = (TimeUtils.field2501[i_2] >> 8) * 64 - class196.field2389;
               i_5 = (TimeUtils.field2501[i_2] & 0xff) * 64 - SceneNode.field1;
               if (Client.field798) {
                  i_4 = 10;
                  i_5 = 10;
               }

               bool_1 &= class209.method3947(bytes_3, i_4, i_5);
            }
         }

         if (!bool_1) {
            Client.field709 = 2;
         } else {
            if (Client.field709 != 0) {
               class281.method5180("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            class186.method3619((byte) 70);
            class5.scene.clear();

            for (i_2 = 0; i_2 < 4; i_2++) {
               Client.field710[i_2].clear();
            }

            int i_50;
            for (i_2 = 0; i_2 < 4; i_2++) {
               for (i_50 = 0; i_50 < 104; i_50++) {
                  for (i_4 = 0; i_4 < 104; i_4++) {
                     class55.field502[i_2][i_50][i_4] = 0;
                  }
               }
            }

            class186.method3619((byte) 40);
            class55.field503 = 99;
            class55.field504 = new byte[4][104][104];
            class55.field505 = new byte[4][104][104];
            class55.field506 = new byte[4][104][104];
            class268.field3561 = new byte[4][104][104];
            class137.field1887 = new int[4][105][105];
            class32.field282 = new byte[4][105][105];
            class55.field515 = new int[105][105];
            class229.field3103 = new int[104];
            class55.field508 = new int[104];
            class55.field507 = new int[104];
            class93.field1301 = new int[104];
            class293.field3689 = new int[104];
            i_2 = class13.field90.length;

            for (class75 class75_56 = (class75) class75.field1080.method4892(); class75_56 != null; class75_56 = (class75) class75.field1080.method4894()) {
               if (class75_56.field1085 != null) {
                  class57.field532.method2293(class75_56.field1085);
                  class75_56.field1085 = null;
               }

               if (class75_56.field1084 != null) {
                  class57.field532.method2293(class75_56.field1084);
                  class75_56.field1084 = null;
               }
            }

            class75.field1080.method4886();
            class241.method4368(true);
            int i_7;
            int i_8;
            int i_10;
            int i_11;
            int i_12;
            int i_13;
            int i_52;
            if (!Client.field798) {
               byte[] bytes_6;
               for (i_50 = 0; i_50 < i_2; i_50++) {
                  i_4 = (TimeUtils.field2501[i_50] >> 8) * 64 - class196.field2389;
                  i_5 = (TimeUtils.field2501[i_50] & 0xff) * 64 - SceneNode.field1;
                  bytes_6 = class13.field90[i_50];
                  if (bytes_6 != null) {
                     class186.method3619((byte) 50);
                     i_7 = class48.field418 * 8 - 48;
                     i_8 = class128.field1747 * 8 - 48;
                     CollisionMap[] arr_9 = Client.field710;

                     for (i_10 = 0; i_10 < 4; i_10++) {
                        for (i_11 = 0; i_11 < 64; i_11++) {
                           for (i_12 = 0; i_12 < 64; i_12++) {
                              if (i_4 + i_11 > 0 && i_11 + i_4 < 103 && i_12 + i_5 > 0 && i_12 + i_5 < 103) {
                                 arr_9[i_10].flags[i_4 + i_11][i_12 + i_5] &= ~0x1000000;
                              }
                           }
                        }
                     }

                     ByteBuffer class300_51 = new ByteBuffer(bytes_6);

                     for (i_11 = 0; i_11 < 4; i_11++) {
                        for (i_12 = 0; i_12 < 64; i_12++) {
                           for (i_13 = 0; i_13 < 64; i_13++) {
                              class28.method419(class300_51, i_11, i_4 + i_12, i_5 + i_13, i_7, i_8, 0, -1566017890);
                           }
                        }
                     }
                  }
               }

               for (i_50 = 0; i_50 < i_2; i_50++) {
                  i_4 = (TimeUtils.field2501[i_50] >> 8) * 64 - class196.field2389;
                  i_5 = (TimeUtils.field2501[i_50] & 0xff) * 64 - SceneNode.field1;
                  bytes_6 = class13.field90[i_50];
                  if (bytes_6 == null && class128.field1747 < 800) {
                     class186.method3619((byte) 58);
                     class89.method2092(i_4, i_5, 64, 64);
                  }
               }

               class241.method4368(true);

               for (i_50 = 0; i_50 < i_2; i_50++) {
                  byte[] bytes_54 = WorldMapElement.field1145[i_50];
                  if (bytes_54 != null) {
                     i_5 = (TimeUtils.field2501[i_50] >> 8) * 64 - class196.field2389;
                     i_52 = (TimeUtils.field2501[i_50] & 0xff) * 64 - SceneNode.field1;
                     class186.method3619((byte) 75);
                     class205.method3933(bytes_54, i_5, i_52, class5.scene, Client.field710);
                  }
               }
            }

            int i_53;
            if (Client.field798) {
               for (i_50 = 0; i_50 < 4; i_50++) {
                  class186.method3619((byte) 116);

                  for (i_4 = 0; i_4 < 13; i_4++) {
                     for (i_5 = 0; i_5 < 13; i_5++) {
                        boolean bool_57 = false;
                        i_7 = Client.field712[i_50][i_4][i_5];
                        if (i_7 != -1) {
                           i_8 = i_7 >> 24 & 0x3;
                           i_53 = i_7 >> 1 & 0x3;
                           i_10 = i_7 >> 14 & 0x3ff;
                           i_11 = i_7 >> 3 & 0x7ff;
                           i_12 = (i_10 / 8 << 8) + i_11 / 8;

                           for (i_13 = 0; i_13 < TimeUtils.field2501.length; i_13++) {
                              if (TimeUtils.field2501[i_13] == i_12 && class13.field90[i_13] != null) {
                                 class56.method1088(class13.field90[i_13], i_50, i_4 * 8, i_5 * 8, i_8, (i_10 & 0x7) * 8, (i_11 & 0x7) * 8, i_53, Client.field710, (byte) 66);
                                 bool_57 = true;
                                 break;
                              }
                           }
                        }

                        if (!bool_57) {
                           i_8 = i_50;
                           i_53 = i_4 * 8;
                           i_10 = i_5 * 8;

                           for (i_11 = 0; i_11 < 8; i_11++) {
                              for (i_12 = 0; i_12 < 8; i_12++) {
                                 class55.field516[i_8][i_53 + i_11][i_12 + i_10] = 0;
                              }
                           }

                           if (i_53 > 0) {
                              for (i_11 = 1; i_11 < 8; i_11++) {
                                 class55.field516[i_8][i_53][i_10 + i_11] = class55.field516[i_8][i_53 - 1][i_10 + i_11];
                              }
                           }

                           if (i_10 > 0) {
                              for (i_11 = 1; i_11 < 8; i_11++) {
                                 class55.field516[i_8][i_53 + i_11][i_10] = class55.field516[i_8][i_53 + i_11][i_10 - 1];
                              }
                           }

                           if (i_53 > 0 && class55.field516[i_8][i_53 - 1][i_10] != 0) {
                              class55.field516[i_8][i_53][i_10] = class55.field516[i_8][i_53 - 1][i_10];
                           } else if (i_10 > 0 && class55.field516[i_8][i_53][i_10 - 1] != 0) {
                              class55.field516[i_8][i_53][i_10] = class55.field516[i_8][i_53][i_10 - 1];
                           } else if (i_53 > 0 && i_10 > 0 && class55.field516[i_8][i_53 - 1][i_10 - 1] != 0) {
                              class55.field516[i_8][i_53][i_10] = class55.field516[i_8][i_53 - 1][i_10 - 1];
                           }
                        }
                     }
                  }
               }

               for (i_50 = 0; i_50 < 13; i_50++) {
                  for (i_4 = 0; i_4 < 13; i_4++) {
                     i_5 = Client.field712[0][i_50][i_4];
                     if (i_5 == -1) {
                        class89.method2092(i_50 * 8, i_4 * 8, 8, 8);
                     }
                  }
               }

               class241.method4368(true);

               for (i_50 = 0; i_50 < 4; i_50++) {
                  class186.method3619((byte) 71);

                  for (i_4 = 0; i_4 < 13; i_4++) {
                     label447:
                     for (i_5 = 0; i_5 < 13; i_5++) {
                        i_52 = Client.field712[i_50][i_4][i_5];
                        if (i_52 != -1) {
                           i_7 = i_52 >> 24 & 0x3;
                           i_8 = i_52 >> 1 & 0x3;
                           i_53 = i_52 >> 14 & 0x3ff;
                           i_10 = i_52 >> 3 & 0x7ff;
                           i_11 = (i_53 / 8 << 8) + i_10 / 8;

                           for (i_12 = 0; i_12 < TimeUtils.field2501.length; i_12++) {
                              if (TimeUtils.field2501[i_12] == i_11 && WorldMapElement.field1145[i_12] != null) {
                                 byte[] bytes_55 = WorldMapElement.field1145[i_12];
                                 int i_14 = i_4 * 8;
                                 int i_15 = i_5 * 8;
                                 int i_16 = (i_53 & 0x7) * 8;
                                 int i_17 = (i_10 & 0x7) * 8;
                                 Scene scene_18 = class5.scene;
                                 CollisionMap[] arr_19 = Client.field710;
                                 ByteBuffer class300_20 = new ByteBuffer(bytes_55);
                                 int i_21 = -1;

                                 while (true) {
                                    int i_22 = class300_20.readExtendedSmartInt();
                                    if (i_22 == 0) {
                                       continue label447;
                                    }

                                    i_21 += i_22;
                                    int i_23 = 0;

                                    while (true) {
                                       int i_24 = class300_20.readSmartInt();
                                       if (i_24 == 0) {
                                          break;
                                       }

                                       i_23 += i_24 - 1;
                                       int i_25 = i_23 & 0x3f;
                                       int i_26 = i_23 >> 6 & 0x3f;
                                       int i_27 = i_23 >> 12;
                                       int i_28 = class300_20.readUnsignedByte();
                                       int i_29 = i_28 >> 2;
                                       int i_30 = i_28 & 0x3;
                                       if (i_7 == i_27 && i_26 >= i_16 && i_26 < i_16 + 8 && i_25 >= i_17 && i_25 < i_17 + 8) {
                                          class253 class253_31 = class128.method2970(i_21);
                                          int i_34 = i_26 & 0x7;
                                          int i_35 = i_25 & 0x7;
                                          int i_37 = class253_31.field3365;
                                          int i_38 = class253_31.field3366;
                                          int i_39;
                                          if ((i_30 & 0x1) == 1) {
                                             i_39 = i_37;
                                             i_37 = i_38;
                                             i_38 = i_39;
                                          }

                                          int i_36 = i_8 & 0x3;
                                          int i_33;
                                          if (i_36 == 0) {
                                             i_33 = i_34;
                                          } else if (i_36 == 1) {
                                             i_33 = i_35;
                                          } else if (i_36 == 2) {
                                             i_33 = 7 - i_34 - (i_37 - 1);
                                          } else {
                                             i_33 = 7 - i_35 - (i_38 - 1);
                                          }

                                          i_39 = i_33 + i_14;
                                          int i_42 = i_26 & 0x7;
                                          int i_43 = i_25 & 0x7;
                                          int i_45 = class253_31.field3365;
                                          int i_46 = class253_31.field3366;
                                          int i_47;
                                          if ((i_30 & 0x1) == 1) {
                                             i_47 = i_45;
                                             i_45 = i_46;
                                             i_46 = i_47;
                                          }

                                          int i_44 = i_8 & 0x3;
                                          int i_41;
                                          if (i_44 == 0) {
                                             i_41 = i_43;
                                          } else if (i_44 == 1) {
                                             i_41 = 7 - i_42 - (i_45 - 1);
                                          } else if (i_44 == 2) {
                                             i_41 = 7 - i_43 - (i_46 - 1);
                                          } else {
                                             i_41 = i_42;
                                          }

                                          i_47 = i_41 + i_15;
                                          if (i_39 > 0 && i_47 > 0 && i_39 < 103 && i_47 < 103) {
                                             int i_48 = i_50;
                                             if ((class55.field502[1][i_39][i_47] & 0x2) == 2) {
                                                i_48 = i_50 - 1;
                                             }

                                             CollisionMap collisionMap_49 = null;
                                             if (i_48 >= 0) {
                                                collisionMap_49 = arr_19[i_48];
                                             }

                                             class67.method1236(i_50, i_39, i_47, i_21, i_30 + i_8 & 0x3, i_29, scene_18, collisionMap_49);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            class241.method4368(true);
            class186.method3619((byte) 101);
            class6.method72(class5.scene, Client.field710);
            class241.method4368(true);
            i_50 = class55.field503;
            if (i_50 > WorldMapRectangle.plane) {
               i_50 = WorldMapRectangle.plane;
            }

            if (i_50 < WorldMapRectangle.plane - 1) {
               i_50 = WorldMapRectangle.plane - 1;
            }

            if (Client.resizeSettings2) {
               class5.scene.method3067(class55.field503);
            } else {
               class5.scene.method3067(0);
            }

            for (i_4 = 0; i_4 < 104; i_4++) {
               for (i_5 = 0; i_5 < 104; i_5++) {
                  class5.updatePendingSpawn(i_4, i_5);
               }
            }

            class186.method3619((byte) 11);

            for (class68 class68_58 = (class68) Client.field783.method4892(); class68_58 != null; class68_58 = (class68) Client.field783.method4894()) {
               if (class68_58.field931 == -1) {
                  class68_58.field941 = 0;
                  class294.method5327(class68_58);
               } else {
                  class68_58.unlink();
               }
            }

            class253.field3387.method3323();
            class187 class187_59;
            if (WorldMapID.client.method931()) {
               class187_59 = class235.method4265(ClientPacketProt.field2212, Client.data.field1313);
               class187_59.outBuffer.writeIntBigEndian(1057001181);
               Client.data.copy(class187_59);
            }

            if (!Client.field798) {
               i_4 = (class48.field418 - 6) / 8;
               i_5 = (class48.field418 + 6) / 8;
               i_52 = (class128.field1747 - 6) / 8;
               i_7 = (class128.field1747 + 6) / 8;

               for (i_8 = i_4 - 1; i_8 <= i_5 + 1; i_8++) {
                  for (i_53 = i_52 - 1; i_53 <= i_7 + 1; i_53++) {
                     if (i_8 < i_4 || i_8 > i_5 || i_53 < i_52 || i_53 > i_7) {
                        WorldMapCacheName.field307.method4166("m" + i_8 + "_" + i_53);
                        WorldMapCacheName.field307.method4166("l" + i_8 + "_" + i_53);
                     }
                  }
               }
            }

            class96.updateGameState(30);
            class186.method3619((byte) 70);
            class45.method787(337917094);
            class187_59 = class235.method4265(ClientPacketProt.field2279, Client.data.field1313);
            Client.data.copy(class187_59);
            class141.method3291();
         }
      }
   }

   public static boolean method3627(int i_0) {
      return i_0 == 10 || i_0 == 11 || i_0 == 12 || i_0 == 13 || i_0 == 14 || i_0 == 15 || i_0 == 16 || i_0 == 17;
   }

   static char method3623(char var_0, class190 class190_1) {
      if (var_0 >= 192 && var_0 <= 255) {
         if (var_0 >= 192 && var_0 <= 198) {
            return 'A';
         }

         if (var_0 == 199) {
            return 'C';
         }

         if (var_0 >= 200 && var_0 <= 203) {
            return 'E';
         }

         if (var_0 >= 204 && var_0 <= 207) {
            return 'I';
         }

         if (var_0 == 209 && class190_1 != class190.field2350) {
            return 'N';
         }

         if (var_0 >= 210 && var_0 <= 214) {
            return 'O';
         }

         if (var_0 >= 217 && var_0 <= 220) {
            return 'U';
         }

         if (var_0 == 221) {
            return 'Y';
         }

         if (var_0 == 223) {
            return 's';
         }

         if (var_0 >= 224 && var_0 <= 230) {
            return 'a';
         }

         if (var_0 == 231) {
            return 'c';
         }

         if (var_0 >= 232 && var_0 <= 235) {
            return 'e';
         }

         if (var_0 >= 236 && var_0 <= 239) {
            return 'i';
         }

         if (var_0 == 241 && class190_1 != class190.field2350) {
            return 'n';
         }

         if (var_0 >= 242 && var_0 <= 246) {
            return 'o';
         }

         if (var_0 >= 249 && var_0 <= 252) {
            return 'u';
         }

         if (var_0 == 253 || var_0 == 255) {
            return 'y';
         }
      }

      if (var_0 == 338) {
         return 'O';
      } else if (var_0 == 339) {
         return 'o';
      } else if (var_0 == 376) {
         return 'Y';
      } else {
         return var_0;
      }
   }

}
