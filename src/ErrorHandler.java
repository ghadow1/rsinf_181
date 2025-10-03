import java.io.DataInputStream;
import java.net.URL;

public class ErrorHandler extends class175 {

   public static class233 field3327;
   public static class233 field3343;
   public static class233 field3326;
   public static class145 field3325 = new class145(64);
   public static class145 field3329 = new class145(64);
   public static class145 field3330 = new class145(20);
   int field3332 = -1;
   public int field3333 = 16777215;
   public int field3344 = 70;
   int field3334 = -1;
   int field3336 = -1;
   int field3337 = -1;
   int field3338 = -1;
   public int field3335 = 0;
   public int field3340 = 0;
   public int field3341 = -1;
   String field3342 = "";
   public int field3348 = -1;
   public int field3328 = 0;
   int field3346 = -1;
   int field3347 = -1;
   public int[] field3345;

   void method4553(ByteBuffer class300_1, int i_2, int i_3) {
      if (i_2 == 1) {
         this.field3332 = class300_1.readNullableShort();
      } else if (i_2 == 2) {
         this.field3333 = class300_1.read24BitInt();
      } else if (i_2 == 3) {
         this.field3334 = class300_1.readNullableShort();
      } else if (i_2 == 4) {
         this.field3337 = class300_1.readNullableShort();
      } else if (i_2 == 5) {
         this.field3336 = class300_1.readNullableShort();
      } else if (i_2 == 6) {
         this.field3338 = class300_1.readNullableShort();
      } else if (i_2 == 7) {
         this.field3335 = class300_1.readSignedShortBigEndian();
      } else if (i_2 == 8) {
         this.field3342 = class300_1.readPrefixedNullTerminatedString();
      } else if (i_2 == 9) {
         this.field3344 = class300_1.readUnsignedShortBigEndian();
      } else if (i_2 == 10) {
         this.field3340 = class300_1.readSignedShortBigEndian();
      } else if (i_2 == 11) {
         this.field3341 = 0;
      } else if (i_2 == 12) {
         this.field3348 = class300_1.readUnsignedByte();
      } else if (i_2 == 13) {
         this.field3328 = class300_1.readSignedShortBigEndian();
      } else if (i_2 == 14) {
         this.field3341 = class300_1.readUnsignedShortBigEndian();
      } else if (i_2 == 17 || i_2 == 18) {
         this.field3346 = class300_1.readUnsignedShortBigEndian();
         if (this.field3346 == 65535) {
            this.field3346 = -1;
         }

         this.field3347 = class300_1.readUnsignedShortBigEndian();
         if (this.field3347 == 65535) {
            this.field3347 = -1;
         }

         int i_4 = -1;
         if (i_2 == 18) {
            i_4 = class300_1.readUnsignedShortBigEndian();
            if (i_4 == 65535) {
               i_4 = -1;
            }
         }

         int i_5 = class300_1.readUnsignedByte();
         this.field3345 = new int[i_5 + 2];

         for (int i_6 = 0; i_6 <= i_5; i_6++) {
            this.field3345[i_6] = class300_1.readUnsignedShortBigEndian();
            if (this.field3345[i_6] == 65535) {
               this.field3345[i_6] = -1;
            }
         }

         this.field3345[i_5 + 1] = i_4;
      }

   }

   void method4552(ByteBuffer class300_1, byte b_2) {
      while (true) {
         int i_3 = class300_1.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.method4553(class300_1, i_3, 1504666290);
      }
   }

   public final ErrorHandler method4554(byte b_1) {
      int i_2 = -1;
      if (this.field3346 != -1) {
         i_2 = class67.method1237(this.field3346);
      } else if (this.field3347 != -1) {
         i_2 = class212.var_configurations[this.field3347];
      }

      int i_3;
      if (i_2 >= 0 && i_2 < this.field3345.length - 1) {
         i_3 = this.field3345[i_2];
      } else {
         i_3 = this.field3345[this.field3345.length - 1];
      }

      return i_3 != -1 ? class86.method2046(i_3, (byte) 0) : null;
   }

   public class325 method4551(int i_1) {
      if (this.field3334 < 0) {
         return null;
      } else {
         class325 class325_2 = (class325) field3329.method3320((long)this.field3334);
         if (class325_2 != null) {
            return class325_2;
         } else {
            class325_2 = class65.method1178(field3343, this.field3334, 0, -892985778);
            if (class325_2 != null) {
               field3329.method3322(class325_2, (long)this.field3334);
            }

            return class325_2;
         }
      }
   }

   public class325 method4557(int i_1) {
      if (this.field3336 < 0) {
         return null;
      } else {
         class325 class325_2 = (class325) field3329.method3320((long)this.field3336);
         if (class325_2 != null) {
            return class325_2;
         } else {
            class325_2 = class65.method1178(field3343, this.field3336, 0, -1087527356);
            if (class325_2 != null) {
               field3329.method3322(class325_2, (long)this.field3336);
            }

            return class325_2;
         }
      }
   }

   public class325 method4558(byte b_1) {
      if (this.field3337 < 0) {
         return null;
      } else {
         class325 class325_2 = (class325) field3329.method3320((long)this.field3337);
         if (class325_2 != null) {
            return class325_2;
         } else {
            class325_2 = class65.method1178(field3343, this.field3337, 0, -662564123);
            if (class325_2 != null) {
               field3329.method3322(class325_2, (long)this.field3337);
            }

            return class325_2;
         }
      }
   }

   public class325 method4583(int i_1) {
      if (this.field3338 < 0) {
         return null;
      } else {
         class325 class325_2 = (class325) field3329.method3320((long)this.field3338);
         if (class325_2 != null) {
            return class325_2;
         } else {
            class325_2 = class65.method1178(field3343, this.field3338, 0, 1588545487);
            if (class325_2 != null) {
               field3329.method3322(class325_2, (long)this.field3338);
            }

            return class325_2;
         }
      }
   }

   public class295 method4565(int i_1) {
      if (this.field3332 == -1) {
         return null;
      } else {
         class295 class295_2 = (class295) field3330.method3320((long)this.field3332);
         if (class295_2 != null) {
            return class295_2;
         } else {
            class233 class233_4 = field3343;
            class233 class233_5 = field3326;
            int i_6 = this.field3332;
            class295 class295_3;
            if (!class284.method5220(class233_4, i_6, 0)) {
               class295_3 = null;
            } else {
               class295_3 = class141.method3293(class233_5.method4144(i_6, 0), 107452813);
            }

            if (class295_3 != null) {
               field3330.method3322(class295_3, (long)this.field3332);
            }

            return class295_3;
         }
      }
   }

   public String method4555(int i_1, int i_2) {
      String string_3 = this.field3342;

      while (true) {
         int i_4 = string_3.indexOf("%1");
         if (i_4 < 0) {
            return string_3;
         }

         string_3 = string_3.substring(0, i_4) + class195.method3683(i_1, false) + string_3.substring(i_4 + 2);
      }
   }

   public static void logError(String string_0, Throwable throwable_1, byte b_2) {
      try {
         String str_3 = "";
         if (throwable_1 != null) {
            str_3 = class123.method2843(throwable_1, (byte) 1);
         }

         if (string_0 != null) {
            if (throwable_1 != null) {
               str_3 = str_3 + " | ";
            }

            str_3 = str_3 + string_0;
         }

         System.out.println("Error: " + str_3);
         str_3 = str_3.replace(':', '.');
         str_3 = str_3.replace('@', '_');
         str_3 = str_3.replace('&', '_');
         str_3 = str_3.replace('#', '_');
         if (class341.field4064 == null) {
            return;
         }

         URL url_4 = new URL(class341.field4064.getCodeBase(), "clienterror.ws?c=" + class341.field4065 + "&u=" + class10.field69 + "&v1=" + class166.field2029 + "&v2=" + class166.field2028 + "&ct=" + class341.field4066 + "&e=" + str_3);
         DataInputStream datainputstream_5 = new DataInputStream(url_4.openStream());
         datainputstream_5.read();
         datainputstream_5.close();
      } catch (Exception exception_6) {
         ;
      }

   }

}
