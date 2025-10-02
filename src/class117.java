import java.util.Random;

public class class117 {

   static int[] field1520 = new int[32768];
   static int[] field1522;
   static int[] field1503;
   static int[] field1511;
   static int[] field1507;
   static int[] field1526;
   static int[] field1527;
   static int[] field1528;
   int[] field1523 = new int[] {0, 0, 0, 0, 0};
   int[] field1512 = new int[] {0, 0, 0, 0, 0};
   int[] field1521 = new int[] {0, 0, 0, 0, 0};
   int field1524 = 0;
   int field1515 = 100;
   int field1518 = 500;
   int field1514 = 0;
   class106 field1525;
   class106 field1504;
   class106 field1505;
   class106 field1506;
   class106 field1513;
   class106 field1508;
   class106 field1509;
   class106 field1519;
   class114 field1516;
   class106 field1517;

   static {
      Random random_0 = new Random(0L);

      int i_1;
      for (i_1 = 0; i_1 < 32768; i_1++) {
         field1520[i_1] = (random_0.nextInt() & 0x2) - 1;
      }

      field1522 = new int[32768];

      for (i_1 = 0; i_1 < 32768; i_1++) {
         field1522[i_1] = (int)(Math.sin((double)i_1 / 5215.1903D) * 16384.0D);
      }

      field1503 = new int[220500];
      field1511 = new int[5];
      field1507 = new int[5];
      field1526 = new int[5];
      field1527 = new int[5];
      field1528 = new int[5];
   }

   final void method2718(ByteBuffer class300_1) {
      this.field1525 = new class106();
      this.field1525.method2464(class300_1);
      this.field1504 = new class106();
      this.field1504.method2464(class300_1);
      int i_2 = class300_1.readUnsignedByte();
      if (i_2 != 0) {
         --class300_1.position;
         this.field1505 = new class106();
         this.field1505.method2464(class300_1);
         this.field1506 = new class106();
         this.field1506.method2464(class300_1);
      }

      i_2 = class300_1.readUnsignedByte();
      if (i_2 != 0) {
         --class300_1.position;
         this.field1513 = new class106();
         this.field1513.method2464(class300_1);
         this.field1508 = new class106();
         this.field1508.method2464(class300_1);
      }

      i_2 = class300_1.readUnsignedByte();
      if (i_2 != 0) {
         --class300_1.position;
         this.field1509 = new class106();
         this.field1509.method2464(class300_1);
         this.field1519 = new class106();
         this.field1519.method2464(class300_1);
      }

      for (int i_3 = 0; i_3 < 10; i_3++) {
         int i_4 = class300_1.readSmartInt();
         if (i_4 == 0) {
            break;
         }

         this.field1523[i_3] = i_4;
         this.field1512[i_3] = class300_1.method5507();
         this.field1521[i_3] = class300_1.readSmartInt();
      }

      this.field1524 = class300_1.readSmartInt();
      this.field1515 = class300_1.readSmartInt();
      this.field1518 = class300_1.readUnsignedShortBigEndian();
      this.field1514 = class300_1.readUnsignedShortBigEndian();
      this.field1516 = new class114();
      this.field1517 = new class106();
      this.field1516.method2680(class300_1, this.field1517);
   }

   final int[] method2716(int i_1, int i_2) {
      class301.method5733(field1503, 0, i_1);
      if (i_2 < 10) {
         return field1503;
      } else {
         double d_3 = (double)i_1 / ((double)i_2 + 0.0D);
         this.field1525.method2466();
         this.field1504.method2466();
         int i_5 = 0;
         int i_6 = 0;
         int i_7 = 0;
         if (this.field1505 != null) {
            this.field1505.method2466();
            this.field1506.method2466();
            i_5 = (int)((double)(this.field1505.field1431 - this.field1505.field1436) * 32.768D / d_3);
            i_6 = (int)((double)this.field1505.field1436 * 32.768D / d_3);
         }

         int i_8 = 0;
         int i_9 = 0;
         int i_10 = 0;
         if (this.field1513 != null) {
            this.field1513.method2466();
            this.field1508.method2466();
            i_8 = (int)((double)(this.field1513.field1431 - this.field1513.field1436) * 32.768D / d_3);
            i_9 = (int)((double)this.field1513.field1436 * 32.768D / d_3);
         }

         int i_11;
         for (i_11 = 0; i_11 < 5; i_11++) {
            if (this.field1523[i_11] != 0) {
               field1511[i_11] = 0;
               field1507[i_11] = (int)((double)this.field1521[i_11] * d_3);
               field1526[i_11] = (this.field1523[i_11] << 14) / 100;
               field1527[i_11] = (int)((double)(this.field1525.field1431 - this.field1525.field1436) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1512[i_11]) / d_3);
               field1528[i_11] = (int)((double)this.field1525.field1436 * 32.768D / d_3);
            }
         }

         int i_12;
         int i_13;
         int i_14;
         int i_15;
         for (i_11 = 0; i_11 < i_1; i_11++) {
            i_12 = this.field1525.method2467(i_1);
            i_13 = this.field1504.method2467(i_1);
            if (this.field1505 != null) {
               i_14 = this.field1505.method2467(i_1);
               i_15 = this.field1506.method2467(i_1);
               i_12 += this.method2715(i_7, i_15, this.field1505.field1430) >> 1;
               i_7 = i_7 + i_6 + (i_14 * i_5 >> 16);
            }

            if (this.field1513 != null) {
               i_14 = this.field1513.method2467(i_1);
               i_15 = this.field1508.method2467(i_1);
               i_13 = i_13 * ((this.method2715(i_10, i_15, this.field1513.field1430) >> 1) + 32768) >> 15;
               i_10 = i_10 + i_9 + (i_14 * i_8 >> 16);
            }

            for (i_14 = 0; i_14 < 5; i_14++) {
               if (this.field1523[i_14] != 0) {
                  i_15 = field1507[i_14] + i_11;
                  if (i_15 < i_1) {
                     field1503[i_15] += this.method2715(field1511[i_14], i_13 * field1526[i_14] >> 15, this.field1525.field1430);
                     field1511[i_14] += (i_12 * field1527[i_14] >> 16) + field1528[i_14];
                  }
               }
            }
         }

         int i_16;
         if (this.field1509 != null) {
            this.field1509.method2466();
            this.field1519.method2466();
            i_11 = 0;
            boolean bool_19 = false;
            boolean bool_20 = true;

            for (i_14 = 0; i_14 < i_1; i_14++) {
               i_15 = this.field1509.method2467(i_1);
               i_16 = this.field1519.method2467(i_1);
               if (bool_20) {
                  i_12 = (i_15 * (this.field1509.field1431 - this.field1509.field1436) >> 8) + this.field1509.field1436;
               } else {
                  i_12 = (i_16 * (this.field1509.field1431 - this.field1509.field1436) >> 8) + this.field1509.field1436;
               }

               i_11 += 256;
               if (i_11 >= i_12) {
                  i_11 = 0;
                  bool_20 = !bool_20;
               }

               if (bool_20) {
                  field1503[i_14] = 0;
               }
            }
         }

         if (this.field1524 > 0 && this.field1515 > 0) {
            i_11 = (int)((double)this.field1524 * d_3);

            for (i_12 = i_11; i_12 < i_1; i_12++) {
               field1503[i_12] += field1503[i_12 - i_11] * this.field1515 / 100;
            }
         }

         if (this.field1516.field1490[0] > 0 || this.field1516.field1490[1] > 0) {
            this.field1517.method2466();
            i_11 = this.field1517.method2467(i_1 + 1);
            i_12 = this.field1516.method2671(0, (float)i_11 / 65536.0F);
            i_13 = this.field1516.method2671(1, (float)i_11 / 65536.0F);
            if (i_1 >= i_12 + i_13) {
               i_14 = 0;
               i_15 = i_13;
               if (i_13 > i_1 - i_12) {
                  i_15 = i_1 - i_12;
               }

               int i_17;
               while (i_14 < i_15) {
                  i_16 = (int)((long)field1503[i_14 + i_12] * (long)class114.field1492 >> 16);

                  for (i_17 = 0; i_17 < i_12; i_17++) {
                     i_16 += (int)((long)field1503[i_14 + i_12 - 1 - i_17] * (long)class114.field1485[0][i_17] >> 16);
                  }

                  for (i_17 = 0; i_17 < i_14; i_17++) {
                     i_16 -= (int)((long)field1503[i_14 - 1 - i_17] * (long)class114.field1485[1][i_17] >> 16);
                  }

                  field1503[i_14] = i_16;
                  i_11 = this.field1517.method2467(i_1 + 1);
                  ++i_14;
               }

               i_15 = 128;

               while (true) {
                  if (i_15 > i_1 - i_12) {
                     i_15 = i_1 - i_12;
                  }

                  int i_18;
                  while (i_14 < i_15) {
                     i_17 = (int)((long)field1503[i_14 + i_12] * (long)class114.field1492 >> 16);

                     for (i_18 = 0; i_18 < i_12; i_18++) {
                        i_17 += (int)((long)field1503[i_14 + i_12 - 1 - i_18] * (long)class114.field1485[0][i_18] >> 16);
                     }

                     for (i_18 = 0; i_18 < i_13; i_18++) {
                        i_17 -= (int)((long)field1503[i_14 - 1 - i_18] * (long)class114.field1485[1][i_18] >> 16);
                     }

                     field1503[i_14] = i_17;
                     i_11 = this.field1517.method2467(i_1 + 1);
                     ++i_14;
                  }

                  if (i_14 >= i_1 - i_12) {
                     while (i_14 < i_1) {
                        i_17 = 0;

                        for (i_18 = i_14 + i_12 - i_1; i_18 < i_12; i_18++) {
                           i_17 += (int)((long)field1503[i_14 + i_12 - 1 - i_18] * (long)class114.field1485[0][i_18] >> 16);
                        }

                        for (i_18 = 0; i_18 < i_13; i_18++) {
                           i_17 -= (int)((long)field1503[i_14 - 1 - i_18] * (long)class114.field1485[1][i_18] >> 16);
                        }

                        field1503[i_14] = i_17;
                        this.field1517.method2467(i_1 + 1);
                        ++i_14;
                     }
                     break;
                  }

                  i_12 = this.field1516.method2671(0, (float)i_11 / 65536.0F);
                  i_13 = this.field1516.method2671(1, (float)i_11 / 65536.0F);
                  i_15 += 128;
               }
            }
         }

         for (i_11 = 0; i_11 < i_1; i_11++) {
            if (field1503[i_11] < -32768) {
               field1503[i_11] = -32768;
            }

            if (field1503[i_11] > 32767) {
               field1503[i_11] = 32767;
            }
         }

         return field1503;
      }
   }

   final int method2715(int i_1, int i_2, int i_3) {
      return i_3 == 1 ? ((i_1 & 0x7fff) < 16384 ? i_2 : -i_2) : (i_3 == 2 ? field1522[i_1 & 0x7fff] * i_2 >> 14 : (i_3 == 3 ? (i_2 * (i_1 & 0x7fff) >> 14) - i_2 : (i_3 == 4 ? i_2 * field1520[i_1 / 2607 & 0x7fff] : 0)));
   }

}
