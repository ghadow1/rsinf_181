public class class284 extends class279 {

   boolean field3650;
   boolean field3651;

   int method5219(class284 class284_1, int i_2) {
      return super.field3636 == client.field807 && client.field807 != class284_1.field3636 ? -1 : (client.field807 == class284_1.field3636 && super.field3636 != client.field807 ? 1 : (super.field3636 != 0 && class284_1.field3636 == 0 ? -1 : (class284_1.field3636 != 0 && super.field3636 == 0 ? 1 : (this.field3650 && !class284_1.field3650 ? -1 : (!this.field3650 && class284_1.field3650 ? 1 : (this.field3651 && !class284_1.field3651 ? -1 : (!this.field3651 && class284_1.field3651 ? 1 : (super.field3636 != 0 ? super.field3633 - class284_1.field3633 : class284_1.field3633 - super.field3633))))))));
   }

   public int vmethod5221(class274 class274_1, int i_2) {
      return this.method5219((class284) class274_1, -1855698207);
   }

   public int compareTo(Object object_1) {
      return this.method5219((class284) object_1, -1814764429);
   }

   public static boolean method5220(class233 class233_0, int i_1, int i_2, byte b_3) {
      byte[] bytes_4 = class233_0.method4144(i_1, i_2, 1462208687);
      if (bytes_4 == null) {
         return false;
      } else {
         class185.method3617(bytes_4, (byte) -41);
         return true;
      }
   }

   static final void method5226(class69 class69_0, int i_1) {
      if (class69_0.field948 != 0) {
         if (class69_0.field975 != -1) {
            Object obj_2 = null;
            if (class69_0.field975 < 32768) {
               obj_2 = client.field694[class69_0.field975];
            } else if (class69_0.field975 >= 32768) {
               obj_2 = client.field909[class69_0.field975 - 32768];
            }

            if (obj_2 != null) {
               int i_3 = class69_0.field1005 - ((class69) obj_2).field1005;
               int i_4 = class69_0.field949 - ((class69) obj_2).field949;
               if (i_3 != 0 || i_4 != 0) {
                  class69_0.field1000 = (int)(Math.atan2((double)i_3, (double)i_4) * 325.949D) & 0x7ff;
               }
            } else if (class69_0.field964) {
               class69_0.field975 = -1;
               class69_0.field964 = false;
            }
         }

         if (class69_0.field976 != -1 && (class69_0.field1003 == 0 || class69_0.field1007 > 0)) {
            class69_0.field1000 = class69_0.field976;
            class69_0.field976 = -1;
         }

         int i_5 = class69_0.field1000 - class69_0.field950 & 0x7ff;
         if (i_5 == 0 && class69_0.field964) {
            class69_0.field975 = -1;
            class69_0.field964 = false;
         }

         if (i_5 != 0) {
            ++class69_0.field1009;
            boolean bool_7;
            if (i_5 > 1024) {
               class69_0.field950 -= class69_0.field948;
               bool_7 = true;
               if (i_5 < class69_0.field948 || i_5 > 2048 - class69_0.field948) {
                  class69_0.field950 = class69_0.field1000;
                  bool_7 = false;
               }

               if (class69_0.field978 == class69_0.field1004 && (class69_0.field1009 > 25 || bool_7)) {
                  if (class69_0.field955 != -1) {
                     class69_0.field978 = class69_0.field955;
                  } else {
                     class69_0.field978 = class69_0.field957;
                  }
               }
            } else {
               class69_0.field950 += class69_0.field948;
               bool_7 = true;
               if (i_5 < class69_0.field948 || i_5 > 2048 - class69_0.field948) {
                  class69_0.field950 = class69_0.field1000;
                  bool_7 = false;
               }

               if (class69_0.field1004 == class69_0.field978 && (class69_0.field1009 > 25 || bool_7)) {
                  if (class69_0.field956 != -1) {
                     class69_0.field978 = class69_0.field956;
                  } else {
                     class69_0.field978 = class69_0.field957;
                  }
               }
            }

            class69_0.field950 &= 0x7ff;
         } else {
            class69_0.field1009 = 0;
         }

      }
   }

}
