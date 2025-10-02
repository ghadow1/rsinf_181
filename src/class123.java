import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public final class class123 {

   public class135 field1614;
   int field1612;
   public long field1617;
   int field1613;
   int field1618;
   int field1616;

   static String method2843(Throwable throwable_0, byte b_1) throws IOException {
      String str_2;
      if (throwable_0 instanceof class341) {
         class341 class341_3 = (class341) throwable_0;
         str_2 = class341_3.field4067 + " | ";
         throwable_0 = class341_3.field4068;
      } else {
         str_2 = "";
      }

      StringWriter stringwriter_13 = new StringWriter();
      PrintWriter printwriter_4 = new PrintWriter(stringwriter_13);
      throwable_0.printStackTrace(printwriter_4);
      printwriter_4.close();
      String string_5 = stringwriter_13.toString();
      BufferedReader bufferedreader_6 = new BufferedReader(new StringReader(string_5));
      String string_7 = bufferedreader_6.readLine();

      while (true) {
         while (true) {
            String string_8 = bufferedreader_6.readLine();
            if (string_8 == null) {
               str_2 = str_2 + "| " + string_7;
               return str_2;
            }

            int i_9 = string_8.indexOf(40);
            int i_10 = string_8.indexOf(41, i_9 + 1);
            if (i_9 >= 0 && i_10 >= 0) {
               String string_11 = string_8.substring(i_9 + 1, i_10);
               int i_12 = string_11.indexOf(".java:");
               if (i_12 >= 0) {
                  string_11 = string_11.substring(0, i_12) + string_11.substring(i_12 + 5);
                  str_2 = str_2 + string_11 + ' ';
                  continue;
               }

               string_8 = string_8.substring(0, i_9);
            }

            string_8 = string_8.trim();
            string_8 = string_8.substring(string_8.lastIndexOf(32) + 1);
            string_8 = string_8.substring(string_8.lastIndexOf(9) + 1);
            str_2 = str_2 + string_8 + ' ';
         }
      }
   }

   public static void method2842(short s_0) {
      if (class45.field392 != null) {
         class45 class45_1 = class45.field392;
         synchronized(class45.field392) {
            class45.field392 = null;
         }
      }

   }

}
