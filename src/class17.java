public class class17 {

   public static class108 field119;
   static class73 field117;
   static class235 field110;
   public static final class17 field113 = new class17(0, 0, 4);
   public static final class17 field118 = new class17(2, 1, 2);
   public static final class17 field116 = new class17(1, 2, 0);
   final int field112;
   final int field114;
   final int field115;

   class17(int i_1, int i_2, int i_3) {
      this.field112 = i_1;
      this.field114 = i_2;
      this.field115 = i_3;
   }

   boolean method184(float f_1, int i_2) {
      return f_1 >= (float)this.field115;
   }

   static class17[] method178(byte b_0) {
      return new class17[] {field113, field118, field116};
   }

   static class17 method177(int i_0, int i_1) {
      class17[] arr_2 = method178((byte) 31);

      for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
         class17 class17_4 = arr_2[i_3];
         if (i_0 == class17_4.field114) {
            return class17_4;
         }
      }

      return null;
   }

   static void method188(int i_0, int i_1, int i_2) {
      if (Client.field911 != 0 && i_0 != -1) {
         class169.method3503(class32.field279, i_0, 0, Client.field911, false, 1012111879);
         Client.field699 = true;
      }

   }

   static final void method175(int i_0, int i_1, int i_2) {
      if (class162.method3445(i_0)) {
         class31.method539(Widget.field2556[i_0], i_1, (short) 28886);
      }
   }

   static void method187(int i_0, boolean bool_1, int i_2, boolean bool_3, int i_4) {
      if (World.field1031 != null) {
         class9.method112(0, World.field1031.length - 1, i_0, bool_1, i_2, bool_3, (byte) 1);
      }

   }

}
