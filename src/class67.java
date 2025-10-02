import java.util.Comparator;

public class class67 implements Comparator {

   public static String field647;
   static class235 field650;
   boolean field648;

   int method1228(class7 class7_1, class7 class7_2, int i_3) {
      if (class7_2.field51 == class7_1.field51) {
         return 0;
      } else {
         if (this.field648) {
            if (Client.field807 == class7_1.field51) {
               return -1;
            }

            if (class7_2.field51 == Client.field807) {
               return 1;
            }
         }

         return class7_1.field51 < class7_2.field51 ? -1 : 1;
      }
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method1228((class7) object_1, (class7) object_2, 150441453);
   }

   public static int method1237(int i_0, int i_1) {
      class248 class248_3 = (class248) class248.field3294.method3320((long)i_0);
      class248 class248_2;
      if (class248_3 != null) {
         class248_2 = class248_3;
      } else {
         byte[] bytes_8 = class248.field3298.method4144(14, i_0);
         class248_3 = new class248();
         if (bytes_8 != null) {
            class248_3.method4485(new ByteBuffer(bytes_8), -1936267259);
         }

         class248.field3294.method3322(class248_3, (long)i_0);
         class248_2 = class248_3;
      }

      int i_4 = class248_2.field3296;
      int i_5 = class248_2.field3297;
      int i_6 = class248_2.field3295;
      int i_7 = class212.field2527[i_6 - i_5];
      return class212.field2525[i_4] >> i_5 & i_7;
   }

   public static boolean method1231(char var_0, int i_1) {
      return var_0 >= 48 && var_0 <= 57 || var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
   }

   static final void method1236(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, class133 class133_6, class172 class172_7, short s_8) {
      if (!Client.field656 || (class55.field502[0][i_1][i_2] & 0x2) != 0 || (class55.field502[i_0][i_1][i_2] & 0x10) == 0) {
         if (i_0 < class55.field503) {
            class55.field503 = i_0;
         }

         class253 class253_9 = class128.method2970(i_3, (short) 4095);
         int i_10;
         int i_11;
         if (i_4 != 1 && i_4 != 3) {
            i_10 = class253_9.field3365;
            i_11 = class253_9.field3366;
         } else {
            i_10 = class253_9.field3366;
            i_11 = class253_9.field3365;
         }

         int i_12;
         int i_13;
         if (i_10 + i_1 <= 104) {
            i_12 = (i_10 >> 1) + i_1;
            i_13 = (i_10 + 1 >> 1) + i_1;
         } else {
            i_12 = i_1;
            i_13 = i_1 + 1;
         }

         int i_14;
         int i_15;
         if (i_11 + i_2 <= 104) {
            i_14 = (i_11 >> 1) + i_2;
            i_15 = i_2 + (i_11 + 1 >> 1);
         } else {
            i_14 = i_2;
            i_15 = i_2 + 1;
         }

         int[][] ints_16 = class55.field516[i_0];
         int i_17 = ints_16[i_12][i_15] + ints_16[i_13][i_14] + ints_16[i_12][i_14] + ints_16[i_13][i_15] >> 2;
         int i_18 = (i_1 << 7) + (i_10 << 6);
         int i_19 = (i_2 << 7) + (i_11 << 6);
         long long_20 = class126.method2854(i_1, i_2, 2, class253_9.field3369 == 0, i_3, -1677941085);
         int i_22 = i_5 + (i_4 << 6);
         if (class253_9.field3361 == 1) {
            i_22 += 256;
         }

         if (class253_9.method4598(-2033078684)) {
            class83.method1996(i_0, i_1, i_2, class253_9, i_4, 1789870821);
         }

         Object obj_23;
         if (i_5 == 22) {
            if (!Client.field656 || class253_9.field3369 != 0 || class253_9.field3382 == 1 || class253_9.field3388) {
               if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                  obj_23 = class253_9.method4591(22, i_4, ints_16, i_18, i_17, i_19, (byte) 11);
               } else {
                  obj_23 = new class93(i_3, 22, i_4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
               }

               class133_6.method3072(i_0, i_1, i_2, i_17, (class135) obj_23, long_20, i_22);
               if (class253_9.field3382 == 1 && class172_7 != null) {
                  class172_7.method3562(i_1, i_2);
               }

            }
         } else {
            int i_24;
            if (i_5 != 10 && i_5 != 11) {
               if (i_5 >= 12) {
                  if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                     obj_23 = class253_9.method4591(i_5, i_4, ints_16, i_18, i_17, i_19, (byte) 49);
                  } else {
                     obj_23 = new class93(i_3, i_5, i_4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                  }

                  class133_6.method3076(i_0, i_1, i_2, i_17, 1, 1, (class135) obj_23, 0, long_20, i_22);
                  if (i_5 >= 12 && i_5 <= 17 && i_5 != 13 && i_0 > 0) {
                     class137.field1887[i_0][i_1][i_2] |= 0x924;
                  }

                  if (class253_9.field3382 != 0 && class172_7 != null) {
                     class172_7.method3560(i_1, i_2, i_10, i_11, class253_9.field3368);
                  }

               } else if (i_5 == 0) {
                  if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                     obj_23 = class253_9.method4591(0, i_4, ints_16, i_18, i_17, i_19, (byte) -63);
                  } else {
                     obj_23 = new class93(i_3, 0, i_4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                  }

                  class133_6.method3093(i_0, i_1, i_2, i_17, (class135) obj_23, (class135) null, class55.field512[i_4], 0, long_20, i_22);
                  if (i_4 == 0) {
                     if (class253_9.field3356) {
                        class32.field282[i_0][i_1][i_2] = 50;
                        class32.field282[i_0][i_1][i_2 + 1] = 50;
                     }

                     if (class253_9.field3372) {
                        class137.field1887[i_0][i_1][i_2] |= 0x249;
                     }
                  } else if (i_4 == 1) {
                     if (class253_9.field3356) {
                        class32.field282[i_0][i_1][i_2 + 1] = 50;
                        class32.field282[i_0][i_1 + 1][i_2 + 1] = 50;
                     }

                     if (class253_9.field3372) {
                        class137.field1887[i_0][i_1][1 + i_2] |= 0x492;
                     }
                  } else if (i_4 == 2) {
                     if (class253_9.field3356) {
                        class32.field282[i_0][i_1 + 1][i_2] = 50;
                        class32.field282[i_0][i_1 + 1][i_2 + 1] = 50;
                     }

                     if (class253_9.field3372) {
                        class137.field1887[i_0][i_1 + 1][i_2] |= 0x249;
                     }
                  } else if (i_4 == 3) {
                     if (class253_9.field3356) {
                        class32.field282[i_0][i_1][i_2] = 50;
                        class32.field282[i_0][i_1 + 1][i_2] = 50;
                     }

                     if (class253_9.field3372) {
                        class137.field1887[i_0][i_1][i_2] |= 0x492;
                     }
                  }

                  if (class253_9.field3382 != 0 && class172_7 != null) {
                     class172_7.method3559(i_1, i_2, i_5, i_4, class253_9.field3368);
                  }

                  if (class253_9.field3374 != 16) {
                     class133_6.method3082(i_0, i_1, i_2, class253_9.field3374);
                  }

               } else if (i_5 == 1) {
                  if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                     obj_23 = class253_9.method4591(1, i_4, ints_16, i_18, i_17, i_19, (byte) -9);
                  } else {
                     obj_23 = new class93(i_3, 1, i_4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                  }

                  class133_6.method3093(i_0, i_1, i_2, i_17, (class135) obj_23, (class135) null, class55.field513[i_4], 0, long_20, i_22);
                  if (class253_9.field3356) {
                     if (i_4 == 0) {
                        class32.field282[i_0][i_1][i_2 + 1] = 50;
                     } else if (i_4 == 1) {
                        class32.field282[i_0][i_1 + 1][i_2 + 1] = 50;
                     } else if (i_4 == 2) {
                        class32.field282[i_0][i_1 + 1][i_2] = 50;
                     } else if (i_4 == 3) {
                        class32.field282[i_0][i_1][i_2] = 50;
                     }
                  }

                  if (class253_9.field3382 != 0 && class172_7 != null) {
                     class172_7.method3559(i_1, i_2, i_5, i_4, class253_9.field3368);
                  }

               } else {
                  int i_29;
                  if (i_5 == 2) {
                     i_29 = i_4 + 1 & 0x3;
                     Object obj_30;
                     Object obj_31;
                     if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                        obj_30 = class253_9.method4591(2, i_4 + 4, ints_16, i_18, i_17, i_19, (byte) -71);
                        obj_31 = class253_9.method4591(2, i_29, ints_16, i_18, i_17, i_19, (byte) 39);
                     } else {
                        obj_30 = new class93(i_3, 2, i_4 + 4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                        obj_31 = new class93(i_3, 2, i_29, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                     }

                     class133_6.method3093(i_0, i_1, i_2, i_17, (class135) obj_30, (class135) obj_31, class55.field512[i_4], class55.field512[i_29], long_20, i_22);
                     if (class253_9.field3372) {
                        if (i_4 == 0) {
                           class137.field1887[i_0][i_1][i_2] |= 0x249;
                           class137.field1887[i_0][i_1][i_2 + 1] |= 0x492;
                        } else if (i_4 == 1) {
                           class137.field1887[i_0][i_1][i_2 + 1] |= 0x492;
                           class137.field1887[i_0][i_1 + 1][i_2] |= 0x249;
                        } else if (i_4 == 2) {
                           class137.field1887[i_0][i_1 + 1][i_2] |= 0x249;
                           class137.field1887[i_0][i_1][i_2] |= 0x492;
                        } else if (i_4 == 3) {
                           class137.field1887[i_0][i_1][i_2] |= 0x492;
                           class137.field1887[i_0][i_1][i_2] |= 0x249;
                        }
                     }

                     if (class253_9.field3382 != 0 && class172_7 != null) {
                        class172_7.method3559(i_1, i_2, i_5, i_4, class253_9.field3368);
                     }

                     if (class253_9.field3374 != 16) {
                        class133_6.method3082(i_0, i_1, i_2, class253_9.field3374);
                     }

                  } else if (i_5 == 3) {
                     if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                        obj_23 = class253_9.method4591(3, i_4, ints_16, i_18, i_17, i_19, (byte) -30);
                     } else {
                        obj_23 = new class93(i_3, 3, i_4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                     }

                     class133_6.method3093(i_0, i_1, i_2, i_17, (class135) obj_23, (class135) null, class55.field513[i_4], 0, long_20, i_22);
                     if (class253_9.field3356) {
                        if (i_4 == 0) {
                           class32.field282[i_0][i_1][i_2 + 1] = 50;
                        } else if (i_4 == 1) {
                           class32.field282[i_0][i_1 + 1][i_2 + 1] = 50;
                        } else if (i_4 == 2) {
                           class32.field282[i_0][i_1 + 1][i_2] = 50;
                        } else if (i_4 == 3) {
                           class32.field282[i_0][i_1][i_2] = 50;
                        }
                     }

                     if (class253_9.field3382 != 0 && class172_7 != null) {
                        class172_7.method3559(i_1, i_2, i_5, i_4, class253_9.field3368);
                     }

                  } else if (i_5 == 9) {
                     if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                        obj_23 = class253_9.method4591(i_5, i_4, ints_16, i_18, i_17, i_19, (byte) -68);
                     } else {
                        obj_23 = new class93(i_3, i_5, i_4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                     }

                     class133_6.method3076(i_0, i_1, i_2, i_17, 1, 1, (class135) obj_23, 0, long_20, i_22);
                     if (class253_9.field3382 != 0 && class172_7 != null) {
                        class172_7.method3560(i_1, i_2, i_10, i_11, class253_9.field3368);
                     }

                     if (class253_9.field3374 != 16) {
                        class133_6.method3082(i_0, i_1, i_2, class253_9.field3374);
                     }

                  } else if (i_5 == 4) {
                     if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                        obj_23 = class253_9.method4591(4, i_4, ints_16, i_18, i_17, i_19, (byte) -59);
                     } else {
                        obj_23 = new class93(i_3, 4, i_4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                     }

                     class133_6.method3142(i_0, i_1, i_2, i_17, (class135) obj_23, (class135) null, class55.field512[i_4], 0, 0, 0, long_20, i_22);
                  } else {
                     long long_32;
                     Object obj_34;
                     if (i_5 == 5) {
                        i_29 = 16;
                        long_32 = class133_6.method3130(i_0, i_1, i_2);
                        if (long_32 != 0L) {
                           i_29 = class128.method2970(GCMonitor.method770(long_32), (short) 4095).field3374;
                        }

                        if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                           obj_34 = class253_9.method4591(4, i_4, ints_16, i_18, i_17, i_19, (byte) -50);
                        } else {
                           obj_34 = new class93(i_3, 4, i_4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                        }

                        class133_6.method3142(i_0, i_1, i_2, i_17, (class135) obj_34, (class135) null, class55.field512[i_4], 0, i_29 * class55.field514[i_4], i_29 * class55.field520[i_4], long_20, i_22);
                     } else if (i_5 == 6) {
                        i_29 = 8;
                        long_32 = class133_6.method3130(i_0, i_1, i_2);
                        if (long_32 != 0L) {
                           i_29 = class128.method2970(GCMonitor.method770(long_32), (short) 4095).field3374 / 2;
                        }

                        if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                           obj_34 = class253_9.method4591(4, i_4 + 4, ints_16, i_18, i_17, i_19, (byte) 45);
                        } else {
                           obj_34 = new class93(i_3, 4, i_4 + 4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                        }

                        class133_6.method3142(i_0, i_1, i_2, i_17, (class135) obj_34, (class135) null, 256, i_4, i_29 * class55.field509[i_4], i_29 * class55.field517[i_4], long_20, i_22);
                     } else if (i_5 == 7) {
                        i_24 = i_4 + 2 & 0x3;
                        if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                           obj_23 = class253_9.method4591(4, i_24 + 4, ints_16, i_18, i_17, i_19, (byte) 42);
                        } else {
                           obj_23 = new class93(i_3, 4, i_24 + 4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                        }

                        class133_6.method3142(i_0, i_1, i_2, i_17, (class135) obj_23, (class135) null, 256, i_24, 0, 0, long_20, i_22);
                     } else if (i_5 == 8) {
                        i_29 = 8;
                        long_32 = class133_6.method3130(i_0, i_1, i_2);
                        if (long_32 != 0L) {
                           i_29 = class128.method2970(GCMonitor.method770(long_32), (short) 4095).field3374 / 2;
                        }

                        int i_28 = i_4 + 2 & 0x3;
                        Object obj_27;
                        if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                           obj_34 = class253_9.method4591(4, i_4 + 4, ints_16, i_18, i_17, i_19, (byte) -12);
                           obj_27 = class253_9.method4591(4, i_28 + 4, ints_16, i_18, i_17, i_19, (byte) -59);
                        } else {
                           obj_34 = new class93(i_3, 4, i_4 + 4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                           obj_27 = new class93(i_3, 4, i_28 + 4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
                        }

                        class133_6.method3142(i_0, i_1, i_2, i_17, (class135) obj_34, (class135) obj_27, 256, i_4, i_29 * class55.field509[i_4], i_29 * class55.field517[i_4], long_20, i_22);
                     }
                  }
               }
            } else {
               if (class253_9.field3373 == -1 && class253_9.field3391 == null) {
                  obj_23 = class253_9.method4591(10, i_4, ints_16, i_18, i_17, i_19, (byte) -18);
               } else {
                  obj_23 = new class93(i_3, 10, i_4, i_0, i_1, i_2, class253_9.field3373, true, (class135) null);
               }

               if (obj_23 != null && class133_6.method3076(i_0, i_1, i_2, i_17, i_10, i_11, (class135) obj_23, i_5 == 11 ? 256 : 0, long_20, i_22) && class253_9.field3356) {
                  i_24 = 15;
                  if (obj_23 instanceof class127) {
                     i_24 = ((class127) obj_23).method2864() / 4;
                     if (i_24 > 30) {
                        i_24 = 30;
                     }
                  }

                  for (int i_25 = 0; i_25 <= i_10; i_25++) {
                     for (int i_26 = 0; i_26 <= i_11; i_26++) {
                        if (i_24 > class32.field282[i_0][i_25 + i_1][i_26 + i_2]) {
                           class32.field282[i_0][i_25 + i_1][i_26 + i_2] = (byte)i_24;
                        }
                     }
                  }
               }

               if (class253_9.field3382 != 0 && class172_7 != null) {
                  class172_7.method3560(i_1, i_2, i_10, i_11, class253_9.field3368);
               }

            }
         }
      }
   }

}
