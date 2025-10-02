import java.util.Iterator;

public class class263 implements Iterator {

   class175 field3546 = null;
   class265 field3544;
   class175 field3545;

   class263(class265 class265_1) {
      this.field3544 = class265_1;
      this.field3545 = this.field3544.field3551.field2104;
      this.field3546 = null;
   }

   public boolean hasNext() {
      return this.field3544.field3551 != this.field3545;
   }

   public Object next() {
      class175 class175_1 = this.field3545;
      if (class175_1 == this.field3544.field3551) {
         class175_1 = null;
         this.field3545 = null;
      } else {
         this.field3545 = class175_1.field2104;
      }

      this.field3546 = class175_1;
      return class175_1;
   }

   public void remove() {
      if (this.field3546 == null) {
         throw new IllegalStateException();
      } else {
         this.field3546.method3597();
         this.field3546 = null;
      }
   }

}
