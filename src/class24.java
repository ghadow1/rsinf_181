public class class24 implements class37 {

   int field197;
   int field196;
   int field200;
   int field199;
   int field207;
   int field201;
   int field202;
   int field203;
   int field204;
   int field205;

   public boolean vmethod740(int i_1, int i_2, byte b_3) {
      return i_1 >> 6 >= this.field202 && i_1 >> 6 <= this.field204 && i_2 >> 6 >= this.field203 && i_2 >> 6 <= this.field205;
   }

   public boolean vmethod749(int i_1, int i_2, int i_3, int i_4) {
      return i_1 >= this.field197 && i_1 < this.field196 + this.field197 ? i_2 >> 6 >= this.field200 && i_2 >> 6 <= this.field207 && i_3 >> 6 >= this.field199 && i_3 >> 6 <= this.field201 : false;
   }

   public void vmethod738(class26 class26_1, byte b_2) {
      if (class26_1.field217 > this.field202) {
         class26_1.field217 = this.field202;
      }

      if (class26_1.field223 < this.field204) {
         class26_1.field223 = this.field204;
      }

      if (class26_1.field220 > this.field203) {
         class26_1.field220 = this.field203;
      }

      if (class26_1.field222 < this.field205) {
         class26_1.field222 = this.field205;
      }

   }

   public class213 vmethod742(int i_1, int i_2, byte b_3) {
      if (!this.vmethod740(i_1, i_2, (byte) 119)) {
         return null;
      } else {
         int i_4 = this.field200 * 64 - this.field202 * 64 + i_1;
         int i_5 = this.field199 * 64 - this.field203 * 64 + i_2;
         return new class213(this.field197, i_4, i_5);
      }
   }

   public int[] vmethod760(int i_1, int i_2, int i_3, byte b_4) {
      if (!this.vmethod749(i_1, i_2, i_3, -938272501)) {
         return null;
      } else {
         int[] ints_5 = new int[] {this.field202 * 64 - this.field200 * 64 + i_2, i_3 + (this.field203 * 64 - this.field199 * 64)};
         return ints_5;
      }
   }

   public void vmethod743(class300 class300_1, int i_2) {
      this.field197 = class300_1.method5504();
      this.field196 = class300_1.method5504();
      this.field200 = class300_1.method5496();
      this.field199 = class300_1.method5496();
      this.field207 = class300_1.method5496();
      this.field201 = class300_1.method5496();
      this.field202 = class300_1.method5496();
      this.field203 = class300_1.method5496();
      this.field204 = class300_1.method5496();
      this.field205 = class300_1.method5496();
      this.method305((byte) -39);
   }

   void method305(byte b_1) {
   }

}
