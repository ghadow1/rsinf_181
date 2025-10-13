public class ItemDefinition extends DualNode {

   public static class233 field3405;
   static class235 field3457;
   public static int field3455;
   public int field3410;
   public static class145 field3407 = new class145(64);
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
   int field3403 = -2;
   int maleModel = -1;
   int field3437 = -1;
   int maleOffset = 0;
   int field3432 = -1;
   int field3433 = -1;
   int field3434 = 0;
   int field3435 = -1;
   int field3430 = -1;
   int field3436 = -1;
   int field3438 = -1;
   int field3417 = -1;
   int field3440 = -1;
   public int field3443 = -1;
   public int field3444 = -1;
   int resizeX = 128;
   int resizeY = 128;
   int resizeZ = 128;
   public int ambient = 0;
   public int contrast = 0;
   public int field3450 = 0;
   public boolean field3452 = false;
   int field3453 = -1;
   int field3454 = -1;
   public int field3400 = -1;
   public int field3439 = -1;
   int model;
   short[] field3424;
   short[] field3414;
   short[] field3415;
   short[] field3416;
   int[] field3441;
   int[] field3442;
   class316 field3409;

   void decodeNext(ByteBuffer class300_1, int i_2) {
      if (i_2 == 1) {
         this.model = class300_1.readUnsignedShort();
      } else if (i_2 == 2) {
         this.name = class300_1.readNullTerminatedString();
      } else if (i_2 == 4) {
         this.zoom2d = class300_1.readUnsignedShort();
      } else if (i_2 == 5) {
         this.xan2d = class300_1.readUnsignedShort();
      } else if (i_2 == 6) {
         this.yan2d = class300_1.readUnsignedShort();
      } else if (i_2 == 7) {
         this.offsetX2d = class300_1.readUnsignedShort();
         if (this.offsetX2d > 32767) {
            this.offsetX2d -= 65536;
         }
      } else if (i_2 == 8) {
         this.offsetY2d = class300_1.readUnsignedShort();
         if (this.offsetY2d > 32767) {
            this.offsetY2d -= 65536;
         }
      } else if (i_2 == 11) {
         this.isStackable = 1;
      } else if (i_2 == 12) {
         this.price = class300_1.readIntMedEndian();
      } else if (i_2 == 16) {
         this.isMembersOnly = true;
      } else if (i_2 == 23) {
         this.maleModel = class300_1.readUnsignedShort();
         this.maleOffset = class300_1.readUnsignedByte();
      } else if (i_2 == 24) {
         this.field3437 = class300_1.readUnsignedShort();
      } else if (i_2 == 25) {
         this.field3432 = class300_1.readUnsignedShort();
         this.field3434 = class300_1.readUnsignedByte();
      } else if (i_2 == 26) {
         this.field3433 = class300_1.readUnsignedShort();
      } else if (i_2 >= 30 && i_2 < 35) {
         this.groundActions[i_2 - 30] = class300_1.readNullTerminatedString();
         if (this.groundActions[i_2 - 30].equalsIgnoreCase("Hidden")) {
            this.groundActions[i_2 - 30] = null;
         }
      } else if (i_2 >= 35 && i_2 < 40) {
         this.inventoryActions[i_2 - 35] = class300_1.readNullTerminatedString();
      } else {
         int i_4;
         int i_5;
         if (i_2 == 40) {
            i_4 = class300_1.readUnsignedByte();
            this.field3424 = new short[i_4];
            this.field3414 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field3424[i_5] = (short)class300_1.readUnsignedShort();
               this.field3414[i_5] = (short)class300_1.readUnsignedShort();
            }
         } else if (i_2 == 41) {
            i_4 = class300_1.readUnsignedByte();
            this.field3415 = new short[i_4];
            this.field3416 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field3415[i_5] = (short)class300_1.readUnsignedShort();
               this.field3416[i_5] = (short)class300_1.readUnsignedShort();
            }
         } else if (i_2 == 42) {
            this.field3403 = class300_1.readSignedByte();
         } else if (i_2 == 65) {
            this.field3452 = true;
         } else if (i_2 == 78) {
            this.field3435 = class300_1.readUnsignedShort();
         } else if (i_2 == 79) {
            this.field3430 = class300_1.readUnsignedShort();
         } else if (i_2 == 90) {
            this.field3436 = class300_1.readUnsignedShort();
         } else if (i_2 == 91) {
            this.field3417 = class300_1.readUnsignedShort();
         } else if (i_2 == 92) {
            this.field3438 = class300_1.readUnsignedShort();
         } else if (i_2 == 93) {
            this.field3440 = class300_1.readUnsignedShort();
         } else if (i_2 == 95) {
            this.field3420 = class300_1.readUnsignedShort();
         } else if (i_2 == 97) {
            this.field3443 = class300_1.readUnsignedShort();
         } else if (i_2 == 98) {
            this.field3444 = class300_1.readUnsignedShort();
         } else if (i_2 >= 100 && i_2 < 110) {
            if (this.field3441 == null) {
               this.field3441 = new int[10];
               this.field3442 = new int[10];
            }

            this.field3441[i_2 - 100] = class300_1.readUnsignedShort();
            this.field3442[i_2 - 100] = class300_1.readUnsignedShort();
         } else if (i_2 == 110) {
            this.resizeX = class300_1.readUnsignedShort();
         } else if (i_2 == 111) {
            this.resizeY = class300_1.readUnsignedShort();
         } else if (i_2 == 112) {
            this.resizeZ = class300_1.readUnsignedShort();
         } else if (i_2 == 113) {
            this.ambient = class300_1.readSignedByte();
         } else if (i_2 == 114) {
            this.contrast = class300_1.readSignedByte();
         } else if (i_2 == 115) {
            this.field3450 = class300_1.readUnsignedByte();
         } else if (i_2 == 139) {
            this.field3453 = class300_1.readUnsignedShort();
         } else if (i_2 == 140) {
            this.field3454 = class300_1.readUnsignedShort();
         } else if (i_2 == 148) {
            this.field3400 = class300_1.readUnsignedShort();
         } else if (i_2 == 149) {
            this.field3439 = class300_1.readUnsignedShort();
         } else if (i_2 == 249) {
            this.field3409 = class26.method403(class300_1, this.field3409, -675682767);
         }
      }

   }

   public final class127 method4644(int i_1) {
      if (this.field3441 != null && i_1 > 1) {
         int i_3 = -1;

         for (int i_4 = 0; i_4 < 10; i_4++) {
            if (i_1 >= this.field3442[i_4] && this.field3442[i_4] != 0) {
               i_3 = this.field3441[i_4];
            }
         }

         if (i_3 != -1) {
            return class26.method404(i_3).method4644(1);
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
            if (this.field3424 != null) {
               for (i_5 = 0; i_5 < this.field3424.length; i_5++) {
                  model_7.method2783(this.field3424[i_5], this.field3414[i_5]);
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
      if (this.field3441 != null && i_1 > 1) {
         int i_3 = -1;

         for (i_4 = 0; i_4 < 10; i_4++) {
            if (i_1 >= this.field3442[i_4] && this.field3442[i_4] != 0) {
               i_3 = this.field3441[i_4];
            }
         }

         if (i_3 != -1) {
            return class26.method404(i_3).method4643(1);
         }
      }

      Model model_5 = Model.method2769(field3405, this.model, 0);
      if (model_5 == null) {
         return null;
      } else {
         if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            model_5.method2786(this.resizeX, this.resizeY, this.resizeZ);
         }

         if (this.field3424 != null) {
            for (i_4 = 0; i_4 < this.field3424.length; i_4++) {
               model_5.method2783(this.field3424[i_4], this.field3414[i_4]);
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

   public final Model method4649(boolean bool_1, byte b_2) {
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
         if (this.field3424 != null) {
            for (i_8 = 0; i_8 < this.field3424.length; i_8++) {
               model_5.method2783(this.field3424[i_8], this.field3414[i_8]);
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

   void method4638(ByteBuffer class300_1) {
      while (true) {
         int i_3 = class300_1.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.decodeNext(class300_1, i_3);
      }
   }

   public final boolean method4646(boolean bool_1, byte b_2) {
      int i_3 = this.maleModel;
      int i_4 = this.field3437;
      int i_5 = this.field3435;
      if (bool_1) {
         i_3 = this.field3432;
         i_4 = this.field3433;
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

   public final Model method4694(boolean bool_1, byte b_2) {
      int i_3 = this.maleModel;
      int i_4 = this.field3437;
      int i_5 = this.field3435;
      if (bool_1) {
         i_3 = this.field3432;
         i_4 = this.field3433;
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

         if (bool_1 && this.field3434 != 0) {
            model_6.method2782(0, this.field3434, 0);
         }

         int i_10;
         if (this.field3424 != null) {
            for (i_10 = 0; i_10 < this.field3424.length; i_10++) {
               model_6.method2783(this.field3424[i_10], this.field3414[i_10]);
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
      this.field3424 = itemDefinition_1.field3424;
      this.field3414 = itemDefinition_1.field3414;
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
      this.field3424 = itemDefinition_2.field3424;
      this.field3414 = itemDefinition_2.field3414;
      this.field3415 = itemDefinition_2.field3415;
      this.field3416 = itemDefinition_2.field3416;
      this.name = itemDefinition_2.name;
      this.isMembersOnly = itemDefinition_2.isMembersOnly;
      this.isStackable = itemDefinition_2.isStackable;
      this.maleModel = itemDefinition_2.maleModel;
      this.field3437 = itemDefinition_2.field3437;
      this.field3435 = itemDefinition_2.field3435;
      this.field3432 = itemDefinition_2.field3432;
      this.field3433 = itemDefinition_2.field3433;
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

   void method4689(ItemDefinition itemDefinition_1, ItemDefinition itemDefinition_2) {
      this.model = itemDefinition_1.model;
      this.zoom2d = itemDefinition_1.zoom2d;
      this.xan2d = itemDefinition_1.xan2d;
      this.yan2d = itemDefinition_1.yan2d;
      this.field3420 = itemDefinition_1.field3420;
      this.offsetX2d = itemDefinition_1.offsetX2d;
      this.offsetY2d = itemDefinition_1.offsetY2d;
      this.field3424 = itemDefinition_1.field3424;
      this.field3414 = itemDefinition_1.field3414;
      this.field3415 = itemDefinition_1.field3415;
      this.field3416 = itemDefinition_1.field3416;
      this.isStackable = itemDefinition_1.isStackable;
      this.name = itemDefinition_2.name;
      this.price = 0;
      this.isMembersOnly = false;
      this.field3452 = false;
   }

   public ItemDefinition method4656(int i_1) {
      if (this.field3441 != null && i_1 > 1) {
         int i_3 = -1;

         for (int i_4 = 0; i_4 < 10; i_4++) {
            if (i_1 >= this.field3442[i_4] && this.field3442[i_4] != 0) {
               i_3 = this.field3441[i_4];
            }
         }

         if (i_3 != -1) {
            return class26.method404(i_3);
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
      return this.field3403 != -1 && this.inventoryActions != null ? (this.field3403 >= 0 ? (this.inventoryActions[this.field3403] != null ? this.field3403 : -1) : ("Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1)) : -1;
   }

   public String method4648(int i_1, String string_2) {
      return class5.method54(this.field3409, i_1, string_2, (byte) -115);
   }

   public int method4650(int i_1, int i_2) {
      class316 class316_5 = this.field3409;
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
