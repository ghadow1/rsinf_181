public class class321 extends class175 {

   public static int field3870 = 0;
   public static int field3873 = 0;
   public static int field3874 = 0;
   public static int field3872 = 0;
   public static int[] field3869;
   public static int field3875;
   public static int field3871;

   public static void method5999(int[] ints_0) {
      ints_0[0] = field3874;
      ints_0[1] = field3870;
      ints_0[2] = field3872;
      ints_0[3] = field3873;
   }

   public static void method6033(int[] ints_0, int i_1, int i_2) {
      field3869 = ints_0;
      field3875 = i_1;
      field3871 = i_2;
      method5997(0, 0, i_1, i_2);
   }

   public static void method6000(int i_0, int i_1, int i_2, int i_3) {
      if (i_0 >= field3874 && i_0 < field3872) {
         if (i_1 < field3870) {
            i_2 -= field3870 - i_1;
            i_1 = field3870;
         }

         if (i_2 + i_1 > field3873) {
            i_2 = field3873 - i_1;
         }

         int i_4 = i_0 + field3875 * i_1;

         for (int i_5 = 0; i_5 < i_2; i_5++) {
            field3869[i_4 + i_5 * field3875] = i_3;
         }

      }
   }

   public static void method6012(int i_0, int i_1, int i_2, int i_3, int i_4) {
      if (i_0 < field3874) {
         i_2 -= field3874 - i_0;
         i_0 = field3874;
      }

      if (i_1 < field3870) {
         i_3 -= field3870 - i_1;
         i_1 = field3870;
      }

      if (i_0 + i_2 > field3872) {
         i_2 = field3872 - i_0;
      }

      if (i_3 + i_1 > field3873) {
         i_3 = field3873 - i_1;
      }

      int i_5 = field3875 - i_2;
      int i_6 = i_0 + field3875 * i_1;

      for (int i_7 = -i_3; i_7 < 0; i_7++) {
         for (int i_8 = -i_2; i_8 < 0; i_8++) {
            field3869[i_6++] = i_4;
         }

         i_6 += i_5;
      }

   }

   public static void method6010(int i_0, int i_1, int i_2, int i_3) {
      if (i_1 >= field3870 && i_1 < field3873) {
         if (i_0 < field3874) {
            i_2 -= field3874 - i_0;
            i_0 = field3874;
         }

         if (i_0 + i_2 > field3872) {
            i_2 = field3872 - i_0;
         }

         int i_4 = i_0 + field3875 * i_1;

         for (int i_5 = 0; i_5 < i_2; i_5++) {
            field3869[i_4 + i_5] = i_3;
         }

      }
   }

   public static void method5997(int i_0, int i_1, int i_2, int i_3) {
      if (i_0 < 0) {
         i_0 = 0;
      }

      if (i_1 < 0) {
         i_1 = 0;
      }

      if (i_2 > field3875) {
         i_2 = field3875;
      }

      if (i_3 > field3871) {
         i_3 = field3871;
      }

      field3874 = i_0;
      field3870 = i_1;
      field3872 = i_2;
      field3873 = i_3;
   }

   public static void method6025(int i_0, int i_1, int i_2, int i_3, int i_4) {
      if (i_4 != 0) {
         if (i_4 == 256) {
            method6002(i_0, i_1, i_2, i_3);
         } else {
            if (i_2 < 0) {
               i_2 = -i_2;
            }

            int i_5 = 256 - i_4;
            int i_6 = (i_3 >> 16 & 0xff) * i_4;
            int i_7 = (i_3 >> 8 & 0xff) * i_4;
            int i_8 = i_4 * (i_3 & 0xff);
            int i_12 = i_1 - i_2;
            if (i_12 < field3870) {
               i_12 = field3870;
            }

            int i_13 = i_2 + i_1 + 1;
            if (i_13 > field3873) {
               i_13 = field3873;
            }

            int i_14 = i_12;
            int i_15 = i_2 * i_2;
            int i_16 = 0;
            int i_17 = i_1 - i_12;
            int i_18 = i_17 * i_17;
            int i_19 = i_18 - i_17;
            if (i_1 > i_13) {
               i_1 = i_13;
            }

            int i_9;
            int i_10;
            int i_11;
            int i_20;
            int i_21;
            int i_22;
            int i_23;
            int i_24;
            while (i_14 < i_1) {
               while (i_19 <= i_15 || i_18 <= i_15) {
                  i_18 = i_18 + i_16 + i_16;
                  i_19 += i_16++ + i_16;
               }

               i_20 = i_0 - i_16 + 1;
               if (i_20 < field3874) {
                  i_20 = field3874;
               }

               i_21 = i_0 + i_16;
               if (i_21 > field3872) {
                  i_21 = field3872;
               }

               i_22 = i_20 + i_14 * field3875;

               for (i_23 = i_20; i_23 < i_21; i_23++) {
                  i_9 = i_5 * (field3869[i_22] >> 16 & 0xff);
                  i_10 = (field3869[i_22] >> 8 & 0xff) * i_5;
                  i_11 = i_5 * (field3869[i_22] & 0xff);
                  i_24 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
                  field3869[i_22++] = i_24;
               }

               ++i_14;
               i_18 -= i_17-- + i_17;
               i_19 -= i_17 + i_17;
            }

            i_16 = i_2;
            i_17 = -i_17;
            i_19 = i_15 + i_17 * i_17;
            i_18 = i_19 - i_2;

            for (i_19 -= i_17; i_14 < i_13; i_18 += i_17++ + i_17) {
               while (i_19 > i_15 && i_18 > i_15) {
                  i_19 -= i_16-- + i_16;
                  i_18 -= i_16 + i_16;
               }

               i_20 = i_0 - i_16;
               if (i_20 < field3874) {
                  i_20 = field3874;
               }

               i_21 = i_0 + i_16;
               if (i_21 > field3872 - 1) {
                  i_21 = field3872 - 1;
               }

               i_22 = i_20 + i_14 * field3875;

               for (i_23 = i_20; i_23 <= i_21; i_23++) {
                  i_9 = i_5 * (field3869[i_22] >> 16 & 0xff);
                  i_10 = (field3869[i_22] >> 8 & 0xff) * i_5;
                  i_11 = i_5 * (field3869[i_22] & 0xff);
                  i_24 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
                  field3869[i_22++] = i_24;
               }

               ++i_14;
               i_19 = i_19 + i_17 + i_17;
            }

         }
      }
   }

   public static void method6007(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, byte[] bytes_6, int i_7, boolean bool_8) {
      if (i_0 + i_2 >= 0 && i_3 + i_1 >= 0) {
         if (i_0 < field3875 && i_1 < field3871) {
            int i_9 = 0;
            int i_10 = 0;
            if (i_0 < 0) {
               i_9 -= i_0;
               i_2 += i_0;
            }

            if (i_1 < 0) {
               i_10 -= i_1;
               i_3 += i_1;
            }

            if (i_0 + i_2 > field3875) {
               i_2 = field3875 - i_0;
            }

            if (i_3 + i_1 > field3871) {
               i_3 = field3871 - i_1;
            }

            int i_11 = bytes_6.length / i_7;
            int i_12 = field3875 - i_2;
            int i_13 = i_4 >>> 24;
            int i_14 = i_5 >>> 24;
            int i_15;
            int i_16;
            int i_17;
            int i_18;
            int i_19;
            if (i_13 == 255 && i_14 == 255) {
               i_15 = i_0 + i_9 + (i_10 + i_1) * field3875;

               for (i_16 = i_10 + i_1; i_16 < i_3 + i_10 + i_1; i_16++) {
                  for (i_17 = i_0 + i_9; i_17 < i_0 + i_9 + i_2; i_17++) {
                     i_18 = (i_16 - i_1) % i_11;
                     i_19 = (i_17 - i_0) % i_7;
                     if (bytes_6[i_19 + i_18 * i_7] != 0) {
                        field3869[i_15++] = i_5;
                     } else {
                        field3869[i_15++] = i_4;
                     }
                  }

                  i_15 += i_12;
               }
            } else {
               i_15 = i_0 + i_9 + (i_10 + i_1) * field3875;

               for (i_16 = i_10 + i_1; i_16 < i_3 + i_10 + i_1; i_16++) {
                  for (i_17 = i_0 + i_9; i_17 < i_0 + i_9 + i_2; i_17++) {
                     i_18 = (i_16 - i_1) % i_11;
                     i_19 = (i_17 - i_0) % i_7;
                     int i_20 = i_4;
                     if (bytes_6[i_19 + i_18 * i_7] != 0) {
                        i_20 = i_5;
                     }

                     int i_21 = i_20 >>> 24;
                     int i_22 = 255 - i_21;
                     int i_23 = field3869[i_15];
                     int i_24 = ((i_20 & 0xff00ff) * i_21 + (i_23 & 0xff00ff) * i_22 & ~0xff00ff) + (i_21 * (i_20 & 0xff00) + i_22 * (i_23 & 0xff00) & 0xff0000) >> 8;
                     field3869[i_15++] = i_24;
                  }

                  i_15 += i_12;
               }
            }

         }
      }
   }

   static void method6002(int i_0, int i_1, int i_2, int i_3) {
      if (i_2 == 0) {
         method6024(i_0, i_1, i_3);
      } else {
         if (i_2 < 0) {
            i_2 = -i_2;
         }

         int i_4 = i_1 - i_2;
         if (i_4 < field3870) {
            i_4 = field3870;
         }

         int i_5 = i_2 + i_1 + 1;
         if (i_5 > field3873) {
            i_5 = field3873;
         }

         int i_6 = i_4;
         int i_7 = i_2 * i_2;
         int i_8 = 0;
         int i_9 = i_1 - i_4;
         int i_10 = i_9 * i_9;
         int i_11 = i_10 - i_9;
         if (i_1 > i_5) {
            i_1 = i_5;
         }

         int i_12;
         int i_13;
         int i_14;
         int i_15;
         while (i_6 < i_1) {
            while (i_11 <= i_7 || i_10 <= i_7) {
               i_10 = i_10 + i_8 + i_8;
               i_11 += i_8++ + i_8;
            }

            i_12 = i_0 - i_8 + 1;
            if (i_12 < field3874) {
               i_12 = field3874;
            }

            i_13 = i_0 + i_8;
            if (i_13 > field3872) {
               i_13 = field3872;
            }

            i_14 = i_12 + i_6 * field3875;

            for (i_15 = i_12; i_15 < i_13; i_15++) {
               field3869[i_14++] = i_3;
            }

            ++i_6;
            i_10 -= i_9-- + i_9;
            i_11 -= i_9 + i_9;
         }

         i_8 = i_2;
         i_9 = i_6 - i_1;
         i_11 = i_7 + i_9 * i_9;
         i_10 = i_11 - i_2;

         for (i_11 -= i_9; i_6 < i_5; i_10 += i_9++ + i_9) {
            while (i_11 > i_7 && i_10 > i_7) {
               i_11 -= i_8-- + i_8;
               i_10 -= i_8 + i_8;
            }

            i_12 = i_0 - i_8;
            if (i_12 < field3874) {
               i_12 = field3874;
            }

            i_13 = i_0 + i_8;
            if (i_13 > field3872 - 1) {
               i_13 = field3872 - 1;
            }

            i_14 = i_12 + i_6 * field3875;

            for (i_15 = i_12; i_15 <= i_13; i_15++) {
               field3869[i_14++] = i_3;
            }

            ++i_6;
            i_11 = i_11 + i_9 + i_9;
         }

      }
   }

   public static void method5996() {
      field3874 = 0;
      field3870 = 0;
      field3872 = field3875;
      field3873 = field3871;
   }

   public static void method6004(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
      if (i_0 < field3874) {
         i_2 -= field3874 - i_0;
         i_0 = field3874;
      }

      if (i_1 < field3870) {
         i_3 -= field3870 - i_1;
         i_1 = field3870;
      }

      if (i_0 + i_2 > field3872) {
         i_2 = field3872 - i_0;
      }

      if (i_3 + i_1 > field3873) {
         i_3 = field3873 - i_1;
      }

      i_4 = (i_5 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_5 * (i_4 & 0xff00) >> 8 & 0xff00);
      int i_6 = 256 - i_5;
      int i_7 = field3875 - i_2;
      int i_8 = i_0 + field3875 * i_1;

      for (int i_9 = 0; i_9 < i_3; i_9++) {
         for (int i_10 = -i_2; i_10 < 0; i_10++) {
            int i_11 = field3869[i_8];
            i_11 = ((i_11 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + (i_6 * (i_11 & 0xff00) >> 8 & 0xff00);
            field3869[i_8++] = i_11 + i_4;
         }

         i_8 += i_7;
      }

   }

   public static void method6008(int i_0, int i_1, int i_2, int i_3, int i_4) {
      method6010(i_0, i_1, i_2, i_4);
      method6010(i_0, i_3 + i_1 - 1, i_2, i_4);
      method6000(i_0, i_1, i_3, i_4);
      method6000(i_0 + i_2 - 1, i_1, i_3, i_4);
   }

   static void method6024(int i_0, int i_1, int i_2) {
      if (i_0 >= field3874 && i_1 >= field3870 && i_0 < field3872 && i_1 < field3873) {
         field3869[i_0 + field3875 * i_1] = i_2;
      }
   }

   public static void method6013(int[] ints_0) {
      field3874 = ints_0[0];
      field3870 = ints_0[1];
      field3872 = ints_0[2];
      field3873 = ints_0[3];
   }

   public static void method6005(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
      if (i_2 > 0 && i_3 > 0) {
         int i_6 = 0;
         int i_7 = 65536 / i_3;
         if (i_0 < field3874) {
            i_2 -= field3874 - i_0;
            i_0 = field3874;
         }

         if (i_1 < field3870) {
            i_6 += (field3870 - i_1) * i_7;
            i_3 -= field3870 - i_1;
            i_1 = field3870;
         }

         if (i_0 + i_2 > field3872) {
            i_2 = field3872 - i_0;
         }

         if (i_3 + i_1 > field3873) {
            i_3 = field3873 - i_1;
         }

         int i_8 = field3875 - i_2;
         int i_9 = i_0 + field3875 * i_1;

         for (int i_10 = -i_3; i_10 < 0; i_10++) {
            int i_11 = 65536 - i_6 >> 8;
            int i_12 = i_6 >> 8;
            int i_13 = (i_12 * (i_5 & 0xff00ff) + i_11 * (i_4 & 0xff00ff) & ~0xff00ff) + (i_12 * (i_5 & 0xff00) + i_11 * (i_4 & 0xff00) & 0xff0000) >>> 8;

            for (int i_14 = -i_2; i_14 < 0; i_14++) {
               field3869[i_9++] = i_13;
            }

            i_9 += i_8;
            i_6 += i_7;
         }

      }
   }

   public static void method6016(int i_0, int i_1, int i_2, int[] ints_3, int[] ints_4) {
      int i_5 = i_0 + field3875 * i_1;

      for (i_1 = 0; i_1 < ints_3.length; i_1++) {
         int i_6 = i_5 + ints_3[i_1];

         for (i_0 = -ints_4[i_1]; i_0 < 0; i_0++) {
            field3869[i_6++] = i_2;
         }

         i_5 += field3875;
      }

   }

   public static void method6009(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
      method6011(i_0, i_1, i_2, i_4, i_5);
      method6011(i_0, i_3 + i_1 - 1, i_2, i_4, i_5);
      if (i_3 >= 3) {
         method6051(i_0, i_1 + 1, i_3 - 2, i_4, i_5);
         method6051(i_0 + i_2 - 1, i_1 + 1, i_3 - 2, i_4, i_5);
      }

   }

   public static void method6014(int i_0, int i_1, int i_2, int i_3, int i_4) {
      i_2 -= i_0;
      i_3 -= i_1;
      if (i_3 == 0) {
         if (i_2 >= 0) {
            method6010(i_0, i_1, i_2 + 1, i_4);
         } else {
            method6010(i_0 + i_2, i_1, -i_2 + 1, i_4);
         }

      } else if (i_2 == 0) {
         if (i_3 >= 0) {
            method6000(i_0, i_1, i_3 + 1, i_4);
         } else {
            method6000(i_0, i_3 + i_1, -i_3 + 1, i_4);
         }

      } else {
         if (i_3 + i_2 < 0) {
            i_0 += i_2;
            i_2 = -i_2;
            i_1 += i_3;
            i_3 = -i_3;
         }

         int i_5;
         int i_6;
         if (i_2 > i_3) {
            i_1 <<= 16;
            i_1 += 32768;
            i_3 <<= 16;
            i_5 = (int)Math.floor((double)i_3 / (double)i_2 + 0.5D);
            i_2 += i_0;
            if (i_0 < field3874) {
               i_1 += i_5 * (field3874 - i_0);
               i_0 = field3874;
            }

            if (i_2 >= field3872) {
               i_2 = field3872 - 1;
            }

            while (i_0 <= i_2) {
               i_6 = i_1 >> 16;
               if (i_6 >= field3870 && i_6 < field3873) {
                  field3869[i_0 + i_6 * field3875] = i_4;
               }

               i_1 += i_5;
               ++i_0;
            }
         } else {
            i_0 <<= 16;
            i_0 += 32768;
            i_2 <<= 16;
            i_5 = (int)Math.floor((double)i_2 / (double)i_3 + 0.5D);
            i_3 += i_1;
            if (i_1 < field3870) {
               i_0 += (field3870 - i_1) * i_5;
               i_1 = field3870;
            }

            if (i_3 >= field3873) {
               i_3 = field3873 - 1;
            }

            while (i_1 <= i_3) {
               i_6 = i_0 >> 16;
               if (i_6 >= field3874 && i_6 < field3872) {
                  field3869[i_6 + field3875 * i_1] = i_4;
               }

               i_0 += i_5;
               ++i_1;
            }
         }

      }
   }

   public static void method6006(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      if (i_2 > 0 && i_3 > 0) {
         int i_8 = 0;
         int i_9 = 65536 / i_3;
         if (i_0 < field3874) {
            i_2 -= field3874 - i_0;
            i_0 = field3874;
         }

         if (i_1 < field3870) {
            i_8 += (field3870 - i_1) * i_9;
            i_3 -= field3870 - i_1;
            i_1 = field3870;
         }

         if (i_0 + i_2 > field3872) {
            i_2 = field3872 - i_0;
         }

         if (i_3 + i_1 > field3873) {
            i_3 = field3873 - i_1;
         }

         int i_10 = field3875 - i_2;
         int i_11 = i_0 + field3875 * i_1;

         for (int i_12 = -i_3; i_12 < 0; i_12++) {
            int i_13 = 65536 - i_8 >> 8;
            int i_14 = i_8 >> 8;
            int i_15 = (i_13 * i_6 + i_14 * i_7 & 0xff00) >>> 8;
            if (i_15 == 0) {
               i_11 += field3875;
               i_8 += i_9;
            } else {
               int i_16 = (i_14 * (i_5 & 0xff00ff) + i_13 * (i_4 & 0xff00ff) & ~0xff00ff) + (i_14 * (i_5 & 0xff00) + i_13 * (i_4 & 0xff00) & 0xff0000) >>> 8;
               int i_17 = 255 - i_15;
               int i_18 = ((i_16 & 0xff00ff) * i_15 >> 8 & 0xff00ff) + (i_15 * (i_16 & 0xff00) >> 8 & 0xff00);

               for (int i_19 = -i_2; i_19 < 0; i_19++) {
                  int i_20 = field3869[i_11];
                  if (i_20 == 0) {
                     field3869[i_11++] = i_18;
                  } else {
                     i_20 = ((i_20 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_20 & 0xff00) >> 8 & 0xff00);
                     field3869[i_11++] = i_18 + i_20;
                  }
               }

               i_11 += i_10;
               i_8 += i_9;
            }
         }

      }
   }

   public static void method5998(int i_0, int i_1, int i_2, int i_3) {
      if (field3874 < i_0) {
         field3874 = i_0;
      }

      if (field3870 < i_1) {
         field3870 = i_1;
      }

      if (field3872 > i_2) {
         field3872 = i_2;
      }

      if (field3873 > i_3) {
         field3873 = i_3;
      }

   }

   static void method6011(int i_0, int i_1, int i_2, int i_3, int i_4) {
      if (i_1 >= field3870 && i_1 < field3873) {
         if (i_0 < field3874) {
            i_2 -= field3874 - i_0;
            i_0 = field3874;
         }

         if (i_0 + i_2 > field3872) {
            i_2 = field3872 - i_0;
         }

         int i_5 = 256 - i_4;
         int i_6 = (i_3 >> 16 & 0xff) * i_4;
         int i_7 = (i_3 >> 8 & 0xff) * i_4;
         int i_8 = i_4 * (i_3 & 0xff);
         int i_12 = i_0 + field3875 * i_1;

         for (int i_13 = 0; i_13 < i_2; i_13++) {
            int i_9 = i_5 * (field3869[i_12] >> 16 & 0xff);
            int i_10 = (field3869[i_12] >> 8 & 0xff) * i_5;
            int i_11 = i_5 * (field3869[i_12] & 0xff);
            int i_14 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
            field3869[i_12++] = i_14;
         }

      }
   }

   static void method6051(int i_0, int i_1, int i_2, int i_3, int i_4) {
      if (i_0 >= field3874 && i_0 < field3872) {
         if (i_1 < field3870) {
            i_2 -= field3870 - i_1;
            i_1 = field3870;
         }

         if (i_2 + i_1 > field3873) {
            i_2 = field3873 - i_1;
         }

         int i_5 = 256 - i_4;
         int i_6 = (i_3 >> 16 & 0xff) * i_4;
         int i_7 = (i_3 >> 8 & 0xff) * i_4;
         int i_8 = i_4 * (i_3 & 0xff);
         int i_12 = i_0 + field3875 * i_1;

         for (int i_13 = 0; i_13 < i_2; i_13++) {
            int i_9 = i_5 * (field3869[i_12] >> 16 & 0xff);
            int i_10 = (field3869[i_12] >> 8 & 0xff) * i_5;
            int i_11 = i_5 * (field3869[i_12] & 0xff);
            int i_14 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
            field3869[i_12] = i_14;
            i_12 += field3875;
         }

      }
   }

   public static void method6022() {
      int i_0 = 0;

      int i_1;
      for (i_1 = field3875 * field3871 - 7; i_0 < i_1; field3869[i_0++] = 0) {
         field3869[i_0++] = 0;
         field3869[i_0++] = 0;
         field3869[i_0++] = 0;
         field3869[i_0++] = 0;
         field3869[i_0++] = 0;
         field3869[i_0++] = 0;
         field3869[i_0++] = 0;
      }

      for (i_1 += 7; i_0 < i_1; field3869[i_0++] = 0) {
         ;
      }

   }

}
