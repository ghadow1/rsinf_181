import java.util.Iterator;

public class class264 implements Iterator {

   LinkedListNode field3547 = null;
   LinkedListNode field3549;
   class260 field3548;

   class264(class260 class260_1) {
      this.method4939(class260_1);
   }

   void method4941() {
      this.field3549 = this.field3548 != null ? this.field3548.field3539.next : null;
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
         this.field3547.unlink();
         this.field3547 = null;
      }
   }

   public Object next() {
      LinkedListNode linkedListNode_1 = this.field3549;
      if (linkedListNode_1 == this.field3548.field3539) {
         linkedListNode_1 = null;
         this.field3549 = null;
      } else {
         this.field3549 = linkedListNode_1.next;
      }

      this.field3547 = linkedListNode_1;
      return linkedListNode_1;
   }

   public boolean hasNext() {
      return this.field3548.field3539 != this.field3549;
   }

}
