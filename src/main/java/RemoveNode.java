public class RemoveNode {

   public static final RemoveNode field2322 = new RemoveNode(7);
   public static final RemoveNode field2316 = new RemoveNode(15);
   public static final RemoveNode clearItem = new RemoveNode(14);
   public static final RemoveNode field2317 = new RemoveNode(6);
   public static final RemoveNode field2324 = new RemoveNode(4);
   public static final RemoveNode field2319 = new RemoveNode(5);
   public static final RemoveNode field2320 = new RemoveNode(2);
   public static final RemoveNode field2321 = new RemoveNode(3);
   public static final RemoveNode field2315 = new RemoveNode(5);
   public static final RemoveNode field2323 = new RemoveNode(4);

   RemoveNode(int i_1) {
   }

   static void method3617(byte[] bytes_0, byte b_1) {
      ByteBuffer class300_2 = new ByteBuffer(bytes_0);
      class300_2.position = bytes_0.length - 2;
      class326.field3911 = class300_2.readUnsignedShort();
      class212.field2523 = new int[class326.field3911];
      class326.field3915 = new int[class326.field3911];
      class326.field3914 = new int[class326.field3911];
      class216.field2548 = new int[class326.field3911];
      class326.field3912 = new byte[class326.field3911][];
      class300_2.position = bytes_0.length - 7 - class326.field3911 * 8;
      class326.field3913 = class300_2.readUnsignedShort();
      class326.field3910 = class300_2.readUnsignedShort();
      int i_3 = (class300_2.readUnsignedByte() & 0xff) + 1;

      int i_4;
      for (i_4 = 0; i_4 < class326.field3911; i_4++) {
         class212.field2523[i_4] = class300_2.readUnsignedShort();
      }

      for (i_4 = 0; i_4 < class326.field3911; i_4++) {
         class326.field3915[i_4] = class300_2.readUnsignedShort();
      }

      for (i_4 = 0; i_4 < class326.field3911; i_4++) {
         class326.field3914[i_4] = class300_2.readUnsignedShort();
      }

      for (i_4 = 0; i_4 < class326.field3911; i_4++) {
         class216.field2548[i_4] = class300_2.readUnsignedShort();
      }

      class300_2.position = bytes_0.length - 7 - class326.field3911 * 8 - (i_3 - 1) * 3;
      class138.field1895 = new int[i_3];

      for (i_4 = 1; i_4 < i_3; i_4++) {
         class138.field1895[i_4] = class300_2.read24BitInt();
         if (class138.field1895[i_4] == 0) {
            class138.field1895[i_4] = 1;
         }
      }

      class300_2.position = 0;

      for (i_4 = 0; i_4 < class326.field3911; i_4++) {
         int i_5 = class326.field3914[i_4];
         int i_6 = class216.field2548[i_4];
         int i_7 = i_6 * i_5;
         byte[] bytes_8 = new byte[i_7];
         class326.field3912[i_4] = bytes_8;
         int i_9 = class300_2.readUnsignedByte();
         int i_10;
         if (i_9 == 0) {
            for (i_10 = 0; i_10 < i_7; i_10++) {
               bytes_8[i_10] = class300_2.readSignedByte();
            }
         } else if (i_9 == 1) {
            for (i_10 = 0; i_10 < i_5; i_10++) {
               for (int i_11 = 0; i_11 < i_6; i_11++) {
                  bytes_8[i_10 + i_11 * i_5] = class300_2.readSignedByte();
               }
            }
         }
      }

   }

   public static boolean method3615(char var_0, int i_1) {
      return var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
   }

}
