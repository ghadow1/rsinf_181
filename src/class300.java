import java.math.BigInteger;

public class class300 extends class180 {

   static int[] field3731 = new int[256];
   static long[] field3728;
   public byte[] field3730;
   public int field3732;

   static {
      int i_2;
      for (int i_1 = 0; i_1 < 256; i_1++) {
         int i_0 = i_1;

         for (i_2 = 0; i_2 < 8; i_2++) {
            if ((i_0 & 0x1) == 1) {
               i_0 = i_0 >>> 1 ^ ~0x12477cdf;
            } else {
               i_0 >>>= 1;
            }
         }

         field3731[i_1] = i_0;
      }

      field3728 = new long[256];

      for (i_2 = 0; i_2 < 256; i_2++) {
         long long_4 = (long)i_2;

         for (int i_3 = 0; i_3 < 8; i_3++) {
            if ((long_4 & 0x1L) == 1L) {
               long_4 = long_4 >>> 1 ^ ~0x3693a86a2878f0bdL;
            } else {
               long_4 >>>= 1;
            }
         }

         field3728[i_2] = long_4;
      }

   }

   public class300(int i_1) {
      this.field3730 = class119.method2729(i_1, 506694111);
      this.field3732 = 0;
   }

   public class300(byte[] bytes_1) {
      this.field3730 = bytes_1;
      this.field3732 = 0;
   }

   public long method5531() {
      long long_2 = (long) this.method5499() & 0xffffffffL;
      long long_4 = (long) this.method5499() & 0xffffffffL;
      return long_4 + (long_2 << 32);
   }

   public int method5508() {
      int i_2 = this.field3730[this.field3732] & 0xff;
      return i_2 < 128 ? this.method5504() : this.method5496() - 32768;
   }

   public void method5485(String string_1) {
      int i_3 = string_1.indexOf(0);
      if (i_3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field3732 += class19.method237(string_1, 0, string_1.length(), this.field3730, this.field3732, (byte) 1);
         this.field3730[++this.field3732 - 1] = 0;
      }
   }

   public String method5503() {
      int i_2 = this.field3732;

      while (this.field3730[++this.field3732 - 1] != 0) {
         ;
      }

      int i_3 = this.field3732 - i_2 - 1;
      return i_3 == 0 ? "" : class74.method1820(this.field3730, i_2, i_3, (byte) 5);
   }

   public int method5499() {
      this.field3732 += 4;
      return ((this.field3730[this.field3732 - 3] & 0xff) << 16) + (this.field3730[this.field3732 - 1] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8) + ((this.field3730[this.field3732 - 4] & 0xff) << 24);
   }

   public void method5655(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)i_1;
   }

   public int method5504() {
      return this.field3730[++this.field3732 - 1] & 0xff;
   }

   public void method5483(long long_1) {
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 56));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 48));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 40));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 32));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 24));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 16));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 8));
      this.field3730[++this.field3732 - 1] = (byte)((int)long_1);
   }

   public int method5567() {
      this.field3732 += 3;
      return ((this.field3730[this.field3732 - 3] & 0xff) << 16) + (this.field3730[this.field3732 - 1] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8);
   }

   public int method5511() {
      if (this.field3730[this.field3732] < 0) {
         return this.method5499() & 0x7fffffff;
      } else {
         int i_2 = this.method5496();
         return i_2 == 32767 ? -1 : i_2;
      }
   }

   public int method5657() {
      byte b_2 = this.field3730[++this.field3732 - 1];

      int i_3;
      for (i_3 = 0; b_2 < 0; b_2 = this.field3730[++this.field3732 - 1]) {
         i_3 = (i_3 | b_2 & 0x7f) << 7;
      }

      return i_3 | b_2;
   }

   public byte method5495() {
      return this.field3730[++this.field3732 - 1];
   }

   public void method5481(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 24);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
   }

   public int method5496() {
      this.field3732 += 2;
      return (this.field3730[this.field3732 - 1] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8);
   }

   public void method5697(byte[] bytes_1, int i_2, int i_3) {
      for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++) {
         bytes_1[i_5] = this.field3730[++this.field3732 - 1];
      }

   }

   public void method5479(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
   }

   public int method5606() {
      this.field3732 += 2;
      int i_2 = (this.field3730[this.field3732 - 1] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8);
      if (i_2 > 32767) {
         i_2 -= 65536;
      }

      return i_2;
   }

   public String method5512() {
      byte b_2 = this.field3730[++this.field3732 - 1];
      if (b_2 != 0) {
         throw new IllegalStateException("");
      } else {
         int i_3 = this.field3732;

         while (this.field3730[++this.field3732 - 1] != 0) {
            ;
         }

         int i_4 = this.field3732 - i_3 - 1;
         return i_4 == 0 ? "" : class74.method1820(this.field3730, i_3, i_4, (byte) 52);
      }
   }

   public void method5603(int i_1) {
      if ((i_1 & ~0x7f) != 0) {
         if ((i_1 & ~0x3fff) != 0) {
            if ((i_1 & ~0x1fffff) != 0) {
               if ((i_1 & ~0xfffffff) != 0) {
                  this.method5655(i_1 >>> 28 | 0x80);
               }

               this.method5655(i_1 >>> 21 | 0x80);
            }

            this.method5655(i_1 >>> 14 | 0x80);
         }

         this.method5655(i_1 >>> 7 | 0x80);
      }

      this.method5655(i_1 & 0x7f);
   }

   public void method5488(byte[] bytes_1, int i_2, int i_3) {
      for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++) {
         this.field3730[++this.field3732 - 1] = bytes_1[i_5];
      }

   }

   public int method5685() {
      return this.field3730[this.field3732] < 0 ? this.method5499() & 0x7fffffff : this.method5496();
   }

   public void method5703(int[] ints_1, int i_2, int i_3) {
      int i_5 = this.field3732;
      this.field3732 = i_2;
      int i_6 = (i_3 - i_2) / 8;

      for (int i_7 = 0; i_7 < i_6; i_7++) {
         int i_8 = this.method5499();
         int i_9 = this.method5499();
         int i_10 = -957401312;
         int i_11 = -1640531527;

         for (int i_12 = 32; i_12-- > 0; i_8 -= i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3]) {
            i_9 -= i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ ints_1[i_10 >>> 11 & 0x3] + i_10;
            i_10 -= i_11;
         }

         this.field3732 -= 8;
         this.method5481(i_8);
         this.method5481(i_9);
      }

      this.field3732 = i_5;
   }

   public void method5484(boolean bool_1) {
      this.method5655(bool_1 ? 1 : 0);
   }

   public void method5477() {
      if (this.field3730 != null) {
         class107.method2478(this.field3730, (byte) 103);
      }

      this.field3730 = null;
   }

   public void method5480(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
   }

   public String method5476() {
      if (this.field3730[this.field3732] == 0) {
         ++this.field3732;
         return null;
      } else {
         return this.method5503();
      }
   }

   public boolean method5698() {
      return (this.method5504() & 0x1) == 1;
   }

   public int method5507() {
      int i_2 = this.field3730[this.field3732] & 0xff;
      return i_2 < 128 ? this.method5504() - 64 : this.method5496() - 49152;
   }

   public void method5486(String string_1) {
      int i_3 = string_1.indexOf(0);
      if (i_3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field3730[++this.field3732 - 1] = 0;
         this.field3732 += class19.method237(string_1, 0, string_1.length(), this.field3730, this.field3732, (byte) 1);
         this.field3730[++this.field3732 - 1] = 0;
      }
   }

   public void method5491(int i_1) {
      if (i_1 >= 0 && i_1 <= 255) {
         this.field3730[this.field3732 - i_1 - 1] = (byte)i_1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int method5529(int i_1) {
      int i_3 = class2.method18(this.field3730, i_1, this.field3732, 2112627434);
      this.method5481(i_3);
      return i_3;
   }

   public byte method5694() {
      return (byte)(this.field3730[++this.field3732 - 1] - 128);
   }

   public int method5525() {
      return 128 - this.field3730[++this.field3732 - 1] & 0xff;
   }

   public void method5539(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 24);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
   }

   public int method5518() {
      this.field3732 += 2;
      return (this.field3730[this.field3732 - 1] - 128 & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8);
   }

   public int method5524() {
      return 0 - this.field3730[++this.field3732 - 1] & 0xff;
   }

   public int readByte() {
      return this.field3730[++this.field3732 - 1] - 128 & 0xff;
   }

   public int method5532() {
      this.field3732 += 2;
      return ((this.field3730[this.field3732 - 1] & 0xff) << 8) + (this.field3730[this.field3732 - 2] & 0xff);
   }

   public void method5475(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 + 128);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
   }

   public int readShort() {
      this.field3732 += 2;
      return ((this.field3730[this.field3732 - 1] & 0xff) << 8) + (this.field3730[this.field3732 - 2] - 128 & 0xff);
   }

   public void method5634(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)i_1;
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
   }

   public void method5502(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(128 - i_1);
   }

   public int method5535() {
      this.field3732 += 2;
      int i_2 = ((this.field3730[this.field3732 - 1] & 0xff) << 8) + (this.field3730[this.field3732 - 2] & 0xff);
      if (i_2 > 32767) {
         i_2 -= 65536;
      }

      return i_2;
   }

   public byte method5527() {
      return (byte)(0 - this.field3730[++this.field3732 - 1]);
   }

   public void method5521(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(0 - i_1);
   }

   public int method5543() {
      this.field3732 += 4;
      return ((this.field3730[this.field3732 - 1] & 0xff) << 8) + ((this.field3730[this.field3732 - 4] & 0xff) << 16) + (this.field3730[this.field3732 - 2] & 0xff) + ((this.field3730[this.field3732 - 3] & 0xff) << 24);
   }

   public void method5530(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 + 128);
   }

   public int method5541() {
      this.field3732 += 4;
      return (this.field3730[this.field3732 - 4] & 0xff) + ((this.field3730[this.field3732 - 3] & 0xff) << 8) + ((this.field3730[this.field3732 - 2] & 0xff) << 16) + ((this.field3730[this.field3732 - 1] & 0xff) << 24);
   }

   public int readInt() {
      this.field3732 += 4;
      return ((this.field3730[this.field3732 - 2] & 0xff) << 24) + ((this.field3730[this.field3732 - 4] & 0xff) << 8) + (this.field3730[this.field3732 - 3] & 0xff) + ((this.field3730[this.field3732 - 1] & 0xff) << 16);
   }

   public int method5591() {
      this.field3732 += 3;
      return (this.field3730[this.field3732 - 3] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8) + ((this.field3730[this.field3732 - 1] & 0xff) << 16);
   }

   public int method5509(int i_1) {
      int i_2 = 0;

      int i_3;
      for (i_3 = this.method5508(); i_3 == 32767; i_3 = this.method5508()) {
         i_2 += 32767;
      }

      i_2 += i_3;
      return i_2;
   }

   public void method5538(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)i_1;
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 24);
   }

   public String method5505() {
      byte b_2 = this.field3730[++this.field3732 - 1];
      if (b_2 != 0) {
         throw new IllegalStateException("");
      } else {
         int i_3 = this.method5657();
         if (i_3 + this.field3732 > this.field3730.length) {
            throw new IllegalStateException("");
         } else {
            String string_4 = class73.method1755(this.field3730, this.field3732, i_3, 917330802);
            this.field3732 += i_3;
            return string_4;
         }
      }
   }

   public void method5487(CharSequence charsequence_1) {
      int i_4 = charsequence_1.length();
      int i_5 = 0;

      for (int i_6 = 0; i_6 < i_4; i_6++) {
         char var_7 = charsequence_1.charAt(i_6);
         if (var_7 <= 127) {
            ++i_5;
         } else if (var_7 <= 2047) {
            i_5 += 2;
         } else {
            i_5 += 3;
         }
      }

      this.field3730[++this.field3732 - 1] = 0;
      this.method5603(i_5);
      this.field3732 += class80.method1979(this.field3730, this.field3732, charsequence_1);
   }

   public void method5490(int i_1) {
      if (i_1 >= 0 && i_1 <= 65535) {
         this.field3730[this.field3732 - i_1 - 2] = (byte)(i_1 >> 8);
         this.field3730[this.field3732 - i_1 - 1] = (byte)i_1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public byte method5528() {
      return (byte)(128 - this.field3730[++this.field3732 - 1]);
   }

   public void method5517(BigInteger biginteger_1, BigInteger biginteger_2) {
      int i_4 = this.field3732;
      this.field3732 = 0;
      byte[] bytes_5 = new byte[i_4];
      this.method5697(bytes_5, 0, i_4);
      BigInteger biginteger_6 = new BigInteger(bytes_5);
      BigInteger biginteger_7 = biginteger_6.modPow(biginteger_1, biginteger_2);
      byte[] bytes_8 = biginteger_7.toByteArray();
      this.field3732 = 0;
      this.method5479(bytes_8.length);
      this.method5488(bytes_8, 0, bytes_8.length);
   }

   public void method5520(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 + 128);
   }

   public void method5489(int i_1) {
      if (i_1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.field3730[this.field3732 - i_1 - 4] = (byte)(i_1 >> 24);
         this.field3730[this.field3732 - i_1 - 3] = (byte)(i_1 >> 16);
         this.field3730[this.field3732 - i_1 - 2] = (byte)(i_1 >> 8);
         this.field3730[this.field3732 - i_1 - 1] = (byte)i_1;
      }
   }

   public void method5540(int i_1) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 24);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
   }

   public int method5500() {
      this.field3732 += 2;
      int i_2 = ((this.field3730[this.field3732 - 1] & 0xff) << 8) + (this.field3730[this.field3732 - 2] - 128 & 0xff);
      if (i_2 > 32767) {
         i_2 -= 65536;
      }

      return i_2;
   }

   public void method5544(byte[] bytes_1, int i_2, int i_3, int i_4) {
      for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++) {
         bytes_1[i_5] = (byte)(this.field3730[++this.field3732 - 1] - 128);
      }

   }

   public void method5482(long long_1) {
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 40));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 32));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 24));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 16));
      this.field3730[++this.field3732 - 1] = (byte)((int)(long_1 >> 8));
      this.field3730[++this.field3732 - 1] = (byte)((int)long_1);
   }

   public boolean method5519(int i_1) {
      this.field3732 -= 4;
      int i_2 = class2.method18(this.field3730, 0, this.field3732, 308040594);
      int i_3 = this.method5499();
      return i_2 == i_3;
   }

   public void method5513(int[] ints_1, int i_2) {
      int i_3 = this.field3732 / 8;
      this.field3732 = 0;

      for (int i_4 = 0; i_4 < i_3; i_4++) {
         int i_5 = this.method5499();
         int i_6 = this.method5499();
         int i_7 = 0;
         int i_8 = -1640531527;

         for (int i_9 = 32; i_9-- > 0; i_6 += i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ ints_1[i_7 >>> 11 & 0x3] + i_7) {
            i_5 += i_6 + (i_6 << 4 ^ i_6 >>> 5) ^ i_7 + ints_1[i_7 & 0x3];
            i_7 += i_8;
         }

         this.field3732 -= 8;
         this.method5481(i_5);
         this.method5481(i_6);
      }

   }

   public void method5492(int i_1, byte b_2) {
      if (i_1 >= 0 && i_1 < 128) {
         this.method5655(i_1);
      } else if (i_1 >= 0 && i_1 < 32768) {
         this.method5479(i_1 + 32768);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5514(int[] ints_1, int i_2) {
      int i_3 = this.field3732 / 8;
      this.field3732 = 0;

      for (int i_4 = 0; i_4 < i_3; i_4++) {
         int i_5 = this.method5499();
         int i_6 = this.method5499();
         int i_7 = -957401312;
         int i_8 = -1640531527;

         for (int i_9 = 32; i_9-- > 0; i_5 -= i_6 + (i_6 << 4 ^ i_6 >>> 5) ^ i_7 + ints_1[i_7 & 0x3]) {
            i_6 -= i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ ints_1[i_7 >>> 11 & 0x3] + i_7;
            i_7 -= i_8;
         }

         this.field3732 -= 8;
         this.method5481(i_5);
         this.method5481(i_6);
      }

   }

   public void method5691(int[] ints_1, int i_2, int i_3, int i_4) {
      int i_5 = this.field3732;
      this.field3732 = i_2;
      int i_6 = (i_3 - i_2) / 8;

      for (int i_7 = 0; i_7 < i_6; i_7++) {
         int i_8 = this.method5499();
         int i_9 = this.method5499();
         int i_10 = 0;
         int i_11 = -1640531527;

         for (int i_12 = 32; i_12-- > 0; i_9 += i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ ints_1[i_10 >>> 11 & 0x3] + i_10) {
            i_8 += i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3];
            i_10 += i_11;
         }

         this.field3732 -= 8;
         this.method5481(i_8);
         this.method5481(i_9);
      }

      this.field3732 = i_5;
   }

}
