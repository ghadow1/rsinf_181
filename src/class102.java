public class class102 extends class180 {

   static boolean field1372 = false;
   int field1356;
   int field1357;
   int field1358;
   int field1359;
   boolean field1364;
   byte[][] field1366;
   int field1374;
   float[] field1382;
   byte[] field1362;
   int field1387;
   int field1381;
   static float[] field1378;
   int field1388;
   boolean field1370;
   static int field1363;
   static int field1376;
   static byte[] field1361;
   static int field1375;
   static int field1365;
   static class100[] field1369;
   static class104[] field1367;
   static class111[] field1368;
   static class116[] field1386;
   static boolean[] field1360;
   static int[] field1371;
   static float[] field1355;
   static float[] field1379;
   static float[] field1380;
   static int[] field1384;
   static float[] field1377;
   static float[] field1373;
   static float[] field1383;
   static int[] field1385;

   class102(byte[] bytes_1) {
      this.method2346(bytes_1);
   }

   void method2346(byte[] bytes_1) {
      class300 class300_2 = new class300(bytes_1);
      this.field1356 = class300_2.method5499((byte) -41);
      this.field1357 = class300_2.method5499((byte) -18);
      this.field1358 = class300_2.method5499((byte) -5);
      this.field1359 = class300_2.method5499((byte) -60);
      if (this.field1359 < 0) {
         this.field1359 = ~this.field1359;
         this.field1364 = true;
      }

      int i_3 = class300_2.method5499((byte) -117);
      this.field1366 = new byte[i_3][];

      for (int i_4 = 0; i_4 < i_3; i_4++) {
         int i_5 = 0;

         int i_6;
         do {
            i_6 = class300_2.method5504((byte) 39);
            i_5 += i_6;
         } while (i_6 >= 255);

         byte[] bytes_7 = new byte[i_5];
         class300_2.method5697(bytes_7, 0, i_5, (byte) 1);
         this.field1366[i_4] = bytes_7;
      }

   }

   class103 method2370(int[] ints_1) {
      if (ints_1 != null && ints_1[0] <= 0) {
         return null;
      } else {
         if (this.field1362 == null) {
            this.field1374 = 0;
            this.field1382 = new float[field1365];
            this.field1362 = new byte[this.field1357];
            this.field1387 = 0;
            this.field1381 = 0;
         }

         for (; this.field1381 < this.field1366.length; this.field1381++) {
            if (ints_1 != null && ints_1[0] <= 0) {
               return null;
            }

            float[] floats_2 = this.method2348(this.field1381);
            if (floats_2 != null) {
               int i_3 = this.field1387;
               int i_4 = floats_2.length;
               if (i_4 > this.field1357 - i_3) {
                  i_4 = this.field1357 - i_3;
               }

               for (int i_5 = 0; i_5 < i_4; i_5++) {
                  int i_6 = (int)(128.0F + floats_2[i_5] * 128.0F);
                  if ((i_6 & ~0xff) != 0) {
                     i_6 = ~i_6 >> 31;
                  }

                  this.field1362[i_3++] = (byte)(i_6 - 128);
               }

               if (ints_1 != null) {
                  ints_1[0] -= i_3 - this.field1387;
               }

               this.field1387 = i_3;
            }
         }

         this.field1382 = null;
         byte[] bytes_7 = this.field1362;
         this.field1362 = null;
         return new class103(this.field1356, bytes_7, this.field1358, this.field1359, this.field1364);
      }
   }

   float[] method2348(int i_1) {
      method2352(this.field1366[i_1], 0);
      method2344();
      int i_2 = method2345(class144.method3316(field1371.length - 1, -1541949649));
      boolean bool_3 = field1360[i_2];
      int i_4 = bool_3 ? field1365 : field1375;
      boolean bool_5 = false;
      boolean bool_6 = false;
      if (bool_3) {
         bool_5 = method2344() != 0;
         bool_6 = method2344() != 0;
      }

      int i_7 = i_4 >> 1;
      int i_8;
      int i_9;
      int i_10;
      if (bool_3 && !bool_5) {
         i_8 = (i_4 >> 2) - (field1375 >> 2);
         i_9 = (field1375 >> 2) + (i_4 >> 2);
         i_10 = field1375 >> 1;
      } else {
         i_8 = 0;
         i_9 = i_7;
         i_10 = i_4 >> 1;
      }

      int i_11;
      int i_12;
      int i_13;
      if (bool_3 && !bool_6) {
         i_11 = i_4 - (i_4 >> 2) - (field1375 >> 2);
         i_12 = (field1375 >> 2) + (i_4 - (i_4 >> 2));
         i_13 = field1375 >> 1;
      } else {
         i_11 = i_7;
         i_12 = i_4;
         i_13 = i_4 >> 1;
      }

      class116 class116_14 = field1386[field1371[i_2]];
      int i_16 = class116_14.field1502;
      int i_17 = class116_14.field1501[i_16];
      boolean bool_15 = !field1367[i_17].method2377();
      boolean bool_45 = bool_15;

      for (i_17 = 0; i_17 < class116_14.field1500; i_17++) {
         class111 class111_18 = field1368[class116_14.field1499[i_17]];
         float[] floats_19 = field1378;
         class111_18.method2499(floats_19, i_4 >> 1, bool_45);
      }

      int i_40;
      if (!bool_15) {
         i_17 = class116_14.field1502;
         i_40 = class116_14.field1501[i_17];
         field1367[i_40].method2389(field1378, i_4 >> 1);
      }

      int i_42;
      if (bool_15) {
         for (i_17 = i_4 >> 1; i_17 < i_4; i_17++) {
            field1378[i_17] = 0.0F;
         }
      } else {
         i_17 = i_4 >> 1;
         i_40 = i_4 >> 2;
         i_42 = i_4 >> 3;
         float[] floats_43 = field1378;

         int i_21;
         for (i_21 = 0; i_21 < i_17; i_21++) {
            floats_43[i_21] *= 0.5F;
         }

         for (i_21 = i_17; i_21 < i_4; i_21++) {
            floats_43[i_21] = -floats_43[i_4 - i_21 - 1];
         }

         float[] floats_44 = bool_3 ? field1377 : field1355;
         float[] floats_22 = bool_3 ? field1373 : field1379;
         float[] floats_23 = bool_3 ? field1383 : field1380;
         int[] ints_24 = bool_3 ? field1385 : field1384;

         int i_25;
         float f_26;
         float f_27;
         float f_28;
         float f_29;
         for (i_25 = 0; i_25 < i_40; i_25++) {
            f_26 = floats_43[i_25 * 4] - floats_43[i_4 - i_25 * 4 - 1];
            f_27 = floats_43[i_25 * 4 + 2] - floats_43[i_4 - i_25 * 4 - 3];
            f_28 = floats_44[i_25 * 2];
            f_29 = floats_44[i_25 * 2 + 1];
            floats_43[i_4 - i_25 * 4 - 1] = f_26 * f_28 - f_27 * f_29;
            floats_43[i_4 - i_25 * 4 - 3] = f_26 * f_29 + f_27 * f_28;
         }

         float f_30;
         float f_31;
         for (i_25 = 0; i_25 < i_42; i_25++) {
            f_26 = floats_43[i_17 + i_25 * 4 + 3];
            f_27 = floats_43[i_17 + i_25 * 4 + 1];
            f_28 = floats_43[i_25 * 4 + 3];
            f_29 = floats_43[i_25 * 4 + 1];
            floats_43[i_17 + i_25 * 4 + 3] = f_26 + f_28;
            floats_43[i_17 + i_25 * 4 + 1] = f_27 + f_29;
            f_30 = floats_44[i_17 - 4 - i_25 * 4];
            f_31 = floats_44[i_17 - 3 - i_25 * 4];
            floats_43[i_25 * 4 + 3] = (f_26 - f_28) * f_30 - (f_27 - f_29) * f_31;
            floats_43[i_25 * 4 + 1] = (f_27 - f_29) * f_30 + (f_26 - f_28) * f_31;
         }

         i_25 = class144.method3316(i_4 - 1, -654918836);

         int i_47;
         int i_48;
         int i_49;
         int i_50;
         for (i_47 = 0; i_47 < i_25 - 3; i_47++) {
            i_48 = i_4 >> i_47 + 2;
            i_49 = 8 << i_47;

            for (i_50 = 0; i_50 < 2 << i_47; i_50++) {
               int i_51 = i_4 - i_48 * i_50 * 2;
               int i_52 = i_4 - i_48 * (i_50 * 2 + 1);

               for (int i_32 = 0; i_32 < i_4 >> i_47 + 4; i_32++) {
                  int i_33 = i_32 * 4;
                  float f_34 = floats_43[i_51 - 1 - i_33];
                  float f_35 = floats_43[i_51 - 3 - i_33];
                  float f_36 = floats_43[i_52 - 1 - i_33];
                  float f_37 = floats_43[i_52 - 3 - i_33];
                  floats_43[i_51 - 1 - i_33] = f_34 + f_36;
                  floats_43[i_51 - 3 - i_33] = f_35 + f_37;
                  float f_38 = floats_44[i_32 * i_49];
                  float f_39 = floats_44[i_32 * i_49 + 1];
                  floats_43[i_52 - 1 - i_33] = (f_34 - f_36) * f_38 - (f_35 - f_37) * f_39;
                  floats_43[i_52 - 3 - i_33] = (f_35 - f_37) * f_38 + (f_34 - f_36) * f_39;
               }
            }
         }

         for (i_47 = 1; i_47 < i_42 - 1; i_47++) {
            i_48 = ints_24[i_47];
            if (i_47 < i_48) {
               i_49 = i_47 * 8;
               i_50 = i_48 * 8;
               f_30 = floats_43[i_49 + 1];
               floats_43[i_49 + 1] = floats_43[i_50 + 1];
               floats_43[i_50 + 1] = f_30;
               f_30 = floats_43[i_49 + 3];
               floats_43[i_49 + 3] = floats_43[i_50 + 3];
               floats_43[i_50 + 3] = f_30;
               f_30 = floats_43[i_49 + 5];
               floats_43[i_49 + 5] = floats_43[i_50 + 5];
               floats_43[i_50 + 5] = f_30;
               f_30 = floats_43[i_49 + 7];
               floats_43[i_49 + 7] = floats_43[i_50 + 7];
               floats_43[i_50 + 7] = f_30;
            }
         }

         for (i_47 = 0; i_47 < i_17; i_47++) {
            floats_43[i_47] = floats_43[i_47 * 2 + 1];
         }

         for (i_47 = 0; i_47 < i_42; i_47++) {
            floats_43[i_4 - 1 - i_47 * 2] = floats_43[i_47 * 4];
            floats_43[i_4 - 2 - i_47 * 2] = floats_43[i_47 * 4 + 1];
            floats_43[i_4 - i_40 - 1 - i_47 * 2] = floats_43[i_47 * 4 + 2];
            floats_43[i_4 - i_40 - 2 - i_47 * 2] = floats_43[i_47 * 4 + 3];
         }

         for (i_47 = 0; i_47 < i_42; i_47++) {
            f_27 = floats_23[i_47 * 2];
            f_28 = floats_23[i_47 * 2 + 1];
            f_29 = floats_43[i_17 + i_47 * 2];
            f_30 = floats_43[i_17 + i_47 * 2 + 1];
            f_31 = floats_43[i_4 - 2 - i_47 * 2];
            float f_53 = floats_43[i_4 - 1 - i_47 * 2];
            float f_54 = f_28 * (f_29 - f_31) + f_27 * (f_30 + f_53);
            floats_43[i_17 + i_47 * 2] = (f_29 + f_31 + f_54) * 0.5F;
            floats_43[i_4 - 2 - i_47 * 2] = (f_29 + f_31 - f_54) * 0.5F;
            f_54 = f_28 * (f_30 + f_53) - f_27 * (f_29 - f_31);
            floats_43[i_17 + i_47 * 2 + 1] = (f_30 - f_53 + f_54) * 0.5F;
            floats_43[i_4 - 1 - i_47 * 2] = (-f_30 + f_53 + f_54) * 0.5F;
         }

         for (i_47 = 0; i_47 < i_40; i_47++) {
            floats_43[i_47] = floats_43[i_17 + i_47 * 2] * floats_22[i_47 * 2] + floats_43[i_17 + i_47 * 2 + 1] * floats_22[i_47 * 2 + 1];
            floats_43[i_17 - 1 - i_47] = floats_43[i_17 + i_47 * 2] * floats_22[i_47 * 2 + 1] - floats_43[i_17 + i_47 * 2 + 1] * floats_22[i_47 * 2];
         }

         for (i_47 = 0; i_47 < i_40; i_47++) {
            floats_43[i_47 + (i_4 - i_40)] = -floats_43[i_47];
         }

         for (i_47 = 0; i_47 < i_40; i_47++) {
            floats_43[i_47] = floats_43[i_40 + i_47];
         }

         for (i_47 = 0; i_47 < i_40; i_47++) {
            floats_43[i_40 + i_47] = -floats_43[i_40 - i_47 - 1];
         }

         for (i_47 = 0; i_47 < i_40; i_47++) {
            floats_43[i_17 + i_47] = floats_43[i_4 - i_47 - 1];
         }

         for (i_47 = i_8; i_47 < i_9; i_47++) {
            f_27 = (float)Math.sin(((double)(i_47 - i_8) + 0.5D) / (double)i_10 * 0.5D * 3.141592653589793D);
            field1378[i_47] *= (float)Math.sin(1.5707963267948966D * (double)f_27 * (double)f_27);
         }

         for (i_47 = i_11; i_47 < i_12; i_47++) {
            f_27 = (float)Math.sin(((double)(i_47 - i_11) + 0.5D) / (double)i_13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field1378[i_47] *= (float)Math.sin(1.5707963267948966D * (double)f_27 * (double)f_27);
         }
      }

      float[] floats_41 = null;
      if (this.field1374 > 0) {
         i_40 = i_4 + this.field1374 >> 2;
         floats_41 = new float[i_40];
         int i_20;
         if (!this.field1370) {
            for (i_42 = 0; i_42 < this.field1388; i_42++) {
               i_20 = i_42 + (this.field1374 >> 1);
               floats_41[i_42] += this.field1382[i_20];
            }
         }

         if (!bool_15) {
            for (i_42 = i_8; i_42 < i_4 >> 1; i_42++) {
               i_20 = floats_41.length - (i_4 >> 1) + i_42;
               floats_41[i_20] += field1378[i_42];
            }
         }
      }

      float[] floats_46 = this.field1382;
      this.field1382 = field1378;
      field1378 = floats_46;
      this.field1374 = i_4;
      this.field1388 = i_12 - (i_4 >> 1);
      this.field1370 = bool_15;
      return floats_41;
   }

   static int method2344() {
      int i_0 = field1361[field1376] >> field1363 & 0x1;
      ++field1363;
      field1376 += field1363 >> 3;
      field1363 &= 0x7;
      return i_0;
   }

   static int method2345(int i_0) {
      int i_1 = 0;

      int i_2;
      int i_3;
      for (i_2 = 0; i_0 >= 8 - field1363; i_0 -= i_3) {
         i_3 = 8 - field1363;
         int i_4 = (1 << i_3) - 1;
         i_1 += (field1361[field1376] >> field1363 & i_4) << i_2;
         field1363 = 0;
         ++field1376;
         i_2 += i_3;
      }

      if (i_0 > 0) {
         i_3 = (1 << i_0) - 1;
         i_1 += (field1361[field1376] >> field1363 & i_3) << i_2;
         field1363 += i_0;
      }

      return i_1;
   }

   static void method2352(byte[] bytes_0, int i_1) {
      field1361 = bytes_0;
      field1376 = i_1;
      field1363 = 0;
   }

   static boolean method2349(class233 class233_0) {
      if (!field1372) {
         byte[] bytes_1 = class233_0.method4144(0, 0, -70468213);
         if (bytes_1 == null) {
            return false;
         }

         method2351(bytes_1);
         field1372 = true;
      }

      return true;
   }

   static class102 method2355(class233 class233_0, int i_1, int i_2) {
      if (!method2349(class233_0)) {
         class233_0.method4146(i_1, i_2, -416813220);
         return null;
      } else {
         byte[] bytes_3 = class233_0.method4144(i_1, i_2, -1613934274);
         return bytes_3 == null ? null : new class102(bytes_3);
      }
   }

   static void method2351(byte[] bytes_0) {
      method2352(bytes_0, 0);
      field1375 = 1 << method2345(4);
      field1365 = 1 << method2345(4);
      field1378 = new float[field1365];

      int i_1;
      int i_2;
      int i_3;
      int i_4;
      int i_5;
      for (i_1 = 0; i_1 < 2; i_1++) {
         i_2 = i_1 != 0 ? field1365 : field1375;
         i_3 = i_2 >> 1;
         i_4 = i_2 >> 2;
         i_5 = i_2 >> 3;
         float[] floats_6 = new float[i_3];

         for (int i_7 = 0; i_7 < i_4; i_7++) {
            floats_6[i_7 * 2] = (float)Math.cos((double)(i_7 * 4) * 3.141592653589793D / (double)i_2);
            floats_6[i_7 * 2 + 1] = -((float)Math.sin((double)(i_7 * 4) * 3.141592653589793D / (double)i_2));
         }

         float[] floats_12 = new float[i_3];

         for (int i_8 = 0; i_8 < i_4; i_8++) {
            floats_12[i_8 * 2] = (float)Math.cos((double)(i_8 * 2 + 1) * 3.141592653589793D / (double)(i_2 * 2));
            floats_12[i_8 * 2 + 1] = (float)Math.sin((double)(i_8 * 2 + 1) * 3.141592653589793D / (double)(i_2 * 2));
         }

         float[] floats_13 = new float[i_4];

         for (int i_9 = 0; i_9 < i_5; i_9++) {
            floats_13[i_9 * 2] = (float)Math.cos((double)(i_9 * 4 + 2) * 3.141592653589793D / (double)i_2);
            floats_13[i_9 * 2 + 1] = -((float)Math.sin((double)(i_9 * 4 + 2) * 3.141592653589793D / (double)i_2));
         }

         int[] ints_14 = new int[i_5];
         int i_10 = class144.method3316(i_5 - 1, -1481251543);

         for (int i_11 = 0; i_11 < i_5; i_11++) {
            ints_14[i_11] = class73.method1757(i_11, i_10, (byte) -46);
         }

         if (i_1 != 0) {
            field1377 = floats_6;
            field1373 = floats_12;
            field1383 = floats_13;
            field1385 = ints_14;
         } else {
            field1355 = floats_6;
            field1379 = floats_12;
            field1380 = floats_13;
            field1384 = ints_14;
         }
      }

      i_1 = method2345(8) + 1;
      field1369 = new class100[i_1];

      for (i_2 = 0; i_2 < i_1; i_2++) {
         field1369[i_2] = new class100();
      }

      i_2 = method2345(6) + 1;

      for (i_3 = 0; i_3 < i_2; i_3++) {
         method2345(16);
      }

      i_2 = method2345(6) + 1;
      field1367 = new class104[i_2];

      for (i_3 = 0; i_3 < i_2; i_3++) {
         field1367[i_3] = new class104();
      }

      i_3 = method2345(6) + 1;
      field1368 = new class111[i_3];

      for (i_4 = 0; i_4 < i_3; i_4++) {
         field1368[i_4] = new class111();
      }

      i_4 = method2345(6) + 1;
      field1386 = new class116[i_4];

      for (i_5 = 0; i_5 < i_4; i_5++) {
         field1386[i_5] = new class116();
      }

      i_5 = method2345(6) + 1;
      field1360 = new boolean[i_5];
      field1371 = new int[i_5];

      for (int i_15 = 0; i_15 < i_5; i_15++) {
         field1360[i_15] = method2344() != 0;
         method2345(16);
         method2345(16);
         field1371[i_15] = method2345(8);
      }

   }

   static float method2367(int i_0) {
      int i_1 = i_0 & 0x1fffff;
      int i_2 = i_0 & ~0x7fffffff;
      int i_3 = (i_0 & 0x7fe00000) >> 21;
      if (i_2 != 0) {
         i_1 = -i_1;
      }

      return (float)((double)i_1 * Math.pow(2.0D, (double)(i_3 - 788)));
   }

}
