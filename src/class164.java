public class class164 extends class170 {

   long[] field2011 = new long[10];
   int field2014 = 256;
   int field2013 = 1;
   int field2015 = 0;
   long field2012 = TimeUtils.getAdjustedTimeMillis();
   int field2016;

   class164() {
      for (int i_1 = 0; i_1 < 10; i_1++) {
         this.field2011[i_1] = this.field2012;
      }

   }

   public int vmethod3506(int i_1, int i_2, int i_3) {
      int i_4 = this.field2014;
      int i_5 = this.field2013;
      this.field2014 = 300;
      this.field2013 = 1;
      this.field2012 = TimeUtils.getAdjustedTimeMillis();
      if (this.field2011[this.field2016] == 0L) {
         this.field2014 = i_4;
         this.field2013 = i_5;
      } else if (this.field2012 > this.field2011[this.field2016]) {
         this.field2014 = (int)((long)(i_1 * 2560) / (this.field2012 - this.field2011[this.field2016]));
      }

      if (this.field2014 < 25) {
         this.field2014 = 25;
      }

      if (this.field2014 > 256) {
         this.field2014 = 256;
         this.field2013 = (int)((long)i_1 - (this.field2012 - this.field2011[this.field2016]) / 10L);
      }

      if (this.field2013 > i_1) {
         this.field2013 = i_1;
      }

      this.field2011[this.field2016] = this.field2012;
      this.field2016 = (this.field2016 + 1) % 10;
      int i_6;
      if (this.field2013 > 1) {
         for (i_6 = 0; i_6 < 10; i_6++) {
            if (this.field2011[i_6] != 0L) {
               this.field2011[i_6] += (long)this.field2013;
            }
         }
      }

      if (this.field2013 < i_2) {
         this.field2013 = i_2;
      }

      class251.method4550((long)this.field2013);

      for (i_6 = 0; this.field2015 < 256; this.field2015 += this.field2014) {
         ++i_6;
      }

      this.field2015 &= 0xff;
      return i_6;
   }

   public void vmethod3513(int i_1) {
      for (int i_2 = 0; i_2 < 10; i_2++) {
         this.field2011[i_2] = 0L;
      }

   }

   static int method3468(int i_0, int i_1, int i_2, byte b_3) {
      return (class55.field502[i_0][i_1][i_2] & 0x8) != 0 ? 0 : (i_0 > 0 && (class55.field502[1][i_1][i_2] & 0x2) != 0 ? i_0 - 1 : i_0);
   }

}
