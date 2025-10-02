public class class162 implements class161 {

   public static boolean method3445(int i_0, int i_1) {
      if (class128.field1755[i_0]) {
         return true;
      } else if (!class217.field2557.method4199(i_0, 194128149)) {
         return false;
      } else {
         int i_2 = class217.field2557.method4154(i_0, -959720772);
         if (i_2 == 0) {
            class128.field1755[i_0] = true;
            return true;
         } else {
            if (class217.field2556[i_0] == null) {
               class217.field2556[i_0] = new class217[i_2];
            }

            for (int i_3 = 0; i_3 < i_2; i_3++) {
               if (class217.field2556[i_0][i_3] == null) {
                  byte[] bytes_4 = class217.field2557.method4144(i_0, i_3);
                  if (bytes_4 != null) {
                     class217.field2556[i_0][i_3] = new class217();
                     class217.field2556[i_0][i_3].field2688 = i_3 + (i_0 << 16);
                     if (bytes_4[0] == -1) {
                        class217.field2556[i_0][i_3].method4088(new ByteBuffer(bytes_4), (byte) 30);
                     } else {
                        class217.field2556[i_0][i_3].method4031(new ByteBuffer(bytes_4), (byte) 9);
                     }
                  }
               }
            }

            class128.field1755[i_0] = true;
            return true;
         }
      }
   }

}
