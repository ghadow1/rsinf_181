public class class219 {

   static void method4112(Widget widget_0, int i_1, int i_2, boolean bool_3) {
      int i_5 = widget_0.field2579;
      int i_6 = widget_0.field2667;
      if (widget_0.field2638 == 0) {
         widget_0.field2579 = widget_0.field2670;
      } else if (widget_0.field2638 == 1) {
         widget_0.field2579 = i_1 - widget_0.field2670;
      } else if (widget_0.field2638 == 2) {
         widget_0.field2579 = widget_0.field2670 * i_1 >> 14;
      }

      if (widget_0.field2572 == 0) {
         widget_0.field2667 = widget_0.field2576;
      } else if (widget_0.field2572 == 1) {
         widget_0.field2667 = i_2 - widget_0.field2576;
      } else if (widget_0.field2572 == 2) {
         widget_0.field2667 = i_2 * widget_0.field2576 >> 14;
      }

      if (widget_0.field2638 == 4) {
         widget_0.field2579 = widget_0.field2636 * widget_0.field2667 / widget_0.field2582;
      }

      if (widget_0.field2572 == 4) {
         widget_0.field2667 = widget_0.field2582 * widget_0.field2579 / widget_0.field2636;
      }

      if (widget_0.field2568 == 1337) {
         Client.field827 = widget_0;
      }

      if (bool_3 && widget_0.field2679 != null && (i_5 != widget_0.field2579 || i_6 != widget_0.field2667)) {
         class62 class62_7 = new class62();
         class62_7.field575 = widget_0;
         class62_7.field581 = widget_0.field2679;
         Client.field854.method4917(class62_7);
      }

   }

   static final void method4111(String string_0) {
      class187 class187_2 = class235.method4265(ClientPacketProt.field2210, Client.data.field1313);
      class187_2.outBuffer.writeByte(class209.method3945(string_0));
      class187_2.outBuffer.writeNullTerminatedString(string_0);
      Client.data.copy(class187_2);
   }

   static final void method4113(class69 class69_0, int i_1) {
      class32.method544(class69_0.x, class69_0.y, i_1);
   }

}
