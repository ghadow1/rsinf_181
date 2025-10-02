import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class class107 implements Runnable {

   volatile class105[] field1438 = new class105[2];

   public void run() {
      try {
         for (int i_1 = 0; i_1 < 2; i_1++) {
            class105 class105_2 = this.field1438[i_1];
            if (class105_2 != null) {
               class105_2.method2443(-1453359051);
            }
         }
      } catch (Exception exception_4) {
         class252.method4556((String) null, exception_4, (byte) 5);
      }

   }

   public static synchronized void method2478(byte[] bytes_0, byte b_1) {
      if (bytes_0.length == 100 && class302.field3734 < 1000) {
         class302.field3739[++class302.field3734 - 1] = bytes_0;
      } else if (bytes_0.length == 5000 && class302.field3735 < 250) {
         class302.field3738[++class302.field3735 - 1] = bytes_0;
      } else if (bytes_0.length == 30000 && class302.field3737 < 50) {
         class302.field3736[++class302.field3737 - 1] = bytes_0;
      } else {
         if (class189.field2343 != null) {
            for (int i_2 = 0; i_2 < class302.field3740.length; i_2++) {
               if (bytes_0.length == class302.field3740[i_2] && class43.field381[i_2] < class189.field2343[i_2].length) {
                  class189.field2343[i_2][class43.field381[i_2]++] = bytes_0;
                  return;
               }
            }
         }

      }
   }

   public static class194 method2476(class194[] arr_0, int i_1) {
      class194[] arr_3 = arr_0;

      for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
         class194 class194_5 = arr_3[i_4];
         if (i_1 == class194_5.vmethod6084(320353268)) {
            return class194_5;
         }
      }

      return null;
   }

   protected static int garbageCollector() {
      int i_1 = 0;
      if (class43.field378 == null || !class43.field378.isValid()) {
         try {
            Iterator iterator_2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while (iterator_2.hasNext()) {
               GarbageCollectorMXBean garbagecollectormxbean_3 = (GarbageCollectorMXBean) iterator_2.next();
               if (garbagecollectormxbean_3.isValid()) {
                  class43.field378 = garbagecollectormxbean_3;
                  class53.field474 = -1L;
                  class53.field458 = -1L;
               }
            }
         } catch (Throwable throwable_12) {
            ;
         }
      }

      if (class43.field378 != null) {
         long long_10 = class206.getAdjustedTimeMillis();
         long long_4 = class43.field378.getCollectionTime();
         if (class53.field458 != -1L) {
            long long_6 = long_4 - class53.field458;
            long long_8 = long_10 - class53.field474;
            if (long_8 != 0L) {
               i_1 = (int)(100L * long_6 / long_8);
            }
         }

         class53.field458 = long_4;
         class53.field474 = long_10;
      }

      return i_1;
   }

}
