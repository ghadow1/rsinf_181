public final class class145 {

   class175 field1959 = new class175();
   class265 field1962 = new class265();
   int field1961;
   int field1960;
   class316 field1958;

   public class145(int i_1) {
      this.field1961 = i_1;
      this.field1960 = i_1;

      int i_2;
      for (i_2 = 1; i_2 + i_2 < i_1; i_2 += i_2) {
         ;
      }

      this.field1958 = new class316(i_2);
   }

   public class175 method3320(long long_1) {
      class175 class175_3 = (class175) this.field1958.method5924(long_1);
      if (class175_3 != null) {
         this.field1962.method4950(class175_3);
      }

      return class175_3;
   }

   public void method3322(class175 class175_1, long long_2) {
      if (this.field1960 == 0) {
         class175 class175_4 = this.field1962.method4952();
         class175_4.unlink();
         class175_4.method3597();
         if (class175_4 == this.field1959) {
            class175_4 = this.field1962.method4952();
            class175_4.unlink();
            class175_4.method3597();
         }
      } else {
         --this.field1960;
      }

      this.field1958.method5938(class175_1, long_2);
      this.field1962.method4950(class175_1);
   }

   public void method3323() {
      this.field1962.method4949();
      this.field1958.method5926();
      this.field1959 = new class175();
      this.field1960 = this.field1961;
   }

   public void method3328(long long_1) {
      class175 class175_3 = (class175) this.field1958.method5924(long_1);
      if (class175_3 != null) {
         class175_3.unlink();
         class175_3.method3597();
         ++this.field1960;
      }

   }

}
