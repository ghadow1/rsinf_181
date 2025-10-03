import java.util.Random;

public abstract class AbstractFont extends Rasterizer2D {

   public static class324[] field3720;
   static int field3710 = -1;
   static int field3711 = -1;
   static int field3716 = -1;
   static int field3713 = -1;
   static int field3708 = 0;
   static int field3715 = 0;
   static int field3704 = 256;
   static int field3699 = 0;
   static int field3718 = 0;
   static Random field3719 = new Random();
   static String[] field3706 = new String[100];
   byte[][] field3705 = new byte[256][];
   public int field3709 = 0;
   int[] field3703;
   int[] field3717;
   int[] field3701;
   int[] field3702;
   public int field3714;
   public int field3707;
   int[] field3700;
   byte[] field3712;

   AbstractFont(byte[] bytes_1, int[] ints_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, byte[][] bytes_7) {
      this.field3703 = ints_2;
      this.field3717 = ints_3;
      this.field3701 = ints_4;
      this.field3702 = ints_5;
      this.method5372(bytes_1);
      this.field3705 = bytes_7;
      int i_8 = Integer.MAX_VALUE;
      int i_9 = Integer.MIN_VALUE;

      for (int i_10 = 0; i_10 < 256; i_10++) {
         if (this.field3717[i_10] < i_8 && this.field3702[i_10] != 0) {
            i_8 = this.field3717[i_10];
         }

         if (this.field3717[i_10] + this.field3702[i_10] > i_9) {
            i_9 = this.field3717[i_10] + this.field3702[i_10];
         }
      }

      this.field3714 = this.field3709 - i_8;
      this.field3707 = i_9 - this.field3709;
   }

   AbstractFont(byte[] bytes_1) {
      this.method5372(bytes_1);
   }

   void method5355(int i_1, int i_2) {
      field3710 = -1;
      field3711 = -1;
      field3716 = i_2;
      field3713 = i_2;
      field3708 = i_1;
      field3715 = i_1;
      field3704 = 256;
      field3699 = 0;
      field3718 = 0;
   }

   public int method5417(String string_1) {
      if (string_1 == null) {
         return 0;
      } else {
         int i_2 = -1;
         int i_3 = -1;
         int i_4 = 0;

         for (int i_5 = 0; i_5 < string_1.length(); i_5++) {
            char var_6 = string_1.charAt(i_5);
            if (var_6 == 60) {
               i_2 = i_5;
            } else {
               if (var_6 == 62 && i_2 != -1) {
                  String string_7 = string_1.substring(i_2 + 1, i_5);
                  i_2 = -1;
                  if (string_7.equals("lt")) {
                     var_6 = 60;
                  } else {
                     if (!string_7.equals("gt")) {
                        if (string_7.startsWith("img=")) {
                           try {
                              int i_8 = class3.method38(string_7.substring(4));
                              i_4 += field3720[i_8].field3896;
                              i_3 = -1;
                           } catch (Exception exception_10) {
                              ;
                           }
                        }
                        continue;
                     }

                     var_6 = 62;
                  }
               }

               if (var_6 == 160) {
                  var_6 = 32;
               }

               if (i_2 == -1) {
                  i_4 += this.field3700[(char)(ItemDefinition.encodeStringCp1252(var_6) & 0xff)];
                  if (this.field3712 != null && i_3 != -1) {
                     i_4 += this.field3712[var_6 + (i_3 << 8)];
                  }

                  i_3 = var_6;
               }
            }
         }

         return i_4;
      }
   }

   public int method5342(String string_1, int[] ints_2, String[] arr_3) {
      if (string_1 == null) {
         return 0;
      } else {
         int i_4 = 0;
         int i_5 = 0;
         StringBuilder stringbuilder_6 = new StringBuilder(100);
         int i_7 = -1;
         int i_8 = 0;
         byte b_9 = 0;
         int i_10 = -1;
         char var_11 = 0;
         int i_12 = 0;
         int i_13 = string_1.length();

         for (int i_14 = 0; i_14 < i_13; i_14++) {
            char var_15 = string_1.charAt(i_14);
            if (var_15 == 60) {
               i_10 = i_14;
            } else {
               if (var_15 == 62 && i_10 != -1) {
                  String string_16 = string_1.substring(i_10 + 1, i_14);
                  i_10 = -1;
                  stringbuilder_6.append('<');
                  stringbuilder_6.append(string_16);
                  stringbuilder_6.append('>');
                  if (string_16.equals("br")) {
                     arr_3[i_12] = stringbuilder_6.toString().substring(i_5, stringbuilder_6.length());
                     ++i_12;
                     i_5 = stringbuilder_6.length();
                     i_4 = 0;
                     i_7 = -1;
                     var_11 = 0;
                  } else if (string_16.equals("lt")) {
                     i_4 += this.method5398('<');
                     if (this.field3712 != null && var_11 != -1) {
                        i_4 += this.field3712[(var_11 << 8) + 60];
                     }

                     var_11 = 60;
                  } else if (string_16.equals("gt")) {
                     i_4 += this.method5398('>');
                     if (this.field3712 != null && var_11 != -1) {
                        i_4 += this.field3712[(var_11 << 8) + 62];
                     }

                     var_11 = 62;
                  } else if (string_16.startsWith("img=")) {
                     try {
                        int i_17 = class3.method38(string_16.substring(4));
                        i_4 += field3720[i_17].field3896;
                        var_11 = 0;
                     } catch (Exception exception_20) {
                        ;
                     }
                  }

                  var_15 = 0;
               }

               if (i_10 == -1) {
                  if (var_15 != 0) {
                     stringbuilder_6.append(var_15);
                     i_4 += this.method5398(var_15);
                     if (this.field3712 != null && var_11 != -1) {
                        i_4 += this.field3712[var_15 + (var_11 << 8)];
                     }

                     var_11 = var_15;
                  }

                  if (var_15 == 32) {
                     i_7 = stringbuilder_6.length();
                     i_8 = i_4;
                     b_9 = 1;
                  }

                  if (ints_2 != null && i_4 > ints_2[i_12 < ints_2.length ? i_12 : ints_2.length - 1] && i_7 >= 0) {
                     arr_3[i_12] = stringbuilder_6.toString().substring(i_5, i_7 - b_9);
                     ++i_12;
                     i_5 = i_7;
                     i_7 = -1;
                     i_4 -= i_8;
                     var_11 = 0;
                  }

                  if (var_15 == 45) {
                     i_7 = stringbuilder_6.length();
                     i_8 = i_4;
                     b_9 = 0;
                  }
               }
            }
         }

         String string_19 = stringbuilder_6.toString();
         if (string_19.length() > i_5) {
            arr_3[i_12++] = string_19.substring(i_5, string_19.length());
         }

         return i_12;
      }
   }

   void method5358(String string_1, int i_2, int i_3) {
      i_3 -= this.field3709;
      int i_4 = -1;
      int i_5 = -1;

      for (int i_6 = 0; i_6 < string_1.length(); i_6++) {
         if (string_1.charAt(i_6) != 0) {
            char var_7 = (char)(ItemDefinition.encodeStringCp1252(string_1.charAt(i_6)) & 0xff);
            if (var_7 == 60) {
               i_4 = i_6;
            } else {
               int i_9;
               if (var_7 == 62 && i_4 != -1) {
                  String string_8 = string_1.substring(i_4 + 1, i_6);
                  i_4 = -1;
                  if (string_8.equals("lt")) {
                     var_7 = 60;
                  } else {
                     if (!string_8.equals("gt")) {
                        if (string_8.startsWith("img=")) {
                           try {
                              i_9 = class3.method38(string_8.substring(4));
                              class324 class324_10 = field3720[i_9];
                              class324_10.method6101(i_2, i_3 + this.field3709 - class324_10.field3894);
                              i_2 += class324_10.field3896;
                              i_5 = -1;
                           } catch (Exception exception_14) {
                              ;
                           }
                        } else {
                           this.method5376(string_8);
                        }
                        continue;
                     }

                     var_7 = 62;
                  }
               }

               if (var_7 == 160) {
                  var_7 = 32;
               }

               if (i_4 == -1) {
                  if (this.field3712 != null && i_5 != -1) {
                     i_2 += this.field3712[var_7 + (i_5 << 8)];
                  }

                  int i_12 = this.field3701[var_7];
                  i_9 = this.field3702[var_7];
                  if (var_7 != 32) {
                     if (field3704 == 256) {
                        if (field3713 != -1) {
                           method5416(this.field3705[var_7], i_2 + this.field3703[var_7] + 1, i_3 + this.field3717[var_7] + 1, i_12, i_9, field3713);
                        }

                        this.vmethod5360(this.field3705[var_7], i_2 + this.field3703[var_7], i_3 + this.field3717[var_7], i_12, i_9, field3715);
                     } else {
                        if (field3713 != -1) {
                           method5364(this.field3705[var_7], i_2 + this.field3703[var_7] + 1, i_3 + this.field3717[var_7] + 1, i_12, i_9, field3713, field3704);
                        }

                        this.vmethod5361(this.field3705[var_7], i_2 + this.field3703[var_7], i_3 + this.field3717[var_7], i_12, i_9, field3715, field3704);
                     }
                  } else if (field3699 > 0) {
                     field3718 += field3699;
                     i_2 += field3718 >> 8;
                     field3718 &= 0xff;
                  }

                  int i_13 = this.field3700[var_7];
                  if (field3710 != -1) {
                     Rasterizer2D.method6010(i_2, i_3 + (int)((double)this.field3709 * 0.7D), i_13, field3710);
                  }

                  if (field3711 != -1) {
                     Rasterizer2D.method6010(i_2, i_3 + this.field3709 + 1, i_13, field3711);
                  }

                  i_2 += i_13;
                  i_5 = var_7;
               }
            }
         }
      }

   }

   void method5372(byte[] bytes_1) {
      this.field3700 = new int[256];
      int i_2;
      if (bytes_1.length == 257) {
         for (i_2 = 0; i_2 < this.field3700.length; i_2++) {
            this.field3700[i_2] = bytes_1[i_2] & 0xff;
         }

         this.field3709 = bytes_1[256] & 0xff;
      } else {
         i_2 = 0;

         for (int i_3 = 0; i_3 < 256; i_3++) {
            this.field3700[i_3] = bytes_1[i_2++] & 0xff;
         }

         int[] ints_10 = new int[256];
         int[] ints_4 = new int[256];

         int i_5;
         for (i_5 = 0; i_5 < 256; i_5++) {
            ints_10[i_5] = bytes_1[i_2++] & 0xff;
         }

         for (i_5 = 0; i_5 < 256; i_5++) {
            ints_4[i_5] = bytes_1[i_2++] & 0xff;
         }

         byte[][] bytes_11 = new byte[256][];

         int i_8;
         for (int i_6 = 0; i_6 < 256; i_6++) {
            bytes_11[i_6] = new byte[ints_10[i_6]];
            byte b_7 = 0;

            for (i_8 = 0; i_8 < bytes_11[i_6].length; i_8++) {
               b_7 += bytes_1[i_2++];
               bytes_11[i_6][i_8] = b_7;
            }
         }

         byte[][] bytes_12 = new byte[256][];

         int i_13;
         for (i_13 = 0; i_13 < 256; i_13++) {
            bytes_12[i_13] = new byte[ints_10[i_13]];
            byte b_14 = 0;

            for (int i_9 = 0; i_9 < bytes_12[i_13].length; i_9++) {
               b_14 += bytes_1[i_2++];
               bytes_12[i_13][i_9] = b_14;
            }
         }

         this.field3712 = new byte[65536];

         for (i_13 = 0; i_13 < 256; i_13++) {
            if (i_13 != 32 && i_13 != 160) {
               for (i_8 = 0; i_8 < 256; i_8++) {
                  if (i_8 != 32 && i_8 != 160) {
                     this.field3712[i_8 + (i_13 << 8)] = (byte)method5339(bytes_11, bytes_12, ints_4, this.field3700, ints_10, i_13, i_8);
                  }
               }
            }
         }

         this.field3709 = ints_4[32] + ints_10[32];
      }

   }

   void method5359(String string_1, int i_2, int i_3, int[] ints_4, int[] ints_5) {
      i_3 -= this.field3709;
      int i_6 = -1;
      int i_7 = -1;
      int i_8 = 0;

      for (int i_9 = 0; i_9 < string_1.length(); i_9++) {
         if (string_1.charAt(i_9) != 0) {
            char var_10 = (char)(ItemDefinition.encodeStringCp1252(string_1.charAt(i_9)) & 0xff);
            if (var_10 == 60) {
               i_6 = i_9;
            } else {
               int i_12;
               int i_13;
               int i_14;
               if (var_10 == 62 && i_6 != -1) {
                  String string_11 = string_1.substring(i_6 + 1, i_9);
                  i_6 = -1;
                  if (string_11.equals("lt")) {
                     var_10 = 60;
                  } else {
                     if (!string_11.equals("gt")) {
                        if (string_11.startsWith("img=")) {
                           try {
                              if (ints_4 != null) {
                                 i_12 = ints_4[i_8];
                              } else {
                                 i_12 = 0;
                              }

                              if (ints_5 != null) {
                                 i_13 = ints_5[i_8];
                              } else {
                                 i_13 = 0;
                              }

                              ++i_8;
                              i_14 = class3.method38(string_11.substring(4));
                              class324 class324_15 = field3720[i_14];
                              class324_15.method6101(i_12 + i_2, i_13 + (i_3 + this.field3709 - class324_15.field3894));
                              i_2 += class324_15.field3896;
                              i_7 = -1;
                           } catch (Exception exception_19) {
                              ;
                           }
                        } else {
                           this.method5376(string_11);
                        }
                        continue;
                     }

                     var_10 = 62;
                  }
               }

               if (var_10 == 160) {
                  var_10 = 32;
               }

               if (i_6 == -1) {
                  if (this.field3712 != null && i_7 != -1) {
                     i_2 += this.field3712[var_10 + (i_7 << 8)];
                  }

                  int i_17 = this.field3701[var_10];
                  i_12 = this.field3702[var_10];
                  if (ints_4 != null) {
                     i_13 = ints_4[i_8];
                  } else {
                     i_13 = 0;
                  }

                  if (ints_5 != null) {
                     i_14 = ints_5[i_8];
                  } else {
                     i_14 = 0;
                  }

                  ++i_8;
                  if (var_10 != 32) {
                     if (field3704 == 256) {
                        if (field3713 != -1) {
                           method5416(this.field3705[var_10], i_13 + i_2 + this.field3703[var_10] + 1, i_3 + i_14 + this.field3717[var_10] + 1, i_17, i_12, field3713);
                        }

                        this.vmethod5360(this.field3705[var_10], i_13 + i_2 + this.field3703[var_10], i_3 + i_14 + this.field3717[var_10], i_17, i_12, field3715);
                     } else {
                        if (field3713 != -1) {
                           method5364(this.field3705[var_10], i_13 + i_2 + this.field3703[var_10] + 1, i_3 + i_14 + this.field3717[var_10] + 1, i_17, i_12, field3713, field3704);
                        }

                        this.vmethod5361(this.field3705[var_10], i_13 + i_2 + this.field3703[var_10], i_3 + i_14 + this.field3717[var_10], i_17, i_12, field3715, field3704);
                     }
                  } else if (field3699 > 0) {
                     field3718 += field3699;
                     i_2 += field3718 >> 8;
                     field3718 &= 0xff;
                  }

                  int i_18 = this.field3700[var_10];
                  if (field3710 != -1) {
                     Rasterizer2D.method6010(i_2, i_3 + (int)((double)this.field3709 * 0.7D), i_18, field3710);
                  }

                  if (field3711 != -1) {
                     Rasterizer2D.method6010(i_2, i_3 + this.field3709, i_18, field3711);
                  }

                  i_2 += i_18;
                  i_7 = var_10;
               }
            }
         }
      }

   }

   int method5398(char var_1) {
      if (var_1 == 160) {
         var_1 = 32;
      }

      return this.field3700[ItemDefinition.encodeStringCp1252(var_1) & 0xff];
   }

   public int method5390(String string_1, int i_2) {
      return this.method5342(string_1, new int[] {i_2}, field3706);
   }

   void method5376(String string_1) {
      try {
         if (string_1.startsWith("col=")) {
            field3715 = class248.method4493(string_1.substring(4), 16);
         } else if (string_1.equals("/col")) {
            field3715 = field3708;
         } else if (string_1.startsWith("str=")) {
            field3710 = class248.method4493(string_1.substring(4), 16);
         } else if (string_1.equals("str")) {
            field3710 = 8388608;
         } else if (string_1.equals("/str")) {
            field3710 = -1;
         } else if (string_1.startsWith("u=")) {
            field3711 = class248.method4493(string_1.substring(2), 16);
         } else if (string_1.equals("u")) {
            field3711 = 0;
         } else if (string_1.equals("/u")) {
            field3711 = -1;
         } else if (string_1.startsWith("shad=")) {
            field3713 = class248.method4493(string_1.substring(5), 16);
         } else if (string_1.equals("shad")) {
            field3713 = 0;
         } else if (string_1.equals("/shad")) {
            field3713 = field3716;
         } else if (string_1.equals("br")) {
            this.method5355(field3708, field3716);
         }
      } catch (Exception exception_3) {
         ;
      }

   }

   public int method5350(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
      if (string_1 == null) {
         return 0;
      } else {
         this.method5355(i_6, i_7);
         if (i_10 == 0) {
            i_10 = this.field3709;
         }

         int[] ints_11 = new int[] {i_4};
         if (i_5 < i_10 + this.field3714 + this.field3707 && i_5 < i_10 + i_10) {
            ints_11 = null;
         }

         int i_12 = this.method5342(string_1, ints_11, field3706);
         if (i_9 == 3 && i_12 == 1) {
            i_9 = 1;
         }

         int i_13;
         int i_14;
         if (i_9 == 0) {
            i_13 = i_3 + this.field3714;
         } else if (i_9 == 1) {
            i_13 = i_3 + (i_5 - this.field3714 - this.field3707 - i_10 * (i_12 - 1)) / 2 + this.field3714;
         } else if (i_9 == 2) {
            i_13 = i_3 + i_5 - this.field3707 - i_10 * (i_12 - 1);
         } else {
            i_14 = (i_5 - this.field3714 - this.field3707 - i_10 * (i_12 - 1)) / (i_12 + 1);
            if (i_14 < 0) {
               i_14 = 0;
            }

            i_13 = i_3 + i_14 + this.field3714;
            i_10 += i_14;
         }

         for (i_14 = 0; i_14 < i_12; i_14++) {
            if (i_8 == 0) {
               this.method5358(field3706[i_14], i_2, i_13);
            } else if (i_8 == 1) {
               this.method5358(field3706[i_14], i_2 + (i_4 - this.method5417(field3706[i_14])) / 2, i_13);
            } else if (i_8 == 2) {
               this.method5358(field3706[i_14], i_2 + i_4 - this.method5417(field3706[i_14]), i_13);
            } else if (i_14 == i_12 - 1) {
               this.method5358(field3706[i_14], i_2, i_13);
            } else {
               this.method5357(field3706[i_14], i_4);
               this.method5358(field3706[i_14], i_2, i_13);
               field3699 = 0;
            }

            i_13 += i_10;
         }

         return i_12;
      }
   }

   void method5357(String string_1, int i_2) {
      int i_3 = 0;
      boolean bool_4 = false;

      for (int i_5 = 0; i_5 < string_1.length(); i_5++) {
         char var_6 = string_1.charAt(i_5);
         if (var_6 == 60) {
            bool_4 = true;
         } else if (var_6 == 62) {
            bool_4 = false;
         } else if (!bool_4 && var_6 == 32) {
            ++i_3;
         }
      }

      if (i_3 > 0) {
         field3699 = (i_2 - this.method5417(string_1) << 8) / i_3;
      }

   }

   abstract void vmethod5360(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void vmethod5361(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public int method5343(String string_1, int i_2) {
      int i_3 = this.method5342(string_1, new int[] {i_2}, field3706);
      int i_4 = 0;

      for (int i_5 = 0; i_5 < i_3; i_5++) {
         int i_6 = this.method5417(field3706[i_5]);
         if (i_6 > i_4) {
            i_4 = i_6;
         }
      }

      return i_4;
   }

   public void method5341(String string_1, int i_2, int i_3, int i_4, int i_5) {
      if (string_1 != null) {
         this.method5355(i_4, i_5);
         this.method5358(string_1, i_2 - this.method5417(string_1) / 2, i_3);
      }
   }

   public void drawRandomAlphaAndSpacing(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      if (string_1 != null) {
         this.method5355(i_4, i_5);
         field3719.setSeed((long)i_6);
         field3704 = 192 + (field3719.nextInt() & 0x1f);
         int[] ints_7 = new int[string_1.length()];
         int i_8 = 0;

         for (int i_9 = 0; i_9 < string_1.length(); i_9++) {
            ints_7[i_9] = i_8;
            if ((field3719.nextInt() & 0x3) == 0) {
               ++i_8;
            }
         }

         this.method5359(string_1, i_2, i_3, ints_7, (int[]) null);
      }
   }

   public void draw(String string_1, int i_2, int i_3, int i_4, int i_5) {
      if (string_1 != null) {
         this.method5355(i_4, i_5);
         this.method5358(string_1, i_2, i_3);
      }
   }

   public void method5348(String string_1, int i_2, int i_3, int i_4, int i_5) {
      if (string_1 != null) {
         this.method5355(i_4, i_5);
         this.method5358(string_1, i_2 - this.method5417(string_1), i_3);
      }
   }

   public void method5351(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      if (string_1 != null) {
         this.method5355(i_4, i_5);
         int[] ints_7 = new int[string_1.length()];

         for (int i_8 = 0; i_8 < string_1.length(); i_8++) {
            ints_7[i_8] = (int)(Math.sin((double)i_8 / 2.0D + (double)i_6 / 5.0D) * 5.0D);
         }

         this.method5359(string_1, i_2 - this.method5417(string_1) / 2, i_3, (int[]) null, ints_7);
      }
   }

   public void method5353(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      if (string_1 != null) {
         this.method5355(i_4, i_5);
         int[] ints_7 = new int[string_1.length()];
         int[] ints_8 = new int[string_1.length()];

         for (int i_9 = 0; i_9 < string_1.length(); i_9++) {
            ints_7[i_9] = (int)(Math.sin((double)i_9 / 5.0D + (double)i_6 / 5.0D) * 5.0D);
            ints_8[i_9] = (int)(Math.sin((double)i_9 / 3.0D + (double)i_6 / 5.0D) * 5.0D);
         }

         this.method5359(string_1, i_2 - this.method5417(string_1) / 2, i_3, ints_7, ints_8);
      }
   }

   public void method5373(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      if (string_1 != null) {
         this.method5355(i_4, i_5);
         double d_8 = 7.0D - (double)i_7 / 8.0D;
         if (d_8 < 0.0D) {
            d_8 = 0.0D;
         }

         int[] ints_10 = new int[string_1.length()];

         for (int i_11 = 0; i_11 < string_1.length(); i_11++) {
            ints_10[i_11] = (int)(Math.sin((double)i_11 / 1.5D + (double)i_6 / 1.0D) * d_8);
         }

         this.method5359(string_1, i_2 - this.method5417(string_1) / 2, i_3, (int[]) null, ints_10);
      }
   }

   public void method5347(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      if (string_1 != null) {
         this.method5355(i_4, i_5);
         field3704 = i_6;
         this.method5358(string_1, i_2, i_3);
      }
   }

   static int method5339(byte[][] bytes_0, byte[][] bytes_1, int[] ints_2, int[] ints_3, int[] ints_4, int i_5, int i_6) {
      int i_7 = ints_2[i_5];
      int i_8 = i_7 + ints_4[i_5];
      int i_9 = ints_2[i_6];
      int i_10 = i_9 + ints_4[i_6];
      int i_11 = i_7;
      if (i_9 > i_7) {
         i_11 = i_9;
      }

      int i_12 = i_8;
      if (i_10 < i_8) {
         i_12 = i_10;
      }

      int i_13 = ints_3[i_5];
      if (ints_3[i_6] < i_13) {
         i_13 = ints_3[i_6];
      }

      byte[] bytes_14 = bytes_1[i_5];
      byte[] bytes_15 = bytes_0[i_6];
      int i_16 = i_11 - i_7;
      int i_17 = i_11 - i_9;

      for (int i_18 = i_11; i_18 < i_12; i_18++) {
         int i_19 = bytes_14[i_16++] + bytes_15[i_17++];
         if (i_19 < i_13) {
            i_13 = i_19;
         }
      }

      return -i_13;
   }

   static void method5416(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
      int i_6 = i_1 + i_2 * Rasterizer2D.Rasterizer2D_width;
      int i_7 = Rasterizer2D.Rasterizer2D_width - i_3;
      int i_8 = 0;
      int i_9 = 0;
      int i_10;
      if (i_2 < Rasterizer2D.Rasterizer2D_yClipStart) {
         i_10 = Rasterizer2D.Rasterizer2D_yClipStart - i_2;
         i_4 -= i_10;
         i_2 = Rasterizer2D.Rasterizer2D_yClipStart;
         i_9 += i_3 * i_10;
         i_6 += i_10 * Rasterizer2D.Rasterizer2D_width;
      }

      if (i_2 + i_4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
         i_4 -= i_2 + i_4 - Rasterizer2D.Rasterizer2D_yClipEnd;
      }

      if (i_1 < Rasterizer2D.Rasterizer2D_xClipStart) {
         i_10 = Rasterizer2D.Rasterizer2D_xClipStart - i_1;
         i_3 -= i_10;
         i_1 = Rasterizer2D.Rasterizer2D_xClipStart;
         i_9 += i_10;
         i_6 += i_10;
         i_8 += i_10;
         i_7 += i_10;
      }

      if (i_3 + i_1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
         i_10 = i_3 + i_1 - Rasterizer2D.Rasterizer2D_xClipEnd;
         i_3 -= i_10;
         i_8 += i_10;
         i_7 += i_10;
      }

      if (i_3 > 0 && i_4 > 0) {
         method5380(Rasterizer2D.Rasterizer2D_pixels, bytes_0, i_5, i_9, i_6, i_3, i_4, i_7, i_8);
      }
   }

   static void method5365(int[] ints_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
      i_2 = ((i_2 & 0xff00) * i_9 & 0xff0000) + (i_9 * (i_2 & 0xff00ff) & ~0xff00ff) >> 8;
      i_9 = 256 - i_9;

      for (int i_10 = -i_6; i_10 < 0; i_10++) {
         for (int i_11 = -i_5; i_11 < 0; i_11++) {
            if (bytes_1[i_3++] != 0) {
               int i_12 = ints_0[i_4];
               ints_0[i_4++] = (((i_12 & 0xff00) * i_9 & 0xff0000) + ((i_12 & 0xff00ff) * i_9 & ~0xff00ff) >> 8) + i_2;
            } else {
               ++i_4;
            }
         }

         i_4 += i_7;
         i_3 += i_8;
      }

   }

   static void method5380(int[] ints_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
      int i_9 = -(i_5 >> 2);
      i_5 = -(i_5 & 0x3);

      for (int i_10 = -i_6; i_10 < 0; i_10++) {
         int i_11;
         for (i_11 = i_9; i_11 < 0; i_11++) {
            if (bytes_1[i_3++] != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }

            if (bytes_1[i_3++] != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }

            if (bytes_1[i_3++] != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }

            if (bytes_1[i_3++] != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }
         }

         for (i_11 = i_5; i_11 < 0; i_11++) {
            if (bytes_1[i_3++] != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }
         }

         i_4 += i_7;
         i_3 += i_8;
      }

   }

   static void method5364(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      int i_7 = i_1 + i_2 * Rasterizer2D.Rasterizer2D_width;
      int i_8 = Rasterizer2D.Rasterizer2D_width - i_3;
      int i_9 = 0;
      int i_10 = 0;
      int i_11;
      if (i_2 < Rasterizer2D.Rasterizer2D_yClipStart) {
         i_11 = Rasterizer2D.Rasterizer2D_yClipStart - i_2;
         i_4 -= i_11;
         i_2 = Rasterizer2D.Rasterizer2D_yClipStart;
         i_10 += i_3 * i_11;
         i_7 += i_11 * Rasterizer2D.Rasterizer2D_width;
      }

      if (i_2 + i_4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
         i_4 -= i_2 + i_4 - Rasterizer2D.Rasterizer2D_yClipEnd;
      }

      if (i_1 < Rasterizer2D.Rasterizer2D_xClipStart) {
         i_11 = Rasterizer2D.Rasterizer2D_xClipStart - i_1;
         i_3 -= i_11;
         i_1 = Rasterizer2D.Rasterizer2D_xClipStart;
         i_10 += i_11;
         i_7 += i_11;
         i_9 += i_11;
         i_8 += i_11;
      }

      if (i_3 + i_1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
         i_11 = i_3 + i_1 - Rasterizer2D.Rasterizer2D_xClipEnd;
         i_3 -= i_11;
         i_9 += i_11;
         i_8 += i_11;
      }

      if (i_3 > 0 && i_4 > 0) {
         method5365(Rasterizer2D.Rasterizer2D_pixels, bytes_0, i_5, i_10, i_7, i_3, i_4, i_8, i_9, i_6);
      }
   }

   public static String escapeBrackets(String string_0) {
      int i_1 = string_0.length();
      int i_2 = 0;

      for (int i_3 = 0; i_3 < i_1; i_3++) {
         char var_4 = string_0.charAt(i_3);
         if (var_4 == 60 || var_4 == 62) {
            i_2 += 3;
         }
      }

      StringBuilder stringbuilder_6 = new StringBuilder(i_1 + i_2);

      for (int i_7 = 0; i_7 < i_1; i_7++) {
         char var_5 = string_0.charAt(i_7);
         if (var_5 == 60) {
            stringbuilder_6.append("<lt>");
         } else if (var_5 == 62) {
            stringbuilder_6.append("<gt>");
         } else {
            stringbuilder_6.append(var_5);
         }
      }

      return stringbuilder_6.toString();
   }

}
