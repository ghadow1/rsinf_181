public class Timer {

   long field3603 = -1L;
   long field3602 = -1L;
   public boolean field3605 = false;
   long field3607 = 0L;
   long field3604 = 0L;
   long field3606 = 0L;
   int field3608 = 0;
   int field3609 = 0;
   int field3601 = 0;
   int field3610 = 0;

   static void startUpInitialization() {
      int i_1;
      if (Client.field680 == 0) {
         class5.scene = new Scene(4, 104, 104, class55.field516);

         for (i_1 = 0; i_1 < 4; i_1++) {
            Client.field710[i_1] = new CollisionMap(104, 104);
         }

         ParamDefinition.sceneMinimapSprite = new class325(512, 512);
         Login.field1189 = "Starting game engine...";
         Login.field1188 = 5;
         Client.field680 = 20;
      } else if (Client.field680 == 20) {
         Login.field1189 = "Prepared visibility map";
         Login.field1188 = 10;
         Client.field680 = 30;
      } else if (Client.field680 == 30) {
         class197.field2405 = class65.method1169(0, false, true);
         class167.field2049 = class65.method1169(1, false, true);
         SoundSystem.field2544 = class65.method1169(2, true, false);
         GCMonitor.field382 = class65.method1169(3, false, true);
         class13.field89 = class65.method1169(4, false, true);
         WorldMapCacheName.field307 = class65.method1169(5, true, true);
         class29.field253 = class65.method1169(6, true, true);
         NPCDefinition.field3500 = class65.method1169(7, false, true);
         Client.field683 = class65.method1169(8, false, true);
         class4.field18 = class65.method1169(9, false, true);
         class17.field110 = class65.method1169(10, false, true);
         class32.field279 = class65.method1169(11, false, true);
         class151.field1971 = class65.method1169(12, false, true);
         class2.field6 = class65.method1169(13, true, false);
         Tile.field1647 = class65.method1169(14, false, true);
         class67.field650 = class65.method1169(15, false, true);
         WorldMapID.field232 = class65.method1169(17, true, true);
         Client.field684 = class65.method1169(18, false, true);
         ItemDefinition.field3457 = class65.method1169(19, false, true);
         Entity.field1874 = class65.method1169(20, false, true);
         Login.field1189 = "Connecting to update server";
         Login.field1188 = 20;
         Client.field680 = 40;
      } else if (Client.field680 == 40) {
         byte b_31 = 0;
         i_1 = b_31 + class197.field2405.method4259() * 4 / 100;
         i_1 += class167.field2049.method4259() * 4 / 100;
         i_1 += SoundSystem.field2544.method4259() * 2 / 100;
         i_1 += GCMonitor.field382.method4259() * 2 / 100;
         i_1 += class13.field89.method4259() * 6 / 100;
         i_1 += WorldMapCacheName.field307.method4259() * 4 / 100;
         i_1 += class29.field253.method4259() * 2 / 100;
         i_1 += NPCDefinition.field3500.method4259() * 56 / 100;
         i_1 += Client.field683.method4259() * 2 / 100;
         i_1 += class4.field18.method4259() * 2 / 100;
         i_1 += class17.field110.method4259() * 2 / 100;
         i_1 += class32.field279.method4259() * 2 / 100;
         i_1 += class151.field1971.method4259() * 2 / 100;
         i_1 += class2.field6.method4259() * 2 / 100;
         i_1 += Tile.field1647.method4259() * 2 / 100;
         i_1 += class67.field650.method4259() * 2 / 100;
         i_1 += ItemDefinition.field3457.method4259() / 100;
         i_1 += Client.field684.method4259() / 100;
         i_1 += Entity.field1874.method4259() / 100;
         i_1 += WorldMapID.field232.method4258() && WorldMapID.field232.method4148() ? 1 : 0;
         if (i_1 != 100) {
            if (i_1 != 0) {
               Login.field1189 = "Checking for updates - " + i_1 + "%";
            }

            Login.field1188 = 30;
         } else {
            WorldMapRectangle.method763(class197.field2405, "Animations");
            WorldMapRectangle.method763(class167.field2049, "Skeletons");
            WorldMapRectangle.method763(class13.field89, "Sound FX");
            WorldMapRectangle.method763(WorldMapCacheName.field307, "Maps");
            WorldMapRectangle.method763(class29.field253, "Music Tracks");
            WorldMapRectangle.method763(NPCDefinition.field3500, "Models");
            WorldMapRectangle.method763(Client.field683, "Sprites");
            WorldMapRectangle.method763(class32.field279, "Music Jingles");
            WorldMapRectangle.method763(Tile.field1647, "Music Samples");
            WorldMapRectangle.method763(class67.field650, "Music Patches");
            WorldMapRectangle.method763(ItemDefinition.field3457, "World Map");
            WorldMapRectangle.method763(Client.field684, "World Map Geography");
            WorldMapRectangle.method763(Entity.field1874, "World Map Ground");
            class159.field1995 = new class312();
            class159.field1995.method5903(WorldMapID.field232, (byte) 104);
            Login.field1189 = "Loaded update list";
            Login.field1188 = 30;
            Client.field680 = 45;
         }
      } else if (Client.field680 == 45) {
         Tile.method2853(22050, !Client.resizeSettings2, 2);
         class198 class198_34 = new class198();
         class198_34.method3720(9, 128);
         WorldMapElement.field1144 = class234.method4256(GameApplet.field463, 0, 22050, 2015059645);
         WorldMapElement.field1144.method2424(class198_34);
         class58.method1094(class67.field650, Tile.field1647, class13.field89, class198_34, (byte) 14);
         class190.field2361 = class234.method4256(GameApplet.field463, 1, 2048, 2054660994);
         class57.field532 = new class98();
         class190.field2361.method2424(class57.field532);
         class84.field1177 = new class112(22050, CollisionMap.field2078);
         Login.field1189 = "Prepared sound engine";
         Login.field1188 = 35;
         Client.field680 = 50;
         class169.field2056 = new class293(Client.field683, class2.field6);
      } else {
         int i_2;
         if (Client.field680 == 50) {
            class292[] arr_33 = new class292[] {class292.field3681, class292.field3677, class292.field3676, class292.field3679, class292.field3684, class292.field3678};
            i_2 = arr_33.length;
            class293 class293_30 = class169.field2056;
            class292[] arr_4 = new class292[] {class292.field3681, class292.field3677, class292.field3676, class292.field3679, class292.field3684, class292.field3678};
            Client.fontsMap = class293_30.method5321(arr_4, -354104614);
            if (Client.fontsMap.size() < i_2) {
               Login.field1189 = "Loading fonts - " + Client.fontsMap.size() * 100 / i_2 + "%";
               Login.field1188 = 40;
            } else {
               class213.field2529 = (Font) Client.fontsMap.get(class292.field3676);
               class169.field2054 = (Font) Client.fontsMap.get(class292.field3677);
               class23.fontBold12 = (Font) Client.fontsMap.get(class292.field3678);
               class22.field174 = Client.field711.vmethod6276(1619784372);
               Login.field1189 = "Loaded fonts";
               Login.field1188 = 40;
               Client.field680 = 60;
            }
         } else {
            class235 class235_3;
            int i_5;
            class235 class235_26;
            int i_27;
            if (Client.field680 == 60) {
               class235_26 = class17.field110;
               class235_3 = Client.field683;
               i_27 = 0;
               if (class235_26.method4164("title.jpg", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("logo", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("logo_deadman_mode", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("titlebox", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("titlebutton", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("runes", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("title_mute", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("options_radio_buttons,0", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("options_radio_buttons,2", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("options_radio_buttons,4", "")) {
                  ++i_27;
               }

               if (class235_3.method4164("options_radio_buttons,6", "")) {
                  ++i_27;
               }

               class235_3.method4164("sl_back", "");
               class235_3.method4164("sl_flags", "");
               class235_3.method4164("sl_arrows", "");
               class235_3.method4164("sl_stars", "");
               class235_3.method4164("sl_button", "");
               i_5 = MusicPatchPcmStream.method1121();
               if (i_27 < i_5) {
                  Login.field1189 = "Loading title screen - " + i_27 * 100 / i_5 + "%";
                  Login.field1188 = 50;
               } else {
                  Login.field1189 = "Loaded title screen";
                  Login.field1188 = 50;
                  class96.updateGameState(5);
                  Client.field680 = 70;
               }
            } else if (Client.field680 == 70) {
               if (!SoundSystem.field2544.method4148()) {
                  Login.field1189 = "Loading config - " + SoundSystem.field2544.method4257() + "%";
                  Login.field1188 = 60;
               } else {
                  class235 class235_32 = SoundSystem.field2544;
                  class257.field3505 = class235_32;
                  WorldMapID.method414(SoundSystem.field2544, -2096884458);
                  class6.method66(SoundSystem.field2544, NPCDefinition.field3500);
                  class235_26 = SoundSystem.field2544;
                  class235_3 = NPCDefinition.field3500;
                  boolean bool_35 = Client.resizeSettings2;
                  class253.field3395 = class235_26;
                  class253.field3351 = class235_3;
                  class253.field3352 = bool_35;
                  class137.method3263(SoundSystem.field2544, NPCDefinition.field3500, (byte) -92);
                  class87.method2054(SoundSystem.field2544, (byte) 97);
                  class235 class235_28 = SoundSystem.field2544;
                  class235 class235_6 = NPCDefinition.field3500;
                  boolean bool_7 = Client.field655;
                  Font font_8 = class213.field2529;
                  class91.field1276 = class235_28;
                  ItemDefinition.field3405 = class235_6;
                  BuddyRankComparator.ItemDefinition_inMembersWorld = bool_7;
                  ItemDefinition.field3455 = class91.field1276.method4154(10);
                  class78.field1129 = font_8;
                  class235 class235_9 = SoundSystem.field2544;
                  class235 class235_10 = class197.field2405;
                  class235 class235_11 = class167.field2049;
                  SequenceAnimation.field3527 = class235_9;
                  SequenceAnimation.field3516 = class235_10;
                  SequenceAnimation.field3517 = class235_11;
                  class235 class235_12 = SoundSystem.field2544;
                  class235 class235_13 = NPCDefinition.field3500;
                  class243.field3247 = class235_12;
                  GCMonitor.field379 = class235_13;
                  class235 class235_14 = SoundSystem.field2544;
                  class248.field3298 = class235_14;
                  class6.method68(SoundSystem.field2544);
                  class144.method3317(GCMonitor.field382, NPCDefinition.field3500, Client.field683, class2.field6, -354587299);
                  class15.method173(SoundSystem.field2544, -1590503408);
                  class235 class235_15 = SoundSystem.field2544;
                  class251.field3314 = class235_15;
                  class5.method62(SoundSystem.field2544);
                  class45.method794(SoundSystem.field2544);
                  class170.field2057 = new class90();
                  class235 class235_16 = SoundSystem.field2544;
                  class235 class235_17 = Client.field683;
                  class235 class235_18 = class2.field6;
                  ErrorHandler.field3327 = class235_16;
                  ErrorHandler.field3343 = class235_17;
                  ErrorHandler.field3326 = class235_18;
                  class235 class235_19 = SoundSystem.field2544;
                  class235 class235_20 = Client.field683;
                  class246.field3281 = class235_19;
                  class246.field3280 = class235_20;
                  class235 class235_21 = SoundSystem.field2544;
                  class235 class235_22 = Client.field683;
                  class241.field3225 = class235_22;
                  if (class235_21.method4148()) {
                     class314.field3846 = class235_21.method4154(35);
                     class241.field3219 = new class241[class314.field3846];

                     for (int i_23 = 0; i_23 < class314.field3846; i_23++) {
                        byte[] bytes_24 = class235_21.method4144(35, i_23);
                        class241.field3219[i_23] = new class241(i_23);
                        if (bytes_24 != null) {
                           class241.field3219[i_23].method4369(new ByteBuffer(bytes_24));
                           class241.field3219[i_23].method4370();
                        }
                     }
                  }

                  Login.field1189 = "Loaded config";
                  Login.field1188 = 60;
                  Client.field680 = 80;
               }
            } else if (Client.field680 == 80) {
               i_1 = 0;
               if (Message.field607 == null) {
                  Message.field607 = class65.method1178(Client.field683, class159.field1995.field3826, 0);
               } else {
                  ++i_1;
               }

               if (class151.field1972 == null) {
                  class151.field1972 = class65.method1178(Client.field683, class159.field1995.field3823, 0);
               } else {
                  ++i_1;
               }

               if (class285.field3660 == null) {
                  class285.field3660 = class289.method5281(Client.field683, class159.field1995.field3824, 0, 1777014825);
               } else {
                  ++i_1;
               }

               if (class157.field1989 == null) {
                  class157.field1989 = class131.method3062(Client.field683, class159.field1995.field3825, 0, 1591290793);
               } else {
                  ++i_1;
               }

               if (class108.field1442 == null) {
                  class108.field1442 = class131.method3062(Client.field683, class159.field1995.field3830, 0, 4902842);
               } else {
                  ++i_1;
               }

               if (class173.field2096 == null) {
                  class173.field2096 = class131.method3062(Client.field683, class159.field1995.field3827, 0, 1581353977);
               } else {
                  ++i_1;
               }

               if (WorldMapSection1.mapMarkerSprites == null) {
                  WorldMapSection1.mapMarkerSprites = class131.method3062(Client.field683, class159.field1995.field3828, 0, -14882219);
               } else {
                  ++i_1;
               }

               if (SceneOccluder.field1915 == null) {
                  SceneOccluder.field1915 = class131.method3062(Client.field683, class159.field1995.field3829, 0, 483704862);
               } else {
                  ++i_1;
               }

               if (class221.field2746 == null) {
                  class221.field2746 = class131.method3062(Client.field683, class159.field1995.field3832, 0, 543599290);
               } else {
                  ++i_1;
               }

               if (HealthBarUpdate.field82 == null) {
                  HealthBarUpdate.field82 = class289.method5281(Client.field683, class159.field1995.field3831, 0, 2112903096);
               } else {
                  ++i_1;
               }

               if (class11.field72 == null) {
                  class11.field72 = class289.method5281(Client.field683, class159.field1995.field3822, 0, 1884067998);
               } else {
                  ++i_1;
               }

               if (i_1 < 11) {
                  Login.field1189 = "Loading sprites - " + i_1 * 100 / 12 + "%";
                  Login.field1188 = 70;
               } else {
                  AbstractFont.field3720 = class11.field72;
                  class151.field1972.method6145();
                  i_2 = (int)(Math.random() * 21.0D) - 10;
                  int i_29 = (int)(Math.random() * 21.0D) - 10;
                  i_27 = (int)(Math.random() * 21.0D) - 10;
                  i_5 = (int)(Math.random() * 41.0D) - 20;
                  class285.field3660[0].method6091(i_2 + i_5, i_5 + i_29, i_5 + i_27);
                  Login.field1189 = "Loaded sprites";
                  Login.field1188 = 70;
                  Client.field680 = 90;
               }
            } else if (Client.field680 == 90) {
               if (!class4.field18.method4148()) {
                  Login.field1189 = "Loading textures - " + "0%";
                  Login.field1188 = 90;
               } else {
                  class6.field40 = new class119(class4.field18, Client.field683, 20, 0.8D, Client.resizeSettings2 ? 64 : 128);
                  Rasterizer3D.method2983(class6.field40);
                  Rasterizer3D.method2978(0.8D);
                  Client.field680 = 100;
               }
            } else if (Client.field680 == 100) {
               i_1 = class6.field40.method2763();
               if (i_1 < 100) {
                  Login.field1189 = "Loading textures - " + i_1 + "%";
                  Login.field1188 = 90;
               } else {
                  Login.field1189 = "Loaded textures";
                  Login.field1188 = 90;
                  Client.field680 = 110;
               }
            } else if (Client.field680 == 110) {
               FontName.field348 = new class63();
               GameApplet.field463.method3472(FontName.field348, 10);
               Login.field1189 = "Loaded input handler";
               Login.field1188 = 92;
               Client.field680 = 120;
            } else if (Client.field680 == 120) {
               if (!class17.field110.method4164("huffman", "")) {
                  Login.field1189 = "Loading wordpack - " + 0 + "%";
                  Login.field1188 = 94;
               } else {
                  class209 class209_25 = new class209(class17.field110.method4163("huffman", ""));
                  class210.field2515 = class209_25;
                  Login.field1189 = "Loaded wordpack";
                  Login.field1188 = 94;
                  Client.field680 = 130;
               }
            } else if (Client.field680 == 130) {
               if (!GCMonitor.field382.method4148()) {
                  Login.field1189 = "Loading interfaces - " + GCMonitor.field382.method4257() * 4 / 5 + "%";
                  Login.field1188 = 96;
               } else if (!class151.field1971.method4148()) {
                  Login.field1189 = "Loading interfaces - " + (80 + class151.field1971.method4257() / 6) + "%";
                  Login.field1188 = 96;
               } else if (!class2.field6.method4148()) {
                  Login.field1189 = "Loading interfaces - " + (96 + class2.field6.method4257() / 50) + "%";
                  Login.field1188 = 96;
               } else {
                  Login.field1189 = "Loaded interfaces";
                  Login.field1188 = 98;
                  Client.field680 = 140;
               }
            } else if (Client.field680 == 140) {
               Login.field1188 = 100;
               if (!ItemDefinition.field3457.method4165(WorldMapCacheName.field308.field306)) {
                  Login.field1189 = "Loading world map - " + ItemDefinition.field3457.method4238(WorldMapCacheName.field308.field306) / 10 + "%";
               } else {
                  if (class136.field1875 == null) {
                     class136.field1875 = new class333();
                     class136.field1875.method6298(ItemDefinition.field3457, Client.field684, Entity.field1874, class23.fontBold12, Client.fontsMap, class285.field3660, 269789148);
                  }

                  Login.field1189 = "Loaded world map";
                  Client.field680 = 150;
               }
            } else if (Client.field680 == 150) {
               class96.updateGameState(10);
            }
         }
      }
   }

   public void method5014() {
      if (this.field3602 != -1L) {
         this.field3607 = TimeUtils.getAdjustedTimeMillis() - this.field3602;
         this.field3602 = -1L;
      }

      ++this.field3601;
      this.field3605 = true;
   }

   public void method4993() {
      if (this.field3603 != -1L) {
         this.field3604 = TimeUtils.getAdjustedTimeMillis() - this.field3603;
         this.field3603 = -1L;
      }

   }

   public void method4996(int i_1) {
      this.field3602 = TimeUtils.getAdjustedTimeMillis();
      this.field3608 = i_1;
   }

   public void method5005() {
      this.field3603 = TimeUtils.getAdjustedTimeMillis();
   }

   public void method4998() {
      this.field3605 = false;
      this.field3609 = 0;
   }

   public void method4999(ByteBuffer class300_1) {
      long long_3 = this.field3604;
      long_3 /= 10L;
      if (long_3 < 0L) {
         long_3 = 0L;
      } else if (long_3 > 65535L) {
         long_3 = 65535L;
      }

      class300_1.writeShortBigEndian((int) long_3);
      long long_5 = this.field3607;
      long_5 /= 10L;
      if (long_5 < 0L) {
         long_5 = 0L;
      } else if (long_5 > 65535L) {
         long_5 = 65535L;
      }

      class300_1.writeShortBigEndian((int) long_5);
      long long_7 = this.field3606;
      long_7 /= 10L;
      if (long_7 < 0L) {
         long_7 = 0L;
      } else if (long_7 > 65535L) {
         long_7 = 65535L;
      }

      class300_1.writeShortBigEndian((int) long_7);
      class300_1.writeShortBigEndian(this.field3608);
      class300_1.writeShortBigEndian(this.field3609);
      class300_1.writeShortBigEndian(this.field3601);
      class300_1.writeShortBigEndian(this.field3610);
   }

   public void method5000() {
      this.method5014();
   }

   public static String method5015(CharSequence[] arr_0, int i_1, int i_2, int i_3) {
      if (i_2 == 0) {
         return "";
      } else if (i_2 == 1) {
         CharSequence charsequence_4 = arr_0[i_1];
         return charsequence_4 == null ? "null" : charsequence_4.toString();
      } else {
         int i_9 = i_2 + i_1;
         int i_5 = 0;

         for (int i_6 = i_1; i_6 < i_9; i_6++) {
            CharSequence charsequence_7 = arr_0[i_6];
            if (charsequence_7 == null) {
               i_5 += 4;
            } else {
               i_5 += charsequence_7.length();
            }
         }

         StringBuilder stringbuilder_10 = new StringBuilder(i_5);

         for (int i_11 = i_1; i_11 < i_9; i_11++) {
            CharSequence charsequence_8 = arr_0[i_11];
            if (charsequence_8 == null) {
               stringbuilder_10.append("null");
            } else {
               stringbuilder_10.append(charsequence_8);
            }
         }

         return stringbuilder_10.toString();
      }
   }

}
