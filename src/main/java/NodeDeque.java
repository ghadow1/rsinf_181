public class NodeDeque {

   public LinkedListNode field3540 = new LinkedListNode();
   LinkedListNode field3541;

   public NodeDeque() {
      this.field3540.next = this.field3540;
      this.field3540.previous = this.field3540;
   }

   public void method4888(LinkedListNode linkedListNode_1) {
      if (linkedListNode_1.previous != null) {
         linkedListNode_1.unlink();
      }

      linkedListNode_1.previous = this.field3540;
      linkedListNode_1.next = this.field3540.next;
      linkedListNode_1.previous.next = linkedListNode_1;
      linkedListNode_1.next.previous = linkedListNode_1;
   }

   public LinkedListNode method4892() {
      LinkedListNode linkedListNode_1 = this.field3540.next;
      if (linkedListNode_1 == this.field3540) {
         this.field3541 = null;
         return null;
      } else {
         this.field3541 = linkedListNode_1.next;
         return linkedListNode_1;
      }
   }

   public LinkedListNode method4894() {
      LinkedListNode linkedListNode_1 = this.field3541;
      if (linkedListNode_1 == this.field3540) {
         this.field3541 = null;
         return null;
      } else {
         this.field3541 = linkedListNode_1.next;
         return linkedListNode_1;
      }
   }

   public void addFirst(LinkedListNode linkedListNode_1) {
      if (linkedListNode_1.previous != null) {
         linkedListNode_1.unlink();
      }

      linkedListNode_1.previous = this.field3540.previous;
      linkedListNode_1.next = this.field3540;
      linkedListNode_1.previous.next = linkedListNode_1;
      linkedListNode_1.next.previous = linkedListNode_1;
   }

   public LinkedListNode method4900() {
      LinkedListNode linkedListNode_1 = this.field3540.next;
      if (linkedListNode_1 == this.field3540) {
         return null;
      } else {
         linkedListNode_1.unlink();
         return linkedListNode_1;
      }
   }

   public LinkedListNode method4893() {
      LinkedListNode linkedListNode_1 = this.field3540.previous;
      if (linkedListNode_1 == this.field3540) {
         this.field3541 = null;
         return null;
      } else {
         this.field3541 = linkedListNode_1.previous;
         return linkedListNode_1;
      }
   }

   public LinkedListNode method4891() {
      LinkedListNode linkedListNode_1 = this.field3540.previous;
      if (linkedListNode_1 == this.field3540) {
         return null;
      } else {
         linkedListNode_1.unlink();
         return linkedListNode_1;
      }
   }

   public LinkedListNode method4887() {
      LinkedListNode linkedListNode_1 = this.field3541;
      if (linkedListNode_1 == this.field3540) {
         this.field3541 = null;
         return null;
      } else {
         this.field3541 = linkedListNode_1.previous;
         return linkedListNode_1;
      }
   }

   public void method4886() {
      while (true) {
         LinkedListNode linkedListNode_1 = this.field3540.next;
         if (linkedListNode_1 == this.field3540) {
            this.field3541 = null;
            return;
         }

         linkedListNode_1.unlink();
      }
   }

   public static void method4889(LinkedListNode linkedListNode_0, LinkedListNode linkedListNode_1) {
      if (linkedListNode_0.previous != null) {
         linkedListNode_0.unlink();
      }

      linkedListNode_0.previous = linkedListNode_1.previous;
      linkedListNode_0.next = linkedListNode_1;
      linkedListNode_0.previous.next = linkedListNode_0;
      linkedListNode_0.next.previous = linkedListNode_0;
   }

}
