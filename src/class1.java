import java.io.File;

final class class1 implements class0 {

   static File field2;
   static int field1;
   static int field3;

   void method6(Integer integer_1, class300 class300_2) {
      class300_2.write32IntBigEndian(integer_1.intValue());
   }

   static final void method10(class185 class185_0) {
      class299 class299_2 = client.field880.field1314;
      int i_3;
      int i_4;
      int i_5;
      int i_6;
      int i_7;
      int i_8;
      int i_9;
      if (class185.field2320 == class185_0) {
         i_3 = class299_2.readByteInverse();
         i_4 = i_3 >> 2;
         i_5 = i_3 & 0x3;
         i_6 = client.field713[i_4];
         i_7 = class299_2.readByteInverse();
         i_8 = (i_7 >> 4 & 0x7) + class311.field3819;
         i_9 = (i_7 & 0x7) + class94.field1306;
         if (i_8 >= 0 && i_9 >= 0 && i_8 < 104 && i_9 < 104) {
            class201.method3885(class42.field372, i_8, i_9, i_6, -1, i_4, i_5, 0, -1, -1700353173);
         }

      } else {
         class87 class87_33;
         if (class185.field2321 == class185_0) {
            i_3 = class299_2.readByte();
            i_4 = (i_3 >> 4 & 0x7) + class311.field3819;
            i_5 = (i_3 & 0x7) + class94.field1306;
            i_6 = class299_2.readShort();
            if (i_4 >= 0 && i_5 >= 0 && i_4 < 104 && i_5 < 104) {
               class261 class261_32 = client.field887[class42.field372][i_4][i_5];
               if (class261_32 != null) {
                  for (class87_33 = (class87) class261_32.method4892(); class87_33 != null; class87_33 = (class87) class261_32.method4894()) {
                     if ((i_6 & 0x7fff) == class87_33.field1244) {
                        class87_33.method3607();
                        break;
                     }
                  }

                  if (class261_32.method4892() == null) {
                     client.field887[class42.field372][i_4][i_5] = null;
                  }

                  class5.method60(i_4, i_5);
               }
            }

         } else {
            int i_10;
            int i_11;
            int i_13;
            byte b_14;
            int i_15;
            int i_40;
            if (class185.field2316 == class185_0) {
               i_3 = class299_2.readByteInverse() * 4;
               i_4 = class299_2.readShortUBigEndian();
               i_5 = class299_2.readShortBigEndian();
               i_6 = class299_2.readByteInverse() * 4;
               i_7 = class299_2.method5535();
               i_8 = class299_2.readUByte();
               i_9 = class299_2.readByteInverse();
               i_10 = class299_2.readShortLittleEndian();
               i_11 = class299_2.readByte();
               i_40 = (i_11 >> 4 & 0x7) + class311.field3819;
               i_13 = (i_11 & 0x7) + class94.field1306;
               b_14 = class299_2.readSByte();
               byte b_41 = class299_2.method5527();
               i_15 = b_41 + i_40;
               int i_42 = b_14 + i_13;
               if (i_40 >= 0 && i_13 >= 0 && i_40 < 104 && i_13 < 104 && i_15 >= 0 && i_42 >= 0 && i_15 < 104 && i_42 < 104 && i_5 != 65535) {
                  i_40 = i_40 * 128 + 64;
                  i_13 = i_13 * 128 + 64;
                  i_15 = i_15 * 128 + 64;
                  i_42 = i_42 * 128 + 64;
                  class86 class86_16 = new class86(i_5, class42.field372, i_40, i_13, class62.method1130(i_40, i_13, class42.field372) - i_6, i_10 + client.field881, i_4 + client.field881, i_8, i_9, i_7, i_3);
                  class86_16.method2033(i_15, i_42, class62.method1130(i_15, i_42, class42.field372) - i_3, i_10 + client.field881, -2118689642);
                  client.field670.method4917(class86_16);
               }

            } else if (class185.field2322 == class185_0) {
               i_3 = class299_2.readShortLittleEndian();
               i_4 = class299_2.readShort();
               i_5 = class299_2.readShortLittleEndian();
               i_6 = class299_2.readByte();
               i_7 = (i_6 >> 4 & 0x7) + class311.field3819;
               i_8 = (i_6 & 0x7) + class94.field1306;
               if (i_7 >= 0 && i_8 >= 0 && i_7 < 104 && i_8 < 104) {
                  class261 class261_43 = client.field887[class42.field372][i_7][i_8];
                  if (class261_43 != null) {
                     for (class87 class87_35 = (class87) class261_43.method4892(); class87_35 != null; class87_35 = (class87) class261_43.method4894()) {
                        if ((i_3 & 0x7fff) == class87_35.field1244 && i_5 == class87_35.field1245) {
                           class87_35.field1245 = i_4;
                           break;
                        }
                     }

                     class5.method60(i_7, i_8);
                  }
               }

            } else if (class185.field2315 == class185_0) {
               i_3 = class299_2.readShortBigEndian();
               i_4 = class299_2.readShort();
               i_5 = class299_2.readByte();
               i_6 = (i_5 >> 4 & 0x7) + class311.field3819;
               i_7 = (i_5 & 0x7) + class94.field1306;
               if (i_6 >= 0 && i_7 >= 0 && i_6 < 104 && i_7 < 104) {
                  class87_33 = new class87();
                  class87_33.field1244 = i_4;
                  class87_33.field1245 = i_3;
                  if (client.field887[class42.field372][i_6][i_7] == null) {
                     client.field887[class42.field372][i_6][i_7] = new class261();
                  }

                  client.field887[class42.field372][i_6][i_7].method4917(class87_33);
                  class5.method60(i_6, i_7);
               }

            } else {
               if (class185.field2319 == class185_0) {
                  i_3 = class299_2.readUByte();
                  i_4 = (i_3 >> 4 & 0x7) + class311.field3819;
                  i_5 = (i_3 & 0x7) + class94.field1306;
                  i_6 = class299_2.readByteInverse();
                  i_7 = class299_2.readByte();
                  i_8 = i_7 >> 4 & 0xf;
                  i_9 = i_7 & 0x7;
                  i_10 = class299_2.readShort();
                  if (i_4 >= 0 && i_5 >= 0 && i_4 < 104 && i_5 < 104) {
                     i_11 = i_8 + 1;
                     if (client.field657.field994[0] >= i_4 - i_11 && client.field657.field994[0] <= i_4 + i_11 && client.field657.field962[0] >= i_5 - i_11 && client.field657.field962[0] <= i_5 + i_11 && client.field892 != 0 && i_9 > 0 && client.field893 < 50) {
                        client.field894[client.field893] = i_10;
                        client.field895[client.field893] = i_9;
                        client.field897[client.field893] = i_6;
                        client.field898[client.field893] = null;
                        client.field841[client.field893] = i_8 + (i_5 << 8) + (i_4 << 16);
                        ++client.field893;
                     }
                  }
               }

               if (class185.field2318 == class185_0) {
                  byte b_38 = class299_2.method5527();
                  i_4 = class299_2.readShort();
                  byte b_39 = class299_2.method5527();
                  i_6 = class299_2.readShortBigEndian();
                  i_7 = class299_2.readShortUBigEndian();
                  i_8 = class299_2.readByte();
                  i_9 = i_8 >> 2;
                  i_10 = i_8 & 0x3;
                  i_11 = client.field713[i_9];
                  byte b_12 = class299_2.readSByte();
                  i_13 = class299_2.readShortLittleEndian();
                  b_14 = class299_2.method5527();
                  i_15 = class299_2.readByteUNeg();
                  int i_36 = (i_15 >> 4 & 0x7) + class311.field3819;
                  int i_17 = (i_15 & 0x7) + class94.field1306;
                  class66 class66_18;
                  if (i_13 == client.field770) {
                     class66_18 = client.field657;
                  } else {
                     class66_18 = client.field909[i_13];
                  }

                  if (class66_18 != null) {
                     class253 class253_19 = class128.method2970(i_6, (short) 4095);
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
                     int[][] ints_26 = class55.field516[class42.field372];
                     int i_27 = ints_26[i_23][i_24] + ints_26[i_22][i_24] + ints_26[i_22][i_25] + ints_26[i_23][i_25] >> 2;
                     int i_28 = (i_36 << 7) + (i_20 << 6);
                     int i_29 = (i_17 << 7) + (i_21 << 6);
                     class127 class127_30 = class253_19.method4592(i_9, i_10, ints_26, i_28, i_27, i_29, -1160623337);
                     if (class127_30 != null) {
                        class201.method3885(class42.field372, i_36, i_17, i_11, -1, 0, 0, i_7 + 1, i_4 + 1, -2048347982);
                        class66_18.field614 = i_7 + client.field881;
                        class66_18.field622 = i_4 + client.field881;
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

               if (class185.field2323 == class185_0) {
                  i_3 = class299_2.readByte();
                  i_4 = (i_3 >> 4 & 0x7) + class311.field3819;
                  i_5 = (i_3 & 0x7) + class94.field1306;
                  i_6 = class299_2.readByteInverse();
                  i_7 = i_6 >> 2;
                  i_8 = i_6 & 0x3;
                  i_9 = client.field713[i_7];
                  i_10 = class299_2.readShortBigEndian();
                  if (i_4 >= 0 && i_5 >= 0 && i_4 < 104 && i_5 < 104) {
                     class201.method3885(class42.field372, i_4, i_5, i_9, i_10, i_7, i_8, 0, -1, -2141458231);
                  }

               } else if (class185.field2317 == class185_0) {
                  i_3 = class299_2.readShortUBigEndian();
                  i_4 = class299_2.readByte();
                  i_5 = class299_2.readShortBigEndian();
                  i_6 = class299_2.readUByte();
                  i_7 = (i_6 >> 4 & 0x7) + class311.field3819;
                  i_8 = (i_6 & 0x7) + class94.field1306;
                  if (i_7 >= 0 && i_8 >= 0 && i_7 < 104 && i_8 < 104) {
                     i_7 = i_7 * 128 + 64;
                     i_8 = i_8 * 128 + 64;
                     class77 class77_34 = new class77(i_3, class42.field372, i_7, i_8, class62.method1130(i_7, i_8, class42.field372) - i_4, i_5, client.field881);
                     client.field785.method4917(class77_34);
                  }

               } else if (class185.field2324 == class185_0) {
                  i_3 = class299_2.readByteInverse();
                  i_4 = i_3 >> 2;
                  i_5 = i_3 & 0x3;
                  i_6 = client.field713[i_4];
                  i_7 = class299_2.readByteUNeg();
                  i_8 = (i_7 >> 4 & 0x7) + class311.field3819;
                  i_9 = (i_7 & 0x7) + class94.field1306;
                  i_10 = class299_2.readShortUBigEndian();
                  if (i_8 >= 0 && i_9 >= 0 && i_8 < 103 && i_9 < 103) {
                     if (i_6 == 0) {
                        class136 class136_37 = class5.field22.method3088(class42.field372, i_8, i_9);
                        if (class136_37 != null) {
                           i_40 = class43.method770(class136_37.field1882);
                           if (i_4 == 2) {
                              class136_37.field1884 = new class93(i_40, 2, i_5 + 4, class42.field372, i_8, i_9, i_10, false, class136_37.field1884);
                              class136_37.field1881 = new class93(i_40, 2, i_5 + 1 & 0x3, class42.field372, i_8, i_9, i_10, false, class136_37.field1881);
                           } else {
                              class136_37.field1884 = new class93(i_40, i_4, i_5, class42.field372, i_8, i_9, i_10, false, class136_37.field1884);
                           }
                        }
                     }

                     if (i_6 == 1) {
                        class141 class141_44 = class5.field22.method3118(class42.field372, i_8, i_9);
                        if (class141_44 != null) {
                           i_40 = class43.method770(class141_44.field1917);
                           if (i_4 != 4 && i_4 != 5) {
                              if (i_4 == 6) {
                                 class141_44.field1924 = new class93(i_40, 4, i_5 + 4, class42.field372, i_8, i_9, i_10, false, class141_44.field1924);
                              } else if (i_4 == 7) {
                                 class141_44.field1924 = new class93(i_40, 4, (i_5 + 2 & 0x3) + 4, class42.field372, i_8, i_9, i_10, false, class141_44.field1924);
                              } else if (i_4 == 8) {
                                 class141_44.field1924 = new class93(i_40, 4, i_5 + 4, class42.field372, i_8, i_9, i_10, false, class141_44.field1924);
                                 class141_44.field1925 = new class93(i_40, 4, (i_5 + 2 & 0x3) + 4, class42.field372, i_8, i_9, i_10, false, class141_44.field1925);
                              }
                           } else {
                              class141_44.field1924 = new class93(i_40, 4, i_5, class42.field372, i_8, i_9, i_10, false, class141_44.field1924);
                           }
                        }
                     }

                     if (i_6 == 2) {
                        class142 class142_45 = class5.field22.method3195(class42.field372, i_8, i_9);
                        if (i_4 == 11) {
                           i_4 = 10;
                        }

                        if (class142_45 != null) {
                           class142_45.field1933 = new class93(class43.method770(class142_45.field1941), i_4, i_5, class42.field372, i_8, i_9, i_10, false, class142_45.field1933);
                        }
                     }

                     if (i_6 == 3) {
                        class123 class123_46 = class5.field22.method3091(class42.field372, i_8, i_9);
                        if (class123_46 != null) {
                           class123_46.field1614 = new class93(class43.method770(class123_46.field1617), 22, i_5, class42.field372, i_8, i_9, i_10, false, class123_46.field1614);
                        }
                     }
                  }

               }
            }
         }
      }
   }

   public void vmethod43(Object object_1, class300 class300_2, int i_3) {
      this.method6((Integer) object_1, class300_2);
   }

   public Object vmethod42(class300 class300_1, int i_2) {
      return Integer.valueOf(class300_1.readIntMedEndian());
   }

   static boolean method5(int i_0, int i_1) {
      return i_0 == 57 || i_0 == 58 || i_0 == 1007 || i_0 == 25 || i_0 == 30;
   }

   public static String method17(String string_0, byte b_1) {
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

   static final int method14(int i_0, int i_1, byte b_2) {
      int i_3 = class257.method4757(45365 + i_0, 91923 + i_1, 4, (byte) 127) - 128 + (class257.method4757(i_0 + 10294, i_1 + 37821, 2, (byte) 124) - 128 >> 1) + (class257.method4757(i_0, i_1, 1, (byte) 94) - 128 >> 2);
      i_3 = (int)((double)i_3 * 0.3D) + 35;
      if (i_3 < 10) {
         i_3 = 10;
      } else if (i_3 > 60) {
         i_3 = 60;
      }

      return i_3;
   }

}
