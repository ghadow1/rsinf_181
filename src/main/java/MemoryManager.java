import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class MemoryManager implements Runnable {

   /**
    * Array of cleanup handlers or resource managers.
    * Volatile ensures visibility across threads.
    */
   volatile ResourceHandler[] handlers = new ResourceHandler[2];

   /**
    * Returns a byte array to the buffer pool for reuse.
    * This is a buffer pooling mechanism to reduce GC pressure.
    * <p>
    * Uses multiple pools for different buffer sizes:
    * - 100 bytes: Pool of up to 1000 buffers (small buffers)
    * - 5000 bytes: Pool of up to 250 buffers (medium buffers)
    * - 30000 bytes: Pool of up to 50 buffers (large buffers)
    * - Custom sizes: Dynamic pools based on configuration
    *
    * @param buffer The byte array to return to the pool
    */
   public static synchronized void returnBufferToPool(byte[] buffer) {
      if (buffer.length == 100 && BufferPool.smallBufferCount < 1000) {
         BufferPool.smallBuffers[++BufferPool.smallBufferCount - 1] = buffer;
      } else if (buffer.length == 5000 && BufferPool.mediumBufferCount < 250) {
         BufferPool.mediumBuffers[++BufferPool.mediumBufferCount - 1] = buffer;
      } else if (buffer.length == 30000 && BufferPool.field3737 < 50) {
         BufferPool.largeBuffers[++BufferPool.field3737 - 1] = buffer;
      } else {
         if (BufferPoolConfig.customPools != null) {
            for (int i = 0; i < BufferPool.customSizes.length; i++) {
               if (buffer.length == BufferPool.customSizes[i]
                       && GCMonitor.customPoolCounts[i] < BufferPoolConfig.customPools[i].length) {
                  BufferPoolConfig.customPools[i][GCMonitor.customPoolCounts[i]++] = buffer;
                  return;
               }
            }
         }
      }
   }

   protected static int getGCPercentage() {
      int gcPercentage = 0;
      if (GCMonitor.gcBean == null || !GCMonitor.gcBean.isValid()) {
         try {
            Iterator<GarbageCollectorMXBean> iterator =
                    ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while (iterator.hasNext()) {
               GarbageCollectorMXBean bean = (GarbageCollectorMXBean) iterator.next();
               if (bean.isValid()) {
                  GCMonitor.gcBean = bean;
                  GameApplet.lastCheckTime = -1L;
                  GameApplet.lastGCTime = -1L;
               }
            }
         } catch (Throwable throwable_12) {
            // Silently fail if GC monitoring is not available
         }
      }

      if (GCMonitor.gcBean != null) {
         long currentTime = TimeUtils.getAdjustedTimeMillis();
         long currentGCTime = GCMonitor.gcBean.getCollectionTime();
         if (GameApplet.lastGCTime != -1L) {
            long gcTimeDelta = currentGCTime - GameApplet.lastGCTime;
            long realTimeDelta = currentTime - GameApplet.lastCheckTime;
            if (realTimeDelta != 0L) {
               gcPercentage = (int) (100L * gcTimeDelta / realTimeDelta);
            }
         }

         GameApplet.lastGCTime = currentGCTime;
         GameApplet.lastCheckTime = currentTime;
      }

      return gcPercentage;
   }

   /**
    * Finds an enum value by its ID from an array of enum values.
    * This is a generic enum lookup utility.
    *
    * @param values Array of enum values to search
    * @param id     The ID to look up
    * @return The matching enum value, or null if not found
    */
   public static <T extends UnknownT> T findById(T[] values, int id) {
      for (int i = 0; i < values.length; i++) {
         T value = values[i];
         if (id == value.getId(320353268)) {
            return value;
         }
      }
      return null;
   }

   /**
    * Runs cleanup operations on registered handlers.
    * This is likely called periodically or during shutdown.
    */
   public void run() {
      try {
         for (int i = 0; i < 2; i++) {
            ResourceHandler handler = this.handlers[i];
            if (handler != null) {
               handler.cleanup();
            }
         }
      } catch (Exception e) {
         ErrorHandler.logError(null, e);
      }
   }

}
