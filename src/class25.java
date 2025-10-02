public class class25 {

   static int field212;
   final int field208;
   final int field209;
   final int field210;

   class25(int i_1, int i_2, int i_3) {
      this.field208 = i_1;
      this.field209 = i_2;
      this.field210 = i_3;
   }

   static int method324(int i_0, class92 class92_1, boolean bool_2, byte b_3) {
      class217 class217_4;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         class217_4 = class80.fetchSomething(class76.field1098[--class70.field1014]);
      } else {
         class217_4 = bool_2 ? class76.field1111 : class207.field2507;
      }

      class224.method4120(class217_4);
      if (i_0 != 1200 && i_0 != 1205 && i_0 != 1212) {
         if (i_0 == 1201) {
            class217_4.field2607 = 2;
            class217_4.field2649 = class76.field1098[--class70.field1014];
            return 1;
         } else if (i_0 == 1202) {
            class217_4.field2607 = 3;
            class217_4.field2649 = Client.field657.field613.method3994(-2004710202);
            return 1;
         } else {
            return 2;
         }
      } else {
         class70.field1014 -= 2;
         int i_5 = class76.field1098[class70.field1014];
         int i_6 = class76.field1098[class70.field1014 + 1];
         class217_4.field2690 = i_5;
         class217_4.field2655 = i_6;
         class254 class254_7 = class26.method404(i_5);
         class217_4.field2615 = class254_7.field3418;
         class217_4.field2616 = class254_7.field3447;
         class217_4.field2640 = class254_7.field3420;
         class217_4.field2593 = class254_7.field3406;
         class217_4.field2614 = class254_7.field3421;
         class217_4.field2618 = class254_7.field3422;
         if (i_0 == 1205) {
            class217_4.field2703 = 0;
         } else if (i_0 == 1212 | class254_7.field3423 == 1) {
            class217_4.field2703 = 1;
         } else {
            class217_4.field2703 = 2;
         }

         if (class217_4.field2619 > 0) {
            class217_4.field2618 = class217_4.field2618 * 32 / class217_4.field2619;
         } else if (class217_4.field2670 > 0) {
            class217_4.field2618 = class217_4.field2618 * 32 / class217_4.field2670;
         }

         return 1;
      }
   }

   static void method323(String string_0, boolean bool_1, byte b_2) {
      string_0 = string_0.toLowerCase();
      short[] shorts_3 = new short[16];
      int i_4 = 0;

      for (int i_5 = 0; i_5 < class254.field3455; i_5++) {
         class254 class254_6 = class26.method404(i_5);
         if ((!bool_1 || class254_6.field3452) && class254_6.field3444 == -1 && class254_6.field3449.toLowerCase().indexOf(string_0) != -1) {
            if (i_4 >= 250) {
               class257.field3502 = -1;
               class39.field336 = null;
               return;
            }

            if (i_4 >= shorts_3.length) {
               short[] shorts_7 = new short[shorts_3.length * 2];

               for (int i_8 = 0; i_8 < i_4; i_8++) {
                  shorts_7[i_8] = shorts_3[i_8];
               }

               shorts_3 = shorts_7;
            }

            shorts_3[i_4++] = (short)i_5;
         }
      }

      class39.field336 = shorts_3;
      class32.field280 = 0;
      class257.field3502 = i_4;
      String[] arr_9 = new String[class257.field3502];

      for (int i_10 = 0; i_10 < class257.field3502; i_10++) {
         arr_9[i_10] = class26.method404(shorts_3[i_10]).field3449;
      }

      class82.method1991(arr_9, class39.field336, (short) -2750);
   }

}
