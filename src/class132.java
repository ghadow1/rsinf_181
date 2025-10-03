public class class132 extends LinkedListNode {

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

   static int method3064(int i_0, boolean bool_2) {
      int i_4;
      int i_5;
      if (i_0 == 100) {
         class70.field1014 -= 3;
         i_4 = MouseRecorder.field1098[class70.field1014];
         i_5 = MouseRecorder.field1098[class70.field1014 + 1];
         int i_6 = MouseRecorder.field1098[class70.field1014 + 2];
         if (i_5 == 0) {
            throw new RuntimeException();
         } else {
            Widget widget_7 = WorldMapElement.getWidget(i_4);
            if (widget_7.field2675 == null) {
               widget_7.field2675 = new Widget[i_6 + 1];
            }

            if (widget_7.field2675.length <= i_6) {
               Widget[] arr_8 = new Widget[i_6 + 1];

               for (int i_9 = 0; i_9 < widget_7.field2675.length; i_9++) {
                  arr_8[i_9] = widget_7.field2675[i_9];
               }

               widget_7.field2675 = arr_8;
            }

            if (i_6 > 0 && widget_7.field2675[i_6 - 1] == null) {
               throw new RuntimeException("" + (i_6 - 1));
            } else {
               Widget widget_13 = new Widget();
               widget_13.field2566 = i_5;
               widget_13.field2583 = widget_13.field2688 = widget_7.field2688;
               widget_13.field2565 = i_6;
               widget_13.field2563 = true;
               widget_7.field2675[i_6] = widget_13;
               if (bool_2) {
                  MouseRecorder.field1111 = widget_13;
               } else {
                  class207.field2507 = widget_13;
               }

               FriendSystem.invalidateWidget(widget_7);
               return 1;
            }
         }
      } else {
         Widget widget_10;
         if (i_0 == 101) {
            widget_10 = bool_2 ? MouseRecorder.field1111 : class207.field2507;
            Widget widget_11 = WorldMapElement.getWidget(widget_10.field2688);
            widget_11.field2675[widget_10.field2565] = null;
            FriendSystem.invalidateWidget(widget_11);
            return 1;
         } else if (i_0 == 102) {
            widget_10 = WorldMapElement.getWidget(MouseRecorder.field1098[--class70.field1014]);
            widget_10.field2675 = null;
            FriendSystem.invalidateWidget(widget_10);
            return 1;
         } else if (i_0 != 200) {
            if (i_0 == 201) {
               widget_10 = WorldMapElement.getWidget(MouseRecorder.field1098[--class70.field1014]);
               if (widget_10 != null) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 1;
                  if (bool_2) {
                     MouseRecorder.field1111 = widget_10;
                  } else {
                     class207.field2507 = widget_10;
                  }
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class70.field1014 -= 2;
            i_4 = MouseRecorder.field1098[class70.field1014];
            i_5 = MouseRecorder.field1098[class70.field1014 + 1];
            Widget widget_12 = Client.method1649(i_4, i_5);
            if (widget_12 != null && i_5 != -1) {
               MouseRecorder.field1098[++class70.field1014 - 1] = 1;
               if (bool_2) {
                  MouseRecorder.field1111 = widget_12;
               } else {
                  class207.field2507 = widget_12;
               }
            } else {
               MouseRecorder.field1098[++class70.field1014 - 1] = 0;
            }

            return 1;
         }
      }
   }

   public static int encodeStringCp1252(ByteBuffer class300_0, String string_1, int i_2) {
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

      class300_0.writeSmartShort(bytes_6.length);
      class300_0.position += class210.field2515.method3942(bytes_6, 0, bytes_6.length, class300_0.buffer, class300_0.position);
      return class300_0.position - i_3;
   }

}
