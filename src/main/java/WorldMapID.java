public final class WorldMapID {

   static Client client;
   static class235 field232;
   final int[] field230;

   WorldMapID() {
      this.field230 = new int[4096];
   }

   WorldMapID(int[] ints_1) {
      this.field230 = ints_1;
   }

   static final void method416(int i_0, int i_1, int i_2, boolean bool_3) {
      if (class162.method3445(i_0)) {
         class13.method150(Widget.field2556[i_0], -1, i_1, i_2, bool_3);
      }
   }

   static final void method412(int i_0, int i_1) {
      if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
         if (Client.field802) {
            int i_3 = class13.getNewestMenuIdx();
            String string_4;
            if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
               string_4 = "Use" + " " + Client.selectedItemName + " " + "->";
            } else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
               string_4 = Client.field813 + " " + Client.selectedSpellName + " " + "->";
            } else {
               string_4 = class28.method417(i_3);
            }

            if (Client.menuOptionsCount > 2) {
               string_4 = string_4 + class73.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
            }

            class23.fontBold12.drawRandomAlphaAndSpacing(string_4, i_0 + 4, i_1 + 15, 16777215, 0, Client.cycle / 1000);
         }
      }
   }

   static void method413(Widget[] arr_0, Widget widget_1, boolean bool_2) {
      int i_4 = widget_1.field2687 != 0 ? widget_1.field2687 : widget_1.field2579;
      int i_5 = widget_1.field2569 != 0 ? widget_1.field2569 : widget_1.field2667;
      class13.method150(arr_0, widget_1.field2688, i_4, i_5, bool_2);
      if (widget_1.field2675 != null) {
         class13.method150(widget_1.field2675, widget_1.field2688, i_4, i_5, bool_2);
      }

      class61 class61_6 = (class61) Client.field816.method5952((long) widget_1.field2688);
      if (class61_6 != null) {
         method416(class61_6.field571, i_4, i_5, bool_2);
      }

      if (widget_1.field2568 == 1337) {
         ;
      }

   }

   public static void method414(class233 class233_0, int i_1) {
      class244.field3255 = class233_0;
   }

   final int method408(int i_1, int i_2) {
      return this.field230[i_2 * 64 + i_1];
   }

   static void method407(ByteBuffer class300_0, int i_1, int i_2) {
      byte[] bytes_3 = class300_0.buffer;
      if (Client.field693 == null) {
         Client.field693 = new byte[24];
      }

      class301.method5752(bytes_3, i_1, Client.field693, 0, 24);
      if (class167.field2040 != null) {
         try {
            class167.field2040.method6521(0L);
            class167.field2040.method6524(class300_0.buffer, i_1, 24);
         } catch (Exception exception_5) {
            ;
         }
      }

   }

}
