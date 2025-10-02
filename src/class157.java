import java.net.URL;

public class class157 extends class275 {

   static class325[] field1989;
   final boolean field1990;

   public class157(boolean bool_1) {
      this.field1990 = bool_1;
   }

   int method3422(class279 class279_1, class279 class279_2, int i_3) {
      return class279_2.field3636 != class279_1.field3636 ? (this.field1990 ? class279_1.field3636 - class279_2.field3636 : class279_2.field3636 - class279_1.field3636) : this.method5061(class279_1, class279_2, -648885806);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3422((class279) object_1, (class279) object_2, 2060416979);
   }

   static boolean method3428(int i_0) {
      try {
         if (class71.field1027 == null) {
            class71.field1027 = class258.field3534.method3296(new URL(class26.field213), (byte) 78);
         } else if (class71.field1027.method3307(1792198908)) {
            byte[] bytes_1 = class71.field1027.method3308(-338757002);
            class300 class300_2 = new class300(bytes_1);
            class300_2.method5499((byte) -118);
            class71.field1022 = class300_2.method5496(-1459053594);
            class71.field1031 = new class71[class71.field1022];

            class71 class71_4;
            for (int i_3 = 0; i_3 < class71.field1022; class71_4.field1034 = i_3++) {
               class71_4 = class71.field1031[i_3] = new class71();
               class71_4.field1025 = class300_2.method5496(-1459053594);
               class71_4.field1023 = class300_2.method5499((byte) -118);
               class71_4.field1029 = class300_2.method5503(-231155257);
               class71_4.field1028 = class300_2.method5503(-231155257);
               class71_4.field1032 = class300_2.method5504((byte) 109);
               class71_4.field1030 = class300_2.method5606(-1327508233);
            }

            client.method1651(class71.field1031, 0, class71.field1031.length - 1, class71.field1026, class71.field1018, (byte) -62);
            class71.field1027 = null;
            return true;
         }
      } catch (Exception exception_5) {
         exception_5.printStackTrace();
         class71.field1027 = null;
      }

      return false;
   }

}
