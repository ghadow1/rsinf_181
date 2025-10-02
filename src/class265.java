import java.util.Iterator;

public class class265 implements Iterable {

   public class175 field3551 = new class175();
   class175 field3550;

   public class265() {
      this.field3551.field2104 = this.field3551;
      this.field3551.field2106 = this.field3551;
   }

   class175 method4954(class175 class175_1) {
      class175 class175_2;
      if (class175_1 == null) {
         class175_2 = this.field3551.field2104;
      } else {
         class175_2 = class175_1;
      }

      if (class175_2 == this.field3551) {
         this.field3550 = null;
         return null;
      } else {
         this.field3550 = class175_2.field2104;
         return class175_2;
      }
   }

   public class175 method4953() {
      return this.method4954((class175) null);
   }

   public void method4949() {
      while (this.field3551.field2104 != this.field3551) {
         this.field3551.field2104.method3597();
      }

   }

   public class175 method4952() {
      class175 class175_1 = this.field3551.field2104;
      if (class175_1 == this.field3551) {
         return null;
      } else {
         class175_1.method3597();
         return class175_1;
      }
   }

   public void method4950(class175 class175_1) {
      if (class175_1.field2106 != null) {
         class175_1.method3597();
      }

      class175_1.field2106 = this.field3551.field2106;
      class175_1.field2104 = this.field3551;
      class175_1.field2106.field2104 = class175_1;
      class175_1.field2104.field2106 = class175_1;
   }

   public class175 method4983() {
      class175 class175_1 = this.field3550;
      if (class175_1 == this.field3551) {
         this.field3550 = null;
         return null;
      } else {
         this.field3550 = class175_1.field2104;
         return class175_1;
      }
   }

   public Iterator iterator() {
      return new class263(this);
   }

   public static void method4958(class175 class175_0, class175 class175_1) {
      if (class175_0.field2106 != null) {
         class175_0.method3597();
      }

      class175_0.field2106 = class175_1;
      class175_0.field2104 = class175_1.field2104;
      class175_0.field2106.field2104 = class175_0;
      class175_0.field2104.field2106 = class175_0;
   }

}
