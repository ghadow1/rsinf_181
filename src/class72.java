public class class72 {

   static Widget field1059;
   int[] field1042 = new int[256];
   int field1058 = 0;
   int field1048 = 0;
   int field1049 = 0;
   int field1054 = 0;
   int field1055 = 0;
   int field1056 = 0;
   class324[] field1036;
   int[] field1045;
   int[] field1046;
   int[] field1047;
   int[] field1044;
   int[] field1041;
   int[] field1053;
   int[] field1039;
   int[] field1043;

   class72(class324[] arr_1) {
      this.field1036 = arr_1;
      this.method1721();
   }

   static final void method1724(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      int i_9 = i_6 - 334;
      if (i_9 < 0) {
         i_9 = 0;
      } else if (i_9 > 100) {
         i_9 = 100;
      }

      int i_10 = (Client.field908 - Client.field906) * i_9 / 100 + Client.field906;
      int i_8 = i_5 * i_10 / 256;
      i_9 = 2048 - i_3 & 0x7ff;
      i_10 = 2048 - i_4 & 0x7ff;
      int i_11 = 0;
      int i_12 = 0;
      int i_13 = i_8;
      int i_14;
      int i_15;
      int i_16;
      if (i_9 != 0) {
         i_14 = Rasterizer3D.sine[i_9];
         i_15 = Rasterizer3D.cosine[i_9];
         i_16 = i_12 * i_15 - i_14 * i_8 >> 16;
         i_13 = i_12 * i_14 + i_15 * i_8 >> 16;
         i_12 = i_16;
      }

      if (i_10 != 0) {
         i_14 = Rasterizer3D.sine[i_10];
         i_15 = Rasterizer3D.cosine[i_10];
         i_16 = i_14 * i_13 + i_15 * i_11 >> 16;
         i_13 = i_15 * i_13 - i_14 * i_11 >> 16;
         i_11 = i_16;
      }

      PacketBuffer.field3727 = i_0 - i_11;
      GCMonitor.field383 = i_1 - i_12;
      class1.field3 = i_2 - i_13;
      class11.field77 = i_3;
      MouseRecorder.field1112 = i_4;
      if (Client.field727 == 1 && Client.localRights >= 2 && Client.field881 % 50 == 0 && (MouseHandler.field499 >> 7 != Client.localPlayer.x >> 7 || class26.field227 >> 7 != Client.localPlayer.y >> 7)) {
         i_14 = Client.localPlayer.field629;
         i_15 = (MouseHandler.field499 >> 7) + class196.field2389;
         i_16 = (class26.field227 >> 7) + class1.field1;
         class28.method418(i_15, i_16, i_14, true, 1931276581);
      }

   }

   static int method1744(int i_0) {
      UserComparator10 userComparator10_2 = (UserComparator10) class91.field1279.get(Integer.valueOf(i_0));
      return userComparator10_2 == null ? 0 : userComparator10_2.size();
   }

   void method1721() {
      this.field1045 = new int[256];

      int i_2;
      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1045[i_2] = i_2 * 262144;
      }

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1045[i_2 + 64] = i_2 * 1024 + 16711680;
      }

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1045[i_2 + 128] = i_2 * 4 + 16776960;
      }

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1045[i_2 + 192] = 16777215;
      }

      this.field1046 = new int[256];

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1046[i_2] = i_2 * 1024;
      }

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1046[i_2 + 64] = i_2 * 4 + 65280;
      }

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1046[i_2 + 128] = i_2 * 262144 + 65535;
      }

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1046[i_2 + 192] = 16777215;
      }

      this.field1047 = new int[256];

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1047[i_2] = i_2 * 4;
      }

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1047[i_2 + 64] = i_2 * 262144 + 255;
      }

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1047[i_2 + 128] = i_2 * 1024 + 16711935;
      }

      for (i_2 = 0; i_2 < 64; i_2++) {
         this.field1047[i_2 + 192] = 16777215;
      }

      this.field1044 = new int[256];
      this.field1054 = 0;
      this.field1041 = new int[32768];
      this.field1053 = new int[32768];
      this.method1723(null);
      this.field1039 = new int[32768];
      this.field1043 = new int[32768];
   }

   final void method1727(int i_1, int[] ints_2) {
      int i_4 = this.field1044.length;

      for (int i_5 = 0; i_5 < i_4; i_5++) {
         if (i_1 > 768) {
            this.field1044[i_5] = this.method1725(this.field1045[i_5], ints_2[i_5], 1024 - i_1);
         } else if (i_1 > 256) {
            this.field1044[i_5] = ints_2[i_5];
         } else {
            this.field1044[i_5] = this.method1725(ints_2[i_5], this.field1045[i_5], 256 - i_1);
         }
      }

   }

   final void method1728(int i_1) {
      int i_3 = 0;

      for (int i_4 = 1; i_4 < 255; i_4++) {
         int i_5 = (256 - i_4) * this.field1042[i_4] / 256;
         int i_6 = i_5 + i_1;
         int i_7 = 0;
         int i_8 = 128;
         if (i_6 < 0) {
            i_7 = -i_6;
            i_6 = 0;
         }

         if (i_6 + 128 >= class202.field2486.field3877) {
            i_8 = class202.field2486.field3877 - i_6;
         }

         int i_9 = i_6 + (i_4 + 8) * class202.field2486.field3877;
         i_3 += i_7;

         for (int i_10 = i_7; i_10 < i_8; i_10++) {
            int i_11 = this.field1039[i_3++];
            int i_12 = i_9 % Rasterizer2D.Rasterizer2D_width;
            if (i_11 != 0 && i_12 >= Rasterizer2D.Rasterizer2D_xClipStart && i_12 < Rasterizer2D.Rasterizer2D_xClipEnd) {
               int i_13 = i_11;
               int i_14 = 256 - i_11;
               i_11 = this.field1044[i_11];
               int i_15 = class202.field2486.field3876[i_9];
               class202.field2486.field3876[i_9++] = ~0xffffff | (i_14 * (i_15 & 0xff00) + i_13 * (i_11 & 0xff00) & 0xff0000) + ((i_15 & 0xff00ff) * i_14 + (i_11 & 0xff00ff) * i_13 & ~0xff00ff) >> 8;
            } else {
               ++i_9;
            }
         }

         i_3 += 128 - i_8;
      }

   }

   final int method1725(int i_1, int i_2, int i_3) {
      int i_5 = 256 - i_3;
      return (i_5 * (i_1 & 0xff00ff) + i_3 * (i_2 & 0xff00ff) & ~0xff00ff) + (i_3 * (i_2 & 0xff00) + i_5 * (i_1 & 0xff00) & 0xff0000) >> 8;
   }

   final void method1722(int i_1) {
      this.field1054 += 128 * i_1;
      int i_3;
      if (this.field1054 > this.field1041.length) {
         this.field1054 -= this.field1041.length;
         i_3 = (int)(Math.random() * 12.0D);
         this.method1723(this.field1036[i_3]);
      }

      i_3 = 0;
      int i_4 = i_1 * 128;
      int i_5 = (256 - i_1) * 128;

      int i_7;
      for (int i_6 = 0; i_6 < i_5; i_6++) {
         i_7 = this.field1039[i_4 + i_3] - this.field1041[i_3 + this.field1054 & this.field1041.length - 1] * i_1 / 6;
         if (i_7 < 0) {
            i_7 = 0;
         }

         this.field1039[i_3++] = i_7;
      }

      byte b_16 = 10;
      i_7 = 128 - b_16;

      int i_8;
      int i_11;
      for (i_8 = 256 - i_1; i_8 < 256; i_8++) {
         int i_9 = i_8 * 128;

         for (int i_10 = 0; i_10 < 128; i_10++) {
            i_11 = (int)(Math.random() * 100.0D);
            if (i_11 < 50 && i_10 > b_16 && i_10 < i_7) {
               this.field1039[i_10 + i_9] = 255;
            } else {
               this.field1039[i_10 + i_9] = 0;
            }
         }
      }

      if (this.field1048 > 0) {
         this.field1048 -= i_1 * 4;
      }

      if (this.field1049 > 0) {
         this.field1049 -= i_1 * 4;
      }

      if (this.field1048 == 0 && this.field1049 == 0) {
         i_8 = (int)(Math.random() * (double)(2000 / i_1));
         if (i_8 == 0) {
            this.field1048 = 1024;
         }

         if (i_8 == 1) {
            this.field1049 = 1024;
         }
      }

      for (i_8 = 0; i_8 < 256 - i_1; i_8++) {
         this.field1042[i_8] = this.field1042[i_8 + i_1];
      }

      for (i_8 = 256 - i_1; i_8 < 256; i_8++) {
         this.field1042[i_8] = (int)(Math.sin((double)this.field1058 / 14.0D) * 16.0D + Math.sin((double)this.field1058 / 15.0D) * 14.0D + Math.sin((double)this.field1058 / 16.0D) * 12.0D);
         ++this.field1058;
      }

      this.field1055 += i_1;
      i_8 = ((Client.field881 & 0x1) + i_1) / 2;
      if (i_8 > 0) {
         short s_17 = 128;
         byte b_18 = 2;
         i_11 = 128 - b_18 - b_18;

         int i_12;
         int i_13;
         int i_14;
         for (i_12 = 0; i_12 < this.field1055 * 100; i_12++) {
            i_13 = (int)(Math.random() * (double)i_11) + b_18;
            i_14 = (int)(Math.random() * (double)s_17) + s_17;
            this.field1039[i_13 + (i_14 << 7)] = 192;
         }

         this.field1055 = 0;

         int i_15;
         for (i_12 = 0; i_12 < 256; i_12++) {
            i_13 = 0;
            i_14 = i_12 * 128;

            for (i_15 = -i_8; i_15 < 128; i_15++) {
               if (i_8 + i_15 < 128) {
                  i_13 += this.field1039[i_14 + i_15 + i_8];
               }

               if (i_15 - (i_8 + 1) >= 0) {
                  i_13 -= this.field1039[i_14 + i_15 - (i_8 + 1)];
               }

               if (i_15 >= 0) {
                  this.field1043[i_14 + i_15] = i_13 / (i_8 * 2 + 1);
               }
            }
         }

         for (i_12 = 0; i_12 < 128; i_12++) {
            i_13 = 0;

            for (i_14 = -i_8; i_14 < 256; i_14++) {
               i_15 = i_14 * 128;
               if (i_14 + i_8 < 256) {
                  i_13 += this.field1043[i_15 + i_12 + i_8 * 128];
               }

               if (i_14 - (i_8 + 1) >= 0) {
                  i_13 -= this.field1043[i_12 + i_15 - (i_8 + 1) * 128];
               }

               if (i_14 >= 0) {
                  this.field1039[i_12 + i_15] = i_13 / (i_8 * 2 + 1);
               }
            }
         }
      }

   }

   void method1720(byte b_1) {
      this.field1045 = null;
      this.field1046 = null;
      this.field1047 = null;
      this.field1044 = null;
      this.field1041 = null;
      this.field1053 = null;
      this.field1039 = null;
      this.field1043 = null;
      this.field1054 = 0;
      this.field1055 = 0;
   }

   final void method1726(int i_1) {
      int i_3 = this.field1044.length;
      if (this.field1048 > 0) {
         this.method1727(this.field1048, this.field1046);
      } else if (this.field1049 > 0) {
         this.method1727(this.field1049, this.field1047);
      } else {
         for (int i_4 = 0; i_4 < i_3; i_4++) {
            this.field1044[i_4] = this.field1045[i_4];
         }
      }

      this.method1728(i_1);
   }

   final void method1723(class324 class324_1) {
      int i_3;
      for (i_3 = 0; i_3 < this.field1041.length; i_3++) {
         this.field1041[i_3] = 0;
      }

      int i_4;
      for (i_3 = 0; i_3 < 5000; i_3++) {
         i_4 = (int)(Math.random() * 128.0D * 256.0D);
         this.field1041[i_4] = (int)(Math.random() * 256.0D);
      }

      int i_5;
      int i_6;
      for (i_3 = 0; i_3 < 20; i_3++) {
         for (i_4 = 1; i_4 < 255; i_4++) {
            for (i_5 = 1; i_5 < 127; i_5++) {
               i_6 = i_5 + (i_4 << 7);
               this.field1053[i_6] = (this.field1041[i_6 + 128] + this.field1041[i_6 - 128] + this.field1041[i_6 + 1] + this.field1041[i_6 - 1]) / 4;
            }
         }

         int[] ints_9 = this.field1041;
         this.field1041 = this.field1053;
         this.field1053 = ints_9;
      }

      if (class324_1 != null) {
         i_3 = 0;

         for (i_4 = 0; i_4 < class324_1.field3893; i_4++) {
            for (i_5 = 0; i_5 < class324_1.field3897; i_5++) {
               if (class324_1.field3895[i_3++] != 0) {
                  i_6 = i_5 + class324_1.field3890 + 16;
                  int i_7 = i_4 + class324_1.field3891 + 16;
                  int i_8 = i_6 + (i_7 << 7);
                  this.field1041[i_8] = 0;
               }
            }
         }
      }

   }

   void method1735(int i_1, int i_2) {
      if (this.field1039 == null) {
         this.method1721();
      }

      if (this.field1056 == 0) {
         this.field1056 = i_2;
      }

      int i_4 = i_2 - this.field1056;
      if (i_4 >= 256) {
         i_4 = 0;
      }

      this.field1056 = i_2;
      if (i_4 > 0) {
         this.method1722(i_4);
      }

      this.method1726(i_1);
   }

}
