public abstract class class69 extends class135 {

   int field1005;
   int field949;
   int field990;
   int field1000;
   int field989;
   int field995;
   int field996;
   int field991;
   int field993;
   int field953;
   int field992;
   int field983;
   int field950;
   int field997;
   boolean field963;
   boolean field967 = false;
   int field952 = 1;
   int field1004 = -1;
   int field955 = -1;
   int field956 = -1;
   int field957 = -1;
   int field958 = -1;
   int field959 = -1;
   int field960 = -1;
   int field961 = -1;
   String field977 = null;
   boolean field998 = false;
   int field1002 = 100;
   int field966 = 0;
   int field982 = 0;
   byte field968 = 0;
   int[] field969 = new int[4];
   int[] field980 = new int[4];
   int[] field971 = new int[4];
   int[] field972 = new int[4];
   int[] field970 = new int[4];
   class260 field954 = new class260();
   int field975 = -1;
   boolean field964 = false;
   int field976 = -1;
   int field978 = -1;
   int field979 = 0;
   int field1001 = 0;
   int field981 = -1;
   int field951 = 0;
   int field974 = 0;
   int field984 = 0;
   int field985 = 0;
   int field986 = -1;
   int field987 = 0;
   int field988 = 0;
   int field973 = 0;
   int field999 = 200;
   int field1009 = 0;
   int field948 = 32;
   int field1003 = 0;
   int[] field994 = new int[10];
   int[] field962 = new int[10];
   byte[] field1006 = new byte[10];
   int field1007 = 0;
   int field1008 = 0;

   boolean vmethod1965(int i_1) {
      return false;
   }

   final void method1657(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      boolean bool_8 = true;
      boolean bool_9 = true;

      int i_10;
      for (i_10 = 0; i_10 < 4; i_10++) {
         if (this.field971[i_10] > i_5) {
            bool_8 = false;
         } else {
            bool_9 = false;
         }
      }

      i_10 = -1;
      int i_11 = -1;
      int i_12 = 0;
      if (i_1 >= 0) {
         class252 class252_13 = class86.method2046(i_1, (byte) 0);
         i_11 = class252_13.field3348;
         i_12 = class252_13.field3344;
      }

      int i_15;
      if (bool_9) {
         if (i_11 == -1) {
            return;
         }

         i_10 = 0;
         i_15 = 0;
         if (i_11 == 0) {
            i_15 = this.field971[0];
         } else if (i_11 == 1) {
            i_15 = this.field980[0];
         }

         for (int i_14 = 1; i_14 < 4; i_14++) {
            if (i_11 == 0) {
               if (this.field971[i_14] < i_15) {
                  i_10 = i_14;
                  i_15 = this.field971[i_14];
               }
            } else if (i_11 == 1 && this.field980[i_14] < i_15) {
               i_10 = i_14;
               i_15 = this.field980[i_14];
            }
         }

         if (i_11 == 1 && i_15 >= i_2) {
            return;
         }
      } else {
         if (bool_8) {
            this.field968 = 0;
         }

         for (i_15 = 0; i_15 < 4; i_15++) {
            byte b_16 = this.field968;
            this.field968 = (byte)((this.field968 + 1) % 4);
            if (this.field971[b_16] <= i_5) {
               i_10 = b_16;
               break;
            }
         }
      }

      if (i_10 >= 0) {
         this.field969[i_10] = i_1;
         this.field980[i_10] = i_2;
         this.field972[i_10] = i_3;
         this.field970[i_10] = i_4;
         this.field971[i_10] = i_5 + i_12 + i_6;
      }
   }

   final void method1659(int i_1, int i_2) {
      class246 class246_3 = class51.method854(i_1, 73121711);

      for (class78 class78_4 = (class78) this.field954.method4838(); class78_4 != null; class78_4 = (class78) this.field954.method4808()) {
         if (class246_3 == class78_4.field1128) {
            class78_4.method3607();
            return;
         }
      }

   }

   final void method1655(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte b_7) {
      class246 class246_8 = class51.method854(i_1, 1884870915);
      class78 class78_9 = null;
      class78 class78_10 = null;
      int i_11 = class246_8.field3282;
      int i_12 = 0;

      class78 class78_13;
      for (class78_13 = (class78) this.field954.method4838(); class78_13 != null; class78_13 = (class78) this.field954.method4808()) {
         ++i_12;
         if (class78_13.field1128.field3279 == class246_8.field3279) {
            class78_13.method1949(i_2 + i_4, i_5, i_6, i_3, (byte) 87);
            return;
         }

         if (class78_13.field1128.field3275 <= class246_8.field3275) {
            class78_9 = class78_13;
         }

         if (class78_13.field1128.field3282 > i_11) {
            class78_10 = class78_13;
            i_11 = class78_13.field1128.field3282;
         }
      }

      if (class78_10 != null || i_12 < 4) {
         class78_13 = new class78(class246_8);
         if (class78_9 == null) {
            this.field954.method4805(class78_13);
         } else {
            class260.method4816(class78_13, class78_9);
         }

         class78_13.method1949(i_2 + i_4, i_5, i_6, i_3, (byte) 56);
         if (i_12 >= 4) {
            class78_10.method3607();
         }

      }
   }

   final void method1658(int i_1) {
      this.field1003 = 0;
      this.field1008 = 0;
   }

   static void method1670(byte b_0) {
      if (client.field727 == 1) {
         client.field736 = true;
      }

   }

}
