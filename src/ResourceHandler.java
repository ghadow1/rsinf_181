public class ResourceHandler {

   static int field1407;
   int field1414;
   int field1406 = 32;
   long field1412 = TimeUtils.getAdjustedTimeMillis();
   long field1416 = 0L;
   int field1417 = 0;
   int field1418 = 0;
   int field1419 = 0;
   long field1420 = 0L;
   boolean field1421 = true;
   int field1423 = 0;
   class115[] field1426 = new class115[8];
   class115[] field1425 = new class115[8];
   int field1424;
   int field1413;
   protected int[] field1415;
   class115 field1410;

   protected void vmethod2418(int i_1) throws Exception {
   }

   protected void vmethod2438(byte b_1) {
   }

   public final synchronized void cleanup() {
      if (this.field1415 != null) {
         long long_2 = TimeUtils.getAdjustedTimeMillis();

         try {
            if (this.field1416 != 0L) {
               if (long_2 < this.field1416) {
                  return;
               }

               this.vmethod2414(this.field1424, (byte) 2);
               this.field1416 = 0L;
               this.field1421 = true;
            }

            int i_4 = this.vmethod2415((byte) 97);
            if (this.field1419 - i_4 > this.field1417) {
               this.field1417 = this.field1419 - i_4;
            }

            int i_5 = this.field1413 + this.field1414;
            if (i_5 + 256 > 16384) {
               i_5 = 16128;
            }

            if (i_5 + 256 > this.field1424) {
               this.field1424 += 1024;
               if (this.field1424 > 16384) {
                  this.field1424 = 16384;
               }

               this.vmethod2438((byte) 19);
               this.vmethod2414(this.field1424, (byte) 45);
               i_4 = 0;
               this.field1421 = true;
               if (i_5 + 256 > this.field1424) {
                  i_5 = this.field1424 - 256;
                  this.field1413 = i_5 - this.field1414;
               }
            }

            while (i_4 < i_5) {
               this.method2411(this.field1415, 256);
               this.vmethod2404();
               i_4 += 256;
            }

            if (long_2 > this.field1420) {
               if (!this.field1421) {
                  if (this.field1417 == 0 && this.field1418 == 0) {
                     this.vmethod2438((byte) -27);
                     this.field1416 = 2000L + long_2;
                     return;
                  }

                  this.field1413 = Math.min(this.field1418, this.field1417);
                  this.field1418 = this.field1417;
               } else {
                  this.field1421 = false;
               }

               this.field1417 = 0;
               this.field1420 = 2000L + long_2;
            }

            this.field1419 = i_4;
         } catch (Exception exception_8) {
            this.vmethod2438((byte) 57);
            this.field1416 = long_2 + 2000L;
         }

         try {
            if (long_2 > 500000L + this.field1412) {
               long_2 = this.field1412;
            }

            while (long_2 > 5000L + this.field1412) {
               this.method2410(256, 1268557925);
               this.field1412 += (long)(256000 / class172.field2078);
            }
         } catch (Exception exception_7) {
            this.field1412 = long_2;
         }

      }
   }

   protected int vmethod2415(byte b_1) throws Exception {
      return this.field1424;
   }

   protected void vmethod2414(int i_1, byte b_2) throws Exception {
   }

   public final synchronized void method2408(int i_1) {
      this.field1421 = true;

      try {
         this.vmethod2418(-313753219);
      } catch (Exception exception_3) {
         this.vmethod2438((byte) 66);
         this.field1416 = TimeUtils.getAdjustedTimeMillis() + 2000L;
      }

   }

   final void method2410(int i_1, int i_2) {
      this.field1423 -= i_1;
      if (this.field1423 < 0) {
         this.field1423 = 0;
      }

      if (this.field1410 != null) {
         this.field1410.vmethod3906(i_1);
      }

   }

   public final synchronized void method2434(byte b_1) {
      if (class88.field1246 != null) {
         boolean bool_2 = true;

         for (int i_3 = 0; i_3 < 2; i_3++) {
            if (this == class88.field1246.handlers[i_3]) {
               class88.field1246.handlers[i_3] = null;
            }

            if (class88.field1246.handlers[i_3] != null) {
               bool_2 = false;
            }
         }

         if (bool_2) {
            MilliClock.field97.shutdownNow();
            MilliClock.field97 = null;
            class88.field1246 = null;
         }
      }

      this.vmethod2438((byte) 57);
      this.field1415 = null;
   }

   final void method2456(class115 class115_1, int i_2, int i_3) {
      int i_4 = i_2 >> 5;
      class115 class115_5 = this.field1425[i_4];
      if (class115_5 == null) {
         this.field1426[i_4] = class115_1;
      } else {
         class115_5.field1495 = class115_1;
      }

      this.field1425[i_4] = class115_1;
      class115_1.field1496 = i_2;
   }

   final void method2411(int[] ints_1, int i_2) {
      int i_3 = i_2;
      if (class169.field2053) {
         i_3 = i_2 << 1;
      }

      class301.method5733(ints_1, 0, i_3);
      this.field1423 -= i_2;
      if (this.field1410 != null && this.field1423 <= 0) {
         this.field1423 += class172.field2078 >> 4;
         class77.method1947(this.field1410, -1064292468);
         this.method2456(this.field1410, this.field1410.vmethod2689(), 2049205678);
         int i_4 = 0;
         int i_5 = 255;

         int i_6;
         class115 class115_10;
         label104:
         for (i_6 = 7; i_5 != 0; --i_6) {
            int i_7;
            int i_8;
            if (i_6 < 0) {
               i_7 = i_6 & 0x3;
               i_8 = -(i_6 >> 2);
            } else {
               i_7 = i_6;
               i_8 = 0;
            }

            for (int i_9 = i_5 >>> i_7 & 0x11111111; i_9 != 0; i_9 >>>= 4) {
               if ((i_9 & 0x1) != 0) {
                  i_5 &= ~(1 << i_7);
                  class115_10 = null;
                  class115 class115_11 = this.field1426[i_7];

                  label98:
                  while (true) {
                     while (true) {
                        if (class115_11 == null) {
                           break label98;
                        }

                        class118 class118_12 = class115_11.field1497;
                        if (class118_12 != null && class118_12.field1529 > i_8) {
                           i_5 |= 1 << i_7;
                           class115_10 = class115_11;
                           class115_11 = class115_11.field1495;
                        } else {
                           class115_11.field1498 = true;
                           int i_13 = class115_11.vmethod3892();
                           i_4 += i_13;
                           if (class118_12 != null) {
                              class118_12.field1529 += i_13;
                           }

                           if (i_4 >= this.field1406) {
                              break label104;
                           }

                           class115 class115_14 = class115_11.vmethod3894();
                           if (class115_14 != null) {
                              for (int i_15 = class115_11.field1496; class115_14 != null; class115_14 = class115_11.vmethod3891()) {
                                 this.method2456(class115_14, i_15 * class115_14.vmethod2689() >> 8, -1474916440);
                              }
                           }

                           class115 class115_18 = class115_11.field1495;
                           class115_11.field1495 = null;
                           if (class115_10 == null) {
                              this.field1426[i_7] = class115_18;
                           } else {
                              class115_10.field1495 = class115_18;
                           }

                           if (class115_18 == null) {
                              this.field1425[i_7] = class115_10;
                           }

                           class115_11 = class115_18;
                        }
                     }
                  }
               }

               i_7 += 4;
               ++i_8;
            }
         }

         for (i_6 = 0; i_6 < 8; i_6++) {
            class115 class115_16 = this.field1426[i_6];
            class115[] arr_17 = this.field1426;
            this.field1425[i_6] = null;

            for (arr_17[i_6] = null; class115_16 != null; class115_16 = class115_10) {
               class115_10 = class115_16.field1495;
               class115_16.field1495 = null;
            }
         }
      }

      if (this.field1423 < 0) {
         this.field1423 = 0;
      }

      if (this.field1410 != null) {
         this.field1410.vmethod3893(ints_1, 0, i_2);
      }

      this.field1412 = TimeUtils.getAdjustedTimeMillis();
   }

   protected void vmethod2404() throws Exception {
   }

   public final void method2407(byte b_1) {
      this.field1421 = true;
   }

   public final synchronized void method2424(class115 class115_1, int i_2) {
      this.field1410 = class115_1;
   }

   protected void vmethod2413(int i_1) throws Exception {
   }

   static void method2441(Widget widget_0, int i_1, int i_2, byte b_3) {
      if (widget_0.field2694 == 0) {
         widget_0.field2577 = widget_0.field2651;
      } else if (widget_0.field2694 == 1) {
         widget_0.field2577 = widget_0.field2651 + (i_1 - widget_0.field2579) / 2;
      } else if (widget_0.field2694 == 2) {
         widget_0.field2577 = i_1 - widget_0.field2579 - widget_0.field2651;
      } else if (widget_0.field2694 == 3) {
         widget_0.field2577 = widget_0.field2651 * i_1 >> 14;
      } else if (widget_0.field2694 == 4) {
         widget_0.field2577 = (widget_0.field2651 * i_1 >> 14) + (i_1 - widget_0.field2579) / 2;
      } else {
         widget_0.field2577 = i_1 - widget_0.field2579 - (widget_0.field2651 * i_1 >> 14);
      }

      if (widget_0.field2570 == 0) {
         widget_0.field2699 = widget_0.field2574;
      } else if (widget_0.field2570 == 1) {
         widget_0.field2699 = (i_2 - widget_0.field2667) / 2 + widget_0.field2574;
      } else if (widget_0.field2570 == 2) {
         widget_0.field2699 = i_2 - widget_0.field2667 - widget_0.field2574;
      } else if (widget_0.field2570 == 3) {
         widget_0.field2699 = i_2 * widget_0.field2574 >> 14;
      } else if (widget_0.field2570 == 4) {
         widget_0.field2699 = (i_2 * widget_0.field2574 >> 14) + (i_2 - widget_0.field2667) / 2;
      } else {
         widget_0.field2699 = i_2 - widget_0.field2667 - (i_2 * widget_0.field2574 >> 14);
      }

   }

   public static class323[] method2405(byte b_0) {
      return new class323[] {class323.field3887, class323.field3888, class323.field3885};
   }

}
