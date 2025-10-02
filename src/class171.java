import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class class171 extends class305 implements Runnable {

   boolean field2061 = false;
   int field2065 = 0;
   int field2067 = 0;
   boolean field2059 = false;
   class166 field2062;
   Socket field2060;
   final int field2066;
   final int field2058;
   InputStream field2068;
   OutputStream field2069;
   byte[] field2064;
   class165 field2063;

   public class171(Socket socket_1, class166 class166_2, int i_3) throws IOException {
      this.field2062 = class166_2;
      this.field2060 = socket_1;
      this.field2066 = i_3;
      this.field2058 = i_3 - 100;
      this.field2060.setSoTimeout(30000);
      this.field2060.setTcpNoDelay(true);
      this.field2060.setReceiveBufferSize(65536);
      this.field2060.setSendBufferSize(65536);
      this.field2068 = this.field2060.getInputStream();
      this.field2069 = this.field2060.getOutputStream();
   }

   void method3556(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
      if (!this.field2061) {
         if (this.field2059) {
            this.field2059 = false;
            throw new IOException();
         } else {
            if (this.field2064 == null) {
               this.field2064 = new byte[this.field2066];
            }

            synchronized(this) {
               for (int i_6 = 0; i_6 < i_3; i_6++) {
                  this.field2064[this.field2067] = bytes_1[i_6 + i_2];
                  this.field2067 = (this.field2067 + 1) % this.field2066;
                  if ((this.field2065 + this.field2058) % this.field2066 == this.field2067) {
                     throw new IOException();
                  }
               }

               if (this.field2063 == null) {
                  this.field2063 = this.field2062.method3472(this, 3, -246698410);
               }

               this.notifyAll();
            }
         }
      }
   }

   public void vmethod5830(int i_1) {
      if (!this.field2061) {
         synchronized(this) {
            this.field2061 = true;
            this.notifyAll();
         }

         if (this.field2063 != null) {
            while (this.field2063.field2022 == 0) {
               class251.method4550(1L);
            }

            if (this.field2063.field2022 == 1) {
               try {
                  ((Thread) this.field2063.field2025).join();
               } catch (InterruptedException interruptedexception_4) {
                  ;
               }
            }
         }

         this.field2063 = null;
      }
   }

   public boolean vmethod5847(int i_1, int i_2) throws IOException {
      return this.field2061 ? false : this.field2068.available() >= i_1;
   }

   public int vmethod5828(byte[] bytes_1, int i_2, int i_3, byte b_4) throws IOException {
      if (this.field2061) {
         return 0;
      } else {
         int i_5;
         int i_6;
         for (i_5 = i_3; i_3 > 0; i_3 -= i_6) {
            i_6 = this.field2068.read(bytes_1, i_2, i_3);
            if (i_6 <= 0) {
               throw new EOFException();
            }

            i_2 += i_6;
         }

         return i_5;
      }
   }

   public void vmethod5829(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
      this.method3556(bytes_1, i_2, i_3, -338727961);
   }

   public int vmethod5826(byte b_1) throws IOException {
      return this.field2061 ? 0 : this.field2068.available();
   }

   public int vmethod5825(byte b_1) throws IOException {
      return this.field2061 ? 0 : this.field2068.read();
   }

   protected void finalize() {
      this.vmethod5830(-1144636612);
   }

   public void run() {
      try {
         while (true) {
            label84: {
               int i_1;
               int i_2;
               synchronized(this) {
                  if (this.field2067 == this.field2065) {
                     if (this.field2061) {
                        break label84;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException interruptedexception_10) {
                        ;
                     }
                  }

                  i_2 = this.field2065;
                  if (this.field2067 >= this.field2065) {
                     i_1 = this.field2067 - this.field2065;
                  } else {
                     i_1 = this.field2066 - this.field2065;
                  }
               }

               if (i_1 <= 0) {
                  continue;
               }

               try {
                  this.field2069.write(this.field2064, i_2, i_1);
               } catch (IOException ioexception_9) {
                  this.field2059 = true;
               }

               this.field2065 = (i_1 + this.field2065) % this.field2066;

               try {
                  if (this.field2067 == this.field2065) {
                     this.field2069.flush();
                  }
               } catch (IOException ioexception_8) {
                  this.field2059 = true;
               }
               continue;
            }

            try {
               if (this.field2068 != null) {
                  this.field2068.close();
               }

               if (this.field2069 != null) {
                  this.field2069.close();
               }

               if (this.field2060 != null) {
                  this.field2060.close();
               }
            } catch (IOException ioexception_7) {
               ;
            }

            this.field2064 = null;
            break;
         }
      } catch (Exception exception_12) {
         class252.method4556((String) null, exception_12, (byte) 6);
      }

   }

   public static void method3553(int i_0) {
      class76.field1099.method3712();
      class197.field2402 = 1;
      class11.field76 = null;
   }

   public static class310 method3530(int i_0, int i_1) {
      class310[] arr_2 = class152.method3383(-445895559);

      for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
         class310 class310_4 = arr_2[i_3];
         if (i_0 == class310_4.field3815) {
            return class310_4;
         }
      }

      return null;
   }

   public static void method3554(int i_0, int i_1, int i_2) {
      class248 class248_4 = (class248) class248.field3294.method3320((long)i_0);
      class248 class248_3;
      if (class248_4 != null) {
         class248_3 = class248_4;
      } else {
         byte[] bytes_9 = class248.field3298.method4144(14, i_0);
         class248_4 = new class248();
         if (bytes_9 != null) {
            class248_4.method4485(new ByteBuffer(bytes_9), -1509826882);
         }

         class248.field3294.method3322(class248_4, (long)i_0);
         class248_3 = class248_4;
      }

      int i_5 = class248_3.field3296;
      int i_6 = class248_3.field3297;
      int i_7 = class248_3.field3295;
      int i_8 = class212.field2527[i_7 - i_6];
      if (i_1 < 0 || i_1 > i_8) {
         i_1 = 0;
      }

      i_8 <<= i_6;
      class212.field2525[i_5] = class212.field2525[i_5] & ~i_8 | i_1 << i_6 & i_8;
   }

   public static class239 method3546(int i_0, int i_1) {
      class239 class239_2 = (class239) class239.field3202.method3320((long)i_0);
      if (class239_2 != null) {
         return class239_2;
      } else {
         byte[] bytes_3 = class239.field3200.method4144(5, i_0);
         class239_2 = new class239();
         if (bytes_3 != null) {
            class239_2.method4350(new ByteBuffer(bytes_3), -1922259569);
         }

         class239.field3202.method3322(class239_2, (long)i_0);
         return class239_2;
      }
   }

}
