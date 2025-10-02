public abstract class class135 extends class175 {

   static long field1872;
   static class235 field1874;
   public int field1873 = 1000;

   protected class127 vmethod3253(int i_1) {
      return null;
   }

   void vmethod3258(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, long long_9) {
      class127 class127_11 = this.vmethod3253(19676459);
      if (class127_11 != null) {
         this.field1873 = class127_11.field1873;
         class127_11.vmethod3258(i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, long_9);
      }

   }

   static final void method3260(String string_0, String string_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
      if (!Client.field674) {
         if (Client.field791 < 500) {
            Client.field796[Client.field791] = string_0;
            Client.field668[Client.field791] = string_1;
            Client.field794[Client.field791] = i_2;
            Client.field795[Client.field791] = i_3;
            Client.field792[Client.field791] = i_4;
            Client.field793[Client.field791] = i_5;
            Client.field769[Client.field791] = bool_6;
            ++Client.field791;
         }

      }
   }

}
