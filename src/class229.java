public class class229 {

   static int[] field3103;
   static final class229 field3101 = new class229("LIVE", 0);
   static final class229 field3098 = new class229("BUILDLIVE", 3);
   static final class229 field3099 = new class229("RC", 1);
   static final class229 field3102 = new class229("WIP", 2);
   public final String field3100;
   final int field3097;

   class229(String string_1, int i_2) {
      this.field3100 = string_1;
      this.field3097 = i_2;
   }

   public static class229 method4133(int i_0, int i_1) {
      class229[] arr_2 = class328.method6256(547339899);

      for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
         class229 class229_4 = arr_2[i_3];
         if (i_0 == class229_4.field3097) {
            return class229_4;
         }
      }

      return null;
   }

}
