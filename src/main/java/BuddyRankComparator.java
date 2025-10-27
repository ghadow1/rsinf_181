import java.io.IOException;

public class BuddyRankComparator {

   public static short[] field1870;
   public static boolean ItemDefinition_inMembersWorld;
   static int field1871;

   static class73 method3249() {
      class343 class343_1 = null;
      class73 class73_2 = new class73();

      try {
         class343_1 = Buffer.userPrefSave("", class29.field248.field3111, false);
         byte[] bytes_3 = new byte[(int)class343_1.method6552()];

         int i_5;
         for (int i_4 = 0; i_4 < bytes_3.length; i_4 += i_5) {
            i_5 = class343_1.method6554(bytes_3, i_4, bytes_3.length - i_4);
            if (i_5 == -1) {
               throw new IOException();
            }
         }

         class73_2 = new class73(new ByteBuffer(bytes_3));
      } catch (Exception exception_7) {
         ;
      }

      try {
         if (class343_1 != null) {
            class343_1.method6550();
         }
      } catch (Exception exception_6) {
         ;
      }

      return class73_2;
   }

   static int method3250(int i_0, boolean bool_2) {
      int i_4 = -1;
      Widget widget_5;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         i_4 = MouseRecorder.field1098[--class70.field1014];
         widget_5 = WorldMapElement.getWidget(i_4);
      } else {
         widget_5 = bool_2 ? MouseRecorder.field1111 : class207.field2507;
      }

      if (i_0 == 1000) {
         class70.field1014 -= 4;
         widget_5.field2651 = MouseRecorder.field1098[class70.field1014];
         widget_5.field2574 = MouseRecorder.field1098[class70.field1014 + 1];
         widget_5.field2694 = MouseRecorder.field1098[class70.field1014 + 2];
         widget_5.field2570 = MouseRecorder.field1098[class70.field1014 + 3];
         Widget2.invalidateWidget(widget_5);
         WorldMapID.client.method1260(widget_5);
         if (i_4 != -1 && widget_5.field2566 == 0) {
            WorldMapID.method413(Widget.field2556[i_4 >> 16], widget_5, false);
         }

         return 1;
      } else if (i_0 == 1001) {
         class70.field1014 -= 4;
         widget_5.field2670 = MouseRecorder.field1098[class70.field1014];
         widget_5.field2576 = MouseRecorder.field1098[class70.field1014 + 1];
         widget_5.field2638 = MouseRecorder.field1098[class70.field1014 + 2];
         widget_5.field2572 = MouseRecorder.field1098[class70.field1014 + 3];
         Widget2.invalidateWidget(widget_5);
         WorldMapID.client.method1260(widget_5);
         if (i_4 != -1 && widget_5.field2566 == 0) {
            WorldMapID.method413(Widget.field2556[i_4 >> 16], widget_5, false);
         }

         return 1;
      } else if (i_0 == 1003) {
         boolean bool_6 = MouseRecorder.field1098[--class70.field1014] == 1;
         if (bool_6 != widget_5.field2706) {
            widget_5.field2706 = bool_6;
            Widget2.invalidateWidget(widget_5);
         }

         return 1;
      } else if (i_0 == 1005) {
         widget_5.field2580 = MouseRecorder.field1098[--class70.field1014] == 1;
         return 1;
      } else if (i_0 == 1006) {
         widget_5.field2697 = MouseRecorder.field1098[--class70.field1014] == 1;
         return 1;
      } else {
         return 2;
      }
   }

}
