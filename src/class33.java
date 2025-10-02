public class class33 implements class37 {

   int field293;
   int field286;
   int field294;
   int field288;
   int field287;
   int field290;

   public boolean vmethod740(int i_1, int i_2, byte b_3) {
      return i_1 >> 6 == this.field287 && i_2 >> 6 == this.field290;
   }

   public boolean vmethod749(int i_1, int i_2, int i_3, int i_4) {
      return i_1 >= this.field293 && i_1 < this.field286 + this.field293 ? i_2 >> 6 == this.field294 && i_3 >> 6 == this.field288 : false;
   }

   public void vmethod738(class26 class26_1, byte b_2) {
      if (class26_1.field217 > this.field287) {
         class26_1.field217 = this.field287;
      }

      if (class26_1.field223 < this.field287) {
         class26_1.field223 = this.field287;
      }

      if (class26_1.field220 > this.field290) {
         class26_1.field220 = this.field290;
      }

      if (class26_1.field222 < this.field290) {
         class26_1.field222 = this.field290;
      }

   }

   public class213 vmethod742(int i_1, int i_2, byte b_3) {
      if (!this.vmethod740(i_1, i_2, (byte) 50)) {
         return null;
      } else {
         int i_4 = this.field294 * 64 - this.field287 * 64 + i_1;
         int i_5 = this.field288 * 64 - this.field290 * 64 + i_2;
         return new class213(this.field293, i_4, i_5);
      }
   }

   public int[] vmethod760(int i_1, int i_2, int i_3, byte b_4) {
      if (!this.vmethod749(i_1, i_2, i_3, -1541634826)) {
         return null;
      } else {
         int[] ints_5 = new int[] {this.field287 * 64 - this.field294 * 64 + i_2, i_3 + (this.field290 * 64 - this.field288 * 64)};
         return ints_5;
      }
   }

   void method571(int i_1) {
   }

   public void vmethod743(ByteBuffer class300_1, int i_2) {
      this.field293 = class300_1.readUnsignedByte();
      this.field286 = class300_1.readUnsignedByte();
      this.field294 = class300_1.readUnsignedShortBigEndian();
      this.field288 = class300_1.readUnsignedShortBigEndian();
      this.field287 = class300_1.readUnsignedShortBigEndian();
      this.field290 = class300_1.readUnsignedShortBigEndian();
      this.method571(-209894164);
   }

   static int method554(CharSequence charsequence_0, int i_1) {
      if (i_1 >= 2 && i_1 <= 36) {
         boolean bool_4 = false;
         boolean bool_5 = false;
         int i_6 = 0;
         int i_7 = charsequence_0.length();

         for (int i_8 = 0; i_8 < i_7; i_8++) {
            char var_9 = charsequence_0.charAt(i_8);
            if (i_8 == 0) {
               if (var_9 == 45) {
                  bool_4 = true;
                  continue;
               }

               if (var_9 == 43) {
                  continue;
               }
            }

            int i_11;
            if (var_9 >= 48 && var_9 <= 57) {
               i_11 = var_9 - 48;
            } else if (var_9 >= 65 && var_9 <= 90) {
               i_11 = var_9 - 55;
            } else {
               if (var_9 < 97 || var_9 > 122) {
                  throw new NumberFormatException();
               }

               i_11 = var_9 - 87;
            }

            if (i_11 >= i_1) {
               throw new NumberFormatException();
            }

            if (bool_4) {
               i_11 = -i_11;
            }

            int i_10 = i_11 + i_6 * i_1;
            if (i_10 / i_1 != i_6) {
               throw new NumberFormatException();
            }

            i_6 = i_10;
            bool_5 = true;
         }

         if (!bool_5) {
            throw new NumberFormatException();
         } else {
            return i_6;
         }
      } else {
         throw new IllegalArgumentException("" + i_1);
      }
   }

   static String method556(int i_0, byte b_1) {
      return "<img=" + i_0 + ">";
   }

}
