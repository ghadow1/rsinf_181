public final class class259 {

   DualNode field3537 = new DualNode();

   public class259() {
      this.field3537.previousDual = this.field3537;
      this.field3537.nextDual = this.field3537;
   }

   public void method4793(DualNode dualNode_1) {
      if (dualNode_1.nextDual != null) {
         dualNode_1.removeDual();
      }

      dualNode_1.nextDual = this.field3537;
      dualNode_1.previousDual = this.field3537.previousDual;
      dualNode_1.nextDual.previousDual = dualNode_1;
      dualNode_1.previousDual.nextDual = dualNode_1;
   }

   public void method4790(DualNode dualNode_1) {
      if (dualNode_1.nextDual != null) {
         dualNode_1.removeDual();
      }

      dualNode_1.nextDual = this.field3537.nextDual;
      dualNode_1.previousDual = this.field3537;
      dualNode_1.nextDual.previousDual = dualNode_1;
      dualNode_1.previousDual.nextDual = dualNode_1;
   }

   public DualNode method4792() {
      DualNode dualNode_1 = this.field3537.previousDual;
      return dualNode_1 == this.field3537 ? null : dualNode_1;
   }

}
