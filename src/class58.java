public class class58 {

   public static class74 field546;
   int field542 = 0;
   final class235 field547;
   final int field539;

   class58(class235 class235_1, String string_2) {
      this.field547 = class235_1;
      this.field539 = class235_1.method4232();
   }

   boolean method1095(byte b_1) {
      this.field542 = 0;

      for (int i_2 = 0; i_2 < this.field539; i_2++) {
         if (!this.field547.method4268(i_2, (byte) 0) || this.field547.method4267(i_2)) {
            ++this.field542;
         }
      }

      return this.field542 >= this.field539;
   }

   static final void method1098(class217 class217_0, int i_1, int i_2, int i_3, byte b_4) {
      class186.method3619((byte) 39);
      class211 class211_5 = class217_0.method4040(false, (byte) 0);
      if (class211_5 != null) {
         class321.method5997(i_1, i_2, class211_5.field2519 + i_1, i_2 + class211_5.field2522);
         if (Client.field652 != 2 && Client.field652 != 5) {
            int i_6 = Client.field722 & 0x7ff;
            int i_7 = Client.field657.field1005 / 32 + 48;
            int i_8 = 464 - Client.field657.field949 / 32;
            class174.field2102.method6140(i_1, i_2, class211_5.field2519, class211_5.field2522, i_7, i_8, i_6, 256, class211_5.field2521, class211_5.field2520);

            int i_9;
            int i_10;
            int i_11;
            for (i_9 = 0; i_9 < Client.field730; i_9++) {
               i_10 = Client.field664[i_9] * 4 + 2 - Client.field657.field1005 / 32;
               i_11 = Client.field883[i_9] * 4 + 2 - Client.field657.field949 / 32;
               class76.method1935(i_1, i_2, i_10, i_11, Client.field786[i_9], class211_5, (byte) 73);
            }

            int i_12;
            int i_13;
            for (i_9 = 0; i_9 < 104; i_9++) {
               for (i_10 = 0; i_10 < 104; i_10++) {
                  class261 class261_16 = Client.field887[class42.field372][i_9][i_10];
                  if (class261_16 != null) {
                     i_12 = i_9 * 4 + 2 - Client.field657.field1005 / 32;
                     i_13 = i_10 * 4 + 2 - Client.field657.field949 / 32;
                     class76.method1935(i_1, i_2, i_12, i_13, class221.field2746[0], class211_5, (byte) 73);
                  }
               }
            }

            for (i_9 = 0; i_9 < Client.field695; i_9++) {
               class79 class79_17 = Client.field694[Client.field696[i_9]];
               if (class79_17 != null && class79_17.vmethod1965(-1461786701)) {
                  class256 class256_19 = class79_17.field1134;
                  if (class256_19 != null && class256_19.field3476 != null) {
                     class256_19 = class256_19.method4709(942859640);
                  }

                  if (class256_19 != null && class256_19.field3493 && class256_19.field3496) {
                     i_12 = class79_17.field1005 / 32 - Client.field657.field1005 / 32;
                     i_13 = class79_17.field949 / 32 - Client.field657.field949 / 32;
                     class76.method1935(i_1, i_2, i_12, i_13, class221.field2746[1], class211_5, (byte) 73);
                  }
               }
            }

            i_9 = class89.field1255;
            int[] ints_20 = class89.field1257;

            for (i_11 = 0; i_11 < i_9; i_11++) {
               class66 class66_18 = Client.field909[ints_20[i_11]];
               if (class66_18 != null && class66_18.vmethod1965(-2093257625) && !class66_18.field628 && class66_18 != Client.field657) {
                  i_13 = class66_18.field1005 / 32 - Client.field657.field1005 / 32;
                  int i_14 = class66_18.field949 / 32 - Client.field657.field949 / 32;
                  boolean bool_15 = false;
                  if (Client.field657.field632 != 0 && class66_18.field632 != 0 && class66_18.field632 == Client.field657.field632) {
                     bool_15 = true;
                  }

                  if (class66_18.method1181(-1900430541)) {
                     class76.method1935(i_1, i_2, i_13, i_14, class221.field2746[3], class211_5, (byte) 73);
                  } else if (bool_15) {
                     class76.method1935(i_1, i_2, i_13, i_14, class221.field2746[4], class211_5, (byte) 73);
                  } else if (class66_18.method1184((byte) 12)) {
                     class76.method1935(i_1, i_2, i_13, i_14, class221.field2746[5], class211_5, (byte) 73);
                  } else {
                     class76.method1935(i_1, i_2, i_13, i_14, class221.field2746[2], class211_5, (byte) 73);
                  }
               }
            }

            if (Client.field708 != 0 && Client.field881 % 20 < 10) {
               if (Client.field708 == 1 && Client.field824 >= 0 && Client.field824 < Client.field694.length) {
                  class79 class79_21 = Client.field694[Client.field824];
                  if (class79_21 != null) {
                     i_12 = class79_21.field1005 / 32 - Client.field657.field1005 / 32;
                     i_13 = class79_21.field949 / 32 - Client.field657.field949 / 32;
                     class48.method810(i_1, i_2, i_12, i_13, class39.field342[1], class211_5, -1460314936);
                  }
               }

               if (Client.field708 == 2) {
                  i_11 = Client.field737 * 4 - class196.field2389 * 4 + 2 - Client.field657.field1005 / 32;
                  i_12 = Client.field777 * 4 - class1.field1 * 4 + 2 - Client.field657.field949 / 32;
                  class48.method810(i_1, i_2, i_11, i_12, class39.field342[1], class211_5, -1460314936);
               }

               if (Client.field708 == 10 && Client.field689 >= 0 && Client.field689 < Client.field909.length) {
                  class66 class66_22 = Client.field909[Client.field689];
                  if (class66_22 != null) {
                     i_12 = class66_22.field1005 / 32 - Client.field657.field1005 / 32;
                     i_13 = class66_22.field949 / 32 - Client.field657.field949 / 32;
                     class48.method810(i_1, i_2, i_12, i_13, class39.field342[1], class211_5, -1460314936);
                  }
               }
            }

            if (Client.field885 != 0) {
               i_11 = Client.field885 * 4 + 2 - Client.field657.field1005 / 32;
               i_12 = Client.field842 * 4 + 2 - Client.field657.field949 / 32;
               class76.method1935(i_1, i_2, i_11, i_12, class39.field342[0], class211_5, (byte) 73);
            }

            if (!Client.field657.field628) {
               class321.method6012(class211_5.field2519 / 2 + i_1 - 1, class211_5.field2522 / 2 + i_2 - 1, 3, 3, 16777215);
            }
         } else {
            class321.method6016(i_1, i_2, 0, class211_5.field2521, class211_5.field2520);
         }

         Client.field861[i_3] = true;
      }
   }

   public static boolean method1094(class233 class233_0, class233 class233_1, class233 class233_2, class198 class198_3, byte b_4) {
      class197.field2406 = class233_0;
      class197.field2400 = class233_1;
      class197.field2401 = class233_2;
      class76.field1099 = class198_3;
      return true;
   }

   static int method1100(int i_0, class92 class92_1, boolean bool_2, byte b_3) {
      class217 class217_4;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         class217_4 = class80.fetchSomething(class76.field1098[--class70.field1014]);
      } else {
         class217_4 = bool_2 ? class76.field1111 : class207.field2507;
      }

      if (i_0 == 1927) {
         if (class76.field1106 >= 10) {
            throw new RuntimeException();
         } else if (class217_4.field2679 == null) {
            return 0;
         } else {
            class62 class62_5 = new class62();
            class62_5.field575 = class217_4;
            class62_5.field581 = class217_4.field2679;
            class62_5.field583 = class76.field1106 + 1;
            Client.field854.method4917(class62_5);
            return 1;
         }
      } else {
         return 2;
      }
   }

   static class217 method1099(class217 class217_0, int i_1) {
      class217 class217_3 = class217_0;
      int i_4 = class32.method545(class268.method4987(class217_0), -1017590998);
      class217 class217_2;
      if (i_4 == 0) {
         class217_2 = null;
      } else {
         int i_5 = 0;

         while (true) {
            if (i_5 >= i_4) {
               class217_2 = class217_3;
               break;
            }

            class217_3 = class80.fetchSomething(class217_3.field2583);
            if (class217_3 == null) {
               class217_2 = null;
               break;
            }

            ++i_5;
         }
      }

      class217 class217_6 = class217_2;
      if (class217_2 == null) {
         class217_6 = class217_0.field2645;
      }

      return class217_6;
   }

}
