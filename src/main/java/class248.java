public class class248 extends DualNode {

   public static class233 field3298;
   static int[] field3299;
   public static class145 field3294 = new class145(64);
   public int field3296;
   public int field3297;
   public int field3295;

   static void method4484() {
      int i_4;
      int i_16;
      if (Login.field1205) {
         while (true) {
            if (!class218.method4109()) {
               if (MouseHandler.field493 != 1 && (class46.field413 || MouseHandler.field493 != 4)) {
                  break;
               }

               int i_2 = Login.field1208 + 280;
               if (MouseHandler.field483 >= i_2 && MouseHandler.field483 <= i_2 + 14 && MouseHandler.field495 >= 4 && MouseHandler.field495 <= 18) {
                  class192.method3676(0, 0);
                  break;
               }

               if (MouseHandler.field483 >= i_2 + 15 && MouseHandler.field483 <= i_2 + 80 && MouseHandler.field495 >= 4 && MouseHandler.field495 <= 18) {
                  class192.method3676(0, 1);
                  break;
               }

               int i_3 = Login.field1208 + 390;
               if (MouseHandler.field483 >= i_3 && MouseHandler.field483 <= i_3 + 14 && MouseHandler.field495 >= 4 && MouseHandler.field495 <= 18) {
                  class192.method3676(1, 0);
                  break;
               }

               if (MouseHandler.field483 >= i_3 + 15 && MouseHandler.field483 <= i_3 + 80 && MouseHandler.field495 >= 4 && MouseHandler.field495 <= 18) {
                  class192.method3676(1, 1);
                  break;
               }

               i_4 = Login.field1208 + 500;
               if (MouseHandler.field483 >= i_4 && MouseHandler.field483 <= i_4 + 14 && MouseHandler.field495 >= 4 && MouseHandler.field495 <= 18) {
                  class192.method3676(2, 0);
                  break;
               }

               if (MouseHandler.field483 >= i_4 + 15 && MouseHandler.field483 <= i_4 + 80 && MouseHandler.field495 >= 4 && MouseHandler.field495 <= 18) {
                  class192.method3676(2, 1);
                  break;
               }

               i_16 = Login.field1208 + 610;
               if (MouseHandler.field483 >= i_16 && MouseHandler.field483 <= i_16 + 14 && MouseHandler.field495 >= 4 && MouseHandler.field495 <= 18) {
                  class192.method3676(3, 0);
                  break;
               }

               if (MouseHandler.field483 >= i_16 + 15 && MouseHandler.field483 <= i_16 + 80 && MouseHandler.field495 >= 4 && MouseHandler.field495 <= 18) {
                  class192.method3676(3, 1);
                  break;
               }

               if (MouseHandler.field483 >= Login.field1208 + 708 && MouseHandler.field495 >= 4 && MouseHandler.field483 <= Login.field1208 + 708 + 50 && MouseHandler.field495 <= 20) {
                  Login.field1205 = false;
                  class5.field23.method6121(Login.field1208, 0);
                  NPC.field1135.method6121(Login.field1208 + 382, 0);
                  class87.field1243.method6101(Login.field1208 + 382 - class87.field1243.field3897 / 2, 18);
                  break;
               }

               if (Login.field1207 != -1) {
                  World world_14 = World.field1031[Login.field1207];
                  class202.changeWorld(world_14);
                  Login.field1205 = false;
                  class5.field23.method6121(Login.field1208, 0);
                  NPC.field1135.method6121(Login.field1208 + 382, 0);
                  class87.field1243.method6101(Login.field1208 + 382 - class87.field1243.field3897 / 2, 18);
               } else {
                  if (Login.field1190 > 0 && Login.field1206 != null && MouseHandler.field483 >= 0 && MouseHandler.field483 <= Login.field1206.field3897 && MouseHandler.field495 >= ParamComposition.field3308 / 2 - 50 && MouseHandler.field495 <= ParamComposition.field3308 / 2 + 50) {
                     --Login.field1190;
                  }

                  if (Login.field1190 < Login.field1186 && NPCDefinition.field3490 != null && MouseHandler.field483 >= class7.field46 - NPCDefinition.field3490.field3897 - 5 && MouseHandler.field483 <= class7.field46 && MouseHandler.field495 >= ParamComposition.field3308 / 2 - 50 && MouseHandler.field495 <= ParamComposition.field3308 / 2 + 50) {
                     ++Login.field1190;
                  }
               }
               break;
            }

            if (class97.field1338 == 13) {
               Login.field1205 = false;
               class5.field23.method6121(Login.field1208, 0);
               NPC.field1135.method6121(Login.field1208 + 382, 0);
               class87.field1243.method6101(Login.field1208 + 382 - class87.field1243.field3897 / 2, 18);
               break;
            }

            if (class97.field1338 == 96) {
               if (Login.field1190 > 0 && Login.field1206 != null) {
                  --Login.field1190;
               }
            } else if (class97.field1338 == 97 && Login.field1190 < Login.field1186 && NPCDefinition.field3490 != null) {
               ++Login.field1190;
            }
         }

      } else {
         if ((MouseHandler.field493 == 1 || !class46.field413 && MouseHandler.field493 == 4) && MouseHandler.field483 >= Login.field1208 + 765 - 50 && MouseHandler.field495 >= 453) {
            class17.field117.field1063 = !class17.field117.field1063;
            class97.method2268();
            if (!class17.field117.field1063) {
               class119.method2761(class29.field253, "scape main", "", 255, false, (byte) -92);
            } else {
               class171.method3553();
            }
         }

         if (Client.field662 != 5) {
            if (Login.field1193 == -1L) {
               Login.field1193 = TimeUtils.getAdjustedTimeMillis() + 1000L;
            }

            long long_12 = TimeUtils.getAdjustedTimeMillis();
            if (class190.method3667() && Login.field1211 == -1L) {
               Login.field1211 = long_12;
               if (Login.field1211 > Login.field1193) {
                  Login.field1193 = Login.field1211;
               }
            }

            if (Client.field662 == 10 || Client.field662 == 11) {
               if (class190.field2348 == class56.field528) {
                  if (MouseHandler.field493 == 1 || !class46.field413 && MouseHandler.field493 == 4) {
                     i_4 = Login.field1208 + 5;
                     short s_5 = 463;
                     byte b_6 = 100;
                     byte b_7 = 35;
                     if (MouseHandler.field483 >= i_4 && MouseHandler.field483 <= i_4 + b_6 && MouseHandler.field495 >= s_5 && MouseHandler.field495 <= b_7 + s_5) {
                        UserComparator10.method2214();
                        return;
                     }
                  }

                  if (World.field1027 != null) {
                     UserComparator10.method2214();
                  }
               }

               i_4 = MouseHandler.field493;
               i_16 = MouseHandler.field483;
               int i_17 = MouseHandler.field495;
               if (i_4 == 0) {
                  i_16 = MouseHandler.MouseHandler_x;
                  i_17 = MouseHandler.MouseHandler_y;
               }

               if (!class46.field413 && i_4 == 4) {
                  i_4 = 1;
               }

               int i_8;
               short s_9;
               if (Login.loginIndex == 0) {
                  boolean bool_18 = false;

                  while (class218.method4109()) {
                     if (class97.field1338 == 84) {
                        bool_18 = true;
                     }
                  }

                  i_8 = class62.field585 - 80;
                  s_9 = 291;
                  if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                     class5.method50(class190.someConnectionType("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  i_8 = class62.field585 + 80;
                  if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20 || bool_18) {
                     if ((Client.field653 & 0x2000000) != 0) {
                        Login.field1197 = "";
                        Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        Login.Login_response2 = "Your normal account will not be affected.";
                        Login.Login_response3 = "";
                        Login.loginIndex = 1;
                        if (Client.field691 && Login.field1180 != null && Login.field1180.length() > 0) {
                           Login.field1202 = 1;
                        } else {
                           Login.field1202 = 0;
                        }
                     } else if ((Client.field653 & 0x4) != 0) {
                        if ((Client.field653 & 0x400) != 0) {
                           Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           Login.Login_response2 = "Players can attack each other almost everywhere";
                           Login.Login_response3 = "and the Protect Item prayer won\'t work.";
                        } else {
                           Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           Login.Login_response2 = "Players can attack each other";
                           Login.Login_response3 = "almost everywhere.";
                        }

                        Login.field1197 = "Warning!";
                        Login.loginIndex = 1;
                        if (Client.field691 && Login.field1180 != null && Login.field1180.length() > 0) {
                           Login.field1202 = 1;
                        } else {
                           Login.field1202 = 0;
                        }
                     } else if ((Client.field653 & 0x400) != 0) {
                        Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        Login.Login_response2 = "The Protect Item prayer will";
                        Login.Login_response3 = "not work on this world.";
                        Login.field1197 = "Warning!";
                        Login.loginIndex = 1;
                        if (Client.field691 && Login.field1180 != null && Login.field1180.length() > 0) {
                           Login.field1202 = 1;
                        } else {
                           Login.field1202 = 0;
                        }
                     } else {
                        class137.method3266(false);
                     }
                  }
               } else {
                  int i_19;
                  short s_21;
                  if (Login.loginIndex != 1) {
                     boolean bool_10;
                     int i_11;
                     short s_20;
                     if (Login.loginIndex == 2) {
                        s_20 = 201;
                        i_19 = s_20 + 52;
                        if (i_4 == 1 && i_17 >= i_19 - 12 && i_17 < i_19 + 2) {
                           Login.field1202 = 0;
                        }

                        i_19 += 15;
                        if (i_4 == 1 && i_17 >= i_19 - 12 && i_17 < i_19 + 2) {
                           Login.field1202 = 1;
                        }

                        i_19 += 15;
                        s_20 = 361;
                        if (class96.field1325 != null) {
                           i_8 = class96.field1325.field3865 / 2;
                           if (i_4 == 1 && i_16 >= class96.field1325.field3863 - i_8 && i_16 <= i_8 + class96.field1325.field3863 && i_17 >= s_20 - 15 && i_17 < s_20) {
                              switch(Login.field1212) {
                              case 1:
                                 class268.loginResponseMessages("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                 Login.loginIndex = 5;
                                 return;
                              case 2:
                                 class5.method50("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        i_8 = class62.field585 - 80;
                        s_9 = 321;
                        if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                           Login.field1180 = Login.field1180.trim();
                           if (Login.field1180.length() == 0) {
                              class268.loginResponseMessages("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (Login.Login_password.length() == 0) {
                              class268.loginResponseMessages("", "Please enter your password.", "");
                              return;
                           }

                           class268.loginResponseMessages("", "Connecting to server...", "");
                           class9.method99(false);
                           class96.updateGameState(20);
                           return;
                        }

                        i_8 = Login.field1187 + 180 + 80;
                        if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                           Login.loginIndex = 0;
                           Login.field1180 = "";
                           Login.Login_password = "";
                           class9.field65 = 0;
                           class36.field328 = "";
                           Login.field1201 = true;
                        }

                        i_8 = class62.field585 + -117;
                        s_9 = 277;
                        Login.field1199 = i_16 >= i_8 && i_16 < i_8 + class237.field3191 && i_17 >= s_9 && i_17 < s_9 + class25.field212;
                        if (i_4 == 1 && Login.field1199) {
                           Client.field691 = !Client.field691;
                           if (!Client.field691 && class17.field117.field1065 != null) {
                              class17.field117.field1065 = null;
                              class97.method2268();
                           }
                        }

                        i_8 = class62.field585 + 24;
                        s_9 = 277;
                        Login.field1184 = i_16 >= i_8 && i_16 < i_8 + class237.field3191 && i_17 >= s_9 && i_17 < s_9 + class25.field212;
                        if (i_4 == 1 && Login.field1184) {
                           class17.field117.field1066 = !class17.field117.field1066;
                           if (!class17.field117.field1066) {
                              Login.field1180 = "";
                              class17.field117.field1065 = null;
                              if (Client.field691 && Login.field1180 != null && Login.field1180.length() > 0) {
                                 Login.field1202 = 1;
                              } else {
                                 Login.field1202 = 0;
                              }
                           }

                           class97.method2268();
                        }

                        while (true) {
                           while (class218.method4109()) {
                              bool_10 = false;

                              for (i_11 = 0; i_11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); i_11++) {
                                 if (class207.field2508 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(i_11)) {
                                    bool_10 = true;
                                    break;
                                 }
                              }

                              if (class97.field1338 == 13) {
                                 Login.loginIndex = 0;
                                 Login.field1180 = "";
                                 Login.Login_password = "";
                                 class9.field65 = 0;
                                 class36.field328 = "";
                                 Login.field1201 = true;
                              } else if (Login.field1202 == 0) {
                                 if (class97.field1338 == 85 && Login.field1180.length() > 0) {
                                    Login.field1180 = Login.field1180.substring(0, Login.field1180.length() - 1);
                                 }

                                 if (class97.field1338 == 84 || class97.field1338 == 80) {
                                    Login.field1202 = 1;
                                 }

                                 if (bool_10 && Login.field1180.length() < 320) {
                                    Login.field1180 = Login.field1180 + class207.field2508;
                                 }
                              } else if (Login.field1202 == 1) {
                                 if (class97.field1338 == 85 && Login.Login_password.length() > 0) {
                                    Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                                 }

                                 if (class97.field1338 == 84 || class97.field1338 == 80) {
                                    Login.field1202 = 0;
                                 }

                                 if (class97.field1338 == 84) {
                                    Login.field1180 = Login.field1180.trim();
                                    if (Login.field1180.length() == 0) {
                                       class268.loginResponseMessages("", "Please enter your username/email address.", "");
                                       return;
                                    }

                                    if (Login.Login_password.length() == 0) {
                                       class268.loginResponseMessages("", "Please enter your password.", "");
                                       return;
                                    }

                                    class268.loginResponseMessages("", "Connecting to server...", "");
                                    class9.method99(false);
                                    class96.updateGameState(20);
                                    return;
                                 }

                                 if (bool_10 && Login.Login_password.length() < 20) {
                                    Login.Login_password = Login.Login_password + class207.field2508;
                                 }
                              }
                           }

                           return;
                        }
                     } else if (Login.loginIndex == 3) {
                        i_19 = Login.field1187 + 180;
                        s_21 = 276;
                        if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                           class137.method3266(false);
                        }

                        i_19 = Login.field1187 + 180;
                        s_21 = 326;
                        if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                           class268.loginResponseMessages("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           Login.loginIndex = 5;
                           return;
                        }
                     } else {
                        int i_23;
                        if (Login.loginIndex == 4) {
                           i_19 = Login.field1187 + 180 - 80;
                           s_21 = 321;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class36.field328.trim();
                              if (class36.field328.length() != 6) {
                                 class268.loginResponseMessages("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              class9.field65 = Integer.parseInt(class36.field328);
                              class36.field328 = "";
                              class9.method99(true);
                              class268.loginResponseMessages("", "Connecting to server...", "");
                              class96.updateGameState(20);
                              return;
                           }

                           if (i_4 == 1 && i_16 >= Login.field1187 + 180 - 9 && i_16 <= Login.field1187 + 180 + 130 && i_17 >= 263 && i_17 <= 296) {
                              Login.field1201 = !Login.field1201;
                           }

                           if (i_4 == 1 && i_16 >= Login.field1187 + 180 - 34 && i_16 <= Login.field1187 + 34 + 180 && i_17 >= 351 && i_17 <= 363) {
                              class5.method50(class190.someConnectionType("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           i_19 = Login.field1187 + 180 + 80;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              Login.loginIndex = 0;
                              Login.field1180 = "";
                              Login.Login_password = "";
                              class9.field65 = 0;
                              class36.field328 = "";
                           }

                           while (class218.method4109()) {
                              boolean bool_22 = false;

                              for (i_23 = 0; i_23 < "1234567890".length(); i_23++) {
                                 if (class207.field2508 == "1234567890".charAt(i_23)) {
                                    bool_22 = true;
                                    break;
                                 }
                              }

                              if (class97.field1338 == 13) {
                                 Login.loginIndex = 0;
                                 Login.field1180 = "";
                                 Login.Login_password = "";
                                 class9.field65 = 0;
                                 class36.field328 = "";
                              } else {
                                 if (class97.field1338 == 85 && class36.field328.length() > 0) {
                                    class36.field328 = class36.field328.substring(0, class36.field328.length() - 1);
                                 }

                                 if (class97.field1338 == 84) {
                                    class36.field328.trim();
                                    if (class36.field328.length() != 6) {
                                       class268.loginResponseMessages("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    class9.field65 = Integer.parseInt(class36.field328);
                                    class36.field328 = "";
                                    class9.method99(true);
                                    class268.loginResponseMessages("", "Connecting to server...", "");
                                    class96.updateGameState(20);
                                    return;
                                 }

                                 if (bool_22 && class36.field328.length() < 6) {
                                    class36.field328 = class36.field328 + class207.field2508;
                                 }
                              }
                           }
                        } else if (Login.loginIndex == 5) {
                           i_19 = Login.field1187 + 180 - 80;
                           s_21 = 321;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class154.method3406((short) 8742);
                              return;
                           }

                           i_19 = Login.field1187 + 180 + 80;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class137.method3266(true);
                           }

                           s_9 = 361;
                           if (class38.field332 != null) {
                              i_23 = class38.field332.field3865 / 2;
                              if (i_4 == 1 && i_16 >= class38.field332.field3863 - i_23 && i_16 <= i_23 + class38.field332.field3863 && i_17 >= s_9 - 15 && i_17 < s_9) {
                                 class5.method50(class190.someConnectionType("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                              }
                           }

                           while (class218.method4109()) {
                              bool_10 = false;

                              for (i_11 = 0; i_11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); i_11++) {
                                 if (class207.field2508 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(i_11)) {
                                    bool_10 = true;
                                    break;
                                 }
                              }

                              if (class97.field1338 == 13) {
                                 class137.method3266(true);
                              } else {
                                 if (class97.field1338 == 85 && Login.field1180.length() > 0) {
                                    Login.field1180 = Login.field1180.substring(0, Login.field1180.length() - 1);
                                 }

                                 if (class97.field1338 == 84) {
                                    class154.method3406((short) 16089);
                                    return;
                                 }

                                 if (bool_10 && Login.field1180.length() < 320) {
                                    Login.field1180 = Login.field1180 + class207.field2508;
                                 }
                              }
                           }
                        } else if (Login.loginIndex == 6) {
                           while (true) {
                              do {
                                 if (!class218.method4109()) {
                                    s_20 = 321;
                                    if (i_4 == 1 && i_17 >= s_20 - 20 && i_17 <= s_20 + 20) {
                                       class137.method3266(true);
                                    }

                                    return;
                                 }
                              } while (class97.field1338 != 84 && class97.field1338 != 13);

                              class137.method3266(true);
                           }
                        } else if (Login.loginIndex == 7) {
                           i_19 = Login.field1187 + 180 - 80;
                           s_21 = 321;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class5.method50(class190.someConnectionType("secure", true) + "m=dob/set_dob.ws", true, false);
                              class268.loginResponseMessages("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              Login.loginIndex = 6;
                              return;
                           }

                           i_19 = Login.field1187 + 180 + 80;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class137.method3266(true);
                           }
                        } else if (Login.loginIndex == 8) {
                           i_19 = Login.field1187 + 180 - 80;
                           s_21 = 321;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class5.method50("https://www.jagex.com/terms/privacy/#eight", true, false);
                              class268.loginResponseMessages("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              Login.loginIndex = 6;
                              return;
                           }

                           i_19 = Login.field1187 + 180 + 80;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class137.method3266(true);
                           }
                        } else if (Login.loginIndex == 12) {
                           String str_15 = "";
                           switch(Login.field1182) {
                           case 0:
                              str_15 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                              break;
                           case 1:
                              str_15 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                              break;
                           default:
                              class137.method3266(false);
                           }

                           i_8 = Login.field1187 + 180;
                           s_9 = 276;
                           if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                              class5.method50(str_15, true, false);
                              class268.loginResponseMessages("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              Login.loginIndex = 6;
                              return;
                           }

                           i_8 = Login.field1187 + 180;
                           s_9 = 326;
                           if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                              class137.method3266(false);
                           }
                        } else if (Login.loginIndex == 24) {
                           i_19 = Login.field1187 + 180;
                           s_21 = 301;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class137.method3266(false);
                           }
                        }
                     }
                  } else {
                     while (class218.method4109()) {
                        if (class97.field1338 == 84) {
                           class137.method3266(false);
                        } else if (class97.field1338 == 13) {
                           Login.loginIndex = 0;
                        }
                     }

                     i_19 = class62.field585 - 80;
                     s_21 = 321;
                     if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                        class137.method3266(false);
                     }

                     i_19 = class62.field585 + 80;
                     if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                        Login.loginIndex = 0;
                     }
                  }
               }

            }
         }
      }
   }

   void method4489(ByteBuffer class300_1, int i_2) {
      if (i_2 == 1) {
         this.field3296 = class300_1.readUnsignedShort();
         this.field3297 = class300_1.readUnsignedByte();
         this.field3295 = class300_1.readUnsignedByte();
      }

   }

   public static int method4493(CharSequence charsequence_0, int i_1) {
      return AbstractWorldMapData.method554(charsequence_0, i_1);
   }

   public void method4485(ByteBuffer class300_1) {
      while (true) {
         int i_3 = class300_1.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.method4489(class300_1, i_3);
      }
   }

}
