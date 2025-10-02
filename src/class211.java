public class class211 extends class175 {

   public final int field2519;
   public final int field2522;
   public final int[] field2520;
   public final int[] field2521;

   class211(int i_1, int i_2, int[] ints_3, int[] ints_4, int i_5) {
      this.field2519 = i_1;
      this.field2522 = i_2;
      this.field2520 = ints_3;
      this.field2521 = ints_4;
   }

   public boolean method3959(int i_1, int i_2, short s_3) {
      if (i_2 >= 0 && i_2 < this.field2521.length) {
         int i_4 = this.field2521[i_2];
         if (i_1 >= i_4 && i_1 <= i_4 + this.field2520[i_2]) {
            return true;
         }
      }

      return false;
   }

}
