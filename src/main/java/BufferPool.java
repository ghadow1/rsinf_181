public class BufferPool {

   public static int[] customSizes;
   static int smallBufferCount = 0;
   static int mediumBufferCount = 0;
   static int field3737 = 0;
   static byte[][] smallBuffers = new byte[1000][];
   static byte[][] mediumBuffers = new byte[250][];
   static byte[][] largeBuffers = new byte[50][];

   static synchronized byte[] method5761(int i_0, boolean bool_1, byte b_2) {
      byte[] bytes_3;
      if (i_0 != 100) {
         if (i_0 < 100) {
            ;
         }
      } else if (smallBufferCount > 0) {
         bytes_3 = smallBuffers[--smallBufferCount];
         smallBuffers[smallBufferCount] = null;
         return bytes_3;
      }

      if (i_0 != 5000) {
         if (i_0 < 5000) {
            ;
         }
      } else if (mediumBufferCount > 0) {
         bytes_3 = mediumBuffers[--mediumBufferCount];
         mediumBuffers[mediumBufferCount] = null;
         return bytes_3;
      }

      if (i_0 != 30000) {
         if (i_0 < 30000) {
            ;
         }
      } else if (field3737 > 0) {
         bytes_3 = largeBuffers[--field3737];
         largeBuffers[field3737] = null;
         return bytes_3;
      }

      if (BufferPoolConfig.customPools != null) {
         for (int i_5 = 0; i_5 < customSizes.length; i_5++) {
            if (customSizes[i_5] != i_0) {
               if (i_0 < customSizes[i_5]) {
                  ;
               }
            } else if (GCMonitor.customPoolCounts[i_5] > 0) {
               byte[] bytes_4 = BufferPoolConfig.customPools[i_5][--GCMonitor.customPoolCounts[i_5]];
               BufferPoolConfig.customPools[i_5][GCMonitor.customPoolCounts[i_5]] = null;
               return bytes_4;
            }
         }
      }

      return new byte[i_0];
   }

}
