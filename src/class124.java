public class class124 extends class180 {

   boolean field1633 = false;
   int field1623;
   boolean field1624;
   int[] field1632;
   int[] field1626;
   int[] field1627;
   int[] field1619;
   int field1629;
   int field1630;
   int[] field1631;
   static int[] field1628;

   class124(class300 class300_1) {
      this.field1623 = class300_1.method5496(-1459053594);
      this.field1624 = class300_1.method5504((byte) 61) == 1;
      int i_2 = class300_1.method5504((byte) 24);
      if (i_2 >= 1 && i_2 <= 4) {
         this.field1632 = new int[i_2];

         int i_3;
         for (i_3 = 0; i_3 < i_2; i_3++) {
            this.field1632[i_3] = class300_1.method5496(-1459053594);
         }

         if (i_2 > 1) {
            this.field1626 = new int[i_2 - 1];

            for (i_3 = 0; i_3 < i_2 - 1; i_3++) {
               this.field1626[i_3] = class300_1.method5504((byte) 32);
            }
         }

         if (i_2 > 1) {
            this.field1627 = new int[i_2 - 1];

            for (i_3 = 0; i_3 < i_2 - 1; i_3++) {
               this.field1627[i_3] = class300_1.method5504((byte) 52);
            }
         }

         this.field1619 = new int[i_2];

         for (i_3 = 0; i_3 < i_2; i_3++) {
            this.field1619[i_3] = class300_1.method5499((byte) -121);
         }

         this.field1629 = class300_1.method5504((byte) 120);
         this.field1630 = class300_1.method5504((byte) 98);
         this.field1631 = null;
      } else {
         throw new RuntimeException();
      }
   }

   void method2844() {
      this.field1631 = null;
   }

   boolean method2846(double d_1, int i_3, class233 class233_4) {
      int i_5;
      for (i_5 = 0; i_5 < this.field1632.length; i_5++) {
         if (class233_4.method4216(this.field1632[i_5], -1915975799) == null) {
            return false;
         }
      }

      i_5 = i_3 * i_3;
      this.field1631 = new int[i_5];

      for (int i_6 = 0; i_6 < this.field1632.length; i_6++) {
         int i_8 = this.field1632[i_6];
         class324 class324_7;
         if (!class214.method4020(class233_4, i_8, -435811450)) {
            class324_7 = null;
         } else {
            class324 class324_10 = new class324();
            class324_10.field3896 = class326.field3913;
            class324_10.field3894 = class326.field3910;
            class324_10.field3890 = class212.field2523[0];
            class324_10.field3891 = class326.field3915[0];
            class324_10.field3897 = class326.field3914[0];
            class324_10.field3893 = class216.field2548[0];
            class324_10.field3892 = class138.field1895;
            class324_10.field3895 = class326.field3912[0];
            class16.method174(572816821);
            class324_7 = class324_10;
         }

         class324_7.method6090();
         byte[] bytes_17 = class324_7.field3895;
         int[] ints_11 = class324_7.field3892;
         int i_12 = this.field1619[i_6];
         if ((i_12 & ~0xffffff) == 16777216) {
            ;
         }

         if ((i_12 & ~0xffffff) == 33554432) {
            ;
         }

         int i_13;
         int i_14;
         int i_15;
         int i_16;
         if ((i_12 & ~0xffffff) == 50331648) {
            i_13 = i_12 & 0xff00ff;
            i_14 = i_12 >> 8 & 0xff;

            for (i_15 = 0; i_15 < ints_11.length; i_15++) {
               i_16 = ints_11[i_15];
               if (i_16 >> 8 == (i_16 & 0xffff)) {
                  i_16 &= 0xff;
                  ints_11[i_15] = i_13 * i_16 >> 8 & 0xff00ff | i_14 * i_16 & 0xff00;
               }
            }
         }

         for (i_13 = 0; i_13 < ints_11.length; i_13++) {
            ints_11[i_13] = class130.method2980(ints_11[i_13], d_1);
         }

         if (i_6 == 0) {
            i_13 = 0;
         } else {
            i_13 = this.field1626[i_6 - 1];
         }

         if (i_13 == 0) {
            if (i_3 == class324_7.field3897) {
               for (i_14 = 0; i_14 < i_5; i_14++) {
                  this.field1631[i_14] = ints_11[bytes_17[i_14] & 0xff];
               }
            } else if (class324_7.field3897 == 64 && i_3 == 128) {
               i_14 = 0;

               for (i_15 = 0; i_15 < i_3; i_15++) {
                  for (i_16 = 0; i_16 < i_3; i_16++) {
                     this.field1631[i_14++] = ints_11[bytes_17[(i_15 >> 1 << 6) + (i_16 >> 1)] & 0xff];
                  }
               }
            } else {
               if (class324_7.field3897 != 128 || i_3 != 64) {
                  throw new RuntimeException();
               }

               i_14 = 0;

               for (i_15 = 0; i_15 < i_3; i_15++) {
                  for (i_16 = 0; i_16 < i_3; i_16++) {
                     this.field1631[i_14++] = ints_11[bytes_17[(i_16 << 1) + (i_15 << 1 << 7)] & 0xff];
                  }
               }
            }
         }

         if (i_13 == 1) {
            ;
         }

         if (i_13 == 2) {
            ;
         }

         if (i_13 == 3) {
            ;
         }
      }

      return true;
   }

   void method2845(int i_1) {
      if (this.field1631 != null) {
         short s_2;
         int i_3;
         int i_4;
         int i_5;
         int i_6;
         int i_7;
         int[] ints_10;
         if (this.field1629 == 1 || this.field1629 == 3) {
            if (field1628 == null || field1628.length < this.field1631.length) {
               field1628 = new int[this.field1631.length];
            }

            if (this.field1631.length == 4096) {
               s_2 = 64;
            } else {
               s_2 = 128;
            }

            i_3 = this.field1631.length;
            i_4 = s_2 * this.field1630 * i_1;
            i_5 = i_3 - 1;
            if (this.field1629 == 1) {
               i_4 = -i_4;
            }

            for (i_6 = 0; i_6 < i_3; i_6++) {
               i_7 = i_6 + i_4 & i_5;
               field1628[i_6] = this.field1631[i_7];
            }

            ints_10 = this.field1631;
            this.field1631 = field1628;
            field1628 = ints_10;
         }

         if (this.field1629 == 2 || this.field1629 == 4) {
            if (field1628 == null || field1628.length < this.field1631.length) {
               field1628 = new int[this.field1631.length];
            }

            if (this.field1631.length == 4096) {
               s_2 = 64;
            } else {
               s_2 = 128;
            }

            i_3 = this.field1631.length;
            i_4 = this.field1630 * i_1;
            i_5 = s_2 - 1;
            if (this.field1629 == 2) {
               i_4 = -i_4;
            }

            for (i_6 = 0; i_6 < i_3; i_6 += s_2) {
               for (i_7 = 0; i_7 < s_2; i_7++) {
                  int i_8 = i_6 + i_7;
                  int i_9 = i_6 + (i_7 + i_4 & i_5);
                  field1628[i_8] = this.field1631[i_9];
               }
            }

            ints_10 = this.field1631;
            this.field1631 = field1628;
            field1628 = ints_10;
         }

      }
   }

}
