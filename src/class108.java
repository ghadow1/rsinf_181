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

   RawSound method2481(int i_1, int i_2, int[] ints_3) {
      int i_5 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
      i_5 |= i_1 << 16;
      long long_6 = (long)i_5;
      RawSound rawSound_8 = (RawSound) this.field1441.method5952(long_6);
      if (rawSound_8 != null) {
         return rawSound_8;
      } else if (ints_3 != null && ints_3[0] <= 0) {
         return null;
      } else {
         class101 class101_9 = class101.method2334(this.field1446, i_1, i_2);
         if (class101_9 == null) {
            return null;
         } else {
            rawSound_8 = class101_9.method2330();
            this.field1441.method5951(rawSound_8, long_6);
            if (ints_3 != null) {
               ints_3[0] -= rawSound_8.field1390.length;
            }

            return rawSound_8;
         }
      }
   }

   RawSound method2486(int i_1, int i_2, int[] ints_3) {
      int i_5 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
      i_5 |= i_1 << 16;
      long long_6 = (long)i_5 ^ 0x100000000L;
      RawSound rawSound_8 = (RawSound) this.field1441.method5952(long_6);
      if (rawSound_8 != null) {
         return rawSound_8;
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

         rawSound_8 = class102_9.method2370(ints_3);
         if (rawSound_8 == null) {
            return null;
         } else {
            class102_9.unlink();
            this.field1441.method5951(rawSound_8, long_6);
            return rawSound_8;
         }
      }
   }

   public RawSound method2483(int i_1, int[] ints_2) {
      if (this.field1446.method4232() == 1) {
         return this.method2481(0, i_1, ints_2);
      } else if (this.field1446.method4154(i_1) == 1) {
         return this.method2481(i_1, 0, ints_2);
      } else {
         throw new RuntimeException();
      }
   }

   public RawSound method2484(int i_1, int[] ints_2) {
      if (this.field1449.method4232() == 1) {
         return this.method2486(0, i_1, ints_2);
      } else if (this.field1449.method4154(i_1) == 1) {
         return this.method2486(i_1, 0, ints_2);
      } else {
         throw new RuntimeException();
      }
   }

   static final void method2491(int i_0) {
      ParamDefinition.disconnectGame();
      switch(i_0) {
      case 1:
         class213.disconnectMessage();
         break;
      case 2:
         MouseHandler.method1039();
      }

   }

}
