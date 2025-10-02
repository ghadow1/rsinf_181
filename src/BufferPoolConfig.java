public class BufferPoolConfig {

   public static byte[][][] customPools;

   static void method3654(class295 class295_0, class295 class295_1, class295 class295_2, byte b_3) {
      class85.field1208 = (class7.field46 - 765) / 2;
      class85.field1187 = class85.field1208 + 202;
      class62.field585 = class85.field1187 + 180;
      if (class85.field1205) {
         class188.method3643(class295_0, class295_1, (byte) 11);
      } else {
         class5.field23.method6121(class85.field1208, 0);
         class79.field1135.method6121(class85.field1208 + 382, 0);
         class87.field1243.method6101(class85.field1208 + 382 - class87.field1243.field3897 / 2, 18);
         int i_5;
         if (Client.field662 == 0 || Client.field662 == 5) {
            byte b_4 = 20;
            class295_0.method5341("RuneScape is loading - please wait...", class85.field1187 + 180, 245 - b_4, 16777215, -1);
            i_5 = 253 - b_4;
            class321.method6008(class85.field1187 + 180 - 152, i_5, 304, 34, 9179409);
            class321.method6008(class85.field1187 + 180 - 151, i_5 + 1, 302, 32, 0);
            class321.method6012(class85.field1187 + 180 - 150, i_5 + 2, class85.field1188 * 3, 30, 9179409);
            class321.method6012(class85.field1188 * 3 + (class85.field1187 + 180 - 150), i_5 + 2, 300 - class85.field1188 * 3, 30, 0);
            class295_0.method5341(class85.field1189, class85.field1187 + 180, 276 - b_4, 16777215, -1);
         }

         String string_6;
         String string_7;
         short s_23;
         int i_24;
         short s_25;
         if (Client.field662 == 20) {
            class85.field1194.method6101(class85.field1187 + 180 - class85.field1194.field3897 / 2, 271 - class85.field1194.field3893 / 2);
            s_23 = 201;
            class295_0.method5341(class85.field1210, class85.field1187 + 180, s_23, 16776960, 0);
            i_24 = s_23 + 15;
            class295_0.method5341(class85.field1195, class85.field1187 + 180, i_24, 16776960, 0);
            i_24 += 15;
            class295_0.method5341(class85.field1196, class85.field1187 + 180, i_24, 16776960, 0);
            i_24 += 15;
            i_24 += 7;
            if (class85.field1209 != 4) {
               class295_0.method5346("Login: ", class85.field1187 + 180 - 110, i_24, 16777215, 0);
               s_25 = 200;
               string_6 = class17.field117.field1066 ? class183.method3612(class85.field1180, -231155257) : class85.field1180;

               for (string_7 = string_6; class295_0.method5417(string_7) > s_25; string_7 = string_7.substring(0, string_7.length() - 1)) {
                  ;
               }

               class295_0.method5346(class296.method5362(string_7), class85.field1187 + 180 - 70, i_24, 16777215, 0);
               i_24 += 15;
               class295_0.method5346("Password: " + class183.method3612(class85.field1198, -231155257), class85.field1187 + 180 - 108, i_24, 16777215, 0);
               i_24 += 15;
            }
         }

         if (Client.field662 == 10 || Client.field662 == 11) {
            class85.field1194.method6101(class85.field1187, 171);
            short s_18;
            if (class85.field1209 == 0) {
               s_23 = 251;
               class295_0.method5341("Welcome to RuneScape", class85.field1187 + 180, s_23, 16776960, 0);
               i_24 = s_23 + 30;
               i_5 = class85.field1187 + 180 - 80;
               s_18 = 291;
               class240.field3207.method6101(i_5 - 73, s_18 - 20);
               class295_0.method5350("New User", i_5 - 73, s_18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               i_5 = class85.field1187 + 180 + 80;
               class240.field3207.method6101(i_5 - 73, s_18 - 20);
               class295_0.method5350("Existing User", i_5 - 73, s_18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class85.field1209 == 1) {
               class295_0.method5341(class85.field1197, class85.field1187 + 180, 201, 16776960, 0);
               s_23 = 236;
               class295_0.method5341(class85.field1210, class85.field1187 + 180, s_23, 16777215, 0);
               i_24 = s_23 + 15;
               class295_0.method5341(class85.field1195, class85.field1187 + 180, i_24, 16777215, 0);
               i_24 += 15;
               class295_0.method5341(class85.field1196, class85.field1187 + 180, i_24, 16777215, 0);
               i_24 += 15;
               i_5 = class85.field1187 + 180 - 80;
               s_18 = 321;
               class240.field3207.method6101(i_5 - 73, s_18 - 20);
               class295_0.method5341("Continue", i_5, s_18 + 5, 16777215, 0);
               i_5 = class85.field1187 + 180 + 80;
               class240.field3207.method6101(i_5 - 73, s_18 - 20);
               class295_0.method5341("Cancel", i_5, s_18 + 5, 16777215, 0);
            } else {
               int i_8;
               if (class85.field1209 == 2) {
                  s_23 = 201;
                  class295_0.method5341(class85.field1210, class62.field585, s_23, 16776960, 0);
                  i_24 = s_23 + 15;
                  class295_0.method5341(class85.field1195, class62.field585, i_24, 16776960, 0);
                  i_24 += 15;
                  class295_0.method5341(class85.field1196, class62.field585, i_24, 16776960, 0);
                  i_24 += 15;
                  i_24 += 7;
                  class295_0.method5346("Login: ", class62.field585 - 110, i_24, 16777215, 0);
                  s_25 = 200;
                  string_6 = class17.field117.field1066 ? class183.method3612(class85.field1180, -231155257) : class85.field1180;

                  for (string_7 = string_6; class295_0.method5417(string_7) > s_25; string_7 = string_7.substring(1)) {
                     ;
                  }

                  class295_0.method5346(class296.method5362(string_7) + (class85.field1202 == 0 & Client.field881 % 40 < 20 ? class73.method1756(16776960, -844505624) + "|" : ""), class62.field585 - 70, i_24, 16777215, 0);
                  i_24 += 15;
                  class295_0.method5346("Password: " + class183.method3612(class85.field1198, -231155257) + (class85.field1202 == 1 & Client.field881 % 40 < 20 ? class73.method1756(16776960, -844505624) + "|" : ""), class62.field585 - 108, i_24, 16777215, 0);
                  i_24 += 15;
                  s_23 = 277;
                  i_8 = class62.field585 + -117;
                  boolean bool_10 = Client.field691;
                  boolean bool_11 = class85.field1199;
                  class324 class324_9 = bool_10 ? (bool_11 ? class85.field1185 : class112.field1466) : (bool_11 ? class64.field606 : class85.field1178);
                  class324_9.method6101(i_8, s_23);
                  i_8 = i_8 + class324_9.field3897 + 5;
                  class295_1.method5346("Remember username", i_8, s_23 + 13, 16776960, 0);
                  i_8 = class62.field585 + 24;
                  boolean bool_14 = class17.field117.field1066;
                  boolean bool_15 = class85.field1184;
                  class324 class324_13 = bool_14 ? (bool_15 ? class85.field1185 : class112.field1466) : (bool_15 ? class64.field606 : class85.field1178);
                  class324_13.method6101(i_8, s_23);
                  i_8 = i_8 + class324_13.field3897 + 5;
                  class295_1.method5346("Hide username", i_8, s_23 + 13, 16776960, 0);
                  i_24 = s_23 + 15;
                  int i_16 = class62.field585 - 80;
                  short s_17 = 321;
                  class240.field3207.method6101(i_16 - 73, s_17 - 20);
                  class295_0.method5341("Login", i_16, s_17 + 5, 16777215, 0);
                  i_16 = class62.field585 + 80;
                  class240.field3207.method6101(i_16 - 73, s_17 - 20);
                  class295_0.method5341("Cancel", i_16, s_17 + 5, 16777215, 0);
                  s_23 = 357;
                  switch(class85.field1212) {
                  case 2:
                     PriorityComparator.cachedValue = "Having trouble logging in?";
                     break;
                  default:
                     PriorityComparator.cachedValue = "Can\'t login? Click here.";
                  }

                  class96.field1325 = new class319(class62.field585, s_23, class295_1.method5417(PriorityComparator.cachedValue), 11);
                  class38.field332 = new class319(class62.field585, s_23, class295_1.method5417("Still having trouble logging in?"), 11);
                  class295_1.method5341(PriorityComparator.cachedValue, class62.field585, s_23, 16777215, 0);
               } else if (class85.field1209 == 3) {
                  s_23 = 201;
                  class295_0.method5341("Invalid credentials.", class85.field1187 + 180, s_23, 16776960, 0);
                  i_24 = s_23 + 20;
                  class295_1.method5341("For accounts created after 24th November 2010, please use your", class85.field1187 + 180, i_24, 16776960, 0);
                  i_24 += 15;
                  class295_1.method5341("email address to login. Otherwise please login with your username.", class85.field1187 + 180, i_24, 16776960, 0);
                  i_24 += 15;
                  i_5 = class85.field1187 + 180;
                  s_18 = 276;
                  class240.field3207.method6101(i_5 - 73, s_18 - 20);
                  class295_2.method5341("Try again", i_5, s_18 + 5, 16777215, 0);
                  i_5 = class85.field1187 + 180;
                  s_18 = 326;
                  class240.field3207.method6101(i_5 - 73, s_18 - 20);
                  class295_2.method5341("Forgotten password?", i_5, s_18 + 5, 16777215, 0);
               } else {
                  short s_21;
                  if (class85.field1209 == 4) {
                     class295_0.method5341("Authenticator", class85.field1187 + 180, 201, 16776960, 0);
                     s_23 = 236;
                     class295_0.method5341(class85.field1210, class85.field1187 + 180, s_23, 16777215, 0);
                     i_24 = s_23 + 15;
                     class295_0.method5341(class85.field1195, class85.field1187 + 180, i_24, 16777215, 0);
                     i_24 += 15;
                     class295_0.method5341(class85.field1196, class85.field1187 + 180, i_24, 16777215, 0);
                     i_24 += 15;
                     class295_0.method5346("PIN: " + class183.method3612(class36.field328, -231155257) + (Client.field881 % 40 < 20 ? class73.method1756(16776960, -844505624) + "|" : ""), class85.field1187 + 180 - 108, i_24, 16777215, 0);
                     i_24 -= 8;
                     class295_0.method5346("Trust this computer", class85.field1187 + 180 - 9, i_24, 16776960, 0);
                     i_24 += 15;
                     class295_0.method5346("for 30 days: ", class85.field1187 + 180 - 9, i_24, 16776960, 0);
                     i_5 = class85.field1187 + 180 - 9 + class295_0.method5417("for 30 days: ") + 15;
                     int i_27 = i_24 - class295_0.field3709;
                     class324 class324_26;
                     if (class85.field1201) {
                        class324_26 = class112.field1466;
                     } else {
                        class324_26 = class85.field1178;
                     }

                     class324_26.method6101(i_5, i_27);
                     i_24 += 15;
                     i_8 = class85.field1187 + 180 - 80;
                     s_21 = 321;
                     class240.field3207.method6101(i_8 - 73, s_21 - 20);
                     class295_0.method5341("Continue", i_8, s_21 + 5, 16777215, 0);
                     i_8 = class85.field1187 + 180 + 80;
                     class240.field3207.method6101(i_8 - 73, s_21 - 20);
                     class295_0.method5341("Cancel", i_8, s_21 + 5, 16777215, 0);
                     class295_1.method5341("<u=ff>Can\'t Log In?</u>", class85.field1187 + 180, s_21 + 36, 255, 0);
                  } else if (class85.field1209 == 5) {
                     class295_0.method5341("Forgotten your password?", class85.field1187 + 180, 201, 16776960, 0);
                     s_23 = 221;
                     class295_2.method5341(class85.field1210, class85.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     class295_2.method5341(class85.field1195, class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     class295_2.method5341(class85.field1196, class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_24 += 14;
                     class295_0.method5346("Username/email: ", class85.field1187 + 180 - 145, i_24, 16777215, 0);
                     s_25 = 174;
                     string_6 = class17.field117.field1066 ? class183.method3612(class85.field1180, -231155257) : class85.field1180;

                     for (string_7 = string_6; class295_0.method5417(string_7) > s_25; string_7 = string_7.substring(1)) {
                        ;
                     }

                     class295_0.method5346(class296.method5362(string_7) + (Client.field881 % 40 < 20 ? class73.method1756(16776960, -844505624) + "|" : ""), class85.field1187 + 180 - 34, i_24, 16777215, 0);
                     i_24 += 15;
                     i_8 = class85.field1187 + 180 - 80;
                     s_21 = 321;
                     class240.field3207.method6101(i_8 - 73, s_21 - 20);
                     class295_0.method5341("Recover", i_8, s_21 + 5, 16777215, 0);
                     i_8 = class85.field1187 + 180 + 80;
                     class240.field3207.method6101(i_8 - 73, s_21 - 20);
                     class295_0.method5341("Back", i_8, s_21 + 5, 16777215, 0);
                     s_21 = 356;
                     class295_1.method5341("Still having trouble logging in?", class62.field585, s_21, 268435455, 0);
                  } else if (class85.field1209 == 6) {
                     s_23 = 201;
                     class295_0.method5341(class85.field1210, class85.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     class295_0.method5341(class85.field1195, class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     class295_0.method5341(class85.field1196, class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_5 = class85.field1187 + 180;
                     s_18 = 321;
                     class240.field3207.method6101(i_5 - 73, s_18 - 20);
                     class295_0.method5341("Back", i_5, s_18 + 5, 16777215, 0);
                  } else if (class85.field1209 == 7) {
                     s_23 = 216;
                     class295_0.method5341("Your date of birth isn\'t set.", class85.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     class295_2.method5341("Please verify your account status by", class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     class295_2.method5341("setting your date of birth.", class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_5 = class85.field1187 + 180 - 80;
                     s_18 = 321;
                     class240.field3207.method6101(i_5 - 73, s_18 - 20);
                     class295_0.method5341("Set Date of Birth", i_5, s_18 + 5, 16777215, 0);
                     i_5 = class85.field1187 + 180 + 80;
                     class240.field3207.method6101(i_5 - 73, s_18 - 20);
                     class295_0.method5341("Back", i_5, s_18 + 5, 16777215, 0);
                  } else if (class85.field1209 == 8) {
                     s_23 = 216;
                     class295_0.method5341("Sorry, but your account is not eligible to play.", class85.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     class295_2.method5341("For more information, please take a look at", class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     class295_2.method5341("our privacy policy.", class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_5 = class85.field1187 + 180 - 80;
                     s_18 = 321;
                     class240.field3207.method6101(i_5 - 73, s_18 - 20);
                     class295_0.method5341("Privacy Policy", i_5, s_18 + 5, 16777215, 0);
                     i_5 = class85.field1187 + 180 + 80;
                     class240.field3207.method6101(i_5 - 73, s_18 - 20);
                     class295_0.method5341("Back", i_5, s_18 + 5, 16777215, 0);
                  } else if (class85.field1209 == 12) {
                     s_23 = 201;
                     String str_22 = "";
                     string_6 = "";
                     string_7 = "";
                     switch(class85.field1182) {
                     case 0:
                        str_22 = "Your account has been disabled.";
                        string_6 = class224.field2811;
                        string_7 = "";
                        break;
                     case 1:
                        str_22 = "Account locked as we suspect it has been stolen.";
                        string_6 = class224.field2961;
                        string_7 = "";
                        break;
                     default:
                        class137.method3266(false, -1010550076);
                     }

                     class295_0.method5341(str_22, class85.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     class295_2.method5341(string_6, class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     class295_2.method5341(string_7, class85.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_8 = class85.field1187 + 180;
                     s_21 = 276;
                     class240.field3207.method6101(i_8 - 73, s_21 - 20);
                     class295_0.method5341("Support Page", i_8, s_21 + 5, 16777215, 0);
                     i_8 = class85.field1187 + 180;
                     s_21 = 326;
                     class240.field3207.method6101(i_8 - 73, s_21 - 20);
                     class295_0.method5341("Back", i_8, s_21 + 5, 16777215, 0);
                  } else if (class85.field1209 == 24) {
                     s_23 = 221;
                     class295_0.method5341(class85.field1210, class85.field1187 + 180, s_23, 16777215, 0);
                     i_24 = s_23 + 15;
                     class295_0.method5341(class85.field1195, class85.field1187 + 180, i_24, 16777215, 0);
                     i_24 += 15;
                     class295_0.method5341(class85.field1196, class85.field1187 + 180, i_24, 16777215, 0);
                     i_24 += 15;
                     i_5 = class85.field1187 + 180;
                     s_18 = 301;
                     class240.field3207.method6101(i_5 - 73, s_18 - 20);
                     class295_0.method5341("Ok", i_5, s_18 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (Client.field662 >= 10) {
            int[] ints_19 = new int[4];
            class321.method5999(ints_19);
            class321.method5997(class85.field1208, 0, class85.field1208 + 765, class249.field3308);
            class278.field3631.method1735(class85.field1208 - 22, Client.field881, (byte) -86);
            class278.field3631.method1735(class85.field1208 + 22 + 765 - 128, Client.field881, (byte) -49);
            class321.method6013(ints_19);
         }

         class85.field1183[class17.field117.field1063 ? 1 : 0].method6101(class85.field1208 + 765 - 40, 463);
         if (Client.field662 > 5 && class56.field528 == class190.field2348) {
            if (class30.field264 != null) {
               i_24 = class85.field1208 + 5;
               s_25 = 463;
               byte b_28 = 100;
               byte b_20 = 35;
               class30.field264.method6101(i_24, s_25);
               class295_0.method5341("World" + " " + Client.field807, b_28 / 2 + i_24, b_20 / 2 + s_25 - 2, 16777215, 0);
               if (class71.field1027 != null) {
                  class295_1.method5341("Loading...", b_28 / 2 + i_24, b_20 / 2 + s_25 + 12, 16777215, 0);
               } else {
                  class295_1.method5341("Click to switch", b_28 / 2 + i_24, b_20 / 2 + s_25 + 12, 16777215, 0);
               }
            } else {
               class30.field264 = class215.method4021(Client.field683, "sl_button", "", -1167154349);
            }
         }

      }
   }

}
