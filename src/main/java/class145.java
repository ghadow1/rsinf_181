public final class class145 {

   DualNode field1959 = new DualNode();
   class265 field1962 = new class265();
   int field1961;
   int field1960;
   class316 field1958;

   public class145(int i_1) {
      this.field1961 = i_1;
      this.field1960 = i_1;

      int i_2;
      for (i_2 = 1; i_2 + i_2 < i_1; i_2 += i_2) {
         ;
      }

      this.field1958 = new class316(i_2);
   }

   public DualNode get(long long_1) {
      DualNode dualNode_3 = (DualNode) this.field1958.method5924(long_1);
      if (dualNode_3 != null) {
         this.field1962.method4950(dualNode_3);
      }

      return dualNode_3;
   }

   public void put(DualNode dualNode_1, long long_2) {
      if (this.field1960 == 0) {
         DualNode dualNode_4 = this.field1962.method4952();
         dualNode_4.unlink();
         dualNode_4.removeDual();
         if (dualNode_4 == this.field1959) {
            dualNode_4 = this.field1962.method4952();
            dualNode_4.unlink();
            dualNode_4.removeDual();
         }
      } else {
         --this.field1960;
      }

      this.field1958.method5938(dualNode_1, long_2);
      this.field1962.method4950(dualNode_1);
   }

   public void method3323() {
      this.field1962.method4949();
      this.field1958.method5926();
      this.field1959 = new DualNode();
      this.field1960 = this.field1961;
   }

   public void method3328(long long_1) {
      DualNode dualNode_3 = (DualNode) this.field1958.method5924(long_1);
      if (dualNode_3 != null) {
         dualNode_3.unlink();
         dualNode_3.removeDual();
         ++this.field1960;
      }

   }

}
