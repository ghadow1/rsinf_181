public class class335 {

   int[] field4033;

   public class335(int[] ints_1) {
      int i_2;
      for (i_2 = 1; i_2 <= (ints_1.length >> 1) + ints_1.length; i_2 <<= 1) {
         ;
      }

      this.field4033 = new int[i_2 + i_2];

      int i_3;
      for (i_3 = 0; i_3 < i_2 + i_2; i_3++) {
         this.field4033[i_3] = -1;
      }

      int i_4;
      for (i_3 = 0; i_3 < ints_1.length; this.field4033[i_4 + i_4 + 1] = i_3++) {
         for (i_4 = ints_1[i_3] & i_2 - 1; this.field4033[i_4 + i_4 + 1] != -1; i_4 = i_4 + 1 & i_2 - 1) {
            ;
         }

         this.field4033[i_4 + i_4] = ints_1[i_3];
      }

   }

   public int method6501(int i_1, int i_2) {
      int i_3 = (this.field4033.length >> 1) - 1;
      int i_4 = i_1 & i_3;

      while (true) {
         int i_5 = this.field4033[i_4 + i_4 + 1];
         if (i_5 == -1) {
            return -1;
         }

         if (this.field4033[i_4 + i_4] == i_1) {
            return i_5;
         }

         i_4 = i_4 + 1 & i_3;
      }
   }

}
