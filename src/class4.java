final class class4 implements class0 {

   static int field19;
   static class235 field18;

   void method40(String string_1, class300 class300_2, byte b_3) {
      class300_2.method5485(string_1);
   }

   public Object vmethod42(class300 class300_1, int i_2) {
      return class300_1.readNullTermString();
   }

   public void vmethod43(Object object_1, class300 class300_2, int i_3) {
      this.method40((String) object_1, class300_2, (byte) 0);
   }

   static final void method48(int i_0, int i_1, int i_2, int i_3, int i_4) {
      ++client.field751;
      class56.method1085(975361183);
      if (client.field773) {
         class227.method4124(client.field657, false, (byte) 22);
      }

      if (client.field781 >= 0 && client.field909[client.field781] != null) {
         class227.method4124(client.field909[client.field781], false, (byte) 22);
      }

      class29.method497(true, 878790252);
      int i_5 = class89.field1255;
      int[] ints_6 = class89.field1257;

      int i_7;
      for (i_7 = 0; i_7 < i_5; i_7++) {
         if (ints_6[i_7] != client.field781 && ints_6[i_7] != client.field770) {
            class227.method4124(client.field909[ints_6[i_7]], true, (byte) 22);
         }
      }

      class29.method497(false, -1807867865);
      class95.method2245();
      class22.method275(205706610);
      class144.method3318(i_0, i_1, i_2, i_3, true, (byte) -69);
      i_0 = client.field913;
      i_1 = client.field914;
      i_2 = client.field746;
      i_3 = client.field714;
      class321.method5997(i_0, i_1, i_0 + i_2, i_3 + i_1);
      class130.method3051();
      int i_29;
      if (!client.field899) {
         i_5 = client.field721;
         if (client.field739 / 256 > i_5) {
            i_5 = client.field739 / 256;
         }

         if (client.field886[4] && client.field902[4] + 128 > i_5) {
            i_5 = client.field902[4] + 128;
         }

         i_29 = client.field722 & 0x7ff;
         class72.method1724(class54.field499, client.field729, class26.field227, i_5, i_29, class40.method700(i_5, (byte) -68), i_3, 806808180);
      }

      int i_8;
      int i_9;
      int i_10;
      int i_11;
      int i_12;
      int i_13;
      int i_14;
      int i_15;
      if (!client.field899) {
         if (class17.field117.field1060) {
            i_29 = class42.field372;
         } else {
            label567: {
               i_7 = 3;
               if (class11.field77 < 310) {
                  label559: {
                     if (client.field727 == 1) {
                        i_8 = class54.field499 >> 7;
                        i_9 = class26.field227 >> 7;
                     } else {
                        i_8 = client.field657.field1005 >> 7;
                        i_9 = client.field657.field949 >> 7;
                     }

                     i_10 = class299.field3727 >> 7;
                     i_11 = class1.field3 >> 7;
                     if (i_10 >= 0 && i_11 >= 0 && i_10 < 104 && i_11 < 104) {
                        if (i_8 >= 0 && i_9 >= 0 && i_8 < 104 && i_9 < 104) {
                           if ((class55.field502[class42.field372][i_10][i_11] & 0x4) != 0) {
                              i_7 = class42.field372;
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

                                 if ((class55.field502[class42.field372][i_10][i_11] & 0x4) != 0) {
                                    i_7 = class42.field372;
                                 }

                                 i_15 += i_14;
                                 if (i_15 >= 65536) {
                                    i_15 -= 65536;
                                    if (i_11 < i_9) {
                                       ++i_11;
                                    } else if (i_11 > i_9) {
                                       --i_11;
                                    }

                                    if ((class55.field502[class42.field372][i_10][i_11] & 0x4) != 0) {
                                       i_7 = class42.field372;
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

                                    if ((class55.field502[class42.field372][i_10][i_11] & 0x4) != 0) {
                                       i_7 = class42.field372;
                                    }

                                    i_15 += i_14;
                                    if (i_15 >= 65536) {
                                       i_15 -= 65536;
                                       if (i_10 < i_8) {
                                          ++i_10;
                                       } else if (i_10 > i_8) {
                                          --i_10;
                                       }

                                       if ((class55.field502[class42.field372][i_10][i_11] & 0x4) != 0) {
                                          i_7 = class42.field372;
                                       }
                                    }
                                 }
                              }
                              break label559;
                           }
                        }

                        i_29 = class42.field372;
                        break label567;
                     }

                     i_29 = class42.field372;
                     break label567;
                  }
               }

               if (client.field657.field1005 >= 0 && client.field657.field949 >= 0 && client.field657.field1005 < 13312 && client.field657.field949 < 13312) {
                  if ((class55.field502[class42.field372][client.field657.field1005 >> 7][client.field657.field949 >> 7] & 0x4) != 0) {
                     i_7 = class42.field372;
                  }

                  i_29 = i_7;
               } else {
                  i_29 = class42.field372;
               }
            }
         }

         i_5 = i_29;
      } else {
         i_5 = class83.method1995(1224050195);
      }

      i_29 = class299.field3727;
      i_7 = class43.field383;
      i_8 = class1.field3;
      i_9 = class11.field77;
      i_10 = class76.field1112;

      for (i_11 = 0; i_11 < 5; i_11++) {
         if (client.field886[i_11]) {
            i_12 = (int)(Math.random() * (double)(client.field901[i_11] * 2 + 1) - (double)client.field901[i_11] + Math.sin((double)client.field903[i_11] / 100.0D * (double)client.field904[i_11]) * (double)client.field902[i_11]);
            if (i_11 == 0) {
               class299.field3727 += i_12;
            }

            if (i_11 == 1) {
               class43.field383 += i_12;
            }

            if (i_11 == 2) {
               class1.field3 += i_12;
            }

            if (i_11 == 3) {
               class76.field1112 = i_12 + class76.field1112 & 0x7ff;
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

      i_11 = class54.field492;
      i_12 = class54.field487;
      if (class54.field493 != 0) {
         i_11 = class54.field483;
         i_12 = class54.field495;
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
         class190.method3665(-1942171448);
      }

      class186.method3619((byte) 95);
      class321.method6012(i_0, i_1, i_2, i_3, 0);
      class186.method3619((byte) 8);
      i_13 = class130.field1773;
      class130.field1773 = client.field917;
      class5.field22.method3092(class299.field3727, class43.field383, class1.field3, class11.field77, class76.field1112, i_5);
      class130.field1773 = i_13;
      class186.method3619((byte) 124);
      class5.field22.method3115();
      client.field740 = 0;
      boolean bool_32 = false;
      i_15 = -1;
      int i_16 = -1;
      int i_17 = class89.field1255;
      int[] ints_18 = class89.field1257;

      int i_19;
      for (i_19 = 0; i_19 < i_17 + client.field695; i_19++) {
         Object obj_20;
         if (i_19 < i_17) {
            obj_20 = client.field909[ints_18[i_19]];
            if (ints_18[i_19] == client.field781) {
               bool_32 = true;
               i_15 = i_19;
               continue;
            }

            if (obj_20 == client.field657) {
               i_16 = i_19;
               continue;
            }
         } else {
            obj_20 = client.field694[client.field696[i_19 - i_17]];
         }

         class112.method2506((class69) obj_20, i_19, i_0, i_1, i_2, i_3, -1062431544);
      }

      if (client.field773 && i_16 != -1) {
         class112.method2506(client.field657, i_16, i_0, i_1, i_2, i_3, -1193836953);
      }

      if (bool_32) {
         class112.method2506(client.field909[client.field781], i_15, i_0, i_1, i_2, i_3, 1030652004);
      }

      for (i_19 = 0; i_19 < client.field740; i_19++) {
         int i_30 = client.field742[i_19];
         int i_21 = client.field743[i_19];
         int i_22 = client.field676[i_19];
         int i_23 = client.field744[i_19];
         boolean bool_24 = true;

         while (bool_24) {
            bool_24 = false;

            for (int i_25 = 0; i_25 < i_19; i_25++) {
               if (i_21 + 2 > client.field743[i_25] - client.field744[i_25] && i_21 - i_23 < client.field743[i_25] + 2 && i_30 - i_22 < client.field676[i_25] + client.field742[i_25] && i_22 + i_30 > client.field742[i_25] - client.field676[i_25] && client.field743[i_25] - client.field744[i_25] < i_21) {
                  i_21 = client.field743[i_25] - client.field744[i_25];
                  bool_24 = true;
               }
            }
         }

         client.field752 = client.field742[i_19];
         client.field753 = client.field743[i_19] = i_21;
         String string_31 = client.field749[i_19];
         if (client.field819 == 0) {
            int i_26 = 16776960;
            if (client.field702[i_19] < 6) {
               i_26 = client.field870[client.field702[i_19]];
            }

            if (client.field702[i_19] == 6) {
               i_26 = client.field751 % 20 < 10 ? 16711680 : 16776960;
            }

            if (client.field702[i_19] == 7) {
               i_26 = client.field751 % 20 < 10 ? 255 : 65535;
            }

            if (client.field702[i_19] == 8) {
               i_26 = client.field751 % 20 < 10 ? 45056 : 8454016;
            }

            int i_27;
            if (client.field702[i_19] == 9) {
               i_27 = 150 - client.field748[i_19];
               if (i_27 < 50) {
                  i_26 = i_27 * 1280 + 16711680;
               } else if (i_27 < 100) {
                  i_26 = 16776960 - (i_27 - 50) * 327680;
               } else if (i_27 < 150) {
                  i_26 = (i_27 - 100) * 5 + 65280;
               }
            }

            if (client.field702[i_19] == 10) {
               i_27 = 150 - client.field748[i_19];
               if (i_27 < 50) {
                  i_26 = i_27 * 5 + 16711680;
               } else if (i_27 < 100) {
                  i_26 = 16711935 - (i_27 - 50) * 327680;
               } else if (i_27 < 150) {
                  i_26 = (i_27 - 100) * 327680 + 255 - (i_27 - 100) * 5;
               }
            }

            if (client.field702[i_19] == 11) {
               i_27 = 150 - client.field748[i_19];
               if (i_27 < 50) {
                  i_26 = 16777215 - i_27 * 327685;
               } else if (i_27 < 100) {
                  i_26 = (i_27 - 50) * 327685 + 65280;
               } else if (i_27 < 150) {
                  i_26 = 16777215 - (i_27 - 100) * 327680;
               }
            }

            if (client.field805[i_19] == 0) {
               class23.field193.method5341(string_31, i_0 + client.field752, client.field753 + i_1, i_26, 0);
            }

            if (client.field805[i_19] == 1) {
               class23.field193.method5351(string_31, i_0 + client.field752, client.field753 + i_1, i_26, 0, client.field751);
            }

            if (client.field805[i_19] == 2) {
               class23.field193.method5353(string_31, i_0 + client.field752, client.field753 + i_1, i_26, 0, client.field751);
            }

            if (client.field805[i_19] == 3) {
               class23.field193.method5373(string_31, i_0 + client.field752, client.field753 + i_1, i_26, 0, client.field751, 150 - client.field748[i_19]);
            }

            if (client.field805[i_19] == 4) {
               i_27 = (150 - client.field748[i_19]) * (class23.field193.method5417(string_31) + 100) / 150;
               class321.method5998(i_0 + client.field752 - 50, i_1, i_0 + client.field752 + 50, i_3 + i_1);
               class23.field193.method5346(string_31, i_0 + client.field752 + 50 - i_27, client.field753 + i_1, i_26, 0);
               class321.method5997(i_0, i_1, i_0 + i_2, i_3 + i_1);
            }

            if (client.field805[i_19] == 5) {
               i_27 = 150 - client.field748[i_19];
               int i_28 = 0;
               if (i_27 < 25) {
                  i_28 = i_27 - 25;
               } else if (i_27 > 125) {
                  i_28 = i_27 - 125;
               }

               class321.method5998(i_0, client.field753 + i_1 - class23.field193.field3709 - 1, i_0 + i_2, client.field753 + i_1 + 5);
               class23.field193.method5341(string_31, i_0 + client.field752, i_28 + client.field753 + i_1, i_26, 0);
               class321.method5997(i_0, i_1, i_0 + i_2, i_3 + i_1);
            }
         } else {
            class23.field193.method5341(string_31, i_0 + client.field752, client.field753 + i_1, 16776960, 0);
         }
      }

      if (client.field708 == 2) {
         class32.method544((client.field737 - class196.field2389 << 7) + client.field821, (client.field777 - class1.field1 << 7) + client.field677, client.field675 * 2, 994421183);
         if (client.field752 > -1 && client.field881 % 20 < 10) {
            class173.field2096[0].method6126(i_0 + client.field752 - 12, client.field753 + i_1 - 28);
         }
      }

      ((class119) class130.field1781).method2736(client.field718, 1054980439);
      class21.method273(i_0, i_1, i_2, i_3, -2108015148);
      class299.field3727 = i_29;
      class43.field383 = i_7;
      class1.field3 = i_8;
      class11.field77 = i_9;
      class76.field1112 = i_10;
      if (client.field661) {
         byte b_33 = 0;
         i_15 = b_33 + class236.field3168 + class236.field3166;
         if (i_15 == 0) {
            client.field661 = false;
         }
      }

      if (client.field661) {
         class321.method6012(i_0, i_1, i_2, i_3, 0);
         class281.method5180("Loading - please wait.", false, -32623127);
      }

   }

   static final int method49(int i_0, int i_1, int i_2, int i_3, int i_4) {
      int i_5 = 65536 - class130.field1784[i_2 * 1024 / i_3] >> 1;
      return ((65536 - i_5) * i_0 >> 16) + (i_5 * i_1 >> 16);
   }

}
