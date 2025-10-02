public final class class149 {

   class146 field1966;
   class265 field1968 = new class265();
   int field1969;
   int field1967;
   class316 field1965;

   public class149(int i_1, int i_2) {
      this.field1969 = i_1;
      this.field1967 = i_1;

      int i_3;
      for (i_3 = 1; i_3 + i_3 < i_1 && i_3 < i_2; i_3 += i_3) {
         ;
      }

      this.field1965 = new class316(i_3);
   }

   public void method3350(int i_1) {
      for (class148 class148_2 = (class148) this.field1968.method4953(); class148_2 != null; class148_2 = (class148) this.field1968.method4983()) {
         if (class148_2.vmethod3371()) {
            if (class148_2.vmethod3370() == null) {
               class148_2.unlink();
               class148_2.method3597();
               this.field1967 += class148_2.field1964;
            }
         } else if (++class148_2.field2105 > (long)i_1) {
            class150 class150_3 = new class150(class148_2.vmethod3370(), class148_2.field1964);
            this.field1965.method5938(class150_3, class148_2.hash);
            class265.method4958(class150_3, class148_2);
            class148_2.unlink();
            class148_2.method3597();
         }
      }

   }

   void method3355(long long_1) {
      class148 class148_3 = (class148) this.field1965.method5924(long_1);
      this.method3347(class148_3);
   }

   void method3347(class148 class148_1) {
      if (class148_1 != null) {
         class148_1.unlink();
         class148_1.method3597();
         this.field1967 += class148_1.field1964;
      }

   }

   public Object method3348(long long_1) {
      class148 class148_3 = (class148) this.field1965.method5924(long_1);
      if (class148_3 == null) {
         return null;
      } else {
         Object object_4 = class148_3.vmethod3370();
         if (object_4 == null) {
            class148_3.unlink();
            class148_3.method3597();
            this.field1967 += class148_3.field1964;
            return null;
         } else {
            if (class148_3.vmethod3371()) {
               class147 class147_5 = new class147(object_4, class148_3.field1964);
               this.field1965.method5938(class147_5, class148_3.hash);
               this.field1968.method4950(class147_5);
               class147_5.field2105 = 0L;
               class148_3.unlink();
               class148_3.method3597();
            } else {
               this.field1968.method4950(class148_3);
               class148_3.field2105 = 0L;
            }

            return object_4;
         }
      }
   }

   public void method3351(Object object_1, long long_2, int i_4) {
      if (i_4 > this.field1969) {
         throw new IllegalStateException();
      } else {
         this.method3355(long_2);
         this.field1967 -= i_4;

         while (this.field1967 < 0) {
            class148 class148_5 = (class148) this.field1968.method4952();
            if (class148_5 == null) {
               throw new RuntimeException("");
            }

            if (!class148_5.vmethod3371()) {
               ;
            }

            this.method3347(class148_5);
            if (this.field1966 != null) {
               this.field1966.method3338(class148_5.vmethod3370());
            }
         }

         class147 class147_6 = new class147(object_1, i_4);
         this.field1965.method5938(class147_6, long_2);
         this.field1968.method4950(class147_6);
         class147_6.field2105 = 0L;
      }
   }

   public void method3357() {
      this.field1968.method4949();
      this.field1965.method5926();
      this.field1967 = this.field1969;
   }

}
