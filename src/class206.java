import java.nio.ByteBuffer;

public class class206 extends class205 {

   static class233 field2498;
   static int[] field2501;
   ByteBuffer field2499;

   public void vmethod3934(byte[] bytes_1, int i_2) {
      this.field2499 = ByteBuffer.allocateDirect(bytes_1.length);
      this.field2499.position(0);
      this.field2499.put(bytes_1);
   }

   byte[] vmethod3935(int i_1) {
      byte[] bytes_2 = new byte[this.field2499.capacity()];
      this.field2499.position(0);
      this.field2499.get(bytes_2);
      return bytes_2;
   }

   public static final synchronized long method3939() {
      long long_1 = System.currentTimeMillis();
      if (long_1 < class46.field416) {
         class2.field4 += class46.field416 - long_1;
      }

      class46.field416 = long_1;
      return class2.field4 + long_1;
   }

   static final void method3938(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      if (i_2 >= 1 && i_3 >= 1 && i_2 <= 102 && i_3 <= 102) {
         if (client.field656 && i_0 != class42.field372) {
            return;
         }

         long long_8 = 0L;
         boolean bool_10 = true;
         boolean bool_11 = false;
         boolean bool_12 = false;
         if (i_1 == 0) {
            long_8 = class5.field22.method3130(i_0, i_2, i_3);
         }

         if (i_1 == 1) {
            long_8 = class5.field22.method3180(i_0, i_2, i_3);
         }

         if (i_1 == 2) {
            long_8 = class5.field22.method3094(i_0, i_2, i_3);
         }

         if (i_1 == 3) {
            long_8 = class5.field22.method3095(i_0, i_2, i_3);
         }

         int i_13;
         if (long_8 != 0L) {
            i_13 = class5.field22.method3096(i_0, i_2, i_3, long_8);
            int i_15 = class43.method770(long_8);
            int i_16 = i_13 & 0x1f;
            int i_17 = i_13 >> 6 & 0x3;
            class253 class253_14;
            if (i_1 == 0) {
               class5.field22.method3208(i_0, i_2, i_3);
               class253_14 = class128.method2970(i_15, (short) 4095);
               if (class253_14.field3382 != 0) {
                  client.field710[i_0].method3564(i_2, i_3, i_16, i_17, class253_14.field3368, -1166825819);
               }
            }

            if (i_1 == 1) {
               class5.field22.method3084(i_0, i_2, i_3);
            }

            if (i_1 == 2) {
               class5.field22.method3154(i_0, i_2, i_3);
               class253_14 = class128.method2970(i_15, (short) 4095);
               if (i_2 + class253_14.field3365 > 103 || i_3 + class253_14.field3365 > 103 || i_2 + class253_14.field3366 > 103 || i_3 + class253_14.field3366 > 103) {
                  return;
               }

               if (class253_14.field3382 != 0) {
                  client.field710[i_0].method3565(i_2, i_3, class253_14.field3365, class253_14.field3366, i_17, class253_14.field3368);
               }
            }

            if (i_1 == 3) {
               class5.field22.method3201(i_0, i_2, i_3);
               class253_14 = class128.method2970(i_15, (short) 4095);
               if (class253_14.field3382 == 1) {
                  client.field710[i_0].method3567(i_2, i_3);
               }
            }
         }

         if (i_4 >= 0) {
            i_13 = i_0;
            if (i_0 < 3 && (class55.field502[1][i_2][i_3] & 0x2) == 2) {
               i_13 = i_0 + 1;
            }

            class183.method3611(i_0, i_13, i_2, i_3, i_4, i_5, i_6, class5.field22, client.field710[i_0], 1078750200);
         }
      }

   }

}
