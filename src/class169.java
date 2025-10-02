import java.io.File;
import java.util.Hashtable;

public class class169 {

   protected static boolean field2053;
   static class295 field2054;
   static class293 field2056;
   static File field2050;
   static boolean field2055 = false;
   static Hashtable field2052 = new Hashtable(16);

   public static void method3503(class233 class233_0, int i_1, int i_2, int i_3, boolean bool_4, int i_5) {
      class197.field2402 = 1;
      class11.field76 = class233_0;
      class197.field2403 = i_1;
      class197.field2407 = i_2;
      class56.field529 = i_3;
      class158.field1992 = bool_4;
      class197.field2404 = 10000;
   }

   static int method3501(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      class217 class217_4 = bool_2 ? class76.field1111 : class207.field2507;
      if (i_0 == 1700) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2690;
         return 1;
      } else if (i_0 == 1701) {
         if (class217_4.field2690 != -1) {
            class76.field1098[++class70.field1014 - 1] = class217_4.field2655;
         } else {
            class76.field1098[++class70.field1014 - 1] = 0;
         }

         return 1;
      } else if (i_0 == 1702) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2565;
         return 1;
      } else {
         return 2;
      }
   }

}
