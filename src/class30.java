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

   static class138 method537(int i_0, short s_1) {
      class138 class138_2 = (class138) class258.field3519.method3320((long)i_0);
      if (class138_2 != null) {
         return class138_2;
      } else {
         class138_2 = class136.method3262(class258.field3516, class258.field3517, i_0, false, (byte) 103);
         if (class138_2 != null) {
            class258.field3519.method3322(class138_2, (long)i_0);
         }

         return class138_2;
      }
   }

   static int method536(int i_0, class92 class92_1, boolean bool_2, byte b_3) {
      String string_4;
      if (i_0 == 3100) {
         string_4 = class76.field1093[--class221.field2747];
         class62.method1132(0, "", string_4, -2127661353);
         return 1;
      } else if (i_0 == 3101) {
         class70.field1014 -= 2;
         class63.method1139(Client.field657, class76.field1098[class70.field1014], class76.field1098[class70.field1014 + 1], (byte) -39);
         return 1;
      } else if (i_0 == 3103) {
         if (!class76.field1105) {
            class76.field1104 = true;
         }

         return 1;
      } else {
         int i_11;
         if (i_0 == 3104) {
            string_4 = class76.field1093[--class221.field2747];
            i_11 = 0;
            if (class192.method3677(string_4)) {
               i_11 = class3.method38(string_4, (byte) 0);
            }

            class187 class187_13 = class235.method4265(ClientPacketProt.field2220, Client.data.field1313, 1775123545);
            class187_13.outBuffer.writeIntBigEndian(i_11);
            Client.data.copy(class187_13);
            return 1;
         } else {
            class187 class187_15;
            if (i_0 == 3105) {
               string_4 = class76.field1093[--class221.field2747];
               class187_15 = class235.method4265(ClientPacketProt.field2298, Client.data.field1313, 1775123545);
               class187_15.outBuffer.writeByte(string_4.length() + 1);
               class187_15.outBuffer.writeNullTerminatedString(string_4);
               Client.data.copy(class187_15);
               return 1;
            } else if (i_0 == 3106) {
               string_4 = class76.field1093[--class221.field2747];
               class187_15 = class235.method4265(ClientPacketProt.field2211, Client.data.field1313, 1775123545);
               class187_15.outBuffer.writeByte(string_4.length() + 1);
               class187_15.outBuffer.writeNullTerminatedString(string_4);
               Client.data.copy(class187_15);
               return 1;
            } else {
               String string_8;
               int i_16;
               if (i_0 == 3107) {
                  i_16 = class76.field1098[--class70.field1014];
                  string_8 = class76.field1093[--class221.field2747];
                  class81.method1988(i_16, string_8);
                  return 1;
               } else if (i_0 == 3108) {
                  class70.field1014 -= 3;
                  i_16 = class76.field1098[class70.field1014];
                  i_11 = class76.field1098[class70.field1014 + 1];
                  int i_10 = class76.field1098[class70.field1014 + 2];
                  class217 class217_14 = class80.fetchSomething(i_10);
                  class60.method1118(class217_14, i_16, i_11, 1015928148);
                  return 1;
               } else if (i_0 == 3109) {
                  class70.field1014 -= 2;
                  i_16 = class76.field1098[class70.field1014];
                  i_11 = class76.field1098[class70.field1014 + 1];
                  class217 class217_12 = bool_2 ? class76.field1111 : class207.field2507;
                  class60.method1118(class217_12, i_16, i_11, -497173756);
                  return 1;
               } else if (i_0 == 3110) {
                  class46.field413 = class76.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3111) {
                  class76.field1098[++class70.field1014 - 1] = class17.field117.field1060 ? 1 : 0;
                  return 1;
               } else if (i_0 == 3112) {
                  class17.field117.field1060 = class76.field1098[--class70.field1014] == 1;
                  class97.method2268(2128059454);
                  return 1;
               } else if (i_0 == 3113) {
                  string_4 = class76.field1093[--class221.field2747];
                  boolean bool_5 = class76.field1098[--class70.field1014] == 1;
                  class5.method50(string_4, bool_5, false);
                  return 1;
               } else if (i_0 == 3115) {
                  i_16 = class76.field1098[--class70.field1014];
                  class187_15 = class235.method4265(ClientPacketProt.field2245, Client.data.field1313, 1775123545);
                  class187_15.outBuffer.writeShortBigEndian(i_16);
                  Client.data.copy(class187_15);
                  return 1;
               } else if (i_0 == 3116) {
                  i_16 = class76.field1098[--class70.field1014];
                  class221.field2747 -= 2;
                  string_8 = class76.field1093[class221.field2747];
                  String string_6 = class76.field1093[class221.field2747 + 1];
                  if (string_8.length() > 500) {
                     return 1;
                  } else if (string_6.length() > 500) {
                     return 1;
                  } else {
                     class187 class187_7 = class235.method4265(ClientPacketProt.field2219, Client.data.field1313, 1775123545);
                     class187_7.outBuffer.writeShortBigEndian(1 + class209.method3945(string_8) + class209.method3945(string_6));
                     class187_7.outBuffer.writeNullTerminatedString(string_8);
                     class187_7.outBuffer.writeByte(i_16);
                     class187_7.outBuffer.writeNullTerminatedString(string_6);
                     Client.data.copy(class187_7);
                     return 1;
                  }
               } else if (i_0 == 3117) {
                  Client.field800 = class76.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3118) {
                  Client.field802 = class76.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3119) {
                  Client.field773 = class76.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3120) {
                  if (class76.field1098[--class70.field1014] == 1) {
                     Client.field774 |= 0x1;
                  } else {
                     Client.field774 &= ~0x1;
                  }

                  return 1;
               } else if (i_0 == 3121) {
                  if (class76.field1098[--class70.field1014] == 1) {
                     Client.field774 |= 0x2;
                  } else {
                     Client.field774 &= ~0x2;
                  }

                  return 1;
               } else if (i_0 == 3122) {
                  if (class76.field1098[--class70.field1014] == 1) {
                     Client.field774 |= 0x4;
                  } else {
                     Client.field774 &= ~0x4;
                  }

                  return 1;
               } else if (i_0 == 3123) {
                  if (class76.field1098[--class70.field1014] == 1) {
                     Client.field774 |= 0x8;
                  } else {
                     Client.field774 &= ~0x8;
                  }

                  return 1;
               } else if (i_0 == 3124) {
                  Client.field774 = 0;
                  return 1;
               } else if (i_0 == 3125) {
                  Client.field758 = class76.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3126) {
                  Client.field784 = class76.field1098[--class70.field1014] == 1;
                  return 1;
               } else if (i_0 == 3127) {
                  PriorityComparator.setClientFlag(class76.field1098[--class70.field1014] == 1);
                  return 1;
               } else if (i_0 == 3128) {
                  class76.field1098[++class70.field1014 - 1] = class62.method1128(1493130068) ? 1 : 0;
                  return 1;
               } else if (i_0 == 3129) {
                  class70.field1014 -= 2;
                  Client.field733 = class76.field1098[class70.field1014];
                  Client.field734 = class76.field1098[class70.field1014 + 1];
                  return 1;
               } else if (i_0 == 3130) {
                  class70.field1014 -= 2;
                  return 1;
               } else if (i_0 == 3131) {
                  --class70.field1014;
                  return 1;
               } else if (i_0 == 3132) {
                  class76.field1098[++class70.field1014 - 1] = class7.field46;
                  class76.field1098[++class70.field1014 - 1] = class249.field3308;
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
                  Client.field818 = class76.field1098[--class70.field1014];
                  return 1;
               } else if (i_0 == 3137) {
                  Client.field817 = 2;
                  Client.field818 = class76.field1098[--class70.field1014];
                  return 1;
               } else if (i_0 == 3138) {
                  Client.field817 = 0;
                  return 1;
               } else if (i_0 == 3139) {
                  Client.field817 = 1;
                  return 1;
               } else if (i_0 == 3140) {
                  Client.field817 = 3;
                  Client.field818 = bool_2 ? class76.field1111.field2688 : class207.field2507.field2688;
                  return 1;
               } else {
                  boolean bool_9;
                  if (i_0 == 3141) {
                     bool_9 = class76.field1098[--class70.field1014] == 1;
                     class17.field117.field1066 = bool_9;
                     class97.method2268(2080088285);
                     return 1;
                  } else if (i_0 == 3142) {
                     class76.field1098[++class70.field1014 - 1] = class17.field117.field1066 ? 1 : 0;
                     return 1;
                  } else if (i_0 == 3143) {
                     bool_9 = class76.field1098[--class70.field1014] == 1;
                     Client.field691 = bool_9;
                     if (!bool_9) {
                        class17.field117.field1065 = "";
                        class97.method2268(2140193048);
                     }

                     return 1;
                  } else if (i_0 == 3144) {
                     class76.field1098[++class70.field1014 - 1] = Client.field691 ? 1 : 0;
                     return 1;
                  } else if (i_0 == 3145) {
                     return 1;
                  } else if (i_0 == 3146) {
                     bool_9 = class76.field1098[--class70.field1014] == 1;
                     if (bool_9 == class17.field117.field1063) {
                        class17.field117.field1063 = !bool_9;
                        class97.method2268(2086771658);
                     }

                     return 1;
                  } else if (i_0 == 3147) {
                     class76.field1098[++class70.field1014 - 1] = class17.field117.field1063 ? 0 : 1;
                     return 1;
                  } else if (i_0 == 3148) {
                     return 1;
                  } else if (i_0 == 3149) {
                     class76.field1098[++class70.field1014 - 1] = 0;
                     return 1;
                  } else if (i_0 == 3150) {
                     class76.field1098[++class70.field1014 - 1] = 0;
                     return 1;
                  } else if (i_0 == 3151) {
                     class76.field1098[++class70.field1014 - 1] = 0;
                     return 1;
                  } else if (i_0 == 3152) {
                     class76.field1098[++class70.field1014 - 1] = 0;
                     return 1;
                  } else if (i_0 == 3153) {
                     class76.field1098[++class70.field1014 - 1] = class85.field1188;
                     return 1;
                  } else if (i_0 == 3154) {
                     class76.field1098[++class70.field1014 - 1] = Categorizable.method5176((byte) 0);
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
            class76.field1098[++class70.field1014 - 1] = -2;
         } else if (class58.field546.field1076 == 1) {
            class76.field1098[++class70.field1014 - 1] = -1;
         } else {
            class76.field1098[++class70.field1014 - 1] = class58.field546.field1070.method5079(-265532636);
         }

         return 1;
      } else {
         int i_4;
         if (i_0 == 3601) {
            i_4 = class76.field1098[--class70.field1014];
            if (class58.field546.method1791(-1493055205) && i_4 >= 0 && i_4 < class58.field546.field1070.method5079(1828671989)) {
               class284 class284_9 = (class284) class58.field546.field1070.method5151(i_4, -1795691721);
               class76.field1093[++class221.field2747 - 1] = class284_9.method5042(92130807);
               class76.field1093[++class221.field2747 - 1] = class284_9.method5043(1677107583);
            } else {
               class76.field1093[++class221.field2747 - 1] = "";
               class76.field1093[++class221.field2747 - 1] = "";
            }

            return 1;
         } else if (i_0 == 3602) {
            i_4 = class76.field1098[--class70.field1014];
            if (class58.field546.method1791(-1493055205) && i_4 >= 0 && i_4 < class58.field546.field1070.method5079(1275787424)) {
               class76.field1098[++class70.field1014 - 1] = ((Categorizable) class58.field546.field1070.method5151(i_4, 1037393545)).category;
            } else {
               class76.field1098[++class70.field1014 - 1] = 0;
            }

            return 1;
         } else if (i_0 == 3603) {
            i_4 = class76.field1098[--class70.field1014];
            if (class58.field546.method1791(-1493055205) && i_4 >= 0 && i_4 < class58.field546.field1070.method5079(1784436232)) {
               class76.field1098[++class70.field1014 - 1] = ((Categorizable) class58.field546.field1070.method5151(i_4, 1663115096)).field3634;
            } else {
               class76.field1098[++class70.field1014 - 1] = 0;
            }

            return 1;
         } else {
            String string_6;
            if (i_0 == 3604) {
               string_6 = class76.field1093[--class221.field2747];
               int i_7 = class76.field1098[--class70.field1014];
               class14.method159(string_6, i_7);
               return 1;
            } else if (i_0 == 3605) {
               string_6 = class76.field1093[--class221.field2747];
               class58.field546.method1810(string_6, -1616773862);
               return 1;
            } else if (i_0 == 3606) {
               string_6 = class76.field1093[--class221.field2747];
               class58.field546.method1770(string_6, -1086170142);
               return 1;
            } else if (i_0 == 3607) {
               string_6 = class76.field1093[--class221.field2747];
               class58.field546.method1768(string_6, (byte) 1);
               return 1;
            } else if (i_0 == 3608) {
               string_6 = class76.field1093[--class221.field2747];
               class58.field546.method1771(string_6, (byte) 8);
               return 1;
            } else if (i_0 == 3609) {
               string_6 = class76.field1093[--class221.field2747];
               string_6 = class8.method94(string_6, -282995090);
               class76.field1098[++class70.field1014 - 1] = class58.field546.method1764(new class283(string_6, class40.field353), false, 277105745) ? 1 : 0;
               return 1;
            } else if (i_0 == 3611) {
               if (class46.field410 != null) {
                  class76.field1093[++class221.field2747 - 1] = class46.field410.field3655;
               } else {
                  class76.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 3612) {
               if (class46.field410 != null) {
                  class76.field1098[++class70.field1014 - 1] = class46.field410.method5079(1993850735);
               } else {
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3613) {
               i_4 = class76.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079(1985698898)) {
                  class76.field1093[++class221.field2747 - 1] = class46.field410.method5151(i_4, -729323134).method5041(-156755920).method5197((byte) 30);
               } else {
                  class76.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 3614) {
               i_4 = class76.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079(1883680334)) {
                  class76.field1098[++class70.field1014 - 1] = ((Categorizable) class46.field410.method5151(i_4, -1621165810)).method5164(1733465093);
               } else {
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3615) {
               i_4 = class76.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079(867619156)) {
                  class76.field1098[++class70.field1014 - 1] = ((Categorizable) class46.field410.method5151(i_4, -1916964141)).field3634;
               } else {
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3616) {
               class76.field1098[++class70.field1014 - 1] = class46.field410 != null ? class46.field410.field3657 : 0;
               return 1;
            } else if (i_0 == 3617) {
               string_6 = class76.field1093[--class221.field2747];
               class126.method2856(string_6, -1430853825);
               return 1;
            } else if (i_0 == 3618) {
               class76.field1098[++class70.field1014 - 1] = class46.field410 != null ? class46.field410.field3653 : 0;
               return 1;
            } else if (i_0 == 3619) {
               string_6 = class76.field1093[--class221.field2747];
               class65.method1170(string_6, -1765839836);
               return 1;
            } else if (i_0 == 3620) {
               class56.method1089((byte) -73);
               return 1;
            } else if (i_0 == 3621) {
               if (!class58.field546.method1791(-1493055205)) {
                  class76.field1098[++class70.field1014 - 1] = -1;
               } else {
                  class76.field1098[++class70.field1014 - 1] = class58.field546.field1071.method5079(870571289);
               }

               return 1;
            } else if (i_0 == 3622) {
               i_4 = class76.field1098[--class70.field1014];
               if (class58.field546.method1791(-1493055205) && i_4 >= 0 && i_4 < class58.field546.field1071.method5079(1428936377)) {
                  class278 class278_5 = (class278) class58.field546.field1071.method5151(i_4, -1786783253);
                  class76.field1093[++class221.field2747 - 1] = class278_5.method5042(92130807);
                  class76.field1093[++class221.field2747 - 1] = class278_5.method5043(2032922016);
               } else {
                  class76.field1093[++class221.field2747 - 1] = "";
                  class76.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 3623) {
               string_6 = class76.field1093[--class221.field2747];
               string_6 = class8.method94(string_6, 1407044652);
               class76.field1098[++class70.field1014 - 1] = class58.field546.method1765(new class283(string_6, class40.field353), (byte) -1) ? 1 : 0;
               return 1;
            } else if (i_0 == 3624) {
               i_4 = class76.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079(987707613) && class46.field410.method5151(i_4, 2117065781).method5041(-156755920).equals(Client.field657.field621)) {
                  class76.field1098[++class70.field1014 - 1] = 1;
               } else {
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 3625) {
               if (class46.field410 != null && class46.field410.field3656 != null) {
                  class76.field1093[++class221.field2747 - 1] = class46.field410.field3656;
               } else {
                  class76.field1093[++class221.field2747 - 1] = "";
               }

               return 1;
            } else if (i_0 == 3626) {
               i_4 = class76.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079(52871728) && ((class273) class46.field410.method5151(i_4, 373160188)).method5028(16711935)) {
                  class76.field1098[++class70.field1014 - 1] = 1;
               } else {
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 != 3627) {
               if (i_0 == 3628) {
                  class58.field546.field1070.method5099(-960225827);
                  return 1;
               } else {
                  boolean bool_8;
                  if (i_0 == 3629) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class314(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3630) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class315(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3631) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class157(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3632) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class151(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3633) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new PriorityComparator(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3634) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class159(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3635) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class155(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3636) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class153(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3637) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class152(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3638) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class154(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3639) {
                     class58.field546.field1070.method5133((short) 128);
                     return 1;
                  } else if (i_0 == 3640) {
                     class58.field546.field1071.method5099(553679598);
                     return 1;
                  } else if (i_0 == 3641) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1071.method5100(new class314(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3642) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1071.method5100(new class315(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3643) {
                     class58.field546.field1071.method5133((short) 128);
                     return 1;
                  } else if (i_0 == 3644) {
                     if (class46.field410 != null) {
                        class46.field410.method5099(-873592624);
                     }

                     return 1;
                  } else if (i_0 == 3645) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class314(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3646) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class315(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3647) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class157(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3648) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class151(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3649) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new PriorityComparator(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3650) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class159(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3651) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class155(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3652) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class153(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3653) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class152(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3654) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class154(bool_8), -1720687591);
                     }

                     return 1;
                  } else if (i_0 == 3655) {
                     if (class46.field410 != null) {
                        class46.field410.method5133((short) 128);
                     }

                     return 1;
                  } else if (i_0 == 3656) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     class58.field546.field1070.method5100(new class158(bool_8), -1720687591);
                     return 1;
                  } else if (i_0 == 3657) {
                     bool_8 = class76.field1098[--class70.field1014] == 1;
                     if (class46.field410 != null) {
                        class46.field410.method5100(new class158(bool_8), -1720687591);
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               i_4 = class76.field1098[--class70.field1014];
               if (class46.field410 != null && i_4 < class46.field410.method5079(1624557237) && ((class273) class46.field410.method5151(i_4, -518927206)).method5022((byte) 15)) {
                  class76.field1098[++class70.field1014 - 1] = 1;
               } else {
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }

}
