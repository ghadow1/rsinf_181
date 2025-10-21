public class class225 {

   static class324[] field3062;

   static final void method4122(Widget[] arr_0, int i_1) {
      for (int i_3 = 0; i_3 < arr_0.length; i_3++) {
         Widget widget_4 = arr_0[i_3];
         if (widget_4 != null && widget_4.field2583 == i_1 && (!widget_4.field2563 || !MusicPatchPcmStream.method1133(widget_4))) {
            if (widget_4.field2566 == 0) {
               if (!widget_4.field2563 && MusicPatchPcmStream.method1133(widget_4) && widget_4 != class72.field1059) {
                  continue;
               }

               method4122(arr_0, widget_4.field2688);
               if (widget_4.field2675 != null) {
                  method4122(widget_4.field2675, widget_4.field2688);
               }

               class61 class61_5 = (class61) Client.field816.method5952((long) widget_4.field2688);
               if (class61_5 != null) {
                  class235.method4269(class61_5.field571);
               }
            }

            if (widget_4.field2566 == 6) {
               int i_6;
               if (widget_4.field2611 != -1 || widget_4.field2612 != -1) {
                  boolean bool_8 = UserComparator10.runCs1(widget_4);
                  if (bool_8) {
                     i_6 = widget_4.field2612;
                  } else {
                     i_6 = widget_4.field2611;
                  }

                  if (i_6 != -1) {
                     class258 class258_7 = class7.method81(i_6);

                     for (widget_4.field2584 += Client.field718; widget_4.field2584 > class258_7.field3522[widget_4.field2692]; FriendSystem.invalidateWidget(widget_4)) {
                        widget_4.field2584 -= class258_7.field3522[widget_4.field2692];
                        ++widget_4.field2692;
                        if (widget_4.field2692 >= class258_7.field3520.length) {
                           widget_4.field2692 -= class258_7.field3515;
                           if (widget_4.field2692 < 0 || widget_4.field2692 >= class258_7.field3520.length) {
                              widget_4.field2692 = 0;
                           }
                        }
                     }
                  }
               }

               if (widget_4.field2575 != 0 && !widget_4.field2563) {
                  int i_9 = widget_4.field2575 >> 16;
                  i_6 = widget_4.field2575 << 16 >> 16;
                  i_9 *= Client.field718;
                  i_6 *= Client.field718;
                  widget_4.field2615 = i_9 + widget_4.field2615 & 0x7ff;
                  widget_4.field2616 = i_6 + widget_4.field2616 & 0x7ff;
                  FriendSystem.invalidateWidget(widget_4);
               }
            }
         }
      }

   }

}
