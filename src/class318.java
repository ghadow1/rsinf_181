public final class class318 {

   int field3859 = 0;
   int field3861;
   class180[] field3858;
   class180 field3860;
   class180 field3862;

   public class318(int i_1) {
      this.field3861 = i_1;
      this.field3858 = new class180[i_1];

      for (int i_2 = 0; i_2 < i_1; i_2++) {
         class180 class180_3 = this.field3858[i_2] = new class180();
         class180_3.field2114 = class180_3;
         class180_3.field2112 = class180_3;
      }

   }

   public class180 method5950() {
      this.field3859 = 0;
      return this.method5953();
   }

   public class180 method5952(long long_1) {
      class180 class180_3 = this.field3858[(int)(long_1 & (long)(this.field3861 - 1))];

      for (this.field3860 = class180_3.field2114; class180_3 != this.field3860; this.field3860 = this.field3860.field2114) {
         if (this.field3860.field2113 == long_1) {
            class180 class180_4 = this.field3860;
            this.field3860 = this.field3860.field2114;
            return class180_4;
         }
      }

      this.field3860 = null;
      return null;
   }

   public class180 method5953() {
      class180 class180_1;
      if (this.field3859 > 0 && this.field3858[this.field3859 - 1] != this.field3862) {
         class180_1 = this.field3862;
         this.field3862 = class180_1.field2114;
         return class180_1;
      } else {
         do {
            if (this.field3859 >= this.field3861) {
               return null;
            }

            class180_1 = this.field3858[this.field3859++].field2114;
         } while (class180_1 == this.field3858[this.field3859 - 1]);

         this.field3862 = class180_1.field2114;
         return class180_1;
      }
   }

   public void method5951(class180 class180_1, long long_2) {
      if (class180_1.field2112 != null) {
         class180_1.method3607();
      }

      class180 class180_4 = this.field3858[(int)(long_2 & (long)(this.field3861 - 1))];
      class180_1.field2112 = class180_4.field2112;
      class180_1.field2114 = class180_4;
      class180_1.field2112.field2114 = class180_1;
      class180_1.field2114.field2112 = class180_1;
      class180_1.field2113 = long_2;
   }

}
