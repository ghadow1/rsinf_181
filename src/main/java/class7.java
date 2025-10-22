public class class7 {

   public static int field46;
   static int field48;
   static boolean field49;
   String field44;
   String field45;
   public final int field51;
   public final long field42;
   public final class9 field53;

   class7(ByteBuffer class300_1, byte b_2, int i_3) {
      this.field44 = class300_1.readNullTerminatedString();
      this.field45 = class300_1.readNullTerminatedString();
      this.field51 = class300_1.readUnsignedShort();
      this.field42 = class300_1.readLongFromMediumEndian();
      int i_4 = class300_1.readIntMedEndian();
      int i_5 = class300_1.readIntMedEndian();
      this.field53 = new class9();
      this.field53.method115(2, (byte) 126);
      this.field53.method100(b_2);
      this.field53.field60 = i_4;
      this.field53.field61 = i_5;
      this.field53.field58 = 0;
      this.field53.field63 = 0;
      this.field53.field59 = i_3;
   }

   public static SequenceAnimation method81(int i_0) {
      SequenceAnimation sequenceAnimation_2 = (SequenceAnimation) SequenceAnimation.field3524.get((long)i_0);
      if (sequenceAnimation_2 != null) {
         return sequenceAnimation_2;
      } else {
         byte[] bytes_3 = SequenceAnimation.field3527.method4144(12, i_0);
         sequenceAnimation_2 = new SequenceAnimation();
         if (bytes_3 != null) {
            sequenceAnimation_2.method4759(new ByteBuffer(bytes_3), (byte) 88);
         }

         sequenceAnimation_2.method4761(806874502);
         SequenceAnimation.field3524.put(sequenceAnimation_2, (long)i_0);
         return sequenceAnimation_2;
      }
   }

   public String method74() {
      return this.field44;
   }

   public String method77() {
      return this.field45;
   }

   static final void method73(int i_0) {
      class187 class187_1 = class235.method4265(ClientPacketProt.field2223, Client.data.field1313);
      Client.data.copy(class187_1);

      for (class61 class61_2 = (class61) Client.field816.method5950(); class61_2 != null; class61_2 = (class61) Client.field816.method5953()) {
         if (class61_2.field569 == 0 || class61_2.field569 == 3) {
            class197.method3697(class61_2, true);
         }
      }

      if (Client.field850 != null) {
         FriendSystem.invalidateWidget(Client.field850);
         Client.field850 = null;
      }

   }

}
