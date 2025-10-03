public final class class120 {

   class135 field1543;
   int field1541;
   int field1540;
   int field1547;
   long field1544;
   class135 field1542;
   class135 field1545;
   int field1546;

   public static void method2766(byte b_0) {
      class253.field3390.method3323();
      class253.field3387.method3323();
      class253.field3354.method3323();
      class253.field3355.method3323();
   }

   static void method2764(int i_0) {
      class59 class59_2 = (class59) class59.field552.method5952((long)i_0);
      if (class59_2 != null) {
         class59_2.unlink();
      }
   }

   public static int method2767(int i_0, int i_1, int i_2) {
      int i_3 = i_0 >>> 31;
      return (i_0 + i_3) / i_1 - i_3;
   }

   static final int method2765(int i_0, int i_1) {
      int i_3 = MouseHandler.method1021(i_0 - 1, i_1 - 1) + MouseHandler.method1021(1 + i_0, i_1 - 1) + MouseHandler.method1021(i_0 - 1, 1 + i_1) + MouseHandler.method1021(1 + i_0, 1 + i_1);
      int i_4 = MouseHandler.method1021(i_0 - 1, i_1) + MouseHandler.method1021(i_0 + 1, i_1) + MouseHandler.method1021(i_0, i_1 - 1) + MouseHandler.method1021(i_0, i_1 + 1);
      int i_5 = MouseHandler.method1021(i_0, i_1);
      return i_3 / 16 + i_4 / 8 + i_5 / 4;
   }

}
