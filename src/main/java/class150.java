import java.lang.ref.SoftReference;

public class class150 extends class148 {

   SoftReference field1970;

   class150(Object object_1, int i_2) {
      super(i_2);
      this.field1970 = new SoftReference(object_1);
   }

   boolean vmethod3371() {
      return true;
   }

   Object vmethod3370() {
      return this.field1970.get();
   }

}
