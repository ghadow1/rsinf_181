public class class188 {

   static int[] field2339;

   static {
      new Object();
      field2339 = new int[33];
      field2339[0] = 0;
      int i_0 = 2;

      for (int i_1 = 1; i_1 < 33; i_1++) {
         field2339[i_1] = i_0 - 1;
         i_0 += i_0;
      }

   }

   static void method3643(Font font_0, Font font_1, byte b_2) {
      class235 class235_4;
      int i_5;
      int i_6;
      if (class31.field271 == null) {
         class235_4 = Client.field683;
         i_5 = class235_4.method4160("sl_back");
         i_6 = class235_4.method4161(i_5, "");
         class325[] arr_3 = class131.method3062(class235_4, i_5, i_6, -207318054);
         class31.field271 = arr_3;
      }

      class324[] arr_26;
      if (class57.field533 == null) {
         class235_4 = Client.field683;
         i_5 = class235_4.method4160("sl_flags");
         i_6 = class235_4.method4161(i_5, "");
         arr_26 = class289.method5281(class235_4, i_5, i_6, 2048583436);
         class57.field533 = arr_26;
      }

      if (class225.field3062 == null) {
         class235_4 = Client.field683;
         i_5 = class235_4.method4160("sl_arrows");
         i_6 = class235_4.method4161(i_5, "");
         arr_26 = class289.method5281(class235_4, i_5, i_6, 2025488546);
         class225.field3062 = arr_26;
      }

      if (class74.field1073 == null) {
         class235_4 = Client.field683;
         i_5 = class235_4.method4160("sl_stars");
         i_6 = class235_4.method4161(i_5, "");
         arr_26 = class289.method5281(class235_4, i_5, i_6, 1876500415);
         class74.field1073 = arr_26;
      }

      if (Login.field1206 == null) {
         Login.field1206 = SoundSystem.method4021(Client.field683, "leftarrow", "");
      }

      if (NPCDefinition.field3490 == null) {
         NPCDefinition.field3490 = SoundSystem.method4021(Client.field683, "rightarrow", "");
      }

      Rasterizer2D.fillRectangle(Login.field1208, 23, 765, 480, 0);
      Rasterizer2D.method6005(Login.field1208, 0, 125, 23, 12425273, 9135624);
      Rasterizer2D.method6005(Login.field1208 + 125, 0, 640, 23, 5197647, 2697513);
      font_0.method5341("Select a world", Login.field1208 + 62, 15, 0, -1);
      if (class74.field1073 != null) {
         class74.field1073[1].method6101(Login.field1208 + 140, 1);
         font_1.draw("Members only world", Login.field1208 + 152, 10, 16777215, -1);
         class74.field1073[0].method6101(Login.field1208 + 140, 12);
         font_1.draw("Free world", Login.field1208 + 152, 21, 16777215, -1);
      }

      if (class225.field3062 != null) {
         int i_23 = Login.field1208 + 280;
         if (World.field1026[0] == 0 && World.field1018[0] == 0) {
            class225.field3062[2].method6101(i_23, 4);
         } else {
            class225.field3062[0].method6101(i_23, 4);
         }

         if (World.field1026[0] == 0 && World.field1018[0] == 1) {
            class225.field3062[3].method6101(i_23 + 15, 4);
         } else {
            class225.field3062[1].method6101(i_23 + 15, 4);
         }

         font_0.draw("World", i_23 + 32, 17, 16777215, -1);
         int i_24 = Login.field1208 + 390;
         if (World.field1026[0] == 1 && World.field1018[0] == 0) {
            class225.field3062[2].method6101(i_24, 4);
         } else {
            class225.field3062[0].method6101(i_24, 4);
         }

         if (World.field1026[0] == 1 && World.field1018[0] == 1) {
            class225.field3062[3].method6101(i_24 + 15, 4);
         } else {
            class225.field3062[1].method6101(i_24 + 15, 4);
         }

         font_0.draw("Players", i_24 + 32, 17, 16777215, -1);
         i_5 = Login.field1208 + 500;
         if (World.field1026[0] == 2 && World.field1018[0] == 0) {
            class225.field3062[2].method6101(i_5, 4);
         } else {
            class225.field3062[0].method6101(i_5, 4);
         }

         if (World.field1026[0] == 2 && World.field1018[0] == 1) {
            class225.field3062[3].method6101(i_5 + 15, 4);
         } else {
            class225.field3062[1].method6101(i_5 + 15, 4);
         }

         font_0.draw("Location", i_5 + 32, 17, 16777215, -1);
         i_6 = Login.field1208 + 610;
         if (World.field1026[0] == 3 && World.field1018[0] == 0) {
            class225.field3062[2].method6101(i_6, 4);
         } else {
            class225.field3062[0].method6101(i_6, 4);
         }

         if (World.field1026[0] == 3 && World.field1018[0] == 1) {
            class225.field3062[3].method6101(i_6 + 15, 4);
         } else {
            class225.field3062[1].method6101(i_6 + 15, 4);
         }

         font_0.draw("Type", i_6 + 32, 17, 16777215, -1);
      }

      Rasterizer2D.fillRectangle(Login.field1208 + 708, 4, 50, 16, 0);
      font_1.method5341("Cancel", Login.field1208 + 708 + 25, 16, 16777215, -1);
      Login.field1207 = -1;
      if (class31.field271 != null) {
         byte b_28 = 88;
         byte b_29 = 19;
         i_5 = 765 / (b_28 + 1) - 1;
         i_6 = 480 / (b_29 + 1);

         int i_7;
         int i_8;
         do {
            i_7 = i_6;
            i_8 = i_5;
            if (i_6 * (i_5 - 1) >= World.field1022) {
               --i_5;
            }

            if (i_5 * (i_6 - 1) >= World.field1022) {
               --i_6;
            }

            if (i_5 * (i_6 - 1) >= World.field1022) {
               --i_6;
            }
         } while (i_7 != i_6 || i_8 != i_5);

         i_7 = (765 - i_5 * b_28) / (i_5 + 1);
         if (i_7 > 5) {
            i_7 = 5;
         }

         i_8 = (480 - i_6 * b_29) / (i_6 + 1);
         if (i_8 > 5) {
            i_8 = 5;
         }

         int i_9 = (765 - i_5 * b_28 - i_7 * (i_5 - 1)) / 2;
         int i_10 = (480 - b_29 * i_6 - i_8 * (i_6 - 1)) / 2;
         int i_11 = (i_6 + World.field1022 - 1) / i_6;
         Login.field1186 = i_11 - i_5;
         if (Login.field1206 != null && Login.field1190 > 0) {
            Login.field1206.method6101(8, ParamComposition.clientHeight / 2 - Login.field1206.field3893 / 2);
         }

         if (NPCDefinition.field3490 != null && Login.field1190 < Login.field1186) {
            NPCDefinition.field3490.method6101(class7.clientWidth - NPCDefinition.field3490.field3897 - 8, ParamComposition.clientHeight / 2 - NPCDefinition.field3490.field3893 / 2);
         }

         int i_12 = i_10 + 23;
         int i_13 = i_9 + Login.field1208;
         int i_14 = 0;
         boolean bool_15 = false;
         int i_16 = Login.field1190;

         int i_17;
         for (i_17 = i_6 * i_16; i_17 < World.field1022 && i_16 - Login.field1190 < i_5; i_17++) {
            World world_25 = World.field1031[i_17];
            boolean bool_19 = true;
            String string_20 = Integer.toString(world_25.field1030);
            if (world_25.field1030 == -1) {
               string_20 = "OFF";
               bool_19 = false;
            } else if (world_25.field1030 > 1980) {
               string_20 = "FULL";
               bool_19 = false;
            }

            int i_22 = 0;
            byte b_21;
            if (world_25.method1688()) {
               if (world_25.method1680()) {
                  b_21 = 7;
               } else {
                  b_21 = 6;
               }
            } else if (world_25.method1684()) {
               i_22 = 16711680;
               if (world_25.method1680()) {
                  b_21 = 5;
               } else {
                  b_21 = 4;
               }
            } else if (world_25.method1718()) {
               if (world_25.method1680()) {
                  b_21 = 3;
               } else {
                  b_21 = 2;
               }
            } else if (world_25.method1680()) {
               b_21 = 1;
            } else {
               b_21 = 0;
            }

            if (MouseHandler.MouseHandler_x >= i_13 && MouseHandler.MouseHandler_y >= i_12 && MouseHandler.MouseHandler_x < b_28 + i_13 && MouseHandler.MouseHandler_y < i_12 + b_29 && bool_19) {
               Login.field1207 = i_17;
               class31.field271[b_21].method6127(i_13, i_12, 128, 16777215);
               bool_15 = true;
            } else {
               class31.field271[b_21].method6121(i_13, i_12);
            }

            if (class57.field533 != null) {
               class57.field533[(world_25.method1680() ? 8 : 0) + world_25.field1032].method6101(i_13 + 29, i_12);
            }

            font_0.method5341(Integer.toString(world_25.id), i_13 + 15, b_29 / 2 + i_12 + 5, i_22, -1);
            font_1.method5341(string_20, i_13 + 60, b_29 / 2 + i_12 + 5, 268435455, -1);
            i_12 = i_12 + i_8 + b_29;
            ++i_14;
            if (i_14 >= i_6) {
               i_12 = i_10 + 23;
               i_13 = i_13 + i_7 + b_28;
               i_14 = 0;
               ++i_16;
            }
         }

         if (bool_15) {
            i_17 = font_1.method5417(World.field1031[Login.field1207].field1028) + 6;
            int i_18 = font_1.field3709 + 8;
            int i_27 = MouseHandler.MouseHandler_y + 25;
            if (i_18 + i_27 > 480) {
               i_27 = MouseHandler.MouseHandler_y - 25 - i_18;
            }

            Rasterizer2D.fillRectangle(MouseHandler.MouseHandler_x - i_17 / 2, i_27, i_17, i_18, 16777120);
            Rasterizer2D.drawRectangle(MouseHandler.MouseHandler_x - i_17 / 2, i_27, i_17, i_18, 0);
            font_1.method5341(World.field1031[Login.field1207].field1028, MouseHandler.MouseHandler_x, i_27 + font_1.field3709 + 4, 0, -1);
         }
      }

      class202.field2486.vmethod6077(0, 0);
   }

   public static final void method3644(String string_0, String string_1, int i_2, int i_3, int i_4, int i_5) {
      Entity.method3260(string_0, string_1, i_2, i_3, i_4, i_5, false);
   }

   static final String method3631(int i_0) {
      String string_2 = Integer.toString(i_0);

      for (int i_3 = string_2.length() - 3; i_3 > 0; i_3 -= 3) {
         string_2 = string_2.substring(0, i_3) + "," + string_2.substring(i_3);
      }

      return string_2.length() > 9 ? " " + class73.colorStartTag(65408) + string_2.substring(0, string_2.length() - 8) + "M" + " " + " (" + string_2 + ")" + "</col>" : (string_2.length() > 6 ? " " + class73.colorStartTag(16777215) + string_2.substring(0, string_2.length() - 4) + "K" + " " + " (" + string_2 + ")" + "</col>" : " " + class73.colorStartTag(16776960) + string_2 + "</col>");
   }

}
