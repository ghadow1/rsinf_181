import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class class26 {

   static String field213;
   static int field227;
   int field221 = -1;
   int field216 = -1;
   int field228 = -1;
   class213 field218 = null;
   int field217 = Integer.MAX_VALUE;
   int field223 = 0;
   int field220 = Integer.MAX_VALUE;
   int field222 = 0;
   boolean field215 = false;
   String field214;
   String field219;
   LinkedList field224;

   public void method344(class300 class300_1, int i_2, byte b_3) {
      this.field221 = i_2;
      this.field214 = class300_1.readNullTermString();
      this.field219 = class300_1.readNullTermString();
      this.field218 = new class213(class300_1.readIntMedEndian());
      this.field216 = class300_1.readIntMedEndian();
      class300_1.method5504();
      this.field215 = class300_1.method5504() == 1;
      this.field228 = class300_1.method5504();
      int i_4 = class300_1.method5504();
      this.field224 = new LinkedList();

      for (int i_5 = 0; i_5 < i_4; i_5++) {
         this.field224.add(this.method327(class300_1));
      }

      this.method332();
   }

   public boolean method329(int i_1, int i_2, int i_3) {
      int i_4 = i_1 / 64;
      int i_5 = i_2 / 64;
      if (i_4 >= this.field217 && i_4 <= this.field223) {
         if (i_5 >= this.field220 && i_5 <= this.field222) {
            Iterator iterator_6 = this.field224.iterator();

            class37 class37_7;
            do {
               if (!iterator_6.hasNext()) {
                  return false;
               }

               class37_7 = (class37) iterator_6.next();
            } while (!class37_7.vmethod740(i_1, i_2, (byte) 31));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int method347(byte b_1) {
      return this.field221;
   }

   public int[] method330(int i_1, int i_2, int i_3, int i_4) {
      Iterator iterator_5 = this.field224.iterator();

      class37 class37_6;
      do {
         if (!iterator_5.hasNext()) {
            return null;
         }

         class37_6 = (class37) iterator_5.next();
      } while (!class37_6.vmethod749(i_1, i_2, i_3, 59484528));

      return class37_6.vmethod760(i_1, i_2, i_3, (byte) 12);
   }

   public int method338(int i_1) {
      return this.field217;
   }

   public int method340(int i_1) {
      return this.field220;
   }

   public boolean method373(int i_1, int i_2, int i_3, int i_4) {
      Iterator iterator_5 = this.field224.iterator();

      class37 class37_6;
      do {
         if (!iterator_5.hasNext()) {
            return false;
         }

         class37_6 = (class37) iterator_5.next();
      } while (!class37_6.vmethod749(i_1, i_2, i_3, 1266885472));

      return true;
   }

   public class213 method331(int i_1, int i_2, int i_3) {
      Iterator iterator_4 = this.field224.iterator();

      class37 class37_5;
      do {
         if (!iterator_4.hasNext()) {
            return null;
         }

         class37_5 = (class37) iterator_4.next();
      } while (!class37_5.vmethod740(i_1, i_2, (byte) 56));

      return class37_5.vmethod742(i_1, i_2, (byte) -13);
   }

   public int method343(int i_1) {
      return this.field218.field2531;
   }

   public String method369(int i_1) {
      return this.field214;
   }

   public int method342(byte b_1) {
      return this.field218.field2530;
   }

   public int method405(byte b_1) {
      return this.field218.field2528;
   }

   public int method337(int i_1) {
      return this.field228;
   }

   void method332() {
      Iterator iterator_2 = this.field224.iterator();

      while (iterator_2.hasNext()) {
         class37 class37_3 = (class37) iterator_2.next();
         class37_3.vmethod738(this, (byte) -53);
      }

   }

   class37 method327(class300 class300_1) {
      int i_3 = class300_1.method5504();
      class20[] arr_4 = new class20[] {class20.field147, class20.field149, class20.field148, class20.field146};
      class20 class20_5 = (class20) class107.method2476(arr_4, i_3);
      Object obj_6 = null;
      switch(class20_5.field150) {
      case 0:
         obj_6 = new class19();
         break;
      case 1:
         obj_6 = new class24();
         break;
      case 2:
         obj_6 = new class33();
         break;
      case 3:
         obj_6 = new class42();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class37) obj_6).vmethod743(class300_1, 1767519038);
      return (class37) obj_6;
   }

   public int method339() {
      return this.field223;
   }

   public boolean method334() {
      return this.field215;
   }

   public int method341() {
      return this.field222;
   }

   int method325() {
      return this.field216;
   }

   public String method335() {
      return this.field219;
   }

   public class213 method345() {
      return new class213(this.field218);
   }

   public static class254 method404(int i_0) {
      class254 class254_2 = (class254) class254.field3407.method3320((long)i_0);
      if (class254_2 != null) {
         return class254_2;
      } else {
         byte[] bytes_3 = class91.field1276.method4144(10, i_0);
         class254_2 = new class254();
         class254_2.field3410 = i_0;
         if (bytes_3 != null) {
            class254_2.method4638(new class300(bytes_3), (byte) -39);
         }

         class254_2.method4637(1271908540);
         if (class254_2.field3444 != -1) {
            class254_2.method4666(method404(class254_2.field3444), method404(class254_2.field3443), -1452987438);
         }

         if (class254_2.field3454 != -1) {
            class254_2.method4641(method404(class254_2.field3454), method404(class254_2.field3453), (byte) 0);
         }

         if (class254_2.field3439 != -1) {
            class254_2.method4689(method404(class254_2.field3439), method404(class254_2.field3400), (byte) 109);
         }

         if (!class134.field1868 && class254_2.field3425) {
            class254_2.field3449 = "Members object";
            class254_2.field3452 = false;
            class254_2.field3426 = null;
            class254_2.field3427 = null;
            class254_2.field3403 = -1;
            class254_2.field3450 = 0;
            if (class254_2.field3409 != null) {
               boolean bool_4 = false;

               for (class180 class180_5 = class254_2.field3409.method5927(); class180_5 != null; class180_5 = class254_2.field3409.method5928()) {
                  class249 class249_6 = class18.method209((int)class180_5.field2113, (byte) 4);
                  if (class249_6.field3305) {
                     class180_5.method3607();
                  } else {
                     bool_4 = true;
                  }
               }

               if (!bool_4) {
                  class254_2.field3409 = null;
               }
            }
         }

         class254.field3407.method3322(class254_2, (long)i_0);
         return class254_2;
      }
   }

   public static boolean method365(int i_0) {
      long long_1 = class206.getAdjustedTimeMillis();
      int i_3 = (int)(long_1 - class236.field3169);
      class236.field3169 = long_1;
      if (i_3 > 200) {
         i_3 = 200;
      }

      class236.field3163 += i_3;
      if (class236.field3164 == 0 && class236.field3168 == 0 && class236.field3171 == 0 && class236.field3166 == 0) {
         return true;
      } else if (class236.field3176 == null) {
         return false;
      } else {
         try {
            if (class236.field3163 > 30000) {
               throw new IOException();
            } else {
               class232 class232_4;
               class300 class300_5;
               while (class236.field3168 < 200 && class236.field3166 > 0) {
                  class232_4 = (class232) class236.field3165.method5950();
                  class300_5 = new class300(4);
                  class300_5.writeByte2(1);
                  class300_5.method5480((int)class232_4.field2113);
                  class236.field3176.vmethod5829(class300_5.field3730, 0, 4, -1696227994);
                  class236.field3167.method5951(class232_4, class232_4.field2113);
                  --class236.field3166;
                  ++class236.field3168;
               }

               while (class236.field3164 < 200 && class236.field3171 > 0) {
                  class232_4 = (class232) class236.field3170.method4792();
                  class300_5 = new class300(4);
                  class300_5.writeByte2(0);
                  class300_5.method5480((int)class232_4.field2113);
                  class236.field3176.vmethod5829(class300_5.field3730, 0, 4, -1696227994);
                  class232_4.method3597();
                  class236.field3172.method5951(class232_4, class232_4.field2113);
                  --class236.field3171;
                  ++class236.field3164;
               }

               for (int i_16 = 0; i_16 < 100; i_16++) {
                  int i_17 = class236.field3176.vmethod5826((byte) 112);
                  if (i_17 < 0) {
                     throw new IOException();
                  }

                  if (i_17 == 0) {
                     break;
                  }

                  class236.field3163 = 0;
                  byte b_6 = 0;
                  if (class226.field3071 == null) {
                     b_6 = 8;
                  } else if (class236.field3175 == 0) {
                     b_6 = 1;
                  }

                  int i_7;
                  int i_8;
                  int i_9;
                  int i_11;
                  if (b_6 > 0) {
                     i_7 = b_6 - class236.field3174.field3732;
                     if (i_7 > i_17) {
                        i_7 = i_17;
                     }

                     class236.field3176.vmethod5828(class236.field3174.field3730, class236.field3174.field3732, i_7, (byte) -16);
                     if (class236.field3181 != 0) {
                        for (i_8 = 0; i_8 < i_7; i_8++) {
                           class236.field3174.field3730[i_8 + class236.field3174.field3732] ^= class236.field3181;
                        }
                     }

                     class236.field3174.field3732 += i_7;
                     if (class236.field3174.field3732 < b_6) {
                        break;
                     }

                     if (class226.field3071 == null) {
                        class236.field3174.field3732 = 0;
                        i_8 = class236.field3174.method5504();
                        i_9 = class236.field3174.readShortUBigEndian();
                        int i_10 = class236.field3174.method5504();
                        i_11 = class236.field3174.readIntMedEndian();
                        long long_12 = (long)(i_9 + (i_8 << 16));
                        class232 class232_14 = (class232) class236.field3167.method5952(long_12);
                        class215.field2545 = true;
                        if (class232_14 == null) {
                           class232_14 = (class232) class236.field3172.method5952(long_12);
                           class215.field2545 = false;
                        }

                        if (class232_14 == null) {
                           throw new IOException();
                        }

                        int i_15 = i_10 == 0 ? 5 : 9;
                        class226.field3071 = class232_14;
                        class240.field3209 = new class300(i_15 + i_11 + class226.field3071.field3122);
                        class240.field3209.writeByte2(i_10);
                        class240.field3209.method5481(i_11);
                        class236.field3175 = 8;
                        class236.field3174.field3732 = 0;
                     } else if (class236.field3175 == 0) {
                        if (class236.field3174.field3730[0] == -1) {
                           class236.field3175 = 1;
                           class236.field3174.field3732 = 0;
                        } else {
                           class226.field3071 = null;
                        }
                     }
                  } else {
                     i_7 = class240.field3209.field3730.length - class226.field3071.field3122;
                     i_8 = 512 - class236.field3175;
                     if (i_8 > i_7 - class240.field3209.field3732) {
                        i_8 = i_7 - class240.field3209.field3732;
                     }

                     if (i_8 > i_17) {
                        i_8 = i_17;
                     }

                     class236.field3176.vmethod5828(class240.field3209.field3730, class240.field3209.field3732, i_8, (byte) 23);
                     if (class236.field3181 != 0) {
                        for (i_9 = 0; i_9 < i_8; i_9++) {
                           class240.field3209.field3730[class240.field3209.field3732 + i_9] ^= class236.field3181;
                        }
                     }

                     class240.field3209.field3732 += i_8;
                     class236.field3175 += i_8;
                     if (i_7 == class240.field3209.field3732) {
                        if (class226.field3071.field2113 == 16711935L) {
                           class322.field3882 = class240.field3209;

                           for (i_9 = 0; i_9 < 256; i_9++) {
                              class235 class235_18 = class236.field3173[i_9];
                              if (class235_18 != null) {
                                 class322.field3882.field3732 = i_9 * 8 + 5;
                                 i_11 = class322.field3882.readIntMedEndian();
                                 int i_19 = class322.field3882.readIntMedEndian();
                                 class235_18.method4262(i_11, i_19, 1381214916);
                              }
                           }
                        } else {
                           class236.field3177.reset();
                           class236.field3177.update(class240.field3209.field3730, 0, i_7);
                           i_9 = (int)class236.field3177.getValue();
                           if (i_9 != class226.field3071.field3121) {
                              try {
                                 class236.field3176.vmethod5830(-1253156928);
                              } catch (Exception exception_21) {
                                 ;
                              }

                              ++class236.field3179;
                              class236.field3176 = null;
                              class236.field3181 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                              return false;
                           }

                           class236.field3179 = 0;
                           class236.field3178 = 0;
                           class226.field3071.field3124.method4263((int)(class226.field3071.field2113 & 0xffffL), class240.field3209.field3730, (class226.field3071.field2113 & 0xff0000L) == 16711680L, class215.field2545, (byte) -36);
                        }

                        class226.field3071.method3607();
                        if (class215.field2545) {
                           --class236.field3168;
                        } else {
                           --class236.field3164;
                        }

                        class236.field3175 = 0;
                        class226.field3071 = null;
                        class240.field3209 = null;
                     } else {
                        if (class236.field3175 != 512) {
                           break;
                        }

                        class236.field3175 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException ioexception_22) {
            try {
               class236.field3176.vmethod5830(917200570);
            } catch (Exception exception_20) {
               ;
            }

            ++class236.field3178;
            class236.field3176 = null;
            return false;
         }
      }
   }

   static final class316 method403(class300 class300_0, class316 class316_1, int i_2) {
      int i_3 = class300_0.method5504();
      int i_4;
      if (class316_1 == null) {
         int i_5 = i_3 - 1;
         i_5 |= i_5 >>> 1;
         i_5 |= i_5 >>> 2;
         i_5 |= i_5 >>> 4;
         i_5 |= i_5 >>> 8;
         i_5 |= i_5 >>> 16;
         i_4 = i_5 + 1;
         class316_1 = new class316(i_4);
      }

      for (i_4 = 0; i_4 < i_3; i_4++) {
         boolean bool_8 = class300_0.method5504() == 1;
         int i_6 = class300_0.method5567();
         Object obj_7;
         if (bool_8) {
            obj_7 = new class176(class300_0.readNullTermString());
         } else {
            obj_7 = new class179(class300_0.readIntMedEndian());
         }

         class316_1.method5938((class180) obj_7, (long)i_6);
      }

      return class316_1;
   }

   static int method387(char var_0, class190 class190_1, int i_2) {
      int i_3 = var_0 << 4;
      if (Character.isUpperCase(var_0) || Character.isTitleCase(var_0)) {
         var_0 = Character.toLowerCase(var_0);
         i_3 = (var_0 << 4) + 1;
      }

      if (var_0 == 241 && class190_1 == class190.field2350) {
         i_3 = 1762;
      }

      return i_3;
   }

}
