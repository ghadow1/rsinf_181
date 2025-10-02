import java.util.Iterator;

public class class317 implements Iterator {

   class180 field3854 = null;
   class316 field3857;
   class180 field3855;
   int field3856;

   class317(class316 class316_1) {
      this.field3857 = class316_1;
      this.method5949();
   }

   void method5949() {
      this.field3855 = this.field3857.field3850[0].field2114;
      this.field3856 = 1;
      this.field3854 = null;
   }

   public boolean hasNext() {
      if (this.field3857.field3850[this.field3856 - 1] != this.field3855) {
         return true;
      } else {
         while (this.field3856 < this.field3857.field3851) {
            if (this.field3857.field3850[this.field3856++].field2114 != this.field3857.field3850[this.field3856 - 1]) {
               this.field3855 = this.field3857.field3850[this.field3856 - 1].field2114;
               return true;
            }

            this.field3855 = this.field3857.field3850[this.field3856 - 1];
         }

         return false;
      }
   }

   public Object next() {
      class180 class180_1;
      if (this.field3857.field3850[this.field3856 - 1] != this.field3855) {
         class180_1 = this.field3855;
         this.field3855 = class180_1.field2114;
         this.field3854 = class180_1;
         return class180_1;
      } else {
         do {
            if (this.field3856 >= this.field3857.field3851) {
               return null;
            }

            class180_1 = this.field3857.field3850[this.field3856++].field2114;
         } while (class180_1 == this.field3857.field3850[this.field3856 - 1]);

         this.field3855 = class180_1.field2114;
         this.field3854 = class180_1;
         return class180_1;
      }
   }

   public void remove() {
      if (this.field3854 == null) {
         throw new IllegalStateException();
      } else {
         this.field3854.method3607();
         this.field3854 = null;
      }
   }

}
