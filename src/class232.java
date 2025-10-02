import java.awt.Image;

public class class232 extends class175 {

   static Image field3125;
   byte field3122;
   class235 field3124;
   int field3121;

   static final void method4139(int i_0, int i_1, int i_2, int i_3, int i_4, byte b_5) {
      class12.field82[0].method6101(i_0, i_1);
      class12.field82[1].method6101(i_0, i_3 + i_1 - 16);
      class321.method6012(i_0, i_1 + 16, 16, i_3 - 32, Client.field715);
      int i_6 = i_3 * (i_3 - 32) / i_4;
      if (i_6 < 8) {
         i_6 = 8;
      }

      int i_7 = (i_3 - 32 - i_6) * i_2 / (i_4 - i_3);
      class321.method6012(i_0, i_7 + i_1 + 16, 16, i_6, Client.field716);
      class321.method6000(i_0, i_7 + i_1 + 16, i_6, Client.field772);
      class321.method6000(i_0 + 1, i_7 + i_1 + 16, i_6, Client.field772);
      class321.method6010(i_0, i_7 + i_1 + 16, 16, Client.field772);
      class321.method6010(i_0, i_7 + i_1 + 17, 16, Client.field772);
      class321.method6000(i_0 + 15, i_7 + i_1 + 16, i_6, Client.field720);
      class321.method6000(i_0 + 14, i_7 + i_1 + 17, i_6 - 1, Client.field720);
      class321.method6010(i_0, i_7 + i_6 + i_1 + 15, 16, Client.field720);
      class321.method6010(i_0 + 1, i_6 + i_7 + i_1 + 14, 15, Client.field720);
   }

   static int method4140(int i_0, int i_1) {
      return (int)((Math.log((double)i_0) / class76.field1110 - 7.0D) * 256.0D);
   }

}
