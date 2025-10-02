import java.util.Iterator;

public final class class316 implements Iterable {

   int field3853 = 0;
   int field3851;
   LinkedListNode[] field3850;
   LinkedListNode field3849;
   LinkedListNode field3852;

   public class316(int i_1) {
      this.field3851 = i_1;
      this.field3850 = new LinkedListNode[i_1];

      for (int i_2 = 0; i_2 < i_1; i_2++) {
         LinkedListNode linkedListNode_3 = this.field3850[i_2] = new LinkedListNode();
         linkedListNode_3.next = linkedListNode_3;
         linkedListNode_3.previous = linkedListNode_3;
      }

   }

   public LinkedListNode method5924(long long_1) {
      LinkedListNode linkedListNode_3 = this.field3850[(int)(long_1 & (long)(this.field3851 - 1))];

      for (this.field3849 = linkedListNode_3.next; linkedListNode_3 != this.field3849; this.field3849 = this.field3849.next) {
         if (this.field3849.hash == long_1) {
            LinkedListNode linkedListNode_4 = this.field3849;
            this.field3849 = this.field3849.next;
            return linkedListNode_4;
         }
      }

      this.field3849 = null;
      return null;
   }

   public LinkedListNode method5928() {
      LinkedListNode linkedListNode_1;
      if (this.field3853 > 0 && this.field3850[this.field3853 - 1] != this.field3852) {
         linkedListNode_1 = this.field3852;
         this.field3852 = linkedListNode_1.next;
         return linkedListNode_1;
      } else {
         do {
            if (this.field3853 >= this.field3851) {
               return null;
            }

            linkedListNode_1 = this.field3850[this.field3853++].next;
         } while (linkedListNode_1 == this.field3850[this.field3853 - 1]);

         this.field3852 = linkedListNode_1.next;
         return linkedListNode_1;
      }
   }

   public void method5926() {
      for (int i_1 = 0; i_1 < this.field3851; i_1++) {
         LinkedListNode linkedListNode_2 = this.field3850[i_1];

         while (true) {
            LinkedListNode linkedListNode_3 = linkedListNode_2.next;
            if (linkedListNode_3 == linkedListNode_2) {
               break;
            }

            linkedListNode_3.unlink();
         }
      }

      this.field3849 = null;
      this.field3852 = null;
   }

   public void method5938(LinkedListNode linkedListNode_1, long long_2) {
      if (linkedListNode_1.previous != null) {
         linkedListNode_1.unlink();
      }

      LinkedListNode linkedListNode_4 = this.field3850[(int)(long_2 & (long)(this.field3851 - 1))];
      linkedListNode_1.previous = linkedListNode_4.previous;
      linkedListNode_1.next = linkedListNode_4;
      linkedListNode_1.previous.next = linkedListNode_1;
      linkedListNode_1.next.previous = linkedListNode_1;
      linkedListNode_1.hash = long_2;
   }

   public Iterator iterator() {
      return new class317(this);
   }

   public LinkedListNode method5927() {
      this.field3853 = 0;
      return this.method5928();
   }

}
