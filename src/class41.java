public class class41 {

   static int field359;
   public int field355;
   public class213 field357;
   public class213 field354;

   public class41(int i_1, class213 class213_2, class213 class213_3) {
      this.field355 = i_1;
      this.field357 = class213_2;
      this.field354 = class213_3;
   }

   static final void method737() {
      Object obj_10000 = null;
      String str_1 = "You can\'t add yourself to your own ignore list";
      class62.method1132(30, "", str_1);
   }

   static final void method736(PacketBuffer buffer3_0, int i_1, class66 class66_2, int i_3) {
      byte b_5 = -1;
      int i_6;
      int i_7;
      int i_9;
      int i_10;
      int i_13;
      if ((i_3 & 0x40) != 0) {
         i_6 = buffer3_0.readOffsetUnsignedByte();
         int i_8;
         int i_11;
         int i_12;
         if (i_6 > 0) {
            for (i_7 = 0; i_7 < i_6; i_7++) {
               i_9 = -1;
               i_10 = -1;
               i_11 = -1;
               i_8 = buffer3_0.readSmartInt();
               if (i_8 == 32767) {
                  i_8 = buffer3_0.readSmartInt();
                  i_10 = buffer3_0.readSmartInt();
                  i_9 = buffer3_0.readSmartInt();
                  i_11 = buffer3_0.readSmartInt();
               } else if (i_8 != 32766) {
                  i_10 = buffer3_0.readSmartInt();
               } else {
                  i_8 = -1;
               }

               i_12 = buffer3_0.readSmartInt();
               class66_2.method1657(i_8, i_10, i_9, i_11, Client.field881, i_12);
            }
         }

         i_7 = buffer3_0.readNegatedUnsignedByte();
         if (i_7 > 0) {
            for (i_8 = 0; i_8 < i_7; i_8++) {
               i_9 = buffer3_0.readSmartInt();
               i_10 = buffer3_0.readSmartInt();
               if (i_10 != 32767) {
                  i_11 = buffer3_0.readSmartInt();
                  i_12 = buffer3_0.readOffsetUnsignedByte();
                  i_13 = i_10 > 0 ? buffer3_0.readUnsignedByte() : i_12;
                  class66_2.method1655(i_9, Client.field881, i_10, i_11, i_12, i_13, (byte) 52);
               } else {
                  class66_2.method1659(i_9);
               }
            }
         }
      }

      if ((i_3 & 0x200) != 0) {
         class66_2.field986 = buffer3_0.readShortWithOffset2();
         i_6 = buffer3_0.readIntCustomOrder2();
         class66_2.field990 = i_6 >> 16;
         class66_2.field989 = (i_6 & 0xffff) + Client.field881;
         class66_2.field987 = 0;
         class66_2.field988 = 0;
         if (class66_2.field989 > Client.field881) {
            class66_2.field987 = -1;
         }

         if (class66_2.field986 == 65535) {
            class66_2.field986 = -1;
         }
      }

      if ((i_3 & 0x1000) != 0) {
         b_5 = buffer3_0.readOffsetByte();
      }

      if ((i_3 & 0x400) != 0) {
         class66_2.field991 = buffer3_0.readInvertedByte();
         class66_2.field993 = buffer3_0.readOffsetByte();
         class66_2.field992 = buffer3_0.readOffsetByte();
         class66_2.field983 = buffer3_0.readInvertedByte();
         class66_2.field995 = buffer3_0.readShortWithOffset() + Client.field881;
         class66_2.field996 = buffer3_0.readShortLittleEndian() + Client.field881;
         class66_2.field997 = buffer3_0.readUnsignedShort();
         if (class66_2.field638) {
            class66_2.field991 += class66_2.field639;
            class66_2.field993 += class66_2.field640;
            class66_2.field992 += class66_2.field639;
            class66_2.field983 += class66_2.field640;
            class66_2.field1003 = 0;
         } else {
            class66_2.field991 += class66_2.field994[0];
            class66_2.field993 += class66_2.field962[0];
            class66_2.field992 += class66_2.field994[0];
            class66_2.field983 += class66_2.field962[0];
            class66_2.field1003 = 1;
         }

         class66_2.field1008 = 0;
      }

      if ((i_3 & 0x20) != 0) {
         class66_2.field977 = buffer3_0.readNullTerminatedString();
         if (class66_2.field977.charAt(0) == 126) {
            class66_2.field977 = class66_2.field977.substring(1);
            class62.method1132(2, class66_2.field621.method5197(), class66_2.field977);
         } else if (class66_2 == Client.localPlayer) {
            class62.method1132(2, class66_2.field621.method5197(), class66_2.field977);
         }

         class66_2.field963 = false;
         class66_2.field966 = 0;
         class66_2.field982 = 0;
         class66_2.field1002 = 150;
      }

      if ((i_3 & 0x4) != 0) {
         class66_2.field976 = buffer3_0.readShortLittleEndian();
         if (class66_2.field1003 == 0) {
            class66_2.field1000 = class66_2.field976;
            class66_2.field976 = -1;
         }
      }

      if ((i_3 & 0x1) != 0) {
         i_6 = buffer3_0.readInvertedUnsignedByte();
         byte[] bytes_14 = new byte[i_6];
         ByteBuffer class300_15 = new ByteBuffer(bytes_14);
         buffer3_0.readBytesWithOffset(bytes_14, 0, i_6);
         class89.field1254[i_1] = class300_15;
         class66_2.method1179(class300_15);
      }

      if ((i_3 & 0x2) != 0) {
         class66_2.field975 = buffer3_0.readShortWithOffset();
         if (class66_2.field975 == 65535) {
            class66_2.field975 = -1;
         }
      }

      if ((i_3 & 0x800) != 0) {
         class89.field1250[i_1] = buffer3_0.readOffsetByte();
      }

      if ((i_3 & 0x10) != 0) {
         i_6 = buffer3_0.readShortWithOffset();
         GameState gameState_20 = (GameState) MemoryManager.findById(PriorityComparator.getGameStates(), buffer3_0.readUnsignedByte());
         boolean bool_18 = buffer3_0.readNegatedUnsignedByte() == 1;
         i_9 = buffer3_0.readUnsignedByte();
         i_10 = buffer3_0.position;
         if (class66_2.field621 != null && class66_2.field613 != null) {
            boolean bool_19 = false;
            if (gameState_20.field3092 && class58.field546.isIgnored(class66_2.field621)) {
               bool_19 = true;
            }

            if (!bool_19 && Client.field767 == 0 && !class66_2.field628) {
               class89.field1264.position = 0;
               buffer3_0.readBytes(class89.field1264.buffer, 0, i_9);
               class89.field1264.position = 0;
               String string_16 = AbstractFont.escapeBrackets(class1.method17(class311.method5898(class89.field1264, (byte) 23), (byte) -16));
               class66_2.field977 = string_16.trim();
               class66_2.field966 = i_6 >> 8;
               class66_2.field982 = i_6 & 0xff;
               class66_2.field1002 = 150;
               class66_2.field963 = bool_18;
               class66_2.field998 = class66_2 != Client.localPlayer && gameState_20.field3092 && "" != Client.field762 && string_16.toLowerCase().indexOf(Client.field762) == -1;
               if (gameState_20.field3091) {
                  i_13 = bool_18 ? 91 : 1;
               } else {
                  i_13 = bool_18 ? 90 : 2;
               }

               if (gameState_20.modIcon != -1) {
                  class62.method1132(i_13, AbstractWorldMapData.iconTag(gameState_20.modIcon) + class66_2.field621.method5197(), string_16);
               } else {
                  class62.method1132(i_13, class66_2.field621.method5197(), string_16);
               }
            }
         }

         buffer3_0.position = i_10 + i_9;
      }

      if ((i_3 & 0x100) != 0) {
         for (i_6 = 0; i_6 < 3; i_6++) {
            class66_2.field619[i_6] = buffer3_0.readNullTerminatedString();
         }
      }

      if ((i_3 & 0x80) != 0) {
         i_6 = buffer3_0.readUnsignedShort();
         if (i_6 == 65535) {
            i_6 = -1;
         }

         i_7 = buffer3_0.readUnsignedByte();
         class63.method1139(class66_2, i_6, i_7, (byte) -124);
      }

      if (class66_2.field638) {
         if (b_5 == 127) {
            class66_2.method1205(class66_2.field639, class66_2.field640, 1369099765);
         } else {
            byte b_17;
            if (b_5 != -1) {
               b_17 = b_5;
            } else {
               b_17 = class89.field1250[i_1];
            }

            class66_2.method1189(class66_2.field639, class66_2.field640, b_17);
         }
      }

   }

}
