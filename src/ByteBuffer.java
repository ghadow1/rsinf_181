import java.math.BigInteger;

/**
 * A custom buffer implementation for reading and writing binary data
 * with support for various byte orders and encoding schemes.
 * Extends class180 (likely a base buffer class).
 *
 * @author jagex, refactored by conditions
 */
public class ByteBuffer extends LinkedListNode {

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
      return length == 0 ? "" : class74.method1820(this.buffer, start, length);
   }

   //..Reads a 32-bit integer in medium-endian byte order (custom order)
   public int readIntMedEndian() {
      this.position += 4;
      return ((this.buffer[this.position - 3] & 0xff) << 16) +
              (this.buffer[this.position - 1] & 0xff) +
              ((this.buffer[this.position - 2] & 0xff) << 8) +
              ((this.buffer[this.position - 4] & 0xff) << 24);
   }

   //..Writes a 32-bit integer in medium-endian byte order (custom order)
   public void write32IntBigEndian(int value) {
      this.buffer[++this.position - 1] = (byte) (value >> 24);
      this.buffer[++this.position - 1] = (byte) (value >> 16);
      this.buffer[++this.position - 1] = (byte) (value >> 8);
      this.buffer[++this.position - 1] = (byte) value;
   }
   //..Writes a single byte
   public void writeByte(int value) {
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
      return length == 0 ? "" : class74.method1820(this.buffer, start, length);
   }

   //..Writes a variable-length integer (VLQ encoding)
   public void writeVarInt(int value) {
      if ((value & ~0x7f) != 0) {
         if ((value & ~0x3fff) != 0) {
            if ((value & ~0x1fffff) != 0) {
               if ((value & ~0xfffffff) != 0) {
                  this.writeByte(value >>> 28 | 0x80);
               }
               this.writeByte(value >>> 21 | 0x80);
            }
            this.writeByte(value >>> 14 | 0x80);
         }
         this.writeByte(value >>> 7 | 0x80);
      }
      this.writeByte(value & 0x7f);
   }

   //..Writes bytes from source array to buffer
   public void writeBytes(byte[] src, int offset, int length) {
      for (int i = offset; i < length + offset; i++) {
         this.buffer[++this.position - 1] = src[i];
      }
   }

   //..Reads a smart short (1-2 bytes, unsigned)
   public int readUnsignedSmartShort() {
      return this.buffer[this.position] < 0 ?
              this.readIntMedEndian() & 0x7fffffff :
              this.readUnsignedShortBigEndian();
   }

   //..TEA (Tiny Encryption Algorithm) decryption
   public void decryptTEA(int[] key, int startOffset, int endOffset) {
      int savedPosition = this.position;
      this.position = startOffset;
      int blockCount = (endOffset - startOffset) / 8;

      for (int i = 0; i < blockCount; i++) {
         int v0 = this.readIntMedEndian();
         int v1 = this.readIntMedEndian();
         int sum = -957401312;
         int delta = -1640531527;

         for (int round = 32; round-- > 0; v0 -= v1 + (v1 << 4 ^ v1 >>> 5) ^ sum + key[sum & 0x3]) {
            v1 -= v0 + (v0 << 4 ^ v0 >>> 5) ^ key[sum >>> 11 & 0x3] + sum;
            sum -= delta;
         }

         this.position -= 8;
         this.writeIntBigEndian(v0);
         this.writeIntBigEndian(v1);
      }

      this.position = savedPosition;
   }

   //..Writes a boolean as a byte (1 or 0)
   public void writeBoolean(boolean value) {
      this.writeNegatedByte(value ? 1 : 0);
   }

   //..Releases the buffer (returns it to a pool, presumably)
   public void release() {
      if (this.buffer != null) {
         MemoryManager.returnBufferToPool(this.buffer);
      }
      this.buffer = null;
   }

   //..Writes a 24-bit integer (3 bytes)
   public void write24BitInt(int value) {
      this.buffer[++this.position - 1] = (byte) (value >> 16);
      this.buffer[++this.position - 1] = (byte) (value >> 8);
      this.buffer[++this.position - 1] = (byte) value;
   }

   //..Reads a nullable null-terminated string (returns null if starts with 0)
   public String readNullableString() {
      if (this.buffer[this.position] == 0) {
         ++this.position;
         return null;
      } else {
         return this.readNullTerminatedString();
      }
   }

   //..Reads a boolean (checks if LSB is 1)
   public boolean readBoolean() {
      return (this.readUnsignedByte() & 0x1) == 1;
   }

   //..Reads a smart signed integer (offset by 64 or 49152)
   public int readSmartSignedInt() {
      int peek = this.buffer[this.position] & 0xff;
      return peek < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShortBigEndian() - 49152;
   }

   //..Writes a string with zero prefix and suffix
   public void writeWrappedString(String str) {
      int nullIndex = str.indexOf(0);
      if (nullIndex >= 0) {
         throw new IllegalArgumentException("String contains null character");
      }
      this.buffer[++this.position - 1] = 0;
      this.position += class19.method237(str, 0, str.length(), this.buffer, this.position, (byte) 1);
      this.buffer[++this.position - 1] = 0;
   }

   //..Writes a size byte at a previous position
   public void writeSizeAtOffset(int offset) {
      if (offset >= 0 && offset <= 255) {
         this.buffer[this.position - offset - 1] = (byte) offset;
      } else {
         throw new IllegalArgumentException("Size out of byte range");
      }
   }

   //..Computes and writes a CRC32 checksum
   public int writeCRC32Checksum(int startOffset) {
      int crc = class2.method18(this.buffer, startOffset, this.position, 2112627434);
      this.writeIntBigEndian(crc);
      return crc;
   }

   //..Reads a signed byte with 128 offset
   public byte readOffsetByte() {
      return (byte) (this.buffer[++this.position - 1] - 128);
   }

   //..Reads an inverted unsigned byte
   public int readInvertedUnsignedByte() {
      return 128 - this.buffer[++this.position - 1] & 0xff;
   }

   //..Writes a 32-bit integer in reversed byte order
   public void writeIntReversed(int value) {
      this.buffer[++this.position - 1] = (byte) (value >> 8);
      this.buffer[++this.position - 1] = (byte) value;
      this.buffer[++this.position - 1] = (byte) (value >> 24);
      this.buffer[++this.position - 1] = (byte) (value >> 16);
   }

   // Additional read/write methods with various transformations
   // (The remaining methods follow similar patterns with byte order variations
   // and offset transformations - names reflect their operations)

   //..Reads a 16-bit short with offset on first byte
   public int readShortWithOffset() {
      this.position += 2;
      return (this.buffer[this.position - 1] - 128 & 0xff) +
              ((this.buffer[this.position - 2] & 0xff) << 8);
   }

   //..Reads a negated unsigned byte
   public int readNegatedUnsignedByte() {
      return 0 - this.buffer[++this.position - 1] & 0xff;
   }

   //..Reads an offset unsigned byte
   public int readOffsetUnsignedByte() {
      return this.buffer[++this.position - 1] - 128 & 0xff;
   }

   //..Reads a 16-bit short in little-endian byte order
   public int readShortLittleEndian() {
      this.position += 2;
      return ((this.buffer[this.position - 1] & 0xff) << 8) +
              (this.buffer[this.position - 2] & 0xff);
   }

   //..Writes a short with first byte offset
   public void writeShortWithOffset(int value) {
      this.buffer[++this.position - 1] = (byte) (value + 128);
      this.buffer[++this.position - 1] = (byte) (value >> 8);
   }

   //..Reads a short with offset on second byte
   public int readShortWithOffset2() {
      this.position += 2;
      return ((this.buffer[this.position - 1] & 0xff) << 8) +
              (this.buffer[this.position - 2] - 128 & 0xff);
   }

   //..Writes a short in little-endian
   public void writeShortLittleEndian(int value) {
      this.buffer[++this.position - 1] = (byte) value;
      this.buffer[++this.position - 1] = (byte) (value >> 8);
   }

   //..Writes an inverted byte
   public void writeInvertedByte(int value) {
      this.buffer[++this.position - 1] = (byte) (128 - value);
   }

   //..Reads a signed short in little-endian
   public int readSignedShortLittleEndian() {
      this.position += 2;
      int value = ((this.buffer[this.position - 1] & 0xff) << 8) +
              (this.buffer[this.position - 2] & 0xff);
      if (value > 32767) {
         value -= 65536;
      }
      return value;
   }

   //..Reads a negated signed byte
   public byte readNegatedByte() {
      return (byte)(0 - this.buffer[++this.position - 1]);
   }

   //..Writes a negated byte
   public void writeNegatedByte(int value) {
      this.buffer[++this.position - 1] = (byte)(0 - value);
   }

   //..Reads a 32-bit integer in custom byte order
   public int readIntCustomOrder() {
      this.position += 4;
      return ((this.buffer[this.position - 1] & 0xff) << 8) +
              ((this.buffer[this.position - 4] & 0xff) << 16) +
              (this.buffer[this.position - 2] & 0xff) +
              ((this.buffer[this.position - 3] & 0xff) << 24);
   }

   //..Writes a short with second byte offset
   public void writeShortWithOffset2(int value) {
      this.buffer[++this.position - 1] = (byte) (value >> 8);
      this.buffer[++this.position - 1] = (byte) (value + 128);
   }

   //..Reads a 32-bit integer in little-endian
   public int readIntLittleEndian() {
      this.position += 4;
      return (this.buffer[this.position - 4] & 0xff) +
              ((this.buffer[this.position - 3] & 0xff) << 8) +
              ((this.buffer[this.position - 2] & 0xff) << 16) +
              ((this.buffer[this.position - 1] & 0xff) << 24);
   }

   //..Reads a 32-bit integer in another custom order
   public int readIntCustomOrder2() {
      this.position += 4;
      return ((this.buffer[this.position - 2] & 0xff) << 24) +
              ((this.buffer[this.position - 4] & 0xff) << 8) +
              (this.buffer[this.position - 3] & 0xff) +
              ((this.buffer[this.position - 1] & 0xff) << 16);
   }

   //..Reads a 24-bit integer in little-endian
   public int read24BitIntLittleEndian() {
      this.position += 3;
      return (this.buffer[this.position - 3] & 0xff) +
              ((this.buffer[this.position - 2] & 0xff) << 8) +
              ((this.buffer[this.position - 1] & 0xff) << 16);
   }

   //..Reads an extended smart integer (accumulates 32767 values)
   public int readExtendedSmartInt() {
      int total = 0;
      int value;

      for (value = this.readSmartInt(); value == 32767; value = this.readSmartInt()) {
         total += 32767;
      }
      total += value;
      return total;
   }

   //..Writes a 32-bit integer in little-endian
   public void writeIntLittleEndian(int value) {
      this.buffer[++this.position - 1] = (byte) value;
      this.buffer[++this.position - 1] = (byte) (value >> 8);
      this.buffer[++this.position - 1] = (byte) (value >> 16);
      this.buffer[++this.position - 1] = (byte) (value >> 24);
   }

   //..Reads a length-prefixed string
   public String readLengthPrefixedString() {
      byte prefix = this.buffer[++this.position - 1];
      if (prefix != 0) {
         throw new IllegalStateException("Expected zero prefix");
      }
      int length = this.readVarInt();
      if (length + this.position > this.buffer.length) {
         throw new IllegalStateException("String length exceeds buffer");
      }
      String result = class73.method1755(this.buffer, this.position, length, 917330802);
      this.position += length;
      return result;
   }

   //..Writes a UTF-8 encoded string with length prefix
   public void writeUTF8String(CharSequence str) {
      int length = str.length();
      int byteCount = 0;

      //..Calculate byte count for UTF-8 encoding
      for (int i = 0; i < length; i++) {
         char c = str.charAt(i);
         if (c <= 127) {
            ++byteCount;
         } else if (c <= 2047) {
            byteCount += 2;
         } else {
            byteCount += 3;
         }
      }

      this.buffer[++this.position - 1] = 0;
      this.writeVarInt(byteCount);
      this.position += class80.method1979(this.buffer, this.position, str);
   }

   //..Writes a short size at offset
   public void writeShortSizeAtOffset(int offset) {
      if (offset >= 0 && offset <= 65535) {
         this.buffer[this.position - offset - 2] = (byte) (offset >> 8);
         this.buffer[this.position - offset - 1] = (byte) offset;
      } else {
         throw new IllegalArgumentException("Size out of short range");
      }
   }

   //..Reads an inverted signed byte
   public byte readInvertedByte() {
      return (byte) (128 - this.buffer[++this.position - 1]);
   }

   //..RSA encryption/decryption using BigInteger
   public void encryptRSA(BigInteger exponent, BigInteger modulus) {
      int length = this.position;
      this.position = 0;
      byte[] data = new byte[length];
      this.readBytes(data, 0, length);

      BigInteger message = new BigInteger(data);
      BigInteger encrypted = message.modPow(exponent, modulus);
      byte[] result = encrypted.toByteArray();

      this.position = 0;
      this.writeShortBigEndian(result.length);
      this.writeBytes(result, 0, result.length);
   }

   //..Writes an offset byte
   public void writeOffsetByte(int value) {
      this.buffer[++this.position - 1] = (byte) (value + 128);
   }

   //..Writes an integer at offset (medium-endian)
   public void writeIntAtOffset(int value) {
      if (value < 0) {
         throw new IllegalArgumentException("Value must be non-negative");
      }
      this.buffer[this.position - value - 4] = (byte) (value >> 24);
      this.buffer[this.position - value - 3] = (byte) (value >> 16);
      this.buffer[this.position - value - 2] = (byte) (value >> 8);
      this.buffer[this.position - value - 1] = (byte) value;
   }

   //..Writes a 32-bit integer in custom order
   public void writeIntCustomOrder(int i_1) {
      this.buffer[++this.position - 1] = (byte) (i_1 >> 16);
      this.buffer[++this.position - 1] = (byte) (i_1 >> 24);
      this.buffer[++this.position - 1] = (byte) i_1;
      this.buffer[++this.position - 1] = (byte) (i_1 >> 8);
   }

   //..Reads a signed short with offset
   public int readSignedShortWithOffset() {
      this.position += 2;
      int value = ((this.buffer[this.position - 1] & 0xff) << 8) +
              (this.buffer[this.position - 2] - 128 & 0xff);
      if (value > 32767) {
         value -= 65536;
      }
      return value;
   }

   //..Reads bytes with offset transformation
   public void readBytesWithOffset(byte[] dest, int offset, int length) {
      for (int i = offset; i < length + offset; i++) {
         dest[i] = (byte) (this.buffer[++this.position - 1] - 128);
      }
   }

   //..Writes a 48-bit long (6 bytes)
   public void write48BitLong(long value) {
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 40));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 32));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 24));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 16));
      this.buffer[++this.position - 1] = (byte) ((int) (value >> 8));
      this.buffer[++this.position - 1] = (byte) ((int) value);
   }

   //..Verifies CRC32 checksum
   public boolean verifyCRC32() {
      this.position -= 4;
      int calculated = class2.method18(this.buffer, 0, this.position, 308040594);
      int stored = this.readIntMedEndian();
      return calculated == stored;
   }

   //..TEA encryption
   public void encryptTEA(int[] key) {
      int blockCount = this.position / 8;
      this.position = 0;

      for (int i = 0; i < blockCount; i++) {
         int v0 = this.readIntMedEndian();
         int v1 = this.readIntMedEndian();
         int sum = 0;
         int delta = -1640531527;

         for (int round = 32; round-- > 0; v1 += v0 + (v0 << 4 ^ v0 >>> 5) ^ key[sum >>> 11 & 0x3] + sum) {
            v0 += v1 + (v1 << 4 ^ v1 >>> 5) ^ sum + key[sum & 0x3];
            sum += delta;
         }

         this.position -= 8;
         this.writeIntBigEndian(v0);
         this.writeIntBigEndian(v1);
      }
   }

   //..Writes a smart short (1-2 bytes)
   public void writeSmartShort(int value) {
      if (value >= 0 && value < 128) {
         this.writeByte(value);
      } else if (value >= 0 && value < 32768) {
         this.writeShortBigEndian(value + 32768);
      } else {
         throw new IllegalArgumentException("Value out of smart short range");
      }
   }

   //..TEA decryption (alternative method signature)
   public void decryptTEA(int[] key) {
      int blockCount = this.position / 8;
      this.position = 0;

      for (int i = 0; i < blockCount; i++) {
         int v0 = this.readIntMedEndian();
         int v1 = this.readIntMedEndian();
         int sum = -957401312;
         int delta = -1640531527;

         for (int round = 32; round-- > 0; v0 -= v1 + (v1 << 4 ^ v1 >>> 5) ^ sum + key[sum & 0x3]) {
            v1 -= v0 + (v0 << 4 ^ v0 >>> 5) ^ key[sum >>> 11 & 0x3] + sum;
            sum -= delta;
         }

         this.position -= 8;
         this.writeIntBigEndian(v0);
         this.writeIntBigEndian(v1);
      }
   }

   //..TEA encryption with range
   public void encryptTEA(int[] key, int startOffset, int endOffset) {
      int savedPosition = this.position;
      this.position = startOffset;
      int blockCount = (endOffset - startOffset) / 8;

      for (int i = 0; i < blockCount; i++) {
         int v0 = this.readIntMedEndian();
         int v1 = this.readIntMedEndian();
         int sum = 0;
         int delta = -1640531527;

         for (int round = 32; round-- > 0; v1 += v0 + (v0 << 4 ^ v0 >>> 5) ^ key[sum >>> 11 & 0x3] + sum) {
            v0 += v1 + (v1 << 4 ^ v1 >>> 5) ^ sum + key[sum & 0x3];
            sum += delta;
         }

         this.position -= 8;
         this.writeIntBigEndian(v0);
         this.writeIntBigEndian(v1);
      }

      this.position = savedPosition;
   }

}
