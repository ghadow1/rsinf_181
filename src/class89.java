public class class89 {

   static byte[] field1252 = new byte[2048];
   static byte[] field1250 = new byte[2048];
   static ByteBuffer[] field1254 = new ByteBuffer[2048];
   static int field1255 = 0;
   static int[] field1257 = new int[2048];
   static int field1251 = 0;
   static int[] field1258 = new int[2048];
   static int[] field1253 = new int[2048];
   static int[] field1260 = new int[2048];
   static int[] field1261 = new int[2048];
   static int field1262 = 0;
   static int[] field1256 = new int[2048];
   static ByteBuffer field1264 = new ByteBuffer(new byte[5000]);

   public static void method2093(byte b_0) {
      Object object_1 = class234.field3147;
      synchronized(class234.field3147) {
         if (class234.field3144 != 0) {
            class234.field3144 = 1;

            try {
               class234.field3147.wait();
            } catch (InterruptedException interruptedexception_4) {
               ;
            }
         }

      }
   }

   static final boolean method2091(int i_0, int i_1, int i_2) {
      class253 class253_3 = class128.method2970(i_0, (short) 4095);
      if (i_1 == 11) {
         i_1 = 10;
      }

      if (i_1 >= 5 && i_1 <= 8) {
         i_1 = 4;
      }

      return class253_3.method4589(i_1, -672143890);
   }

   static final void method2092(int i_0, int i_1, int i_2, int i_3, byte b_4) {
      for (int i_5 = i_1; i_5 <= i_3 + i_1; i_5++) {
         for (int i_6 = i_0; i_6 <= i_0 + i_2; i_6++) {
            if (i_6 >= 0 && i_6 < 104 && i_5 >= 0 && i_5 < 104) {
               class32.field282[0][i_6][i_5] = 127;
               if (i_0 == i_6 && i_6 > 0) {
                  class55.field516[0][i_6][i_5] = class55.field516[0][i_6 - 1][i_5];
               }

               if (i_6 == i_0 + i_2 && i_6 < 103) {
                  class55.field516[0][i_6][i_5] = class55.field516[0][i_6 + 1][i_5];
               }

               if (i_5 == i_1 && i_5 > 0) {
                  class55.field516[0][i_6][i_5] = class55.field516[0][i_6][i_5 - 1];
               }

               if (i_5 == i_3 + i_1 && i_5 < 103) {
                  class55.field516[0][i_6][i_5] = class55.field516[0][i_6][i_5 + 1];
               }
            }
         }
      }

   }

}
