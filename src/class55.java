public final class class55 {

   static int field501;
   static byte[][][] field504;
   static byte[][][] field505;
   static byte[][][] field506;
   static int[][] field515;
   static int[] field508;
   static int[] field507;
   static int[][][] field516 = new int[4][105][105];
   static byte[][][] field502 = new byte[4][104][104];
   static int field503 = 99;
   static final int[] field512 = new int[] {1, 2, 4, 8};
   static final int[] field513 = new int[] {16, 32, 64, 128};
   static final int[] field514 = new int[] {1, 0, -1, 0};
   static final int[] field520 = new int[] {0, -1, 0, 1};
   static final int[] field509 = new int[] {1, -1, -1, 1};
   static final int[] field517 = new int[] {-1, -1, 1, 1};
   static int field519 = (int)(Math.random() * 17.0D) - 8;
   static int field510 = (int)(Math.random() * 33.0D) - 16;

   static final void method1084(boolean bool_0, class299 class299_1, int i_2) {
      client.field798 = bool_0;
      int i_3;
      int i_4;
      int i_6;
      int i_7;
      int i_8;
      int i_9;
      if (!client.field798) {
         i_3 = class299_1.readShort();
         i_4 = class299_1.method5518();
         int i_5 = class299_1.readShortUBigEndian();
         class29.field255 = new int[i_5][4];

         for (i_6 = 0; i_6 < i_5; i_6++) {
            for (i_7 = 0; i_7 < 4; i_7++) {
               class29.field255[i_6][i_7] = class299_1.readIntMedEndian();
            }
         }

         class206.field2501 = new int[i_5];
         class88.field1248 = new int[i_5];
         class22.field178 = new int[i_5];
         class13.field90 = new byte[i_5][];
         class80.field1145 = new byte[i_5][];
         boolean bool_17 = false;
         if ((i_4 / 8 == 48 || i_4 / 8 == 49) && i_3 / 8 == 48) {
            bool_17 = true;
         }

         if (i_4 / 8 == 48 && i_3 / 8 == 148) {
            bool_17 = true;
         }

         i_5 = 0;

         for (i_7 = (i_4 - 6) / 8; i_7 <= (i_4 + 6) / 8; i_7++) {
            for (i_8 = (i_3 - 6) / 8; i_8 <= (i_3 + 6) / 8; i_8++) {
               i_9 = i_8 + (i_7 << 8);
               if (!bool_17 || i_8 != 49 && i_8 != 149 && i_8 != 147 && i_7 != 50 && (i_7 != 49 || i_8 != 47)) {
                  class206.field2501[i_5] = i_9;
                  class88.field1248[i_5] = class35.field307.method4160("m" + i_7 + "_" + i_8, 774222007);
                  class22.field178[i_5] = class35.field307.method4160("l" + i_7 + "_" + i_8, 1023832758);
                  ++i_5;
               }
            }
         }

         class153.method3399(i_4, i_3, true, 240895507);
      } else {
         i_3 = class299_1.method5518();
         i_4 = class299_1.readShort();
         boolean bool_16 = class299_1.method5504() == 1;
         i_6 = class299_1.readShortUBigEndian();
         class299_1.method5438();

         int i_10;
         for (i_7 = 0; i_7 < 4; i_7++) {
            for (i_8 = 0; i_8 < 13; i_8++) {
               for (i_9 = 0; i_9 < 13; i_9++) {
                  i_10 = class299_1.method5445(1);
                  if (i_10 == 1) {
                     client.field712[i_7][i_8][i_9] = class299_1.method5445(26);
                  } else {
                     client.field712[i_7][i_8][i_9] = -1;
                  }
               }
            }
         }

         class299_1.method5446();
         class29.field255 = new int[i_6][4];

         for (i_7 = 0; i_7 < i_6; i_7++) {
            for (i_8 = 0; i_8 < 4; i_8++) {
               class29.field255[i_7][i_8] = class299_1.readIntMedEndian();
            }
         }

         class206.field2501 = new int[i_6];
         class88.field1248 = new int[i_6];
         class22.field178 = new int[i_6];
         class13.field90 = new byte[i_6][];
         class80.field1145 = new byte[i_6][];
         i_6 = 0;

         for (i_7 = 0; i_7 < 4; i_7++) {
            for (i_8 = 0; i_8 < 13; i_8++) {
               for (i_9 = 0; i_9 < 13; i_9++) {
                  i_10 = client.field712[i_7][i_8][i_9];
                  if (i_10 != -1) {
                     int i_11 = i_10 >> 14 & 0x3ff;
                     int i_12 = i_10 >> 3 & 0x7ff;
                     int i_13 = (i_11 / 8 << 8) + i_12 / 8;

                     int i_14;
                     for (i_14 = 0; i_14 < i_6; i_14++) {
                        if (class206.field2501[i_14] == i_13) {
                           i_13 = -1;
                           break;
                        }
                     }

                     if (i_13 != -1) {
                        class206.field2501[i_6] = i_13;
                        i_14 = i_13 >> 8 & 0xff;
                        int i_15 = i_13 & 0xff;
                        class88.field1248[i_6] = class35.field307.method4160("m" + i_14 + "_" + i_15, 2048004806);
                        class22.field178[i_6] = class35.field307.method4160("l" + i_14 + "_" + i_15, 1148766449);
                        ++i_6;
                     }
                  }
               }
            }
         }

         class153.method3399(i_4, i_3, !bool_16, -359848032);
      }

   }

}
