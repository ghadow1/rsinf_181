import java.net.URL;

public class class144 {

   volatile byte[] field1951;
   volatile boolean field1957;
   final URL field1952;

   class144(URL url_1) {
      this.field1952 = url_1;
   }

   public boolean method3307() {
      return this.field1957;
   }

   public byte[] method3308() {
      return this.field1951;
   }

   public static int method3316(int i_0) {
      int i_2 = 0;
      if (i_0 < 0 || i_0 >= 65536) {
         i_0 >>>= 16;
         i_2 += 16;
      }

      if (i_0 >= 256) {
         i_0 >>>= 8;
         i_2 += 8;
      }

      if (i_0 >= 16) {
         i_0 >>>= 4;
         i_2 += 4;
      }

      if (i_0 >= 4) {
         i_0 >>>= 2;
         i_2 += 2;
      }

      if (i_0 >= 1) {
         i_0 >>>= 1;
         ++i_2;
      }

      return i_0 + i_2;
   }

   static final void method3318(int i_0, int i_1, int i_2, int i_3, boolean bool_4) {
      if (i_2 < 1) {
         i_2 = 1;
      }

      if (i_3 < 1) {
         i_3 = 1;
      }

      int i_6 = i_3 - 334;
      int i_7;
      if (i_6 < 0) {
         i_7 = Client.field782;
      } else if (i_6 >= 100) {
         i_7 = Client.field651;
      } else {
         i_7 = (Client.field651 - Client.field782) * i_6 / 100 + Client.field782;
      }

      int i_8 = i_3 * i_7 * 512 / (i_2 * 334);
      int i_9;
      int i_10;
      short s_18;
      if (i_8 < Client.field732) {
         s_18 = Client.field732;
         i_7 = s_18 * i_2 * 334 / (i_3 * 512);
         if (i_7 > Client.field790) {
            i_7 = Client.field790;
            i_9 = i_3 * i_7 * 512 / (s_18 * 334);
            i_10 = (i_2 - i_9) / 2;
            if (bool_4) {
               Rasterizer2D.method5996();
               Rasterizer2D.fillRectangle(i_0, i_1, i_10, i_3, -16777216);
               Rasterizer2D.fillRectangle(i_0 + i_2 - i_10, i_1, i_10, i_3, -16777216);
            }

            i_0 += i_10;
            i_2 -= i_10 * 2;
         }
      } else if (i_8 > Client.field659) {
         s_18 = Client.field659;
         i_7 = s_18 * i_2 * 334 / (i_3 * 512);
         if (i_7 < Client.field820) {
            i_7 = Client.field820;
            i_9 = s_18 * i_2 * 334 / (i_7 * 512);
            i_10 = (i_3 - i_9) / 2;
            if (bool_4) {
               Rasterizer2D.method5996();
               Rasterizer2D.fillRectangle(i_0, i_1, i_2, i_10, -16777216);
               Rasterizer2D.fillRectangle(i_0, i_3 + i_1 - i_10, i_2, i_10, -16777216);
            }

            i_1 += i_10;
            i_3 -= i_10 * 2;
         }
      }

      Client.field917 = i_3 * i_7 / 334;
      if (i_2 != Client.field746 || i_3 != Client.field714) {
         int[] ints_17 = new int[9];

         for (i_10 = 0; i_10 < ints_17.length; i_10++) {
            int i_11 = i_10 * 32 + 15 + 128;
            int i_12 = FontName.method700(i_11, (byte) -12);
            int i_13 = class130.field1787[i_11];
            int i_15 = i_3 - 334;
            if (i_15 < 0) {
               i_15 = 0;
            } else if (i_15 > 100) {
               i_15 = 100;
            }

            int i_16 = (Client.field908 - Client.field906) * i_15 / 100 + Client.field906;
            int i_14 = i_16 * i_12 / 256;
            ints_17[i_10] = i_13 * i_14 >> 16;
         }

         class133.method3101(ints_17, 500, 800, i_2 * 334 / i_3, 334);
      }

      Client.field913 = i_0;
      Client.field914 = i_1;
      Client.field746 = i_2;
      Client.field714 = i_3;
   }

   public static void method3317(class233 class233_0, class233 class233_1, class233 class233_2, class233 class233_3, int i_4) {
      Widget.field2557 = class233_0;
      class128.field1756 = class233_1;
      class216.field2547 = class233_2;
      TimeUtils.field2498 = class233_3;
      Widget.field2556 = new Widget[Widget.field2557.method4232()][];
      class128.field1755 = new boolean[Widget.field2557.method4232()];
   }

}
