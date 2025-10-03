public class class100 {

   int field1350;
   int field1349;
   int[] field1347;
   int[] field1346;
   float[][] field1345;
   int[] field1348;

   class100() {
      class102.method2345(24);
      this.field1350 = class102.method2345(16);
      this.field1349 = class102.method2345(24);
      this.field1347 = new int[this.field1349];
      boolean bool_1 = class102.method2344() != 0;
      int i_2;
      int i_3;
      int i_5;
      if (bool_1) {
         i_2 = 0;

         for (i_3 = class102.method2345(5) + 1; i_2 < this.field1349; i_3++) {
            int i_4 = class102.method2345(class144.method3316(this.field1349 - i_2));

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field1347[i_2++] = i_3;
            }
         }
      } else {
         boolean bool_14 = class102.method2344() != 0;

         for (i_3 = 0; i_3 < this.field1349; i_3++) {
            if (bool_14 && class102.method2344() == 0) {
               this.field1347[i_3] = 0;
            } else {
               this.field1347[i_3] = class102.method2345(5) + 1;
            }
         }
      }

      this.method2317();
      i_2 = class102.method2345(4);
      if (i_2 > 0) {
         float f_15 = class102.method2367(class102.method2345(32));
         float f_16 = class102.method2367(class102.method2345(32));
         i_5 = class102.method2345(4) + 1;
         boolean bool_6 = class102.method2344() != 0;
         int i_7;
         if (i_2 == 1) {
            i_7 = method2327(this.field1349, this.field1350);
         } else {
            i_7 = this.field1349 * this.field1350;
         }

         this.field1346 = new int[i_7];

         int i_8;
         for (i_8 = 0; i_8 < i_7; i_8++) {
            this.field1346[i_8] = class102.method2345(i_5);
         }

         this.field1345 = new float[this.field1349][this.field1350];
         float f_9;
         int i_10;
         int i_11;
         if (i_2 == 1) {
            for (i_8 = 0; i_8 < this.field1349; i_8++) {
               f_9 = 0.0F;
               i_10 = 1;

               for (i_11 = 0; i_11 < this.field1350; i_11++) {
                  int i_12 = i_8 / i_10 % i_7;
                  float f_13 = (float)this.field1346[i_12] * f_16 + f_15 + f_9;
                  this.field1345[i_8][i_11] = f_13;
                  if (bool_6) {
                     f_9 = f_13;
                  }

                  i_10 *= i_7;
               }
            }
         } else {
            for (i_8 = 0; i_8 < this.field1349; i_8++) {
               f_9 = 0.0F;
               i_10 = i_8 * this.field1350;

               for (i_11 = 0; i_11 < this.field1350; i_11++) {
                  float f_17 = (float)this.field1346[i_10] * f_16 + f_15 + f_9;
                  this.field1345[i_8][i_11] = f_17;
                  if (bool_6) {
                     f_9 = f_17;
                  }

                  ++i_10;
               }
            }
         }
      }

   }

   int method2325() {
      int i_1;
      for (i_1 = 0; this.field1348[i_1] >= 0; i_1 = class102.method2344() != 0 ? this.field1348[i_1] : i_1 + 1) {
         ;
      }

      return ~this.field1348[i_1];
   }

   float[] method2318() {
      return this.field1345[this.method2325()];
   }

   void method2317() {
      int[] ints_1 = new int[this.field1349];
      int[] ints_2 = new int[33];

      int i_3;
      int i_4;
      int i_5;
      int i_6;
      int i_7;
      int i_8;
      int i_10;
      for (i_3 = 0; i_3 < this.field1349; i_3++) {
         i_4 = this.field1347[i_3];
         if (i_4 != 0) {
            i_5 = 1 << 32 - i_4;
            i_6 = ints_2[i_4];
            ints_1[i_3] = i_6;
            int i_12;
            if ((i_6 & i_5) != 0) {
               i_7 = ints_2[i_4 - 1];
            } else {
               i_7 = i_6 | i_5;

               for (i_8 = i_4 - 1; i_8 >= 1; --i_8) {
                  i_12 = ints_2[i_8];
                  if (i_12 != i_6) {
                     break;
                  }

                  i_10 = 1 << 32 - i_8;
                  if ((i_12 & i_10) != 0) {
                     ints_2[i_8] = ints_2[i_8 - 1];
                     break;
                  }

                  ints_2[i_8] = i_12 | i_10;
               }
            }

            ints_2[i_4] = i_7;

            for (i_8 = i_4 + 1; i_8 <= 32; i_8++) {
               i_12 = ints_2[i_8];
               if (i_12 == i_6) {
                  ints_2[i_8] = i_7;
               }
            }
         }
      }

      this.field1348 = new int[8];
      int i_11 = 0;

      for (i_3 = 0; i_3 < this.field1349; i_3++) {
         i_4 = this.field1347[i_3];
         if (i_4 != 0) {
            i_5 = ints_1[i_3];
            i_6 = 0;

            for (i_7 = 0; i_7 < i_4; i_7++) {
               i_8 = Integer.MIN_VALUE >>> i_7;
               if ((i_5 & i_8) != 0) {
                  if (this.field1348[i_6] == 0) {
                     this.field1348[i_6] = i_11;
                  }

                  i_6 = this.field1348[i_6];
               } else {
                  ++i_6;
               }

               if (i_6 >= this.field1348.length) {
                  int[] ints_9 = new int[this.field1348.length * 2];

                  for (i_10 = 0; i_10 < this.field1348.length; i_10++) {
                     ints_9[i_10] = this.field1348[i_10];
                  }

                  this.field1348 = ints_9;
               }

               i_8 >>>= 1;
            }

            this.field1348[i_6] = ~i_3;
            if (i_6 >= i_11) {
               i_11 = i_6 + 1;
            }
         }
      }

   }

   static int method2327(int i_0, int i_1) {
      int i_2;
      for (i_2 = (int)Math.pow((double)i_0, 1.0D / (double)i_1) + 1; MouseHandler.method1009(i_2, i_1) > i_0; --i_2) {
         ;
      }

      return i_2;
   }

}
