public class class230 implements UnknownT {

   public static final class230 field3107 = new class230("runescape", "RuneScape", 0);
   public static final class230 field3106 = new class230("stellardawn", "Stellar Dawn", 1);
   public static final class230 field3112 = new class230("game3", "Game 3", 2);
   public static final class230 field3108 = new class230("game4", "Game 4", 3);
   public static final class230 field3109 = new class230("game5", "Game 5", 4);
   public static final class230 field3110 = new class230("oldscape", "RuneScape 2007", 5);
   public final String field3111;
   final int field3105;

   class230(String string_1, String string_2, int i_3) {
      this.field3111 = string_1;
      this.field3105 = i_3;
   }

   public int getId() {
      return this.field3105;
   }

   static int method4137(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      Widget widget_4 = bool_2 ? MouseRecorder.field1111 : class207.field2507;
      if (i_0 == 1800) {
         MouseRecorder.field1098[++class70.field1014 - 1] = class78.method1957(class268.method4987(widget_4), (byte) 52);
         return 1;
      } else if (i_0 != 1801) {
         if (i_0 == 1802) {
            if (widget_4.field2643 == null) {
               MouseRecorder.field1093[++class221.field2747 - 1] = "";
            } else {
               MouseRecorder.field1093[++class221.field2747 - 1] = widget_4.field2643;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int i_5 = MouseRecorder.field1098[--class70.field1014];
         --i_5;
         if (widget_4.field2644 != null && i_5 < widget_4.field2644.length && widget_4.field2644[i_5] != null) {
            MouseRecorder.field1093[++class221.field2747 - 1] = widget_4.field2644[i_5];
         } else {
            MouseRecorder.field1093[++class221.field2747 - 1] = "";
         }

         return 1;
      }
   }

}
