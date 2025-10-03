public class class188 {

   static int[] field2339;

   static {
      new Object();
      field2339 = new int[33];
      field2339[0] = 0;
      int i_0 = 2;

      for (int i_1 = 1; i_1 < 33; i_1++) {
         field2339[i_1] = i_0 - 1;
         i_0 += i_0;
      }

   }

   static void method3643(class295 class295_0, class295 class295_1, byte b_2) {
      class235 class235_4;
      int i_5;
      int i_6;
      if (class31.field271 == null) {
         class235_4 = Client.field683;
         i_5 = class235_4.method4160("sl_back");
         i_6 = class235_4.method4161(i_5, "");
         class325[] arr_3 = class131.method3062(class235_4, i_5, i_6, -207318054);
         class31.field271 = arr_3;
      }

      class324[] arr_26;
      if (class57.field533 == null) {
         class235_4 = Client.field683;
         i_5 = class235_4.method4160("sl_flags");
         i_6 = class235_4.method4161(i_5, "");
         arr_26 = class289.method5281(class235_4, i_5, i_6, 2048583436);
         class57.field533 = arr_26;
      }

      if (class225.field3062 == null) {
         class235_4 = Client.field683;
         i_5 = class235_4.method4160("sl_arrows");
         i_6 = class235_4.method4161(i_5, "");
         arr_26 = class289.method5281(class235_4, i_5, i_6, 2025488546);
         class225.field3062 = arr_26;
      }

      if (class74.field1073 == null) {
         class235_4 = Client.field683;
         i_5 = class235_4.method4160("sl_stars");
         i_6 = class235_4.method4161(i_5, "");
         arr_26 = class289.method5281(class235_4, i_5, i_6, 1876500415);
         class74.field1073 = arr_26;
      }

      if (class85.field1206 == null) {
         class85.field1206 = class215.method4021(Client.field683, "leftarrow", "");
      }

      if (class256.field3490 == null) {
         class256.field3490 = class215.method4021(Client.field683, "rightarrow", "");
      }

      class321.method6012(class85.field1208, 23, 765, 480, 0);
      class321.method6005(class85.field1208, 0, 125, 23, 12425273, 9135624);
      class321.method6005(class85.field1208 + 125, 0, 640, 23, 5197647, 2697513);
      class295_0.method5341("Select a world", class85.field1208 + 62, 15, 0, -1);
      if (class74.field1073 != null) {
         class74.field1073[1].method6101(class85.field1208 + 140, 1);
         class295_1.method5346("Members only world", class85.field1208 + 152, 10, 16777215, -1);
         class74.field1073[0].method6101(class85.field1208 + 140, 12);
         class295_1.method5346("Free world", class85.field1208 + 152, 21, 16777215, -1);
      }

      if (class225.field3062 != null) {
         int i_23 = class85.field1208 + 280;
         if (class71.field1026[0] == 0 && class71.field1018[0] == 0) {
            class225.field3062[2].method6101(i_23, 4);
         } else {
            class225.field3062[0].method6101(i_23, 4);
         }

         if (class71.field1026[0] == 0 && class71.field1018[0] == 1) {
            class225.field3062[3].method6101(i_23 + 15, 4);
         } else {
            class225.field3062[1].method6101(i_23 + 15, 4);
         }

         class295_0.method5346("World", i_23 + 32, 17, 16777215, -1);
         int i_24 = class85.field1208 + 390;
         if (class71.field1026[0] == 1 && class71.field1018[0] == 0) {
            class225.field3062[2].method6101(i_24, 4);
         } else {
            class225.field3062[0].method6101(i_24, 4);
         }

         if (class71.field1026[0] == 1 && class71.field1018[0] == 1) {
            class225.field3062[3].method6101(i_24 + 15, 4);
         } else {
            class225.field3062[1].method6101(i_24 + 15, 4);
         }

         class295_0.method5346("Players", i_24 + 32, 17, 16777215, -1);
         i_5 = class85.field1208 + 500;
         if (class71.field1026[0] == 2 && class71.field1018[0] == 0) {
            class225.field3062[2].method6101(i_5, 4);
         } else {
            class225.field3062[0].method6101(i_5, 4);
         }

         if (class71.field1026[0] == 2 && class71.field1018[0] == 1) {
            class225.field3062[3].method6101(i_5 + 15, 4);
         } else {
            class225.field3062[1].method6101(i_5 + 15, 4);
         }

         class295_0.method5346("Location", i_5 + 32, 17, 16777215, -1);
         i_6 = class85.field1208 + 610;
         if (class71.field1026[0] == 3 && class71.field1018[0] == 0) {
            class225.field3062[2].method6101(i_6, 4);
         } else {
            class225.field3062[0].method6101(i_6, 4);
         }

         if (class71.field1026[0] == 3 && class71.field1018[0] == 1) {
            class225.field3062[3].method6101(i_6 + 15, 4);
         } else {
            class225.field3062[1].method6101(i_6 + 15, 4);
         }

         class295_0.method5346("Type", i_6 + 32, 17, 16777215, -1);
      }

      class321.method6012(class85.field1208 + 708, 4, 50, 16, 0);
      class295_1.method5341("Cancel", class85.field1208 + 708 + 25, 16, 16777215, -1);
      class85.field1207 = -1;
      if (class31.field271 != null) {
         byte b_28 = 88;
         byte b_29 = 19;
         i_5 = 765 / (b_28 + 1) - 1;
         i_6 = 480 / (b_29 + 1);

         int i_7;
         int i_8;
         do {
            i_7 = i_6;
            i_8 = i_5;
            if (i_6 * (i_5 - 1) >= class71.field1022) {
               --i_5;
            }

            if (i_5 * (i_6 - 1) >= class71.field1022) {
               --i_6;
            }

            if (i_5 * (i_6 - 1) >= class71.field1022) {
               --i_6;
            }
         } while (i_7 != i_6 || i_8 != i_5);

         i_7 = (765 - i_5 * b_28) / (i_5 + 1);
         if (i_7 > 5) {
            i_7 = 5;
         }

         i_8 = (480 - i_6 * b_29) / (i_6 + 1);
         if (i_8 > 5) {
            i_8 = 5;
         }

         int i_9 = (765 - i_5 * b_28 - i_7 * (i_5 - 1)) / 2;
         int i_10 = (480 - b_29 * i_6 - i_8 * (i_6 - 1)) / 2;
         int i_11 = (i_6 + class71.field1022 - 1) / i_6;
         class85.field1186 = i_11 - i_5;
         if (class85.field1206 != null && class85.field1190 > 0) {
            class85.field1206.method6101(8, class249.field3308 / 2 - class85.field1206.field3893 / 2);
         }

         if (class256.field3490 != null && class85.field1190 < class85.field1186) {
            class256.field3490.method6101(class7.field46 - class256.field3490.field3897 - 8, class249.field3308 / 2 - class256.field3490.field3893 / 2);
         }

         int i_12 = i_10 + 23;
         int i_13 = i_9 + class85.field1208;
         int i_14 = 0;
         boolean bool_15 = false;
         int i_16 = class85.field1190;

         int i_17;
         for (i_17 = i_6 * i_16; i_17 < class71.field1022 && i_16 - class85.field1190 < i_5; i_17++) {
            class71 class71_25 = class71.field1031[i_17];
            boolean bool_19 = true;
            String string_20 = Integer.toString(class71_25.field1030);
            if (class71_25.field1030 == -1) {
               string_20 = "OFF";
               bool_19 = false;
            } else if (class71_25.field1030 > 1980) {
               string_20 = "FULL";
               bool_19 = false;
            }

            int i_22 = 0;
            byte b_21;
            if (class71_25.method1688()) {
               if (class71_25.method1680()) {
                  b_21 = 7;
               } else {
                  b_21 = 6;
               }
            } else if (class71_25.method1684()) {
               i_22 = 16711680;
               if (class71_25.method1680()) {
                  b_21 = 5;
               } else {
                  b_21 = 4;
               }
            } else if (class71_25.method1718()) {
               if (class71_25.method1680()) {
                  b_21 = 3;
               } else {
                  b_21 = 2;
               }
            } else if (class71_25.method1680()) {
               b_21 = 1;
            } else {
               b_21 = 0;
            }

            if (class54.field492 >= i_13 && class54.field487 >= i_12 && class54.field492 < b_28 + i_13 && class54.field487 < i_12 + b_29 && bool_19) {
               class85.field1207 = i_17;
               class31.field271[b_21].method6127(i_13, i_12, 128, 16777215);
               bool_15 = true;
            } else {
               class31.field271[b_21].method6121(i_13, i_12);
            }

            if (class57.field533 != null) {
               class57.field533[(class71_25.method1680() ? 8 : 0) + class71_25.field1032].method6101(i_13 + 29, i_12);
            }

            class295_0.method5341(Integer.toString(class71_25.field1025), i_13 + 15, b_29 / 2 + i_12 + 5, i_22, -1);
            class295_1.method5341(string_20, i_13 + 60, b_29 / 2 + i_12 + 5, 268435455, -1);
            i_12 = i_12 + i_8 + b_29;
            ++i_14;
            if (i_14 >= i_6) {
               i_12 = i_10 + 23;
               i_13 = i_13 + i_7 + b_28;
               i_14 = 0;
               ++i_16;
            }
         }

         if (bool_15) {
            i_17 = class295_1.method5417(class71.field1031[class85.field1207].field1028) + 6;
            int i_18 = class295_1.field3709 + 8;
            int i_27 = class54.field487 + 25;
            if (i_18 + i_27 > 480) {
               i_27 = class54.field487 - 25 - i_18;
            }

            class321.method6012(class54.field492 - i_17 / 2, i_27, i_17, i_18, 16777120);
            class321.method6008(class54.field492 - i_17 / 2, i_27, i_17, i_18, 0);
            class295_1.method5341(class71.field1031[class85.field1207].field1028, class54.field492, i_27 + class295_1.field3709 + 4, 0, -1);
         }
      }

      class202.field2486.vmethod6077(0, 0, -1141719337);
   }

   public static final void method3644(String string_0, String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      class135.method3260(string_0, string_1, i_2, i_3, i_4, i_5, false);
   }

   static final String method3631(int i_0, int i_1) {
      String string_2 = Integer.toString(i_0);

      for (int i_3 = string_2.length() - 3; i_3 > 0; i_3 -= 3) {
         string_2 = string_2.substring(0, i_3) + "," + string_2.substring(i_3);
      }

      return string_2.length() > 9 ? " " + class73.method1756(65408, -844505624) + string_2.substring(0, string_2.length() - 8) + "M" + " " + " (" + string_2 + ")" + "</col>" : (string_2.length() > 6 ? " " + class73.method1756(16777215, -844505624) + string_2.substring(0, string_2.length() - 4) + "K" + " " + " (" + string_2 + ")" + "</col>" : " " + class73.method1756(16776960, -844505624) + string_2 + "</col>");
   }

}
