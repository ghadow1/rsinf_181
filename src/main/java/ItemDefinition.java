public class ItemDefinition extends DualNode {

   public static class233 field3405;
   static class235 field3457;
   public static int field3455;
   public int field3410;
   public static class145 ItemDefinition_cached = new class145(64);
   public static class145 field3408 = new class145(50);
   public static class145 field3445 = new class145(200);
   public String name = "null";
   public int zoom2d = 2000;
   public int xan2d = 0;
   public int yan2d = 0;
   public int field3420 = 0;
   public int offsetX2d = 0;
   public int offsetY2d = 0;
   public int isStackable = 0;
   public int price = 1;
   public boolean isMembersOnly = false;
   public String[] groundActions = new String[] {null, null, "Take", null, null};
   public String[] inventoryActions = new String[] {null, null, null, null, "Drop"};
   int shiftClickIndex = -2;
   int maleModel = -1;
   int maleModel1 = -1;
   int maleOffset = 0;
   int femaleModel = -1;
   int femaleModel1 = -1;
   int femaleOffset = 0;
   int field3435 = -1;
   int field3430 = -1;
   int field3436 = -1;
   int field3438 = -1;
   int field3417 = -1;
   int field3440 = -1;
   public int note = -1;
   public int noteTemplate = -1;
   int resizeX = 128;
   int resizeY = 128;
   int resizeZ = 128;
   public int ambient = 0;
   public int contrast = 0;
   public int field3450 = 0;
   public boolean isTradable = false;
   int field3453 = -1;
   int field3454 = -1;
   public int placeholder = -1;
   public int placeholderTemplate = -1;
   int model;
   short[] recolorFrom;
   short[] recolorTo;
   short[] field3415;
   short[] field3416;
   int[] countobj;
   int[] countco;
   class316 params;

   void decodeNext(ByteBuffer buffer, int opcode) {
      if (opcode == 1) {
         this.model = buffer.readUnsignedShort();
      } else if (opcode == 2) {
         this.name = buffer.readNullTerminatedString();
      } else if (opcode == 4) {
         this.zoom2d = buffer.readUnsignedShort();
      } else if (opcode == 5) {
         this.xan2d = buffer.readUnsignedShort();
      } else if (opcode == 6) {
         this.yan2d = buffer.readUnsignedShort();
      } else if (opcode == 7) {
         this.offsetX2d = buffer.readUnsignedShort();
         if (this.offsetX2d > 32767) {
            this.offsetX2d -= 65536;
         }
      } else if (opcode == 8) {
         this.offsetY2d = buffer.readUnsignedShort();
         if (this.offsetY2d > 32767) {
            this.offsetY2d -= 65536;
         }
      } else if (opcode == 11) {
         this.isStackable = 1;
      } else if (opcode == 12) {
         this.price = buffer.readIntMedEndian();
      } else if (opcode == 16) {
         this.isMembersOnly = true;
      } else if (opcode == 23) {
         this.maleModel = buffer.readUnsignedShort();
         this.maleOffset = buffer.readUnsignedByte();
      } else if (opcode == 24) {
         this.maleModel1 = buffer.readUnsignedShort();
      } else if (opcode == 25) {
         this.femaleModel = buffer.readUnsignedShort();
         this.femaleOffset = buffer.readUnsignedByte();
      } else if (opcode == 26) {
         this.femaleModel1 = buffer.readUnsignedShort();
      } else if (opcode >= 30 && opcode < 35) {
         this.groundActions[opcode - 30] = buffer.readNullTerminatedString();
         if (this.groundActions[opcode - 30].equalsIgnoreCase("Hidden")) {
            this.groundActions[opcode - 30] = null;
         }
      } else if (opcode >= 35 && opcode < 40) {
         this.inventoryActions[opcode - 35] = buffer.readNullTerminatedString();
      } else {
         int i_4;
         int i_5;
         if (opcode == 40) {
            i_4 = buffer.readUnsignedByte();
            this.recolorFrom = new short[i_4];
            this.recolorTo = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.recolorFrom[i_5] = (short)buffer.readUnsignedShort();
               this.recolorTo[i_5] = (short)buffer.readUnsignedShort();
            }
         } else if (opcode == 41) {
            i_4 = buffer.readUnsignedByte();
            this.field3415 = new short[i_4];
            this.field3416 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field3415[i_5] = (short)buffer.readUnsignedShort();
               this.field3416[i_5] = (short)buffer.readUnsignedShort();
            }
         } else if (opcode == 42) {
            this.shiftClickIndex = buffer.readSignedByte();
         } else if (opcode == 65) {
            this.isTradable = true;
         } else if (opcode == 78) {
            this.field3435 = buffer.readUnsignedShort();
         } else if (opcode == 79) {
            this.field3430 = buffer.readUnsignedShort();
         } else if (opcode == 90) {
            this.field3436 = buffer.readUnsignedShort();
         } else if (opcode == 91) {
            this.field3417 = buffer.readUnsignedShort();
         } else if (opcode == 92) {
            this.field3438 = buffer.readUnsignedShort();
         } else if (opcode == 93) {
            this.field3440 = buffer.readUnsignedShort();
         } else if (opcode == 95) {
            this.field3420 = buffer.readUnsignedShort();
         } else if (opcode == 97) {
            this.note = buffer.readUnsignedShort();
         } else if (opcode == 98) {
            this.noteTemplate = buffer.readUnsignedShort();
         } else if (opcode >= 100 && opcode < 110) {
            if (this.countobj == null) {
               this.countobj = new int[10];
               this.countco = new int[10];
            }

            this.countobj[opcode - 100] = buffer.readUnsignedShort();
            this.countco[opcode - 100] = buffer.readUnsignedShort();
         } else if (opcode == 110) {
            this.resizeX = buffer.readUnsignedShort();
         } else if (opcode == 111) {
            this.resizeY = buffer.readUnsignedShort();
         } else if (opcode == 112) {
            this.resizeZ = buffer.readUnsignedShort();
         } else if (opcode == 113) {
            this.ambient = buffer.readSignedByte();
         } else if (opcode == 114) {
            this.contrast = buffer.readSignedByte();
         } else if (opcode == 115) {
            this.field3450 = buffer.readUnsignedByte();
         } else if (opcode == 139) {
            this.field3453 = buffer.readUnsignedShort();
         } else if (opcode == 140) {
            this.field3454 = buffer.readUnsignedShort();
         } else if (opcode == 148) {
            this.placeholder = buffer.readUnsignedShort();
         } else if (opcode == 149) {
            this.placeholderTemplate = buffer.readUnsignedShort();
         } else if (opcode == 249) {
            this.params = item.method403(buffer, this.params);
         }
      }

   }

   public final class127 method4644(int i_1) {
      if (this.countobj != null && i_1 > 1) {
         int i_3 = -1;

         for (int i_4 = 0; i_4 < 10; i_4++) {
            if (i_1 >= this.countco[i_4] && this.countco[i_4] != 0) {
               i_3 = this.countobj[i_4];
            }
         }

         if (i_3 != -1) {
            return item.getDefinition(i_3).method4644(1);
         }
      }

      class127 class127_6 = (class127) field3408.get((long)this.field3410);
      if (class127_6 != null) {
         return class127_6;
      } else {
         Model model_7 = Model.method2769(field3405, this.model, 0);
         if (model_7 == null) {
            return null;
         } else {
            if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
               model_7.method2786(this.resizeX, this.resizeY, this.resizeZ);
            }

            int i_5;
            if (this.recolorFrom != null) {
               for (i_5 = 0; i_5 < this.recolorFrom.length; i_5++) {
                  model_7.method2783(this.recolorFrom[i_5], this.recolorTo[i_5]);
               }
            }

            if (this.field3415 != null) {
               for (i_5 = 0; i_5 < this.field3415.length; i_5++) {
                  model_7.method2784(this.field3415[i_5], this.field3416[i_5]);
               }
            }

            class127_6 = model_7.applyLighting(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
            class127_6.field1730 = true;
            field3408.put(class127_6, (long)this.field3410);
            return class127_6;
         }
      }
   }

   public final Model method4643(int i_1) {
      int i_4;
      if (this.countobj != null && i_1 > 1) {
         int i_3 = -1;

         for (i_4 = 0; i_4 < 10; i_4++) {
            if (i_1 >= this.countco[i_4] && this.countco[i_4] != 0) {
               i_3 = this.countobj[i_4];
            }
         }

         if (i_3 != -1) {
            return item.getDefinition(i_3).method4643(1);
         }
      }

      Model model_5 = Model.method2769(field3405, this.model, 0);
      if (model_5 == null) {
         return null;
      } else {
         if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            model_5.method2786(this.resizeX, this.resizeY, this.resizeZ);
         }

         if (this.recolorFrom != null) {
            for (i_4 = 0; i_4 < this.recolorFrom.length; i_4++) {
               model_5.method2783(this.recolorFrom[i_4], this.recolorTo[i_4]);
            }
         }

         if (this.field3415 != null) {
            for (i_4 = 0; i_4 < this.field3415.length; i_4++) {
               model_5.method2784(this.field3415[i_4], this.field3416[i_4]);
            }
         }

         return model_5;
      }
   }

   void method4637() {
   }

   public final boolean method4683(boolean bool_1) {
      int i_3 = this.field3436;
      int i_4 = this.field3438;
      if (bool_1) {
         i_3 = this.field3417;
         i_4 = this.field3440;
      }

      if (i_3 == -1) {
         return true;
      } else {
         boolean bool_5 = true;
         if (!field3405.method4146(i_3, 0)) {
            bool_5 = false;
         }

         if (i_4 != -1 && !field3405.method4146(i_4, 0)) {
            bool_5 = false;
         }

         return bool_5;
      }
   }

   public final Model method4649(boolean bool_1) {
      int i_3 = this.field3436;
      int i_4 = this.field3438;
      if (bool_1) {
         i_3 = this.field3417;
         i_4 = this.field3440;
      }

      if (i_3 == -1) {
         return null;
      } else {
         Model model_5 = Model.method2769(field3405, i_3, 0);
         if (i_4 != -1) {
            Model model_6 = Model.method2769(field3405, i_4, 0);
            Model[] arr_7 = new Model[] {model_5, model_6};
            model_5 = new Model(arr_7, 2);
         }

         int i_8;
         if (this.recolorFrom != null) {
            for (i_8 = 0; i_8 < this.recolorFrom.length; i_8++) {
               model_5.method2783(this.recolorFrom[i_8], this.recolorTo[i_8]);
            }
         }

         if (this.field3415 != null) {
            for (i_8 = 0; i_8 < this.field3415.length; i_8++) {
               model_5.method2784(this.field3415[i_8], this.field3416[i_8]);
            }
         }

         return model_5;
      }
   }

   void decode(ByteBuffer buffer) {
      while (true) {
         int i_3 = buffer.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.decodeNext(buffer, i_3);
      }
   }

   public final boolean method4646(boolean bool_1) {
      int i_3 = this.maleModel;
      int i_4 = this.maleModel1;
      int i_5 = this.field3435;
      if (bool_1) {
         i_3 = this.femaleModel;
         i_4 = this.femaleModel1;
         i_5 = this.field3430;
      }

      if (i_3 == -1) {
         return true;
      } else {
         boolean bool_6 = true;
         if (!field3405.method4146(i_3, 0)) {
            bool_6 = false;
         }

         if (i_4 != -1 && !field3405.method4146(i_4, 0)) {
            bool_6 = false;
         }

         if (i_5 != -1 && !field3405.method4146(i_5, 0)) {
            bool_6 = false;
         }

         return bool_6;
      }
   }

   public final Model method4694(boolean bool_1) {
      int i_3 = this.maleModel;
      int i_4 = this.maleModel1;
      int i_5 = this.field3435;
      if (bool_1) {
         i_3 = this.femaleModel;
         i_4 = this.femaleModel1;
         i_5 = this.field3430;
      }

      if (i_3 == -1) {
         return null;
      } else {
         Model model_6 = Model.method2769(field3405, i_3, 0);
         if (i_4 != -1) {
            Model model_7 = Model.method2769(field3405, i_4, 0);
            if (i_5 != -1) {
               Model model_8 = Model.method2769(field3405, i_5, 0);
               Model[] arr_9 = new Model[] {model_6, model_7, model_8};
               model_6 = new Model(arr_9, 3);
            } else {
               Model[] arr_11 = new Model[] {model_6, model_7};
               model_6 = new Model(arr_11, 2);
            }
         }

         if (!bool_1 && this.maleOffset != 0) {
            model_6.method2782(0, this.maleOffset, 0);
         }

         if (bool_1 && this.femaleOffset != 0) {
            model_6.method2782(0, this.femaleOffset, 0);
         }

         int i_10;
         if (this.recolorFrom != null) {
            for (i_10 = 0; i_10 < this.recolorFrom.length; i_10++) {
               model_6.method2783(this.recolorFrom[i_10], this.recolorTo[i_10]);
            }
         }

         if (this.field3415 != null) {
            for (i_10 = 0; i_10 < this.field3415.length; i_10++) {
               model_6.method2784(this.field3415[i_10], this.field3416[i_10]);
            }
         }

         return model_6;
      }
   }

   void method4666(ItemDefinition itemDefinition_1, ItemDefinition itemDefinition_2) {
      this.model = itemDefinition_1.model;
      this.zoom2d = itemDefinition_1.zoom2d;
      this.xan2d = itemDefinition_1.xan2d;
      this.yan2d = itemDefinition_1.yan2d;
      this.field3420 = itemDefinition_1.field3420;
      this.offsetX2d = itemDefinition_1.offsetX2d;
      this.offsetY2d = itemDefinition_1.offsetY2d;
      this.recolorFrom = itemDefinition_1.recolorFrom;
      this.recolorTo = itemDefinition_1.recolorTo;
      this.field3415 = itemDefinition_1.field3415;
      this.field3416 = itemDefinition_1.field3416;
      this.name = itemDefinition_2.name;
      this.isMembersOnly = itemDefinition_2.isMembersOnly;
      this.price = itemDefinition_2.price;
      this.isStackable = 1;
   }

   void method4641(ItemDefinition itemDefinition_1, ItemDefinition itemDefinition_2) {
      this.model = itemDefinition_1.model;
      this.zoom2d = itemDefinition_1.zoom2d;
      this.xan2d = itemDefinition_1.xan2d;
      this.yan2d = itemDefinition_1.yan2d;
      this.field3420 = itemDefinition_1.field3420;
      this.offsetX2d = itemDefinition_1.offsetX2d;
      this.offsetY2d = itemDefinition_1.offsetY2d;
      this.recolorFrom = itemDefinition_2.recolorFrom;
      this.recolorTo = itemDefinition_2.recolorTo;
      this.field3415 = itemDefinition_2.field3415;
      this.field3416 = itemDefinition_2.field3416;
      this.name = itemDefinition_2.name;
      this.isMembersOnly = itemDefinition_2.isMembersOnly;
      this.isStackable = itemDefinition_2.isStackable;
      this.maleModel = itemDefinition_2.maleModel;
      this.maleModel1 = itemDefinition_2.maleModel1;
      this.field3435 = itemDefinition_2.field3435;
      this.femaleModel = itemDefinition_2.femaleModel;
      this.femaleModel1 = itemDefinition_2.femaleModel1;
      this.field3430 = itemDefinition_2.field3430;
      this.field3436 = itemDefinition_2.field3436;
      this.field3438 = itemDefinition_2.field3438;
      this.field3417 = itemDefinition_2.field3417;
      this.field3440 = itemDefinition_2.field3440;
      this.field3450 = itemDefinition_2.field3450;
      this.groundActions = itemDefinition_2.groundActions;
      this.inventoryActions = new String[5];
      if (itemDefinition_2.inventoryActions != null) {
         for (int i_4 = 0; i_4 < 4; i_4++) {
            this.inventoryActions[i_4] = itemDefinition_2.inventoryActions[i_4];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   void genPlaceholder(ItemDefinition def, ItemDefinition itemDefinition_2) {
      this.model = def.model;
      this.zoom2d = def.zoom2d;
      this.xan2d = def.xan2d;
      this.yan2d = def.yan2d;
      this.field3420 = def.field3420;
      this.offsetX2d = def.offsetX2d;
      this.offsetY2d = def.offsetY2d;
      this.recolorFrom = def.recolorFrom;
      this.recolorTo = def.recolorTo;
      this.field3415 = def.field3415;
      this.field3416 = def.field3416;
      this.isStackable = def.isStackable;
      this.name = itemDefinition_2.name;
      this.price = 0;
      this.isMembersOnly = false;
      this.isTradable = false;
   }

   public ItemDefinition method4656(int i_1) {
      if (this.countobj != null && i_1 > 1) {
         int i_3 = -1;

         for (int i_4 = 0; i_4 < 10; i_4++) {
            if (i_1 >= this.countco[i_4] && this.countco[i_4] != 0) {
               i_3 = this.countobj[i_4];
            }
         }

         if (i_3 != -1) {
            return item.getDefinition(i_3);
         }
      }

      return this;
   }

   public static byte encodeStringCp1252(char var_0) {
      byte b_2;
      if (var_0 > 0 && var_0 < 128 || var_0 >= 160 && var_0 <= 255) {
         b_2 = (byte)var_0;
      } else if (var_0 == 8364) {
         b_2 = -128;
      } else if (var_0 == 8218) {
         b_2 = -126;
      } else if (var_0 == 402) {
         b_2 = -125;
      } else if (var_0 == 8222) {
         b_2 = -124;
      } else if (var_0 == 8230) {
         b_2 = -123;
      } else if (var_0 == 8224) {
         b_2 = -122;
      } else if (var_0 == 8225) {
         b_2 = -121;
      } else if (var_0 == 710) {
         b_2 = -120;
      } else if (var_0 == 8240) {
         b_2 = -119;
      } else if (var_0 == 352) {
         b_2 = -118;
      } else if (var_0 == 8249) {
         b_2 = -117;
      } else if (var_0 == 338) {
         b_2 = -116;
      } else if (var_0 == 381) {
         b_2 = -114;
      } else if (var_0 == 8216) {
         b_2 = -111;
      } else if (var_0 == 8217) {
         b_2 = -110;
      } else if (var_0 == 8220) {
         b_2 = -109;
      } else if (var_0 == 8221) {
         b_2 = -108;
      } else if (var_0 == 8226) {
         b_2 = -107;
      } else if (var_0 == 8211) {
         b_2 = -106;
      } else if (var_0 == 8212) {
         b_2 = -105;
      } else if (var_0 == 732) {
         b_2 = -104;
      } else if (var_0 == 8482) {
         b_2 = -103;
      } else if (var_0 == 353) {
         b_2 = -102;
      } else if (var_0 == 8250) {
         b_2 = -101;
      } else if (var_0 == 339) {
         b_2 = -100;
      } else if (var_0 == 382) {
         b_2 = -98;
      } else if (var_0 == 376) {
         b_2 = -97;
      } else {
         b_2 = 63;
      }

      return b_2;
   }

   public int method4652() {
      return this.shiftClickIndex != -1 && this.inventoryActions != null ? (this.shiftClickIndex >= 0 ? (this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1) : ("Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1)) : -1;
   }

   public String method4648(int i_1, String string_2) {
      return class5.method54(this.params, i_1, string_2);
   }

   public int method4650(int i_1, int i_2) {
      class316 class316_5 = this.params;
      int i_4;
      if (class316_5 == null) {
         i_4 = i_2;
      } else {
         class179 class179_6 = (class179) class316_5.method5924((long) i_1);
         if (class179_6 == null) {
            i_4 = i_2;
         } else {
            i_4 = class179_6.field2111;
         }
      }

      return i_4;
   }

}
