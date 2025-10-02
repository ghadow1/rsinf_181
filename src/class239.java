public class class239 extends class175 {

   static int field3199;
   static class233 field3200;
   static class145 field3202 = new class145(64);
   public int field3201 = 0;

   void method4340(ByteBuffer class300_1, int i_2, int i_3) {
      if (i_2 == 2) {
         this.field3201 = class300_1.readUnsignedShortBigEndian();
      }

   }

   void method4350(ByteBuffer class300_1, int i_2) {
      while (true) {
         int i_3 = class300_1.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.method4340(class300_1, i_3, -745252030);
      }
   }

}
