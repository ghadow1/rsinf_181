public class class200 {

   static final byte[] field2468 = new byte[] {(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
   ByteBuffer field2470 = new ByteBuffer((byte[]) null);
   int[] field2461;
   int[] field2462;
   int[] field2465;
   int[] field2464;
   int field2463;
   int field2460;
   long field2472;

   class200(byte[] bytes_1) {
      this.method3877(bytes_1);
   }

   class200() {
   }

   int method3839(int i_1) {
      byte b_2 = this.field2470.buffer[this.field2470.position];
      int i_5;
      if (b_2 < 0) {
         i_5 = b_2 & 0xff;
         this.field2464[i_1] = i_5;
         ++this.field2470.position;
      } else {
         i_5 = this.field2464[i_1];
      }

      if (i_5 != 240 && i_5 != 247) {
         return this.method3840(i_1, i_5);
      } else {
         int i_3 = this.field2470.readVarInt();
         if (i_5 == 247 && i_3 > 0) {
            int i_4 = this.field2470.buffer[this.field2470.position] & 0xff;
            if (i_4 >= 241 && i_4 <= 243 || i_4 == 246 || i_4 == 248 || i_4 >= 250 && i_4 <= 252 || i_4 == 254) {
               ++this.field2470.position;
               this.field2464[i_1] = i_4;
               return this.method3840(i_1, i_4);
            }
         }

         this.field2470.position += i_3;
         return 0;
      }
   }

   void method3831() {
      this.field2470.buffer = null;
      this.field2461 = null;
      this.field2462 = null;
      this.field2465 = null;
      this.field2464 = null;
   }

   boolean method3833() {
      return this.field2470.buffer != null;
   }

   void method3877(byte[] bytes_1) {
      this.field2470.buffer = bytes_1;
      this.field2470.position = 10;
      int i_2 = this.field2470.readUnsignedShort();
      this.field2463 = this.field2470.readUnsignedShort();
      this.field2460 = 500000;
      this.field2461 = new int[i_2];

      int i_3;
      int i_5;
      for (i_3 = 0; i_3 < i_2; this.field2470.position += i_5) {
         int i_4 = this.field2470.readIntMedEndian();
         i_5 = this.field2470.readIntMedEndian();
         if (i_4 == 1297379947) {
            this.field2461[i_3] = this.field2470.position;
            ++i_3;
         }
      }

      this.field2472 = 0L;
      this.field2462 = new int[i_2];

      for (i_3 = 0; i_3 < i_2; i_3++) {
         this.field2462[i_3] = this.field2461[i_3];
      }

      this.field2465 = new int[i_2];
      this.field2464 = new int[i_2];
   }

   int method3842() {
      int i_1 = this.field2462.length;
      int i_2 = -1;
      int i_3 = Integer.MAX_VALUE;

      for (int i_4 = 0; i_4 < i_1; i_4++) {
         if (this.field2462[i_4] >= 0 && this.field2465[i_4] < i_3) {
            i_2 = i_4;
            i_3 = this.field2465[i_4];
         }
      }

      return i_2;
   }

   void method3835(int i_1) {
      this.field2470.position = this.field2462[i_1];
   }

   int method3849() {
      return this.field2462.length;
   }

   int method3869(int i_1) {
      int i_2 = this.method3839(i_1);
      return i_2;
   }

   void method3865(int i_1) {
      int i_2 = this.field2470.readVarInt();
      this.field2465[i_1] += i_2;
   }

   int method3840(int i_1, int i_2) {
      int i_4;
      if (i_2 == 255) {
         int i_7 = this.field2470.readUnsignedByte();
         i_4 = this.field2470.readVarInt();
         if (i_7 == 47) {
            this.field2470.position += i_4;
            return 1;
         } else if (i_7 == 81) {
            int i_5 = this.field2470.read24BitInt();
            i_4 -= 3;
            int i_6 = this.field2465[i_1];
            this.field2472 += (long)i_6 * (long)(this.field2460 - i_5);
            this.field2460 = i_5;
            this.field2470.position += i_4;
            return 2;
         } else {
            this.field2470.position += i_4;
            return 3;
         }
      } else {
         byte b_3 = field2468[i_2 - 128];
         i_4 = i_2;
         if (b_3 >= 1) {
            i_4 = i_2 | this.field2470.readUnsignedByte() << 8;
         }

         if (b_3 >= 2) {
            i_4 |= this.field2470.readUnsignedByte() << 16;
         }

         return i_4;
      }
   }

   void method3847() {
      this.field2470.position = -1;
   }

   void method3836(int i_1) {
      this.field2462[i_1] = this.field2470.position;
   }

   boolean method3856() {
      int i_1 = this.field2462.length;

      for (int i_2 = 0; i_2 < i_1; i_2++) {
         if (this.field2462[i_2] >= 0) {
            return false;
         }
      }

      return true;
   }

   long method3861(int i_1) {
      return this.field2472 + (long)i_1 * (long)this.field2460;
   }

   void method3844(long long_1) {
      this.field2472 = long_1;
      int i_3 = this.field2462.length;

      for (int i_4 = 0; i_4 < i_3; i_4++) {
         this.field2465[i_4] = 0;
         this.field2464[i_4] = 0;
         this.field2470.position = this.field2461[i_4];
         this.method3865(i_4);
         this.field2462[i_4] = this.field2470.position;
      }

   }

}
