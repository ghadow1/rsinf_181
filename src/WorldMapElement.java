import java.math.BigInteger;

public class WorldMapElement {

   static int field1143;
   static ResourceHandler field1144;
   static byte[][] field1145;
   static final BigInteger field1140 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   static final BigInteger field1141 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

   public static Widget getWidget(int i_0) {
      int i_2 = i_0 >> 16;
      int i_3 = i_0 & 0xffff;
      if (Widget.field2556[i_2] == null || Widget.field2556[i_2][i_3] == null) {
         boolean bool_4 = class162.method3445(i_2);
         if (!bool_4) {
            return null;
         }
      }

      return Widget.field2556[i_2][i_3];
   }

   public static int method1979(byte[] bytes_0, int i_1, CharSequence charsequence_2) {
      int i_4 = charsequence_2.length();
      int i_5 = i_1;

      for (int i_6 = 0; i_6 < i_4; i_6++) {
         char var_7 = charsequence_2.charAt(i_6);
         if (var_7 <= 127) {
            bytes_0[i_5++] = (byte)var_7;
         } else if (var_7 <= 2047) {
            bytes_0[i_5++] = (byte)(0xc0 | var_7 >> 6);
            bytes_0[i_5++] = (byte)(0x80 | var_7 & 0x3f);
         } else {
            bytes_0[i_5++] = (byte)(0xe0 | var_7 >> 12);
            bytes_0[i_5++] = (byte)(0x80 | var_7 >> 6 & 0x3f);
            bytes_0[i_5++] = (byte)(0x80 | var_7 & 0x3f);
         }
      }

      return i_5 - i_1;
   }

   static final void method1982() {
      int i_1;
      int i_2;
      int i_3;
      int i_4;
      int i_5;
      int i_6;
      if (Client.field727 == 0) {
         i_1 = Client.field657.field1005;
         i_2 = Client.field657.field949;
         if (MouseHandler.field499 - i_1 < -500 || MouseHandler.field499 - i_1 > 500 || class26.field227 - i_2 < -500 || class26.field227 - i_2 > 500) {
            MouseHandler.field499 = i_1;
            class26.field227 = i_2;
         }

         if (i_1 != MouseHandler.field499) {
            MouseHandler.field499 += (i_1 - MouseHandler.field499) / 16;
         }

         if (i_2 != class26.field227) {
            class26.field227 += (i_2 - class26.field227) / 16;
         }

         i_3 = MouseHandler.field499 >> 7;
         i_4 = class26.field227 >> 7;
         i_5 = class62.method1130(MouseHandler.field499, class26.field227, class42.field372);
         i_6 = 0;
         int i_7;
         if (i_3 > 3 && i_4 > 3 && i_3 < 100 && i_4 < 100) {
            for (i_7 = i_3 - 4; i_7 <= i_3 + 4; i_7++) {
               for (int i_8 = i_4 - 4; i_8 <= i_4 + 4; i_8++) {
                  int i_9 = class42.field372;
                  if (i_9 < 3 && (class55.field502[1][i_7][i_8] & 0x2) == 2) {
                     ++i_9;
                  }

                  int i_10 = i_5 - class55.field516[i_9][i_7][i_8];
                  if (i_10 > i_6) {
                     i_6 = i_10;
                  }
               }
            }
         }

         i_7 = i_6 * 192;
         if (i_7 > 98048) {
            i_7 = 98048;
         }

         if (i_7 < 32768) {
            i_7 = 32768;
         }

         if (i_7 > Client.field739) {
            Client.field739 += (i_7 - Client.field739) / 24;
         } else if (i_7 < Client.field739) {
            Client.field739 += (i_7 - Client.field739) / 80;
         }

         Client.field729 = class62.method1130(Client.field657.field1005, Client.field657.field949, class42.field372) - Client.field728;
      } else if (Client.field727 == 1) {
         Widget.method4090(-174761515);
         short s_11 = -1;
         if (class45.field395[33]) {
            s_11 = 0;
         } else if (class45.field395[49]) {
            s_11 = 1024;
         }

         if (class45.field395[48]) {
            if (s_11 == 0) {
               s_11 = 1792;
            } else if (s_11 == 1024) {
               s_11 = 1280;
            } else {
               s_11 = 1536;
            }
         } else if (class45.field395[50]) {
            if (s_11 == 0) {
               s_11 = 256;
            } else if (s_11 == 1024) {
               s_11 = 768;
            } else {
               s_11 = 512;
            }
         }

         byte b_12 = 0;
         if (class45.field395[35]) {
            b_12 = -1;
         } else if (class45.field395[51]) {
            b_12 = 1;
         }

         i_3 = 0;
         if (s_11 >= 0 || b_12 != 0) {
            i_3 = class45.field395[81] ? Client.field734 : Client.field733;
            i_3 *= 16;
            Client.field731 = s_11;
            Client.field871 = b_12;
         }

         if (Client.field928 < i_3) {
            Client.field928 += i_3 / 8;
            if (Client.field928 > i_3) {
               Client.field928 = i_3;
            }
         } else if (Client.field928 > i_3) {
            Client.field928 = Client.field928 * 9 / 10;
         }

         if (Client.field928 > 0) {
            i_4 = Client.field928 / 16;
            if (Client.field731 >= 0) {
               i_1 = Client.field731 - MouseRecorder.field1112 & 0x7ff;
               i_5 = class130.field1787[i_1];
               i_6 = class130.field1784[i_1];
               MouseHandler.field499 += i_4 * i_5 / 65536;
               class26.field227 += i_6 * i_4 / 65536;
            }

            if (Client.field871 != 0) {
               Client.field729 += i_4 * Client.field871;
               if (Client.field729 > 0) {
                  Client.field729 = 0;
               }
            }
         } else {
            Client.field731 = -1;
            Client.field871 = -1;
         }

         if (class45.field395[13]) {
            class46.method805((byte) -5);
         }
      }

      if (MouseHandler.field485 == 4 && class46.field413) {
         i_1 = MouseHandler.MouseHandler_y - Client.field726;
         Client.field724 = i_1 * 2;
         Client.field726 = i_1 != -1 && i_1 != 1 ? (MouseHandler.MouseHandler_y + Client.field726) / 2 : MouseHandler.MouseHandler_y;
         i_2 = Client.field725 - MouseHandler.MouseHandler_x;
         Client.field723 = i_2 * 2;
         Client.field725 = i_2 != -1 && i_2 != 1 ? (Client.field725 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
      } else {
         if (class45.field395[96]) {
            Client.field723 += (-24 - Client.field723) / 2;
         } else if (class45.field395[97]) {
            Client.field723 += (24 - Client.field723) / 2;
         } else {
            Client.field723 /= 2;
         }

         if (class45.field395[98]) {
            Client.field724 += (12 - Client.field724) / 2;
         } else if (class45.field395[99]) {
            Client.field724 += (-12 - Client.field724) / 2;
         } else {
            Client.field724 /= 2;
         }

         Client.field726 = MouseHandler.MouseHandler_y;
         Client.field725 = MouseHandler.MouseHandler_x;
      }

      Client.field722 = Client.field723 / 2 + Client.field722 & 0x7ff;
      Client.field721 += Client.field724 / 2;
      if (Client.field721 < 128) {
         Client.field721 = 128;
      }

      if (Client.field721 > 383) {
         Client.field721 = 383;
      }

   }

}
