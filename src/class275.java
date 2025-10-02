import java.util.Comparator;

public abstract class class275 implements Comparator {

   Comparator field3616;

   protected final int method5061(class274 class274_1, class274 class274_2, int i_3) {
      return this.field3616 == null ? 0 : this.field3616.compare(class274_1, class274_2);
   }

   final void method5060(Comparator comparator_1, int i_2) {
      if (this.field3616 == null) {
         this.field3616 = comparator_1;
      } else if (this.field3616 instanceof class275) {
         ((class275) this.field3616).method5060(comparator_1, 311417511);
      }

   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

}
