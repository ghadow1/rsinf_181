public class class31 {

   static class325[] field271;
   static int field268;
   static final class31 field272 = new class31(0);
   static final class31 field269 = new class31(1);
   final int field270;

   class31(int i_1) {
      this.field270 = i_1;
   }

   static final void method541(String string_0, byte b_1) {
      StringBuilder stringbuilder_10000 = new StringBuilder();
      Object obj_10001 = null;
      stringbuilder_10000 = stringbuilder_10000.append("Please remove ").append(string_0);
      obj_10001 = null;
      String string_2 = stringbuilder_10000.append(" from your friend list first").toString();
      class62.method1132(30, "", string_2);
   }

   static void method542(int i_0) {
      if (Client.isSpellSelected) {
         Widget widget_1 = Client.method1649(class41.field359, Client.field848);
         if (widget_1 != null && widget_1.field2662 != null) {
            class62 class62_2 = new class62();
            class62_2.field575 = widget_1;
            class62_2.field581 = widget_1.field2662;
            class184.method3613(class62_2);
         }

         Client.isSpellSelected = false;
         FriendSystem.invalidateWidget(widget_1);
      }
   }

   static final void method539(Widget[] arr_0, int i_1, short s_2) {
      for (int i_3 = 0; i_3 < arr_0.length; i_3++) {
         Widget widget_4 = arr_0[i_3];
         if (widget_4 != null) {
            if (widget_4.field2566 == 0) {
               if (widget_4.field2675 != null) {
                  method539(widget_4.field2675, i_1, (short) 7563);
               }

               class61 class61_5 = (class61) Client.field816.method5952((long) widget_4.field2688);
               if (class61_5 != null) {
                  class17.method175(class61_5.field571, i_1, -1199742641);
               }
            }

            class62 class62_6;
            if (i_1 == 0 && widget_4.field2677 != null) {
               class62_6 = new class62();
               class62_6.field575 = widget_4;
               class62_6.field581 = widget_4.field2677;
               class184.method3613(class62_6);
            }

            if (i_1 == 1 && widget_4.field2678 != null) {
               if (widget_4.field2565 >= 0) {
                  Widget widget_7 = WorldMapElement.getWidget(widget_4.field2688);
                  if (widget_7 == null || widget_7.field2675 == null || widget_4.field2565 >= widget_7.field2675.length || widget_4 != widget_7.field2675[widget_4.field2565]) {
                     continue;
                  }
               }

               class62_6 = new class62();
               class62_6.field575 = widget_4;
               class62_6.field581 = widget_4.field2678;
               class184.method3613(class62_6);
            }
         }
      }

   }

   static int method540(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      if (i_0 == 3300) {
         MouseRecorder.field1098[++class70.field1014 - 1] = Client.field881;
         return 1;
      } else {
         int i_4;
         int i_5;
         if (i_0 == 3301) {
            class70.field1014 -= 2;
            i_4 = MouseRecorder.field1098[class70.field1014];
            i_5 = MouseRecorder.field1098[class70.field1014 + 1];
            MouseRecorder.field1098[++class70.field1014 - 1] = class21.method274(i_4, i_5, (byte) -108);
            return 1;
         } else if (i_0 == 3302) {
            class70.field1014 -= 2;
            i_4 = MouseRecorder.field1098[class70.field1014];
            i_5 = MouseRecorder.field1098[class70.field1014 + 1];
            MouseRecorder.field1098[++class70.field1014 - 1] = class2.method27(i_4, i_5, -1315693887);
            return 1;
         } else if (i_0 == 3303) {
            class70.field1014 -= 2;
            i_4 = MouseRecorder.field1098[class70.field1014];
            i_5 = MouseRecorder.field1098[class70.field1014 + 1];
            MouseRecorder.field1098[++class70.field1014 - 1] = class342.method6528(i_4, i_5);
            return 1;
         } else if (i_0 == 3304) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            MouseRecorder.field1098[++class70.field1014 - 1] = class171.method3546(i_4, -1252480817).field3201;
            return 1;
         } else if (i_0 == 3305) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            MouseRecorder.field1098[++class70.field1014 - 1] = Client.field760[i_4];
            return 1;
         } else if (i_0 == 3306) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            MouseRecorder.field1098[++class70.field1014 - 1] = Client.field787[i_4];
            return 1;
         } else if (i_0 == 3307) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            MouseRecorder.field1098[++class70.field1014 - 1] = Client.field788[i_4];
            return 1;
         } else {
            int i_6;
            if (i_0 == 3308) {
               i_4 = class42.field372;
               i_5 = (Client.field657.field1005 >> 7) + class196.field2389;
               i_6 = (Client.field657.field949 >> 7) + class1.field1;
               MouseRecorder.field1098[++class70.field1014 - 1] = (i_5 << 14) + i_6 + (i_4 << 28);
               return 1;
            } else if (i_0 == 3309) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               MouseRecorder.field1098[++class70.field1014 - 1] = i_4 >> 14 & 0x3fff;
               return 1;
            } else if (i_0 == 3310) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               MouseRecorder.field1098[++class70.field1014 - 1] = i_4 >> 28;
               return 1;
            } else if (i_0 == 3311) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               MouseRecorder.field1098[++class70.field1014 - 1] = i_4 & 0x3fff;
               return 1;
            } else if (i_0 == 3312) {
               MouseRecorder.field1098[++class70.field1014 - 1] = Client.field655 ? 1 : 0;
               return 1;
            } else if (i_0 == 3313) {
               class70.field1014 -= 2;
               i_4 = MouseRecorder.field1098[class70.field1014] + 32768;
               i_5 = MouseRecorder.field1098[class70.field1014 + 1];
               MouseRecorder.field1098[++class70.field1014 - 1] = class21.method274(i_4, i_5, (byte) -41);
               return 1;
            } else if (i_0 == 3314) {
               class70.field1014 -= 2;
               i_4 = MouseRecorder.field1098[class70.field1014] + 32768;
               i_5 = MouseRecorder.field1098[class70.field1014 + 1];
               MouseRecorder.field1098[++class70.field1014 - 1] = class2.method27(i_4, i_5, -1132893252);
               return 1;
            } else if (i_0 == 3315) {
               class70.field1014 -= 2;
               i_4 = MouseRecorder.field1098[class70.field1014] + 32768;
               i_5 = MouseRecorder.field1098[class70.field1014 + 1];
               MouseRecorder.field1098[++class70.field1014 - 1] = class342.method6528(i_4, i_5);
               return 1;
            } else if (i_0 == 3316) {
               if (Client.field890 >= 2) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = Client.field890;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3317) {
               MouseRecorder.field1098[++class70.field1014 - 1] = Client.field669;
               return 1;
            } else if (i_0 == 3318) {
               MouseRecorder.field1098[++class70.field1014 - 1] = Client.field807;
               return 1;
            } else if (i_0 == 3321) {
               MouseRecorder.field1098[++class70.field1014 - 1] = Client.field910;
               return 1;
            } else if (i_0 == 3322) {
               MouseRecorder.field1098[++class70.field1014 - 1] = Client.field823;
               return 1;
            } else if (i_0 == 3323) {
               if (Client.field826) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 1;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3324) {
               MouseRecorder.field1098[++class70.field1014 - 1] = Client.field653;
               return 1;
            } else if (i_0 == 3325) {
               class70.field1014 -= 4;
               i_4 = MouseRecorder.field1098[class70.field1014];
               i_5 = MouseRecorder.field1098[class70.field1014 + 1];
               i_6 = MouseRecorder.field1098[class70.field1014 + 2];
               int i_7 = MouseRecorder.field1098[class70.field1014 + 3];
               i_4 += i_5 << 14;
               i_4 += i_6 << 28;
               i_4 += i_7;
               MouseRecorder.field1098[++class70.field1014 - 1] = i_4;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   static class333 method538(int i_0) {
      return class136.field1875;
   }

}
