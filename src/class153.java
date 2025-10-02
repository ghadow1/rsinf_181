public class class153 extends class275 {

   final boolean field1979;

   public class153(boolean bool_1) {
      this.field1979 = bool_1;
   }

   int method3391(class279 class279_1, class279 class279_2, int i_3) {
      if (client.field807 == class279_1.field3636) {
         if (class279_2.field3636 != client.field807) {
            return this.field1979 ? -1 : 1;
         }
      } else if (class279_2.field3636 == client.field807) {
         return this.field1979 ? 1 : -1;
      }

      return this.method5061(class279_1, class279_2, -1128143293);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3391((class279) object_1, (class279) object_2, 16711935);
   }

   static final void method3399(int i_0, int i_1, boolean bool_2, int i_3) {
      if (!bool_2 || i_0 != class48.field418 || class128.field1747 != i_1) {
         class48.field418 = i_0;
         class128.field1747 = i_1;
         class96.method2265(25, (short) -26833);
         class281.method5180("Loading - please wait.", true, -2090803826);
         int i_4 = class196.field2389;
         int i_5 = class1.field1;
         class196.field2389 = (i_0 - 6) * 8;
         class1.field1 = (i_1 - 6) * 8;
         int i_6 = class196.field2389 - i_4;
         int i_7 = class1.field1 - i_5;
         i_4 = class196.field2389;
         i_5 = class1.field1;

         int i_8;
         int i_10;
         for (i_8 = 0; i_8 < 32768; i_8++) {
            class79 class79_9 = client.field694[i_8];
            if (class79_9 != null) {
               for (i_10 = 0; i_10 < 10; i_10++) {
                  class79_9.field994[i_10] -= i_6;
                  class79_9.field962[i_10] -= i_7;
               }

               class79_9.field1005 -= i_6 * 128;
               class79_9.field949 -= i_7 * 128;
            }
         }

         for (i_8 = 0; i_8 < 2048; i_8++) {
            class66 class66_22 = client.field909[i_8];
            if (class66_22 != null) {
               for (i_10 = 0; i_10 < 10; i_10++) {
                  class66_22.field994[i_10] -= i_6;
                  class66_22.field962[i_10] -= i_7;
               }

               class66_22.field1005 -= i_6 * 128;
               class66_22.field949 -= i_7 * 128;
            }
         }

         byte b_21 = 0;
         byte b_19 = 104;
         byte b_23 = 1;
         if (i_6 < 0) {
            b_21 = 103;
            b_19 = -1;
            b_23 = -1;
         }

         byte b_11 = 0;
         byte b_12 = 104;
         byte b_13 = 1;
         if (i_7 < 0) {
            b_11 = 103;
            b_12 = -1;
            b_13 = -1;
         }

         int i_15;
         for (int i_14 = b_21; i_14 != b_19; i_14 += b_23) {
            for (i_15 = b_11; b_12 != i_15; i_15 += b_13) {
               int i_16 = i_14 + i_6;
               int i_17 = i_7 + i_15;

               for (int i_18 = 0; i_18 < 4; i_18++) {
                  if (i_16 >= 0 && i_17 >= 0 && i_16 < 104 && i_17 < 104) {
                     client.field887[i_18][i_14][i_15] = client.field887[i_18][i_16][i_17];
                  } else {
                     client.field887[i_18][i_14][i_15] = null;
                  }
               }
            }
         }

         for (class68 class68_20 = (class68) client.field783.method4892(); class68_20 != null; class68_20 = (class68) client.field783.method4894()) {
            class68_20.field937 -= i_6;
            class68_20.field934 -= i_7;
            if (class68_20.field937 < 0 || class68_20.field934 < 0 || class68_20.field937 >= 104 || class68_20.field934 >= 104) {
               class68_20.method3607();
            }
         }

         if (client.field885 != 0) {
            client.field885 -= i_6;
            client.field842 -= i_7;
         }

         client.field893 = 0;
         client.field899 = false;
         class299.field3727 -= i_6 << 7;
         class1.field3 -= i_7 << 7;
         class54.field499 -= i_6 << 7;
         class26.field227 -= i_7 << 7;
         client.field747 = -1;
         client.field785.method4886();
         client.field670.method4886();

         for (i_15 = 0; i_15 < 4; i_15++) {
            client.field710[i_15].method3558(867257132);
         }

      }
   }

}
