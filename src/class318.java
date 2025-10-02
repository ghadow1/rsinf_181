public final class class318 {

   int field3859 = 0;
   int field3861;
   LinkedListNode[] field3858;
   LinkedListNode field3860;
   LinkedListNode field3862;

   public class318(int i_1) {
      this.field3861 = i_1;
      this.field3858 = new LinkedListNode[i_1];

      for (int i_2 = 0; i_2 < i_1; i_2++) {
         LinkedListNode linkedListNode_3 = this.field3858[i_2] = new LinkedListNode();
         linkedListNode_3.next = linkedListNode_3;
         linkedListNode_3.previous = linkedListNode_3;
      }

   }

   public LinkedListNode method5950() {
      this.field3859 = 0;
      return this.method5953();
   }

   public LinkedListNode method5952(long long_1) {
      LinkedListNode linkedListNode_3 = this.field3858[(int)(long_1 & (long)(this.field3861 - 1))];

      for (this.field3860 = linkedListNode_3.next; linkedListNode_3 != this.field3860; this.field3860 = this.field3860.next) {
         if (this.field3860.hash == long_1) {
            LinkedListNode linkedListNode_4 = this.field3860;
            this.field3860 = this.field3860.next;
            return linkedListNode_4;
         }
      }

      this.field3860 = null;
      return null;
   }

   public LinkedListNode method5953() {
      LinkedListNode linkedListNode_1;
      if (this.field3859 > 0 && this.field3858[this.field3859 - 1] != this.field3862) {
         linkedListNode_1 = this.field3862;
         this.field3862 = linkedListNode_1.next;
         return linkedListNode_1;
      } else {
         do {
            if (this.field3859 >= this.field3861) {
               return null;
            }

            linkedListNode_1 = this.field3858[this.field3859++].next;
         } while (linkedListNode_1 == this.field3858[this.field3859 - 1]);

         this.field3862 = linkedListNode_1.next;
         return linkedListNode_1;
      }
   }

   public void method5951(LinkedListNode linkedListNode_1, long long_2) {
      if (linkedListNode_1.previous != null) {
         linkedListNode_1.unlink();
      }

      LinkedListNode linkedListNode_4 = this.field3858[(int)(long_2 & (long)(this.field3861 - 1))];
      linkedListNode_1.previous = linkedListNode_4.previous;
      linkedListNode_1.next = linkedListNode_4;
      linkedListNode_1.previous.next = linkedListNode_1;
      linkedListNode_1.next.previous = linkedListNode_1;
      linkedListNode_1.hash = long_2;
   }

}
