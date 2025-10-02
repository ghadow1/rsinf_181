public class class244 extends class175 {

   public static class233 field3255;
   public static class145 field3254 = new class145(64);
   int field3256 = 0;
   public int field3258;
   public int field3259;
   public int field3260;
   public int field3257;

   void method4420(int i_1, int i_2) {
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
      double d_17 = (d_9 + d_11) / 2.0D;
      if (d_11 != d_9) {
         if (d_17 < 0.5D) {
            d_15 = (d_11 - d_9) / (d_11 + d_9);
         }

         if (d_17 >= 0.5D) {
            d_15 = (d_11 - d_9) / (2.0D - d_11 - d_9);
         }

         if (d_3 == d_11) {
            d_13 = (d_5 - d_7) / (d_11 - d_9);
         } else if (d_11 == d_5) {
            d_13 = (d_7 - d_3) / (d_11 - d_9) + 2.0D;
         } else if (d_11 == d_7) {
            d_13 = (d_3 - d_5) / (d_11 - d_9) + 4.0D;
         }
      }

      d_13 /= 6.0D;
      this.field3258 = (int)(256.0D * d_15);
      this.field3259 = (int)(d_17 * 256.0D);
      if (this.field3258 < 0) {
         this.field3258 = 0;
      } else if (this.field3258 > 255) {
         this.field3258 = 255;
      }

      if (this.field3259 < 0) {
         this.field3259 = 0;
      } else if (this.field3259 > 255) {
         this.field3259 = 255;
      }

      if (d_17 > 0.5D) {
         this.field3260 = (int)((1.0D - d_17) * d_15 * 512.0D);
      } else {
         this.field3260 = (int)(d_15 * d_17 * 512.0D);
      }

      if (this.field3260 < 1) {
         this.field3260 = 1;
      }

      this.field3257 = (int)(d_13 * (double)this.field3260);
   }

   void method4432(class300 class300_1, int i_2, int i_3, byte b_4) {
      if (i_2 == 1) {
         this.field3256 = class300_1.method5567(1995087556);
      }

   }

   public void method4417(int i_1) {
      this.method4420(this.field3256, -1792138465);
   }

   public void method4418(class300 class300_1, int i_2, int i_3) {
      while (true) {
         int i_4 = class300_1.method5504((byte) 22);
         if (i_4 == 0) {
            return;
         }

         this.method4432(class300_1, i_4, i_2, (byte) 115);
      }
   }

   static int method4433(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      class217 class217_4 = class80.method1978(class76.field1098[--class70.field1014]);
      if (i_0 == 2800) {
         class76.field1098[++class70.field1014 - 1] = class78.method1957(class268.method4987(class217_4, 1531196842), (byte) 42);
         return 1;
      } else if (i_0 != 2801) {
         if (i_0 == 2802) {
            if (class217_4.field2643 == null) {
               class76.field1093[++class221.field2747 - 1] = "";
            } else {
               class76.field1093[++class221.field2747 - 1] = class217_4.field2643;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int i_5 = class76.field1098[--class70.field1014];
         --i_5;
         if (class217_4.field2644 != null && i_5 < class217_4.field2644.length && class217_4.field2644[i_5] != null) {
            class76.field1093[++class221.field2747 - 1] = class217_4.field2644[i_5];
         } else {
            class76.field1093[++class221.field2747 - 1] = "";
         }

         return 1;
      }
   }

}
