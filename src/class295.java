public final class class295 extends class296 {

   public class295(byte[] bytes_1, int[] ints_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, byte[][] bytes_7) {
      super(bytes_1, ints_2, ints_3, ints_4, ints_5, ints_6, bytes_7);
   }

   public class295(byte[] bytes_1) {
      super(bytes_1);
   }

   final void vmethod5360(byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      int i_7 = i_3 * class321.field3875 + i_2;
      int i_8 = class321.field3875 - i_4;
      int i_9 = 0;
      int i_10 = 0;
      int i_11;
      if (i_3 < class321.field3870) {
         i_11 = class321.field3870 - i_3;
         i_5 -= i_11;
         i_3 = class321.field3870;
         i_10 += i_11 * i_4;
         i_7 += i_11 * class321.field3875;
      }

      if (i_3 + i_5 > class321.field3873) {
         i_5 -= i_3 + i_5 - class321.field3873;
      }

      if (i_2 < class321.field3874) {
         i_11 = class321.field3874 - i_2;
         i_4 -= i_11;
         i_2 = class321.field3874;
         i_10 += i_11;
         i_7 += i_11;
         i_9 += i_11;
         i_8 += i_11;
      }

      if (i_2 + i_4 > class321.field3872) {
         i_11 = i_2 + i_4 - class321.field3872;
         i_4 -= i_11;
         i_9 += i_11;
         i_8 += i_11;
      }

      if (i_4 > 0 && i_5 > 0) {
         class296.method5380(class321.field3869, bytes_1, i_6, i_10, i_7, i_4, i_5, i_8, i_9);
      }
   }

   final void vmethod5361(byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      int i_8 = i_3 * class321.field3875 + i_2;
      int i_9 = class321.field3875 - i_4;
      int i_10 = 0;
      int i_11 = 0;
      int i_12;
      if (i_3 < class321.field3870) {
         i_12 = class321.field3870 - i_3;
         i_5 -= i_12;
         i_3 = class321.field3870;
         i_11 += i_12 * i_4;
         i_8 += i_12 * class321.field3875;
      }

      if (i_3 + i_5 > class321.field3873) {
         i_5 -= i_3 + i_5 - class321.field3873;
      }

      if (i_2 < class321.field3874) {
         i_12 = class321.field3874 - i_2;
         i_4 -= i_12;
         i_2 = class321.field3874;
         i_11 += i_12;
         i_8 += i_12;
         i_10 += i_12;
         i_9 += i_12;
      }

      if (i_2 + i_4 > class321.field3872) {
         i_12 = i_2 + i_4 - class321.field3872;
         i_4 -= i_12;
         i_10 += i_12;
         i_9 += i_12;
      }

      if (i_4 > 0 && i_5 > 0) {
         class296.method5365(class321.field3869, bytes_1, i_6, i_11, i_8, i_4, i_5, i_9, i_10, i_7);
      }
   }

}
