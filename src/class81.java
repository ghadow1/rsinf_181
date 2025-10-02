import java.awt.Component;

public class class81 {

   static void method1990(Component component_0) {
      component_0.setFocusTraversalKeysEnabled(false);
      component_0.addKeyListener(class45.field392);
      component_0.addFocusListener(class45.field392);
   }

   static void method1989(int i_0, int i_1, int i_2) {
      if (client.field891 != 0 && i_1 != 0 && client.field893 < 50) {
         client.field894[client.field893] = i_0;
         client.field895[client.field893] = i_1;
         client.field897[client.field893] = i_2;
         client.field898[client.field893] = null;
         client.field841[client.field893] = 0;
         ++client.field893;
      }

   }

   static void method1988(int i_0, String string_1) {
      int i_3 = class89.field1255;
      int[] ints_4 = class89.field1257;
      boolean bool_5 = false;
      class283 class283_6 = new class283(string_1, class40.field353);

      for (int i_7 = 0; i_7 < i_3; i_7++) {
         class66 class66_8 = client.field909[ints_4[i_7]];
         if (class66_8 != null && class66_8 != client.field657 && class66_8.field621 != null && class66_8.field621.equals(class283_6)) {
            class187 class187_9;
            if (i_0 == 1) {
               class187_9 = class235.method4265(class183.field2250, client.field880.field1313, 1775123545);
               class187_9.field2333.writeShortBigEndian(ints_4[i_7]);
               class187_9.field2333.writeNegatedByte(0);
               client.field880.copy(class187_9);
            } else if (i_0 == 4) {
               class187_9 = class235.method4265(class183.field2230, client.field880.field1313, 1775123545);
               class187_9.field2333.writeShortWithOffset(ints_4[i_7]);
               class187_9.field2333.writeNegatedByte(0);
               client.field880.copy(class187_9);
            } else if (i_0 == 6) {
               class187_9 = class235.method4265(class183.field2257, client.field880.field1313, 1775123545);
               class187_9.field2333.method5530(ints_4[i_7]);
               class187_9.field2333.writeInvertedByte(0);
               client.field880.copy(class187_9);
            } else if (i_0 == 7) {
               class187_9 = class235.method4265(class183.field2278, client.field880.field1313, 1775123545);
               class187_9.field2333.writeInvertedByte(0);
               class187_9.field2333.writeShortLittleEndian(ints_4[i_7]);
               client.field880.copy(class187_9);
            }

            bool_5 = true;
            break;
         }
      }

      if (!bool_5) {
         class62.method1132(4, "", "Unable to find " + string_1, -2121785840);
      }

   }

}
