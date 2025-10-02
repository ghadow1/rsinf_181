public class class254 extends class175 {

   public static class233 field3405;
   static class235 field3457;
   public static int field3455;
   public int field3410;
   public static class145 field3407 = new class145(64);
   public static class145 field3408 = new class145(50);
   public static class145 field3445 = new class145(200);
   public String field3449 = "null";
   public int field3422 = 2000;
   public int field3418 = 0;
   public int field3447 = 0;
   public int field3420 = 0;
   public int field3406 = 0;
   public int field3421 = 0;
   public int field3423 = 0;
   public int field3428 = 1;
   public boolean field3425 = false;
   public String[] field3426 = new String[] {null, null, "Take", null, null};
   public String[] field3427 = new String[] {null, null, null, null, "Drop"};
   int field3403 = -2;
   int field3456 = -1;
   int field3437 = -1;
   int field3431 = 0;
   int field3432 = -1;
   int field3433 = -1;
   int field3434 = 0;
   int field3435 = -1;
   int field3430 = -1;
   int field3436 = -1;
   int field3438 = -1;
   int field3417 = -1;
   int field3440 = -1;
   public int field3443 = -1;
   public int field3444 = -1;
   int field3451 = 128;
   int field3446 = 128;
   int field3404 = 128;
   public int field3448 = 0;
   public int field3419 = 0;
   public int field3450 = 0;
   public boolean field3452 = false;
   int field3453 = -1;
   int field3454 = -1;
   public int field3400 = -1;
   public int field3439 = -1;
   int field3411;
   short[] field3424;
   short[] field3414;
   short[] field3415;
   short[] field3416;
   int[] field3441;
   int[] field3442;
   class316 field3409;

   void method4673(ByteBuffer class300_1, int i_2, int i_3) {
      if (i_2 == 1) {
         this.field3411 = class300_1.readUnsignedShortBigEndian();
      } else if (i_2 == 2) {
         this.field3449 = class300_1.readNullTerminatedString();
      } else if (i_2 == 4) {
         this.field3422 = class300_1.readUnsignedShortBigEndian();
      } else if (i_2 == 5) {
         this.field3418 = class300_1.readUnsignedShortBigEndian();
      } else if (i_2 == 6) {
         this.field3447 = class300_1.readUnsignedShortBigEndian();
      } else if (i_2 == 7) {
         this.field3406 = class300_1.readUnsignedShortBigEndian();
         if (this.field3406 > 32767) {
            this.field3406 -= 65536;
         }
      } else if (i_2 == 8) {
         this.field3421 = class300_1.readUnsignedShortBigEndian();
         if (this.field3421 > 32767) {
            this.field3421 -= 65536;
         }
      } else if (i_2 == 11) {
         this.field3423 = 1;
      } else if (i_2 == 12) {
         this.field3428 = class300_1.readIntMedEndian();
      } else if (i_2 == 16) {
         this.field3425 = true;
      } else if (i_2 == 23) {
         this.field3456 = class300_1.readUnsignedShortBigEndian();
         this.field3431 = class300_1.readUnsignedByte();
      } else if (i_2 == 24) {
         this.field3437 = class300_1.readUnsignedShortBigEndian();
      } else if (i_2 == 25) {
         this.field3432 = class300_1.readUnsignedShortBigEndian();
         this.field3434 = class300_1.readUnsignedByte();
      } else if (i_2 == 26) {
         this.field3433 = class300_1.readUnsignedShortBigEndian();
      } else if (i_2 >= 30 && i_2 < 35) {
         this.field3426[i_2 - 30] = class300_1.readNullTerminatedString();
         if (this.field3426[i_2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3426[i_2 - 30] = null;
         }
      } else if (i_2 >= 35 && i_2 < 40) {
         this.field3427[i_2 - 35] = class300_1.readNullTerminatedString();
      } else {
         int i_4;
         int i_5;
         if (i_2 == 40) {
            i_4 = class300_1.readUnsignedByte();
            this.field3424 = new short[i_4];
            this.field3414 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field3424[i_5] = (short)class300_1.readUnsignedShortBigEndian();
               this.field3414[i_5] = (short)class300_1.readUnsignedShortBigEndian();
            }
         } else if (i_2 == 41) {
            i_4 = class300_1.readUnsignedByte();
            this.field3415 = new short[i_4];
            this.field3416 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field3415[i_5] = (short)class300_1.readUnsignedShortBigEndian();
               this.field3416[i_5] = (short)class300_1.readUnsignedShortBigEndian();
            }
         } else if (i_2 == 42) {
            this.field3403 = class300_1.readSignedByte();
         } else if (i_2 == 65) {
            this.field3452 = true;
         } else if (i_2 == 78) {
            this.field3435 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 79) {
            this.field3430 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 90) {
            this.field3436 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 91) {
            this.field3417 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 92) {
            this.field3438 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 93) {
            this.field3440 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 95) {
            this.field3420 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 97) {
            this.field3443 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 98) {
            this.field3444 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 >= 100 && i_2 < 110) {
            if (this.field3441 == null) {
               this.field3441 = new int[10];
               this.field3442 = new int[10];
            }

            this.field3441[i_2 - 100] = class300_1.readUnsignedShortBigEndian();
            this.field3442[i_2 - 100] = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 110) {
            this.field3451 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 111) {
            this.field3446 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 112) {
            this.field3404 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 113) {
            this.field3448 = class300_1.readSignedByte();
         } else if (i_2 == 114) {
            this.field3419 = class300_1.readSignedByte();
         } else if (i_2 == 115) {
            this.field3450 = class300_1.readUnsignedByte();
         } else if (i_2 == 139) {
            this.field3453 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 140) {
            this.field3454 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 148) {
            this.field3400 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 149) {
            this.field3439 = class300_1.readUnsignedShortBigEndian();
         } else if (i_2 == 249) {
            this.field3409 = class26.method403(class300_1, this.field3409, -675682767);
         }
      }

   }

   public final class127 method4644(int i_1, int i_2) {
      if (this.field3441 != null && i_1 > 1) {
         int i_3 = -1;

         for (int i_4 = 0; i_4 < 10; i_4++) {
            if (i_1 >= this.field3442[i_4] && this.field3442[i_4] != 0) {
               i_3 = this.field3441[i_4];
            }
         }

         if (i_3 != -1) {
            return class26.method404(i_3).method4644(1, 656500227);
         }
      }

      class127 class127_6 = (class127) field3408.method3320((long)this.field3410);
      if (class127_6 != null) {
         return class127_6;
      } else {
         class121 class121_7 = class121.method2769(field3405, this.field3411, 0);
         if (class121_7 == null) {
            return null;
         } else {
            if (this.field3451 != 128 || this.field3446 != 128 || this.field3404 != 128) {
               class121_7.method2786(this.field3451, this.field3446, this.field3404);
            }

            int i_5;
            if (this.field3424 != null) {
               for (i_5 = 0; i_5 < this.field3424.length; i_5++) {
                  class121_7.method2783(this.field3424[i_5], this.field3414[i_5]);
               }
            }

            if (this.field3415 != null) {
               for (i_5 = 0; i_5 < this.field3415.length; i_5++) {
                  class121_7.method2784(this.field3415[i_5], this.field3416[i_5]);
               }
            }

            class127_6 = class121_7.method2802(this.field3448 + 64, this.field3419 * 5 + 768, -50, -10, -50);
            class127_6.field1730 = true;
            field3408.method3322(class127_6, (long)this.field3410);
            return class127_6;
         }
      }
   }

   public final class121 method4643(int i_1, int i_2) {
      int i_4;
      if (this.field3441 != null && i_1 > 1) {
         int i_3 = -1;

         for (i_4 = 0; i_4 < 10; i_4++) {
            if (i_1 >= this.field3442[i_4] && this.field3442[i_4] != 0) {
               i_3 = this.field3441[i_4];
            }
         }

         if (i_3 != -1) {
            return class26.method404(i_3).method4643(1, 2115855556);
         }
      }

      class121 class121_5 = class121.method2769(field3405, this.field3411, 0);
      if (class121_5 == null) {
         return null;
      } else {
         if (this.field3451 != 128 || this.field3446 != 128 || this.field3404 != 128) {
            class121_5.method2786(this.field3451, this.field3446, this.field3404);
         }

         if (this.field3424 != null) {
            for (i_4 = 0; i_4 < this.field3424.length; i_4++) {
               class121_5.method2783(this.field3424[i_4], this.field3414[i_4]);
            }
         }

         if (this.field3415 != null) {
            for (i_4 = 0; i_4 < this.field3415.length; i_4++) {
               class121_5.method2784(this.field3415[i_4], this.field3416[i_4]);
            }
         }

         return class121_5;
      }
   }

   void method4637(int i_1) {
   }

   public final boolean method4683(boolean bool_1, int i_2) {
      int i_3 = this.field3436;
      int i_4 = this.field3438;
      if (bool_1) {
         i_3 = this.field3417;
         i_4 = this.field3440;
      }

      if (i_3 == -1) {
         return true;
      } else {
         boolean bool_5 = true;
         if (!field3405.method4146(i_3, 0)) {
            bool_5 = false;
         }

         if (i_4 != -1 && !field3405.method4146(i_4, 0)) {
            bool_5 = false;
         }

         return bool_5;
      }
   }

   public final class121 method4649(boolean bool_1, byte b_2) {
      int i_3 = this.field3436;
      int i_4 = this.field3438;
      if (bool_1) {
         i_3 = this.field3417;
         i_4 = this.field3440;
      }

      if (i_3 == -1) {
         return null;
      } else {
         class121 class121_5 = class121.method2769(field3405, i_3, 0);
         if (i_4 != -1) {
            class121 class121_6 = class121.method2769(field3405, i_4, 0);
            class121[] arr_7 = new class121[] {class121_5, class121_6};
            class121_5 = new class121(arr_7, 2);
         }

         int i_8;
         if (this.field3424 != null) {
            for (i_8 = 0; i_8 < this.field3424.length; i_8++) {
               class121_5.method2783(this.field3424[i_8], this.field3414[i_8]);
            }
         }

         if (this.field3415 != null) {
            for (i_8 = 0; i_8 < this.field3415.length; i_8++) {
               class121_5.method2784(this.field3415[i_8], this.field3416[i_8]);
            }
         }

         return class121_5;
      }
   }

   void method4638(ByteBuffer class300_1, byte b_2) {
      while (true) {
         int i_3 = class300_1.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.method4673(class300_1, i_3, 808674402);
      }
   }

   public final boolean method4646(boolean bool_1, byte b_2) {
      int i_3 = this.field3456;
      int i_4 = this.field3437;
      int i_5 = this.field3435;
      if (bool_1) {
         i_3 = this.field3432;
         i_4 = this.field3433;
         i_5 = this.field3430;
      }

      if (i_3 == -1) {
         return true;
      } else {
         boolean bool_6 = true;
         if (!field3405.method4146(i_3, 0)) {
            bool_6 = false;
         }

         if (i_4 != -1 && !field3405.method4146(i_4, 0)) {
            bool_6 = false;
         }

         if (i_5 != -1 && !field3405.method4146(i_5, 0)) {
            bool_6 = false;
         }

         return bool_6;
      }
   }

   public final class121 method4694(boolean bool_1, byte b_2) {
      int i_3 = this.field3456;
      int i_4 = this.field3437;
      int i_5 = this.field3435;
      if (bool_1) {
         i_3 = this.field3432;
         i_4 = this.field3433;
         i_5 = this.field3430;
      }

      if (i_3 == -1) {
         return null;
      } else {
         class121 class121_6 = class121.method2769(field3405, i_3, 0);
         if (i_4 != -1) {
            class121 class121_7 = class121.method2769(field3405, i_4, 0);
            if (i_5 != -1) {
               class121 class121_8 = class121.method2769(field3405, i_5, 0);
               class121[] arr_9 = new class121[] {class121_6, class121_7, class121_8};
               class121_6 = new class121(arr_9, 3);
            } else {
               class121[] arr_11 = new class121[] {class121_6, class121_7};
               class121_6 = new class121(arr_11, 2);
            }
         }

         if (!bool_1 && this.field3431 != 0) {
            class121_6.method2782(0, this.field3431, 0);
         }

         if (bool_1 && this.field3434 != 0) {
            class121_6.method2782(0, this.field3434, 0);
         }

         int i_10;
         if (this.field3424 != null) {
            for (i_10 = 0; i_10 < this.field3424.length; i_10++) {
               class121_6.method2783(this.field3424[i_10], this.field3414[i_10]);
            }
         }

         if (this.field3415 != null) {
            for (i_10 = 0; i_10 < this.field3415.length; i_10++) {
               class121_6.method2784(this.field3415[i_10], this.field3416[i_10]);
            }
         }

         return class121_6;
      }
   }

   void method4666(class254 class254_1, class254 class254_2, int i_3) {
      this.field3411 = class254_1.field3411;
      this.field3422 = class254_1.field3422;
      this.field3418 = class254_1.field3418;
      this.field3447 = class254_1.field3447;
      this.field3420 = class254_1.field3420;
      this.field3406 = class254_1.field3406;
      this.field3421 = class254_1.field3421;
      this.field3424 = class254_1.field3424;
      this.field3414 = class254_1.field3414;
      this.field3415 = class254_1.field3415;
      this.field3416 = class254_1.field3416;
      this.field3449 = class254_2.field3449;
      this.field3425 = class254_2.field3425;
      this.field3428 = class254_2.field3428;
      this.field3423 = 1;
   }

   void method4641(class254 class254_1, class254 class254_2, byte b_3) {
      this.field3411 = class254_1.field3411;
      this.field3422 = class254_1.field3422;
      this.field3418 = class254_1.field3418;
      this.field3447 = class254_1.field3447;
      this.field3420 = class254_1.field3420;
      this.field3406 = class254_1.field3406;
      this.field3421 = class254_1.field3421;
      this.field3424 = class254_2.field3424;
      this.field3414 = class254_2.field3414;
      this.field3415 = class254_2.field3415;
      this.field3416 = class254_2.field3416;
      this.field3449 = class254_2.field3449;
      this.field3425 = class254_2.field3425;
      this.field3423 = class254_2.field3423;
      this.field3456 = class254_2.field3456;
      this.field3437 = class254_2.field3437;
      this.field3435 = class254_2.field3435;
      this.field3432 = class254_2.field3432;
      this.field3433 = class254_2.field3433;
      this.field3430 = class254_2.field3430;
      this.field3436 = class254_2.field3436;
      this.field3438 = class254_2.field3438;
      this.field3417 = class254_2.field3417;
      this.field3440 = class254_2.field3440;
      this.field3450 = class254_2.field3450;
      this.field3426 = class254_2.field3426;
      this.field3427 = new String[5];
      if (class254_2.field3427 != null) {
         for (int i_4 = 0; i_4 < 4; i_4++) {
            this.field3427[i_4] = class254_2.field3427[i_4];
         }
      }

      this.field3427[4] = "Discard";
      this.field3428 = 0;
   }

   void method4689(class254 class254_1, class254 class254_2, byte b_3) {
      this.field3411 = class254_1.field3411;
      this.field3422 = class254_1.field3422;
      this.field3418 = class254_1.field3418;
      this.field3447 = class254_1.field3447;
      this.field3420 = class254_1.field3420;
      this.field3406 = class254_1.field3406;
      this.field3421 = class254_1.field3421;
      this.field3424 = class254_1.field3424;
      this.field3414 = class254_1.field3414;
      this.field3415 = class254_1.field3415;
      this.field3416 = class254_1.field3416;
      this.field3423 = class254_1.field3423;
      this.field3449 = class254_2.field3449;
      this.field3428 = 0;
      this.field3425 = false;
      this.field3452 = false;
   }

   public class254 method4656(int i_1, byte b_2) {
      if (this.field3441 != null && i_1 > 1) {
         int i_3 = -1;

         for (int i_4 = 0; i_4 < 10; i_4++) {
            if (i_1 >= this.field3442[i_4] && this.field3442[i_4] != 0) {
               i_3 = this.field3441[i_4];
            }
         }

         if (i_3 != -1) {
            return class26.method404(i_3);
         }
      }

      return this;
   }

   public int method4652(byte b_1) {
      return this.field3403 != -1 && this.field3427 != null ? (this.field3403 >= 0 ? (this.field3427[this.field3403] != null ? this.field3403 : -1) : ("Drop".equalsIgnoreCase(this.field3427[4]) ? 4 : -1)) : -1;
   }

   public String method4648(int i_1, String string_2, int i_3) {
      return class5.method54(this.field3409, i_1, string_2, (byte) -115);
   }

   public int method4650(int i_1, int i_2, byte b_3) {
      class316 class316_5 = this.field3409;
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

   public static byte method4699(char var_0, short s_1) {
      byte b_2;
      if (var_0 > 0 && var_0 < 128 || var_0 >= 160 && var_0 <= 255) {
         b_2 = (byte)var_0;
      } else if (var_0 == 8364) {
         b_2 = -128;
      } else if (var_0 == 8218) {
         b_2 = -126;
      } else if (var_0 == 402) {
         b_2 = -125;
      } else if (var_0 == 8222) {
         b_2 = -124;
      } else if (var_0 == 8230) {
         b_2 = -123;
      } else if (var_0 == 8224) {
         b_2 = -122;
      } else if (var_0 == 8225) {
         b_2 = -121;
      } else if (var_0 == 710) {
         b_2 = -120;
      } else if (var_0 == 8240) {
         b_2 = -119;
      } else if (var_0 == 352) {
         b_2 = -118;
      } else if (var_0 == 8249) {
         b_2 = -117;
      } else if (var_0 == 338) {
         b_2 = -116;
      } else if (var_0 == 381) {
         b_2 = -114;
      } else if (var_0 == 8216) {
         b_2 = -111;
      } else if (var_0 == 8217) {
         b_2 = -110;
      } else if (var_0 == 8220) {
         b_2 = -109;
      } else if (var_0 == 8221) {
         b_2 = -108;
      } else if (var_0 == 8226) {
         b_2 = -107;
      } else if (var_0 == 8211) {
         b_2 = -106;
      } else if (var_0 == 8212) {
         b_2 = -105;
      } else if (var_0 == 732) {
         b_2 = -104;
      } else if (var_0 == 8482) {
         b_2 = -103;
      } else if (var_0 == 353) {
         b_2 = -102;
      } else if (var_0 == 8250) {
         b_2 = -101;
      } else if (var_0 == 339) {
         b_2 = -100;
      } else if (var_0 == 382) {
         b_2 = -98;
      } else if (var_0 == 376) {
         b_2 = -97;
      } else {
         b_2 = 63;
      }

      return b_2;
   }

}
