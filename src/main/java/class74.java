public class class74 {

   static class324[] field1073;
   static int[] field1074;
   int field1076 = 0;
   final class338 field1075;
   public final class282 field1070;
   public final class276 field1071;

   class74(class338 class338_1) {
      this.field1075 = class338_1;
      this.field1070 = new class282(class338_1);
      this.field1071 = new class276(class338_1);
   }

   final boolean method1781(Username username_1, int i_2) {
      class284 class284_3 = (class284) this.field1070.method5082(username_1);
      return class284_3 != null && class284_3.method5168((byte) -4);
   }

   final boolean method1767() {
      return this.field1070.method5106() || this.field1070.method5079() >= 200 && Client.field771 != 1;
   }

   final boolean method1778() {
      return this.field1071.method5106() || this.field1071.method5079() >= 100 && Client.field771 != 1;
   }

   final boolean method1764(Username username_1, boolean bool_2) {
      return username_1 == null ? false : (username_1.equals(Client.localPlayer.field621) ? true : this.field1070.method5183(username_1, bool_2, 547540517));
   }

   final boolean isIgnored(Username username_1) {
      return username_1 == null ? false : this.field1071.method5081(username_1);
   }

   final void method1760() {
      this.field1076 = 1;
   }

   final void method1805(ByteBuffer class300_1, int i_2, int i_3) {
      this.field1070.method5184(class300_1, i_2, 2066125669);
      this.field1076 = 2;
      class129.method2972((byte) 6);
   }

   boolean method1791() {
      return this.field1076 == 2;
   }

   static int method1817(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      int i_4;
      if (i_0 == 3903) {
         i_4 = MouseRecorder.field1098[--class70.field1014];
         MouseRecorder.field1098[++class70.field1014 - 1] = Client.field866[i_4].method98();
         return 1;
      } else if (i_0 == 3904) {
         i_4 = MouseRecorder.field1098[--class70.field1014];
         MouseRecorder.field1098[++class70.field1014 - 1] = Client.field866[i_4].field59;
         return 1;
      } else if (i_0 == 3905) {
         i_4 = MouseRecorder.field1098[--class70.field1014];
         MouseRecorder.field1098[++class70.field1014 - 1] = Client.field866[i_4].field60;
         return 1;
      } else if (i_0 == 3906) {
         i_4 = MouseRecorder.field1098[--class70.field1014];
         MouseRecorder.field1098[++class70.field1014 - 1] = Client.field866[i_4].field61;
         return 1;
      } else if (i_0 == 3907) {
         i_4 = MouseRecorder.field1098[--class70.field1014];
         MouseRecorder.field1098[++class70.field1014 - 1] = Client.field866[i_4].field58;
         return 1;
      } else if (i_0 == 3908) {
         i_4 = MouseRecorder.field1098[--class70.field1014];
         MouseRecorder.field1098[++class70.field1014 - 1] = Client.field866[i_4].field63;
         return 1;
      } else {
         int i_13;
         if (i_0 == 3910) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            i_13 = Client.field866[i_4].method97();
            MouseRecorder.field1098[++class70.field1014 - 1] = i_13 == 0 ? 1 : 0;
            return 1;
         } else if (i_0 == 3911) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            i_13 = Client.field866[i_4].method97();
            MouseRecorder.field1098[++class70.field1014 - 1] = i_13 == 2 ? 1 : 0;
            return 1;
         } else if (i_0 == 3912) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            i_13 = Client.field866[i_4].method97();
            MouseRecorder.field1098[++class70.field1014 - 1] = i_13 == 5 ? 1 : 0;
            return 1;
         } else if (i_0 == 3913) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            i_13 = Client.field866[i_4].method97();
            MouseRecorder.field1098[++class70.field1014 - 1] = i_13 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean bool_14;
            if (i_0 == 3914) {
               bool_14 = MouseRecorder.field1098[--class70.field1014] == 1;
               if (class68.field942 != null) {
                  class68.field942.method65(class6.field28, bool_14, (short) 128);
               }

               return 1;
            } else if (i_0 == 3915) {
               bool_14 = MouseRecorder.field1098[--class70.field1014] == 1;
               if (class68.field942 != null) {
                  class68.field942.method65(class6.field30, bool_14, (short) 128);
               }

               return 1;
            } else if (i_0 == 3916) {
               class70.field1014 -= 2;
               bool_14 = MouseRecorder.field1098[class70.field1014] == 1;
               boolean bool_5 = MouseRecorder.field1098[class70.field1014 + 1] == 1;
               if (class68.field942 != null) {
                  Client.field923.field648 = bool_5;
                  class68.field942.method65(Client.field923, bool_14, (short) 128);
               }

               return 1;
            } else if (i_0 == 3917) {
               bool_14 = MouseRecorder.field1098[--class70.field1014] == 1;
               if (class68.field942 != null) {
                  class68.field942.method65(class6.field29, bool_14, (short) 128);
               }

               return 1;
            } else if (i_0 == 3918) {
               bool_14 = MouseRecorder.field1098[--class70.field1014] == 1;
               if (class68.field942 != null) {
                  class68.field942.method65(class6.field32, bool_14, (short) 128);
               }

               return 1;
            } else if (i_0 == 3919) {
               MouseRecorder.field1098[++class70.field1014 - 1] = class68.field942 == null ? 0 : class68.field942.field36.size();
               return 1;
            } else {
               class7 class7_12;
               if (i_0 == 3920) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class7_12 = (class7) class68.field942.field36.get(i_4);
                  MouseRecorder.field1098[++class70.field1014 - 1] = class7_12.field51;
                  return 1;
               } else if (i_0 == 3921) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class7_12 = (class7) class68.field942.field36.get(i_4);
                  MouseRecorder.field1093[++class221.field2747 - 1] = class7_12.method74();
                  return 1;
               } else if (i_0 == 3922) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class7_12 = (class7) class68.field942.field36.get(i_4);
                  MouseRecorder.field1093[++class221.field2747 - 1] = class7_12.method77();
                  return 1;
               } else if (i_0 == 3923) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class7_12 = (class7) class68.field942.field36.get(i_4);
                  long long_6 = TimeUtils.getAdjustedTimeMillis() - Categorizable.field3632 - class7_12.field42;
                  int i_8 = (int)(long_6 / 3600000L);
                  int i_9 = (int)((long_6 - (long)(i_8 * 3600000)) / 60000L);
                  int i_10 = (int)((long_6 - (long)(i_8 * 3600000) - (long)(i_9 * 60000)) / 1000L);
                  String string_11 = i_8 + ":" + i_9 / 10 + i_9 % 10 + ":" + i_10 / 10 + i_10 % 10;
                  MouseRecorder.field1093[++class221.field2747 - 1] = string_11;
                  return 1;
               } else if (i_0 == 3924) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class7_12 = (class7) class68.field942.field36.get(i_4);
                  MouseRecorder.field1098[++class70.field1014 - 1] = class7_12.field53.field61;
                  return 1;
               } else if (i_0 == 3925) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class7_12 = (class7) class68.field942.field36.get(i_4);
                  MouseRecorder.field1098[++class70.field1014 - 1] = class7_12.field53.field60;
                  return 1;
               } else if (i_0 == 3926) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class7_12 = (class7) class68.field942.field36.get(i_4);
                  MouseRecorder.field1098[++class70.field1014 - 1] = class7_12.field53.field59;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   final void method1770(String string_1, int i_2) {
      if (string_1 != null) {
         Username username_3 = new Username(string_1, this.field1075);
         if (username_3.method5205()) {
            if (this.field1070.method5085(username_3)) {
               Client.field672 = Client.field673;
               class187 class187_4 = class235.method4265(ClientPacketProt.field2224, Client.data.field1313);
               class187_4.outBuffer.writeByte(class209.method3945(string_1));
               class187_4.outBuffer.writeNullTerminatedString(string_1);
               Client.data.copy(class187_4);
            }

            class129.method2972((byte) 6);
         }
      }
   }

   final void method1810(String string_1) {
      if (string_1 != null) {
         Username username_3 = new Username(string_1, this.field1075);
         if (username_3.method5205()) {
            if (this.method1767()) {
               class63.method1138();
            } else {
               StringBuilder stringbuilder_10000;
               String string_5;
               if (Client.localPlayer.field621.equals(username_3)) {
                  stringbuilder_10000 = null;
                  string_5 = "You can't add yourself to your own friend list";
                  class62.method1132(30, "", string_5);
               } else if (this.method1764(username_3, false)) {
                  class36.method633(string_1, -1454512266);
               } else if (this.isIgnored(username_3)) {
                  stringbuilder_10000 = new StringBuilder();
                  Object obj_10001 = null;
                  stringbuilder_10000 = stringbuilder_10000.append("Please remove ").append(string_1);
                  obj_10001 = null;
                  string_5 = stringbuilder_10000.append(" from your ignore list first").toString();
                  class62.method1132(30, "", string_5);
               } else {
                  class187 class187_4 = class235.method4265(ClientPacketProt.field2291, Client.data.field1313);
                  class187_4.outBuffer.writeByte(class209.method3945(string_1));
                  class187_4.outBuffer.writeNullTerminatedString(string_1);
                  Client.data.copy(class187_4);
               }
            }
         }
      }
   }

   final void method1771(String string_1) {
      if (string_1 != null) {
         Username username_3 = new Username(string_1, this.field1075);
         if (username_3.method5205()) {
            if (this.field1071.method5085(username_3)) {
               Client.field672 = Client.field673;
               class187 class187_4 = class235.method4265(ClientPacketProt.field2231, Client.data.field1313);
               class187_4.outBuffer.writeByte(class209.method3945(string_1));
               class187_4.outBuffer.writeNullTerminatedString(string_1);
               Client.data.copy(class187_4);
            }

            class2.method28();
         }
      }
   }

   final void method1780(short s_1) {
      this.field1076 = 0;
      this.field1070.method5096();
      this.field1071.method5096();
   }

   final void method1762(byte b_1) {
      for (class286 class286_2 = (class286) this.field1070.field3642.method4922(); class286_2 != null; class286_2 = (class286) this.field1070.field3642.method4923()) {
         if ((long)class286_2.field3661 < TimeUtils.getAdjustedTimeMillis() / 1000L - 5L) {
            if (class286_2.field3663 > 0) {
               class62.method1132(5, "", class286_2.field3662 + " has logged in.");
            }

            if (class286_2.field3663 == 0) {
               class62.method1132(5, "", class286_2.field3662 + " has logged out.");
            }

            class286_2.method3602();
         }
      }

   }

   public static int method1819(int i_0, int i_1) {
      int i_3;
      if (i_1 > i_0) {
         i_3 = i_0;
         i_0 = i_1;
         i_1 = i_3;
      }

      while (i_1 != 0) {
         i_3 = i_0 % i_1;
         i_0 = i_1;
         i_1 = i_3;
      }

      return i_0;
   }

   public static String method1820(byte[] bytes_0, int i_1, int i_2) {
      char[] arr_4 = new char[i_2];
      int i_5 = 0;

      for (int i_6 = 0; i_6 < i_2; i_6++) {
         int i_7 = bytes_0[i_6 + i_1] & 0xff;
         if (i_7 != 0) {
            if (i_7 >= 128 && i_7 < 160) {
               char var_8 = class288.field3667[i_7 - 128];
               if (var_8 == 0) {
                  var_8 = 63;
               }

               i_7 = var_8;
            }

            arr_4[i_5++] = (char)i_7;
         }
      }

      return new String(arr_4, 0, i_5);
   }

   public static int method1784(int i_0, int i_1) {
      return GCMonitor.method770(class128.field1750[i_0]);
   }

   final void method1768(String string_1, byte b_2) {
      if (string_1 != null) {
         Username username_3 = new Username(string_1, this.field1075);
         if (username_3.method5205()) {
            if (this.method1778()) {
               Object obj_10000 = null;
               String str_4 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
               class62.method1132(30, "", str_4);
            } else if (Client.localPlayer.field621.equals(username_3)) {
               class41.method737();
            } else if (this.isIgnored(username_3)) {
               Client.method1650(string_1);
            } else if (this.method1764(username_3, false)) {
               class31.method541(string_1);
            } else {
               class219.method4111(string_1);
            }
         }
      }
   }

}
