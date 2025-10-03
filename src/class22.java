public final class class22 {

   static int[] field178;
   static class331 field174;
   int field175;
   int field180;
   int field177;
   int field176;
   // $FF: synthetic field
   final class36 this$0;

   class22(class36 class36_1) {
      this.this$0 = class36_1;
   }

   static final void method275(int i_0) {
      for (class77 class77_1 = (class77) Client.field785.method4892(); class77_1 != null; class77_1 = (class77) Client.field785.method4894()) {
         if (class77_1.field1124 == ItemContainer_2.plane && !class77_1.field1122) {
            if (Client.field881 >= class77_1.field1114) {
               class77_1.method1938(Client.field718, (byte) 4);
               if (class77_1.field1122) {
                  class77_1.unlink();
               } else {
                  class5.field22.method3077(class77_1.field1124, class77_1.field1117, class77_1.field1113, class77_1.field1118, 60, class77_1, 0, -1L, false);
               }
            }
         } else {
            class77_1.unlink();
         }
      }

   }

   static final void method276(Widget widget_0, ItemDefinition itemDefinition_1, int i_2, int i_3, boolean bool_4, int i_5) {
      String[] arr_6 = itemDefinition_1.inventoryActions;
      byte b_7 = -1;
      String str_8 = null;
      if (arr_6 != null && arr_6[i_3] != null) {
         if (i_3 == 0) {
            b_7 = 33;
         } else if (i_3 == 1) {
            b_7 = 34;
         } else if (i_3 == 2) {
            b_7 = 35;
         } else if (i_3 == 3) {
            b_7 = 36;
         } else {
            b_7 = 37;
         }

         str_8 = arr_6[i_3];
      } else if (i_3 == 4) {
         b_7 = 37;
         str_8 = "Drop";
      }

      if (b_7 != -1 && str_8 != null) {
         class135.method3260(str_8, class73.colorStartTag(16748608) + itemDefinition_1.name, b_7, itemDefinition_1.field3410, i_2, widget_0.field2688, bool_4);
      }

   }

}
