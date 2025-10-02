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

   public long method5531(byte b_1) {
      long long_2 = (long)this.method5499((byte) -60) & 0xffffffffL;
      long long_4 = (long)this.method5499((byte) 0) & 0xffffffffL;
      return long_4 + (long_2 << 32);
   }

   public int method5508(int i_1) {
      int i_2 = this.field3730[this.field3732] & 0xff;
      return i_2 < 128 ? this.method5504((byte) 56) : this.method5496(-1459053594) - 32768;
   }

   public void method5485(String string_1, int i_2) {
      int i_3 = string_1.indexOf(0);
      if (i_3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field3732 += class19.method237(string_1, 0, string_1.length(), this.field3730, this.field3732, (byte) 1);
         this.field3730[++this.field3732 - 1] = 0;
      }
   }

   public String method5503(int i_1) {
      int i_2 = this.field3732;

      while (this.field3730[++this.field3732 - 1] != 0) {
         ;
      }

      int i_3 = this.field3732 - i_2 - 1;
      return i_3 == 0 ? "" : class74.method1820(this.field3730, i_2, i_3, (byte) 5);
   }

   public int method5499(byte b_1) {
      this.field3732 += 4;
      return ((this.field3730[this.field3732 - 3] & 0xff) << 16) + (this.field3730[this.field3732 - 1] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8) + ((this.field3730[this.field3732 - 4] & 0xff) << 24);
   }

   public void method5655(int i_1, int i_2) {
      this.field3730[++this.field3732 - 1] = (byte)i_1;
   }

   public int method5504(byte b_1) {
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

   public int method5567(int i_1) {
      this.field3732 += 3;
      return ((this.field3730[this.field3732 - 3] & 0xff) << 16) + (this.field3730[this.field3732 - 1] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8);
   }

   public int method5511(byte b_1) {
      if (this.field3730[this.field3732] < 0) {
         return this.method5499((byte) -42) & 0x7fffffff;
      } else {
         int i_2 = this.method5496(-1459053594);
         return i_2 == 32767 ? -1 : i_2;
      }
   }

   public int method5657(byte b_1) {
      byte b_2 = this.field3730[++this.field3732 - 1];

      int i_3;
      for (i_3 = 0; b_2 < 0; b_2 = this.field3730[++this.field3732 - 1]) {
         i_3 = (i_3 | b_2 & 0x7f) << 7;
      }

      return i_3 | b_2;
   }

   public byte method5495(byte b_1) {
      return this.field3730[++this.field3732 - 1];
   }

   public void method5481(int i_1, int i_2) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 24);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
   }

   public int method5496(int i_1) {
      this.field3732 += 2;
      return (this.field3730[this.field3732 - 1] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8);
   }

   public void method5697(byte[] bytes_1, int i_2, int i_3, byte b_4) {
      for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++) {
         bytes_1[i_5] = this.field3730[++this.field3732 - 1];
      }

   }

   public void method5479(int i_1, byte b_2) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
   }

   public int method5606(int i_1) {
      this.field3732 += 2;
      int i_2 = (this.field3730[this.field3732 - 1] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8);
      if (i_2 > 32767) {
         i_2 -= 65536;
      }

      return i_2;
   }

   public String method5512(int i_1) {
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

   public void method5603(int i_1, int i_2) {
      if ((i_1 & ~0x7f) != 0) {
         if ((i_1 & ~0x3fff) != 0) {
            if ((i_1 & ~0x1fffff) != 0) {
               if ((i_1 & ~0xfffffff) != 0) {
                  this.method5655(i_1 >>> 28 | 0x80, 966078212);
               }

               this.method5655(i_1 >>> 21 | 0x80, 1478680118);
            }

            this.method5655(i_1 >>> 14 | 0x80, 1239767628);
         }

         this.method5655(i_1 >>> 7 | 0x80, 1185753232);
      }

      this.method5655(i_1 & 0x7f, 977860252);
   }

   public void method5488(byte[] bytes_1, int i_2, int i_3, int i_4) {
      for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++) {
         this.field3730[++this.field3732 - 1] = bytes_1[i_5];
      }

   }

   public int method5685(byte b_1) {
      return this.field3730[this.field3732] < 0 ? this.method5499((byte) -31) & 0x7fffffff : this.method5496(-1459053594);
   }

   public void method5703(int[] ints_1, int i_2, int i_3, int i_4) {
      int i_5 = this.field3732;
      this.field3732 = i_2;
      int i_6 = (i_3 - i_2) / 8;

      for (int i_7 = 0; i_7 < i_6; i_7++) {
         int i_8 = this.method5499((byte) -8);
         int i_9 = this.method5499((byte) -35);
         int i_10 = -957401312;
         int i_11 = -1640531527;

         for (int i_12 = 32; i_12-- > 0; i_8 -= i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3]) {
            i_9 -= i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ ints_1[i_10 >>> 11 & 0x3] + i_10;
            i_10 -= i_11;
         }

         this.field3732 -= 8;
         this.method5481(i_8, 977299808);
         this.method5481(i_9, 814462228);
      }

      this.field3732 = i_5;
   }

   public void method5484(boolean bool_1, int i_2) {
      this.method5655(bool_1 ? 1 : 0, 1760872049);
   }

   public void method5477(int i_1) {
      if (this.field3730 != null) {
         class107.method2478(this.field3730, (byte) 103);
      }

      this.field3730 = null;
   }

   public void method5480(int i_1, int i_2) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
   }

   public String method5476(int i_1) {
      if (this.field3730[this.field3732] == 0) {
         ++this.field3732;
         return null;
      } else {
         return this.method5503(-231155257);
      }
   }

   public boolean method5698(short s_1) {
      return (this.method5504((byte) 30) & 0x1) == 1;
   }

   public int method5507(int i_1) {
      int i_2 = this.field3730[this.field3732] & 0xff;
      return i_2 < 128 ? this.method5504((byte) 108) - 64 : this.method5496(-1459053594) - 49152;
   }

   public void method5486(String string_1, int i_2) {
      int i_3 = string_1.indexOf(0);
      if (i_3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field3730[++this.field3732 - 1] = 0;
         this.field3732 += class19.method237(string_1, 0, string_1.length(), this.field3730, this.field3732, (byte) 1);
         this.field3730[++this.field3732 - 1] = 0;
      }
   }

   public void method5491(int i_1, int i_2) {
      if (i_1 >= 0 && i_1 <= 255) {
         this.field3730[this.field3732 - i_1 - 1] = (byte)i_1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int method5529(int i_1, int i_2) {
      int i_3 = class2.method18(this.field3730, i_1, this.field3732, 2112627434);
      this.method5481(i_3, 759553697);
      return i_3;
   }

   public byte method5694(int i_1) {
      return (byte)(this.field3730[++this.field3732 - 1] - 128);
   }

   public int method5525(int i_1) {
      return 128 - this.field3730[++this.field3732 - 1] & 0xff;
   }

   public void method5539(int i_1, byte b_2) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 24);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
   }

   public int method5518(byte b_1) {
      this.field3732 += 2;
      return (this.field3730[this.field3732 - 1] - 128 & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8);
   }

   public int method5524(byte b_1) {
      return 0 - this.field3730[++this.field3732 - 1] & 0xff;
   }

   public int method5722(int i_1) {
      return this.field3730[++this.field3732 - 1] - 128 & 0xff;
   }

   public int method5532(byte b_1) {
      this.field3732 += 2;
      return ((this.field3730[this.field3732 - 1] & 0xff) << 8) + (this.field3730[this.field3732 - 2] & 0xff);
   }

   public void method5475(int i_1, int i_2) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 + 128);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
   }

   public int method5534(int i_1) {
      this.field3732 += 2;
      return ((this.field3730[this.field3732 - 1] & 0xff) << 8) + (this.field3730[this.field3732 - 2] - 128 & 0xff);
   }

   public void method5634(int i_1, byte b_2) {
      this.field3730[++this.field3732 - 1] = (byte)i_1;
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
   }

   public void method5502(int i_1, short s_2) {
      this.field3730[++this.field3732 - 1] = (byte)(128 - i_1);
   }

   public int method5535(byte b_1) {
      this.field3732 += 2;
      int i_2 = ((this.field3730[this.field3732 - 1] & 0xff) << 8) + (this.field3730[this.field3732 - 2] & 0xff);
      if (i_2 > 32767) {
         i_2 -= 65536;
      }

      return i_2;
   }

   public byte method5527(int i_1) {
      return (byte)(0 - this.field3730[++this.field3732 - 1]);
   }

   public void method5521(int i_1, int i_2) {
      this.field3730[++this.field3732 - 1] = (byte)(0 - i_1);
   }

   public int method5543(int i_1) {
      this.field3732 += 4;
      return ((this.field3730[this.field3732 - 1] & 0xff) << 8) + ((this.field3730[this.field3732 - 4] & 0xff) << 16) + (this.field3730[this.field3732 - 2] & 0xff) + ((this.field3730[this.field3732 - 3] & 0xff) << 24);
   }

   public void method5530(int i_1, byte b_2) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 + 128);
   }

   public int method5541(int i_1) {
      this.field3732 += 4;
      return (this.field3730[this.field3732 - 4] & 0xff) + ((this.field3730[this.field3732 - 3] & 0xff) << 8) + ((this.field3730[this.field3732 - 2] & 0xff) << 16) + ((this.field3730[this.field3732 - 1] & 0xff) << 24);
   }

   public int method5542(byte b_1) {
      this.field3732 += 4;
      return ((this.field3730[this.field3732 - 2] & 0xff) << 24) + ((this.field3730[this.field3732 - 4] & 0xff) << 8) + (this.field3730[this.field3732 - 3] & 0xff) + ((this.field3730[this.field3732 - 1] & 0xff) << 16);
   }

   public int method5591(int i_1) {
      this.field3732 += 3;
      return (this.field3730[this.field3732 - 3] & 0xff) + ((this.field3730[this.field3732 - 2] & 0xff) << 8) + ((this.field3730[this.field3732 - 1] & 0xff) << 16);
   }

   public int method5509(int i_1) {
      int i_2 = 0;

      int i_3;
      for (i_3 = this.method5508(497319136); i_3 == 32767; i_3 = this.method5508(497319136)) {
         i_2 += 32767;
      }

      i_2 += i_3;
      return i_2;
   }

   public void method5538(int i_1, int i_2) {
      this.field3730[++this.field3732 - 1] = (byte)i_1;
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 24);
   }

   public String method5505(int i_1) {
      byte b_2 = this.field3730[++this.field3732 - 1];
      if (b_2 != 0) {
         throw new IllegalStateException("");
      } else {
         int i_3 = this.method5657((byte) -31);
         if (i_3 + this.field3732 > this.field3730.length) {
            throw new IllegalStateException("");
         } else {
            String string_4 = class73.method1755(this.field3730, this.field3732, i_3, 917330802);
            this.field3732 += i_3;
            return string_4;
         }
      }
   }

   public void method5487(CharSequence charsequence_1, int i_2) {
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
      this.method5603(i_5, -1995040852);
      this.field3732 += class80.method1979(this.field3730, this.field3732, charsequence_1, (byte) 0);
   }

   public void method5490(int i_1, int i_2) {
      if (i_1 >= 0 && i_1 <= 65535) {
         this.field3730[this.field3732 - i_1 - 2] = (byte)(i_1 >> 8);
         this.field3730[this.field3732 - i_1 - 1] = (byte)i_1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public byte method5528(int i_1) {
      return (byte)(128 - this.field3730[++this.field3732 - 1]);
   }

   public void method5517(BigInteger biginteger_1, BigInteger biginteger_2, byte b_3) {
      int i_4 = this.field3732;
      this.field3732 = 0;
      byte[] bytes_5 = new byte[i_4];
      this.method5697(bytes_5, 0, i_4, (byte) 1);
      BigInteger biginteger_6 = new BigInteger(bytes_5);
      BigInteger biginteger_7 = biginteger_6.modPow(biginteger_1, biginteger_2);
      byte[] bytes_8 = biginteger_7.toByteArray();
      this.field3732 = 0;
      this.method5479(bytes_8.length, (byte) 76);
      this.method5488(bytes_8, 0, bytes_8.length, 910134597);
   }

   public void method5520(int i_1, int i_2) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 + 128);
   }

   public void method5489(int i_1, int i_2) {
      if (i_1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.field3730[this.field3732 - i_1 - 4] = (byte)(i_1 >> 24);
         this.field3730[this.field3732 - i_1 - 3] = (byte)(i_1 >> 16);
         this.field3730[this.field3732 - i_1 - 2] = (byte)(i_1 >> 8);
         this.field3730[this.field3732 - i_1 - 1] = (byte)i_1;
      }
   }

   public void method5540(int i_1, int i_2) {
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 16);
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 24);
      this.field3730[++this.field3732 - 1] = (byte)i_1;
      this.field3730[++this.field3732 - 1] = (byte)(i_1 >> 8);
   }

   public int method5500(int i_1) {
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
      int i_3 = this.method5499((byte) -104);
      return i_2 == i_3;
   }

   public void method5513(int[] ints_1, int i_2) {
      int i_3 = this.field3732 / 8;
      this.field3732 = 0;

      for (int i_4 = 0; i_4 < i_3; i_4++) {
         int i_5 = this.method5499((byte) -85);
         int i_6 = this.method5499((byte) -60);
         int i_7 = 0;
         int i_8 = -1640531527;

         for (int i_9 = 32; i_9-- > 0; i_6 += i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ ints_1[i_7 >>> 11 & 0x3] + i_7) {
            i_5 += i_6 + (i_6 << 4 ^ i_6 >>> 5) ^ i_7 + ints_1[i_7 & 0x3];
            i_7 += i_8;
         }

         this.field3732 -= 8;
         this.method5481(i_5, -1132565145);
         this.method5481(i_6, 860174959);
      }

   }

   public void method5492(int i_1, byte b_2) {
      if (i_1 >= 0 && i_1 < 128) {
         this.method5655(i_1, 856036882);
      } else if (i_1 >= 0 && i_1 < 32768) {
         this.method5479(i_1 + 32768, (byte) 50);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5514(int[] ints_1, int i_2) {
      int i_3 = this.field3732 / 8;
      this.field3732 = 0;

      for (int i_4 = 0; i_4 < i_3; i_4++) {
         int i_5 = this.method5499((byte) -65);
         int i_6 = this.method5499((byte) 0);
         int i_7 = -957401312;
         int i_8 = -1640531527;

         for (int i_9 = 32; i_9-- > 0; i_5 -= i_6 + (i_6 << 4 ^ i_6 >>> 5) ^ i_7 + ints_1[i_7 & 0x3]) {
            i_6 -= i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ ints_1[i_7 >>> 11 & 0x3] + i_7;
            i_7 -= i_8;
         }

         this.field3732 -= 8;
         this.method5481(i_5, -1878750879);
         this.method5481(i_6, 1404778061);
      }

   }

   public void method5691(int[] ints_1, int i_2, int i_3, int i_4) {
      int i_5 = this.field3732;
      this.field3732 = i_2;
      int i_6 = (i_3 - i_2) / 8;

      for (int i_7 = 0; i_7 < i_6; i_7++) {
         int i_8 = this.method5499((byte) -27);
         int i_9 = this.method5499((byte) -7);
         int i_10 = 0;
         int i_11 = -1640531527;

         for (int i_12 = 32; i_12-- > 0; i_9 += i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ ints_1[i_10 >>> 11 & 0x3] + i_10) {
            i_8 += i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3];
            i_10 += i_11;
         }

         this.field3732 -= 8;
         this.method5481(i_8, 513043040);
         this.method5481(i_9, -9955971);
      }

      this.field3732 = i_5;
   }

}
