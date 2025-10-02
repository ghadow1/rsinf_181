public final class class131 {

   boolean field1790 = true;
   int field1795;
   int field1793;
   int field1791;
   int field1792;
   int field1789;
   int field1794;

   class131(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
      this.field1795 = i_1;
      this.field1793 = i_2;
      this.field1791 = i_3;
      this.field1792 = i_4;
      this.field1789 = i_5;
      this.field1794 = i_6;
      this.field1790 = bool_7;
   }

   public static class325[] method3062(class233 class233_0, int i_1, int i_2, int i_3) {
      if (!class284.method5220(class233_0, i_1, i_2)) {
         return null;
      } else {
         class325[] arr_5 = new class325[class326.field3911];

         for (int i_6 = 0; i_6 < class326.field3911; i_6++) {
            class325 class325_7 = arr_5[i_6] = new class325();
            class325_7.field3898 = class326.field3913;
            class325_7.field3904 = class326.field3910;
            class325_7.field3901 = class212.field2523[i_6];
            class325_7.field3902 = class326.field3915[i_6];
            class325_7.field3899 = class326.field3914[i_6];
            class325_7.field3900 = class216.field2548[i_6];
            int i_8 = class325_7.field3900 * class325_7.field3899;
            byte[] bytes_9 = class326.field3912[i_6];
            class325_7.field3908 = new int[i_8];

            for (int i_10 = 0; i_10 < i_8; i_10++) {
               class325_7.field3908[i_10] = class138.field1895[bytes_9[i_10] & 0xff];
            }
         }

         class16.method174(572816821);
         return arr_5;
      }
   }

}
