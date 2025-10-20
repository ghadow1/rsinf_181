public class class226 {

   static GrandExchangeOfferUnitPriceComparator field3071;
   static class310 field3072;

   static boolean method4123(PacketBuffer buffer3_0, int i_1) {
      int i_3 = buffer3_0.method5445(2);
      int i_4;
      int i_5;
      int i_8;
      int i_9;
      int i_10;
      int i_11;
      if (i_3 == 0) {
         if (buffer3_0.method5445(1) != 0) {
            method4123(buffer3_0, i_1);
         }

         i_4 = buffer3_0.method5445(13);
         i_5 = buffer3_0.method5445(13);
         boolean bool_13 = buffer3_0.method5445(1) == 1;
         if (bool_13) {
            class89.field1256[++class89.field1262 - 1] = i_1;
         }

         if (Client.field909[i_1] != null) {
            throw new RuntimeException();
         } else {
            class66 class66_7 = Client.field909[i_1] = new class66();
            class66_7.field637 = i_1;
            if (class89.field1254[i_1] != null) {
               class66_7.method1179(class89.field1254[i_1]);
            }

            class66_7.field1000 = class89.field1260[i_1];
            class66_7.field975 = class89.field1261[i_1];
            i_8 = class89.field1253[i_1];
            i_9 = i_8 >> 28;
            i_10 = i_8 >> 14 & 0xff;
            i_11 = i_8 & 0xff;
            class66_7.field1006[0] = class89.field1250[i_1];
            class66_7.field629 = (byte)i_9;
            class66_7.method1205((i_10 << 13) + i_4 - class196.field2389, (i_11 << 13) + i_5 - class1.field1);
            class66_7.field638 = false;
            return true;
         }
      } else if (i_3 == 1) {
         i_4 = buffer3_0.method5445(2);
         i_5 = class89.field1253[i_1];
         class89.field1253[i_1] = (((i_5 >> 28) + i_4 & 0x3) << 28) + (i_5 & 0xfffffff);
         return false;
      } else {
         int i_6;
         int i_12;
         if (i_3 == 2) {
            i_4 = buffer3_0.method5445(5);
            i_5 = i_4 >> 3;
            i_6 = i_4 & 0x7;
            i_12 = class89.field1253[i_1];
            i_8 = (i_12 >> 28) + i_5 & 0x3;
            i_9 = i_12 >> 14 & 0xff;
            i_10 = i_12 & 0xff;
            if (i_6 == 0) {
               --i_9;
               --i_10;
            }

            if (i_6 == 1) {
               --i_10;
            }

            if (i_6 == 2) {
               ++i_9;
               --i_10;
            }

            if (i_6 == 3) {
               --i_9;
            }

            if (i_6 == 4) {
               ++i_9;
            }

            if (i_6 == 5) {
               --i_9;
               ++i_10;
            }

            if (i_6 == 6) {
               ++i_10;
            }

            if (i_6 == 7) {
               ++i_9;
               ++i_10;
            }

            class89.field1253[i_1] = (i_9 << 14) + i_10 + (i_8 << 28);
            return false;
         } else {
            i_4 = buffer3_0.method5445(18);
            i_5 = i_4 >> 16;
            i_6 = i_4 >> 8 & 0xff;
            i_12 = i_4 & 0xff;
            i_8 = class89.field1253[i_1];
            i_9 = (i_8 >> 28) + i_5 & 0x3;
            i_10 = i_6 + (i_8 >> 14) & 0xff;
            i_11 = i_12 + i_8 & 0xff;
            class89.field1253[i_1] = (i_10 << 14) + i_11 + (i_9 << 28);
            return false;
         }
      }
   }

}
