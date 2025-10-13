public class DualNode extends LinkedListNode {

   public long keyDual;
   public DualNode previousDual;
   public DualNode nextDual;

   public void removeDual() {
      if (this.nextDual != null) {
         this.nextDual.previousDual = this.previousDual;
         this.previousDual.nextDual = this.nextDual;
         this.previousDual = null;
         this.nextDual = null;
      }
   }
}
