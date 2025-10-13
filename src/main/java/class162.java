public class class162 implements class161 {

   public static boolean method3445(int i_0) {
      if (class128.field1755[i_0]) {
         return true;
      } else if (!Widget.field2557.method4199(i_0)) {
         return false;
      } else {
         int i_2 = Widget.field2557.method4154(i_0);
         if (i_2 == 0) {
            class128.field1755[i_0] = true;
            return true;
         } else {
            if (Widget.field2556[i_0] == null) {
               Widget.field2556[i_0] = new Widget[i_2];
            }

            for (int i_3 = 0; i_3 < i_2; i_3++) {
               if (Widget.field2556[i_0][i_3] == null) {
                  byte[] bytes_4 = Widget.field2557.method4144(i_0, i_3);
                  if (bytes_4 != null) {
                     Widget.field2556[i_0][i_3] = new Widget();
                     Widget.field2556[i_0][i_3].field2688 = i_3 + (i_0 << 16);
                     if (bytes_4[0] == -1) {
                        Widget.field2556[i_0][i_3].method4088(new ByteBuffer(bytes_4), (byte) 30);
                     } else {
                        Widget.field2556[i_0][i_3].method4031(new ByteBuffer(bytes_4), (byte) 9);
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
