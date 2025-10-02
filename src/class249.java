public class class249 extends class175 {

   public static int field3308;
   static class233 field3307;
   static class145 field3301 = new class145(64);
   boolean field3305 = true;
   public int field3302;
   char field3306;
   public String field3303;

   void method4498(class300 class300_1, int i_2, int i_3) {
      if (i_2 == 1) {
         byte b_5 = class300_1.method5495();
         int i_6 = b_5 & 0xff;
         if (i_6 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(i_6, 16));
         }

         if (i_6 >= 128 && i_6 < 160) {
            char var_7 = class288.field3667[i_6 - 128];
            if (var_7 == 0) {
               var_7 = 63;
            }

            i_6 = var_7;
         }

         char var_4 = (char)i_6;
         this.field3306 = var_4;
      } else if (i_2 == 2) {
         this.field3302 = class300_1.readIntMedEndian();
      } else if (i_2 == 4) {
         this.field3305 = false;
      } else if (i_2 == 5) {
         this.field3303 = class300_1.readNullTermString();
      }

   }

   public boolean method4499(int i_1) {
      return this.field3306 == 115;
   }

   void method4496(byte b_1) {
   }

   void method4497(class300 class300_1, byte b_2) {
      while (true) {
         int i_3 = class300_1.method5504();
         if (i_3 == 0) {
            return;
         }

         this.method4498(class300_1, i_3, 506424646);
      }
   }

   public static class250 method4510(int i_0, int i_1) {
      class250 class250_2 = (class250) class250.field3311.method3320((long)i_0);
      if (class250_2 != null) {
         return class250_2;
      } else {
         byte[] bytes_3 = class250.field3309.method4144(34, i_0);
         class250_2 = new class250();
         if (bytes_3 != null) {
            class250_2.method4516(new class300(bytes_3), 1347797517);
         }

         class250_2.method4512((short) 9298);
         class250.field3311.method3322(class250_2, (long)i_0);
         return class250_2;
      }
   }

}
