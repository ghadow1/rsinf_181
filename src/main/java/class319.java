public class class319 {

   public int field3863;
   public int field3865;
   public int field3864;
   public int field3866;

   public class319(int i_1, int i_2, int i_3, int i_4) {
      this.method5960(i_1, i_2, (byte) -102);
      this.method5961(i_3, i_4, (byte) 12);
   }

   public class319(int i_1, int i_2) {
      this(0, 0, i_1, i_2);
   }

   void method5968(class319 class319_1, class319 class319_2, byte b_3) {
      class319_2.field3863 = this.field3863;
      class319_2.field3865 = this.field3865;
      if (this.field3863 < class319_1.field3863) {
         class319_2.field3865 -= class319_1.field3863 - this.field3863;
         class319_2.field3863 = class319_1.field3863;
      }

      if (class319_2.method5976(-1428102724) > class319_1.method5976(-595700416)) {
         class319_2.field3865 -= class319_2.method5976(521506375) - class319_1.method5976(-877719335);
      }

      if (class319_2.field3865 < 0) {
         class319_2.field3865 = 0;
      }

   }

   public void method5960(int i_1, int i_2, byte b_3) {
      this.field3863 = i_1;
      this.field3864 = i_2;
   }

   void method5964(class319 class319_1, class319 class319_2, int i_3) {
      class319_2.field3864 = this.field3864;
      class319_2.field3866 = this.field3866;
      if (this.field3864 < class319_1.field3864) {
         class319_2.field3866 -= class319_1.field3864 - this.field3864;
         class319_2.field3864 = class319_1.field3864;
      }

      if (class319_2.method5965(185439342) > class319_1.method5965(1762661833)) {
         class319_2.field3866 -= class319_2.method5965(40071380) - class319_1.method5965(501449096);
      }

      if (class319_2.field3866 < 0) {
         class319_2.field3866 = 0;
      }

   }

   public void method5961(int i_1, int i_2, byte b_3) {
      this.field3865 = i_1;
      this.field3866 = i_2;
   }

   int method5965(int i_1) {
      return this.field3866 + this.field3864;
   }

   int method5976(int i_1) {
      return this.field3865 + this.field3863;
   }

   public void method5980(class319 class319_1, class319 class319_2, int i_3) {
      this.method5968(class319_1, class319_2, (byte) -20);
      this.method5964(class319_1, class319_2, 182983589);
   }

   public String toString() {
      return null;
   }

}
