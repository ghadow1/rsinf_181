import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class166 implements Runnable {

   class165 field2027 = null;
   class165 field2030 = null;
   boolean field2032 = false;
   public static String field2029;
   public static String field2028;
   Thread field2031;

   public class166() {
      field2029 = "Unknown";
      field2028 = "1.6";

      try {
         field2029 = System.getProperty("java.vendor");
         field2028 = System.getProperty("java.version");
      } catch (Exception exception_2) {
         ;
      }

      this.field2032 = false;
      this.field2031 = new Thread(this);
      this.field2031.setPriority(10);
      this.field2031.setDaemon(true);
      this.field2031.start();
   }

   final class165 method3471(int i_1, int i_2, int i_3, Object object_4, byte b_5) {
      class165 class165_6 = new class165();
      class165_6.field2023 = i_1;
      class165_6.field2024 = i_2;
      class165_6.field2018 = object_4;
      synchronized(this) {
         if (this.field2030 != null) {
            this.field2030.field2020 = class165_6;
            this.field2030 = class165_6;
         } else {
            this.field2030 = this.field2027 = class165_6;
         }

         this.notify();
         return class165_6;
      }
   }

   public final class165 method3472(Runnable runnable_1, int i_2, int i_3) {
      return this.method3471(2, i_2, 0, runnable_1, (byte) 115);
   }

   public final void method3469(int i_1) {
      synchronized(this) {
         this.field2032 = true;
         this.notifyAll();
      }

      try {
         this.field2031.join();
      } catch (InterruptedException interruptedexception_4) {
         ;
      }

   }

   public final class165 method3478(String string_1, int i_2, int i_3) {
      return this.method3471(1, i_2, 0, string_1, (byte) 98);
   }

   public final void run() {
      while (true) {
         class165 class165_1;
         synchronized(this) {
            while (true) {
               if (this.field2032) {
                  return;
               }

               if (this.field2027 != null) {
                  class165_1 = this.field2027;
                  this.field2027 = this.field2027.field2020;
                  if (this.field2027 == null) {
                     this.field2030 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException interruptedexception_8) {
                  ;
               }
            }
         }

         try {
            int i_5 = class165_1.field2023;
            if (i_5 == 1) {
               class165_1.field2025 = new Socket(InetAddress.getByName((String) class165_1.field2018), class165_1.field2024);
            } else if (i_5 == 2) {
               Thread thread_3 = new Thread((Runnable) class165_1.field2018);
               thread_3.setDaemon(true);
               thread_3.start();
               thread_3.setPriority(class165_1.field2024);
               class165_1.field2025 = thread_3;
            } else if (i_5 == 4) {
               class165_1.field2025 = new DataInputStream(((URL) class165_1.field2018).openStream());
            }

            class165_1.field2022 = 1;
         } catch (ThreadDeath threaddeath_6) {
            throw threaddeath_6;
         } catch (Throwable throwable_7) {
            class165_1.field2022 = 2;
         }
      }
   }

}
