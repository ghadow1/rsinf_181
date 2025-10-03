public class RawSound extends class118 {

   public int sampleRate;
   public byte[] field1390;
   public int field1391;
   int field1392;
   public boolean field1393;

   RawSound(int i_1, byte[] bytes_2, int i_3, int i_4) {
      this.sampleRate = i_1;
      this.field1390 = bytes_2;
      this.field1391 = i_3;
      this.field1392 = i_4;
   }

   RawSound(int i_1, byte[] bytes_2, int i_3, int i_4, boolean bool_5) {
      this.sampleRate = i_1;
      this.field1390 = bytes_2;
      this.field1391 = i_3;
      this.field1392 = i_4;
      this.field1393 = bool_5;
   }

   public RawSound method2376(class112 class112_1) {
      this.field1390 = class112_1.method2504(this.field1390);
      this.sampleRate = class112_1.method2505(this.sampleRate);
      if (this.field1391 == this.field1392) {
         this.field1391 = this.field1392 = class112_1.method2516(this.field1391);
      } else {
         this.field1391 = class112_1.method2516(this.field1391);
         this.field1392 = class112_1.method2516(this.field1392);
         if (this.field1391 == this.field1392) {
            --this.field1391;
         }
      }

      return this;
   }

}
