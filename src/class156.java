public class class156 extends class275 {

   static String field1986;
   final boolean field1987;

   public class156(boolean bool_1) {
      this.field1987 = bool_1;
   }

   int method3414(class279 class279_1, class279 class279_2, int i_3) {
      if (class279_1.field3636 != 0) {
         if (class279_2.field3636 == 0) {
            return this.field1987 ? -1 : 1;
         }
      } else if (class279_2.field3636 != 0) {
         return this.field1987 ? 1 : -1;
      }

      return this.method5061(class279_1, class279_2, 749463999);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3414((class279) object_1, (class279) object_2, -604876330);
   }

   public static class228[] method3419(int i_0) {
      return new class228[] {class228.field3084, class228.field3085, class228.field3093, class228.field3096, class228.field3087, class228.field3088};
   }

   static void method3415(boolean bool_0, int i_1) {
      client.field801 = bool_0;
   }

}
