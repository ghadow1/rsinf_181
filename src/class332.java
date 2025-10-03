public class class332 {

   int field3967 = 0;
   boolean field3968 = false;
   class233 field3966;
   String field3964;

   class332(class233 class233_1) {
      this.field3966 = class233_1;
   }

   int method6286() {
      if (this.field3967 < 33) {
         if (!this.field3966.method4164(class35.field302.field306, this.field3964)) {
            return this.field3967;
         }

         this.field3967 = 33;
      }

      if (this.field3967 == 33) {
         if (this.field3966.method4162(class35.field303.field306, this.field3964) && !this.field3966.method4164(class35.field303.field306, this.field3964)) {
            return this.field3967;
         }

         this.field3967 = 66;
      }

      if (this.field3967 == 66) {
         if (!this.field3966.method4164(this.field3964, class35.field305.field306)) {
            return this.field3967;
         }

         this.field3967 = 100;
         this.field3968 = true;
      }

      return this.field3967;
   }

   boolean method6295() {
      return this.field3968;
   }

   void method6285(String string_1) {
      if (string_1 != null && !string_1.isEmpty()) {
         if (string_1 != this.field3964) {
            this.field3964 = string_1;
            this.field3967 = 0;
            this.field3968 = false;
            this.method6286();
         }
      }
   }

   int method6284(int i_1) {
      return this.field3967;
   }

}
