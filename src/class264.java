import java.util.Iterator;

public class class264 implements Iterator {

   class180 field3547 = null;
   class180 field3549;
   class260 field3548;

   class264(class260 class260_1) {
      this.method4939(class260_1);
   }

   void method4941() {
      this.field3549 = this.field3548 != null ? this.field3548.field3539.field2114 : null;
      this.field3547 = null;
   }

   void method4939(class260 class260_1) {
      this.field3548 = class260_1;
      this.method4941();
   }

   public void remove() {
      if (this.field3547 == null) {
         throw new IllegalStateException();
      } else {
         this.field3547.method3607();
         this.field3547 = null;
      }
   }

   public Object next() {
      class180 class180_1 = this.field3549;
      if (class180_1 == this.field3548.field3539) {
         class180_1 = null;
         this.field3549 = null;
      } else {
         this.field3549 = class180_1.field2114;
      }

      this.field3547 = class180_1;
      return class180_1;
   }

   public boolean hasNext() {
      return this.field3548.field3539 != this.field3549;
   }

}
