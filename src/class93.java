import java.io.IOException;

public class class93 extends class135 {

   static int[] field1301;
   int field1297;
   int field1294;
   int field1292;
   int field1295;
   int field1296;
   int field1299;
   class258 field1293;
   int field1298;
   int field1300;

   class93(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8, class135 class135_9) {
      this.field1297 = i_1;
      this.field1294 = i_2;
      this.field1292 = i_3;
      this.field1295 = i_4;
      this.field1296 = i_5;
      this.field1299 = i_6;
      if (i_7 != -1) {
         this.field1293 = class7.method81(i_7, (byte) 1);
         this.field1298 = 0;
         this.field1300 = Client.field881 - 1;
         if (this.field1293.field3529 == 0 && class135_9 != null && class135_9 instanceof class93) {
            class93 class93_10 = (class93) class135_9;
            if (class93_10.field1293 == this.field1293) {
               this.field1298 = class93_10.field1298;
               this.field1300 = class93_10.field1300;
               return;
            }
         }

         if (bool_8 && this.field1293.field3515 != -1) {
            this.field1298 = (int)(Math.random() * (double)this.field1293.field3520.length);
            this.field1300 -= (int)(Math.random() * (double)this.field1293.field3522[this.field1298]);
         }
      }

   }

   protected final class127 vmethod3253(int i_1) {
      if (this.field1293 != null) {
         int i_2 = Client.field881 - this.field1300;
         if (i_2 > 100 && this.field1293.field3515 > 0) {
            i_2 = 100;
         }

         label56: {
            do {
               do {
                  if (i_2 <= this.field1293.field3522[this.field1298]) {
                     break label56;
                  }

                  i_2 -= this.field1293.field3522[this.field1298];
                  ++this.field1298;
               } while (this.field1298 < this.field1293.field3520.length);

               this.field1298 -= this.field1293.field3515;
            } while (this.field1298 >= 0 && this.field1298 < this.field1293.field3520.length);

            this.field1293 = null;
         }

         this.field1300 = Client.field881 - i_2;
      }

      class253 class253_13 = class128.method2970(this.field1297, (short) 4095);
      if (class253_13.field3391 != null) {
         class253_13 = class253_13.method4595();
      }

      if (class253_13 == null) {
         return null;
      } else {
         int i_3;
         int i_4;
         if (this.field1292 != 1 && this.field1292 != 3) {
            i_3 = class253_13.field3365;
            i_4 = class253_13.field3366;
         } else {
            i_3 = class253_13.field3366;
            i_4 = class253_13.field3365;
         }

         int i_5 = (i_3 >> 1) + this.field1296;
         int i_6 = (i_3 + 1 >> 1) + this.field1296;
         int i_7 = (i_4 >> 1) + this.field1299;
         int i_8 = (i_4 + 1 >> 1) + this.field1299;
         int[][] ints_9 = class55.field516[this.field1295];
         int i_10 = ints_9[i_5][i_7] + ints_9[i_6][i_7] + ints_9[i_5][i_8] + ints_9[i_6][i_8] >> 2;
         int i_11 = (this.field1296 << 7) + (i_3 << 6);
         int i_12 = (this.field1299 << 7) + (i_4 << 6);
         return class253_13.method4614(this.field1294, this.field1292, ints_9, i_11, i_10, i_12, this.field1293, this.field1298, (byte) 5);
      }
   }

   public static void method2193(Stream class305_0, boolean bool_1, short s_2) {
      if (class236.field3176 != null) {
         try {
            class236.field3176.vmethod5830(234953470);
         } catch (Exception exception_9) {
            ;
         }

         class236.field3176 = null;
      }

      class236.field3176 = class305_0;
      ByteBuffer class300_3;
      if (class236.field3176 != null) {
         try {
            class300_3 = new ByteBuffer(4);
            class300_3.writeByte(bool_1 ? 2 : 3);
            class300_3.write24BitInt(0);
            class236.field3176.vmethod5829(class300_3.buffer, 0, 4, -1696227994);
         } catch (IOException ioexception_8) {
            try {
               class236.field3176.vmethod5830(1987296931);
            } catch (Exception exception_7) {
               ;
            }

            ++class236.field3178;
            class236.field3176 = null;
         }
      }

      class236.field3174.position = 0;
      class226.field3071 = null;
      class240.field3209 = null;
      class236.field3175 = 0;

      while (true) {
         class232 class232_10 = (class232) class236.field3167.method5950();
         if (class232_10 == null) {
            while (true) {
               class232_10 = (class232) class236.field3172.method5950();
               if (class232_10 == null) {
                  if (class236.field3181 != 0) {
                     try {
                        class300_3 = new ByteBuffer(4);
                        class300_3.writeByte(4);
                        class300_3.writeByte(class236.field3181);
                        class300_3.writeShortBigEndian(0);
                        class236.field3176.vmethod5829(class300_3.buffer, 0, 4, -1696227994);
                     } catch (IOException ioexception_6) {
                        try {
                           class236.field3176.vmethod5830(-1353478313);
                        } catch (Exception exception_5) {
                           ;
                        }

                        ++class236.field3178;
                        class236.field3176 = null;
                     }
                  }

                  class236.field3163 = 0;
                  class236.field3169 = TimeUtils.getAdjustedTimeMillis();
                  return;
               }

               class236.field3170.method4793(class232_10);
               class236.field3180.method5951(class232_10, class232_10.hash);
               ++class236.field3171;
               --class236.field3164;
            }
         }

         class236.field3165.method5951(class232_10, class232_10.hash);
         ++class236.field3166;
         --class236.field3168;
      }
   }

   static class71 method2197(int i_0) {
      class71.field1024 = 0;
      return class48.method812(-777854264);
   }

   static int method2200(class71 class71_0, class71 class71_1, int i_2, boolean bool_3, byte b_4) {
      if (i_2 == 1) {
         int i_5 = class71_0.field1030;
         int i_6 = class71_1.field1030;
         if (!bool_3) {
            if (i_5 == -1) {
               i_5 = 2001;
            }

            if (i_6 == -1) {
               i_6 = 2001;
            }
         }

         return i_5 - i_6;
      } else {
         return i_2 == 2 ? class71_0.field1032 - class71_1.field1032 : (i_2 == 3 ? (class71_0.field1028.equals("-") ? (class71_1.field1028.equals("-") ? 0 : (bool_3 ? -1 : 1)) : (class71_1.field1028.equals("-") ? (bool_3 ? 1 : -1) : class71_0.field1028.compareTo(class71_1.field1028))) : (i_2 == 4 ? (class71_0.method1698(1749102436) ? (class71_1.method1698(1070404726) ? 0 : 1) : (class71_1.method1698(518274049) ? -1 : 0)) : (i_2 == 5 ? (class71_0.method1682(2029214211) ? (class71_1.method1682(2029214211) ? 0 : 1) : (class71_1.method1682(2029214211) ? -1 : 0)) : (i_2 == 6 ? (class71_0.method1718(-1353649797) ? (class71_1.method1718(-1353649797) ? 0 : 1) : (class71_1.method1718(-1353649797) ? -1 : 0)) : (i_2 == 7 ? (class71_0.method1680((byte) 0) ? (class71_1.method1680((byte) 0) ? 0 : 1) : (class71_1.method1680((byte) 0) ? -1 : 0)) : class71_0.field1025 - class71_1.field1025)))));
      }
   }

}
