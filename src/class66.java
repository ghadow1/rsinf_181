import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

public final class class66 extends class69 {

   int field633;
   int field624;
   int field623;
   int field620;
   int field629;
   int field639;
   int field640;
   int field637;
   int field627;
   int field625;
   int field612;
   int field630;
   int field635 = -1;
   int field615 = -1;
   String[] field619 = new String[3];
   int field618;
   int field617;
   int field614;
   int field622;
   boolean field634;
   int field632;
   boolean field628;
   class281 field636;
   class281 field631;
   boolean field638;
   class127 field626;
   Username field621;
   class214 field613;

   class66() {
      for (int i_1 = 0; i_1 < 3; i_1++) {
         this.field619[i_1] = "";
      }

      this.field618 = 0;
      this.field617 = 0;
      this.field614 = 0;
      this.field622 = 0;
      this.field634 = false;
      this.field632 = 0;
      this.field628 = false;
      this.field636 = class281.field3637;
      this.field631 = class281.field3637;
      this.field638 = false;
   }

   protected final class127 vmethod3253(int i_1) {
      if (this.field613 == null) {
         return null;
      } else {
         class258 class258_2 = super.field981 != -1 && super.field984 == 0 ? class7.method81(super.field981, (byte) 1) : null;
         class258 class258_3 = super.field978 != -1 && !this.field634 && (super.field978 != super.field1004 || class258_2 == null) ? class7.method81(super.field978, (byte) 1) : null;
         class127 class127_4 = this.field613.method3997(class258_2, super.field951, class258_3, super.field979);
         if (class127_4 == null) {
            return null;
         } else {
            class127_4.method2899();
            super.field999 = class127_4.height;
            class127 class127_5;
            class127[] arr_6;
            if (!this.field634 && super.field986 != -1 && super.field987 != -1) {
               class127_5 = class201.method3887(super.field986, (byte) 43).method4406(super.field987, 1645713423);
               if (class127_5 != null) {
                  class127_5.method2901(0, -super.field990, 0);
                  arr_6 = new class127[] {class127_4, class127_5};
                  class127_4 = new class127(arr_6, 2);
               }
            }

            if (!this.field634 && this.field626 != null) {
               if (Client.field881 >= this.field622) {
                  this.field626 = null;
               }

               if (Client.field881 >= this.field614 && Client.field881 < this.field622) {
                  class127_5 = this.field626;
                  class127_5.method2901(this.field633 - super.x, this.field624 - this.field623, this.field620 - super.y);
                  if (super.field1000 == 512) {
                     class127_5.method2869();
                     class127_5.method2869();
                     class127_5.method2869();
                  } else if (super.field1000 == 1024) {
                     class127_5.method2869();
                     class127_5.method2869();
                  } else if (super.field1000 == 1536) {
                     class127_5.method2869();
                  }

                  arr_6 = new class127[] {class127_4, class127_5};
                  class127_4 = new class127(arr_6, 2);
                  if (super.field1000 == 512) {
                     class127_5.method2869();
                  } else if (super.field1000 == 1024) {
                     class127_5.method2869();
                     class127_5.method2869();
                  } else if (super.field1000 == 1536) {
                     class127_5.method2869();
                     class127_5.method2869();
                     class127_5.method2869();
                  }

                  class127_5.method2901(super.x - this.field633, this.field623 - this.field624, super.y - this.field620);
               }
            }

            class127_4.field1730 = true;
            return class127_4;
         }
      }
   }

   void method1186(int i_1) {
      this.field631 = class46.field410 != null && class46.field410.method5081(this.field621) ? class281.field3638 : class281.field3639;
   }

   void method1220(int i_1) {
      this.field636 = class58.field546.method1781(this.field621, 1053718867) ? class281.field3638 : class281.field3639;
   }

   void method1205(int i_1, int i_2, int i_3) {
      super.field1003 = 0;
      super.field1008 = 0;
      super.field1007 = 0;
      super.field994[0] = i_1;
      super.field962[0] = i_2;
      int i_4 = this.method1187();
      super.x = super.field994[0] * 128 + i_4 * 64;
      super.y = i_4 * 64 + super.field962[0] * 128;
   }

   int method1187() {
      return this.field613 != null && this.field613.field2532 != -1 ? GameApplet.method1005(this.field613.field2532).field3469 : 1;
   }

   void method1182() {
      this.field636 = class281.field3637;
   }

   final void method1191(int i_1, int i_2, byte b_3) {
      if (super.field1003 < 9) {
         ++super.field1003;
      }

      for (int i_5 = super.field1003; i_5 > 0; --i_5) {
         super.field994[i_5] = super.field994[i_5 - 1];
         super.field962[i_5] = super.field962[i_5 - 1];
         super.field1006[i_5] = super.field1006[i_5 - 1];
      }

      super.field994[0] = i_1;
      super.field962[0] = i_2;
      super.field1006[0] = b_3;
   }

   void method1185() {
      this.field631 = class281.field3637;
   }

   final boolean vmethod1965() {
      return this.field613 != null;
   }

   final void method1189(int i_1, int i_2, byte b_3) {
      if (super.field981 != -1 && class7.method81(super.field981, (byte) 1).field3532 == 1) {
         super.field981 = -1;
      }

      super.field976 = -1;
      if (i_1 >= 0 && i_1 < 104 && i_2 >= 0 && i_2 < 104) {
         if (super.field994[0] >= 0 && super.field994[0] < 104 && super.field962[0] >= 0 && super.field962[0] < 104) {
            if (b_3 == 2) {
               Widget.method4056(this, i_1, i_2, (byte) 2);
            }

            this.method1191(i_1, i_2, b_3);
         } else {
            this.method1205(i_1, i_2, 1558444576);
         }
      } else {
         this.method1205(i_1, i_2, 1600132142);
      }

   }

   final void method1179(ByteBuffer class300_1) {
      class300_1.position = 0;
      int i_3 = class300_1.readUnsignedByte();
      this.field635 = class300_1.readSignedByte();
      this.field615 = class300_1.readSignedByte();
      int i_4 = -1;
      this.field632 = 0;
      int[] ints_5 = new int[12];

      int i_7;
      int i_8;
      for (int i_6 = 0; i_6 < 12; i_6++) {
         i_7 = class300_1.readUnsignedByte();
         if (i_7 == 0) {
            ints_5[i_6] = 0;
         } else {
            i_8 = class300_1.readUnsignedByte();
            ints_5[i_6] = i_8 + (i_7 << 8);
            if (i_6 == 0 && ints_5[0] == 65535) {
               i_4 = class300_1.readUnsignedShort();
               break;
            }

            if (ints_5[i_6] >= 512) {
               int i_9 = class26.method404(ints_5[i_6] - 512).field3450;
               if (i_9 != 0) {
                  this.field632 = i_9;
               }
            }
         }
      }

      int[] ints_10 = new int[5];

      for (i_7 = 0; i_7 < 5; i_7++) {
         i_8 = class300_1.readUnsignedByte();
         if (i_8 < 0 || i_8 >= class247.field3291[i_7].length) {
            i_8 = 0;
         }

         ints_10[i_7] = i_8;
      }

      super.field1004 = class300_1.readUnsignedShort();
      if (super.field1004 == 65535) {
         super.field1004 = -1;
      }

      super.field955 = class300_1.readUnsignedShort();
      if (super.field955 == 65535) {
         super.field955 = -1;
      }

      super.field956 = super.field955;
      super.field957 = class300_1.readUnsignedShort();
      if (super.field957 == 65535) {
         super.field957 = -1;
      }

      super.field958 = class300_1.readUnsignedShort();
      if (super.field958 == 65535) {
         super.field958 = -1;
      }

      super.field959 = class300_1.readUnsignedShort();
      if (super.field959 == 65535) {
         super.field959 = -1;
      }

      super.field960 = class300_1.readUnsignedShort();
      if (super.field960 == 65535) {
         super.field960 = -1;
      }

      super.field961 = class300_1.readUnsignedShort();
      if (super.field961 == 65535) {
         super.field961 = -1;
      }

      this.field621 = new Username(class300_1.readNullTerminatedString(), FontName.loginType);
      this.method1182();
      this.method1185();
      if (this == Client.localPlayer) {
         class10.field69 = this.field621.method5197();
      }

      this.field618 = class300_1.readUnsignedByte();
      this.field617 = class300_1.readUnsignedShort();
      this.field628 = class300_1.readUnsignedByte() == 1;
      if (Client.field703 == 0 && Client.field890 >= 2) {
         this.field628 = false;
      }

      if (this.field613 == null) {
         this.field613 = new class214();
      }

      this.field613.method4009(ints_5, ints_10, i_3 == 1, i_4, -650970656);
   }

   boolean method1181(int i_1) {
      if (this.field636 == class281.field3637) {
         this.method1220(1998050438);
      }

      return this.field636 == class281.field3638;
   }

   boolean method1184(byte b_1) {
      if (this.field631 == class281.field3637) {
         this.method1186(-1972244682);
      }

      return this.field631 == class281.field3638;
   }

   static final void method1203(int i_0) {
      int[] ints_1 = class89.field1257;

      int i_2;
      for (i_2 = 0; i_2 < class89.field1255; i_2++) {
         class66 class66_3 = Client.field909[ints_1[i_2]];
         if (class66_3 != null && class66_3.field1002 > 0) {
            --class66_3.field1002;
            if (class66_3.field1002 == 0) {
               class66_3.field977 = null;
            }
         }
      }

      for (i_2 = 0; i_2 < Client.npcCount; i_2++) {
         int i_5 = Client.npcIndices[i_2];
         NPC NPC_4 = Client.npcs[i_5];
         if (NPC_4 != null && NPC_4.field1002 > 0) {
            --NPC_4.field1002;
            if (NPC_4.field1002 == 0) {
               NPC_4.field977 = null;
            }
         }
      }

   }

   static boolean method1226(String string_0, int i_1, String string_2, int i_3) {
      if (i_1 == 0) {
         try {
            if (!class51.field434.startsWith("win")) {
               throw new Exception();
            } else if (!string_0.startsWith("http://") && !string_0.startsWith("https://")) {
               throw new Exception();
            } else {
               String str_12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for (int i_5 = 0; i_5 < string_0.length(); i_5++) {
                  if (str_12.indexOf(string_0.charAt(i_5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string_0 + "\"");
               return true;
            }
         } catch (Throwable throwable_6) {
            return false;
         }
      } else if (i_1 == 1) {
         try {
            Object object_11 = class47.method806(class51.field437, string_2, new Object[] {(new URL(class51.field437.getCodeBase(), string_0)).toString()});
            return object_11 != null;
         } catch (Throwable throwable_7) {
            return false;
         }
      } else if (i_1 == 2) {
         try {
            class51.field437.getAppletContext().showDocument(new URL(class51.field437.getCodeBase(), string_0), "_blank");
            return true;
         } catch (Exception exception_8) {
            return false;
         }
      } else if (i_1 == 3) {
         try {
            Applet applet_4 = class51.field437;
            JSObject.getWindow(applet_4).call("loggedout", (Object[]) null);
         } catch (Throwable throwable_10) {
            ;
         }

         try {
            class51.field437.getAppletContext().showDocument(new URL(class51.field437.getCodeBase(), string_0), "_top");
            return true;
         } catch (Exception exception_9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

}
