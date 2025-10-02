import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class343 {

   RandomAccessFile field4082;
   final long field4083;
   long field4081;

   public class343(File file_1, String string_2, long long_3) throws IOException {
      if (long_3 == -1L) {
         long_3 = Long.MAX_VALUE;
      }

      if (file_1.length() > long_3) {
         file_1.delete();
      }

      this.field4082 = new RandomAccessFile(file_1, string_2);
      this.field4083 = long_3;
      this.field4081 = 0L;
      int i_5 = this.field4082.read();
      if (i_5 != -1 && !string_2.equals("r")) {
         this.field4082.seek(0L);
         this.field4082.write(i_5);
      }

      this.field4082.seek(0L);
   }

   public final void method6555(boolean bool_1, int i_2) throws IOException {
      if (this.field4082 != null) {
         if (bool_1) {
            try {
               this.field4082.getFD().sync();
            } catch (SyncFailedException syncfailedexception_4) {
               ;
            }
         }

         this.field4082.close();
         this.field4082 = null;
      }

   }

   public final long method6552(int i_1) throws IOException {
      return this.field4082.length();
   }

   public final void method6550(int i_1) throws IOException {
      this.method6555(false, 978888846);
   }

   public final int method6554(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
      int i_5 = this.field4082.read(bytes_1, i_2, i_3);
      if (i_5 > 0) {
         this.field4081 += (long)i_5;
      }

      return i_5;
   }

   final void method6551(long long_1) throws IOException {
      this.field4082.seek(long_1);
      this.field4081 = long_1;
   }

   public final void method6561(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
      if ((long)i_3 + this.field4081 > this.field4083) {
         this.field4082.seek(this.field4083);
         this.field4082.write(1);
         throw new EOFException();
      } else {
         this.field4082.write(bytes_1, i_2, i_3);
         this.field4081 += (long)i_3;
      }
   }

   protected void finalize() throws Throwable {
      if (this.field4082 != null) {
         System.out.println("");
         this.method6550(-1602757440);
      }

   }

}
