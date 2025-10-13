public class WorldMapCacheName {

   public static short[] field309;
   static class235 field307;
   static int field301;
   public static final WorldMapCacheName field308 = new WorldMapCacheName("details");
   public static final WorldMapCacheName field302 = new WorldMapCacheName("compositemap");
   public static final WorldMapCacheName field303 = new WorldMapCacheName("compositetexture");
   public static final WorldMapCacheName field305 = new WorldMapCacheName("labels");
   static final WorldMapCacheName field304 = new WorldMapCacheName("area");
   public final String field306;

   WorldMapCacheName(String string_1) {
      this.field306 = string_1;
   }

   static final void method600(Widget widget_0, int i_1) {
      if (widget_0.field2650 == null) {
         throw new RuntimeException();
      } else {
         if (widget_0.field2578 == null) {
            widget_0.field2578 = new int[widget_0.field2650.length];
         }

         widget_0.field2578[i_1] = Integer.MAX_VALUE;
      }
   }

}
