public class class28 {

   String field237;
   int field236;
   int field238;
   class17 field239;

   class28(String string_1, int i_2, int i_3, class17 class17_4) {
      this.field237 = string_1;
      this.field236 = i_2;
      this.field238 = i_3;
      this.field239 = class17_4;
   }

   static String method417(int i_0, byte b_1) {
      return i_0 < 0 ? "" : (Client.field668[i_0].length() > 0 ? Client.field796[i_0] + " " + Client.field668[i_0] : Client.field796[i_0]);
   }

   static int method420(long long_0) {
      return (int)(long_0 >>> 14 & 0x3L);
   }

   public static void method418(int i_0, int i_1, int i_2, boolean bool_3, int i_4) {
      class187 class187_5 = class235.method4265(class183.field2296, Client.field880.field1313, 1775123545);
      class187_5.outBuffer.writeIntReversed(bool_3 ? Client.field855 : 0);
      class187_5.outBuffer.writeShortLittleEndian(i_1);
      class187_5.outBuffer.writeNegatedByte(i_2);
      class187_5.outBuffer.writeShortBigEndian(i_0);
      Client.field880.copy(class187_5);
   }

   static final void method419(ByteBuffer class300_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      int i_8;
      if (i_2 >= 0 && i_2 < 104 && i_3 >= 0 && i_3 < 104) {
         class55.field502[i_1][i_2][i_3] = 0;

         while (true) {
            i_8 = class300_0.readUnsignedByte();
            if (i_8 == 0) {
               if (i_1 == 0) {
                  class55.field516[0][i_2][i_3] = -class1.method14(i_4 + 932731 + i_2, i_3 + 556238 + i_5, (byte) 84) * 8;
               } else {
                  class55.field516[i_1][i_2][i_3] = class55.field516[i_1 - 1][i_2][i_3] - 240;
               }
               break;
            }

            if (i_8 == 1) {
               int i_9 = class300_0.readUnsignedByte();
               if (i_9 == 1) {
                  i_9 = 0;
               }

               if (i_1 == 0) {
                  class55.field516[0][i_2][i_3] = -i_9 * 8;
               } else {
                  class55.field516[i_1][i_2][i_3] = class55.field516[i_1 - 1][i_2][i_3] - i_9 * 8;
               }
               break;
            }

            if (i_8 <= 49) {
               class55.field505[i_1][i_2][i_3] = class300_0.readSignedByte();
               class55.field506[i_1][i_2][i_3] = (byte)((i_8 - 2) / 4);
               class268.field3561[i_1][i_2][i_3] = (byte)(i_8 - 2 + i_6 & 0x3);
            } else if (i_8 <= 81) {
               class55.field502[i_1][i_2][i_3] = (byte)(i_8 - 49);
            } else {
               class55.field504[i_1][i_2][i_3] = (byte)(i_8 - 81);
            }
         }
      } else {
         while (true) {
            i_8 = class300_0.readUnsignedByte();
            if (i_8 == 0) {
               break;
            }

            if (i_8 == 1) {
               class300_0.readUnsignedByte();
               break;
            }

            if (i_8 <= 49) {
               class300_0.readUnsignedByte();
            }
         }
      }

   }

}
