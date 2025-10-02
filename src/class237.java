import java.util.HashMap;

public class class237 {

   static int field3191;
   final HashMap field3183 = new HashMap();
   class319 field3186 = new class319(0, 0);
   int[] field3184 = new int[2048];
   int[] field3182 = new int[2048];
   int field3190 = 0;
   static int[] field3189;

   public class237() {
      field3189 = new int[2000];
      int i_1 = 0;
      int i_2 = 240;

      int i_4;
      for (byte b_3 = 12; i_1 < 16; i_2 -= b_3) {
         i_4 = class283.method5217((double)((float)i_2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)i_1 / 16.0F + 0.075F));
         field3189[i_1] = i_4;
         ++i_1;
      }

      i_2 = 48;

      for (int i_6 = i_2 / 6; i_1 < field3189.length; i_2 -= i_6) {
         i_4 = i_1 * 2;

         for (int i_5 = class283.method5217((double)((float)i_2 / 360.0F), 0.9998999834060669D, 0.5D); i_1 < i_4 && i_1 < field3189.length; i_1++) {
            field3189[i_1] = i_5;
         }
      }

   }

   class325 method4318(int i_1) {
      if (!this.field3183.containsKey(Integer.valueOf(i_1))) {
         this.method4317(i_1);
      }

      return (class325) this.field3183.get(Integer.valueOf(i_1));
   }

   void method4317(int i_1) {
      int i_3 = i_1 * 2 + 1;
      double[] doubles_4 = class271.method4992(0.0D, (double)((float)i_1 / 3.0F), i_1, -694088627);
      double d_5 = doubles_4[i_1] * doubles_4[i_1];
      int[] ints_7 = new int[i_3 * i_3];
      boolean bool_8 = false;

      for (int i_9 = 0; i_9 < i_3; i_9++) {
         for (int i_10 = 0; i_10 < i_3; i_10++) {
            int i_11 = ints_7[i_10 + i_9 * i_3] = (int)(256.0D * (doubles_4[i_10] * doubles_4[i_9] / d_5));
            if (!bool_8 && i_11 > 0) {
               bool_8 = true;
            }
         }
      }

      class325 class325_12 = new class325(ints_7, i_3, i_3);
      this.field3183.put(Integer.valueOf(i_1), class325_12);
   }

   void method4322(class325 class325_1, class325 class325_2, class319 class319_3, int i_4) {
      if (class319_3.field3865 != 0 && class319_3.field3866 != 0) {
         int i_5 = 0;
         int i_6 = 0;
         if (class319_3.field3863 == 0) {
            i_5 = class325_1.field3899 - class319_3.field3865;
         }

         if (class319_3.field3864 == 0) {
            i_6 = class325_1.field3900 - class319_3.field3866;
         }

         int i_7 = i_5 + i_6 * class325_1.field3899;
         int i_8 = class325_2.field3899 * class319_3.field3864 + class319_3.field3863;

         for (int i_9 = 0; i_9 < class319_3.field3866; i_9++) {
            for (int i_10 = 0; i_10 < class319_3.field3865; i_10++) {
               int i_10001 = i_8++;
               class325_2.field3908[i_10001] += class325_1.field3908[i_7++];
            }

            i_7 += class325_1.field3899 - class319_3.field3865;
            i_8 += class325_2.field3899 - class319_3.field3865;
         }

      }
   }

   public final void method4321(int i_1, int i_2, class325 class325_3, float f_4) {
      int i_6 = (int)(18.0F * f_4);
      class325 class325_7 = this.method4318(i_6);
      int i_8 = i_6 * 2 + 1;
      class319 class319_9 = new class319(0, 0, class325_3.field3899, class325_3.field3900);
      class319 class319_10 = new class319(0, 0);
      this.field3186.method5961(i_8, i_8, (byte) 20);
      System.nanoTime();

      int i_11;
      int i_12;
      int i_13;
      for (i_11 = 0; i_11 < this.field3190; i_11++) {
         i_12 = this.field3184[i_11];
         i_13 = this.field3182[i_11];
         int i_14 = (int)(f_4 * (float)(i_12 - i_1)) - i_6;
         int i_15 = (int)((float)class325_3.field3900 - (float)(i_13 - i_2) * f_4) - i_6;
         this.field3186.method5960(i_14, i_15, (byte) -77);
         this.field3186.method5980(class319_9, class319_10, 799718452);
         this.method4322(class325_7, class325_3, class319_10, 1272955038);
      }

      System.nanoTime();
      System.nanoTime();

      for (i_11 = 0; i_11 < class325_3.field3908.length; i_11++) {
         if (class325_3.field3908[i_11] == 0) {
            class325_3.field3908[i_11] = -16777216;
         } else {
            i_12 = (class325_3.field3908[i_11] + 64 - 1) / 256;
            if (i_12 <= 0) {
               class325_3.field3908[i_11] = -16777216;
            } else {
               if (i_12 > field3189.length) {
                  i_12 = field3189.length;
               }

               i_13 = field3189[i_12 - 1];
               class325_3.field3908[i_11] = ~0xffffff | i_13;
            }
         }
      }

      System.nanoTime();
   }

   public final void method4320() {
      this.field3190 = 0;
   }

   public final void method4316(int i_1, int i_2) {
      if (this.field3190 < this.field3184.length) {
         this.field3184[this.field3190] = i_1;
         this.field3182[this.field3190] = i_2;
         ++this.field3190;
      }
   }

}
