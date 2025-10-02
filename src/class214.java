public class class214 {

   static final int[] field2538 = new int[] {8, 11, 4, 6, 9, 7, 10};
   public static class145 field2536 = new class145(260);
   int[] field2534;
   int[] field2533;
   public boolean field2535;
   public int field2532;
   long field2539;
   long field2537;

   public void method4009(int[] ints_1, int[] ints_2, boolean bool_3, int i_4, int i_5) {
      if (ints_1 == null) {
         ints_1 = new int[12];

         for (int i_6 = 0; i_6 < 7; i_6++) {
            for (int i_7 = 0; i_7 < class245.field3263; i_7++) {
               class245 class245_8 = class231.method4138(i_7, -738252140);
               if (class245_8 != null && !class245_8.field3272 && class245_8.field3265 == i_6 + (bool_3 ? 7 : 0)) {
                  ints_1[field2538[i_6]] = i_7 + 256;
                  break;
               }
            }
         }
      }

      this.field2534 = ints_1;
      this.field2533 = ints_2;
      this.field2535 = bool_3;
      this.field2532 = i_4;
      this.method4018(-642872346);
   }

   void method4018(int i_1) {
      long long_2 = this.field2539;
      int i_4 = this.field2534[5];
      int i_5 = this.field2534[9];
      this.field2534[5] = i_5;
      this.field2534[9] = i_4;
      this.field2539 = 0L;

      int i_6;
      for (i_6 = 0; i_6 < 12; i_6++) {
         this.field2539 <<= 4;
         if (this.field2534[i_6] >= 256) {
            this.field2539 += (long)(this.field2534[i_6] - 256);
         }
      }

      if (this.field2534[0] >= 256) {
         this.field2539 += (long)(this.field2534[0] - 256 >> 4);
      }

      if (this.field2534[1] >= 256) {
         this.field2539 += (long)(this.field2534[1] - 256 >> 8);
      }

      for (i_6 = 0; i_6 < 5; i_6++) {
         this.field2539 <<= 3;
         this.field2539 += (long)this.field2533[i_6];
      }

      this.field2539 <<= 1;
      this.field2539 += (long)(this.field2535 ? 1 : 0);
      this.field2534[5] = i_4;
      this.field2534[9] = i_5;
      if (long_2 != 0L && long_2 != this.field2539) {
         field2536.method3328(long_2);
      }

   }

   public class127 method3997(class258 class258_1, int i_2, class258 class258_3, int i_4, byte b_5) {
      if (this.field2532 != -1) {
         return class53.method1005(this.field2532, (byte) -67).method4707(class258_1, i_2, class258_3, i_4, (byte) 27);
      } else {
         long long_6 = this.field2539;
         int[] ints_8 = this.field2534;
         if (class258_1 != null && (class258_1.field3528 >= 0 || class258_1.field3521 >= 0)) {
            ints_8 = new int[12];

            for (int i_16 = 0; i_16 < 12; i_16++) {
               ints_8[i_16] = this.field2534[i_16];
            }

            if (class258_1.field3528 >= 0) {
               long_6 += (long)(class258_1.field3528 - this.field2534[5] << 40);
               ints_8[5] = class258_1.field3528;
            }

            if (class258_1.field3521 >= 0) {
               long_6 += (long)(class258_1.field3521 - this.field2534[3] << 48);
               ints_8[3] = class258_1.field3521;
            }
         }

         class127 class127_9 = (class127) field2536.method3320(long_6);
         if (class127_9 == null) {
            boolean bool_10 = false;

            int i_12;
            for (int i_11 = 0; i_11 < 12; i_11++) {
               i_12 = ints_8[i_11];
               if (i_12 >= 256 && i_12 < 512 && !class231.method4138(i_12 - 256, -1086244034).method4440(-1807295410)) {
                  bool_10 = true;
               }

               if (i_12 >= 512 && !class26.method404(i_12 - 512, 44972047).method4646(this.field2535, (byte) -66)) {
                  bool_10 = true;
               }
            }

            if (bool_10) {
               if (this.field2537 != -1L) {
                  class127_9 = (class127) field2536.method3320(this.field2537);
               }

               if (class127_9 == null) {
                  return null;
               }
            }

            if (class127_9 == null) {
               class121[] arr_17 = new class121[12];
               i_12 = 0;

               int i_14;
               for (int i_13 = 0; i_13 < 12; i_13++) {
                  i_14 = ints_8[i_13];
                  class121 class121_15;
                  if (i_14 >= 256 && i_14 < 512) {
                     class121_15 = class231.method4138(i_14 - 256, -827109729).method4439(-1043358409);
                     if (class121_15 != null) {
                        arr_17[i_12++] = class121_15;
                     }
                  }

                  if (i_14 >= 512) {
                     class121_15 = class26.method404(i_14 - 512, 44972047).method4694(this.field2535, (byte) 36);
                     if (class121_15 != null) {
                        arr_17[i_12++] = class121_15;
                     }
                  }
               }

               class121 class121_18 = new class121(arr_17, i_12);

               for (i_14 = 0; i_14 < 5; i_14++) {
                  if (this.field2533[i_14] < class247.field3291[i_14].length) {
                     class121_18.method2783(class134.field1870[i_14], class247.field3291[i_14][this.field2533[i_14]]);
                  }

                  if (this.field2533[i_14] < class64.field604[i_14].length) {
                     class121_18.method2783(class35.field309[i_14], class64.field604[i_14][this.field2533[i_14]]);
                  }
               }

               class127_9 = class121_18.method2802(64, 850, -30, -50, -30);
               field2536.method3322(class127_9, long_6);
               this.field2537 = long_6;
            }
         }

         if (class258_1 == null && class258_3 == null) {
            return class127_9;
         } else {
            class127 class127_19;
            if (class258_1 != null && class258_3 != null) {
               class127_19 = class258_1.method4765(class127_9, i_2, class258_3, i_4, 743277610);
            } else if (class258_1 != null) {
               class127_19 = class258_1.method4784(class127_9, i_2, 1904294443);
            } else {
               class127_19 = class258_3.method4784(class127_9, i_4, 1926012083);
            }

            return class127_19;
         }
      }
   }

   class121 method3998(int i_1) {
      if (this.field2532 != -1) {
         return class53.method1005(this.field2532, (byte) 34).method4708((byte) 91);
      } else {
         boolean bool_2 = false;

         int i_4;
         for (int i_3 = 0; i_3 < 12; i_3++) {
            i_4 = this.field2534[i_3];
            if (i_4 >= 256 && i_4 < 512 && !class231.method4138(i_4 - 256, -1285415452).method4445(1439364369)) {
               bool_2 = true;
            }

            if (i_4 >= 512 && !class26.method404(i_4 - 512, 44972047).method4683(this.field2535, -447503257)) {
               bool_2 = true;
            }
         }

         if (bool_2) {
            return null;
         } else {
            class121[] arr_8 = new class121[12];
            i_4 = 0;

            int i_6;
            for (int i_5 = 0; i_5 < 12; i_5++) {
               i_6 = this.field2534[i_5];
               class121 class121_7;
               if (i_6 >= 256 && i_6 < 512) {
                  class121_7 = class231.method4138(i_6 - 256, -202848077).method4441((byte) -27);
                  if (class121_7 != null) {
                     arr_8[i_4++] = class121_7;
                  }
               }

               if (i_6 >= 512) {
                  class121_7 = class26.method404(i_6 - 512, 44972047).method4649(this.field2535, (byte) 81);
                  if (class121_7 != null) {
                     arr_8[i_4++] = class121_7;
                  }
               }
            }

            class121 class121_9 = new class121(arr_8, i_4);

            for (i_6 = 0; i_6 < 5; i_6++) {
               if (this.field2533[i_6] < class247.field3291[i_6].length) {
                  class121_9.method2783(class134.field1870[i_6], class247.field3291[i_6][this.field2533[i_6]]);
               }

               if (this.field2533[i_6] < class64.field604[i_6].length) {
                  class121_9.method2783(class35.field309[i_6], class64.field604[i_6][this.field2533[i_6]]);
               }
            }

            return class121_9;
         }
      }
   }

   public int method3994(int i_1) {
      return this.field2532 == -1 ? (this.field2534[0] << 15) + this.field2534[1] + (this.field2534[11] << 5) + (this.field2534[8] << 10) + (this.field2533[0] << 25) + (this.field2533[4] << 20) : 305419896 + class53.method1005(this.field2532, (byte) -49).field3467;
   }

   public void method3992(int i_1, boolean bool_2, short s_3) {
      if (i_1 != 1 || !this.field2535) {
         int i_4 = this.field2534[field2538[i_1]];
         if (i_4 != 0) {
            i_4 -= 256;

            class245 class245_5;
            do {
               if (!bool_2) {
                  --i_4;
                  if (i_4 < 0) {
                     i_4 = class245.field3263 - 1;
                  }
               } else {
                  ++i_4;
                  if (i_4 >= class245.field3263) {
                     i_4 = 0;
                  }
               }

               class245_5 = class231.method4138(i_4, -941533827);
            } while (class245_5 == null || class245_5.field3272 || class245_5.field3265 != (this.field2535 ? 7 : 0) + i_1);

            this.field2534[field2538[i_1]] = i_4 + 256;
            this.method4018(895941540);
         }
      }
   }

   public void method3993(int i_1, boolean bool_2, byte b_3) {
      int i_4 = this.field2533[i_1];
      boolean bool_5;
      if (!bool_2) {
         do {
            --i_4;
            if (i_4 < 0) {
               i_4 = class247.field3291[i_1].length - 1;
            }

            if (i_1 == 4 && i_4 >= 8) {
               bool_5 = false;
            } else {
               bool_5 = true;
            }
         } while (!bool_5);
      } else {
         do {
            ++i_4;
            if (i_4 >= class247.field3291[i_1].length) {
               i_4 = 0;
            }

            if (i_1 == 4 && i_4 >= 8) {
               bool_5 = false;
            } else {
               bool_5 = true;
            }
         } while (!bool_5);
      }

      this.field2533[i_1] = i_4;
      this.method4018(240562977);
   }

   public void method4006(boolean bool_1, int i_2) {
      if (this.field2535 != bool_1) {
         this.method4009((int[]) null, this.field2533, bool_1, -1, -1386227106);
      }
   }

   public void method3995(class300 class300_1, int i_2) {
      class300_1.method5655(this.field2535 ? 1 : 0, 1752419597);

      int i_3;
      for (i_3 = 0; i_3 < 7; i_3++) {
         int i_4 = this.field2534[field2538[i_3]];
         if (i_4 == 0) {
            class300_1.method5655(-1, 1898816544);
         } else {
            class300_1.method5655(i_4 - 256, 1797214616);
         }
      }

      for (i_3 = 0; i_3 < 5; i_3++) {
         class300_1.method5655(this.field2533[i_3], 276685077);
      }

   }

   public static boolean method4020(class233 class233_0, int i_1, int i_2) {
      byte[] bytes_3 = class233_0.method4208(i_1, 1034279223);
      if (bytes_3 == null) {
         return false;
      } else {
         class185.method3617(bytes_3, (byte) 11);
         return true;
      }
   }

}
