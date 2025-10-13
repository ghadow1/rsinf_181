public class class163 extends class170 {

   long field2010 = System.nanoTime();

   public int vmethod3506(int i_1, int i_2, int i_3) {
      long long_4 = 1000000L * (long)i_2;
      long long_6 = this.field2010 - System.nanoTime();
      if (long_6 < long_4) {
         long_6 = long_4;
      }

      class251.method4550(long_6 / 1000000L);
      long long_8 = System.nanoTime();

      int i_10;
      for (i_10 = 0; i_10 < 10 && (i_10 < 1 || this.field2010 < long_8); this.field2010 += (long)i_1 * 1000000L) {
         ++i_10;
      }

      if (this.field2010 < long_8) {
         this.field2010 = long_8;
      }

      return i_10;
   }

   public void vmethod3513(int i_1) {
      this.field2010 = System.nanoTime();
   }

}
