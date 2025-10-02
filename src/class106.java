public class class106 {

   int field1428 = 2;
   int[] field1437 = new int[2];
   int[] field1429 = new int[2];
   int field1430;
   int field1436;
   int field1431;
   int field1433;
   int field1434;
   int field1435;
   int field1427;
   int field1432;

   class106() {
      this.field1437[0] = 0;
      this.field1437[1] = 65535;
      this.field1429[0] = 0;
      this.field1429[1] = 65535;
   }

   final void method2464(class300 class300_1) {
      this.field1430 = class300_1.method5504();
      this.field1436 = class300_1.readIntMedEndian();
      this.field1431 = class300_1.readIntMedEndian();
      this.method2469(class300_1);
   }

   final void method2466() {
      this.field1433 = 0;
      this.field1434 = 0;
      this.field1435 = 0;
      this.field1427 = 0;
      this.field1432 = 0;
   }

   final void method2469(class300 class300_1) {
      this.field1428 = class300_1.method5504();
      this.field1437 = new int[this.field1428];
      this.field1429 = new int[this.field1428];

      for (int i_2 = 0; i_2 < this.field1428; i_2++) {
         this.field1437[i_2] = class300_1.readShortUBigEndian();
         this.field1429[i_2] = class300_1.readShortUBigEndian();
      }

   }

   final int method2467(int i_1) {
      if (this.field1432 >= this.field1433) {
         this.field1427 = this.field1429[this.field1434++] << 15;
         if (this.field1434 >= this.field1428) {
            this.field1434 = this.field1428 - 1;
         }

         this.field1433 = (int)((double)this.field1437[this.field1434] / 65536.0D * (double)i_1);
         if (this.field1433 > this.field1432) {
            this.field1435 = ((this.field1429[this.field1434] << 15) - this.field1427) / (this.field1433 - this.field1432);
         }
      }

      this.field1427 += this.field1435;
      ++this.field1432;
      return this.field1427 - this.field1435 >> 15;
   }

}
