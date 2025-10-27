public class BufferPoolConfig {

   public static byte[][][] customPools;

   static void drawLoginScreen(Font font_0, Font font_1, Font font_2) {
      Login.field1208 = (class7.clientWidth - 765) / 2;
      Login.field1187 = Login.field1208 + 202;
      MusicPatchPcmStream.field585 = Login.field1187 + 180;
      if (Login.field1205) {
         class188.method3643(font_0, font_1, (byte) 11);
      } else {
         class5.field23.method6121(Login.field1208, 0);
         NPC.field1135.method6121(Login.field1208 + 382, 0);
         class87.field1243.method6101(Login.field1208 + 382 - class87.field1243.field3897 / 2, 18);
         int i_5;
         if (Client.field662 == 0 || Client.field662 == 5) {
            byte b_4 = 20;
            font_0.method5341("RuneScape is loading - please wait...", Login.field1187 + 180, 245 - b_4, 16777215, -1);
            i_5 = 253 - b_4;
            Rasterizer2D.drawRectangle(Login.field1187 + 180 - 152, i_5, 304, 34, 9179409);
            Rasterizer2D.drawRectangle(Login.field1187 + 180 - 151, i_5 + 1, 302, 32, 0);
            Rasterizer2D.fillRectangle(Login.field1187 + 180 - 150, i_5 + 2, Login.field1188 * 3, 30, 9179409);
            Rasterizer2D.fillRectangle(Login.field1188 * 3 + (Login.field1187 + 180 - 150), i_5 + 2, 300 - Login.field1188 * 3, 30, 0);
            font_0.method5341(Login.field1189, Login.field1187 + 180, 276 - b_4, 16777215, -1);
         }

         String string_6;
         String string_7;
         short s_23;
         int i_24;
         short s_25;
         if (Client.field662 == 20) {
            Login.field1194.method6101(Login.field1187 + 180 - Login.field1194.field3897 / 2, 271 - Login.field1194.field3893 / 2);
            s_23 = 201;
            font_0.method5341(Login.Login_response1, Login.field1187 + 180, s_23, 16776960, 0);
            i_24 = s_23 + 15;
            font_0.method5341(Login.Login_response2, Login.field1187 + 180, i_24, 16776960, 0);
            i_24 += 15;
            font_0.method5341(Login.Login_response3, Login.field1187 + 180, i_24, 16776960, 0);
            i_24 += 15;
            i_24 += 7;
            if (Login.loginIndex != 4) {
               font_0.draw("Login: ", Login.field1187 + 180 - 110, i_24, 16777215, 0);
               s_25 = 200;
               string_6 = class17.field117.field1066 ? ClientPacketProt.method3612(Login.localUsername) : Login.localUsername;

               for (string_7 = string_6; font_0.method5417(string_7) > s_25; string_7 = string_7.substring(0, string_7.length() - 1)) {
                  ;
               }

               font_0.draw(AbstractFont.escapeBrackets(string_7), Login.field1187 + 180 - 70, i_24, 16777215, 0);
               i_24 += 15;
               font_0.draw("Password: " + ClientPacketProt.method3612(Login.Login_password), Login.field1187 + 180 - 108, i_24, 16777215, 0);
               i_24 += 15;
            }
         }

         if (Client.field662 == 10 || Client.field662 == 11) {
            Login.field1194.method6101(Login.field1187, 171);
            short s_18;
            if (Login.loginIndex == 0) {
               s_23 = 251;
               font_0.method5341("Welcome to RuneScape", Login.field1187 + 180, s_23, 16776960, 0);
               i_24 = s_23 + 30;
               i_5 = Login.field1187 + 180 - 80;
               s_18 = 291;
               ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
               font_0.method5350("New User", i_5 - 73, s_18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               i_5 = Login.field1187 + 180 + 80;
               ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
               font_0.method5350("Existing User", i_5 - 73, s_18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (Login.loginIndex == 1) {
               font_0.method5341(Login.field1197, Login.field1187 + 180, 201, 16776960, 0);
               s_23 = 236;
               font_0.method5341(Login.Login_response1, Login.field1187 + 180, s_23, 16777215, 0);
               i_24 = s_23 + 15;
               font_0.method5341(Login.Login_response2, Login.field1187 + 180, i_24, 16777215, 0);
               i_24 += 15;
               font_0.method5341(Login.Login_response3, Login.field1187 + 180, i_24, 16777215, 0);
               i_24 += 15;
               i_5 = Login.field1187 + 180 - 80;
               s_18 = 321;
               ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
               font_0.method5341("Continue", i_5, s_18 + 5, 16777215, 0);
               i_5 = Login.field1187 + 180 + 80;
               ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
               font_0.method5341("Cancel", i_5, s_18 + 5, 16777215, 0);
            } else {
               int i_8;
               if (Login.loginIndex == 2) {
                  s_23 = 201;
                  font_0.method5341(Login.Login_response1, MusicPatchPcmStream.field585, s_23, 16776960, 0);
                  i_24 = s_23 + 15;
                  font_0.method5341(Login.Login_response2, MusicPatchPcmStream.field585, i_24, 16776960, 0);
                  i_24 += 15;
                  font_0.method5341(Login.Login_response3, MusicPatchPcmStream.field585, i_24, 16776960, 0);
                  i_24 += 15;
                  i_24 += 7;
                  font_0.draw("Login: ", MusicPatchPcmStream.field585 - 110, i_24, 16777215, 0);
                  s_25 = 200;
                  string_6 = class17.field117.field1066 ? ClientPacketProt.method3612(Login.localUsername) : Login.localUsername;

                  for (string_7 = string_6; font_0.method5417(string_7) > s_25; string_7 = string_7.substring(1)) {
                     ;
                  }

                  font_0.draw(AbstractFont.escapeBrackets(string_7) + (Login.field1202 == 0 & Client.cycle % 40 < 20 ? class73.colorStartTag(16776960) + "|" : ""), MusicPatchPcmStream.field585 - 70, i_24, 16777215, 0);
                  i_24 += 15;
                  font_0.draw("Password: " + ClientPacketProt.method3612(Login.Login_password) + (Login.field1202 == 1 & Client.cycle % 40 < 20 ? class73.colorStartTag(16776960) + "|" : ""), MusicPatchPcmStream.field585 - 108, i_24, 16777215, 0);
                  i_24 += 15;
                  s_23 = 277;
                  i_8 = MusicPatchPcmStream.field585 + -117;
                  boolean bool_10 = Client.field691;
                  boolean bool_11 = Login.field1199;
                  class324 class324_9 = bool_10 ? (bool_11 ? Login.field1185 : class112.field1466) : (bool_11 ? Message.field606 : Login.field1178);
                  class324_9.method6101(i_8, s_23);
                  i_8 = i_8 + class324_9.field3897 + 5;
                  font_1.draw("Remember username", i_8, s_23 + 13, 16776960, 0);
                  i_8 = MusicPatchPcmStream.field585 + 24;
                  boolean bool_14 = class17.field117.field1066;
                  boolean bool_15 = Login.field1184;
                  class324 class324_13 = bool_14 ? (bool_15 ? Login.field1185 : class112.field1466) : (bool_15 ? Message.field606 : Login.field1178);
                  class324_13.method6101(i_8, s_23);
                  i_8 = i_8 + class324_13.field3897 + 5;
                  font_1.draw("Hide username", i_8, s_23 + 13, 16776960, 0);
                  int i_16 = MusicPatchPcmStream.field585 - 80;
                  short s_17 = 321;
                  ClanEntry.field3207.method6101(i_16 - 73, s_17 - 20);
                  font_0.method5341("Login", i_16, s_17 + 5, 16777215, 0);
                  i_16 = MusicPatchPcmStream.field585 + 80;
                  ClanEntry.field3207.method6101(i_16 - 73, s_17 - 20);
                  font_0.method5341("Cancel", i_16, s_17 + 5, 16777215, 0);
                  s_23 = 357;

                  if (Login.field1212 == 2) {
                     PriorityComparator.cachedValue = "Having trouble logging in?";
                  } else {
                     PriorityComparator.cachedValue = "Can\'t login? Click here.";
                  }

                  class96.field1325 = new class319(MusicPatchPcmStream.field585, s_23, font_1.method5417(PriorityComparator.cachedValue), 11);
                  class38.field332 = new class319(MusicPatchPcmStream.field585, s_23, font_1.method5417("Still having trouble logging in?"), 11);
                  font_1.method5341(PriorityComparator.cachedValue, MusicPatchPcmStream.field585, s_23, 16777215, 0);
               } else if (Login.loginIndex == 3) {
                  s_23 = 201;
                  font_0.method5341("Invalid credentials.", Login.field1187 + 180, s_23, 16776960, 0);
                  i_24 = s_23 + 20;
                  font_1.method5341("For accounts created after 24th November 2010, please use your", Login.field1187 + 180, i_24, 16776960, 0);
                  i_24 += 15;
                  font_1.method5341("email address to login. Otherwise please login with your username.", Login.field1187 + 180, i_24, 16776960, 0);
                  i_24 += 15;
                  i_5 = Login.field1187 + 180;
                  s_18 = 276;
                  ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
                  font_2.method5341("Try again", i_5, s_18 + 5, 16777215, 0);
                  i_5 = Login.field1187 + 180;
                  s_18 = 326;
                  ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
                  font_2.method5341("Forgotten password?", i_5, s_18 + 5, 16777215, 0);
               } else {
                  short s_21;
                  if (Login.loginIndex == 4) {
                     font_0.method5341("Authenticator", Login.field1187 + 180, 201, 16776960, 0);
                     s_23 = 236;
                     font_0.method5341(Login.Login_response1, Login.field1187 + 180, s_23, 16777215, 0);
                     i_24 = s_23 + 15;
                     font_0.method5341(Login.Login_response2, Login.field1187 + 180, i_24, 16777215, 0);
                     i_24 += 15;
                     font_0.method5341(Login.Login_response3, Login.field1187 + 180, i_24, 16777215, 0);
                     i_24 += 15;
                     font_0.draw("PIN: " + ClientPacketProt.method3612(class36.field328) + (Client.cycle % 40 < 20 ? class73.colorStartTag(16776960) + "|" : ""), Login.field1187 + 180 - 108, i_24, 16777215, 0);
                     i_24 -= 8;
                     font_0.draw("Trust this computer", Login.field1187 + 180 - 9, i_24, 16776960, 0);
                     i_24 += 15;
                     font_0.draw("for 30 days: ", Login.field1187 + 180 - 9, i_24, 16776960, 0);
                     i_5 = Login.field1187 + 180 - 9 + font_0.method5417("for 30 days: ") + 15;
                     int i_27 = i_24 - font_0.field3709;
                     class324 class324_26;
                     if (Login.field1201) {
                        class324_26 = class112.field1466;
                     } else {
                        class324_26 = Login.field1178;
                     }

                     class324_26.method6101(i_5, i_27);
                     i_24 += 15;
                     i_8 = Login.field1187 + 180 - 80;
                     s_21 = 321;
                     ClanEntry.field3207.method6101(i_8 - 73, s_21 - 20);
                     font_0.method5341("Continue", i_8, s_21 + 5, 16777215, 0);
                     i_8 = Login.field1187 + 180 + 80;
                     ClanEntry.field3207.method6101(i_8 - 73, s_21 - 20);
                     font_0.method5341("Cancel", i_8, s_21 + 5, 16777215, 0);
                     font_1.method5341("<u=ff>Can\'t Log In?</u>", Login.field1187 + 180, s_21 + 36, 255, 0);
                  } else if (Login.loginIndex == 5) {
                     font_0.method5341("Forgotten your password?", Login.field1187 + 180, 201, 16776960, 0);
                     s_23 = 221;
                     font_2.method5341(Login.Login_response1, Login.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     font_2.method5341(Login.Login_response2, Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     font_2.method5341(Login.Login_response3, Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_24 += 14;
                     font_0.draw("Username/email: ", Login.field1187 + 180 - 145, i_24, 16777215, 0);
                     s_25 = 174;
                     string_6 = class17.field117.field1066 ? ClientPacketProt.method3612(Login.localUsername) : Login.localUsername;

                     for (string_7 = string_6; font_0.method5417(string_7) > s_25; string_7 = string_7.substring(1)) {
                        ;
                     }

                     font_0.draw(AbstractFont.escapeBrackets(string_7) + (Client.cycle % 40 < 20 ? class73.colorStartTag(16776960) + "|" : ""), Login.field1187 + 180 - 34, i_24, 16777215, 0);
                     i_24 += 15;
                     i_8 = Login.field1187 + 180 - 80;
                     s_21 = 321;
                     ClanEntry.field3207.method6101(i_8 - 73, s_21 - 20);
                     font_0.method5341("Recover", i_8, s_21 + 5, 16777215, 0);
                     i_8 = Login.field1187 + 180 + 80;
                     ClanEntry.field3207.method6101(i_8 - 73, s_21 - 20);
                     font_0.method5341("Back", i_8, s_21 + 5, 16777215, 0);
                     s_21 = 356;
                     font_1.method5341("Still having trouble logging in?", MusicPatchPcmStream.field585, s_21, 268435455, 0);
                  } else if (Login.loginIndex == 6) {
                     s_23 = 201;
                     font_0.method5341(Login.Login_response1, Login.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     font_0.method5341(Login.Login_response2, Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     font_0.method5341(Login.Login_response3, Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_5 = Login.field1187 + 180;
                     s_18 = 321;
                     ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
                     font_0.method5341("Back", i_5, s_18 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 7) {
                     s_23 = 216;
                     font_0.method5341("Your date of birth isn\'t set.", Login.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     font_2.method5341("Please verify your account status by", Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     font_2.method5341("setting your date of birth.", Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_5 = Login.field1187 + 180 - 80;
                     s_18 = 321;
                     ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
                     font_0.method5341("Set Date of Birth", i_5, s_18 + 5, 16777215, 0);
                     i_5 = Login.field1187 + 180 + 80;
                     ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
                     font_0.method5341("Back", i_5, s_18 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 8) {
                     s_23 = 216;
                     font_0.method5341("Sorry, but your account is not eligible to play.", Login.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     font_2.method5341("For more information, please take a look at", Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     font_2.method5341("our privacy policy.", Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_5 = Login.field1187 + 180 - 80;
                     s_18 = 321;
                     ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
                     font_0.method5341("Privacy Policy", i_5, s_18 + 5, 16777215, 0);
                     i_5 = Login.field1187 + 180 + 80;
                     ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
                     font_0.method5341("Back", i_5, s_18 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 12) {
                     s_23 = 201;
                     String str_22 = "";
                     string_6 = "";
                     string_7 = "";
                     switch(Login.field1182) {
                     case 0:
                        str_22 = "Your account has been disabled.";
                        string_6 = Widget2.assist_message_1;
                        string_7 = "";
                        break;
                     case 1:
                        str_22 = "Account locked as we suspect it has been stolen.";
                        string_6 = Widget2.assist_message_2;
                        string_7 = "";
                        break;
                     default:
                        class137.method3266(false);
                     }

                     font_0.method5341(str_22, Login.field1187 + 180, s_23, 16776960, 0);
                     i_24 = s_23 + 15;
                     font_2.method5341(string_6, Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     font_2.method5341(string_7, Login.field1187 + 180, i_24, 16776960, 0);
                     i_24 += 15;
                     i_8 = Login.field1187 + 180;
                     s_21 = 276;
                     ClanEntry.field3207.method6101(i_8 - 73, s_21 - 20);
                     font_0.method5341("Support Page", i_8, s_21 + 5, 16777215, 0);
                     i_8 = Login.field1187 + 180;
                     s_21 = 326;
                     ClanEntry.field3207.method6101(i_8 - 73, s_21 - 20);
                     font_0.method5341("Back", i_8, s_21 + 5, 16777215, 0);
                  } else if (Login.loginIndex == 24) {
                     s_23 = 221;
                     font_0.method5341(Login.Login_response1, Login.field1187 + 180, s_23, 16777215, 0);
                     i_24 = s_23 + 15;
                     font_0.method5341(Login.Login_response2, Login.field1187 + 180, i_24, 16777215, 0);
                     i_24 += 15;
                     font_0.method5341(Login.Login_response3, Login.field1187 + 180, i_24, 16777215, 0);
                     i_24 += 15;
                     i_5 = Login.field1187 + 180;
                     s_18 = 301;
                     ClanEntry.field3207.method6101(i_5 - 73, s_18 - 20);
                     font_0.method5341("Ok", i_5, s_18 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (Client.field662 >= 10) {
            int[] ints_19 = new int[4];
            Rasterizer2D.getClipArray(ints_19);
            Rasterizer2D.setClip(Login.field1208, 0, Login.field1208 + 765, ParamComposition.clientHeight);
            class278.field3631.method1735(Login.field1208 - 22, Client.cycle);
            class278.field3631.method1735(Login.field1208 + 22 + 765 - 128, Client.cycle);
            Rasterizer2D.method6013(ints_19);
         }

         Login.field1183[class17.field117.field1063 ? 1 : 0].method6101(Login.field1208 + 765 - 40, 463);
         if (Client.field662 > 5 && class56.field528 == class190.field2348) {
            if (class30.field264 != null) {
               i_24 = Login.field1208 + 5;
               s_25 = 463;
               byte b_28 = 100;
               byte b_20 = 35;
               class30.field264.method6101(i_24, s_25);
               font_0.method5341("World" + " " + Client.field807, b_28 / 2 + i_24, b_20 / 2 + s_25 - 2, 16777215, 0);
               if (World.field1027 != null) {
                  font_1.method5341("Loading...", b_28 / 2 + i_24, b_20 / 2 + s_25 + 12, 16777215, 0);
               } else {
                  font_1.method5341("Click to switch", b_28 / 2 + i_24, b_20 / 2 + s_25 + 12, 16777215, 0);
               }
            } else {
               class30.field264 = SoundSystem.method4021(Client.field683, "sl_button", "");
            }
         }

      }
   }

}
