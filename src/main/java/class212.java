public class class212 {

   public static int[] field2523;
   static int[] field2527 = new int[32];
   public static int[] field2524;
   public static int[] var_configurations;

   static {
      int i_0 = 2;

      for (int i_1 = 0; i_1 < 32; i_1++) {
         field2527[i_1] = i_0 - 1;
         i_0 += i_0;
      }

      field2524 = new int[4000];
      var_configurations = new int[4000];
   }

   static final int method3969(Widget widget_0, int i_1) {
      if (widget_0.field2682 != null && i_1 < widget_0.field2682.length) {
         try {
            int[] ints_3 = widget_0.field2682[i_1];
            int i_4 = 0;
            int i_5 = 0;
            byte b_6 = 0;

            while (true) {
               int i_7 = ints_3[i_5++];
               int i_8 = 0;
               byte b_9 = 0;
               if (i_7 == 0) {
                  return i_4;
               }

               if (i_7 == 1) {
                  i_8 = Client.field760[ints_3[i_5++]];
               }

               if (i_7 == 2) {
                  i_8 = Client.field787[ints_3[i_5++]];
               }

               if (i_7 == 3) {
                  i_8 = Client.field788[ints_3[i_5++]];
               }

               int i_10;
               Widget widget_11;
               int i_12;
               int i_13;
               if (i_7 == 4) {
                  i_10 = ints_3[i_5++] << 16;
                  i_10 += ints_3[i_5++];
                  widget_11 = WorldMapElement.getWidget(i_10);
                  i_12 = ints_3[i_5++];
                  if (i_12 != -1 && (!item.getDefinition(i_12).isMembersOnly || Client.field655)) {
                     for (i_13 = 0; i_13 < widget_11.field2560.length; i_13++) {
                        if (i_12 + 1 == widget_11.field2560[i_13]) {
                           i_8 += widget_11.field2705[i_13];
                        }
                     }
                  }
               }

               if (i_7 == 5) {
                  i_8 = var_configurations[ints_3[i_5++]];
               }

               if (i_7 == 6) {
                  i_8 = class221.field2743[Client.field787[ints_3[i_5++]] - 1];
               }

               if (i_7 == 7) {
                  i_8 = var_configurations[ints_3[i_5++]] * 100 / 46875;
               }

               if (i_7 == 8) {
                  i_8 = Client.localPlayer.field618;
               }

               if (i_7 == 9) {
                  for (i_10 = 0; i_10 < 25; i_10++) {
                     if (class221.field2744[i_10]) {
                        i_8 += Client.field787[i_10];
                     }
                  }
               }

               if (i_7 == 10) {
                  i_10 = ints_3[i_5++] << 16;
                  i_10 += ints_3[i_5++];
                  widget_11 = WorldMapElement.getWidget(i_10);
                  i_12 = ints_3[i_5++];
                  if (i_12 != -1 && (!item.getDefinition(i_12).isMembersOnly || Client.field655)) {
                     for (i_13 = 0; i_13 < widget_11.field2560.length; i_13++) {
                        if (i_12 + 1 == widget_11.field2560[i_13]) {
                           i_8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (i_7 == 11) {
                  i_8 = Client.field910;
               }

               if (i_7 == 12) {
                  i_8 = Client.field823;
               }

               if (i_7 == 13) {
                  i_10 = var_configurations[ints_3[i_5++]];
                  int i_14 = ints_3[i_5++];
                  i_8 = (i_10 & 1 << i_14) != 0 ? 1 : 0;
               }

               if (i_7 == 14) {
                  i_10 = ints_3[i_5++];
                  i_8 = class67.method1237(i_10);
               }

               if (i_7 == 15) {
                  b_9 = 1;
               }

               if (i_7 == 16) {
                  b_9 = 2;
               }

               if (i_7 == 17) {
                  b_9 = 3;
               }

               if (i_7 == 18) {
                  i_8 = (Client.localPlayer.x >> 7) + class196.field2389;
               }

               if (i_7 == 19) {
                  i_8 = (Client.localPlayer.y >> 7) + SceneNode.field1;
               }

               if (i_7 == 20) {
                  i_8 = ints_3[i_5++];
               }

               if (b_9 == 0) {
                  if (b_6 == 0) {
                     i_4 += i_8;
                  }

                  if (b_6 == 1) {
                     i_4 -= i_8;
                  }

                  if (b_6 == 2 && i_8 != 0) {
                     i_4 /= i_8;
                  }

                  if (b_6 == 3) {
                     i_4 *= i_8;
                  }

                  b_6 = 0;
               } else {
                  b_6 = b_9;
               }
            }
         } catch (Exception exception_15) {
            return -1;
         }
      } else {
         return -2;
      }
   }

}
