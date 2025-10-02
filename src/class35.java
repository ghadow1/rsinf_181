public class class35 {

   public static short[] field309;
   static class235 field307;
   static int field301;
   public static final class35 field308 = new class35("details");
   public static final class35 field302 = new class35("compositemap");
   public static final class35 field303 = new class35("compositetexture");
   static final class35 field304 = new class35("area");
   public static final class35 field305 = new class35("labels");
   public final String field306;

   class35(String string_1) {
      this.field306 = string_1;
   }

   static final void method600(class217 class217_0, int i_1, byte b_2) {
      if (class217_0.field2650 == null) {
         throw new RuntimeException();
      } else {
         if (class217_0.field2578 == null) {
            class217_0.field2578 = new int[class217_0.field2650.length];
         }

         class217_0.field2578[i_1] = Integer.MAX_VALUE;
      }
   }

}
