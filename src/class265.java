import java.util.Iterator;

public class class265 implements Iterable {

   public DualNode field3551 = new DualNode();
   DualNode field3550;

   public class265() {
      this.field3551.previousDual = this.field3551;
      this.field3551.nextDual = this.field3551;
   }

   DualNode method4954(DualNode dualNode_1) {
      DualNode dualNode_2;
      if (dualNode_1 == null) {
         dualNode_2 = this.field3551.previousDual;
      } else {
         dualNode_2 = dualNode_1;
      }

      if (dualNode_2 == this.field3551) {
         this.field3550 = null;
         return null;
      } else {
         this.field3550 = dualNode_2.previousDual;
         return dualNode_2;
      }
   }

   public DualNode method4953() {
      return this.method4954((DualNode) null);
   }

   public void method4949() {
      while (this.field3551.previousDual != this.field3551) {
         this.field3551.previousDual.removeDual();
      }

   }

   public DualNode method4952() {
      DualNode dualNode_1 = this.field3551.previousDual;
      if (dualNode_1 == this.field3551) {
         return null;
      } else {
         dualNode_1.removeDual();
         return dualNode_1;
      }
   }

   public void method4950(DualNode dualNode_1) {
      if (dualNode_1.nextDual != null) {
         dualNode_1.removeDual();
      }

      dualNode_1.nextDual = this.field3551.nextDual;
      dualNode_1.previousDual = this.field3551;
      dualNode_1.nextDual.previousDual = dualNode_1;
      dualNode_1.previousDual.nextDual = dualNode_1;
   }

   public DualNode method4983() {
      DualNode dualNode_1 = this.field3550;
      if (dualNode_1 == this.field3551) {
         this.field3550 = null;
         return null;
      } else {
         this.field3550 = dualNode_1.previousDual;
         return dualNode_1;
      }
   }

   public Iterator iterator() {
      return new class263(this);
   }

   public static void method4958(DualNode dualNode_0, DualNode dualNode_1) {
      if (dualNode_0.nextDual != null) {
         dualNode_0.removeDual();
      }

      dualNode_0.nextDual = dualNode_1;
      dualNode_0.previousDual = dualNode_1.previousDual;
      dualNode_0.nextDual.previousDual = dualNode_0;
      dualNode_0.previousDual.nextDual = dualNode_0;
   }

}
