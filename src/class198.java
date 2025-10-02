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
   class199[][] field2427 = new class199[16][128];
   class199[][] field2428 = new class199[16][128];
   class200 field2416 = new class200();
   class202 field2435 = new class202(this);
   class318 field2417 = new class318(128);
   long field2433;
   boolean field2430;
   int field2431;
   int field2432;
   long field2434;

   public class198() {
      this.method3726((short) 7883);
   }

   void method3824(int i_1, int i_2, int i_3) {
      this.field2414[i_1] = i_2;
      this.field2415[i_1] = i_2 & ~0x7f;
      this.method3716(i_1, i_2, (byte) 5);
   }

   void method3729(int i_1, int i_2, int i_3, int i_4) {
      class199 class199_5 = this.field2427[i_1][i_2];
      if (class199_5 != null) {
         this.field2427[i_1][i_2] = null;
         if ((this.field2421[i_1] & 0x2) != 0) {
            for (class199 class199_6 = (class199) this.field2435.field2484.method4892(); class199_6 != null; class199_6 = (class199) this.field2435.field2484.method4894()) {
               if (class199_6.field2440 == class199_5.field2440 && class199_6.field2436 < 0 && class199_5 != class199_6) {
                  class199_5.field2436 = 0;
                  break;
               }
            }
         } else {
            class199_5.field2436 = 0;
         }

      }
   }

   void method3723(int i_1, int i_2) {
      for (class199 class199_3 = (class199) this.field2435.field2484.method4892(); class199_3 != null; class199_3 = (class199) this.field2435.field2484.method4894()) {
         if (i_1 < 0 || class199_3.field2440 == i_1) {
            if (class199_3.field2454 != null) {
               class199_3.field2454.method2540(class172.field2078 / 100);
               if (class199_3.field2454.method2585()) {
                  this.field2435.field2487.method2286(class199_3.field2454);
               }

               class199_3.method3826((byte) 21);
            }

            if (class199_3.field2436 < 0) {
               this.field2427[class199_3.field2440][class199_3.field2450] = null;
            }

            class199_3.method3607();
         }
      }

   }

   public synchronized void method3712(int i_1) {
      this.field2416.method3831();
      this.method3726((short) 23201);
   }

   void method3724(int i_1, byte b_2) {
      if (i_1 >= 0) {
         this.field2411[i_1] = 12800;
         this.field2412[i_1] = 8192;
         this.field2422[i_1] = 16383;
         this.field2429[i_1] = 8192;
         this.field2418[i_1] = 0;
         this.field2419[i_1] = 8192;
         this.method3715(i_1, -117878160);
         this.method3784(i_1, -1541338262);
         this.field2421[i_1] = 0;
         this.field2424[i_1] = 32767;
         this.field2423[i_1] = 256;
         this.field2410[i_1] = 0;
         this.method3754(i_1, 8192, (byte) 14);
      } else {
         for (i_1 = 0; i_1 < 16; i_1++) {
            this.method3724(i_1, (byte) 29);
         }

      }
   }

   void method3717(int i_1, int i_2, int i_3, int i_4) {
      this.method3729(i_1, i_2, 64, -1579005533);
      if ((this.field2421[i_1] & 0x2) != 0) {
         for (class199 class199_5 = (class199) this.field2435.field2484.method4893(); class199_5 != null; class199_5 = (class199) this.field2435.field2484.method4887()) {
            if (class199_5.field2440 == i_1 && class199_5.field2436 < 0) {
               this.field2427[i_1][class199_5.field2450] = null;
               this.field2427[i_1][i_2] = class199_5;
               int i_6 = (class199_5.field2445 * class199_5.field2446 >> 12) + class199_5.field2441;
               class199_5.field2441 += i_2 - class199_5.field2450 << 8;
               class199_5.field2445 = i_6 - class199_5.field2441;
               class199_5.field2446 = 4096;
               class199_5.field2450 = i_2;
               return;
            }
         }
      }

      class201 class201_10 = (class201) this.field2417.method5952((long)this.field2413[i_1]);
      if (class201_10 != null) {
         class103 class103_9 = class201_10.field2474[i_2];
         if (class103_9 != null) {
            class199 class199_7 = new class199();
            class199_7.field2440 = i_1;
            class199_7.field2437 = class201_10;
            class199_7.field2439 = class103_9;
            class199_7.field2452 = class201_10.field2481[i_2];
            class199_7.field2438 = class201_10.field2479[i_2];
            class199_7.field2450 = i_2;
            class199_7.field2442 = i_3 * i_3 * class201_10.field2476[i_2] * class201_10.field2475 + 1024 >> 11;
            class199_7.field2443 = class201_10.field2477[i_2] & 0xff;
            class199_7.field2441 = (i_2 << 8) - (class201_10.field2482[i_2] & 0x7fff);
            class199_7.field2447 = 0;
            class199_7.field2448 = 0;
            class199_7.field2449 = 0;
            class199_7.field2436 = -1;
            class199_7.field2451 = 0;
            if (this.field2410[i_1] == 0) {
               class199_7.field2454 = class113.method2524(class103_9, this.method3730(class199_7, -1641054838), this.method3731(class199_7, (byte) -57), this.method3732(class199_7, -1266735092));
            } else {
               class199_7.field2454 = class113.method2524(class103_9, this.method3730(class199_7, -1881364797), 0, this.method3732(class199_7, -1266735092));
               this.method3767(class199_7, class201_10.field2482[i_2] < 0, (byte) -7);
            }

            if (class201_10.field2482[i_2] < 0) {
               class199_7.field2454.method2626(-1);
            }

            if (class199_7.field2438 >= 0) {
               class199 class199_8 = this.field2428[i_1][class199_7.field2438];
               if (class199_8 != null && class199_8.field2436 < 0) {
                  this.field2427[i_1][class199_8.field2450] = null;
                  class199_8.field2436 = 0;
               }

               this.field2428[i_1][class199_7.field2438] = class199_7;
            }

            this.field2435.field2484.method4917(class199_7);
            this.field2427[i_1][i_2] = class199_7;
         }
      }
   }

   void method3788(int i_1, int i_2, int i_3, int i_4) {
   }

   void method3726(short s_1) {
      this.method3723(-1, 889719076);
      this.method3724(-1, (byte) 112);

      int i_2;
      for (i_2 = 0; i_2 < 16; i_2++) {
         this.field2413[i_2] = this.field2414[i_2];
      }

      for (i_2 = 0; i_2 < 16; i_2++) {
         this.field2415[i_2] = this.field2414[i_2] & ~0x7f;
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
         int i_4 = this.field2416.field2463 * this.field2426 / class172.field2078;

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
            this.method3738(1814583214);
         } while (this.field2416.method3833());
      }

      this.field2435.vmethod3893(ints_1, i_2, i_3);
   }

   protected synchronized void vmethod3906(int i_1) {
      if (this.field2416.method3833()) {
         int i_2 = this.field2416.field2463 * this.field2426 / class172.field2078;

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
            this.method3738(1310291586);
         } while (this.field2416.method3833());
      }

      this.field2435.vmethod3906(i_1);
   }

   void method3793(int i_1, int i_2, byte b_3) {
   }

   void method3722(int i_1, int i_2, int i_3) {
      this.field2429[i_1] = i_2;
   }

   int method3730(class199 class199_1, int i_2) {
      int i_3 = (class199_1.field2445 * class199_1.field2446 >> 12) + class199_1.field2441;
      i_3 += (this.field2429[class199_1.field2440] - 8192) * this.field2423[class199_1.field2440] >> 12;
      class196 class196_4 = class199_1.field2452;
      int i_5;
      if (class196_4.field2394 > 0 && (class196_4.field2393 > 0 || this.field2418[class199_1.field2440] > 0)) {
         i_5 = class196_4.field2393 << 2;
         int i_6 = class196_4.field2395 << 1;
         if (class199_1.field2458 < i_6) {
            i_5 = i_5 * class199_1.field2458 / i_6;
         }

         i_5 += this.field2418[class199_1.field2440] >> 7;
         double d_7 = Math.sin(0.01227184630308513D * (double)(class199_1.field2453 & 0x1ff));
         i_3 += (int)(d_7 * (double)i_5);
      }

      i_5 = (int)((double)(class199_1.field2439.field1389 * 256) * Math.pow(2.0D, (double)i_3 * 3.255208333333333E-4D) / (double)class172.field2078 + 0.5D);
      return i_5 < 1 ? 1 : i_5;
   }

   protected synchronized class115 vmethod3891() {
      return null;
   }

   public synchronized boolean method3719(class203 class203_1, class233 class233_2, class108 class108_3, int i_4, int i_5) {
      class203_1.method3925();
      boolean bool_6 = true;
      int[] ints_7 = null;
      if (i_4 > 0) {
         ints_7 = new int[] {i_4};
      }

      for (class177 class177_8 = (class177) class203_1.field2492.method5950(); class177_8 != null; class177_8 = (class177) class203_1.field2492.method5953()) {
         int i_9 = (int)class177_8.field2113;
         class201 class201_10 = (class201) this.field2417.method5952((long)i_9);
         if (class201_10 == null) {
            byte[] bytes_12 = class233_2.method4208(i_9, 1034279223);
            class201 class201_11;
            if (bytes_12 == null) {
               class201_11 = null;
            } else {
               class201_11 = new class201(bytes_12);
            }

            class201_10 = class201_11;
            if (class201_11 == null) {
               bool_6 = false;
               continue;
            }

            this.field2417.method5951(class201_11, (long)i_9);
         }

         if (!class201_10.method3883(class108_3, class177_8.field2108, ints_7, 1229710126)) {
            bool_6 = false;
         }
      }

      if (bool_6) {
         class203_1.method3922();
      }

      return bool_6;
   }

   boolean method3739(class199 class199_1, int i_2) {
      if (class199_1.field2454 == null) {
         if (class199_1.field2436 >= 0) {
            class199_1.method3607();
            if (class199_1.field2438 > 0 && class199_1 == this.field2428[class199_1.field2440][class199_1.field2438]) {
               this.field2428[class199_1.field2440][class199_1.field2438] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void method3715(int i_1, int i_2) {
      if ((this.field2421[i_1] & 0x2) != 0) {
         for (class199 class199_3 = (class199) this.field2435.field2484.method4892(); class199_3 != null; class199_3 = (class199) this.field2435.field2484.method4894()) {
            if (class199_3.field2440 == i_1 && this.field2427[i_1][class199_3.field2450] == null && class199_3.field2436 < 0) {
               class199_3.field2436 = 0;
            }
         }
      }

   }

   public int method3707(int i_1) {
      return this.field2409;
   }

   public synchronized void method3775(int i_1) {
      for (class201 class201_2 = (class201) this.field2417.method5950(); class201_2 != null; class201_2 = (class201) this.field2417.method5953()) {
         class201_2.method3889(56898655);
      }

   }

   void method3784(int i_1, int i_2) {
      if ((this.field2421[i_1] & 0x4) != 0) {
         for (class199 class199_3 = (class199) this.field2435.field2484.method4892(); class199_3 != null; class199_3 = (class199) this.field2435.field2484.method4894()) {
            if (class199_3.field2440 == i_1) {
               class199_3.field2444 = 0;
            }
         }
      }

   }

   void method3728(int i_1, int i_2) {
      int i_3 = i_1 & 0xf0;
      int i_4;
      int i_5;
      int i_6;
      if (i_3 == 128) {
         i_4 = i_1 & 0xf;
         i_5 = i_1 >> 8 & 0x7f;
         i_6 = i_1 >> 16 & 0x7f;
         this.method3729(i_4, i_5, i_6, -1579005533);
      } else if (i_3 == 144) {
         i_4 = i_1 & 0xf;
         i_5 = i_1 >> 8 & 0x7f;
         i_6 = i_1 >> 16 & 0x7f;
         if (i_6 > 0) {
            this.method3717(i_4, i_5, i_6, 659813426);
         } else {
            this.method3729(i_4, i_5, 64, -1579005533);
         }

      } else if (i_3 == 160) {
         i_4 = i_1 & 0xf;
         i_5 = i_1 >> 8 & 0x7f;
         i_6 = i_1 >> 16 & 0x7f;
         this.method3788(i_4, i_5, i_6, 2105784371);
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
               this.method3715(i_4, -557228287);
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
            this.method3723(i_4, 889719076);
         }

         if (i_5 == 121) {
            this.method3724(i_4, (byte) 105);
         }

         if (i_5 == 123) {
            this.method3714(i_4, 786188119);
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
               this.method3784(i_4, 194455911);
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
         this.method3793(i_4, i_5, (byte) 8);
      } else if (i_3 == 224) {
         i_4 = i_1 & 0xf;
         i_5 = (i_1 >> 8 & 0x7f) + (i_1 >> 9 & 0x3f80);
         this.method3722(i_4, i_5, 1785966044);
      } else {
         i_3 = i_1 & 0xff;
         if (i_3 == 255) {
            this.method3726((short) 21336);
         }
      }
   }

   public synchronized boolean method3713(int i_1) {
      return this.field2416.method3833();
   }

   public synchronized void method3706(int i_1, int i_2) {
      this.field2409 = i_1;
   }

   public synchronized void method3710(int i_1) {
      for (class201 class201_2 = (class201) this.field2417.method5950(); class201_2 != null; class201_2 = (class201) this.field2417.method5953()) {
         class201_2.method3607();
      }

   }

   public synchronized void method3802(class203 class203_1, boolean bool_2, int i_3) {
      this.method3712(-1871433949);
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

   boolean method3740(class199 class199_1, int[] ints_2, int i_3, int i_4, int i_5) {
      class199_1.field2455 = class172.field2078 / 100;
      if (class199_1.field2436 < 0 || class199_1.field2454 != null && !class199_1.field2454.method2558()) {
         int i_6 = class199_1.field2446;
         if (i_6 > 0) {
            i_6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2419[class199_1.field2440]) + 0.5D);
            if (i_6 < 0) {
               i_6 = 0;
            }

            class199_1.field2446 = i_6;
         }

         class199_1.field2454.method2538(this.method3730(class199_1, -1889826116));
         class196 class196_7 = class199_1.field2452;
         boolean bool_8 = false;
         ++class199_1.field2458;
         class199_1.field2453 += class196_7.field2394;
         double d_9 = 5.086263020833333E-6D * (double)((class199_1.field2450 - 60 << 8) + (class199_1.field2445 * class199_1.field2446 >> 12));
         if (class196_7.field2392 > 0) {
            if (class196_7.field2391 > 0) {
               class199_1.field2447 += (int)(128.0D * Math.pow(2.0D, d_9 * (double)class196_7.field2391) + 0.5D);
            } else {
               class199_1.field2447 += 128;
            }
         }

         if (class196_7.field2387 != null) {
            if (class196_7.field2390 > 0) {
               class199_1.field2448 += (int)(128.0D * Math.pow(2.0D, (double)class196_7.field2390 * d_9) + 0.5D);
            } else {
               class199_1.field2448 += 128;
            }

            while (class199_1.field2449 < class196_7.field2387.length - 2 && class199_1.field2448 > (class196_7.field2387[class199_1.field2449 + 2] & 0xff) << 8) {
               class199_1.field2449 += 2;
            }

            if (class196_7.field2387.length - 2 == class199_1.field2449 && class196_7.field2387[class199_1.field2449 + 1] == 0) {
               bool_8 = true;
            }
         }

         if (class199_1.field2436 >= 0 && class196_7.field2388 != null && (this.field2421[class199_1.field2440] & 0x1) == 0 && (class199_1.field2438 < 0 || class199_1 != this.field2428[class199_1.field2440][class199_1.field2438])) {
            if (class196_7.field2398 > 0) {
               class199_1.field2436 += (int)(128.0D * Math.pow(2.0D, (double)class196_7.field2398 * d_9) + 0.5D);
            } else {
               class199_1.field2436 += 128;
            }

            while (class199_1.field2451 < class196_7.field2388.length - 2 && class199_1.field2436 > (class196_7.field2388[class199_1.field2451 + 2] & 0xff) << 8) {
               class199_1.field2451 += 2;
            }

            if (class196_7.field2388.length - 2 == class199_1.field2451) {
               bool_8 = true;
            }
         }

         if (bool_8) {
            class199_1.field2454.method2540(class199_1.field2455);
            if (ints_2 != null) {
               class199_1.field2454.vmethod3893(ints_2, i_3, i_4);
            } else {
               class199_1.field2454.vmethod3906(i_4);
            }

            if (class199_1.field2454.method2585()) {
               this.field2435.field2487.method2286(class199_1.field2454);
            }

            class199_1.method3826((byte) -23);
            if (class199_1.field2436 >= 0) {
               class199_1.method3607();
               if (class199_1.field2438 > 0 && class199_1 == this.field2428[class199_1.field2440][class199_1.field2438]) {
                  this.field2428[class199_1.field2440][class199_1.field2438] = null;
               }
            }

            return true;
         } else {
            class199_1.field2454.method2536(class199_1.field2455, this.method3731(class199_1, (byte) -94), this.method3732(class199_1, -1266735092));
            return false;
         }
      } else {
         class199_1.method3826((byte) -18);
         class199_1.method3607();
         if (class199_1.field2438 > 0 && class199_1 == this.field2428[class199_1.field2440][class199_1.field2438]) {
            this.field2428[class199_1.field2440][class199_1.field2438] = null;
         }

         return true;
      }
   }

   protected synchronized class115 vmethod3894() {
      return this.field2435;
   }

   void method3754(int i_1, int i_2, byte b_3) {
      this.field2425[i_1] = i_2;
      this.field2408[i_1] = (int)(2097152.0D * Math.pow(2.0D, (double)i_2 * 5.4931640625E-4D) + 0.5D);
   }

   void method3738(int i_1) {
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
                     this.method3726((short) 17272);
                     this.field2416.method3831();
                     return;
                  }

                  this.field2416.method3844(long_4);
               }
               break;
            }

            if ((i_6 & 0x80) != 0) {
               this.method3728(i_6, 946217459);
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

   void method3767(class199 class199_1, boolean bool_2, byte b_3) {
      int i_4 = class199_1.field2439.field1390.length;
      int i_5;
      if (bool_2 && class199_1.field2439.field1393) {
         int i_6 = i_4 + i_4 - class199_1.field2439.field1391;
         i_5 = (int)((long)i_6 * (long)this.field2410[class199_1.field2440] >> 6);
         i_4 <<= 8;
         if (i_5 >= i_4) {
            i_5 = i_4 + i_4 - 1 - i_5;
            class199_1.field2454.method2614(true);
         }
      } else {
         i_5 = (int)((long)i_4 * (long)this.field2410[class199_1.field2440] >> 6);
      }

      class199_1.field2454.method2596(i_5);
   }

   protected synchronized int vmethod3892() {
      return 0;
   }

   int method3731(class199 class199_1, byte b_2) {
      class196 class196_3 = class199_1.field2452;
      int i_4 = this.field2422[class199_1.field2440] * this.field2411[class199_1.field2440] + 4096 >> 13;
      i_4 = i_4 * i_4 + 16384 >> 15;
      i_4 = i_4 * class199_1.field2442 + 16384 >> 15;
      i_4 = i_4 * this.field2409 + 128 >> 8;
      if (class196_3.field2392 > 0) {
         i_4 = (int)((double)i_4 * Math.pow(0.5D, 1.953125E-5D * (double)class199_1.field2447 * (double)class196_3.field2392) + 0.5D);
      }

      int i_5;
      int i_6;
      int i_7;
      int i_8;
      if (class196_3.field2387 != null) {
         i_5 = class199_1.field2448;
         i_6 = class196_3.field2387[class199_1.field2449 + 1];
         if (class199_1.field2449 < class196_3.field2387.length - 2) {
            i_7 = (class196_3.field2387[class199_1.field2449] & 0xff) << 8;
            i_8 = (class196_3.field2387[class199_1.field2449 + 2] & 0xff) << 8;
            i_6 += (i_5 - i_7) * (class196_3.field2387[class199_1.field2449 + 3] - i_6) / (i_8 - i_7);
         }

         i_4 = i_6 * i_4 + 32 >> 6;
      }

      if (class199_1.field2436 > 0 && class196_3.field2388 != null) {
         i_5 = class199_1.field2436;
         i_6 = class196_3.field2388[class199_1.field2451 + 1];
         if (class199_1.field2451 < class196_3.field2388.length - 2) {
            i_7 = (class196_3.field2388[class199_1.field2451] & 0xff) << 8;
            i_8 = (class196_3.field2388[class199_1.field2451 + 2] & 0xff) << 8;
            i_6 += (i_5 - i_7) * (class196_3.field2388[class199_1.field2451 + 3] - i_6) / (i_8 - i_7);
         }

         i_4 = i_6 * i_4 + 32 >> 6;
      }

      return i_4;
   }

   int method3732(class199 class199_1, int i_2) {
      int i_3 = this.field2412[class199_1.field2440];
      return i_3 < 8192 ? i_3 * class199_1.field2443 + 32 >> 6 : 16384 - ((128 - class199_1.field2443) * (16384 - i_3) + 32 >> 6);
   }

   void method3714(int i_1, int i_2) {
      for (class199 class199_3 = (class199) this.field2435.field2484.method4892(); class199_3 != null; class199_3 = (class199) this.field2435.field2484.method4894()) {
         if ((i_1 < 0 || class199_3.field2440 == i_1) && class199_3.field2436 < 0) {
            this.field2427[class199_3.field2440][class199_3.field2450] = null;
            class199_3.field2436 = 0;
         }
      }

   }

   public synchronized void method3720(int i_1, int i_2, int i_3) {
      this.method3824(i_1, i_2, 2040435181);
   }

   public static boolean method3811(int i_0) {
      class97 class97_1 = (class97) class96.field1324.method4838();
      return class97_1 != null;
   }

}
