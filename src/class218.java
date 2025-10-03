import java.applet.Applet;

public class class218 {

   public static int field2707;

   public static void method4110(Applet applet_0, String string_1) {
      class51.field437 = applet_0;
      if (string_1 != null) {
         class51.field434 = string_1;
      }

   }

   public static final boolean method4109() {
       synchronized(class45.field392) {
         if (class45.field385 == class45.field396) {
            return false;
         } else {
            class97.field1338 = class45.field400[class45.field396];
            class207.field2508 = class45.field399[class45.field396];
            class45.field396 = class45.field396 + 1 & 0x7f;
            return true;
         }
      }
   }

}
