import java.util.Comparator;

public class class314 implements Comparator {

   public static int field3846;
   final boolean field3845;

   public class314(boolean bool_1) {
      this.field3845 = bool_1;
   }

   int method5916(class274 class274_1, class274 class274_2, int i_3) {
      return this.field3845 ? class274_1.vmethod5221(class274_2, 767614591) : class274_2.vmethod5221(class274_1, -1916974448);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method5916((class274) object_1, (class274) object_2, 1081318416);
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

   static final void method5907(String string_0, int i_1) {
      if (string_0.equalsIgnoreCase("toggleroof")) {
         class17.field117.field1060 = !class17.field117.field1060;
         class97.method2268(2137057072);
         if (class17.field117.field1060) {
            class62.method1132(99, "", "Roofs are now all hidden", -2101693222);
         } else {
            class62.method1132(99, "", "Roofs will only be removed selectively", -2109176222);
         }
      }

      if (string_0.equalsIgnoreCase("displayfps")) {
         Client.field884 = !Client.field884;
      }

      if (string_0.equalsIgnoreCase("renderself")) {
         Client.field773 = !Client.field773;
      }

      if (string_0.equalsIgnoreCase("mouseovertext")) {
         Client.field802 = !Client.field802;
      }

      if (Client.field890 >= 2) {
         if (string_0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (string_0.equalsIgnoreCase("showcoord")) {
            class136.field1875.field4025 = !class136.field1875.field4025;
         }

         if (string_0.equalsIgnoreCase("fpson")) {
            Client.field884 = true;
         }

         if (string_0.equalsIgnoreCase("fpsoff")) {
            Client.field884 = false;
         }

         if (string_0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (string_0.equalsIgnoreCase("clientdrop")) {
            class56.method1090();
         }
      }

      class187 class187_2 = class235.method4265(class183.field2263, Client.data.field1313, 1775123545);
      class187_2.outBuffer.writeByte(string_0.length() + 1);
      class187_2.outBuffer.writeNullTerminatedString(string_0);
      Client.data.copy(class187_2);
   }

}
