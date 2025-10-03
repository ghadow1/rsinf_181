public class class128 {

   public static boolean[] field1755;
   static class233 field1756;
   static int field1745;
   static int field1746;
   static int field1741;
   static int field1747;
   public static boolean field1753 = false;
   public static int field1742 = 0;
   public static int field1743 = 0;
   public static boolean field1744 = false;
   public static int field1748 = 0;
   public static long[] field1750 = new long[1000];

   public static class253 method2970(int i_0) {
      class253 class253_2 = (class253) class253.field3390.get((long)i_0);
      if (class253_2 != null) {
         return class253_2;
      } else {
         byte[] bytes_3 = class253.field3395.method4144(6, i_0);
         class253_2 = new class253();
         class253_2.field3357 = i_0;
         if (bytes_3 != null) {
            class253_2.method4625(new ByteBuffer(bytes_3));
         }

         class253_2.method4586();
         if (class253_2.field3389) {
            class253_2.field3382 = 0;
            class253_2.field3368 = false;
         }

         class253.field3390.put(class253_2, (long)i_0);
         return class253_2;
      }
   }

   static void method2961(class235 class235_0, int i_1, int i_2, int i_3, byte b_4, boolean bool_5) {
      long long_7 = (long)((i_1 << 16) + i_2);
      GrandExchangeOfferUnitPriceComparator grandExchangeOfferUnitPriceComparator_9 = (GrandExchangeOfferUnitPriceComparator) class236.field3165.method5952(long_7);
      if (grandExchangeOfferUnitPriceComparator_9 == null) {
         grandExchangeOfferUnitPriceComparator_9 = (GrandExchangeOfferUnitPriceComparator) class236.field3167.method5952(long_7);
         if (grandExchangeOfferUnitPriceComparator_9 == null) {
            grandExchangeOfferUnitPriceComparator_9 = (GrandExchangeOfferUnitPriceComparator) class236.field3180.method5952(long_7);
            if (grandExchangeOfferUnitPriceComparator_9 != null) {
               if (bool_5) {
                  grandExchangeOfferUnitPriceComparator_9.removeDual();
                  class236.field3165.method5951(grandExchangeOfferUnitPriceComparator_9, long_7);
                  --class236.field3171;
                  ++class236.field3166;
               }

            } else {
               if (!bool_5) {
                  grandExchangeOfferUnitPriceComparator_9 = (GrandExchangeOfferUnitPriceComparator) class236.field3172.method5952(long_7);
                  if (grandExchangeOfferUnitPriceComparator_9 != null) {
                     return;
                  }
               }

               grandExchangeOfferUnitPriceComparator_9 = new GrandExchangeOfferUnitPriceComparator();
               grandExchangeOfferUnitPriceComparator_9.field3124 = class235_0;
               grandExchangeOfferUnitPriceComparator_9.field3121 = i_3;
               grandExchangeOfferUnitPriceComparator_9.field3122 = b_4;
               if (bool_5) {
                  class236.field3165.method5951(grandExchangeOfferUnitPriceComparator_9, long_7);
                  ++class236.field3166;
               } else {
                  class236.field3170.method4790(grandExchangeOfferUnitPriceComparator_9);
                  class236.field3180.method5951(grandExchangeOfferUnitPriceComparator_9, long_7);
                  ++class236.field3171;
               }

            }
         }
      }
   }

   public static int method2971(CharSequence charsequence_0, int i_1) {
      int i_2 = charsequence_0.length();
      int i_3 = 0;

      for (int i_4 = 0; i_4 < i_2; i_4++) {
         i_3 = (i_3 << 5) - i_3 + charsequence_0.charAt(i_4);
      }

      return i_3;
   }

   static class92 method2947(int i_0, byte b_1) {
      class92 class92_2 = (class92) class92.field1291.get((long)i_0);
      if (class92_2 != null) {
         return class92_2;
      } else {
         byte[] bytes_3 = class151.field1971.method4144(i_0, 0);
         if (bytes_3 == null) {
            return null;
         } else {
            class92_2 = World.method1705(bytes_3);
            class92.field1291.put(class92_2, (long)i_0);
            return class92_2;
         }
      }
   }

}
