import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class class73 {

   static String field1068;
   static int field1062 = 6;
   int field1064 = 1;
   String field1065 = null;
   boolean field1066 = false;
   LinkedHashMap field1067 = new LinkedHashMap();
   boolean field1060;
   boolean field1063;

   class73() {
      this.method1749(true, (short) -11262);
   }

   class73(ByteBuffer class300_1) {
      if (class300_1 != null && class300_1.buffer != null) {
         int i_2 = class300_1.readUnsignedByte();
         if (i_2 >= 0 && i_2 <= field1062) {
            if (class300_1.readUnsignedByte() == 1) {
               this.field1060 = true;
            }

            if (i_2 > 1) {
               this.field1063 = class300_1.readUnsignedByte() == 1;
            }

            if (i_2 > 3) {
               this.field1064 = class300_1.readUnsignedByte();
            }

            if (i_2 > 2) {
               int i_3 = class300_1.readUnsignedByte();

               for (int i_4 = 0; i_4 < i_3; i_4++) {
                  int i_5 = class300_1.readIntMedEndian();
                  int i_6 = class300_1.readIntMedEndian();
                  this.field1067.put(Integer.valueOf(i_5), Integer.valueOf(i_6));
               }
            }

            if (i_2 > 4) {
               this.field1065 = class300_1.readNullableString();
            }

            if (i_2 > 5) {
               this.field1066 = class300_1.readBoolean();
            }
         } else {
            this.method1749(true, (short) -31921);
         }
      } else {
         this.method1749(true, (short) -25325);
      }

   }

   void method1749(boolean bool_1, short s_2) {
   }

   ByteBuffer method1746(int i_1) {
      ByteBuffer class300_2 = new ByteBuffer(100);
      class300_2.writeByte(field1062);
      class300_2.writeByte(this.field1060 ? 1 : 0);
      class300_2.writeByte(this.field1063 ? 1 : 0);
      class300_2.writeByte(this.field1064);
      class300_2.writeByte(this.field1067.size());
      Iterator iterator_3 = this.field1067.entrySet().iterator();

      while (iterator_3.hasNext()) {
         Entry map$entry_4 = (Entry) iterator_3.next();
         class300_2.writeIntBigEndian(((Integer) map$entry_4.getKey()).intValue());
         class300_2.writeIntBigEndian(((Integer) map$entry_4.getValue()).intValue());
      }

      class300_2.writeNullTerminatedString(this.field1065 != null ? this.field1065 : "");
      class300_2.writeBoolean(this.field1066);
      return class300_2;
   }

   public static String method1755(byte[] bytes_0, int i_1, int i_2, int i_3) {
      char[] arr_4 = new char[i_2];
      int i_5 = 0;
      int i_6 = i_1;

      int i_9;
      for (int i_7 = i_2 + i_1; i_6 < i_7; arr_4[i_5++] = (char)i_9) {
         int i_8 = bytes_0[i_6++] & 0xff;
         if (i_8 < 128) {
            if (i_8 == 0) {
               i_9 = 65533;
            } else {
               i_9 = i_8;
            }
         } else if (i_8 < 192) {
            i_9 = 65533;
         } else if (i_8 < 224) {
            if (i_6 < i_7 && (bytes_0[i_6] & 0xc0) == 128) {
               i_9 = (i_8 & 0x1f) << 6 | bytes_0[i_6++] & 0x3f;
               if (i_9 < 128) {
                  i_9 = 65533;
               }
            } else {
               i_9 = 65533;
            }
         } else if (i_8 < 240) {
            if (i_6 + 1 < i_7 && (bytes_0[i_6] & 0xc0) == 128 && (bytes_0[i_6 + 1] & 0xc0) == 128) {
               i_9 = (i_8 & 0xf) << 12 | (bytes_0[i_6++] & 0x3f) << 6 | bytes_0[i_6++] & 0x3f;
               if (i_9 < 2048) {
                  i_9 = 65533;
               }
            } else {
               i_9 = 65533;
            }
         } else if (i_8 < 248) {
            if (i_6 + 2 < i_7 && (bytes_0[i_6] & 0xc0) == 128 && (bytes_0[i_6 + 1] & 0xc0) == 128 && (bytes_0[i_6 + 2] & 0xc0) == 128) {
               i_9 = (i_8 & 0x7) << 18 | (bytes_0[i_6++] & 0x3f) << 12 | (bytes_0[i_6++] & 0x3f) << 6 | bytes_0[i_6++] & 0x3f;
               if (i_9 >= 65536 && i_9 <= 1114111) {
                  i_9 = 65533;
               } else {
                  i_9 = 65533;
               }
            } else {
               i_9 = 65533;
            }
         } else {
            i_9 = 65533;
         }
      }

      return new String(arr_4, 0, i_5);
   }

   public static int method1757(int i_0, int i_1, byte b_2) {
      int i_3;
      for (i_3 = 0; i_1 > 0; --i_1) {
         i_3 = i_3 << 1 | i_0 & 0x1;
         i_0 >>>= 1;
      }

      return i_3;
   }

   static String method1756(int i_0, int i_1) {
      return "<col=" + Integer.toHexString(i_0) + ">";
   }

   static int method1753(int i_0, class92 class92_1, boolean bool_2, byte b_3) {
      if (i_0 == 5000) {
         class76.field1098[++class70.field1014 - 1] = Client.field907;
         return 1;
      } else if (i_0 == 5001) {
         class70.field1014 -= 3;
         Client.field907 = class76.field1098[class70.field1014];
         class226.field3072 = class171.method3530(class76.field1098[class70.field1014 + 1], 1440546072);
         if (class226.field3072 == null) {
            class226.field3072 = class310.field3816;
         }

         Client.field872 = class76.field1098[class70.field1014 + 2];
         class187 class187_19 = class235.method4265(class183.field2294, Client.field880.field1313, 1775123545);
         class187_19.outBuffer.writeByte(Client.field907);
         class187_19.outBuffer.writeByte(class226.field3072.field3815);
         class187_19.outBuffer.writeByte(Client.field872);
         Client.field880.copy(class187_19);
         return 1;
      } else {
         String string_4;
         int i_5;
         if (i_0 == 5002) {
            string_4 = class76.field1093[--class221.field2747];
            class70.field1014 -= 2;
            i_5 = class76.field1098[class70.field1014];
            int i_6 = class76.field1098[class70.field1014 + 1];
            class187 class187_7 = class235.method4265(class183.field2205, Client.field880.field1313, 1775123545);
            class187_7.outBuffer.writeByte(class209.method3945(string_4) + 2);
            class187_7.outBuffer.writeNullTerminatedString(string_4);
            class187_7.outBuffer.writeByte(i_5 - 1);
            class187_7.outBuffer.writeByte(i_6);
            Client.field880.copy(class187_7);
            return 1;
         } else {
            int i_11;
            if (i_0 == 5003) {
               class70.field1014 -= 2;
               i_11 = class76.field1098[class70.field1014];
               i_5 = class76.field1098[class70.field1014 + 1];
               class64 class64_16 = class87.method2049(i_11, i_5, 308740376);
               if (class64_16 != null) {
                  class76.field1098[++class70.field1014 - 1] = class64_16.field600;
                  class76.field1098[++class70.field1014 - 1] = class64_16.field598;
                  class76.field1093[++class221.field2747 - 1] = class64_16.field599 != null ? class64_16.field599 : "";
                  class76.field1093[++class221.field2747 - 1] = class64_16.field597 != null ? class64_16.field597 : "";
                  class76.field1093[++class221.field2747 - 1] = class64_16.field605 != null ? class64_16.field605 : "";
                  class76.field1098[++class70.field1014 - 1] = class64_16.method1144(1322141944) ? 1 : (class64_16.method1147(1146765519) ? 2 : 0);
               } else {
                  class76.field1098[++class70.field1014 - 1] = -1;
                  class76.field1098[++class70.field1014 - 1] = 0;
                  class76.field1093[++class221.field2747 - 1] = "";
                  class76.field1093[++class221.field2747 - 1] = "";
                  class76.field1093[++class221.field2747 - 1] = "";
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 5004) {
               i_11 = class76.field1098[--class70.field1014];
               class64 class64_17 = class23.method297(i_11, 377219115);
               if (class64_17 != null) {
                  class76.field1098[++class70.field1014 - 1] = class64_17.field602;
                  class76.field1098[++class70.field1014 - 1] = class64_17.field598;
                  class76.field1093[++class221.field2747 - 1] = class64_17.field599 != null ? class64_17.field599 : "";
                  class76.field1093[++class221.field2747 - 1] = class64_17.field597 != null ? class64_17.field597 : "";
                  class76.field1093[++class221.field2747 - 1] = class64_17.field605 != null ? class64_17.field605 : "";
                  class76.field1098[++class70.field1014 - 1] = class64_17.method1144(1470919339) ? 1 : (class64_17.method1147(376572179) ? 2 : 0);
               } else {
                  class76.field1098[++class70.field1014 - 1] = -1;
                  class76.field1098[++class70.field1014 - 1] = 0;
                  class76.field1093[++class221.field2747 - 1] = "";
                  class76.field1093[++class221.field2747 - 1] = "";
                  class76.field1093[++class221.field2747 - 1] = "";
                  class76.field1098[++class70.field1014 - 1] = 0;
               }

               return 1;
            } else if (i_0 == 5005) {
               if (class226.field3072 == null) {
                  class76.field1098[++class70.field1014 - 1] = -1;
               } else {
                  class76.field1098[++class70.field1014 - 1] = class226.field3072.field3815;
               }

               return 1;
            } else if (i_0 == 5008) {
               string_4 = class76.field1093[--class221.field2747];
               i_5 = class76.field1098[--class70.field1014];
               String string_15 = string_4.toLowerCase();
               byte b_18 = 0;
               if (string_15.startsWith("yellow:")) {
                  b_18 = 0;
                  string_4 = string_4.substring("yellow:".length());
               } else if (string_15.startsWith("red:")) {
                  b_18 = 1;
                  string_4 = string_4.substring("red:".length());
               } else if (string_15.startsWith("green:")) {
                  b_18 = 2;
                  string_4 = string_4.substring("green:".length());
               } else if (string_15.startsWith("cyan:")) {
                  b_18 = 3;
                  string_4 = string_4.substring("cyan:".length());
               } else if (string_15.startsWith("purple:")) {
                  b_18 = 4;
                  string_4 = string_4.substring("purple:".length());
               } else if (string_15.startsWith("white:")) {
                  b_18 = 5;
                  string_4 = string_4.substring("white:".length());
               } else if (string_15.startsWith("flash1:")) {
                  b_18 = 6;
                  string_4 = string_4.substring("flash1:".length());
               } else if (string_15.startsWith("flash2:")) {
                  b_18 = 7;
                  string_4 = string_4.substring("flash2:".length());
               } else if (string_15.startsWith("flash3:")) {
                  b_18 = 8;
                  string_4 = string_4.substring("flash3:".length());
               } else if (string_15.startsWith("glow1:")) {
                  b_18 = 9;
                  string_4 = string_4.substring("glow1:".length());
               } else if (string_15.startsWith("glow2:")) {
                  b_18 = 10;
                  string_4 = string_4.substring("glow2:".length());
               } else if (string_15.startsWith("glow3:")) {
                  b_18 = 11;
                  string_4 = string_4.substring("glow3:".length());
               } else if (class56.field528 != class190.field2348) {
                  if (string_15.startsWith("yellow:")) {
                     b_18 = 0;
                     string_4 = string_4.substring("yellow:".length());
                  } else if (string_15.startsWith("red:")) {
                     b_18 = 1;
                     string_4 = string_4.substring("red:".length());
                  } else if (string_15.startsWith("green:")) {
                     b_18 = 2;
                     string_4 = string_4.substring("green:".length());
                  } else if (string_15.startsWith("cyan:")) {
                     b_18 = 3;
                     string_4 = string_4.substring("cyan:".length());
                  } else if (string_15.startsWith("purple:")) {
                     b_18 = 4;
                     string_4 = string_4.substring("purple:".length());
                  } else if (string_15.startsWith("white:")) {
                     b_18 = 5;
                     string_4 = string_4.substring("white:".length());
                  } else if (string_15.startsWith("flash1:")) {
                     b_18 = 6;
                     string_4 = string_4.substring("flash1:".length());
                  } else if (string_15.startsWith("flash2:")) {
                     b_18 = 7;
                     string_4 = string_4.substring("flash2:".length());
                  } else if (string_15.startsWith("flash3:")) {
                     b_18 = 8;
                     string_4 = string_4.substring("flash3:".length());
                  } else if (string_15.startsWith("glow1:")) {
                     b_18 = 9;
                     string_4 = string_4.substring("glow1:".length());
                  } else if (string_15.startsWith("glow2:")) {
                     b_18 = 10;
                     string_4 = string_4.substring("glow2:".length());
                  } else if (string_15.startsWith("glow3:")) {
                     b_18 = 11;
                     string_4 = string_4.substring("glow3:".length());
                  }
               }

               string_15 = string_4.toLowerCase();
               byte b_8 = 0;
               if (string_15.startsWith("wave:")) {
                  b_8 = 1;
                  string_4 = string_4.substring("wave:".length());
               } else if (string_15.startsWith("wave2:")) {
                  b_8 = 2;
                  string_4 = string_4.substring("wave2:".length());
               } else if (string_15.startsWith("shake:")) {
                  b_8 = 3;
                  string_4 = string_4.substring("shake:".length());
               } else if (string_15.startsWith("scroll:")) {
                  b_8 = 4;
                  string_4 = string_4.substring("scroll:".length());
               } else if (string_15.startsWith("slide:")) {
                  b_8 = 5;
                  string_4 = string_4.substring("slide:".length());
               } else if (class190.field2348 != class56.field528) {
                  if (string_15.startsWith("wave:")) {
                     b_8 = 1;
                     string_4 = string_4.substring("wave:".length());
                  } else if (string_15.startsWith("wave2:")) {
                     b_8 = 2;
                     string_4 = string_4.substring("wave2:".length());
                  } else if (string_15.startsWith("shake:")) {
                     b_8 = 3;
                     string_4 = string_4.substring("shake:".length());
                  } else if (string_15.startsWith("scroll:")) {
                     b_8 = 4;
                     string_4 = string_4.substring("scroll:".length());
                  } else if (string_15.startsWith("slide:")) {
                     b_8 = 5;
                     string_4 = string_4.substring("slide:".length());
                  }
               }

               class187 class187_9 = class235.method4265(class183.MESSAGE_PUBLIC, Client.field880.field1313, 1775123545);
               class187_9.outBuffer.writeByte(0);
               int i_10 = class187_9.outBuffer.position;
               class187_9.outBuffer.writeByte(i_5);
               class187_9.outBuffer.writeByte(b_18);
               class187_9.outBuffer.writeByte(b_8);
               class132.method3063(class187_9.outBuffer, string_4, -730620007);
               class187_9.outBuffer.writeSizeAtOffset(class187_9.outBuffer.position - i_10);
               Client.field880.copy(class187_9);
               return 1;
            } else if (i_0 == 5009) {
               class221.field2747 -= 2;
               string_4 = class76.field1093[class221.field2747];
               String string_13 = class76.field1093[class221.field2747 + 1];
               class187 class187_12 = class235.method4265(class183.field2228, Client.field880.field1313, 1775123545);
               class187_12.outBuffer.writeShortBigEndian(0);
               int i_14 = class187_12.outBuffer.position;
               class187_12.outBuffer.writeNullTerminatedString(string_4);
               class132.method3063(class187_12.outBuffer, string_13, 845593608);
               class187_12.outBuffer.writeShortSizeAtOffset(class187_12.outBuffer.position - i_14);
               Client.field880.copy(class187_12);
               return 1;
            } else if (i_0 != 5015) {
               if (i_0 == 5016) {
                  class76.field1098[++class70.field1014 - 1] = Client.field872;
                  return 1;
               } else if (i_0 == 5017) {
                  i_11 = class76.field1098[--class70.field1014];
                  class76.field1098[++class70.field1014 - 1] = class72.method1744(i_11, -1877742024);
                  return 1;
               } else if (i_0 == 5018) {
                  i_11 = class76.field1098[--class70.field1014];
                  class76.field1098[++class70.field1014 - 1] = class196.method3686(i_11, (short) 17338);
                  return 1;
               } else if (i_0 == 5019) {
                  i_11 = class76.field1098[--class70.field1014];
                  class76.field1098[++class70.field1014 - 1] = class192.method3669(i_11);
                  return 1;
               } else if (i_0 == 5020) {
                  string_4 = class76.field1093[--class221.field2747];
                  class314.method5907(string_4, 199301274);
                  return 1;
               } else if (i_0 == 5021) {
                  Client.field762 = class76.field1093[--class221.field2747].toLowerCase().trim();
                  return 1;
               } else if (i_0 == 5022) {
                  class76.field1093[++class221.field2747 - 1] = Client.field762;
                  return 1;
               } else if (i_0 == 5023) {
                  string_4 = class76.field1093[--class221.field2747];
                  System.out.println(string_4);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (Client.field657 != null && Client.field657.field621 != null) {
                  string_4 = Client.field657.field621.method5197((byte) 56);
               } else {
                  string_4 = "";
               }

               class76.field1093[++class221.field2747 - 1] = string_4;
               return 1;
            }
         }
      }
   }

}
