public abstract class class34 {

   int field296;
   int field295;
   public final class213 field298;
   public final class213 field297;

   class34(class213 class213_1, class213 class213_2) {
      this.field298 = class213_1;
      this.field297 = class213_2;
   }

   abstract class28 vmethod575(int var1);

   boolean method579(int i_1, int i_2, int i_3) {
      if (!this.method578(-1274004046)) {
         return false;
      } else {
         class241 class241_4 = class222.method4118(this.vmethod597(-602867254), -673469339);
         int i_5 = this.vmethod577((byte) 14);
         int i_6 = this.vmethod593((byte) 1);
         switch(class241_4.field3226.field3459) {
         case 0:
            if (i_1 <= this.field296 - i_5 || i_1 > this.field296) {
               return false;
            }
            break;
         case 1:
            if (i_1 >= this.field296 && i_1 < i_5 + this.field296) {
               break;
            }

            return false;
         case 2:
            if (i_1 < this.field296 - i_5 / 2 || i_1 > i_5 / 2 + this.field296) {
               return false;
            }
         }

         switch(class241_4.field3227.field3198) {
         case 0:
            if (i_2 < this.field295 - i_6 / 2 || i_2 > i_6 / 2 + this.field295) {
               return false;
            }
            break;
         case 1:
            if (i_2 <= this.field295 - i_6 || i_2 > this.field295) {
               return false;
            }
            break;
         case 2:
            if (i_2 < this.field295 || i_2 >= i_6 + this.field295) {
               return false;
            }
         }

         return true;
      }
   }

   boolean method578(int i_1) {
      return this.vmethod597(1762345994) >= 0;
   }

   public abstract int vmethod597(int var1);

   boolean method585(int i_1, int i_2, int i_3) {
      class28 class28_4 = this.vmethod575(1426074195);
      return class28_4 == null ? false : (i_1 >= this.field296 - class28_4.field236 / 2 && i_1 <= class28_4.field236 / 2 + this.field296 ? i_2 >= this.field295 && i_2 <= this.field295 + class28_4.field238 : false);
   }

   abstract int vmethod577(byte var1);

   abstract int vmethod593(byte var1);

   boolean method576(int i_1, int i_2, byte b_3) {
      return this.method579(i_1, i_2, 406020312) ? true : this.method585(i_1, i_2, -1252480817);
   }

   static int method598(byte b_0) {
      return client.field869 ? 2 : 1;
   }

   public static void method599(int i_0) {
      class256.field3465.method3323();
      class256.field3466.method3323();
   }

}
