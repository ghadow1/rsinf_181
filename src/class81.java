import java.awt.*;

public class class81 {

   static void method1990(Component component_0) {
      component_0.setFocusTraversalKeysEnabled(false);
      component_0.addKeyListener(class45.field392);
      component_0.addFocusListener(class45.field392);
   }

   static void method1989(int i_0, int i_1, int i_2) {
      if (Client.field891 != 0 && i_1 != 0 && Client.field893 < 50) {
         Client.field894[Client.field893] = i_0;
         Client.field895[Client.field893] = i_1;
         Client.field897[Client.field893] = i_2;
         Client.field898[Client.field893] = null;
         Client.field841[Client.field893] = 0;
         ++Client.field893;
      }

   }

   static void method1988(int i_0, String string_1) {
      int i_3 = class89.field1255;
      int[] ints_4 = class89.field1257;
      boolean bool_5 = false;
      Username username_6 = new Username(string_1, FontName.loginType);

      for (int i_7 = 0; i_7 < i_3; i_7++) {
         class66 class66_8 = Client.field909[ints_4[i_7]];
         if (class66_8 != null && class66_8 != Client.field657 && class66_8.field621 != null && class66_8.field621.equals(username_6)) {
            class187 class187_9;
            if (i_0 == 1) {
               class187_9 = class235.method4265(ClientPacketProt.field2250, Client.data.field1313);
               class187_9.outBuffer.writeShortBigEndian(ints_4[i_7]);
               class187_9.outBuffer.writeNegatedByte(0);
               Client.data.copy(class187_9);
            } else if (i_0 == 4) {
               class187_9 = class235.method4265(ClientPacketProt.field2230, Client.data.field1313);
               class187_9.outBuffer.writeShortWithOffset(ints_4[i_7]);
               class187_9.outBuffer.writeNegatedByte(0);
               Client.data.copy(class187_9);
            } else if (i_0 == 6) {
               class187_9 = class235.method4265(ClientPacketProt.field2257, Client.data.field1313);
               class187_9.outBuffer.writeShortWithOffset2(ints_4[i_7]);
               class187_9.outBuffer.writeInvertedByte(0);
               Client.data.copy(class187_9);
            } else if (i_0 == 7) {
               class187_9 = class235.method4265(ClientPacketProt.field2278, Client.data.field1313);
               class187_9.outBuffer.writeInvertedByte(0);
               class187_9.outBuffer.writeShortLittleEndian(ints_4[i_7]);
               Client.data.copy(class187_9);
            }

            bool_5 = true;
            break;
         }
      }

      if (!bool_5) {
         class62.method1132(4, "", "Unable to find " + string_1);
      }

   }

}
