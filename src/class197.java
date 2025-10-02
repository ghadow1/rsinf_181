public class class197 {

   public static int field2403;
   public static class233 field2401;
   public static int field2407;
   public static class233 field2400;
   public static class233 field2406;
   public static int field2404;
   static class235 field2405;
   public static int field2402 = 0;

   public static void method3688() {
      class257.field3503.method3323();
   }

   static final void method3697(class61 class61_0, boolean bool_1) {
      int i_3 = class61_0.field571;
      int i_4 = (int)class61_0.hash;
      class61_0.unlink();
      int i_6;
      if (bool_1 && i_3 != -1 && class128.field1755[i_3]) {
         class217.field2557.method4157(i_3, 513084306);
         if (class217.field2556[i_3] != null) {
            boolean bool_8 = true;

            for (i_6 = 0; i_6 < class217.field2556[i_3].length; i_6++) {
               if (class217.field2556[i_3][i_6] != null) {
                  if (class217.field2556[i_3][i_6].field2566 != 2) {
                     class217.field2556[i_3][i_6] = null;
                  } else {
                     bool_8 = false;
                  }
               }
            }

            if (bool_8) {
               class217.field2556[i_3] = null;
            }

            class128.field1755[i_3] = false;
         }
      }

      for (class179 class179_5 = (class179) client.field857.method5950(); class179_5 != null; class179_5 = (class179) client.field857.method5953()) {
         if ((class179_5.hash >> 48 & 0xffffL) == (long)i_3) {
            class179_5.unlink();
         }
      }

      class217 class217_9 = class80.fetchSomething(i_4);
      if (class217_9 != null) {
         class224.method4120(class217_9);
      }

      for (i_6 = 0; i_6 < client.field791; i_6++) {
         if (class1.method5(client.field794[i_6], 1662351965)) {
            if (i_6 < client.field791 - 1) {
               for (int i_7 = i_6; i_7 < client.field791 - 1; i_7++) {
                  client.field796[i_7] = client.field796[i_7 + 1];
                  client.field668[i_7] = client.field668[i_7 + 1];
                  client.field794[i_7] = client.field794[i_7 + 1];
                  client.field795[i_7] = client.field795[i_7 + 1];
                  client.field792[i_7] = client.field792[i_7 + 1];
                  client.field793[i_7] = client.field793[i_7 + 1];
                  client.field769[i_7] = client.field769[i_7 + 1];
               }
            }

            --i_6;
            --client.field791;
         }
      }

      class12.method145((byte) 20);
      if (client.field905 != -1) {
         class17.method175(client.field905, 1, -1199742641);
      }

   }

   public static int method3702(int i_0, int i_1, int i_2) {
      i_2 &= 0x3;
      return i_2 == 0 ? i_0 : (i_2 == 1 ? i_1 : (i_2 == 2 ? 7 - i_0 : 7 - i_1));
   }

   static int method3703(int i_0) {
      if (i_0 == 6500) {
         class76.field1098[++class70.field1014 - 1] = class157.method3428(865287787) ? 1 : 0;
         return 1;
      } else {
         class71 class71_4;
         if (i_0 == 6501) {
            class71_4 = class93.method2197(-1381660129);
            if (class71_4 != null) {
               class76.field1098[++class70.field1014 - 1] = class71_4.field1025;
               class76.field1098[++class70.field1014 - 1] = class71_4.field1023;
               class76.field1093[++class221.field2747 - 1] = class71_4.field1028;
               class76.field1098[++class70.field1014 - 1] = class71_4.field1032;
               class76.field1098[++class70.field1014 - 1] = class71_4.field1030;
               class76.field1093[++class221.field2747 - 1] = class71_4.field1029;
            } else {
               class76.field1098[++class70.field1014 - 1] = -1;
               class76.field1098[++class70.field1014 - 1] = 0;
               class76.field1093[++class221.field2747 - 1] = "";
               class76.field1098[++class70.field1014 - 1] = 0;
               class76.field1098[++class70.field1014 - 1] = 0;
               class76.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else if (i_0 == 6502) {
            class71_4 = class48.method812(-1579773205);
            if (class71_4 != null) {
               class76.field1098[++class70.field1014 - 1] = class71_4.field1025;
               class76.field1098[++class70.field1014 - 1] = class71_4.field1023;
               class76.field1093[++class221.field2747 - 1] = class71_4.field1028;
               class76.field1098[++class70.field1014 - 1] = class71_4.field1032;
               class76.field1098[++class70.field1014 - 1] = class71_4.field1030;
               class76.field1093[++class221.field2747 - 1] = class71_4.field1029;
            } else {
               class76.field1098[++class70.field1014 - 1] = -1;
               class76.field1098[++class70.field1014 - 1] = 0;
               class76.field1093[++class221.field2747 - 1] = "";
               class76.field1098[++class70.field1014 - 1] = 0;
               class76.field1098[++class70.field1014 - 1] = 0;
               class76.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else {
            class71 class71_5;
            int i_6;
            int i_8;
            if (i_0 == 6506) {
               i_8 = class76.field1098[--class70.field1014];
               class71_5 = null;

               for (i_6 = 0; i_6 < class71.field1022; i_6++) {
                  if (i_8 == class71.field1031[i_6].field1025) {
                     class71_5 = class71.field1031[i_6];
                     break;
                  }
               }

               if (class71_5 != null) {
                  class76.field1098[++class70.field1014 - 1] = class71_5.field1025;
                  class76.field1098[++class70.field1014 - 1] = class71_5.field1023;
                  class76.field1093[++class221.field2747 - 1] = class71_5.field1028;
                  class76.field1098[++class70.field1014 - 1] = class71_5.field1032;
                  class76.field1098[++class70.field1014 - 1] = class71_5.field1030;
                  class76.field1093[++class221.field2747 - 1] = class71_5.field1029;
               } else {
                  class76.field1098[++class70.field1014 - 1] = -1;
                  class76.field1098[++class70.field1014 - 1] = 0;
                  class76.field1093[++class221.field2747 - 1] = "";
                  class76.field1098[++class70.field1014 - 1] = 0;
                  class76.field1098[++class70.field1014 - 1] = 0;
                  class76.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 6507) {
               class70.field1014 -= 4;
               i_8 = class76.field1098[class70.field1014];
               boolean bool_11 = class76.field1098[class70.field1014 + 1] == 1;
               i_6 = class76.field1098[class70.field1014 + 2];
               boolean bool_7 = class76.field1098[class70.field1014 + 3] == 1;
               class17.method187(i_8, bool_11, i_6, bool_7, -176379221);
               return 1;
            } else if (i_0 != 6511) {
               if (i_0 == 6512) {
                  client.field799 = class76.field1098[--class70.field1014] == 1;
                  return 1;
               } else {
                  int i_9;
                  class249 class249_10;
                  if (i_0 == 6513) {
                     class70.field1014 -= 2;
                     i_8 = class76.field1098[class70.field1014];
                     i_9 = class76.field1098[class70.field1014 + 1];
                     class249_10 = class18.method209(i_9, (byte) 4);
                     if (class249_10.method4499(715128499)) {
                        class76.field1093[++class221.field2747 - 1] = class53.method1005(i_8, (byte) -48).method4740(i_9, class249_10.field3303, -1901190491);
                     } else {
                        class76.field1098[++class70.field1014 - 1] = class53.method1005(i_8, (byte) 106).method4711(i_9, class249_10.field3302);
                     }

                     return 1;
                  } else if (i_0 == 6514) {
                     class70.field1014 -= 2;
                     i_8 = class76.field1098[class70.field1014];
                     i_9 = class76.field1098[class70.field1014 + 1];
                     class249_10 = class18.method209(i_9, (byte) 4);
                     if (class249_10.method4499(715128499)) {
                        class76.field1093[++class221.field2747 - 1] = class128.method2970(i_8, (short) 4095).method4632(i_9, class249_10.field3303, (byte) 37);
                     } else {
                        class76.field1098[++class70.field1014 - 1] = class128.method2970(i_8, (short) 4095).method4596(i_9, class249_10.field3302, -291840142);
                     }

                     return 1;
                  } else if (i_0 == 6515) {
                     class70.field1014 -= 2;
                     i_8 = class76.field1098[class70.field1014];
                     i_9 = class76.field1098[class70.field1014 + 1];
                     class249_10 = class18.method209(i_9, (byte) 4);
                     if (class249_10.method4499(715128499)) {
                        class76.field1093[++class221.field2747 - 1] = class26.method404(i_8).method4648(i_9, class249_10.field3303, -204298018);
                     } else {
                        class76.field1098[++class70.field1014 - 1] = class26.method404(i_8).method4650(i_9, class249_10.field3302, (byte) -52);
                     }

                     return 1;
                  } else if (i_0 == 6516) {
                     class70.field1014 -= 2;
                     i_8 = class76.field1098[class70.field1014];
                     i_9 = class76.field1098[class70.field1014 + 1];
                     class249_10 = class18.method209(i_9, (byte) 4);
                     if (class249_10.method4499(715128499)) {
                        class76.field1093[++class221.field2747 - 1] = class249.method4510(i_8, 1544024361).method4515(i_9, class249_10.field3303, -1883536215);
                     } else {
                        class76.field1098[++class70.field1014 - 1] = class249.method4510(i_8, 1491402359).method4514(i_9, class249_10.field3302, -1469740156);
                     }

                     return 1;
                  } else if (i_0 == 6518) {
                     class76.field1098[++class70.field1014 - 1] = client.field658 ? 1 : 0;
                     return 1;
                  } else if (i_0 == 6519) {
                     class76.field1098[++class70.field1014 - 1] = client.field761 & 0x3;
                     return 1;
                  } else if (i_0 == 6520) {
                     return 1;
                  } else if (i_0 == 6521) {
                     return 1;
                  } else if (i_0 == 6522) {
                     --class221.field2747;
                     --class70.field1014;
                     return 1;
                  } else if (i_0 == 6523) {
                     --class221.field2747;
                     --class70.field1014;
                     return 1;
                  } else if (i_0 == 6524) {
                     class76.field1098[++class70.field1014 - 1] = -1;
                     return 1;
                  } else if (i_0 == 6525) {
                     class76.field1098[++class70.field1014 - 1] = 1;
                     return 1;
                  } else if (i_0 == 6526) {
                     class76.field1098[++class70.field1014 - 1] = 1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               i_8 = class76.field1098[--class70.field1014];
               if (i_8 >= 0 && i_8 < class71.field1022) {
                  class71_5 = class71.field1031[i_8];
                  class76.field1098[++class70.field1014 - 1] = class71_5.field1025;
                  class76.field1098[++class70.field1014 - 1] = class71_5.field1023;
                  class76.field1093[++class221.field2747 - 1] = class71_5.field1028;
                  class76.field1098[++class70.field1014 - 1] = class71_5.field1032;
                  class76.field1098[++class70.field1014 - 1] = class71_5.field1030;
                  class76.field1093[++class221.field2747 - 1] = class71_5.field1029;
               } else {
                  class76.field1098[++class70.field1014 - 1] = -1;
                  class76.field1098[++class70.field1014 - 1] = 0;
                  class76.field1093[++class221.field2747 - 1] = "";
                  class76.field1098[++class70.field1014 - 1] = 0;
                  class76.field1098[++class70.field1014 - 1] = 0;
                  class76.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
