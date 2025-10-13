import java.util.Comparator;

public class class314 implements Comparator {

   public static int field3846;
   final boolean field3845;

   public class314(boolean bool_1) {
      this.field3845 = bool_1;
   }

   static final void developerCommands(String string_0) {
      if (string_0.equalsIgnoreCase("toggleroof")) {
         class17.field117.field1060 = !class17.field117.field1060;
         class97.method2268();
         if (class17.field117.field1060) {
            class62.method1132(99, "", "Roofs are now all hidden");
         } else {
            class62.method1132(99, "", "Roofs will only be removed selectively");
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

      // if (Client.field890 >= 2) {
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
      // }

      class187 class187_2 = class235.method4265(ClientPacketProt.field2263, Client.data.field1313);
      class187_2.outBuffer.writeByte(string_0.length() + 1);
      class187_2.outBuffer.writeNullTerminatedString(string_0);
      Client.data.copy(class187_2);
   }

   int method5916(User user_1, User user_2) {
      return this.field3845 ? user_1.vmethod5221(user_2) : user_2.vmethod5221(user_1);
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method5916((User) object_1, (User) object_2);
   }

}
