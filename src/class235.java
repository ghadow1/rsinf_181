import java.util.zip.CRC32;

public class class235 extends class233 {

   static CRC32 field3158 = new CRC32();
   volatile boolean field3155 = false;
   boolean field3157 = false;
   int field3152 = -1;
   class308 field3156;
   class308 field3153;
   int field3154;
   volatile boolean[] field3160;
   int field3159;
   int field3161;

   public class235(class308 class308_1, class308 class308_2, int i_3, boolean bool_4, boolean bool_5, boolean bool_6) {
      super(bool_4, bool_5);
      this.field3156 = class308_1;
      this.field3153 = class308_2;
      this.field3154 = i_3;
      this.field3157 = bool_6;
      int i_8 = this.field3154;
      if (class322.field3882 != null) {
         class322.field3882.position = i_8 * 8 + 5;
         int i_9 = class322.field3882.readIntMedEndian();
         int i_10 = class322.field3882.readIntMedEndian();
         this.method4262(i_9, i_10, 238802641);
      } else {
         class128.method2961((class235) null, 255, 255, 0, (byte) 0, true);
         class236.field3173[i_8] = this;
      }

   }

   void vmethod4260(int i_1, short s_2) {
      if (this.field3156 != null && this.field3160 != null && this.field3160[i_1]) {
         class88.method2056(i_1, this.field3156, this, -1214592487);
      } else {
         class128.method2961(this, this.field3154, i_1, super.field3131[i_1], (byte) 2, true);
      }

   }

   public boolean method4268(int i_1, byte b_2) {
      return this.method4153(i_1) != null;
   }

   int vmethod4266(int i_1, byte b_2) {
      return super.field3126[i_1] != null ? 100 : (this.field3160[i_1] ? 100 : class209.method3948(this.field3154, i_1));
   }

   void method4270(int i_1) {
      this.field3160 = new boolean[super.field3126.length];

      int i_2;
      for (i_2 = 0; i_2 < this.field3160.length; i_2++) {
         this.field3160[i_2] = false;
      }

      if (this.field3156 == null) {
         this.field3155 = true;
      } else {
         this.field3152 = -1;

         for (i_2 = 0; i_2 < this.field3160.length; i_2++) {
            if (super.field3133[i_2] > 0) {
               class308 class308_3 = this.field3156;
               class231 class231_5 = new class231();
               class231_5.field3118 = 1;
               class231_5.hash = (long)i_2;
               class231_5.field3116 = class308_3;
               class231_5.field3117 = this;
               class261 class261_6 = class234.field3146;
               synchronized(class234.field3146) {
                  class234.field3146.method4917(class231_5);
               }

               Object object_11 = class234.field3147;
               synchronized(class234.field3147) {
                  if (class234.field3144 == 0) {
                     class234.field3148 = new Thread(new class234());
                     class234.field3148.setDaemon(true);
                     class234.field3148.start();
                     class234.field3148.setPriority(5);
                  }

                  class234.field3144 = 600;
               }

               this.field3152 = i_2;
            }
         }

         if (this.field3152 == -1) {
            this.field3155 = true;
         }

      }
   }

   void vmethod4278(int i_1, int i_2) {
      class68.method1653(this.field3154, i_1);
   }

   public boolean method4267(int i_1) {
      return this.field3160[i_1];
   }

   public void method4264(class308 class308_1, int i_2, byte[] bytes_3, boolean bool_4) {
      int i_6;
      if (class308_1 == this.field3153) {
         if (this.field3155) {
            throw new RuntimeException();
         }

         if (bytes_3 == null) {
            class128.method2961(this, 255, this.field3154, this.field3159, (byte) 0, true);
            return;
         }

         field3158.reset();
         field3158.update(bytes_3, 0, bytes_3.length);
         i_6 = (int)field3158.getValue();
         if (i_6 != this.field3159) {
            class128.method2961(this, 255, this.field3154, this.field3159, (byte) 0, true);
            return;
         }

         ByteBuffer class300_12 = new ByteBuffer(class70.method1678(bytes_3));
         int i_13 = class300_12.readUnsignedByte();
         if (i_13 != 5 && i_13 != 6) {
            throw new RuntimeException(i_13 + "," + this.field3154 + "," + i_2);
         }

         int i_9 = 0;
         if (i_13 >= 6) {
            i_9 = class300_12.readIntMedEndian();
         }

         if (i_9 != this.field3161) {
            class128.method2961(this, 255, this.field3154, this.field3159, (byte) 0, true);
            return;
         }

         this.method4142(bytes_3, 1973415514);
         this.method4270(-72081442);
      } else {
         if (!bool_4 && i_2 == this.field3152) {
            this.field3155 = true;
         }

         if (bytes_3 == null || bytes_3.length <= 2) {
            this.field3160[i_2] = false;
            if (this.field3157 || bool_4) {
               class128.method2961(this, this.field3154, i_2, super.field3131[i_2], (byte) 2, bool_4);
            }

            return;
         }

         field3158.reset();
         field3158.update(bytes_3, 0, bytes_3.length - 2);
         i_6 = (int)field3158.getValue();
         int i_7 = ((bytes_3[bytes_3.length - 2] & 0xff) << 8) + (bytes_3[bytes_3.length - 1] & 0xff);
         if (i_6 != super.field3131[i_2] || i_7 != super.field3132[i_2]) {
            this.field3160[i_2] = false;
            if (this.field3157 || bool_4) {
               class128.method2961(this, this.field3154, i_2, super.field3131[i_2], (byte) 2, bool_4);
            }

            return;
         }

         this.field3160[i_2] = true;
         if (bool_4) {
            Object[] arr_8 = super.field3126;
            Object obj_10;
            if (bytes_3 == null) {
               obj_10 = null;
            } else if (bytes_3.length > 136) {
               TimeUtils class206_11 = new TimeUtils();
               class206_11.vmethod3934(bytes_3, 594076777);
               obj_10 = class206_11;
            } else {
               obj_10 = bytes_3;
            }

            arr_8[i_2] = obj_10;
         }
      }

   }

   void method4262(int i_1, int i_2, int i_3) {
      this.field3159 = i_1;
      this.field3161 = i_2;
      if (this.field3153 != null) {
         class88.method2056(this.field3154, this.field3153, this, -1214592487);
      } else {
         class128.method2961(this, 255, this.field3154, this.field3159, (byte) 0, true);
      }

   }

   public int method4259() {
      if (this.field3155) {
         return 100;
      } else if (super.field3126 != null) {
         return 99;
      } else {
         int i_2 = class209.method3948(255, this.field3154);
         if (i_2 >= 100) {
            i_2 = 99;
         }

         return i_2;
      }
   }

   void method4263(int i_1, byte[] bytes_2, boolean bool_3, boolean bool_4, byte b_5) {
      if (bool_3) {
         if (this.field3155) {
            throw new RuntimeException();
         }

         if (this.field3153 != null) {
            class294.method5328(this.field3154, bytes_2, this.field3153, -457807436);
         }

         this.method4142(bytes_2, 2030381352);
         this.method4270(2071532960);
      } else {
         bytes_2[bytes_2.length - 2] = (byte)(super.field3132[i_1] >> 8);
         bytes_2[bytes_2.length - 1] = (byte)super.field3132[i_1];
         if (this.field3156 != null) {
            class294.method5328(i_1, bytes_2, this.field3156, -966151502);
            this.field3160[i_1] = true;
         }

         if (bool_4) {
            Object[] arr_6 = super.field3126;
            Object obj_8;
            if (bytes_2 == null) {
               obj_8 = null;
            } else if (bytes_2.length > 136) {
               TimeUtils class206_9 = new TimeUtils();
               class206_9.vmethod3934(bytes_2, -404058899);
               obj_8 = class206_9;
            } else {
               obj_8 = bytes_2;
            }

            arr_6[i_1] = obj_8;
         }
      }

   }

   public int method4257(int i_1) {
      int i_2 = 0;
      int i_3 = 0;

      int i_4;
      for (i_4 = 0; i_4 < super.field3126.length; i_4++) {
         if (super.field3133[i_4] > 0) {
            i_2 += 100;
            i_3 += this.vmethod4266(i_4, (byte) 0);
         }
      }

      if (i_2 == 0) {
         return 100;
      } else {
         i_4 = i_3 * 100 / i_2;
         return i_4;
      }
   }

   public boolean method4258(byte b_1) {
      return this.field3155;
   }

   static final void method4269(int i_0, byte b_1) {
      if (class162.method3445(i_0)) {
         class225.method4122(class217.field2556[i_0], -1, -1666853879);
      }
   }

   public static class187 method4265(class183 class183_0, class328 class328_1, int i_2) {
      class187 class187_3;
      if (class187.field2336 == 0) {
         class187_3 = new class187();
      } else {
         class187_3 = class187.field2335[--class187.field2336];
      }

      class187_3.field2338 = class183_0;
      class187_3.field2332 = class183_0.field2275;
      if (class187_3.field2332 == -1) {
         class187_3.outBuffer = new class299(260);
      } else if (class187_3.field2332 == -2) {
         class187_3.outBuffer = new class299(10000);
      } else if (class187_3.field2332 <= 18) {
         class187_3.outBuffer = new class299(20);
      } else if (class187_3.field2332 <= 98) {
         class187_3.outBuffer = new class299(100);
      } else {
         class187_3.outBuffer = new class299(260);
      }

      class187_3.outBuffer.method5442(class328_1);
      class187_3.outBuffer.method5473(class187_3.field2338.field2297);
      class187_3.field2331 = 0;
      return class187_3;
   }

}
