public class class19 implements class37 {

   int field132;
   int field130;
   int field131;
   int field140;
   int field137;
   int field136;
   int field143;
   int field138;
   int field133;
   int field139;
   int field129;
   int field134;
   int field141;
   int field142;

   public boolean vmethod740(int i_1, int i_2, byte b_3) {
      return i_1 >= (this.field133 << 6) + (this.field139 << 3) && i_1 <= (this.field133 << 6) + (this.field129 << 3) + 7 && i_2 >= (this.field134 << 6) + (this.field141 << 3) && i_2 <= (this.field134 << 6) + (this.field142 << 3) + 7;
   }

   public boolean vmethod749(int i_1, int i_2, int i_3, int i_4) {
      return i_1 >= this.field132 && i_1 < this.field132 + this.field130 ? i_2 >= (this.field131 << 6) + (this.field140 << 3) && i_2 <= (this.field131 << 6) + (this.field137 << 3) + 7 && i_3 >= (this.field136 << 6) + (this.field143 << 3) && i_3 <= (this.field136 << 6) + (this.field138 << 3) + 7 : false;
   }

   public void vmethod738(item item_1, byte b_2) {
      if (item_1.field217 > this.field133) {
         item_1.field217 = this.field133;
      }

      if (item_1.field223 < this.field133) {
         item_1.field223 = this.field133;
      }

      if (item_1.field220 > this.field134) {
         item_1.field220 = this.field134;
      }

      if (item_1.field222 < this.field134) {
         item_1.field222 = this.field134;
      }

   }

   public class213 vmethod742(int i_1, int i_2, byte b_3) {
      if (!this.vmethod740(i_1, i_2, (byte) 72)) {
         return null;
      } else {
         int i_4 = this.field131 * 64 - this.field133 * 64 + (this.field140 * 8 - this.field139 * 8) + i_1;
         int i_5 = this.field136 * 64 - this.field134 * 64 + i_2 + (this.field143 * 8 - this.field141 * 8);
         return new class213(this.field132, i_4, i_5);
      }
   }

   public int[] vmethod760(int i_1, int i_2, int i_3, byte b_4) {
      if (!this.vmethod749(i_1, i_2, i_3, 735532283)) {
         return null;
      } else {
         int[] ints_5 = new int[] {this.field133 * 64 - this.field131 * 64 + i_2 + (this.field139 * 8 - this.field140 * 8), i_3 + (this.field134 * 64 - this.field136 * 64) + (this.field141 * 8 - this.field143 * 8)};
         return ints_5;
      }
   }

   public void vmethod743(ByteBuffer class300_1, int i_2) {
      this.field132 = class300_1.readUnsignedByte();
      this.field130 = class300_1.readUnsignedByte();
      this.field131 = class300_1.readUnsignedShort();
      this.field140 = class300_1.readUnsignedByte();
      this.field137 = class300_1.readUnsignedByte();
      this.field136 = class300_1.readUnsignedShort();
      this.field143 = class300_1.readUnsignedByte();
      this.field138 = class300_1.readUnsignedByte();
      this.field133 = class300_1.readUnsignedShort();
      this.field139 = class300_1.readUnsignedByte();
      this.field129 = class300_1.readUnsignedByte();
      this.field134 = class300_1.readUnsignedShort();
      this.field141 = class300_1.readUnsignedByte();
      this.field142 = class300_1.readUnsignedByte();
      this.method211();
   }

   void method211() {
   }

   public static int encodeStringCp1252(CharSequence charsequence_0, int i_1, int i_2, byte[] bytes_3, int i_4, byte b_5) {
      int i_6 = i_2 - i_1;

      for (int i_7 = 0; i_7 < i_6; i_7++) {
         char var_8 = charsequence_0.charAt(i_7 + i_1);
         if (var_8 > 0 && var_8 < 128 || var_8 >= 160 && var_8 <= 255) {
            bytes_3[i_7 + i_4] = (byte)var_8;
         } else if (var_8 == 8364) {
            bytes_3[i_7 + i_4] = -128;
         } else if (var_8 == 8218) {
            bytes_3[i_7 + i_4] = -126;
         } else if (var_8 == 402) {
            bytes_3[i_7 + i_4] = -125;
         } else if (var_8 == 8222) {
            bytes_3[i_7 + i_4] = -124;
         } else if (var_8 == 8230) {
            bytes_3[i_7 + i_4] = -123;
         } else if (var_8 == 8224) {
            bytes_3[i_7 + i_4] = -122;
         } else if (var_8 == 8225) {
            bytes_3[i_7 + i_4] = -121;
         } else if (var_8 == 710) {
            bytes_3[i_7 + i_4] = -120;
         } else if (var_8 == 8240) {
            bytes_3[i_7 + i_4] = -119;
         } else if (var_8 == 352) {
            bytes_3[i_7 + i_4] = -118;
         } else if (var_8 == 8249) {
            bytes_3[i_7 + i_4] = -117;
         } else if (var_8 == 338) {
            bytes_3[i_7 + i_4] = -116;
         } else if (var_8 == 381) {
            bytes_3[i_7 + i_4] = -114;
         } else if (var_8 == 8216) {
            bytes_3[i_7 + i_4] = -111;
         } else if (var_8 == 8217) {
            bytes_3[i_7 + i_4] = -110;
         } else if (var_8 == 8220) {
            bytes_3[i_7 + i_4] = -109;
         } else if (var_8 == 8221) {
            bytes_3[i_7 + i_4] = -108;
         } else if (var_8 == 8226) {
            bytes_3[i_7 + i_4] = -107;
         } else if (var_8 == 8211) {
            bytes_3[i_7 + i_4] = -106;
         } else if (var_8 == 8212) {
            bytes_3[i_7 + i_4] = -105;
         } else if (var_8 == 732) {
            bytes_3[i_7 + i_4] = -104;
         } else if (var_8 == 8482) {
            bytes_3[i_7 + i_4] = -103;
         } else if (var_8 == 353) {
            bytes_3[i_7 + i_4] = -102;
         } else if (var_8 == 8250) {
            bytes_3[i_7 + i_4] = -101;
         } else if (var_8 == 339) {
            bytes_3[i_7 + i_4] = -100;
         } else if (var_8 == 382) {
            bytes_3[i_7 + i_4] = -98;
         } else if (var_8 == 376) {
            bytes_3[i_7 + i_4] = -97;
         } else {
            bytes_3[i_7 + i_4] = 63;
         }
      }

      return i_6;
   }

   public static final class325 method236(int i_0, int i_1, int i_2, int i_3, int i_4, boolean bool_5, int i_6) {
      if (i_1 == -1) {
         i_4 = 0;
      } else if (i_4 == 2 && i_1 != 1) {
         i_4 = 1;
      }

      long long_7 = ((long)i_3 << 42) + ((long)i_4 << 40) + ((long)i_2 << 38) + ((long)i_1 << 16) + (long)i_0;
      class325 class325_9;
      if (!bool_5) {
         class325_9 = (class325) ItemDefinition.field3445.get(long_7);
         if (class325_9 != null) {
            return class325_9;
         }
      }

      ItemDefinition itemDefinition_10 = item.getDefinition(i_0);
      if (i_1 > 1 && itemDefinition_10.countobj != null) {
         int i_11 = -1;

         for (int i_12 = 0; i_12 < 10; i_12++) {
            if (i_1 >= itemDefinition_10.countco[i_12] && itemDefinition_10.countco[i_12] != 0) {
               i_11 = itemDefinition_10.countobj[i_12];
            }
         }

         if (i_11 != -1) {
            itemDefinition_10 = item.getDefinition(i_11);
         }
      }

      class127 class127_22 = itemDefinition_10.method4644(1);
      if (class127_22 == null) {
         return null;
      } else {
         class325 class325_23 = null;
         if (itemDefinition_10.noteTemplate != -1) {
            class325_23 = method236(itemDefinition_10.note, 10, 1, 0, 0, true, 2024001124);
            if (class325_23 == null) {
               return null;
            }
         } else if (itemDefinition_10.field3454 != -1) {
            class325_23 = method236(itemDefinition_10.field3453, i_1, i_2, i_3, 0, false, 2024001124);
            if (class325_23 == null) {
               return null;
            }
         } else if (itemDefinition_10.placeholderTemplate != -1) {
            class325_23 = method236(itemDefinition_10.placeholder, i_1, 0, 0, 0, false, 2024001124);
            if (class325_23 == null) {
               return null;
            }
         }

         int[] ints_13 = Rasterizer2D.Rasterizer2D_pixels;
         int i_14 = Rasterizer2D.Rasterizer2D_width;
         int i_15 = Rasterizer2D.Rasterizer2D_height;
         int[] ints_16 = new int[4];
         Rasterizer2D.getClipArray(ints_16);
         class325_9 = new class325(36, 32);
         Rasterizer2D.replace(class325_9.field3908, 36, 32);
         Rasterizer2D.clear();
         Rasterizer3D.method3051();
         Rasterizer3D.method2976(16, 16);
         Rasterizer3D.field1768 = false;
         if (itemDefinition_10.placeholderTemplate != -1) {
            class325_23.drawTransBgAt(0, 0);
         }

         int i_17 = itemDefinition_10.zoom2d;
         if (bool_5) {
            i_17 = (int)((double)i_17 * 1.5D);
         } else if (i_2 == 2) {
            i_17 = (int)(1.04D * (double)i_17);
         }

         int i_18 = i_17 * Rasterizer3D.sine[itemDefinition_10.xan2d] >> 16;
         int i_19 = i_17 * Rasterizer3D.cosine[itemDefinition_10.xan2d] >> 16;
         class127_22.method2899();
         class127_22.method2866(0, itemDefinition_10.yan2d, itemDefinition_10.field3420, itemDefinition_10.xan2d, itemDefinition_10.offsetX2d, class127_22.height / 2 + i_18 + itemDefinition_10.offsetY2d, i_19 + itemDefinition_10.offsetY2d);
         if (itemDefinition_10.field3454 != -1) {
            class325_23.drawTransBgAt(0, 0);
         }

         if (i_2 >= 1) {
            class325_9.method6133(1);
         }

         if (i_2 >= 2) {
            class325_9.method6133(16777215);
         }

         if (i_3 != 0) {
            class325_9.method6171(i_3);
         }

         Rasterizer2D.replace(class325_9.field3908, 36, 32);
         if (itemDefinition_10.noteTemplate != -1) {
            class325_23.drawTransBgAt(0, 0);
         }

         if (i_4 == 1 || i_4 == 2 && itemDefinition_10.isStackable == 1) {
            Font font_20 = class78.field1129;
            String string_21;
            if (i_1 < 100000) {
               string_21 = "<col=ffff00>" + i_1 + "</col>";
            } else if (i_1 < 10000000) {
               string_21 = "<col=ffffff>" + i_1 / 1000 + "K" + "</col>";
            } else {
               string_21 = "<col=00ff80>" + i_1 / 1000000 + "M" + "</col>";
            }

            font_20.draw(string_21, 0, 9, 16776960, 1);
         }

         if (!bool_5) {
            ItemDefinition.field3445.put(class325_9, long_7);
         }

         Rasterizer2D.replace(ints_13, i_14, i_15);
         Rasterizer2D.method6013(ints_16);
         Rasterizer3D.method3051();
         Rasterizer3D.field1768 = true;
         return class325_9;
      }
   }

   static void method224(SequenceAnimation sequenceAnimation_0, int i_1, int i_2, int i_3, int i_4) {
      if (Client.field893 < 50 && Client.field892 != 0) {
         if (sequenceAnimation_0.field3523 != null && i_1 < sequenceAnimation_0.field3523.length) {
            int i_5 = sequenceAnimation_0.field3523[i_1];
            if (i_5 != 0) {
               int i_6 = i_5 >> 8;
               int i_7 = i_5 >> 4 & 0x7;
               int i_8 = i_5 & 0xf;
               Client.field894[Client.field893] = i_6;
               Client.field895[Client.field893] = i_7;
               Client.field897[Client.field893] = 0;
               Client.field898[Client.field893] = null;
               int i_9 = (i_2 - 64) / 128;
               int i_10 = (i_3 - 64) / 128;
               Client.field841[Client.field893] = i_8 + (i_10 << 8) + (i_9 << 16);
               ++Client.field893;
            }
         }
      }
   }

}
