public class class78 extends LinkedListNode {

   public static Font field1129;
   class260 field1130 = new class260();
   class246 field1128;

   class78(class246 class246_1) {
      this.field1128 = class246_1;
   }

   void method1949(int i_1, int i_2, int i_3, int i_4, byte b_5) {
      class70 class70_6 = null;
      int i_7 = 0;

      for (class70 class70_8 = (class70) this.field1130.method4838(); class70_8 != null; class70_8 = (class70) this.field1130.method4808()) {
         ++i_7;
         if (class70_8.field1016 == i_1) {
            class70_8.method1672(i_1, i_2, i_3, i_4, 1833806724);
            return;
         }

         if (class70_8.field1016 <= i_1) {
            class70_6 = class70_8;
         }
      }

      if (class70_6 == null) {
         if (i_7 < 4) {
            this.field1130.method4805(new class70(i_1, i_2, i_3, i_4));
         }

      } else {
         class260.method4816(new class70(i_1, i_2, i_3, i_4), class70_6);
         if (i_7 >= 4) {
            this.field1130.method4838().unlink();
         }

      }
   }

   class70 method1950(int i_1, byte b_2) {
      class70 class70_3 = (class70) this.field1130.method4838();
      if (class70_3 != null && class70_3.field1016 <= i_1) {
         for (class70 class70_4 = (class70) this.field1130.method4808(); class70_4 != null && class70_4.field1016 <= i_1; class70_4 = (class70) this.field1130.method4808()) {
            class70_3.unlink();
            class70_3 = class70_4;
         }

         if (this.field1128.field3285 + class70_3.field1016 + class70_3.field1010 > i_1) {
            return class70_3;
         } else {
            class70_3.unlink();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean method1960(int i_1) {
      return this.field1130.method4810();
   }

   public static int method1957(int i_0, byte b_1) {
      return i_0 >> 11 & 0x3f;
   }

}
