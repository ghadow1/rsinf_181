public final class Font extends AbstractFont {

   public Font(byte[] bytes_1, int[] ints_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, byte[][] bytes_7) {
      super(bytes_1, ints_2, ints_3, ints_4, ints_5, ints_6, bytes_7);
   }

   public Font(byte[] bytes_1) {
      super(bytes_1);
   }

   final void vmethod5360(byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      int i_7 = i_3 * Rasterizer2D.Rasterizer2D_width + i_2;
      int i_8 = Rasterizer2D.Rasterizer2D_width - i_4;
      int i_9 = 0;
      int i_10 = 0;
      int i_11;
      if (i_3 < Rasterizer2D.Rasterizer2D_yClipStart) {
         i_11 = Rasterizer2D.Rasterizer2D_yClipStart - i_3;
         i_5 -= i_11;
         i_3 = Rasterizer2D.Rasterizer2D_yClipStart;
         i_10 += i_11 * i_4;
         i_7 += i_11 * Rasterizer2D.Rasterizer2D_width;
      }

      if (i_3 + i_5 > Rasterizer2D.Rasterizer2D_yClipEnd) {
         i_5 -= i_3 + i_5 - Rasterizer2D.Rasterizer2D_yClipEnd;
      }

      if (i_2 < Rasterizer2D.Rasterizer2D_xClipStart) {
         i_11 = Rasterizer2D.Rasterizer2D_xClipStart - i_2;
         i_4 -= i_11;
         i_2 = Rasterizer2D.Rasterizer2D_xClipStart;
         i_10 += i_11;
         i_7 += i_11;
         i_9 += i_11;
         i_8 += i_11;
      }

      if (i_2 + i_4 > Rasterizer2D.Rasterizer2D_xClipEnd) {
         i_11 = i_2 + i_4 - Rasterizer2D.Rasterizer2D_xClipEnd;
         i_4 -= i_11;
         i_9 += i_11;
         i_8 += i_11;
      }

      if (i_4 > 0 && i_5 > 0) {
         AbstractFont.method5380(Rasterizer2D.Rasterizer2D_pixels, bytes_1, i_6, i_10, i_7, i_4, i_5, i_8, i_9);
      }
   }

   final void vmethod5361(byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      int i_8 = i_3 * Rasterizer2D.Rasterizer2D_width + i_2;
      int i_9 = Rasterizer2D.Rasterizer2D_width - i_4;
      int i_10 = 0;
      int i_11 = 0;
      int i_12;
      if (i_3 < Rasterizer2D.Rasterizer2D_yClipStart) {
         i_12 = Rasterizer2D.Rasterizer2D_yClipStart - i_3;
         i_5 -= i_12;
         i_3 = Rasterizer2D.Rasterizer2D_yClipStart;
         i_11 += i_12 * i_4;
         i_8 += i_12 * Rasterizer2D.Rasterizer2D_width;
      }

      if (i_3 + i_5 > Rasterizer2D.Rasterizer2D_yClipEnd) {
         i_5 -= i_3 + i_5 - Rasterizer2D.Rasterizer2D_yClipEnd;
      }

      if (i_2 < Rasterizer2D.Rasterizer2D_xClipStart) {
         i_12 = Rasterizer2D.Rasterizer2D_xClipStart - i_2;
         i_4 -= i_12;
         i_2 = Rasterizer2D.Rasterizer2D_xClipStart;
         i_11 += i_12;
         i_8 += i_12;
         i_10 += i_12;
         i_9 += i_12;
      }

      if (i_2 + i_4 > Rasterizer2D.Rasterizer2D_xClipEnd) {
         i_12 = i_2 + i_4 - Rasterizer2D.Rasterizer2D_xClipEnd;
         i_4 -= i_12;
         i_10 += i_12;
         i_9 += i_12;
      }

      if (i_4 > 0 && i_5 > 0) {
         AbstractFont.method5365(Rasterizer2D.Rasterizer2D_pixels, bytes_1, i_6, i_11, i_8, i_4, i_5, i_9, i_10, i_7);
      }
   }

}
