import java.io.IOException;

public class class241 extends DualNode {

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

   public class325 method4379() {
      int i_3 = this.field3220;
      return this.method4372(i_3);
   }

   class325 method4372(int i_1) {
      if (i_1 < 0) {
         return null;
      } else {
         class325 class325_3 = (class325) field3215.get((long)i_1);
         if (class325_3 != null) {
            return class325_3;
         } else {
            class325_3 = class65.method1178(field3225, i_1, 0);
            if (class325_3 != null) {
               field3215.put(class325_3, (long)i_1);
            }

            return class325_3;
         }
      }
   }

   void method4371(ByteBuffer class300_1, int i_2) {
      if (i_2 == 1) {
         this.field3220 = class300_1.readNullableShort();
      } else if (i_2 == 2) {
         this.field3212 = class300_1.readNullableShort();
      } else if (i_2 == 3) {
         this.field3216 = class300_1.readNullTerminatedString();
      } else if (i_2 == 4) {
         this.field3217 = class300_1.read24BitInt();
      } else if (i_2 == 5) {
         class300_1.read24BitInt();
      } else if (i_2 == 6) {
         this.field3218 = class300_1.readUnsignedByte();
      } else {
         int i_4;
         if (i_2 == 7) {
            i_4 = class300_1.readUnsignedByte();
            if ((i_4 & 0x1) == 0) {
               ;
            }

            if ((i_4 & 0x2) == 2) {
               ;
            }
         } else if (i_2 == 8) {
            class300_1.readUnsignedByte();
         } else if (i_2 >= 10 && i_2 <= 14) {
            this.field3210[i_2 - 10] = class300_1.readNullTerminatedString();
         } else if (i_2 == 15) {
            i_4 = class300_1.readUnsignedByte();
            this.field3221 = new int[i_4 * 2];

            int i_5;
            for (i_5 = 0; i_5 < i_4 * 2; i_5++) {
               this.field3221[i_5] = class300_1.readSignedShortBigEndian();
            }

            class300_1.readIntMedEndian();
            i_5 = class300_1.readUnsignedByte();
            this.field3228 = new int[i_5];

            int i_6;
            for (i_6 = 0; i_6 < this.field3228.length; i_6++) {
               this.field3228[i_6] = class300_1.readIntMedEndian();
            }

            this.field3214 = new byte[i_4];

            for (i_6 = 0; i_6 < i_4; i_6++) {
               this.field3214[i_6] = class300_1.readSignedByte();
            }
         } else if (i_2 != 16) {
            if (i_2 == 17) {
               this.field3211 = class300_1.readNullTerminatedString();
            } else if (i_2 == 18) {
               class300_1.readNullableShort();
            } else if (i_2 == 19) {
               this.field3230 = class300_1.readUnsignedShort();
            } else if (i_2 == 21) {
               class300_1.readIntMedEndian();
            } else if (i_2 == 22) {
               class300_1.readIntMedEndian();
            } else if (i_2 == 23) {
               class300_1.readUnsignedByte();
               class300_1.readUnsignedByte();
               class300_1.readUnsignedByte();
            } else if (i_2 == 24) {
               class300_1.readSignedShortBigEndian();
               class300_1.readSignedShortBigEndian();
            } else if (i_2 == 25) {
               class300_1.readNullableShort();
            } else if (i_2 == 28) {
               class300_1.readUnsignedByte();
            } else if (i_2 == 29) {
               class255[] arr_7 = new class255[] {class255.field3461, class255.field3460, class255.field3458};
               this.field3226 = (class255) MemoryManager.findById(arr_7, class300_1.readUnsignedByte());
            } else if (i_2 == 30) {
               class238[] arr_8 = new class238[] {class238.field3193, class238.field3195, class238.field3194};
               this.field3227 = (class238) MemoryManager.findById(arr_8, class300_1.readUnsignedByte());
            }
         }
      }

   }

   public int method4373(byte b_1) {
      return this.field3213;
   }

   public void method4369(ByteBuffer class300_1) {
      while (true) {
         int i_3 = class300_1.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.method4371(class300_1, i_3);
      }
   }

   public void method4370() {
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

   static final void method4368(boolean bool_0) {
      class186.method3619((byte) 13);
      ++Client.data.field1319;
      if (Client.data.field1319 >= 50 || bool_0) {
         Client.data.field1319 = 0;
         if (!Client.field701 && Client.data.getSocket() != null) {
            class187 class187_2 = class235.method4265(ClientPacketProt.field2225, Client.data.field1313);
            Client.data.copy(class187_2);

            try {
               Client.data.method2234();
            } catch (IOException ioexception_4) {
               Client.field701 = true;
            }
         }

      }
   }

}
