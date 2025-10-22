public class class30 {

   static int field267;
   static class324 field264;
   static int field259;
   static final class30 field262 = new class30(0);
   static final class30 field258 = new class30(1);
   final int field260;

   class30(int i_1) {
      this.field260 = i_1;
   }

   static class138 method537(int i_0) {
      class138 class138_2 = (class138) SequenceAnimation.field3519.get((long)i_0);
      if (class138_2 != null) {
         return class138_2;
      } else {
         class138_2 = class136.method3262(SequenceAnimation.field3516, SequenceAnimation.field3517, i_0, false);
         if (class138_2 != null) {
            SequenceAnimation.field3519.put(class138_2, (long)i_0);
         }

         return class138_2;
      }
   }

   static int method536(int i_0, boolean bool_2) {
      String string_4;
      if (i_0 == 3100) {
         string_4 = MouseRecorder.field1093[--class221.field2747];
         MusicPatchPcmStream.method1132(0, "", string_4);
         return 1;
      } else if (i_0 == 3101) {
         class70.field1014 -= 2;
         class63.method1139(Client.localPlayer, MouseRecorder.field1098[class70.field1014], MouseRecorder.field1098[class70.field1014 + 1]);
         return 1;
      } else if (i_0 == 3103) {
         if (!MouseRecorder.field1105) {
            MouseRecorder.field1104 = true;
         }

         return 1;
      } else {
         int i_11;
         if (i_0 == 3104) {
            string_4 = MouseRecorder.field1093[--class221.field2747];
            i_11 = 0;
            if (class192.method3677(string_4)) {
               i_11 = class3.method38(string_4);
            }

            class187 class187_13 = class235.method4265(ClientPacketProt.field2220, Client.data.field1313);
            class187_13.outBuffer.writeIntBigEndian(i_11);
            Client.data.copy(class187_13);
            return 1;
         } else {
            class187 class187_15;
            if (i_0 == 3105) {
               string_4 = MouseRecorder.field1093[--class221.field2747];
               class187_15 = class235.method4265(ClientPacketProt.field2298, Client.data.field1313);
               class187_15.outBuffer.writeByte(string_4.length() + 1);
               class187_15.outBuffer.writeNullTerminatedString(string_4);
               Client.data.copy(class187_15);
               return 1;
            } else if (i_0 == 3106) {
               string_4 = MouseRecorder.field1093[--class221.field2747];
               class187_15 = class235.method4265(ClientPacketProt.field2211, Client.data.field1313);
               class187_15.outBuffer.writeByte(string_4.length() + 1);
               class187_15.outBuffer.writeNullTerminatedString(string_4);
               Client.data.copy(class187_15);
               return 1;
            } else {
               String string_8;
               int i_16;
               if (i_0 == 3107) {
                  i_16 = MouseRecorder.field1098[--class70.field1014];
                  string_8 = MouseRecorder.field1093[--class221.field2747];
                  class81.method1988(i_16, string_8);
                  return 1;
               } else if (i_0 == 3108) {
                  class70.field1014 -= 3;
                  i_16 = MouseRecorder.field1098[class70.field1014];
                  i_11 = MouseRecorder.field1098[class70.field1014 + 1];
                  int i_10 = MouseRecorder.field1098[class70.field1014 + 2];
                  Widget widget_14 = WorldMapElement.getWidget(i_10);
                  class60.method1118(widget_14, i_16, i_11, 1015928148);
                  return 1;
               } else if (i_0 == 3109) {
                  class70.field1014 -= 2;
                  i_16 = MouseRecorder.field1098[class70.field1014];
                  i_11 = MouseRecorder.field1098[class70.field1014 + 1];
                  Widget widget_12 = bool_2 ? MouseRecorder.field1111 : class207.field2507;
                  class60.method1118(widget_12, i_16, i_11, -497173756);
                  return 1;
               } else if (i_0 == 3110) {
                  class46.field413 = MouseRecorder.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3111) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = class17.field117.field1060 ? 1 : 0;
                  return 1;
               } else if (i_0 == 3112) {
                  class17.field117.field1060 = MouseRecorder.field1098[--class70.field1014] == 1;
                  class97.method2268();
                  return 1;
               } else if (i_0 == 3113) {
                  string_4 = MouseRecorder.field1093[--class221.field2747];
                  boolean bool_5 = MouseRecorder.field1098[--class70.field1014] == 1;
                  class5.method50(string_4, bool_5, false);
                  return 1;
               } else if (i_0 == 3115) {
                  i_16 = MouseRecorder.field1098[--class70.field1014];
                  class187_15 = class235.method4265(ClientPacketProt.field2245, Client.data.field1313);
                  class187_15.outBuffer.writeShortBigEndian(i_16);
                  Client.data.copy(class187_15);
                  return 1;
               } else if (i_0 == 3116) {
                  i_16 = MouseRecorder.field1098[--class70.field1014];
                  class221.field2747 -= 2;
                  string_8 = MouseRecorder.field1093[class221.field2747];
                  String string_6 = MouseRecorder.field1093[class221.field2747 + 1];
                  if (string_8.length() > 500) {
                     return 1;
                  } else if (string_6.length() > 500) {
                     return 1;
                  } else {
                     class187 class187_7 = class235.method4265(ClientPacketProt.field2219, Client.data.field1313);
                     class187_7.outBuffer.writeShortBigEndian(1 + class209.method3945(string_8) + class209.method3945(string_6));
                     class187_7.outBuffer.writeNullTerminatedString(string_8);
                     class187_7.outBuffer.writeByte(i_16);
                     class187_7.outBuffer.writeNullTerminatedString(string_6);
                     Client.data.copy(class187_7);
                     return 1;
                  }
               } else if (i_0 == 3117) {
                  Client.field800 = MouseRecorder.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3118) {
                  Client.field802 = MouseRecorder.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3119) {
                  Client.field773 = MouseRecorder.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3120) {
                  if (MouseRecorder.field1098[--class70.field1014] == 1) {
                     Client.field774 |= 0x1;
                  } else {
                     Client.field774 &= ~0x1;
                  }

                  return 1;
               } else if (i_0 == 3121) {
                  if (MouseRecorder.field1098[--class70.field1014] == 1) {
                     Client.field774 |= 0x2;
                  } else {
                     Client.field774 &= ~0x2;
                  }

                  return 1;
               } else if (i_0 == 3122) {
                  if (MouseRecorder.field1098[--class70.field1014] == 1) {
                     Client.field774 |= 0x4;
                  } else {
                     Client.field774 &= ~0x4;
                  }

                  return 1;
               } else if (i_0 == 3123) {
                  if (MouseRecorder.field1098[--class70.field1014] == 1) {
                     Client.field774 |= 0x8;
                  } else {
                     Client.field774 &= ~0x8;
                  }

                  return 1;
               } else if (i_0 == 3124) {
                  Client.field774 = 0;
                  return 1;
               } else if (i_0 == 3125) {
                  Client.field758 = MouseRecorder.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3126) {
                  Client.field784 = MouseRecorder.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3127) {
                  PriorityComparator.setClientFlag(MouseRecorder.field1098[--class70.field1014] == 1);
                  return 1;
               } else if (i_0 == 3128) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = MusicPatchPcmStream.method1128() ? 1 : 0;
                  return 1;
               } else if (i_0 == 3129) {
                  class70.field1014 -= 2;
                  Client.field733 = MouseRecorder.field1098[class70.field1014];
                  Client.field734 = MouseRecorder.field1098[class70.field1014 + 1];
                  return 1;
               } else if (i_0 == 3130) {
                  class70.field1014 -= 2;
                  return 1;
               } else if (i_0 == 3131) {
                  --class70.field1014;
                  return 1;
               } else if (i_0 == 3132) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = class7.field46;
                  MouseRecorder.field1098[++class70.field1014 - 1] = ParamComposition.field3308;
                  return 1;
               } else if (i_0 == 3133) {
                  --class70.field1014;
                  return 1;
               } else if (i_0 == 3134) {
                  return 1;
               } else if (i_0 == 3135) {
                  class70.field1014 -= 2;
                  return 1;
               } else if (i_0 == 3136) {
                  Client.field817 = 3;
                  Client.field818 = MouseRecorder.field1098[--class70.field1014];
                  return 1;
               } else if (i_0 == 3137) {
                  Client.field817 = 2;
                  Client.field818 = MouseRecorder.field1098[--class70.field1014];
                  return 1;
               } else if (i_0 == 3138) {
                  Client.field817 = 0;
                  return 1;
               } else if (i_0 == 3139) {
                  Client.field817 = 1;
                  return 1;
               } else if (i_0 == 3140) {
                  Client.field817 = 3;
                  Client.field818 = bool_2 ? MouseRecorder.field1111.field2688 : class207.field2507.field2688;
                  return 1;
               } else {
                  boolean bool_9;
                  if (i_0 == 3141) {
                     bool_9 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class17.field117.field1066 = bool_9;
                     class97.method2268();
                     return 1;
                  } else if (i_0 == 3142) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = class17.field117.field1066 ? 1 : 0;
                     return 1;
                  } else if (i_0 == 3143) {
                     bool_9 = MouseRecorder.field1098[--class70.field1014] == 1;
                     Client.field691 = bool_9;
                     if (!bool_9) {
                        class17.field117.field1065 = "";
                        class97.method2268();
                     }

                     return 1;
                  } else if (i_0 == 3144) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = Client.field691 ? 1 : 0;
                     return 1;
                  } else if (i_0 == 3145) {
                     return 1;
                  } else if (i_0 == 3146) {
                     bool_9 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (bool_9 == class17.field117.field1063) {
                        class17.field117.field1063 = !bool_9;
                        class97.method2268();
                     }

                     return 1;
                  } else if (i_0 == 3147) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = class17.field117.field1063 ? 0 : 1;
                     return 1;
                  } else if (i_0 == 3148) {
                     return 1;
                  } else if (i_0 == 3149) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                     return 1;
                  } else if (i_0 == 3150) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                     return 1;
                  } else if (i_0 == 3151) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                     return 1;
                  } else if (i_0 == 3152) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                     return 1;
                  } else if (i_0 == 3153) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = Login.field1188;
                     return 1;
                  } else if (i_0 == 3154) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = Categorizable.method5176((byte) 0);
                     return 1;
                  } else if (i_0 == 3155) {
                     class70.field1014 -= 2;
                     return 1;
                  } else {
                     return i_0 == 3156 ? 1 : 2;
                  }
               }
            }
         }
      }
   }

   static int method535(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      if (i_0 == 3600) {
         if (class58.field546.field1076 == 0) {
            MouseRecorder.field1098[++class70.field1014 - 1] = -2;
         } else if (class58.field546.field1076 == 1) {
            MouseRecorder.field1098[++class70.field1014 - 1] = -1;
         } else {
            MouseRecorder.field1098[++class70.field1014 - 1] = class58.field546.field1070.method5079();
         }

         return 1;
      } else {
         int i_4;
         if (i_0 == 3601) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            if (class58.field546.method1791() && i_4 >= 0 && i_4 < class58.field546.field1070.method5079()) {
               class284 class284_9 = (class284) class58.field546.field1070.method5151(i_4);
               MouseRecorder.field1093[++class221.field2747 - 1] = class284_9.method5042();
               MouseRecorder.field1093[++class221.field2747 - 1] = class284_9.method5043();
            } else {
               MouseRecorder.field1093[++class221.field2747 - 1] = "";
               MouseRecorder.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else if (i_0 == 3602) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            if (class58.field546.method1791() && i_4 >= 0 && i_4 < class58.field546.field1070.method5079()) {
               MouseRecorder.field1098[++class70.field1014 - 1] = ((Categorizable) class58.field546.field1070.method5151(i_4)).category;
            } else {
               MouseRecorder.field1098[++class70.field1014 - 1] = 0;
            }

            return 1;
         } else if (i_0 == 3603) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            if (class58.field546.method1791() && i_4 >= 0 && i_4 < class58.field546.field1070.method5079()) {
               MouseRecorder.field1098[++class70.field1014 - 1] = ((Categorizable) class58.field546.field1070.method5151(i_4)).field3634;
            } else {
               MouseRecorder.field1098[++class70.field1014 - 1] = 0;
            }

            return 1;
         } else {
            String string_6;
            if (i_0 == 3604) {
               string_6 = MouseRecorder.field1093[--class221.field2747];
               int i_7 = MouseRecorder.field1098[--class70.field1014];
               MilliClock.method159(string_6, i_7);
               return 1;
            } else if (i_0 == 3605) {
               string_6 = MouseRecorder.field1093[--class221.field2747];
               class58.field546.method1810(string_6);
               return 1;
            } else if (i_0 == 3606) {
               string_6 = MouseRecorder.field1093[--class221.field2747];
               class58.field546.method1770(string_6, -1086170142);
               return 1;
            } else if (i_0 == 3607) {
               string_6 = MouseRecorder.field1093[--class221.field2747];
               class58.field546.method1768(string_6, (byte) 1);
               return 1;
            } else if (i_0 == 3608) {
               string_6 = MouseRecorder.field1093[--class221.field2747];
               class58.field546.method1771(string_6);
               return 1;
            } else if (i_0 == 3609) {
               string_6 = MouseRecorder.field1093[--class221.field2747];
               string_6 = class8.method94(string_6);
               MouseRecorder.field1098[++class70.field1014 - 1] = class58.field546.method1764(new Username(string_6, FontName.loginType), false) ? 1 : 0;
               return 1;
            } else if (i_0 == 3611) {
               if (class46.field410 != null) {
                  MouseRecorder.field1093[++class221.field2747 - 1] = class46.field410.field3655;
               } else {
                  MouseRecorder.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 3612) {
               if (class46.field410 != null) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = class46.field410.method5079();
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3613) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079()) {
                  MouseRecorder.field1093[++class221.field2747 - 1] = class46.field410.method5151(i_4).method5041().method5197();
               } else {
                  MouseRecorder.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 3614) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079()) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = ((Categorizable) class46.field410.method5151(i_4)).method5164(1733465093);
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3615) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079()) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = ((Categorizable) class46.field410.method5151(i_4)).field3634;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3616) {
               MouseRecorder.field1098[++class70.field1014 - 1] = class46.field410 != null ? class46.field410.field3657 : 0;
               return 1;
            } else if (i_0 == 3617) {
               string_6 = MouseRecorder.field1093[--class221.field2747];
               Tile.method2856(string_6);
               return 1;
            } else if (i_0 == 3618) {
               MouseRecorder.field1098[++class70.field1014 - 1] = class46.field410 != null ? class46.field410.field3653 : 0;
               return 1;
            } else if (i_0 == 3619) {
               string_6 = MouseRecorder.field1093[--class221.field2747];
               class65.method1170(string_6, -1765839836);
               return 1;
            } else if (i_0 == 3620) {
               class56.method1089((byte) -73);
               return 1;
            } else if (i_0 == 3621) {
               if (!class58.field546.method1791()) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = -1;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = class58.field546.field1071.method5079();
               }

               return 1;
            } else if (i_0 == 3622) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               if (class58.field546.method1791() && i_4 >= 0 && i_4 < class58.field546.field1071.method5079()) {
                  class278 class278_5 = (class278) class58.field546.field1071.method5151(i_4);
                  MouseRecorder.field1093[++class221.field2747 - 1] = class278_5.method5042();
                  MouseRecorder.field1093[++class221.field2747 - 1] = class278_5.method5043();
               } else {
                  MouseRecorder.field1093[++class221.field2747 - 1] = "";
                  MouseRecorder.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 3623) {
               string_6 = MouseRecorder.field1093[--class221.field2747];
               string_6 = class8.method94(string_6);
               MouseRecorder.field1098[++class70.field1014 - 1] = class58.field546.isIgnored(new Username(string_6, FontName.loginType)) ? 1 : 0;
               return 1;
            } else if (i_0 == 3624) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079() && class46.field410.method5151(i_4).method5041().equals(Client.localPlayer.field621)) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 1;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3625) {
               if (class46.field410 != null && class46.field410.field3656 != null) {
                  MouseRecorder.field1093[++class221.field2747 - 1] = class46.field410.field3656;
               } else {
                  MouseRecorder.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 3626) {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079() && ((class273) class46.field410.method5151(i_4)).method5028()) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 1;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 != 3627) {
               if (i_0 == 3628) {
                  class58.field546.field1070.method5099();
                  return 1;
               } else {
                  boolean bool_8;
                  if (i_0 == 3629) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class314(bool_8));
                     return 1;
                  } else if (i_0 == 3630) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class315(bool_8));
                     return 1;
                  } else if (i_0 == 3631) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class157(bool_8));
                     return 1;
                  } else if (i_0 == 3632) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class151(bool_8));
                     return 1;
                  } else if (i_0 == 3633) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new PriorityComparator(bool_8));
                     return 1;
                  } else if (i_0 == 3634) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class159(bool_8));
                     return 1;
                  } else if (i_0 == 3635) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class155(bool_8));
                     return 1;
                  } else if (i_0 == 3636) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class153(bool_8));
                     return 1;
                  } else if (i_0 == 3637) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class152(bool_8));
                     return 1;
                  } else if (i_0 == 3638) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class154(bool_8));
                     return 1;
                  } else if (i_0 == 3639) {
                     class58.field546.field1070.method5133();
                     return 1;
                  } else if (i_0 == 3640) {
                     class58.field546.field1071.method5099();
                     return 1;
                  } else if (i_0 == 3641) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1071.addCompare(new class314(bool_8));
                     return 1;
                  } else if (i_0 == 3642) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1071.addCompare(new class315(bool_8));
                     return 1;
                  } else if (i_0 == 3643) {
                     class58.field546.field1071.method5133();
                     return 1;
                  } else if (i_0 == 3644) {
                     if (class46.field410 != null) {
                        class46.field410.method5099();
                     }

                     return 1;
                  } else if (i_0 == 3645) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class314(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3646) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class315(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3647) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class157(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3648) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class151(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3649) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new PriorityComparator(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3650) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class159(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3651) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class155(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3652) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class153(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3653) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class152(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3654) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class154(bool_8));
                     }

                     return 1;
                  } else if (i_0 == 3655) {
                     if (class46.field410 != null) {
                        class46.field410.method5133();
                     }

                     return 1;
                  } else if (i_0 == 3656) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.addCompare(new class158(bool_8));
                     return 1;
                  } else if (i_0 == 3657) {
                     bool_8 = MouseRecorder.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.addCompare(new class158(bool_8));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               i_4 = MouseRecorder.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079() && ((class273) class46.field410.method5151(i_4)).method5022()) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 1;
               } else {
                  MouseRecorder.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }

}
