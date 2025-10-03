public final class class87 extends class135 {

   static class324 field1243;
   static int field1242;
   int field1244;
   int field1245;

   protected final class127 vmethod3253(int i_1) {
      return class26.method404(this.field1244).method4644(this.field1245);
   }

   static void method2053(int i_0, int i_1, int i_2, int i_3, int i_4) {
      Widget widget_5 = Client.method1649(i_0, i_1);
      if (widget_5 != null && widget_5.field2661 != null) {
         class62 class62_6 = new class62();
         class62_6.field575 = widget_5;
         class62_6.field581 = widget_5.field2661;
         class184.method3613(class62_6);
      }

      Client.field812 = i_3;
      Client.isSpellSelected = true;
      class41.field359 = i_0;
      Client.field848 = i_1;
      WorldMapCacheName.field301 = i_2;
      FriendSystem.invalidateWidget(widget_5);
   }

   public static void method2054(class233 class233_0, byte b_1) {
      class250.field3309 = class233_0;
   }

   static Message method2049(int i_0, int i_1, int i_2) {
      UserComparator10 userComparator10_3 = (UserComparator10) class91.field1279.get(Integer.valueOf(i_0));
      return userComparator10_3.getMessage(i_1);
   }

}
