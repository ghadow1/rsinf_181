public class class71 {

   static class71[] field1031;
   static class144 field1027;
   int field1023;
   String field1029;
   int field1025;
   int field1034;
   int field1030;
   String field1028;
   int field1032;
   static int field1022 = 0;
   static int field1024 = 0;
   static int[] field1018 = new int[] {1, 1, 1, 1};
   static int[] field1026 = new int[] {0, 1, 2, 3};

   boolean method1680(byte b_1) {
      return (0x1 & this.field1023) != 0;
   }

   boolean method1698(int i_1) {
      return (0x8 & this.field1023) != 0;
   }

   boolean method1682(int i_1) {
      return (0x2 & this.field1023) != 0;
   }

   boolean method1718(int i_1) {
      return (0x4 & this.field1023) != 0;
   }

   boolean method1688(int i_1) {
      return (0x2000000 & this.field1023) != 0;
   }

   boolean method1684(int i_1) {
      return (0x20000000 & this.field1023) != 0;
   }

   static int method1686(class299 class299_0, byte b_1) {
      int i_2 = class299_0.method5445(2, -1401650133);
      int i_3;
      if (i_2 == 0) {
         i_3 = 0;
      } else if (i_2 == 1) {
         i_3 = class299_0.method5445(5, -1341090760);
      } else if (i_2 == 2) {
         i_3 = class299_0.method5445(8, -1564010515);
      } else {
         i_3 = class299_0.method5445(11, -2021349747);
      }

      return i_3;
   }

   static class92 method1705(byte[] bytes_0, int i_1) {
      class92 class92_2 = new class92();
      class300 class300_3 = new class300(bytes_0);
      class300_3.field3732 = class300_3.field3730.length - 2;
      int i_4 = class300_3.method5496(-1459053594);
      int i_5 = class300_3.field3730.length - 2 - i_4 - 12;
      class300_3.field3732 = i_5;
      int i_6 = class300_3.method5499((byte) -116);
      class92_2.field1283 = class300_3.method5496(-1459053594);
      class92_2.field1285 = class300_3.method5496(-1459053594);
      class92_2.field1289 = class300_3.method5496(-1459053594);
      class92_2.field1290 = class300_3.method5496(-1459053594);
      int i_7 = class300_3.method5504((byte) 23);
      int i_8;
      int i_9;
      if (i_7 > 0) {
         class92_2.field1287 = class92_2.method2182(i_7, (byte) 45);

         for (i_8 = 0; i_8 < i_7; i_8++) {
            i_9 = class300_3.method5496(-1459053594);
            int i_10;
            int i_12;
            if (i_9 > 0) {
               i_12 = i_9 - 1;
               i_12 |= i_12 >>> 1;
               i_12 |= i_12 >>> 2;
               i_12 |= i_12 >>> 4;
               i_12 |= i_12 >>> 8;
               i_12 |= i_12 >>> 16;
               int i_11 = i_12 + 1;
               i_10 = i_11;
            } else {
               i_10 = 1;
            }

            class316 class316_14 = new class316(i_10);
            class92_2.field1287[i_8] = class316_14;

            while (i_9-- > 0) {
               i_12 = class300_3.method5499((byte) -2);
               int i_13 = class300_3.method5499((byte) -66);
               class316_14.method5938(new class179(i_13), (long)i_12);
            }
         }
      }

      class300_3.field3732 = 0;
      class300_3.method5476(464045050);
      class92_2.field1284 = new int[i_6];
      class92_2.field1288 = new int[i_6];
      class92_2.field1286 = new String[i_6];

      for (i_8 = 0; class300_3.field3732 < i_5; class92_2.field1284[i_8++] = i_9) {
         i_9 = class300_3.method5496(-1459053594);
         if (i_9 == 3) {
            class92_2.field1286[i_8] = class300_3.method5503(-231155257);
         } else if (i_9 < 100 && i_9 != 21 && i_9 != 38 && i_9 != 39) {
            class92_2.field1288[i_8] = class300_3.method5499((byte) -52);
         } else {
            class92_2.field1288[i_8] = class300_3.method5504((byte) 105);
         }
      }

      return class92_2;
   }

}
