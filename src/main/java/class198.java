public class class198 extends class115 {

   int field2409 = 256;
   int field2426 = 1000000;
   int[] field2411 = new int[16];
   int[] field2412 = new int[16];
   int[] field2422 = new int[16];
   int[] field2414 = new int[16];
   int[] field2413 = new int[16];
   int[] field2415 = new int[16];
   int[] field2429 = new int[16];
   int[] field2418 = new int[16];
   int[] field2419 = new int[16];
   int[] field2421 = new int[16];
   int[] field2424 = new int[16];
   int[] field2423 = new int[16];
   int[] field2410 = new int[16];
   int[] field2425 = new int[16];
   int[] field2408 = new int[16];
   MusicPatchNode[][] field2427 = new MusicPatchNode[16][128];
   MusicPatchNode[][] field2428 = new MusicPatchNode[16][128];
   class200 field2416 = new class200();
   class202 field2435 = new class202(this);
   class318 field2417 = new class318(128);
   long field2433;
   boolean field2430;
   int field2431;
   int field2432;
   long field2434;

   public class198() {
      this.method3726();
   }

   void method3824(int i_1, int i_2) {
      this.field2414[i_1] = i_2;
      this.field2415[i_1] = i_2 & ~0x7f;
      this.method3716(i_1, i_2, (byte) 5);
   }

   void method3729(int i_1, int i_2) {
      MusicPatchNode musicPatchNode_5 = this.field2427[i_1][i_2];
      if (musicPatchNode_5 != null) {
         this.field2427[i_1][i_2] = null;
         if ((this.field2421[i_1] & 0x2) != 0) {
            for (MusicPatchNode musicPatchNode_6 = (MusicPatchNode) this.field2435.field2484.method4892(); musicPatchNode_6 != null; musicPatchNode_6 = (MusicPatchNode) this.field2435.field2484.method4894()) {
               if (musicPatchNode_6.field2440 == musicPatchNode_5.field2440 && musicPatchNode_6.field2436 < 0 && musicPatchNode_5 != musicPatchNode_6) {
                  musicPatchNode_5.field2436 = 0;
                  break;
               }
            }
         } else {
            musicPatchNode_5.field2436 = 0;
         }

      }
   }

   void method3723(int i_1) {
      for (MusicPatchNode musicPatchNode_3 = (MusicPatchNode) this.field2435.field2484.method4892(); musicPatchNode_3 != null; musicPatchNode_3 = (MusicPatchNode) this.field2435.field2484.method4894()) {
         if (i_1 < 0 || musicPatchNode_3.field2440 == i_1) {
            if (musicPatchNode_3.field2454 != null) {
               musicPatchNode_3.field2454.method2540(CollisionMap.field2078 / 100);
               if (musicPatchNode_3.field2454.method2585()) {
                  this.field2435.field2487.method2286(musicPatchNode_3.field2454);
               }

               musicPatchNode_3.method3826();
            }

            if (musicPatchNode_3.field2436 < 0) {
               this.field2427[musicPatchNode_3.field2440][musicPatchNode_3.field2450] = null;
            }

            musicPatchNode_3.unlink();
         }
      }

   }

   public synchronized void method3712() {
      this.field2416.method3831();
      this.method3726();
   }

   public static boolean method3811() {
      class97 class97_1 = (class97) class96.field1324.method4838();
      return class97_1 != null;
   }

   void method3717(int i_1, int i_2, int i_3, int i_4) {
      this.method3729(i_1, i_2);
      if ((this.field2421[i_1] & 0x2) != 0) {
         for (MusicPatchNode musicPatchNode_5 = (MusicPatchNode) this.field2435.field2484.method4893(); musicPatchNode_5 != null; musicPatchNode_5 = (MusicPatchNode) this.field2435.field2484.method4887()) {
            if (musicPatchNode_5.field2440 == i_1 && musicPatchNode_5.field2436 < 0) {
               this.field2427[i_1][musicPatchNode_5.field2450] = null;
               this.field2427[i_1][i_2] = musicPatchNode_5;
               int i_6 = (musicPatchNode_5.field2445 * musicPatchNode_5.field2446 >> 12) + musicPatchNode_5.field2441;
               musicPatchNode_5.field2441 += i_2 - musicPatchNode_5.field2450 << 8;
               musicPatchNode_5.field2445 = i_6 - musicPatchNode_5.field2441;
               musicPatchNode_5.field2446 = 4096;
               musicPatchNode_5.field2450 = i_2;
               return;
            }
         }
      }

      SceneSound sceneSound_10 = (SceneSound) this.field2417.method5952((long)this.field2413[i_1]);
      if (sceneSound_10 != null) {
         RawSound rawSound_9 = sceneSound_10.field2474[i_2];
         if (rawSound_9 != null) {
            MusicPatchNode musicPatchNode_7 = new MusicPatchNode();
            musicPatchNode_7.field2440 = i_1;
            musicPatchNode_7.field2437 = sceneSound_10;
            musicPatchNode_7.rawSound = rawSound_9;
            musicPatchNode_7.field2452 = sceneSound_10.field2481[i_2];
            musicPatchNode_7.field2438 = sceneSound_10.field2479[i_2];
            musicPatchNode_7.field2450 = i_2;
            musicPatchNode_7.field2442 = i_3 * i_3 * sceneSound_10.field2476[i_2] * sceneSound_10.field2475 + 1024 >> 11;
            musicPatchNode_7.field2443 = sceneSound_10.field2477[i_2] & 0xff;
            musicPatchNode_7.field2441 = (i_2 << 8) - (sceneSound_10.field2482[i_2] & 0x7fff);
            musicPatchNode_7.field2447 = 0;
            musicPatchNode_7.field2448 = 0;
            musicPatchNode_7.field2449 = 0;
            musicPatchNode_7.field2436 = -1;
            musicPatchNode_7.field2451 = 0;
            if (this.field2410[i_1] == 0) {
               musicPatchNode_7.field2454 = class113.method2524(rawSound_9, this.method3730(musicPatchNode_7), this.method3731(musicPatchNode_7), this.method3732(musicPatchNode_7));
            } else {
               musicPatchNode_7.field2454 = class113.method2524(rawSound_9, this.method3730(musicPatchNode_7), 0, this.method3732(musicPatchNode_7));
               this.method3767(musicPatchNode_7, sceneSound_10.field2482[i_2] < 0, (byte) -7);
            }

            if (sceneSound_10.field2482[i_2] < 0) {
               musicPatchNode_7.field2454.method2626(-1);
            }

            if (musicPatchNode_7.field2438 >= 0) {
               MusicPatchNode musicPatchNode_8 = this.field2428[i_1][musicPatchNode_7.field2438];
               if (musicPatchNode_8 != null && musicPatchNode_8.field2436 < 0) {
                  this.field2427[i_1][musicPatchNode_8.field2450] = null;
                  musicPatchNode_8.field2436 = 0;
               }

               this.field2428[i_1][musicPatchNode_7.field2438] = musicPatchNode_7;
            }

            this.field2435.field2484.addFirst(musicPatchNode_7);
            this.field2427[i_1][i_2] = musicPatchNode_7;
         }
      }
   }

   void method3788() {
   }

   void method3724(int i_1) {
      if (i_1 >= 0) {
         this.field2411[i_1] = 12800;
         this.field2412[i_1] = 8192;
         this.field2422[i_1] = 16383;
         this.field2429[i_1] = 8192;
         this.field2418[i_1] = 0;
         this.field2419[i_1] = 8192;
         this.method3715(i_1);
         this.method3784(i_1);
         this.field2421[i_1] = 0;
         this.field2424[i_1] = 32767;
         this.field2423[i_1] = 256;
         this.field2410[i_1] = 0;
         this.method3754(i_1, 8192, (byte) 14);
      } else {
         for (i_1 = 0; i_1 < 16; i_1++) {
            this.method3724(i_1);
         }

      }
   }

   void method3716(int i_1, int i_2, byte b_3) {
      if (i_2 != this.field2413[i_1]) {
         this.field2413[i_1] = i_2;

         for (int i_4 = 0; i_4 < 128; i_4++) {
            this.field2428[i_1][i_4] = null;
         }
      }

   }

   protected synchronized void vmethod3893(int[] ints_1, int i_2, int i_3) {
      if (this.field2416.method3833()) {
         int i_4 = this.field2416.field2463 * this.field2426 / CollisionMap.field2078;

         do {
            long long_5 = this.field2433 + (long)i_3 * (long)i_4;
            if (this.field2434 - long_5 >= 0L) {
               this.field2433 = long_5;
               break;
            }

            int i_7 = (int)(((long)i_4 + (this.field2434 - this.field2433) - 1L) / (long)i_4);
            this.field2433 += (long)i_7 * (long)i_4;
            this.field2435.vmethod3893(ints_1, i_2, i_7);
            i_2 += i_7;
            i_3 -= i_7;
            this.method3738();
         } while (this.field2416.method3833());
      }

      this.field2435.vmethod3893(ints_1, i_2, i_3);
   }

   protected synchronized void vmethod3906(int i_1) {
      if (this.field2416.method3833()) {
         int i_2 = this.field2416.field2463 * this.field2426 / CollisionMap.field2078;

         do {
            long long_3 = this.field2433 + (long)i_2 * (long)i_1;
            if (this.field2434 - long_3 >= 0L) {
               this.field2433 = long_3;
               break;
            }

            int i_5 = (int)((this.field2434 - this.field2433 + (long)i_2 - 1L) / (long)i_2);
            this.field2433 += (long)i_5 * (long)i_2;
            this.field2435.vmethod3906(i_5);
            i_1 -= i_5;
            this.method3738();
         } while (this.field2416.method3833());
      }

      this.field2435.vmethod3906(i_1);
   }

   void method3722(int i_1, int i_2) {
      this.field2429[i_1] = i_2;
   }

   int method3730(MusicPatchNode musicPatchNode_1) {
      int i_3 = (musicPatchNode_1.field2445 * musicPatchNode_1.field2446 >> 12) + musicPatchNode_1.field2441;
      i_3 += (this.field2429[musicPatchNode_1.field2440] - 8192) * this.field2423[musicPatchNode_1.field2440] >> 12;
      class196 class196_4 = musicPatchNode_1.field2452;
      int i_5;
      if (class196_4.field2394 > 0 && (class196_4.field2393 > 0 || this.field2418[musicPatchNode_1.field2440] > 0)) {
         i_5 = class196_4.field2393 << 2;
         int i_6 = class196_4.field2395 << 1;
         if (musicPatchNode_1.field2458 < i_6) {
            i_5 = i_5 * musicPatchNode_1.field2458 / i_6;
         }

         i_5 += this.field2418[musicPatchNode_1.field2440] >> 7;
         double d_7 = Math.sin(0.01227184630308513D * (double)(musicPatchNode_1.field2453 & 0x1ff));
         i_3 += (int)(d_7 * (double)i_5);
      }

      i_5 = (int)((double)(musicPatchNode_1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)i_3 * 3.255208333333333E-4D) / (double) CollisionMap.field2078 + 0.5D);
      return i_5 < 1 ? 1 : i_5;
   }

   protected synchronized class115 vmethod3891() {
      return null;
   }

   public synchronized boolean method3719(class203 class203_1, class233 class233_2, class108 class108_3, int i_4) {
      class203_1.method3925();
      boolean bool_6 = true;
      int[] ints_7 = null;
      if (i_4 > 0) {
         ints_7 = new int[] {i_4};
      }

      for (class177 class177_8 = (class177) class203_1.field2492.method5950(); class177_8 != null; class177_8 = (class177) class203_1.field2492.method5953()) {
         int i_9 = (int)class177_8.hash;
         SceneSound sceneSound_10 = (SceneSound) this.field2417.method5952((long)i_9);
         if (sceneSound_10 == null) {
            byte[] bytes_12 = class233_2.method4208(i_9);
            SceneSound sceneSound_11;
            if (bytes_12 == null) {
               sceneSound_11 = null;
            } else {
               sceneSound_11 = new SceneSound(bytes_12);
            }

            sceneSound_10 = sceneSound_11;
            if (sceneSound_11 == null) {
               bool_6 = false;
               continue;
            }

            this.field2417.method5951(sceneSound_11, (long)i_9);
         }

         if (!sceneSound_10.method3883(class108_3, class177_8.field2108, ints_7)) {
            bool_6 = false;
         }
      }

      if (bool_6) {
         class203_1.method3922();
      }

      return bool_6;
   }

   boolean method3739(MusicPatchNode musicPatchNode_1) {
      if (musicPatchNode_1.field2454 == null) {
         if (musicPatchNode_1.field2436 >= 0) {
            musicPatchNode_1.unlink();
            if (musicPatchNode_1.field2438 > 0 && musicPatchNode_1 == this.field2428[musicPatchNode_1.field2440][musicPatchNode_1.field2438]) {
               this.field2428[musicPatchNode_1.field2440][musicPatchNode_1.field2438] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void method3715(int i_1) {
      if ((this.field2421[i_1] & 0x2) != 0) {
         for (MusicPatchNode musicPatchNode_3 = (MusicPatchNode) this.field2435.field2484.method4892(); musicPatchNode_3 != null; musicPatchNode_3 = (MusicPatchNode) this.field2435.field2484.method4894()) {
            if (musicPatchNode_3.field2440 == i_1 && this.field2427[i_1][musicPatchNode_3.field2450] == null && musicPatchNode_3.field2436 < 0) {
               musicPatchNode_3.field2436 = 0;
            }
         }
      }

   }

   public int method3707() {
      return this.field2409;
   }

   public synchronized void method3775() {
      for (SceneSound sceneSound_2 = (SceneSound) this.field2417.method5950(); sceneSound_2 != null; sceneSound_2 = (SceneSound) this.field2417.method5953()) {
         sceneSound_2.method3889();
      }

   }

   void method3784(int i_1) {
      if ((this.field2421[i_1] & 0x4) != 0) {
         for (MusicPatchNode musicPatchNode_3 = (MusicPatchNode) this.field2435.field2484.method4892(); musicPatchNode_3 != null; musicPatchNode_3 = (MusicPatchNode) this.field2435.field2484.method4894()) {
            if (musicPatchNode_3.field2440 == i_1) {
               musicPatchNode_3.field2444 = 0;
            }
         }
      }

   }

   void method3726() {
      this.method3723(-1);
      this.method3724(-1);

      int i_2;
      for (i_2 = 0; i_2 < 16; i_2++) {
         this.field2413[i_2] = this.field2414[i_2];
      }

      for (i_2 = 0; i_2 < 16; i_2++) {
         this.field2415[i_2] = this.field2414[i_2] & ~0x7f;
      }

   }

   public synchronized boolean method3713(int i_1) {
      return this.field2416.method3833();
   }

   public synchronized void method3706(int i_1, int i_2) {
      this.field2409 = i_1;
   }

   public synchronized void method3710(int i_1) {
      for (SceneSound sceneSound_2 = (SceneSound) this.field2417.method5950(); sceneSound_2 != null; sceneSound_2 = (SceneSound) this.field2417.method5953()) {
         sceneSound_2.unlink();
      }

   }

   public synchronized void method3802(class203 class203_1, boolean bool_2, int i_3) {
      this.method3712();
      this.field2416.method3877(class203_1.field2491);
      this.field2430 = bool_2;
      this.field2433 = 0L;
      int i_4 = this.field2416.method3849();

      for (int i_5 = 0; i_5 < i_4; i_5++) {
         this.field2416.method3835(i_5);
         this.field2416.method3865(i_5);
         this.field2416.method3836(i_5);
      }

      this.field2431 = this.field2416.method3842();
      this.field2432 = this.field2416.field2465[this.field2431];
      this.field2434 = this.field2416.method3861(this.field2432);
   }

   boolean method3740(MusicPatchNode musicPatchNode_1, int[] ints_2, int i_3, int i_4, int i_5) {
      musicPatchNode_1.field2455 = CollisionMap.field2078 / 100;
      if (musicPatchNode_1.field2436 < 0 || musicPatchNode_1.field2454 != null && !musicPatchNode_1.field2454.method2558()) {
         int i_6 = musicPatchNode_1.field2446;
         if (i_6 > 0) {
            i_6 -= (int) (16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double) this.field2419[musicPatchNode_1.field2440]) + 0.5D);
            if (i_6 < 0) {
               i_6 = 0;
            }

            musicPatchNode_1.field2446 = i_6;
         }

         musicPatchNode_1.field2454.method2538(this.method3730(musicPatchNode_1));
         class196 class196_7 = musicPatchNode_1.field2452;
         boolean bool_8 = false;
         ++musicPatchNode_1.field2458;
         musicPatchNode_1.field2453 += class196_7.field2394;
         double d_9 = 5.086263020833333E-6D * (double) ((musicPatchNode_1.field2450 - 60 << 8) + (musicPatchNode_1.field2445 * musicPatchNode_1.field2446 >> 12));
         if (class196_7.field2392 > 0) {
            if (class196_7.field2391 > 0) {
               musicPatchNode_1.field2447 += (int) (128.0D * Math.pow(2.0D, d_9 * (double) class196_7.field2391) + 0.5D);
            } else {
               musicPatchNode_1.field2447 += 128;
            }
         }

         if (class196_7.field2387 != null) {
            if (class196_7.field2390 > 0) {
               musicPatchNode_1.field2448 += (int) (128.0D * Math.pow(2.0D, (double) class196_7.field2390 * d_9) + 0.5D);
            } else {
               musicPatchNode_1.field2448 += 128;
            }

            while (musicPatchNode_1.field2449 < class196_7.field2387.length - 2 && musicPatchNode_1.field2448 > (class196_7.field2387[musicPatchNode_1.field2449 + 2] & 0xff) << 8) {
               musicPatchNode_1.field2449 += 2;
            }

            if (class196_7.field2387.length - 2 == musicPatchNode_1.field2449 && class196_7.field2387[musicPatchNode_1.field2449 + 1] == 0) {
               bool_8 = true;
            }
         }

         if (musicPatchNode_1.field2436 >= 0 && class196_7.field2388 != null && (this.field2421[musicPatchNode_1.field2440] & 0x1) == 0 && (musicPatchNode_1.field2438 < 0 || musicPatchNode_1 != this.field2428[musicPatchNode_1.field2440][musicPatchNode_1.field2438])) {
            if (class196_7.field2398 > 0) {
               musicPatchNode_1.field2436 += (int) (128.0D * Math.pow(2.0D, (double) class196_7.field2398 * d_9) + 0.5D);
            } else {
               musicPatchNode_1.field2436 += 128;
            }

            while (musicPatchNode_1.field2451 < class196_7.field2388.length - 2 && musicPatchNode_1.field2436 > (class196_7.field2388[musicPatchNode_1.field2451 + 2] & 0xff) << 8) {
               musicPatchNode_1.field2451 += 2;
            }

            if (class196_7.field2388.length - 2 == musicPatchNode_1.field2451) {
               bool_8 = true;
            }
         }

         if (bool_8) {
            musicPatchNode_1.field2454.method2540(musicPatchNode_1.field2455);
            if (ints_2 != null) {
               musicPatchNode_1.field2454.vmethod3893(ints_2, i_3, i_4);
            } else {
               musicPatchNode_1.field2454.vmethod3906(i_4);
            }

            if (musicPatchNode_1.field2454.method2585()) {
               this.field2435.field2487.method2286(musicPatchNode_1.field2454);
            }

            musicPatchNode_1.method3826();
            if (musicPatchNode_1.field2436 >= 0) {
               musicPatchNode_1.unlink();
               if (musicPatchNode_1.field2438 > 0 && musicPatchNode_1 == this.field2428[musicPatchNode_1.field2440][musicPatchNode_1.field2438]) {
                  this.field2428[musicPatchNode_1.field2440][musicPatchNode_1.field2438] = null;
               }
            }

            return true;
         } else {
            musicPatchNode_1.field2454.method2536(musicPatchNode_1.field2455, this.method3731(musicPatchNode_1), this.method3732(musicPatchNode_1));
            return false;
         }
      } else {
         musicPatchNode_1.method3826();
         musicPatchNode_1.unlink();
         if (musicPatchNode_1.field2438 > 0 && musicPatchNode_1 == this.field2428[musicPatchNode_1.field2440][musicPatchNode_1.field2438]) {
            this.field2428[musicPatchNode_1.field2440][musicPatchNode_1.field2438] = null;
         }

         return true;
      }
   }

   protected synchronized class115 vmethod3894() {
      return this.field2435;
   }

   void method3754(int i_1, int i_2, byte b_3) {
      this.field2425[i_1] = i_2;
      this.field2408[i_1] = (int) (2097152.0D * Math.pow(2.0D, (double) i_2 * 5.4931640625E-4D) + 0.5D);
   }

   void method3728(int i_1) {
      int i_3 = i_1 & 0xf0;
      int i_4;
      int i_5;
      int i_6;
      if (i_3 == 128) {
         i_4 = i_1 & 0xf;
         i_5 = i_1 >> 8 & 0x7f;
         i_6 = i_1 >> 16 & 0x7f;
         this.method3729(i_4, i_5);
      } else if (i_3 == 144) {
         i_4 = i_1 & 0xf;
         i_5 = i_1 >> 8 & 0x7f;
         i_6 = i_1 >> 16 & 0x7f;
         if (i_6 > 0) {
            this.method3717(i_4, i_5, i_6, 659813426);
         } else {
            this.method3729(i_4, i_5);
         }

      } else if (i_3 == 160) {
         i_4 = i_1 & 0xf;
         i_5 = i_1 >> 8 & 0x7f;
         i_6 = i_1 >> 16 & 0x7f;
         this.method3788();
      } else if (i_3 == 176) {
         i_4 = i_1 & 0xf;
         i_5 = i_1 >> 8 & 0x7f;
         i_6 = i_1 >> 16 & 0x7f;
         if (i_5 == 0) {
            this.field2415[i_4] = (i_6 << 14) + (this.field2415[i_4] & ~0x1fc000);
         }

         if (i_5 == 32) {
            this.field2415[i_4] = (i_6 << 7) + (this.field2415[i_4] & ~0x3f80);
         }

         if (i_5 == 1) {
            this.field2418[i_4] = (i_6 << 7) + (this.field2418[i_4] & ~0x3f80);
         }

         if (i_5 == 33) {
            this.field2418[i_4] = i_6 + (this.field2418[i_4] & ~0x7f);
         }

         if (i_5 == 5) {
            this.field2419[i_4] = (i_6 << 7) + (this.field2419[i_4] & ~0x3f80);
         }

         if (i_5 == 37) {
            this.field2419[i_4] = i_6 + (this.field2419[i_4] & ~0x7f);
         }

         if (i_5 == 7) {
            this.field2411[i_4] = (i_6 << 7) + (this.field2411[i_4] & ~0x3f80);
         }

         if (i_5 == 39) {
            this.field2411[i_4] = i_6 + (this.field2411[i_4] & ~0x7f);
         }

         if (i_5 == 10) {
            this.field2412[i_4] = (i_6 << 7) + (this.field2412[i_4] & ~0x3f80);
         }

         if (i_5 == 42) {
            this.field2412[i_4] = i_6 + (this.field2412[i_4] & ~0x7f);
         }

         if (i_5 == 11) {
            this.field2422[i_4] = (i_6 << 7) + (this.field2422[i_4] & ~0x3f80);
         }

         if (i_5 == 43) {
            this.field2422[i_4] = i_6 + (this.field2422[i_4] & ~0x7f);
         }

         if (i_5 == 64) {
            if (i_6 >= 64) {
               this.field2421[i_4] |= 0x1;
            } else {
               this.field2421[i_4] &= ~0x1;
            }
         }

         if (i_5 == 65) {
            if (i_6 >= 64) {
               this.field2421[i_4] |= 0x2;
            } else {
               this.method3715(i_4);
               this.field2421[i_4] &= ~0x2;
            }
         }

         if (i_5 == 99) {
            this.field2424[i_4] = (i_6 << 7) + (this.field2424[i_4] & 0x7f);
         }

         if (i_5 == 98) {
            this.field2424[i_4] = (this.field2424[i_4] & 0x3f80) + i_6;
         }

         if (i_5 == 101) {
            this.field2424[i_4] = (i_6 << 7) + (this.field2424[i_4] & 0x7f) + 16384;
         }

         if (i_5 == 100) {
            this.field2424[i_4] = (this.field2424[i_4] & 0x3f80) + i_6 + 16384;
         }

         if (i_5 == 120) {
            this.method3723(i_4);
         }

         if (i_5 == 121) {
            this.method3724(i_4);
         }

         if (i_5 == 123) {
            this.method3714(i_4);
         }

         int i_7;
         if (i_5 == 6) {
            i_7 = this.field2424[i_4];
            if (i_7 == 16384) {
               this.field2423[i_4] = (i_6 << 7) + (this.field2423[i_4] & ~0x3f80);
            }
         }

         if (i_5 == 38) {
            i_7 = this.field2424[i_4];
            if (i_7 == 16384) {
               this.field2423[i_4] = i_6 + (this.field2423[i_4] & ~0x7f);
            }
         }

         if (i_5 == 16) {
            this.field2410[i_4] = (i_6 << 7) + (this.field2410[i_4] & ~0x3f80);
         }

         if (i_5 == 48) {
            this.field2410[i_4] = i_6 + (this.field2410[i_4] & ~0x7f);
         }

         if (i_5 == 81) {
            if (i_6 >= 64) {
               this.field2421[i_4] |= 0x4;
            } else {
               this.method3784(i_4);
               this.field2421[i_4] &= ~0x4;
            }
         }

         if (i_5 == 17) {
            this.method3754(i_4, (i_6 << 7) + (this.field2425[i_4] & ~0x3f80), (byte) 14);
         }

         if (i_5 == 49) {
            this.method3754(i_4, i_6 + (this.field2425[i_4] & ~0x7f), (byte) 14);
         }

      } else if (i_3 == 192) {
         i_4 = i_1 & 0xf;
         i_5 = i_1 >> 8 & 0x7f;
         this.method3716(i_4, i_5 + this.field2415[i_4], (byte) 5);
      } else if (i_3 == 208) {
         i_4 = i_1 & 0xf;
         i_5 = i_1 >> 8 & 0x7f;
      } else if (i_3 == 224) {
         i_4 = i_1 & 0xf;
         i_5 = (i_1 >> 8 & 0x7f) + (i_1 >> 9 & 0x3f80);
         this.method3722(i_4, i_5);
      } else {
         i_3 = i_1 & 0xff;
         if (i_3 == 255) {
            this.method3726();
         }
      }
   }

   void method3767(MusicPatchNode musicPatchNode_1, boolean bool_2, byte b_3) {
      int i_4 = musicPatchNode_1.rawSound.field1390.length;
      int i_5;
      if (bool_2 && musicPatchNode_1.rawSound.field1393) {
         int i_6 = i_4 + i_4 - musicPatchNode_1.rawSound.field1391;
         i_5 = (int)((long)i_6 * (long)this.field2410[musicPatchNode_1.field2440] >> 6);
         i_4 <<= 8;
         if (i_5 >= i_4) {
            i_5 = i_4 + i_4 - 1 - i_5;
            musicPatchNode_1.field2454.method2614(true);
         }
      } else {
         i_5 = (int)((long)i_4 * (long)this.field2410[musicPatchNode_1.field2440] >> 6);
      }

      musicPatchNode_1.field2454.method2596(i_5);
   }

   protected synchronized int vmethod3892() {
      return 0;
   }

   int method3731(MusicPatchNode musicPatchNode_1) {
      class196 class196_3 = musicPatchNode_1.field2452;
      int i_4 = this.field2422[musicPatchNode_1.field2440] * this.field2411[musicPatchNode_1.field2440] + 4096 >> 13;
      i_4 = i_4 * i_4 + 16384 >> 15;
      i_4 = i_4 * musicPatchNode_1.field2442 + 16384 >> 15;
      i_4 = i_4 * this.field2409 + 128 >> 8;
      if (class196_3.field2392 > 0) {
         i_4 = (int)((double)i_4 * Math.pow(0.5D, 1.953125E-5D * (double) musicPatchNode_1.field2447 * (double)class196_3.field2392) + 0.5D);
      }

      int i_5;
      int i_6;
      int i_7;
      int i_8;
      if (class196_3.field2387 != null) {
         i_5 = musicPatchNode_1.field2448;
         i_6 = class196_3.field2387[musicPatchNode_1.field2449 + 1];
         if (musicPatchNode_1.field2449 < class196_3.field2387.length - 2) {
            i_7 = (class196_3.field2387[musicPatchNode_1.field2449] & 0xff) << 8;
            i_8 = (class196_3.field2387[musicPatchNode_1.field2449 + 2] & 0xff) << 8;
            i_6 += (i_5 - i_7) * (class196_3.field2387[musicPatchNode_1.field2449 + 3] - i_6) / (i_8 - i_7);
         }

         i_4 = i_6 * i_4 + 32 >> 6;
      }

      if (musicPatchNode_1.field2436 > 0 && class196_3.field2388 != null) {
         i_5 = musicPatchNode_1.field2436;
         i_6 = class196_3.field2388[musicPatchNode_1.field2451 + 1];
         if (musicPatchNode_1.field2451 < class196_3.field2388.length - 2) {
            i_7 = (class196_3.field2388[musicPatchNode_1.field2451] & 0xff) << 8;
            i_8 = (class196_3.field2388[musicPatchNode_1.field2451 + 2] & 0xff) << 8;
            i_6 += (i_5 - i_7) * (class196_3.field2388[musicPatchNode_1.field2451 + 3] - i_6) / (i_8 - i_7);
         }

         i_4 = i_6 * i_4 + 32 >> 6;
      }

      return i_4;
   }

   int method3732(MusicPatchNode musicPatchNode_1) {
      int i_3 = this.field2412[musicPatchNode_1.field2440];
      return i_3 < 8192 ? i_3 * musicPatchNode_1.field2443 + 32 >> 6 : 16384 - ((128 - musicPatchNode_1.field2443) * (16384 - i_3) + 32 >> 6);
   }

   void method3714(int i_1) {
      for (MusicPatchNode musicPatchNode_3 = (MusicPatchNode) this.field2435.field2484.method4892(); musicPatchNode_3 != null; musicPatchNode_3 = (MusicPatchNode) this.field2435.field2484.method4894()) {
         if ((i_1 < 0 || musicPatchNode_3.field2440 == i_1) && musicPatchNode_3.field2436 < 0) {
            this.field2427[musicPatchNode_3.field2440][musicPatchNode_3.field2450] = null;
            musicPatchNode_3.field2436 = 0;
         }
      }

   }

   public synchronized void method3720(int i_1, int i_2) {
      this.method3824(i_1, i_2);
   }

   void method3738() {
      int i_2 = this.field2431;
      int i_3 = this.field2432;

      long long_4;
      for (long_4 = this.field2434; i_3 == this.field2432; long_4 = this.field2416.method3861(i_3)) {
         while (i_3 == this.field2416.field2465[i_2]) {
            this.field2416.method3835(i_2);
            int i_6 = this.field2416.method3869(i_2);
            if (i_6 == 1) {
               this.field2416.method3847();
               this.field2416.method3836(i_2);
               if (this.field2416.method3856()) {
                  if (!this.field2430 || i_3 == 0) {
                     this.method3726();
                     this.field2416.method3831();
                     return;
                  }

                  this.field2416.method3844(long_4);
               }
               break;
            }

            if ((i_6 & 0x80) != 0) {
               this.method3728(i_6);
            }

            this.field2416.method3865(i_2);
            this.field2416.method3836(i_2);
         }

         i_2 = this.field2416.method3842();
         i_3 = this.field2416.field2465[i_2];
      }

      this.field2431 = i_2;
      this.field2432 = i_3;
      this.field2434 = long_4;
   }

}
