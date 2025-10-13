public final class class304 {

   static class303 field3787 = new class303();

   public static int method5772(byte[] bytes_0, int i_1, byte[] bytes_2, int i_3, int i_4) {
      class303 class303_5 = field3787;
      synchronized(field3787) {
         field3787.field3777 = bytes_2;
         field3787.field3742 = i_4;
         field3787.field3750 = bytes_0;
         field3787.field3751 = 0;
         field3787.field3752 = i_1;
         field3787.field3757 = 0;
         field3787.field3756 = 0;
         field3787.field3754 = 0;
         field3787.field3753 = 0;
         method5774(field3787);
         i_1 -= field3787.field3752;
         field3787.field3777 = null;
         field3787.field3750 = null;
         return i_1;
      }
   }

   static void method5774(class303 class303_0) {
      boolean bool_4 = false;
      boolean bool_5 = false;
      boolean bool_6 = false;
      boolean bool_7 = false;
      boolean bool_8 = false;
      boolean bool_9 = false;
      boolean bool_10 = false;
      boolean bool_11 = false;
      boolean bool_12 = false;
      boolean bool_13 = false;
      boolean bool_14 = false;
      boolean bool_15 = false;
      boolean bool_16 = false;
      boolean bool_17 = false;
      boolean bool_18 = false;
      boolean bool_19 = false;
      boolean bool_20 = false;
      boolean bool_21 = false;
      int i_22 = 0;
      int[] ints_23 = null;
      int[] ints_24 = null;
      int[] ints_25 = null;
      class303_0.field3758 = 1;
      if (class248.field3299 == null) {
         class248.field3299 = new int[class303_0.field3758 * 100000];
      }

      boolean bool_26 = true;

      while (true) {
         while (bool_26) {
            byte b_1 = method5775(class303_0);
            if (b_1 == 23) {
               return;
            }

            b_1 = method5775(class303_0);
            b_1 = method5775(class303_0);
            b_1 = method5775(class303_0);
            b_1 = method5775(class303_0);
            b_1 = method5775(class303_0);
            b_1 = method5775(class303_0);
            b_1 = method5775(class303_0);
            b_1 = method5775(class303_0);
            b_1 = method5775(class303_0);
            b_1 = method5776(class303_0);
            if (b_1 != 0) {
               ;
            }

            class303_0.field3759 = 0;
            b_1 = method5775(class303_0);
            class303_0.field3759 = class303_0.field3759 << 8 | b_1 & 0xff;
            b_1 = method5775(class303_0);
            class303_0.field3759 = class303_0.field3759 << 8 | b_1 & 0xff;
            b_1 = method5775(class303_0);
            class303_0.field3759 = class303_0.field3759 << 8 | b_1 & 0xff;

            int i_36;
            for (i_36 = 0; i_36 < 16; i_36++) {
               b_1 = method5776(class303_0);
               if (b_1 == 1) {
                  class303_0.field3767[i_36] = true;
               } else {
                  class303_0.field3767[i_36] = false;
               }
            }

            for (i_36 = 0; i_36 < 256; i_36++) {
               class303_0.field3747[i_36] = false;
            }

            int i_37;
            for (i_36 = 0; i_36 < 16; i_36++) {
               if (class303_0.field3767[i_36]) {
                  for (i_37 = 0; i_37 < 16; i_37++) {
                     b_1 = method5776(class303_0);
                     if (b_1 == 1) {
                        class303_0.field3747[i_37 + i_36 * 16] = true;
                     }
                  }
               }
            }

            method5795(class303_0);
            int i_39 = class303_0.field3766 + 2;
            int i_40 = method5777(3, class303_0);
            int i_41 = method5777(15, class303_0);

            for (i_36 = 0; i_36 < i_41; i_36++) {
               i_37 = 0;

               while (true) {
                  b_1 = method5776(class303_0);
                  if (b_1 == 0) {
                     class303_0.field3772[i_36] = (byte)i_37;
                     break;
                  }

                  ++i_37;
               }
            }

            byte[] bytes_27 = new byte[6];

            byte b_29;
            for (b_29 = 0; b_29 < i_40; bytes_27[b_29] = b_29++) {
               ;
            }

            for (i_36 = 0; i_36 < i_41; i_36++) {
               b_29 = class303_0.field3772[i_36];

               byte b_28;
               for (b_28 = bytes_27[b_29]; b_29 > 0; --b_29) {
                  bytes_27[b_29] = bytes_27[b_29 - 1];
               }

               bytes_27[0] = b_28;
               class303_0.field3771[i_36] = b_28;
            }

            int i_38;
            for (i_38 = 0; i_38 < i_40; i_38++) {
               int i_50 = method5777(5, class303_0);

               for (i_36 = 0; i_36 < i_39; i_36++) {
                  while (true) {
                     b_1 = method5776(class303_0);
                     if (b_1 == 0) {
                        class303_0.field3773[i_38][i_36] = (byte)i_50;
                        break;
                     }

                     b_1 = method5776(class303_0);
                     if (b_1 == 0) {
                        ++i_50;
                     } else {
                        --i_50;
                     }
                  }
               }
            }

            for (i_38 = 0; i_38 < i_40; i_38++) {
               byte b_2 = 32;
               byte b_3 = 0;

               for (i_36 = 0; i_36 < i_39; i_36++) {
                  if (class303_0.field3773[i_38][i_36] > b_3) {
                     b_3 = class303_0.field3773[i_38][i_36];
                  }

                  if (class303_0.field3773[i_38][i_36] < b_2) {
                     b_2 = class303_0.field3773[i_38][i_36];
                  }
               }

               method5779(class303_0.field3774[i_38], class303_0.field3775[i_38], class303_0.field3763[i_38], class303_0.field3773[i_38], b_2, b_3, i_39);
               class303_0.field3744[i_38] = b_2;
            }

            int i_42 = class303_0.field3766 + 1;
            int i_43 = -1;
            byte b_44 = 0;

            for (i_36 = 0; i_36 <= 255; i_36++) {
               class303_0.field3762[i_36] = 0;
            }

            int i_56 = 4095;

            int i_35;
            int i_55;
            for (i_35 = 15; i_35 >= 0; --i_35) {
               for (i_55 = 15; i_55 >= 0; --i_55) {
                  class303_0.field3769[i_56] = (byte)(i_55 + i_35 * 16);
                  --i_56;
               }

               class303_0.field3770[i_35] = i_56 + 1;
            }

            int i_47 = 0;
            byte b_54;
            if (b_44 == 0) {
               ++i_43;
               b_44 = 50;
               b_54 = class303_0.field3771[i_43];
               i_22 = class303_0.field3744[b_54];
               ints_23 = class303_0.field3774[b_54];
               ints_25 = class303_0.field3763[b_54];
               ints_24 = class303_0.field3775[b_54];
            }

            int i_45 = b_44 - 1;
            int i_51 = i_22;

            int i_52;
            byte b_53;
            for (i_52 = method5777(i_22, class303_0); i_52 > ints_23[i_51]; i_52 = i_52 << 1 | b_53) {
               ++i_51;
               b_53 = method5776(class303_0);
            }

            int i_46 = ints_25[i_52 - ints_24[i_51]];

            while (true) {
               while (i_46 != i_42) {
                  if (i_46 != 0 && i_46 != 1) {
                     int i_33 = i_46 - 1;
                     int i_30;
                     if (i_33 < 16) {
                        i_30 = class303_0.field3770[0];

                        for (b_1 = class303_0.field3769[i_30 + i_33]; i_33 > 3; i_33 -= 4) {
                           int i_34 = i_30 + i_33;
                           class303_0.field3769[i_34] = class303_0.field3769[i_34 - 1];
                           class303_0.field3769[i_34 - 1] = class303_0.field3769[i_34 - 2];
                           class303_0.field3769[i_34 - 2] = class303_0.field3769[i_34 - 3];
                           class303_0.field3769[i_34 - 3] = class303_0.field3769[i_34 - 4];
                        }

                        while (i_33 > 0) {
                           class303_0.field3769[i_30 + i_33] = class303_0.field3769[i_30 + i_33 - 1];
                           --i_33;
                        }

                        class303_0.field3769[i_30] = b_1;
                     } else {
                        int i_31 = i_33 / 16;
                        int i_32 = i_33 % 16;
                        i_30 = class303_0.field3770[i_31] + i_32;

                        for (b_1 = class303_0.field3769[i_30]; i_30 > class303_0.field3770[i_31]; --i_30) {
                           class303_0.field3769[i_30] = class303_0.field3769[i_30 - 1];
                        }

                        ++class303_0.field3770[i_31];

                        while (i_31 > 0) {
                           --class303_0.field3770[i_31];
                           class303_0.field3769[class303_0.field3770[i_31]] = class303_0.field3769[class303_0.field3770[i_31 - 1] + 16 - 1];
                           --i_31;
                        }

                        --class303_0.field3770[0];
                        class303_0.field3769[class303_0.field3770[0]] = b_1;
                        if (class303_0.field3770[0] == 0) {
                           i_56 = 4095;

                           for (i_35 = 15; i_35 >= 0; --i_35) {
                              for (i_55 = 15; i_55 >= 0; --i_55) {
                                 class303_0.field3769[i_56] = class303_0.field3769[class303_0.field3770[i_35] + i_55];
                                 --i_56;
                              }

                              class303_0.field3770[i_35] = i_56 + 1;
                           }
                        }
                     }

                     ++class303_0.field3762[class303_0.field3768[b_1 & 0xff] & 0xff];
                     class248.field3299[i_47] = class303_0.field3768[b_1 & 0xff] & 0xff;
                     ++i_47;
                     if (i_45 == 0) {
                        ++i_43;
                        i_45 = 50;
                        b_54 = class303_0.field3771[i_43];
                        i_22 = class303_0.field3744[b_54];
                        ints_23 = class303_0.field3774[b_54];
                        ints_25 = class303_0.field3763[b_54];
                        ints_24 = class303_0.field3775[b_54];
                     }

                     --i_45;
                     i_51 = i_22;

                     for (i_52 = method5777(i_22, class303_0); i_52 > ints_23[i_51]; i_52 = i_52 << 1 | b_53) {
                        ++i_51;
                        b_53 = method5776(class303_0);
                     }

                     i_46 = ints_25[i_52 - ints_24[i_51]];
                  } else {
                     int i_48 = -1;
                     int i_49 = 1;

                     do {
                        if (i_46 == 0) {
                           i_48 += i_49;
                        } else if (i_46 == 1) {
                           i_48 += i_49 * 2;
                        }

                        i_49 *= 2;
                        if (i_45 == 0) {
                           ++i_43;
                           i_45 = 50;
                           b_54 = class303_0.field3771[i_43];
                           i_22 = class303_0.field3744[b_54];
                           ints_23 = class303_0.field3774[b_54];
                           ints_25 = class303_0.field3763[b_54];
                           ints_24 = class303_0.field3775[b_54];
                        }

                        --i_45;
                        i_51 = i_22;

                        for (i_52 = method5777(i_22, class303_0); i_52 > ints_23[i_51]; i_52 = i_52 << 1 | b_53) {
                           ++i_51;
                           b_53 = method5776(class303_0);
                        }

                        i_46 = ints_25[i_52 - ints_24[i_51]];
                     } while (i_46 == 0 || i_46 == 1);

                     ++i_48;
                     b_1 = class303_0.field3768[class303_0.field3769[class303_0.field3770[0]] & 0xff];

                     for (class303_0.field3762[b_1 & 0xff] += i_48; i_48 > 0; --i_48) {
                        class248.field3299[i_47] = b_1 & 0xff;
                        ++i_47;
                     }
                  }
               }

               class303_0.field3755 = 0;
               class303_0.field3741 = 0;
               class303_0.field3764[0] = 0;

               for (i_36 = 1; i_36 <= 256; i_36++) {
                  class303_0.field3764[i_36] = class303_0.field3762[i_36 - 1];
               }

               for (i_36 = 1; i_36 <= 256; i_36++) {
                  class303_0.field3764[i_36] += class303_0.field3764[i_36 - 1];
               }

               for (i_36 = 0; i_36 < i_47; i_36++) {
                  b_1 = (byte)(class248.field3299[i_36] & 0xff);
                  class248.field3299[class303_0.field3764[b_1 & 0xff]] |= i_36 << 8;
                  ++class303_0.field3764[b_1 & 0xff];
               }

               class303_0.field3760 = class248.field3299[class303_0.field3759] >> 8;
               class303_0.field3749 = 0;
               class303_0.field3760 = class248.field3299[class303_0.field3760];
               class303_0.field3761 = (byte)(class303_0.field3760 & 0xff);
               class303_0.field3760 >>= 8;
               ++class303_0.field3749;
               class303_0.field3776 = i_47;
               method5773(class303_0);
               if (class303_0.field3776 + 1 == class303_0.field3749 && class303_0.field3755 == 0) {
                  bool_26 = true;
                  break;
               }

               bool_26 = false;
               break;
            }
         }

         return;
      }
   }

   static byte method5775(class303 class303_0) {
      return (byte)method5777(8, class303_0);
   }

   static int method5777(int i_0, class303 class303_1) {
      while (class303_1.field3757 < i_0) {
         class303_1.field3756 = class303_1.field3756 << 8 | class303_1.field3777[class303_1.field3742] & 0xff;
         class303_1.field3757 += 8;
         ++class303_1.field3742;
         ++class303_1.field3754;
         if (class303_1.field3754 == 0) {
            ;
         }
      }

      int i_2 = class303_1.field3756 >> class303_1.field3757 - i_0 & (1 << i_0) - 1;
      class303_1.field3757 -= i_0;
      return i_2;
   }

   static byte method5776(class303 class303_0) {
      return (byte)method5777(1, class303_0);
   }

   static void method5795(class303 class303_0) {
      class303_0.field3766 = 0;

      for (int i_1 = 0; i_1 < 256; i_1++) {
         if (class303_0.field3747[i_1]) {
            class303_0.field3768[class303_0.field3766] = (byte)i_1;
            ++class303_0.field3766;
         }
      }

   }

   static void method5779(int[] ints_0, int[] ints_1, int[] ints_2, byte[] bytes_3, int i_4, int i_5, int i_6) {
      int i_7 = 0;

      int i_8;
      for (i_8 = i_4; i_8 <= i_5; i_8++) {
         for (int i_9 = 0; i_9 < i_6; i_9++) {
            if (i_8 == bytes_3[i_9]) {
               ints_2[i_7] = i_9;
               ++i_7;
            }
         }
      }

      for (i_8 = 0; i_8 < 23; i_8++) {
         ints_1[i_8] = 0;
      }

      for (i_8 = 0; i_8 < i_6; i_8++) {
         ++ints_1[bytes_3[i_8] + 1];
      }

      for (i_8 = 1; i_8 < 23; i_8++) {
         ints_1[i_8] += ints_1[i_8 - 1];
      }

      for (i_8 = 0; i_8 < 23; i_8++) {
         ints_0[i_8] = 0;
      }

      int i_10 = 0;

      for (i_8 = i_4; i_8 <= i_5; i_8++) {
         i_10 += ints_1[i_8 + 1] - ints_1[i_8];
         ints_0[i_8] = i_10 - 1;
         i_10 <<= 1;
      }

      for (i_8 = i_4 + 1; i_8 <= i_5; i_8++) {
         ints_1[i_8] = (ints_0[i_8 - 1] + 1 << 1) - ints_1[i_8];
      }

   }

   static void method5773(class303 class303_0) {
      byte b_2 = class303_0.field3741;
      int i_3 = class303_0.field3755;
      int i_4 = class303_0.field3749;
      int i_5 = class303_0.field3761;
      int[] ints_6 = class248.field3299;
      int i_7 = class303_0.field3760;
      byte[] bytes_8 = class303_0.field3750;
      int i_9 = class303_0.field3751;
      int i_10 = class303_0.field3752;
      int i_12 = class303_0.field3776 + 1;

      label61:
      while (true) {
         if (i_3 > 0) {
            while (true) {
               if (i_10 == 0) {
                  break label61;
               }

               if (i_3 == 1) {
                  if (i_10 == 0) {
                     i_3 = 1;
                     break label61;
                  }

                  bytes_8[i_9] = b_2;
                  ++i_9;
                  --i_10;
                  break;
               }

               bytes_8[i_9] = b_2;
               --i_3;
               ++i_9;
               --i_10;
            }
         }

         while (i_4 != i_12) {
            b_2 = (byte)i_5;
            i_7 = ints_6[i_7];
            byte b_1 = (byte)i_7;
            i_7 >>= 8;
            ++i_4;
            if (b_1 != i_5) {
               i_5 = b_1;
               if (i_10 == 0) {
                  i_3 = 1;
                  break label61;
               }

               bytes_8[i_9] = b_2;
               ++i_9;
               --i_10;
            } else {
               if (i_4 != i_12) {
                  i_3 = 2;
                  i_7 = ints_6[i_7];
                  b_1 = (byte)i_7;
                  i_7 >>= 8;
                  ++i_4;
                  if (i_4 != i_12) {
                     if (b_1 != i_5) {
                        i_5 = b_1;
                     } else {
                        i_3 = 3;
                        i_7 = ints_6[i_7];
                        b_1 = (byte)i_7;
                        i_7 >>= 8;
                        ++i_4;
                        if (i_4 != i_12) {
                           if (b_1 != i_5) {
                              i_5 = b_1;
                           } else {
                              i_7 = ints_6[i_7];
                              b_1 = (byte)i_7;
                              i_7 >>= 8;
                              ++i_4;
                              i_3 = (b_1 & 0xff) + 4;
                              i_7 = ints_6[i_7];
                              i_5 = (byte)i_7;
                              i_7 >>= 8;
                              ++i_4;
                           }
                        }
                     }
                  }
                  continue label61;
               }

               if (i_10 == 0) {
                  i_3 = 1;
                  break label61;
               }

               bytes_8[i_9] = b_2;
               ++i_9;
               --i_10;
            }
         }

         i_3 = 0;
         break;
      }

      int i_13 = class303_0.field3753;
      class303_0.field3753 += i_10 - i_10;
      if (class303_0.field3753 < i_13) {
         ;
      }

      class303_0.field3741 = b_2;
      class303_0.field3755 = i_3;
      class303_0.field3749 = i_4;
      class303_0.field3761 = i_5;
      class248.field3299 = ints_6;
      class303_0.field3760 = i_7;
      class303_0.field3750 = bytes_8;
      class303_0.field3751 = i_9;
      class303_0.field3752 = i_10;
   }

}
