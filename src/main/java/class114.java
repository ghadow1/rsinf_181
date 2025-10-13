public class class114 {

   static float[][] field1488 = new float[2][8];
   static int[][] field1485 = new int[2][8];
   int[] field1490 = new int[2];
   int[][][] field1494 = new int[2][2][4];
   int[][][] field1486 = new int[2][2][4];
   int[] field1487 = new int[2];
   static float field1491;
   static int field1492;

   float method2668(int i_1, int i_2, float f_3) {
      float f_4 = (float)this.field1486[i_1][0][i_2] + f_3 * (float)(this.field1486[i_1][1][i_2] - this.field1486[i_1][0][i_2]);
      f_4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-f_4 / 20.0F));
   }

   float method2683(int i_1, int i_2, float f_3) {
      float f_4 = (float)this.field1494[i_1][0][i_2] + f_3 * (float)(this.field1494[i_1][1][i_2] - this.field1494[i_1][0][i_2]);
      f_4 *= 1.2207031E-4F;
      return method2670(f_4);
   }

   int method2671(int i_1, float f_2) {
      float f_3;
      if (i_1 == 0) {
         f_3 = (float)this.field1487[0] + (float)(this.field1487[1] - this.field1487[0]) * f_2;
         f_3 *= 0.0030517578F;
         field1491 = (float)Math.pow(0.1D, (double)(f_3 / 20.0F));
         field1492 = (int)(field1491 * 65536.0F);
      }

      if (this.field1490[i_1] == 0) {
         return 0;
      } else {
         f_3 = this.method2668(i_1, 0, f_2);
         field1488[i_1][0] = -2.0F * f_3 * (float)Math.cos((double)this.method2683(i_1, 0, f_2));
         field1488[i_1][1] = f_3 * f_3;

         int i_4;
         for (i_4 = 1; i_4 < this.field1490[i_1]; i_4++) {
            f_3 = this.method2668(i_1, i_4, f_2);
            float f_5 = -2.0F * f_3 * (float)Math.cos((double)this.method2683(i_1, i_4, f_2));
            float f_6 = f_3 * f_3;
            field1488[i_1][i_4 * 2 + 1] = field1488[i_1][i_4 * 2 - 1] * f_6;
            field1488[i_1][i_4 * 2] = field1488[i_1][i_4 * 2 - 1] * f_5 + field1488[i_1][i_4 * 2 - 2] * f_6;

            for (int i_7 = i_4 * 2 - 1; i_7 >= 2; --i_7) {
               field1488[i_1][i_7] += field1488[i_1][i_7 - 1] * f_5 + field1488[i_1][i_7 - 2] * f_6;
            }

            field1488[i_1][1] += field1488[i_1][0] * f_5 + f_6;
            field1488[i_1][0] += f_5;
         }

         if (i_1 == 0) {
            for (i_4 = 0; i_4 < this.field1490[0] * 2; i_4++) {
               field1488[0][i_4] *= field1491;
            }
         }

         for (i_4 = 0; i_4 < this.field1490[i_1] * 2; i_4++) {
            field1485[i_1][i_4] = (int)(field1488[i_1][i_4] * 65536.0F);
         }

         return this.field1490[i_1] * 2;
      }
   }

   final void method2680(ByteBuffer class300_1, class106 class106_2) {
      int i_3 = class300_1.readUnsignedByte();
      this.field1490[0] = i_3 >> 4;
      this.field1490[1] = i_3 & 0xf;
      if (i_3 != 0) {
         this.field1487[0] = class300_1.readUnsignedShort();
         this.field1487[1] = class300_1.readUnsignedShort();
         int i_4 = class300_1.readUnsignedByte();

         int i_5;
         int i_6;
         for (i_5 = 0; i_5 < 2; i_5++) {
            for (i_6 = 0; i_6 < this.field1490[i_5]; i_6++) {
               this.field1494[i_5][0][i_6] = class300_1.readUnsignedShort();
               this.field1486[i_5][0][i_6] = class300_1.readUnsignedShort();
            }
         }

         for (i_5 = 0; i_5 < 2; i_5++) {
            for (i_6 = 0; i_6 < this.field1490[i_5]; i_6++) {
               if ((i_4 & 1 << i_5 * 4 << i_6) != 0) {
                  this.field1494[i_5][1][i_6] = class300_1.readUnsignedShort();
                  this.field1486[i_5][1][i_6] = class300_1.readUnsignedShort();
               } else {
                  this.field1494[i_5][1][i_6] = this.field1494[i_5][0][i_6];
                  this.field1486[i_5][1][i_6] = this.field1486[i_5][0][i_6];
               }
            }
         }

         if (i_4 != 0 || this.field1487[1] != this.field1487[0]) {
            class106_2.method2469(class300_1);
         }
      } else {
         int[] ints_7 = this.field1487;
         this.field1487[1] = 0;
         ints_7[0] = 0;
      }

   }

   static float method2670(float f_0) {
      float f_1 = 32.703197F * (float)Math.pow(2.0D, (double)f_0);
      return f_1 * 3.1415927F / 11025.0F;
   }

}
