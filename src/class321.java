public class class321 extends DualNode {

   public static int Rasterizer2D_yClipStart = 0;
   public static int Rasterizer2D_yClipEnd = 0;
   public static int Rasterizer2D_xClipStart = 0;
   public static int Rasterizer2D_xClipEnd = 0;
   public static int[] Rasterizer2D_pixels;
   public static int Rasterizer2D_width;
   public static int Rasterizer2D_height;

   public static void method5999(int[] ints_0) {
      ints_0[0] = Rasterizer2D_xClipStart;
      ints_0[1] = Rasterizer2D_yClipStart;
      ints_0[2] = Rasterizer2D_xClipEnd;
      ints_0[3] = Rasterizer2D_yClipEnd;
   }

   public static void method6033(int[] ints_0, int i_1, int i_2) {
      Rasterizer2D_pixels = ints_0;
      Rasterizer2D_width = i_1;
      Rasterizer2D_height = i_2;
      method5997(0, 0, i_1, i_2);
   }

   public static void method6000(int i_0, int i_1, int i_2, int i_3) {
      if (i_0 >= Rasterizer2D_xClipStart && i_0 < Rasterizer2D_xClipEnd) {
         if (i_1 < Rasterizer2D_yClipStart) {
            i_2 -= Rasterizer2D_yClipStart - i_1;
            i_1 = Rasterizer2D_yClipStart;
         }

         if (i_2 + i_1 > Rasterizer2D_yClipEnd) {
            i_2 = Rasterizer2D_yClipEnd - i_1;
         }

         int i_4 = i_0 + Rasterizer2D_width * i_1;

         for (int i_5 = 0; i_5 < i_2; i_5++) {
            Rasterizer2D_pixels[i_4 + i_5 * Rasterizer2D_width] = i_3;
         }

      }
   }

   public static void fillRectangle(int i_0, int i_1, int i_2, int i_3, int i_4) {
      if (i_0 < Rasterizer2D_xClipStart) {
         i_2 -= Rasterizer2D_xClipStart - i_0;
         i_0 = Rasterizer2D_xClipStart;
      }

      if (i_1 < Rasterizer2D_yClipStart) {
         i_3 -= Rasterizer2D_yClipStart - i_1;
         i_1 = Rasterizer2D_yClipStart;
      }

      if (i_0 + i_2 > Rasterizer2D_xClipEnd) {
         i_2 = Rasterizer2D_xClipEnd - i_0;
      }

      if (i_3 + i_1 > Rasterizer2D_yClipEnd) {
         i_3 = Rasterizer2D_yClipEnd - i_1;
      }

      int i_5 = Rasterizer2D_width - i_2;
      int i_6 = i_0 + Rasterizer2D_width * i_1;

      for (int i_7 = -i_3; i_7 < 0; i_7++) {
         for (int i_8 = -i_2; i_8 < 0; i_8++) {
            Rasterizer2D_pixels[i_6++] = i_4;
         }

         i_6 += i_5;
      }

   }

   public static void method6010(int i_0, int i_1, int i_2, int i_3) {
      if (i_1 >= Rasterizer2D_yClipStart && i_1 < Rasterizer2D_yClipEnd) {
         if (i_0 < Rasterizer2D_xClipStart) {
            i_2 -= Rasterizer2D_xClipStart - i_0;
            i_0 = Rasterizer2D_xClipStart;
         }

         if (i_0 + i_2 > Rasterizer2D_xClipEnd) {
            i_2 = Rasterizer2D_xClipEnd - i_0;
         }

         int i_4 = i_0 + Rasterizer2D_width * i_1;

         for (int i_5 = 0; i_5 < i_2; i_5++) {
            Rasterizer2D_pixels[i_4 + i_5] = i_3;
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

      if (i_2 > Rasterizer2D_width) {
         i_2 = Rasterizer2D_width;
      }

      if (i_3 > Rasterizer2D_height) {
         i_3 = Rasterizer2D_height;
      }

      Rasterizer2D_xClipStart = i_0;
      Rasterizer2D_yClipStart = i_1;
      Rasterizer2D_xClipEnd = i_2;
      Rasterizer2D_yClipEnd = i_3;
   }

   public static void drawCircleAlpha2D(int i_0, int i_1, int i_2, int i_3, int i_4) {
      if (i_4 != 0) {
         if (i_4 == 256) {
            drawCircle(i_0, i_1, i_2, i_3);
         } else {
            if (i_2 < 0) {
               i_2 = -i_2;
            }

            int i_5 = 256 - i_4;
            int i_6 = (i_3 >> 16 & 0xff) * i_4;
            int i_7 = (i_3 >> 8 & 0xff) * i_4;
            int i_8 = i_4 * (i_3 & 0xff);
            int i_12 = i_1 - i_2;
            if (i_12 < Rasterizer2D_yClipStart) {
               i_12 = Rasterizer2D_yClipStart;
            }

            int i_13 = i_2 + i_1 + 1;
            if (i_13 > Rasterizer2D_yClipEnd) {
               i_13 = Rasterizer2D_yClipEnd;
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
               if (i_20 < Rasterizer2D_xClipStart) {
                  i_20 = Rasterizer2D_xClipStart;
               }

               i_21 = i_0 + i_16;
               if (i_21 > Rasterizer2D_xClipEnd) {
                  i_21 = Rasterizer2D_xClipEnd;
               }

               i_22 = i_20 + i_14 * Rasterizer2D_width;

               for (i_23 = i_20; i_23 < i_21; i_23++) {
                  i_9 = i_5 * (Rasterizer2D_pixels[i_22] >> 16 & 0xff);
                  i_10 = (Rasterizer2D_pixels[i_22] >> 8 & 0xff) * i_5;
                  i_11 = i_5 * (Rasterizer2D_pixels[i_22] & 0xff);
                  i_24 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
                  Rasterizer2D_pixels[i_22++] = i_24;
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
               if (i_20 < Rasterizer2D_xClipStart) {
                  i_20 = Rasterizer2D_xClipStart;
               }

               i_21 = i_0 + i_16;
               if (i_21 > Rasterizer2D_xClipEnd - 1) {
                  i_21 = Rasterizer2D_xClipEnd - 1;
               }

               i_22 = i_20 + i_14 * Rasterizer2D_width;

               for (i_23 = i_20; i_23 <= i_21; i_23++) {
                  i_9 = i_5 * (Rasterizer2D_pixels[i_22] >> 16 & 0xff);
                  i_10 = (Rasterizer2D_pixels[i_22] >> 8 & 0xff) * i_5;
                  i_11 = i_5 * (Rasterizer2D_pixels[i_22] & 0xff);
                  i_24 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
                  Rasterizer2D_pixels[i_22++] = i_24;
               }

               ++i_14;
               i_19 = i_19 + i_17 + i_17;
            }

         }
      }
   }

   public static void method6007(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, byte[] bytes_6, int i_7, boolean bool_8) {
      if (i_0 + i_2 >= 0 && i_3 + i_1 >= 0) {
         if (i_0 < Rasterizer2D_width && i_1 < Rasterizer2D_height) {
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

            if (i_0 + i_2 > Rasterizer2D_width) {
               i_2 = Rasterizer2D_width - i_0;
            }

            if (i_3 + i_1 > Rasterizer2D_height) {
               i_3 = Rasterizer2D_height - i_1;
            }

            int i_11 = bytes_6.length / i_7;
            int i_12 = Rasterizer2D_width - i_2;
            int i_13 = i_4 >>> 24;
            int i_14 = i_5 >>> 24;
            int i_15;
            int i_16;
            int i_17;
            int i_18;
            int i_19;
            if (i_13 == 255 && i_14 == 255) {
               i_15 = i_0 + i_9 + (i_10 + i_1) * Rasterizer2D_width;

               for (i_16 = i_10 + i_1; i_16 < i_3 + i_10 + i_1; i_16++) {
                  for (i_17 = i_0 + i_9; i_17 < i_0 + i_9 + i_2; i_17++) {
                     i_18 = (i_16 - i_1) % i_11;
                     i_19 = (i_17 - i_0) % i_7;
                     if (bytes_6[i_19 + i_18 * i_7] != 0) {
                        Rasterizer2D_pixels[i_15++] = i_5;
                     } else {
                        Rasterizer2D_pixels[i_15++] = i_4;
                     }
                  }

                  i_15 += i_12;
               }
            } else {
               i_15 = i_0 + i_9 + (i_10 + i_1) * Rasterizer2D_width;

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
                     int i_23 = Rasterizer2D_pixels[i_15];
                     int i_24 = ((i_20 & 0xff00ff) * i_21 + (i_23 & 0xff00ff) * i_22 & ~0xff00ff) + (i_21 * (i_20 & 0xff00) + i_22 * (i_23 & 0xff00) & 0xff0000) >> 8;
                     Rasterizer2D_pixels[i_15++] = i_24;
                  }

                  i_15 += i_12;
               }
            }

         }
      }
   }

   static void drawCircle(int i_0, int i_1, int i_2, int i_3) {
      if (i_2 == 0) {
         method6024(i_0, i_1, i_3);
      } else {
         if (i_2 < 0) {
            i_2 = -i_2;
         }

         int i_4 = i_1 - i_2;
         if (i_4 < Rasterizer2D_yClipStart) {
            i_4 = Rasterizer2D_yClipStart;
         }

         int i_5 = i_2 + i_1 + 1;
         if (i_5 > Rasterizer2D_yClipEnd) {
            i_5 = Rasterizer2D_yClipEnd;
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
            if (i_12 < Rasterizer2D_xClipStart) {
               i_12 = Rasterizer2D_xClipStart;
            }

            i_13 = i_0 + i_8;
            if (i_13 > Rasterizer2D_xClipEnd) {
               i_13 = Rasterizer2D_xClipEnd;
            }

            i_14 = i_12 + i_6 * Rasterizer2D_width;

            for (i_15 = i_12; i_15 < i_13; i_15++) {
               Rasterizer2D_pixels[i_14++] = i_3;
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
            if (i_12 < Rasterizer2D_xClipStart) {
               i_12 = Rasterizer2D_xClipStart;
            }

            i_13 = i_0 + i_8;
            if (i_13 > Rasterizer2D_xClipEnd - 1) {
               i_13 = Rasterizer2D_xClipEnd - 1;
            }

            i_14 = i_12 + i_6 * Rasterizer2D_width;

            for (i_15 = i_12; i_15 <= i_13; i_15++) {
               Rasterizer2D_pixels[i_14++] = i_3;
            }

            ++i_6;
            i_11 = i_11 + i_9 + i_9;
         }

      }
   }

   public static void method5996() {
      Rasterizer2D_xClipStart = 0;
      Rasterizer2D_yClipStart = 0;
      Rasterizer2D_xClipEnd = Rasterizer2D_width;
      Rasterizer2D_yClipEnd = Rasterizer2D_height;
   }

   public static void method6004(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
      if (i_0 < Rasterizer2D_xClipStart) {
         i_2 -= Rasterizer2D_xClipStart - i_0;
         i_0 = Rasterizer2D_xClipStart;
      }

      if (i_1 < Rasterizer2D_yClipStart) {
         i_3 -= Rasterizer2D_yClipStart - i_1;
         i_1 = Rasterizer2D_yClipStart;
      }

      if (i_0 + i_2 > Rasterizer2D_xClipEnd) {
         i_2 = Rasterizer2D_xClipEnd - i_0;
      }

      if (i_3 + i_1 > Rasterizer2D_yClipEnd) {
         i_3 = Rasterizer2D_yClipEnd - i_1;
      }

      i_4 = (i_5 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_5 * (i_4 & 0xff00) >> 8 & 0xff00);
      int i_6 = 256 - i_5;
      int i_7 = Rasterizer2D_width - i_2;
      int i_8 = i_0 + Rasterizer2D_width * i_1;

      for (int i_9 = 0; i_9 < i_3; i_9++) {
         for (int i_10 = -i_2; i_10 < 0; i_10++) {
            int i_11 = Rasterizer2D_pixels[i_8];
            i_11 = ((i_11 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + (i_6 * (i_11 & 0xff00) >> 8 & 0xff00);
            Rasterizer2D_pixels[i_8++] = i_11 + i_4;
         }

         i_8 += i_7;
      }

   }

   public static void drawRectangle(int i_0, int i_1, int i_2, int i_3, int i_4) {
      method6010(i_0, i_1, i_2, i_4);
      method6010(i_0, i_3 + i_1 - 1, i_2, i_4);
      method6000(i_0, i_1, i_3, i_4);
      method6000(i_0 + i_2 - 1, i_1, i_3, i_4);
   }

   static void method6024(int i_0, int i_1, int i_2) {
      if (i_0 >= Rasterizer2D_xClipStart && i_1 >= Rasterizer2D_yClipStart && i_0 < Rasterizer2D_xClipEnd && i_1 < Rasterizer2D_yClipEnd) {
         Rasterizer2D_pixels[i_0 + Rasterizer2D_width * i_1] = i_2;
      }
   }

   public static void method6013(int[] ints_0) {
      Rasterizer2D_xClipStart = ints_0[0];
      Rasterizer2D_yClipStart = ints_0[1];
      Rasterizer2D_xClipEnd = ints_0[2];
      Rasterizer2D_yClipEnd = ints_0[3];
   }

   public static void method6005(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
      if (i_2 > 0 && i_3 > 0) {
         int i_6 = 0;
         int i_7 = 65536 / i_3;
         if (i_0 < Rasterizer2D_xClipStart) {
            i_2 -= Rasterizer2D_xClipStart - i_0;
            i_0 = Rasterizer2D_xClipStart;
         }

         if (i_1 < Rasterizer2D_yClipStart) {
            i_6 += (Rasterizer2D_yClipStart - i_1) * i_7;
            i_3 -= Rasterizer2D_yClipStart - i_1;
            i_1 = Rasterizer2D_yClipStart;
         }

         if (i_0 + i_2 > Rasterizer2D_xClipEnd) {
            i_2 = Rasterizer2D_xClipEnd - i_0;
         }

         if (i_3 + i_1 > Rasterizer2D_yClipEnd) {
            i_3 = Rasterizer2D_yClipEnd - i_1;
         }

         int i_8 = Rasterizer2D_width - i_2;
         int i_9 = i_0 + Rasterizer2D_width * i_1;

         for (int i_10 = -i_3; i_10 < 0; i_10++) {
            int i_11 = 65536 - i_6 >> 8;
            int i_12 = i_6 >> 8;
            int i_13 = (i_12 * (i_5 & 0xff00ff) + i_11 * (i_4 & 0xff00ff) & ~0xff00ff) + (i_12 * (i_5 & 0xff00) + i_11 * (i_4 & 0xff00) & 0xff0000) >>> 8;

            for (int i_14 = -i_2; i_14 < 0; i_14++) {
               Rasterizer2D_pixels[i_9++] = i_13;
            }

            i_9 += i_8;
            i_6 += i_7;
         }

      }
   }

   public static void method6016(int i_0, int i_1, int i_2, int[] ints_3, int[] ints_4) {
      int i_5 = i_0 + Rasterizer2D_width * i_1;

      for (i_1 = 0; i_1 < ints_3.length; i_1++) {
         int i_6 = i_5 + ints_3[i_1];

         for (i_0 = -ints_4[i_1]; i_0 < 0; i_0++) {
            Rasterizer2D_pixels[i_6++] = i_2;
         }

         i_5 += Rasterizer2D_width;
      }

   }

   public static void drawRectangleAlpha(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
      drawHorizontalLineAlpha(i_0, i_1, i_2, i_4, i_5);
      drawHorizontalLineAlpha(i_0, i_3 + i_1 - 1, i_2, i_4, i_5);
      if (i_3 >= 3) {
         drawVerticalLineAlpha(i_0, i_1 + 1, i_3 - 2, i_4, i_5);
         drawVerticalLineAlpha(i_0 + i_2 - 1, i_1 + 1, i_3 - 2, i_4, i_5);
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
            if (i_0 < Rasterizer2D_xClipStart) {
               i_1 += i_5 * (Rasterizer2D_xClipStart - i_0);
               i_0 = Rasterizer2D_xClipStart;
            }

            if (i_2 >= Rasterizer2D_xClipEnd) {
               i_2 = Rasterizer2D_xClipEnd - 1;
            }

            while (i_0 <= i_2) {
               i_6 = i_1 >> 16;
               if (i_6 >= Rasterizer2D_yClipStart && i_6 < Rasterizer2D_yClipEnd) {
                  Rasterizer2D_pixels[i_0 + i_6 * Rasterizer2D_width] = i_4;
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
            if (i_1 < Rasterizer2D_yClipStart) {
               i_0 += (Rasterizer2D_yClipStart - i_1) * i_5;
               i_1 = Rasterizer2D_yClipStart;
            }

            if (i_3 >= Rasterizer2D_yClipEnd) {
               i_3 = Rasterizer2D_yClipEnd - 1;
            }

            while (i_1 <= i_3) {
               i_6 = i_0 >> 16;
               if (i_6 >= Rasterizer2D_xClipStart && i_6 < Rasterizer2D_xClipEnd) {
                  Rasterizer2D_pixels[i_6 + Rasterizer2D_width * i_1] = i_4;
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
         if (i_0 < Rasterizer2D_xClipStart) {
            i_2 -= Rasterizer2D_xClipStart - i_0;
            i_0 = Rasterizer2D_xClipStart;
         }

         if (i_1 < Rasterizer2D_yClipStart) {
            i_8 += (Rasterizer2D_yClipStart - i_1) * i_9;
            i_3 -= Rasterizer2D_yClipStart - i_1;
            i_1 = Rasterizer2D_yClipStart;
         }

         if (i_0 + i_2 > Rasterizer2D_xClipEnd) {
            i_2 = Rasterizer2D_xClipEnd - i_0;
         }

         if (i_3 + i_1 > Rasterizer2D_yClipEnd) {
            i_3 = Rasterizer2D_yClipEnd - i_1;
         }

         int i_10 = Rasterizer2D_width - i_2;
         int i_11 = i_0 + Rasterizer2D_width * i_1;

         for (int i_12 = -i_3; i_12 < 0; i_12++) {
            int i_13 = 65536 - i_8 >> 8;
            int i_14 = i_8 >> 8;
            int i_15 = (i_13 * i_6 + i_14 * i_7 & 0xff00) >>> 8;
            if (i_15 == 0) {
               i_11 += Rasterizer2D_width;
               i_8 += i_9;
            } else {
               int i_16 = (i_14 * (i_5 & 0xff00ff) + i_13 * (i_4 & 0xff00ff) & ~0xff00ff) + (i_14 * (i_5 & 0xff00) + i_13 * (i_4 & 0xff00) & 0xff0000) >>> 8;
               int i_17 = 255 - i_15;
               int i_18 = ((i_16 & 0xff00ff) * i_15 >> 8 & 0xff00ff) + (i_15 * (i_16 & 0xff00) >> 8 & 0xff00);

               for (int i_19 = -i_2; i_19 < 0; i_19++) {
                  int i_20 = Rasterizer2D_pixels[i_11];
                  if (i_20 == 0) {
                     Rasterizer2D_pixels[i_11++] = i_18;
                  } else {
                     i_20 = ((i_20 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_20 & 0xff00) >> 8 & 0xff00);
                     Rasterizer2D_pixels[i_11++] = i_18 + i_20;
                  }
               }

               i_11 += i_10;
               i_8 += i_9;
            }
         }

      }
   }

   public static void method5998(int i_0, int i_1, int i_2, int i_3) {
      if (Rasterizer2D_xClipStart < i_0) {
         Rasterizer2D_xClipStart = i_0;
      }

      if (Rasterizer2D_yClipStart < i_1) {
         Rasterizer2D_yClipStart = i_1;
      }

      if (Rasterizer2D_xClipEnd > i_2) {
         Rasterizer2D_xClipEnd = i_2;
      }

      if (Rasterizer2D_yClipEnd > i_3) {
         Rasterizer2D_yClipEnd = i_3;
      }

   }

   static void drawHorizontalLineAlpha(int i_0, int i_1, int i_2, int i_3, int i_4) {
      if (i_1 >= Rasterizer2D_yClipStart && i_1 < Rasterizer2D_yClipEnd) {
         if (i_0 < Rasterizer2D_xClipStart) {
            i_2 -= Rasterizer2D_xClipStart - i_0;
            i_0 = Rasterizer2D_xClipStart;
         }

         if (i_0 + i_2 > Rasterizer2D_xClipEnd) {
            i_2 = Rasterizer2D_xClipEnd - i_0;
         }

         int i_5 = 256 - i_4;
         int i_6 = (i_3 >> 16 & 0xff) * i_4;
         int i_7 = (i_3 >> 8 & 0xff) * i_4;
         int i_8 = i_4 * (i_3 & 0xff);
         int i_12 = i_0 + Rasterizer2D_width * i_1;

         for (int i_13 = 0; i_13 < i_2; i_13++) {
            int i_9 = i_5 * (Rasterizer2D_pixels[i_12] >> 16 & 0xff);
            int i_10 = (Rasterizer2D_pixels[i_12] >> 8 & 0xff) * i_5;
            int i_11 = i_5 * (Rasterizer2D_pixels[i_12] & 0xff);
            int i_14 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
            Rasterizer2D_pixels[i_12++] = i_14;
         }

      }
   }

   static void drawVerticalLineAlpha(int i_0, int i_1, int i_2, int i_3, int i_4) {
      if (i_0 >= Rasterizer2D_xClipStart && i_0 < Rasterizer2D_xClipEnd) {
         if (i_1 < Rasterizer2D_yClipStart) {
            i_2 -= Rasterizer2D_yClipStart - i_1;
            i_1 = Rasterizer2D_yClipStart;
         }

         if (i_2 + i_1 > Rasterizer2D_yClipEnd) {
            i_2 = Rasterizer2D_yClipEnd - i_1;
         }

         int i_5 = 256 - i_4;
         int i_6 = (i_3 >> 16 & 0xff) * i_4;
         int i_7 = (i_3 >> 8 & 0xff) * i_4;
         int i_8 = i_4 * (i_3 & 0xff);
         int i_12 = i_0 + Rasterizer2D_width * i_1;

         for (int i_13 = 0; i_13 < i_2; i_13++) {
            int i_9 = i_5 * (Rasterizer2D_pixels[i_12] >> 16 & 0xff);
            int i_10 = (Rasterizer2D_pixels[i_12] >> 8 & 0xff) * i_5;
            int i_11 = i_5 * (Rasterizer2D_pixels[i_12] & 0xff);
            int i_14 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
            Rasterizer2D_pixels[i_12] = i_14;
            i_12 += Rasterizer2D_width;
         }

      }
   }

   public static void method6022() {
      int i_0 = 0;

      int i_1;
      for (i_1 = Rasterizer2D_width * Rasterizer2D_height - 7; i_0 < i_1; Rasterizer2D_pixels[i_0++] = 0) {
         Rasterizer2D_pixels[i_0++] = 0;
         Rasterizer2D_pixels[i_0++] = 0;
         Rasterizer2D_pixels[i_0++] = 0;
         Rasterizer2D_pixels[i_0++] = 0;
         Rasterizer2D_pixels[i_0++] = 0;
         Rasterizer2D_pixels[i_0++] = 0;
         Rasterizer2D_pixels[i_0++] = 0;
      }

      for (i_1 += 7; i_0 < i_1; Rasterizer2D_pixels[i_0++] = 0) {
         ;
      }

   }

}
