public class class202 extends class115 {

   public static class322 field2486;
   class261 field2484 = new class261();
   class98 field2487 = new class98();
   class198 field2485;

   class202(class198 class198_1) {
      this.field2485 = class198_1;
   }

   protected void vmethod3893(int[] ints_1, int i_2, int i_3) {
      this.field2487.vmethod3893(ints_1, i_2, i_3);

      for (MusicPatchNode musicPatchNode_6 = (MusicPatchNode) this.field2484.method4892(); musicPatchNode_6 != null; musicPatchNode_6 = (MusicPatchNode) this.field2484.method4894()) {
         if (!this.field2485.method3739(musicPatchNode_6)) {
            int i_4 = i_2;
            int i_5 = i_3;

            do {
               if (i_5 <= musicPatchNode_6.field2455) {
                  this.method3895(musicPatchNode_6, ints_1, i_4, i_5, i_4 + i_5, 1383437948);
                  musicPatchNode_6.field2455 -= i_5;
                  break;
               }

               this.method3895(musicPatchNode_6, ints_1, i_4, musicPatchNode_6.field2455, i_5 + i_4, 1316254184);
               i_4 += musicPatchNode_6.field2455;
               i_5 -= musicPatchNode_6.field2455;
            } while (!this.field2485.method3740(musicPatchNode_6, ints_1, i_4, i_5, -1512694949));
         }
      }

   }

   protected void vmethod3906(int i_1) {
      this.field2487.vmethod3906(i_1);

      for (MusicPatchNode musicPatchNode_3 = (MusicPatchNode) this.field2484.method4892(); musicPatchNode_3 != null; musicPatchNode_3 = (MusicPatchNode) this.field2484.method4894()) {
         if (!this.field2485.method3739(musicPatchNode_3)) {
            int i_2 = i_1;

            do {
               if (i_2 <= musicPatchNode_3.field2455) {
                  this.method3896(musicPatchNode_3, i_2, 1166888342);
                  musicPatchNode_3.field2455 -= i_2;
                  break;
               }

               this.method3896(musicPatchNode_3, musicPatchNode_3.field2455, 1166888342);
               i_2 -= musicPatchNode_3.field2455;
            } while (!this.field2485.method3740(musicPatchNode_3, (int[]) null, 0, i_2, -176973860));
         }
      }

   }

   protected class115 vmethod3891() {
      MusicPatchNode musicPatchNode_1;
      do {
         musicPatchNode_1 = (MusicPatchNode) this.field2484.method4894();
         if (musicPatchNode_1 == null) {
            return null;
         }
      } while (musicPatchNode_1.field2454 == null);

      return musicPatchNode_1.field2454;
   }

   void method3896(MusicPatchNode musicPatchNode_1, int i_2, int i_3) {
      if ((this.field2485.field2421[musicPatchNode_1.field2440] & 0x4) != 0 && musicPatchNode_1.field2436 < 0) {
         int i_4 = this.field2485.field2408[musicPatchNode_1.field2440] / class172.field2078;
         int i_5 = (i_4 + 1048575 - musicPatchNode_1.field2444) / i_4;
         musicPatchNode_1.field2444 = i_4 * i_2 + musicPatchNode_1.field2444 & 0xfffff;
         if (i_5 <= i_2) {
            if (this.field2485.field2410[musicPatchNode_1.field2440] == 0) {
               musicPatchNode_1.field2454 = class113.method2524(musicPatchNode_1.rawSound, musicPatchNode_1.field2454.method2539(), musicPatchNode_1.field2454.method2531(), musicPatchNode_1.field2454.method2541());
            } else {
               musicPatchNode_1.field2454 = class113.method2524(musicPatchNode_1.rawSound, musicPatchNode_1.field2454.method2539(), 0, musicPatchNode_1.field2454.method2541());
               this.field2485.method3767(musicPatchNode_1, musicPatchNode_1.field2437.field2482[musicPatchNode_1.field2450] < 0, (byte) -58);
            }

            if (musicPatchNode_1.field2437.field2482[musicPatchNode_1.field2450] < 0) {
               musicPatchNode_1.field2454.method2626(-1);
            }

            i_2 = musicPatchNode_1.field2444 / i_4;
         }
      }

      musicPatchNode_1.field2454.vmethod3906(i_2);
   }

   void method3895(MusicPatchNode musicPatchNode_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6) {
      if ((this.field2485.field2421[musicPatchNode_1.field2440] & 0x4) != 0 && musicPatchNode_1.field2436 < 0) {
         int i_7 = this.field2485.field2408[musicPatchNode_1.field2440] / class172.field2078;

         while (true) {
            int i_8 = (i_7 + 1048575 - musicPatchNode_1.field2444) / i_7;
            if (i_8 > i_4) {
               musicPatchNode_1.field2444 += i_4 * i_7;
               break;
            }

            musicPatchNode_1.field2454.vmethod3893(ints_2, i_3, i_8);
            i_3 += i_8;
            i_4 -= i_8;
            musicPatchNode_1.field2444 += i_7 * i_8 - 1048576;
            int i_9 = class172.field2078 / 100;
            int i_10 = 262144 / i_7;
            if (i_10 < i_9) {
               i_9 = i_10;
            }

            class113 class113_11 = musicPatchNode_1.field2454;
            if (this.field2485.field2410[musicPatchNode_1.field2440] == 0) {
               musicPatchNode_1.field2454 = class113.method2524(musicPatchNode_1.rawSound, class113_11.method2539(), class113_11.method2531(), class113_11.method2541());
            } else {
               musicPatchNode_1.field2454 = class113.method2524(musicPatchNode_1.rawSound, class113_11.method2539(), 0, class113_11.method2541());
               this.field2485.method3767(musicPatchNode_1, musicPatchNode_1.field2437.field2482[musicPatchNode_1.field2450] < 0, (byte) -37);
               musicPatchNode_1.field2454.method2535(i_9, class113_11.method2531());
            }

            if (musicPatchNode_1.field2437.field2482[musicPatchNode_1.field2450] < 0) {
               musicPatchNode_1.field2454.method2626(-1);
            }

            class113_11.method2540(i_9);
            class113_11.vmethod3893(ints_2, i_3, i_5 - i_3);
            if (class113_11.method2585()) {
               this.field2487.method2286(class113_11);
            }
         }
      }

      musicPatchNode_1.field2454.vmethod3893(ints_2, i_3, i_4);
   }

   protected class115 vmethod3894() {
      MusicPatchNode musicPatchNode_1 = (MusicPatchNode) this.field2484.method4892();
      return (class115) (musicPatchNode_1 == null ? null : (musicPatchNode_1.field2454 != null ? musicPatchNode_1.field2454 : this.vmethod3891())) ;
   }

   protected int vmethod3892() {
      return 0;
   }

   static void changeWorld(World world_0) {
      if (world_0.method1680() != Client.field655) {
         Client.field655 = world_0.method1680();
         boolean bool_2 = world_0.method1680();
         if (bool_2 != class134.field1868) {
            ItemDefinition.field3407.method3323();
            ItemDefinition.field3408.method3323();
            ItemDefinition.field3445.method3323();
            class134.field1868 = bool_2;
         }
      }

      class73.field1068 = world_0.host;
      Client.field807 = world_0.id;
      Client.field653 = world_0.properties;
      class190.field2358 = Client.field703 == 0 ? 43594 : world_0.id + 40000;
      class132.field1800 = Client.field703 == 0 ? 443 : world_0.id + 50000;
      class90.field1266 = class190.field2358;
   }

   static final void method3912(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
      int i_7 = i_2 - i_0;
      int i_8 = i_3 - i_1;
      int i_9 = i_7 >= 0 ? i_7 : -i_7;
      int i_10 = i_8 >= 0 ? i_8 : -i_8;
      int i_11 = i_9;
      if (i_9 < i_10) {
         i_11 = i_10;
      }

      if (i_11 != 0) {
         int i_12 = (i_7 << 16) / i_11;
         int i_13 = (i_8 << 16) / i_11;
         if (i_13 <= i_12) {
            i_12 = -i_12;
         } else {
            i_13 = -i_13;
         }

         int i_14 = i_5 * i_13 >> 17;
         int i_15 = i_5 * i_13 + 1 >> 17;
         int i_16 = i_5 * i_12 >> 17;
         int i_17 = i_5 * i_12 + 1 >> 17;
         i_0 -= class321.Rasterizer2D_xClipStart;
         i_1 -= class321.Rasterizer2D_yClipStart;
         int i_18 = i_0 + i_14;
         int i_19 = i_0 - i_15;
         int i_20 = i_0 + i_7 - i_15;
         int i_21 = i_0 + i_7 + i_14;
         int i_22 = i_16 + i_1;
         int i_23 = i_1 - i_17;
         int i_24 = i_8 + i_1 - i_17;
         int i_25 = i_8 + i_16 + i_1;
         class130.method2981(i_18, i_19, i_20);
         class130.method3007(i_22, i_23, i_24, i_18, i_19, i_20, i_4);
         class130.method2981(i_18, i_20, i_21);
         class130.method3007(i_22, i_24, i_25, i_18, i_20, i_21, i_4);
      }
   }

}
