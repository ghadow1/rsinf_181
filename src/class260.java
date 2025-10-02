import java.util.Collection;
import java.util.Iterator;

public class class260 implements Iterable, Collection {

   LinkedListNode field3539 = new LinkedListNode();
   LinkedListNode field3538;

   public class260() {
      this.field3539.next = this.field3539;
      this.field3539.previous = this.field3539;
   }

   LinkedListNode[] method4811() {
      LinkedListNode[] arr_1 = new LinkedListNode[this.method4884()];
      int i_2 = 0;

      for (LinkedListNode linkedListNode_3 = this.field3539.next; linkedListNode_3 != this.field3539; linkedListNode_3 = linkedListNode_3.next) {
         arr_1[i_2++] = linkedListNode_3;
      }

      return arr_1;
   }

   boolean method4847(LinkedListNode linkedListNode_1) {
      this.method4819(linkedListNode_1);
      return true;
   }

   int method4884() {
      int i_1 = 0;

      for (LinkedListNode linkedListNode_2 = this.field3539.next; linkedListNode_2 != this.field3539; linkedListNode_2 = linkedListNode_2.next) {
         ++i_1;
      }

      return i_1;
   }

   public void method4803() {
      while (this.field3539.next != this.field3539) {
         this.field3539.next.unlink();
      }

   }

   LinkedListNode method4807(LinkedListNode linkedListNode_1) {
      LinkedListNode linkedListNode_2;
      if (linkedListNode_1 == null) {
         linkedListNode_2 = this.field3539.next;
      } else {
         linkedListNode_2 = linkedListNode_1;
      }

      if (linkedListNode_2 == this.field3539) {
         this.field3538 = null;
         return null;
      } else {
         this.field3538 = linkedListNode_2.next;
         return linkedListNode_2;
      }
   }

   public boolean method4810() {
      return this.field3539.next == this.field3539;
   }

   public void method4819(LinkedListNode linkedListNode_1) {
      if (linkedListNode_1.previous != null) {
         linkedListNode_1.unlink();
      }

      linkedListNode_1.previous = this.field3539.previous;
      linkedListNode_1.next = this.field3539;
      linkedListNode_1.previous.next = linkedListNode_1;
      linkedListNode_1.next.previous = linkedListNode_1;
   }

   public LinkedListNode method4838() {
      return this.method4807((LinkedListNode) null);
   }

   public LinkedListNode method4808() {
      LinkedListNode linkedListNode_1 = this.field3538;
      if (linkedListNode_1 == this.field3539) {
         this.field3538 = null;
         return null;
      } else {
         this.field3538 = linkedListNode_1.next;
         return linkedListNode_1;
      }
   }

   public void method4805(LinkedListNode linkedListNode_1) {
      if (linkedListNode_1.previous != null) {
         linkedListNode_1.unlink();
      }

      linkedListNode_1.previous = this.field3539;
      linkedListNode_1.next = this.field3539.next;
      linkedListNode_1.previous.next = linkedListNode_1;
      linkedListNode_1.next.previous = linkedListNode_1;
   }

   public void clear() {
      this.method4803();
   }

   public boolean isEmpty() {
      return this.method4810();
   }

   public boolean contains(Object object_1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method4811();
   }

   public Object[] toArray(Object[] arr_1) {
      int i_2 = 0;

      for (LinkedListNode linkedListNode_3 = this.field3539.next; linkedListNode_3 != this.field3539; linkedListNode_3 = linkedListNode_3.next) {
         arr_1[i_2++] = linkedListNode_3;
      }

      return arr_1;
   }

   public boolean containsAll(Collection collection_1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection collection_1) {
      throw new RuntimeException();
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean addAll(Collection collection_1) {
      throw new RuntimeException();
   }

   public int size() {
      return this.method4884();
   }

   public boolean remove(Object object_1) {
      throw new RuntimeException();
   }

   public Iterator iterator() {
      return new class264(this);
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

   public boolean retainAll(Collection collection_1) {
      throw new RuntimeException();
   }

   public boolean add(Object object_1) {
      return this.method4847((LinkedListNode) object_1);
   }

   public static void method4816(LinkedListNode linkedListNode_0, LinkedListNode linkedListNode_1) {
      if (linkedListNode_0.previous != null) {
         linkedListNode_0.unlink();
      }

      linkedListNode_0.previous = linkedListNode_1;
      linkedListNode_0.next = linkedListNode_1.next;
      linkedListNode_0.previous.next = linkedListNode_0;
      linkedListNode_0.next.previous = linkedListNode_0;
   }

}
