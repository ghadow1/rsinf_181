public class class201 extends LinkedListNode {

   class103[] field2474 = new class103[128];
   short[] field2482 = new short[128];
   byte[] field2476 = new byte[128];
   byte[] field2477 = new byte[128];
   class196[] field2481 = new class196[128];
   byte[] field2479 = new byte[128];
   int[] field2480 = new int[128];
   int field2475;

   class201(byte[] bytes_1) {
      ByteBuffer class300_2 = new ByteBuffer(bytes_1);

      int i_3;
      for (i_3 = 0; class300_2.buffer[i_3 + class300_2.position] != 0; i_3++) {
         ;
      }

      byte[] bytes_4 = new byte[i_3];

      int i_5;
      for (i_5 = 0; i_5 < i_3; i_5++) {
         bytes_4[i_5] = class300_2.readSignedByte();
      }

      ++class300_2.position;
      ++i_3;
      i_5 = class300_2.position;
      class300_2.position += i_3;

      int i_6;
      for (i_6 = 0; class300_2.buffer[i_6 + class300_2.position] != 0; i_6++) {
         ;
      }

      byte[] bytes_7 = new byte[i_6];

      int i_8;
      for (i_8 = 0; i_8 < i_6; i_8++) {
         bytes_7[i_8] = class300_2.readSignedByte();
      }

      ++class300_2.position;
      ++i_6;
      i_8 = class300_2.position;
      class300_2.position += i_6;

      int i_9;
      for (i_9 = 0; class300_2.buffer[i_9 + class300_2.position] != 0; i_9++) {
         ;
      }

      byte[] bytes_10 = new byte[i_9];

      for (int i_11 = 0; i_11 < i_9; i_11++) {
         bytes_10[i_11] = class300_2.readSignedByte();
      }

      ++class300_2.position;
      ++i_9;
      byte[] bytes_36 = new byte[i_9];
      int i_12;
      int i_14;
      if (i_9 > 1) {
         bytes_36[1] = 1;
         int i_13 = 1;
         i_12 = 2;

         for (i_14 = 2; i_14 < i_9; i_14++) {
            int i_15 = class300_2.readUnsignedByte();
            if (i_15 == 0) {
               i_13 = i_12++;
            } else {
               if (i_15 <= i_13) {
                  --i_15;
               }

               i_13 = i_15;
            }

            bytes_36[i_14] = (byte)i_13;
         }
      } else {
         i_12 = i_9;
      }

      class196[] arr_37 = new class196[i_12];

      class196 class196_38;
      for (i_14 = 0; i_14 < arr_37.length; i_14++) {
         class196_38 = arr_37[i_14] = new class196();
         int i_16 = class300_2.readUnsignedByte();
         if (i_16 > 0) {
            class196_38.field2387 = new byte[i_16 * 2];
         }

         i_16 = class300_2.readUnsignedByte();
         if (i_16 > 0) {
            class196_38.field2388 = new byte[i_16 * 2 + 2];
            class196_38.field2388[1] = 64;
         }
      }

      i_14 = class300_2.readUnsignedByte();
      byte[] bytes_45 = i_14 > 0 ? new byte[i_14 * 2] : null;
      i_14 = class300_2.readUnsignedByte();
      byte[] bytes_39 = i_14 > 0 ? new byte[i_14 * 2] : null;

      int i_17;
      for (i_17 = 0; class300_2.buffer[i_17 + class300_2.position] != 0; i_17++) {
         ;
      }

      byte[] bytes_18 = new byte[i_17];

      int i_19;
      for (i_19 = 0; i_19 < i_17; i_19++) {
         bytes_18[i_19] = class300_2.readSignedByte();
      }

      ++class300_2.position;
      ++i_17;
      i_19 = 0;

      int i_20;
      for (i_20 = 0; i_20 < 128; i_20++) {
         i_19 += class300_2.readUnsignedByte();
         this.field2482[i_20] = (short)i_19;
      }

      i_19 = 0;

      for (i_20 = 0; i_20 < 128; i_20++) {
         i_19 += class300_2.readUnsignedByte();
         this.field2482[i_20] = (short)(this.field2482[i_20] + (i_19 << 8));
      }

      i_20 = 0;
      int i_21 = 0;
      int i_22 = 0;

      int i_23;
      for (i_23 = 0; i_23 < 128; i_23++) {
         if (i_20 == 0) {
            if (i_21 < bytes_18.length) {
               i_20 = bytes_18[i_21++];
            } else {
               i_20 = -1;
            }

            i_22 = class300_2.readVarInt();
         }

         this.field2482[i_23] = (short)(this.field2482[i_23] + ((i_22 - 1 & 0x2) << 14));
         this.field2480[i_23] = i_22;
         --i_20;
      }

      i_20 = 0;
      i_21 = 0;
      i_23 = 0;

      int i_24;
      for (i_24 = 0; i_24 < 128; i_24++) {
         if (this.field2480[i_24] != 0) {
            if (i_20 == 0) {
               if (i_21 < bytes_4.length) {
                  i_20 = bytes_4[i_21++];
               } else {
                  i_20 = -1;
               }

               i_23 = class300_2.buffer[i_5++] - 1;
            }

            this.field2479[i_24] = (byte)i_23;
            --i_20;
         }
      }

      i_20 = 0;
      i_21 = 0;
      i_24 = 0;

      for (int i_25 = 0; i_25 < 128; i_25++) {
         if (this.field2480[i_25] != 0) {
            if (i_20 == 0) {
               if (i_21 < bytes_7.length) {
                  i_20 = bytes_7[i_21++];
               } else {
                  i_20 = -1;
               }

               i_24 = class300_2.buffer[i_8++] + 16 << 2;
            }

            this.field2477[i_25] = (byte)i_24;
            --i_20;
         }
      }

      i_20 = 0;
      i_21 = 0;
      class196 class196_40 = null;

      int i_26;
      for (i_26 = 0; i_26 < 128; i_26++) {
         if (this.field2480[i_26] != 0) {
            if (i_20 == 0) {
               class196_40 = arr_37[bytes_36[i_21]];
               if (i_21 < bytes_10.length) {
                  i_20 = bytes_10[i_21++];
               } else {
                  i_20 = -1;
               }
            }

            this.field2481[i_26] = class196_40;
            --i_20;
         }
      }

      i_20 = 0;
      i_21 = 0;
      i_26 = 0;

      int i_27;
      for (i_27 = 0; i_27 < 128; i_27++) {
         if (i_20 == 0) {
            if (i_21 < bytes_18.length) {
               i_20 = bytes_18[i_21++];
            } else {
               i_20 = -1;
            }

            if (this.field2480[i_27] > 0) {
               i_26 = class300_2.readUnsignedByte() + 1;
            }
         }

         this.field2476[i_27] = (byte)i_26;
         --i_20;
      }

      this.field2475 = class300_2.readUnsignedByte() + 1;

      class196 class196_28;
      int i_29;
      for (i_27 = 0; i_27 < i_12; i_27++) {
         class196_28 = arr_37[i_27];
         if (class196_28.field2387 != null) {
            for (i_29 = 1; i_29 < class196_28.field2387.length; i_29 += 2) {
               class196_28.field2387[i_29] = class300_2.readSignedByte();
            }
         }

         if (class196_28.field2388 != null) {
            for (i_29 = 3; i_29 < class196_28.field2388.length - 2; i_29 += 2) {
               class196_28.field2388[i_29] = class300_2.readSignedByte();
            }
         }
      }

      if (bytes_45 != null) {
         for (i_27 = 1; i_27 < bytes_45.length; i_27 += 2) {
            bytes_45[i_27] = class300_2.readSignedByte();
         }
      }

      if (bytes_39 != null) {
         for (i_27 = 1; i_27 < bytes_39.length; i_27 += 2) {
            bytes_39[i_27] = class300_2.readSignedByte();
         }
      }

      for (i_27 = 0; i_27 < i_12; i_27++) {
         class196_28 = arr_37[i_27];
         if (class196_28.field2388 != null) {
            i_19 = 0;

            for (i_29 = 2; i_29 < class196_28.field2388.length; i_29 += 2) {
               i_19 = i_19 + 1 + class300_2.readUnsignedByte();
               class196_28.field2388[i_29] = (byte)i_19;
            }
         }
      }

      for (i_27 = 0; i_27 < i_12; i_27++) {
         class196_28 = arr_37[i_27];
         if (class196_28.field2387 != null) {
            i_19 = 0;

            for (i_29 = 2; i_29 < class196_28.field2387.length; i_29 += 2) {
               i_19 = i_19 + 1 + class300_2.readUnsignedByte();
               class196_28.field2387[i_29] = (byte)i_19;
            }
         }
      }

      byte b_30;
      int i_32;
      int i_33;
      int i_34;
      int i_42;
      byte b_44;
      if (bytes_45 != null) {
         i_19 = class300_2.readUnsignedByte();
         bytes_45[0] = (byte)i_19;

         for (i_27 = 2; i_27 < bytes_45.length; i_27 += 2) {
            i_19 = i_19 + 1 + class300_2.readUnsignedByte();
            bytes_45[i_27] = (byte)i_19;
         }

         b_44 = bytes_45[0];
         byte b_41 = bytes_45[1];

         for (i_29 = 0; i_29 < b_44; i_29++) {
            this.field2476[i_29] = (byte)(b_41 * this.field2476[i_29] + 32 >> 6);
         }

         for (i_29 = 2; i_29 < bytes_45.length; i_29 += 2) {
            b_30 = bytes_45[i_29];
            byte b_31 = bytes_45[i_29 + 1];
            i_32 = b_41 * (b_30 - b_44) + (b_30 - b_44) / 2;

            for (i_33 = b_44; i_33 < b_30; i_33++) {
               i_34 = class120.method2767(i_32, b_30 - b_44, -989207473);
               this.field2476[i_33] = (byte)(i_34 * this.field2476[i_33] + 32 >> 6);
               i_32 += b_31 - b_41;
            }

            b_44 = b_30;
            b_41 = b_31;
         }

         for (i_42 = b_44; i_42 < 128; i_42++) {
            this.field2476[i_42] = (byte)(b_41 * this.field2476[i_42] + 32 >> 6);
         }

         class196_38 = null;
      }

      if (bytes_39 != null) {
         i_19 = class300_2.readUnsignedByte();
         bytes_39[0] = (byte)i_19;

         for (i_27 = 2; i_27 < bytes_39.length; i_27 += 2) {
            i_19 = 1 + i_19 + class300_2.readUnsignedByte();
            bytes_39[i_27] = (byte)i_19;
         }

         b_44 = bytes_39[0];
         int i_47 = bytes_39[1] << 1;

         for (i_29 = 0; i_29 < b_44; i_29++) {
            i_42 = i_47 + (this.field2477[i_29] & 0xff);
            if (i_42 < 0) {
               i_42 = 0;
            }

            if (i_42 > 128) {
               i_42 = 128;
            }

            this.field2477[i_29] = (byte)i_42;
         }

         int i_43;
         for (i_29 = 2; i_29 < bytes_39.length; i_29 += 2) {
            b_30 = bytes_39[i_29];
            i_43 = bytes_39[i_29 + 1] << 1;
            i_32 = i_47 * (b_30 - b_44) + (b_30 - b_44) / 2;

            for (i_33 = b_44; i_33 < b_30; i_33++) {
               i_34 = class120.method2767(i_32, b_30 - b_44, -808907900);
               int i_35 = i_34 + (this.field2477[i_33] & 0xff);
               if (i_35 < 0) {
                  i_35 = 0;
               }

               if (i_35 > 128) {
                  i_35 = 128;
               }

               this.field2477[i_33] = (byte)i_35;
               i_32 += i_43 - i_47;
            }

            b_44 = b_30;
            i_47 = i_43;
         }

         for (i_42 = b_44; i_42 < 128; i_42++) {
            i_43 = i_47 + (this.field2477[i_42] & 0xff);
            if (i_43 < 0) {
               i_43 = 0;
            }

            if (i_43 > 128) {
               i_43 = 128;
            }

            this.field2477[i_42] = (byte)i_43;
         }

         Object obj_46 = null;
      }

      for (i_27 = 0; i_27 < i_12; i_27++) {
         arr_37[i_27].field2392 = class300_2.readUnsignedByte();
      }

      for (i_27 = 0; i_27 < i_12; i_27++) {
         class196_28 = arr_37[i_27];
         if (class196_28.field2387 != null) {
            class196_28.field2390 = class300_2.readUnsignedByte();
         }

         if (class196_28.field2388 != null) {
            class196_28.field2398 = class300_2.readUnsignedByte();
         }

         if (class196_28.field2392 > 0) {
            class196_28.field2391 = class300_2.readUnsignedByte();
         }
      }

      for (i_27 = 0; i_27 < i_12; i_27++) {
         arr_37[i_27].field2394 = class300_2.readUnsignedByte();
      }

      for (i_27 = 0; i_27 < i_12; i_27++) {
         class196_28 = arr_37[i_27];
         if (class196_28.field2394 > 0) {
            class196_28.field2393 = class300_2.readUnsignedByte();
         }
      }

      for (i_27 = 0; i_27 < i_12; i_27++) {
         class196_28 = arr_37[i_27];
         if (class196_28.field2393 > 0) {
            class196_28.field2395 = class300_2.readUnsignedByte();
         }
      }

   }

   void method3889(int i_1) {
      this.field2480 = null;
   }

   boolean method3883(class108 class108_1, byte[] bytes_2, int[] ints_3, int i_4) {
      boolean bool_5 = true;
      int i_6 = 0;
      class103 class103_7 = null;

      for (int i_8 = 0; i_8 < 128; i_8++) {
         if (bytes_2 == null || bytes_2[i_8] != 0) {
            int i_9 = this.field2480[i_8];
            if (i_9 != 0) {
               if (i_9 != i_6) {
                  i_6 = i_9--;
                  if ((i_9 & 0x1) == 0) {
                     class103_7 = class108_1.method2483(i_9 >> 2, ints_3, (byte) 127);
                  } else {
                     class103_7 = class108_1.method2484(i_9 >> 2, ints_3, 724127180);
                  }

                  if (class103_7 == null) {
                     bool_5 = false;
                  }
               }

               if (class103_7 != null) {
                  this.field2474[i_8] = class103_7;
                  this.field2480[i_8] = 0;
               }
            }
         }
      }

      return bool_5;
   }

   public static class243 method3887(int i_0, byte b_1) {
      class243 class243_2 = (class243) class243.field3239.method3320((long)i_0);
      if (class243_2 != null) {
         return class243_2;
      } else {
         byte[] bytes_3 = class243.field3247.method4144(13, i_0);
         class243_2 = new class243();
         class243_2.field3241 = i_0;
         if (bytes_3 != null) {
            class243_2.method4407(new ByteBuffer(bytes_3), 65111702);
         }

         class243.field3239.method3322(class243_2, (long)i_0);
         return class243_2;
      }
   }

   public static void method3888(byte b_0) {
      class248.field3294.method3323();
   }

   static final void method3885(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
      class68 class68_10 = null;

      for (class68 class68_11 = (class68) Client.field783.method4892(); class68_11 != null; class68_11 = (class68) Client.field783.method4894()) {
         if (i_0 == class68_11.field943 && class68_11.field937 == i_1 && i_2 == class68_11.field934 && i_3 == class68_11.field932) {
            class68_10 = class68_11;
            break;
         }
      }

      if (class68_10 == null) {
         class68_10 = new class68();
         class68_10.field943 = i_0;
         class68_10.field932 = i_3;
         class68_10.field937 = i_1;
         class68_10.field934 = i_2;
         class294.method5327(class68_10, -813349979);
         Client.field783.method4917(class68_10);
      }

      class68_10.field938 = i_4;
      class68_10.field940 = i_5;
      class68_10.field939 = i_6;
      class68_10.field941 = i_7;
      class68_10.field931 = i_8;
   }

}
