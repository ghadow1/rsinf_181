public class class41 {

   static int field359;
   public int field355;
   public class213 field357;
   public class213 field354;

   public class41(int i_1, class213 class213_2, class213 class213_3) {
      this.field355 = i_1;
      this.field357 = class213_2;
      this.field354 = class213_3;
   }

   static final void method737(int i_0) {
      Object obj_10000 = null;
      String str_1 = "You can\'t add yourself to your own ignore list";
      class62.method1132(30, "", str_1, -2087358273);
   }

   static final void method736(class299 class299_0, int i_1, class66 class66_2, int i_3, int i_4) {
      byte b_5 = -1;
      int i_6;
      int i_7;
      int i_9;
      int i_10;
      int i_13;
      if ((i_3 & 0x40) != 0) {
         i_6 = class299_0.method5722(1885742813);
         int i_8;
         int i_11;
         int i_12;
         if (i_6 > 0) {
            for (i_7 = 0; i_7 < i_6; i_7++) {
               i_9 = -1;
               i_10 = -1;
               i_11 = -1;
               i_8 = class299_0.method5508(497319136);
               if (i_8 == 32767) {
                  i_8 = class299_0.method5508(497319136);
                  i_10 = class299_0.method5508(497319136);
                  i_9 = class299_0.method5508(497319136);
                  i_11 = class299_0.method5508(497319136);
               } else if (i_8 != 32766) {
                  i_10 = class299_0.method5508(497319136);
               } else {
                  i_8 = -1;
               }

               i_12 = class299_0.method5508(497319136);
               class66_2.method1657(i_8, i_10, i_9, i_11, client.field881, i_12, -13467582);
            }
         }

         i_7 = class299_0.method5524((byte) -126);
         if (i_7 > 0) {
            for (i_8 = 0; i_8 < i_7; i_8++) {
               i_9 = class299_0.method5508(497319136);
               i_10 = class299_0.method5508(497319136);
               if (i_10 != 32767) {
                  i_11 = class299_0.method5508(497319136);
                  i_12 = class299_0.method5722(1716330151);
                  i_13 = i_10 > 0 ? class299_0.method5504((byte) 27) : i_12;
                  class66_2.method1655(i_9, client.field881, i_10, i_11, i_12, i_13, (byte) 52);
               } else {
                  class66_2.method1659(i_9, 1541896355);
               }
            }
         }
      }

      if ((i_3 & 0x200) != 0) {
         class66_2.field986 = class299_0.method5534(-2031295382);
         i_6 = class299_0.method5542((byte) 87);
         class66_2.field990 = i_6 >> 16;
         class66_2.field989 = (i_6 & 0xffff) + client.field881;
         class66_2.field987 = 0;
         class66_2.field988 = 0;
         if (class66_2.field989 > client.field881) {
            class66_2.field987 = -1;
         }

         if (class66_2.field986 == 65535) {
            class66_2.field986 = -1;
         }
      }

      if ((i_3 & 0x1000) != 0) {
         b_5 = class299_0.method5694(1943789766);
      }

      if ((i_3 & 0x400) != 0) {
         class66_2.field991 = class299_0.method5528(-166242071);
         class66_2.field993 = class299_0.method5694(-1916852717);
         class66_2.field992 = class299_0.method5694(1689389617);
         class66_2.field983 = class299_0.method5528(-166242071);
         class66_2.field995 = class299_0.method5518((byte) 0) + client.field881;
         class66_2.field996 = class299_0.method5532((byte) 118) + client.field881;
         class66_2.field997 = class299_0.method5496(-1459053594);
         if (class66_2.field638) {
            class66_2.field991 += class66_2.field639;
            class66_2.field993 += class66_2.field640;
            class66_2.field992 += class66_2.field639;
            class66_2.field983 += class66_2.field640;
            class66_2.field1003 = 0;
         } else {
            class66_2.field991 += class66_2.field994[0];
            class66_2.field993 += class66_2.field962[0];
            class66_2.field992 += class66_2.field994[0];
            class66_2.field983 += class66_2.field962[0];
            class66_2.field1003 = 1;
         }

         class66_2.field1008 = 0;
      }

      if ((i_3 & 0x20) != 0) {
         class66_2.field977 = class299_0.method5503(-231155257);
         if (class66_2.field977.charAt(0) == 126) {
            class66_2.field977 = class66_2.field977.substring(1);
            class62.method1132(2, class66_2.field621.method5197((byte) 51), class66_2.field977, -2101795865);
         } else if (class66_2 == client.field657) {
            class62.method1132(2, class66_2.field621.method5197((byte) 62), class66_2.field977, -2114277383);
         }

         class66_2.field963 = false;
         class66_2.field966 = 0;
         class66_2.field982 = 0;
         class66_2.field1002 = 150;
      }

      if ((i_3 & 0x4) != 0) {
         class66_2.field976 = class299_0.method5532((byte) 46);
         if (class66_2.field1003 == 0) {
            class66_2.field1000 = class66_2.field976;
            class66_2.field976 = -1;
         }
      }

      if ((i_3 & 0x1) != 0) {
         i_6 = class299_0.method5525(1184955181);
         byte[] bytes_14 = new byte[i_6];
         class300 class300_15 = new class300(bytes_14);
         class299_0.method5544(bytes_14, 0, i_6, -467001406);
         class89.field1254[i_1] = class300_15;
         class66_2.method1179(class300_15, -776146380);
      }

      if ((i_3 & 0x2) != 0) {
         class66_2.field975 = class299_0.method5518((byte) 0);
         if (class66_2.field975 == 65535) {
            class66_2.field975 = -1;
         }
      }

      if ((i_3 & 0x800) != 0) {
         class89.field1250[i_1] = class299_0.method5694(-882379660);
      }

      if ((i_3 & 0x10) != 0) {
         i_6 = class299_0.method5518((byte) 0);
         class228 class228_20 = (class228) class107.method2476(class156.method3419(390349850), class299_0.method5504((byte) 52), (byte) 0);
         boolean bool_18 = class299_0.method5524((byte) -116) == 1;
         i_9 = class299_0.method5504((byte) 81);
         i_10 = class299_0.field3732;
         if (class66_2.field621 != null && class66_2.field613 != null) {
            boolean bool_19 = false;
            if (class228_20.field3092 && class58.field546.method1765(class66_2.field621, (byte) -1)) {
               bool_19 = true;
            }

            if (!bool_19 && client.field767 == 0 && !class66_2.field628) {
               class89.field1264.field3732 = 0;
               class299_0.method5697(class89.field1264.field3730, 0, i_9, (byte) 1);
               class89.field1264.field3732 = 0;
               String string_16 = class296.method5362(class1.method17(class311.method5898(class89.field1264, (byte) 23), (byte) -16));
               class66_2.field977 = string_16.trim();
               class66_2.field966 = i_6 >> 8;
               class66_2.field982 = i_6 & 0xff;
               class66_2.field1002 = 150;
               class66_2.field963 = bool_18;
               class66_2.field998 = class66_2 != client.field657 && class228_20.field3092 && "" != client.field762 && string_16.toLowerCase().indexOf(client.field762) == -1;
               if (class228_20.field3091) {
                  i_13 = bool_18 ? 91 : 1;
               } else {
                  i_13 = bool_18 ? 90 : 2;
               }

               if (class228_20.field3090 != -1) {
                  class62.method1132(i_13, class33.method556(class228_20.field3090, (byte) 66) + class66_2.field621.method5197((byte) 113), string_16, -2085086030);
               } else {
                  class62.method1132(i_13, class66_2.field621.method5197((byte) 121), string_16, -2116827582);
               }
            }
         }

         class299_0.field3732 = i_10 + i_9;
      }

      if ((i_3 & 0x100) != 0) {
         for (i_6 = 0; i_6 < 3; i_6++) {
            class66_2.field619[i_6] = class299_0.method5503(-231155257);
         }
      }

      if ((i_3 & 0x80) != 0) {
         i_6 = class299_0.method5496(-1459053594);
         if (i_6 == 65535) {
            i_6 = -1;
         }

         i_7 = class299_0.method5504((byte) 28);
         class63.method1139(class66_2, i_6, i_7, (byte) -124);
      }

      if (class66_2.field638) {
         if (b_5 == 127) {
            class66_2.method1205(class66_2.field639, class66_2.field640, 1369099765);
         } else {
            byte b_17;
            if (b_5 != -1) {
               b_17 = b_5;
            } else {
               b_17 = class89.field1250[i_1];
            }

            class66_2.method1189(class66_2.field639, class66_2.field640, b_17, (short) -30153);
         }
      }

   }

}
