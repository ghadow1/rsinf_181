public class class242 extends class175 {

   public static class233 field3233;
   public static class145 field3232 = new class145(64);
   public boolean field3234 = false;

   void method4396(class300 class300_1, int i_2, int i_3) {
      if (i_2 == 2) {
         this.field3234 = true;
      }

   }

   public void method4401(class300 class300_1, byte b_2) {
      while (true) {
         int i_3 = class300_1.readUByte();
         if (i_3 == 0) {
            return;
         }

         this.method4396(class300_1, i_3, 958337922);
      }
   }

   public static String method4403(CharSequence charsequence_0, short s_1) {
      long long_4 = 0L;
      int i_6 = charsequence_0.length();

      for (int i_7 = 0; i_7 < i_6; i_7++) {
         long_4 *= 37L;
         char var_8 = charsequence_0.charAt(i_7);
         if (var_8 >= 65 && var_8 <= 90) {
            long_4 += (long)(var_8 + 1 - 65);
         } else if (var_8 >= 97 && var_8 <= 122) {
            long_4 += (long)(var_8 + 1 - 97);
         } else if (var_8 >= 48 && var_8 <= 57) {
            long_4 += (long)(var_8 + 27 - 48);
         }

         if (long_4 >= 177917621779460413L) {
            break;
         }
      }

      while (long_4 % 37L == 0L && long_4 != 0L) {
         long_4 /= 37L;
      }

      String string_9 = class215.method4023(long_4);
      if (string_9 == null) {
         string_9 = "";
      }

      return string_9;
   }

}
