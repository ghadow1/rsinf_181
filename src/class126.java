public final class class126 extends class180 {

   static class235 field1647;
   class120 field1669;
   class131 field1646;
   class141 field1652;
   class136 field1656;
   class123 field1664;
   int field1655;
   class122 field1650;
   boolean field1661;
   int field1659;
   class126 field1667;
   boolean field1660;
   int field1654;
   boolean field1662;
   int field1651;
   int field1666;
   int field1665;
   class142[] field1663 = new class142[5];
   int[] field1657 = new int[5];
   int field1658 = 0;
   int field1670;
   int field1648;
   int field1668;
   int field1653;

   class126(int i_1, int i_2, int i_3) {
      this.field1648 = this.field1670 = i_1;
      this.field1668 = i_2;
      this.field1653 = i_3;
   }

   public static String method2855(long long_0) {
      if (long_0 > 0L && long_0 < 6582952005840035281L) {
         if (long_0 % 37L == 0L) {
            return null;
         } else {
            int i_2 = 0;

            for (long long_3 = long_0; long_3 != 0L; long_3 /= 37L) {
               ++i_2;
            }

            StringBuilder stringbuilder_5 = new StringBuilder(i_2);

            while (long_0 != 0L) {
               long long_6 = long_0;
               long_0 /= 37L;
               stringbuilder_5.append(class289.field3668[(int)(long_6 - long_0 * 37L)]);
            }

            return stringbuilder_5.reverse().toString();
         }
      } else {
         return null;
      }
   }

   public static long method2854(int i_0, int i_1, int i_2, boolean bool_3, int i_4, int i_5) {
      long long_6 = (long)((i_0 & 0x7f) << 0 | (i_1 & 0x7f) << 7 | (i_2 & 0x3) << 14) | ((long)i_4 & 0xffffffffL) << 17;
      if (bool_3) {
         long_6 |= 0x10000L;
      }

      return long_6;
   }

   public static final void method2853(int i_0, boolean bool_1, int i_2, int i_3) {
      if (i_0 >= 8000 && i_0 <= 48000) {
         class172.field2078 = i_0;
         class169.field2053 = bool_1;
         class105.field1407 = i_2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method2856(String string_0, int i_1) {
      if (class46.field410 != null) {
         class187 class187_2 = class235.method4265(class183.field2216, client.field880.field1313, 1775123545);
         class187_2.field2333.writeByte2(class209.method3945(string_0));
         class187_2.field2333.writeNullTerminatedString(string_0);
         client.field880.copy(class187_2);
      }
   }

}
