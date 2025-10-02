public class class42 implements class37 {

   static int field372;
   static int field373;
   int field368;
   int field363;
   int field364;
   int field376;
   int field365;
   int field369;
   int field366;
   int field370;
   int field375;
   int field371;

   public boolean vmethod740(int i_1, int i_2, byte b_3) {
      return i_1 >= (this.field366 << 6) + (this.field370 << 3) && i_1 <= (this.field366 << 6) + (this.field370 << 3) + 7 && i_2 >= (this.field375 << 6) + (this.field371 << 3) && i_2 <= (this.field375 << 6) + (this.field371 << 3) + 7;
   }

   public boolean vmethod749(int i_1, int i_2, int i_3, int i_4) {
      return i_1 >= this.field368 && i_1 < this.field368 + this.field363 ? i_2 >= (this.field364 << 6) + (this.field376 << 3) && i_2 <= (this.field364 << 6) + (this.field376 << 3) + 7 && i_3 >= (this.field365 << 6) + (this.field369 << 3) && i_3 <= (this.field365 << 6) + (this.field369 << 3) + 7 : false;
   }

   public void vmethod738(class26 class26_1, byte b_2) {
      if (class26_1.field217 > this.field366) {
         class26_1.field217 = this.field366;
      }

      if (class26_1.field223 < this.field366) {
         class26_1.field223 = this.field366;
      }

      if (class26_1.field220 > this.field375) {
         class26_1.field220 = this.field375;
      }

      if (class26_1.field222 < this.field375) {
         class26_1.field222 = this.field375;
      }

   }

   public class213 vmethod742(int i_1, int i_2, byte b_3) {
      if (!this.vmethod740(i_1, i_2, (byte) 46)) {
         return null;
      } else {
         int i_4 = this.field364 * 64 - this.field366 * 64 + (this.field376 * 8 - this.field370 * 8) + i_1;
         int i_5 = this.field365 * 64 - this.field375 * 64 + i_2 + (this.field369 * 8 - this.field371 * 8);
         return new class213(this.field368, i_4, i_5);
      }
   }

   public int[] vmethod760(int i_1, int i_2, int i_3, byte b_4) {
      if (!this.vmethod749(i_1, i_2, i_3, 1003076083)) {
         return null;
      } else {
         int[] ints_5 = new int[] {this.field366 * 64 - this.field364 * 64 + i_2 + (this.field370 * 8 - this.field376 * 8), i_3 + (this.field375 * 64 - this.field365 * 64) + (this.field371 * 8 - this.field369 * 8)};
         return ints_5;
      }
   }

   public void vmethod743(ByteBuffer class300_1, int i_2) {
      this.field368 = class300_1.readUnsignedByte();
      this.field363 = class300_1.readUnsignedByte();
      this.field364 = class300_1.readUnsignedShortBigEndian();
      this.field376 = class300_1.readUnsignedByte();
      this.field365 = class300_1.readUnsignedShortBigEndian();
      this.field369 = class300_1.readUnsignedByte();
      this.field366 = class300_1.readUnsignedShortBigEndian();
      this.field370 = class300_1.readUnsignedByte();
      this.field375 = class300_1.readUnsignedShortBigEndian();
      this.field371 = class300_1.readUnsignedByte();
      this.method744(33671142);
   }

   void method744(int i_1) {
   }

   static void method763(class235 class235_0, String string_1) {
      class58 class58_3 = new class58(class235_0, string_1);
      client.field925.add(class58_3);
      client.field927 += class58_3.field539;
   }

}
