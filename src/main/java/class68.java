public final class class68 extends LinkedListNode {

   public static class237 field944;
   static class6 field942;
   int field943;
   int field937;
   int field934;
   int field932;
   int field938;
   int field940;
   int field939;
   int field935;
   int field933;
   int field936;
   int field941 = 0;
   int field931 = -1;

   static void method1653(int i_0, int i_1) {
      long long_3 = (long)((i_0 << 16) + i_1);
      GrandExchangeOfferUnitPriceComparator grandExchangeOfferUnitPriceComparator_5 = (GrandExchangeOfferUnitPriceComparator) class236.field3180.method5952(long_3);
      if (grandExchangeOfferUnitPriceComparator_5 != null) {
         class236.field3170.method4793(grandExchangeOfferUnitPriceComparator_5);
      }
   }

   static final class61 method1652(int i_0, int i_1, int i_2) {
      class61 class61_4 = new class61();
      class61_4.field571 = i_1;
      class61_4.field569 = i_2;
      Client.field816.method5951(class61_4, (long)i_0);
      HealthBarUpdate.method146(i_1);
      Widget widget_5 = WorldMapElement.getWidget(i_0);
      FriendSystem.invalidateWidget(widget_5);
      if (Client.field850 != null) {
         FriendSystem.invalidateWidget(Client.field850);
         Client.field850 = null;
      }

      for (int i_6 = 0; i_6 < Client.menuOptionsCount; i_6++) {
         if (SceneNode.method5(Client.menuOpcodes[i_6])) {
            if (i_6 < Client.menuOptionsCount - 1) {
               for (int i_7 = i_6; i_7 < Client.menuOptionsCount - 1; i_7++) {
                  Client.field796[i_7] = Client.field796[i_7 + 1];
                  Client.field668[i_7] = Client.field668[i_7 + 1];
                  Client.menuOpcodes[i_7] = Client.menuOpcodes[i_7 + 1];
                  Client.field795[i_7] = Client.field795[i_7 + 1];
                  Client.field792[i_7] = Client.field792[i_7 + 1];
                  Client.field793[i_7] = Client.field793[i_7 + 1];
                  Client.field769[i_7] = Client.field769[i_7 + 1];
               }
            }

            --i_6;
            --Client.menuOptionsCount;
         }
      }

      HealthBarUpdate.method145();
      WorldMapID.method413(Widget.field2556[i_0 >> 16], widget_5, false);
      class48.method813(i_1);
      if (Client.field905 != -1) {
         class17.method175(Client.field905, 1);
      }

      return class61_4;
   }

}
