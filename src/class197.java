public class class197 {

   public static int field2403;
   public static class233 field2401;
   public static int field2407;
   public static class233 field2400;
   public static class233 field2406;
   public static int field2404;
   static class235 field2405;
   public static int field2402 = 0;

   public static void method3688() {
      class257.field3503.method3323();
   }

   static final void method3697(class61 class61_0, boolean bool_1) {
      int i_3 = class61_0.field571;
      int i_4 = (int)class61_0.hash;
      class61_0.unlink();
      int i_6;
      if (bool_1 && i_3 != -1 && class128.field1755[i_3]) {
         Widget.field2557.method4157(i_3, 513084306);
         if (Widget.field2556[i_3] != null) {
            boolean bool_8 = true;

            for (i_6 = 0; i_6 < Widget.field2556[i_3].length; i_6++) {
               if (Widget.field2556[i_3][i_6] != null) {
                  if (Widget.field2556[i_3][i_6].field2566 != 2) {
                     Widget.field2556[i_3][i_6] = null;
                  } else {
                     bool_8 = false;
                  }
               }
            }

            if (bool_8) {
               Widget.field2556[i_3] = null;
            }

            class128.field1755[i_3] = false;
         }
      }

      for (class179 class179_5 = (class179) Client.field857.method5950(); class179_5 != null; class179_5 = (class179) Client.field857.method5953()) {
         if ((class179_5.hash >> 48 & 0xffffL) == (long)i_3) {
            class179_5.unlink();
         }
      }

      Widget widget_9 = WorldMapElement.getWidget(i_4);
      if (widget_9 != null) {
         FriendSystem.invalidateWidget(widget_9);
      }

      for (i_6 = 0; i_6 < Client.menuOptionsCount; i_6++) {
         if (class1.method5(Client.menuOpcodes[i_6], 1662351965)) {
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
      if (Client.field905 != -1) {
         class17.method175(Client.field905, 1, -1199742641);
      }

   }

   public static int method3702(int i_0, int i_1, int i_2) {
      i_2 &= 0x3;
      return i_2 == 0 ? i_0 : (i_2 == 1 ? i_1 : (i_2 == 2 ? 7 - i_0 : 7 - i_1));
   }

   static int method3703(int i_0) {
      if (i_0 == 6500) {
         MouseRecorder.field1098[++class70.field1014 - 1] = class157.method3428() ? 1 : 0;
         return 1;
      } else {
         World world_4;
         if (i_0 == 6501) {
            world_4 = class93.method2197(-1381660129);
            if (world_4 != null) {
               MouseRecorder.field1098[++class70.field1014 - 1] = world_4.id;
               MouseRecorder.field1098[++class70.field1014 - 1] = world_4.properties;
               MouseRecorder.field1093[++class221.field2747 - 1] = world_4.field1028;
               MouseRecorder.field1098[++class70.field1014 - 1] = world_4.field1032;
               MouseRecorder.field1098[++class70.field1014 - 1] = world_4.field1030;
               MouseRecorder.field1093[++class221.field2747 - 1] = world_4.host;
            } else {
               MouseRecorder.field1098[++class70.field1014 - 1] = -1;
               MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               MouseRecorder.field1093[++class221.field2747 - 1] = "";
               MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               MouseRecorder.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else if (i_0 == 6502) {
            world_4 = class48.method812(-1579773205);
            if (world_4 != null) {
               MouseRecorder.field1098[++class70.field1014 - 1] = world_4.id;
               MouseRecorder.field1098[++class70.field1014 - 1] = world_4.properties;
               MouseRecorder.field1093[++class221.field2747 - 1] = world_4.field1028;
               MouseRecorder.field1098[++class70.field1014 - 1] = world_4.field1032;
               MouseRecorder.field1098[++class70.field1014 - 1] = world_4.field1030;
               MouseRecorder.field1093[++class221.field2747 - 1] = world_4.host;
            } else {
               MouseRecorder.field1098[++class70.field1014 - 1] = -1;
               MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               MouseRecorder.field1093[++class221.field2747 - 1] = "";
               MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               MouseRecorder.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else {
            World world_5;
            int i_6;
            int i_8;
            if (i_0 == 6506) {
               i_8 = MouseRecorder.field1098[--class70.field1014];
               world_5 = null;

               for (i_6 = 0; i_6 < World.field1022; i_6++) {
                  if (i_8 == World.field1031[i_6].id) {
                     world_5 = World.field1031[i_6];
                     break;
                  }
               }

               if (world_5 != null) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = world_5.id;
                  MouseRecorder.field1098[++class70.field1014 - 1] = world_5.properties;
                  MouseRecorder.field1093[++class221.field2747 - 1] = world_5.field1028;
                  MouseRecorder.field1098[++class70.field1014 - 1] = world_5.field1032;
                  MouseRecorder.field1098[++class70.field1014 - 1] = world_5.field1030;
                  MouseRecorder.field1093[++class221.field2747 - 1] = world_5.host;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                  MouseRecorder.field1093[++class221.field2747 - 1] = "";
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                  MouseRecorder.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 6507) {
               class70.field1014 -= 4;
               i_8 = MouseRecorder.field1098[class70.field1014];
               boolean bool_11 = MouseRecorder.field1098[class70.field1014 + 1] == 1;
               i_6 = MouseRecorder.field1098[class70.field1014 + 2];
               boolean bool_7 = MouseRecorder.field1098[class70.field1014 + 3] == 1;
               class17.method187(i_8, bool_11, i_6, bool_7, -176379221);
               return 1;
            } else if (i_0 != 6511) {
               if (i_0 == 6512) {
                  Client.field799 = MouseRecorder.field1098[--class70.field1014] == 1;
                  return 1;
               } else {
                  int i_9;
                  class249 class249_10;
                  if (i_0 == 6513) {
                     class70.field1014 -= 2;
                     i_8 = MouseRecorder.field1098[class70.field1014];
                     i_9 = MouseRecorder.field1098[class70.field1014 + 1];
                     class249_10 = class18.method209(i_9, (byte) 4);
                     if (class249_10.method4499()) {
                        MouseRecorder.field1093[++class221.field2747 - 1] = GameApplet.method1005(i_8).method4740(i_9, class249_10.field3303, -1901190491);
                     } else {
                        MouseRecorder.field1098[++class70.field1014 - 1] = GameApplet.method1005(i_8).method4711(i_9, class249_10.field3302);
                     }

                     return 1;
                  } else if (i_0 == 6514) {
                     class70.field1014 -= 2;
                     i_8 = MouseRecorder.field1098[class70.field1014];
                     i_9 = MouseRecorder.field1098[class70.field1014 + 1];
                     class249_10 = class18.method209(i_9, (byte) 4);
                     if (class249_10.method4499()) {
                        MouseRecorder.field1093[++class221.field2747 - 1] = class128.method2970(i_8).method4632(i_9, class249_10.field3303, (byte) 37);
                     } else {
                        MouseRecorder.field1098[++class70.field1014 - 1] = class128.method2970(i_8).method4596(i_9, class249_10.field3302, -291840142);
                     }

                     return 1;
                  } else if (i_0 == 6515) {
                     class70.field1014 -= 2;
                     i_8 = MouseRecorder.field1098[class70.field1014];
                     i_9 = MouseRecorder.field1098[class70.field1014 + 1];
                     class249_10 = class18.method209(i_9, (byte) 4);
                     if (class249_10.method4499()) {
                        MouseRecorder.field1093[++class221.field2747 - 1] = class26.method404(i_8).method4648(i_9, class249_10.field3303);
                     } else {
                        MouseRecorder.field1098[++class70.field1014 - 1] = class26.method404(i_8).method4650(i_9, class249_10.field3302);
                     }

                     return 1;
                  } else if (i_0 == 6516) {
                     class70.field1014 -= 2;
                     i_8 = MouseRecorder.field1098[class70.field1014];
                     i_9 = MouseRecorder.field1098[class70.field1014 + 1];
                     class249_10 = class18.method209(i_9, (byte) 4);
                     if (class249_10.method4499()) {
                        MouseRecorder.field1093[++class221.field2747 - 1] = class249.method4510(i_8, 1544024361).method4515(i_9, class249_10.field3303);
                     } else {
                        MouseRecorder.field1098[++class70.field1014 - 1] = class249.method4510(i_8, 1491402359).method4514(i_9, class249_10.field3302);
                     }

                     return 1;
                  } else if (i_0 == 6518) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = Client.field658 ? 1 : 0;
                     return 1;
                  } else if (i_0 == 6519) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = Client.clientType & 0x3;
                     return 1;
                  } else if (i_0 == 6520) {
                     return 1;
                  } else if (i_0 == 6521) {
                     return 1;
                  } else if (i_0 == 6522) {
                     --class221.field2747;
                     --class70.field1014;
                     return 1;
                  } else if (i_0 == 6523) {
                     --class221.field2747;
                     --class70.field1014;
                     return 1;
                  } else if (i_0 == 6524) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                     return 1;
                  } else if (i_0 == 6525) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = 1;
                     return 1;
                  } else if (i_0 == 6526) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = 1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               i_8 = MouseRecorder.field1098[--class70.field1014];
               if (i_8 >= 0 && i_8 < World.field1022) {
                  world_5 = World.field1031[i_8];
                  MouseRecorder.field1098[++class70.field1014 - 1] = world_5.id;
                  MouseRecorder.field1098[++class70.field1014 - 1] = world_5.properties;
                  MouseRecorder.field1093[++class221.field2747 - 1] = world_5.field1028;
                  MouseRecorder.field1098[++class70.field1014 - 1] = world_5.field1032;
                  MouseRecorder.field1098[++class70.field1014 - 1] = world_5.field1030;
                  MouseRecorder.field1093[++class221.field2747 - 1] = world_5.host;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                  MouseRecorder.field1093[++class221.field2747 - 1] = "";
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                  MouseRecorder.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
