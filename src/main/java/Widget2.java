public class Widget2 {

   public static String assist_message_1 = "Please visit the support page for assistance.";
   public static String assist_message_2 = "Please visit the support page for assistance.";
   public static String assist_message_3 = "";
   public static String assist_message_4 = "Page has opened in a new window.";
   public static String assist_message_5 = "(Please check your popup blocker.)";

   static void invalidateWidget(Widget widget_0) {
      if (widget_0.field2702 == Client.field741) {
         Client.field843[widget_0.field2701] = true;
      }

   }

   static void method4121() {
      Client.menuOptionsCount = 0;
      Client.field674 = false;
   }

}
