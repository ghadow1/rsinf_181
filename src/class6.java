import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class6 {

   static class119 field40;
   public static Comparator field29 = new class12();
   public static Comparator field30;
   public static Comparator field28;
   public static Comparator field32;
   public final List field36;

   static {
      new class5();
      field30 = new class10();
      field28 = new class11();
      field32 = new class8();
   }

   public class6(class300 class300_1, boolean bool_2) {
      int i_3 = class300_1.method5496();
      boolean bool_4 = class300_1.method5504() == 1;
      byte b_5;
      if (bool_4) {
         b_5 = 1;
      } else {
         b_5 = 0;
      }

      int i_6 = class300_1.method5496();
      this.field36 = new ArrayList(i_6);

      for (int i_7 = 0; i_7 < i_6; i_7++) {
         this.field36.add(new class7(class300_1, b_5, i_3));
      }

   }

   public void method65(Comparator comparator_1, boolean bool_2, short s_3) {
      if (bool_2) {
         Collections.sort(this.field36, comparator_1);
      } else {
         Collections.sort(this.field36, Collections.reverseOrder(comparator_1));
      }

   }

   public static class185[] method70(int i_0) {
      return new class185[] {class185.field2322, class185.field2316, class185.field2318, class185.field2317, class185.field2324, class185.field2319, class185.field2320, class185.field2321, class185.field2315, class185.field2323};
   }

   public static void method66(class233 class233_0, class233 class233_1, byte b_2) {
      class245.field3274 = class233_0;
      class288.field3665 = class233_1;
      class245.field3263 = class245.field3274.method4154(3, -946844151);
   }

   public static void method68(class233 class233_0, byte b_1) {
      class240.field3204 = class233_0;
      class240.field3203 = class240.field3204.method4154(16, -1659066369);
   }

   static final void method72(class133 class133_0, class172[] arr_1, int i_2) {
      int i_3;
      int i_4;
      int i_5;
      int i_6;
      for (i_3 = 0; i_3 < 4; i_3++) {
         for (i_4 = 0; i_4 < 104; i_4++) {
            for (i_5 = 0; i_5 < 104; i_5++) {
               if ((class55.field502[i_3][i_4][i_5] & 0x1) == 1) {
                  i_6 = i_3;
                  if ((class55.field502[1][i_4][i_5] & 0x2) == 2) {
                     i_6 = i_3 - 1;
                  }

                  if (i_6 >= 0) {
                     arr_1[i_6].method3561(i_4, i_5, -2087203619);
                  }
               }
            }
         }
      }

      class55.field519 += (int)(Math.random() * 5.0D) - 2;
      if (class55.field519 < -8) {
         class55.field519 = -8;
      }

      if (class55.field519 > 8) {
         class55.field519 = 8;
      }

      class55.field510 += (int)(Math.random() * 5.0D) - 2;
      if (class55.field510 < -16) {
         class55.field510 = -16;
      }

      if (class55.field510 > 16) {
         class55.field510 = 16;
      }

      int i_10;
      int i_11;
      int i_12;
      int i_13;
      int i_14;
      int i_15;
      int i_16;
      int i_17;
      int i_18;
      int i_19;
      for (i_3 = 0; i_3 < 4; i_3++) {
         byte[][] bytes_45 = class32.field282[i_3];
         i_10 = (int)Math.sqrt(5100.0D);
         i_11 = i_10 * 768 >> 8;

         int i_20;
         int i_21;
         for (i_12 = 1; i_12 < 103; i_12++) {
            for (i_13 = 1; i_13 < 103; i_13++) {
               i_14 = class55.field516[i_3][i_13 + 1][i_12] - class55.field516[i_3][i_13 - 1][i_12];
               i_15 = class55.field516[i_3][i_13][i_12 + 1] - class55.field516[i_3][i_13][i_12 - 1];
               i_16 = (int)Math.sqrt((double)(i_15 * i_15 + i_14 * i_14 + 65536));
               i_17 = (i_14 << 8) / i_16;
               i_18 = 65536 / i_16;
               i_19 = (i_15 << 8) / i_16;
               i_20 = (i_19 * -50 + i_17 * -50 + i_18 * -10) / i_11 + 96;
               i_21 = (bytes_45[i_13][i_12 + 1] >> 3) + (bytes_45[i_13 - 1][i_12] >> 2) + (bytes_45[i_13][i_12 - 1] >> 2) + (bytes_45[i_13 + 1][i_12] >> 3) + (bytes_45[i_13][i_12] >> 1);
               class55.field515[i_13][i_12] = i_20 - i_21;
            }
         }

         for (i_12 = 0; i_12 < 104; i_12++) {
            class229.field3103[i_12] = 0;
            class55.field508[i_12] = 0;
            class55.field507[i_12] = 0;
            class93.field1301[i_12] = 0;
            class293.field3689[i_12] = 0;
         }

         for (i_12 = -5; i_12 < 109; i_12++) {
            for (i_13 = 0; i_13 < 104; i_13++) {
               i_14 = i_12 + 5;
               if (i_14 >= 0 && i_14 < 104) {
                  i_15 = class55.field504[i_3][i_14][i_13] & 0xff;
                  if (i_15 > 0) {
                     class244 class244_46 = class59.method1117(i_15 - 1, (byte) -70);
                     class229.field3103[i_13] += class244_46.field3257;
                     class55.field508[i_13] += class244_46.field3258;
                     class55.field507[i_13] += class244_46.field3259;
                     class93.field1301[i_13] += class244_46.field3260;
                     ++class293.field3689[i_13];
                  }
               }

               i_15 = i_12 - 5;
               if (i_15 >= 0 && i_15 < 104) {
                  i_16 = class55.field504[i_3][i_15][i_13] & 0xff;
                  if (i_16 > 0) {
                     i_18 = i_16 - 1;
                     class244 class244_47 = (class244) class244.field3254.method3320((long)i_18);
                     class244 class244_48;
                     if (class244_47 != null) {
                        class244_48 = class244_47;
                     } else {
                        byte[] bytes_49 = class244.field3255.method4144(1, i_18, -2092383479);
                        class244_47 = new class244();
                        if (bytes_49 != null) {
                           class244_47.method4418(new class300(bytes_49), i_18, 1618503924);
                        }

                        class244_47.method4417(-165448710);
                        class244.field3254.method3322(class244_47, (long)i_18);
                        class244_48 = class244_47;
                     }

                     class229.field3103[i_13] -= class244_48.field3257;
                     class55.field508[i_13] -= class244_48.field3258;
                     class55.field507[i_13] -= class244_48.field3259;
                     class93.field1301[i_13] -= class244_48.field3260;
                     --class293.field3689[i_13];
                  }
               }
            }

            if (i_12 >= 1 && i_12 < 103) {
               i_13 = 0;
               i_14 = 0;
               i_15 = 0;
               i_16 = 0;
               i_17 = 0;

               for (i_18 = -5; i_18 < 109; i_18++) {
                  i_19 = i_18 + 5;
                  if (i_19 >= 0 && i_19 < 104) {
                     i_13 += class229.field3103[i_19];
                     i_14 += class55.field508[i_19];
                     i_15 += class55.field507[i_19];
                     i_16 += class93.field1301[i_19];
                     i_17 += class293.field3689[i_19];
                  }

                  i_20 = i_18 - 5;
                  if (i_20 >= 0 && i_20 < 104) {
                     i_13 -= class229.field3103[i_20];
                     i_14 -= class55.field508[i_20];
                     i_15 -= class55.field507[i_20];
                     i_16 -= class93.field1301[i_20];
                     i_17 -= class293.field3689[i_20];
                  }

                  if (i_18 >= 1 && i_18 < 103 && (!client.field656 || (class55.field502[0][i_12][i_18] & 0x2) != 0 || (class55.field502[i_3][i_12][i_18] & 0x10) == 0)) {
                     if (i_3 < class55.field503) {
                        class55.field503 = i_3;
                     }

                     i_21 = class55.field504[i_3][i_12][i_18] & 0xff;
                     int i_22 = class55.field505[i_3][i_12][i_18] & 0xff;
                     if (i_21 > 0 || i_22 > 0) {
                        int i_23 = class55.field516[i_3][i_12][i_18];
                        int i_24 = class55.field516[i_3][i_12 + 1][i_18];
                        int i_25 = class55.field516[i_3][i_12 + 1][i_18 + 1];
                        int i_26 = class55.field516[i_3][i_12][i_18 + 1];
                        int i_27 = class55.field515[i_12][i_18];
                        int i_28 = class55.field515[i_12 + 1][i_18];
                        int i_29 = class55.field515[i_12 + 1][i_18 + 1];
                        int i_30 = class55.field515[i_12][i_18 + 1];
                        int i_31 = -1;
                        int i_32 = -1;
                        int i_33;
                        int i_34;
                        int i_35;
                        if (i_21 > 0) {
                           i_33 = i_13 * 256 / i_16;
                           i_34 = i_14 / i_17;
                           i_35 = i_15 / i_17;
                           i_31 = class327.method6244(i_33, i_34, i_35, 590825496);
                           i_33 = i_33 + class55.field519 & 0xff;
                           i_35 += class55.field510;
                           if (i_35 < 0) {
                              i_35 = 0;
                           } else if (i_35 > 255) {
                              i_35 = 255;
                           }

                           i_32 = class327.method6244(i_33, i_34, i_35, -182036624);
                        }

                        class257 class257_36;
                        if (i_3 > 0) {
                           boolean bool_54 = true;
                           if (i_21 == 0 && class55.field506[i_3][i_12][i_18] != 0) {
                              bool_54 = false;
                           }

                           if (i_22 > 0) {
                              i_35 = i_22 - 1;
                              class257_36 = (class257) class257.field3503.method3320((long)i_35);
                              class257 class257_50;
                              if (class257_36 != null) {
                                 class257_50 = class257_36;
                              } else {
                                 byte[] bytes_37 = class257.field3505.method4144(4, i_35, -1727091861);
                                 class257_36 = new class257();
                                 if (bytes_37 != null) {
                                    class257_36.method4744(new class300(bytes_37), i_35, (byte) -108);
                                 }

                                 class257_36.method4743(1977976880);
                                 class257.field3503.method3322(class257_36, (long)i_35);
                                 class257_50 = class257_36;
                              }

                              if (!class257_50.field3506) {
                                 bool_54 = false;
                              }
                           }

                           if (bool_54 && i_24 == i_23 && i_23 == i_25 && i_26 == i_23) {
                              class137.field1887[i_3][i_12][i_18] |= 0x924;
                           }
                        }

                        i_33 = 0;
                        if (i_32 != -1) {
                           i_33 = class130.field1783[class77.method1948(i_32, 96, 1550273173)];
                        }

                        if (i_22 == 0) {
                           class133_0.method3071(i_3, i_12, i_18, 0, 0, -1, i_23, i_24, i_25, i_26, class77.method1948(i_31, i_27, 730668545), class77.method1948(i_31, i_28, 1795163624), class77.method1948(i_31, i_29, 1270402615), class77.method1948(i_31, i_30, 1843049924), 0, 0, 0, 0, i_33, 0);
                        } else {
                           i_34 = class55.field506[i_3][i_12][i_18] + 1;
                           byte b_55 = class268.field3561[i_3][i_12][i_18];
                           int i_51 = i_22 - 1;
                           class257 class257_38 = (class257) class257.field3503.method3320((long)i_51);
                           if (class257_38 != null) {
                              class257_36 = class257_38;
                           } else {
                              byte[] bytes_39 = class257.field3505.method4144(4, i_51, -685140278);
                              class257_38 = new class257();
                              if (bytes_39 != null) {
                                 class257_38.method4744(new class300(bytes_39), i_51, (byte) -93);
                              }

                              class257_38.method4743(-866326245);
                              class257.field3503.method3322(class257_38, (long)i_51);
                              class257_36 = class257_38;
                           }

                           int i_52 = class257_36.field3508;
                           int i_40;
                           int i_41;
                           int i_42;
                           int i_43;
                           if (i_52 >= 0) {
                              i_41 = class130.field1781.vmethod3284(i_52, 1833085397);
                              i_40 = -1;
                           } else if (class257_36.field3512 == 16711935) {
                              i_40 = -2;
                              i_52 = -1;
                              i_41 = -2;
                           } else {
                              i_40 = class327.method6244(class257_36.field3513, class257_36.field3509, class257_36.field3510, 69221161);
                              i_42 = class257_36.field3513 + class55.field519 & 0xff;
                              i_43 = class257_36.field3510 + class55.field510;
                              if (i_43 < 0) {
                                 i_43 = 0;
                              } else if (i_43 > 255) {
                                 i_43 = 255;
                              }

                              i_41 = class327.method6244(i_42, class257_36.field3509, i_43, -481515597);
                           }

                           i_42 = 0;
                           if (i_41 != -2) {
                              i_42 = class130.field1783[class112.method2517(i_41, 96, (byte) 1)];
                           }

                           if (class257_36.field3507 != -1) {
                              i_43 = class257_36.field3511 + class55.field519 & 0xff;
                              int i_44 = class257_36.field3514 + class55.field510;
                              if (i_44 < 0) {
                                 i_44 = 0;
                              } else if (i_44 > 255) {
                                 i_44 = 255;
                              }

                              i_41 = class327.method6244(i_43, class257_36.field3504, i_44, 1940950395);
                              i_42 = class130.field1783[class112.method2517(i_41, 96, (byte) 1)];
                           }

                           class133_0.method3071(i_3, i_12, i_18, i_34, b_55, i_52, i_23, i_24, i_25, i_26, class77.method1948(i_31, i_27, 1393916461), class77.method1948(i_31, i_28, 1575342974), class77.method1948(i_31, i_29, 1119072540), class77.method1948(i_31, i_30, 1315475262), class112.method2517(i_40, i_27, (byte) 1), class112.method2517(i_40, i_28, (byte) 1), class112.method2517(i_40, i_29, (byte) 1), class112.method2517(i_40, i_30, (byte) 1), i_33, i_42);
                        }
                     }
                  }
               }
            }
         }

         for (i_12 = 1; i_12 < 103; i_12++) {
            for (i_13 = 1; i_13 < 103; i_13++) {
               class133_0.method3074(i_3, i_13, i_12, class164.method3468(i_3, i_13, i_12, (byte) -93));
            }
         }

         class55.field504[i_3] = null;
         class55.field505[i_3] = null;
         class55.field506[i_3] = null;
         class268.field3561[i_3] = null;
         class32.field282[i_3] = null;
      }

      class133_0.method3097(-50, -10, -50);

      for (i_3 = 0; i_3 < 104; i_3++) {
         for (i_4 = 0; i_4 < 104; i_4++) {
            if ((class55.field502[1][i_3][i_4] & 0x2) == 2) {
               class133_0.method3068(i_3, i_4);
            }
         }
      }

      i_3 = 1;
      i_4 = 2;
      i_5 = 4;

      for (i_6 = 0; i_6 < 4; i_6++) {
         if (i_6 > 0) {
            i_3 <<= 3;
            i_4 <<= 3;
            i_5 <<= 3;
         }

         for (int i_7 = 0; i_7 <= i_6; i_7++) {
            for (int i_8 = 0; i_8 <= 104; i_8++) {
               for (int i_9 = 0; i_9 <= 104; i_9++) {
                  short s_53;
                  if ((class137.field1887[i_7][i_9][i_8] & i_3) != 0) {
                     i_10 = i_8;
                     i_11 = i_8;
                     i_12 = i_7;

                     for (i_13 = i_7; i_10 > 0 && (class137.field1887[i_7][i_9][i_10 - 1] & i_3) != 0; --i_10) {
                        ;
                     }

                     while (i_11 < 104 && (class137.field1887[i_7][i_9][i_11 + 1] & i_3) != 0) {
                        ++i_11;
                     }

                     label478:
                     while (i_12 > 0) {
                        for (i_14 = i_10; i_14 <= i_11; i_14++) {
                           if ((class137.field1887[i_12 - 1][i_9][i_14] & i_3) == 0) {
                              break label478;
                           }
                        }

                        --i_12;
                     }

                     label467:
                     while (i_13 < i_6) {
                        for (i_14 = i_10; i_14 <= i_11; i_14++) {
                           if ((class137.field1887[i_13 + 1][i_9][i_14] & i_3) == 0) {
                              break label467;
                           }
                        }

                        ++i_13;
                     }

                     i_14 = (i_13 + 1 - i_12) * (i_11 - i_10 + 1);
                     if (i_14 >= 8) {
                        s_53 = 240;
                        i_16 = class55.field516[i_13][i_9][i_10] - s_53;
                        i_17 = class55.field516[i_12][i_9][i_10];
                        class133.method3112(i_6, 1, i_9 * 128, i_9 * 128, i_10 * 128, i_11 * 128 + 128, i_16, i_17);

                        for (i_18 = i_12; i_18 <= i_13; i_18++) {
                           for (i_19 = i_10; i_19 <= i_11; i_19++) {
                              class137.field1887[i_18][i_9][i_19] &= ~i_3;
                           }
                        }
                     }
                  }

                  if ((class137.field1887[i_7][i_9][i_8] & i_4) != 0) {
                     i_10 = i_9;
                     i_11 = i_9;
                     i_12 = i_7;

                     for (i_13 = i_7; i_10 > 0 && (class137.field1887[i_7][i_10 - 1][i_8] & i_4) != 0; --i_10) {
                        ;
                     }

                     while (i_11 < 104 && (class137.field1887[i_7][i_11 + 1][i_8] & i_4) != 0) {
                        ++i_11;
                     }

                     label531:
                     while (i_12 > 0) {
                        for (i_14 = i_10; i_14 <= i_11; i_14++) {
                           if ((class137.field1887[i_12 - 1][i_14][i_8] & i_4) == 0) {
                              break label531;
                           }
                        }

                        --i_12;
                     }

                     label520:
                     while (i_13 < i_6) {
                        for (i_14 = i_10; i_14 <= i_11; i_14++) {
                           if ((class137.field1887[i_13 + 1][i_14][i_8] & i_4) == 0) {
                              break label520;
                           }
                        }

                        ++i_13;
                     }

                     i_14 = (i_11 - i_10 + 1) * (i_13 + 1 - i_12);
                     if (i_14 >= 8) {
                        s_53 = 240;
                        i_16 = class55.field516[i_13][i_10][i_8] - s_53;
                        i_17 = class55.field516[i_12][i_10][i_8];
                        class133.method3112(i_6, 2, i_10 * 128, i_11 * 128 + 128, i_8 * 128, i_8 * 128, i_16, i_17);

                        for (i_18 = i_12; i_18 <= i_13; i_18++) {
                           for (i_19 = i_10; i_19 <= i_11; i_19++) {
                              class137.field1887[i_18][i_19][i_8] &= ~i_4;
                           }
                        }
                     }
                  }

                  if ((class137.field1887[i_7][i_9][i_8] & i_5) != 0) {
                     i_10 = i_9;
                     i_11 = i_9;
                     i_12 = i_8;

                     for (i_13 = i_8; i_12 > 0 && (class137.field1887[i_7][i_9][i_12 - 1] & i_5) != 0; --i_12) {
                        ;
                     }

                     while (i_13 < 104 && (class137.field1887[i_7][i_9][i_13 + 1] & i_5) != 0) {
                        ++i_13;
                     }

                     label584:
                     while (i_10 > 0) {
                        for (i_14 = i_12; i_14 <= i_13; i_14++) {
                           if ((class137.field1887[i_7][i_10 - 1][i_14] & i_5) == 0) {
                              break label584;
                           }
                        }

                        --i_10;
                     }

                     label573:
                     while (i_11 < 104) {
                        for (i_14 = i_12; i_14 <= i_13; i_14++) {
                           if ((class137.field1887[i_7][i_11 + 1][i_14] & i_5) == 0) {
                              break label573;
                           }
                        }

                        ++i_11;
                     }

                     if ((i_11 - i_10 + 1) * (i_13 - i_12 + 1) >= 4) {
                        i_14 = class55.field516[i_7][i_10][i_12];
                        class133.method3112(i_6, 4, i_10 * 128, i_11 * 128 + 128, i_12 * 128, i_13 * 128 + 128, i_14, i_14);

                        for (i_15 = i_10; i_15 <= i_11; i_15++) {
                           for (i_16 = i_12; i_16 <= i_13; i_16++) {
                              class137.field1887[i_7][i_15][i_16] &= ~i_5;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void method71(class217 class217_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      if (client.field719) {
         client.field882 = 32;
      } else {
         client.field882 = 0;
      }

      client.field719 = false;
      int i_8;
      if (class54.field485 == 1 || !class46.field413 && class54.field485 == 4) {
         if (i_5 >= i_1 && i_5 < i_1 + 16 && i_6 >= i_2 && i_6 < i_2 + 16) {
            class217_0.field2586 -= 4;
            class224.method4120(class217_0);
         } else if (i_5 >= i_1 && i_5 < i_1 + 16 && i_6 >= i_3 + i_2 - 16 && i_6 < i_3 + i_2) {
            class217_0.field2586 += 4;
            class224.method4120(class217_0);
         } else if (i_5 >= i_1 - client.field882 && i_5 < client.field882 + i_1 + 16 && i_6 >= i_2 + 16 && i_6 < i_3 + i_2 - 16) {
            i_8 = i_3 * (i_3 - 32) / i_4;
            if (i_8 < 8) {
               i_8 = 8;
            }

            int i_9 = i_6 - i_2 - 16 - i_8 / 2;
            int i_10 = i_3 - 32 - i_8;
            class217_0.field2586 = i_9 * (i_4 - i_3) / i_10;
            class224.method4120(class217_0);
            client.field719 = true;
         }
      }

      if (client.field853 != 0) {
         i_8 = class217_0.field2579;
         if (i_5 >= i_1 - i_8 && i_6 >= i_2 && i_5 < i_1 + 16 && i_6 <= i_3 + i_2) {
            class217_0.field2586 += client.field853 * 45;
            class224.method4120(class217_0);
         }
      }

   }

}
