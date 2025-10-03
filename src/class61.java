public class class61 extends LinkedListNode {

   int field571;
   int field569;
   boolean field567 = false;

   static final void method1120(PacketBuffer buffer3_0, int i_1) {
      int i_3 = buffer3_0.position;
      class89.field1262 = 0;
      MouseHandler.method1037(buffer3_0);

      for (int i_4 = 0; i_4 < class89.field1262; i_4++) {
         int i_5 = class89.field1256[i_4];
         class66 class66_6 = Client.field909[i_5];
         int i_7 = buffer3_0.readUnsignedByte();
         if ((i_7 & 0x8) != 0) {
            i_7 += buffer3_0.readUnsignedByte() << 8;
         }

         class41.method736(buffer3_0, i_5, class66_6, i_7);
      }

      if (buffer3_0.position - i_3 != i_1) {
         throw new RuntimeException(buffer3_0.position - i_3 + " " + i_1);
      }
   }

   public static boolean method1119(int i_0, int i_1) {
      return (i_0 & 0x1) != 0;
   }

}
