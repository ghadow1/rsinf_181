import java.io.File;
import java.io.RandomAccessFile;

public class class65 extends class174 {

   public boolean vmethod3594(int i_1, int i_2, int i_3, class172 class172_4, int i_5) {
      return i_2 == super.field2098 && i_3 == super.field2101;
   }

   public static class325 method1178(class233 class233_0, int i_1, int i_2, int i_3) {
      if (!class284.method5220(class233_0, i_1, i_2)) {
         return null;
      } else {
         class325 class325_5 = new class325();
         class325_5.field3898 = class326.field3913;
         class325_5.field3904 = class326.field3910;
         class325_5.field3901 = class212.field2523[0];
         class325_5.field3902 = class326.field3915[0];
         class325_5.field3899 = class326.field3914[0];
         class325_5.field3900 = class216.field2548[0];
         int i_6 = class325_5.field3900 * class325_5.field3899;
         byte[] bytes_7 = class326.field3912[0];
         class325_5.field3908 = new int[i_6];

         for (int i_8 = 0; i_8 < i_6; i_8++) {
            class325_5.field3908[i_8] = class138.field1895[bytes_7[i_8] & 0xff];
         }

         class16.method174();
         return class325_5;
      }
   }

   static void method1176(byte b_0) {
      for (class61 class61_1 = (class61) client.field816.method5950(); class61_1 != null; class61_1 = (class61) client.field816.method5953()) {
         int i_2 = class61_1.field571;
         if (class162.method3445(i_2, 1772418873)) {
            boolean bool_3 = true;
            class217[] arr_4 = class217.field2556[i_2];

            int i_5;
            for (i_5 = 0; i_5 < arr_4.length; i_5++) {
               if (arr_4[i_5] != null) {
                  bool_3 = arr_4[i_5].field2563;
                  break;
               }
            }

            if (!bool_3) {
               i_5 = (int)class61_1.field2113;
               class217 class217_6 = class80.fetchSomething(i_5);
               if (class217_6 != null) {
                  class224.method4120(class217_6);
               }
            }
         }
      }

   }

   static class235 method1169(int i_0, boolean bool_1, boolean bool_2, boolean bool_3, byte b_4) {
      class308 class308_5 = null;
      if (class167.field2042 != null) {
         class308_5 = new class308(i_0, class167.field2042, class167.field2041[i_0], 1000000);
      }

      return new class235(class308_5, class62.field573, i_0, bool_1, bool_2, bool_3);
   }

   static File method1177(String string_0, int i_1) {
      if (!class169.field2055) {
         throw new RuntimeException("");
      } else {
         File file_2 = (File) class169.field2052.get(string_0);
         if (file_2 != null) {
            return file_2;
         } else {
            File file_3 = new File(class169.field2050, string_0);
            RandomAccessFile randomaccessfile_4 = null;

            try {
               File file_5 = new File(file_3.getParent());
               if (!file_5.exists()) {
                  throw new RuntimeException("");
               } else {
                  randomaccessfile_4 = new RandomAccessFile(file_3, "rw");
                  int i_6 = randomaccessfile_4.read();
                  randomaccessfile_4.seek(0L);
                  randomaccessfile_4.write(i_6);
                  randomaccessfile_4.seek(0L);
                  randomaccessfile_4.close();
                  class169.field2052.put(string_0, file_3);
                  return file_3;
               }
            } catch (Exception exception_9) {
               try {
                  if (randomaccessfile_4 != null) {
                     randomaccessfile_4.close();
                     randomaccessfile_4 = null;
                  }
               } catch (Exception exception_8) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   static final void method1174(int i_0, int i_1, int i_2, int i_3, int i_4) {
      if (client.field900 == 0 && !client.field810) {
         class188.method3644("Walk here", "", 23, 0, i_0 - i_2, i_1 - i_3, 730328145);
      }

      long long_5 = -1L;
      long long_7 = -1L;
      int i_9 = 0;

      while (true) {
         int i_11 = class128.field1748;
         if (i_9 >= i_11) {
            if (long_5 != -1L) {
               i_9 = (int)(long_5 >>> 0 & 0x7fL);
               i_11 = (int)(long_5 >>> 7 & 0x7fL);
               class66 class66_13 = client.field909[client.field781];
               class36.method601(class66_13, client.field781, i_9, i_11, (byte) -54);
            }

            return;
         }

         long long_26 = class128.field1750[i_9];
         if (long_7 != long_26) {
            label334: {
               long_7 = long_26;
               int i_16 = class279.method5170(i_9, 1131109761);
               int i_17 = class91.method2176(i_9, (byte) 102);
               int i_18 = class3.method33(i_9, (byte) -12);
               int i_19 = class74.method1784(i_9, -77884497);
               if (i_18 == 2 && class5.field22.method3096(class42.field372, i_16, i_17, long_26) >= 0) {
                  class253 class253_20 = class128.method2970(i_19, (short) 4095);
                  if (class253_20.field3391 != null) {
                     class253_20 = class253_20.method4595();
                  }

                  if (class253_20 == null) {
                     break label334;
                  }

                  if (client.field900 == 1) {
                     class188.method3644("Use", client.field738 + " " + "->" + " " + class73.method1756(65535, -844505624) + class253_20.field3360, 1, i_19, i_16, i_17, -741988185);
                  } else if (client.field810) {
                     if ((class35.field301 & 0x4) == 4) {
                        class188.method3644(client.field813, client.field814 + " " + "->" + " " + class73.method1756(65535, -844505624) + class253_20.field3360, 2, i_19, i_16, i_17, -1869857600);
                     }
                  } else {
                     String[] arr_28 = class253_20.field3377;
                     if (arr_28 != null) {
                        for (int i_31 = 4; i_31 >= 0; --i_31) {
                           if (arr_28[i_31] != null) {
                              short s_23 = 0;
                              if (i_31 == 0) {
                                 s_23 = 3;
                              }

                              if (i_31 == 1) {
                                 s_23 = 4;
                              }

                              if (i_31 == 2) {
                                 s_23 = 5;
                              }

                              if (i_31 == 3) {
                                 s_23 = 6;
                              }

                              if (i_31 == 4) {
                                 s_23 = 1001;
                              }

                              class188.method3644(arr_28[i_31], class73.method1756(65535, -844505624) + class253_20.field3360, s_23, i_19, i_16, i_17, -877016828);
                           }
                        }
                     }

                     class188.method3644("Examine", class73.method1756(65535, -844505624) + class253_20.field3360, 1002, class253_20.field3357, i_16, i_17, 11490889);
                  }
               }

               int i_21;
               class79 class79_22;
               class66 class66_24;
               int[] ints_35;
               int i_37;
               if (i_18 == 1) {
                  class79 class79_32 = client.field694[i_19];
                  if (class79_32 == null) {
                     break label334;
                  }

                  if (class79_32.field1134.field3469 == 1 && (class79_32.field1005 & 0x7f) == 64 && (class79_32.field949 & 0x7f) == 64) {
                     for (i_21 = 0; i_21 < client.field695; i_21++) {
                        class79_22 = client.field694[client.field696[i_21]];
                        if (class79_22 != null && class79_22 != class79_32 && class79_22.field1134.field3469 == 1 && class79_32.field1005 == class79_22.field1005 && class79_32.field949 == class79_22.field949) {
                           class21.method272(class79_22.field1134, client.field696[i_21], i_16, i_17, 1861825348);
                        }
                     }

                     i_21 = class89.field1255;
                     ints_35 = class89.field1257;

                     for (i_37 = 0; i_37 < i_21; i_37++) {
                        class66_24 = client.field909[ints_35[i_37]];
                        if (class66_24 != null && class79_32.field1005 == class66_24.field1005 && class66_24.field949 == class79_32.field949) {
                           class36.method601(class66_24, ints_35[i_37], i_16, i_17, (byte) 98);
                        }
                     }
                  }

                  class21.method272(class79_32.field1134, i_19, i_16, i_17, 676955297);
               }

               if (i_18 == 0) {
                  class66 class66_33 = client.field909[i_19];
                  if (class66_33 == null) {
                     break label334;
                  }

                  if ((class66_33.field1005 & 0x7f) == 64 && (class66_33.field949 & 0x7f) == 64) {
                     for (i_21 = 0; i_21 < client.field695; i_21++) {
                        class79_22 = client.field694[client.field696[i_21]];
                        if (class79_22 != null && class79_22.field1134.field3469 == 1 && class66_33.field1005 == class79_22.field1005 && class79_22.field949 == class66_33.field949) {
                           class21.method272(class79_22.field1134, client.field696[i_21], i_16, i_17, 566580282);
                        }
                     }

                     i_21 = class89.field1255;
                     ints_35 = class89.field1257;

                     for (i_37 = 0; i_37 < i_21; i_37++) {
                        class66_24 = client.field909[ints_35[i_37]];
                        if (class66_24 != null && class66_33 != class66_24 && class66_24.field1005 == class66_33.field1005 && class66_33.field949 == class66_24.field949) {
                           class36.method601(class66_24, ints_35[i_37], i_16, i_17, (byte) -117);
                        }
                     }
                  }

                  if (i_19 != client.field781) {
                     class36.method601(class66_33, i_19, i_16, i_17, (byte) -13);
                  } else {
                     long_5 = long_26;
                  }
               }

               if (i_18 == 3) {
                  class261 class261_34 = client.field887[class42.field372][i_16][i_17];
                  if (class261_34 != null) {
                     for (class87 class87_38 = (class87) class261_34.method4893(); class87_38 != null; class87_38 = (class87) class261_34.method4887()) {
                        class254 class254_36 = class26.method404(class87_38.field1244);
                        if (client.field900 == 1) {
                           class188.method3644("Use", client.field738 + " " + "->" + " " + class73.method1756(16748608, -844505624) + class254_36.field3449, 16, class87_38.field1244, i_16, i_17, 1070020816);
                        } else if (client.field810) {
                           if ((class35.field301 & 0x1) == 1) {
                              class188.method3644(client.field813, client.field814 + " " + "->" + " " + class73.method1756(16748608, -844505624) + class254_36.field3449, 17, class87_38.field1244, i_16, i_17, 1110984799);
                           }
                        } else {
                           String[] arr_29 = class254_36.field3426;

                           for (int i_30 = 4; i_30 >= 0; --i_30) {
                              if (arr_29 != null && arr_29[i_30] != null) {
                                 byte b_25 = 0;
                                 if (i_30 == 0) {
                                    b_25 = 18;
                                 }

                                 if (i_30 == 1) {
                                    b_25 = 19;
                                 }

                                 if (i_30 == 2) {
                                    b_25 = 20;
                                 }

                                 if (i_30 == 3) {
                                    b_25 = 21;
                                 }

                                 if (i_30 == 4) {
                                    b_25 = 22;
                                 }

                                 class188.method3644(arr_29[i_30], class73.method1756(16748608, -844505624) + class254_36.field3449, b_25, class87_38.field1244, i_16, i_17, 422865946);
                              } else if (i_30 == 2) {
                                 class188.method3644("Take", class73.method1756(16748608, -844505624) + class254_36.field3449, 20, class87_38.field1244, i_16, i_17, 408332748);
                              }
                           }

                           class188.method3644("Examine", class73.method1756(16748608, -844505624) + class254_36.field3449, 1004, class87_38.field1244, i_16, i_17, -1001389785);
                        }
                     }
                  }
               }
            }
         }

         ++i_9;
      }
   }

   static int method1175(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      int i_4;
      int i_5;
      int i_7;
      if (i_0 == 3400) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class251 class251_6 = class136.method3261(i_4, -497669049);
         if (class251_6.field3321 != 115) {
            ;
         }

         for (i_7 = 0; i_7 < class251_6.field3320; i_7++) {
            if (i_5 == class251_6.field3316[i_7]) {
               class76.field1093[++class221.field2747 - 1] = class251_6.field3323[i_7];
               class251_6 = null;
               break;
            }
         }

         if (class251_6 != null) {
            class76.field1093[++class221.field2747 - 1] = class251_6.field3318;
         }

         return 1;
      } else if (i_0 != 3408) {
         if (i_0 == 3411) {
            i_4 = class76.field1098[--class70.field1014];
            class251 class251_11 = class136.method3261(i_4, 1132147020);
            class76.field1098[++class70.field1014 - 1] = class251_11.method4535((byte) -54);
            return 1;
         } else {
            return 2;
         }
      } else {
         class70.field1014 -= 4;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         int i_10 = class76.field1098[class70.field1014 + 2];
         i_7 = class76.field1098[class70.field1014 + 3];
         class251 class251_8 = class136.method3261(i_10, 395300588);
         if (i_4 == class251_8.field3317 && i_5 == class251_8.field3321) {
            for (int i_9 = 0; i_9 < class251_8.field3320; i_9++) {
               if (i_7 == class251_8.field3316[i_9]) {
                  if (i_5 == 115) {
                     class76.field1093[++class221.field2747 - 1] = class251_8.field3323[i_9];
                  } else {
                     class76.field1098[++class70.field1014 - 1] = class251_8.field3322[i_9];
                  }

                  class251_8 = null;
                  break;
               }
            }

            if (class251_8 != null) {
               if (i_5 == 115) {
                  class76.field1093[++class221.field2747 - 1] = class251_8.field3318;
               } else {
                  class76.field1098[++class70.field1014 - 1] = class251_8.field3319;
               }
            }

            return 1;
         } else {
            if (i_5 == 115) {
               class76.field1093[++class221.field2747 - 1] = "null";
            } else {
               class76.field1098[++class70.field1014 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static final void method1170(String string_0, int i_1) {
      if (!string_0.equals("")) {
         class187 class187_2 = class235.method4265(class183.field2286, client.field880.field1313, 1775123545);
         class187_2.field2333.writeByte2(class209.method3945(string_0));
         class187_2.field2333.writeNullTerminatedString(string_0);
         client.field880.copy(class187_2);
      }
   }

}
