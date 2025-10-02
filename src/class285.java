public class class285 extends class277 {

   static class324[] field3660;
   public String field3655 = null;
   public String field3656 = null;
   int field3659 = 1;
   final class338 field3658;
   final class280 field3652;
   public int field3653;
   public byte field3657;

   public class285(class338 class338_1, class280 class280_2) {
      super(100);
      this.field3658 = class338_1;
      this.field3652 = class280_2;
   }

   final void method5232(String string_1, int i_2) {
      this.field3656 = class242.method4403(string_1, (short) -32757);
   }

   class274 vmethod5229(int i_1) {
      return new class273();
   }

   final void method5231(String string_1, int i_2) {
      this.field3655 = class242.method4403(string_1, (short) -21709);
   }

   class274[] vmethod5230(int i_1, int i_2) {
      return new class273[i_1];
   }

   public final void method5228(int i_1) {
      for (int i_2 = 0; i_2 < this.method5079(436582529); i_2++) {
         ((class273) this.method5151(i_2, 497000028)).method5018(1319461047);
      }

   }

   public final void method5235(int i_1) {
      for (int i_2 = 0; i_2 < this.method5079(258332919); i_2++) {
         ((class273) this.method5151(i_2, -1818852723)).method5020(-1980920067);
      }

   }

   final void method5237(class273 class273_1, int i_2) {
      if (class273_1.method5041(-156755920).equals(this.field3652.vmethod5179((byte) -19))) {
         this.field3653 = class273_1.field3634;
      }

   }

   public final void method5233(class300 class300_1, int i_2) {
      this.method5232(class300_1.method5503(-231155257), 537403926);
      long long_3 = class300_1.method5531((byte) 18);
      this.method5231(class126.method2855(long_3), -1948396413);
      this.field3657 = class300_1.method5495();
      int i_5 = class300_1.method5504((byte) 99);
      if (i_5 != 255) {
         this.method5096(1361883918);

         for (int i_6 = 0; i_6 < i_5; i_6++) {
            class273 class273_7 = (class273) this.method5087(new class283(class300_1.method5503(-231155257), this.field3658), (byte) -19);
            int i_8 = class300_1.method5496(-1459053594);
            class273_7.method5163(i_8, ++this.field3659 - 1, -1729653997);
            class273_7.field3634 = class300_1.method5495();
            class300_1.method5503(-231155257);
            this.method5237(class273_7, 1755545327);
         }

      }
   }

   public final void method5234(class300 class300_1, int i_2) {
      class283 class283_3 = new class283(class300_1.method5503(-231155257), this.field3658);
      int i_4 = class300_1.method5496(-1459053594);
      byte b_5 = class300_1.method5495();
      boolean bool_6 = false;
      if (b_5 == -128) {
         bool_6 = true;
      }

      class273 class273_7;
      if (bool_6) {
         if (this.method5079(1572254134) == 0) {
            return;
         }

         class273_7 = (class273) this.method5138(class283_3, 2083171527);
         if (class273_7 != null && class273_7.method5164(212736889) == i_4) {
            this.method5086(class273_7, 951866693);
         }
      } else {
         class300_1.method5503(-231155257);
         class273_7 = (class273) this.method5138(class283_3, 2083171527);
         if (class273_7 == null) {
            if (this.method5079(598016373) > super.field3627) {
               return;
            }

            class273_7 = (class273) this.method5087(class283_3, (byte) -80);
         }

         class273_7.method5163(i_4, ++this.field3659 - 1, -235684888);
         class273_7.field3634 = b_5;
         this.method5237(class273_7, 1755545327);
      }

   }

}
