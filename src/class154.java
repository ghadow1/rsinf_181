import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Random;

public class class154 extends ChainedComparator {

   public static class203 field1981;
   final boolean field1983;

   public class154(boolean bool_1) {
      this.field1983 = bool_1;
   }

   int method3401(Categorizable categorizable_1, Categorizable categorizable_2, int i_3) {
      return Client.field807 == categorizable_1.category && categorizable_2.category == Client.field807 ? (this.field1983 ? categorizable_1.field3633 - categorizable_2.field3633 : categorizable_2.field3633 - categorizable_1.field3633) : this.compareWithNext(categorizable_1, categorizable_2);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3401((Categorizable) object_1, (Categorizable) object_2, 1029227971);
   }

   static void method3405() {
      Iterator iterator_1 = class91.field1277.iterator();

      while (iterator_1.hasNext()) {
         class64 class64_2 = (class64) iterator_1.next();
         class64_2.method1146();
      }

   }

   static void method3406(short s_0) {
      class85.field1180 = class85.field1180.trim();
      if (class85.field1180.length() == 0) {
         class268.loginResponseMessages("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long long_2;
         try {
            URL url_4 = new URL(class190.someConnectionType("services", false) + "m=accountappeal/login.ws");
            URLConnection urlconnection_5 = url_4.openConnection();
            urlconnection_5.setRequestProperty("connection", "close");
            urlconnection_5.setDoInput(true);
            urlconnection_5.setDoOutput(true);
            urlconnection_5.setConnectTimeout(5000);
            OutputStreamWriter outputstreamwriter_6 = new OutputStreamWriter(urlconnection_5.getOutputStream());
            outputstreamwriter_6.write("data1=req");
            outputstreamwriter_6.flush();
            InputStream inputstream_7 = urlconnection_5.getInputStream();
            ByteBuffer class300_8 = new ByteBuffer(new byte[1000]);

            while (true) {
               int i_9 = inputstream_7.read(class300_8.buffer, class300_8.position, 1000 - class300_8.position);
               if (i_9 == -1) {
                  class300_8.position = 0;
                  long long_23 = class300_8.readLongFromMediumEndian();
                  long_2 = long_23;
                  break;
               }

               class300_8.position += i_9;
               if (class300_8.position >= 1000) {
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
            ByteBuffer class300_27 = new ByteBuffer(128);
            ByteBuffer class300_10 = new ByteBuffer(128);
            int[] ints_11 = new int[] {random_37.nextInt(), random_37.nextInt(), (int)(long_2 >> 32), (int)long_2};
            class300_27.writeByte(10);

            int i_12;
            for (i_12 = 0; i_12 < 4; i_12++) {
               class300_27.writeIntBigEndian(random_37.nextInt());
            }

            class300_27.writeIntBigEndian(ints_11[0]);
            class300_27.writeIntBigEndian(ints_11[1]);
            class300_27.writeLongBigEndian(long_2);
            class300_27.writeLongBigEndian(0L);

            for (i_12 = 0; i_12 < 4; i_12++) {
               class300_27.writeIntBigEndian(random_37.nextInt());
            }

            class300_27.encryptRSA(class80.field1140, class80.field1141);
            class300_10.writeByte(10);

            for (i_12 = 0; i_12 < 3; i_12++) {
               class300_10.writeIntBigEndian(random_37.nextInt());
            }

            class300_10.writeLongBigEndian(random_37.nextLong());
            class300_10.write48BitLong(random_37.nextLong());
            if (Client.field693 != null) {
               class300_10.writeBytes(Client.field693, 0, Client.field693.length);
            } else {
               byte[] bytes_13 = new byte[24];

               try {
                  class167.field2040.method6521(0L);
                  class167.field2040.method6547(bytes_13);

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

               class300_10.writeBytes(bytes_13, 0, bytes_13.length);
            }

            class300_10.writeLongBigEndian(random_37.nextLong());
            class300_10.encryptRSA(class80.field1140, class80.field1141);
            i_12 = class209.method3945(string_36);
            if (i_12 % 8 != 0) {
               i_12 += 8 - i_12 % 8;
            }

            ByteBuffer class300_38 = new ByteBuffer(i_12);
            class300_38.writeNullTerminatedString(string_36);
            class300_38.position = i_12;
            class300_38.encryptTEA(ints_11);
            ByteBuffer class300_28 = new ByteBuffer(class300_10.position + class300_27.position + class300_38.position + 5);
            class300_28.writeByte(2);
            class300_28.writeByte(class300_27.position);
            class300_28.writeBytes(class300_27.buffer, 0, class300_27.position);
            class300_28.writeByte(class300_10.position);
            class300_28.writeBytes(class300_10.buffer, 0, class300_10.position);
            class300_28.writeShortBigEndian(class300_38.position);
            class300_28.writeBytes(class300_38.buffer, 0, class300_38.position);
            byte[] bytes_16 = class300_28.buffer;
            String string_30 = class217.method4092(bytes_16, 0, bytes_16.length);
            String string_17 = string_30;

            byte b_31;
            try {
               URL url_18 = new URL(class190.someConnectionType("services", false) + "m=accountappeal/login.ws");
               URLConnection urlconnection_19 = url_18.openConnection();
               urlconnection_19.setDoInput(true);
               urlconnection_19.setDoOutput(true);
               urlconnection_19.setConnectTimeout(5000);
               OutputStreamWriter outputstreamwriter_20 = new OutputStreamWriter(urlconnection_19.getOutputStream());
               outputstreamwriter_20.write("data2=" + class5.method63(string_17) + "&dest=" + class5.method63("passwordchoice.ws"));
               outputstreamwriter_20.flush();
               InputStream inputstream_21 = urlconnection_19.getInputStream();
               class300_28 = new ByteBuffer(new byte[1000]);

               while (true) {
                  int i_22 = inputstream_21.read(class300_28.buffer, class300_28.position, 1000 - class300_28.position);
                  if (i_22 == -1) {
                     outputstreamwriter_20.close();
                     inputstream_21.close();
                     String string_32 = new String(class300_28.buffer);
                     if (string_32.startsWith("OFFLINE")) {
                        b_31 = 4;
                     } else if (string_32.startsWith("WRONG")) {
                        b_31 = 7;
                     } else if (string_32.startsWith("RELOAD")) {
                        b_31 = 3;
                     } else if (string_32.startsWith("Not permitted for social network accounts.")) {
                        b_31 = 6;
                     } else {
                        class300_28.decryptTEA(ints_11);

                        while (class300_28.position > 0 && class300_28.buffer[class300_28.position - 1] == 0) {
                           --class300_28.position;
                        }

                        string_32 = new String(class300_28.buffer, 0, class300_28.position);
                        if (class70.method1676(string_32, -1155103111)) {
                           class5.method50(string_32, true, false);
                           b_31 = 2;
                        } else {
                           b_31 = 5;
                        }
                     }
                     break;
                  }

                  class300_28.position += i_22;
                  if (class300_28.position >= 1000) {
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
            class268.loginResponseMessages(class224.field2942, class224.field3027, class224.field2768);
            class85.field1209 = 6;
            break;
         case 3:
            class268.loginResponseMessages("", "Error connecting to server.", "");
            break;
         case 4:
            class268.loginResponseMessages("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            class268.loginResponseMessages("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            class268.loginResponseMessages("", "Error connecting to server.", "");
            break;
         case 7:
            class268.loginResponseMessages("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }

   static String method3407(class217 class217_0, int i_1, short s_2) {
      int i_4 = class268.method4987(class217_0);
      boolean bool_3 = (i_4 >> i_1 + 1 & 0x1) != 0;
      return !bool_3 && class217_0.field2656 == null ? null : (class217_0.field2644 != null && class217_0.field2644.length > i_1 && class217_0.field2644[i_1] != null && class217_0.field2644[i_1].trim().length() != 0 ? class217_0.field2644[i_1] : null);
   }

}
