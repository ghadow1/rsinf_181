public class class103 extends class118 {

   public int field1389;
   public byte[] field1390;
   public int field1391;
   int field1392;
   public boolean field1393;

   class103(int i_1, byte[] bytes_2, int i_3, int i_4) {
      this.field1389 = i_1;
      this.field1390 = bytes_2;
      this.field1391 = i_3;
      this.field1392 = i_4;
   }

   class103(int i_1, byte[] bytes_2, int i_3, int i_4, boolean bool_5) {
      this.field1389 = i_1;
      this.field1390 = bytes_2;
      this.field1391 = i_3;
      this.field1392 = i_4;
      this.field1393 = bool_5;
   }

   public class103 method2376(class112 class112_1) {
      this.field1390 = class112_1.method2504(this.field1390, (byte) 68);
      this.field1389 = class112_1.method2505(this.field1389, 1569802818);
      if (this.field1391 == this.field1392) {
         this.field1391 = this.field1392 = class112_1.method2516(this.field1391, 1732624791);
      } else {
         this.field1391 = class112_1.method2516(this.field1391, 1508909490);
         this.field1392 = class112_1.method2516(this.field1392, 1917119945);
         if (this.field1391 == this.field1392) {
            --this.field1391;
         }
      }

      return this;
   }

}
