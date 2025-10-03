public class class281 {

   public static final class281 field3637 = new class281();
   public static final class281 field3638 = new class281();
   public static final class281 field3639 = new class281();

   static final void method5180(String string_0, boolean bool_1, int i_2) {
      if (Client.field784) {
         byte b_3 = 4;
         int i_4 = b_3 + 6;
         int i_5 = b_3 + 6;
         int i_6 = class169.field2054.method5343(string_0, 250);
         int i_7 = class169.field2054.method5390(string_0, 250) * 13;
         class321.fillRectangle(i_4 - b_3, i_5 - b_3, b_3 + i_6 + b_3, i_7 + b_3 + b_3, 0);
         class321.drawRectangle(i_4 - b_3, i_5 - b_3, i_6 + b_3 + b_3, i_7 + b_3 + b_3, 16777215);
         class169.field2054.method5350(string_0, i_4, i_5, i_6, i_7, 16777215, -1, 1, 1, 0);
         UserComparator10.method2215(i_4 - b_3, i_5 - b_3, b_3 + i_6 + b_3, b_3 + i_7 + b_3);
         if (bool_1) {
            class202.field2486.vmethod6077(0, 0, -348130543);
         } else {
            int i_8 = i_4;
            int i_9 = i_5;
            int i_10 = i_6;
            int i_11 = i_7;

            for (int i_12 = 0; i_12 < Client.field858; i_12++) {
               if (Client.field808[i_12] + Client.field865[i_12] > i_8 && Client.field808[i_12] < i_8 + i_10 && Client.field864[i_12] + Client.field860[i_12] > i_9 && Client.field864[i_12] < i_11 + i_9) {
                  Client.field861[i_12] = true;
               }
            }
         }

      }
   }

}
