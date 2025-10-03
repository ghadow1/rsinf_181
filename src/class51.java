import java.applet.Applet;

public class class51 {

   static Applet field437 = null;
   static String field434 = "";

   public static class246 method854(int i_0, int i_1) {
      class246 class246_2 = (class246) class246.field3278.get((long)i_0);
      if (class246_2 != null) {
         return class246_2;
      } else {
         byte[] bytes_3 = class246.field3281.method4144(33, i_0);
         class246_2 = new class246();
         if (bytes_3 != null) {
            class246_2.method4473(new ByteBuffer(bytes_3), (byte) -11);
         }

         class246.field3278.put(class246_2, (long)i_0);
         return class246_2;
      }
   }

}
