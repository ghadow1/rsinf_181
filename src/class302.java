public class class302 {

   public static int[] field3740;
   static int field3734 = 0;
   static int field3735 = 0;
   static int field3737 = 0;
   static byte[][] field3739 = new byte[1000][];
   static byte[][] field3738 = new byte[250][];
   static byte[][] field3736 = new byte[50][];

   static synchronized byte[] method5761(int i_0, boolean bool_1, byte b_2) {
      byte[] bytes_3;
      if (i_0 != 100) {
         if (i_0 < 100) {
            ;
         }
      } else if (field3734 > 0) {
         bytes_3 = field3739[--field3734];
         field3739[field3734] = null;
         return bytes_3;
      }

      if (i_0 != 5000) {
         if (i_0 < 5000) {
            ;
         }
      } else if (field3735 > 0) {
         bytes_3 = field3738[--field3735];
         field3738[field3735] = null;
         return bytes_3;
      }

      if (i_0 != 30000) {
         if (i_0 < 30000) {
            ;
         }
      } else if (field3737 > 0) {
         bytes_3 = field3736[--field3737];
         field3736[field3737] = null;
         return bytes_3;
      }

      if (class189.field2343 != null) {
         for (int i_5 = 0; i_5 < field3740.length; i_5++) {
            if (field3740[i_5] != i_0) {
               if (i_0 < field3740[i_5]) {
                  ;
               }
            } else if (class43.field381[i_5] > 0) {
               byte[] bytes_4 = class189.field2343[i_5][--class43.field381[i_5]];
               class189.field2343[i_5][class43.field381[i_5]] = null;
               return bytes_4;
            }
         }
      }

      return new byte[i_0];
   }

}
