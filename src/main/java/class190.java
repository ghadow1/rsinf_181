import java.util.Locale;

public class class190 implements UnknownT {

   static int field2358;
   static ResourceHandler field2361;
   static int field2345;
   public static final class190 field2348;
   static final class190 field2351;
   public static final class190 field2347;
   static final class190 field2352;
   static final class190 field2349;
   public static final class190 field2350;
   static final class190 field2360;
   public static final class190[] field2355;
   final String field2346;
   final String field2353;
   final int field2354;

   static {
      field2348 = new class190("EN", "en", 0, "GB");
      field2351 = new class190("DE", "de", 1, "DE");
      field2347 = new class190("FR", "fr", 2, "FR");
      field2352 = new class190("PT", "pt", 3, "BR");
      field2349 = new class190("NL", "nl", 4, "NL");
      field2350 = new class190("ES", "es", 5, "ES");
      field2360 = new class190("ES_MX", "es-mx", 6, "MX");
      class190[] arr_0 = method3664();
      field2355 = new class190[arr_0.length];
      class190[] arr_1 = arr_0;

      for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
         class190 class190_3 = arr_1[i_2];
         if (field2355[class190_3.field2354] != null) {
            throw new IllegalStateException();
         }

         field2355[class190_3.field2354] = class190_3;
      }

   }

   class190(String string_1, String string_2, int i_5, String string_6) {
      this.field2346 = string_1;
      this.field2353 = string_2;
      this.field2354 = i_5;
      if (string_6 != null) {
         new Locale(string_2.substring(0, 2), string_6);
      } else {
         new Locale(string_2.substring(0, 2));
      }

   }

   static class190[] method3664() {
      return new class190[]{field2351, field2349, field2347, field2350, field2348, field2360, field2352};
   }

   public int getId(int i_1) {
      return this.field2354;
   }

   static boolean method3667() {
      if (Client.field925 != null && Client.field926 < Client.field925.size()) {
         while (Client.field926 < Client.field925.size()) {
            class58 class58_1 = (class58) Client.field925.get(Client.field926);
            if (!class58_1.method1095()) {
               return false;
            }

            ++Client.field926;
         }

         return true;
      } else {
         return true;
      }
   }

   static String someConnectionType(String string_0, boolean bool_1) {
      String str_3 = bool_1 ? "https://" : "http://";
      if (Client.field703 == 1) {
         string_0 = string_0 + "-wtrc";
      } else if (Client.field703 == 2) {
         string_0 = string_0 + "-wtqa";
      } else if (Client.field703 == 3) {
         string_0 = string_0 + "-wtwip";
      } else if (Client.field703 == 5) {
         string_0 = string_0 + "-wti";
      } else if (Client.field703 == 4) {
         string_0 = "local";
      }

      String str_4 = "";
      if (class294.field3695 != null) {
         str_4 = "/p=" + class294.field3695;
      }

      String str_5 = "runescape.com";
      return str_3 + string_0 + "." + str_5 + "/l=" + class56.field528 + "/a=" + class239.field3199 + str_4 + "/";
   }

   public static final void method3665() {
      class128.field1753 = false;
      class128.field1748 = 0;
   }

   String method3656() {
      return this.field2353;
   }

   public String toString() {
      return this.method3656().toLowerCase(Locale.ENGLISH);
   }

}
