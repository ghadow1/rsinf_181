public class class132 extends class180 {

   static int field1800;
   int field1799;
   int field1797;
   int[] field1798;
   int[][] field1796;

   class132(int i_1, byte[] bytes_2) {
      this.field1799 = i_1;
      ByteBuffer class300_3 = new ByteBuffer(bytes_2);
      this.field1797 = class300_3.readUnsignedByte();
      this.field1798 = new int[this.field1797];
      this.field1796 = new int[this.field1797][];

      int i_4;
      for (i_4 = 0; i_4 < this.field1797; i_4++) {
         this.field1798[i_4] = class300_3.readUnsignedByte();
      }

      for (i_4 = 0; i_4 < this.field1797; i_4++) {
         this.field1796[i_4] = new int[class300_3.readUnsignedByte()];
      }

      for (i_4 = 0; i_4 < this.field1797; i_4++) {
         for (int i_5 = 0; i_5 < this.field1796[i_4].length; i_5++) {
            this.field1796[i_4][i_5] = class300_3.readUnsignedByte();
         }
      }

   }

   static int method3064(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      int i_4;
      int i_5;
      if (i_0 == 100) {
         class70.field1014 -= 3;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         int i_6 = class76.field1098[class70.field1014 + 2];
         if (i_5 == 0) {
            throw new RuntimeException();
         } else {
            class217 class217_7 = class80.fetchSomething(i_4);
            if (class217_7.field2675 == null) {
               class217_7.field2675 = new class217[i_6 + 1];
            }

            if (class217_7.field2675.length <= i_6) {
               class217[] arr_8 = new class217[i_6 + 1];

               for (int i_9 = 0; i_9 < class217_7.field2675.length; i_9++) {
                  arr_8[i_9] = class217_7.field2675[i_9];
               }

               class217_7.field2675 = arr_8;
            }

            if (i_6 > 0 && class217_7.field2675[i_6 - 1] == null) {
               throw new RuntimeException("" + (i_6 - 1));
            } else {
               class217 class217_13 = new class217();
               class217_13.field2566 = i_5;
               class217_13.field2583 = class217_13.field2688 = class217_7.field2688;
               class217_13.field2565 = i_6;
               class217_13.field2563 = true;
               class217_7.field2675[i_6] = class217_13;
               if (bool_2) {
                  class76.field1111 = class217_13;
               } else {
                  class207.field2507 = class217_13;
               }

               class224.method4120(class217_7);
               return 1;
            }
         }
      } else {
         class217 class217_10;
         if (i_0 == 101) {
            class217_10 = bool_2 ? class76.field1111 : class207.field2507;
            class217 class217_11 = class80.fetchSomething(class217_10.field2688);
            class217_11.field2675[class217_10.field2565] = null;
            class224.method4120(class217_11);
            return 1;
         } else if (i_0 == 102) {
            class217_10 = class80.fetchSomething(class76.field1098[--class70.field1014]);
            class217_10.field2675 = null;
            class224.method4120(class217_10);
            return 1;
         } else if (i_0 != 200) {
            if (i_0 == 201) {
               class217_10 = class80.fetchSomething(class76.field1098[--class70.field1014]);
               if (class217_10 != null) {
                  class76.field1098[++class70.field1014 - 1] = 1;
                  if (bool_2) {
                     class76.field1111 = class217_10;
                  } else {
                     class207.field2507 = class217_10;
                  }
               } else {
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class70.field1014 -= 2;
            i_4 = class76.field1098[class70.field1014];
            i_5 = class76.field1098[class70.field1014 + 1];
            class217 class217_12 = client.method1649(i_4, i_5, -1082310666);
            if (class217_12 != null && i_5 != -1) {
               class76.field1098[++class70.field1014 - 1] = 1;
               if (bool_2) {
                  class76.field1111 = class217_12;
               } else {
                  class207.field2507 = class217_12;
               }
            } else {
               class76.field1098[++class70.field1014 - 1] = 0;
            }

            return 1;
         }
      }
   }

   public static int method3063(ByteBuffer class300_0, String string_1, int i_2) {
      int i_3 = class300_0.position;
      int i_5 = string_1.length();
      byte[] bytes_6 = new byte[i_5];

      for (int i_7 = 0; i_7 < i_5; i_7++) {
         char var_8 = string_1.charAt(i_7);
         if (var_8 > 0 && var_8 < 128 || var_8 >= 160 && var_8 <= 255) {
            bytes_6[i_7] = (byte)var_8;
         } else if (var_8 == 8364) {
            bytes_6[i_7] = -128;
         } else if (var_8 == 8218) {
            bytes_6[i_7] = -126;
         } else if (var_8 == 402) {
            bytes_6[i_7] = -125;
         } else if (var_8 == 8222) {
            bytes_6[i_7] = -124;
         } else if (var_8 == 8230) {
            bytes_6[i_7] = -123;
         } else if (var_8 == 8224) {
            bytes_6[i_7] = -122;
         } else if (var_8 == 8225) {
            bytes_6[i_7] = -121;
         } else if (var_8 == 710) {
            bytes_6[i_7] = -120;
         } else if (var_8 == 8240) {
            bytes_6[i_7] = -119;
         } else if (var_8 == 352) {
            bytes_6[i_7] = -118;
         } else if (var_8 == 8249) {
            bytes_6[i_7] = -117;
         } else if (var_8 == 338) {
            bytes_6[i_7] = -116;
         } else if (var_8 == 381) {
            bytes_6[i_7] = -114;
         } else if (var_8 == 8216) {
            bytes_6[i_7] = -111;
         } else if (var_8 == 8217) {
            bytes_6[i_7] = -110;
         } else if (var_8 == 8220) {
            bytes_6[i_7] = -109;
         } else if (var_8 == 8221) {
            bytes_6[i_7] = -108;
         } else if (var_8 == 8226) {
            bytes_6[i_7] = -107;
         } else if (var_8 == 8211) {
            bytes_6[i_7] = -106;
         } else if (var_8 == 8212) {
            bytes_6[i_7] = -105;
         } else if (var_8 == 732) {
            bytes_6[i_7] = -104;
         } else if (var_8 == 8482) {
            bytes_6[i_7] = -103;
         } else if (var_8 == 353) {
            bytes_6[i_7] = -102;
         } else if (var_8 == 8250) {
            bytes_6[i_7] = -101;
         } else if (var_8 == 339) {
            bytes_6[i_7] = -100;
         } else if (var_8 == 382) {
            bytes_6[i_7] = -98;
         } else if (var_8 == 376) {
            bytes_6[i_7] = -97;
         } else {
            bytes_6[i_7] = 63;
         }
      }

      class300_0.method5492(bytes_6.length, (byte) 38);
      class300_0.position += class210.field2515.method3942(bytes_6, 0, bytes_6.length, class300_0.buffer, class300_0.position, -1706453276);
      return class300_0.position - i_3;
   }

}
