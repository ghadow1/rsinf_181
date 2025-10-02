public class class253 extends class175 {

   public static class233 field3351;
   public static class233 field3395;
   public int field3357;
   public static boolean field3352 = false;
   static class145 field3390 = new class145(4096);
   public static class145 field3387 = new class145(500);
   static class145 field3354 = new class145(30);
   static class145 field3355 = new class145(30);
   static class121[] field3398 = new class121[4];
   public String field3360 = "null";
   public int field3365 = 1;
   public int field3366 = 1;
   public int field3382 = 2;
   public boolean field3368 = true;
   public int field3369 = -1;
   int field3370 = -1;
   boolean field3371 = false;
   public boolean field3372 = false;
   public int field3373 = -1;
   public int field3374 = 16;
   int field3350 = 0;
   int field3380 = 0;
   public String[] field3377 = new String[5];
   public int field3378 = -1;
   public int field3379 = -1;
   boolean field3358 = false;
   public boolean field3356 = true;
   int field3381 = 128;
   int field3383 = 128;
   int field3384 = 128;
   int field3385 = 0;
   int field3386 = 0;
   int field3376 = 0;
   public boolean field3388 = false;
   boolean field3389 = false;
   public int field3361 = -1;
   int field3349 = -1;
   int field3393 = -1;
   public int field3394 = -1;
   public int field3399 = 0;
   public int field3392 = 0;
   public int field3397 = 0;
   int[] field3359;
   int[] field3362;
   short[] field3375;
   short[] field3353;
   short[] field3363;
   short[] field3364;
   public int[] field3367;
   public int[] field3391;
   class316 field3396;

   public final class253 method4595(byte b_1) {
      int i_2 = -1;
      if (this.field3349 != -1) {
         i_2 = class67.method1237(this.field3349, -836499887);
      } else if (this.field3393 != -1) {
         i_2 = class212.field2525[this.field3393];
      }

      int i_3;
      if (i_2 >= 0 && i_2 < this.field3391.length - 1) {
         i_3 = this.field3391[i_2];
      } else {
         i_3 = this.field3391[this.field3391.length - 1];
      }

      return i_3 != -1 ? class128.method2970(i_3, (short) 4095) : null;
   }

   void method4628(class300 class300_1, int i_2, int i_3) {
      int i_4;
      int i_5;
      if (i_2 == 1) {
         i_4 = class300_1.method5504((byte) 46);
         if (i_4 > 0) {
            if (this.field3362 != null && !field3352) {
               class300_1.field3732 += 3 * i_4;
            } else {
               this.field3359 = new int[i_4];
               this.field3362 = new int[i_4];

               for (i_5 = 0; i_5 < i_4; i_5++) {
                  this.field3362[i_5] = class300_1.method5496(-1459053594);
                  this.field3359[i_5] = class300_1.method5504((byte) 74);
               }
            }
         }
      } else if (i_2 == 2) {
         this.field3360 = class300_1.method5503(-231155257);
      } else if (i_2 == 5) {
         i_4 = class300_1.method5504((byte) 103);
         if (i_4 > 0) {
            if (this.field3362 != null && !field3352) {
               class300_1.field3732 += i_4 * 2;
            } else {
               this.field3359 = null;
               this.field3362 = new int[i_4];

               for (i_5 = 0; i_5 < i_4; i_5++) {
                  this.field3362[i_5] = class300_1.method5496(-1459053594);
               }
            }
         }
      } else if (i_2 == 14) {
         this.field3365 = class300_1.method5504((byte) 22);
      } else if (i_2 == 15) {
         this.field3366 = class300_1.method5504((byte) 96);
      } else if (i_2 == 17) {
         this.field3382 = 0;
         this.field3368 = false;
      } else if (i_2 == 18) {
         this.field3368 = false;
      } else if (i_2 == 19) {
         this.field3369 = class300_1.method5504((byte) 54);
      } else if (i_2 == 21) {
         this.field3370 = 0;
      } else if (i_2 == 22) {
         this.field3371 = true;
      } else if (i_2 == 23) {
         this.field3372 = true;
      } else if (i_2 == 24) {
         this.field3373 = class300_1.method5496(-1459053594);
         if (this.field3373 == 65535) {
            this.field3373 = -1;
         }
      } else if (i_2 == 27) {
         this.field3382 = 1;
      } else if (i_2 == 28) {
         this.field3374 = class300_1.method5504((byte) 108);
      } else if (i_2 == 29) {
         this.field3350 = class300_1.method5495((byte) 0);
      } else if (i_2 == 39) {
         this.field3380 = class300_1.method5495((byte) 0) * 25;
      } else if (i_2 >= 30 && i_2 < 35) {
         this.field3377[i_2 - 30] = class300_1.method5503(-231155257);
         if (this.field3377[i_2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3377[i_2 - 30] = null;
         }
      } else if (i_2 == 40) {
         i_4 = class300_1.method5504((byte) 10);
         this.field3375 = new short[i_4];
         this.field3353 = new short[i_4];

         for (i_5 = 0; i_5 < i_4; i_5++) {
            this.field3375[i_5] = (short)class300_1.method5496(-1459053594);
            this.field3353[i_5] = (short)class300_1.method5496(-1459053594);
         }
      } else if (i_2 == 41) {
         i_4 = class300_1.method5504((byte) 110);
         this.field3363 = new short[i_4];
         this.field3364 = new short[i_4];

         for (i_5 = 0; i_5 < i_4; i_5++) {
            this.field3363[i_5] = (short)class300_1.method5496(-1459053594);
            this.field3364[i_5] = (short)class300_1.method5496(-1459053594);
         }
      } else if (i_2 == 62) {
         this.field3358 = true;
      } else if (i_2 == 64) {
         this.field3356 = false;
      } else if (i_2 == 65) {
         this.field3381 = class300_1.method5496(-1459053594);
      } else if (i_2 == 66) {
         this.field3383 = class300_1.method5496(-1459053594);
      } else if (i_2 == 67) {
         this.field3384 = class300_1.method5496(-1459053594);
      } else if (i_2 == 68) {
         this.field3379 = class300_1.method5496(-1459053594);
      } else if (i_2 == 69) {
         class300_1.method5504((byte) 33);
      } else if (i_2 == 70) {
         this.field3385 = class300_1.method5606(-1327508233);
      } else if (i_2 == 71) {
         this.field3386 = class300_1.method5606(-1327508233);
      } else if (i_2 == 72) {
         this.field3376 = class300_1.method5606(-1327508233);
      } else if (i_2 == 73) {
         this.field3388 = true;
      } else if (i_2 == 74) {
         this.field3389 = true;
      } else if (i_2 == 75) {
         this.field3361 = class300_1.method5504((byte) 60);
      } else if (i_2 != 77 && i_2 != 92) {
         if (i_2 == 78) {
            this.field3394 = class300_1.method5496(-1459053594);
            this.field3399 = class300_1.method5504((byte) 68);
         } else if (i_2 == 79) {
            this.field3392 = class300_1.method5496(-1459053594);
            this.field3397 = class300_1.method5496(-1459053594);
            this.field3399 = class300_1.method5504((byte) 93);
            i_4 = class300_1.method5504((byte) 70);
            this.field3367 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field3367[i_5] = class300_1.method5496(-1459053594);
            }
         } else if (i_2 == 81) {
            this.field3370 = class300_1.method5504((byte) 36) * 256;
         } else if (i_2 == 82) {
            this.field3378 = class300_1.method5496(-1459053594);
         } else if (i_2 == 249) {
            this.field3396 = class26.method403(class300_1, this.field3396, -2066495425);
         }
      } else {
         this.field3349 = class300_1.method5496(-1459053594);
         if (this.field3349 == 65535) {
            this.field3349 = -1;
         }

         this.field3393 = class300_1.method5496(-1459053594);
         if (this.field3393 == 65535) {
            this.field3393 = -1;
         }

         i_4 = -1;
         if (i_2 == 92) {
            i_4 = class300_1.method5496(-1459053594);
            if (i_4 == 65535) {
               i_4 = -1;
            }
         }

         i_5 = class300_1.method5504((byte) 42);
         this.field3391 = new int[i_5 + 2];

         for (int i_6 = 0; i_6 <= i_5; i_6++) {
            this.field3391[i_6] = class300_1.method5496(-1459053594);
            if (this.field3391[i_6] == 65535) {
               this.field3391[i_6] = -1;
            }
         }

         this.field3391[i_5 + 1] = i_4;
      }

   }

   final class121 method4594(int i_1, int i_2, int i_3) {
      class121 class121_4 = null;
      boolean bool_5;
      int i_6;
      int i_8;
      if (this.field3359 == null) {
         if (i_1 != 10) {
            return null;
         }

         if (this.field3362 == null) {
            return null;
         }

         bool_5 = this.field3358;
         if (i_1 == 2 && i_2 > 3) {
            bool_5 = !bool_5;
         }

         i_6 = this.field3362.length;

         for (int i_7 = 0; i_7 < i_6; i_7++) {
            i_8 = this.field3362[i_7];
            if (bool_5) {
               i_8 += 65536;
            }

            class121_4 = (class121) field3387.method3320((long)i_8);
            if (class121_4 == null) {
               class121_4 = class121.method2769(field3351, i_8 & 0xffff, 0);
               if (class121_4 == null) {
                  return null;
               }

               if (bool_5) {
                  class121_4.method2785();
               }

               field3387.method3322(class121_4, (long)i_8);
            }

            if (i_6 > 1) {
               field3398[i_7] = class121_4;
            }
         }

         if (i_6 > 1) {
            class121_4 = new class121(field3398, i_6);
         }
      } else {
         int i_10 = -1;

         for (i_6 = 0; i_6 < this.field3359.length; i_6++) {
            if (this.field3359[i_6] == i_1) {
               i_10 = i_6;
               break;
            }
         }

         if (i_10 == -1) {
            return null;
         }

         i_6 = this.field3362[i_10];
         boolean bool_11 = this.field3358 ^ i_2 > 3;
         if (bool_11) {
            i_6 += 65536;
         }

         class121_4 = (class121) field3387.method3320((long)i_6);
         if (class121_4 == null) {
            class121_4 = class121.method2769(field3351, i_6 & 0xffff, 0);
            if (class121_4 == null) {
               return null;
            }

            if (bool_11) {
               class121_4.method2785();
            }

            field3387.method3322(class121_4, (long)i_6);
         }
      }

      if (this.field3381 == 128 && this.field3383 == 128 && this.field3384 == 128) {
         bool_5 = false;
      } else {
         bool_5 = true;
      }

      boolean bool_12;
      if (this.field3385 == 0 && this.field3386 == 0 && this.field3376 == 0) {
         bool_12 = false;
      } else {
         bool_12 = true;
      }

      class121 class121_9 = new class121(class121_4, i_2 == 0 && !bool_5 && !bool_12, this.field3375 == null, this.field3363 == null, true);
      if (i_1 == 4 && i_2 > 3) {
         class121_9.method2781(256);
         class121_9.method2782(45, 0, -45);
      }

      i_2 &= 0x3;
      if (i_2 == 1) {
         class121_9.method2778();
      } else if (i_2 == 2) {
         class121_9.method2797();
      } else if (i_2 == 3) {
         class121_9.method2780();
      }

      if (this.field3375 != null) {
         for (i_8 = 0; i_8 < this.field3375.length; i_8++) {
            class121_9.method2783(this.field3375[i_8], this.field3353[i_8]);
         }
      }

      if (this.field3363 != null) {
         for (i_8 = 0; i_8 < this.field3363.length; i_8++) {
            class121_9.method2784(this.field3363[i_8], this.field3364[i_8]);
         }
      }

      if (bool_5) {
         class121_9.method2786(this.field3381, this.field3383, this.field3384);
      }

      if (bool_12) {
         class121_9.method2782(this.field3385, this.field3386, this.field3376);
      }

      return class121_9;
   }

   void method4586(int i_1) {
      if (this.field3369 == -1) {
         this.field3369 = 0;
         if (this.field3362 != null && (this.field3359 == null || this.field3359[0] == 10)) {
            this.field3369 = 1;
         }

         for (int i_2 = 0; i_2 < 5; i_2++) {
            if (this.field3377[i_2] != null) {
               this.field3369 = 1;
            }
         }
      }

      if (this.field3361 == -1) {
         this.field3361 = this.field3382 != 0 ? 1 : 0;
      }

   }

   void method4625(class300 class300_1, byte b_2) {
      while (true) {
         int i_3 = class300_1.method5504((byte) 99);
         if (i_3 == 0) {
            return;
         }

         this.method4628(class300_1, i_3, 2121034762);
      }
   }

   public final class127 method4614(int i_1, int i_2, int[][] ints_3, int i_4, int i_5, int i_6, class258 class258_7, int i_8, byte b_9) {
      long long_10;
      if (this.field3359 == null) {
         long_10 = (long)(i_2 + (this.field3357 << 10));
      } else {
         long_10 = (long)(i_2 + (i_1 << 3) + (this.field3357 << 10));
      }

      class127 class127_12 = (class127) field3355.method3320(long_10);
      if (class127_12 == null) {
         class121 class121_13 = this.method4594(i_1, i_2, 1716615766);
         if (class121_13 == null) {
            return null;
         }

         class127_12 = class121_13.method2802(this.field3350 + 64, this.field3380 + 768, -50, -10, -50);
         field3355.method3322(class127_12, long_10);
      }

      if (class258_7 == null && this.field3370 == -1) {
         return class127_12;
      } else {
         if (class258_7 != null) {
            class127_12 = class258_7.method4763(class127_12, i_8, i_2, (byte) -68);
         } else {
            class127_12 = class127_12.method2859(true);
         }

         if (this.field3370 >= 0) {
            class127_12 = class127_12.method2858(ints_3, i_4, i_5, i_6, false, this.field3370);
         }

         return class127_12;
      }
   }

   public final boolean method4589(int i_1, int i_2) {
      if (this.field3359 != null) {
         for (int i_5 = 0; i_5 < this.field3359.length; i_5++) {
            if (this.field3359[i_5] == i_1) {
               return field3351.method4146(this.field3362[i_5] & 0xffff, 0, -416813220);
            }
         }

         return true;
      } else if (this.field3362 == null) {
         return true;
      } else if (i_1 != 10) {
         return true;
      } else {
         boolean bool_3 = true;

         for (int i_4 = 0; i_4 < this.field3362.length; i_4++) {
            bool_3 &= field3351.method4146(this.field3362[i_4] & 0xffff, 0, -416813220);
         }

         return bool_3;
      }
   }

   public final boolean method4608(int i_1) {
      if (this.field3362 == null) {
         return true;
      } else {
         boolean bool_2 = true;

         for (int i_3 = 0; i_3 < this.field3362.length; i_3++) {
            bool_2 &= field3351.method4146(this.field3362[i_3] & 0xffff, 0, -416813220);
         }

         return bool_2;
      }
   }

   public final class127 method4592(int i_1, int i_2, int[][] ints_3, int i_4, int i_5, int i_6, int i_7) {
      long long_8;
      if (this.field3359 == null) {
         long_8 = (long)(i_2 + (this.field3357 << 10));
      } else {
         long_8 = (long)(i_2 + (i_1 << 3) + (this.field3357 << 10));
      }

      class127 class127_10 = (class127) field3355.method3320(long_8);
      if (class127_10 == null) {
         class121 class121_11 = this.method4594(i_1, i_2, -1141866504);
         if (class121_11 == null) {
            return null;
         }

         class127_10 = class121_11.method2802(this.field3350 + 64, this.field3380 + 768, -50, -10, -50);
         field3355.method3322(class127_10, long_8);
      }

      if (this.field3370 >= 0) {
         class127_10 = class127_10.method2858(ints_3, i_4, i_5, i_6, true, this.field3370);
      }

      return class127_10;
   }

   public boolean method4598(int i_1) {
      if (this.field3391 == null) {
         return this.field3394 != -1 || this.field3367 != null;
      } else {
         for (int i_2 = 0; i_2 < this.field3391.length; i_2++) {
            if (this.field3391[i_2] != -1) {
               class253 class253_3 = class128.method2970(this.field3391[i_2], (short) 4095);
               if (class253_3.field3394 != -1 || class253_3.field3367 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public final class135 method4591(int i_1, int i_2, int[][] ints_3, int i_4, int i_5, int i_6, byte b_7) {
      long long_8;
      if (this.field3359 == null) {
         long_8 = (long)(i_2 + (this.field3357 << 10));
      } else {
         long_8 = (long)(i_2 + (i_1 << 3) + (this.field3357 << 10));
      }

      Object obj_10 = (class135) field3354.method3320(long_8);
      if (obj_10 == null) {
         class121 class121_11 = this.method4594(i_1, i_2, 828225621);
         if (class121_11 == null) {
            return null;
         }

         if (!this.field3371) {
            obj_10 = class121_11.method2802(this.field3350 + 64, this.field3380 + 768, -50, -10, -50);
         } else {
            class121_11.field1580 = (short)(this.field3350 + 64);
            class121_11.field1577 = (short)(this.field3380 + 768);
            class121_11.method2787();
            obj_10 = class121_11;
         }

         field3354.method3322((class175) obj_10, long_8);
      }

      if (this.field3371) {
         obj_10 = ((class121) obj_10).method2775();
      }

      if (this.field3370 >= 0) {
         if (obj_10 instanceof class127) {
            obj_10 = ((class127) obj_10).method2858(ints_3, i_4, i_5, i_6, true, this.field3370);
         } else if (obj_10 instanceof class121) {
            obj_10 = ((class121) obj_10).method2776(ints_3, i_4, i_5, i_6, true, this.field3370);
         }
      }

      return (class135) obj_10;
   }

   public int method4596(int i_1, int i_2, int i_3) {
      class316 class316_5 = this.field3396;
      int i_4;
      if (class316_5 == null) {
         i_4 = i_2;
      } else {
         class179 class179_6 = (class179) class316_5.method5924((long)i_1);
         if (class179_6 == null) {
            i_4 = i_2;
         } else {
            i_4 = class179_6.field2111;
         }
      }

      return i_4;
   }

   public String method4632(int i_1, String string_2, byte b_3) {
      return class5.method54(this.field3396, i_1, string_2, (byte) -65);
   }

}
