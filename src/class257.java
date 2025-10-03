public class class257 extends class175 {

   public static class233 field3505;
   static int field3502;
   public static class145 field3503 = new class145(64);
   public int field3512 = 0;
   public int field3508 = -1;
   public boolean field3506 = true;
   public int field3507 = -1;
   public int field3513;
   public int field3509;
   public int field3510;
   public int field3511;
   public int field3504;
   public int field3514;

   void method4745(ByteBuffer class300_1, int i_2, int i_3, byte b_4) {
      if (i_2 == 1) {
         this.field3512 = class300_1.read24BitInt();
      } else if (i_2 == 2) {
         this.field3508 = class300_1.readUnsignedByte();
      } else if (i_2 == 5) {
         this.field3506 = false;
      } else if (i_2 == 7) {
         this.field3507 = class300_1.read24BitInt();
      } else if (i_2 == 8) {
         ;
      }

   }

   void method4749(int i_1, int i_2) {
      double d_3 = (double)(i_1 >> 16 & 0xff) / 256.0D;
      double d_5 = (double)(i_1 >> 8 & 0xff) / 256.0D;
      double d_7 = (double)(i_1 & 0xff) / 256.0D;
      double d_9 = d_3;
      if (d_5 < d_3) {
         d_9 = d_5;
      }

      if (d_7 < d_9) {
         d_9 = d_7;
      }

      double d_11 = d_3;
      if (d_5 > d_3) {
         d_11 = d_5;
      }

      if (d_7 > d_11) {
         d_11 = d_7;
      }

      double d_13 = 0.0D;
      double d_15 = 0.0D;
      double d_17 = (d_11 + d_9) / 2.0D;
      if (d_9 != d_11) {
         if (d_17 < 0.5D) {
            d_15 = (d_11 - d_9) / (d_9 + d_11);
         }

         if (d_17 >= 0.5D) {
            d_15 = (d_11 - d_9) / (2.0D - d_11 - d_9);
         }

         if (d_3 == d_11) {
            d_13 = (d_5 - d_7) / (d_11 - d_9);
         } else if (d_11 == d_5) {
            d_13 = (d_7 - d_3) / (d_11 - d_9) + 2.0D;
         } else if (d_11 == d_7) {
            d_13 = 4.0D + (d_3 - d_5) / (d_11 - d_9);
         }
      }

      d_13 /= 6.0D;
      this.field3513 = (int)(256.0D * d_13);
      this.field3509 = (int)(256.0D * d_15);
      this.field3510 = (int)(256.0D * d_17);
      if (this.field3509 < 0) {
         this.field3509 = 0;
      } else if (this.field3509 > 255) {
         this.field3509 = 255;
      }

      if (this.field3510 < 0) {
         this.field3510 = 0;
      } else if (this.field3510 > 255) {
         this.field3510 = 255;
      }

   }

   public void method4743(int i_1) {
      if (this.field3507 != -1) {
         this.method4749(this.field3507, 1480570865);
         this.field3511 = this.field3513;
         this.field3504 = this.field3509;
         this.field3514 = this.field3510;
      }

      this.method4749(this.field3512, -1232631755);
   }

   public void method4744(ByteBuffer class300_1, int i_2, byte b_3) {
      while (true) {
         int i_4 = class300_1.readUnsignedByte();
         if (i_4 == 0) {
            return;
         }

         this.method4745(class300_1, i_4, i_2, (byte) 0);
      }
   }

   static final int method4757(int i_0, int i_1, int i_2) {
      int i_4 = i_0 / i_2;
      int i_5 = i_0 & i_2 - 1;
      int i_6 = i_1 / i_2;
      int i_7 = i_1 & i_2 - 1;
      int i_8 = class120.method2765(i_4, i_6);
      int i_9 = class120.method2765(i_4 + 1, i_6);
      int i_10 = class120.method2765(i_4, i_6 + 1);
      int i_11 = class120.method2765(i_4 + 1, i_6 + 1);
      int i_12 = class4.method49(i_8, i_9, i_5, i_2, 16711935);
      int i_13 = class4.method49(i_10, i_11, i_5, i_2, 16711935);
      return class4.method49(i_12, i_13, i_7, i_2, 16711935);
   }

   static final void method4756(class217 class217_0, int i_1, byte[] bytes_2, byte[] bytes_3, int i_4) {
      if (class217_0.field2650 == null) {
         if (bytes_2 == null) {
            return;
         }

         class217_0.field2650 = new byte[11][];
         class217_0.field2625 = new byte[11][];
         class217_0.field2641 = new int[11];
         class217_0.field2588 = new int[11];
      }

      class217_0.field2650[i_1] = bytes_2;
      if (bytes_2 != null) {
         class217_0.field2704 = true;
      } else {
         class217_0.field2704 = false;

         for (int i_5 = 0; i_5 < class217_0.field2650.length; i_5++) {
            if (class217_0.field2650[i_5] != null) {
               class217_0.field2704 = true;
               break;
            }
         }
      }

      class217_0.field2625[i_1] = bytes_3;
   }

}
