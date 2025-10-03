public class class292 {

   public static final class292 field3676 = new class292("p11_full");
   public static final class292 field3677 = new class292("p12_full");
   public static final class292 field3678 = new class292("b12_full");
   public static final class292 field3679 = new class292("verdana_11pt_regular");
   public static final class292 field3684 = new class292("verdana_13pt_regular");
   public static final class292 field3681 = new class292("verdana_15pt_regular");
   String field3682;

   class292(String string_1) {
      this.field3682 = string_1;
   }

   static final void method5319(class217[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
      class321.method5997(i_2, i_3, i_4, i_5);
      class130.method3051();

      for (int i_10 = 0; i_10 < arr_0.length; i_10++) {
         class217 class217_11 = arr_0[i_10];
         if (class217_11 != null && (class217_11.field2583 == i_1 || i_1 == -1412584499 && class217_11 == Client.field828)) {
            int i_12;
            if (i_8 == -1) {
               Client.field808[Client.field858] = class217_11.field2577 + i_6;
               Client.field864[Client.field858] = i_7 + class217_11.field2699;
               Client.field865[Client.field858] = class217_11.field2579;
               Client.field860[Client.field858] = class217_11.field2667;
               i_12 = ++Client.field858 - 1;
            } else {
               i_12 = i_8;
            }

            class217_11.field2701 = i_12;
            class217_11.field2702 = Client.field881;
            if (!class217_11.field2563 || !class62.method1133(class217_11)) {
               if (class217_11.field2568 > 0) {
                  class8.method85(class217_11, -1619270893);
               }

               int i_13 = class217_11.field2577 + i_6;
               int i_14 = i_7 + class217_11.field2699;
               int i_15 = class217_11.field2595;
               int i_16;
               int i_17;
               if (class217_11 == Client.field828) {
                  if (i_1 != -1412584499 && !class217_11.field2648) {
                     class23.field188 = arr_0;
                     class220.field2742 = i_6;
                     ClientPacketProt.field2305 = i_7;
                     continue;
                  }

                  if (Client.field839 && Client.field873) {
                     i_16 = class54.field492;
                     i_17 = class54.field487;
                     i_16 -= Client.field830;
                     i_17 -= Client.field831;
                     if (i_16 < Client.field834) {
                        i_16 = Client.field834;
                     }

                     if (i_16 + class217_11.field2579 > Client.field834 + Client.field829.field2579) {
                        i_16 = Client.field834 + Client.field829.field2579 - class217_11.field2579;
                     }

                     if (i_17 < Client.field835) {
                        i_17 = Client.field835;
                     }

                     if (i_17 + class217_11.field2667 > Client.field835 + Client.field829.field2667) {
                        i_17 = Client.field835 + Client.field829.field2667 - class217_11.field2667;
                     }

                     i_13 = i_16;
                     i_14 = i_17;
                  }

                  if (!class217_11.field2648) {
                     i_15 = 128;
                  }
               }

               int i_18;
               int i_19;
               int i_20;
               int i_21;
               int i_22;
               int i_23;
               if (class217_11.field2566 == 2) {
                  i_16 = i_2;
                  i_17 = i_3;
                  i_18 = i_4;
                  i_19 = i_5;
               } else if (class217_11.field2566 == 9) {
                  i_20 = i_13;
                  i_21 = i_14;
                  i_22 = i_13 + class217_11.field2579;
                  i_23 = i_14 + class217_11.field2667;
                  if (i_22 < i_13) {
                     i_20 = i_22;
                     i_22 = i_13;
                  }

                  if (i_23 < i_14) {
                     i_21 = i_23;
                     i_23 = i_14;
                  }

                  ++i_22;
                  ++i_23;
                  i_16 = i_20 > i_2 ? i_20 : i_2;
                  i_17 = i_21 > i_3 ? i_21 : i_3;
                  i_18 = i_22 < i_4 ? i_22 : i_4;
                  i_19 = i_23 < i_5 ? i_23 : i_5;
               } else {
                  i_20 = i_13 + class217_11.field2579;
                  i_21 = i_14 + class217_11.field2667;
                  i_16 = i_13 > i_2 ? i_13 : i_2;
                  i_17 = i_14 > i_3 ? i_14 : i_3;
                  i_18 = i_20 < i_4 ? i_20 : i_4;
                  i_19 = i_21 < i_5 ? i_21 : i_5;
               }

               if (!class217_11.field2563 || i_16 < i_18 && i_17 < i_19) {
                  if (class217_11.field2568 != 0) {
                     if (class217_11.field2568 == 1336) {
                        if (Client.field884) {
                           i_14 += 15;
                           class169.field2054.method5348("Fps:" + GameApplet.field462, i_13 + class217_11.field2579, i_14, 16776960, -1);
                           i_14 += 15;
                           Runtime runtime_43 = Runtime.getRuntime();
                           i_21 = (int)((runtime_43.totalMemory() - runtime_43.freeMemory()) / 1024L);
                           i_22 = 16776960;
                           if (i_21 > 327680 && !Client.field656) {
                              i_22 = 16711680;
                           }

                           class169.field2054.method5348("Mem:" + i_21 + "k", i_13 + class217_11.field2579, i_14, i_22, -1);
                           i_14 += 15;
                        }
                        continue;
                     }

                     if (class217_11.field2568 == 1337) {
                        Client.field803 = i_13;
                        Client.field804 = i_14;
                        class4.method48(i_13, i_14, class217_11.field2579, class217_11.field2667, 1991855037);
                        Client.field843[class217_11.field2701] = true;
                        class321.method5997(i_2, i_3, i_4, i_5);
                        continue;
                     }

                     if (class217_11.field2568 == 1338) {
                        class58.method1098(class217_11, i_13, i_14, i_12);
                        class321.method5997(i_2, i_3, i_4, i_5);
                        continue;
                     }

                     if (class217_11.field2568 == 1339) {
                        class18.method205(class217_11, i_13, i_14, i_12, (byte) 61);
                        class321.method5997(i_2, i_3, i_4, i_5);
                        continue;
                     }

                     if (class217_11.field2568 == 1400) {
                        class136.field1875.method6317(i_13, i_14, class217_11.field2579, class217_11.field2667, Client.field881, -365948534);
                     }

                     if (class217_11.field2568 == 1401) {
                        class136.field1875.method6320(i_13, i_14, class217_11.field2579, class217_11.field2667, -1774436451);
                     }

                     if (class217_11.field2568 == 1402) {
                        class278.field3631.method1735(i_13, Client.field881, (byte) -54);
                     }
                  }

                  if (class217_11.field2566 == 0) {
                     if (!class217_11.field2563 && class62.method1133(class217_11) && class217_11 != class72.field1059) {
                        continue;
                     }

                     if (!class217_11.field2563) {
                        if (class217_11.field2586 > class217_11.field2569 - class217_11.field2667) {
                           class217_11.field2586 = class217_11.field2569 - class217_11.field2667;
                        }

                        if (class217_11.field2586 < 0) {
                           class217_11.field2586 = 0;
                        }
                     }

                     method5319(arr_0, class217_11.field2688, i_16, i_17, i_18, i_19, i_13 - class217_11.field2585, i_14 - class217_11.field2586, i_12, -414433713);
                     if (class217_11.field2675 != null) {
                        method5319(class217_11.field2675, class217_11.field2688, i_16, i_17, i_18, i_19, i_13 - class217_11.field2585, i_14 - class217_11.field2586, i_12, -414433713);
                     }

                     class61 class61_31 = (class61) Client.field816.method5952((long)class217_11.field2688);
                     if (class61_31 != null) {
                        class191.method3668(class61_31.field571, i_16, i_17, i_18, i_19, i_13, i_14, i_12, -474414027);
                     }

                     class321.method5997(i_2, i_3, i_4, i_5);
                     class130.method3051();
                  }

                  if (Client.field869 || Client.field862[i_12] || Client.field768 > 1) {
                     if (class217_11.field2566 == 0 && !class217_11.field2563 && class217_11.field2569 > class217_11.field2667) {
                        class232.method4139(i_13 + class217_11.field2579, i_14, class217_11.field2586, class217_11.field2667, class217_11.field2569, (byte) -20);
                     }

                     if (class217_11.field2566 != 1) {
                        int i_24;
                        int i_25;
                        int i_26;
                        int i_27;
                        if (class217_11.field2566 == 2) {
                           i_20 = 0;

                           for (i_21 = 0; i_21 < class217_11.field2576; i_21++) {
                              for (i_22 = 0; i_22 < class217_11.field2670; i_22++) {
                                 i_23 = i_13 + i_22 * (class217_11.field2631 + 32);
                                 i_24 = i_14 + i_21 * (class217_11.field2632 + 32);
                                 if (i_20 < 20) {
                                    i_23 += class217_11.field2633[i_20];
                                    i_24 += class217_11.field2634[i_20];
                                 }

                                 if (class217_11.field2560[i_20] <= 0) {
                                    if (class217_11.field2635 != null && i_20 < 20) {
                                       class325 class325_47 = class217_11.method4038(i_20, -1022923411);
                                       if (class325_47 != null) {
                                          class325_47.method6126(i_23, i_24);
                                       } else if (class217.field2562) {
                                          class224.method4120(class217_11);
                                       }
                                    }
                                 } else {
                                    boolean bool_38 = false;
                                    boolean bool_39 = false;
                                    i_27 = class217_11.field2560[i_20] - 1;
                                    if (i_23 + 32 > i_2 && i_23 < i_4 && i_24 + 32 > i_3 && i_24 < i_5 || class217_11 == class18.field127 && i_20 == Client.field765) {
                                       class325 class325_28;
                                       if (Client.field900 == 1 && i_20 == class23.field182 && class217_11.field2688 == class63.field594) {
                                          class325_28 = class19.method236(i_27, class217_11.field2705[i_20], 2, 0, 2, false, 2024001124);
                                       } else {
                                          class325_28 = class19.method236(i_27, class217_11.field2705[i_20], 1, 3153952, 2, false, 2024001124);
                                       }

                                       if (class325_28 != null) {
                                          if (class217_11 == class18.field127 && i_20 == Client.field765) {
                                             i_25 = class54.field492 - Client.field654;
                                             i_26 = class54.field487 - Client.field763;
                                             if (i_25 < 5 && i_25 > -5) {
                                                i_25 = 0;
                                             }

                                             if (i_26 < 5 && i_26 > -5) {
                                                i_26 = 0;
                                             }

                                             if (Client.field766 < 5) {
                                                i_25 = 0;
                                                i_26 = 0;
                                             }

                                             class325_28.method6129(i_25 + i_23, i_26 + i_24, 128);
                                             if (i_1 != -1) {
                                                class217 class217_29 = arr_0[i_1 & 0xffff];
                                                int i_30;
                                                if (i_24 + i_26 < class321.field3870 && class217_29.field2586 > 0) {
                                                   i_30 = (class321.field3870 - i_24 - i_26) * Client.field718 / 3;
                                                   if (i_30 > Client.field718 * 10) {
                                                      i_30 = Client.field718 * 10;
                                                   }

                                                   if (i_30 > class217_29.field2586) {
                                                      i_30 = class217_29.field2586;
                                                   }

                                                   class217_29.field2586 -= i_30;
                                                   Client.field763 += i_30;
                                                   class224.method4120(class217_29);
                                                }

                                                if (i_26 + i_24 + 32 > class321.field3873 && class217_29.field2586 < class217_29.field2569 - class217_29.field2667) {
                                                   i_30 = (i_26 + i_24 + 32 - class321.field3873) * Client.field718 / 3;
                                                   if (i_30 > Client.field718 * 10) {
                                                      i_30 = Client.field718 * 10;
                                                   }

                                                   if (i_30 > class217_29.field2569 - class217_29.field2667 - class217_29.field2586) {
                                                      i_30 = class217_29.field2569 - class217_29.field2667 - class217_29.field2586;
                                                   }

                                                   class217_29.field2586 += i_30;
                                                   Client.field763 -= i_30;
                                                   class224.method4120(class217_29);
                                                }
                                             }
                                          } else if (class217_11 == class59.field549 && i_20 == Client.field698) {
                                             class325_28.method6129(i_23, i_24, 128);
                                          } else {
                                             class325_28.method6126(i_23, i_24);
                                          }
                                       } else {
                                          class224.method4120(class217_11);
                                       }
                                    }
                                 }

                                 ++i_20;
                              }
                           }
                        } else if (class217_11.field2566 == 3) {
                           if (class94.method2207(class217_11, -82771481)) {
                              i_20 = class217_11.field2639;
                              if (class217_11 == class72.field1059 && class217_11.field2663 != 0) {
                                 i_20 = class217_11.field2663;
                              }
                           } else {
                              i_20 = class217_11.field2695;
                              if (class217_11 == class72.field1059 && class217_11.field2587 != 0) {
                                 i_20 = class217_11.field2587;
                              }
                           }

                           if (class217_11.field2571) {
                              switch(class217_11.field2693.field3886) {
                              case 1:
                                 class321.method6005(i_13, i_14, class217_11.field2579, class217_11.field2667, class217_11.field2695, class217_11.field2639);
                                 break;
                              case 2:
                                 class321.method6006(i_13, i_14, class217_11.field2579, class217_11.field2667, class217_11.field2695, class217_11.field2639, 255 - (class217_11.field2595 & 0xff), 255 - (class217_11.field2596 & 0xff));
                                 break;
                              default:
                                 if (i_15 == 0) {
                                    class321.method6012(i_13, i_14, class217_11.field2579, class217_11.field2667, i_20);
                                 } else {
                                    class321.method6004(i_13, i_14, class217_11.field2579, class217_11.field2667, i_20, 256 - (i_15 & 0xff));
                                 }
                              }
                           } else if (i_15 == 0) {
                              class321.method6008(i_13, i_14, class217_11.field2579, class217_11.field2667, i_20);
                           } else {
                              class321.method6009(i_13, i_14, class217_11.field2579, class217_11.field2667, i_20, 256 - (i_15 & 0xff));
                           }
                        } else {
                           class295 class295_40;
                           if (class217_11.field2566 == 4) {
                              class295_40 = class217_11.method4037(-121271997);
                              if (class295_40 == null) {
                                 if (class217.field2562) {
                                    class224.method4120(class217_11);
                                 }
                              } else {
                                 String string_45 = class217_11.field2601;
                                 if (class94.method2207(class217_11, 18940832)) {
                                    i_21 = class217_11.field2639;
                                    if (class217_11 == class72.field1059 && class217_11.field2663 != 0) {
                                       i_21 = class217_11.field2663;
                                    }

                                    if (class217_11.field2590.length() > 0) {
                                       string_45 = class217_11.field2590;
                                    }
                                 } else {
                                    i_21 = class217_11.field2695;
                                    if (class217_11 == class72.field1059 && class217_11.field2587 != 0) {
                                       i_21 = class217_11.field2587;
                                    }
                                 }

                                 if (class217_11.field2563 && class217_11.field2690 != -1) {
                                    class254 class254_46 = class26.method404(class217_11.field2690);
                                    string_45 = class254_46.field3449;
                                    if (string_45 == null) {
                                       string_45 = "null";
                                    }

                                    if ((class254_46.field3423 == 1 || class217_11.field2655 != 1) && class217_11.field2655 != -1) {
                                       string_45 = class73.method1756(16748608, -844505624) + string_45 + "</col>" + " " + 'x' + class188.method3631(class217_11.field2655, 434520276);
                                    }
                                 }

                                 if (class217_11 == Client.field850) {
                                    string_45 = "Please wait...";
                                    i_21 = class217_11.field2695;
                                 }

                                 if (!class217_11.field2563) {
                                    string_45 = class8.method92(string_45, class217_11, 16777215);
                                 }

                                 class295_40.method5350(string_45, i_13, i_14, class217_11.field2579, class217_11.field2667, i_21, class217_11.field2659 ? 0 : -1, class217_11.field2628, class217_11.field2629, class217_11.field2627);
                              }
                           } else if (class217_11.field2566 == 5) {
                              class325 class325_41;
                              if (!class217_11.field2563) {
                                 class325_41 = class217_11.method4036(class94.method2207(class217_11, -614633887), 1738149818);
                                 if (class325_41 != null) {
                                    class325_41.method6126(i_13, i_14);
                                 } else if (class217.field2562) {
                                    class224.method4120(class217_11);
                                 }
                              } else {
                                 if (class217_11.field2690 != -1) {
                                    class325_41 = class19.method236(class217_11.field2690, class217_11.field2655, class217_11.field2559, class217_11.field2604, class217_11.field2703, false, 2024001124);
                                 } else {
                                    class325_41 = class217_11.method4036(false, 1150967465);
                                 }

                                 if (class325_41 == null) {
                                    if (class217.field2562) {
                                       class224.method4120(class217_11);
                                    }
                                 } else {
                                    i_21 = class325_41.field3898;
                                    i_22 = class325_41.field3904;
                                    if (!class217_11.field2613) {
                                       i_23 = class217_11.field2579 * 4096 / i_21;
                                       if (class217_11.field2591 != 0) {
                                          class325_41.method6186(class217_11.field2579 / 2 + i_13, class217_11.field2667 / 2 + i_14, class217_11.field2591, i_23);
                                       } else if (i_15 != 0) {
                                          class325_41.method6131(i_13, i_14, class217_11.field2579, class217_11.field2667, 256 - (i_15 & 0xff));
                                       } else if (i_21 == class217_11.field2579 && i_22 == class217_11.field2667) {
                                          class325_41.method6126(i_13, i_14);
                                       } else {
                                          class325_41.method6125(i_13, i_14, class217_11.field2579, class217_11.field2667);
                                       }
                                    } else {
                                       class321.method5998(i_13, i_14, i_13 + class217_11.field2579, i_14 + class217_11.field2667);
                                       i_23 = (i_21 - 1 + class217_11.field2579) / i_21;
                                       i_24 = (i_22 - 1 + class217_11.field2667) / i_22;

                                       for (i_25 = 0; i_25 < i_23; i_25++) {
                                          for (i_26 = 0; i_26 < i_24; i_26++) {
                                             if (class217_11.field2591 != 0) {
                                                class325_41.method6186(i_21 / 2 + i_13 + i_25 * i_21, i_22 / 2 + i_14 + i_22 * i_26, class217_11.field2591, 4096);
                                             } else if (i_15 != 0) {
                                                class325_41.method6129(i_13 + i_25 * i_21, i_14 + i_26 * i_22, 256 - (i_15 & 0xff));
                                             } else {
                                                class325_41.method6126(i_13 + i_25 * i_21, i_14 + i_22 * i_26);
                                             }
                                          }
                                       }

                                       class321.method5997(i_2, i_3, i_4, i_5);
                                    }
                                 }
                              }
                           } else {
                              class254 class254_34;
                              if (class217_11.field2566 == 6) {
                                 boolean bool_37 = class94.method2207(class217_11, 670572272);
                                 if (bool_37) {
                                    i_21 = class217_11.field2612;
                                 } else {
                                    i_21 = class217_11.field2611;
                                 }

                                 class127 class127_42 = null;
                                 i_23 = 0;
                                 if (class217_11.field2690 != -1) {
                                    class254_34 = class26.method404(class217_11.field2690);
                                    if (class254_34 != null) {
                                       class254_34 = class254_34.method4656(class217_11.field2655);
                                       class127_42 = class254_34.method4644(1, -682416240);
                                       if (class127_42 != null) {
                                          class127_42.method2899();
                                          i_23 = class127_42.field1873 / 2;
                                       } else {
                                          class224.method4120(class217_11);
                                       }
                                    }
                                 } else if (class217_11.field2607 == 5) {
                                    if (class217_11.field2649 == 0) {
                                       class127_42 = Client.field918.method3997((class258) null, -1, (class258) null, -1);
                                    } else {
                                       class127_42 = Client.field657.vmethod3253(759381421);
                                    }
                                 } else if (i_21 == -1) {
                                    class127_42 = class217_11.method4049((class258) null, -1, bool_37, Client.field657.field613, 1036934880);
                                    if (class127_42 == null && class217.field2562) {
                                       class224.method4120(class217_11);
                                    }
                                 } else {
                                    class258 class258_48 = class7.method81(i_21, (byte) 1);
                                    class127_42 = class217_11.method4049(class258_48, class217_11.field2692, bool_37, Client.field657.field613, 482898105);
                                    if (class127_42 == null && class217.field2562) {
                                       class224.method4120(class217_11);
                                    }
                                 }

                                 class130.method2976(class217_11.field2579 / 2 + i_13, class217_11.field2667 / 2 + i_14);
                                 i_24 = class130.field1787[class217_11.field2615] * class217_11.field2618 >> 16;
                                 i_25 = class130.field1784[class217_11.field2615] * class217_11.field2618 >> 16;
                                 if (class127_42 != null) {
                                    if (!class217_11.field2563) {
                                       class127_42.method2866(0, class217_11.field2616, 0, class217_11.field2615, 0, i_24, i_25);
                                    } else {
                                       class127_42.method2899();
                                       if (class217_11.field2621) {
                                          class127_42.method2876(0, class217_11.field2616, class217_11.field2640, class217_11.field2615, class217_11.field2593, i_23 + i_24 + class217_11.field2614, i_25 + class217_11.field2614, class217_11.field2618);
                                       } else {
                                          class127_42.method2866(0, class217_11.field2616, class217_11.field2640, class217_11.field2615, class217_11.field2593, i_24 + i_23 + class217_11.field2614, i_25 + class217_11.field2614);
                                       }
                                    }
                                 }

                                 class130.method2973();
                              } else {
                                 if (class217_11.field2566 == 7) {
                                    class295_40 = class217_11.method4037(251529382);
                                    if (class295_40 == null) {
                                       if (class217.field2562) {
                                          class224.method4120(class217_11);
                                       }
                                       continue;
                                    }

                                    i_21 = 0;

                                    for (i_22 = 0; i_22 < class217_11.field2576; i_22++) {
                                       for (i_23 = 0; i_23 < class217_11.field2670; i_23++) {
                                          if (class217_11.field2560[i_21] > 0) {
                                             class254_34 = class26.method404(class217_11.field2560[i_21] - 1);
                                             String string_35;
                                             if (class254_34.field3423 != 1 && class217_11.field2705[i_21] == 1) {
                                                string_35 = class73.method1756(16748608, -844505624) + class254_34.field3449 + "</col>";
                                             } else {
                                                string_35 = class73.method1756(16748608, -844505624) + class254_34.field3449 + "</col>" + " " + 'x' + class188.method3631(class217_11.field2705[i_21], 1502705611);
                                             }

                                             i_26 = i_23 * (class217_11.field2631 + 115) + i_13;
                                             i_27 = i_22 * (class217_11.field2632 + 12) + i_14;
                                             if (class217_11.field2628 == 0) {
                                                class295_40.method5346(string_35, i_26, i_27, class217_11.field2695, class217_11.field2659 ? 0 : -1);
                                             } else if (class217_11.field2628 == 1) {
                                                class295_40.method5341(string_35, class217_11.field2579 / 2 + i_26, i_27, class217_11.field2695, class217_11.field2659 ? 0 : -1);
                                             } else {
                                                class295_40.method5348(string_35, i_26 + class217_11.field2579 - 1, i_27, class217_11.field2695, class217_11.field2659 ? 0 : -1);
                                             }
                                          }

                                          ++i_21;
                                       }
                                    }
                                 }

                                 if (class217_11.field2566 == 8 && class217_11 == class32.field284 && Client.field833 == Client.field840) {
                                    i_20 = 0;
                                    i_21 = 0;
                                    class295 class295_32 = class169.field2054;
                                    String string_33 = class217_11.field2601;

                                    String string_44;
                                    for (string_33 = class8.method92(string_33, class217_11, 16777215); string_33.length() > 0; i_21 = i_21 + class295_32.field3709 + 1) {
                                       i_25 = string_33.indexOf("<br>");
                                       if (i_25 != -1) {
                                          string_44 = string_33.substring(0, i_25);
                                          string_33 = string_33.substring(i_25 + 4);
                                       } else {
                                          string_44 = string_33;
                                          string_33 = "";
                                       }

                                       i_26 = class295_32.method5417(string_44);
                                       if (i_26 > i_20) {
                                          i_20 = i_26;
                                       }
                                    }

                                    i_20 += 6;
                                    i_21 += 7;
                                    i_25 = i_13 + class217_11.field2579 - 5 - i_20;
                                    i_26 = i_14 + class217_11.field2667 + 5;
                                    if (i_25 < i_13 + 5) {
                                       i_25 = i_13 + 5;
                                    }

                                    if (i_25 + i_20 > i_4) {
                                       i_25 = i_4 - i_20;
                                    }

                                    if (i_21 + i_26 > i_5) {
                                       i_26 = i_5 - i_21;
                                    }

                                    class321.method6012(i_25, i_26, i_20, i_21, 16777120);
                                    class321.method6008(i_25, i_26, i_20, i_21, 0);
                                    string_33 = class217_11.field2601;
                                    i_27 = i_26 + class295_32.field3709 + 2;

                                    for (string_33 = class8.method92(string_33, class217_11, 16777215); string_33.length() > 0; i_27 = i_27 + class295_32.field3709 + 1) {
                                       int i_36 = string_33.indexOf("<br>");
                                       if (i_36 != -1) {
                                          string_44 = string_33.substring(0, i_36);
                                          string_33 = string_33.substring(i_36 + 4);
                                       } else {
                                          string_44 = string_33;
                                          string_33 = "";
                                       }

                                       class295_32.method5346(string_44, i_25 + 3, i_27, 0, -1);
                                    }
                                 }

                                 if (class217_11.field2566 == 9) {
                                    if (class217_11.field2598) {
                                       i_20 = i_13;
                                       i_21 = i_14 + class217_11.field2667;
                                       i_22 = i_13 + class217_11.field2579;
                                       i_23 = i_14;
                                    } else {
                                       i_20 = i_13;
                                       i_21 = i_14;
                                       i_22 = i_13 + class217_11.field2579;
                                       i_23 = i_14 + class217_11.field2667;
                                    }

                                    if (class217_11.field2597 == 1) {
                                       class321.method6014(i_20, i_21, i_22, i_23, class217_11.field2695);
                                    } else {
                                       class202.method3912(i_20, i_21, i_22, i_23, class217_11.field2695, class217_11.field2597);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public static void method5317(int i_0) {
      class254.field3445.method3323();
   }

   static String method5318(class217 class217_0, byte b_1) {
      return class78.method1957(class268.method4987(class217_0), (byte) -30) == 0 ? null : (class217_0.field2657 != null && class217_0.field2657.trim().length() != 0 ? class217_0.field2657 : null);
   }

   static int method5316(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      int i_4;
      if (i_0 == 4200) {
         i_4 = class76.field1098[--class70.field1014];
         class76.field1093[++class221.field2747 - 1] = class26.method404(i_4).field3449;
         return 1;
      } else {
         int i_5;
         class254 class254_6;
         if (i_0 == 4201) {
            class70.field1014 -= 2;
            i_4 = class76.field1098[class70.field1014];
            i_5 = class76.field1098[class70.field1014 + 1];
            class254_6 = class26.method404(i_4);
            if (i_5 >= 1 && i_5 <= 5 && class254_6.field3426[i_5 - 1] != null) {
               class76.field1093[++class221.field2747 - 1] = class254_6.field3426[i_5 - 1];
            } else {
               class76.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else if (i_0 == 4202) {
            class70.field1014 -= 2;
            i_4 = class76.field1098[class70.field1014];
            i_5 = class76.field1098[class70.field1014 + 1];
            class254_6 = class26.method404(i_4);
            if (i_5 >= 1 && i_5 <= 5 && class254_6.field3427[i_5 - 1] != null) {
               class76.field1093[++class221.field2747 - 1] = class254_6.field3427[i_5 - 1];
            } else {
               class76.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else if (i_0 == 4203) {
            i_4 = class76.field1098[--class70.field1014];
            class76.field1098[++class70.field1014 - 1] = class26.method404(i_4).field3428;
            return 1;
         } else if (i_0 == 4204) {
            i_4 = class76.field1098[--class70.field1014];
            class76.field1098[++class70.field1014 - 1] = class26.method404(i_4).field3423 == 1 ? 1 : 0;
            return 1;
         } else {
            class254 class254_7;
            if (i_0 == 4205) {
               i_4 = class76.field1098[--class70.field1014];
               class254_7 = class26.method404(i_4);
               if (class254_7.field3444 == -1 && class254_7.field3443 >= 0) {
                  class76.field1098[++class70.field1014 - 1] = class254_7.field3443;
               } else {
                  class76.field1098[++class70.field1014 - 1] = i_4;
               }

               return 1;
            } else if (i_0 == 4206) {
               i_4 = class76.field1098[--class70.field1014];
               class254_7 = class26.method404(i_4);
               if (class254_7.field3444 >= 0 && class254_7.field3443 >= 0) {
                  class76.field1098[++class70.field1014 - 1] = class254_7.field3443;
               } else {
                  class76.field1098[++class70.field1014 - 1] = i_4;
               }

               return 1;
            } else if (i_0 == 4207) {
               i_4 = class76.field1098[--class70.field1014];
               class76.field1098[++class70.field1014 - 1] = class26.method404(i_4).field3425 ? 1 : 0;
               return 1;
            } else if (i_0 == 4208) {
               i_4 = class76.field1098[--class70.field1014];
               class254_7 = class26.method404(i_4);
               if (class254_7.field3439 == -1 && class254_7.field3400 >= 0) {
                  class76.field1098[++class70.field1014 - 1] = class254_7.field3400;
               } else {
                  class76.field1098[++class70.field1014 - 1] = i_4;
               }

               return 1;
            } else if (i_0 == 4209) {
               i_4 = class76.field1098[--class70.field1014];
               class254_7 = class26.method404(i_4);
               if (class254_7.field3439 >= 0 && class254_7.field3400 >= 0) {
                  class76.field1098[++class70.field1014 - 1] = class254_7.field3400;
               } else {
                  class76.field1098[++class70.field1014 - 1] = i_4;
               }

               return 1;
            } else if (i_0 == 4210) {
               String string_8 = class76.field1093[--class221.field2747];
               i_5 = class76.field1098[--class70.field1014];
               class25.method323(string_8, i_5 == 1, (byte) -125);
               class76.field1098[++class70.field1014 - 1] = class257.field3502;
               return 1;
            } else if (i_0 != 4211) {
               if (i_0 == 4212) {
                  class32.field280 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class39.field336 != null && class32.field280 < class257.field3502) {
                  class76.field1098[++class70.field1014 - 1] = class39.field336[++class32.field280 - 1] & 0xffff;
               } else {
                  class76.field1098[++class70.field1014 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

}
