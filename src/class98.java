public class class98 extends class115 {

   class261 field1341 = new class261();
   class261 field1342 = new class261();
   int field1343 = 0;
   int field1344 = -1;

   void method2279(int[] ints_1, int i_2, int i_3) {
      for (class115 class115_4 = (class115) this.field1341.method4892(); class115_4 != null; class115_4 = (class115) this.field1341.method4894()) {
         class115_4.method2693(ints_1, i_2, i_3);
      }

   }

   void method2271(int i_1) {
      for (class115 class115_2 = (class115) this.field1341.method4892(); class115_2 != null; class115_2 = (class115) this.field1341.method4894()) {
         class115_2.vmethod3906(i_1);
      }

   }

   public final synchronized void vmethod3893(int[] ints_1, int i_2, int i_3) {
      do {
         if (this.field1344 < 0) {
            this.method2279(ints_1, i_2, i_3);
            return;
         }

         if (i_3 + this.field1343 < this.field1344) {
            this.field1343 += i_3;
            this.method2279(ints_1, i_2, i_3);
            return;
         }

         int i_4 = this.field1344 - this.field1343;
         this.method2279(ints_1, i_2, i_4);
         i_2 += i_4;
         i_3 -= i_4;
         this.field1343 += i_4;
         this.method2283();
         class110 class110_5 = (class110) this.field1342.method4892();
         synchronized(class110_5) {
            int i_7 = class110_5.method2494(this);
            if (i_7 < 0) {
               class110_5.field1452 = 0;
               this.method2274(class110_5);
            } else {
               class110_5.field1452 = i_7;
               this.method2273(class110_5.next, class110_5);
            }
         }
      } while (i_3 != 0);

   }

   public final synchronized void vmethod3906(int i_1) {
      do {
         if (this.field1344 < 0) {
            this.method2271(i_1);
            return;
         }

         if (this.field1343 + i_1 < this.field1344) {
            this.field1343 += i_1;
            this.method2271(i_1);
            return;
         }

         int i_2 = this.field1344 - this.field1343;
         this.method2271(i_2);
         i_1 -= i_2;
         this.field1343 += i_2;
         this.method2283();
         class110 class110_3 = (class110) this.field1342.method4892();
         synchronized(class110_3) {
            int i_5 = class110_3.method2494(this);
            if (i_5 < 0) {
               class110_3.field1452 = 0;
               this.method2274(class110_3);
            } else {
               class110_3.field1452 = i_5;
               this.method2273(class110_3.next, class110_3);
            }
         }
      } while (i_1 != 0);

   }

   protected class115 vmethod3891() {
      return (class115) this.field1341.method4894();
   }

   void method2283() {
      if (this.field1343 > 0) {
         for (class110 class110_1 = (class110) this.field1342.method4892(); class110_1 != null; class110_1 = (class110) this.field1342.method4894()) {
            class110_1.field1452 -= this.field1343;
         }

         this.field1344 -= this.field1343;
         this.field1343 = 0;
      }

   }

   public final synchronized void method2286(class115 class115_1) {
      this.field1341.method4888(class115_1);
   }

   protected class115 vmethod3894() {
      return (class115) this.field1341.method4892();
   }

   public final synchronized void method2293(class115 class115_1) {
      class115_1.unlink();
   }

   void method2274(class110 class110_1) {
      class110_1.unlink();
      class110_1.method2493();
      LinkedListNode linkedListNode_2 = this.field1342.field3540.next;
      if (linkedListNode_2 == this.field1342.field3540) {
         this.field1344 = -1;
      } else {
         this.field1344 = ((class110) linkedListNode_2).field1452;
      }

   }

   void method2273(LinkedListNode linkedListNode_1, class110 class110_2) {
      while (this.field1342.field3540 != linkedListNode_1 && ((class110) linkedListNode_1).field1452 <= class110_2.field1452) {
         linkedListNode_1 = linkedListNode_1.next;
      }

      class261.method4889(class110_2, linkedListNode_1);
      this.field1344 = ((class110) this.field1342.field3540.next).field1452;
   }

   protected int vmethod3892() {
      return 0;
   }

}
