public class class32 {

   public static class99 field277;
   static Widget field284;
   static class235 field279;
   static byte[][][] field282;
   static int field280;

   public static int method545(int i_0) {
      return i_0 >> 17 & 0x7;
   }

   static final void method544(int i_0, int i_1, int i_2) {
      if (i_0 >= 128 && i_1 >= 128 && i_0 <= 13056 && i_1 <= 13056) {
         int i_4 = class62.method1130(i_0, i_1, ItemContainer_2.plane) - i_2;
         i_0 -= PacketBuffer.field3727;
         i_4 -= GCMonitor.field383;
         i_1 -= class1.field3;
         int i_5 = class130.field1787[class11.field77];
         int i_6 = class130.field1784[class11.field77];
         int i_7 = class130.field1787[MouseRecorder.field1112];
         int i_8 = class130.field1784[MouseRecorder.field1112];
         int i_9 = i_7 * i_1 + i_0 * i_8 >> 16;
         i_1 = i_8 * i_1 - i_0 * i_7 >> 16;
         i_0 = i_9;
         i_9 = i_4 * i_6 - i_5 * i_1 >> 16;
         i_1 = i_6 * i_1 + i_5 * i_4 >> 16;
         if (i_1 >= 50) {
            Client.field752 = i_0 * Client.field917 / i_1 + Client.field746 / 2;
            Client.field753 = Client.field714 / 2 + i_9 * Client.field917 / i_1;
         } else {
            Client.field752 = -1;
            Client.field753 = -1;
         }

      } else {
         Client.field752 = -1;
         Client.field753 = -1;
      }
   }

}
