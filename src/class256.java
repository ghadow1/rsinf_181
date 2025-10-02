public class class256 extends class175 {

   static class233 field3464;
   static class233 field3484;
   static class324 field3490;
   static class235 field3500;
   public int field3467;
   static class145 field3465 = new class145(64);
   static class145 field3466 = new class145(50);
   public String field3468 = "null";
   public int field3469 = 1;
   public int field3472 = -1;
   public int field3482 = -1;
   public int field3474 = -1;
   public int field3475 = -1;
   public int field3499 = -1;
   public int field3485 = -1;
   public int field3501 = -1;
   public String[] field3483 = new String[5];
   public boolean field3493 = true;
   public int field3478 = -1;
   int field3486 = 128;
   int field3488 = 128;
   public boolean field3473 = false;
   int field3489 = 0;
   int field3477 = 0;
   public int field3491 = -1;
   public int field3492 = 32;
   int field3494 = -1;
   int field3495 = -1;
   public boolean field3496 = true;
   public boolean field3497 = true;
   public boolean field3498 = false;
   int[] field3470;
   short[] field3479;
   short[] field3480;
   short[] field3471;
   short[] field3481;
   int[] field3463;
   public int[] field3476;
   class316 field3487;

   public final class256 method4709(int i_1) {
      int i_2 = -1;
      if (this.field3494 != -1) {
         i_2 = class67.method1237(this.field3494, -836499887);
      } else if (this.field3495 != -1) {
         i_2 = class212.field2525[this.field3495];
      }

      int i_3;
      if (i_2 >= 0 && i_2 < this.field3476.length - 1) {
         i_3 = this.field3476[i_2];
      } else {
         i_3 = this.field3476[this.field3476.length - 1];
      }

      return i_3 != -1 ? class53.method1005(i_3, (byte) -74) : null;
   }

   void method4713(class300 class300_1, int i_2, byte b_3) {
      int i_4;
      int i_5;
      if (i_2 == 1) {
         i_4 = class300_1.readUByte();
         this.field3470 = new int[i_4];

         for (i_5 = 0; i_5 < i_4; i_5++) {
            this.field3470[i_5] = class300_1.readShortUBigEndian();
         }
      } else if (i_2 == 2) {
         this.field3468 = class300_1.readNullTermString();
      } else if (i_2 == 12) {
         this.field3469 = class300_1.readUByte();
      } else if (i_2 == 13) {
         this.field3472 = class300_1.readShortUBigEndian();
      } else if (i_2 == 14) {
         this.field3475 = class300_1.readShortUBigEndian();
      } else if (i_2 == 15) {
         this.field3482 = class300_1.readShortUBigEndian();
      } else if (i_2 == 16) {
         this.field3474 = class300_1.readShortUBigEndian();
      } else if (i_2 == 17) {
         this.field3475 = class300_1.readShortUBigEndian();
         this.field3499 = class300_1.readShortUBigEndian();
         this.field3485 = class300_1.readShortUBigEndian();
         this.field3501 = class300_1.readShortUBigEndian();
      } else if (i_2 >= 30 && i_2 < 35) {
         this.field3483[i_2 - 30] = class300_1.readNullTermString();
         if (this.field3483[i_2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3483[i_2 - 30] = null;
         }
      } else if (i_2 == 40) {
         i_4 = class300_1.readUByte();
         this.field3479 = new short[i_4];
         this.field3480 = new short[i_4];

         for (i_5 = 0; i_5 < i_4; i_5++) {
            this.field3479[i_5] = (short)class300_1.readShortUBigEndian();
            this.field3480[i_5] = (short)class300_1.readShortUBigEndian();
         }
      } else if (i_2 == 41) {
         i_4 = class300_1.readUByte();
         this.field3471 = new short[i_4];
         this.field3481 = new short[i_4];

         for (i_5 = 0; i_5 < i_4; i_5++) {
            this.field3471[i_5] = (short)class300_1.readShortUBigEndian();
            this.field3481[i_5] = (short)class300_1.readShortUBigEndian();
         }
      } else if (i_2 == 60) {
         i_4 = class300_1.readUByte();
         this.field3463 = new int[i_4];

         for (i_5 = 0; i_5 < i_4; i_5++) {
            this.field3463[i_5] = class300_1.readShortUBigEndian();
         }
      } else if (i_2 == 93) {
         this.field3493 = false;
      } else if (i_2 == 95) {
         this.field3478 = class300_1.readShortUBigEndian();
      } else if (i_2 == 97) {
         this.field3486 = class300_1.readShortUBigEndian();
      } else if (i_2 == 98) {
         this.field3488 = class300_1.readShortUBigEndian();
      } else if (i_2 == 99) {
         this.field3473 = true;
      } else if (i_2 == 100) {
         this.field3489 = class300_1.readByte2();
      } else if (i_2 == 101) {
         this.field3477 = class300_1.readByte2() * 5;
      } else if (i_2 == 102) {
         this.field3491 = class300_1.readShortUBigEndian();
      } else if (i_2 == 103) {
         this.field3492 = class300_1.readShortUBigEndian();
      } else if (i_2 != 106 && i_2 != 118) {
         if (i_2 == 107) {
            this.field3496 = false;
         } else if (i_2 == 109) {
            this.field3497 = false;
         } else if (i_2 == 111) {
            this.field3498 = true;
         } else if (i_2 == 249) {
            this.field3487 = class26.method403(class300_1, this.field3487, 1431656909);
         }
      } else {
         this.field3494 = class300_1.readShortUBigEndian();
         if (this.field3494 == 65535) {
            this.field3494 = -1;
         }

         this.field3495 = class300_1.readShortUBigEndian();
         if (this.field3495 == 65535) {
            this.field3495 = -1;
         }

         i_4 = -1;
         if (i_2 == 118) {
            i_4 = class300_1.readShortUBigEndian();
            if (i_4 == 65535) {
               i_4 = -1;
            }
         }

         i_5 = class300_1.readUByte();
         this.field3476 = new int[i_5 + 2];

         for (int i_6 = 0; i_6 <= i_5; i_6++) {
            this.field3476[i_6] = class300_1.readShortUBigEndian();
            if (this.field3476[i_6] == 65535) {
               this.field3476[i_6] = -1;
            }
         }

         this.field3476[i_5 + 1] = i_4;
      }

   }

   public final class121 method4708(byte b_1) {
      if (this.field3476 != null) {
         class256 class256_2 = this.method4709(942859640);
         return class256_2 == null ? null : class256_2.method4708((byte) 103);
      } else if (this.field3463 == null) {
         return null;
      } else {
         boolean bool_6 = false;

         for (int i_3 = 0; i_3 < this.field3463.length; i_3++) {
            if (!field3464.method4146(this.field3463[i_3], 0)) {
               bool_6 = true;
            }
         }

         if (bool_6) {
            return null;
         } else {
            class121[] arr_7 = new class121[this.field3463.length];

            for (int i_4 = 0; i_4 < this.field3463.length; i_4++) {
               arr_7[i_4] = class121.method2769(field3464, this.field3463[i_4], 0);
            }

            class121 class121_8;
            if (arr_7.length == 1) {
               class121_8 = arr_7[0];
            } else {
               class121_8 = new class121(arr_7, arr_7.length);
            }

            int i_5;
            if (this.field3479 != null) {
               for (i_5 = 0; i_5 < this.field3479.length; i_5++) {
                  class121_8.method2783(this.field3479[i_5], this.field3480[i_5]);
               }
            }

            if (this.field3471 != null) {
               for (i_5 = 0; i_5 < this.field3471.length; i_5++) {
                  class121_8.method2784(this.field3471[i_5], this.field3481[i_5]);
               }
            }

            return class121_8;
         }
      }
   }

   public final class127 method4707(class258 class258_1, int i_2, class258 class258_3, int i_4, byte b_5) {
      if (this.field3476 != null) {
         class256 class256_13 = this.method4709(942859640);
         return class256_13 == null ? null : class256_13.method4707(class258_1, i_2, class258_3, i_4, (byte) 23);
      } else {
         class127 class127_6 = (class127) field3466.method3320((long)this.field3467);
         if (class127_6 == null) {
            boolean bool_7 = false;

            for (int i_8 = 0; i_8 < this.field3470.length; i_8++) {
               if (!field3464.method4146(this.field3470[i_8], 0)) {
                  bool_7 = true;
               }
            }

            if (bool_7) {
               return null;
            }

            class121[] arr_9 = new class121[this.field3470.length];

            int i_10;
            for (i_10 = 0; i_10 < this.field3470.length; i_10++) {
               arr_9[i_10] = class121.method2769(field3464, this.field3470[i_10], 0);
            }

            class121 class121_12;
            if (arr_9.length == 1) {
               class121_12 = arr_9[0];
            } else {
               class121_12 = new class121(arr_9, arr_9.length);
            }

            if (this.field3479 != null) {
               for (i_10 = 0; i_10 < this.field3479.length; i_10++) {
                  class121_12.method2783(this.field3479[i_10], this.field3480[i_10]);
               }
            }

            if (this.field3471 != null) {
               for (i_10 = 0; i_10 < this.field3471.length; i_10++) {
                  class121_12.method2784(this.field3471[i_10], this.field3481[i_10]);
               }
            }

            class127_6 = class121_12.method2802(this.field3489 + 64, this.field3477 + 850, -30, -50, -30);
            field3466.method3322(class127_6, (long)this.field3467);
         }

         class127 class127_11;
         if (class258_1 != null && class258_3 != null) {
            class127_11 = class258_1.method4765(class127_6, i_2, class258_3, i_4, 743277610);
         } else if (class258_1 != null) {
            class127_11 = class258_1.method4784(class127_6, i_2, 2082674209);
         } else if (class258_3 != null) {
            class127_11 = class258_3.method4784(class127_6, i_4, 1828784709);
         } else {
            class127_11 = class127_6.method2859(true);
         }

         if (this.field3486 != 128 || this.field3488 != 128) {
            class127_11.method2944(this.field3486, this.field3488, this.field3486);
         }

         return class127_11;
      }
   }

   void method4704(int i_1) {
   }

   void method4703(class300 class300_1, int i_2) {
      while (true) {
         int i_3 = class300_1.readUByte();
         if (i_3 == 0) {
            return;
         }

         this.method4713(class300_1, i_3, (byte) -24);
      }
   }

   public boolean method4710(byte b_1) {
      if (this.field3476 == null) {
         return true;
      } else {
         int i_2 = -1;
         if (this.field3494 != -1) {
            i_2 = class67.method1237(this.field3494, -836499887);
         } else if (this.field3495 != -1) {
            i_2 = class212.field2525[this.field3495];
         }

         return i_2 >= 0 && i_2 < this.field3476.length ? this.field3476[i_2] != -1 : this.field3476[this.field3476.length - 1] != -1;
      }
   }

   public int method4711(int i_1, int i_2, int i_3) {
      class316 class316_5 = this.field3487;
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

   public String method4740(int i_1, String string_2, int i_3) {
      return class5.method54(this.field3487, i_1, string_2, (byte) -9);
   }

}
