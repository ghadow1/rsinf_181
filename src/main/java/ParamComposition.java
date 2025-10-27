public class ParamComposition extends DualNode {

   public static int clientHeight;
   static class233 field3307;
   static class145 field3301 = new class145(64);
   boolean autoDisable = true;
   public int field3302;
   char field3306;
   public String field3303;

   void method4498(ByteBuffer class300_1, int i_2) {
      if (i_2 == 1) {
         byte b_5 = class300_1.readSignedByte();
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
         this.autoDisable = false;
      } else if (i_2 == 5) {
         this.field3303 = class300_1.readNullTerminatedString();
      }

   }

   public boolean method4499() {
      return this.field3306 == 115;
   }

   void method4496() {
   }

   void method4497(ByteBuffer class300_1) {
      while (true) {
         int i_3 = class300_1.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.method4498(class300_1, i_3);
      }
   }

   public static class250 method4510(int i_0, int i_1) {
      class250 class250_2 = (class250) class250.field3311.get((long)i_0);
      if (class250_2 != null) {
         return class250_2;
      } else {
         byte[] bytes_3 = class250.field3309.method4144(34, i_0);
         class250_2 = new class250();
         if (bytes_3 != null) {
            class250_2.method4516(new ByteBuffer(bytes_3));
         }

         class250_2.method4512();
         class250.field3311.put(class250_2, (long)i_0);
         return class250_2;
      }
   }

}
