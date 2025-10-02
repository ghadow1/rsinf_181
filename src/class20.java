public class class20 implements UnknownT {

   static final class20 field148 = new class20(1, (byte) 0);
   static final class20 field149 = new class20(2, (byte) 1);
   static final class20 field146 = new class20(0, (byte) 2);
   static final class20 field147 = new class20(3, (byte) 3);
   final int field150;
   final byte field151;

   class20(int i_1, byte b_2) {
      this.field150 = i_1;
      this.field151 = b_2;
   }

   public int getId(int i_1) {
      return this.field151;
   }

   static final void method238(Buffer_3 buffer3_0, byte b_1) {
      buffer3_0.method5438();
      int i_2 = Client.field770;
      class66 class66_3 = Client.field657 = Client.field909[i_2] = new class66();
      class66_3.field637 = i_2;
      int i_4 = buffer3_0.method5445(30);
      byte b_5 = (byte)(i_4 >> 28);
      int i_6 = i_4 >> 14 & 0x3fff;
      int i_7 = i_4 & 0x3fff;
      class66_3.field994[0] = i_6 - class196.field2389;
      class66_3.field1005 = (class66_3.field994[0] << 7) + (class66_3.method1187(-1116736107) << 6);
      class66_3.field962[0] = i_7 - class1.field1;
      class66_3.field949 = (class66_3.field962[0] << 7) + (class66_3.method1187(-1116736107) << 6);
      class42.field372 = class66_3.field629 = b_5;
      if (class89.field1254[i_2] != null) {
         class66_3.method1179(class89.field1254[i_2], -641392846);
      }

      class89.field1255 = 0;
      class89.field1257[++class89.field1255 - 1] = i_2;
      class89.field1252[i_2] = 0;
      class89.field1251 = 0;

      for (int i_8 = 1; i_8 < 2048; i_8++) {
         if (i_8 != i_2) {
            int i_9 = buffer3_0.method5445(18);
            int i_10 = i_9 >> 16;
            int i_11 = i_9 >> 8 & 0x255;
            int i_12 = i_9 & 0x255;
            class89.field1253[i_8] = (i_11 << 14) + i_12 + (i_10 << 28);
            class89.field1260[i_8] = 0;
            class89.field1261[i_8] = -1;
            class89.field1258[++class89.field1251 - 1] = i_8;
            class89.field1252[i_8] = 0;
         }
      }

      buffer3_0.method5446();
   }

   static int method239(int i_0, class92 class92_1, boolean bool_2, byte b_3) {
      int i_4;
      if (i_0 == 5504) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         int i_5 = class76.field1098[class70.field1014 + 1];
         if (!Client.field899) {
            Client.field721 = i_4;
            Client.field722 = i_5;
         }

         return 1;
      } else if (i_0 == 5505) {
         class76.field1098[++class70.field1014 - 1] = Client.field721;
         return 1;
      } else if (i_0 == 5506) {
         class76.field1098[++class70.field1014 - 1] = Client.field722;
         return 1;
      } else if (i_0 == 5530) {
         i_4 = class76.field1098[--class70.field1014];
         if (i_4 < 0) {
            i_4 = 0;
         }

         Client.field728 = i_4;
         return 1;
      } else if (i_0 == 5531) {
         class76.field1098[++class70.field1014 - 1] = Client.field728;
         return 1;
      } else {
         return 2;
      }
   }

   static int method242(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      if (i_0 == 6200) {
         class70.field1014 -= 2;
         Client.field782 = (short)class59.method1116(class76.field1098[class70.field1014], -1225456641);
         if (Client.field782 <= 0) {
            Client.field782 = 256;
         }

         Client.field651 = (short)class59.method1116(class76.field1098[class70.field1014 + 1], -1873104061);
         if (Client.field651 <= 0) {
            Client.field651 = 256;
         }

         return 1;
      } else if (i_0 == 6201) {
         class70.field1014 -= 2;
         Client.field906 = (short)class76.field1098[class70.field1014];
         if (Client.field906 <= 0) {
            Client.field906 = 256;
         }

         Client.field908 = (short)class76.field1098[class70.field1014 + 1];
         if (Client.field908 <= 0) {
            Client.field908 = 320;
         }

         return 1;
      } else if (i_0 == 6202) {
         class70.field1014 -= 4;
         Client.field820 = (short)class76.field1098[class70.field1014];
         if (Client.field820 <= 0) {
            Client.field820 = 1;
         }

         Client.field790 = (short)class76.field1098[class70.field1014 + 1];
         if (Client.field790 <= 0) {
            Client.field790 = 32767;
         } else if (Client.field790 < Client.field820) {
            Client.field790 = Client.field820;
         }

         Client.field732 = (short)class76.field1098[class70.field1014 + 2];
         if (Client.field732 <= 0) {
            Client.field732 = 1;
         }

         Client.field659 = (short)class76.field1098[class70.field1014 + 3];
         if (Client.field659 <= 0) {
            Client.field659 = 32767;
         } else if (Client.field659 < Client.field732) {
            Client.field659 = Client.field732;
         }

         return 1;
      } else if (i_0 == 6203) {
         if (Client.field827 != null) {
            class144.method3318(0, 0, Client.field827.field2579, Client.field827.field2667, false, (byte) -24);
            class76.field1098[++class70.field1014 - 1] = Client.field746;
            class76.field1098[++class70.field1014 - 1] = Client.field714;
         } else {
            class76.field1098[++class70.field1014 - 1] = -1;
            class76.field1098[++class70.field1014 - 1] = -1;
         }

         return 1;
      } else if (i_0 == 6204) {
         class76.field1098[++class70.field1014 - 1] = Client.field906;
         class76.field1098[++class70.field1014 - 1] = Client.field908;
         return 1;
      } else if (i_0 == 6205) {
         class76.field1098[++class70.field1014 - 1] = class232.method4140(Client.field782, 616247304);
         class76.field1098[++class70.field1014 - 1] = class232.method4140(Client.field651, -1125712705);
         return 1;
      } else {
         return 2;
      }
   }

}
