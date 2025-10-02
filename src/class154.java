import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Random;

public class class154 extends class275 {

   public static class203 field1981;
   final boolean field1983;

   public class154(boolean bool_1) {
      this.field1983 = bool_1;
   }

   int method3401(class279 class279_1, class279 class279_2, int i_3) {
      return client.field807 == class279_1.field3636 && class279_2.field3636 == client.field807 ? (this.field1983 ? class279_1.field3633 - class279_2.field3633 : class279_2.field3633 - class279_1.field3633) : this.method5061(class279_1, class279_2, -30327366);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3401((class279) object_1, (class279) object_2, 1029227971);
   }

   static void method3405(int i_0) {
      Iterator iterator_1 = class91.field1277.iterator();

      while (iterator_1.hasNext()) {
         class64 class64_2 = (class64) iterator_1.next();
         class64_2.method1146(-391302038);
      }

   }

   static void method3406(short s_0) {
      class85.field1180 = class85.field1180.trim();
      if (class85.field1180.length() == 0) {
         class268.method4988("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.", 1513070190);
      } else {
         long long_2;
         try {
            URL url_4 = new URL(class190.method3666("services", false, -1044311329) + "m=accountappeal/login.ws");
            URLConnection urlconnection_5 = url_4.openConnection();
            urlconnection_5.setRequestProperty("connection", "close");
            urlconnection_5.setDoInput(true);
            urlconnection_5.setDoOutput(true);
            urlconnection_5.setConnectTimeout(5000);
            OutputStreamWriter outputstreamwriter_6 = new OutputStreamWriter(urlconnection_5.getOutputStream());
            outputstreamwriter_6.write("data1=req");
            outputstreamwriter_6.flush();
            InputStream inputstream_7 = urlconnection_5.getInputStream();
            class300 class300_8 = new class300(new byte[1000]);

            while (true) {
               int i_9 = inputstream_7.read(class300_8.field3730, class300_8.field3732, 1000 - class300_8.field3732);
               if (i_9 == -1) {
                  class300_8.field3732 = 0;
                  long long_23 = class300_8.method5531((byte) 75);
                  long_2 = long_23;
                  break;
               }

               class300_8.field3732 += i_9;
               if (class300_8.field3732 >= 1000) {
                  long_2 = 0L;
                  break;
               }
            }
         } catch (Exception exception_35) {
            long_2 = 0L;
         }

         byte b_1;
         if (long_2 == 0L) {
            b_1 = 5;
         } else {
            String string_36 = class85.field1180;
            Random random_37 = new Random();
            class300 class300_27 = new class300(128);
            class300 class300_10 = new class300(128);
            int[] ints_11 = new int[] {random_37.nextInt(), random_37.nextInt(), (int)(long_2 >> 32), (int)long_2};
            class300_27.method5655(10, 1492983816);

            int i_12;
            for (i_12 = 0; i_12 < 4; i_12++) {
               class300_27.method5481(random_37.nextInt());
            }

            class300_27.method5481(ints_11[0]);
            class300_27.method5481(ints_11[1]);
            class300_27.method5483(long_2);
            class300_27.method5483(0L);

            for (i_12 = 0; i_12 < 4; i_12++) {
               class300_27.method5481(random_37.nextInt());
            }

            class300_27.method5517(class80.field1140, class80.field1141, (byte) -74);
            class300_10.method5655(10, 660232089);

            for (i_12 = 0; i_12 < 3; i_12++) {
               class300_10.method5481(random_37.nextInt());
            }

            class300_10.method5483(random_37.nextLong());
            class300_10.method5482(random_37.nextLong());
            if (client.field693 != null) {
               class300_10.method5488(client.field693, 0, client.field693.length, 910134597);
            } else {
               byte[] bytes_13 = new byte[24];

               try {
                  class167.field2040.method6521(0L);
                  class167.field2040.method6547(bytes_13, 488085699);

                  int i_14;
                  for (i_14 = 0; i_14 < 24 && bytes_13[i_14] == 0; i_14++) {
                     ;
                  }

                  if (i_14 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception exception_34) {
                  for (int i_15 = 0; i_15 < 24; i_15++) {
                     bytes_13[i_15] = -1;
                  }
               }

               class300_10.method5488(bytes_13, 0, bytes_13.length, 910134597);
            }

            class300_10.method5483(random_37.nextLong());
            class300_10.method5517(class80.field1140, class80.field1141, (byte) -15);
            i_12 = class209.method3945(string_36, 547195601);
            if (i_12 % 8 != 0) {
               i_12 += 8 - i_12 % 8;
            }

            class300 class300_38 = new class300(i_12);
            class300_38.method5485(string_36, 709529816);
            class300_38.field3732 = i_12;
            class300_38.method5513(ints_11, -1108447488);
            class300 class300_28 = new class300(class300_10.field3732 + class300_27.field3732 + class300_38.field3732 + 5);
            class300_28.method5655(2, 1581585446);
            class300_28.method5655(class300_27.field3732, 1571782674);
            class300_28.method5488(class300_27.field3730, 0, class300_27.field3732, 910134597);
            class300_28.method5655(class300_10.field3732, 628088123);
            class300_28.method5488(class300_10.field3730, 0, class300_10.field3732, 910134597);
            class300_28.method5479(class300_38.field3732, (byte) -36);
            class300_28.method5488(class300_38.field3730, 0, class300_38.field3732, 910134597);
            byte[] bytes_16 = class300_28.field3730;
            String string_30 = class217.method4092(bytes_16, 0, bytes_16.length, 1305438411);
            String string_17 = string_30;

            byte b_31;
            try {
               URL url_18 = new URL(class190.method3666("services", false, -1044311329) + "m=accountappeal/login.ws");
               URLConnection urlconnection_19 = url_18.openConnection();
               urlconnection_19.setDoInput(true);
               urlconnection_19.setDoOutput(true);
               urlconnection_19.setConnectTimeout(5000);
               OutputStreamWriter outputstreamwriter_20 = new OutputStreamWriter(urlconnection_19.getOutputStream());
               outputstreamwriter_20.write("data2=" + class5.method63(string_17, -2102370448) + "&dest=" + class5.method63("passwordchoice.ws", -1834709193));
               outputstreamwriter_20.flush();
               InputStream inputstream_21 = urlconnection_19.getInputStream();
               class300_28 = new class300(new byte[1000]);

               while (true) {
                  int i_22 = inputstream_21.read(class300_28.field3730, class300_28.field3732, 1000 - class300_28.field3732);
                  if (i_22 == -1) {
                     outputstreamwriter_20.close();
                     inputstream_21.close();
                     String string_32 = new String(class300_28.field3730);
                     if (string_32.startsWith("OFFLINE")) {
                        b_31 = 4;
                     } else if (string_32.startsWith("WRONG")) {
                        b_31 = 7;
                     } else if (string_32.startsWith("RELOAD")) {
                        b_31 = 3;
                     } else if (string_32.startsWith("Not permitted for social network accounts.")) {
                        b_31 = 6;
                     } else {
                        class300_28.method5514(ints_11, 2019803853);

                        while (class300_28.field3732 > 0 && class300_28.field3730[class300_28.field3732 - 1] == 0) {
                           --class300_28.field3732;
                        }

                        string_32 = new String(class300_28.field3730, 0, class300_28.field3732);
                        if (class70.method1676(string_32, -1155103111)) {
                           class5.method50(string_32, true, false, -1641232850);
                           b_31 = 2;
                        } else {
                           b_31 = 5;
                        }
                     }
                     break;
                  }

                  class300_28.field3732 += i_22;
                  if (class300_28.field3732 >= 1000) {
                     b_31 = 5;
                     break;
                  }
               }
            } catch (Throwable throwable_33) {
               throwable_33.printStackTrace();
               b_31 = 5;
            }

            b_1 = b_31;
         }

         switch(b_1) {
         case 2:
            class268.method4988(class224.field2942, class224.field3027, class224.field2768, 1770098146);
            class85.field1209 = 6;
            break;
         case 3:
            class268.method4988("", "Error connecting to server.", "", 1583382407);
            break;
         case 4:
            class268.method4988("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.", 1419246291);
            break;
         case 5:
            class268.method4988("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.", 1754024429);
            break;
         case 6:
            class268.method4988("", "Error connecting to server.", "", 1577796324);
            break;
         case 7:
            class268.method4988("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.", 1687216376);
         }

      }
   }

   static String method3407(class217 class217_0, int i_1, short s_2) {
      int i_4 = class268.method4987(class217_0, 1691679814);
      boolean bool_3 = (i_4 >> i_1 + 1 & 0x1) != 0;
      return !bool_3 && class217_0.field2656 == null ? null : (class217_0.field2644 != null && class217_0.field2644.length > i_1 && class217_0.field2644[i_1] != null && class217_0.field2644[i_1].trim().length() != 0 ? class217_0.field2644[i_1] : null);
   }

}
