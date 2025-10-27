public class class281 {

   public static final class281 field3637 = new class281();
   public static final class281 field3638 = new class281();
   public static final class281 field3639 = new class281();

   static void method5180(String string_0, boolean bool_1) {
      if (Client.field784) {
         byte b_3 = 4;
         int i_4 = b_3 + 6;
         int i_5 = b_3 + 6;
         int i_6 = class169.field2054.method5343(string_0, 250);
         int i_7 = class169.field2054.method5390(string_0, 250) * 13;
         Rasterizer2D.fillRectangle(i_4 - b_3, i_5 - b_3, b_3 + i_6 + b_3, i_7 + b_3 + b_3, 0);
         Rasterizer2D.drawRectangle(i_4 - b_3, i_5 - b_3, i_6 + b_3 + b_3, i_7 + b_3 + b_3, 16777215);
         class169.field2054.method5350(string_0, i_4, i_5, i_6, i_7, 16777215, -1, 1, 1, 0);
         UserComparator10.method2215(i_4 - b_3, i_5 - b_3, b_3 + i_6 + b_3, b_3 + i_7 + b_3);
         if (bool_1) {
            class202.field2486.vmethod6077(0, 0);
         } else {

            for (int i_12 = 0; i_12 < Client.field858; i_12++) {
               if (Client.field808[i_12] + Client.field865[i_12] > i_4 && Client.field808[i_12] < i_4 + i_6 && Client.field864[i_12] + Client.field860[i_12] > i_5 && Client.field864[i_12] < i_7 + i_5) {
                  Client.field861[i_12] = true;
               }
            }
         }

      }
   }

}
