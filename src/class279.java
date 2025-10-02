public class class279 extends class274 {

   static long field3632;
   public int field3634;
   public int field3636 = -1;
   public int field3633;

   public boolean method5168(byte b_1) {
      return this.field3636 > 0;
   }

   public int method5164(int i_1) {
      return this.field3636;
   }

   void method5163(int i_1, int i_2, int i_3) {
      this.field3636 = i_1;
      this.field3633 = i_2;
   }

   public static int method5170(int i_0, int i_1) {
      long long_3 = class128.field1750[i_0];
      int i_2 = (int)(long_3 >>> 0 & 0x7fL);
      return i_2;
   }

   static int method5176(byte b_0) {
      if (client.field925 != null && client.field926 < client.field925.size()) {
         int i_1 = 0;

         for (int i_2 = 0; i_2 <= client.field926; i_2++) {
            i_1 += ((class58) client.field925.get(i_2)).field542;
         }

         return i_1 * 10000 / client.field927;
      } else {
         return 10000;
      }
   }

}
