import java.util.Iterator;

public final class class316 implements Iterable {

   int field3853 = 0;
   int field3851;
   class180[] field3850;
   class180 field3849;
   class180 field3852;

   public class316(int i_1) {
      this.field3851 = i_1;
      this.field3850 = new class180[i_1];

      for (int i_2 = 0; i_2 < i_1; i_2++) {
         class180 class180_3 = this.field3850[i_2] = new class180();
         class180_3.field2114 = class180_3;
         class180_3.field2112 = class180_3;
      }

   }

   public class180 method5924(long long_1) {
      class180 class180_3 = this.field3850[(int)(long_1 & (long)(this.field3851 - 1))];

      for (this.field3849 = class180_3.field2114; class180_3 != this.field3849; this.field3849 = this.field3849.field2114) {
         if (this.field3849.field2113 == long_1) {
            class180 class180_4 = this.field3849;
            this.field3849 = this.field3849.field2114;
            return class180_4;
         }
      }

      this.field3849 = null;
      return null;
   }

   public class180 method5928() {
      class180 class180_1;
      if (this.field3853 > 0 && this.field3850[this.field3853 - 1] != this.field3852) {
         class180_1 = this.field3852;
         this.field3852 = class180_1.field2114;
         return class180_1;
      } else {
         do {
            if (this.field3853 >= this.field3851) {
               return null;
            }

            class180_1 = this.field3850[this.field3853++].field2114;
         } while (class180_1 == this.field3850[this.field3853 - 1]);

         this.field3852 = class180_1.field2114;
         return class180_1;
      }
   }

   public void method5926() {
      for (int i_1 = 0; i_1 < this.field3851; i_1++) {
         class180 class180_2 = this.field3850[i_1];

         while (true) {
            class180 class180_3 = class180_2.field2114;
            if (class180_3 == class180_2) {
               break;
            }

            class180_3.method3607();
         }
      }

      this.field3849 = null;
      this.field3852 = null;
   }

   public void method5938(class180 class180_1, long long_2) {
      if (class180_1.field2112 != null) {
         class180_1.method3607();
      }

      class180 class180_4 = this.field3850[(int)(long_2 & (long)(this.field3851 - 1))];
      class180_1.field2112 = class180_4.field2112;
      class180_1.field2114 = class180_4;
      class180_1.field2112.field2114 = class180_1;
      class180_1.field2114.field2112 = class180_1;
      class180_1.field2113 = long_2;
   }

   public Iterator iterator() {
      return new class317(this);
   }

   public class180 method5927() {
      this.field3853 = 0;
      return this.method5928();
   }

}
