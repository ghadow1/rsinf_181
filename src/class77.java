public final class class77 extends class135 {

   int field1120 = 0;
   int field1121 = 0;
   boolean field1122 = false;
   int field1116;
   int field1124;
   int field1117;
   int field1113;
   int field1118;
   int field1114;
   class258 field1119;

   class77(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      this.field1116 = i_1;
      this.field1124 = i_2;
      this.field1117 = i_3;
      this.field1113 = i_4;
      this.field1118 = i_5;
      this.field1114 = i_7 + i_6;
      int i_8 = class201.method3887(this.field1116, (byte) 96).field3238;
      if (i_8 != -1) {
         this.field1122 = false;
         this.field1119 = class7.method81(i_8, (byte) 1);
      } else {
         this.field1122 = true;
      }

   }

   protected final class127 vmethod3253(int i_1) {
      class243 class243_2 = class201.method3887(this.field1116, (byte) 65);
      class127 class127_3;
      if (!this.field1122) {
         class127_3 = class243_2.method4406(this.field1120, 1645713423);
      } else {
         class127_3 = class243_2.method4406(-1, 1645713423);
      }

      return class127_3 == null ? null : class127_3;
   }

   final void method1938(int i_1, byte b_2) {
      if (!this.field1122) {
         this.field1121 += i_1;

         while (this.field1121 > this.field1119.field3522[this.field1120]) {
            this.field1121 -= this.field1119.field3522[this.field1120];
            ++this.field1120;
            if (this.field1120 >= this.field1119.field3520.length) {
               this.field1122 = true;
               break;
            }
         }

      }
   }

   static void method1945(int i_0) {
      class224.method4121();
      client.field796[0] = "Cancel";
      client.field668[0] = "";
      client.field794[0] = 1006;
      client.field769[0] = false;
      client.field791 = 1;
   }

   static final void method1947(class115 class115_0, int i_1) {
      class115_0.field1498 = false;
      if (class115_0.field1497 != null) {
         class115_0.field1497.field1529 = 0;
      }

      for (class115 class115_2 = class115_0.vmethod3894(); class115_2 != null; class115_2 = class115_0.vmethod3891()) {
         method1947(class115_2, -464512720);
      }

   }

   static int method1943(int i_0, class92 class92_1, boolean bool_2, short s_3) {
      class217 class217_4;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         class217_4 = class80.fetchSomething(class76.field1098[--class70.field1014]);
      } else {
         class217_4 = bool_2 ? class76.field1111 : class207.field2507;
      }

      String string_5 = class76.field1093[--class221.field2747];
      int[] ints_6 = null;
      if (string_5.length() > 0 && string_5.charAt(string_5.length() - 1) == 89) {
         int i_7 = class76.field1098[--class70.field1014];
         if (i_7 > 0) {
            for (ints_6 = new int[i_7]; i_7-- > 0; ints_6[i_7] = class76.field1098[--class70.field1014]) {
               ;
            }
         }

         string_5 = string_5.substring(0, string_5.length() - 1);
      }

      Object[] arr_9 = new Object[string_5.length() + 1];

      int i_8;
      for (i_8 = arr_9.length - 1; i_8 >= 1; --i_8) {
         if (string_5.charAt(i_8 - 1) == 115) {
            arr_9[i_8] = class76.field1093[--class221.field2747];
         } else {
            arr_9[i_8] = new Integer(class76.field1098[--class70.field1014]);
         }
      }

      i_8 = class76.field1098[--class70.field1014];
      if (i_8 != -1) {
         arr_9[0] = new Integer(i_8);
      } else {
         arr_9 = null;
      }

      if (i_0 == 1400) {
         class217_4.field2652 = arr_9;
      } else if (i_0 == 1401) {
         class217_4.field2637 = arr_9;
      } else if (i_0 == 1402) {
         class217_4.field2654 = arr_9;
      } else if (i_0 == 1403) {
         class217_4.field2608 = arr_9;
      } else if (i_0 == 1404) {
         class217_4.field2658 = arr_9;
      } else if (i_0 == 1405) {
         class217_4.field2620 = arr_9;
      } else if (i_0 == 1406) {
         class217_4.field2662 = arr_9;
      } else if (i_0 == 1407) {
         class217_4.field2626 = arr_9;
         class217_4.field2664 = ints_6;
      } else if (i_0 == 1408) {
         class217_4.field2602 = arr_9;
      } else if (i_0 == 1409) {
         class217_4.field2656 = arr_9;
      } else if (i_0 == 1410) {
         class217_4.field2660 = arr_9;
      } else if (i_0 == 1411) {
         class217_4.field2653 = arr_9;
      } else if (i_0 == 1412) {
         class217_4.field2581 = arr_9;
      } else if (i_0 == 1414) {
         class217_4.field2665 = arr_9;
         class217_4.field2666 = ints_6;
      } else if (i_0 == 1415) {
         class217_4.field2594 = arr_9;
         class217_4.field2668 = ints_6;
      } else if (i_0 == 1416) {
         class217_4.field2661 = arr_9;
      } else if (i_0 == 1417) {
         class217_4.field2671 = arr_9;
      } else if (i_0 == 1418) {
         class217_4.field2672 = arr_9;
      } else if (i_0 == 1419) {
         class217_4.field2673 = arr_9;
      } else if (i_0 == 1420) {
         class217_4.field2674 = arr_9;
      } else if (i_0 == 1421) {
         class217_4.field2623 = arr_9;
      } else if (i_0 == 1422) {
         class217_4.field2676 = arr_9;
      } else if (i_0 == 1423) {
         class217_4.field2677 = arr_9;
      } else if (i_0 == 1424) {
         class217_4.field2678 = arr_9;
      } else if (i_0 == 1425) {
         class217_4.field2622 = arr_9;
      } else if (i_0 == 1426) {
         class217_4.field2681 = arr_9;
      } else {
         if (i_0 != 1427) {
            return 2;
         }

         class217_4.field2679 = arr_9;
      }

      class217_4.field2551 = true;
      return 1;
   }

   static final int method1948(int i_0, int i_1, int i_2) {
      if (i_0 == -1) {
         return 12345678;
      } else {
         i_1 = (i_0 & 0x7f) * i_1 / 128;
         if (i_1 < 2) {
            i_1 = 2;
         } else if (i_1 > 126) {
            i_1 = 126;
         }

         return (i_0 & 0xff80) + i_1;
      }
   }

}
