public class Rasterizer3D extends Rasterizer2D {

   static boolean field1763 = false;
   static boolean field1772 = false;
   static boolean field1771 = false;
   public static boolean field1768 = true;
   static int field1766 = 0;
   public static int field1773 = 512;
   static int[] field1782 = new int[1024];
   public static int[] field1783 = new int[65536];
   static int[] field1785 = new int[512];
   static int[] field1786 = new int[2048];
   public static int[] sine = new int[2048];
   public static int[] cosine = new int[2048];
   static int field1788;
   static int field1776;
   static int field1774;
   static int field1775;
   static int field1778;
   static int field1779;
   static int field1780;
   static int field1777;
   public static class139 field1781;

   static {
      int i_0;
      for (i_0 = 1; i_0 < 512; i_0++) {
         field1785[i_0] = 32768 / i_0;
      }

      for (i_0 = 1; i_0 < 2048; i_0++) {
         field1786[i_0] = 65536 / i_0;
      }

      for (i_0 = 0; i_0 < 2048; i_0++) {
         sine[i_0] = (int)(65536.0D * Math.sin((double)i_0 * 0.0030679615D));
         cosine[i_0] = (int)(65536.0D * Math.cos((double)i_0 * 0.0030679615D));
      }

   }

   static final int method3040(int i_0, int i_1, int i_2, int i_3) {
      return i_0 * i_2 + i_3 * i_1 >> 16;
   }

   static final int method3061(int i_0, int i_1, int i_2, int i_3) {
      return i_2 * i_1 - i_3 * i_0 >> 16;
   }

   static int method2980(int i_0, double d_1) {
      double d_3 = (double)(i_0 >> 16) / 256.0D;
      double d_5 = (double)(i_0 >> 8 & 0xff) / 256.0D;
      double d_7 = (double)(i_0 & 0xff) / 256.0D;
      d_3 = Math.pow(d_3, d_1);
      d_5 = Math.pow(d_5, d_1);
      d_7 = Math.pow(d_7, d_1);
      int i_9 = (int)(d_3 * 256.0D);
      int i_10 = (int)(d_5 * 256.0D);
      int i_11 = (int)(d_7 * 256.0D);
      return i_11 + (i_10 << 8) + (i_9 << 16);
   }

   public static final void method3007(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      int i_7 = 0;
      if (i_0 != i_1) {
         i_7 = (i_4 - i_3 << 14) / (i_1 - i_0);
      }

      int i_8 = 0;
      if (i_2 != i_1) {
         i_8 = (i_5 - i_4 << 14) / (i_2 - i_1);
      }

      int i_9 = 0;
      if (i_0 != i_2) {
         i_9 = (i_3 - i_5 << 14) / (i_0 - i_2);
      }

      if (i_0 <= i_1 && i_0 <= i_2) {
         if (i_0 < field1776) {
            if (i_1 > field1776) {
               i_1 = field1776;
            }

            if (i_2 > field1776) {
               i_2 = field1776;
            }

            if (i_1 < i_2) {
               i_5 = i_3 <<= 14;
               if (i_0 < 0) {
                  i_5 -= i_0 * i_9;
                  i_3 -= i_0 * i_7;
                  i_0 = 0;
               }

               i_4 <<= 14;
               if (i_1 < 0) {
                  i_4 -= i_8 * i_1;
                  i_1 = 0;
               }

               if (i_0 != i_1 && i_9 < i_7 || i_0 == i_1 && i_9 > i_8) {
                  i_2 -= i_1;
                  i_1 -= i_0;
                  i_0 = field1782[i_0];

                  while (true) {
                     --i_1;
                     if (i_1 < 0) {
                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              return;
                           }

                           method2985(Rasterizer2D.Rasterizer2D_pixels, i_0, i_6, 0, i_5 >> 14, i_4 >> 14);
                           i_5 += i_9;
                           i_4 += i_8;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2985(Rasterizer2D.Rasterizer2D_pixels, i_0, i_6, 0, i_5 >> 14, i_3 >> 14);
                     i_5 += i_9;
                     i_3 += i_7;
                     i_0 += Rasterizer2D.Rasterizer2D_width;
                  }
               } else {
                  i_2 -= i_1;
                  i_1 -= i_0;
                  i_0 = field1782[i_0];

                  while (true) {
                     --i_1;
                     if (i_1 < 0) {
                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              return;
                           }

                           method2985(Rasterizer2D.Rasterizer2D_pixels, i_0, i_6, 0, i_4 >> 14, i_5 >> 14);
                           i_5 += i_9;
                           i_4 += i_8;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2985(Rasterizer2D.Rasterizer2D_pixels, i_0, i_6, 0, i_3 >> 14, i_5 >> 14);
                     i_5 += i_9;
                     i_3 += i_7;
                     i_0 += Rasterizer2D.Rasterizer2D_width;
                  }
               }
            } else {
               i_4 = i_3 <<= 14;
               if (i_0 < 0) {
                  i_4 -= i_0 * i_9;
                  i_3 -= i_0 * i_7;
                  i_0 = 0;
               }

               i_5 <<= 14;
               if (i_2 < 0) {
                  i_5 -= i_8 * i_2;
                  i_2 = 0;
               }

               if ((i_0 == i_2 || i_9 >= i_7) && (i_0 != i_2 || i_8 <= i_7)) {
                  i_1 -= i_2;
                  i_2 -= i_0;
                  i_0 = field1782[i_0];

                  while (true) {
                     --i_2;
                     if (i_2 < 0) {
                        while (true) {
                           --i_1;
                           if (i_1 < 0) {
                              return;
                           }

                           method2985(Rasterizer2D.Rasterizer2D_pixels, i_0, i_6, 0, i_3 >> 14, i_5 >> 14);
                           i_5 += i_8;
                           i_3 += i_7;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2985(Rasterizer2D.Rasterizer2D_pixels, i_0, i_6, 0, i_3 >> 14, i_4 >> 14);
                     i_4 += i_9;
                     i_3 += i_7;
                     i_0 += Rasterizer2D.Rasterizer2D_width;
                  }
               } else {
                  i_1 -= i_2;
                  i_2 -= i_0;
                  i_0 = field1782[i_0];

                  while (true) {
                     --i_2;
                     if (i_2 < 0) {
                        while (true) {
                           --i_1;
                           if (i_1 < 0) {
                              return;
                           }

                           method2985(Rasterizer2D.Rasterizer2D_pixels, i_0, i_6, 0, i_5 >> 14, i_3 >> 14);
                           i_5 += i_8;
                           i_3 += i_7;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2985(Rasterizer2D.Rasterizer2D_pixels, i_0, i_6, 0, i_4 >> 14, i_3 >> 14);
                     i_4 += i_9;
                     i_3 += i_7;
                     i_0 += Rasterizer2D.Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (i_1 <= i_2) {
         if (i_1 < field1776) {
            if (i_2 > field1776) {
               i_2 = field1776;
            }

            if (i_0 > field1776) {
               i_0 = field1776;
            }

            if (i_2 < i_0) {
               i_3 = i_4 <<= 14;
               if (i_1 < 0) {
                  i_3 -= i_7 * i_1;
                  i_4 -= i_8 * i_1;
                  i_1 = 0;
               }

               i_5 <<= 14;
               if (i_2 < 0) {
                  i_5 -= i_9 * i_2;
                  i_2 = 0;
               }

               if (i_2 != i_1 && i_7 < i_8 || i_2 == i_1 && i_7 > i_9) {
                  i_0 -= i_2;
                  i_2 -= i_1;
                  i_1 = field1782[i_1];

                  while (true) {
                     --i_2;
                     if (i_2 < 0) {
                        while (true) {
                           --i_0;
                           if (i_0 < 0) {
                              return;
                           }

                           method2985(Rasterizer2D.Rasterizer2D_pixels, i_1, i_6, 0, i_3 >> 14, i_5 >> 14);
                           i_3 += i_7;
                           i_5 += i_9;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2985(Rasterizer2D.Rasterizer2D_pixels, i_1, i_6, 0, i_3 >> 14, i_4 >> 14);
                     i_3 += i_7;
                     i_4 += i_8;
                     i_1 += Rasterizer2D.Rasterizer2D_width;
                  }
               } else {
                  i_0 -= i_2;
                  i_2 -= i_1;
                  i_1 = field1782[i_1];

                  while (true) {
                     --i_2;
                     if (i_2 < 0) {
                        while (true) {
                           --i_0;
                           if (i_0 < 0) {
                              return;
                           }

                           method2985(Rasterizer2D.Rasterizer2D_pixels, i_1, i_6, 0, i_5 >> 14, i_3 >> 14);
                           i_3 += i_7;
                           i_5 += i_9;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2985(Rasterizer2D.Rasterizer2D_pixels, i_1, i_6, 0, i_4 >> 14, i_3 >> 14);
                     i_3 += i_7;
                     i_4 += i_8;
                     i_1 += Rasterizer2D.Rasterizer2D_width;
                  }
               }
            } else {
               i_5 = i_4 <<= 14;
               if (i_1 < 0) {
                  i_5 -= i_7 * i_1;
                  i_4 -= i_8 * i_1;
                  i_1 = 0;
               }

               i_3 <<= 14;
               if (i_0 < 0) {
                  i_3 -= i_0 * i_9;
                  i_0 = 0;
               }

               if (i_7 < i_8) {
                  i_2 -= i_0;
                  i_0 -= i_1;
                  i_1 = field1782[i_1];

                  while (true) {
                     --i_0;
                     if (i_0 < 0) {
                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              return;
                           }

                           method2985(Rasterizer2D.Rasterizer2D_pixels, i_1, i_6, 0, i_3 >> 14, i_4 >> 14);
                           i_3 += i_9;
                           i_4 += i_8;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2985(Rasterizer2D.Rasterizer2D_pixels, i_1, i_6, 0, i_5 >> 14, i_4 >> 14);
                     i_5 += i_7;
                     i_4 += i_8;
                     i_1 += Rasterizer2D.Rasterizer2D_width;
                  }
               } else {
                  i_2 -= i_0;
                  i_0 -= i_1;
                  i_1 = field1782[i_1];

                  while (true) {
                     --i_0;
                     if (i_0 < 0) {
                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              return;
                           }

                           method2985(Rasterizer2D.Rasterizer2D_pixels, i_1, i_6, 0, i_4 >> 14, i_3 >> 14);
                           i_3 += i_9;
                           i_4 += i_8;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2985(Rasterizer2D.Rasterizer2D_pixels, i_1, i_6, 0, i_4 >> 14, i_5 >> 14);
                     i_5 += i_7;
                     i_4 += i_8;
                     i_1 += Rasterizer2D.Rasterizer2D_width;
                  }
               }
            }
         }
      } else if (i_2 < field1776) {
         if (i_0 > field1776) {
            i_0 = field1776;
         }

         if (i_1 > field1776) {
            i_1 = field1776;
         }

         if (i_0 < i_1) {
            i_4 = i_5 <<= 14;
            if (i_2 < 0) {
               i_4 -= i_8 * i_2;
               i_5 -= i_9 * i_2;
               i_2 = 0;
            }

            i_3 <<= 14;
            if (i_0 < 0) {
               i_3 -= i_0 * i_7;
               i_0 = 0;
            }

            if (i_8 < i_9) {
               i_1 -= i_0;
               i_0 -= i_2;
               i_2 = field1782[i_2];

               while (true) {
                  --i_0;
                  if (i_0 < 0) {
                     while (true) {
                        --i_1;
                        if (i_1 < 0) {
                           return;
                        }

                        method2985(Rasterizer2D.Rasterizer2D_pixels, i_2, i_6, 0, i_4 >> 14, i_3 >> 14);
                        i_4 += i_8;
                        i_3 += i_7;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                     }
                  }

                  method2985(Rasterizer2D.Rasterizer2D_pixels, i_2, i_6, 0, i_4 >> 14, i_5 >> 14);
                  i_4 += i_8;
                  i_5 += i_9;
                  i_2 += Rasterizer2D.Rasterizer2D_width;
               }
            } else {
               i_1 -= i_0;
               i_0 -= i_2;
               i_2 = field1782[i_2];

               while (true) {
                  --i_0;
                  if (i_0 < 0) {
                     while (true) {
                        --i_1;
                        if (i_1 < 0) {
                           return;
                        }

                        method2985(Rasterizer2D.Rasterizer2D_pixels, i_2, i_6, 0, i_3 >> 14, i_4 >> 14);
                        i_4 += i_8;
                        i_3 += i_7;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                     }
                  }

                  method2985(Rasterizer2D.Rasterizer2D_pixels, i_2, i_6, 0, i_5 >> 14, i_4 >> 14);
                  i_4 += i_8;
                  i_5 += i_9;
                  i_2 += Rasterizer2D.Rasterizer2D_width;
               }
            }
         } else {
            i_3 = i_5 <<= 14;
            if (i_2 < 0) {
               i_3 -= i_8 * i_2;
               i_5 -= i_9 * i_2;
               i_2 = 0;
            }

            i_4 <<= 14;
            if (i_1 < 0) {
               i_4 -= i_7 * i_1;
               i_1 = 0;
            }

            if (i_8 < i_9) {
               i_0 -= i_1;
               i_1 -= i_2;
               i_2 = field1782[i_2];

               while (true) {
                  --i_1;
                  if (i_1 < 0) {
                     while (true) {
                        --i_0;
                        if (i_0 < 0) {
                           return;
                        }

                        method2985(Rasterizer2D.Rasterizer2D_pixels, i_2, i_6, 0, i_4 >> 14, i_5 >> 14);
                        i_4 += i_7;
                        i_5 += i_9;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                     }
                  }

                  method2985(Rasterizer2D.Rasterizer2D_pixels, i_2, i_6, 0, i_3 >> 14, i_5 >> 14);
                  i_3 += i_8;
                  i_5 += i_9;
                  i_2 += Rasterizer2D.Rasterizer2D_width;
               }
            } else {
               i_0 -= i_1;
               i_1 -= i_2;
               i_2 = field1782[i_2];

               while (true) {
                  --i_1;
                  if (i_1 < 0) {
                     while (true) {
                        --i_0;
                        if (i_0 < 0) {
                           return;
                        }

                        method2985(Rasterizer2D.Rasterizer2D_pixels, i_2, i_6, 0, i_5 >> 14, i_4 >> 14);
                        i_4 += i_7;
                        i_5 += i_9;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                     }
                  }

                  method2985(Rasterizer2D.Rasterizer2D_pixels, i_2, i_6, 0, i_5 >> 14, i_3 >> 14);
                  i_3 += i_8;
                  i_5 += i_9;
                  i_2 += Rasterizer2D.Rasterizer2D_width;
               }
            }
         }
      }
   }

   static final void method3020(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
      int i_9 = i_4 - i_3;
      int i_10 = i_1 - i_0;
      int i_11 = i_5 - i_3;
      int i_12 = i_2 - i_0;
      int i_13 = i_7 - i_6;
      int i_14 = i_8 - i_6;
      int i_15;
      if (i_2 != i_1) {
         i_15 = (i_5 - i_4 << 14) / (i_2 - i_1);
      } else {
         i_15 = 0;
      }

      int i_16;
      if (i_0 != i_1) {
         i_16 = (i_9 << 14) / i_10;
      } else {
         i_16 = 0;
      }

      int i_17;
      if (i_0 != i_2) {
         i_17 = (i_11 << 14) / i_12;
      } else {
         i_17 = 0;
      }

      int i_18 = i_9 * i_12 - i_11 * i_10;
      if (i_18 != 0) {
         int i_19 = (i_13 * i_12 - i_14 * i_10 << 8) / i_18;
         int i_20 = (i_14 * i_9 - i_13 * i_11 << 8) / i_18;
         if (i_0 <= i_1 && i_0 <= i_2) {
            if (i_0 < field1776) {
               if (i_1 > field1776) {
                  i_1 = field1776;
               }

               if (i_2 > field1776) {
                  i_2 = field1776;
               }

               i_6 = i_19 + ((i_6 << 8) - i_3 * i_19);
               if (i_1 < i_2) {
                  i_5 = i_3 <<= 14;
                  if (i_0 < 0) {
                     i_5 -= i_0 * i_17;
                     i_3 -= i_0 * i_16;
                     i_6 -= i_0 * i_20;
                     i_0 = 0;
                  }

                  i_4 <<= 14;
                  if (i_1 < 0) {
                     i_4 -= i_15 * i_1;
                     i_1 = 0;
                  }

                  if ((i_0 == i_1 || i_17 >= i_16) && (i_0 != i_1 || i_17 <= i_15)) {
                     i_2 -= i_1;
                     i_1 -= i_0;
                     i_0 = field1782[i_0];

                     while (true) {
                        --i_1;
                        if (i_1 < 0) {
                           while (true) {
                              --i_2;
                              if (i_2 < 0) {
                                 return;
                              }

                              method2977(Rasterizer2D.Rasterizer2D_pixels, i_0, 0, 0, i_4 >> 14, i_5 >> 14, i_6, i_19);
                              i_5 += i_17;
                              i_4 += i_15;
                              i_6 += i_20;
                              i_0 += Rasterizer2D.Rasterizer2D_width;
                           }
                        }

                        method2977(Rasterizer2D.Rasterizer2D_pixels, i_0, 0, 0, i_3 >> 14, i_5 >> 14, i_6, i_19);
                        i_5 += i_17;
                        i_3 += i_16;
                        i_6 += i_20;
                        i_0 += Rasterizer2D.Rasterizer2D_width;
                     }
                  } else {
                     i_2 -= i_1;
                     i_1 -= i_0;
                     i_0 = field1782[i_0];

                     while (true) {
                        --i_1;
                        if (i_1 < 0) {
                           while (true) {
                              --i_2;
                              if (i_2 < 0) {
                                 return;
                              }

                              method2977(Rasterizer2D.Rasterizer2D_pixels, i_0, 0, 0, i_5 >> 14, i_4 >> 14, i_6, i_19);
                              i_5 += i_17;
                              i_4 += i_15;
                              i_6 += i_20;
                              i_0 += Rasterizer2D.Rasterizer2D_width;
                           }
                        }

                        method2977(Rasterizer2D.Rasterizer2D_pixels, i_0, 0, 0, i_5 >> 14, i_3 >> 14, i_6, i_19);
                        i_5 += i_17;
                        i_3 += i_16;
                        i_6 += i_20;
                        i_0 += Rasterizer2D.Rasterizer2D_width;
                     }
                  }
               } else {
                  i_4 = i_3 <<= 14;
                  if (i_0 < 0) {
                     i_4 -= i_0 * i_17;
                     i_3 -= i_0 * i_16;
                     i_6 -= i_0 * i_20;
                     i_0 = 0;
                  }

                  i_5 <<= 14;
                  if (i_2 < 0) {
                     i_5 -= i_15 * i_2;
                     i_2 = 0;
                  }

                  if (i_0 != i_2 && i_17 < i_16 || i_0 == i_2 && i_15 > i_16) {
                     i_1 -= i_2;
                     i_2 -= i_0;
                     i_0 = field1782[i_0];

                     while (true) {
                        --i_2;
                        if (i_2 < 0) {
                           while (true) {
                              --i_1;
                              if (i_1 < 0) {
                                 return;
                              }

                              method2977(Rasterizer2D.Rasterizer2D_pixels, i_0, 0, 0, i_5 >> 14, i_3 >> 14, i_6, i_19);
                              i_5 += i_15;
                              i_3 += i_16;
                              i_6 += i_20;
                              i_0 += Rasterizer2D.Rasterizer2D_width;
                           }
                        }

                        method2977(Rasterizer2D.Rasterizer2D_pixels, i_0, 0, 0, i_4 >> 14, i_3 >> 14, i_6, i_19);
                        i_4 += i_17;
                        i_3 += i_16;
                        i_6 += i_20;
                        i_0 += Rasterizer2D.Rasterizer2D_width;
                     }
                  } else {
                     i_1 -= i_2;
                     i_2 -= i_0;
                     i_0 = field1782[i_0];

                     while (true) {
                        --i_2;
                        if (i_2 < 0) {
                           while (true) {
                              --i_1;
                              if (i_1 < 0) {
                                 return;
                              }

                              method2977(Rasterizer2D.Rasterizer2D_pixels, i_0, 0, 0, i_3 >> 14, i_5 >> 14, i_6, i_19);
                              i_5 += i_15;
                              i_3 += i_16;
                              i_6 += i_20;
                              i_0 += Rasterizer2D.Rasterizer2D_width;
                           }
                        }

                        method2977(Rasterizer2D.Rasterizer2D_pixels, i_0, 0, 0, i_3 >> 14, i_4 >> 14, i_6, i_19);
                        i_4 += i_17;
                        i_3 += i_16;
                        i_6 += i_20;
                        i_0 += Rasterizer2D.Rasterizer2D_width;
                     }
                  }
               }
            }
         } else if (i_1 <= i_2) {
            if (i_1 < field1776) {
               if (i_2 > field1776) {
                  i_2 = field1776;
               }

               if (i_0 > field1776) {
                  i_0 = field1776;
               }

               i_7 = i_19 + ((i_7 << 8) - i_19 * i_4);
               if (i_2 < i_0) {
                  i_3 = i_4 <<= 14;
                  if (i_1 < 0) {
                     i_3 -= i_16 * i_1;
                     i_4 -= i_15 * i_1;
                     i_7 -= i_20 * i_1;
                     i_1 = 0;
                  }

                  i_5 <<= 14;
                  if (i_2 < 0) {
                     i_5 -= i_17 * i_2;
                     i_2 = 0;
                  }

                  if ((i_2 == i_1 || i_16 >= i_15) && (i_2 != i_1 || i_16 <= i_17)) {
                     i_0 -= i_2;
                     i_2 -= i_1;
                     i_1 = field1782[i_1];

                     while (true) {
                        --i_2;
                        if (i_2 < 0) {
                           while (true) {
                              --i_0;
                              if (i_0 < 0) {
                                 return;
                              }

                              method2977(Rasterizer2D.Rasterizer2D_pixels, i_1, 0, 0, i_5 >> 14, i_3 >> 14, i_7, i_19);
                              i_3 += i_16;
                              i_5 += i_17;
                              i_7 += i_20;
                              i_1 += Rasterizer2D.Rasterizer2D_width;
                           }
                        }

                        method2977(Rasterizer2D.Rasterizer2D_pixels, i_1, 0, 0, i_4 >> 14, i_3 >> 14, i_7, i_19);
                        i_3 += i_16;
                        i_4 += i_15;
                        i_7 += i_20;
                        i_1 += Rasterizer2D.Rasterizer2D_width;
                     }
                  } else {
                     i_0 -= i_2;
                     i_2 -= i_1;
                     i_1 = field1782[i_1];

                     while (true) {
                        --i_2;
                        if (i_2 < 0) {
                           while (true) {
                              --i_0;
                              if (i_0 < 0) {
                                 return;
                              }

                              method2977(Rasterizer2D.Rasterizer2D_pixels, i_1, 0, 0, i_3 >> 14, i_5 >> 14, i_7, i_19);
                              i_3 += i_16;
                              i_5 += i_17;
                              i_7 += i_20;
                              i_1 += Rasterizer2D.Rasterizer2D_width;
                           }
                        }

                        method2977(Rasterizer2D.Rasterizer2D_pixels, i_1, 0, 0, i_3 >> 14, i_4 >> 14, i_7, i_19);
                        i_3 += i_16;
                        i_4 += i_15;
                        i_7 += i_20;
                        i_1 += Rasterizer2D.Rasterizer2D_width;
                     }
                  }
               } else {
                  i_5 = i_4 <<= 14;
                  if (i_1 < 0) {
                     i_5 -= i_16 * i_1;
                     i_4 -= i_15 * i_1;
                     i_7 -= i_20 * i_1;
                     i_1 = 0;
                  }

                  i_3 <<= 14;
                  if (i_0 < 0) {
                     i_3 -= i_0 * i_17;
                     i_0 = 0;
                  }

                  if (i_16 < i_15) {
                     i_2 -= i_0;
                     i_0 -= i_1;
                     i_1 = field1782[i_1];

                     while (true) {
                        --i_0;
                        if (i_0 < 0) {
                           while (true) {
                              --i_2;
                              if (i_2 < 0) {
                                 return;
                              }

                              method2977(Rasterizer2D.Rasterizer2D_pixels, i_1, 0, 0, i_3 >> 14, i_4 >> 14, i_7, i_19);
                              i_3 += i_17;
                              i_4 += i_15;
                              i_7 += i_20;
                              i_1 += Rasterizer2D.Rasterizer2D_width;
                           }
                        }

                        method2977(Rasterizer2D.Rasterizer2D_pixels, i_1, 0, 0, i_5 >> 14, i_4 >> 14, i_7, i_19);
                        i_5 += i_16;
                        i_4 += i_15;
                        i_7 += i_20;
                        i_1 += Rasterizer2D.Rasterizer2D_width;
                     }
                  } else {
                     i_2 -= i_0;
                     i_0 -= i_1;
                     i_1 = field1782[i_1];

                     while (true) {
                        --i_0;
                        if (i_0 < 0) {
                           while (true) {
                              --i_2;
                              if (i_2 < 0) {
                                 return;
                              }

                              method2977(Rasterizer2D.Rasterizer2D_pixels, i_1, 0, 0, i_4 >> 14, i_3 >> 14, i_7, i_19);
                              i_3 += i_17;
                              i_4 += i_15;
                              i_7 += i_20;
                              i_1 += Rasterizer2D.Rasterizer2D_width;
                           }
                        }

                        method2977(Rasterizer2D.Rasterizer2D_pixels, i_1, 0, 0, i_4 >> 14, i_5 >> 14, i_7, i_19);
                        i_5 += i_16;
                        i_4 += i_15;
                        i_7 += i_20;
                        i_1 += Rasterizer2D.Rasterizer2D_width;
                     }
                  }
               }
            }
         } else if (i_2 < field1776) {
            if (i_0 > field1776) {
               i_0 = field1776;
            }

            if (i_1 > field1776) {
               i_1 = field1776;
            }

            i_8 = i_19 + ((i_8 << 8) - i_5 * i_19);
            if (i_0 < i_1) {
               i_4 = i_5 <<= 14;
               if (i_2 < 0) {
                  i_4 -= i_15 * i_2;
                  i_5 -= i_17 * i_2;
                  i_8 -= i_20 * i_2;
                  i_2 = 0;
               }

               i_3 <<= 14;
               if (i_0 < 0) {
                  i_3 -= i_0 * i_16;
                  i_0 = 0;
               }

               if (i_15 < i_17) {
                  i_1 -= i_0;
                  i_0 -= i_2;
                  i_2 = field1782[i_2];

                  while (true) {
                     --i_0;
                     if (i_0 < 0) {
                        while (true) {
                           --i_1;
                           if (i_1 < 0) {
                              return;
                           }

                           method2977(Rasterizer2D.Rasterizer2D_pixels, i_2, 0, 0, i_4 >> 14, i_3 >> 14, i_8, i_19);
                           i_4 += i_15;
                           i_3 += i_16;
                           i_8 += i_20;
                           i_2 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2977(Rasterizer2D.Rasterizer2D_pixels, i_2, 0, 0, i_4 >> 14, i_5 >> 14, i_8, i_19);
                     i_4 += i_15;
                     i_5 += i_17;
                     i_8 += i_20;
                     i_2 += Rasterizer2D.Rasterizer2D_width;
                  }
               } else {
                  i_1 -= i_0;
                  i_0 -= i_2;
                  i_2 = field1782[i_2];

                  while (true) {
                     --i_0;
                     if (i_0 < 0) {
                        while (true) {
                           --i_1;
                           if (i_1 < 0) {
                              return;
                           }

                           method2977(Rasterizer2D.Rasterizer2D_pixels, i_2, 0, 0, i_3 >> 14, i_4 >> 14, i_8, i_19);
                           i_4 += i_15;
                           i_3 += i_16;
                           i_8 += i_20;
                           i_2 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2977(Rasterizer2D.Rasterizer2D_pixels, i_2, 0, 0, i_5 >> 14, i_4 >> 14, i_8, i_19);
                     i_4 += i_15;
                     i_5 += i_17;
                     i_8 += i_20;
                     i_2 += Rasterizer2D.Rasterizer2D_width;
                  }
               }
            } else {
               i_3 = i_5 <<= 14;
               if (i_2 < 0) {
                  i_3 -= i_15 * i_2;
                  i_5 -= i_17 * i_2;
                  i_8 -= i_20 * i_2;
                  i_2 = 0;
               }

               i_4 <<= 14;
               if (i_1 < 0) {
                  i_4 -= i_16 * i_1;
                  i_1 = 0;
               }

               if (i_15 < i_17) {
                  i_0 -= i_1;
                  i_1 -= i_2;
                  i_2 = field1782[i_2];

                  while (true) {
                     --i_1;
                     if (i_1 < 0) {
                        while (true) {
                           --i_0;
                           if (i_0 < 0) {
                              return;
                           }

                           method2977(Rasterizer2D.Rasterizer2D_pixels, i_2, 0, 0, i_4 >> 14, i_5 >> 14, i_8, i_19);
                           i_4 += i_16;
                           i_5 += i_17;
                           i_8 += i_20;
                           i_2 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2977(Rasterizer2D.Rasterizer2D_pixels, i_2, 0, 0, i_3 >> 14, i_5 >> 14, i_8, i_19);
                     i_3 += i_15;
                     i_5 += i_17;
                     i_8 += i_20;
                     i_2 += Rasterizer2D.Rasterizer2D_width;
                  }
               } else {
                  i_0 -= i_1;
                  i_1 -= i_2;
                  i_2 = field1782[i_2];

                  while (true) {
                     --i_1;
                     if (i_1 < 0) {
                        while (true) {
                           --i_0;
                           if (i_0 < 0) {
                              return;
                           }

                           method2977(Rasterizer2D.Rasterizer2D_pixels, i_2, 0, 0, i_5 >> 14, i_4 >> 14, i_8, i_19);
                           i_4 += i_16;
                           i_5 += i_17;
                           i_8 += i_20;
                           i_2 += Rasterizer2D.Rasterizer2D_width;
                        }
                     }

                     method2977(Rasterizer2D.Rasterizer2D_pixels, i_2, 0, 0, i_5 >> 14, i_3 >> 14, i_8, i_19);
                     i_3 += i_15;
                     i_5 += i_17;
                     i_8 += i_20;
                     i_2 += Rasterizer2D.Rasterizer2D_width;
                  }
               }
            }
         }
      }
   }

   public static final void method3051() {
      method2975(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd);
   }

   static final void method2975(int i_0, int i_1, int i_2, int i_3) {
      field1788 = i_2 - i_0;
      field1776 = i_3 - i_1;
      method2973();
      int i_4;
      int i_5;
      if (field1782.length < field1776) {
         i_5 = field1776;
         --i_5;
         i_5 |= i_5 >>> 1;
         i_5 |= i_5 >>> 2;
         i_5 |= i_5 >>> 4;
         i_5 |= i_5 >>> 8;
         i_5 |= i_5 >>> 16;
         i_4 = i_5 + 1;
         field1782 = new int[i_4];
      }

      i_4 = i_0 + Rasterizer2D.Rasterizer2D_width * i_1;

      for (i_5 = 0; i_5 < field1776; i_5++) {
         field1782[i_5] = i_4;
         i_4 += Rasterizer2D.Rasterizer2D_width;
      }

   }

   public static final void method2973() {
      field1774 = field1788 / 2;
      field1775 = field1776 / 2;
      field1778 = -field1774;
      field1779 = field1788 - field1774;
      field1780 = -field1775;
      field1777 = field1776 - field1775;
   }

   static final void method2986(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, int i_17, int i_18) {
      int[] ints_19 = field1781.vmethod3287(i_18, 726289343);
      int i_20;
      if (ints_19 == null) {
         i_20 = field1781.vmethod3284(i_18, 1459696088);
         method3020(i_0, i_1, i_2, i_3, i_4, i_5, method3045(i_20, i_6), method3045(i_20, i_7), method3045(i_20, i_8));
      } else {
         field1771 = field1781.vmethod3279(i_18, (byte) 0);
         field1772 = field1781.vmethod3278(i_18, (byte) 100);
         i_20 = i_4 - i_3;
         int i_21 = i_1 - i_0;
         int i_22 = i_5 - i_3;
         int i_23 = i_2 - i_0;
         int i_24 = i_7 - i_6;
         int i_25 = i_8 - i_6;
         int i_26 = 0;
         if (i_0 != i_1) {
            i_26 = (i_4 - i_3 << 14) / (i_1 - i_0);
         }

         int i_27 = 0;
         if (i_2 != i_1) {
            i_27 = (i_5 - i_4 << 14) / (i_2 - i_1);
         }

         int i_28 = 0;
         if (i_0 != i_2) {
            i_28 = (i_3 - i_5 << 14) / (i_0 - i_2);
         }

         int i_29 = i_20 * i_23 - i_22 * i_21;
         if (i_29 != 0) {
            int i_30 = (i_24 * i_23 - i_25 * i_21 << 9) / i_29;
            int i_31 = (i_25 * i_20 - i_24 * i_22 << 9) / i_29;
            i_10 = i_9 - i_10;
            i_13 = i_12 - i_13;
            i_16 = i_15 - i_16;
            i_11 -= i_9;
            i_14 -= i_12;
            i_17 -= i_15;
            int i_32 = i_11 * i_12 - i_9 * i_14 << 14;
            int i_33 = (int)(((long)(i_15 * i_14 - i_17 * i_12) << 3 << 14) / (long)field1773);
            int i_34 = (int)(((long)(i_17 * i_9 - i_11 * i_15) << 14) / (long)field1773);
            int i_35 = i_10 * i_12 - i_13 * i_9 << 14;
            int i_36 = (int)(((long)(i_13 * i_15 - i_16 * i_12) << 3 << 14) / (long)field1773);
            int i_37 = (int)(((long)(i_16 * i_9 - i_10 * i_15) << 14) / (long)field1773);
            int i_38 = i_13 * i_11 - i_10 * i_14 << 14;
            int i_39 = (int)(((long)(i_16 * i_14 - i_13 * i_17) << 3 << 14) / (long)field1773);
            int i_40 = (int)(((long)(i_17 * i_10 - i_11 * i_16) << 14) / (long)field1773);
            int i_41;
            if (i_0 <= i_1 && i_0 <= i_2) {
               if (i_0 < field1776) {
                  if (i_1 > field1776) {
                     i_1 = field1776;
                  }

                  if (i_2 > field1776) {
                     i_2 = field1776;
                  }

                  i_6 = i_30 + ((i_6 << 9) - i_3 * i_30);
                  if (i_1 < i_2) {
                     i_5 = i_3 <<= 14;
                     if (i_0 < 0) {
                        i_5 -= i_0 * i_28;
                        i_3 -= i_0 * i_26;
                        i_6 -= i_0 * i_31;
                        i_0 = 0;
                     }

                     i_4 <<= 14;
                     if (i_1 < 0) {
                        i_4 -= i_27 * i_1;
                        i_1 = 0;
                     }

                     i_41 = i_0 - field1775;
                     i_32 += i_34 * i_41;
                     i_35 += i_37 * i_41;
                     i_38 += i_40 * i_41;
                     if (i_0 != i_1 && i_28 < i_26 || i_0 == i_1 && i_28 > i_27) {
                        i_2 -= i_1;
                        i_1 -= i_0;
                        i_0 = field1782[i_0];

                        while (true) {
                           --i_1;
                           if (i_1 < 0) {
                              while (true) {
                                 --i_2;
                                 if (i_2 < 0) {
                                    return;
                                 }

                                 method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_5 >> 14, i_4 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_5 += i_28;
                                 i_4 += i_27;
                                 i_6 += i_31;
                                 i_0 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_5 += i_28;
                           i_3 += i_26;
                           i_6 += i_31;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     } else {
                        i_2 -= i_1;
                        i_1 -= i_0;
                        i_0 = field1782[i_0];

                        while (true) {
                           --i_1;
                           if (i_1 < 0) {
                              while (true) {
                                 --i_2;
                                 if (i_2 < 0) {
                                    return;
                                 }

                                 method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_4 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_5 += i_28;
                                 i_4 += i_27;
                                 i_6 += i_31;
                                 i_0 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_5 += i_28;
                           i_3 += i_26;
                           i_6 += i_31;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     }
                  } else {
                     i_4 = i_3 <<= 14;
                     if (i_0 < 0) {
                        i_4 -= i_0 * i_28;
                        i_3 -= i_0 * i_26;
                        i_6 -= i_0 * i_31;
                        i_0 = 0;
                     }

                     i_5 <<= 14;
                     if (i_2 < 0) {
                        i_5 -= i_27 * i_2;
                        i_2 = 0;
                     }

                     i_41 = i_0 - field1775;
                     i_32 += i_34 * i_41;
                     i_35 += i_37 * i_41;
                     i_38 += i_40 * i_41;
                     if (i_0 != i_2 && i_28 < i_26 || i_0 == i_2 && i_27 > i_26) {
                        i_1 -= i_2;
                        i_2 -= i_0;
                        i_0 = field1782[i_0];

                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              while (true) {
                                 --i_1;
                                 if (i_1 < 0) {
                                    return;
                                 }

                                 method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_5 += i_27;
                                 i_3 += i_26;
                                 i_6 += i_31;
                                 i_0 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_4 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_4 += i_28;
                           i_3 += i_26;
                           i_6 += i_31;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     } else {
                        i_1 -= i_2;
                        i_2 -= i_0;
                        i_0 = field1782[i_0];

                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              while (true) {
                                 --i_1;
                                 if (i_1 < 0) {
                                    return;
                                 }

                                 method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_5 += i_27;
                                 i_3 += i_26;
                                 i_6 += i_31;
                                 i_0 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_3 >> 14, i_4 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_4 += i_28;
                           i_3 += i_26;
                           i_6 += i_31;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     }
                  }
               }
            } else if (i_1 <= i_2) {
               if (i_1 < field1776) {
                  if (i_2 > field1776) {
                     i_2 = field1776;
                  }

                  if (i_0 > field1776) {
                     i_0 = field1776;
                  }

                  i_7 = i_30 + ((i_7 << 9) - i_30 * i_4);
                  if (i_2 < i_0) {
                     i_3 = i_4 <<= 14;
                     if (i_1 < 0) {
                        i_3 -= i_26 * i_1;
                        i_4 -= i_27 * i_1;
                        i_7 -= i_31 * i_1;
                        i_1 = 0;
                     }

                     i_5 <<= 14;
                     if (i_2 < 0) {
                        i_5 -= i_28 * i_2;
                        i_2 = 0;
                     }

                     i_41 = i_1 - field1775;
                     i_32 += i_34 * i_41;
                     i_35 += i_37 * i_41;
                     i_38 += i_40 * i_41;
                     if (i_2 != i_1 && i_26 < i_27 || i_2 == i_1 && i_26 > i_28) {
                        i_0 -= i_2;
                        i_2 -= i_1;
                        i_1 = field1782[i_1];

                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              while (true) {
                                 --i_0;
                                 if (i_0 < 0) {
                                    return;
                                 }

                                 method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_3 >> 14, i_5 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_3 += i_26;
                                 i_5 += i_28;
                                 i_7 += i_31;
                                 i_1 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_3 += i_26;
                           i_4 += i_27;
                           i_7 += i_31;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     } else {
                        i_0 -= i_2;
                        i_2 -= i_1;
                        i_1 = field1782[i_1];

                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              while (true) {
                                 --i_0;
                                 if (i_0 < 0) {
                                    return;
                                 }

                                 method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_5 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_3 += i_26;
                                 i_5 += i_28;
                                 i_7 += i_31;
                                 i_1 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_3 += i_26;
                           i_4 += i_27;
                           i_7 += i_31;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     }
                  } else {
                     i_5 = i_4 <<= 14;
                     if (i_1 < 0) {
                        i_5 -= i_26 * i_1;
                        i_4 -= i_27 * i_1;
                        i_7 -= i_31 * i_1;
                        i_1 = 0;
                     }

                     i_3 <<= 14;
                     if (i_0 < 0) {
                        i_3 -= i_0 * i_28;
                        i_0 = 0;
                     }

                     i_41 = i_1 - field1775;
                     i_32 += i_34 * i_41;
                     i_35 += i_37 * i_41;
                     i_38 += i_40 * i_41;
                     if (i_26 < i_27) {
                        i_2 -= i_0;
                        i_0 -= i_1;
                        i_1 = field1782[i_1];

                        while (true) {
                           --i_0;
                           if (i_0 < 0) {
                              while (true) {
                                 --i_2;
                                 if (i_2 < 0) {
                                    return;
                                 }

                                 method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_3 += i_28;
                                 i_4 += i_27;
                                 i_7 += i_31;
                                 i_1 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_5 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_5 += i_26;
                           i_4 += i_27;
                           i_7 += i_31;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     } else {
                        i_2 -= i_0;
                        i_0 -= i_1;
                        i_1 = field1782[i_1];

                        while (true) {
                           --i_0;
                           if (i_0 < 0) {
                              while (true) {
                                 --i_2;
                                 if (i_2 < 0) {
                                    return;
                                 }

                                 method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_3 += i_28;
                                 i_4 += i_27;
                                 i_7 += i_31;
                                 i_1 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_4 >> 14, i_5 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_5 += i_26;
                           i_4 += i_27;
                           i_7 += i_31;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     }
                  }
               }
            } else if (i_2 < field1776) {
               if (i_0 > field1776) {
                  i_0 = field1776;
               }

               if (i_1 > field1776) {
                  i_1 = field1776;
               }

               i_8 = (i_8 << 9) - i_5 * i_30 + i_30;
               if (i_0 < i_1) {
                  i_4 = i_5 <<= 14;
                  if (i_2 < 0) {
                     i_4 -= i_27 * i_2;
                     i_5 -= i_28 * i_2;
                     i_8 -= i_31 * i_2;
                     i_2 = 0;
                  }

                  i_3 <<= 14;
                  if (i_0 < 0) {
                     i_3 -= i_0 * i_26;
                     i_0 = 0;
                  }

                  i_41 = i_2 - field1775;
                  i_32 += i_34 * i_41;
                  i_35 += i_37 * i_41;
                  i_38 += i_40 * i_41;
                  if (i_27 < i_28) {
                     i_1 -= i_0;
                     i_0 -= i_2;
                     i_2 = field1782[i_2];

                     while (true) {
                        --i_0;
                        if (i_0 < 0) {
                           while (true) {
                              --i_1;
                              if (i_1 < 0) {
                                 return;
                              }

                              method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_4 >> 14, i_3 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                              i_4 += i_27;
                              i_3 += i_26;
                              i_8 += i_31;
                              i_2 += Rasterizer2D.Rasterizer2D_width;
                              i_32 += i_34;
                              i_35 += i_37;
                              i_38 += i_40;
                           }
                        }

                        method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                        i_4 += i_27;
                        i_5 += i_28;
                        i_8 += i_31;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                        i_32 += i_34;
                        i_35 += i_37;
                        i_38 += i_40;
                     }
                  } else {
                     i_1 -= i_0;
                     i_0 -= i_2;
                     i_2 = field1782[i_2];

                     while (true) {
                        --i_0;
                        if (i_0 < 0) {
                           while (true) {
                              --i_1;
                              if (i_1 < 0) {
                                 return;
                              }

                              method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_3 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                              i_4 += i_27;
                              i_3 += i_26;
                              i_8 += i_31;
                              i_2 += Rasterizer2D.Rasterizer2D_width;
                              i_32 += i_34;
                              i_35 += i_37;
                              i_38 += i_40;
                           }
                        }

                        method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                        i_4 += i_27;
                        i_5 += i_28;
                        i_8 += i_31;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                        i_32 += i_34;
                        i_35 += i_37;
                        i_38 += i_40;
                     }
                  }
               } else {
                  i_3 = i_5 <<= 14;
                  if (i_2 < 0) {
                     i_3 -= i_27 * i_2;
                     i_5 -= i_28 * i_2;
                     i_8 -= i_31 * i_2;
                     i_2 = 0;
                  }

                  i_4 <<= 14;
                  if (i_1 < 0) {
                     i_4 -= i_26 * i_1;
                     i_1 = 0;
                  }

                  i_41 = i_2 - field1775;
                  i_32 += i_34 * i_41;
                  i_35 += i_37 * i_41;
                  i_38 += i_40 * i_41;
                  if (i_27 < i_28) {
                     i_0 -= i_1;
                     i_1 -= i_2;
                     i_2 = field1782[i_2];

                     while (true) {
                        --i_1;
                        if (i_1 < 0) {
                           while (true) {
                              --i_0;
                              if (i_0 < 0) {
                                 return;
                              }

                              method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                              i_4 += i_26;
                              i_5 += i_28;
                              i_8 += i_31;
                              i_2 += Rasterizer2D.Rasterizer2D_width;
                              i_32 += i_34;
                              i_35 += i_37;
                              i_38 += i_40;
                           }
                        }

                        method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_3 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                        i_3 += i_27;
                        i_5 += i_28;
                        i_8 += i_31;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                        i_32 += i_34;
                        i_35 += i_37;
                        i_38 += i_40;
                     }
                  } else {
                     i_0 -= i_1;
                     i_1 -= i_2;
                     i_2 = field1782[i_2];

                     while (true) {
                        --i_1;
                        if (i_1 < 0) {
                           while (true) {
                              --i_0;
                              if (i_0 < 0) {
                                 return;
                              }

                              method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                              i_4 += i_26;
                              i_5 += i_28;
                              i_8 += i_31;
                              i_2 += Rasterizer2D.Rasterizer2D_width;
                              i_32 += i_34;
                              i_35 += i_37;
                              i_38 += i_40;
                           }
                        }

                        method2987(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_5 >> 14, i_3 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                        i_3 += i_27;
                        i_5 += i_28;
                        i_8 += i_31;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                        i_32 += i_34;
                        i_35 += i_37;
                        i_38 += i_40;
                     }
                  }
               }
            }
         }
      }
   }

   public static final void method2978(double d_0) {
      method2979(d_0, 0, 512);
   }

   static final void method2985(int[] ints_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
      if (field1763) {
         if (i_5 > field1788) {
            i_5 = field1788;
         }

         if (i_4 < 0) {
            i_4 = 0;
         }
      }

      if (i_4 < i_5) {
         i_1 += i_4;
         i_3 = i_5 - i_4 >> 2;
         if (field1766 != 0) {
            if (field1766 == 254) {
               while (true) {
                  --i_3;
                  if (i_3 < 0) {
                     i_3 = i_5 - i_4 & 0x3;

                     while (true) {
                        --i_3;
                        if (i_3 < 0) {
                           return;
                        }

                        ints_0[i_1++] = ints_0[i_1];
                     }
                  }

                  ints_0[i_1++] = ints_0[i_1];
                  ints_0[i_1++] = ints_0[i_1];
                  ints_0[i_1++] = ints_0[i_1];
                  ints_0[i_1++] = ints_0[i_1];
               }
            } else {
               int i_6 = field1766;
               int i_7 = 256 - field1766;
               i_2 = (i_7 * (i_2 & 0xff00) >> 8 & 0xff00) + (i_7 * (i_2 & 0xff00ff) >> 8 & 0xff00ff);

               while (true) {
                  --i_3;
                  int i_8;
                  if (i_3 < 0) {
                     i_3 = i_5 - i_4 & 0x3;

                     while (true) {
                        --i_3;
                        if (i_3 < 0) {
                           return;
                        }

                        i_8 = ints_0[i_1];
                        ints_0[i_1++] = ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8 & 0xff00);
                     }
                  }

                  i_8 = ints_0[i_1];
                  ints_0[i_1++] = ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8 & 0xff00);
                  i_8 = ints_0[i_1];
                  ints_0[i_1++] = ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8 & 0xff00);
                  i_8 = ints_0[i_1];
                  ints_0[i_1++] = ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8 & 0xff00);
                  i_8 = ints_0[i_1];
                  ints_0[i_1++] = ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8 & 0xff00);
               }
            }
         } else {
            while (true) {
               --i_3;
               if (i_3 < 0) {
                  i_3 = i_5 - i_4 & 0x3;

                  while (true) {
                     --i_3;
                     if (i_3 < 0) {
                        return;
                     }

                     ints_0[i_1++] = i_2;
                  }
               }

               ints_0[i_1++] = i_2;
               ints_0[i_1++] = i_2;
               ints_0[i_1++] = i_2;
               ints_0[i_1++] = i_2;
            }
         }
      }
   }

   static final int method3045(int i_0, int i_1) {
      i_1 = (i_0 & 0x7f) * i_1 >> 7;
      if (i_1 < 2) {
         i_1 = 2;
      } else if (i_1 > 126) {
         i_1 = 126;
      }

      return (i_0 & 0xff80) + i_1;
   }

   static final void method2988(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, int i_17, int i_18) {
      int[] ints_19 = field1781.vmethod3287(i_18, 340581971);
      int i_20;
      if (ints_19 == null) {
         i_20 = field1781.vmethod3284(i_18, 1972695534);
         method3020(i_0, i_1, i_2, i_3, i_4, i_5, method3045(i_20, i_6), method3045(i_20, i_7), method3045(i_20, i_8));
      } else {
         field1771 = field1781.vmethod3279(i_18, (byte) 0);
         field1772 = field1781.vmethod3278(i_18, (byte) 79);
         i_20 = i_4 - i_3;
         int i_21 = i_1 - i_0;
         int i_22 = i_5 - i_3;
         int i_23 = i_2 - i_0;
         int i_24 = i_7 - i_6;
         int i_25 = i_8 - i_6;
         int i_26 = 0;
         if (i_0 != i_1) {
            i_26 = (i_4 - i_3 << 14) / (i_1 - i_0);
         }

         int i_27 = 0;
         if (i_2 != i_1) {
            i_27 = (i_5 - i_4 << 14) / (i_2 - i_1);
         }

         int i_28 = 0;
         if (i_0 != i_2) {
            i_28 = (i_3 - i_5 << 14) / (i_0 - i_2);
         }

         int i_29 = i_20 * i_23 - i_22 * i_21;
         if (i_29 != 0) {
            int i_30 = (i_24 * i_23 - i_25 * i_21 << 9) / i_29;
            int i_31 = (i_25 * i_20 - i_24 * i_22 << 9) / i_29;
            i_10 = i_9 - i_10;
            i_13 = i_12 - i_13;
            i_16 = i_15 - i_16;
            i_11 -= i_9;
            i_14 -= i_12;
            i_17 -= i_15;
            int i_32 = i_11 * i_12 - i_9 * i_14 << 14;
            int i_33 = (int)(((long)(i_15 * i_14 - i_17 * i_12) << 14) / (long)field1773);
            int i_34 = (int)(((long)(i_17 * i_9 - i_11 * i_15) << 14) / (long)field1773);
            int i_35 = i_10 * i_12 - i_13 * i_9 << 14;
            int i_36 = (int)(((long)(i_13 * i_15 - i_16 * i_12) << 14) / (long)field1773);
            int i_37 = (int)(((long)(i_16 * i_9 - i_10 * i_15) << 14) / (long)field1773);
            int i_38 = i_13 * i_11 - i_10 * i_14 << 14;
            int i_39 = (int)(((long)(i_16 * i_14 - i_13 * i_17) << 14) / (long)field1773);
            int i_40 = (int)(((long)(i_17 * i_10 - i_11 * i_16) << 14) / (long)field1773);
            int i_41;
            if (i_0 <= i_1 && i_0 <= i_2) {
               if (i_0 < field1776) {
                  if (i_1 > field1776) {
                     i_1 = field1776;
                  }

                  if (i_2 > field1776) {
                     i_2 = field1776;
                  }

                  i_6 = i_30 + ((i_6 << 9) - i_3 * i_30);
                  if (i_1 < i_2) {
                     i_5 = i_3 <<= 14;
                     if (i_0 < 0) {
                        i_5 -= i_0 * i_28;
                        i_3 -= i_0 * i_26;
                        i_6 -= i_0 * i_31;
                        i_0 = 0;
                     }

                     i_4 <<= 14;
                     if (i_1 < 0) {
                        i_4 -= i_27 * i_1;
                        i_1 = 0;
                     }

                     i_41 = i_0 - field1775;
                     i_32 += i_34 * i_41;
                     i_35 += i_37 * i_41;
                     i_38 += i_40 * i_41;
                     if ((i_0 == i_1 || i_28 >= i_26) && (i_0 != i_1 || i_28 <= i_27)) {
                        i_2 -= i_1;
                        i_1 -= i_0;
                        i_0 = field1782[i_0];

                        while (true) {
                           --i_1;
                           if (i_1 < 0) {
                              while (true) {
                                 --i_2;
                                 if (i_2 < 0) {
                                    return;
                                 }

                                 method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_4 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_5 += i_28;
                                 i_4 += i_27;
                                 i_6 += i_31;
                                 i_0 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_5 += i_28;
                           i_3 += i_26;
                           i_6 += i_31;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     } else {
                        i_2 -= i_1;
                        i_1 -= i_0;
                        i_0 = field1782[i_0];

                        while (true) {
                           --i_1;
                           if (i_1 < 0) {
                              while (true) {
                                 --i_2;
                                 if (i_2 < 0) {
                                    return;
                                 }

                                 method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_5 >> 14, i_4 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_5 += i_28;
                                 i_4 += i_27;
                                 i_6 += i_31;
                                 i_0 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_5 += i_28;
                           i_3 += i_26;
                           i_6 += i_31;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     }
                  } else {
                     i_4 = i_3 <<= 14;
                     if (i_0 < 0) {
                        i_4 -= i_0 * i_28;
                        i_3 -= i_0 * i_26;
                        i_6 -= i_0 * i_31;
                        i_0 = 0;
                     }

                     i_5 <<= 14;
                     if (i_2 < 0) {
                        i_5 -= i_27 * i_2;
                        i_2 = 0;
                     }

                     i_41 = i_0 - field1775;
                     i_32 += i_34 * i_41;
                     i_35 += i_37 * i_41;
                     i_38 += i_40 * i_41;
                     if (i_0 != i_2 && i_28 < i_26 || i_0 == i_2 && i_27 > i_26) {
                        i_1 -= i_2;
                        i_2 -= i_0;
                        i_0 = field1782[i_0];

                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              while (true) {
                                 --i_1;
                                 if (i_1 < 0) {
                                    return;
                                 }

                                 method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_5 += i_27;
                                 i_3 += i_26;
                                 i_6 += i_31;
                                 i_0 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_4 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_4 += i_28;
                           i_3 += i_26;
                           i_6 += i_31;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     } else {
                        i_1 -= i_2;
                        i_2 -= i_0;
                        i_0 = field1782[i_0];

                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              while (true) {
                                 --i_1;
                                 if (i_1 < 0) {
                                    return;
                                 }

                                 method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_5 += i_27;
                                 i_3 += i_26;
                                 i_6 += i_31;
                                 i_0 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_0, i_3 >> 14, i_4 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_4 += i_28;
                           i_3 += i_26;
                           i_6 += i_31;
                           i_0 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     }
                  }
               }
            } else if (i_1 <= i_2) {
               if (i_1 < field1776) {
                  if (i_2 > field1776) {
                     i_2 = field1776;
                  }

                  if (i_0 > field1776) {
                     i_0 = field1776;
                  }

                  i_7 = i_30 + ((i_7 << 9) - i_30 * i_4);
                  if (i_2 < i_0) {
                     i_3 = i_4 <<= 14;
                     if (i_1 < 0) {
                        i_3 -= i_26 * i_1;
                        i_4 -= i_27 * i_1;
                        i_7 -= i_31 * i_1;
                        i_1 = 0;
                     }

                     i_5 <<= 14;
                     if (i_2 < 0) {
                        i_5 -= i_28 * i_2;
                        i_2 = 0;
                     }

                     i_41 = i_1 - field1775;
                     i_32 += i_34 * i_41;
                     i_35 += i_37 * i_41;
                     i_38 += i_40 * i_41;
                     if ((i_2 == i_1 || i_26 >= i_27) && (i_2 != i_1 || i_26 <= i_28)) {
                        i_0 -= i_2;
                        i_2 -= i_1;
                        i_1 = field1782[i_1];

                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              while (true) {
                                 --i_0;
                                 if (i_0 < 0) {
                                    return;
                                 }

                                 method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_5 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_3 += i_26;
                                 i_5 += i_28;
                                 i_7 += i_31;
                                 i_1 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_3 += i_26;
                           i_4 += i_27;
                           i_7 += i_31;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     } else {
                        i_0 -= i_2;
                        i_2 -= i_1;
                        i_1 = field1782[i_1];

                        while (true) {
                           --i_2;
                           if (i_2 < 0) {
                              while (true) {
                                 --i_0;
                                 if (i_0 < 0) {
                                    return;
                                 }

                                 method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_3 >> 14, i_5 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_3 += i_26;
                                 i_5 += i_28;
                                 i_7 += i_31;
                                 i_1 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_3 += i_26;
                           i_4 += i_27;
                           i_7 += i_31;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     }
                  } else {
                     i_5 = i_4 <<= 14;
                     if (i_1 < 0) {
                        i_5 -= i_26 * i_1;
                        i_4 -= i_27 * i_1;
                        i_7 -= i_31 * i_1;
                        i_1 = 0;
                     }

                     i_3 <<= 14;
                     if (i_0 < 0) {
                        i_3 -= i_0 * i_28;
                        i_0 = 0;
                     }

                     i_41 = i_1 - field1775;
                     i_32 += i_34 * i_41;
                     i_35 += i_37 * i_41;
                     i_38 += i_40 * i_41;
                     if (i_26 < i_27) {
                        i_2 -= i_0;
                        i_0 -= i_1;
                        i_1 = field1782[i_1];

                        while (true) {
                           --i_0;
                           if (i_0 < 0) {
                              while (true) {
                                 --i_2;
                                 if (i_2 < 0) {
                                    return;
                                 }

                                 method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_3 += i_28;
                                 i_4 += i_27;
                                 i_7 += i_31;
                                 i_1 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_5 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_5 += i_26;
                           i_4 += i_27;
                           i_7 += i_31;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     } else {
                        i_2 -= i_0;
                        i_0 -= i_1;
                        i_1 = field1782[i_1];

                        while (true) {
                           --i_0;
                           if (i_0 < 0) {
                              while (true) {
                                 --i_2;
                                 if (i_2 < 0) {
                                    return;
                                 }

                                 method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                 i_3 += i_28;
                                 i_4 += i_27;
                                 i_7 += i_31;
                                 i_1 += Rasterizer2D.Rasterizer2D_width;
                                 i_32 += i_34;
                                 i_35 += i_37;
                                 i_38 += i_40;
                              }
                           }

                           method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_1, i_4 >> 14, i_5 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                           i_5 += i_26;
                           i_4 += i_27;
                           i_7 += i_31;
                           i_1 += Rasterizer2D.Rasterizer2D_width;
                           i_32 += i_34;
                           i_35 += i_37;
                           i_38 += i_40;
                        }
                     }
                  }
               }
            } else if (i_2 < field1776) {
               if (i_0 > field1776) {
                  i_0 = field1776;
               }

               if (i_1 > field1776) {
                  i_1 = field1776;
               }

               i_8 = (i_8 << 9) - i_5 * i_30 + i_30;
               if (i_0 < i_1) {
                  i_4 = i_5 <<= 14;
                  if (i_2 < 0) {
                     i_4 -= i_27 * i_2;
                     i_5 -= i_28 * i_2;
                     i_8 -= i_31 * i_2;
                     i_2 = 0;
                  }

                  i_3 <<= 14;
                  if (i_0 < 0) {
                     i_3 -= i_0 * i_26;
                     i_0 = 0;
                  }

                  i_41 = i_2 - field1775;
                  i_32 += i_34 * i_41;
                  i_35 += i_37 * i_41;
                  i_38 += i_40 * i_41;
                  if (i_27 < i_28) {
                     i_1 -= i_0;
                     i_0 -= i_2;
                     i_2 = field1782[i_2];

                     while (true) {
                        --i_0;
                        if (i_0 < 0) {
                           while (true) {
                              --i_1;
                              if (i_1 < 0) {
                                 return;
                              }

                              method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_4 >> 14, i_3 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                              i_4 += i_27;
                              i_3 += i_26;
                              i_8 += i_31;
                              i_2 += Rasterizer2D.Rasterizer2D_width;
                              i_32 += i_34;
                              i_35 += i_37;
                              i_38 += i_40;
                           }
                        }

                        method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                        i_4 += i_27;
                        i_5 += i_28;
                        i_8 += i_31;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                        i_32 += i_34;
                        i_35 += i_37;
                        i_38 += i_40;
                     }
                  } else {
                     i_1 -= i_0;
                     i_0 -= i_2;
                     i_2 = field1782[i_2];

                     while (true) {
                        --i_0;
                        if (i_0 < 0) {
                           while (true) {
                              --i_1;
                              if (i_1 < 0) {
                                 return;
                              }

                              method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_3 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                              i_4 += i_27;
                              i_3 += i_26;
                              i_8 += i_31;
                              i_2 += Rasterizer2D.Rasterizer2D_width;
                              i_32 += i_34;
                              i_35 += i_37;
                              i_38 += i_40;
                           }
                        }

                        method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                        i_4 += i_27;
                        i_5 += i_28;
                        i_8 += i_31;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                        i_32 += i_34;
                        i_35 += i_37;
                        i_38 += i_40;
                     }
                  }
               } else {
                  i_3 = i_5 <<= 14;
                  if (i_2 < 0) {
                     i_3 -= i_27 * i_2;
                     i_5 -= i_28 * i_2;
                     i_8 -= i_31 * i_2;
                     i_2 = 0;
                  }

                  i_4 <<= 14;
                  if (i_1 < 0) {
                     i_4 -= i_26 * i_1;
                     i_1 = 0;
                  }

                  i_41 = i_2 - field1775;
                  i_32 += i_34 * i_41;
                  i_35 += i_37 * i_41;
                  i_38 += i_40 * i_41;
                  if (i_27 < i_28) {
                     i_0 -= i_1;
                     i_1 -= i_2;
                     i_2 = field1782[i_2];

                     while (true) {
                        --i_1;
                        if (i_1 < 0) {
                           while (true) {
                              --i_0;
                              if (i_0 < 0) {
                                 return;
                              }

                              method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                              i_4 += i_26;
                              i_5 += i_28;
                              i_8 += i_31;
                              i_2 += Rasterizer2D.Rasterizer2D_width;
                              i_32 += i_34;
                              i_35 += i_37;
                              i_38 += i_40;
                           }
                        }

                        method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_3 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                        i_3 += i_27;
                        i_5 += i_28;
                        i_8 += i_31;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                        i_32 += i_34;
                        i_35 += i_37;
                        i_38 += i_40;
                     }
                  } else {
                     i_0 -= i_1;
                     i_1 -= i_2;
                     i_2 = field1782[i_2];

                     while (true) {
                        --i_1;
                        if (i_1 < 0) {
                           while (true) {
                              --i_0;
                              if (i_0 < 0) {
                                 return;
                              }

                              method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                              i_4 += i_26;
                              i_5 += i_28;
                              i_8 += i_31;
                              i_2 += Rasterizer2D.Rasterizer2D_width;
                              i_32 += i_34;
                              i_35 += i_37;
                              i_38 += i_40;
                           }
                        }

                        method2989(Rasterizer2D.Rasterizer2D_pixels, ints_19, 0, 0, i_2, i_5 >> 14, i_3 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                        i_3 += i_27;
                        i_5 += i_28;
                        i_8 += i_31;
                        i_2 += Rasterizer2D.Rasterizer2D_width;
                        i_32 += i_34;
                        i_35 += i_37;
                        i_38 += i_40;
                     }
                  }
               }
            }
         }
      }
   }

   static final int method2995(int i_0, int i_1, int i_2, int i_3) {
      return i_0 * i_2 + i_3 * i_1 >> 16;
   }

   static final void method2977(int[] ints_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      if (field1763) {
         if (i_5 > field1788) {
            i_5 = field1788;
         }

         if (i_4 < 0) {
            i_4 = 0;
         }
      }

      if (i_4 < i_5) {
         i_1 += i_4;
         i_6 += i_4 * i_7;
         int i_8;
         int i_9;
         int i_10;
         if (field1768) {
            i_3 = i_5 - i_4 >> 2;
            i_7 <<= 2;
            if (field1766 == 0) {
               if (i_3 > 0) {
                  do {
                     i_2 = field1783[i_6 >> 8];
                     i_6 += i_7;
                     ints_0[i_1++] = i_2;
                     ints_0[i_1++] = i_2;
                     ints_0[i_1++] = i_2;
                     ints_0[i_1++] = i_2;
                     --i_3;
                  } while (i_3 > 0);
               }

               i_3 = i_5 - i_4 & 0x3;
               if (i_3 > 0) {
                  i_2 = field1783[i_6 >> 8];

                  do {
                     ints_0[i_1++] = i_2;
                     --i_3;
                  } while (i_3 > 0);
               }
            } else {
               i_8 = field1766;
               i_9 = 256 - field1766;
               if (i_3 > 0) {
                  do {
                     i_2 = field1783[i_6 >> 8];
                     i_6 += i_7;
                     i_2 = (i_9 * (i_2 & 0xff00) >> 8 & 0xff00) + (i_9 * (i_2 & 0xff00ff) >> 8 & 0xff00ff);
                     i_10 = ints_0[i_1];
                     ints_0[i_1++] = ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8 & 0xff00);
                     i_10 = ints_0[i_1];
                     ints_0[i_1++] = ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8 & 0xff00);
                     i_10 = ints_0[i_1];
                     ints_0[i_1++] = ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8 & 0xff00);
                     i_10 = ints_0[i_1];
                     ints_0[i_1++] = ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8 & 0xff00);
                     --i_3;
                  } while (i_3 > 0);
               }

               i_3 = i_5 - i_4 & 0x3;
               if (i_3 > 0) {
                  i_2 = field1783[i_6 >> 8];
                  i_2 = (i_9 * (i_2 & 0xff00) >> 8 & 0xff00) + (i_9 * (i_2 & 0xff00ff) >> 8 & 0xff00ff);

                  do {
                     i_10 = ints_0[i_1];
                     ints_0[i_1++] = ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8 & 0xff00);
                     --i_3;
                  } while (i_3 > 0);
               }
            }

         } else {
            i_3 = i_5 - i_4;
            if (field1766 == 0) {
               do {
                  ints_0[i_1++] = field1783[i_6 >> 8];
                  i_6 += i_7;
                  --i_3;
               } while (i_3 > 0);
            } else {
               i_8 = field1766;
               i_9 = 256 - field1766;

               do {
                  i_2 = field1783[i_6 >> 8];
                  i_6 += i_7;
                  i_2 = (i_9 * (i_2 & 0xff00) >> 8 & 0xff00) + (i_9 * (i_2 & 0xff00ff) >> 8 & 0xff00ff);
                  i_10 = ints_0[i_1];
                  ints_0[i_1++] = ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8 & 0xff00);
                  --i_3;
               } while (i_3 > 0);
            }

         }
      }
   }

   static final int method2996(int i_0, int i_1, int i_2, int i_3) {
      return i_2 * i_1 - i_3 * i_0 >> 16;
   }

   static final int method2982(int i_0, int i_1, int i_2, int i_3) {
      return i_0 * i_2 - i_3 * i_1 >> 16;
   }

   static final int method2994(int i_0, int i_1, int i_2, int i_3) {
      return i_3 * i_0 + i_2 * i_1 >> 16;
   }

   public static final void method2983(class139 class139_0) {
      field1781 = class139_0;
   }

   static final void method2979(double d_0, int i_2, int i_3) {
      int i_4 = i_2 * 128;

      for (int i_5 = i_2; i_5 < i_3; i_5++) {
         double d_6 = (double)(i_5 >> 3) / 64.0D + 0.0078125D;
         double d_8 = (double)(i_5 & 0x7) / 8.0D + 0.0625D;

         for (int i_10 = 0; i_10 < 128; i_10++) {
            double d_11 = (double)i_10 / 128.0D;
            double d_13 = d_11;
            double d_15 = d_11;
            double d_17 = d_11;
            if (d_8 != 0.0D) {
               double d_19;
               if (d_11 < 0.5D) {
                  d_19 = d_11 * (1.0D + d_8);
               } else {
                  d_19 = d_11 + d_8 - d_11 * d_8;
               }

               double d_21 = 2.0D * d_11 - d_19;
               double d_23 = d_6 + 0.3333333333333333D;
               if (d_23 > 1.0D) {
                  --d_23;
               }

               double d_27 = d_6 - 0.3333333333333333D;
               if (d_27 < 0.0D) {
                  ++d_27;
               }

               if (6.0D * d_23 < 1.0D) {
                  d_13 = d_21 + (d_19 - d_21) * 6.0D * d_23;
               } else if (2.0D * d_23 < 1.0D) {
                  d_13 = d_19;
               } else if (3.0D * d_23 < 2.0D) {
                  d_13 = d_21 + (d_19 - d_21) * (0.6666666666666666D - d_23) * 6.0D;
               } else {
                  d_13 = d_21;
               }

               if (6.0D * d_6 < 1.0D) {
                  d_15 = d_21 + (d_19 - d_21) * 6.0D * d_6;
               } else if (2.0D * d_6 < 1.0D) {
                  d_15 = d_19;
               } else if (3.0D * d_6 < 2.0D) {
                  d_15 = d_21 + (d_19 - d_21) * (0.6666666666666666D - d_6) * 6.0D;
               } else {
                  d_15 = d_21;
               }

               if (6.0D * d_27 < 1.0D) {
                  d_17 = d_21 + (d_19 - d_21) * 6.0D * d_27;
               } else if (2.0D * d_27 < 1.0D) {
                  d_17 = d_19;
               } else if (3.0D * d_27 < 2.0D) {
                  d_17 = d_21 + (d_19 - d_21) * (0.6666666666666666D - d_27) * 6.0D;
               } else {
                  d_17 = d_21;
               }
            }

            int i_29 = (int)(d_13 * 256.0D);
            int i_20 = (int)(d_15 * 256.0D);
            int i_30 = (int)(d_17 * 256.0D);
            int i_22 = i_30 + (i_20 << 8) + (i_29 << 16);
            i_22 = method2980(i_22, d_0);
            if (i_22 == 0) {
               i_22 = 1;
            }

            field1783[i_4++] = i_22;
         }
      }

   }

   public static final void method2976(int i_0, int i_1) {
      int i_2 = field1782[0];
      int i_3 = i_2 / Rasterizer2D.Rasterizer2D_width;
      int i_4 = i_2 - i_3 * Rasterizer2D.Rasterizer2D_width;
      field1774 = i_0 - i_4;
      field1775 = i_1 - i_3;
      field1778 = -field1774;
      field1779 = field1788 - field1774;
      field1780 = -field1775;
      field1777 = field1776 - field1775;
   }

   static final void method2987(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14) {
      if (field1763) {
         if (i_6 > field1788) {
            i_6 = field1788;
         }

         if (i_5 < 0) {
            i_5 = 0;
         }
      }

      if (i_5 < i_6) {
         i_4 += i_5;
         i_7 += i_5 * i_8;
         int i_17 = i_6 - i_5;
         int i_15;
         int i_16;
         int i_10000;
         int i_18;
         int i_19;
         int i_20;
         int i_21;
         int i_22;
         int i_23;
         if (field1771) {
            i_23 = i_5 - field1774;
            i_9 += i_23 * (i_12 >> 3);
            i_10 += (i_13 >> 3) * i_23;
            i_11 += i_23 * (i_14 >> 3);
            i_22 = i_11 >> 12;
            if (i_22 != 0) {
               i_18 = i_9 / i_22;
               i_19 = i_10 / i_22;
               if (i_18 < 0) {
                  i_18 = 0;
               } else if (i_18 > 4032) {
                  i_18 = 4032;
               }
            } else {
               i_18 = 0;
               i_19 = 0;
            }

            i_9 += i_12;
            i_10 += i_13;
            i_11 += i_14;
            i_22 = i_11 >> 12;
            if (i_22 != 0) {
               i_20 = i_9 / i_22;
               i_21 = i_10 / i_22;
               if (i_20 < 0) {
                  i_20 = 0;
               } else if (i_20 > 4032) {
                  i_20 = 4032;
               }
            } else {
               i_20 = 0;
               i_21 = 0;
            }

            i_2 = (i_18 << 20) + i_19;
            i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 20);
            i_17 >>= 3;
            i_8 <<= 3;
            i_15 = i_7 >> 8;
            if (field1772) {
               if (i_17 > 0) {
                  do {
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_10000 = i_16 + i_2;
                     i_18 = i_20;
                     i_19 = i_21;
                     i_9 += i_12;
                     i_10 += i_13;
                     i_11 += i_14;
                     i_22 = i_11 >> 12;
                     if (i_22 != 0) {
                        i_20 = i_9 / i_22;
                        i_21 = i_10 / i_22;
                        if (i_20 < 0) {
                           i_20 = 0;
                        } else if (i_20 > 4032) {
                           i_20 = 4032;
                        }
                     } else {
                        i_20 = 0;
                        i_21 = 0;
                     }

                     i_2 = (i_18 << 20) + i_19;
                     i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 20);
                     i_7 += i_8;
                     i_15 = i_7 >> 8;
                     --i_17;
                  } while (i_17 > 0);
               }

               i_17 = i_6 - i_5 & 0x7;
               if (i_17 > 0) {
                  do {
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     --i_17;
                  } while (i_17 > 0);
               }
            } else {
               if (i_17 > 0) {
                  do {
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_10000 = i_16 + i_2;
                     i_18 = i_20;
                     i_19 = i_21;
                     i_9 += i_12;
                     i_10 += i_13;
                     i_11 += i_14;
                     i_22 = i_11 >> 12;
                     if (i_22 != 0) {
                        i_20 = i_9 / i_22;
                        i_21 = i_10 / i_22;
                        if (i_20 < 0) {
                           i_20 = 0;
                        } else if (i_20 > 4032) {
                           i_20 = 4032;
                        }
                     } else {
                        i_20 = 0;
                        i_21 = 0;
                     }

                     i_2 = (i_18 << 20) + i_19;
                     i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 20);
                     i_7 += i_8;
                     i_15 = i_7 >> 8;
                     --i_17;
                  } while (i_17 > 0);
               }

               i_17 = i_6 - i_5 & 0x7;
               if (i_17 > 0) {
                  do {
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     --i_17;
                  } while (i_17 > 0);
               }
            }
         } else {
            i_23 = i_5 - field1774;
            i_9 += i_23 * (i_12 >> 3);
            i_10 += (i_13 >> 3) * i_23;
            i_11 += i_23 * (i_14 >> 3);
            i_22 = i_11 >> 14;
            if (i_22 != 0) {
               i_18 = i_9 / i_22;
               i_19 = i_10 / i_22;
               if (i_18 < 0) {
                  i_18 = 0;
               } else if (i_18 > 16256) {
                  i_18 = 16256;
               }
            } else {
               i_18 = 0;
               i_19 = 0;
            }

            i_9 += i_12;
            i_10 += i_13;
            i_11 += i_14;
            i_22 = i_11 >> 14;
            if (i_22 != 0) {
               i_20 = i_9 / i_22;
               i_21 = i_10 / i_22;
               if (i_20 < 0) {
                  i_20 = 0;
               } else if (i_20 > 16256) {
                  i_20 = 16256;
               }
            } else {
               i_20 = 0;
               i_21 = 0;
            }

            i_2 = (i_18 << 18) + i_19;
            i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 18);
            i_17 >>= 3;
            i_8 <<= 3;
            i_15 = i_7 >> 8;
            if (field1772) {
               if (i_17 > 0) {
                  do {
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_10000 = i_16 + i_2;
                     i_18 = i_20;
                     i_19 = i_21;
                     i_9 += i_12;
                     i_10 += i_13;
                     i_11 += i_14;
                     i_22 = i_11 >> 14;
                     if (i_22 != 0) {
                        i_20 = i_9 / i_22;
                        i_21 = i_10 / i_22;
                        if (i_20 < 0) {
                           i_20 = 0;
                        } else if (i_20 > 16256) {
                           i_20 = 16256;
                        }
                     } else {
                        i_20 = 0;
                        i_21 = 0;
                     }

                     i_2 = (i_18 << 18) + i_19;
                     i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 18);
                     i_7 += i_8;
                     i_15 = i_7 >> 8;
                     --i_17;
                  } while (i_17 > 0);
               }

               i_17 = i_6 - i_5 & 0x7;
               if (i_17 > 0) {
                  do {
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     --i_17;
                  } while (i_17 > 0);
               }
            } else {
               if (i_17 > 0) {
                  do {
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_10000 = i_16 + i_2;
                     i_18 = i_20;
                     i_19 = i_21;
                     i_9 += i_12;
                     i_10 += i_13;
                     i_11 += i_14;
                     i_22 = i_11 >> 14;
                     if (i_22 != 0) {
                        i_20 = i_9 / i_22;
                        i_21 = i_10 / i_22;
                        if (i_20 < 0) {
                           i_20 = 0;
                        } else if (i_20 > 16256) {
                           i_20 = 16256;
                        }
                     } else {
                        i_20 = 0;
                        i_21 = 0;
                     }

                     i_2 = (i_18 << 18) + i_19;
                     i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 18);
                     i_7 += i_8;
                     i_15 = i_7 >> 8;
                     --i_17;
                  } while (i_17 > 0);
               }

               i_17 = i_6 - i_5 & 0x7;
               if (i_17 > 0) {
                  do {
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     --i_17;
                  } while (i_17 > 0);
               }
            }
         }

      }
   }

   public static void method2981(int i_0, int i_1, int i_2) {
      field1763 = i_0 < 0 || i_0 > field1788 || i_1 < 0 || i_1 > field1788 || i_2 < 0 || i_2 > field1788;
   }

   static final void method2989(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14) {
      if (field1763) {
         if (i_6 > field1788) {
            i_6 = field1788;
         }

         if (i_5 < 0) {
            i_5 = 0;
         }
      }

      if (i_5 < i_6) {
         i_4 += i_5;
         i_7 += i_5 * i_8;
         int i_17 = i_6 - i_5;
         int i_15;
         int i_16;
         int i_18;
         int i_19;
         int i_20;
         int i_21;
         int i_22;
         int i_23;
         if (field1771) {
            i_23 = i_5 - field1774;
            i_9 += i_23 * i_12;
            i_10 += i_13 * i_23;
            i_11 += i_23 * i_14;
            i_22 = i_11 >> 12;
            if (i_22 != 0) {
               i_18 = i_9 / i_22;
               i_19 = i_10 / i_22;
            } else {
               i_18 = 0;
               i_19 = 0;
            }

            i_9 += i_17 * i_12;
            i_10 += i_13 * i_17;
            i_11 += i_17 * i_14;
            i_22 = i_11 >> 12;
            if (i_22 != 0) {
               i_20 = i_9 / i_22;
               i_21 = i_10 / i_22;
            } else {
               i_20 = 0;
               i_21 = 0;
            }

            i_2 = (i_18 << 20) + i_19;
            i_16 = (i_21 - i_19) / i_17 + ((i_20 - i_18) / i_17 << 20);
            i_17 >>= 3;
            i_8 <<= 3;
            i_15 = i_7 >> 8;
            if (field1772) {
               if (i_17 > 0) {
                  do {
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_7 += i_8;
                     i_15 = i_7 >> 8;
                     --i_17;
                  } while (i_17 > 0);
               }

               i_17 = i_6 - i_5 & 0x7;
               if (i_17 > 0) {
                  do {
                     i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     --i_17;
                  } while (i_17 > 0);
               }
            } else {
               if (i_17 > 0) {
                  do {
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     i_7 += i_8;
                     i_15 = i_7 >> 8;
                     --i_17;
                  } while (i_17 > 0);
               }

               i_17 = i_6 - i_5 & 0x7;
               if (i_17 > 0) {
                  do {
                     if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     --i_17;
                  } while (i_17 > 0);
               }
            }
         } else {
            i_23 = i_5 - field1774;
            i_9 += i_23 * i_12;
            i_10 += i_13 * i_23;
            i_11 += i_23 * i_14;
            i_22 = i_11 >> 14;
            if (i_22 != 0) {
               i_18 = i_9 / i_22;
               i_19 = i_10 / i_22;
            } else {
               i_18 = 0;
               i_19 = 0;
            }

            i_9 += i_17 * i_12;
            i_10 += i_13 * i_17;
            i_11 += i_17 * i_14;
            i_22 = i_11 >> 14;
            if (i_22 != 0) {
               i_20 = i_9 / i_22;
               i_21 = i_10 / i_22;
            } else {
               i_20 = 0;
               i_21 = 0;
            }

            i_2 = (i_18 << 18) + i_19;
            i_16 = (i_21 - i_19) / i_17 + ((i_20 - i_18) / i_17 << 18);
            i_17 >>= 3;
            i_8 <<= 3;
            i_15 = i_7 >> 8;
            if (field1772) {
               if (i_17 > 0) {
                  do {
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     i_7 += i_8;
                     i_15 = i_7 >> 8;
                     --i_17;
                  } while (i_17 > 0);
               }

               i_17 = i_6 - i_5 & 0x7;
               if (i_17 > 0) {
                  do {
                     i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                     ints_0[i_4++] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     i_2 += i_16;
                     --i_17;
                  } while (i_17 > 0);
               }
            } else {
               if (i_17 > 0) {
                  do {
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     i_7 += i_8;
                     i_15 = i_7 >> 8;
                     --i_17;
                  } while (i_17 > 0);
               }

               i_17 = i_6 - i_5 & 0x7;
               if (i_17 > 0) {
                  do {
                     if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                        ints_0[i_4] = (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
                     }

                     ++i_4;
                     i_2 += i_16;
                     --i_17;
                  } while (i_17 > 0);
               }
            }
         }

      }
   }

}
