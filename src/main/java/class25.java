public class class25 {

   static int field212;
   final int field208;
   final int field209;
   final int field210;

   class25(int i_1, int i_2, int i_3) {
      this.field208 = i_1;
      this.field209 = i_2;
      this.field210 = i_3;
   }

   static int method324(int i_0, class92 class92_1, boolean bool_2, byte b_3) {
      Widget widget_4;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         widget_4 = WorldMapElement.getWidget(MouseRecorder.field1098[--class70.field1014]);
      } else {
         widget_4 = bool_2 ? MouseRecorder.field1111 : class207.field2507;
      }

      FriendSystem.invalidateWidget(widget_4);
      if (i_0 != 1200 && i_0 != 1205 && i_0 != 1212) {
         if (i_0 == 1201) {
            widget_4.field2607 = 2;
            widget_4.field2649 = MouseRecorder.field1098[--class70.field1014];
            return 1;
         } else if (i_0 == 1202) {
            widget_4.field2607 = 3;
            widget_4.field2649 = Client.localPlayer.field613.method3994();
            return 1;
         } else {
            return 2;
         }
      } else {
         class70.field1014 -= 2;
         int i_5 = MouseRecorder.field1098[class70.field1014];
         int i_6 = MouseRecorder.field1098[class70.field1014 + 1];
         widget_4.field2690 = i_5;
         widget_4.field2655 = i_6;
         ItemDefinition itemDefinition_7 = item.getDefinition(i_5);
         widget_4.field2615 = itemDefinition_7.xan2d;
         widget_4.field2616 = itemDefinition_7.yan2d;
         widget_4.field2640 = itemDefinition_7.field3420;
         widget_4.field2593 = itemDefinition_7.offsetX2d;
         widget_4.field2614 = itemDefinition_7.offsetY2d;
         widget_4.field2618 = itemDefinition_7.zoom2d;
         if (i_0 == 1205) {
            widget_4.field2703 = 0;
         } else if (i_0 == 1212 | itemDefinition_7.isStackable == 1) {
            widget_4.field2703 = 1;
         } else {
            widget_4.field2703 = 2;
         }

         if (widget_4.field2619 > 0) {
            widget_4.field2618 = widget_4.field2618 * 32 / widget_4.field2619;
         } else if (widget_4.field2670 > 0) {
            widget_4.field2618 = widget_4.field2618 * 32 / widget_4.field2670;
         }

         return 1;
      }
   }

   static void method323(String string_0, boolean bool_1, byte b_2) {
      string_0 = string_0.toLowerCase();
      short[] shorts_3 = new short[16];
      int i_4 = 0;

      for (int i_5 = 0; i_5 < ItemDefinition.field3455; i_5++) {
         ItemDefinition itemDefinition_6 = item.getDefinition(i_5);
         if ((!bool_1 || itemDefinition_6.isTradable) && itemDefinition_6.noteTemplate == -1 && itemDefinition_6.name.toLowerCase().indexOf(string_0) != -1) {
            if (i_4 >= 250) {
               class257.field3502 = -1;
               WorldMapSection1.field336 = null;
               return;
            }

            if (i_4 >= shorts_3.length) {
               short[] shorts_7 = new short[shorts_3.length * 2];

               for (int i_8 = 0; i_8 < i_4; i_8++) {
                  shorts_7[i_8] = shorts_3[i_8];
               }

               shorts_3 = shorts_7;
            }

            shorts_3[i_4++] = (short)i_5;
         }
      }

      WorldMapSection1.field336 = shorts_3;
      class32.field280 = 0;
      class257.field3502 = i_4;
      String[] arr_9 = new String[class257.field3502];

      for (int i_10 = 0; i_10 < class257.field3502; i_10++) {
         arr_9[i_10] = item.getDefinition(shorts_3[i_10]).name;
      }

      class82.method1991(arr_9, WorldMapSection1.field336, (short) -2750);
   }

}
