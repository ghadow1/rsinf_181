import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class90 {

   static int field1266;
   boolean field1270 = false;
   Map field1271;
   boolean[] field1268;
   String[] field1269;
   long field1272;

   class90() {
      int i_1 = class215.field2544.method4154(19, -1308599305);
      this.field1271 = new HashMap();
      this.field1268 = new boolean[i_1];

      int i_2;
      for (i_2 = 0; i_2 < i_1; i_2++) {
         class242 class242_4 = (class242) class242.field3232.method3320((long)i_2);
         class242 class242_3;
         if (class242_4 != null) {
            class242_3 = class242_4;
         } else {
            byte[] bytes_5 = class242.field3233.method4144(19, i_2, 837279805);
            class242_4 = new class242();
            if (bytes_5 != null) {
               class242_4.method4401(new class300(bytes_5), (byte) 22);
            }

            class242.field3232.method3322(class242_4, (long)i_2);
            class242_3 = class242_4;
         }

         this.field1268[i_2] = class242_3.field3234;
      }

      i_2 = 0;
      if (class215.field2544.method4268(15, (byte) 0)) {
         i_2 = class215.field2544.method4154(15, -1999468647);
      }

      this.field1269 = new String[i_2];
      this.method2104((byte) -5);
   }

   class343 method2102(boolean bool_1, int i_2) {
      return class18.method207("2", class29.field248.field3111, bool_1, -924083635);
   }

   boolean method2099(int i_1) {
      return this.field1270;
   }

   void method2100(int i_1) {
      class343 class343_2 = this.method2102(true, 195746057);
      boolean bool_26 = false;

      label165: {
         label164: {
            try {
               bool_26 = true;
               int i_3 = 3;
               int i_4 = 0;
               Iterator iterator_5 = this.field1271.entrySet().iterator();

               while (iterator_5.hasNext()) {
                  Entry map$entry_6 = (Entry) iterator_5.next();
                  int i_7 = ((Integer) map$entry_6.getKey()).intValue();
                  if (this.field1268[i_7]) {
                     Object object_8 = map$entry_6.getValue();
                     i_3 += 3;
                     if (object_8 instanceof Integer) {
                        i_3 += 4;
                     } else if (object_8 instanceof String) {
                        i_3 += class209.method3945((String) object_8, 350180445);
                     }

                     ++i_4;
                  }
               }

               class300 class300_32 = new class300(i_3);
               class300_32.method5655(2, 876340587);
               class300_32.method5479(i_4, (byte) 0);
               Iterator iterator_33 = this.field1271.entrySet().iterator();

               while (iterator_33.hasNext()) {
                  Entry map$entry_18 = (Entry) iterator_33.next();
                  int i_19 = ((Integer) map$entry_18.getKey()).intValue();
                  if (this.field1268[i_19]) {
                     class300_32.method5479(i_19, (byte) -98);
                     Object object_9 = map$entry_18.getValue();
                     Class class_11 = object_9.getClass();
                     class3[] arr_12 = new class3[] {class3.field9, class3.field14, class3.field7};
                     class3[] arr_13 = arr_12;
                     int i_14 = 0;

                     class3 class3_10;
                     while (true) {
                        if (i_14 >= arr_13.length) {
                           class3_10 = null;
                           break;
                        }

                        class3 class3_15 = arr_13[i_14];
                        if (class_11 == class3_15.field12) {
                           class3_10 = class3_15;
                           break;
                        }

                        ++i_14;
                     }

                     class300_32.method5655(class3_10.field11, 1101389494);
                     class3.method30(object_9, class300_32, (byte) 1);
                  }
               }

               class343_2.method6561(class300_32.field3730, 0, class300_32.field3732, 96217367);
               bool_26 = false;
               break label164;
            } catch (Exception exception_30) {
               bool_26 = false;
            } finally {
               if(bool_26) {
                  try {
                     class343_2.method6550(414248711);
                  } catch (Exception exception_27) {
                     ;
                  }

               }
            }

            try {
               class343_2.method6550(1194565895);
            } catch (Exception exception_28) {
               ;
            }
            break label165;
         }

         try {
            class343_2.method6550(-1684100095);
         } catch (Exception exception_29) {
            ;
         }
      }

      this.field1270 = false;
      this.field1272 = class206.method3939(-1618680524);
   }

   void method2104(byte b_1) {
      class343 class343_2 = this.method2102(false, 813176222);
      boolean bool_26 = false;

      label238: {
         label242: {
            label236: {
               label235: {
                  try {
                     bool_26 = true;
                     byte[] bytes_3 = new byte[(int)class343_2.method6552(-1748957902)];

                     int i_5;
                     for (int i_4 = 0; i_4 < bytes_3.length; i_4 += i_5) {
                        i_5 = class343_2.method6554(bytes_3, i_4, bytes_3.length - i_4, 1748068416);
                        if (i_5 == -1) {
                           throw new EOFException();
                        }
                     }

                     class300 class300_16 = new class300(bytes_3);
                     if (class300_16.field3730.length - class300_16.field3732 < 1) {
                        bool_26 = false;
                        break label236;
                     }

                     int i_17 = class300_16.method5504((byte) 98);
                     if (i_17 < 0) {
                        bool_26 = false;
                        break label238;
                     }

                     if (i_17 > 2) {
                        bool_26 = false;
                        break label238;
                     }

                     int i_8;
                     int i_9;
                     int i_10;
                     int i_18;
                     if (i_17 >= 2) {
                        i_18 = class300_16.method5496(-1459053594);
                        i_8 = 0;

                        while (true) {
                           if (i_8 >= i_18) {
                              bool_26 = false;
                              break;
                           }

                           i_9 = class300_16.method5496(-1459053594);
                           i_10 = class300_16.method5504((byte) 127);
                           class3[] arr_11 = new class3[] {class3.field9, class3.field14, class3.field7};
                           class3 class3_12 = (class3) class107.method2476(arr_11, i_10, (byte) 0);
                           Object object_13 = class3_12.method34(class300_16, -25501823);
                           if (this.field1268[i_9]) {
                              this.field1271.put(Integer.valueOf(i_9), object_13);
                           }

                           ++i_8;
                        }
                     } else {
                        i_18 = class300_16.method5496(-1459053594);

                        for (i_8 = 0; i_8 < i_18; i_8++) {
                           i_9 = class300_16.method5496(-1459053594);
                           i_10 = class300_16.method5499((byte) -13);
                           if (this.field1268[i_9]) {
                              this.field1271.put(Integer.valueOf(i_9), Integer.valueOf(i_10));
                           }
                        }

                        i_8 = class300_16.method5496(-1459053594);

                        for (i_9 = 0; i_9 < i_8; i_9++) {
                           class300_16.method5496(-1459053594);
                           class300_16.method5503(-231155257);
                        }

                        bool_26 = false;
                     }
                  } catch (Exception exception_32) {
                     bool_26 = false;
                     break label235;
                  } finally {
                     if(bool_26) {
                        try {
                           class343_2.method6550(-148886646);
                        } catch (Exception exception_27) {
                           ;
                        }

                     }
                  }

                  try {
                     class343_2.method6550(820455936);
                  } catch (Exception exception_30) {
                     ;
                  }
                  break label242;
               }

               try {
                  class343_2.method6550(-1265010716);
               } catch (Exception exception_29) {
                  ;
               }
               break label242;
            }

            try {
               class343_2.method6550(31759710);
            } catch (Exception exception_28) {
               ;
            }

            return;
         }

         this.field1270 = false;
         return;
      }

      try {
         class343_2.method6550(1862531027);
      } catch (Exception exception_31) {
         ;
      }

   }

   String method2145(int i_1, int i_2) {
      return this.field1269[i_1];
   }

   int method2096(int i_1, byte b_2) {
      Object object_3 = this.field1271.get(Integer.valueOf(i_1));
      return object_3 instanceof Integer ? ((Integer) object_3).intValue() : -1;
   }

   String method2098(int i_1, int i_2) {
      Object object_3 = this.field1271.get(Integer.valueOf(i_1));
      return object_3 instanceof String ? (String) object_3 : "";
   }

   void method2112(int i_1, int i_2, int i_3) {
      this.field1271.put(Integer.valueOf(i_1), Integer.valueOf(i_2));
      if (this.field1268[i_1]) {
         this.field1270 = true;
      }

   }

   void method2136(int i_1, String string_2, int i_3) {
      this.field1269[i_1] = string_2;
   }

   void method2125(int i_1, String string_2, int i_3) {
      this.field1271.put(Integer.valueOf(i_1), string_2);
   }

   void method2101(int i_1) {
      int i_2;
      for (i_2 = 0; i_2 < this.field1268.length; i_2++) {
         if (!this.field1268[i_2]) {
            this.field1271.remove(Integer.valueOf(i_2));
         }
      }

      for (i_2 = 0; i_2 < this.field1269.length; i_2++) {
         this.field1269[i_2] = null;
      }

   }

   void method2105(int i_1) {
      if (this.field1270 && this.field1272 < class206.method3939(-1964393699) - 60000L) {
         this.method2100(2110118383);
      }

   }

}
