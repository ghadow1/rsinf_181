import java.io.IOException;

public class class93 extends Entity {

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

   class93(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8, Entity entity_9) {
      this.field1297 = i_1;
      this.field1294 = i_2;
      this.field1292 = i_3;
      this.field1295 = i_4;
      this.field1296 = i_5;
      this.field1299 = i_6;
      if (i_7 != -1) {
         this.field1293 = class7.method81(i_7);
         this.field1298 = 0;
         this.field1300 = Client.cycle - 1;
         if (this.field1293.field3529 == 0 && entity_9 != null && entity_9 instanceof class93) {
            class93 class93_10 = (class93) entity_9;
            if (class93_10.field1293 == this.field1293) {
               this.field1298 = class93_10.field1298;
               this.field1300 = class93_10.field1300;
               return;
            }
         }

         if (bool_8 && this.field1293.field3515 != -1) {
            this.field1298 = (int)(Math.random() * (double)this.field1293.frameCount.length);
            this.field1300 -= (int)(Math.random() * (double)this.field1293.duration[this.field1298]);
         }
      }

   }

   protected final class127 vmethod3253(int i_1) {
      if (this.field1293 != null) {
         int i_2 = Client.cycle - this.field1300;
         if (i_2 > 100 && this.field1293.field3515 > 0) {
            i_2 = 100;
         }

         label56: {
            do {
               do {
                  if (i_2 <= this.field1293.duration[this.field1298]) {
                     break label56;
                  }

                  i_2 -= this.field1293.duration[this.field1298];
                  ++this.field1298;
               } while (this.field1298 < this.field1293.frameCount.length);

               this.field1298 -= this.field1293.field3515;
            } while (this.field1298 >= 0 && this.field1298 < this.field1293.frameCount.length);

            this.field1293 = null;
         }

         this.field1300 = Client.cycle - i_2;
      }

      class253 class253_13 = class128.method2970(this.field1297);
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
         return class253_13.method4614(this.field1294, this.field1292, ints_9, i_11, i_10, i_12, this.field1293, this.field1298);
      }
   }

   public static void method2193(AbstractSocket class305_0, boolean bool_1, short s_2) {
      if (class236.field3176 != null) {
         try {
            class236.field3176.close();
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
               class236.field3176.close();
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
         GrandExchangeOfferUnitPriceComparator grandExchangeOfferUnitPriceComparator_10 = (GrandExchangeOfferUnitPriceComparator) class236.field3167.method5950();
         if (grandExchangeOfferUnitPriceComparator_10 == null) {
            while (true) {
               grandExchangeOfferUnitPriceComparator_10 = (GrandExchangeOfferUnitPriceComparator) class236.field3172.method5950();
               if (grandExchangeOfferUnitPriceComparator_10 == null) {
                  if (class236.field3181 != 0) {
                     try {
                        class300_3 = new ByteBuffer(4);
                        class300_3.writeByte(4);
                        class300_3.writeByte(class236.field3181);
                        class300_3.writeShortBigEndian(0);
                        class236.field3176.vmethod5829(class300_3.buffer, 0, 4, -1696227994);
                     } catch (IOException ioexception_6) {
                        try {
                           class236.field3176.close();
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

               class236.field3170.method4793(grandExchangeOfferUnitPriceComparator_10);
               class236.field3180.method5951(grandExchangeOfferUnitPriceComparator_10, grandExchangeOfferUnitPriceComparator_10.hash);
               ++class236.field3171;
               --class236.field3164;
            }
         }

         class236.field3165.method5951(grandExchangeOfferUnitPriceComparator_10, grandExchangeOfferUnitPriceComparator_10.hash);
         ++class236.field3166;
         --class236.field3168;
      }
   }

   static World method2197(int i_0) {
      World.field1024 = 0;
      return class48.method812(-777854264);
   }

   static int method2200(World world_0, World world_1, int i_2, boolean bool_3, byte b_4) {
      if (i_2 == 1) {
         int i_5 = world_0.field1030;
         int i_6 = world_1.field1030;
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
         return i_2 == 2 ? world_0.field1032 - world_1.field1032 : (i_2 == 3 ? (world_0.field1028.equals("-") ? (world_1.field1028.equals("-") ? 0 : (bool_3 ? -1 : 1)) : (world_1.field1028.equals("-") ? (bool_3 ? 1 : -1) : world_0.field1028.compareTo(world_1.field1028))) : (i_2 == 4 ? (world_0.method1698() ? (world_1.method1698() ? 0 : 1) : (world_1.method1698() ? -1 : 0)) : (i_2 == 5 ? (world_0.method1682() ? (world_1.method1682() ? 0 : 1) : (world_1.method1682() ? -1 : 0)) : (i_2 == 6 ? (world_0.method1718() ? (world_1.method1718() ? 0 : 1) : (world_1.method1718() ? -1 : 0)) : (i_2 == 7 ? (world_0.method1680() ? (world_1.method1680() ? 0 : 1) : (world_1.method1680() ? -1 : 0)) : world_0.id - world_1.id)))));
      }
   }

}
