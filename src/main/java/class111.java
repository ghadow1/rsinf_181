public class class111 {

   int field1459 = class102.method2345(16);
   int field1454 = class102.method2345(24);
   int field1455 = class102.method2345(24);
   int field1456 = class102.method2345(24) + 1;
   int field1457 = class102.method2345(6) + 1;
   int field1453 = class102.method2345(8);
   int[] field1458;

   class111() {
      int[] ints_1 = new int[this.field1457];

      int i_2;
      for (i_2 = 0; i_2 < this.field1457; i_2++) {
         int i_3 = 0;
         int i_4 = class102.method2345(3);
         boolean bool_5 = class102.method2344() != 0;
         if (bool_5) {
            i_3 = class102.method2345(5);
         }

         ints_1[i_2] = i_3 << 3 | i_4;
      }

      this.field1458 = new int[this.field1457 * 8];

      for (i_2 = 0; i_2 < this.field1457 * 8; i_2++) {
         this.field1458[i_2] = (ints_1[i_2 >> 3] & 1 << (i_2 & 0x7)) != 0 ? class102.method2345(8) : -1;
      }

   }

   void method2499(float[] floats_1, int i_2, boolean bool_3) {
      int i_4;
      for (i_4 = 0; i_4 < i_2; i_4++) {
         floats_1[i_4] = 0.0F;
      }

      if (!bool_3) {
         i_4 = class102.field1369[this.field1453].field1350;
         int i_5 = this.field1455 - this.field1454;
         int i_6 = i_5 / this.field1456;
         int[] ints_7 = new int[i_6];

         for (int i_8 = 0; i_8 < 8; i_8++) {
            int i_9 = 0;

            while (i_9 < i_6) {
               int i_10;
               int i_11;
               if (i_8 == 0) {
                  i_10 = class102.field1369[this.field1453].method2325();

                  for (i_11 = i_4 - 1; i_11 >= 0; --i_11) {
                     if (i_9 + i_11 < i_6) {
                        ints_7[i_9 + i_11] = i_10 % this.field1457;
                     }

                     i_10 /= this.field1457;
                  }
               }

               for (i_10 = 0; i_10 < i_4; i_10++) {
                  i_11 = ints_7[i_9];
                  int i_12 = this.field1458[i_8 + i_11 * 8];
                  if (i_12 >= 0) {
                     int i_13 = i_9 * this.field1456 + this.field1454;
                     class100 class100_14 = class102.field1369[i_12];
                     int i_15;
                     if (this.field1459 == 0) {
                        i_15 = this.field1456 / class100_14.field1350;

                        for (int i_16 = 0; i_16 < i_15; i_16++) {
                           float[] floats_17 = class100_14.method2318();

                           for (int i_18 = 0; i_18 < class100_14.field1350; i_18++) {
                              floats_1[i_13 + i_16 + i_18 * i_15] += floats_17[i_18];
                           }
                        }
                     } else {
                        i_15 = 0;

                        while (i_15 < this.field1456) {
                           float[] floats_19 = class100_14.method2318();

                           for (int i_20 = 0; i_20 < class100_14.field1350; i_20++) {
                              floats_1[i_13 + i_15] += floats_19[i_20];
                              ++i_15;
                           }
                        }
                     }
                  }

                  ++i_9;
                  if (i_9 >= i_6) {
                     break;
                  }
               }
            }
         }

      }
   }

}
