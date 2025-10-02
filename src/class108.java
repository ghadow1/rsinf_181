public class class108 {

   static class325[] field1442;
   class318 field1443 = new class318(256);
   class318 field1441 = new class318(256);
   class233 field1446;
   class233 field1449;

   public class108(class233 class233_1, class233 class233_2) {
      this.field1446 = class233_1;
      this.field1449 = class233_2;
   }

   class103 method2481(int i_1, int i_2, int[] ints_3, byte b_4) {
      int i_5 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
      i_5 |= i_1 << 16;
      long long_6 = (long)i_5;
      class103 class103_8 = (class103) this.field1441.method5952(long_6);
      if (class103_8 != null) {
         return class103_8;
      } else if (ints_3 != null && ints_3[0] <= 0) {
         return null;
      } else {
         class101 class101_9 = class101.method2334(this.field1446, i_1, i_2);
         if (class101_9 == null) {
            return null;
         } else {
            class103_8 = class101_9.method2330();
            this.field1441.method5951(class103_8, long_6);
            if (ints_3 != null) {
               ints_3[0] -= class103_8.field1390.length;
            }

            return class103_8;
         }
      }
   }

   class103 method2486(int i_1, int i_2, int[] ints_3, int i_4) {
      int i_5 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
      i_5 |= i_1 << 16;
      long long_6 = (long)i_5 ^ 0x100000000L;
      class103 class103_8 = (class103) this.field1441.method5952(long_6);
      if (class103_8 != null) {
         return class103_8;
      } else if (ints_3 != null && ints_3[0] <= 0) {
         return null;
      } else {
         class102 class102_9 = (class102) this.field1443.method5952(long_6);
         if (class102_9 == null) {
            class102_9 = class102.method2355(this.field1449, i_1, i_2);
            if (class102_9 == null) {
               return null;
            }

            this.field1443.method5951(class102_9, long_6);
         }

         class103_8 = class102_9.method2370(ints_3);
         if (class103_8 == null) {
            return null;
         } else {
            class102_9.method3607();
            this.field1441.method5951(class103_8, long_6);
            return class103_8;
         }
      }
   }

   public class103 method2483(int i_1, int[] ints_2, byte b_3) {
      if (this.field1446.method4232(-1169062250) == 1) {
         return this.method2481(0, i_1, ints_2, (byte) 60);
      } else if (this.field1446.method4154(i_1, -1029639441) == 1) {
         return this.method2481(i_1, 0, ints_2, (byte) 49);
      } else {
         throw new RuntimeException();
      }
   }

   public class103 method2484(int i_1, int[] ints_2, int i_3) {
      if (this.field1449.method4232(189556312) == 1) {
         return this.method2486(0, i_1, ints_2, 1581933102);
      } else if (this.field1449.method4154(i_1, -1618278527) == 1) {
         return this.method2486(i_1, 0, ints_2, -998034610);
      } else {
         throw new RuntimeException();
      }
   }

   static final void method2491(int i_0, int i_1) {
      class174.method3593(-1554619789);
      switch(i_0) {
      case 1:
         class213.method3990((byte) -40);
         break;
      case 2:
         class54.method1039((byte) -37);
      }

   }

}
