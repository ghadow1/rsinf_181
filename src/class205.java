public abstract class class205 {

   public abstract void vmethod3934(byte[] var1, int var2);

   abstract byte[] vmethod3935(int var1);

   static final void method3933(byte[] bytes_0, int i_1, int i_2, class133 class133_3, class172[] arr_4) {
      class300 class300_6 = new class300(bytes_0);
      int i_7 = -1;

      while (true) {
         int i_8 = class300_6.method5509();
         if (i_8 == 0) {
            return;
         }

         i_7 += i_8;
         int i_9 = 0;

         while (true) {
            int i_10 = class300_6.method5508();
            if (i_10 == 0) {
               break;
            }

            i_9 += i_10 - 1;
            int i_11 = i_9 & 0x3f;
            int i_12 = i_9 >> 6 & 0x3f;
            int i_13 = i_9 >> 12;
            int i_14 = class300_6.method5504();
            int i_15 = i_14 >> 2;
            int i_16 = i_14 & 0x3;
            int i_17 = i_12 + i_1;
            int i_18 = i_11 + i_2;
            if (i_17 > 0 && i_18 > 0 && i_17 < 103 && i_18 < 103) {
               int i_19 = i_13;
               if ((class55.field502[1][i_17][i_18] & 0x2) == 2) {
                  i_19 = i_13 - 1;
               }

               class172 class172_20 = null;
               if (i_19 >= 0) {
                  class172_20 = arr_4[i_19];
               }

               class67.method1236(i_13, i_17, i_18, i_7, i_16, i_15, class133_3, class172_20, (short) -20022);
            }
         }
      }
   }

}
