public class class248 extends class175 {

   public static class233 field3298;
   static int[] field3299;
   public static class145 field3294 = new class145(64);
   public int field3296;
   public int field3297;
   public int field3295;

   void method4489(class300 class300_1, int i_2, int i_3) {
      if (i_2 == 1) {
         this.field3296 = class300_1.readShortUBigEndian();
         this.field3297 = class300_1.readUByte();
         this.field3295 = class300_1.readUByte();
      }

   }

   public void method4485(class300 class300_1, int i_2) {
      while (true) {
         int i_3 = class300_1.readUByte();
         if (i_3 == 0) {
            return;
         }

         this.method4489(class300_1, i_3, 611768322);
      }
   }

   public static int method4493(CharSequence charsequence_0, int i_1, int i_2) {
      return class33.method554(charsequence_0, i_1);
   }

   static void method4484() {
      int i_4;
      int i_16;
      if (class85.field1205) {
         while (true) {
            if (!class218.method4109(458367917)) {
               if (class54.field493 != 1 && (class46.field413 || class54.field493 != 4)) {
                  break;
               }

               int i_2 = class85.field1208 + 280;
               if (class54.field483 >= i_2 && class54.field483 <= i_2 + 14 && class54.field495 >= 4 && class54.field495 <= 18) {
                  class192.method3676(0, 0);
                  break;
               }

               if (class54.field483 >= i_2 + 15 && class54.field483 <= i_2 + 80 && class54.field495 >= 4 && class54.field495 <= 18) {
                  class192.method3676(0, 1);
                  break;
               }

               int i_3 = class85.field1208 + 390;
               if (class54.field483 >= i_3 && class54.field483 <= i_3 + 14 && class54.field495 >= 4 && class54.field495 <= 18) {
                  class192.method3676(1, 0);
                  break;
               }

               if (class54.field483 >= i_3 + 15 && class54.field483 <= i_3 + 80 && class54.field495 >= 4 && class54.field495 <= 18) {
                  class192.method3676(1, 1);
                  break;
               }

               i_4 = class85.field1208 + 500;
               if (class54.field483 >= i_4 && class54.field483 <= i_4 + 14 && class54.field495 >= 4 && class54.field495 <= 18) {
                  class192.method3676(2, 0);
                  break;
               }

               if (class54.field483 >= i_4 + 15 && class54.field483 <= i_4 + 80 && class54.field495 >= 4 && class54.field495 <= 18) {
                  class192.method3676(2, 1);
                  break;
               }

               i_16 = class85.field1208 + 610;
               if (class54.field483 >= i_16 && class54.field483 <= i_16 + 14 && class54.field495 >= 4 && class54.field495 <= 18) {
                  class192.method3676(3, 0);
                  break;
               }

               if (class54.field483 >= i_16 + 15 && class54.field483 <= i_16 + 80 && class54.field495 >= 4 && class54.field495 <= 18) {
                  class192.method3676(3, 1);
                  break;
               }

               if (class54.field483 >= class85.field1208 + 708 && class54.field495 >= 4 && class54.field483 <= class85.field1208 + 708 + 50 && class54.field495 <= 20) {
                  class85.field1205 = false;
                  class5.field23.method6121(class85.field1208, 0);
                  class79.field1135.method6121(class85.field1208 + 382, 0);
                  class87.field1243.method6101(class85.field1208 + 382 - class87.field1243.field3897 / 2, 18);
                  break;
               }

               if (class85.field1207 != -1) {
                  class71 class71_14 = class71.field1031[class85.field1207];
                  class202.method3911(class71_14);
                  class85.field1205 = false;
                  class5.field23.method6121(class85.field1208, 0);
                  class79.field1135.method6121(class85.field1208 + 382, 0);
                  class87.field1243.method6101(class85.field1208 + 382 - class87.field1243.field3897 / 2, 18);
               } else {
                  if (class85.field1190 > 0 && class85.field1206 != null && class54.field483 >= 0 && class54.field483 <= class85.field1206.field3897 && class54.field495 >= class249.field3308 / 2 - 50 && class54.field495 <= class249.field3308 / 2 + 50) {
                     --class85.field1190;
                  }

                  if (class85.field1190 < class85.field1186 && class256.field3490 != null && class54.field483 >= class7.field46 - class256.field3490.field3897 - 5 && class54.field483 <= class7.field46 && class54.field495 >= class249.field3308 / 2 - 50 && class54.field495 <= class249.field3308 / 2 + 50) {
                     ++class85.field1190;
                  }
               }
               break;
            }

            if (class97.field1338 == 13) {
               class85.field1205 = false;
               class5.field23.method6121(class85.field1208, 0);
               class79.field1135.method6121(class85.field1208 + 382, 0);
               class87.field1243.method6101(class85.field1208 + 382 - class87.field1243.field3897 / 2, 18);
               break;
            }

            if (class97.field1338 == 96) {
               if (class85.field1190 > 0 && class85.field1206 != null) {
                  --class85.field1190;
               }
            } else if (class97.field1338 == 97 && class85.field1190 < class85.field1186 && class256.field3490 != null) {
               ++class85.field1190;
            }
         }

      } else {
         if ((class54.field493 == 1 || !class46.field413 && class54.field493 == 4) && class54.field483 >= class85.field1208 + 765 - 50 && class54.field495 >= 453) {
            class17.field117.field1063 = !class17.field117.field1063;
            class97.method2268(2118101811);
            if (!class17.field117.field1063) {
               class119.method2761(class29.field253, "scape main", "", 255, false, (byte) -92);
            } else {
               class171.method3553(2054009362);
            }
         }

         if (client.field662 != 5) {
            if (class85.field1193 == -1L) {
               class85.field1193 = class206.getAdjustedTimeMillis() + 1000L;
            }

            long long_12 = class206.getAdjustedTimeMillis();
            if (class190.method3667(1477910272) && class85.field1211 == -1L) {
               class85.field1211 = long_12;
               if (class85.field1211 > class85.field1193) {
                  class85.field1193 = class85.field1211;
               }
            }

            if (client.field662 == 10 || client.field662 == 11) {
               if (class190.field2348 == class56.field528) {
                  if (class54.field493 == 1 || !class46.field413 && class54.field493 == 4) {
                     i_4 = class85.field1208 + 5;
                     short s_5 = 463;
                     byte b_6 = 100;
                     byte b_7 = 35;
                     if (class54.field483 >= i_4 && class54.field483 <= i_4 + b_6 && class54.field495 >= s_5 && class54.field495 <= b_7 + s_5) {
                        class94.method2214((byte) -4);
                        return;
                     }
                  }

                  if (class71.field1027 != null) {
                     class94.method2214((byte) -93);
                  }
               }

               i_4 = class54.field493;
               i_16 = class54.field483;
               int i_17 = class54.field495;
               if (i_4 == 0) {
                  i_16 = class54.field492;
                  i_17 = class54.field487;
               }

               if (!class46.field413 && i_4 == 4) {
                  i_4 = 1;
               }

               int i_8;
               short s_9;
               if (class85.field1209 == 0) {
                  boolean bool_18 = false;

                  while (class218.method4109(2096519485)) {
                     if (class97.field1338 == 84) {
                        bool_18 = true;
                     }
                  }

                  i_8 = class62.field585 - 80;
                  s_9 = 291;
                  if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                     class5.method50(class190.method3666("secure", true, -1044311329) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  i_8 = class62.field585 + 80;
                  if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20 || bool_18) {
                     if ((client.field653 & 0x2000000) != 0) {
                        class85.field1197 = "";
                        class85.field1210 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class85.field1195 = "Your normal account will not be affected.";
                        class85.field1196 = "";
                        class85.field1209 = 1;
                        if (client.field691 && class85.field1180 != null && class85.field1180.length() > 0) {
                           class85.field1202 = 1;
                        } else {
                           class85.field1202 = 0;
                        }
                     } else if ((client.field653 & 0x4) != 0) {
                        if ((client.field653 & 0x400) != 0) {
                           class85.field1210 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class85.field1195 = "Players can attack each other almost everywhere";
                           class85.field1196 = "and the Protect Item prayer won\'t work.";
                        } else {
                           class85.field1210 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class85.field1195 = "Players can attack each other";
                           class85.field1196 = "almost everywhere.";
                        }

                        class85.field1197 = "Warning!";
                        class85.field1209 = 1;
                        if (client.field691 && class85.field1180 != null && class85.field1180.length() > 0) {
                           class85.field1202 = 1;
                        } else {
                           class85.field1202 = 0;
                        }
                     } else if ((client.field653 & 0x400) != 0) {
                        class85.field1210 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class85.field1195 = "The Protect Item prayer will";
                        class85.field1196 = "not work on this world.";
                        class85.field1197 = "Warning!";
                        class85.field1209 = 1;
                        if (client.field691 && class85.field1180 != null && class85.field1180.length() > 0) {
                           class85.field1202 = 1;
                        } else {
                           class85.field1202 = 0;
                        }
                     } else {
                        class137.method3266(false, -978566505);
                     }
                  }
               } else {
                  int i_19;
                  short s_21;
                  if (class85.field1209 != 1) {
                     boolean bool_10;
                     int i_11;
                     short s_20;
                     if (class85.field1209 == 2) {
                        s_20 = 201;
                        i_19 = s_20 + 52;
                        if (i_4 == 1 && i_17 >= i_19 - 12 && i_17 < i_19 + 2) {
                           class85.field1202 = 0;
                        }

                        i_19 += 15;
                        if (i_4 == 1 && i_17 >= i_19 - 12 && i_17 < i_19 + 2) {
                           class85.field1202 = 1;
                        }

                        i_19 += 15;
                        s_20 = 361;
                        if (class96.field1325 != null) {
                           i_8 = class96.field1325.field3865 / 2;
                           if (i_4 == 1 && i_16 >= class96.field1325.field3863 - i_8 && i_16 <= i_8 + class96.field1325.field3863 && i_17 >= s_20 - 15 && i_17 < s_20) {
                              switch(class85.field1212) {
                              case 1:
                                 class268.loginResponseMessages("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                 class85.field1209 = 5;
                                 return;
                              case 2:
                                 class5.method50("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        i_8 = class62.field585 - 80;
                        s_9 = 321;
                        if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                           class85.field1180 = class85.field1180.trim();
                           if (class85.field1180.length() == 0) {
                              class268.loginResponseMessages("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (class85.field1198.length() == 0) {
                              class268.loginResponseMessages("", "Please enter your password.", "");
                              return;
                           }

                           class268.loginResponseMessages("", "Connecting to server...", "");
                           class9.method99(false, -1093013043);
                           class96.method2265(20);
                           return;
                        }

                        i_8 = class85.field1187 + 180 + 80;
                        if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                           class85.field1209 = 0;
                           class85.field1180 = "";
                           class85.field1198 = "";
                           class9.field65 = 0;
                           class36.field328 = "";
                           class85.field1201 = true;
                        }

                        i_8 = class62.field585 + -117;
                        s_9 = 277;
                        class85.field1199 = i_16 >= i_8 && i_16 < i_8 + class237.field3191 && i_17 >= s_9 && i_17 < s_9 + class25.field212;
                        if (i_4 == 1 && class85.field1199) {
                           client.field691 = !client.field691;
                           if (!client.field691 && class17.field117.field1065 != null) {
                              class17.field117.field1065 = null;
                              class97.method2268(2113961646);
                           }
                        }

                        i_8 = class62.field585 + 24;
                        s_9 = 277;
                        class85.field1184 = i_16 >= i_8 && i_16 < i_8 + class237.field3191 && i_17 >= s_9 && i_17 < s_9 + class25.field212;
                        if (i_4 == 1 && class85.field1184) {
                           class17.field117.field1066 = !class17.field117.field1066;
                           if (!class17.field117.field1066) {
                              class85.field1180 = "";
                              class17.field117.field1065 = null;
                              if (client.field691 && class85.field1180 != null && class85.field1180.length() > 0) {
                                 class85.field1202 = 1;
                              } else {
                                 class85.field1202 = 0;
                              }
                           }

                           class97.method2268(2134130666);
                        }

                        while (true) {
                           while (class218.method4109(1593311170)) {
                              bool_10 = false;

                              for (i_11 = 0; i_11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); i_11++) {
                                 if (class207.field2508 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(i_11)) {
                                    bool_10 = true;
                                    break;
                                 }
                              }

                              if (class97.field1338 == 13) {
                                 class85.field1209 = 0;
                                 class85.field1180 = "";
                                 class85.field1198 = "";
                                 class9.field65 = 0;
                                 class36.field328 = "";
                                 class85.field1201 = true;
                              } else if (class85.field1202 == 0) {
                                 if (class97.field1338 == 85 && class85.field1180.length() > 0) {
                                    class85.field1180 = class85.field1180.substring(0, class85.field1180.length() - 1);
                                 }

                                 if (class97.field1338 == 84 || class97.field1338 == 80) {
                                    class85.field1202 = 1;
                                 }

                                 if (bool_10 && class85.field1180.length() < 320) {
                                    class85.field1180 = class85.field1180 + class207.field2508;
                                 }
                              } else if (class85.field1202 == 1) {
                                 if (class97.field1338 == 85 && class85.field1198.length() > 0) {
                                    class85.field1198 = class85.field1198.substring(0, class85.field1198.length() - 1);
                                 }

                                 if (class97.field1338 == 84 || class97.field1338 == 80) {
                                    class85.field1202 = 0;
                                 }

                                 if (class97.field1338 == 84) {
                                    class85.field1180 = class85.field1180.trim();
                                    if (class85.field1180.length() == 0) {
                                       class268.loginResponseMessages("", "Please enter your username/email address.", "");
                                       return;
                                    }

                                    if (class85.field1198.length() == 0) {
                                       class268.loginResponseMessages("", "Please enter your password.", "");
                                       return;
                                    }

                                    class268.loginResponseMessages("", "Connecting to server...", "");
                                    class9.method99(false, -1259093589);
                                    class96.method2265(20);
                                    return;
                                 }

                                 if (bool_10 && class85.field1198.length() < 20) {
                                    class85.field1198 = class85.field1198 + class207.field2508;
                                 }
                              }
                           }

                           return;
                        }
                     } else if (class85.field1209 == 3) {
                        i_19 = class85.field1187 + 180;
                        s_21 = 276;
                        if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                           class137.method3266(false, -420192088);
                        }

                        i_19 = class85.field1187 + 180;
                        s_21 = 326;
                        if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                           class268.loginResponseMessages("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class85.field1209 = 5;
                           return;
                        }
                     } else {
                        int i_23;
                        if (class85.field1209 == 4) {
                           i_19 = class85.field1187 + 180 - 80;
                           s_21 = 321;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class36.field328.trim();
                              if (class36.field328.length() != 6) {
                                 class268.loginResponseMessages("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              class9.field65 = Integer.parseInt(class36.field328);
                              class36.field328 = "";
                              class9.method99(true, -2125427032);
                              class268.loginResponseMessages("", "Connecting to server...", "");
                              class96.method2265(20);
                              return;
                           }

                           if (i_4 == 1 && i_16 >= class85.field1187 + 180 - 9 && i_16 <= class85.field1187 + 180 + 130 && i_17 >= 263 && i_17 <= 296) {
                              class85.field1201 = !class85.field1201;
                           }

                           if (i_4 == 1 && i_16 >= class85.field1187 + 180 - 34 && i_16 <= class85.field1187 + 34 + 180 && i_17 >= 351 && i_17 <= 363) {
                              class5.method50(class190.method3666("secure", true, -1044311329) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           i_19 = class85.field1187 + 180 + 80;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class85.field1209 = 0;
                              class85.field1180 = "";
                              class85.field1198 = "";
                              class9.field65 = 0;
                              class36.field328 = "";
                           }

                           while (class218.method4109(1958142063)) {
                              boolean bool_22 = false;

                              for (i_23 = 0; i_23 < "1234567890".length(); i_23++) {
                                 if (class207.field2508 == "1234567890".charAt(i_23)) {
                                    bool_22 = true;
                                    break;
                                 }
                              }

                              if (class97.field1338 == 13) {
                                 class85.field1209 = 0;
                                 class85.field1180 = "";
                                 class85.field1198 = "";
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
                                    class9.method99(true, -1709278569);
                                    class268.loginResponseMessages("", "Connecting to server...", "");
                                    class96.method2265(20);
                                    return;
                                 }

                                 if (bool_22 && class36.field328.length() < 6) {
                                    class36.field328 = class36.field328 + class207.field2508;
                                 }
                              }
                           }
                        } else if (class85.field1209 == 5) {
                           i_19 = class85.field1187 + 180 - 80;
                           s_21 = 321;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class154.method3406((short) 8742);
                              return;
                           }

                           i_19 = class85.field1187 + 180 + 80;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class137.method3266(true, 48978495);
                           }

                           s_9 = 361;
                           if (class38.field332 != null) {
                              i_23 = class38.field332.field3865 / 2;
                              if (i_4 == 1 && i_16 >= class38.field332.field3863 - i_23 && i_16 <= i_23 + class38.field332.field3863 && i_17 >= s_9 - 15 && i_17 < s_9) {
                                 class5.method50(class190.method3666("secure", true, -1044311329) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                              }
                           }

                           while (class218.method4109(2108077927)) {
                              bool_10 = false;

                              for (i_11 = 0; i_11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); i_11++) {
                                 if (class207.field2508 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(i_11)) {
                                    bool_10 = true;
                                    break;
                                 }
                              }

                              if (class97.field1338 == 13) {
                                 class137.method3266(true, -1406820898);
                              } else {
                                 if (class97.field1338 == 85 && class85.field1180.length() > 0) {
                                    class85.field1180 = class85.field1180.substring(0, class85.field1180.length() - 1);
                                 }

                                 if (class97.field1338 == 84) {
                                    class154.method3406((short) 16089);
                                    return;
                                 }

                                 if (bool_10 && class85.field1180.length() < 320) {
                                    class85.field1180 = class85.field1180 + class207.field2508;
                                 }
                              }
                           }
                        } else if (class85.field1209 == 6) {
                           while (true) {
                              do {
                                 if (!class218.method4109(573828821)) {
                                    s_20 = 321;
                                    if (i_4 == 1 && i_17 >= s_20 - 20 && i_17 <= s_20 + 20) {
                                       class137.method3266(true, -235772870);
                                    }

                                    return;
                                 }
                              } while (class97.field1338 != 84 && class97.field1338 != 13);

                              class137.method3266(true, 234037255);
                           }
                        } else if (class85.field1209 == 7) {
                           i_19 = class85.field1187 + 180 - 80;
                           s_21 = 321;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class5.method50(class190.method3666("secure", true, -1044311329) + "m=dob/set_dob.ws", true, false);
                              class268.loginResponseMessages("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class85.field1209 = 6;
                              return;
                           }

                           i_19 = class85.field1187 + 180 + 80;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class137.method3266(true, -1629648683);
                           }
                        } else if (class85.field1209 == 8) {
                           i_19 = class85.field1187 + 180 - 80;
                           s_21 = 321;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class5.method50("https://www.jagex.com/terms/privacy/#eight", true, false);
                              class268.loginResponseMessages("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class85.field1209 = 6;
                              return;
                           }

                           i_19 = class85.field1187 + 180 + 80;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class137.method3266(true, -2006560392);
                           }
                        } else if (class85.field1209 == 12) {
                           String str_15 = "";
                           switch(class85.field1182) {
                           case 0:
                              str_15 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                              break;
                           case 1:
                              str_15 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                              break;
                           default:
                              class137.method3266(false, -619709704);
                           }

                           i_8 = class85.field1187 + 180;
                           s_9 = 276;
                           if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                              class5.method50(str_15, true, false);
                              class268.loginResponseMessages("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class85.field1209 = 6;
                              return;
                           }

                           i_8 = class85.field1187 + 180;
                           s_9 = 326;
                           if (i_4 == 1 && i_16 >= i_8 - 75 && i_16 <= i_8 + 75 && i_17 >= s_9 - 20 && i_17 <= s_9 + 20) {
                              class137.method3266(false, -1782542793);
                           }
                        } else if (class85.field1209 == 24) {
                           i_19 = class85.field1187 + 180;
                           s_21 = 301;
                           if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                              class137.method3266(false, 501585303);
                           }
                        }
                     }
                  } else {
                     while (class218.method4109(838187525)) {
                        if (class97.field1338 == 84) {
                           class137.method3266(false, -545171198);
                        } else if (class97.field1338 == 13) {
                           class85.field1209 = 0;
                        }
                     }

                     i_19 = class62.field585 - 80;
                     s_21 = 321;
                     if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                        class137.method3266(false, 148963127);
                     }

                     i_19 = class62.field585 + 80;
                     if (i_4 == 1 && i_16 >= i_19 - 75 && i_16 <= i_19 + 75 && i_17 >= s_21 - 20 && i_17 <= s_21 + 20) {
                        class85.field1209 = 0;
                     }
                  }
               }

            }
         }
      }
   }

}
