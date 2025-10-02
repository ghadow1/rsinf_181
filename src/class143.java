import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class class143 implements Runnable {

   Queue field1945 = new LinkedList();
   final Thread field1949 = new Thread(this);
   volatile boolean field1946;

   public class143() {
      this.field1949.setPriority(1);
      this.field1949.start();
   }

   public void method3297(byte b_1) {
      this.field1946 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1949.join();
      } catch (InterruptedException interruptedexception_5) {
         ;
      }

   }

   public class144 method3296(URL url_1, byte b_2) {
      class144 class144_3 = new class144(url_1);
      synchronized(this) {
         this.field1945.add(class144_3);
         this.notify();
         return class144_3;
      }
   }

   public void run() {
      while (!this.field1946) {
         try {
            class144 class144_1;
            synchronized(this) {
               class144_1 = (class144) this.field1945.poll();
               if (class144_1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException interruptedexception_13) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream datainputstream_2 = null;
            URLConnection urlconnection_3 = null;

            try {
               urlconnection_3 = class144_1.field1952.openConnection();
               urlconnection_3.setConnectTimeout(5000);
               urlconnection_3.setReadTimeout(5000);
               urlconnection_3.setUseCaches(false);
               urlconnection_3.setRequestProperty("Connection", "close");
               int i_7 = urlconnection_3.getContentLength();
               if (i_7 >= 0) {
                  byte[] bytes_5 = new byte[i_7];
                  datainputstream_2 = new DataInputStream(urlconnection_3.getInputStream());
                  datainputstream_2.readFully(bytes_5);
                  class144_1.field1951 = bytes_5;
               }

               class144_1.field1957 = true;
            } catch (IOException ioexception_14) {
               class144_1.field1957 = true;
            } finally {
               if (datainputstream_2 != null) {
                  datainputstream_2.close();
               }

               if (urlconnection_3 != null && urlconnection_3 instanceof HttpURLConnection) {
                  ((HttpURLConnection) urlconnection_3).disconnect();
               }

            }
         } catch (Exception exception_17) {
            ErrorHandler.logError((String) null, exception_17, (byte) 35);
         }
      }

   }

   static String method3305(int i_0) {
      String str_1 = "";

      class64 class64_3;
      for (Iterator iterator_2 = class91.field1277.iterator(); iterator_2.hasNext(); str_1 = str_1 + class64_3.field599 + ':' + class64_3.field605 + '\n') {
         class64_3 = (class64) iterator_2.next();
      }

      return str_1;
   }

   static int method3306(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      class217 class217_4;
      if (i_0 == 2700) {
         class217_4 = class80.fetchSomething(class76.field1098[--class70.field1014]);
         class76.field1098[++class70.field1014 - 1] = class217_4.field2690;
         return 1;
      } else if (i_0 == 2701) {
         class217_4 = class80.fetchSomething(class76.field1098[--class70.field1014]);
         if (class217_4.field2690 != -1) {
            class76.field1098[++class70.field1014 - 1] = class217_4.field2655;
         } else {
            class76.field1098[++class70.field1014 - 1] = 0;
         }

         return 1;
      } else if (i_0 == 2702) {
         int i_6 = class76.field1098[--class70.field1014];
         class61 class61_5 = (class61) client.field816.method5952((long)i_6);
         if (class61_5 != null) {
            class76.field1098[++class70.field1014 - 1] = 1;
         } else {
            class76.field1098[++class70.field1014 - 1] = 0;
         }

         return 1;
      } else if (i_0 == 2706) {
         class76.field1098[++class70.field1014 - 1] = client.field905;
         return 1;
      } else {
         return 2;
      }
   }

}
