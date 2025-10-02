public class class59 extends class180 {

   static class217 field549;
   static class318 field552 = new class318(32);
   int[] field550 = new int[] {-1};
   int[] field551 = new int[] {0};

   public static class244 method1117(int i_0, byte b_1) {
      class244 class244_2 = (class244) class244.field3254.method3320((long)i_0);
      if (class244_2 != null) {
         return class244_2;
      } else {
         byte[] bytes_3 = class244.field3255.method4144(1, i_0);
         class244_2 = new class244();
         if (bytes_3 != null) {
            class244_2.method4418(new class300(bytes_3), i_0, -655708438);
         }

         class244_2.method4417(978427623);
         class244.field3254.method3322(class244_2, (long)i_0);
         return class244_2;
      }
   }

   static int method1116(int i_0, int i_1) {
      return (int)Math.pow(2.0D, (double)((float)i_0 / 256.0F + 7.0F));
   }

}
