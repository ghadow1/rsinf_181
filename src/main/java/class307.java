import java.io.IOException;
import java.io.OutputStream;

public class class307 implements Runnable {

   int field3797 = 0;
   int field3793 = 0;
   OutputStream field3794;
   int field3798;
   byte[] field3800;
   Thread field3795;
   boolean field3796;
   IOException field3799;

   class307(OutputStream outputstream_1, int i_2) {
      this.field3794 = outputstream_1;
      this.field3798 = i_2 + 1;
      this.field3800 = new byte[this.field3798];
      this.field3795 = new Thread(this);
      this.field3795.setDaemon(true);
      this.field3795.start();
   }

   void method5857(byte[] bytes_1, int i_2, int i_3, byte b_4) throws IOException {
      if (i_3 >= 0 && i_2 >= 0 && i_3 + i_2 <= bytes_1.length) {
         synchronized(this) {
            if (this.field3799 != null) {
               throw new IOException(this.field3799.toString());
            } else {
               int i_6;
               if (this.field3797 <= this.field3793) {
                  i_6 = this.field3798 - this.field3793 + this.field3797 - 1;
               } else {
                  i_6 = this.field3797 - this.field3793 - 1;
               }

               if (i_6 < i_3) {
                  throw new IOException("");
               } else {
                  if (i_3 + this.field3793 <= this.field3798) {
                     System.arraycopy(bytes_1, i_2, this.field3800, this.field3793, i_3);
                  } else {
                     int i_7 = this.field3798 - this.field3793;
                     System.arraycopy(bytes_1, i_2, this.field3800, this.field3793, i_7);
                     System.arraycopy(bytes_1, i_7 + i_2, this.field3800, 0, i_3 - i_7);
                  }

                  this.field3793 = (i_3 + this.field3793) % this.field3798;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method5853(int i_1) {
      synchronized(this) {
         this.field3796 = true;
         this.notifyAll();
      }

      try {
         this.field3795.join();
      } catch (InterruptedException interruptedexception_4) {
         ;
      }

   }

   boolean method5860(byte b_1) {
      if (this.field3796) {
         try {
            this.field3794.close();
            if (this.field3799 == null) {
               this.field3799 = new IOException("");
            }
         } catch (IOException ioexception_3) {
            if (this.field3799 == null) {
               this.field3799 = new IOException(ioexception_3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int i_1;
         synchronized(this) {
            while (true) {
               if (this.field3799 != null) {
                  return;
               }

               if (this.field3797 <= this.field3793) {
                  i_1 = this.field3793 - this.field3797;
               } else {
                  i_1 = this.field3798 - this.field3797 + this.field3793;
               }

               if (i_1 > 0) {
                  break;
               }

               try {
                  this.field3794.flush();
               } catch (IOException ioexception_11) {
                  this.field3799 = ioexception_11;
                  return;
               }

               if (this.method5860((byte) -3)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException interruptedexception_12) {
                  ;
               }
            }
         }

         try {
            if (i_1 + this.field3797 <= this.field3798) {
               this.field3794.write(this.field3800, this.field3797, i_1);
            } else {
               int i_7 = this.field3798 - this.field3797;
               this.field3794.write(this.field3800, this.field3797, i_7);
               this.field3794.write(this.field3800, 0, i_1 - i_7);
            }
         } catch (IOException ioexception_10) {
            IOException ioexception_2 = ioexception_10;
            synchronized(this) {
               this.field3799 = ioexception_2;
               return;
            }
         }

         synchronized(this) {
            this.field3797 = (i_1 + this.field3797) % this.field3798;
         }
      } while (!this.method5860((byte) -14));

   }

}
