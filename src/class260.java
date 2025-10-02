import java.util.Collection;
import java.util.Iterator;

public class class260 implements Iterable, Collection {

   class180 field3539 = new class180();
   class180 field3538;

   public class260() {
      this.field3539.field2114 = this.field3539;
      this.field3539.field2112 = this.field3539;
   }

   class180[] method4811() {
      class180[] arr_1 = new class180[this.method4884()];
      int i_2 = 0;

      for (class180 class180_3 = this.field3539.field2114; class180_3 != this.field3539; class180_3 = class180_3.field2114) {
         arr_1[i_2++] = class180_3;
      }

      return arr_1;
   }

   boolean method4847(class180 class180_1) {
      this.method4819(class180_1);
      return true;
   }

   int method4884() {
      int i_1 = 0;

      for (class180 class180_2 = this.field3539.field2114; class180_2 != this.field3539; class180_2 = class180_2.field2114) {
         ++i_1;
      }

      return i_1;
   }

   public void method4803() {
      while (this.field3539.field2114 != this.field3539) {
         this.field3539.field2114.method3607();
      }

   }

   class180 method4807(class180 class180_1) {
      class180 class180_2;
      if (class180_1 == null) {
         class180_2 = this.field3539.field2114;
      } else {
         class180_2 = class180_1;
      }

      if (class180_2 == this.field3539) {
         this.field3538 = null;
         return null;
      } else {
         this.field3538 = class180_2.field2114;
         return class180_2;
      }
   }

   public boolean method4810() {
      return this.field3539.field2114 == this.field3539;
   }

   public void method4819(class180 class180_1) {
      if (class180_1.field2112 != null) {
         class180_1.method3607();
      }

      class180_1.field2112 = this.field3539.field2112;
      class180_1.field2114 = this.field3539;
      class180_1.field2112.field2114 = class180_1;
      class180_1.field2114.field2112 = class180_1;
   }

   public class180 method4838() {
      return this.method4807((class180) null);
   }

   public class180 method4808() {
      class180 class180_1 = this.field3538;
      if (class180_1 == this.field3539) {
         this.field3538 = null;
         return null;
      } else {
         this.field3538 = class180_1.field2114;
         return class180_1;
      }
   }

   public void method4805(class180 class180_1) {
      if (class180_1.field2112 != null) {
         class180_1.method3607();
      }

      class180_1.field2112 = this.field3539;
      class180_1.field2114 = this.field3539.field2114;
      class180_1.field2112.field2114 = class180_1;
      class180_1.field2114.field2112 = class180_1;
   }

   public void clear() {
      this.method4803();
   }

   public boolean isEmpty() {
      return this.method4810();
   }

   public boolean contains(Object object_1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method4811();
   }

   public Object[] toArray(Object[] arr_1) {
      int i_2 = 0;

      for (class180 class180_3 = this.field3539.field2114; class180_3 != this.field3539; class180_3 = class180_3.field2114) {
         arr_1[i_2++] = class180_3;
      }

      return arr_1;
   }

   public boolean containsAll(Collection collection_1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection collection_1) {
      throw new RuntimeException();
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean addAll(Collection collection_1) {
      throw new RuntimeException();
   }

   public int size() {
      return this.method4884();
   }

   public boolean remove(Object object_1) {
      throw new RuntimeException();
   }

   public Iterator iterator() {
      return new class264(this);
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

   public boolean retainAll(Collection collection_1) {
      throw new RuntimeException();
   }

   public boolean add(Object object_1) {
      return this.method4847((class180) object_1);
   }

   public static void method4816(class180 class180_0, class180 class180_1) {
      if (class180_0.field2112 != null) {
         class180_0.method3607();
      }

      class180_0.field2112 = class180_1;
      class180_0.field2114 = class180_1.field2114;
      class180_0.field2112.field2114 = class180_0;
      class180_0.field2114.field2112 = class180_0;
   }

}
