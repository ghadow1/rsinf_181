public class class62 extends LinkedListNode {

   static int field585;
   static class308 field573;
   static String field586;
   class217 field575;
   int field576;
   int field577;
   class217 field579;
   int field583;
   String field582;
   boolean field574;
   int field578;
   int field580;
   int field587;
   int field584 = 76;
   Object[] field581;

   public void method1131(Object[] arr_1) {
      this.field581 = arr_1;
   }

   public void method1123(int i_1) {
      this.field584 = i_1;
   }

   static void method1132(int i_0, String string_1, String string_2) {
      class14.method157(i_0, string_1, string_2, (String) null);
   }

   static boolean method1133(class217 class217_0) {
      return class217_0.field2706;
   }

   static final int method1130(int i_0, int i_1, int i_2) {
      int i_4 = i_0 >> 7;
      int i_5 = i_1 >> 7;
      if (i_4 >= 0 && i_5 >= 0 && i_4 <= 103 && i_5 <= 103) {
         int i_6 = i_2;
         if (i_2 < 3 && (class55.field502[1][i_4][i_5] & 0x2) == 2) {
            i_6 = i_2 + 1;
         }

         int i_7 = i_0 & 0x7f;
         int i_8 = i_1 & 0x7f;
         int i_9 = (128 - i_7) * class55.field516[i_6][i_4][i_5] + class55.field516[i_6][i_4 + 1][i_5] * i_7 >> 7;
         int i_10 = class55.field516[i_6][i_4 + 1][i_5 + 1] * i_7 + class55.field516[i_6][i_4][i_5 + 1] * (128 - i_7) >> 7;
         return i_8 * i_10 + i_9 * (128 - i_8) >> 7;
      } else {
         return 0;
      }
   }

   static int method1121() {
      return 11;
   }

   static int method1127(int i_0) {
      class217 class217_4 = class80.fetchSomething(class76.field1098[--class70.field1014]);
      if (i_0 == 2500) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2577;
         return 1;
      } else if (i_0 == 2501) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2699;
         return 1;
      } else if (i_0 == 2502) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2579;
         return 1;
      } else if (i_0 == 2503) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2667;
         return 1;
      } else if (i_0 == 2504) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2706 ? 1 : 0;
         return 1;
      } else if (i_0 == 2505) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2583;
         return 1;
      } else {
         return 2;
      }
   }

   static boolean method1128(int i_0) {
      return Client.flag_23;
   }

}
