public class class276 extends UserList {

   final class338 field3618;

   public class276(class338 class338_1) {
      super(400);
      this.field3618 = class338_1;
   }

   User vmethod5229() {
      return new class278();
   }

   User[] vmethod5230(int i_1) {
      return new class278[i_1];
   }

   public void method5075(ByteBuffer class300_1, int i_2, int i_3) {
      while (true) {
         if (class300_1.position < i_2) {
            int i_4 = class300_1.readUnsignedByte();
            boolean bool_5 = (i_4 & 0x1) == 1;
            class283 class283_6 = new class283(class300_1.readNullTerminatedString(), this.field3618);
            class283 class283_7 = new class283(class300_1.readNullTerminatedString(), this.field3618);
            class300_1.readNullTerminatedString();
            if (class283_6 != null && class283_6.method5205()) {
               class278 class278_8 = (class278) this.method5138(class283_6);
               if (bool_5) {
                  class278 class278_9 = (class278) this.method5138(class283_7);
                  if (class278_9 != null && class278_9 != class278_8) {
                     if (class278_8 != null) {
                        this.removeEntry(class278_9);
                     } else {
                        class278_8 = class278_9;
                     }
                  }
               }

               if (class278_8 != null) {
                  this.method5083(class278_8, class283_6, class283_7);
                  continue;
               }

               if (this.method5079() < 400) {
                  int i_10 = this.method5079();
                  class278_8 = (class278) this.method5088(class283_6, class283_7);
                  class278_8.field3630 = i_10;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }

}
