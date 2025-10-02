import java.awt.FontMetrics;
import java.util.Comparator;

final class class12 implements Comparator {

   static FontMetrics field80;
   static class324[] field82;

   int method135(class7 class7_1, class7 class7_2, int i_3) {
      return class7_1.field42 < class7_2.field42 ? -1 : (class7_2.field42 == class7_1.field42 ? 0 : 1);
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method135((class7) object_1, (class7) object_2, -502692128);
   }

   public static int method148(CharSequence charsequence_0, byte b_1) {
      int i_2 = charsequence_0.length();
      int i_3 = 0;

      for (int i_4 = 0; i_4 < i_2; i_4++) {
         i_3 = (i_3 << 5) - i_3 + class254.method4699(charsequence_0.charAt(i_4), (short) -4166);
      }

      return i_3;
   }

   static final void method146(int i_0, int i_1) {
      if (class162.method3445(i_0)) {
         class217[] arr_2 = class217.field2556[i_0];

         for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
            class217 class217_4 = arr_2[i_3];
            if (class217_4 != null) {
               class217_4.field2692 = 0;
               class217_4.field2584 = 0;
            }
         }

      }
   }

   static void method145(byte b_0) {
      class236.method4312(class42.field373 / 2 + class247.field3292, class30.field267, -690667518);
   }

   static void method144(int i_0, int i_1) {
      class59 class59_2 = (class59) class59.field552.method5952((long)i_0);
      if (class59_2 != null) {
         for (int i_3 = 0; i_3 < class59_2.field550.length; i_3++) {
            class59_2.field550[i_3] = -1;
            class59_2.field551[i_3] = 0;
         }

      }
   }

   static int method147(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      class217 class217_4 = bool_2 ? class76.field1111 : class207.field2507;
      if (i_0 == 1500) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2577;
         return 1;
      } else if (i_0 == 1501) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2699;
         return 1;
      } else if (i_0 == 1502) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2579;
         return 1;
      } else if (i_0 == 1503) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2667;
         return 1;
      } else if (i_0 == 1504) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2706 ? 1 : 0;
         return 1;
      } else if (i_0 == 1505) {
         class76.field1098[++class70.field1014 - 1] = class217_4.field2583;
         return 1;
      } else {
         return 2;
      }
   }

   static void method134(int i_0, int i_1, int i_2, int i_3, int i_4) {
      class59 class59_5 = (class59) class59.field552.method5952((long)i_0);
      if (class59_5 == null) {
         class59_5 = new class59();
         class59.field552.method5951(class59_5, (long)i_0);
      }

      if (class59_5.field550.length <= i_1) {
         int[] ints_6 = new int[i_1 + 1];
         int[] ints_7 = new int[i_1 + 1];

         int i_8;
         for (i_8 = 0; i_8 < class59_5.field550.length; i_8++) {
            ints_6[i_8] = class59_5.field550[i_8];
            ints_7[i_8] = class59_5.field551[i_8];
         }

         for (i_8 = class59_5.field550.length; i_8 < i_1; i_8++) {
            ints_6[i_8] = -1;
            ints_7[i_8] = 0;
         }

         class59_5.field550 = ints_6;
         class59_5.field551 = ints_7;
      }

      class59_5.field550[i_1] = i_2;
      class59_5.field551[i_1] = i_3;
   }

   static final boolean method149(class217 class217_0, byte b_1) {
      int i_2 = class217_0.field2568;
      if (i_2 == 205) {
         Client.field700 = 250;
         return true;
      } else {
         int i_3;
         int i_4;
         if (i_2 >= 300 && i_2 <= 313) {
            i_3 = (i_2 - 300) / 2;
            i_4 = i_2 & 0x1;
            Client.field918.method3992(i_3, i_4 == 1, (short) 7431);
         }

         if (i_2 >= 314 && i_2 <= 323) {
            i_3 = (i_2 - 314) / 2;
            i_4 = i_2 & 0x1;
            Client.field918.method3993(i_3, i_4 == 1, (byte) 1);
         }

         if (i_2 == 324) {
            Client.field918.method4006(false, -1889308905);
         }

         if (i_2 == 325) {
            Client.field918.method4006(true, -1889308905);
         }

         if (i_2 == 326) {
            class187 class187_5 = class235.method4265(class183.field2215, Client.field880.field1313, 1775123545);
            Client.field918.method3995(class187_5.outBuffer, 318518244);
            Client.field880.copy(class187_5);
            return true;
         } else {
            return false;
         }
      }
   }

}
