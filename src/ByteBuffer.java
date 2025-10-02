import java.math.BigInteger;

/**
 * A custom buffer implementation for reading and writing binary data
 * with support for various byte orders and encoding schemes.
 * Extends class180 (likely a base buffer class).
 */
public class ByteBuffer extends class180 {

   //..CRC32 lookup table for checksum calculations
   static int[] crc32Table = new int[256];

   //..CRC64 lookup table for 64-bit checksum calculations
   static long[] crc64Table;

   static {
      //..Initialize CRC32 table
      for (int i = 0; i < 256; i++) {
         int crc = i;
         for (int j = 0; j < 8; j++) {
            if ((crc & 0x1) == 1) {
               crc = crc >>> 1 ^ ~0x12477cdf;
            } else {
               crc >>>= 1;
            }
         }
         crc32Table[i] = crc;
      }

      //..Initialize CRC64 table
      crc64Table = new long[256];
      for (int i = 0; i < 256; i++) {
         long crc = (long) i;
         for (int j = 0; j < 8; j++) {
            if ((crc & 0x1L) == 1L) {
               crc = crc >>> 1 ^ ~0x3693a86a2878f0bdL;
            } else {
               crc >>>= 1;
            }
         }
         crc64Table[i] = crc;
      }
   }

   //..The internal byte array that holds the buffer data
   public byte[] buffer;

   //..Current read/write position in the buffer
   public int position;

   //..Constructor: Creates a buffer with specified capacity
   public ByteBuffer(int capacity) {
      this.buffer = class119.method2729(capacity);
      this.position = 0;
   }

   //..Constructor: Wraps an existing byte array
   public ByteBuffer(byte[] data) {
      this.buffer = data;
      this.position = 0;
   }

   //..Reads a 64-bit long from two medium-endian integers
   public long readLongFromMediumEndian() {
      long high = (long) this.readIntMedEndian() & 0xffffffffL;
      long low = (long) this.readIntMedEndian() & 0xffffffffL;
      return low + (high << 32);
   }

   //..Reads a smart variable-length integer (1-2 bytes)
   public int readSmartInt() {
      int peek = this.buffer[this.position] & 0xff;
      return peek < 128 ? this.readUnsignedByte() : this.readUnsignedShortBigEndian() - 32768;
   }

   //..Writes a null-terminated string
   public void writeNullTerminatedString(String str) {
      int nullIndex = str.indexOf(0);
      if (nullIndex >= 0) {
         throw new IllegalArgumentException("String contains null character");
      }
      this.position += class19.method237(str, 0, str.length(), this.buffer, this.position, (byte) 1);
      this.buffer[++this.position - 1] = 0;
   }

   //..Reads a null-terminated string
   public String readNullTerminatedString() {
      int start = this.position;
      while (this.buffer[++this.position - 1] != 0) {
         // Continue until null terminator
      }
      int length = this.position - start - 1;
      return length == 0 ? "" : class74.method1820(this.buffer, start, length, (byte) 5);
   }

   //..Reads a 32-bit integer in medium-endian byte order (custom order)
   public int readIntMedEndian() {
      this.position += 4;
      return ((this.buffer[this.position - 3] & 0xff) << 16) +
              (this.buffer[this.position - 1] & 0xff) +
              ((this.buffer[this.position - 2] & 0xff) << 8) +
              ((this.buffer[this.position - 4] & 0xff) << 24);
   }

   //..Writes a single byte
   //..TODO - writeByte
   public void writeByte2(int value) {
      this.buffer[++this.position - 1] = (byte) value;
   }

   //..Reads an unsigned byte
   public int readUnsignedByte() {
      return this.buffer[++this.position - 1] & 0xff;
   }

   //..Writes a 64-bit long value in big-endian byte order
   public void writeLongBigEndian(long value) {
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 56));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 48));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 40));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 32));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 24));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 16));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 8));
      this.buffer[++this.position - 1] = (byte) ((int) value);
   }

   //..Reads a 24-bit integer (3 bytes)
   public int read24BitInt() {
      this.position += 3;
      return ((this.buffer[this.position - 3] & 0xff) << 16) +
              (this.buffer[this.position - 1] & 0xff) +
              ((this.buffer[this.position - 2] & 0xff) << 8);
   }

   //..Reads a nullable integer (-1 or 0-32766)
   public int readNullableShort() {
      if (this.buffer[this.position] < 0) {
         return this.readIntMedEndian() & 0x7fffffff;
      } else {
         int value = this.readUnsignedShortBigEndian();
         return value == 32767 ? -1 : value;
      }
   }

   /*
    * Reads a variable-length integer (VLQ/Varint).
    * Uses 7 bits per byte with MSB as continuation flag.
    */
   public int readVarInt() {
      byte b = this.buffer[++this.position - 1];
      int result = 0;

      while (b < 0) {
         result = (result | b & 0x7f) << 7;
         b = this.buffer[++this.position - 1];
      }
      return result | b;
   }

   //..Reads a signed byte
   public byte readSignedByte() {
      return this.buffer[++this.position - 1];
   }

   //..Writes a 32-bit integer in big-endian byte order
   public void writeIntBigEndian(int value) {
      this.buffer[++this.position - 1] = (byte) (value >> 24);
      this.buffer[++this.position - 1] = (byte) (value >> 16);
      this.buffer[++this.position - 1] = (byte) (value >> 8);
      this.buffer[++this.position - 1] = (byte) value;
   }

   //..Reads an unsigned 16-bit short in big-endian byte order
   public int readUnsignedShortBigEndian() {
      this.position += 2;
      return (this.buffer[this.position - 1] & 0xff) +
              ((this.buffer[this.position - 2] & 0xff) << 8);
   }

   /*
    * Bulk read operation - copies bytes from buffer to destination array.
    */
   public void readBytes(byte[] dest, int offset, int length) {
      for (int i = offset; i < length + offset; i++) {
         dest[i] = this.buffer[++this.position - 1];
      }
   }

   //..Writes a 16-bit short in big-endian byte order
   public void writeShortBigEndian(int value) {
      this.buffer[++this.position - 1] = (byte) (value >> 8);
      this.buffer[++this.position - 1] = (byte) value;
   }

   //..Reads a signed 16-bit short in big-endian byte order
   public int readSignedShortBigEndian() {
      this.position += 2;
      int value = (this.buffer[this.position - 1] & 0xff) +
              ((this.buffer[this.position - 2] & 0xff) << 8);
      if (value > 32767) {
         value -= 65536;
      }
      return value;
   }

   //..Reads a string with a leading zero byte and null terminator
   public String readPrefixedNullTerminatedString() {
      byte prefix = this.buffer[++this.position - 1];
      if (prefix != 0) {
         throw new IllegalStateException("Expected zero prefix byte");
      }
      int start = this.position;
      while (this.buffer[++this.position - 1] != 0) {
         // Continue until null terminator
      }
      int length = this.position - start - 1;
      return length == 0 ? "" : class74.method1820(this.buffer, start, length, (byte) 52);
   }

   // Writes a variable-length integer (VLQ encoding)
   public void writeVarInt(int value) {
      if ((value & ~0x7f) != 0) {
         if ((value & ~0x3fff) != 0) {
            if ((value & ~0x1fffff) != 0) {
               if ((value & ~0xfffffff) != 0) {
                  this.writeByte2(value >>> 28 | 0x80);
               }
               this.writeByte2(value >>> 21 | 0x80);
            }
            this.writeByte2(value >>> 14 | 0x80);
         }
         this.writeByte2(value >>> 7 | 0x80);
      }
      this.writeByte2(value & 0x7f);
   }

   public void method5488(byte[] bytes_1, int i_2, int i_3) {
      for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++) {
         this.buffer[++this.position - 1] = bytes_1[i_5];
      }

   }

   public int method5685() {
      return this.buffer[this.position] < 0 ? this.readIntMedEndian() & 0x7fffffff : this.readUnsignedShortBigEndian();
   }

   public void method5703(int[] ints_1, int i_2, int i_3) {
      int i_5 = this.position;
      this.position = i_2;
      int i_6 = (i_3 - i_2) / 8;

      for (int i_7 = 0; i_7 < i_6; i_7++) {
         int i_8 = this.readIntMedEndian();
         int i_9 = this.readIntMedEndian();
         int i_10 = -957401312;
         int i_11 = -1640531527;

         for (int i_12 = 32; i_12-- > 0; i_8 -= i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3]) {
            i_9 -= i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ ints_1[i_10 >>> 11 & 0x3] + i_10;
            i_10 -= i_11;
         }

         this.position -= 8;
         this.writeIntBigEndian(i_8);
         this.writeIntBigEndian(i_9);
      }

      this.position = i_5;
   }

   public void method5484(boolean bool_1) {
      this.writeByte2(bool_1 ? 1 : 0);
   }

   public void method5477() {
      if (this.buffer != null) {
         class107.method2478(this.buffer, (byte) 103);
      }

      this.buffer = null;
   }

   public void method5480(int i_1) {
      this.buffer[++this.position - 1] = (byte) (i_1 >> 16);
      this.buffer[++this.position - 1] = (byte) (i_1 >> 8);
      this.buffer[++this.position - 1] = (byte) i_1;
   }

   public String method5476() {
      if (this.buffer[this.position] == 0) {
         ++this.position;
         return null;
      } else {
         return this.readNullTerminatedString();
      }
   }

   public boolean method5698() {
      return (this.readUnsignedByte() & 0x1) == 1;
   }

   public int method5507() {
      int i_2 = this.buffer[this.position] & 0xff;
      return i_2 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShortBigEndian() - 49152;
   }

   public void method5486(String string_1) {
      int i_3 = string_1.indexOf(0);
      if (i_3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.buffer[++this.position - 1] = 0;
         this.position += class19.method237(string_1, 0, string_1.length(), this.buffer, this.position, (byte) 1);
         this.buffer[++this.position - 1] = 0;
      }
   }

   public void method5491(int i_1) {
      if (i_1 >= 0 && i_1 <= 255) {
         this.buffer[this.position - i_1 - 1] = (byte) i_1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int method5529(int i_1) {
      int i_3 = class2.method18(this.buffer, i_1, this.position, 2112627434);
      this.writeIntBigEndian(i_3);
      return i_3;
   }

   public byte readSByte() {
      return (byte) (this.buffer[++this.position - 1] - 128);
   }

   public int readByteInverse() {
      return 128 - this.buffer[++this.position - 1] & 0xff;
   }

   //..writes a 32-bit integer
   public void write32IntReverse(int i_1) {
      this.buffer[++this.position - 1] = (byte) (i_1 >> 8);
      this.buffer[++this.position - 1] = (byte) i_1;
      this.buffer[++this.position - 1] = (byte) (i_1 >> 24);
      this.buffer[++this.position - 1] = (byte) (i_1 >> 16);
   }

   public int readShortBigEndian() {
      this.position += 2;
      return (this.buffer[this.position - 1] - 128 & 0xff) + ((this.buffer[this.position - 2] & 0xff) << 8);
   }

   public int readByteUNeg() {
      return 0 - this.buffer[++this.position - 1] & 0xff;
   }

   public int readByte() {
      return this.buffer[++this.position - 1] - 128 & 0xff;
   }

   public int readShortLittleEndian() {
      this.position += 2;
      return ((this.buffer[this.position - 1] & 0xff) << 8) + (this.buffer[this.position - 2] & 0xff);
   }

   public void method5475(int i_1) {
      this.buffer[++this.position - 1] = (byte) (i_1 + 128);
      this.buffer[++this.position - 1] = (byte) (i_1 >> 8);
   }

   public int readShort() {
      this.position += 2;
      return ((this.buffer[this.position - 1] & 0xff) << 8) + (this.buffer[this.position - 2] - 128 & 0xff);
   }

   public void method5634(int i_1) {
      this.buffer[++this.position - 1] = (byte) i_1;
      this.buffer[++this.position - 1] = (byte) (i_1 >> 8);
   }

   public void method5502(int i_1) {
      this.buffer[++this.position - 1] = (byte) (128 - i_1);
   }

   public int method5535() {
      this.position += 2;
      int i_2 = ((this.buffer[this.position - 1] & 0xff) << 8) + (this.buffer[this.position - 2] & 0xff);
      if (i_2 > 32767) {
         i_2 -= 65536;
      }

      return i_2;
   }

   public byte method5527() {
      return (byte) (0 - this.buffer[++this.position - 1]);
   }

   public void writeByte(int i_1) {
      this.buffer[++this.position - 1] = (byte) (0 - i_1);
   }

   public int read32IntBigEndian() {
      this.position += 4;
      return ((this.buffer[this.position - 1] & 0xff) << 8) + ((this.buffer[this.position - 4] & 0xff) << 16) + (this.buffer[this.position - 2] & 0xff) + ((this.buffer[this.position - 3] & 0xff) << 24);
   }

   public void method5530(int i_1) {
      this.buffer[++this.position - 1] = (byte) (i_1 >> 8);
      this.buffer[++this.position - 1] = (byte) (i_1 + 128);
   }

   public int method5541() {
      this.position += 4;
      return (this.buffer[this.position - 4] & 0xff) + ((this.buffer[this.position - 3] & 0xff) << 8) + ((this.buffer[this.position - 2] & 0xff) << 16) + ((this.buffer[this.position - 1] & 0xff) << 24);
   }

   public int readInt() {
      this.position += 4;
      return ((this.buffer[this.position - 2] & 0xff) << 24) + ((this.buffer[this.position - 4] & 0xff) << 8) + (this.buffer[this.position - 3] & 0xff) + ((this.buffer[this.position - 1] & 0xff) << 16);
   }

   public int method5591() {
      this.position += 3;
      return (this.buffer[this.position - 3] & 0xff) + ((this.buffer[this.position - 2] & 0xff) << 8) + ((this.buffer[this.position - 1] & 0xff) << 16);
   }

   public int method5509() {
      int i_2 = 0;

      int i_3;
      for (i_3 = this.readSmartInt(); i_3 == 32767; i_3 = this.readSmartInt()) {
         i_2 += 32767;
      }

      i_2 += i_3;
      return i_2;
   }

   public void write32IntLittleEndian(int i_1) {
      this.buffer[++this.position - 1] = (byte) i_1;
      this.buffer[++this.position - 1] = (byte) (i_1 >> 8);
      this.buffer[++this.position - 1] = (byte) (i_1 >> 16);
      this.buffer[++this.position - 1] = (byte) (i_1 >> 24);
   }

   public String method5505() {
      byte b_2 = this.buffer[++this.position - 1];
      if (b_2 != 0) {
         throw new IllegalStateException("");
      } else {
         int i_3 = this.readVarInt();
         if (i_3 + this.position > this.buffer.length) {
            throw new IllegalStateException("");
         } else {
            String string_4 = class73.method1755(this.buffer, this.position, i_3, 917330802);
            this.position += i_3;
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

      this.buffer[++this.position - 1] = 0;
      this.writeVarInt(i_5);
      this.position += class80.method1979(this.buffer, this.position, charsequence_1);
   }

   public void method5490(int i_1) {
      if (i_1 >= 0 && i_1 <= 65535) {
         this.buffer[this.position - i_1 - 2] = (byte) (i_1 >> 8);
         this.buffer[this.position - i_1 - 1] = (byte) i_1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public byte method5528() {
      return (byte) (128 - this.buffer[++this.position - 1]);
   }

   public void method5517(BigInteger biginteger_1, BigInteger biginteger_2) {
      int i_4 = this.position;
      this.position = 0;
      byte[] bytes_5 = new byte[i_4];
      this.readBytes(bytes_5, 0, i_4);
      BigInteger biginteger_6 = new BigInteger(bytes_5);
      BigInteger biginteger_7 = biginteger_6.modPow(biginteger_1, biginteger_2);
      byte[] bytes_8 = biginteger_7.toByteArray();
      this.position = 0;
      this.writeShortBigEndian(bytes_8.length);
      this.method5488(bytes_8, 0, bytes_8.length);
   }

   public void method5520(int i_1) {
      this.buffer[++this.position - 1] = (byte) (i_1 + 128);
   }

   public void writeMiddleEndianInt(int i_1) {
      if (i_1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.buffer[this.position - i_1 - 4] = (byte) (i_1 >> 24);
         this.buffer[this.position - i_1 - 3] = (byte) (i_1 >> 16);
         this.buffer[this.position - i_1 - 2] = (byte) (i_1 >> 8);
         this.buffer[this.position - i_1 - 1] = (byte) i_1;
      }
   }

   public void method5540(int i_1) {
      this.buffer[++this.position - 1] = (byte) (i_1 >> 16);
      this.buffer[++this.position - 1] = (byte) (i_1 >> 24);
      this.buffer[++this.position - 1] = (byte) i_1;
      this.buffer[++this.position - 1] = (byte) (i_1 >> 8);
   }

   public int method5500() {
      this.position += 2;
      int i_2 = ((this.buffer[this.position - 1] & 0xff) << 8) + (this.buffer[this.position - 2] - 128 & 0xff);
      if (i_2 > 32767) {
         i_2 -= 65536;
      }

      return i_2;
   }

   public void method5544(byte[] bytes_1, int i_2, int i_3) {
      for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++) {
         bytes_1[i_5] = (byte) (this.buffer[++this.position - 1] - 128);
      }

   }

   public void method5482(long long_1) {
      this.buffer[++this.position - 1] = (byte) ((int) (long_1 >> 40));
      this.buffer[++this.position - 1] = (byte) ((int) (long_1 >> 32));
      this.buffer[++this.position - 1] = (byte) ((int) (long_1 >> 24));
      this.buffer[++this.position - 1] = (byte) ((int) (long_1 >> 16));
      this.buffer[++this.position - 1] = (byte) ((int) (long_1 >> 8));
      this.buffer[++this.position - 1] = (byte) ((int) long_1);
   }

   public boolean method5519() {
      this.position -= 4;
      int i_2 = class2.method18(this.buffer, 0, this.position, 308040594);
      int i_3 = this.readIntMedEndian();
      return i_2 == i_3;
   }

   public void method5513(int[] ints_1) {
      int i_3 = this.position / 8;
      this.position = 0;

      for (int i_4 = 0; i_4 < i_3; i_4++) {
         int i_5 = this.readIntMedEndian();
         int i_6 = this.readIntMedEndian();
         int i_7 = 0;
         int i_8 = -1640531527;

         for (int i_9 = 32; i_9-- > 0; i_6 += i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ ints_1[i_7 >>> 11 & 0x3] + i_7) {
            i_5 += i_6 + (i_6 << 4 ^ i_6 >>> 5) ^ i_7 + ints_1[i_7 & 0x3];
            i_7 += i_8;
         }

         this.position -= 8;
         this.writeIntBigEndian(i_5);
         this.writeIntBigEndian(i_6);
      }

   }

   public void method5492(int i_1, byte b_2) {
      if (i_1 >= 0 && i_1 < 128) {
         this.writeByte2(i_1);
      } else if (i_1 >= 0 && i_1 < 32768) {
         this.writeShortBigEndian(i_1 + 32768);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5514(int[] ints_1, int i_2) {
      int i_3 = this.position / 8;
      this.position = 0;

      for (int i_4 = 0; i_4 < i_3; i_4++) {
         int i_5 = this.readIntMedEndian();
         int i_6 = this.readIntMedEndian();
         int i_7 = -957401312;
         int i_8 = -1640531527;

         for (int i_9 = 32; i_9-- > 0; i_5 -= i_6 + (i_6 << 4 ^ i_6 >>> 5) ^ i_7 + ints_1[i_7 & 0x3]) {
            i_6 -= i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ ints_1[i_7 >>> 11 & 0x3] + i_7;
            i_7 -= i_8;
         }

         this.position -= 8;
         this.writeIntBigEndian(i_5);
         this.writeIntBigEndian(i_6);
      }

   }

   public void method5691(int[] ints_1, int i_2, int i_3) {
      int i_5 = this.position;
      this.position = i_2;
      int i_6 = (i_3 - i_2) / 8;

      for (int i_7 = 0; i_7 < i_6; i_7++) {
         int i_8 = this.readIntMedEndian();
         int i_9 = this.readIntMedEndian();
         int i_10 = 0;
         int i_11 = -1640531527;

         for (int i_12 = 32; i_12-- > 0; i_9 += i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ ints_1[i_10 >>> 11 & 0x3] + i_10) {
            i_8 += i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3];
            i_10 += i_11;
         }

         this.position -= 8;
         this.writeIntBigEndian(i_8);
         this.writeIntBigEndian(i_9);
      }

      this.position = i_5;
   }

}
