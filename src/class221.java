public class class221 {

   static class325[] field2746;
   static int field2747;
   public static final boolean[] field2744 = new boolean[] {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   public static int[] field2743 = new int[99];

   static {
      int i_0 = 0;

      for (int i_1 = 0; i_1 < 99; i_1++) {
         int i_2 = i_1 + 1;
         int i_3 = (int)((double)i_2 + 300.0D * Math.pow(2.0D, (double)i_2 / 7.0D));
         i_0 += i_3;
         field2743[i_1] = i_0 / 4;
      }

   }

   static final void method4116(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      if (class162.method3445(i_0)) {
         class2.method26(Widget.field2556[i_0], -1, i_1, i_2, i_3, i_4, i_5, i_6);
      }
   }

}
