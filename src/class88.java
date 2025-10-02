import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class88 {

   static MemoryManager field1246;
   static int[] field1248;
   ExecutorService field1249 = Executors.newSingleThreadExecutor();
   Future field1247;

   class88() {
      this.field1247 = this.field1249.submit(new class57());
   }

   boolean method2067(int i_1) {
      return this.field1247.isDone();
   }

   SecureRandom method2057(int i_1) {
      try {
         return (SecureRandom) this.field1247.get();
      } catch (Exception exception_5) {
         SecureRandom securerandom_4 = new SecureRandom();
         securerandom_4.nextInt();
         return securerandom_4;
      }
   }

   void method2064(int i_1) {
      this.field1249.shutdown();
      this.field1249 = null;
   }

   static void method2056(int i_0, class308 class308_1, class235 class235_2, int i_3) {
      byte[] bytes_4 = null;
      class261 class261_5 = class234.field3146;
      synchronized(class234.field3146) {
         for (class231 class231_6 = (class231) class234.field3146.method4892(); class231_6 != null; class231_6 = (class231) class234.field3146.method4894()) {
            if ((long)i_0 == class231_6.hash && class308_1 == class231_6.field3116 && class231_6.field3118 == 0) {
               bytes_4 = class231_6.field3115;
               break;
            }
         }
      }

      if (bytes_4 != null) {
         class235_2.method4264(class308_1, i_0, bytes_4, true);
      } else {
         byte[] bytes_9 = class308_1.method5865(i_0, -8739933);
         class235_2.method4264(class308_1, i_0, bytes_9, true);
      }
   }

   static void method2069(int i_0) {
      class29.field244.method3357();
   }

}
