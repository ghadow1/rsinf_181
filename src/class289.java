public final class class289 {

   static final char[] field3668 = new char[] {'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   static long[] field3669 = new long[12];

   static {
      for (int i_0 = 0; i_0 < field3669.length; i_0++) {
         field3669[i_0] = (long)Math.pow(37.0D, (double)i_0);
      }

   }

   public static class324[] method5281(class233 class233_0, int i_1, int i_2, int i_3) {
      if (!class284.method5220(class233_0, i_1, i_2)) {
         return null;
      } else {
         class324[] arr_5 = new class324[class326.field3911];

         for (int i_6 = 0; i_6 < class326.field3911; i_6++) {
            class324 class324_7 = arr_5[i_6] = new class324();
            class324_7.field3896 = class326.field3913;
            class324_7.field3894 = class326.field3910;
            class324_7.field3890 = class212.field2523[i_6];
            class324_7.field3891 = class326.field3915[i_6];
            class324_7.field3897 = class326.field3914[i_6];
            class324_7.field3893 = class216.field2548[i_6];
            class324_7.field3892 = class138.field1895;
            class324_7.field3895 = class326.field3912[i_6];
         }

         class16.method174(572816821);
         return arr_5;
      }
   }

}
