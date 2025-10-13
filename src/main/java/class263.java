import java.util.Iterator;

public class class263 implements Iterator {

   DualNode field3546 = null;
   class265 field3544;
   DualNode field3545;

   class263(class265 class265_1) {
      this.field3544 = class265_1;
      this.field3545 = this.field3544.field3551.previousDual;
      this.field3546 = null;
   }

   public boolean hasNext() {
      return this.field3544.field3551 != this.field3545;
   }

   public Object next() {
      DualNode dualNode_1 = this.field3545;
      if (dualNode_1 == this.field3544.field3551) {
         dualNode_1 = null;
         this.field3545 = null;
      } else {
         this.field3545 = dualNode_1.previousDual;
      }

      this.field3546 = dualNode_1;
      return dualNode_1;
   }

   public void remove() {
      if (this.field3546 == null) {
         throw new IllegalStateException();
      } else {
         this.field3546.removeDual();
         this.field3546 = null;
      }
   }

}
