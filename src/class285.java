public class class285 extends UserList {

   static class324[] field3660;
   public String field3655 = null;
   public String field3656 = null;
   int field3659 = 1;
   final class338 field3658;
   final class280 field3652;
   public int field3653;
   public byte field3657;

   public class285(class338 class338_1, class280 class280_2) {
      super(100);
      this.field3658 = class338_1;
      this.field3652 = class280_2;
   }

   final void method5232(String string_1, int i_2) {
      this.field3656 = class242.method4403(string_1, (short) -32757);
   }

   User vmethod5229() {
      return new class273();
   }

   final void method5231(String string_1, int i_2) {
      this.field3655 = class242.method4403(string_1, (short) -21709);
   }

   User[] vmethod5230(int i_1) {
      return new class273[i_1];
   }

   public final void method5228() {
      for (int i_2 = 0; i_2 < this.method5079(); i_2++) {
         ((class273) this.method5151(i_2)).method5018();
      }

   }

   public final void method5235() {
      for (int i_2 = 0; i_2 < this.method5079(); i_2++) {
         ((class273) this.method5151(i_2)).method5020();
      }

   }

   final void method5237(class273 class273_1) {
      if (class273_1.method5041().equals(this.field3652.vmethod5179((byte) -19))) {
         this.field3653 = class273_1.field3634;
      }

   }

   public final void method5233(ByteBuffer class300_1, int i_2) {
      this.method5232(class300_1.readNullTerminatedString(), 537403926);
      long long_3 = class300_1.readLongFromMediumEndian();
      this.method5231(Tile.method2855(long_3), -1948396413);
      this.field3657 = class300_1.readSignedByte();
      int i_5 = class300_1.readUnsignedByte();
      if (i_5 != 255) {
         this.method5096();

         for (int i_6 = 0; i_6 < i_5; i_6++) {
            class273 class273_7 = (class273) this.method5087(new Username(class300_1.readNullTerminatedString(), this.field3658));
            int i_8 = class300_1.readUnsignedShort();
            class273_7.method5163(i_8, ++this.field3659 - 1, -1729653997);
            class273_7.field3634 = class300_1.readSignedByte();
            class300_1.readNullTerminatedString();
            this.method5237(class273_7);
         }

      }
   }

   public final void method5234(ByteBuffer class300_1, int i_2) {
      Username username_3 = new Username(class300_1.readNullTerminatedString(), this.field3658);
      int i_4 = class300_1.readUnsignedShort();
      byte b_5 = class300_1.readSignedByte();
      boolean bool_6 = false;
      if (b_5 == -128) {
         bool_6 = true;
      }

      class273 class273_7;
      if (bool_6) {
         if (this.method5079() == 0) {
            return;
         }

         class273_7 = (class273) this.method5138(username_3);
         if (class273_7 != null && class273_7.method5164(212736889) == i_4) {
            this.removeEntry(class273_7);
         }
      } else {
         class300_1.readNullTerminatedString();
         class273_7 = (class273) this.method5138(username_3);
         if (class273_7 == null) {
            if (this.method5079() > super.capacity) {
               return;
            }

            class273_7 = (class273) this.method5087(username_3);
         }

         class273_7.method5163(i_4, ++this.field3659 - 1, -235684888);
         class273_7.field3634 = b_5;
         this.method5237(class273_7);
      }

   }

}
