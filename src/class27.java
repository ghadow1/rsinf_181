public final class class27 {

   static client field233;
   static class235 field232;
   final int[] field230;

   class27() {
      this.field230 = new int[4096];
   }

   class27(int[] ints_1) {
      this.field230 = ints_1;
   }

   final int method408(int i_1, int i_2, byte b_3) {
      return this.field230[i_2 * 64 + i_1];
   }

   static final void method416(int i_0, int i_1, int i_2, boolean bool_3, int i_4) {
      if (class162.method3445(i_0, 1772418873)) {
         class13.method150(class217.field2556[i_0], -1, i_1, i_2, bool_3, 2021485815);
      }
   }

   static final void method412(int i_0, int i_1, int i_2) {
      if (client.field791 >= 2 || client.field900 != 0 || client.field810) {
         if (client.field802) {
            int i_3 = class13.method151(246973533);
            String string_4;
            if (client.field900 == 1 && client.field791 < 2) {
               string_4 = "Use" + " " + client.field738 + " " + "->";
            } else if (client.field810 && client.field791 < 2) {
               string_4 = client.field813 + " " + client.field814 + " " + "->";
            } else {
               string_4 = class28.method417(i_3, (byte) 36);
            }

            if (client.field791 > 2) {
               string_4 = string_4 + class73.method1756(16777215, -844505624) + " " + '/' + " " + (client.field791 - 2) + " more options";
            }

            class23.field193.method5349(string_4, i_0 + 4, i_1 + 15, 16777215, 0, client.field881 / 1000);
         }
      }
   }

   public static void method414(class233 class233_0, int i_1) {
      class244.field3255 = class233_0;
   }

   static void method413(class217[] arr_0, class217 class217_1, boolean bool_2, int i_3) {
      int i_4 = class217_1.field2687 != 0 ? class217_1.field2687 : class217_1.field2579;
      int i_5 = class217_1.field2569 != 0 ? class217_1.field2569 : class217_1.field2667;
      class13.method150(arr_0, class217_1.field2688, i_4, i_5, bool_2, 1879036172);
      if (class217_1.field2675 != null) {
         class13.method150(class217_1.field2675, class217_1.field2688, i_4, i_5, bool_2, 1726959826);
      }

      class61 class61_6 = (class61) client.field816.method5952((long)class217_1.field2688);
      if (class61_6 != null) {
         method416(class61_6.field571, i_4, i_5, bool_2, -2115353122);
      }

      if (class217_1.field2568 == 1337) {
         ;
      }

   }

   static void method407(ByteBuffer class300_0, int i_1, int i_2) {
      byte[] bytes_3 = class300_0.buffer;
      if (client.field693 == null) {
         client.field693 = new byte[24];
      }

      class301.method5752(bytes_3, i_1, client.field693, 0, 24);
      if (class167.field2040 != null) {
         try {
            class167.field2040.method6521(0L);
            class167.field2040.method6524(class300_0.buffer, i_1, 24, -966965622);
         } catch (Exception exception_5) {
            ;
         }
      }

   }

}
