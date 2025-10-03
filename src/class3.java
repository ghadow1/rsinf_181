public class class3 implements UnknownT {

   public static final class3 field7 = new class3(2, 0, Integer.class, new class1());
   public static final class3 field9 = new class3(1, 1, Long.class, new class2());
   public static final class3 field14 = new class3(0, 2, String.class, new class4());
   final int field10;
   public final int field11;
   public final Class field12;
   final class0 field13;

   class3(int i_1, int i_2, Class class_3, class0 class0_4) {
      this.field10 = i_1;
      this.field11 = i_2;
      this.field12 = class_3;
      this.field13 = class0_4;
   }

   public int getId(int i_1) {
      return this.field11;
   }

   public Object method34(ByteBuffer class300_1) {
      return this.field13.vmethod42(class300_1, -408972538);
   }

   public static int method38(CharSequence charsequence_0) {
      return AbstractWorldMapData.method554(charsequence_0, 10);
   }

   public static void method30(Object object_0, ByteBuffer class300_1, byte b_2) {
      class0 class0_3 = method31(object_0.getClass());
      class0_3.vmethod43(object_0, class300_1, 1977897097);
   }

   static class0 method31(Class class_0) {
      class3[] arr_3 = new class3[] {field9, field14, field7};
      class3[] arr_4 = arr_3;
      int i_5 = 0;

      class3 class3_2;
      while (true) {
         if (i_5 >= arr_4.length) {
            class3_2 = null;
            break;
         }

         class3 class3_6 = arr_4[i_5];
         if (class3_6.field12 == class_0) {
            class3_2 = class3_6;
            break;
         }

         ++i_5;
      }

      if (class3_2 == null) {
         throw new IllegalArgumentException();
      } else {
         return class3_2.field13;
      }
   }

   static final void method37(int i_0, int i_1, int i_2, int i_3, int i_4) {
      long long_6 = class5.field22.method3130(i_0, i_1, i_2);
      int i_8;
      int i_9;
      int i_10;
      int i_11;
      int i_15;
      int i_27;
      if (long_6 != 0L) {
         i_8 = class5.field22.method3096(i_0, i_1, i_2, long_6);
         i_9 = i_8 >> 6 & 0x3;
         i_10 = i_8 & 0x1f;
         i_11 = i_3;
         boolean bool_13 = long_6 != 0L;
         if (bool_13) {
            boolean bool_14 = (int)(long_6 >>> 16 & 0x1L) == 1;
            bool_13 = !bool_14;
         }

         if (bool_13) {
            i_11 = i_4;
         }

         int[] ints_20 = ParamDefinition.sceneMinimapSprite.field3908;
         i_27 = i_1 * 4 + (103 - i_2) * 2048 + 24624;
         i_15 = GCMonitor.method770(long_6);
         class253 class253_16 = class128.method2970(i_15);
         if (class253_16.field3379 != -1) {
            class324 class324_17 = class285.field3660[class253_16.field3379];
            if (class324_17 != null) {
               int i_18 = (class253_16.field3365 * 4 - class324_17.field3897) / 2;
               int i_19 = (class253_16.field3366 * 4 - class324_17.field3893) / 2;
               class324_17.method6101(i_18 + i_1 * 4 + 48, (104 - i_2 - class253_16.field3366) * 4 + i_19 + 48);
            }
         } else {
            if (i_10 == 0 || i_10 == 2) {
               if (i_9 == 0) {
                  ints_20[i_27] = i_11;
                  ints_20[i_27 + 512] = i_11;
                  ints_20[i_27 + 1024] = i_11;
                  ints_20[i_27 + 1536] = i_11;
               } else if (i_9 == 1) {
                  ints_20[i_27] = i_11;
                  ints_20[i_27 + 1] = i_11;
                  ints_20[i_27 + 2] = i_11;
                  ints_20[i_27 + 3] = i_11;
               } else if (i_9 == 2) {
                  ints_20[i_27 + 3] = i_11;
                  ints_20[i_27 + 512 + 3] = i_11;
                  ints_20[i_27 + 1024 + 3] = i_11;
                  ints_20[i_27 + 1536 + 3] = i_11;
               } else if (i_9 == 3) {
                  ints_20[i_27 + 1536] = i_11;
                  ints_20[i_27 + 1536 + 1] = i_11;
                  ints_20[i_27 + 1536 + 2] = i_11;
                  ints_20[i_27 + 1536 + 3] = i_11;
               }
            }

            if (i_10 == 3) {
               if (i_9 == 0) {
                  ints_20[i_27] = i_11;
               } else if (i_9 == 1) {
                  ints_20[i_27 + 3] = i_11;
               } else if (i_9 == 2) {
                  ints_20[i_27 + 1536 + 3] = i_11;
               } else if (i_9 == 3) {
                  ints_20[i_27 + 1536] = i_11;
               }
            }

            if (i_10 == 2) {
               if (i_9 == 3) {
                  ints_20[i_27] = i_11;
                  ints_20[i_27 + 512] = i_11;
                  ints_20[i_27 + 1024] = i_11;
                  ints_20[i_27 + 1536] = i_11;
               } else if (i_9 == 0) {
                  ints_20[i_27] = i_11;
                  ints_20[i_27 + 1] = i_11;
                  ints_20[i_27 + 2] = i_11;
                  ints_20[i_27 + 3] = i_11;
               } else if (i_9 == 1) {
                  ints_20[i_27 + 3] = i_11;
                  ints_20[i_27 + 512 + 3] = i_11;
                  ints_20[i_27 + 1024 + 3] = i_11;
                  ints_20[i_27 + 1536 + 3] = i_11;
               } else if (i_9 == 2) {
                  ints_20[i_27 + 1536] = i_11;
                  ints_20[i_27 + 1536 + 1] = i_11;
                  ints_20[i_27 + 1536 + 2] = i_11;
                  ints_20[i_27 + 1536 + 3] = i_11;
               }
            }
         }
      }

      long_6 = class5.field22.method3094(i_0, i_1, i_2);
      if (long_6 != 0L) {
         i_8 = class5.field22.method3096(i_0, i_1, i_2, long_6);
         i_9 = i_8 >> 6 & 0x3;
         i_10 = i_8 & 0x1f;
         i_11 = GCMonitor.method770(long_6);
         class253 class253_21 = class128.method2970(i_11);
         if (class253_21.field3379 != -1) {
            class324 class324_29 = class285.field3660[class253_21.field3379];
            if (class324_29 != null) {
               i_27 = (class253_21.field3365 * 4 - class324_29.field3897) / 2;
               i_15 = (class253_21.field3366 * 4 - class324_29.field3893) / 2;
               class324_29.method6101(i_27 + i_1 * 4 + 48, i_15 + (104 - i_2 - class253_21.field3366) * 4 + 48);
            }
         } else if (i_10 == 9) {
            int i_26 = 15658734;
            boolean bool_28 = long_6 != 0L;
            if (bool_28) {
               boolean bool_24 = (int)(long_6 >>> 16 & 0x1L) == 1;
               bool_28 = !bool_24;
            }

            if (bool_28) {
               i_26 = 15597568;
            }

            int[] ints_25 = ParamDefinition.sceneMinimapSprite.field3908;
            int i_30 = i_1 * 4 + (103 - i_2) * 2048 + 24624;
            if (i_9 != 0 && i_9 != 2) {
               ints_25[i_30] = i_26;
               ints_25[i_30 + 1 + 512] = i_26;
               ints_25[i_30 + 1024 + 2] = i_26;
               ints_25[i_30 + 1536 + 3] = i_26;
            } else {
               ints_25[i_30 + 1536] = i_26;
               ints_25[i_30 + 1 + 1024] = i_26;
               ints_25[i_30 + 512 + 2] = i_26;
               ints_25[i_30 + 3] = i_26;
            }
         }
      }

      long_6 = class5.field22.method3095(i_0, i_1, i_2);
      if (long_6 != 0L) {
         i_8 = GCMonitor.method770(long_6);
         class253 class253_22 = class128.method2970(i_8);
         if (class253_22.field3379 != -1) {
            class324 class324_23 = class285.field3660[class253_22.field3379];
            if (class324_23 != null) {
               i_11 = (class253_22.field3365 * 4 - class324_23.field3897) / 2;
               int i_12 = (class253_22.field3366 * 4 - class324_23.field3893) / 2;
               class324_23.method6101(i_11 + i_1 * 4 + 48, i_12 + (104 - i_2 - class253_22.field3366) * 4 + 48);
            }
         }
      }

   }

   public static int method33(int i_0, byte b_1) {
      return class28.method420(class128.field1750[i_0]);
   }

}
