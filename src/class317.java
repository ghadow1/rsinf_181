import java.util.Iterator;

public class class317 implements Iterator {

   LinkedListNode field3854 = null;
   class316 field3857;
   LinkedListNode field3855;
   int field3856;

   class317(class316 class316_1) {
      this.field3857 = class316_1;
      this.method5949();
   }

   void method5949() {
      this.field3855 = this.field3857.field3850[0].next;
      this.field3856 = 1;
      this.field3854 = null;
   }

   public boolean hasNext() {
      if (this.field3857.field3850[this.field3856 - 1] != this.field3855) {
         return true;
      } else {
         while (this.field3856 < this.field3857.field3851) {
            if (this.field3857.field3850[this.field3856++].next != this.field3857.field3850[this.field3856 - 1]) {
               this.field3855 = this.field3857.field3850[this.field3856 - 1].next;
               return true;
            }

            this.field3855 = this.field3857.field3850[this.field3856 - 1];
         }

         return false;
      }
   }

   public Object next() {
      LinkedListNode linkedListNode_1;
      if (this.field3857.field3850[this.field3856 - 1] != this.field3855) {
         linkedListNode_1 = this.field3855;
         this.field3855 = linkedListNode_1.next;
         this.field3854 = linkedListNode_1;
         return linkedListNode_1;
      } else {
         do {
            if (this.field3856 >= this.field3857.field3851) {
               return null;
            }

            linkedListNode_1 = this.field3857.field3850[this.field3856++].next;
         } while (linkedListNode_1 == this.field3857.field3850[this.field3856 - 1]);

         this.field3855 = linkedListNode_1.next;
         this.field3854 = linkedListNode_1;
         return linkedListNode_1;
      }
   }

   public void remove() {
      if (this.field3854 == null) {
         throw new IllegalStateException();
      } else {
         this.field3854.unlink();
         this.field3854 = null;
      }
   }

}
