public class class299 extends class300 {

   static int field3727;
   static final int[] field3724 = new int[] {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   class328 field3725;
   int field3726;

   public class299(int i_1) {
      super(i_1);
   }

   public boolean method5441(int i_1) {
      int i_2 = super.field3730[super.field3732] - this.field3725.method6254((byte) 7) & 0xff;
      return i_2 >= 128;
   }

   public void method5442(class328 class328_1, byte b_2) {
      this.field3725 = class328_1;
   }

   public void method5473(int i_1, int i_2) {
      super.field3730[++super.field3732 - 1] = (byte)(i_1 + this.field3725.method6246((byte) 75));
   }

   public void method5438(int i_1) {
      this.field3726 = super.field3732 * 8;
   }

   public void method5446(byte b_1) {
      super.field3732 = (this.field3726 + 7) / 8;
   }

   public int method5445(int i_1, int i_2) {
      int i_3 = this.field3726 >> 3;
      int i_4 = 8 - (this.field3726 & 0x7);
      int i_5 = 0;

      for (this.field3726 += i_1; i_1 > i_4; i_4 = 8) {
         i_5 += (super.field3730[i_3++] & field3724[i_4]) << i_1 - i_4;
         i_1 -= i_4;
      }

      if (i_4 == i_1) {
         i_5 += super.field3730[i_3] & field3724[i_4];
      } else {
         i_5 += super.field3730[i_3] >> i_4 - i_1 & field3724[i_1];
      }

      return i_5;
   }

   public void method5443(byte[] bytes_1, int i_2, int i_3, int i_4) {
      for (int i_5 = 0; i_5 < i_3; i_5++) {
         bytes_1[i_5 + i_2] = (byte)(super.field3730[++super.field3732 - 1] - this.field3725.method6246((byte) 74));
      }

   }

   public int method5461(int i_1, short s_2) {
      return i_1 * 8 - this.field3726;
   }

   public int method5451(int i_1) {
      int i_2 = super.field3730[++super.field3732 - 1] - this.field3725.method6246((byte) 118) & 0xff;
      return i_2 < 128 ? i_2 : (i_2 - 128 << 8) + (super.field3730[++super.field3732 - 1] - this.field3725.method6246((byte) 13) & 0xff);
   }

   public int method5440(int i_1) {
      return super.field3730[++super.field3732 - 1] - this.field3725.method6246((byte) 15) & 0xff;
   }

   public void method5437(int[] ints_1, int i_2) {
      this.field3725 = new class328(ints_1);
   }

   static class324 method5474(class233 class233_0, int i_1, int i_2, int i_3) {
      if (!class284.method5220(class233_0, i_1, i_2, (byte) -34)) {
         return null;
      } else {
         class324 class324_5 = new class324();
         class324_5.field3896 = class326.field3913;
         class324_5.field3894 = class326.field3910;
         class324_5.field3890 = class212.field2523[0];
         class324_5.field3891 = class326.field3915[0];
         class324_5.field3897 = class326.field3914[0];
         class324_5.field3893 = class216.field2548[0];
         class324_5.field3892 = class138.field1895;
         class324_5.field3895 = class326.field3912[0];
         class16.method174(572816821);
         return class324_5;
      }
   }

}
