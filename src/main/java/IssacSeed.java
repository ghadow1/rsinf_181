public final class IssacSeed {

   int[] field3921 = new int[256];
   int[] field3918 = new int[256];
   int field3924;
   int field3917;
   int field3922;
   int field3919;

   public IssacSeed(int[] ints_1) {
      for (int i_2 = 0; i_2 < ints_1.length; i_2++) {
         this.field3918[i_2] = ints_1[i_2];
      }

      this.method6247();
   }

   static class229[] method6256() {
      return new class229[]{class229.field3099, class229.field3101, class229.field3102, class229.field3098};
   }

   final void method6248() {
      this.field3917 += ++this.field3924;

      for (int i_2 = 0; i_2 < 256; i_2++) {
         int i_3 = this.field3921[i_2];
         if ((i_2 & 0x2) == 0) {
            if ((i_2 & 0x1) == 0) {
               this.field3922 ^= this.field3922 << 13;
            } else {
               this.field3922 ^= this.field3922 >>> 6;
            }
         } else if ((i_2 & 0x1) == 0) {
            this.field3922 ^= this.field3922 << 2;
         } else {
            this.field3922 ^= this.field3922 >>> 16;
         }

         this.field3922 += this.field3921[128 + i_2 & 0xff];
         int i_4;
         this.field3921[i_2] = i_4 = this.field3921[(i_3 & 0x3fc) >> 2] + this.field3922 + this.field3917;
         this.field3918[i_2] = this.field3917 = this.field3921[(i_4 >> 8 & 0x3fc) >> 2] + i_3;
      }

   }

   public final int method6254() {
      if (this.field3919 == 0) {
         this.method6248();
         this.field3919 = 256;
      }

      return this.field3918[this.field3919 - 1];
   }

   final void method6247() {
      int i_10 = -1640531527;
      int i_9 = -1640531527;
      int i_8 = -1640531527;
      int i_7 = -1640531527;
      int i_6 = -1640531527;
      int i_5 = -1640531527;
      int i_4 = -1640531527;
      int i_3 = -1640531527;

      int i_2;
      for (i_2 = 0; i_2 < 4; i_2++) {
         i_3 ^= i_4 << 11;
         i_6 += i_3;
         i_4 += i_5;
         i_4 ^= i_5 >>> 2;
         i_7 += i_4;
         i_5 += i_6;
         i_5 ^= i_6 << 8;
         i_8 += i_5;
         i_6 += i_7;
         i_6 ^= i_7 >>> 16;
         i_9 += i_6;
         i_7 += i_8;
         i_7 ^= i_8 << 10;
         i_10 += i_7;
         i_8 += i_9;
         i_8 ^= i_9 >>> 4;
         i_3 += i_8;
         i_9 += i_10;
         i_9 ^= i_10 << 8;
         i_4 += i_9;
         i_10 += i_3;
         i_10 ^= i_3 >>> 9;
         i_5 += i_10;
         i_3 += i_4;
      }

      for (i_2 = 0; i_2 < 256; i_2 += 8) {
         i_3 += this.field3918[i_2];
         i_4 += this.field3918[i_2 + 1];
         i_5 += this.field3918[i_2 + 2];
         i_6 += this.field3918[i_2 + 3];
         i_7 += this.field3918[i_2 + 4];
         i_8 += this.field3918[i_2 + 5];
         i_9 += this.field3918[i_2 + 6];
         i_10 += this.field3918[i_2 + 7];
         i_3 ^= i_4 << 11;
         i_6 += i_3;
         i_4 += i_5;
         i_4 ^= i_5 >>> 2;
         i_7 += i_4;
         i_5 += i_6;
         i_5 ^= i_6 << 8;
         i_8 += i_5;
         i_6 += i_7;
         i_6 ^= i_7 >>> 16;
         i_9 += i_6;
         i_7 += i_8;
         i_7 ^= i_8 << 10;
         i_10 += i_7;
         i_8 += i_9;
         i_8 ^= i_9 >>> 4;
         i_3 += i_8;
         i_9 += i_10;
         i_9 ^= i_10 << 8;
         i_4 += i_9;
         i_10 += i_3;
         i_10 ^= i_3 >>> 9;
         i_5 += i_10;
         i_3 += i_4;
         this.field3921[i_2] = i_3;
         this.field3921[i_2 + 1] = i_4;
         this.field3921[i_2 + 2] = i_5;
         this.field3921[i_2 + 3] = i_6;
         this.field3921[i_2 + 4] = i_7;
         this.field3921[i_2 + 5] = i_8;
         this.field3921[i_2 + 6] = i_9;
         this.field3921[i_2 + 7] = i_10;
      }

      for (i_2 = 0; i_2 < 256; i_2 += 8) {
         i_3 += this.field3921[i_2];
         i_4 += this.field3921[i_2 + 1];
         i_5 += this.field3921[i_2 + 2];
         i_6 += this.field3921[i_2 + 3];
         i_7 += this.field3921[i_2 + 4];
         i_8 += this.field3921[i_2 + 5];
         i_9 += this.field3921[i_2 + 6];
         i_10 += this.field3921[i_2 + 7];
         i_3 ^= i_4 << 11;
         i_6 += i_3;
         i_4 += i_5;
         i_4 ^= i_5 >>> 2;
         i_7 += i_4;
         i_5 += i_6;
         i_5 ^= i_6 << 8;
         i_8 += i_5;
         i_6 += i_7;
         i_6 ^= i_7 >>> 16;
         i_9 += i_6;
         i_7 += i_8;
         i_7 ^= i_8 << 10;
         i_10 += i_7;
         i_8 += i_9;
         i_8 ^= i_9 >>> 4;
         i_3 += i_8;
         i_9 += i_10;
         i_9 ^= i_10 << 8;
         i_4 += i_9;
         i_10 += i_3;
         i_10 ^= i_3 >>> 9;
         i_5 += i_10;
         i_3 += i_4;
         this.field3921[i_2] = i_3;
         this.field3921[i_2 + 1] = i_4;
         this.field3921[i_2 + 2] = i_5;
         this.field3921[i_2 + 3] = i_6;
         this.field3921[i_2 + 4] = i_7;
         this.field3921[i_2 + 5] = i_8;
         this.field3921[i_2 + 6] = i_9;
         this.field3921[i_2 + 7] = i_10;
      }

      this.method6248();
      this.field3919 = 256;
   }

   public final int method6246() {
      if (this.field3919 == 0) {
         this.method6248();
         this.field3919 = 256;
      }

      return this.field3918[--this.field3919];
   }

}
