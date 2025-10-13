public class class13 {

   static class235 field89;
   static byte[][] field90;

   static final int getNewestMenuIdx() {
      return Client.menuOptionsCount - 1;
   }

   public static int method152(String string_0) {
      return string_0.length() + 2;
   }

   static void method150(Widget[] arr_0, int i_1, int i_2, int i_3, boolean bool_4) {
      for (int i_6 = 0; i_6 < arr_0.length; i_6++) {
         Widget widget_7 = arr_0[i_6];
         if (widget_7 != null && widget_7.field2583 == i_1) {
            class219.method4112(widget_7, i_2, i_3, bool_4);
            ResourceHandler.method2441(widget_7, i_2, i_3, (byte) -41);
            if (widget_7.field2585 > widget_7.field2687 - widget_7.field2579) {
               widget_7.field2585 = widget_7.field2687 - widget_7.field2579;
            }

            if (widget_7.field2585 < 0) {
               widget_7.field2585 = 0;
            }

            if (widget_7.field2586 > widget_7.field2569 - widget_7.field2667) {
               widget_7.field2586 = widget_7.field2569 - widget_7.field2667;
            }

            if (widget_7.field2586 < 0) {
               widget_7.field2586 = 0;
            }

            if (widget_7.field2566 == 0) {
               WorldMapID.method413(arr_0, widget_7, bool_4);
            }
         }
      }

   }

}
