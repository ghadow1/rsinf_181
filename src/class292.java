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

   static final void method5319(Widget[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
      Rasterizer2D.setClip(i_2, i_3, i_4, i_5);
      Rasterizer3D.method3051();

      for (int i_10 = 0; i_10 < arr_0.length; i_10++) {
         Widget widget_11 = arr_0[i_10];
         if (widget_11 != null && (widget_11.field2583 == i_1 || i_1 == -1412584499 && widget_11 == Client.field828)) {
            int i_12;
            if (i_8 == -1) {
               Client.field808[Client.field858] = widget_11.field2577 + i_6;
               Client.field864[Client.field858] = i_7 + widget_11.field2699;
               Client.field865[Client.field858] = widget_11.field2579;
               Client.field860[Client.field858] = widget_11.field2667;
               i_12 = ++Client.field858 - 1;
            } else {
               i_12 = i_8;
            }

            widget_11.field2701 = i_12;
            widget_11.field2702 = Client.field881;
            if (!widget_11.field2563 || !class62.method1133(widget_11)) {
               if (widget_11.field2568 > 0) {
                  class8.method85(widget_11);
               }

               int i_13 = widget_11.field2577 + i_6;
               int i_14 = i_7 + widget_11.field2699;
               int i_15 = widget_11.field2595;
               int i_16;
               int i_17;
               if (widget_11 == Client.field828) {
                  if (i_1 != -1412584499 && !widget_11.field2648) {
                     class23.field188 = arr_0;
                     class220.field2742 = i_6;
                     ClientPacketProt.field2305 = i_7;
                     continue;
                  }

                  if (Client.field839 && Client.field873) {
                     i_16 = MouseHandler.MouseHandler_x;
                     i_17 = MouseHandler.MouseHandler_y;
                     i_16 -= Client.field830;
                     i_17 -= Client.field831;
                     if (i_16 < Client.field834) {
                        i_16 = Client.field834;
                     }

                     if (i_16 + widget_11.field2579 > Client.field834 + Client.field829.field2579) {
                        i_16 = Client.field834 + Client.field829.field2579 - widget_11.field2579;
                     }

                     if (i_17 < Client.field835) {
                        i_17 = Client.field835;
                     }

                     if (i_17 + widget_11.field2667 > Client.field835 + Client.field829.field2667) {
                        i_17 = Client.field835 + Client.field829.field2667 - widget_11.field2667;
                     }

                     i_13 = i_16;
                     i_14 = i_17;
                  }

                  if (!widget_11.field2648) {
                     i_15 = 128;
                  }
               }

               int i_18;
               int i_19;
               int i_20;
               int i_21;
               int i_22;
               int i_23;
               if (widget_11.field2566 == 2) {
                  i_16 = i_2;
                  i_17 = i_3;
                  i_18 = i_4;
                  i_19 = i_5;
               } else if (widget_11.field2566 == 9) {
                  i_20 = i_13;
                  i_21 = i_14;
                  i_22 = i_13 + widget_11.field2579;
                  i_23 = i_14 + widget_11.field2667;
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
                  i_20 = i_13 + widget_11.field2579;
                  i_21 = i_14 + widget_11.field2667;
                  i_16 = i_13 > i_2 ? i_13 : i_2;
                  i_17 = i_14 > i_3 ? i_14 : i_3;
                  i_18 = i_20 < i_4 ? i_20 : i_4;
                  i_19 = i_21 < i_5 ? i_21 : i_5;
               }

               if (!widget_11.field2563 || i_16 < i_18 && i_17 < i_19) {
                  if (widget_11.field2568 != 0) {
                     if (widget_11.field2568 == 1336) {
                        if (Client.field884) {
                           i_14 += 15;
                           class169.field2054.method5348("Fps:" + GameApplet.field462, i_13 + widget_11.field2579, i_14, 16776960, -1);
                           i_14 += 15;
                           Runtime runtime_43 = Runtime.getRuntime();
                           i_21 = (int)((runtime_43.totalMemory() - runtime_43.freeMemory()) / 1024L);
                           i_22 = 16776960;
                           if (i_21 > 327680 && !Client.field656) {
                              i_22 = 16711680;
                           }

                           class169.field2054.method5348("Mem:" + i_21 + "k", i_13 + widget_11.field2579, i_14, i_22, -1);
                           i_14 += 15;
                        }
                        continue;
                     }

                     if (widget_11.field2568 == 1337) {
                        Client.field803 = i_13;
                        Client.field804 = i_14;
                        class4.method48(i_13, i_14, widget_11.field2579, widget_11.field2667, 1991855037);
                        Client.field843[widget_11.field2701] = true;
                        Rasterizer2D.setClip(i_2, i_3, i_4, i_5);
                        continue;
                     }

                     if (widget_11.field2568 == 1338) {
                        class58.method1098(widget_11, i_13, i_14, i_12);
                        Rasterizer2D.setClip(i_2, i_3, i_4, i_5);
                        continue;
                     }

                     if (widget_11.field2568 == 1339) {
                        class18.method205(widget_11, i_13, i_14, i_12, (byte) 61);
                        Rasterizer2D.setClip(i_2, i_3, i_4, i_5);
                        continue;
                     }

                     if (widget_11.field2568 == 1400) {
                        class136.field1875.method6317(i_13, i_14, widget_11.field2579, widget_11.field2667, Client.field881, -365948534);
                     }

                     if (widget_11.field2568 == 1401) {
                        class136.field1875.method6320(i_13, i_14, widget_11.field2579, widget_11.field2667);
                     }

                     if (widget_11.field2568 == 1402) {
                        class278.field3631.method1735(i_13, Client.field881);
                     }
                  }

                  if (widget_11.field2566 == 0) {
                     if (!widget_11.field2563 && class62.method1133(widget_11) && widget_11 != class72.field1059) {
                        continue;
                     }

                     if (!widget_11.field2563) {
                        if (widget_11.field2586 > widget_11.field2569 - widget_11.field2667) {
                           widget_11.field2586 = widget_11.field2569 - widget_11.field2667;
                        }

                        if (widget_11.field2586 < 0) {
                           widget_11.field2586 = 0;
                        }
                     }

                     method5319(arr_0, widget_11.field2688, i_16, i_17, i_18, i_19, i_13 - widget_11.field2585, i_14 - widget_11.field2586, i_12);
                     if (widget_11.field2675 != null) {
                        method5319(widget_11.field2675, widget_11.field2688, i_16, i_17, i_18, i_19, i_13 - widget_11.field2585, i_14 - widget_11.field2586, i_12);
                     }

                     class61 class61_31 = (class61) Client.field816.method5952((long) widget_11.field2688);
                     if (class61_31 != null) {
                        class191.method3668(class61_31.field571, i_16, i_17, i_18, i_19, i_13, i_14, i_12);
                     }

                     Rasterizer2D.setClip(i_2, i_3, i_4, i_5);
                     Rasterizer3D.method3051();
                  }

                  if (Client.field869 || Client.field862[i_12] || Client.field768 > 1) {
                     if (widget_11.field2566 == 0 && !widget_11.field2563 && widget_11.field2569 > widget_11.field2667) {
                        GrandExchangeOfferUnitPriceComparator.method4139(i_13 + widget_11.field2579, i_14, widget_11.field2586, widget_11.field2667, widget_11.field2569, (byte) -20);
                     }

                     if (widget_11.field2566 != 1) {
                        int i_24;
                        int i_25;
                        int i_26;
                        int i_27;
                        if (widget_11.field2566 == 2) {
                           i_20 = 0;

                           for (i_21 = 0; i_21 < widget_11.field2576; i_21++) {
                              for (i_22 = 0; i_22 < widget_11.field2670; i_22++) {
                                 i_23 = i_13 + i_22 * (widget_11.field2631 + 32);
                                 i_24 = i_14 + i_21 * (widget_11.field2632 + 32);
                                 if (i_20 < 20) {
                                    i_23 += widget_11.field2633[i_20];
                                    i_24 += widget_11.field2634[i_20];
                                 }

                                 if (widget_11.field2560[i_20] <= 0) {
                                    if (widget_11.field2635 != null && i_20 < 20) {
                                       class325 class325_47 = widget_11.method4038(i_20, -1022923411);
                                       if (class325_47 != null) {
                                          class325_47.drawTransBgAt(i_23, i_24);
                                       } else if (Widget.field2562) {
                                          FriendSystem.invalidateWidget(widget_11);
                                       }
                                    }
                                 } else {
                                    boolean bool_38 = false;
                                    boolean bool_39 = false;
                                    i_27 = widget_11.field2560[i_20] - 1;
                                    if (i_23 + 32 > i_2 && i_23 < i_4 && i_24 + 32 > i_3 && i_24 < i_5 || widget_11 == class18.field127 && i_20 == Client.field765) {
                                       class325 class325_28;
                                       if (Client.isItemSelected == 1 && i_20 == class23.field182 && widget_11.field2688 == class63.field594) {
                                          class325_28 = class19.method236(i_27, widget_11.field2705[i_20], 2, 0, 2, false, 2024001124);
                                       } else {
                                          class325_28 = class19.method236(i_27, widget_11.field2705[i_20], 1, 3153952, 2, false, 2024001124);
                                       }

                                       if (class325_28 != null) {
                                          if (widget_11 == class18.field127 && i_20 == Client.field765) {
                                             i_25 = MouseHandler.MouseHandler_x - Client.field654;
                                             i_26 = MouseHandler.MouseHandler_y - Client.field763;
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
                                                Widget widget_29 = arr_0[i_1 & 0xffff];
                                                int i_30;
                                                if (i_24 + i_26 < Rasterizer2D.Rasterizer2D_yClipStart && widget_29.field2586 > 0) {
                                                   i_30 = (Rasterizer2D.Rasterizer2D_yClipStart - i_24 - i_26) * Client.field718 / 3;
                                                   if (i_30 > Client.field718 * 10) {
                                                      i_30 = Client.field718 * 10;
                                                   }

                                                   if (i_30 > widget_29.field2586) {
                                                      i_30 = widget_29.field2586;
                                                   }

                                                   widget_29.field2586 -= i_30;
                                                   Client.field763 += i_30;
                                                   FriendSystem.invalidateWidget(widget_29);
                                                }

                                                if (i_26 + i_24 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && widget_29.field2586 < widget_29.field2569 - widget_29.field2667) {
                                                   i_30 = (i_26 + i_24 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field718 / 3;
                                                   if (i_30 > Client.field718 * 10) {
                                                      i_30 = Client.field718 * 10;
                                                   }

                                                   if (i_30 > widget_29.field2569 - widget_29.field2667 - widget_29.field2586) {
                                                      i_30 = widget_29.field2569 - widget_29.field2667 - widget_29.field2586;
                                                   }

                                                   widget_29.field2586 += i_30;
                                                   Client.field763 -= i_30;
                                                   FriendSystem.invalidateWidget(widget_29);
                                                }
                                             }
                                          } else if (widget_11 == class59.field549 && i_20 == Client.field698) {
                                             class325_28.method6129(i_23, i_24, 128);
                                          } else {
                                             class325_28.drawTransBgAt(i_23, i_24);
                                          }
                                       } else {
                                          FriendSystem.invalidateWidget(widget_11);
                                       }
                                    }
                                 }

                                 ++i_20;
                              }
                           }
                        } else if (widget_11.field2566 == 3) {
                           if (UserComparator10.runCs1(widget_11)) {
                              i_20 = widget_11.field2639;
                              if (widget_11 == class72.field1059 && widget_11.field2663 != 0) {
                                 i_20 = widget_11.field2663;
                              }
                           } else {
                              i_20 = widget_11.field2695;
                              if (widget_11 == class72.field1059 && widget_11.field2587 != 0) {
                                 i_20 = widget_11.field2587;
                              }
                           }

                           if (widget_11.field2571) {
                              switch(widget_11.field2693.field3886) {
                              case 1:
                                 Rasterizer2D.method6005(i_13, i_14, widget_11.field2579, widget_11.field2667, widget_11.field2695, widget_11.field2639);
                                 break;
                              case 2:
                                 Rasterizer2D.fillRectangleGradient(i_13, i_14, widget_11.field2579, widget_11.field2667, widget_11.field2695, widget_11.field2639, 255 - (widget_11.field2595 & 0xff), 255 - (widget_11.field2596 & 0xff));
                                 break;
                              default:
                                 if (i_15 == 0) {
                                    Rasterizer2D.fillRectangle(i_13, i_14, widget_11.field2579, widget_11.field2667, i_20);
                                 } else {
                                    Rasterizer2D.method6004(i_13, i_14, widget_11.field2579, widget_11.field2667, i_20, 256 - (i_15 & 0xff));
                                 }
                              }
                           } else if (i_15 == 0) {
                              Rasterizer2D.drawRectangle(i_13, i_14, widget_11.field2579, widget_11.field2667, i_20);
                           } else {
                              Rasterizer2D.drawRectangleAlpha(i_13, i_14, widget_11.field2579, widget_11.field2667, i_20, 256 - (i_15 & 0xff));
                           }
                        } else {
                           Font font_40;
                           if (widget_11.field2566 == 4) {
                              font_40 = widget_11.getFont();
                              if (font_40 == null) {
                                 if (Widget.field2562) {
                                    FriendSystem.invalidateWidget(widget_11);
                                 }
                              } else {
                                 String string_45 = widget_11.field2601;
                                 if (UserComparator10.runCs1(widget_11)) {
                                    i_21 = widget_11.field2639;
                                    if (widget_11 == class72.field1059 && widget_11.field2663 != 0) {
                                       i_21 = widget_11.field2663;
                                    }

                                    if (widget_11.field2590.length() > 0) {
                                       string_45 = widget_11.field2590;
                                    }
                                 } else {
                                    i_21 = widget_11.field2695;
                                    if (widget_11 == class72.field1059 && widget_11.field2587 != 0) {
                                       i_21 = widget_11.field2587;
                                    }
                                 }

                                 if (widget_11.field2563 && widget_11.field2690 != -1) {
                                    ItemDefinition itemDefinition_46 = class26.method404(widget_11.field2690);
                                    string_45 = itemDefinition_46.name;
                                    if (string_45 == null) {
                                       string_45 = "null";
                                    }

                                    if ((itemDefinition_46.isStackable == 1 || widget_11.field2655 != 1) && widget_11.field2655 != -1) {
                                       string_45 = class73.colorStartTag(16748608) + string_45 + "</col>" + " " + 'x' + class188.method3631(widget_11.field2655);
                                    }
                                 }

                                 if (widget_11 == Client.field850) {
                                    string_45 = "Please wait...";
                                    i_21 = widget_11.field2695;
                                 }

                                 if (!widget_11.field2563) {
                                    string_45 = class8.method92(string_45, widget_11, 16777215);
                                 }

                                 font_40.method5350(string_45, i_13, i_14, widget_11.field2579, widget_11.field2667, i_21, widget_11.field2659 ? 0 : -1, widget_11.field2628, widget_11.field2629, widget_11.field2627);
                              }
                           } else if (widget_11.field2566 == 5) {
                              class325 class325_41;
                              if (!widget_11.field2563) {
                                 class325_41 = widget_11.method4036(UserComparator10.runCs1(widget_11), 1738149818);
                                 if (class325_41 != null) {
                                    class325_41.drawTransBgAt(i_13, i_14);
                                 } else if (Widget.field2562) {
                                    FriendSystem.invalidateWidget(widget_11);
                                 }
                              } else {
                                 if (widget_11.field2690 != -1) {
                                    class325_41 = class19.method236(widget_11.field2690, widget_11.field2655, widget_11.field2559, widget_11.field2604, widget_11.field2703, false, 2024001124);
                                 } else {
                                    class325_41 = widget_11.method4036(false, 1150967465);
                                 }

                                 if (class325_41 == null) {
                                    if (Widget.field2562) {
                                       FriendSystem.invalidateWidget(widget_11);
                                    }
                                 } else {
                                    i_21 = class325_41.field3898;
                                    i_22 = class325_41.field3904;
                                    if (!widget_11.field2613) {
                                       i_23 = widget_11.field2579 * 4096 / i_21;
                                       if (widget_11.field2591 != 0) {
                                          class325_41.method6186(widget_11.field2579 / 2 + i_13, widget_11.field2667 / 2 + i_14, widget_11.field2591, i_23);
                                       } else if (i_15 != 0) {
                                          class325_41.method6131(i_13, i_14, widget_11.field2579, widget_11.field2667, 256 - (i_15 & 0xff));
                                       } else if (i_21 == widget_11.field2579 && i_22 == widget_11.field2667) {
                                          class325_41.drawTransBgAt(i_13, i_14);
                                       } else {
                                          class325_41.method6125(i_13, i_14, widget_11.field2579, widget_11.field2667);
                                       }
                                    } else {
                                       Rasterizer2D.method5998(i_13, i_14, i_13 + widget_11.field2579, i_14 + widget_11.field2667);
                                       i_23 = (i_21 - 1 + widget_11.field2579) / i_21;
                                       i_24 = (i_22 - 1 + widget_11.field2667) / i_22;

                                       for (i_25 = 0; i_25 < i_23; i_25++) {
                                          for (i_26 = 0; i_26 < i_24; i_26++) {
                                             if (widget_11.field2591 != 0) {
                                                class325_41.method6186(i_21 / 2 + i_13 + i_25 * i_21, i_22 / 2 + i_14 + i_22 * i_26, widget_11.field2591, 4096);
                                             } else if (i_15 != 0) {
                                                class325_41.method6129(i_13 + i_25 * i_21, i_14 + i_26 * i_22, 256 - (i_15 & 0xff));
                                             } else {
                                                class325_41.drawTransBgAt(i_13 + i_25 * i_21, i_14 + i_22 * i_26);
                                             }
                                          }
                                       }

                                       Rasterizer2D.setClip(i_2, i_3, i_4, i_5);
                                    }
                                 }
                              }
                           } else {
                              ItemDefinition itemDefinition_34;
                              if (widget_11.field2566 == 6) {
                                 boolean bool_37 = UserComparator10.runCs1(widget_11);
                                 if (bool_37) {
                                    i_21 = widget_11.field2612;
                                 } else {
                                    i_21 = widget_11.field2611;
                                 }

                                 class127 class127_42 = null;
                                 i_23 = 0;
                                 if (widget_11.field2690 != -1) {
                                    itemDefinition_34 = class26.method404(widget_11.field2690);
                                    if (itemDefinition_34 != null) {
                                       itemDefinition_34 = itemDefinition_34.method4656(widget_11.field2655);
                                       class127_42 = itemDefinition_34.method4644(1);
                                       if (class127_42 != null) {
                                          class127_42.method2899();
                                          i_23 = class127_42.height / 2;
                                       } else {
                                          FriendSystem.invalidateWidget(widget_11);
                                       }
                                    }
                                 } else if (widget_11.field2607 == 5) {
                                    if (widget_11.field2649 == 0) {
                                       class127_42 = Client.field918.method3997((class258) null, -1, (class258) null, -1);
                                    } else {
                                       class127_42 = Client.localPlayer.vmethod3253(759381421);
                                    }
                                 } else if (i_21 == -1) {
                                    class127_42 = widget_11.method4049((class258) null, -1, bool_37, Client.localPlayer.field613, 1036934880);
                                    if (class127_42 == null && Widget.field2562) {
                                       FriendSystem.invalidateWidget(widget_11);
                                    }
                                 } else {
                                    class258 class258_48 = class7.method81(i_21);
                                    class127_42 = widget_11.method4049(class258_48, widget_11.field2692, bool_37, Client.localPlayer.field613, 482898105);
                                    if (class127_42 == null && Widget.field2562) {
                                       FriendSystem.invalidateWidget(widget_11);
                                    }
                                 }

                                 Rasterizer3D.method2976(widget_11.field2579 / 2 + i_13, widget_11.field2667 / 2 + i_14);
                                 i_24 = Rasterizer3D.sine[widget_11.field2615] * widget_11.field2618 >> 16;
                                 i_25 = Rasterizer3D.cosine[widget_11.field2615] * widget_11.field2618 >> 16;
                                 if (class127_42 != null) {
                                    if (!widget_11.field2563) {
                                       class127_42.method2866(0, widget_11.field2616, 0, widget_11.field2615, 0, i_24, i_25);
                                    } else {
                                       class127_42.method2899();
                                       if (widget_11.field2621) {
                                          class127_42.method2876(0, widget_11.field2616, widget_11.field2640, widget_11.field2615, widget_11.field2593, i_23 + i_24 + widget_11.field2614, i_25 + widget_11.field2614, widget_11.field2618);
                                       } else {
                                          class127_42.method2866(0, widget_11.field2616, widget_11.field2640, widget_11.field2615, widget_11.field2593, i_24 + i_23 + widget_11.field2614, i_25 + widget_11.field2614);
                                       }
                                    }
                                 }

                                 Rasterizer3D.method2973();
                              } else {
                                 if (widget_11.field2566 == 7) {
                                    font_40 = widget_11.getFont();
                                    if (font_40 == null) {
                                       if (Widget.field2562) {
                                          FriendSystem.invalidateWidget(widget_11);
                                       }
                                       continue;
                                    }

                                    i_21 = 0;

                                    for (i_22 = 0; i_22 < widget_11.field2576; i_22++) {
                                       for (i_23 = 0; i_23 < widget_11.field2670; i_23++) {
                                          if (widget_11.field2560[i_21] > 0) {
                                             itemDefinition_34 = class26.method404(widget_11.field2560[i_21] - 1);
                                             String string_35;
                                             if (itemDefinition_34.isStackable != 1 && widget_11.field2705[i_21] == 1) {
                                                string_35 = class73.colorStartTag(16748608) + itemDefinition_34.name + "</col>";
                                             } else {
                                                string_35 = class73.colorStartTag(16748608) + itemDefinition_34.name + "</col>" + " " + 'x' + class188.method3631(widget_11.field2705[i_21]);
                                             }

                                             i_26 = i_23 * (widget_11.field2631 + 115) + i_13;
                                             i_27 = i_22 * (widget_11.field2632 + 12) + i_14;
                                             if (widget_11.field2628 == 0) {
                                                font_40.draw(string_35, i_26, i_27, widget_11.field2695, widget_11.field2659 ? 0 : -1);
                                             } else if (widget_11.field2628 == 1) {
                                                font_40.method5341(string_35, widget_11.field2579 / 2 + i_26, i_27, widget_11.field2695, widget_11.field2659 ? 0 : -1);
                                             } else {
                                                font_40.method5348(string_35, i_26 + widget_11.field2579 - 1, i_27, widget_11.field2695, widget_11.field2659 ? 0 : -1);
                                             }
                                          }

                                          ++i_21;
                                       }
                                    }
                                 }

                                 if (widget_11.field2566 == 8 && widget_11 == class32.field284 && Client.field833 == Client.field840) {
                                    i_20 = 0;
                                    i_21 = 0;
                                    Font font_32 = class169.field2054;
                                    String string_33 = widget_11.field2601;

                                    String string_44;
                                    for (string_33 = class8.method92(string_33, widget_11, 16777215); string_33.length() > 0; i_21 = i_21 + font_32.field3709 + 1) {
                                       i_25 = string_33.indexOf("<br>");
                                       if (i_25 != -1) {
                                          string_44 = string_33.substring(0, i_25);
                                          string_33 = string_33.substring(i_25 + 4);
                                       } else {
                                          string_44 = string_33;
                                          string_33 = "";
                                       }

                                       i_26 = font_32.method5417(string_44);
                                       if (i_26 > i_20) {
                                          i_20 = i_26;
                                       }
                                    }

                                    i_20 += 6;
                                    i_21 += 7;
                                    i_25 = i_13 + widget_11.field2579 - 5 - i_20;
                                    i_26 = i_14 + widget_11.field2667 + 5;
                                    if (i_25 < i_13 + 5) {
                                       i_25 = i_13 + 5;
                                    }

                                    if (i_25 + i_20 > i_4) {
                                       i_25 = i_4 - i_20;
                                    }

                                    if (i_21 + i_26 > i_5) {
                                       i_26 = i_5 - i_21;
                                    }

                                    Rasterizer2D.fillRectangle(i_25, i_26, i_20, i_21, 16777120);
                                    Rasterizer2D.drawRectangle(i_25, i_26, i_20, i_21, 0);
                                    string_33 = widget_11.field2601;
                                    i_27 = i_26 + font_32.field3709 + 2;

                                    for (string_33 = class8.method92(string_33, widget_11, 16777215); string_33.length() > 0; i_27 = i_27 + font_32.field3709 + 1) {
                                       int i_36 = string_33.indexOf("<br>");
                                       if (i_36 != -1) {
                                          string_44 = string_33.substring(0, i_36);
                                          string_33 = string_33.substring(i_36 + 4);
                                       } else {
                                          string_44 = string_33;
                                          string_33 = "";
                                       }

                                       font_32.draw(string_44, i_25 + 3, i_27, 0, -1);
                                    }
                                 }

                                 if (widget_11.field2566 == 9) {
                                    if (widget_11.field2598) {
                                       i_20 = i_13;
                                       i_21 = i_14 + widget_11.field2667;
                                       i_22 = i_13 + widget_11.field2579;
                                       i_23 = i_14;
                                    } else {
                                       i_20 = i_13;
                                       i_21 = i_14;
                                       i_22 = i_13 + widget_11.field2579;
                                       i_23 = i_14 + widget_11.field2667;
                                    }

                                    if (widget_11.field2597 == 1) {
                                       Rasterizer2D.method6014(i_20, i_21, i_22, i_23, widget_11.field2695);
                                    } else {
                                       class202.method3912(i_20, i_21, i_22, i_23, widget_11.field2695, widget_11.field2597);
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
      ItemDefinition.field3445.method3323();
   }

   static String method5318(Widget widget_0, byte b_1) {
      return class78.method1957(class268.method4987(widget_0), (byte) -30) == 0 ? null : (widget_0.field2657 != null && widget_0.field2657.trim().length() != 0 ? widget_0.field2657 : null);
   }

   static int method5316(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      int i_4;
      if (i_0 == 4200) {
         i_4 = MouseRecorder.field1098[--class70.field1014];
         MouseRecorder.field1093[++class221.field2747 - 1] = class26.method404(i_4).name;
         return 1;
      } else {
         int i_5;
         ItemDefinition itemDefinition_6;
         if (i_0 == 4201) {
            class70.field1014 -= 2;
            i_4 = MouseRecorder.field1098[class70.field1014];
            i_5 = MouseRecorder.field1098[class70.field1014 + 1];
            itemDefinition_6 = class26.method404(i_4);
            if (i_5 >= 1 && i_5 <= 5 && itemDefinition_6.groundActions[i_5 - 1] != null) {
               MouseRecorder.field1093[++class221.field2747 - 1] = itemDefinition_6.groundActions[i_5 - 1];
            } else {
               MouseRecorder.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else if (i_0 == 4202) {
            class70.field1014 -= 2;
            i_4 = MouseRecorder.field1098[class70.field1014];
            i_5 = MouseRecorder.field1098[class70.field1014 + 1];
            itemDefinition_6 = class26.method404(i_4);
            if (i_5 >= 1 && i_5 <= 5 && itemDefinition_6.inventoryActions[i_5 - 1] != null) {
               MouseRecorder.field1093[++class221.field2747 - 1] = itemDefinition_6.inventoryActions[i_5 - 1];
            } else {
               MouseRecorder.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else if (i_0 == 4203) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            MouseRecorder.field1098[++class70.field1014 - 1] = class26.method404(i_4).price;
            return 1;
         } else if (i_0 == 4204) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            MouseRecorder.field1098[++class70.field1014 - 1] = class26.method404(i_4).isStackable == 1 ? 1 : 0;
            return 1;
         } else {
            ItemDefinition itemDefinition_7;
            if (i_0 == 4205) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               itemDefinition_7 = class26.method404(i_4);
               if (itemDefinition_7.field3444 == -1 && itemDefinition_7.field3443 >= 0) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = itemDefinition_7.field3443;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = i_4;
               }

               return 1;
            } else if (i_0 == 4206) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               itemDefinition_7 = class26.method404(i_4);
               if (itemDefinition_7.field3444 >= 0 && itemDefinition_7.field3443 >= 0) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = itemDefinition_7.field3443;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = i_4;
               }

               return 1;
            } else if (i_0 == 4207) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               MouseRecorder.field1098[++class70.field1014 - 1] = class26.method404(i_4).isMembersOnly ? 1 : 0;
               return 1;
            } else if (i_0 == 4208) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               itemDefinition_7 = class26.method404(i_4);
               if (itemDefinition_7.field3439 == -1 && itemDefinition_7.field3400 >= 0) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = itemDefinition_7.field3400;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = i_4;
               }

               return 1;
            } else if (i_0 == 4209) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               itemDefinition_7 = class26.method404(i_4);
               if (itemDefinition_7.field3439 >= 0 && itemDefinition_7.field3400 >= 0) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = itemDefinition_7.field3400;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = i_4;
               }

               return 1;
            } else if (i_0 == 4210) {
               String string_8 = MouseRecorder.field1093[--class221.field2747];
               i_5 = MouseRecorder.field1098[--class70.field1014];
               class25.method323(string_8, i_5 == 1, (byte) -125);
               MouseRecorder.field1098[++class70.field1014 - 1] = class257.field3502;
               return 1;
            } else if (i_0 != 4211) {
               if (i_0 == 4212) {
                  class32.field280 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (WorldMapSection1.field336 != null && class32.field280 < class257.field3502) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = WorldMapSection1.field336[++class32.field280 - 1] & 0xffff;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

}
