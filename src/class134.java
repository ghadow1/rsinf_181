import java.io.IOException;

public class class134 {

   public static short[] field1870;
   public static boolean field1868;
   static int field1871;

   static class73 method3249(int i_0) {
      class343 class343_1 = null;
      class73 class73_2 = new class73();

      try {
         class343_1 = class18.method207("", class29.field248.field3111, false, 403925175);
         byte[] bytes_3 = new byte[(int)class343_1.method6552()];

         int i_5;
         for (int i_4 = 0; i_4 < bytes_3.length; i_4 += i_5) {
            i_5 = class343_1.method6554(bytes_3, i_4, bytes_3.length - i_4);
            if (i_5 == -1) {
               throw new IOException();
            }
         }

         class73_2 = new class73(new class300(bytes_3));
      } catch (Exception exception_7) {
         ;
      }

      try {
         if (class343_1 != null) {
            class343_1.method6550();
         }
      } catch (Exception exception_6) {
         ;
      }

      return class73_2;
   }

   static int method3250(int i_0, class92 class92_1, boolean bool_2, byte b_3) {
      int i_4 = -1;
      class217 class217_5;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         i_4 = class76.field1098[--class70.field1014];
         class217_5 = class80.fetchSomething(i_4);
      } else {
         class217_5 = bool_2 ? class76.field1111 : class207.field2507;
      }

      if (i_0 == 1000) {
         class70.field1014 -= 4;
         class217_5.field2651 = class76.field1098[class70.field1014];
         class217_5.field2574 = class76.field1098[class70.field1014 + 1];
         class217_5.field2694 = class76.field1098[class70.field1014 + 2];
         class217_5.field2570 = class76.field1098[class70.field1014 + 3];
         class224.method4120(class217_5);
         class27.field233.method1260(class217_5, 2120964597);
         if (i_4 != -1 && class217_5.field2566 == 0) {
            class27.method413(class217.field2556[i_4 >> 16], class217_5, false, 870375054);
         }

         return 1;
      } else if (i_0 == 1001) {
         class70.field1014 -= 4;
         class217_5.field2670 = class76.field1098[class70.field1014];
         class217_5.field2576 = class76.field1098[class70.field1014 + 1];
         class217_5.field2638 = class76.field1098[class70.field1014 + 2];
         class217_5.field2572 = class76.field1098[class70.field1014 + 3];
         class224.method4120(class217_5);
         class27.field233.method1260(class217_5, 2120964597);
         if (i_4 != -1 && class217_5.field2566 == 0) {
            class27.method413(class217.field2556[i_4 >> 16], class217_5, false, 768291879);
         }

         return 1;
      } else if (i_0 == 1003) {
         boolean bool_6 = class76.field1098[--class70.field1014] == 1;
         if (bool_6 != class217_5.field2706) {
            class217_5.field2706 = bool_6;
            class224.method4120(class217_5);
         }

         return 1;
      } else if (i_0 == 1005) {
         class217_5.field2580 = class76.field1098[--class70.field1014] == 1;
         return 1;
      } else if (i_0 == 1006) {
         class217_5.field2697 = class76.field1098[--class70.field1014] == 1;
         return 1;
      } else {
         return 2;
      }
   }

}
