import java.util.zip.CRC32;

public class class236 {

   static long field3169;
   public static AbstractSocket field3176;
   static int field3163 = 0;
   static class318 field3165 = new class318(4096);
   public static int field3166 = 0;
   static class318 field3167 = new class318(32);
   public static int field3168 = 0;
   static class259 field3170 = new class259();
   static class318 field3180 = new class318(4096);
   public static int field3171 = 0;
   static class318 field3172 = new class318(4096);
   public static int field3164 = 0;
   static ByteBuffer field3174 = new ByteBuffer(8);
   static int field3175 = 0;
   static CRC32 field3177 = new CRC32();
   static class235[] field3173 = new class235[256];
   static byte field3181 = 0;
   public static int field3179 = 0;
   public static int field3178 = 0;

   static void method4312(int i_0, int i_1) {
      int i_3 = class23.fontBold12.method5417("Choose Option");

      int i_4;
      int i_5;
      for (i_4 = 0; i_4 < Client.menuOptionsCount; i_4++) {
         i_5 = class23.fontBold12.method5417(class28.method417(i_4));
         if (i_5 > i_3) {
            i_3 = i_5;
         }
      }

      i_3 += 8;
      i_4 = Client.menuOptionsCount * 15 + 22;
      i_5 = i_0 - i_3 / 2;
      if (i_3 + i_5 > class7.field46) {
         i_5 = class7.field46 - i_3;
      }

      if (i_5 < 0) {
         i_5 = 0;
      }

      int i_6 = i_1;
      if (i_4 + i_1 > ParamComposition.field3308) {
         i_6 = ParamComposition.field3308 - i_4;
      }

      if (i_6 < 0) {
         i_6 = 0;
      }

      class247.field3292 = i_5;
      class30.field267 = i_6;
      ItemContainer_2.field373 = i_3;
      class75.field1092 = Client.menuOptionsCount * 15 + 22;
   }

}
