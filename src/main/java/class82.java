public class class82 {

   static int field1160;
   int field1157;
   int field1156;
   int field1155;
   int field1158;
   String field1159;

   static int method1992(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      Widget widget_4 = bool_2 ? MouseRecorder.field1111 : class207.field2507;
      if (i_0 == 1600) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2585;
         return 1;
      } else if (i_0 == 1601) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2586;
         return 1;
      } else if (i_0 == 1602) {
         MouseRecorder.field1093[++class221.field2747 - 1] = widget_4.field2601;
         return 1;
      } else if (i_0 == 1603) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2687;
         return 1;
      } else if (i_0 == 1604) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2569;
         return 1;
      } else if (i_0 == 1605) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2618;
         return 1;
      } else if (i_0 == 1606) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2615;
         return 1;
      } else if (i_0 == 1607) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2640;
         return 1;
      } else if (i_0 == 1608) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2616;
         return 1;
      } else if (i_0 == 1609) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2595;
         return 1;
      } else if (i_0 == 1610) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2596;
         return 1;
      } else if (i_0 == 1611) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2695;
         return 1;
      } else if (i_0 == 1612) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2639;
         return 1;
      } else if (i_0 == 1613) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2693.getId(2003391553);
         return 1;
      } else if (i_0 == 1614) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2564 ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   public static int method1993(CharSequence charsequence_0, CharSequence charsequence_1, class190 class190_2, byte b_3) {
      int i_4 = charsequence_0.length();
      int i_5 = charsequence_1.length();
      int i_6 = 0;
      int i_7 = 0;
      byte b_8 = 0;
      byte b_9 = 0;

      while (i_6 - b_8 < i_4 || i_7 - b_9 < i_5) {
         if (i_6 - b_8 >= i_4) {
            return -1;
         }

         if (i_7 - b_9 >= i_5) {
            return 1;
         }

         char var_10;
         if (b_8 != 0) {
            var_10 = (char) b_8;
            boolean bool_15 = false;
         } else {
            var_10 = charsequence_0.charAt(i_6++);
         }

         char var_11;
         if (b_9 != 0) {
            var_11 = (char) b_9;
            boolean bool_16 = false;
         } else {
            var_11 = charsequence_1.charAt(i_7++);
         }

         byte b_12;
         if (var_10 == 198) {
            b_12 = 69;
         } else if (var_10 == 230) {
            b_12 = 101;
         } else if (var_10 == 223) {
            b_12 = 115;
         } else if (var_10 == 338) {
            b_12 = 69;
         } else if (var_10 == 339) {
            b_12 = 101;
         } else {
            b_12 = 0;
         }

         b_8 = b_12;
         byte b_13;
         if (var_11 == 198) {
            b_13 = 69;
         } else if (var_11 == 230) {
            b_13 = 101;
         } else if (var_11 == 223) {
            b_13 = 115;
         } else if (var_11 == 338) {
            b_13 = 69;
         } else if (var_11 == 339) {
            b_13 = 101;
         } else {
            b_13 = 0;
         }

         b_9 = b_13;
         var_10 = class187.method3623(var_10, class190_2);
         var_11 = class187.method3623(var_11, class190_2);
         if (var_11 != var_10 && Character.toUpperCase(var_10) != Character.toUpperCase(var_11)) {
            var_10 = Character.toLowerCase(var_10);
            var_11 = Character.toLowerCase(var_11);
            if (var_11 != var_10) {
               return class26.method387(var_10, class190_2, -1599883249) - class26.method387(var_11, class190_2, -1757365235);
            }
         }
      }

      int i_17 = Math.min(i_4, i_5);

      int i_18;
      char var_21;
      for (i_18 = 0; i_18 < i_17; i_18++) {
         if (class190_2 == class190.field2347) {
            i_6 = i_4 - 1 - i_18;
            i_7 = i_5 - 1 - i_18;
         } else {
            i_7 = i_18;
            i_6 = i_18;
         }

         char var_19 = charsequence_0.charAt(i_6);
         var_21 = charsequence_1.charAt(i_7);
         if (var_19 != var_21 && Character.toUpperCase(var_19) != Character.toUpperCase(var_21)) {
            var_19 = Character.toLowerCase(var_19);
            var_21 = Character.toLowerCase(var_21);
            if (var_19 != var_21) {
               return class26.method387(var_19, class190_2, -2081105774) - class26.method387(var_21, class190_2, -1433613834);
            }
         }
      }

      i_18 = i_4 - i_5;
      if (i_18 != 0) {
         return i_18;
      } else {
         for (int i_20 = 0; i_20 < i_17; i_20++) {
            var_21 = charsequence_0.charAt(i_20);
            char var_14 = charsequence_1.charAt(i_20);
            if (var_14 != var_21) {
               return class26.method387(var_21, class190_2, -1555702306) - class26.method387(var_14, class190_2, -1550537763);
            }
         }

         return 0;
      }
   }

   public static void method1991(String[] arr_0, short[] shorts_1, short s_2) {
      class9.method105(arr_0, shorts_1, 0, arr_0.length - 1, (byte) 32);
   }

}
