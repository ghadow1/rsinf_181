import java.io.IOException;

public class class96 {

   static class319 field1325;
   static int field1327;
   static class260 field1324 = new class260();

   static void method2267(class62 class62_0, int i_1) {
      Object[] arr_3 = class62_0.field581;
      class92 class92_4;
      int i_18;
      if (class187.method3627(class62_0.field584, 729695552)) {
         class18.field121 = (class41) arr_3[0];
         class241 class241_5 = class222.method4118(class18.field121.field355);
         class92_4 = class75.method1828(class62_0.field584, class241_5.field3213, class241_5.field3230, (short) 17061);
      } else {
         i_18 = ((Integer) arr_3[0]).intValue();
         class92_4 = class128.method2947(i_18, (byte) 1);
      }

      if (class92_4 != null) {
         class70.field1014 = 0;
         class221.field2747 = 0;
         i_18 = -1;
         int[] ints_6 = class92_4.field1284;
         int[] ints_7 = class92_4.field1288;
         byte b_8 = -1;
         class76.field1109 = 0;
         class76.field1104 = false;

         try {
            int i_11;
            try {
               class76.field1095 = new int[class92_4.field1283];
               int i_9 = 0;
               class334.field4032 = new String[class92_4.field1285];
               int i_10 = 0;

               int i_12;
               String string_19;
               for (i_11 = 1; i_11 < arr_3.length; i_11++) {
                  if (arr_3[i_11] instanceof Integer) {
                     i_12 = ((Integer) arr_3[i_11]).intValue();
                     if (i_12 == -2147483647) {
                        i_12 = class62_0.field576;
                     }

                     if (i_12 == -2147483646) {
                        i_12 = class62_0.field577;
                     }

                     if (i_12 == -2147483645) {
                        i_12 = class62_0.field575 != null ? class62_0.field575.field2688 : -1;
                     }

                     if (i_12 == -2147483644) {
                        i_12 = class62_0.field578;
                     }

                     if (i_12 == -2147483643) {
                        i_12 = class62_0.field575 != null ? class62_0.field575.field2565 : -1;
                     }

                     if (i_12 == -2147483642) {
                        i_12 = class62_0.field579 != null ? class62_0.field579.field2688 : -1;
                     }

                     if (i_12 == -2147483641) {
                        i_12 = class62_0.field579 != null ? class62_0.field579.field2565 : -1;
                     }

                     if (i_12 == -2147483640) {
                        i_12 = class62_0.field580;
                     }

                     if (i_12 == -2147483639) {
                        i_12 = class62_0.field587;
                     }

                     class76.field1095[i_9++] = i_12;
                  } else if (arr_3[i_11] instanceof String) {
                     string_19 = (String) arr_3[i_11];
                     if (string_19.equals("event_opbase")) {
                        string_19 = class62_0.field582;
                     }

                     class334.field4032[i_10++] = string_19;
                  }
               }

               i_11 = 0;
               class76.field1106 = class62_0.field583;

               while (true) {
                  ++i_11;
                  if (i_11 > i_1) {
                     throw new RuntimeException();
                  }

                  ++i_18;
                  int i_30 = ints_6[i_18];
                  int i_21;
                  if (i_30 >= 100) {
                     boolean bool_33;
                     if (class92_4.field1288[i_18] == 1) {
                        bool_33 = true;
                     } else {
                        bool_33 = false;
                     }

                     i_21 = class79.method1977(i_30, class92_4, bool_33, -1435183788);
                     switch(i_21) {
                     case 0:
                        return;
                     case 1:
                     default:
                        break;
                     case 2:
                        throw new IllegalStateException();
                     }
                  } else if (i_30 == 0) {
                     class76.field1098[++class70.field1014 - 1] = ints_7[i_18];
                  } else if (i_30 == 1) {
                     i_12 = ints_7[i_18];
                     class76.field1098[++class70.field1014 - 1] = class212.field2525[i_12];
                  } else if (i_30 == 2) {
                     i_12 = ints_7[i_18];
                     class212.field2525[i_12] = class76.field1098[--class70.field1014];
                     class10.method124(i_12);
                  } else if (i_30 == 3) {
                     class76.field1093[++class221.field2747 - 1] = class92_4.field1286[i_18];
                  } else if (i_30 == 6) {
                     i_18 += ints_7[i_18];
                  } else if (i_30 == 7) {
                     class70.field1014 -= 2;
                     if (class76.field1098[class70.field1014] != class76.field1098[class70.field1014 + 1]) {
                        i_18 += ints_7[i_18];
                     }
                  } else if (i_30 == 8) {
                     class70.field1014 -= 2;
                     if (class76.field1098[class70.field1014] == class76.field1098[class70.field1014 + 1]) {
                        i_18 += ints_7[i_18];
                     }
                  } else if (i_30 == 9) {
                     class70.field1014 -= 2;
                     if (class76.field1098[class70.field1014] < class76.field1098[class70.field1014 + 1]) {
                        i_18 += ints_7[i_18];
                     }
                  } else if (i_30 == 10) {
                     class70.field1014 -= 2;
                     if (class76.field1098[class70.field1014] > class76.field1098[class70.field1014 + 1]) {
                        i_18 += ints_7[i_18];
                     }
                  } else if (i_30 == 21) {
                     if (class76.field1109 == 0) {
                        return;
                     }

                     class56 class56_35 = class76.field1101[--class76.field1109];
                     class92_4 = class56_35.field523;
                     ints_6 = class92_4.field1284;
                     ints_7 = class92_4.field1288;
                     i_18 = class56_35.field522;
                     class76.field1095 = class56_35.field524;
                     class334.field4032 = class56_35.field525;
                  } else if (i_30 == 25) {
                     i_12 = ints_7[i_18];
                     class76.field1098[++class70.field1014 - 1] = class67.method1237(i_12, -836499887);
                  } else if (i_30 == 27) {
                     i_12 = ints_7[i_18];
                     class171.method3554(i_12, class76.field1098[--class70.field1014], 691418621);
                  } else if (i_30 == 31) {
                     class70.field1014 -= 2;
                     if (class76.field1098[class70.field1014] <= class76.field1098[class70.field1014 + 1]) {
                        i_18 += ints_7[i_18];
                     }
                  } else if (i_30 == 32) {
                     class70.field1014 -= 2;
                     if (class76.field1098[class70.field1014] >= class76.field1098[class70.field1014 + 1]) {
                        i_18 += ints_7[i_18];
                     }
                  } else if (i_30 == 33) {
                     class76.field1098[++class70.field1014 - 1] = class76.field1095[ints_7[i_18]];
                  } else if (i_30 == 34) {
                     class76.field1095[ints_7[i_18]] = class76.field1098[--class70.field1014];
                  } else if (i_30 == 35) {
                     class76.field1093[++class221.field2747 - 1] = class334.field4032[ints_7[i_18]];
                  } else if (i_30 == 36) {
                     class334.field4032[ints_7[i_18]] = class76.field1093[--class221.field2747];
                  } else if (i_30 == 37) {
                     i_12 = ints_7[i_18];
                     class221.field2747 -= i_12;
                     String string_32 = class272.method5015(class76.field1093, class221.field2747, i_12, -1350169073);
                     class76.field1093[++class221.field2747 - 1] = string_32;
                  } else if (i_30 == 38) {
                     --class70.field1014;
                  } else if (i_30 == 39) {
                     --class221.field2747;
                  } else {
                     int i_16;
                     if (i_30 != 40) {
                        if (i_30 == 42) {
                           class76.field1098[++class70.field1014 - 1] = class170.field2057.method2096(ints_7[i_18], (byte) -17);
                        } else if (i_30 == 43) {
                           class170.field2057.method2112(ints_7[i_18], class76.field1098[--class70.field1014], -1875619216);
                        } else if (i_30 == 44) {
                           i_12 = ints_7[i_18] >> 16;
                           i_21 = ints_7[i_18] & 0xffff;
                           int i_22 = class76.field1098[--class70.field1014];
                           if (i_22 < 0 || i_22 > 5000) {
                              throw new RuntimeException();
                           }

                           class76.field1096[i_12] = i_22;
                           byte b_23 = -1;
                           if (i_21 == 105) {
                              b_23 = 0;
                           }

                           for (i_16 = 0; i_16 < i_22; i_16++) {
                              class76.field1100[i_12][i_16] = b_23;
                           }
                        } else if (i_30 == 45) {
                           i_12 = ints_7[i_18];
                           i_21 = class76.field1098[--class70.field1014];
                           if (i_21 < 0 || i_21 >= class76.field1096[i_12]) {
                              throw new RuntimeException();
                           }

                           class76.field1098[++class70.field1014 - 1] = class76.field1100[i_12][i_21];
                        } else if (i_30 == 46) {
                           i_12 = ints_7[i_18];
                           class70.field1014 -= 2;
                           i_21 = class76.field1098[class70.field1014];
                           if (i_21 < 0 || i_21 >= class76.field1096[i_12]) {
                              throw new RuntimeException();
                           }

                           class76.field1100[i_12][i_21] = class76.field1098[class70.field1014 + 1];
                        } else if (i_30 == 47) {
                           string_19 = class170.field2057.method2145(ints_7[i_18], 1859485923);
                           if (string_19 == null) {
                              string_19 = "null";
                           }

                           class76.field1093[++class221.field2747 - 1] = string_19;
                        } else if (i_30 == 48) {
                           class170.field2057.method2136(ints_7[i_18], class76.field1093[--class221.field2747], -267938278);
                        } else if (i_30 == 49) {
                           string_19 = class170.field2057.method2098(ints_7[i_18], -1328754518);
                           class76.field1093[++class221.field2747 - 1] = string_19;
                        } else if (i_30 == 50) {
                           class170.field2057.method2125(ints_7[i_18], class76.field1093[--class221.field2747], -1079389061);
                        } else {
                           if (i_30 != 60) {
                              throw new IllegalStateException();
                           }

                           class316 class316_34 = class92_4.field1287[ints_7[i_18]];
                           class179 class179_31 = (class179) class316_34.method5924((long)class76.field1098[--class70.field1014]);
                           if (class179_31 != null) {
                              i_18 += class179_31.field2111;
                           }
                        }
                     } else {
                        i_12 = ints_7[i_18];
                        class92 class92_13 = class128.method2947(i_12, (byte) 1);
                        int[] ints_14 = new int[class92_13.field1283];
                        String[] arr_15 = new String[class92_13.field1285];

                        for (i_16 = 0; i_16 < class92_13.field1289; i_16++) {
                           ints_14[i_16] = class76.field1098[i_16 + (class70.field1014 - class92_13.field1289)];
                        }

                        for (i_16 = 0; i_16 < class92_13.field1290; i_16++) {
                           arr_15[i_16] = class76.field1093[i_16 + (class221.field2747 - class92_13.field1290)];
                        }

                        class70.field1014 -= class92_13.field1289;
                        class221.field2747 -= class92_13.field1290;
                        class56 class56_20 = new class56();
                        class56_20.field523 = class92_4;
                        class56_20.field522 = i_18;
                        class56_20.field524 = class76.field1095;
                        class56_20.field525 = class334.field4032;
                        class76.field1101[++class76.field1109 - 1] = class56_20;
                        class92_4 = class92_13;
                        ints_6 = class92_13.field1284;
                        ints_7 = class92_13.field1288;
                        i_18 = -1;
                        class76.field1095 = ints_14;
                        class334.field4032 = arr_15;
                     }
                  }
               }
            } catch (Exception exception_28) {
               StringBuilder stringbuilder_25 = new StringBuilder(30);
               stringbuilder_25.append("").append(class92_4.field2113).append(" ");

               for (i_11 = class76.field1109 - 1; i_11 >= 0; --i_11) {
                  stringbuilder_25.append("").append(class76.field1101[i_11].field523.field2113).append(" ");
               }

               stringbuilder_25.append("").append(b_8);
               class252.method4556(stringbuilder_25.toString(), exception_28, (byte) 123);
            }
         } finally {
            if (class76.field1104) {
               class76.field1105 = true;
               class7.method73(-583790135);
               class76.field1105 = false;
               class76.field1104 = false;
            }

         }
      }
   }

   static void method2265(int i_0) {
      if (i_0 != client.field662) {
         if (client.field662 == 0) {
            class27.field233.method885((byte) 11);
         }

         if (i_0 == 20 || i_0 == 40 || i_0 == 45) {
            client.field686 = 0;
            client.field687 = 0;
            client.field688 = 0;
            client.field797.method4996(i_0);
            if (i_0 != 20) {
               class9.method99(false, -1114411806);
            }
         }

         if (i_0 != 20 && i_0 != 40 && class269.field3563 != null) {
            class269.field3563.vmethod5830(1054807743);
            class269.field3563 = null;
         }

         if (client.field662 == 25) {
            client.field709 = 0;
            client.field705 = 0;
            client.field706 = 1;
            client.field707 = 0;
            client.field896 = 1;
         }

         if (i_0 != 5 && i_0 != 10) {
            if (i_0 == 20) {
               class309.method5892(class17.field110, client.field683, true, client.field662 == 11 ? 4 : 0, -273498913);
            } else if (i_0 == 11) {
               class309.method5892(class17.field110, client.field683, false, 4, -273498913);
            } else if (class85.field1179) {
               class85.field1194 = null;
               class240.field3207 = null;
               class85.field1181 = null;
               class5.field23 = null;
               class79.field1135 = null;
               class87.field1243 = null;
               class85.field1183 = null;
               class85.field1178 = null;
               class112.field1466 = null;
               class31.field271 = null;
               class57.field533 = null;
               class225.field3062 = null;
               class74.field1073 = null;
               class30.field264 = null;
               class278.field3631.method1720((byte) 0);
               class40.method729(2, (byte) 14);
               if (class236.field3176 != null) {
                  try {
                     ByteBuffer class300_2 = new ByteBuffer(4);
                     class300_2.writeByte2(2);
                     class300_2.method5480(0);
                     class236.field3176.vmethod5829(class300_2.buffer, 0, 4, -1696227994);
                  } catch (IOException ioexception_5) {
                     try {
                        class236.field3176.vmethod5830(-738517040);
                     } catch (Exception exception_4) {
                        ;
                     }

                     ++class236.field3178;
                     class236.field3176 = null;
                  }
               }

               class85.field1179 = false;
            }
         } else {
            class309.method5892(class17.field110, client.field683, true, 0, -273498913);
         }

         client.field662 = i_0;
      }
   }

   public static boolean method2266(int i_0, int i_1) {
      return (i_0 >> 21 & 0x1) != 0;
   }

}
