import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class29 {

   static class230 field248;
   static int[][] field255;
   static class235 field253;
   public static class149 field244 = new class149(37748736, 256);
   int field245;
   int field246;
   LinkedList field242;
   List field251;
   HashMap field252;
   int field249;
   final HashMap field257;
   int field250;
   class15 field247;

   class29(int i_1, int i_2, int i_3, HashMap hashmap_4) {
      this.field245 = i_1;
      this.field246 = i_2;
      this.field242 = new LinkedList();
      this.field251 = new LinkedList();
      this.field252 = new HashMap();
      this.field249 = i_3 | ~0xffffff;
      this.field257 = hashmap_4;
   }

   void method472(int i_1, int i_2, class21 class21_3, short s_4) {
      for (int i_5 = 0; i_5 < class21_3.field160; i_5++) {
         class25[] arr_6 = class21_3.field164[i_5][i_1][i_2];
         if (arr_6 != null && arr_6.length != 0) {
            class25[] arr_7 = arr_6;

            for (int i_8 = 0; i_8 < arr_7.length; i_8++) {
               class25 class25_9 = arr_7[i_8];
               int i_11 = class25_9.field209;
               boolean bool_10 = i_11 >= class220.field2725.field2723 && i_11 <= class220.field2721.field2723 || i_11 == class220.field2739.field2723;
               if (bool_10) {
                  class253 class253_12 = class128.method2970(class25_9.field208, (short) 4095);
                  int i_13 = class253_12.field3369 != 0 ? -3407872 : -3355444;
                  if (class25_9.field209 == class220.field2725.field2723) {
                     this.method454(i_1, i_2, class25_9.field210, i_13, -255594504);
                  }

                  if (class25_9.field209 == class220.field2720.field2723) {
                     this.method454(i_1, i_2, class25_9.field210, -3355444, -708867756);
                     this.method454(i_1, i_2, class25_9.field210 + 1, i_13, -1287105450);
                  }

                  if (class25_9.field209 == class220.field2721.field2723) {
                     if (class25_9.field210 == 0) {
                        class321.method6010(this.field250 * i_1, this.field250 * (63 - i_2), 1, i_13);
                     }

                     if (class25_9.field210 == 1) {
                        class321.method6010(this.field250 + this.field250 * i_1 - 1, this.field250 * (63 - i_2), 1, i_13);
                     }

                     if (class25_9.field210 == 2) {
                        class321.method6010(this.field250 * i_1 + this.field250 - 1, this.field250 * (63 - i_2) + this.field250 - 1, 1, i_13);
                     }

                     if (class25_9.field210 == 3) {
                        class321.method6010(this.field250 * i_1, this.field250 * (63 - i_2) + this.field250 - 1, 1, i_13);
                     }
                  }

                  if (class25_9.field209 == class220.field2739.field2723) {
                     int i_14 = class25_9.field210 % 2;
                     int i_15;
                     if (i_14 == 0) {
                        for (i_15 = 0; i_15 < this.field250; i_15++) {
                           class321.method6010(i_15 + this.field250 * i_1, (64 - i_2) * this.field250 - 1 - i_15, 1, i_13);
                        }
                     } else {
                        for (i_15 = 0; i_15 < this.field250; i_15++) {
                           class321.method6010(i_15 + this.field250 * i_1, i_15 + this.field250 * (63 - i_2), 1, i_13);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method442(int i_1, int i_2, HashSet hashset_3, int i_4, int i_5) {
      float f_6 = (float)i_4 / 64.0F;
      float f_7 = f_6 / 2.0F;
      Iterator iterator_8 = this.field252.entrySet().iterator();

      while (iterator_8.hasNext()) {
         Entry map$entry_9 = (Entry) iterator_8.next();
         class213 class213_10 = (class213) map$entry_9.getKey();
         int i_11 = (int)((float)i_1 + f_6 * (float)class213_10.field2530 - f_7);
         int i_12 = (int)((float)(i_2 + i_4) - (float)class213_10.field2528 * f_6 - f_7);
         class34 class34_13 = (class34) map$entry_9.getValue();
         if (class34_13 != null && class34_13.method578(-1274004046)) {
            class34_13.field296 = i_11;
            class34_13.field295 = i_12;
            class241 class241_14 = class222.method4118(class34_13.vmethod597(-2000175293));
            if (!hashset_3.contains(Integer.valueOf(class241_14.method4373((byte) 95)))) {
               this.method445(class34_13, i_11, i_12, f_6, (byte) -89);
            }
         }
      }

   }

   void method463(int i_1, int i_2, class21 class21_3, class324[] arr_4, int i_5) {
      for (int i_6 = 0; i_6 < class21_3.field160; i_6++) {
         class25[] arr_7 = class21_3.field164[i_6][i_1][i_2];
         if (arr_7 != null && arr_7.length != 0) {
            class25[] arr_8 = arr_7;

            for (int i_9 = 0; i_9 < arr_8.length; i_9++) {
               class25 class25_10 = arr_8[i_9];
               int i_12 = class25_10.field209;
               boolean bool_11 = i_12 >= class220.field2733.field2723 && i_12 <= class220.field2722.field2723;
               if (!bool_11) {
                  int i_14 = class25_10.field209;
                  boolean bool_13 = i_14 == class220.field2741.field2723;
                  if (!bool_13) {
                     continue;
                  }
               }

               class253 class253_15 = class128.method2970(class25_10.field208, (short) 4095);
               if (class253_15.field3379 != -1) {
                  if (class253_15.field3379 != 46 && class253_15.field3379 != 52) {
                     arr_4[class253_15.field3379].method6093(this.field250 * i_1, this.field250 * (63 - i_2), this.field250 * 2, this.field250 * 2);
                  } else {
                     arr_4[class253_15.field3379].method6093(this.field250 * i_1, this.field250 * (63 - i_2), this.field250 * 2 + 1, this.field250 * 2 + 1);
                  }
               }
            }
         }
      }

   }

   void method448(int i_1, int i_2, HashSet hashset_3, int i_4, int i_5) {
      float f_6 = (float)i_4 / 64.0F;
      Iterator iterator_7 = this.field251.iterator();

      while (iterator_7.hasNext()) {
         class34 class34_8 = (class34) iterator_7.next();
         if (class34_8.method578(-1274004046)) {
            int i_9 = class34_8.field297.field2530 % 64;
            int i_10 = class34_8.field297.field2528 % 64;
            class34_8.field296 = (int)((float)i_9 * f_6 + (float)i_1);
            class34_8.field295 = (int)(f_6 * (float)(63 - i_10) + (float)i_2);
            if (!hashset_3.contains(Integer.valueOf(class34_8.vmethod597(-1269248898)))) {
               this.method445(class34_8, class34_8.field296, class34_8.field295, f_6, (byte) -78);
            }
         }
      }

   }

   void method426(int i_1, int i_2, class21 class21_3, class40 class40_4, class27 class27_5, int i_6) {
      int i_7 = class21_3.field163[0][i_1][i_2] - 1;
      int i_8 = class21_3.field170[0][i_1][i_2] - 1;
      if (i_7 == -1 && i_8 == -1) {
         class321.method6012(this.field250 * i_1, this.field250 * (63 - i_2), this.field250, this.field250, this.field249);
      }

      int i_9 = 16711935;
      int i_10;
      if (i_8 != -1) {
         int i_11 = this.field249;
         class257 class257_13 = (class257) class257.field3503.method3320((long)i_8);
         class257 class257_12;
         if (class257_13 != null) {
            class257_12 = class257_13;
         } else {
            byte[] bytes_14 = class257.field3505.method4144(4, i_8);
            class257_13 = new class257();
            if (bytes_14 != null) {
               class257_13.method4744(new ByteBuffer(bytes_14), i_8, (byte) -104);
            }

            class257_13.method4743(2079651033);
            class257.field3503.method3322(class257_13, (long)i_8);
            class257_12 = class257_13;
         }

         if (class257_12 == null) {
            i_10 = i_11;
         } else if (class257_12.field3507 >= 0) {
            i_10 = class257_12.field3507 | ~0xffffff;
         } else {
            int i_15;
            byte b_16;
            int i_18;
            int i_19;
            if (class257_12.field3508 >= 0) {
               i_15 = class130.field1781.vmethod3284(class257_12.field3508, 992321423);
               b_16 = 96;
               if (i_15 == -2) {
                  i_18 = 12345678;
               } else if (i_15 == -1) {
                  if (b_16 < 0) {
                     b_16 = 0;
                  } else if (b_16 > 127) {
                     b_16 = 127;
                  }

                  i_19 = 127 - b_16;
                  i_18 = i_19;
               } else {
                  i_19 = b_16 * (i_15 & 0x7f) / 128;
                  if (i_19 < 2) {
                     i_19 = 2;
                  } else if (i_19 > 126) {
                     i_19 = 126;
                  }

                  i_18 = i_19 + (i_15 & 0xff80);
               }

               i_10 = class130.field1783[i_18] | ~0xffffff;
            } else if (class257_12.field3512 == 16711935) {
               i_10 = i_11;
            } else {
               i_18 = class192.method3679(class257_12.field3513, class257_12.field3509, class257_12.field3510);
               b_16 = 96;
               if (i_18 == -2) {
                  i_15 = 12345678;
               } else if (i_18 == -1) {
                  if (b_16 < 0) {
                     b_16 = 0;
                  } else if (b_16 > 127) {
                     b_16 = 127;
                  }

                  i_19 = 127 - b_16;
                  i_15 = i_19;
               } else {
                  i_19 = b_16 * (i_18 & 0x7f) / 128;
                  if (i_19 < 2) {
                     i_19 = 2;
                  } else if (i_19 > 126) {
                     i_19 = 126;
                  }

                  i_15 = i_19 + (i_18 & 0xff80);
               }

               i_10 = class130.field1783[i_15] | ~0xffffff;
            }
         }

         i_9 = i_10;
      }

      if (i_8 > -1 && class21_3.field165[0][i_1][i_2] == 0) {
         class321.method6012(this.field250 * i_1, this.field250 * (63 - i_2), this.field250, this.field250, i_9);
      } else {
         i_10 = this.method439(i_1, i_2, class21_3, class27_5, 23103860);
         if (i_8 == -1) {
            class321.method6012(this.field250 * i_1, this.field250 * (63 - i_2), this.field250, this.field250, i_10);
         } else {
            class40_4.method698(this.field250 * i_1, this.field250 * (63 - i_2), i_10, i_9, this.field250, this.field250, class21_3.field165[0][i_1][i_2], class21_3.field166[0][i_1][i_2], 1804465340);
         }
      }
   }

   int method455(class325 class325_1, class255 class255_2, int i_3) {
      switch(class255_2.field3459) {
      case 0:
         return 0;
      case 2:
         return -class325_1.field3899 / 2;
      default:
         return -class325_1.field3899;
      }
   }

   void method428(List list_1, int i_2) {
      Iterator iterator_3 = list_1.iterator();

      while (iterator_3.hasNext()) {
         class18 class18_4 = (class18) iterator_3.next();
         if (class18_4.field297.field2530 >> 6 == this.field245 && class18_4.field297.field2528 >> 6 == this.field246) {
            class18 class18_5 = new class18(class18_4.field297, class18_4.field297, class18_4.field125, this.method502(class18_4.field125, 1732767815));
            this.field251.add(class18_5);
         }
      }

   }

   void method436(int i_1, int i_2, class21 class21_3, class40 class40_4, class324[] arr_5, int i_6) {
      this.method472(i_1, i_2, class21_3, (short) 4754);
      this.method463(i_1, i_2, class21_3, arr_5, 111952884);
   }

   class28 method451(class241 class241_1, int i_2) {
      if (class241_1.field3216 != null && this.field257 != null && this.field257.get(class17.field113) != null) {
         class17 class17_3 = class17.method177(class241_1.field3218, 1320537825);
         if (class17_3 == null) {
            return null;
         } else {
            class295 class295_4 = (class295) this.field257.get(class17_3);
            if (class295_4 == null) {
               return null;
            } else {
               int i_5 = class295_4.method5390(class241_1.field3216, 1000000);
               String[] arr_6 = new String[i_5];
               class295_4.method5342(class241_1.field3216, (int[]) null, arr_6);
               int i_7 = arr_6.length * class295_4.field3709 / 2;
               int i_8 = 0;
               String[] arr_9 = arr_6;

               for (int i_10 = 0; i_10 < arr_9.length; i_10++) {
                  String string_11 = arr_9[i_10];
                  int i_12 = class295_4.method5417(string_11);
                  if (i_12 > i_8) {
                     i_8 = i_12;
                  }
               }

               return new class28(class241_1.field3216, i_8, i_7, class17_3);
            }
         }
      } else {
         return null;
      }
   }

   void method443(HashSet hashset_1, int i_2, int i_3, byte b_4) {
      Iterator iterator_5 = this.field251.iterator();

      while (iterator_5.hasNext()) {
         class34 class34_6 = (class34) iterator_5.next();
         if (class34_6.method578(-1274004046)) {
            class241 class241_7 = class222.method4118(class34_6.vmethod597(1091186624));
            if (class241_7 != null && hashset_1.contains(Integer.valueOf(class241_7.method4373((byte) 74)))) {
               this.method493(class241_7, class34_6.field296, class34_6.field295, i_2, i_3, (byte) 90);
            }
         }
      }

   }

   void method520(int i_1, int i_2, class21 class21_3, class40 class40_4, int i_5) {
      for (int i_6 = 1; i_6 < class21_3.field160; i_6++) {
         int i_7 = class21_3.field170[i_6][i_1][i_2] - 1;
         if (i_7 > -1) {
            int i_9 = this.field249;
            class257 class257_11 = (class257) class257.field3503.method3320((long)i_7);
            class257 class257_10;
            if (class257_11 != null) {
               class257_10 = class257_11;
            } else {
               byte[] bytes_12 = class257.field3505.method4144(4, i_7);
               class257_11 = new class257();
               if (bytes_12 != null) {
                  class257_11.method4744(new ByteBuffer(bytes_12), i_7, (byte) -90);
               }

               class257_11.method4743(-739254085);
               class257.field3503.method3322(class257_11, (long)i_7);
               class257_10 = class257_11;
            }

            int i_8;
            if (class257_10 == null) {
               i_8 = i_9;
            } else if (class257_10.field3507 >= 0) {
               i_8 = class257_10.field3507 | ~0xffffff;
            } else {
               int i_13;
               byte b_14;
               int i_17;
               int i_18;
               if (class257_10.field3508 >= 0) {
                  i_13 = class130.field1781.vmethod3284(class257_10.field3508, 1939659846);
                  b_14 = 96;
                  if (i_13 == -2) {
                     i_17 = 12345678;
                  } else if (i_13 == -1) {
                     if (b_14 < 0) {
                        b_14 = 0;
                     } else if (b_14 > 127) {
                        b_14 = 127;
                     }

                     i_18 = 127 - b_14;
                     i_17 = i_18;
                  } else {
                     i_18 = b_14 * (i_13 & 0x7f) / 128;
                     if (i_18 < 2) {
                        i_18 = 2;
                     } else if (i_18 > 126) {
                        i_18 = 126;
                     }

                     i_17 = i_18 + (i_13 & 0xff80);
                  }

                  i_8 = class130.field1783[i_17] | ~0xffffff;
               } else if (class257_10.field3512 == 16711935) {
                  i_8 = i_9;
               } else {
                  i_17 = class192.method3679(class257_10.field3513, class257_10.field3509, class257_10.field3510);
                  b_14 = 96;
                  if (i_17 == -2) {
                     i_13 = 12345678;
                  } else if (i_17 == -1) {
                     if (b_14 < 0) {
                        b_14 = 0;
                     } else if (b_14 > 127) {
                        b_14 = 127;
                     }

                     i_18 = 127 - b_14;
                     i_13 = i_18;
                  } else {
                     i_18 = b_14 * (i_17 & 0x7f) / 128;
                     if (i_18 < 2) {
                        i_18 = 2;
                     } else if (i_18 > 126) {
                        i_18 = 126;
                     }

                     i_13 = i_18 + (i_17 & 0xff80);
                  }

                  i_8 = class130.field1783[i_13] | ~0xffffff;
               }
            }

            if (class21_3.field165[i_6][i_1][i_2] == 0) {
               class321.method6012(this.field250 * i_1, this.field250 * (63 - i_2), this.field250, this.field250, i_8);
            } else {
               class40_4.method698(this.field250 * i_1, this.field250 * (63 - i_2), 0, i_8, this.field250, this.field250, class21_3.field165[i_6][i_1][i_2], class21_3.field166[i_6][i_1][i_2], 1198458587);
            }
         }
      }

   }

   void method446(class241 class241_1, int i_2, int i_3, int i_4) {
      class325 class325_5 = class241_1.method4379();
      if (class325_5 != null) {
         int i_6 = this.method455(class325_5, class241_1.field3226, 406251697);
         int i_7 = this.method450(class325_5, class241_1.field3227, (byte) 36);
         class325_5.method6126(i_6 + i_2, i_3 + i_7);
      }

   }

   int method450(class325 class325_1, class238 class238_2, byte b_3) {
      switch(class238_2.field3198) {
      case 0:
         return -class325_1.field3900 / 2;
      case 1:
         return 0;
      default:
         return -class325_1.field3900;
      }
   }

   void method447(class34 class34_1, class241 class241_2, int i_3, int i_4, float f_5, int i_6) {
      class28 class28_7 = class34_1.vmethod575(1637590458);
      if (class28_7 != null) {
         if (class28_7.field239.method184(f_5, -927816948)) {
            class295 class295_8 = (class295) this.field257.get(class28_7.field239);
            class295_8.method5350(class28_7.field237, i_3 - class28_7.field236 / 2, i_4, class28_7.field236, class28_7.field238, ~0xffffff | class241_2.field3217, 0, 1, 0, class295_8.field3709 / 2);
         }
      }
   }

   boolean method430(class233 class233_1, byte b_2) {
      this.field252.clear();
      if (this.field247 != null) {
         this.field247.method245(class233_1, 1963301304);
         if (this.field247.method244(-613524686)) {
            this.method425(0, 0, 64, 64, this.field247, 585564692);
            return true;
         } else {
            return false;
         }
      } else {
         boolean bool_3 = true;

         Iterator iterator_4;
         class39 class39_5;
         for (iterator_4 = this.field242.iterator(); iterator_4.hasNext(); bool_3 &= class39_5.method244(-613524686)) {
            class39_5 = (class39) iterator_4.next();
            class39_5.method245(class233_1, 2013007718);
         }

         if (bool_3) {
            iterator_4 = this.field242.iterator();

            while (iterator_4.hasNext()) {
               class39_5 = (class39) iterator_4.next();
               this.method425(class39_5.method685(-1825008967) * 8, class39_5.method680(-1471448055) * 8, 8, 8, class39_5, 80305622);
            }
         }

         return bool_3;
      }
   }

   void method425(int i_1, int i_2, int i_3, int i_4, class21 class21_5, int i_6) {
      for (int i_7 = i_1; i_7 < i_3 + i_1; i_7++) {
         label72:
         for (int i_8 = i_2; i_8 < i_2 + i_4; i_8++) {
            for (int i_9 = 0; i_9 < class21_5.field160; i_9++) {
               class25[] arr_10 = class21_5.field164[i_9][i_7][i_8];
               if (arr_10 != null && arr_10.length != 0) {
                  class25[] arr_11 = arr_10;

                  for (int i_12 = 0; i_12 < arr_11.length; i_12++) {
                     class253 class253_14;
                     boolean bool_15;
                     label63: {
                        class25 class25_13 = arr_11[i_12];
                        class253_14 = class128.method2970(class25_13.field208, (short) 4095);
                        if (class253_14.field3391 != null) {
                           int[] ints_16 = class253_14.field3391;

                           for (int i_17 = 0; i_17 < ints_16.length; i_17++) {
                              int i_18 = ints_16[i_17];
                              class253 class253_19 = class128.method2970(i_18, (short) 4095);
                              if (class253_19.field3378 != -1) {
                                 bool_15 = true;
                                 break label63;
                              }
                           }
                        } else if (class253_14.field3378 != -1) {
                           bool_15 = true;
                           break label63;
                        }

                        bool_15 = false;
                     }

                     if (bool_15) {
                        this.method444(class253_14, i_9, i_7, i_8, class21_5, -1363155739);
                        continue label72;
                     }
                  }
               }
            }
         }
      }

   }

   List method453(byte b_1) {
      LinkedList linkedlist_2 = new LinkedList();
      linkedlist_2.addAll(this.field251);
      linkedlist_2.addAll(this.field252.values());
      return linkedlist_2;
   }

   class28 method502(int i_1, int i_2) {
      class241 class241_3 = class222.method4118(i_1);
      return this.method451(class241_3, 1686665284);
   }

   int method439(int i_1, int i_2, class21 class21_3, class27 class27_4, int i_5) {
      return class21_3.field163[0][i_1][i_2] == 0 ? this.field249 : class27_4.method408(i_1, i_2, (byte) -97);
   }

   void method444(class253 class253_1, int i_2, int i_3, int i_4, class21 class21_5, int i_6) {
      class213 class213_7 = new class213(i_2, i_3 + this.field245 * 64, this.field246 * 64 + i_4);
      class213 class213_8 = null;
      if (this.field247 != null) {
         class213_8 = new class213(this.field247.field159 + i_2, i_3 + this.field247.field167 * 64, i_4 + this.field247.field156 * 64);
      } else {
         class39 class39_9 = (class39) class21_5;
         class213_8 = new class213(i_2 + class39_9.field159, i_3 + class39_9.field167 * 64 + class39_9.method676(2082336179) * 8, i_4 + class39_9.field156 * 64 + class39_9.method678(-521684078) * 8);
      }

      Object obj_11;
      if (class253_1.field3391 != null) {
         obj_11 = new class23(class213_8, class213_7, class253_1.field3357, this);
      } else {
         class241 class241_10 = class222.method4118(class253_1.field3378);
         obj_11 = new class18(class213_8, class213_7, class241_10.field3213, this.method451(class241_10, 1686665284));
      }

      this.field252.put(new class213(0, i_3, i_4), obj_11);
   }

   void method493(class241 class241_1, int i_2, int i_3, int i_4, int i_5, byte b_6) {
      class325 class325_7 = class241_1.method4379();
      if (class325_7 != null) {
         class325_7.method6126(i_2 - class325_7.field3899 / 2, i_3 - class325_7.field3900 / 2);
         if (i_4 % i_5 < i_5 / 2) {
            class321.method6025(i_2, i_3, 15, 16776960, 128);
            class321.method6025(i_2, i_3, 7, 16777215, 256);
         }

      }
   }

   void method492(byte b_1) {
      Iterator iterator_2 = this.field252.values().iterator();

      while (iterator_2.hasNext()) {
         class34 class34_3 = (class34) iterator_2.next();
         if (class34_3 instanceof class23) {
            ((class23) class34_3).method289((byte) 1);
         }
      }

   }

   void method445(class34 class34_1, int i_2, int i_3, float f_4, byte b_5) {
      class241 class241_6 = class222.method4118(class34_1.vmethod597(879841304));
      this.method446(class241_6, i_2, i_3, 1065739105);
      this.method447(class34_1, class241_6, i_2, i_3, f_4, -1918014118);
   }

   void method433(HashSet hashset_1, int i_2, int i_3, byte b_4) {
      Iterator iterator_5 = this.field252.values().iterator();

      while (iterator_5.hasNext()) {
         class34 class34_6 = (class34) iterator_5.next();
         if (class34_6.method578(-1274004046)) {
            int i_7 = class34_6.vmethod597(-72715581);
            if (hashset_1.contains(Integer.valueOf(i_7))) {
               class241 class241_8 = class222.method4118(i_7);
               this.method493(class241_8, class34_6.field296, class34_6.field295, i_2, i_3, (byte) 14);
            }
         }
      }

      this.method443(hashset_1, i_2, i_3, (byte) -45);
   }

   void method434(class40 class40_1, class324[] arr_2, class27 class27_3, int i_4) {
      int i_5;
      int i_6;
      for (i_5 = 0; i_5 < 64; i_5++) {
         for (i_6 = 0; i_6 < 64; i_6++) {
            this.method426(i_5, i_6, this.field247, class40_1, class27_3, -1409851959);
            this.method520(i_5, i_6, this.field247, class40_1, -272085910);
         }
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
         for (i_6 = 0; i_6 < 64; i_6++) {
            this.method436(i_5, i_6, this.field247, class40_1, arr_2, 1019894341);
         }
      }

   }

   void method435(class40 class40_1, class324[] arr_2, class27 class27_3, int i_4) {
      Iterator iterator_5 = this.field242.iterator();

      class39 class39_6;
      int i_7;
      int i_8;
      while (iterator_5.hasNext()) {
         class39_6 = (class39) iterator_5.next();

         for (i_7 = class39_6.method685(-1641135365) * 8; i_7 < class39_6.method685(-1656234696) * 8 + 8; i_7++) {
            for (i_8 = class39_6.method680(-1829076552) * 8; i_8 < class39_6.method680(-1868477150) * 8 + 8; i_8++) {
               this.method426(i_7, i_8, class39_6, class40_1, class27_3, -1127411208);
               this.method520(i_7, i_8, class39_6, class40_1, 742440794);
            }
         }
      }

      iterator_5 = this.field242.iterator();

      while (iterator_5.hasNext()) {
         class39_6 = (class39) iterator_5.next();

         for (i_7 = class39_6.method685(-1375964958) * 8; i_7 < class39_6.method685(-500534432) * 8 + 8; i_7++) {
            for (i_8 = class39_6.method680(-1257485196) * 8; i_8 < class39_6.method680(-1869880086) * 8 + 8; i_8++) {
               this.method436(i_7, i_8, class39_6, class40_1, arr_2, 1899751971);
            }
         }
      }

   }

   void method454(int i_1, int i_2, int i_3, int i_4, int i_5) {
      i_3 %= 4;
      if (i_3 == 0) {
         class321.method6000(this.field250 * i_1, this.field250 * (63 - i_2), this.field250, i_4);
      }

      if (i_3 == 1) {
         class321.method6010(this.field250 * i_1, this.field250 * (63 - i_2), this.field250, i_4);
      }

      if (i_3 == 2) {
         class321.method6000(this.field250 * i_1 + this.field250 - 1, this.field250 * (63 - i_2), this.field250, i_4);
      }

      if (i_3 == 3) {
         class321.method6010(this.field250 * i_1, this.field250 * (63 - i_2) + this.field250 - 1, this.field250, i_4);
      }

   }

   void method432(int i_1, int i_2, int i_3, HashSet hashset_4, byte b_5) {
      if (hashset_4 == null) {
         hashset_4 = new HashSet();
      }

      this.method442(i_1, i_2, hashset_4, i_3, -1887424608);
      this.method448(i_1, i_2, hashset_4, i_3, 1861626297);
   }

   List method440(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      LinkedList linkedlist_7 = new LinkedList();
      if (i_4 >= i_1 && i_5 >= i_2) {
         if (i_4 < i_3 + i_1 && i_5 < i_3 + i_2) {
            Iterator iterator_8 = this.field252.values().iterator();

            class34 class34_9;
            while (iterator_8.hasNext()) {
               class34_9 = (class34) iterator_8.next();
               if (class34_9.method578(-1274004046) && class34_9.method576(i_4, i_5, (byte) -101)) {
                  linkedlist_7.add(class34_9);
               }
            }

            iterator_8 = this.field251.iterator();

            while (iterator_8.hasNext()) {
               class34_9 = (class34) iterator_8.next();
               if (class34_9.method578(-1274004046) && class34_9.method576(i_4, i_5, (byte) -101)) {
                  linkedlist_7.add(class34_9);
               }
            }

            return linkedlist_7;
         } else {
            return linkedlist_7;
         }
      } else {
         return linkedlist_7;
      }
   }

   void method429(short s_1) {
      if (this.field247 != null) {
         this.field247.method246(651504876);
      } else {
         Iterator iterator_2 = this.field242.iterator();

         while (iterator_2.hasNext()) {
            class39 class39_3 = (class39) iterator_2.next();
            class39_3.method246(1146093408);
         }
      }

   }

   void method473(int i_1, class40 class40_2, class324[] arr_3, class233 class233_4, class233 class233_5, int i_6) {
      this.field250 = i_1;
      if (this.field247 != null || !this.field242.isEmpty()) {
         if (class228.method4130(this.field245, this.field246, i_1, (short) -4698) == null) {
            boolean bool_7 = true;
            bool_7 &= this.method430(class233_4, (byte) 96);
            int i_9;
            if (this.field247 != null) {
               i_9 = this.field247.field161;
            } else {
               i_9 = ((class21) this.field242.getFirst()).field161;
            }

            bool_7 &= class233_5.method4199(i_9);
            if (bool_7) {
               byte[] bytes_8 = class233_5.method4208(i_9);
               class27 class27_10;
               if (bytes_8 == null) {
                  class27_10 = new class27();
               } else {
                  class27_10 = new class27(class158.method3435(bytes_8, (byte) 61).field3908);
               }

               class325 class325_12 = new class325(this.field250 * 64, this.field250 * 64);
               class325_12.method6114();
               if (this.field247 != null) {
                  this.method434(class40_2, arr_3, class27_10, -5287364);
               } else {
                  this.method435(class40_2, arr_3, class27_10, 1494661478);
               }

               int i_13 = this.field245;
               int i_14 = this.field246;
               int i_15 = this.field250;
               field244.method3351(class325_12, class217.method4089(i_13, i_14, i_15, 1098126812), class325_12.field3908.length * 4);
               this.method429((short) 30233);
            }
         }
      }
   }

   void method506(int i_1, int i_2, int i_3, int i_4) {
      class325 class325_5 = class228.method4130(this.field245, this.field246, this.field250, (short) -6643);
      if (class325_5 != null) {
         if (i_3 == this.field250 * 64) {
            class325_5.method6121(i_1, i_2);
         } else {
            class325_5.method6144(i_1, i_2, i_3, i_3);
         }

      }
   }

   void method423(class15 class15_1, List list_2, int i_3) {
      this.field252.clear();
      this.field247 = class15_1;
      this.method428(list_2, -1298217436);
   }

   void method424(HashSet hashset_1, List list_2, int i_3) {
      this.field252.clear();
      Iterator iterator_4 = hashset_1.iterator();

      while (iterator_4.hasNext()) {
         class39 class39_5 = (class39) iterator_4.next();
         if (class39_5.method250(-121424149) == this.field245 && class39_5.method251(-1967751745) == this.field246) {
            this.field242.add(class39_5);
         }
      }

      this.method428(list_2, -1783662138);
   }

   static final void method497(boolean bool_0, int i_1) {
      for (int i_2 = 0; i_2 < client.field695; i_2++) {
         class79 class79_3 = client.field694[client.field696[i_2]];
         if (class79_3 != null && class79_3.vmethod1965(135759381) && class79_3.field1134.field3473 == bool_0 && class79_3.field1134.method4710()) {
            int i_4 = class79_3.field1005 >> 7;
            int i_5 = class79_3.field949 >> 7;
            if (i_4 >= 0 && i_4 < 104 && i_5 >= 0 && i_5 < 104) {
               if (class79_3.field952 == 1 && (class79_3.field1005 & 0x7f) == 64 && (class79_3.field949 & 0x7f) == 64) {
                  if (client.field750[i_4][i_5] == client.field751) {
                     continue;
                  }

                  client.field750[i_4][i_5] = client.field751;
               }

               long long_6 = class126.method2854(0, 0, 1, !class79_3.field1134.field3496, client.field696[i_2], 605057963);
               class79_3.field953 = client.field881;
               class5.field22.method3077(class42.field372, class79_3.field1005, class79_3.field949, class62.method1130(class79_3.field952 * 64 - 64 + class79_3.field1005, class79_3.field952 * 64 - 64 + class79_3.field949, class42.field372), class79_3.field952 * 64 - 64 + 60, class79_3, class79_3.field950, long_6, class79_3.field967);
            }
         }
      }

   }

   public static void method533(int i_0, class233 class233_1, String string_2, String string_3, int i_4, boolean bool_5, int i_6) {
      int i_7 = class233_1.method4160(string_2);
      int i_8 = class233_1.method4161(i_7, string_3);
      class197.field2402 = 1;
      class11.field76 = class233_1;
      class197.field2403 = i_7;
      class197.field2407 = i_8;
      class56.field529 = i_4;
      class158.field1992 = bool_5;
      class197.field2404 = i_0;
   }

}
