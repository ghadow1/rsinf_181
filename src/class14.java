import netscape.javascript.JSObject;

import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;

public class class14 {

   static ScheduledExecutorService field97;

   static void method157(int i_0, String string_1, String string_2, String string_3) {
      class94 class94_5 = (class94) class91.field1279.get(Integer.valueOf(i_0));
      if (class94_5 == null) {
         class94_5 = new class94();
         class91.field1279.put(Integer.valueOf(i_0), class94_5);
      }

      class64 class64_6 = class94_5.method2202(i_0, string_1, string_2, string_3, (byte) 0);
      class91.field1277.method5938(class64_6, (long)class64_6.field600);
      class91.field1278.method4950(class64_6);
      client.field847 = client.field673;
   }

   static final void method153(class217 class217_0, int i_1, int i_2, int i_3) {
      if (class217_0.field2641 == null) {
         throw new RuntimeException();
      } else {
         class217_0.field2641[i_1] = i_2;
         class217_0.field2588[i_1] = i_3;
      }
   }

   static void generateDocument(String string_0) {
      class294.field3695 = string_0;

      try {
         String string_2 = class27.field233.getParameter(class271.field3587.field3597);
         String string_3 = class27.field233.getParameter(class271.field3594.field3597);
         String string_4 = string_2 + "settings=" + string_0 + "; version=1; path=/; domain=" + string_3;
         String string_6;
         if (string_0.length() == 0) {
            string_4 = string_4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            String string_5 = string_4 + "; Expires=";
            long long_7 = TimeUtils.getAdjustedTimeMillis() + 94608000000L;
            class207.field2504.setTime(new Date(long_7));
            int i_9 = class207.field2504.get(7);
            int i_10 = class207.field2504.get(5);
            int i_11 = class207.field2504.get(2);
            int i_12 = class207.field2504.get(1);
            int i_13 = class207.field2504.get(11);
            int i_14 = class207.field2504.get(12);
            int i_15 = class207.field2504.get(13);
            string_6 = class207.field2505[i_9 - 1] + ", " + i_10 / 10 + i_10 % 10 + "-" + class207.field2503[0][i_11] + "-" + i_12 + " " + i_13 / 10 + i_13 % 10 + ":" + i_14 / 10 + i_14 % 10 + ":" + i_15 / 10 + i_15 % 10 + " GMT";
            string_4 = string_5 + string_6 + "; Max-Age=" + 94608000L;
         }

         client client_17 = class27.field233;
         string_6 = "document.cookie=\"" + string_4 + "\"";
         JSObject.getWindow(client_17).eval(string_6);
      } catch (Throwable throwable_16) {
         ;
      }

   }

   static final void method159(String string_0, int i_1) {
      class187 class187_3 = class235.method4265(class183.field2280, client.field880.field1313, 1775123545);
      class187_3.field2333.writeByte(class209.method3945(string_0) + 1);
      class187_3.field2333.writeNullTerminatedString(string_0);
      class187_3.field2333.writeByte(i_1);
      client.field880.copy(class187_3);
   }

}
