import java.util.HashMap;

public class class195 {

   static {
      new HashMap();
   }

   public static String method3683(int i_0, boolean bool_1) {
      if (bool_1 && i_0 >= 0) {
         int i_4 = i_0;
         String string_3;
         if (bool_1 && i_0 >= 0) {
            int i_5 = 2;

            for (int i_6 = i_0 / 10; i_6 != 0; i_5++) {
               i_6 /= 10;
            }

            char[] arr_7 = new char[i_5];
            arr_7[0] = 43;

            for (int i_8 = i_5 - 1; i_8 > 0; --i_8) {
               int i_9 = i_4;
               i_4 /= 10;
               int i_10 = i_9 - i_4 * 10;
               if (i_10 >= 10) {
                  arr_7[i_8] = (char)(i_10 + 87);
               } else {
                  arr_7[i_8] = (char)(i_10 + 48);
               }
            }

            string_3 = new String(arr_7);
         } else {
            string_3 = Integer.toString(i_0, 10);
         }

         return string_3;
      } else {
         return Integer.toString(i_0);
      }
   }

   public static boolean method3685(int i_0) {
      return (i_0 >> 31 & 0x1) != 0;
   }

}
