public class class271 {

   static final class271 field3589 = new class271("8");
   static final class271 field3582 = new class271("15");
   static final class271 field3583 = new class271("7");
   static final class271 field3591 = new class271("10");
   static final class271 field3585 = new class271("16");
   static final class271 field3581 = new class271("12");
   static final class271 field3584 = new class271("3");
   static final class271 field3588 = new class271("6");
   static final class271 field3600 = new class271("17");
   static final class271 field3593 = new class271("5");
   static final class271 field3590 = new class271("9");
   static final class271 field3592 = new class271("14");
   public static final class271 field3587 = new class271("18");
   public static final class271 field3594 = new class271("13");
   static final class271 field3595 = new class271("4");
   static final class271 field3596 = new class271("1");
   static final class271 field3586 = new class271("11");
   static final class271 field3598 = new class271("2");
   static final class271 field3599 = new class271("19");
   public final String field3597;

   class271(String string_2) {
      this.field3597 = string_2;
   }

   public static double[] method4992(double d_0, double d_2, int i_4, int i_5) {
      int i_6 = i_4 * 2 + 1;
      double[] doubles_7 = new double[i_6];
      int i_8 = -i_4;

      for (int i_9 = 0; i_8 <= i_4; i_9++) {
         double d_12 = method4991(((double)i_8 - d_0) / d_2) / d_2;
         doubles_7[i_9] = d_12;
         ++i_8;
      }

      return doubles_7;
   }

   static double method4991(double d_0) {
      return Math.exp(-d_0 * d_0 / 2.0D) / Math.sqrt(6.283185307179586D);
   }

}
