import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class class234 implements Runnable {

   static Thread field3148;
   public static class261 field3146 = new class261();
   public static class261 field3145 = new class261();
   static int field3144 = 0;
   static Object field3147 = new Object();

   public void run() {
      try {
         while (true) {
            class261 class261_2 = field3146;
            class231 class231_1;
            synchronized(field3146) {
               class231_1 = (class231) field3146.method4892();
            }

            Object object_14;
            if (class231_1 != null) {
               if (class231_1.field3118 == 0) {
                  class231_1.field3116.method5866((int)class231_1.hash, class231_1.field3115, class231_1.field3115.length, -1155409189);
                  class261_2 = field3146;
                  synchronized(field3146) {
                     class231_1.unlink();
                  }
               } else if (class231_1.field3118 == 1) {
                  class231_1.field3115 = class231_1.field3116.method5865((int)class231_1.hash, -8739933);
                  class261_2 = field3146;
                  synchronized(field3146) {
                     field3145.method4917(class231_1);
                  }
               }

               object_14 = field3147;
               synchronized(field3147) {
                  if (field3144 <= 1) {
                     field3144 = 0;
                     field3147.notifyAll();
                     return;
                  }

                  field3144 = 600;
               }
            } else {
               class251.method4550(100L);
               object_14 = field3147;
               synchronized(field3147) {
                  if (field3144 <= 1) {
                     field3144 = 0;
                     field3147.notifyAll();
                     return;
                  }

                  --field3144;
               }
            }
         }
      } catch (Exception exception_13) {
         ErrorHandler.logError((String) null, exception_13, (byte) 70);
      }
   }

   public static final ResourceHandler method4256(class166 class166_0, int i_1, int i_2, int i_3) {
      if (class172.field2078 == 0) {
         throw new IllegalStateException();
      } else if (i_1 >= 0 && i_1 < 2) {
         if (i_2 < 256) {
            i_2 = 256;
         }

         try {
            ResourceHandler resourceHandler_4 = class32.field277.vmethod2314((byte) 1);
            resourceHandler_4.field1415 = new int[256 * (class169.field2053 ? 2 : 1)];
            resourceHandler_4.field1414 = i_2;
            resourceHandler_4.vmethod2413(-1518489339);
            resourceHandler_4.field1424 = (i_2 & ~0x3ff) + 1024;
            if (resourceHandler_4.field1424 > 16384) {
               resourceHandler_4.field1424 = 16384;
            }

            resourceHandler_4.vmethod2414(resourceHandler_4.field1424, (byte) 51);
            if (ResourceHandler.field1407 > 0 && class88.field1246 == null) {
               class88.field1246 = new MemoryManager();
               class14.field97 = Executors.newScheduledThreadPool(1);
               class14.field97.scheduleAtFixedRate(class88.field1246, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class88.field1246 != null) {
               if (class88.field1246.handlers[i_1] != null) {
                  throw new IllegalArgumentException();
               }

               class88.field1246.handlers[i_1] = resourceHandler_4;
            }

            return resourceHandler_4;
         } catch (Throwable throwable_5) {
            return new ResourceHandler();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

}
