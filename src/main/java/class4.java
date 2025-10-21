final class class4 implements class0 {

   static int field19;
   static class235 field18;

   void method40(String string_1, ByteBuffer class300_2, byte b_3) {
      class300_2.writeNullTerminatedString(string_1);
   }

   public Object vmethod42(ByteBuffer class300_1, int i_2) {
      return class300_1.readNullTerminatedString();
   }

   public void vmethod43(Object object_1, ByteBuffer class300_2, int i_3) {
      this.method40((String) object_1, class300_2, (byte) 0);
   }

   static final void method48(int i_0, int i_1, int i_2, int i_3, int i_4) {
      ++Client.field751;
      class56.method1085();
      if (Client.field773) {
         class227.method4124(Client.localPlayer, false, (byte) 22);
      }

      if (Client.field781 >= 0 && Client.field909[Client.field781] != null) {
         class227.method4124(Client.field909[Client.field781], false, (byte) 22);
      }

      class29.method497(true, 878790252);
      int i_5 = class89.field1255;
      int[] ints_6 = class89.field1257;

      int i_7;
      for (i_7 = 0; i_7 < i_5; i_7++) {
         if (ints_6[i_7] != Client.field781 && ints_6[i_7] != Client.field770) {
            class227.method4124(Client.field909[ints_6[i_7]], true, (byte) 22);
         }
      }

      class29.method497(false, -1807867865);
      PacketWriter.method2245();
      class22.method275(205706610);
      class144.method3318(i_0, i_1, i_2, i_3, true);
      i_0 = Client.field913;
      i_1 = Client.field914;
      i_2 = Client.field746;
      i_3 = Client.field714;
      Rasterizer2D.setClip(i_0, i_1, i_0 + i_2, i_3 + i_1);
      Rasterizer3D.method3051();
      int i_29;
      if (!Client.field899) {
         i_5 = Client.field721;
         if (Client.field739 / 256 > i_5) {
            i_5 = Client.field739 / 256;
         }

         if (Client.field886[4] && Client.field902[4] + 128 > i_5) {
            i_5 = Client.field902[4] + 128;
         }

         i_29 = Client.camAngleY & 0x7ff;
         class72.method1724(MouseHandler.field499, Client.field729, item.field227, i_5, i_29, FontName.method700(i_5, (byte) -68), i_3);
      }

      int i_8;
      int i_9;
      int i_10;
      int i_11;
      int i_12;
      int i_13;
      int i_14;
      int i_15;
      if (!Client.field899) {
         if (class17.field117.field1060) {
            i_29 = WorldMapRectangle.plane;
         } else {
            label567: {
               i_7 = 3;
               if (class11.field77 < 310) {
                  label559: {
                     if (Client.field727 == 1) {
                        i_8 = MouseHandler.field499 >> 7;
                        i_9 = item.field227 >> 7;
                     } else {
                        i_8 = Client.localPlayer.x >> 7;
                        i_9 = Client.localPlayer.y >> 7;
                     }

                     i_10 = PacketBuffer.field3727 >> 7;
                     i_11 = SceneNode.field3 >> 7;
                     if (i_10 >= 0 && i_11 >= 0 && i_10 < 104 && i_11 < 104) {
                        if (i_8 >= 0 && i_9 >= 0 && i_8 < 104 && i_9 < 104) {
                           if ((class55.field502[WorldMapRectangle.plane][i_10][i_11] & 0x4) != 0) {
                              i_7 = WorldMapRectangle.plane;
                           }

                           if (i_8 > i_10) {
                              i_12 = i_8 - i_10;
                           } else {
                              i_12 = i_10 - i_8;
                           }

                           if (i_9 > i_11) {
                              i_13 = i_9 - i_11;
                           } else {
                              i_13 = i_11 - i_9;
                           }

                           if (i_12 > i_13) {
                              i_14 = i_13 * 65536 / i_12;
                              i_15 = 32768;

                              while (true) {
                                 if (i_8 == i_10) {
                                    break label559;
                                 }

                                 if (i_10 < i_8) {
                                    ++i_10;
                                 } else if (i_10 > i_8) {
                                    --i_10;
                                 }

                                 if ((class55.field502[WorldMapRectangle.plane][i_10][i_11] & 0x4) != 0) {
                                    i_7 = WorldMapRectangle.plane;
                                 }

                                 i_15 += i_14;
                                 if (i_15 >= 65536) {
                                    i_15 -= 65536;
                                    if (i_11 < i_9) {
                                       ++i_11;
                                    } else if (i_11 > i_9) {
                                       --i_11;
                                    }

                                    if ((class55.field502[WorldMapRectangle.plane][i_10][i_11] & 0x4) != 0) {
                                       i_7 = WorldMapRectangle.plane;
                                    }
                                 }
                              }
                           } else {
                              if (i_13 > 0) {
                                 i_14 = i_12 * 65536 / i_13;
                                 i_15 = 32768;

                                 while (i_11 != i_9) {
                                    if (i_11 < i_9) {
                                       ++i_11;
                                    } else if (i_11 > i_9) {
                                       --i_11;
                                    }

                                    if ((class55.field502[WorldMapRectangle.plane][i_10][i_11] & 0x4) != 0) {
                                       i_7 = WorldMapRectangle.plane;
                                    }

                                    i_15 += i_14;
                                    if (i_15 >= 65536) {
                                       i_15 -= 65536;
                                       if (i_10 < i_8) {
                                          ++i_10;
                                       } else if (i_10 > i_8) {
                                          --i_10;
                                       }

                                       if ((class55.field502[WorldMapRectangle.plane][i_10][i_11] & 0x4) != 0) {
                                          i_7 = WorldMapRectangle.plane;
                                       }
                                    }
                                 }
                              }
                              break label559;
                           }
                        }

                        i_29 = WorldMapRectangle.plane;
                        break label567;
                     }

                     i_29 = WorldMapRectangle.plane;
                     break label567;
                  }
               }

               if (Client.localPlayer.x >= 0 && Client.localPlayer.y >= 0 && Client.localPlayer.x < 13312 && Client.localPlayer.y < 13312) {
                  if ((class55.field502[WorldMapRectangle.plane][Client.localPlayer.x >> 7][Client.localPlayer.y >> 7] & 0x4) != 0) {
                     i_7 = WorldMapRectangle.plane;
                  }

                  i_29 = i_7;
               } else {
                  i_29 = WorldMapRectangle.plane;
               }
            }
         }

         i_5 = i_29;
      } else {
         i_5 = class83.method1995(1224050195);
      }

      i_29 = PacketBuffer.field3727;
      i_7 = GCMonitor.field383;
      i_8 = SceneNode.field3;
      i_9 = class11.field77;
      i_10 = MouseRecorder.field1112;

      for (i_11 = 0; i_11 < 5; i_11++) {
         if (Client.field886[i_11]) {
            i_12 = (int)(Math.random() * (double)(Client.field901[i_11] * 2 + 1) - (double) Client.field901[i_11] + Math.sin((double) Client.field903[i_11] / 100.0D * (double) Client.field904[i_11]) * (double) Client.field902[i_11]);
            if (i_11 == 0) {
               PacketBuffer.field3727 += i_12;
            }

            if (i_11 == 1) {
               GCMonitor.field383 += i_12;
            }

            if (i_11 == 2) {
               SceneNode.field3 += i_12;
            }

            if (i_11 == 3) {
               MouseRecorder.field1112 = i_12 + MouseRecorder.field1112 & 0x7ff;
            }

            if (i_11 == 4) {
               class11.field77 += i_12;
               if (class11.field77 < 128) {
                  class11.field77 = 128;
               }

               if (class11.field77 > 383) {
                  class11.field77 = 383;
               }
            }
         }
      }

      i_11 = MouseHandler.MouseHandler_x;
      i_12 = MouseHandler.MouseHandler_y;
      if (MouseHandler.field493 != 0) {
         i_11 = MouseHandler.field483;
         i_12 = MouseHandler.field495;
      }

      if (i_11 >= i_0 && i_11 < i_0 + i_2 && i_12 >= i_1 && i_12 < i_3 + i_1) {
         i_13 = i_11 - i_0;
         i_14 = i_12 - i_1;
         class128.field1742 = i_13;
         class128.field1743 = i_14;
         class128.field1753 = true;
         class128.field1748 = 0;
         class128.field1744 = false;
      } else {
         class190.method3665();
      }

      class186.method3619((byte) 95);
      Rasterizer2D.fillRectangle(i_0, i_1, i_2, i_3, 0);
      class186.method3619((byte) 8);
      i_13 = Rasterizer3D.field1773;
      Rasterizer3D.field1773 = Client.field917;
      class5.field22.method3092(PacketBuffer.field3727, GCMonitor.field383, SceneNode.field3, class11.field77, MouseRecorder.field1112, i_5);
      Rasterizer3D.field1773 = i_13;
      class186.method3619((byte) 124);
      class5.field22.method3115();
      Client.field740 = 0;
      boolean bool_32 = false;
      i_15 = -1;
      int i_16 = -1;
      int i_17 = class89.field1255;
      int[] ints_18 = class89.field1257;

      int i_19;
      for (i_19 = 0; i_19 < i_17 + Client.npcCount; i_19++) {
         Object obj_20;
         if (i_19 < i_17) {
            obj_20 = Client.field909[ints_18[i_19]];
            if (ints_18[i_19] == Client.field781) {
               bool_32 = true;
               i_15 = i_19;
               continue;
            }

            if (obj_20 == Client.localPlayer) {
               i_16 = i_19;
               continue;
            }
         } else {
            obj_20 = Client.npcs[Client.npcIndices[i_19 - i_17]];
         }

         class112.method2506((class69) obj_20, i_19, i_0, i_1, i_2, i_3);
      }

      if (Client.field773 && i_16 != -1) {
         class112.method2506(Client.localPlayer, i_16, i_0, i_1, i_2, i_3);
      }

      if (bool_32) {
         class112.method2506(Client.field909[Client.field781], i_15, i_0, i_1, i_2, i_3);
      }

      for (i_19 = 0; i_19 < Client.field740; i_19++) {
         int i_30 = Client.field742[i_19];
         int i_21 = Client.field743[i_19];
         int i_22 = Client.field676[i_19];
         int i_23 = Client.field744[i_19];
         boolean bool_24 = true;

         while (bool_24) {
            bool_24 = false;

            for (int i_25 = 0; i_25 < i_19; i_25++) {
               if (i_21 + 2 > Client.field743[i_25] - Client.field744[i_25] && i_21 - i_23 < Client.field743[i_25] + 2 && i_30 - i_22 < Client.field676[i_25] + Client.field742[i_25] && i_22 + i_30 > Client.field742[i_25] - Client.field676[i_25] && Client.field743[i_25] - Client.field744[i_25] < i_21) {
                  i_21 = Client.field743[i_25] - Client.field744[i_25];
                  bool_24 = true;
               }
            }
         }

         Client.field752 = Client.field742[i_19];
         Client.field753 = Client.field743[i_19] = i_21;
         String string_31 = Client.field749[i_19];
         if (Client.field819 == 0) {
            int i_26 = 16776960;
            if (Client.field702[i_19] < 6) {
               i_26 = Client.field870[Client.field702[i_19]];
            }

            if (Client.field702[i_19] == 6) {
               i_26 = Client.field751 % 20 < 10 ? 16711680 : 16776960;
            }

            if (Client.field702[i_19] == 7) {
               i_26 = Client.field751 % 20 < 10 ? 255 : 65535;
            }

            if (Client.field702[i_19] == 8) {
               i_26 = Client.field751 % 20 < 10 ? 45056 : 8454016;
            }

            int i_27;
            if (Client.field702[i_19] == 9) {
               i_27 = 150 - Client.field748[i_19];
               if (i_27 < 50) {
                  i_26 = i_27 * 1280 + 16711680;
               } else if (i_27 < 100) {
                  i_26 = 16776960 - (i_27 - 50) * 327680;
               } else if (i_27 < 150) {
                  i_26 = (i_27 - 100) * 5 + 65280;
               }
            }

            if (Client.field702[i_19] == 10) {
               i_27 = 150 - Client.field748[i_19];
               if (i_27 < 50) {
                  i_26 = i_27 * 5 + 16711680;
               } else if (i_27 < 100) {
                  i_26 = 16711935 - (i_27 - 50) * 327680;
               } else if (i_27 < 150) {
                  i_26 = (i_27 - 100) * 327680 + 255 - (i_27 - 100) * 5;
               }
            }

            if (Client.field702[i_19] == 11) {
               i_27 = 150 - Client.field748[i_19];
               if (i_27 < 50) {
                  i_26 = 16777215 - i_27 * 327685;
               } else if (i_27 < 100) {
                  i_26 = (i_27 - 50) * 327685 + 65280;
               } else if (i_27 < 150) {
                  i_26 = 16777215 - (i_27 - 100) * 327680;
               }
            }

            if (Client.field805[i_19] == 0) {
               class23.fontBold12.method5341(string_31, i_0 + Client.field752, Client.field753 + i_1, i_26, 0);
            }

            if (Client.field805[i_19] == 1) {
               class23.fontBold12.method5351(string_31, i_0 + Client.field752, Client.field753 + i_1, i_26, 0, Client.field751);
            }

            if (Client.field805[i_19] == 2) {
               class23.fontBold12.method5353(string_31, i_0 + Client.field752, Client.field753 + i_1, i_26, 0, Client.field751);
            }

            if (Client.field805[i_19] == 3) {
               class23.fontBold12.method5373(string_31, i_0 + Client.field752, Client.field753 + i_1, i_26, 0, Client.field751, 150 - Client.field748[i_19]);
            }

            if (Client.field805[i_19] == 4) {
               i_27 = (150 - Client.field748[i_19]) * (class23.fontBold12.method5417(string_31) + 100) / 150;
               Rasterizer2D.method5998(i_0 + Client.field752 - 50, i_1, i_0 + Client.field752 + 50, i_3 + i_1);
               class23.fontBold12.draw(string_31, i_0 + Client.field752 + 50 - i_27, Client.field753 + i_1, i_26, 0);
               Rasterizer2D.setClip(i_0, i_1, i_0 + i_2, i_3 + i_1);
            }

            if (Client.field805[i_19] == 5) {
               i_27 = 150 - Client.field748[i_19];
               int i_28 = 0;
               if (i_27 < 25) {
                  i_28 = i_27 - 25;
               } else if (i_27 > 125) {
                  i_28 = i_27 - 125;
               }

               Rasterizer2D.method5998(i_0, Client.field753 + i_1 - class23.fontBold12.field3709 - 1, i_0 + i_2, Client.field753 + i_1 + 5);
               class23.fontBold12.method5341(string_31, i_0 + Client.field752, i_28 + Client.field753 + i_1, i_26, 0);
               Rasterizer2D.setClip(i_0, i_1, i_0 + i_2, i_3 + i_1);
            }
         } else {
            class23.fontBold12.method5341(string_31, i_0 + Client.field752, Client.field753 + i_1, 16776960, 0);
         }
      }

      if (Client.field708 == 2) {
         class32.method544((Client.field737 - class196.field2389 << 7) + Client.field821, (Client.field777 - SceneNode.field1 << 7) + Client.field677, Client.field675 * 2);
         if (Client.field752 > -1 && Client.cycle % 20 < 10) {
            class173.field2096[0].drawTransBgAt(i_0 + Client.field752 - 12, Client.field753 + i_1 - 28);
         }
      }

      ((class119) Rasterizer3D.field1781).method2736(Client.field718);
      class21.method273();
      PacketBuffer.field3727 = i_29;
      GCMonitor.field383 = i_7;
      SceneNode.field3 = i_8;
      class11.field77 = i_9;
      MouseRecorder.field1112 = i_10;
      if (Client.field661) {
         byte b_33 = 0;
         i_15 = b_33 + class236.field3168 + class236.field3166;
         if (i_15 == 0) {
            Client.field661 = false;
         }
      }

      if (Client.field661) {
         Rasterizer2D.fillRectangle(i_0, i_1, i_2, i_3, 0);
         class281.method5180("Loading - please wait.", false, -32623127);
      }

   }

   static final int method49(int i_0, int i_1, int i_2, int i_3, int i_4) {
      int i_5 = 65536 - Rasterizer3D.cosine[i_2 * 1024 / i_3] >> 1;
      return ((65536 - i_5) * i_0 >> 16) + (i_5 * i_1 >> 16);
   }

}
