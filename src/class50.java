import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class50 extends class105 {

   SourceDataLine field429;
   int field430;
   AudioFormat field432;
   byte[] field431;

   protected void vmethod2418(int i_1) {
      this.field429.flush();
   }

   protected void vmethod2438(byte b_1) {
      if (this.field429 != null) {
         this.field429.close();
         this.field429 = null;
      }

   }

   protected int vmethod2415(byte b_1) {
      return this.field430 - (this.field429.available() >> (class169.field2053 ? 2 : 1));
   }

   protected void vmethod2414(int i_1, byte b_2) throws LineUnavailableException {
      try {
         Info dataline$info_3 = new Info(SourceDataLine.class, this.field432, i_1 << (class169.field2053 ? 2 : 1));
         this.field429 = (SourceDataLine) AudioSystem.getLine(dataline$info_3);
         this.field429.open();
         this.field429.start();
         this.field430 = i_1;
      } catch (LineUnavailableException lineunavailableexception_8) {
         int i_5 = (i_1 >>> 1 & 0x55555555) + (i_1 & 0x55555555);
         i_5 = (i_5 >>> 2 & 0x33333333) + (i_5 & 0x33333333);
         i_5 = (i_5 >>> 4) + i_5 & 0xf0f0f0f;
         i_5 += i_5 >>> 8;
         i_5 += i_5 >>> 16;
         int i_4 = i_5 & 0xff;
         if (i_4 != 1) {
            int i_7 = i_1 - 1;
            i_7 |= i_7 >>> 1;
            i_7 |= i_7 >>> 2;
            i_7 |= i_7 >>> 4;
            i_7 |= i_7 >>> 8;
            i_7 |= i_7 >>> 16;
            int i_6 = i_7 + 1;
            this.vmethod2414(i_6, (byte) 103);
         } else {
            this.field429 = null;
            throw lineunavailableexception_8;
         }
      }
   }

   protected void vmethod2404() {
      int i_1 = 256;
      if (class169.field2053) {
         i_1 <<= 1;
      }

      for (int i_2 = 0; i_2 < i_1; i_2++) {
         int i_3 = super.field1415[i_2];
         if ((i_3 + 8388608 & ~0xffffff) != 0) {
            i_3 = 0x7fffff ^ i_3 >> 31;
         }

         this.field431[i_2 * 2] = (byte)(i_3 >> 8);
         this.field431[i_2 * 2 + 1] = (byte)(i_3 >> 16);
      }

      this.field429.write(this.field431, 0, i_1 << 1);
   }

   protected void vmethod2413(int i_1) {
      this.field432 = new AudioFormat((float)class172.field2078, 16, class169.field2053 ? 2 : 1, true, false);
      this.field431 = new byte[256 << (class169.field2053 ? 2 : 1)];
   }

}
