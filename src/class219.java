public class class219 {

   static void method4112(class217 class217_0, int i_1, int i_2, boolean bool_3, int i_4) {
      int i_5 = class217_0.field2579;
      int i_6 = class217_0.field2667;
      if (class217_0.field2638 == 0) {
         class217_0.field2579 = class217_0.field2670;
      } else if (class217_0.field2638 == 1) {
         class217_0.field2579 = i_1 - class217_0.field2670;
      } else if (class217_0.field2638 == 2) {
         class217_0.field2579 = class217_0.field2670 * i_1 >> 14;
      }

      if (class217_0.field2572 == 0) {
         class217_0.field2667 = class217_0.field2576;
      } else if (class217_0.field2572 == 1) {
         class217_0.field2667 = i_2 - class217_0.field2576;
      } else if (class217_0.field2572 == 2) {
         class217_0.field2667 = i_2 * class217_0.field2576 >> 14;
      }

      if (class217_0.field2638 == 4) {
         class217_0.field2579 = class217_0.field2636 * class217_0.field2667 / class217_0.field2582;
      }

      if (class217_0.field2572 == 4) {
         class217_0.field2667 = class217_0.field2582 * class217_0.field2579 / class217_0.field2636;
      }

      if (class217_0.field2568 == 1337) {
         client.field827 = class217_0;
      }

      if (bool_3 && class217_0.field2679 != null && (i_5 != class217_0.field2579 || i_6 != class217_0.field2667)) {
         class62 class62_7 = new class62();
         class62_7.field575 = class217_0;
         class62_7.field581 = class217_0.field2679;
         client.field854.method4917(class62_7);
      }

   }

   static final void method4111(String string_0, int i_1) {
      class187 class187_2 = class235.method4265(class183.field2210, client.field880.field1313, 1775123545);
      class187_2.field2333.writeByte2(class209.method3945(string_0));
      class187_2.field2333.method5485(string_0);
      client.field880.copy(class187_2);
   }

   static final void method4113(class69 class69_0, int i_1, int i_2) {
      class32.method544(class69_0.field1005, class69_0.field949, i_1, 1846683803);
   }

}
