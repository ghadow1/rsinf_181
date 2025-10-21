public class RenderableSceneNode {

   public static final RenderableSceneNode field2322 = new RenderableSceneNode();
   public static final RenderableSceneNode projectileNode = new RenderableSceneNode();
   public static final RenderableSceneNode clearItem = new RenderableSceneNode();
   public static final RenderableSceneNode field2317 = new RenderableSceneNode();
   public static final RenderableSceneNode field2324 = new RenderableSceneNode();
   public static final RenderableSceneNode field2319 = new RenderableSceneNode();
   public static final RenderableSceneNode field2320 = new RenderableSceneNode();
   public static final RenderableSceneNode field2321 = new RenderableSceneNode();
   public static final RenderableSceneNode field2315 = new RenderableSceneNode();
   public static final RenderableSceneNode field2323 = new RenderableSceneNode();

   RenderableSceneNode() {
   }

   static void method3617(byte[] bytes_0) {
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

   public static boolean method3615(char var_0) {
      return var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
   }

}
