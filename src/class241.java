import java.io.IOException;

public class class241 extends class175 {

   public static class241[] field3219;
   public static class233 field3225;
   static class145 field3215 = new class145(256);
   public int field3220 = -1;
   int field3212 = -1;
   public int field3218 = 0;
   public String[] field3210 = new String[5];
   int field3222 = Integer.MAX_VALUE;
   int field3223 = Integer.MAX_VALUE;
   int field3224 = Integer.MIN_VALUE;
   int field3231 = Integer.MIN_VALUE;
   public class255 field3226;
   public class238 field3227;
   public int field3230;
   public final int field3213;
   public String field3216;
   public int field3217;
   int[] field3221;
   public String field3211;
   int[] field3228;
   byte[] field3214;

   public class241(int i_1) {
      this.field3226 = class255.field3458;
      this.field3227 = class238.field3193;
      this.field3230 = -1;
      this.field3213 = i_1;
   }

   public class325 method4379(boolean bool_1, int i_2) {
      int i_3 = this.field3220;
      return this.method4372(i_3, -517237521);
   }

   class325 method4372(int i_1, int i_2) {
      if (i_1 < 0) {
         return null;
      } else {
         class325 class325_3 = (class325) field3215.method3320((long)i_1);
         if (class325_3 != null) {
            return class325_3;
         } else {
            class325_3 = class65.method1178(field3225, i_1, 0, -1315452392);
            if (class325_3 != null) {
               field3215.method3322(class325_3, (long)i_1);
            }

            return class325_3;
         }
      }
   }

   void method4371(class300 class300_1, int i_2, int i_3) {
      if (i_2 == 1) {
         this.field3220 = class300_1.method5511((byte) 64);
      } else if (i_2 == 2) {
         this.field3212 = class300_1.method5511((byte) 92);
      } else if (i_2 == 3) {
         this.field3216 = class300_1.method5503(-231155257);
      } else if (i_2 == 4) {
         this.field3217 = class300_1.method5567(1505854097);
      } else if (i_2 == 5) {
         class300_1.method5567(-1468252810);
      } else if (i_2 == 6) {
         this.field3218 = class300_1.method5504((byte) 20);
      } else {
         int i_4;
         if (i_2 == 7) {
            i_4 = class300_1.method5504((byte) 41);
            if ((i_4 & 0x1) == 0) {
               ;
            }

            if ((i_4 & 0x2) == 2) {
               ;
            }
         } else if (i_2 == 8) {
            class300_1.method5504((byte) 28);
         } else if (i_2 >= 10 && i_2 <= 14) {
            this.field3210[i_2 - 10] = class300_1.method5503(-231155257);
         } else if (i_2 == 15) {
            i_4 = class300_1.method5504((byte) 35);
            this.field3221 = new int[i_4 * 2];

            int i_5;
            for (i_5 = 0; i_5 < i_4 * 2; i_5++) {
               this.field3221[i_5] = class300_1.method5606(-1327508233);
            }

            class300_1.method5499((byte) -14);
            i_5 = class300_1.method5504((byte) 49);
            this.field3228 = new int[i_5];

            int i_6;
            for (i_6 = 0; i_6 < this.field3228.length; i_6++) {
               this.field3228[i_6] = class300_1.method5499((byte) -30);
            }

            this.field3214 = new byte[i_4];

            for (i_6 = 0; i_6 < i_4; i_6++) {
               this.field3214[i_6] = class300_1.method5495((byte) 0);
            }
         } else if (i_2 != 16) {
            if (i_2 == 17) {
               this.field3211 = class300_1.method5503(-231155257);
            } else if (i_2 == 18) {
               class300_1.method5511((byte) -26);
            } else if (i_2 == 19) {
               this.field3230 = class300_1.method5496(-1459053594);
            } else if (i_2 == 21) {
               class300_1.method5499((byte) -58);
            } else if (i_2 == 22) {
               class300_1.method5499((byte) -52);
            } else if (i_2 == 23) {
               class300_1.method5504((byte) 21);
               class300_1.method5504((byte) 46);
               class300_1.method5504((byte) 80);
            } else if (i_2 == 24) {
               class300_1.method5606(-1327508233);
               class300_1.method5606(-1327508233);
            } else if (i_2 == 25) {
               class300_1.method5511((byte) -12);
            } else if (i_2 == 28) {
               class300_1.method5504((byte) 58);
            } else if (i_2 == 29) {
               class255[] arr_7 = new class255[] {class255.field3461, class255.field3460, class255.field3458};
               this.field3226 = (class255) class107.method2476(arr_7, class300_1.method5504((byte) 61), (byte) 0);
            } else if (i_2 == 30) {
               class238[] arr_8 = new class238[] {class238.field3193, class238.field3195, class238.field3194};
               this.field3227 = (class238) class107.method2476(arr_8, class300_1.method5504((byte) 89), (byte) 0);
            }
         }
      }

   }

   public int method4373(byte b_1) {
      return this.field3213;
   }

   public void method4369(class300 class300_1, int i_2) {
      while (true) {
         int i_3 = class300_1.method5504((byte) 29);
         if (i_3 == 0) {
            return;
         }

         this.method4371(class300_1, i_3, -1385963725);
      }
   }

   public void method4370(int i_1) {
      if (this.field3221 != null) {
         for (int i_2 = 0; i_2 < this.field3221.length; i_2 += 2) {
            if (this.field3221[i_2] < this.field3222) {
               this.field3222 = this.field3221[i_2];
            } else if (this.field3221[i_2] > this.field3224) {
               this.field3224 = this.field3221[i_2];
            }

            if (this.field3221[i_2 + 1] < this.field3223) {
               this.field3223 = this.field3221[i_2 + 1];
            } else if (this.field3221[i_2 + 1] > this.field3231) {
               this.field3231 = this.field3221[i_2 + 1];
            }
         }
      }

   }

   static final void method4368(boolean bool_0, int i_1) {
      class186.method3619((byte) 13);
      ++client.field880.field1319;
      if (client.field880.field1319 >= 50 || bool_0) {
         client.field880.field1319 = 0;
         if (!client.field701 && client.field880.method2223((short) 9950) != null) {
            class187 class187_2 = class235.method4265(class183.field2225, client.field880.field1313, 1775123545);
            client.field880.method2219(class187_2, 2067459847);

            try {
               client.field880.method2234(294803591);
            } catch (IOException ioexception_4) {
               client.field701 = true;
            }
         }

      }
   }

}
