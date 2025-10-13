public class class155 extends ChainedComparator {

   final boolean field1985;

   public class155(boolean bool_1) {
      this.field1985 = bool_1;
   }

   int method3409(Categorizable categorizable_1, Categorizable categorizable_2, short s_3) {
      return categorizable_1.category != 0 && categorizable_2.category != 0 ? (this.field1985 ? categorizable_1.field3633 - categorizable_2.field3633 : categorizable_2.field3633 - categorizable_1.field3633) : this.compareWithNext(categorizable_1, categorizable_2);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3409((Categorizable) object_1, (Categorizable) object_2, (short) 10090);
   }

}
