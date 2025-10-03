import java.math.BigInteger;

public class class83 {

   static int field1166;
   static final BigInteger field1165 = new BigInteger("10001", 16);
   static final BigInteger field1162 = new BigInteger("165865706435016682110653568563251120094278686912987295809145491806194715902716739338411927793058925228087565434562948389222225588420069703784252638483569608159614392485969864899137973999614056797405232846059198315441808544524190866210655169682670028293787208173603935453834899795395794572295868565624049196373");

   static final int method1995(int i_0) {
      if (class17.field117.field1060) {
         return class42.field372;
      } else {
         int i_1 = class62.method1130(PacketBuffer.field3727, class1.field3, class42.field372);
         return i_1 - GCMonitor.field383 < 800 && (class55.field502[class42.field372][PacketBuffer.field3727 >> 7][class1.field3 >> 7] & 0x4) != 0 ? class42.field372 : 3;
      }
   }

   static int method1994(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      int i_5 = -1;
      Widget widget_4;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         i_5 = MouseRecorder.field1098[--class70.field1014];
         widget_4 = WorldMapElement.getWidget(i_5);
      } else {
         widget_4 = bool_2 ? MouseRecorder.field1111 : class207.field2507;
      }

      if (i_0 == 1100) {
         class70.field1014 -= 2;
         widget_4.field2585 = MouseRecorder.field1098[class70.field1014];
         if (widget_4.field2585 > widget_4.field2687 - widget_4.field2579) {
            widget_4.field2585 = widget_4.field2687 - widget_4.field2579;
         }

         if (widget_4.field2585 < 0) {
            widget_4.field2585 = 0;
         }

         widget_4.field2586 = MouseRecorder.field1098[class70.field1014 + 1];
         if (widget_4.field2586 > widget_4.field2569 - widget_4.field2667) {
            widget_4.field2586 = widget_4.field2569 - widget_4.field2667;
         }

         if (widget_4.field2586 < 0) {
            widget_4.field2586 = 0;
         }

         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else if (i_0 == 1101) {
         widget_4.field2695 = MouseRecorder.field1098[--class70.field1014];
         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else if (i_0 == 1102) {
         widget_4.field2571 = MouseRecorder.field1098[--class70.field1014] == 1;
         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else if (i_0 == 1103) {
         widget_4.field2595 = MouseRecorder.field1098[--class70.field1014];
         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else if (i_0 == 1104) {
         widget_4.field2597 = MouseRecorder.field1098[--class70.field1014];
         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else if (i_0 == 1105) {
         widget_4.field2599 = MouseRecorder.field1098[--class70.field1014];
         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else if (i_0 == 1106) {
         widget_4.field2591 = MouseRecorder.field1098[--class70.field1014];
         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else if (i_0 == 1107) {
         widget_4.field2613 = MouseRecorder.field1098[--class70.field1014] == 1;
         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else if (i_0 == 1108) {
         widget_4.field2607 = 1;
         widget_4.field2649 = MouseRecorder.field1098[--class70.field1014];
         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else if (i_0 == 1109) {
         class70.field1014 -= 6;
         widget_4.field2593 = MouseRecorder.field1098[class70.field1014];
         widget_4.field2614 = MouseRecorder.field1098[class70.field1014 + 1];
         widget_4.field2615 = MouseRecorder.field1098[class70.field1014 + 2];
         widget_4.field2616 = MouseRecorder.field1098[class70.field1014 + 3];
         widget_4.field2640 = MouseRecorder.field1098[class70.field1014 + 4];
         widget_4.field2618 = MouseRecorder.field1098[class70.field1014 + 5];
         FriendSystem.invalidateWidget(widget_4);
         return 1;
      } else {
         int i_9;
         if (i_0 == 1110) {
            i_9 = MouseRecorder.field1098[--class70.field1014];
            if (i_9 != widget_4.field2611) {
               widget_4.field2611 = i_9;
               widget_4.field2692 = 0;
               widget_4.field2584 = 0;
               FriendSystem.invalidateWidget(widget_4);
            }

            return 1;
         } else if (i_0 == 1111) {
            widget_4.field2621 = MouseRecorder.field1098[--class70.field1014] == 1;
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1112) {
            String string_8 = MouseRecorder.field1093[--class221.field2747];
            if (!string_8.equals(widget_4.field2601)) {
               widget_4.field2601 = string_8;
               FriendSystem.invalidateWidget(widget_4);
            }

            return 1;
         } else if (i_0 == 1113) {
            widget_4.fontId = MouseRecorder.field1098[--class70.field1014];
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1114) {
            class70.field1014 -= 3;
            widget_4.field2628 = MouseRecorder.field1098[class70.field1014];
            widget_4.field2629 = MouseRecorder.field1098[class70.field1014 + 1];
            widget_4.field2627 = MouseRecorder.field1098[class70.field1014 + 2];
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1115) {
            widget_4.field2659 = MouseRecorder.field1098[--class70.field1014] == 1;
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1116) {
            widget_4.field2559 = MouseRecorder.field1098[--class70.field1014];
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1117) {
            widget_4.field2604 = MouseRecorder.field1098[--class70.field1014];
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1118) {
            widget_4.field2605 = MouseRecorder.field1098[--class70.field1014] == 1;
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1119) {
            widget_4.field2606 = MouseRecorder.field1098[--class70.field1014] == 1;
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1120) {
            class70.field1014 -= 2;
            widget_4.field2687 = MouseRecorder.field1098[class70.field1014];
            widget_4.field2569 = MouseRecorder.field1098[class70.field1014 + 1];
            FriendSystem.invalidateWidget(widget_4);
            if (i_5 != -1 && widget_4.field2566 == 0) {
               WorldMapID.method413(Widget.field2556[i_5 >> 16], widget_4, false);
            }

            return 1;
         } else if (i_0 == 1121) {
            class56.method1086(widget_4.field2688, widget_4.field2565, -881674814);
            Client.field850 = widget_4;
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1122) {
            widget_4.field2600 = MouseRecorder.field1098[--class70.field1014];
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1123) {
            widget_4.field2639 = MouseRecorder.field1098[--class70.field1014];
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1124) {
            widget_4.field2596 = MouseRecorder.field1098[--class70.field1014];
            FriendSystem.invalidateWidget(widget_4);
            return 1;
         } else if (i_0 == 1125) {
            i_9 = MouseRecorder.field1098[--class70.field1014];
            class323 class323_7 = (class323) MemoryManager.findById(ResourceHandler.method2405((byte) 69), i_9);
            if (class323_7 != null) {
               widget_4.field2693 = class323_7;
               FriendSystem.invalidateWidget(widget_4);
            }

            return 1;
         } else {
            boolean bool_6;
            if (i_0 == 1126) {
               bool_6 = MouseRecorder.field1098[--class70.field1014] == 1;
               widget_4.field2598 = bool_6;
               return 1;
            } else if (i_0 == 1127) {
               bool_6 = MouseRecorder.field1098[--class70.field1014] == 1;
               widget_4.field2564 = bool_6;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   static void method1996(int i_0, int i_1, int i_2, class253 class253_3, int i_4, int i_5) {
      class75 class75_6 = new class75();
      class75_6.field1078 = i_0;
      class75_6.field1083 = i_1 * 128;
      class75_6.field1090 = i_2 * 128;
      int i_7 = class253_3.field3365;
      int i_8 = class253_3.field3366;
      if (i_4 == 1 || i_4 == 3) {
         i_7 = class253_3.field3366;
         i_8 = class253_3.field3365;
      }

      class75_6.field1077 = (i_7 + i_1) * 128;
      class75_6.field1082 = (i_8 + i_2) * 128;
      class75_6.field1079 = class253_3.field3394;
      class75_6.field1091 = class253_3.field3399 * 128;
      class75_6.field1086 = class253_3.field3392;
      class75_6.field1081 = class253_3.field3397;
      class75_6.field1088 = class253_3.field3367;
      if (class253_3.field3391 != null) {
         class75_6.field1087 = class253_3;
         class75_6.method1821();
      }

      class75.field1080.method4917(class75_6);
      if (class75_6.field1088 != null) {
         class75_6.field1089 = class75_6.field1086 + (int)(Math.random() * (double)(class75_6.field1081 - class75_6.field1086));
      }

   }

}
