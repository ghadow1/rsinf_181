public class class294 {

   static Widget field3697;
   static String field3695;

   static void method5328(int i_0, byte[] bytes_1, class308 class308_2) {
      class231 class231_4 = new class231();
      class231_4.field3118 = 0;
      class231_4.hash = (long)i_0;
      class231_4.field3115 = bytes_1;
      class231_4.field3116 = class308_2;
      NodeDeque nodeDeque_5 = class234.field3146;
      synchronized(class234.field3146) {
         class234.field3146.addFirst(class231_4);
      }

      Object object_10 = class234.field3147;
      synchronized(class234.field3147) {
         if (class234.field3144 == 0) {
            class234.field3148 = new Thread(new class234());
            class234.field3148.setDaemon(true);
            class234.field3148.start();
            class234.field3148.setPriority(5);
         }

         class234.field3144 = 600;
      }
   }

   static final void method5327(class68 class68_0) {
      long long_2 = 0L;
      int i_4 = -1;
      int i_5 = 0;
      int i_6 = 0;
      if (class68_0.field932 == 0) {
         long_2 = class5.scene.method3130(class68_0.field943, class68_0.field937, class68_0.field934);
      }

      if (class68_0.field932 == 1) {
         long_2 = class5.scene.method3180(class68_0.field943, class68_0.field937, class68_0.field934);
      }

      if (class68_0.field932 == 2) {
         long_2 = class5.scene.method3094(class68_0.field943, class68_0.field937, class68_0.field934);
      }

      if (class68_0.field932 == 3) {
         long_2 = class5.scene.method3095(class68_0.field943, class68_0.field937, class68_0.field934);
      }

      if (long_2 != 0L) {
         int i_7 = class5.scene.method3096(class68_0.field943, class68_0.field937, class68_0.field934, long_2);
         i_4 = GCMonitor.method770(long_2);
         i_5 = i_7 & 0x1f;
         i_6 = i_7 >> 6 & 0x3;
      }

      class68_0.field935 = i_4;
      class68_0.field933 = i_5;
      class68_0.field936 = i_6;
   }

}
