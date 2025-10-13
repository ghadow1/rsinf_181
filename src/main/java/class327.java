public class class327 {

   static final int method6244(int i_0, int i_1, int i_2) {
      if (i_2 > 179) {
         i_1 /= 2;
      }

      if (i_2 > 192) {
         i_1 /= 2;
      }

      if (i_2 > 217) {
         i_1 /= 2;
      }

      if (i_2 > 243) {
         i_1 /= 2;
      }

      int i_4 = (i_1 / 32 << 7) + (i_0 / 4 << 10) + i_2 / 2;
      return i_4;
   }

}
