import java.util.HashSet;
import java.util.Set;

public class class192 implements class194 {

   static long field2382;
   static final class192 field2375;
   static final class192 field2367;
   static final class192 field2368;
   static final class192 field2381;
   static final class192 field2370;
   static final class192 field2373;
   static final class192 field2372;
   static final class192 field2376;
   static final class192 field2374;
   static final class192 field2369;
   static final class192 field2371;
   static final class192 field2377;
   static final class192 field2378;
   final Set field2380 = new HashSet();
   final int field2379;

   static {
      field2375 = new class192(0, new class191[]{class191.field2364});
      field2367 = new class192(1, new class191[]{class191.field2362, class191.field2364});
      field2368 = new class192(2, new class191[]{class191.field2362, class191.field2365, class191.field2364});
      field2381 = new class192(3, new class191[]{class191.field2362});
      field2370 = new class192(4);
      field2373 = new class192(5, new class191[]{class191.field2362, class191.field2364});
      field2372 = new class192(6, new class191[]{class191.field2364});
      field2376 = new class192(8, new class191[]{class191.field2362, class191.field2364});
      field2374 = new class192(9, new class191[]{class191.field2362, class191.field2365});
      field2369 = new class192(10, new class191[]{class191.field2362});
      field2371 = new class192(11, new class191[]{class191.field2362});
      field2377 = new class192(12, new class191[]{class191.field2362, class191.field2364});
      field2378 = new class192(13, new class191[]{class191.field2362});
      method3674();
   }

   class192(int i_2, class191[] arr_3) {
      this.field2379 = i_2;
      class191[] arr_4 = arr_3;

      for (int i_5 = 0; i_5 < arr_4.length; i_5++) {
         class191 class191_6 = arr_4[i_5];
         this.field2380.add(class191_6);
      }

   }

   class192(int i_2) {
      this.field2379 = i_2;
   }

   public int vmethod6084(int i_1) {
      return this.field2379;
   }

   static int method3679(int i_0, int i_1, int i_2) {
      if (i_2 > 179) {
         i_1 /= 2;
      }

      if (i_2 > 192) {
         i_1 /= 2;
      }

      if (i_2 > 217) {
         i_1 /= 2;
      }

      if (i_2 > 243) {
         i_1 /= 2;
      }

      int i_4 = (i_1 / 32 << 7) + (i_0 / 4 << 10) + i_2 / 2;
      return i_4;
   }

   public static boolean method3677(CharSequence charsequence_0) {
      boolean bool_3 = false;
      boolean bool_4 = false;
      int i_5 = 0;
      int i_6 = charsequence_0.length();
      int i_7 = 0;

      boolean bool_2;
      while (true) {
         if (i_7 >= i_6) {
            bool_2 = bool_4;
            break;
         }

         label82: {
            char var_8 = charsequence_0.charAt(i_7);
            if (i_7 == 0) {
               if (var_8 == 45) {
                  bool_3 = true;
                  break label82;
               }

               if (var_8 == 43) {
                  break label82;
               }
            }

            int i_10;
            if (var_8 >= 48 && var_8 <= 57) {
               i_10 = var_8 - 48;
            } else if (var_8 >= 65 && var_8 <= 90) {
               i_10 = var_8 - 55;
            } else {
               if (var_8 < 97 || var_8 > 122) {
                  bool_2 = false;
                  break;
               }

               i_10 = var_8 - 87;
            }

            if (i_10 >= 10) {
               bool_2 = false;
               break;
            }

            if (bool_3) {
               i_10 = -i_10;
            }

            int i_9 = i_10 + i_5 * 10;
            if (i_5 != i_9 / 10) {
               bool_2 = false;
               break;
            }

            i_5 = i_9;
            bool_4 = true;
         }

         ++i_7;
      }

      return bool_2;
   }

   static void method3675(int i_0) {
      client.field727 = i_0;
   }

   static class192[] method3674() {
      return new class192[] {field2377, field2374, field2369, field2378, field2372, field2373, field2381, field2367, field2371, field2370, field2376, field2368, field2375};
   }

   static void method3676(int i_0, int i_1) {
      int[] ints_3 = new int[4];
      int[] ints_4 = new int[4];
      ints_3[0] = i_0;
      ints_4[0] = i_1;
      int i_5 = 1;

      for (int i_6 = 0; i_6 < 4; i_6++) {
         if (class71.field1026[i_6] != i_0) {
            ints_3[i_5] = class71.field1026[i_6];
            ints_4[i_5] = class71.field1018[i_6];
            ++i_5;
         }
      }

      class71.field1026 = ints_3;
      class71.field1018 = ints_4;
      client.method1651(class71.field1031, 0, class71.field1031.length - 1, class71.field1026, class71.field1018, (byte) -109);
   }

   public static void method3678() {
      class96.field1324 = new class260();
   }

   static int method3669(int i_0) {
      class64 class64_2 = (class64) class91.field1277.method5924((long)i_0);
      return class64_2 == null ? -1 : (class64_2.field2106 == class91.field1278.field3551 ? -1 : ((class64) class64_2.field2106).field600);
   }

}
