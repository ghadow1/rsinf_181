public abstract class Entity extends DualNode {

   static long field1872;
   static class235 field1874;
   public int height = 1000;

   protected class127 vmethod3253(int i_1) {
      return null;
   }

   void vmethod3258(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, long long_9) {
      class127 class127_11 = this.vmethod3253(19676459);
      if (class127_11 != null) {
         this.height = class127_11.height;
         class127_11.vmethod3258(i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, long_9);
      }

   }

   static final void method3260(String string_0, String string_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
      if (!Client.field674) {
         if (Client.menuOptionsCount < 500) {
            Client.field796[Client.menuOptionsCount] = string_0;
            Client.field668[Client.menuOptionsCount] = string_1;
            Client.menuOpcodes[Client.menuOptionsCount] = i_2;
            Client.field795[Client.menuOptionsCount] = i_3;
            Client.field792[Client.menuOptionsCount] = i_4;
            Client.field793[Client.menuOptionsCount] = i_5;
            Client.field769[Client.menuOptionsCount] = bool_6;
            ++Client.menuOptionsCount;
         }

      }
   }

}
