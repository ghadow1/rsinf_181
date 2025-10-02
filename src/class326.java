import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class class326 {

   public static int field3913;
   public static int field3910;
   public static int[] field3915;
   public static int[] field3914;
   static int field3911;
   public static byte[][] field3912;

   static void method6243(String string_0, boolean bool_1, String string_2, boolean bool_3, byte b_4) {
      if (bool_1) {
         if (!bool_3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(string_0));
               return;
            } catch (Exception exception_6) {
               ;
            }
         }

         if (class51.field434.startsWith("win") && !bool_3) {
            class66.method1226(string_0, 0, "openjs", 617524954);
            return;
         }

         if (class51.field434.startsWith("mac")) {
            class66.method1226(string_0, 1, string_2, 2072199556);
            return;
         }

         class66.method1226(string_0, 2, "openjs", 1740575880);
      } else {
         class66.method1226(string_0, 3, "openjs", 1838105426);
      }

   }

}
