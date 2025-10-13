public class class312 {

   public int field3826 = -1;
   public int field3823 = -1;
   public int field3824 = -1;
   public int field3825 = -1;
   public int field3830 = -1;
   public int field3827 = -1;
   public int field3828 = -1;
   public int field3829 = -1;
   public int field3832 = -1;
   public int field3831 = -1;
   public int field3822 = -1;

   public void method5903(class233 class233_1, byte b_2) {
      byte[] bytes_3 = class233_1.method4208(class311.field3821.field3820);
      ByteBuffer class300_4 = new ByteBuffer(bytes_3);

      while (true) {
         int i_5 = class300_4.readUnsignedByte();
         if (i_5 == 0) {
            return;
         }

         switch(i_5) {
         case 1:
            class300_4.read24BitInt();
            break;
         case 2:
            this.field3826 = class300_4.readNullableShort();
            this.field3823 = class300_4.readNullableShort();
            this.field3824 = class300_4.readNullableShort();
            this.field3825 = class300_4.readNullableShort();
            this.field3830 = class300_4.readNullableShort();
            this.field3827 = class300_4.readNullableShort();
            this.field3828 = class300_4.readNullableShort();
            this.field3829 = class300_4.readNullableShort();
            this.field3832 = class300_4.readNullableShort();
            this.field3831 = class300_4.readNullableShort();
            this.field3822 = class300_4.readNullableShort();
         }
      }
   }

   public static int method5899(int i_0, int i_1, byte b_2) {
      return i_1 + (i_0 + 40000 << 8);
   }

}
