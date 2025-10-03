public class class58 {

   public static class74 field546;
   int field542 = 0;
   final class235 field547;
   final int field539;

   class58(class235 class235_1, String string_2) {
      this.field547 = class235_1;
      this.field539 = class235_1.method4232();
   }

   boolean method1095() {
      this.field542 = 0;

      for (int i_2 = 0; i_2 < this.field539; i_2++) {
         if (!this.field547.method4268(i_2, (byte) 0) || this.field547.method4267(i_2)) {
            ++this.field542;
         }
      }

      return this.field542 >= this.field539;
   }

   static final void method1098(Widget widget_0, int i_1, int i_2, int i_3) {
      class186.method3619((byte) 39);
      class211 class211_5 = widget_0.method4040(false);
      if (class211_5 != null) {
         Rasterizer2D.setClip(i_1, i_2, class211_5.width + i_1, i_2 + class211_5.height);
         if (Client.minimapState != 2 && Client.minimapState != 5) {
            int i_6 = Client.camAngleY & 0x7ff;
            int i_7 = Client.localPlayer.x / 32 + 48;
            int i_8 = 464 - Client.localPlayer.y / 32;
            ParamDefinition.sceneMinimapSprite.drawRotatedMaskedCenteredAround(i_1, i_2, class211_5.width, class211_5.height, i_7, i_8, i_6, 256, class211_5.field2521, class211_5.field2520);

            int i_9;
            int i_10;
            int i_11;
            for (i_9 = 0; i_9 < Client.mapIconCount; i_9++) {
               i_10 = Client.mapIconXs[i_9] * 4 + 2 - Client.localPlayer.x / 32;
               i_11 = Client.mapIconYs[i_9] * 4 + 2 - Client.localPlayer.y / 32;
               MouseRecorder.drawSpriteOnMinimap(i_1, i_2, i_10, i_11, Client.field786[i_9], class211_5);
            }

            int i_12;
            int i_13;
            for (i_9 = 0; i_9 < 104; i_9++) {
               for (i_10 = 0; i_10 < 104; i_10++) {
                  NodeDeque nodeDeque_16 = Client.groundItems[ItemContainer_2.plane][i_9][i_10];
                  if (nodeDeque_16 != null) {
                     i_12 = i_9 * 4 + 2 - Client.localPlayer.x / 32;
                     i_13 = i_10 * 4 + 2 - Client.localPlayer.y / 32;
                     MouseRecorder.drawSpriteOnMinimap(i_1, i_2, i_12, i_13, class221.field2746[0], class211_5);
                  }
               }
            }

            for (i_9 = 0; i_9 < Client.npcCount; i_9++) {
               NPC NPC_17 = Client.npcs[Client.npcIndices[i_9]];
               if (NPC_17 != null && NPC_17.vmethod1965()) {
                  NPCDefinition NPCDefinition_19 = NPC_17.definition;
                  if (NPCDefinition_19 != null && NPCDefinition_19.field3476 != null) {
                     NPCDefinition_19 = NPCDefinition_19.transform();
                  }

                  if (NPCDefinition_19 != null && NPCDefinition_19.field3493 && NPCDefinition_19.field3496) {
                     i_12 = NPC_17.x / 32 - Client.localPlayer.x / 32;
                     i_13 = NPC_17.y / 32 - Client.localPlayer.y / 32;
                     MouseRecorder.drawSpriteOnMinimap(i_1, i_2, i_12, i_13, class221.field2746[1], class211_5);
                  }
               }
            }

            i_9 = class89.field1255;
            int[] ints_20 = class89.field1257;

            for (i_11 = 0; i_11 < i_9; i_11++) {
               class66 class66_18 = Client.field909[ints_20[i_11]];
               if (class66_18 != null && class66_18.vmethod1965() && !class66_18.field628 && class66_18 != Client.localPlayer) {
                  i_13 = class66_18.x / 32 - Client.localPlayer.x / 32;
                  int i_14 = class66_18.y / 32 - Client.localPlayer.y / 32;
                  boolean bool_15 = false;
                  if (Client.localPlayer.field632 != 0 && class66_18.field632 != 0 && class66_18.field632 == Client.localPlayer.field632) {
                     bool_15 = true;
                  }

                  if (class66_18.method1181(-1900430541)) {
                     MouseRecorder.drawSpriteOnMinimap(i_1, i_2, i_13, i_14, class221.field2746[3], class211_5);
                  } else if (bool_15) {
                     MouseRecorder.drawSpriteOnMinimap(i_1, i_2, i_13, i_14, class221.field2746[4], class211_5);
                  } else if (class66_18.method1184((byte) 12)) {
                     MouseRecorder.drawSpriteOnMinimap(i_1, i_2, i_13, i_14, class221.field2746[5], class211_5);
                  } else {
                     MouseRecorder.drawSpriteOnMinimap(i_1, i_2, i_13, i_14, class221.field2746[2], class211_5);
                  }
               }
            }

            if (Client.field708 != 0 && Client.field881 % 20 < 10) {
               if (Client.field708 == 1 && Client.field824 >= 0 && Client.field824 < Client.npcs.length) {
                  NPC NPC_21 = Client.npcs[Client.field824];
                  if (NPC_21 != null) {
                     i_12 = NPC_21.x / 32 - Client.localPlayer.x / 32;
                     i_13 = NPC_21.y / 32 - Client.localPlayer.y / 32;
                     class48.method810(i_1, i_2, i_12, i_13, WorldMapSection1.mapMarkerSprites[1], class211_5, -1460314936);
                  }
               }

               if (Client.field708 == 2) {
                  i_11 = Client.field737 * 4 - class196.field2389 * 4 + 2 - Client.localPlayer.x / 32;
                  i_12 = Client.field777 * 4 - class1.field1 * 4 + 2 - Client.localPlayer.y / 32;
                  class48.method810(i_1, i_2, i_11, i_12, WorldMapSection1.mapMarkerSprites[1], class211_5, -1460314936);
               }

               if (Client.field708 == 10 && Client.field689 >= 0 && Client.field689 < Client.field909.length) {
                  class66 class66_22 = Client.field909[Client.field689];
                  if (class66_22 != null) {
                     i_12 = class66_22.x / 32 - Client.localPlayer.x / 32;
                     i_13 = class66_22.y / 32 - Client.localPlayer.y / 32;
                     class48.method810(i_1, i_2, i_12, i_13, WorldMapSection1.mapMarkerSprites[1], class211_5, -1460314936);
                  }
               }
            }

            if (Client.destinationX != 0) {
               i_11 = Client.destinationX * 4 + 2 - Client.localPlayer.x / 32;
               i_12 = Client.destinationY * 4 + 2 - Client.localPlayer.y / 32;
               MouseRecorder.drawSpriteOnMinimap(i_1, i_2, i_11, i_12, WorldMapSection1.mapMarkerSprites[0], class211_5);
            }

            if (!Client.localPlayer.field628) {
               Rasterizer2D.fillRectangle(class211_5.width / 2 + i_1 - 1, class211_5.height / 2 + i_2 - 1, 3, 3, 16777215);
            }
         } else {
            Rasterizer2D.fillMaskedRectangle(i_1, i_2, 0, class211_5.field2521, class211_5.field2520);
         }

         Client.field861[i_3] = true;
      }
   }

   public static boolean method1094(class233 class233_0, class233 class233_1, class233 class233_2, class198 class198_3, byte b_4) {
      class197.field2406 = class233_0;
      class197.field2400 = class233_1;
      class197.field2401 = class233_2;
      MouseRecorder.field1099 = class198_3;
      return true;
   }

   static int method1100(int i_0, class92 class92_1, boolean bool_2, byte b_3) {
      Widget widget_4;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         widget_4 = WorldMapElement.getWidget(MouseRecorder.field1098[--class70.field1014]);
      } else {
         widget_4 = bool_2 ? MouseRecorder.field1111 : class207.field2507;
      }

      if (i_0 == 1927) {
         if (MouseRecorder.field1106 >= 10) {
            throw new RuntimeException();
         } else if (widget_4.field2679 == null) {
            return 0;
         } else {
            class62 class62_5 = new class62();
            class62_5.field575 = widget_4;
            class62_5.field581 = widget_4.field2679;
            class62_5.field583 = MouseRecorder.field1106 + 1;
            Client.field854.method4917(class62_5);
            return 1;
         }
      } else {
         return 2;
      }
   }

   static Widget method1099(Widget widget_0, int i_1) {
      Widget widget_3 = widget_0;
      int i_4 = class32.method545(class268.method4987(widget_0));
      Widget widget_2;
      if (i_4 == 0) {
         widget_2 = null;
      } else {
         int i_5 = 0;

         while (true) {
            if (i_5 >= i_4) {
               widget_2 = widget_3;
               break;
            }

            widget_3 = WorldMapElement.getWidget(widget_3.field2583);
            if (widget_3 == null) {
               widget_2 = null;
               break;
            }

            ++i_5;
         }
      }

      Widget widget_6 = widget_2;
      if (widget_2 == null) {
         widget_6 = widget_0.field2645;
      }

      return widget_6;
   }

}
