final class class2 implements class0 {

   static long field4;
   static class235 field6;

   void method19(Long long_1, ByteBuffer class300_2, int i_3) {
      class300_2.writeLongBigEndian(long_1.longValue());
   }

   public Object vmethod42(ByteBuffer class300_1, int i_2) {
      return Long.valueOf(class300_1.readLongFromMediumEndian());
   }

   public void vmethod43(Object object_1, ByteBuffer class300_2, int i_3) {
      this.method19((Long) object_1, class300_2, -338982282);
   }

   public static int method18(byte[] bytes_0, int i_1, int i_2, int i_3) {
      int i_4 = -1;

      for (int i_5 = i_1; i_5 < i_2; i_5++) {
         i_4 = i_4 >>> 8 ^ ByteBuffer.crc32Table[(i_4 ^ bytes_0[i_5]) & 0xff];
      }

      i_4 = ~i_4;
      return i_4;
   }

   static final void method28(int i_0) {
      class154.method3405(-1807078732);
      if (class46.field410 != null) {
         class46.field410.method5235(17638925);
      }

   }

   static final void method26(class217[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, short s_8) {
      for (int i_9 = 0; i_9 < arr_0.length; i_9++) {
         class217 class217_10 = arr_0[i_9];
         if (class217_10 != null && class217_10.field2583 == i_1 && (!class217_10.field2563 || class217_10.field2566 == 0 || class217_10.field2551 || class268.method4987(class217_10) != 0 || class217_10 == Client.field829 || class217_10.field2568 == 1338)) {
            if (class217_10.field2563) {
               if (class62.method1133(class217_10)) {
                  continue;
               }
            } else if (class217_10.field2566 == 0 && class217_10 != class72.field1059 && class62.method1133(class217_10)) {
               continue;
            }

            int i_11 = class217_10.field2577 + i_6;
            int i_12 = i_7 + class217_10.field2699;
            int i_13;
            int i_14;
            int i_15;
            int i_16;
            int i_18;
            int i_19;
            if (class217_10.field2566 == 2) {
               i_13 = i_2;
               i_14 = i_3;
               i_15 = i_4;
               i_16 = i_5;
            } else {
               int i_17;
               if (class217_10.field2566 == 9) {
                  i_17 = i_11;
                  i_18 = i_12;
                  i_19 = i_11 + class217_10.field2579;
                  int i_20 = i_12 + class217_10.field2667;
                  if (i_19 < i_11) {
                     i_17 = i_19;
                     i_19 = i_11;
                  }

                  if (i_20 < i_12) {
                     i_18 = i_20;
                     i_20 = i_12;
                  }

                  ++i_19;
                  ++i_20;
                  i_13 = i_17 > i_2 ? i_17 : i_2;
                  i_14 = i_18 > i_3 ? i_18 : i_3;
                  i_15 = i_19 < i_4 ? i_19 : i_4;
                  i_16 = i_20 < i_5 ? i_20 : i_5;
               } else {
                  i_17 = i_11 + class217_10.field2579;
                  i_18 = i_12 + class217_10.field2667;
                  i_13 = i_11 > i_2 ? i_11 : i_2;
                  i_14 = i_12 > i_3 ? i_12 : i_3;
                  i_15 = i_17 < i_4 ? i_17 : i_4;
                  i_16 = i_18 < i_5 ? i_18 : i_5;
               }
            }

            if (class217_10 == Client.field828) {
               Client.field745 = true;
               Client.field837 = i_11;
               Client.field838 = i_12;
            }

            boolean bool_33 = false;
            if (class217_10.field2704) {
               switch(Client.field817) {
               case 0:
                  bool_33 = true;
               case 1:
               default:
                  break;
               case 2:
                  if (Client.field818 == class217_10.field2688 >>> 16) {
                     bool_33 = true;
                  }
                  break;
               case 3:
                  if (class217_10.field2688 == Client.field818) {
                     bool_33 = true;
                  }
               }
            }

            if (bool_33 || !class217_10.field2563 || i_13 < i_15 && i_14 < i_16) {
               if (class217_10.field2563) {
                  class62 class62_27;
                  if (class217_10.field2580) {
                     if (class54.field492 >= i_13 && class54.field487 >= i_14 && class54.field492 < i_15 && class54.field487 < i_16) {
                        for (class62_27 = (class62) Client.field854.method4892(); class62_27 != null; class62_27 = (class62) Client.field854.method4894()) {
                           if (class62_27.field574) {
                              class62_27.unlink();
                              class62_27.field575.field2642 = false;
                           }
                        }

                        if (class80.field1143 == 0) {
                           Client.field828 = null;
                           Client.field829 = null;
                        }

                        if (!Client.field674) {
                           class77.method1945(433609873);
                        }
                     }
                  } else if (class217_10.field2697 && class54.field492 >= i_13 && class54.field487 >= i_14 && class54.field492 < i_15 && class54.field487 < i_16) {
                     for (class62_27 = (class62) Client.field854.method4892(); class62_27 != null; class62_27 = (class62) Client.field854.method4894()) {
                        if (class62_27.field574 && class62_27.field575.field2671 == class62_27.field581) {
                           class62_27.unlink();
                        }
                     }
                  }
               }

               i_18 = class54.field492;
               i_19 = class54.field487;
               if (class54.field493 != 0) {
                  i_18 = class54.field483;
                  i_19 = class54.field495;
               }

               boolean bool_34 = i_18 >= i_13 && i_19 >= i_14 && i_18 < i_15 && i_19 < i_16;
               if (class217_10.field2568 == 1337) {
                  if (!Client.field661 && !Client.field674 && bool_34) {
                     class65.method1174(i_18, i_19, i_13, i_14, -1548212436);
                  }
               } else if (class217_10.field2568 == 1338) {
                  class18.method208(class217_10, i_11, i_12, 1919867373);
               } else {
                  if (class217_10.field2568 == 1400) {
                     class136.field1875.method6335(class54.field492, class54.field487, bool_34, i_11, i_12, class217_10.field2579, class217_10.field2667, -2047217979);
                  }

                  if (!Client.field674 && bool_34) {
                     if (class217_10.field2568 == 1400) {
                        class136.field1875.method6482(i_11, i_12, class217_10.field2579, class217_10.field2667, i_18, i_19, 90618974);
                     } else {
                        class40.method703(class217_10, i_18 - i_11, i_19 - i_12, -641953545);
                     }
                  }

                  boolean bool_22;
                  int i_24;
                  if (bool_33) {
                     for (int i_21 = 0; i_21 < class217_10.field2650.length; i_21++) {
                        bool_22 = false;
                        boolean bool_23 = false;
                        if (!bool_22 && class217_10.field2650[i_21] != null) {
                           for (i_24 = 0; i_24 < class217_10.field2650[i_21].length; i_24++) {
                              boolean bool_25 = false;
                              if (class217_10.field2578 != null) {
                                 bool_25 = class45.field395[class217_10.field2650[i_21][i_24]];
                              }

                              if (InBuffer.method2244(class217_10.field2650[i_21][i_24]) || bool_25) {
                                 bool_22 = true;
                                 if (class217_10.field2578 != null && class217_10.field2578[i_21] > Client.field881) {
                                    break;
                                 }

                                 byte b_26 = class217_10.field2625[i_21][i_24];
                                 if (b_26 == 0 || ((b_26 & 0x8) == 0 || !class45.field395[86] && !class45.field395[82] && !class45.field395[81]) && ((b_26 & 0x2) == 0 || class45.field395[86]) && ((b_26 & 0x1) == 0 || class45.field395[82]) && ((b_26 & 0x4) == 0 || class45.field395[81])) {
                                    bool_23 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (bool_23) {
                           if (i_21 < 10) {
                              class91.method2163(i_21 + 1, class217_10.field2688, class217_10.field2565, class217_10.field2690, "", (byte) 120);
                           } else if (i_21 == 10) {
                              class31.method542(613868218);
                              class87.method2053(class217_10.field2688, class217_10.field2565, class78.method1957(class268.method4987(class217_10), (byte) 4), class217_10.field2690, 96373324);
                              Client.field813 = class292.method5318(class217_10, (byte) 44);
                              if (Client.field813 == null) {
                                 Client.field813 = "null";
                              }

                              Client.field814 = class217_10.field2643 + class73.method1756(16777215, -844505624);
                           }

                           i_24 = class217_10.field2641[i_21];
                           if (class217_10.field2578 == null) {
                              class217_10.field2578 = new int[class217_10.field2650.length];
                           }

                           if (class217_10.field2588 == null) {
                              class217_10.field2588 = new int[class217_10.field2650.length];
                           }

                           if (i_24 != 0) {
                              if (class217_10.field2578[i_21] == 0) {
                                 class217_10.field2578[i_21] = i_24 + Client.field881 + class217_10.field2588[i_21];
                              } else {
                                 class217_10.field2578[i_21] = i_24 + Client.field881;
                              }
                           } else {
                              class217_10.field2578[i_21] = Integer.MAX_VALUE;
                           }
                        }

                        if (!bool_22 && class217_10.field2578 != null) {
                           class217_10.field2578[i_21] = 0;
                        }
                     }
                  }

                  if (class217_10.field2563) {
                     if (class54.field492 >= i_13 && class54.field487 >= i_14 && class54.field492 < i_15 && class54.field487 < i_16) {
                        bool_34 = true;
                     } else {
                        bool_34 = false;
                     }

                     boolean bool_35 = false;
                     if ((class54.field485 == 1 || !class46.field413 && class54.field485 == 4) && bool_34) {
                        bool_35 = true;
                     }

                     bool_22 = false;
                     if ((class54.field493 == 1 || !class46.field413 && class54.field493 == 4) && class54.field483 >= i_13 && class54.field495 >= i_14 && class54.field483 < i_15 && class54.field495 < i_16) {
                        bool_22 = true;
                     }

                     if (bool_22) {
                        class60.method1118(class217_10, class54.field483 - i_11, class54.field495 - i_12, 1446112965);
                     }

                     if (class217_10.field2568 == 1400) {
                        class136.field1875.method6301(i_18, i_19, bool_34 & bool_35, bool_34 & bool_22, (byte) 24);
                     }

                     if (Client.field828 != null && class217_10 != Client.field828 && bool_34 && class23.method295(class268.method4987(class217_10), 1515733926)) {
                        Client.field832 = class217_10;
                     }

                     if (class217_10 == Client.field829) {
                        Client.field873 = true;
                        Client.field834 = i_11;
                        Client.field835 = i_12;
                     }

                     if (class217_10.field2551) {
                        class62 class62_30;
                        if (bool_34 && Client.field853 != 0 && class217_10.field2671 != null) {
                           class62_30 = new class62();
                           class62_30.field574 = true;
                           class62_30.field575 = class217_10;
                           class62_30.field577 = Client.field853;
                           class62_30.field581 = class217_10.field2671;
                           Client.field854.method4917(class62_30);
                        }

                        if (Client.field828 != null || class18.field127 != null || Client.field674) {
                           bool_22 = false;
                           bool_35 = false;
                           bool_34 = false;
                        }

                        if (!class217_10.field2589 && bool_22) {
                           class217_10.field2589 = true;
                           if (class217_10.field2652 != null) {
                              class62_30 = new class62();
                              class62_30.field574 = true;
                              class62_30.field575 = class217_10;
                              class62_30.field576 = class54.field483 - i_11;
                              class62_30.field577 = class54.field495 - i_12;
                              class62_30.field581 = class217_10.field2652;
                              Client.field854.method4917(class62_30);
                           }
                        }

                        if (class217_10.field2589 && bool_35 && class217_10.field2653 != null) {
                           class62_30 = new class62();
                           class62_30.field574 = true;
                           class62_30.field575 = class217_10;
                           class62_30.field576 = class54.field492 - i_11;
                           class62_30.field577 = class54.field487 - i_12;
                           class62_30.field581 = class217_10.field2653;
                           Client.field854.method4917(class62_30);
                        }

                        if (class217_10.field2589 && !bool_35) {
                           class217_10.field2589 = false;
                           if (class217_10.field2654 != null) {
                              class62_30 = new class62();
                              class62_30.field574 = true;
                              class62_30.field575 = class217_10;
                              class62_30.field576 = class54.field492 - i_11;
                              class62_30.field577 = class54.field487 - i_12;
                              class62_30.field581 = class217_10.field2654;
                              Client.field856.method4917(class62_30);
                           }
                        }

                        if (bool_35 && class217_10.field2637 != null) {
                           class62_30 = new class62();
                           class62_30.field574 = true;
                           class62_30.field575 = class217_10;
                           class62_30.field576 = class54.field492 - i_11;
                           class62_30.field577 = class54.field487 - i_12;
                           class62_30.field581 = class217_10.field2637;
                           Client.field854.method4917(class62_30);
                        }

                        if (!class217_10.field2642 && bool_34) {
                           class217_10.field2642 = true;
                           if (class217_10.field2608 != null) {
                              class62_30 = new class62();
                              class62_30.field574 = true;
                              class62_30.field575 = class217_10;
                              class62_30.field576 = class54.field492 - i_11;
                              class62_30.field577 = class54.field487 - i_12;
                              class62_30.field581 = class217_10.field2608;
                              Client.field854.method4917(class62_30);
                           }
                        }

                        if (class217_10.field2642 && bool_34 && class217_10.field2581 != null) {
                           class62_30 = new class62();
                           class62_30.field574 = true;
                           class62_30.field575 = class217_10;
                           class62_30.field576 = class54.field492 - i_11;
                           class62_30.field577 = class54.field487 - i_12;
                           class62_30.field581 = class217_10.field2581;
                           Client.field854.method4917(class62_30);
                        }

                        if (class217_10.field2642 && !bool_34) {
                           class217_10.field2642 = false;
                           if (class217_10.field2658 != null) {
                              class62_30 = new class62();
                              class62_30.field574 = true;
                              class62_30.field575 = class217_10;
                              class62_30.field576 = class54.field492 - i_11;
                              class62_30.field577 = class54.field487 - i_12;
                              class62_30.field581 = class217_10.field2658;
                              Client.field856.method4917(class62_30);
                           }
                        }

                        if (class217_10.field2602 != null) {
                           class62_30 = new class62();
                           class62_30.field575 = class217_10;
                           class62_30.field581 = class217_10.field2602;
                           Client.field852.method4917(class62_30);
                        }

                        class62 class62_32;
                        int i_36;
                        int i_37;
                        if (class217_10.field2626 != null && Client.field806 > class217_10.field2592) {
                           if (class217_10.field2664 != null && Client.field806 - class217_10.field2592 <= 32) {
                              label865:
                              for (i_36 = class217_10.field2592; i_36 < Client.field806; i_36++) {
                                 i_24 = Client.field863[i_36 & 0x1f];

                                 for (i_37 = 0; i_37 < class217_10.field2664.length; i_37++) {
                                    if (i_24 == class217_10.field2664[i_37]) {
                                       class62_32 = new class62();
                                       class62_32.field575 = class217_10;
                                       class62_32.field581 = class217_10.field2626;
                                       Client.field854.method4917(class62_32);
                                       break label865;
                                    }
                                 }
                              }
                           } else {
                              class62_30 = new class62();
                              class62_30.field575 = class217_10;
                              class62_30.field581 = class217_10.field2626;
                              Client.field854.method4917(class62_30);
                           }

                           class217_10.field2592 = Client.field806;
                        }

                        if (class217_10.field2665 != null && Client.field671 > class217_10.field2603) {
                           if (class217_10.field2666 != null && Client.field671 - class217_10.field2603 <= 32) {
                              label841:
                              for (i_36 = class217_10.field2603; i_36 < Client.field671; i_36++) {
                                 i_24 = Client.field888[i_36 & 0x1f];

                                 for (i_37 = 0; i_37 < class217_10.field2666.length; i_37++) {
                                    if (i_24 == class217_10.field2666[i_37]) {
                                       class62_32 = new class62();
                                       class62_32.field575 = class217_10;
                                       class62_32.field581 = class217_10.field2665;
                                       Client.field854.method4917(class62_32);
                                       break label841;
                                    }
                                 }
                              }
                           } else {
                              class62_30 = new class62();
                              class62_30.field575 = class217_10;
                              class62_30.field581 = class217_10.field2665;
                              Client.field854.method4917(class62_30);
                           }

                           class217_10.field2603 = Client.field671;
                        }

                        if (class217_10.field2594 != null && Client.field846 > class217_10.field2700) {
                           if (class217_10.field2668 != null && Client.field846 - class217_10.field2700 <= 32) {
                              label817:
                              for (i_36 = class217_10.field2700; i_36 < Client.field846; i_36++) {
                                 i_24 = Client.field845[i_36 & 0x1f];

                                 for (i_37 = 0; i_37 < class217_10.field2668.length; i_37++) {
                                    if (i_24 == class217_10.field2668[i_37]) {
                                       class62_32 = new class62();
                                       class62_32.field575 = class217_10;
                                       class62_32.field581 = class217_10.field2594;
                                       Client.field854.method4917(class62_32);
                                       break label817;
                                    }
                                 }
                              }
                           } else {
                              class62_30 = new class62();
                              class62_30.field575 = class217_10;
                              class62_30.field581 = class217_10.field2594;
                              Client.field854.method4917(class62_30);
                           }

                           class217_10.field2700 = Client.field846;
                        }

                        if (Client.field847 > class217_10.field2689 && class217_10.field2672 != null) {
                           class62_30 = new class62();
                           class62_30.field575 = class217_10;
                           class62_30.field581 = class217_10.field2672;
                           Client.field854.method4917(class62_30);
                        }

                        if (Client.field672 > class217_10.field2689 && class217_10.field2674 != null) {
                           class62_30 = new class62();
                           class62_30.field575 = class217_10;
                           class62_30.field581 = class217_10.field2674;
                           Client.field854.method4917(class62_30);
                        }

                        if (Client.field849 > class217_10.field2689 && class217_10.field2623 != null) {
                           class62_30 = new class62();
                           class62_30.field575 = class217_10;
                           class62_30.field581 = class217_10.field2623;
                           Client.field854.method4917(class62_30);
                        }

                        if (Client.field915 > class217_10.field2689 && class217_10.field2622 != null) {
                           class62_30 = new class62();
                           class62_30.field575 = class217_10;
                           class62_30.field581 = class217_10.field2622;
                           Client.field854.method4917(class62_30);
                        }

                        if (Client.field851 > class217_10.field2689 && class217_10.field2681 != null) {
                           class62_30 = new class62();
                           class62_30.field575 = class217_10;
                           class62_30.field581 = class217_10.field2681;
                           Client.field854.method4917(class62_30);
                        }

                        if (Client.field844 > class217_10.field2689 && class217_10.field2676 != null) {
                           class62_30 = new class62();
                           class62_30.field575 = class217_10;
                           class62_30.field581 = class217_10.field2676;
                           Client.field854.method4917(class62_30);
                        }

                        class217_10.field2689 = Client.field673;
                        if (class217_10.field2673 != null) {
                           for (i_36 = 0; i_36 < Client.field754; i_36++) {
                              class62 class62_31 = new class62();
                              class62_31.field575 = class217_10;
                              class62_31.field580 = Client.field921[i_36];
                              class62_31.field587 = Client.field877[i_36];
                              class62_31.field581 = class217_10.field2673;
                              Client.field854.method4917(class62_31);
                           }
                        }
                     }
                  }

                  if (!class217_10.field2563) {
                     if (Client.field828 != null || class18.field127 != null || Client.field674) {
                        continue;
                     }

                     if ((class217_10.field2685 >= 0 || class217_10.field2587 != 0) && class54.field492 >= i_13 && class54.field487 >= i_14 && class54.field492 < i_15 && class54.field487 < i_16) {
                        if (class217_10.field2685 >= 0) {
                           class72.field1059 = arr_0[class217_10.field2685];
                        } else {
                           class72.field1059 = class217_10;
                        }
                     }

                     if (class217_10.field2566 == 8 && class54.field492 >= i_13 && class54.field487 >= i_14 && class54.field492 < i_15 && class54.field487 < i_16) {
                        class32.field284 = class217_10;
                     }

                     if (class217_10.field2569 > class217_10.field2667) {
                        class6.method71(class217_10, i_11 + class217_10.field2579, i_12, class217_10.field2667, class217_10.field2569, class54.field492, class54.field487, -2024126373);
                     }
                  }

                  if (class217_10.field2566 == 0) {
                     method26(arr_0, class217_10.field2688, i_13, i_14, i_15, i_16, i_11 - class217_10.field2585, i_12 - class217_10.field2586, (short) 6626);
                     if (class217_10.field2675 != null) {
                        method26(class217_10.field2675, class217_10.field2688, i_13, i_14, i_15, i_16, i_11 - class217_10.field2585, i_12 - class217_10.field2586, (short) 18147);
                     }

                     class61 class61_28 = (class61) Client.field816.method5952((long)class217_10.field2688);
                     if (class61_28 != null) {
                        if (class61_28.field569 == 0 && class54.field492 >= i_13 && class54.field487 >= i_14 && class54.field492 < i_15 && class54.field487 < i_16 && !Client.field674) {
                           for (class62 class62_29 = (class62) Client.field854.method4892(); class62_29 != null; class62_29 = (class62) Client.field854.method4894()) {
                              if (class62_29.field574) {
                                 class62_29.unlink();
                                 class62_29.field575.field2642 = false;
                              }
                           }

                           if (class80.field1143 == 0) {
                              Client.field828 = null;
                              Client.field829 = null;
                           }

                           if (!Client.field674) {
                              class77.method1945(-1195420075);
                           }
                        }

                        class221.method4116(class61_28.field571, i_13, i_14, i_15, i_16, i_11, i_12, -1438868703);
                     }
                  }
               }
            }
         }
      }

   }

   static int method27(int i_0, int i_1, int i_2) {
      class59 class59_3 = (class59) class59.field552.method5952((long)i_0);
      return class59_3 == null ? 0 : (i_1 >= 0 && i_1 < class59_3.field551.length ? class59_3.field551[i_1] : 0);
   }

}
