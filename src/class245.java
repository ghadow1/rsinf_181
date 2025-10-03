public class class245 extends DualNode {

   public static int field3263;
   static class233 field3274;
   public static class145 field3273 = new class145(64);
   public int field3265 = -1;
   int[] field3262 = new int[] {-1, -1, -1, -1, -1};
   public boolean field3272 = false;
   int[] field3266;
   short[] field3267;
   short[] field3264;
   short[] field3269;
   short[] field3270;

   void method4436(ByteBuffer class300_1, int i_2) {
      if (i_2 == 1) {
         this.field3265 = class300_1.readUnsignedByte();
      } else {
         int i_4;
         int i_5;
         if (i_2 == 2) {
            i_4 = class300_1.readUnsignedByte();
            this.field3266 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field3266[i_5] = class300_1.readUnsignedShort();
            }
         } else if (i_2 == 3) {
            this.field3272 = true;
         } else if (i_2 == 40) {
            i_4 = class300_1.readUnsignedByte();
            this.field3267 = new short[i_4];
            this.field3264 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field3267[i_5] = (short)class300_1.readUnsignedShort();
               this.field3264[i_5] = (short)class300_1.readUnsignedShort();
            }
         } else if (i_2 == 41) {
            i_4 = class300_1.readUnsignedByte();
            this.field3269 = new short[i_4];
            this.field3270 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
               this.field3269[i_5] = (short)class300_1.readUnsignedShort();
               this.field3270[i_5] = (short)class300_1.readUnsignedShort();
            }
         } else if (i_2 >= 60 && i_2 < 70) {
            this.field3262[i_2 - 60] = class300_1.readUnsignedShort();
         }
      }

   }

   public boolean method4445(int i_1) {
      boolean bool_2 = true;

      for (int i_3 = 0; i_3 < 5; i_3++) {
         if (this.field3262[i_3] != -1 && !class288.field3665.method4146(this.field3262[i_3], 0)) {
            bool_2 = false;
         }
      }

      return bool_2;
   }

   public Model method4441() {
      Model[] arr_2 = new Model[5];
      int i_3 = 0;

      for (int i_4 = 0; i_4 < 5; i_4++) {
         if (this.field3262[i_4] != -1) {
            arr_2[i_3++] = Model.method2769(class288.field3665, this.field3262[i_4], 0);
         }
      }

      Model model_6 = new Model(arr_2, i_3);
      int i_5;
      if (this.field3267 != null) {
         for (i_5 = 0; i_5 < this.field3267.length; i_5++) {
            model_6.method2783(this.field3267[i_5], this.field3264[i_5]);
         }
      }

      if (this.field3269 != null) {
         for (i_5 = 0; i_5 < this.field3269.length; i_5++) {
            model_6.method2784(this.field3269[i_5], this.field3270[i_5]);
         }
      }

      return model_6;
   }

   public boolean method4440(int i_1) {
      if (this.field3266 == null) {
         return true;
      } else {
         boolean bool_2 = true;

         for (int i_3 = 0; i_3 < this.field3266.length; i_3++) {
            if (!class288.field3665.method4146(this.field3266[i_3], 0)) {
               bool_2 = false;
            }
         }

         return bool_2;
      }
   }

   void method4449(ByteBuffer class300_1) {
      while (true) {
         int i_3 = class300_1.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.method4436(class300_1, i_3);
      }
   }

   public Model method4439() {
      if (this.field3266 == null) {
         return null;
      } else {
         Model[] arr_2 = new Model[this.field3266.length];

         for (int i_3 = 0; i_3 < this.field3266.length; i_3++) {
            arr_2[i_3] = Model.method2769(class288.field3665, this.field3266[i_3], 0);
         }

         Model model_5;
         if (arr_2.length == 1) {
            model_5 = arr_2[0];
         } else {
            model_5 = new Model(arr_2, arr_2.length);
         }

         int i_4;
         if (this.field3267 != null) {
            for (i_4 = 0; i_4 < this.field3267.length; i_4++) {
               model_5.method2783(this.field3267[i_4], this.field3264[i_4]);
            }
         }

         if (this.field3269 != null) {
            for (i_4 = 0; i_4 < this.field3269.length; i_4++) {
               model_5.method2784(this.field3269[i_4], this.field3270[i_4]);
            }
         }

         return model_5;
      }
   }

   static final void method4461(int i_0) {
      for (int i_1 = 0; i_1 < Client.field893; i_1++) {
         --Client.field897[i_1];
         if (Client.field897[i_1] >= -10) {
            class101 class101_10 = Client.field898[i_1];
            if (class101_10 == null) {
               Object obj_10000 = null;
               class101_10 = class101.method2334(class13.field89, Client.field894[i_1], 0);
               if (class101_10 == null) {
                  continue;
               }

               Client.field897[i_1] += class101_10.method2331();
               Client.field898[i_1] = class101_10;
            }

            if (Client.field897[i_1] < 0) {
               int i_3;
               if (Client.field841[i_1] != 0) {
                  int i_4 = (Client.field841[i_1] & 0xff) * 128;
                  int i_5 = Client.field841[i_1] >> 16 & 0xff;
                  int i_6 = i_5 * 128 + 64 - Client.localPlayer.x;
                  if (i_6 < 0) {
                     i_6 = -i_6;
                  }

                  int i_7 = Client.field841[i_1] >> 8 & 0xff;
                  int i_8 = i_7 * 128 + 64 - Client.localPlayer.y;
                  if (i_8 < 0) {
                     i_8 = -i_8;
                  }

                  int i_9 = i_6 + i_8 - 128;
                  if (i_9 > i_4) {
                     Client.field897[i_1] = -100;
                     continue;
                  }

                  if (i_9 < 0) {
                     i_9 = 0;
                  }

                  i_3 = (i_4 - i_9) * Client.field892 / i_4;
               } else {
                  i_3 = Client.field891;
               }

               if (i_3 > 0) {
                  RawSound rawSound_11 = class101_10.method2330().method2376(class84.field1177);
                  class113 class113_12 = class113.method2529(rawSound_11, 100, i_3);
                  class113_12.method2626(Client.field895[i_1] - 1);
                  class57.field532.method2286(class113_12);
               }

               Client.field897[i_1] = -100;
            }
         } else {
            --Client.field893;

            for (int i_2 = i_1; i_2 < Client.field893; i_2++) {
               Client.field894[i_2] = Client.field894[i_2 + 1];
               Client.field898[i_2] = Client.field898[i_2 + 1];
               Client.field895[i_2] = Client.field895[i_2 + 1];
               Client.field897[i_2] = Client.field897[i_2 + 1];
               Client.field841[i_2] = Client.field841[i_2 + 1];
            }

            --i_1;
         }
      }

      if (Client.field699) {
         boolean bool_13;
         if (class197.field2402 != 0) {
            bool_13 = true;
         } else {
            bool_13 = MouseRecorder.field1099.method3713(-1920160);
         }

         if (!bool_13) {
            if (Client.field911 != 0 && Client.field889 != -1) {
               class169.method3503(class29.field253, Client.field889, 0, Client.field911, false, 1090882543);
            }

            Client.field699 = false;
         }
      }

   }

}
