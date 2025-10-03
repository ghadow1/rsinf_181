public final class class324 extends Rasterizer2D {

   public int[] field3892;
   public int field3896;
   public int field3894;
   public byte[] field3895;
   public int field3897;
   public int field3893;
   public int field3890;
   public int field3891;

   public void method6090() {
      if (this.field3897 != this.field3896 || this.field3893 != this.field3894) {
         byte[] bytes_1 = new byte[this.field3896 * this.field3894];
         int i_2 = 0;

         for (int i_3 = 0; i_3 < this.field3893; i_3++) {
            for (int i_4 = 0; i_4 < this.field3897; i_4++) {
               bytes_1[i_4 + (i_3 + this.field3891) * this.field3896 + this.field3890] = this.field3895[i_2++];
            }
         }

         this.field3895 = bytes_1;
         this.field3897 = this.field3896;
         this.field3893 = this.field3894;
         this.field3890 = 0;
         this.field3891 = 0;
      }
   }

   public void method6101(int i_1, int i_2) {
      i_1 += this.field3890;
      i_2 += this.field3891;
      int i_3 = i_1 + i_2 * Rasterizer2D.Rasterizer2D_width;
      int i_4 = 0;
      int i_5 = this.field3893;
      int i_6 = this.field3897;
      int i_7 = Rasterizer2D.Rasterizer2D_width - i_6;
      int i_8 = 0;
      int i_9;
      if (i_2 < Rasterizer2D.Rasterizer2D_yClipStart) {
         i_9 = Rasterizer2D.Rasterizer2D_yClipStart - i_2;
         i_5 -= i_9;
         i_2 = Rasterizer2D.Rasterizer2D_yClipStart;
         i_4 += i_9 * i_6;
         i_3 += i_9 * Rasterizer2D.Rasterizer2D_width;
      }

      if (i_5 + i_2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
         i_5 -= i_5 + i_2 - Rasterizer2D.Rasterizer2D_yClipEnd;
      }

      if (i_1 < Rasterizer2D.Rasterizer2D_xClipStart) {
         i_9 = Rasterizer2D.Rasterizer2D_xClipStart - i_1;
         i_6 -= i_9;
         i_1 = Rasterizer2D.Rasterizer2D_xClipStart;
         i_4 += i_9;
         i_3 += i_9;
         i_8 += i_9;
         i_7 += i_9;
      }

      if (i_6 + i_1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
         i_9 = i_6 + i_1 - Rasterizer2D.Rasterizer2D_xClipEnd;
         i_6 -= i_9;
         i_8 += i_9;
         i_7 += i_9;
      }

      if (i_6 > 0 && i_5 > 0) {
         method6092(Rasterizer2D.Rasterizer2D_pixels, this.field3895, this.field3892, i_4, i_3, i_6, i_5, i_7, i_8);
      }
   }

   public void method6093(int i_1, int i_2, int i_3, int i_4) {
      int i_5 = this.field3897;
      int i_6 = this.field3893;
      int i_7 = 0;
      int i_8 = 0;
      int i_9 = this.field3896;
      int i_10 = this.field3894;
      int i_11 = (i_9 << 16) / i_3;
      int i_12 = (i_10 << 16) / i_4;
      int i_13;
      if (this.field3890 > 0) {
         i_13 = (i_11 + (this.field3890 << 16) - 1) / i_11;
         i_1 += i_13;
         i_7 += i_13 * i_11 - (this.field3890 << 16);
      }

      if (this.field3891 > 0) {
         i_13 = (i_12 + (this.field3891 << 16) - 1) / i_12;
         i_2 += i_13;
         i_8 += i_13 * i_12 - (this.field3891 << 16);
      }

      if (i_5 < i_9) {
         i_3 = (i_11 + ((i_5 << 16) - i_7) - 1) / i_11;
      }

      if (i_6 < i_10) {
         i_4 = (i_12 + ((i_6 << 16) - i_8) - 1) / i_12;
      }

      i_13 = i_1 + i_2 * Rasterizer2D.Rasterizer2D_width;
      int i_14 = Rasterizer2D.Rasterizer2D_width - i_3;
      if (i_2 + i_4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
         i_4 -= i_2 + i_4 - Rasterizer2D.Rasterizer2D_yClipEnd;
      }

      int i_15;
      if (i_2 < Rasterizer2D.Rasterizer2D_yClipStart) {
         i_15 = Rasterizer2D.Rasterizer2D_yClipStart - i_2;
         i_4 -= i_15;
         i_13 += i_15 * Rasterizer2D.Rasterizer2D_width;
         i_8 += i_12 * i_15;
      }

      if (i_3 + i_1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
         i_15 = i_3 + i_1 - Rasterizer2D.Rasterizer2D_xClipEnd;
         i_3 -= i_15;
         i_14 += i_15;
      }

      if (i_1 < Rasterizer2D.Rasterizer2D_xClipStart) {
         i_15 = Rasterizer2D.Rasterizer2D_xClipStart - i_1;
         i_3 -= i_15;
         i_13 += i_15;
         i_7 += i_11 * i_15;
         i_14 += i_15;
      }

      method6094(Rasterizer2D.Rasterizer2D_pixels, this.field3895, this.field3892, i_7, i_8, i_13, i_14, i_3, i_4, i_11, i_12, i_5);
   }

   public void method6091(int i_1, int i_2, int i_3) {
      for (int i_4 = 0; i_4 < this.field3892.length; i_4++) {
         int i_5 = this.field3892[i_4] >> 16 & 0xff;
         i_5 += i_1;
         if (i_5 < 0) {
            i_5 = 0;
         } else if (i_5 > 255) {
            i_5 = 255;
         }

         int i_6 = this.field3892[i_4] >> 8 & 0xff;
         i_6 += i_2;
         if (i_6 < 0) {
            i_6 = 0;
         } else if (i_6 > 255) {
            i_6 = 255;
         }

         int i_7 = this.field3892[i_4] & 0xff;
         i_7 += i_3;
         if (i_7 < 0) {
            i_7 = 0;
         } else if (i_7 > 255) {
            i_7 = 255;
         }

         this.field3892[i_4] = i_7 + (i_6 << 8) + (i_5 << 16);
      }

   }

   static void method6092(int[] ints_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
      int i_9 = -(i_5 >> 2);
      i_5 = -(i_5 & 0x3);

      for (int i_10 = -i_6; i_10 < 0; i_10++) {
         int i_11;
         byte b_12;
         for (i_11 = i_9; i_11 < 0; i_11++) {
            b_12 = bytes_1[i_3++];
            if (b_12 != 0) {
               ints_0[i_4++] = ints_2[b_12 & 0xff];
            } else {
               ++i_4;
            }

            b_12 = bytes_1[i_3++];
            if (b_12 != 0) {
               ints_0[i_4++] = ints_2[b_12 & 0xff];
            } else {
               ++i_4;
            }

            b_12 = bytes_1[i_3++];
            if (b_12 != 0) {
               ints_0[i_4++] = ints_2[b_12 & 0xff];
            } else {
               ++i_4;
            }

            b_12 = bytes_1[i_3++];
            if (b_12 != 0) {
               ints_0[i_4++] = ints_2[b_12 & 0xff];
            } else {
               ++i_4;
            }
         }

         for (i_11 = i_5; i_11 < 0; i_11++) {
            b_12 = bytes_1[i_3++];
            if (b_12 != 0) {
               ints_0[i_4++] = ints_2[b_12 & 0xff];
            } else {
               ++i_4;
            }
         }

         i_4 += i_7;
         i_3 += i_8;
      }

   }

   static void method6094(int[] ints_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
      int i_12 = i_3;

      for (int i_13 = -i_8; i_13 < 0; i_13++) {
         int i_14 = i_11 * (i_4 >> 16);

         for (int i_15 = -i_7; i_15 < 0; i_15++) {
            byte b_16 = bytes_1[(i_3 >> 16) + i_14];
            if (b_16 != 0) {
               ints_0[i_5++] = ints_2[b_16 & 0xff];
            } else {
               ++i_5;
            }

            i_3 += i_9;
         }

         i_4 += i_10;
         i_3 = i_12;
         i_5 += i_6;
      }

   }

}
