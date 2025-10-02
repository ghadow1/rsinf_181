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
      class62.method1132(30, "", string_2, -2136270955);
   }

   static void method542(int i_0) {
      if (client.field810) {
         class217 class217_1 = client.method1649(class41.field359, client.field848, -970013539);
         if (class217_1 != null && class217_1.field2662 != null) {
            class62 class62_2 = new class62();
            class62_2.field575 = class217_1;
            class62_2.field581 = class217_1.field2662;
            class184.method3613(class62_2, (byte) 11);
         }

         client.field810 = false;
         class224.method4120(class217_1, -1624310266);
      }
   }

   static final void method539(class217[] arr_0, int i_1, short s_2) {
      for (int i_3 = 0; i_3 < arr_0.length; i_3++) {
         class217 class217_4 = arr_0[i_3];
         if (class217_4 != null) {
            if (class217_4.field2566 == 0) {
               if (class217_4.field2675 != null) {
                  method539(class217_4.field2675, i_1, (short) 7563);
               }

               class61 class61_5 = (class61) client.field816.method5952((long)class217_4.field2688);
               if (class61_5 != null) {
                  class17.method175(class61_5.field571, i_1, -1199742641);
               }
            }

            class62 class62_6;
            if (i_1 == 0 && class217_4.field2677 != null) {
               class62_6 = new class62();
               class62_6.field575 = class217_4;
               class62_6.field581 = class217_4.field2677;
               class184.method3613(class62_6, (byte) -108);
            }

            if (i_1 == 1 && class217_4.field2678 != null) {
               if (class217_4.field2565 >= 0) {
                  class217 class217_7 = class80.method1978(class217_4.field2688);
                  if (class217_7 == null || class217_7.field2675 == null || class217_4.field2565 >= class217_7.field2675.length || class217_4 != class217_7.field2675[class217_4.field2565]) {
                     continue;
                  }
               }

               class62_6 = new class62();
               class62_6.field575 = class217_4;
               class62_6.field581 = class217_4.field2678;
               class184.method3613(class62_6, (byte) -70);
            }
         }
      }

   }

   static int method540(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      if (i_0 == 3300) {
         class76.field1098[++class70.field1014 - 1] = client.field881;
         return 1;
      } else {
         int i_4;
         int i_5;
         if (i_0 == 3301) {
            class70.field1014 -= 2;
            i_4 = class76.field1098[class70.field1014];
            i_5 = class76.field1098[class70.field1014 + 1];
            class76.field1098[++class70.field1014 - 1] = class21.method274(i_4, i_5, (byte) -108);
            return 1;
         } else if (i_0 == 3302) {
            class70.field1014 -= 2;
            i_4 = class76.field1098[class70.field1014];
            i_5 = class76.field1098[class70.field1014 + 1];
            class76.field1098[++class70.field1014 - 1] = class2.method27(i_4, i_5, -1315693887);
            return 1;
         } else if (i_0 == 3303) {
            class70.field1014 -= 2;
            i_4 = class76.field1098[class70.field1014];
            i_5 = class76.field1098[class70.field1014 + 1];
            class76.field1098[++class70.field1014 - 1] = class342.method6528(i_4, i_5, -1560259071);
            return 1;
         } else if (i_0 == 3304) {
            i_4 = class76.field1098[--class70.field1014];
            class76.field1098[++class70.field1014 - 1] = class171.method3546(i_4, -1252480817).field3201;
            return 1;
         } else if (i_0 == 3305) {
            i_4 = class76.field1098[--class70.field1014];
            class76.field1098[++class70.field1014 - 1] = client.field760[i_4];
            return 1;
         } else if (i_0 == 3306) {
            i_4 = class76.field1098[--class70.field1014];
            class76.field1098[++class70.field1014 - 1] = client.field787[i_4];
            return 1;
         } else if (i_0 == 3307) {
            i_4 = class76.field1098[--class70.field1014];
            class76.field1098[++class70.field1014 - 1] = client.field788[i_4];
            return 1;
         } else {
            int i_6;
            if (i_0 == 3308) {
               i_4 = class42.field372;
               i_5 = (client.field657.field1005 >> 7) + class196.field2389;
               i_6 = (client.field657.field949 >> 7) + class1.field1;
               class76.field1098[++class70.field1014 - 1] = (i_5 << 14) + i_6 + (i_4 << 28);
               return 1;
            } else if (i_0 == 3309) {
               i_4 = class76.field1098[--class70.field1014];
               class76.field1098[++class70.field1014 - 1] = i_4 >> 14 & 0x3fff;
               return 1;
            } else if (i_0 == 3310) {
               i_4 = class76.field1098[--class70.field1014];
               class76.field1098[++class70.field1014 - 1] = i_4 >> 28;
               return 1;
            } else if (i_0 == 3311) {
               i_4 = class76.field1098[--class70.field1014];
               class76.field1098[++class70.field1014 - 1] = i_4 & 0x3fff;
               return 1;
            } else if (i_0 == 3312) {
               class76.field1098[++class70.field1014 - 1] = client.field655 ? 1 : 0;
               return 1;
            } else if (i_0 == 3313) {
               class70.field1014 -= 2;
               i_4 = class76.field1098[class70.field1014] + 32768;
               i_5 = class76.field1098[class70.field1014 + 1];
               class76.field1098[++class70.field1014 - 1] = class21.method274(i_4, i_5, (byte) -41);
               return 1;
            } else if (i_0 == 3314) {
               class70.field1014 -= 2;
               i_4 = class76.field1098[class70.field1014] + 32768;
               i_5 = class76.field1098[class70.field1014 + 1];
               class76.field1098[++class70.field1014 - 1] = class2.method27(i_4, i_5, -1132893252);
               return 1;
            } else if (i_0 == 3315) {
               class70.field1014 -= 2;
               i_4 = class76.field1098[class70.field1014] + 32768;
               i_5 = class76.field1098[class70.field1014 + 1];
               class76.field1098[++class70.field1014 - 1] = class342.method6528(i_4, i_5, 736449403);
               return 1;
            } else if (i_0 == 3316) {
               if (client.field890 >= 2) {
                  class76.field1098[++class70.field1014 - 1] = client.field890;
               } else {
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3317) {
               class76.field1098[++class70.field1014 - 1] = client.field669;
               return 1;
            } else if (i_0 == 3318) {
               class76.field1098[++class70.field1014 - 1] = client.field807;
               return 1;
            } else if (i_0 == 3321) {
               class76.field1098[++class70.field1014 - 1] = client.field910;
               return 1;
            } else if (i_0 == 3322) {
               class76.field1098[++class70.field1014 - 1] = client.field823;
               return 1;
            } else if (i_0 == 3323) {
               if (client.field826) {
                  class76.field1098[++class70.field1014 - 1] = 1;
               } else {
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3324) {
               class76.field1098[++class70.field1014 - 1] = client.field653;
               return 1;
            } else if (i_0 == 3325) {
               class70.field1014 -= 4;
               i_4 = class76.field1098[class70.field1014];
               i_5 = class76.field1098[class70.field1014 + 1];
               i_6 = class76.field1098[class70.field1014 + 2];
               int i_7 = class76.field1098[class70.field1014 + 3];
               i_4 += i_5 << 14;
               i_4 += i_6 << 28;
               i_4 += i_7;
               class76.field1098[++class70.field1014 - 1] = i_4;
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
