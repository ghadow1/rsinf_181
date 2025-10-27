public final class class227 {

   static void method4124(class66 class66_0, boolean bool_1, byte b_2) {
      if (class66_0 != null && class66_0.vmethod1965() && !class66_0.field628) {
         class66_0.field634 = false;
         if ((Client.resizeSettings2 && class89.field1255 > 50 || class89.field1255 > 200) && bool_1 && class66_0.field978 == class66_0.field1004) {
            class66_0.field634 = true;
         }

         int i_3 = class66_0.x >> 7;
         int i_4 = class66_0.y >> 7;
         if (i_3 >= 0 && i_3 < 104 && i_4 >= 0 && i_4 < 104) {
            long long_5 = Tile.method2854(0, 0, 0, false, class66_0.field637);
            if (class66_0.field626 != null && Client.cycle >= class66_0.field614 && Client.cycle < class66_0.field622) {
               class66_0.field634 = false;
               class66_0.field623 = MusicPatchPcmStream.getTileHeight(class66_0.x, class66_0.y, WorldMapRectangle.plane);
               class66_0.field953 = Client.cycle;
               class5.scene.method3079(WorldMapRectangle.plane, class66_0.x, class66_0.y, class66_0.field623, 60, class66_0, class66_0.field950, long_5, class66_0.field627, class66_0.field625, class66_0.field612, class66_0.field630);
            } else {
               if ((class66_0.x & 0x7f) == 64 && (class66_0.y & 0x7f) == 64) {
                  if (Client.field750[i_3][i_4] == Client.field751) {
                     return;
                  }

                  Client.field750[i_3][i_4] = Client.field751;
               }

               class66_0.field623 = MusicPatchPcmStream.getTileHeight(class66_0.x, class66_0.y, WorldMapRectangle.plane);
               class66_0.field953 = Client.cycle;
               class5.scene.method3077(WorldMapRectangle.plane, class66_0.x, class66_0.y, class66_0.field623, 60, class66_0, class66_0.field950, long_5, class66_0.field967);
            }
         }
      }

   }

}
