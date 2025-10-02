import java.awt.Component;
import java.io.File;
import java.io.IOException;

public class class18 extends class34 {

   static class217 field127;
   static class41 field121;
   final int field125;
   final class28 field122;
   final int field123;
   final int field124;

   class18(class213 class213_1, class213 class213_2, int i_3, class28 class28_4) {
      super(class213_1, class213_2);
      this.field125 = i_3;
      this.field122 = class28_4;
      class241 class241_5 = class222.method4118(this.vmethod597(1142709906));
      class325 class325_6 = class241_5.method4379();
      if (class325_6 != null) {
         this.field123 = class325_6.field3899;
         this.field124 = class325_6.field3900;
      } else {
         this.field123 = 0;
         this.field124 = 0;
      }

   }

   class28 vmethod575(int i_1) {
      return this.field122;
   }

   public int vmethod597(int i_1) {
      return this.field125;
   }

   int vmethod577(byte b_1) {
      return this.field123;
   }

   int vmethod593(byte b_1) {
      return this.field124;
   }

   static void method200(Component component_0, byte b_1) {
      component_0.addMouseListener(class54.field479);
      component_0.addMouseMotionListener(class54.field479);
      component_0.addFocusListener(class54.field479);
   }

   public static class343 method207(String string_0, String string_1, boolean bool_2, int i_3) {
      File file_4 = new File(class1.field2, "preferences" + string_0 + ".dat");
      if (file_4.exists()) {
         try {
            class343 class343_11 = new class343(file_4, "rw", 10000L);
            return class343_11;
         } catch (IOException ioexception_10) {
            ;
         }
      }

      String str_5 = "";
      if (class119.field1539 == 33) {
         str_5 = "_rc";
      } else if (class119.field1539 == 34) {
         str_5 = "_wip";
      }

      File file_6 = new File(class228.field3095, "jagex_" + string_1 + "_preferences" + string_0 + str_5 + ".dat");
      class343 class343_7;
      if (!bool_2 && file_6.exists()) {
         try {
            class343_7 = new class343(file_6, "rw", 10000L);
            return class343_7;
         } catch (IOException ioexception_9) {
            ;
         }
      }

      try {
         class343_7 = new class343(file_4, "rw", 10000L);
         return class343_7;
      } catch (IOException ioexception_8) {
         throw new RuntimeException();
      }
   }

   public static class249 method209(int i_0, byte b_1) {
      class249 class249_2 = (class249) class249.field3301.method3320((long)i_0);
      if (class249_2 != null) {
         return class249_2;
      } else {
         byte[] bytes_3 = class249.field3307.method4144(11, i_0);
         class249_2 = new class249();
         if (bytes_3 != null) {
            class249_2.method4497(new ByteBuffer(bytes_3), (byte) -1);
         }

         class249_2.method4496((byte) -67);
         class249.field3301.method3322(class249_2, (long)i_0);
         return class249_2;
      }
   }

   static void method210(class299 class299_0, int i_1, int i_2) {
      boolean bool_3 = class299_0.method5445(1) == 1;
      if (bool_3) {
         class89.field1256[++class89.field1262 - 1] = i_1;
      }

      int i_4 = class299_0.method5445(2);
      class66 class66_5 = client.field909[i_1];
      if (i_4 == 0) {
         if (bool_3) {
            class66_5.field638 = false;
         } else if (client.field770 == i_1) {
            throw new RuntimeException();
         } else {
            class89.field1253[i_1] = (class66_5.field629 << 28) + (class1.field1 + class66_5.field962[0] >> 13) + (class196.field2389 + class66_5.field994[0] >> 13 << 14);
            if (class66_5.field976 != -1) {
               class89.field1260[i_1] = class66_5.field976;
            } else {
               class89.field1260[i_1] = class66_5.field1000;
            }

            class89.field1261[i_1] = class66_5.field975;
            client.field909[i_1] = null;
            if (class299_0.method5445(1) != 0) {
               class226.method4123(class299_0, i_1, -352047926);
            }

         }
      } else {
         int i_6;
         int i_7;
         int i_8;
         if (i_4 == 1) {
            i_6 = class299_0.method5445(3);
            i_7 = class66_5.field994[0];
            i_8 = class66_5.field962[0];
            if (i_6 == 0) {
               --i_7;
               --i_8;
            } else if (i_6 == 1) {
               --i_8;
            } else if (i_6 == 2) {
               ++i_7;
               --i_8;
            } else if (i_6 == 3) {
               --i_7;
            } else if (i_6 == 4) {
               ++i_7;
            } else if (i_6 == 5) {
               --i_7;
               ++i_8;
            } else if (i_6 == 6) {
               ++i_8;
            } else if (i_6 == 7) {
               ++i_7;
               ++i_8;
            }

            if (client.field770 == i_1 && (class66_5.field1005 < 1536 || class66_5.field949 < 1536 || class66_5.field1005 >= 11776 || class66_5.field949 >= 11776)) {
               class66_5.method1205(i_7, i_8, 1226353499);
               class66_5.field638 = false;
            } else if (bool_3) {
               class66_5.field638 = true;
               class66_5.field639 = i_7;
               class66_5.field640 = i_8;
            } else {
               class66_5.field638 = false;
               class66_5.method1189(i_7, i_8, class89.field1250[i_1], (short) -16867);
            }

         } else if (i_4 == 2) {
            i_6 = class299_0.method5445(4);
            i_7 = class66_5.field994[0];
            i_8 = class66_5.field962[0];
            if (i_6 == 0) {
               i_7 -= 2;
               i_8 -= 2;
            } else if (i_6 == 1) {
               --i_7;
               i_8 -= 2;
            } else if (i_6 == 2) {
               i_8 -= 2;
            } else if (i_6 == 3) {
               ++i_7;
               i_8 -= 2;
            } else if (i_6 == 4) {
               i_7 += 2;
               i_8 -= 2;
            } else if (i_6 == 5) {
               i_7 -= 2;
               --i_8;
            } else if (i_6 == 6) {
               i_7 += 2;
               --i_8;
            } else if (i_6 == 7) {
               i_7 -= 2;
            } else if (i_6 == 8) {
               i_7 += 2;
            } else if (i_6 == 9) {
               i_7 -= 2;
               ++i_8;
            } else if (i_6 == 10) {
               i_7 += 2;
               ++i_8;
            } else if (i_6 == 11) {
               i_7 -= 2;
               i_8 += 2;
            } else if (i_6 == 12) {
               --i_7;
               i_8 += 2;
            } else if (i_6 == 13) {
               i_8 += 2;
            } else if (i_6 == 14) {
               ++i_7;
               i_8 += 2;
            } else if (i_6 == 15) {
               i_7 += 2;
               i_8 += 2;
            }

            if (client.field770 != i_1 || class66_5.field1005 >= 1536 && class66_5.field949 >= 1536 && class66_5.field1005 < 11776 && class66_5.field949 < 11776) {
               if (bool_3) {
                  class66_5.field638 = true;
                  class66_5.field639 = i_7;
                  class66_5.field640 = i_8;
               } else {
                  class66_5.field638 = false;
                  class66_5.method1189(i_7, i_8, class89.field1250[i_1], (short) -26870);
               }
            } else {
               class66_5.method1205(i_7, i_8, 1143943897);
               class66_5.field638 = false;
            }

         } else {
            i_6 = class299_0.method5445(1);
            int i_9;
            int i_10;
            int i_11;
            int i_12;
            if (i_6 == 0) {
               i_7 = class299_0.method5445(12);
               i_8 = i_7 >> 10;
               i_9 = i_7 >> 5 & 0x1f;
               if (i_9 > 15) {
                  i_9 -= 32;
               }

               i_10 = i_7 & 0x1f;
               if (i_10 > 15) {
                  i_10 -= 32;
               }

               i_11 = i_9 + class66_5.field994[0];
               i_12 = i_10 + class66_5.field962[0];
               if (client.field770 == i_1 && (class66_5.field1005 < 1536 || class66_5.field949 < 1536 || class66_5.field1005 >= 11776 || class66_5.field949 >= 11776)) {
                  class66_5.method1205(i_11, i_12, 1788073097);
                  class66_5.field638 = false;
               } else if (bool_3) {
                  class66_5.field638 = true;
                  class66_5.field639 = i_11;
                  class66_5.field640 = i_12;
               } else {
                  class66_5.field638 = false;
                  class66_5.method1189(i_11, i_12, class89.field1250[i_1], (short) -30351);
               }

               class66_5.field629 = (byte)(i_8 + class66_5.field629 & 0x3);
               if (client.field770 == i_1) {
                  class42.field372 = class66_5.field629;
               }

            } else {
               i_7 = class299_0.method5445(30);
               i_8 = i_7 >> 28;
               i_9 = i_7 >> 14 & 0x3fff;
               i_10 = i_7 & 0x3fff;
               i_11 = (i_9 + class196.field2389 + class66_5.field994[0] & 0x3fff) - class196.field2389;
               i_12 = (i_10 + class1.field1 + class66_5.field962[0] & 0x3fff) - class1.field1;
               if (client.field770 == i_1 && (class66_5.field1005 < 1536 || class66_5.field949 < 1536 || class66_5.field1005 >= 11776 || class66_5.field949 >= 11776)) {
                  class66_5.method1205(i_11, i_12, 1045541896);
                  class66_5.field638 = false;
               } else if (bool_3) {
                  class66_5.field638 = true;
                  class66_5.field639 = i_11;
                  class66_5.field640 = i_12;
               } else {
                  class66_5.field638 = false;
                  class66_5.method1189(i_11, i_12, class89.field1250[i_1], (short) -25505);
               }

               class66_5.field629 = (byte)(i_8 + class66_5.field629 & 0x3);
               if (client.field770 == i_1) {
                  class42.field372 = class66_5.field629;
               }

            }
         }
      }
   }

   static final void method205(class217 class217_0, int i_1, int i_2, int i_3, byte b_4) {
      class211 class211_5 = class217_0.method4040(false, (byte) 0);
      if (class211_5 != null) {
         if (client.field652 < 3) {
            class64.field607.method6140(i_1, i_2, class211_5.field2519, class211_5.field2522, 25, 25, client.field722, 256, class211_5.field2521, class211_5.field2520);
         } else {
            class321.method6016(i_1, i_2, 0, class211_5.field2521, class211_5.field2520);
         }

      }
   }

   static String method194(ByteBuffer class300_0, int i_1, int i_2) {
      try {
         int i_3 = class300_0.readSmartInt();
         if (i_3 > i_1) {
            i_3 = i_1;
         }

         byte[] bytes_4 = new byte[i_3];
         class300_0.position += class210.field2515.method3944(class300_0.buffer, class300_0.position, bytes_4, 0, i_3, 2122202814);
         String string_5 = class74.method1820(bytes_4, 0, i_3, (byte) 90);
         return string_5;
      } catch (Exception exception_7) {
         return "Cabbage";
      }
   }

   static final void method208(class217 class217_0, int i_1, int i_2, int i_3) {
      if (client.field652 == 0 || client.field652 == 3) {
         if (!client.field674 && (class54.field493 == 1 || !class46.field413 && class54.field493 == 4)) {
            class211 class211_4 = class217_0.method4040(true, (byte) 0);
            if (class211_4 == null) {
               return;
            }

            int i_5 = class54.field483 - i_1;
            int i_6 = class54.field495 - i_2;
            if (class211_4.method3959(i_5, i_6, (short) 25393)) {
               i_5 -= class211_4.field2519 / 2;
               i_6 -= class211_4.field2522 / 2;
               int i_7 = client.field722 & 0x7ff;
               int i_8 = class130.field1787[i_7];
               int i_9 = class130.field1784[i_7];
               int i_10 = i_5 * i_9 + i_6 * i_8 >> 11;
               int i_11 = i_6 * i_9 - i_8 * i_5 >> 11;
               int i_12 = i_10 + client.field657.field1005 >> 7;
               int i_13 = client.field657.field949 - i_11 >> 7;
               class187 class187_14 = class235.method4265(class183.field2262, client.field880.field1313, 1775123545);
               class187_14.field2333.writeByte(18);
               class187_14.field2333.writeShortWithOffset2(i_13 + class1.field1);
               class187_14.field2333.writeShortWithOffset2(i_12 + class196.field2389);
               class187_14.field2333.writeOffsetByte(class45.field395[82] ? (class45.field395[81] ? 2 : 1) : 0);
               class187_14.field2333.writeByte(i_5);
               class187_14.field2333.writeByte(i_6);
               class187_14.field2333.writeShortBigEndian(client.field722);
               class187_14.field2333.writeByte(57);
               class187_14.field2333.writeByte(0);
               class187_14.field2333.writeByte(0);
               class187_14.field2333.writeByte(89);
               class187_14.field2333.writeShortBigEndian(client.field657.field1005);
               class187_14.field2333.writeShortBigEndian(client.field657.field949);
               class187_14.field2333.writeByte(63);
               client.field880.copy(class187_14);
               client.field885 = i_12;
               client.field842 = i_13;
            }
         }

      }
   }

}
