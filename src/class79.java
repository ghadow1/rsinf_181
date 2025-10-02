public final class class79 extends class69 {

   static class325 field1135;
   class256 field1134;

   protected final class127 vmethod3253(int i_1) {
      if (this.field1134 == null) {
         return null;
      } else {
         class258 class258_2 = super.field981 != -1 && super.field984 == 0 ? class7.method81(super.field981, (byte) 1) : null;
         class258 class258_3 = super.field978 != -1 && (super.field1004 != super.field978 || class258_2 == null) ? class7.method81(super.field978, (byte) 1) : null;
         class127 class127_4 = this.field1134.method4707(class258_2, super.field951, class258_3, super.field979, (byte) 99);
         if (class127_4 == null) {
            return null;
         } else {
            class127_4.method2899();
            super.field999 = class127_4.field1873;
            if (super.field986 != -1 && super.field987 != -1) {
               class127 class127_5 = class201.method3887(super.field986, (byte) 2).method4406(super.field987, 1645713423);
               if (class127_5 != null) {
                  class127_5.method2901(0, -super.field990, 0);
                  class127[] arr_6 = new class127[] {class127_4, class127_5};
                  class127_4 = new class127(arr_6, 2);
               }
            }

            if (this.field1134.field3469 == 1) {
               class127_4.field1730 = true;
            }

            return class127_4;
         }
      }
   }

   final boolean vmethod1965(int i_1) {
      return this.field1134 != null;
   }

   final void method1974(int i_1, byte b_2) {
      int i_4 = super.field994[0];
      int i_5 = super.field962[0];
      if (i_1 == 0) {
         --i_4;
         ++i_5;
      }

      if (i_1 == 1) {
         ++i_5;
      }

      if (i_1 == 2) {
         ++i_4;
         ++i_5;
      }

      if (i_1 == 3) {
         --i_4;
      }

      if (i_1 == 4) {
         ++i_4;
      }

      if (i_1 == 5) {
         --i_4;
         --i_5;
      }

      if (i_1 == 6) {
         --i_5;
      }

      if (i_1 == 7) {
         ++i_4;
         --i_5;
      }

      if (super.field981 != -1 && class7.method81(super.field981, (byte) 1).field3532 == 1) {
         super.field981 = -1;
      }

      if (super.field1003 < 9) {
         ++super.field1003;
      }

      for (int i_6 = super.field1003; i_6 > 0; --i_6) {
         super.field994[i_6] = super.field994[i_6 - 1];
         super.field962[i_6] = super.field962[i_6 - 1];
         super.field1006[i_6] = super.field1006[i_6 - 1];
      }

      super.field994[0] = i_4;
      super.field962[0] = i_5;
      super.field1006[0] = b_2;
   }

   final void method1963(int i_1, int i_2, boolean bool_3, short s_4) {
      if (super.field981 != -1 && class7.method81(super.field981, (byte) 1).field3532 == 1) {
         super.field981 = -1;
      }

      if (!bool_3) {
         int i_5 = i_1 - super.field994[0];
         int i_6 = i_2 - super.field962[0];
         if (i_5 >= -8 && i_5 <= 8 && i_6 >= -8 && i_6 <= 8) {
            if (super.field1003 < 9) {
               ++super.field1003;
            }

            for (int i_7 = super.field1003; i_7 > 0; --i_7) {
               super.field994[i_7] = super.field994[i_7 - 1];
               super.field962[i_7] = super.field962[i_7 - 1];
               super.field1006[i_7] = super.field1006[i_7 - 1];
            }

            super.field994[0] = i_1;
            super.field962[0] = i_2;
            super.field1006[0] = 1;
            return;
         }
      }

      super.field1003 = 0;
      super.field1008 = 0;
      super.field1007 = 0;
      super.field994[0] = i_1;
      super.field962[0] = i_2;
      super.field1005 = super.field952 * 64 + super.field994[0] * 128;
      super.field949 = super.field952 * 64 + super.field962[0] * 128;
   }

   static int method1977(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      return i_0 < 1000 ? class132.method3064(i_0, bool_2) : (i_0 < 1100 ? class134.method3250(i_0, class92_1, bool_2, (byte) -93) : (i_0 < 1200 ? class83.method1994(i_0, class92_1, bool_2, -9434950) : (i_0 < 1300 ? class25.method324(i_0, class92_1, bool_2, (byte) -119) : (i_0 < 1400 ? class152.method3389(i_0, class92_1, bool_2, (short) -7813) : (i_0 < 1500 ? class77.method1943(i_0, class92_1, bool_2, (short) -11723) : (i_0 < 1600 ? class12.method147(i_0, class92_1, bool_2, 1661608853) : (i_0 < 1700 ? class82.method1992(i_0, class92_1, bool_2, -426931132) : (i_0 < 1800 ? class169.method3501(i_0, class92_1, bool_2, -786180451) : (i_0 < 1900 ? class230.method4137(i_0, class92_1, bool_2, -1636258729) : (i_0 < 2000 ? class58.method1100(i_0, class92_1, bool_2, (byte) 65) : (i_0 < 2100 ? class134.method3250(i_0, class92_1, bool_2, (byte) -105) : (i_0 < 2200 ? class83.method1994(i_0, class92_1, bool_2, 78865878) : (i_0 < 2300 ? class25.method324(i_0, class92_1, bool_2, (byte) -34) : (i_0 < 2400 ? class152.method3389(i_0, class92_1, bool_2, (short) -1931) : (i_0 < 2500 ? class77.method1943(i_0, class92_1, bool_2, (short) -21608) : (i_0 < 2600 ? class62.method1127(i_0, class92_1, bool_2, 1342533566) : (i_0 < 2700 ? class119.method2743(i_0, class92_1, bool_2, 465921756) : (i_0 < 2800 ? class143.method3306(i_0, class92_1, bool_2, 337474973) : (i_0 < 2900 ? class244.method4433(i_0, class92_1, bool_2, 1586535295) : (i_0 < 3000 ? class58.method1100(i_0, class92_1, bool_2, (byte) 20) : (i_0 < 3200 ? class30.method536(i_0, class92_1, bool_2, (byte) 69) : (i_0 < 3300 ? class233.method4172(i_0, class92_1, bool_2, -74440934) : (i_0 < 3400 ? class31.method540(i_0, class92_1, bool_2, -216787124) : (i_0 < 3500 ? class65.method1175(i_0, class92_1, bool_2, -953201371) : (i_0 < 3700 ? class30.method535(i_0, class92_1, bool_2, 1145147367) : (i_0 < 4000 ? class74.method1817(i_0, class92_1, bool_2, -680519065) : (i_0 < 4100 ? class251.method4532(i_0, class92_1, bool_2, -2052329100) : (i_0 < 4200 ? class208.method3941(i_0, class92_1, bool_2, (byte) 17) : (i_0 < 4300 ? class292.method5316(i_0, class92_1, bool_2, -225592066) : (i_0 < 5100 ? class73.method1753(i_0, class92_1, bool_2, (byte) -94) : (i_0 < 5400 ? class159.method3436(i_0, class92_1, bool_2, 1163617683) : (i_0 < 5600 ? class20.method239(i_0, class92_1, bool_2, (byte) 1) : (i_0 < 5700 ? class39.method696(i_0, class92_1, bool_2, -878316811) : (i_0 < 6300 ? class20.method242(i_0, class92_1, bool_2, -292172071) : (i_0 < 6600 ? class197.method3703(i_0) : (i_0 < 6700 ? class9.method114(i_0, class92_1, bool_2, 1926107602) : 2))))))))))))))))))))))))))))))))))));
   }

}
