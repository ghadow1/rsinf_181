public class class101 {

   class117[] field1351 = new class117[10];
   int field1353;
   int field1354;

   class101(class300 class300_1) {
      for (int i_2 = 0; i_2 < 10; i_2++) {
         int i_3 = class300_1.method5504();
         if (i_3 != 0) {
            --class300_1.field3732;
            this.field1351[i_2] = new class117();
            this.field1351[i_2].method2718(class300_1);
         }
      }

      this.field1353 = class300_1.method5496();
      this.field1354 = class300_1.method5496();
   }

   final byte[] method2332() {
      int i_1 = 0;

      int i_2;
      for (i_2 = 0; i_2 < 10; i_2++) {
         if (this.field1351[i_2] != null && this.field1351[i_2].field1518 + this.field1351[i_2].field1514 > i_1) {
            i_1 = this.field1351[i_2].field1518 + this.field1351[i_2].field1514;
         }
      }

      if (i_1 == 0) {
         return new byte[0];
      } else {
         i_2 = i_1 * 22050 / 1000;
         byte[] bytes_3 = new byte[i_2];

         for (int i_4 = 0; i_4 < 10; i_4++) {
            if (this.field1351[i_4] != null) {
               int i_5 = this.field1351[i_4].field1518 * 22050 / 1000;
               int i_6 = this.field1351[i_4].field1514 * 22050 / 1000;
               int[] ints_7 = this.field1351[i_4].method2716(i_5, this.field1351[i_4].field1518);

               for (int i_8 = 0; i_8 < i_5; i_8++) {
                  int i_9 = (ints_7[i_8] >> 8) + bytes_3[i_8 + i_6];
                  if ((i_9 + 128 & ~0xff) != 0) {
                     i_9 = i_9 >> 31 ^ 0x7f;
                  }

                  bytes_3[i_8 + i_6] = (byte)i_9;
               }
            }
         }

         return bytes_3;
      }
   }

   public class103 method2330() {
      byte[] bytes_1 = this.method2332();
      return new class103(22050, bytes_1, this.field1353 * 22050 / 1000, this.field1354 * 22050 / 1000);
   }

   public final int method2331() {
      int i_1 = 9999999;

      int i_2;
      for (i_2 = 0; i_2 < 10; i_2++) {
         if (this.field1351[i_2] != null && this.field1351[i_2].field1514 / 20 < i_1) {
            i_1 = this.field1351[i_2].field1514 / 20;
         }
      }

      if (this.field1353 < this.field1354 && this.field1353 / 20 < i_1) {
         i_1 = this.field1353 / 20;
      }

      if (i_1 != 9999999 && i_1 != 0) {
         for (i_2 = 0; i_2 < 10; i_2++) {
            if (this.field1351[i_2] != null) {
               this.field1351[i_2].field1514 -= i_1 * 20;
            }
         }

         if (this.field1353 < this.field1354) {
            this.field1353 -= i_1 * 20;
            this.field1354 -= i_1 * 20;
         }

         return i_1;
      } else {
         return 0;
      }
   }

   public static class101 method2334(class233 class233_0, int i_1, int i_2) {
      byte[] bytes_3 = class233_0.method4144(i_1, i_2, 1799203450);
      return bytes_3 == null ? null : new class101(new class300(bytes_3));
   }

}
