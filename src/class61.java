public class class61 extends class180 {

   int field571;
   int field569;
   boolean field567 = false;

   static final void method1120(class299 class299_0, int i_1, int i_2) {
      int i_3 = class299_0.field3732;
      class89.field1262 = 0;
      class54.method1037(class299_0, -685707928);

      for (int i_4 = 0; i_4 < class89.field1262; i_4++) {
         int i_5 = class89.field1256[i_4];
         class66 class66_6 = client.field909[i_5];
         int i_7 = class299_0.method5504();
         if ((i_7 & 0x8) != 0) {
            i_7 += class299_0.method5504() << 8;
         }

         class41.method736(class299_0, i_5, class66_6, i_7, 158563963);
      }

      if (class299_0.field3732 - i_3 != i_1) {
         throw new RuntimeException(class299_0.field3732 - i_3 + " " + i_1);
      }
   }

   public static boolean method1119(int i_0, int i_1) {
      return (i_0 & 0x1) != 0;
   }

}
