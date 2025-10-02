public class class202 extends class115 {

   public static class322 field2486;
   class261 field2484 = new class261();
   class98 field2487 = new class98();
   class198 field2485;

   class202(class198 class198_1) {
      this.field2485 = class198_1;
   }

   protected void vmethod3893(int[] ints_1, int i_2, int i_3) {
      this.field2487.vmethod3893(ints_1, i_2, i_3);

      for (class199 class199_6 = (class199) this.field2484.method4892(); class199_6 != null; class199_6 = (class199) this.field2484.method4894()) {
         if (!this.field2485.method3739(class199_6, 2116286373)) {
            int i_4 = i_2;
            int i_5 = i_3;

            do {
               if (i_5 <= class199_6.field2455) {
                  this.method3895(class199_6, ints_1, i_4, i_5, i_4 + i_5, 1383437948);
                  class199_6.field2455 -= i_5;
                  break;
               }

               this.method3895(class199_6, ints_1, i_4, class199_6.field2455, i_5 + i_4, 1316254184);
               i_4 += class199_6.field2455;
               i_5 -= class199_6.field2455;
            } while (!this.field2485.method3740(class199_6, ints_1, i_4, i_5, -1512694949));
         }
      }

   }

   protected void vmethod3906(int i_1) {
      this.field2487.vmethod3906(i_1);

      for (class199 class199_3 = (class199) this.field2484.method4892(); class199_3 != null; class199_3 = (class199) this.field2484.method4894()) {
         if (!this.field2485.method3739(class199_3, 2116286373)) {
            int i_2 = i_1;

            do {
               if (i_2 <= class199_3.field2455) {
                  this.method3896(class199_3, i_2, 1166888342);
                  class199_3.field2455 -= i_2;
                  break;
               }

               this.method3896(class199_3, class199_3.field2455, 1166888342);
               i_2 -= class199_3.field2455;
            } while (!this.field2485.method3740(class199_3, (int[]) null, 0, i_2, -176973860));
         }
      }

   }

   protected class115 vmethod3891() {
      class199 class199_1;
      do {
         class199_1 = (class199) this.field2484.method4894();
         if (class199_1 == null) {
            return null;
         }
      } while (class199_1.field2454 == null);

      return class199_1.field2454;
   }

   void method3896(class199 class199_1, int i_2, int i_3) {
      if ((this.field2485.field2421[class199_1.field2440] & 0x4) != 0 && class199_1.field2436 < 0) {
         int i_4 = this.field2485.field2408[class199_1.field2440] / class172.field2078;
         int i_5 = (i_4 + 1048575 - class199_1.field2444) / i_4;
         class199_1.field2444 = i_4 * i_2 + class199_1.field2444 & 0xfffff;
         if (i_5 <= i_2) {
            if (this.field2485.field2410[class199_1.field2440] == 0) {
               class199_1.field2454 = class113.method2524(class199_1.field2439, class199_1.field2454.method2539(), class199_1.field2454.method2531(), class199_1.field2454.method2541());
            } else {
               class199_1.field2454 = class113.method2524(class199_1.field2439, class199_1.field2454.method2539(), 0, class199_1.field2454.method2541());
               this.field2485.method3767(class199_1, class199_1.field2437.field2482[class199_1.field2450] < 0, (byte) -58);
            }

            if (class199_1.field2437.field2482[class199_1.field2450] < 0) {
               class199_1.field2454.method2626(-1);
            }

            i_2 = class199_1.field2444 / i_4;
         }
      }

      class199_1.field2454.vmethod3906(i_2);
   }

   void method3895(class199 class199_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6) {
      if ((this.field2485.field2421[class199_1.field2440] & 0x4) != 0 && class199_1.field2436 < 0) {
         int i_7 = this.field2485.field2408[class199_1.field2440] / class172.field2078;

         while (true) {
            int i_8 = (i_7 + 1048575 - class199_1.field2444) / i_7;
            if (i_8 > i_4) {
               class199_1.field2444 += i_4 * i_7;
               break;
            }

            class199_1.field2454.vmethod3893(ints_2, i_3, i_8);
            i_3 += i_8;
            i_4 -= i_8;
            class199_1.field2444 += i_7 * i_8 - 1048576;
            int i_9 = class172.field2078 / 100;
            int i_10 = 262144 / i_7;
            if (i_10 < i_9) {
               i_9 = i_10;
            }

            class113 class113_11 = class199_1.field2454;
            if (this.field2485.field2410[class199_1.field2440] == 0) {
               class199_1.field2454 = class113.method2524(class199_1.field2439, class113_11.method2539(), class113_11.method2531(), class113_11.method2541());
            } else {
               class199_1.field2454 = class113.method2524(class199_1.field2439, class113_11.method2539(), 0, class113_11.method2541());
               this.field2485.method3767(class199_1, class199_1.field2437.field2482[class199_1.field2450] < 0, (byte) -37);
               class199_1.field2454.method2535(i_9, class113_11.method2531());
            }

            if (class199_1.field2437.field2482[class199_1.field2450] < 0) {
               class199_1.field2454.method2626(-1);
            }

            class113_11.method2540(i_9);
            class113_11.vmethod3893(ints_2, i_3, i_5 - i_3);
            if (class113_11.method2585()) {
               this.field2487.method2286(class113_11);
            }
         }
      }

      class199_1.field2454.vmethod3893(ints_2, i_3, i_4);
   }

   protected class115 vmethod3894() {
      class199 class199_1 = (class199) this.field2484.method4892();
      return (class115) (class199_1 == null ? null : (class199_1.field2454 != null ? class199_1.field2454 : this.vmethod3891())) ;
   }

   protected int vmethod3892() {
      return 0;
   }

   static void method3911(class71 class71_0, byte b_1) {
      if (class71_0.method1680((byte) 0) != client.field655) {
         client.field655 = class71_0.method1680((byte) 0);
         boolean bool_2 = class71_0.method1680((byte) 0);
         if (bool_2 != class134.field1868) {
            class254.field3407.method3323();
            class254.field3408.method3323();
            class254.field3445.method3323();
            class134.field1868 = bool_2;
         }
      }

      class73.field1068 = class71_0.field1029;
      client.field807 = class71_0.field1025;
      client.field653 = class71_0.field1023;
      class190.field2358 = client.field703 == 0 ? 43594 : class71_0.field1025 + 40000;
      class132.field1800 = client.field703 == 0 ? 443 : class71_0.field1025 + 50000;
      class90.field1266 = class190.field2358;
   }

   static final void method3912(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      int i_7 = i_2 - i_0;
      int i_8 = i_3 - i_1;
      int i_9 = i_7 >= 0 ? i_7 : -i_7;
      int i_10 = i_8 >= 0 ? i_8 : -i_8;
      int i_11 = i_9;
      if (i_9 < i_10) {
         i_11 = i_10;
      }

      if (i_11 != 0) {
         int i_12 = (i_7 << 16) / i_11;
         int i_13 = (i_8 << 16) / i_11;
         if (i_13 <= i_12) {
            i_12 = -i_12;
         } else {
            i_13 = -i_13;
         }

         int i_14 = i_5 * i_13 >> 17;
         int i_15 = i_5 * i_13 + 1 >> 17;
         int i_16 = i_5 * i_12 >> 17;
         int i_17 = i_5 * i_12 + 1 >> 17;
         i_0 -= class321.field3874;
         i_1 -= class321.field3870;
         int i_18 = i_0 + i_14;
         int i_19 = i_0 - i_15;
         int i_20 = i_0 + i_7 - i_15;
         int i_21 = i_0 + i_7 + i_14;
         int i_22 = i_16 + i_1;
         int i_23 = i_1 - i_17;
         int i_24 = i_8 + i_1 - i_17;
         int i_25 = i_8 + i_16 + i_1;
         class130.method2981(i_18, i_19, i_20);
         class130.method3007(i_22, i_23, i_24, i_18, i_19, i_20, i_4);
         class130.method2981(i_18, i_20, i_21);
         class130.method3007(i_22, i_24, i_25, i_18, i_20, i_21, i_4);
      }
   }

}
