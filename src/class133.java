public class class133 {

   public static boolean field1848 = true;
   static int field1821 = 0;
   static int field1839 = 0;
   static class142[] field1831 = new class142[100];
   static boolean field1822 = false;
   static int field1833 = 0;
   static int field1825 = 0;
   static int field1835 = 0;
   public static int field1850 = -1;
   public static int field1837 = -1;
   static boolean field1838 = false;
   static int field1841 = 4;
   static int[] field1832;
   static class140[][] field1843;
   static int field1806;
   static class140[] field1845;
   static class261 field1846;
   static final int[] field1847;
   static final int[] field1815;
   static final int[] field1809;
   static final int[] field1844;
   static final int[] field1828;
   static final int[] field1852;
   static final int[] field1842;
   static boolean[][][][] field1860;
   int field1807 = 0;
   int field1859 = 0;
   class142[] field1866 = new class142[5000];
   int[][] field1858 = new int[][] {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] field1836 = new int[][] {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   int field1802;
   int field1803;
   int field1804;
   class126[][][] field1853;
   int[][][] field1810;
   int[][][] field1857;
   static int field1808;
   static int field1827;
   static int field1801;
   static int field1829;
   static int field1830;
   static boolean[][] field1861;
   static int field1824;
   static int field1816;
   static int field1826;
   static int field1849;
   static int field1823;
   static int field1818;
   static int field1820;
   static int field1819;
   static int field1851;
   static int field1864;
   static int field1834;
   static int field1805;
   static int field1867;
   static int field1862;
   static int field1863;

   static {
      field1832 = new int[field1841];
      field1843 = new class140[field1841][500];
      field1806 = 0;
      field1845 = new class140[500];
      field1846 = new class261();
      field1847 = new int[] {19, 55, 38, 155, 255, 110, 137, 205, 76};
      field1815 = new int[] {160, 192, 80, 96, 0, 144, 80, 48, 160};
      field1809 = new int[] {76, 8, 137, 4, 0, 1, 38, 2, 19};
      field1844 = new int[] {0, 0, 2, 0, 0, 2, 1, 1, 0};
      field1828 = new int[] {2, 0, 0, 2, 0, 0, 0, 4, 4};
      field1852 = new int[] {0, 4, 4, 8, 0, 0, 8, 0, 0};
      field1842 = new int[] {1, 1, 0, 0, 0, 8, 0, 0, 8};
      field1860 = new boolean[8][32][51][51];
   }

   public class133(int i_1, int i_2, int i_3, int[][][] ints_4) {
      this.field1802 = i_1;
      this.field1803 = i_2;
      this.field1804 = i_3;
      this.field1853 = new class126[i_1][i_2][i_3];
      this.field1810 = new int[i_1][i_2 + 1][i_3 + 1];
      this.field1857 = ints_4;
      this.method3066();
   }

   boolean method3181(int i_1, int i_2, int i_3) {
      int i_4 = this.field1810[i_1][i_2][i_3];
      if (i_4 == -field1808) {
         return false;
      } else if (i_4 == field1808) {
         return true;
      } else {
         int i_5 = i_2 << 7;
         int i_6 = i_3 << 7;
         if (this.method3102(i_5 + 1, this.field1857[i_1][i_2][i_3], i_6 + 1) && this.method3102(i_5 + 128 - 1, this.field1857[i_1][i_2 + 1][i_3], i_6 + 1) && this.method3102(i_5 + 128 - 1, this.field1857[i_1][i_2 + 1][i_3 + 1], i_6 + 128 - 1) && this.method3102(i_5 + 1, this.field1857[i_1][i_2][i_3 + 1], i_6 + 128 - 1)) {
            this.field1810[i_1][i_2][i_3] = field1808;
            return true;
         } else {
            this.field1810[i_1][i_2][i_3] = -field1808;
            return false;
         }
      }
   }

   boolean method3157(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, class135 class135_9, int i_10, boolean bool_11, long long_12, int i_14) {
      int i_16;
      for (int i_15 = i_2; i_15 < i_2 + i_4; i_15++) {
         for (i_16 = i_3; i_16 < i_3 + i_5; i_16++) {
            if (i_15 < 0 || i_16 < 0 || i_15 >= this.field1803 || i_16 >= this.field1804) {
               return false;
            }

            class126 class126_22 = this.field1853[i_1][i_15][i_16];
            if (class126_22 != null && class126_22.field1655 >= 5) {
               return false;
            }
         }
      }

      class142 class142_21 = new class142();
      class142_21.field1941 = long_12;
      class142_21.field1942 = i_14;
      class142_21.field1937 = i_1;
      class142_21.field1931 = i_6;
      class142_21.field1929 = i_7;
      class142_21.field1932 = i_8;
      class142_21.field1933 = class135_9;
      class142_21.field1934 = i_10;
      class142_21.field1935 = i_2;
      class142_21.field1930 = i_3;
      class142_21.field1936 = i_2 + i_4 - 1;
      class142_21.field1938 = i_3 + i_5 - 1;

      for (i_16 = i_2; i_16 < i_2 + i_4; i_16++) {
         for (int i_17 = i_3; i_17 < i_3 + i_5; i_17++) {
            int i_18 = 0;
            if (i_16 > i_2) {
               ++i_18;
            }

            if (i_16 < i_2 + i_4 - 1) {
               i_18 += 4;
            }

            if (i_17 > i_3) {
               i_18 += 8;
            }

            if (i_17 < i_3 + i_5 - 1) {
               i_18 += 2;
            }

            for (int i_19 = i_1; i_19 >= 0; --i_19) {
               if (this.field1853[i_19][i_16][i_17] == null) {
                  this.field1853[i_19][i_16][i_17] = new class126(i_19, i_16, i_17);
               }
            }

            class126 class126_23 = this.field1853[i_1][i_16][i_17];
            class126_23.field1663[class126_23.field1655] = class142_21;
            class126_23.field1657[class126_23.field1655] = i_18;
            class126_23.field1658 |= i_18;
            ++class126_23.field1655;
         }
      }

      if (bool_11) {
         this.field1866[this.field1859++] = class142_21;
      }

      return true;
   }

   void method3081(class142 class142_1) {
      for (int i_2 = class142_1.field1935; i_2 <= class142_1.field1936; i_2++) {
         for (int i_3 = class142_1.field1930; i_3 <= class142_1.field1938; i_3++) {
            class126 class126_4 = this.field1853[class142_1.field1937][i_2][i_3];
            if (class126_4 != null) {
               int i_5;
               for (i_5 = 0; i_5 < class126_4.field1655; i_5++) {
                  if (class126_4.field1663[i_5] == class142_1) {
                     --class126_4.field1655;

                     for (int i_6 = i_5; i_6 < class126_4.field1655; i_6++) {
                        class126_4.field1663[i_6] = class126_4.field1663[i_6 + 1];
                        class126_4.field1657[i_6] = class126_4.field1657[i_6 + 1];
                     }

                     class126_4.field1663[class126_4.field1655] = null;
                     break;
                  }
               }

               class126_4.field1658 = 0;

               for (i_5 = 0; i_5 < class126_4.field1655; i_5++) {
                  class126_4.field1658 |= class126_4.field1657[i_5];
               }
            }
         }
      }

   }

   public void method3103(int i_1, int i_2, int i_3, boolean bool_4) {
      if (!method3105() || bool_4) {
         field1822 = true;
         field1838 = bool_4;
         field1833 = i_1;
         field1825 = i_2;
         field1835 = i_3;
         field1850 = -1;
         field1837 = -1;
      }
   }

   boolean method3102(int i_1, int i_2, int i_3) {
      for (int i_4 = 0; i_4 < field1806; i_4++) {
         class140 class140_5 = field1845[i_4];
         int i_6;
         int i_7;
         int i_8;
         int i_9;
         int i_10;
         if (class140_5.field1910 == 1) {
            i_6 = class140_5.field1904 - i_1;
            if (i_6 > 0) {
               i_7 = (i_6 * class140_5.field1900 >> 8) + class140_5.field1903;
               i_8 = (i_6 * class140_5.field1911 >> 8) + class140_5.field1897;
               i_9 = (i_6 * class140_5.field1912 >> 8) + class140_5.field1898;
               i_10 = (i_6 * class140_5.field1913 >> 8) + class140_5.field1906;
               if (i_3 >= i_7 && i_3 <= i_8 && i_2 >= i_9 && i_2 <= i_10) {
                  return true;
               }
            }
         } else if (class140_5.field1910 == 2) {
            i_6 = i_1 - class140_5.field1904;
            if (i_6 > 0) {
               i_7 = (i_6 * class140_5.field1900 >> 8) + class140_5.field1903;
               i_8 = (i_6 * class140_5.field1911 >> 8) + class140_5.field1897;
               i_9 = (i_6 * class140_5.field1912 >> 8) + class140_5.field1898;
               i_10 = (i_6 * class140_5.field1913 >> 8) + class140_5.field1906;
               if (i_3 >= i_7 && i_3 <= i_8 && i_2 >= i_9 && i_2 <= i_10) {
                  return true;
               }
            }
         } else if (class140_5.field1910 == 3) {
            i_6 = class140_5.field1903 - i_3;
            if (i_6 > 0) {
               i_7 = (i_6 * class140_5.field1907 >> 8) + class140_5.field1904;
               i_8 = (i_6 * class140_5.field1909 >> 8) + class140_5.field1902;
               i_9 = (i_6 * class140_5.field1912 >> 8) + class140_5.field1898;
               i_10 = (i_6 * class140_5.field1913 >> 8) + class140_5.field1906;
               if (i_1 >= i_7 && i_1 <= i_8 && i_2 >= i_9 && i_2 <= i_10) {
                  return true;
               }
            }
         } else if (class140_5.field1910 == 4) {
            i_6 = i_3 - class140_5.field1903;
            if (i_6 > 0) {
               i_7 = (i_6 * class140_5.field1907 >> 8) + class140_5.field1904;
               i_8 = (i_6 * class140_5.field1909 >> 8) + class140_5.field1902;
               i_9 = (i_6 * class140_5.field1912 >> 8) + class140_5.field1898;
               i_10 = (i_6 * class140_5.field1913 >> 8) + class140_5.field1906;
               if (i_1 >= i_7 && i_1 <= i_8 && i_2 >= i_9 && i_2 <= i_10) {
                  return true;
               }
            }
         } else if (class140_5.field1910 == 5) {
            i_6 = i_2 - class140_5.field1898;
            if (i_6 > 0) {
               i_7 = (i_6 * class140_5.field1907 >> 8) + class140_5.field1904;
               i_8 = (i_6 * class140_5.field1909 >> 8) + class140_5.field1902;
               i_9 = (i_6 * class140_5.field1900 >> 8) + class140_5.field1903;
               i_10 = (i_6 * class140_5.field1911 >> 8) + class140_5.field1897;
               if (i_1 >= i_7 && i_1 <= i_8 && i_3 >= i_9 && i_3 <= i_10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   void method3099(Model model_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      boolean bool_7 = true;
      int i_8 = i_3;
      int i_9 = i_3 + i_5;
      int i_10 = i_4 - 1;
      int i_11 = i_4 + i_6;

      for (int i_12 = i_2; i_12 <= i_2 + 1; i_12++) {
         if (i_12 != this.field1802) {
            for (int i_13 = i_8; i_13 <= i_9; i_13++) {
               if (i_13 >= 0 && i_13 < this.field1803) {
                  for (int i_14 = i_10; i_14 <= i_11; i_14++) {
                     if (i_14 >= 0 && i_14 < this.field1804 && (!bool_7 || i_13 >= i_9 || i_14 >= i_11 || i_14 < i_4 && i_3 != i_13)) {
                        class126 class126_15 = this.field1853[i_12][i_13][i_14];
                        if (class126_15 != null) {
                           int i_16 = (this.field1857[i_12][i_13 + 1][i_14] + this.field1857[i_12][i_13 + 1][i_14 + 1] + this.field1857[i_12][i_13][i_14] + this.field1857[i_12][i_13][i_14 + 1]) / 4 - (this.field1857[i_2][i_3 + 1][i_4] + this.field1857[i_2][i_3][i_4] + this.field1857[i_2][i_3 + 1][i_4 + 1] + this.field1857[i_2][i_3][i_4 + 1]) / 4;
                           class136 class136_17 = class126_15.field1656;
                           if (class136_17 != null) {
                              Model model_18;
                              if (class136_17.field1884 instanceof Model) {
                                 model_18 = (Model) class136_17.field1884;
                                 Model.method2790(model_1, model_18, (1 - i_5) * 64 + (i_13 - i_3) * 128, i_16, (i_14 - i_4) * 128 + (1 - i_6) * 64, bool_7);
                              }

                              if (class136_17.field1881 instanceof Model) {
                                 model_18 = (Model) class136_17.field1881;
                                 Model.method2790(model_1, model_18, (1 - i_5) * 64 + (i_13 - i_3) * 128, i_16, (i_14 - i_4) * 128 + (1 - i_6) * 64, bool_7);
                              }
                           }

                           for (int i_23 = 0; i_23 < class126_15.field1655; i_23++) {
                              class142 class142_19 = class126_15.field1663[i_23];
                              if (class142_19 != null && class142_19.field1933 instanceof Model) {
                                 Model model_20 = (Model) class142_19.field1933;
                                 int i_21 = class142_19.field1936 - class142_19.field1935 + 1;
                                 int i_22 = class142_19.field1938 - class142_19.field1930 + 1;
                                 Model.method2790(model_1, model_20, (i_21 - i_5) * 64 + (class142_19.field1935 - i_3) * 128, i_16, (class142_19.field1930 - i_4) * 128 + (i_22 - i_6) * 64, bool_7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --i_8;
            bool_7 = false;
         }
      }

   }

   boolean method3194(int i_1, int i_2, int i_3, int i_4) {
      if (!this.method3181(i_1, i_2, i_3)) {
         return false;
      } else {
         int i_5 = i_2 << 7;
         int i_6 = i_3 << 7;
         int i_7 = this.field1857[i_1][i_2][i_3] - 1;
         int i_8 = i_7 - 120;
         int i_9 = i_7 - 230;
         int i_10 = i_7 - 238;
         if (i_4 < 16) {
            if (i_4 == 1) {
               if (i_5 > field1824) {
                  if (!this.method3102(i_5, i_7, i_6)) {
                     return false;
                  }

                  if (!this.method3102(i_5, i_7, i_6 + 128)) {
                     return false;
                  }
               }

               if (i_1 > 0) {
                  if (!this.method3102(i_5, i_8, i_6)) {
                     return false;
                  }

                  if (!this.method3102(i_5, i_8, i_6 + 128)) {
                     return false;
                  }
               }

               if (!this.method3102(i_5, i_9, i_6)) {
                  return false;
               }

               if (!this.method3102(i_5, i_9, i_6 + 128)) {
                  return false;
               }

               return true;
            }

            if (i_4 == 2) {
               if (i_6 < field1826) {
                  if (!this.method3102(i_5, i_7, i_6 + 128)) {
                     return false;
                  }

                  if (!this.method3102(i_5 + 128, i_7, i_6 + 128)) {
                     return false;
                  }
               }

               if (i_1 > 0) {
                  if (!this.method3102(i_5, i_8, i_6 + 128)) {
                     return false;
                  }

                  if (!this.method3102(i_5 + 128, i_8, i_6 + 128)) {
                     return false;
                  }
               }

               if (!this.method3102(i_5, i_9, i_6 + 128)) {
                  return false;
               }

               if (!this.method3102(i_5 + 128, i_9, i_6 + 128)) {
                  return false;
               }

               return true;
            }

            if (i_4 == 4) {
               if (i_5 < field1824) {
                  if (!this.method3102(i_5 + 128, i_7, i_6)) {
                     return false;
                  }

                  if (!this.method3102(i_5 + 128, i_7, i_6 + 128)) {
                     return false;
                  }
               }

               if (i_1 > 0) {
                  if (!this.method3102(i_5 + 128, i_8, i_6)) {
                     return false;
                  }

                  if (!this.method3102(i_5 + 128, i_8, i_6 + 128)) {
                     return false;
                  }
               }

               if (!this.method3102(i_5 + 128, i_9, i_6)) {
                  return false;
               }

               if (!this.method3102(i_5 + 128, i_9, i_6 + 128)) {
                  return false;
               }

               return true;
            }

            if (i_4 == 8) {
               if (i_6 > field1826) {
                  if (!this.method3102(i_5, i_7, i_6)) {
                     return false;
                  }

                  if (!this.method3102(i_5 + 128, i_7, i_6)) {
                     return false;
                  }
               }

               if (i_1 > 0) {
                  if (!this.method3102(i_5, i_8, i_6)) {
                     return false;
                  }

                  if (!this.method3102(i_5 + 128, i_8, i_6)) {
                     return false;
                  }
               }

               if (!this.method3102(i_5, i_9, i_6)) {
                  return false;
               }

               if (!this.method3102(i_5 + 128, i_9, i_6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method3102(i_5 + 64, i_10, i_6 + 64) ? false : (i_4 == 16 ? this.method3102(i_5, i_9, i_6 + 128) : (i_4 == 32 ? this.method3102(i_5 + 128, i_9, i_6 + 128) : (i_4 == 64 ? this.method3102(i_5 + 128, i_9, i_6) : (i_4 == 128 ? this.method3102(i_5, i_9, i_6) : true))));
      }
   }

   void method3065(class131 class131_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
      int i_9;
      int i_10 = i_9 = (i_7 << 7) - field1824;
      int i_11;
      int i_12 = i_11 = (i_8 << 7) - field1826;
      int i_13;
      int i_14 = i_13 = i_10 + 128;
      int i_15;
      int i_16 = i_15 = i_12 + 128;
      int i_17 = this.field1857[i_2][i_7][i_8] - field1816;
      int i_18 = this.field1857[i_2][i_7 + 1][i_8] - field1816;
      int i_19 = this.field1857[i_2][i_7 + 1][i_8 + 1] - field1816;
      int i_20 = this.field1857[i_2][i_7][i_8 + 1] - field1816;
      int i_21 = i_10 * i_6 + i_5 * i_12 >> 16;
      i_12 = i_12 * i_6 - i_5 * i_10 >> 16;
      i_10 = i_21;
      i_21 = i_17 * i_4 - i_3 * i_12 >> 16;
      i_12 = i_3 * i_17 + i_12 * i_4 >> 16;
      i_17 = i_21;
      if (i_12 >= 50) {
         i_21 = i_14 * i_6 + i_5 * i_11 >> 16;
         i_11 = i_11 * i_6 - i_5 * i_14 >> 16;
         i_14 = i_21;
         i_21 = i_18 * i_4 - i_3 * i_11 >> 16;
         i_11 = i_3 * i_18 + i_11 * i_4 >> 16;
         i_18 = i_21;
         if (i_11 >= 50) {
            i_21 = i_13 * i_6 + i_5 * i_16 >> 16;
            i_16 = i_16 * i_6 - i_5 * i_13 >> 16;
            i_13 = i_21;
            i_21 = i_19 * i_4 - i_3 * i_16 >> 16;
            i_16 = i_3 * i_19 + i_16 * i_4 >> 16;
            i_19 = i_21;
            if (i_16 >= 50) {
               i_21 = i_9 * i_6 + i_5 * i_15 >> 16;
               i_15 = i_15 * i_6 - i_5 * i_9 >> 16;
               i_9 = i_21;
               i_21 = i_20 * i_4 - i_3 * i_15 >> 16;
               i_15 = i_3 * i_20 + i_15 * i_4 >> 16;
               if (i_15 >= 50) {
                  int i_22 = i_10 * class130.field1773 / i_12 + class130.field1774;
                  int i_23 = i_17 * class130.field1773 / i_12 + class130.field1775;
                  int i_24 = i_14 * class130.field1773 / i_11 + class130.field1774;
                  int i_25 = i_18 * class130.field1773 / i_11 + class130.field1775;
                  int i_26 = i_13 * class130.field1773 / i_16 + class130.field1774;
                  int i_27 = i_19 * class130.field1773 / i_16 + class130.field1775;
                  int i_28 = i_9 * class130.field1773 / i_15 + class130.field1774;
                  int i_29 = i_21 * class130.field1773 / i_15 + class130.field1775;
                  class130.field1766 = 0;
                  int i_30;
                  if ((i_26 - i_28) * (i_25 - i_29) - (i_27 - i_29) * (i_24 - i_28) > 0) {
                     class130.field1763 = false;
                     if (i_26 < 0 || i_28 < 0 || i_24 < 0 || i_26 > class130.field1788 || i_28 > class130.field1788 || i_24 > class130.field1788) {
                        class130.field1763 = true;
                     }

                     if (field1822 && method3238(field1825, field1835, i_27, i_29, i_25, i_26, i_28, i_24)) {
                        field1850 = i_7;
                        field1837 = i_8;
                     }

                     if (class131_1.field1789 == -1) {
                        if (class131_1.field1791 != 12345678) {
                           class130.method3020(i_27, i_29, i_25, i_26, i_28, i_24, class131_1.field1791, class131_1.field1792, class131_1.field1793);
                        }
                     } else if (!field1848) {
                        if (class131_1.field1790) {
                           class130.method2988(i_27, i_29, i_25, i_26, i_28, i_24, class131_1.field1791, class131_1.field1792, class131_1.field1793, i_10, i_14, i_9, i_17, i_18, i_21, i_12, i_11, i_15, class131_1.field1789);
                        } else {
                           class130.method2988(i_27, i_29, i_25, i_26, i_28, i_24, class131_1.field1791, class131_1.field1792, class131_1.field1793, i_13, i_9, i_14, i_19, i_21, i_18, i_16, i_15, i_11, class131_1.field1789);
                        }
                     } else {
                        i_30 = class130.field1781.vmethod3284(class131_1.field1789, 2075031290);
                        class130.method3020(i_27, i_29, i_25, i_26, i_28, i_24, method3111(i_30, class131_1.field1791), method3111(i_30, class131_1.field1792), method3111(i_30, class131_1.field1793));
                     }
                  }

                  if ((i_22 - i_24) * (i_29 - i_25) - (i_23 - i_25) * (i_28 - i_24) > 0) {
                     class130.field1763 = false;
                     if (i_22 < 0 || i_24 < 0 || i_28 < 0 || i_22 > class130.field1788 || i_24 > class130.field1788 || i_28 > class130.field1788) {
                        class130.field1763 = true;
                     }

                     if (field1822 && method3238(field1825, field1835, i_23, i_25, i_29, i_22, i_24, i_28)) {
                        field1850 = i_7;
                        field1837 = i_8;
                     }

                     if (class131_1.field1789 == -1) {
                        if (class131_1.field1795 != 12345678) {
                           class130.method3020(i_23, i_25, i_29, i_22, i_24, i_28, class131_1.field1795, class131_1.field1793, class131_1.field1792);
                        }
                     } else if (!field1848) {
                        class130.method2988(i_23, i_25, i_29, i_22, i_24, i_28, class131_1.field1795, class131_1.field1793, class131_1.field1792, i_10, i_14, i_9, i_17, i_18, i_21, i_12, i_11, i_15, class131_1.field1789);
                     } else {
                        i_30 = class130.field1781.vmethod3284(class131_1.field1789, 908756120);
                        class130.method3020(i_23, i_25, i_29, i_22, i_24, i_28, method3111(i_30, class131_1.field1795), method3111(i_30, class131_1.field1793), method3111(i_30, class131_1.field1792));
                     }
                  }

               }
            }
         }
      }
   }

   void method3110(class122 class122_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      int i_8 = class122_1.field1604.length;

      int i_9;
      int i_10;
      int i_11;
      int i_12;
      int i_13;
      for (i_9 = 0; i_9 < i_8; i_9++) {
         i_10 = class122_1.field1604[i_9] - field1824;
         i_11 = class122_1.field1590[i_9] - field1816;
         i_12 = class122_1.field1591[i_9] - field1826;
         i_13 = i_12 * i_4 + i_5 * i_10 >> 16;
         i_12 = i_5 * i_12 - i_10 * i_4 >> 16;
         i_10 = i_13;
         i_13 = i_3 * i_11 - i_12 * i_2 >> 16;
         i_12 = i_11 * i_2 + i_3 * i_12 >> 16;
         if (i_12 < 50) {
            return;
         }

         if (class122_1.field1598 != null) {
            class122.field1594[i_9] = i_10;
            class122.field1607[i_9] = i_13;
            class122.field1608[i_9] = i_12;
         }

         class122.field1606[i_9] = i_10 * class130.field1773 / i_12 + class130.field1774;
         class122.field1605[i_9] = i_13 * class130.field1773 / i_12 + class130.field1775;
      }

      class130.field1766 = 0;
      i_8 = class122_1.field1595.length;

      for (i_9 = 0; i_9 < i_8; i_9++) {
         i_10 = class122_1.field1595[i_9];
         i_11 = class122_1.field1610[i_9];
         i_12 = class122_1.field1597[i_9];
         i_13 = class122.field1606[i_10];
         int i_14 = class122.field1606[i_11];
         int i_15 = class122.field1606[i_12];
         int i_16 = class122.field1605[i_10];
         int i_17 = class122.field1605[i_11];
         int i_18 = class122.field1605[i_12];
         if ((i_13 - i_14) * (i_18 - i_17) - (i_16 - i_17) * (i_15 - i_14) > 0) {
            class130.field1763 = false;
            if (i_13 < 0 || i_14 < 0 || i_15 < 0 || i_13 > class130.field1788 || i_14 > class130.field1788 || i_15 > class130.field1788) {
               class130.field1763 = true;
            }

            if (field1822 && method3238(field1825, field1835, i_16, i_17, i_18, i_13, i_14, i_15)) {
               field1850 = i_6;
               field1837 = i_7;
            }

            if (class122_1.field1598 != null && class122_1.field1598[i_9] != -1) {
               if (!field1848) {
                  if (class122_1.field1599) {
                     class130.method2988(i_16, i_17, i_18, i_13, i_14, i_15, class122_1.field1600[i_9], class122_1.field1593[i_9], class122_1.field1609[i_9], class122.field1594[0], class122.field1594[1], class122.field1594[3], class122.field1607[0], class122.field1607[1], class122.field1607[3], class122.field1608[0], class122.field1608[1], class122.field1608[3], class122_1.field1598[i_9]);
                  } else {
                     class130.method2988(i_16, i_17, i_18, i_13, i_14, i_15, class122_1.field1600[i_9], class122_1.field1593[i_9], class122_1.field1609[i_9], class122.field1594[i_10], class122.field1594[i_11], class122.field1594[i_12], class122.field1607[i_10], class122.field1607[i_11], class122.field1607[i_12], class122.field1608[i_10], class122.field1608[i_11], class122.field1608[i_12], class122_1.field1598[i_9]);
                  }
               } else {
                  int i_19 = class130.field1781.vmethod3284(class122_1.field1598[i_9], 835805814);
                  class130.method3020(i_16, i_17, i_18, i_13, i_14, i_15, method3111(i_19, class122_1.field1600[i_9]), method3111(i_19, class122_1.field1593[i_9]), method3111(i_19, class122_1.field1609[i_9]));
               }
            } else if (class122_1.field1600[i_9] != 12345678) {
               class130.method3020(i_16, i_17, i_18, i_13, i_14, i_15, class122_1.field1600[i_9], class122_1.field1593[i_9], class122_1.field1609[i_9]);
            }
         }
      }

   }

   void method3120(Model model_1, int i_2, int i_3, int i_4) {
      class126 class126_5;
      Model model_6;
      if (i_3 < this.field1803) {
         class126_5 = this.field1853[i_2][i_3 + 1][i_4];
         if (class126_5 != null && class126_5.field1664 != null && class126_5.field1664.field1614 instanceof Model) {
            model_6 = (Model) class126_5.field1664.field1614;
            Model.method2790(model_1, model_6, 128, 0, 0, true);
         }
      }

      if (i_4 < this.field1803) {
         class126_5 = this.field1853[i_2][i_3][i_4 + 1];
         if (class126_5 != null && class126_5.field1664 != null && class126_5.field1664.field1614 instanceof Model) {
            model_6 = (Model) class126_5.field1664.field1614;
            Model.method2790(model_1, model_6, 0, 0, 128, true);
         }
      }

      if (i_3 < this.field1803 && i_4 < this.field1804) {
         class126_5 = this.field1853[i_2][i_3 + 1][i_4 + 1];
         if (class126_5 != null && class126_5.field1664 != null && class126_5.field1664.field1614 instanceof Model) {
            model_6 = (Model) class126_5.field1664.field1614;
            Model.method2790(model_1, model_6, 128, 0, 128, true);
         }
      }

      if (i_3 < this.field1803 && i_4 > 0) {
         class126_5 = this.field1853[i_2][i_3 + 1][i_4 - 1];
         if (class126_5 != null && class126_5.field1664 != null && class126_5.field1664.field1614 instanceof Model) {
            model_6 = (Model) class126_5.field1664.field1614;
            Model.method2790(model_1, model_6, 128, 0, -128, true);
         }
      }

   }

   boolean method3116(int i_1, int i_2, int i_3, int i_4) {
      if (!this.method3181(i_1, i_2, i_3)) {
         return false;
      } else {
         int i_5 = i_2 << 7;
         int i_6 = i_3 << 7;
         return this.method3102(i_5 + 1, this.field1857[i_1][i_2][i_3] - i_4, i_6 + 1) && this.method3102(i_5 + 128 - 1, this.field1857[i_1][i_2 + 1][i_3] - i_4, i_6 + 1) && this.method3102(i_5 + 128 - 1, this.field1857[i_1][i_2 + 1][i_3 + 1] - i_4, i_6 + 128 - 1) && this.method3102(i_5 + 1, this.field1857[i_1][i_2][i_3 + 1] - i_4, i_6 + 128 - 1);
      }
   }

   boolean method3117(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      int i_7;
      int i_8;
      if (i_3 == i_2 && i_5 == i_4) {
         if (!this.method3181(i_1, i_2, i_4)) {
            return false;
         } else {
            i_7 = i_2 << 7;
            i_8 = i_4 << 7;
            return this.method3102(i_7 + 1, this.field1857[i_1][i_2][i_4] - i_6, i_8 + 1) && this.method3102(i_7 + 128 - 1, this.field1857[i_1][i_2 + 1][i_4] - i_6, i_8 + 1) && this.method3102(i_7 + 128 - 1, this.field1857[i_1][i_2 + 1][i_4 + 1] - i_6, i_8 + 128 - 1) && this.method3102(i_7 + 1, this.field1857[i_1][i_2][i_4 + 1] - i_6, i_8 + 128 - 1);
         }
      } else {
         for (i_7 = i_2; i_7 <= i_3; i_7++) {
            for (i_8 = i_4; i_8 <= i_5; i_8++) {
               if (this.field1810[i_1][i_7][i_8] == -field1808) {
                  return false;
               }
            }
         }

         i_7 = (i_2 << 7) + 1;
         i_8 = (i_4 << 7) + 2;
         int i_9 = this.field1857[i_1][i_2][i_4] - i_6;
         if (!this.method3102(i_7, i_9, i_8)) {
            return false;
         } else {
            int i_10 = (i_3 << 7) - 1;
            if (!this.method3102(i_10, i_9, i_8)) {
               return false;
            } else {
               int i_11 = (i_5 << 7) - 1;
               if (!this.method3102(i_7, i_9, i_11)) {
                  return false;
               } else if (!this.method3102(i_10, i_9, i_11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   void method3113() {
      int i_1 = field1832[field1839];
      class140[] arr_2 = field1843[field1839];
      field1806 = 0;

      for (int i_3 = 0; i_3 < i_1; i_3++) {
         class140 class140_4 = arr_2[i_3];
         int i_5;
         int i_6;
         int i_7;
         int i_9;
         boolean bool_13;
         if (class140_4.field1896 == 1) {
            i_5 = class140_4.field1901 - field1849 + 25;
            if (i_5 >= 0 && i_5 <= 50) {
               i_6 = class140_4.field1908 - field1823 + 25;
               if (i_6 < 0) {
                  i_6 = 0;
               }

               i_7 = class140_4.field1899 - field1823 + 25;
               if (i_7 > 50) {
                  i_7 = 50;
               }

               bool_13 = false;

               while (i_6 <= i_7) {
                  if (field1861[i_5][i_6++]) {
                     bool_13 = true;
                     break;
                  }
               }

               if (bool_13) {
                  i_9 = field1824 - class140_4.field1904;
                  if (i_9 > 32) {
                     class140_4.field1910 = 1;
                  } else {
                     if (i_9 >= -32) {
                        continue;
                     }

                     class140_4.field1910 = 2;
                     i_9 = -i_9;
                  }

                  class140_4.field1900 = (class140_4.field1903 - field1826 << 8) / i_9;
                  class140_4.field1911 = (class140_4.field1897 - field1826 << 8) / i_9;
                  class140_4.field1912 = (class140_4.field1898 - field1816 << 8) / i_9;
                  class140_4.field1913 = (class140_4.field1906 - field1816 << 8) / i_9;
                  field1845[field1806++] = class140_4;
               }
            }
         } else if (class140_4.field1896 == 2) {
            i_5 = class140_4.field1908 - field1823 + 25;
            if (i_5 >= 0 && i_5 <= 50) {
               i_6 = class140_4.field1901 - field1849 + 25;
               if (i_6 < 0) {
                  i_6 = 0;
               }

               i_7 = class140_4.field1905 - field1849 + 25;
               if (i_7 > 50) {
                  i_7 = 50;
               }

               bool_13 = false;

               while (i_6 <= i_7) {
                  if (field1861[i_6++][i_5]) {
                     bool_13 = true;
                     break;
                  }
               }

               if (bool_13) {
                  i_9 = field1826 - class140_4.field1903;
                  if (i_9 > 32) {
                     class140_4.field1910 = 3;
                  } else {
                     if (i_9 >= -32) {
                        continue;
                     }

                     class140_4.field1910 = 4;
                     i_9 = -i_9;
                  }

                  class140_4.field1907 = (class140_4.field1904 - field1824 << 8) / i_9;
                  class140_4.field1909 = (class140_4.field1902 - field1824 << 8) / i_9;
                  class140_4.field1912 = (class140_4.field1898 - field1816 << 8) / i_9;
                  class140_4.field1913 = (class140_4.field1906 - field1816 << 8) / i_9;
                  field1845[field1806++] = class140_4;
               }
            }
         } else if (class140_4.field1896 == 4) {
            i_5 = class140_4.field1898 - field1816;
            if (i_5 > 128) {
               i_6 = class140_4.field1908 - field1823 + 25;
               if (i_6 < 0) {
                  i_6 = 0;
               }

               i_7 = class140_4.field1899 - field1823 + 25;
               if (i_7 > 50) {
                  i_7 = 50;
               }

               if (i_6 <= i_7) {
                  int i_8 = class140_4.field1901 - field1849 + 25;
                  if (i_8 < 0) {
                     i_8 = 0;
                  }

                  i_9 = class140_4.field1905 - field1849 + 25;
                  if (i_9 > 50) {
                     i_9 = 50;
                  }

                  boolean bool_10 = false;

                  label144:
                  for (int i_11 = i_8; i_11 <= i_9; i_11++) {
                     for (int i_12 = i_6; i_12 <= i_7; i_12++) {
                        if (field1861[i_11][i_12]) {
                           bool_10 = true;
                           break label144;
                        }
                     }
                  }

                  if (bool_10) {
                     class140_4.field1910 = 5;
                     class140_4.field1907 = (class140_4.field1904 - field1824 << 8) / i_5;
                     class140_4.field1909 = (class140_4.field1902 - field1824 << 8) / i_5;
                     class140_4.field1900 = (class140_4.field1903 - field1826 << 8) / i_5;
                     class140_4.field1911 = (class140_4.field1897 - field1826 << 8) / i_5;
                     field1845[field1806++] = class140_4;
                  }
               }
            }
         }
      }

   }

   public void method3087(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      if (class126_4 != null) {
         class126_4.field1669 = null;
      }
   }

   public long method3130(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      return class126_4 != null && class126_4.field1656 != null ? class126_4.field1656.field1882 : 0L;
   }

   public long method3180(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      return class126_4 != null && class126_4.field1652 != null ? class126_4.field1652.field1917 : 0L;
   }

   public void method3073(int i_1, int i_2, int i_3, int i_4, class135 class135_5, long long_6, class135 class135_8, class135 class135_9) {
      class120 class120_10 = new class120();
      class120_10.field1543 = class135_5;
      class120_10.field1541 = i_2 * 128 + 64;
      class120_10.field1540 = i_3 * 128 + 64;
      class120_10.field1547 = i_4;
      class120_10.field1544 = long_6;
      class120_10.field1542 = class135_8;
      class120_10.field1545 = class135_9;
      int i_11 = 0;
      class126 class126_12 = this.field1853[i_1][i_2][i_3];
      if (class126_12 != null) {
         for (int i_13 = 0; i_13 < class126_12.field1655; i_13++) {
            if ((class126_12.field1663[i_13].field1942 & 0x100) == 256 && class126_12.field1663[i_13].field1933 instanceof class127) {
               class127 class127_14 = (class127) class126_12.field1663[i_13].field1933;
               class127_14.method2899();
               if (class127_14.field1873 > i_11) {
                  i_11 = class127_14.field1873;
               }
            }
         }
      }

      class120_10.field1546 = i_11;
      if (this.field1853[i_1][i_2][i_3] == null) {
         this.field1853[i_1][i_2][i_3] = new class126(i_1, i_2, i_3);
      }

      this.field1853[i_1][i_2][i_3].field1669 = class120_10;
   }

   public long method3094(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      if (class126_4 == null) {
         return 0L;
      } else {
         for (int i_5 = 0; i_5 < class126_4.field1655; i_5++) {
            class142 class142_6 = class126_4.field1663[i_5];
            long long_8 = class142_6.field1941;
            boolean bool_7 = class28.method420(long_8) == 2;
            if (bool_7 && i_2 == class142_6.field1935 && i_3 == class142_6.field1930) {
               return class142_6.field1941;
            }
         }

         return 0L;
      }
   }

   void method3108(class126 class126_1, boolean bool_2) {
      field1846.method4917(class126_1);

      while (true) {
         class126 class126_3;
         int i_4;
         int i_5;
         int i_6;
         int i_7;
         class126[][] arr_8;
         class126 class126_9;
         int i_11;
         int i_14;
         int i_15;
         int i_16;
         int i_24;
         int i_25;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while (true) {
                              class136 class136_10;
                              class142 class142_12;
                              int i_17;
                              int i_18;
                              boolean bool_20;
                              int i_21;
                              class126 class126_36;
                              while (true) {
                                 do {
                                    class126_3 = (class126) field1846.method4900();
                                    if (class126_3 == null) {
                                       return;
                                    }
                                 } while (!class126_3.field1661);

                                 i_4 = class126_3.field1668;
                                 i_5 = class126_3.field1653;
                                 i_6 = class126_3.field1670;
                                 i_7 = class126_3.field1648;
                                 arr_8 = this.field1853[i_6];
                                 if (!class126_3.field1660) {
                                    break;
                                 }

                                 if (bool_2) {
                                    if (i_6 > 0) {
                                       class126_9 = this.field1853[i_6 - 1][i_4][i_5];
                                       if (class126_9 != null && class126_9.field1661) {
                                          continue;
                                       }
                                    }

                                    if (i_4 <= field1849 && i_4 > field1818) {
                                       class126_9 = arr_8[i_4 - 1][i_5];
                                       if (class126_9 != null && class126_9.field1661 && (class126_9.field1660 || (class126_3.field1658 & 0x1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (i_4 >= field1849 && i_4 < field1819 - 1) {
                                       class126_9 = arr_8[i_4 + 1][i_5];
                                       if (class126_9 != null && class126_9.field1661 && (class126_9.field1660 || (class126_3.field1658 & 0x4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (i_5 <= field1823 && i_5 > field1820) {
                                       class126_9 = arr_8[i_4][i_5 - 1];
                                       if (class126_9 != null && class126_9.field1661 && (class126_9.field1660 || (class126_3.field1658 & 0x8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (i_5 >= field1823 && i_5 < field1851 - 1) {
                                       class126_9 = arr_8[i_4][i_5 + 1];
                                       if (class126_9 != null && class126_9.field1661 && (class126_9.field1660 || (class126_3.field1658 & 0x2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    bool_2 = true;
                                 }

                                 class126_3.field1660 = false;
                                 if (class126_3.field1667 != null) {
                                    class126_9 = class126_3.field1667;
                                    if (class126_9.field1646 != null) {
                                       if (!this.method3181(0, i_4, i_5)) {
                                          this.method3065(class126_9.field1646, 0, field1827, field1801, field1829, field1830, i_4, i_5);
                                       }
                                    } else if (class126_9.field1650 != null && !this.method3181(0, i_4, i_5)) {
                                       this.method3110(class126_9.field1650, field1827, field1801, field1829, field1830, i_4, i_5);
                                    }

                                    class136_10 = class126_9.field1656;
                                    if (class136_10 != null) {
                                       class136_10.field1884.vmethod3258(0, field1827, field1801, field1829, field1830, class136_10.field1876 - field1824, class136_10.field1879 - field1816, class136_10.field1877 - field1826, class136_10.field1882);
                                    }

                                    for (i_11 = 0; i_11 < class126_9.field1655; i_11++) {
                                       class142_12 = class126_9.field1663[i_11];
                                       if (class142_12 != null) {
                                          class142_12.field1933.vmethod3258(class142_12.field1934, field1827, field1801, field1829, field1830, class142_12.field1931 - field1824, class142_12.field1932 - field1816, class142_12.field1929 - field1826, class142_12.field1941);
                                       }
                                    }
                                 }

                                 bool_20 = false;
                                 if (class126_3.field1646 != null) {
                                    if (!this.method3181(i_7, i_4, i_5)) {
                                       bool_20 = true;
                                       if (class126_3.field1646.field1791 != 12345678 || field1822 && i_6 <= field1833) {
                                          this.method3065(class126_3.field1646, i_7, field1827, field1801, field1829, field1830, i_4, i_5);
                                       }
                                    }
                                 } else if (class126_3.field1650 != null && !this.method3181(i_7, i_4, i_5)) {
                                    bool_20 = true;
                                    this.method3110(class126_3.field1650, field1827, field1801, field1829, field1830, i_4, i_5);
                                 }

                                 i_21 = 0;
                                 i_11 = 0;
                                 class136 class136_31 = class126_3.field1656;
                                 class141 class141_13 = class126_3.field1652;
                                 if (class136_31 != null || class141_13 != null) {
                                    if (i_4 == field1849) {
                                       ++i_21;
                                    } else if (field1849 < i_4) {
                                       i_21 += 2;
                                    }

                                    if (i_5 == field1823) {
                                       i_21 += 3;
                                    } else if (field1823 > i_5) {
                                       i_21 += 6;
                                    }

                                    i_11 = field1847[i_21];
                                    class126_3.field1666 = field1809[i_21];
                                 }

                                 if (class136_31 != null) {
                                    if ((class136_31.field1880 & field1815[i_21]) != 0) {
                                       if (class136_31.field1880 == 16) {
                                          class126_3.field1654 = 3;
                                          class126_3.field1651 = field1844[i_21];
                                          class126_3.field1665 = 3 - class126_3.field1651;
                                       } else if (class136_31.field1880 == 32) {
                                          class126_3.field1654 = 6;
                                          class126_3.field1651 = field1828[i_21];
                                          class126_3.field1665 = 6 - class126_3.field1651;
                                       } else if (class136_31.field1880 == 64) {
                                          class126_3.field1654 = 12;
                                          class126_3.field1651 = field1852[i_21];
                                          class126_3.field1665 = 12 - class126_3.field1651;
                                       } else {
                                          class126_3.field1654 = 9;
                                          class126_3.field1651 = field1842[i_21];
                                          class126_3.field1665 = 9 - class126_3.field1651;
                                       }
                                    } else {
                                       class126_3.field1654 = 0;
                                    }

                                    if ((class136_31.field1880 & i_11) != 0 && !this.method3194(i_7, i_4, i_5, class136_31.field1880)) {
                                       class136_31.field1884.vmethod3258(0, field1827, field1801, field1829, field1830, class136_31.field1876 - field1824, class136_31.field1879 - field1816, class136_31.field1877 - field1826, class136_31.field1882);
                                    }

                                    if ((class136_31.field1878 & i_11) != 0 && !this.method3194(i_7, i_4, i_5, class136_31.field1878)) {
                                       class136_31.field1881.vmethod3258(0, field1827, field1801, field1829, field1830, class136_31.field1876 - field1824, class136_31.field1879 - field1816, class136_31.field1877 - field1826, class136_31.field1882);
                                    }
                                 }

                                 if (class141_13 != null && !this.method3116(i_7, i_4, i_5, class141_13.field1924.field1873)) {
                                    if ((class141_13.field1926 & i_11) != 0) {
                                       class141_13.field1924.vmethod3258(0, field1827, field1801, field1829, field1830, class141_13.field1918 - field1824 + class141_13.field1922, class141_13.field1923 - field1816, class141_13.field1920 - field1826 + class141_13.field1927, class141_13.field1917);
                                    } else if (class141_13.field1926 == 256) {
                                       i_14 = class141_13.field1918 - field1824;
                                       i_15 = class141_13.field1923 - field1816;
                                       i_16 = class141_13.field1920 - field1826;
                                       i_17 = class141_13.field1919;
                                       if (i_17 != 1 && i_17 != 2) {
                                          i_18 = i_14;
                                       } else {
                                          i_18 = -i_14;
                                       }

                                       int i_19;
                                       if (i_17 != 2 && i_17 != 3) {
                                          i_19 = i_16;
                                       } else {
                                          i_19 = -i_16;
                                       }

                                       if (i_19 < i_18) {
                                          class141_13.field1924.vmethod3258(0, field1827, field1801, field1829, field1830, i_14 + class141_13.field1922, i_15, i_16 + class141_13.field1927, class141_13.field1917);
                                       } else if (class141_13.field1925 != null) {
                                          class141_13.field1925.vmethod3258(0, field1827, field1801, field1829, field1830, i_14, i_15, i_16, class141_13.field1917);
                                       }
                                    }
                                 }

                                 if (bool_20) {
                                    class123 class123_22 = class126_3.field1664;
                                    if (class123_22 != null) {
                                       class123_22.field1614.vmethod3258(0, field1827, field1801, field1829, field1830, class123_22.field1612 - field1824, class123_22.field1618 - field1816, class123_22.field1613 - field1826, class123_22.field1617);
                                    }

                                    class120 class120_23 = class126_3.field1669;
                                    if (class120_23 != null && class120_23.field1546 == 0) {
                                       if (class120_23.field1542 != null) {
                                          class120_23.field1542.vmethod3258(0, field1827, field1801, field1829, field1830, class120_23.field1541 - field1824, class120_23.field1547 - field1816, class120_23.field1540 - field1826, class120_23.field1544);
                                       }

                                       if (class120_23.field1545 != null) {
                                          class120_23.field1545.vmethod3258(0, field1827, field1801, field1829, field1830, class120_23.field1541 - field1824, class120_23.field1547 - field1816, class120_23.field1540 - field1826, class120_23.field1544);
                                       }

                                       if (class120_23.field1543 != null) {
                                          class120_23.field1543.vmethod3258(0, field1827, field1801, field1829, field1830, class120_23.field1541 - field1824, class120_23.field1547 - field1816, class120_23.field1540 - field1826, class120_23.field1544);
                                       }
                                    }
                                 }

                                 i_14 = class126_3.field1658;
                                 if (i_14 != 0) {
                                    if (i_4 < field1849 && (i_14 & 0x4) != 0) {
                                       class126_36 = arr_8[i_4 + 1][i_5];
                                       if (class126_36 != null && class126_36.field1661) {
                                          field1846.method4917(class126_36);
                                       }
                                    }

                                    if (i_5 < field1823 && (i_14 & 0x2) != 0) {
                                       class126_36 = arr_8[i_4][i_5 + 1];
                                       if (class126_36 != null && class126_36.field1661) {
                                          field1846.method4917(class126_36);
                                       }
                                    }

                                    if (i_4 > field1849 && (i_14 & 0x1) != 0) {
                                       class126_36 = arr_8[i_4 - 1][i_5];
                                       if (class126_36 != null && class126_36.field1661) {
                                          field1846.method4917(class126_36);
                                       }
                                    }

                                    if (i_5 > field1823 && (i_14 & 0x8) != 0) {
                                       class126_36 = arr_8[i_4][i_5 - 1];
                                       if (class126_36 != null && class126_36.field1661) {
                                          field1846.method4917(class126_36);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (class126_3.field1654 != 0) {
                                 bool_20 = true;

                                 for (i_21 = 0; i_21 < class126_3.field1655; i_21++) {
                                    if (class126_3.field1663[i_21].field1940 != field1808 && (class126_3.field1657[i_21] & class126_3.field1654) == class126_3.field1651) {
                                       bool_20 = false;
                                       break;
                                    }
                                 }

                                 if (bool_20) {
                                    class136_10 = class126_3.field1656;
                                    if (!this.method3194(i_7, i_4, i_5, class136_10.field1880)) {
                                       class136_10.field1884.vmethod3258(0, field1827, field1801, field1829, field1830, class136_10.field1876 - field1824, class136_10.field1879 - field1816, class136_10.field1877 - field1826, class136_10.field1882);
                                    }

                                    class126_3.field1654 = 0;
                                 }
                              }

                              if (!class126_3.field1662) {
                                 break;
                              }

                              try {
                                 int i_34 = class126_3.field1655;
                                 class126_3.field1662 = false;
                                 i_21 = 0;

                                 label563:
                                 for (i_11 = 0; i_11 < i_34; i_11++) {
                                    class142_12 = class126_3.field1663[i_11];
                                    if (class142_12.field1940 != field1808) {
                                       for (i_24 = class142_12.field1935; i_24 <= class142_12.field1936; i_24++) {
                                          for (i_14 = class142_12.field1930; i_14 <= class142_12.field1938; i_14++) {
                                             class126_36 = arr_8[i_24][i_14];
                                             if (class126_36.field1660) {
                                                class126_3.field1662 = true;
                                                continue label563;
                                             }

                                             if (class126_36.field1654 != 0) {
                                                i_16 = 0;
                                                if (i_24 > class142_12.field1935) {
                                                   ++i_16;
                                                }

                                                if (i_24 < class142_12.field1936) {
                                                   i_16 += 4;
                                                }

                                                if (i_14 > class142_12.field1930) {
                                                   i_16 += 8;
                                                }

                                                if (i_14 < class142_12.field1938) {
                                                   i_16 += 2;
                                                }

                                                if ((i_16 & class126_36.field1654) == class126_3.field1665) {
                                                   class126_3.field1662 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field1831[i_21++] = class142_12;
                                       i_24 = field1849 - class142_12.field1935;
                                       i_14 = class142_12.field1936 - field1849;
                                       if (i_14 > i_24) {
                                          i_24 = i_14;
                                       }

                                       i_15 = field1823 - class142_12.field1930;
                                       i_16 = class142_12.field1938 - field1823;
                                       if (i_16 > i_15) {
                                          class142_12.field1939 = i_24 + i_16;
                                       } else {
                                          class142_12.field1939 = i_24 + i_15;
                                       }
                                    }
                                 }

                                 while (i_21 > 0) {
                                    i_11 = -50;
                                    i_25 = -1;

                                    for (i_24 = 0; i_24 < i_21; i_24++) {
                                       class142 class142_35 = field1831[i_24];
                                       if (class142_35.field1940 != field1808) {
                                          if (class142_35.field1939 > i_11) {
                                             i_11 = class142_35.field1939;
                                             i_25 = i_24;
                                          } else if (i_11 == class142_35.field1939) {
                                             i_15 = class142_35.field1931 - field1824;
                                             i_16 = class142_35.field1929 - field1826;
                                             i_17 = field1831[i_25].field1931 - field1824;
                                             i_18 = field1831[i_25].field1929 - field1826;
                                             if (i_15 * i_15 + i_16 * i_16 > i_17 * i_17 + i_18 * i_18) {
                                                i_25 = i_24;
                                             }
                                          }
                                       }
                                    }

                                    if (i_25 == -1) {
                                       break;
                                    }

                                    class142 class142_33 = field1831[i_25];
                                    class142_33.field1940 = field1808;
                                    if (!this.method3117(i_7, class142_33.field1935, class142_33.field1936, class142_33.field1930, class142_33.field1938, class142_33.field1933.field1873)) {
                                       class142_33.field1933.vmethod3258(class142_33.field1934, field1827, field1801, field1829, field1830, class142_33.field1931 - field1824, class142_33.field1932 - field1816, class142_33.field1929 - field1826, class142_33.field1941);
                                    }

                                    for (i_14 = class142_33.field1935; i_14 <= class142_33.field1936; i_14++) {
                                       for (i_15 = class142_33.field1930; i_15 <= class142_33.field1938; i_15++) {
                                          class126 class126_26 = arr_8[i_14][i_15];
                                          if (class126_26.field1654 != 0) {
                                             field1846.method4917(class126_26);
                                          } else if ((i_14 != i_4 || i_15 != i_5) && class126_26.field1661) {
                                             field1846.method4917(class126_26);
                                          }
                                       }
                                    }
                                 }

                                 if (!class126_3.field1662) {
                                    break;
                                 }
                              } catch (Exception exception_28) {
                                 class126_3.field1662 = false;
                                 break;
                              }
                           }
                        } while (!class126_3.field1661);
                     } while (class126_3.field1654 != 0);

                     if (i_4 > field1849 || i_4 <= field1818) {
                        break;
                     }

                     class126_9 = arr_8[i_4 - 1][i_5];
                  } while (class126_9 != null && class126_9.field1661);

                  if (i_4 < field1849 || i_4 >= field1819 - 1) {
                     break;
                  }

                  class126_9 = arr_8[i_4 + 1][i_5];
               } while (class126_9 != null && class126_9.field1661);

               if (i_5 > field1823 || i_5 <= field1820) {
                  break;
               }

               class126_9 = arr_8[i_4][i_5 - 1];
            } while (class126_9 != null && class126_9.field1661);

            if (i_5 < field1823 || i_5 >= field1851 - 1) {
               break;
            }

            class126_9 = arr_8[i_4][i_5 + 1];
         } while (class126_9 != null && class126_9.field1661);

         class126_3.field1661 = false;
         --field1821;
         class120 class120_32 = class126_3.field1669;
         if (class120_32 != null && class120_32.field1546 != 0) {
            if (class120_32.field1542 != null) {
               class120_32.field1542.vmethod3258(0, field1827, field1801, field1829, field1830, class120_32.field1541 - field1824, class120_32.field1547 - field1816 - class120_32.field1546, class120_32.field1540 - field1826, class120_32.field1544);
            }

            if (class120_32.field1545 != null) {
               class120_32.field1545.vmethod3258(0, field1827, field1801, field1829, field1830, class120_32.field1541 - field1824, class120_32.field1547 - field1816 - class120_32.field1546, class120_32.field1540 - field1826, class120_32.field1544);
            }

            if (class120_32.field1543 != null) {
               class120_32.field1543.vmethod3258(0, field1827, field1801, field1829, field1830, class120_32.field1541 - field1824, class120_32.field1547 - field1816 - class120_32.field1546, class120_32.field1540 - field1826, class120_32.field1544);
            }
         }

         if (class126_3.field1666 != 0) {
            class141 class141_29 = class126_3.field1652;
            if (class141_29 != null && !this.method3116(i_7, i_4, i_5, class141_29.field1924.field1873)) {
               if ((class141_29.field1926 & class126_3.field1666) != 0) {
                  class141_29.field1924.vmethod3258(0, field1827, field1801, field1829, field1830, class141_29.field1918 - field1824 + class141_29.field1922, class141_29.field1923 - field1816, class141_29.field1920 - field1826 + class141_29.field1927, class141_29.field1917);
               } else if (class141_29.field1926 == 256) {
                  i_11 = class141_29.field1918 - field1824;
                  i_25 = class141_29.field1923 - field1816;
                  i_24 = class141_29.field1920 - field1826;
                  i_14 = class141_29.field1919;
                  if (i_14 != 1 && i_14 != 2) {
                     i_15 = i_11;
                  } else {
                     i_15 = -i_11;
                  }

                  if (i_14 != 2 && i_14 != 3) {
                     i_16 = i_24;
                  } else {
                     i_16 = -i_24;
                  }

                  if (i_16 >= i_15) {
                     class141_29.field1924.vmethod3258(0, field1827, field1801, field1829, field1830, i_11 + class141_29.field1922, i_25, i_24 + class141_29.field1927, class141_29.field1917);
                  } else if (class141_29.field1925 != null) {
                     class141_29.field1925.vmethod3258(0, field1827, field1801, field1829, field1830, i_11, i_25, i_24, class141_29.field1917);
                  }
               }
            }

            class136 class136_27 = class126_3.field1656;
            if (class136_27 != null) {
               if ((class136_27.field1878 & class126_3.field1666) != 0 && !this.method3194(i_7, i_4, i_5, class136_27.field1878)) {
                  class136_27.field1881.vmethod3258(0, field1827, field1801, field1829, field1830, class136_27.field1876 - field1824, class136_27.field1879 - field1816, class136_27.field1877 - field1826, class136_27.field1882);
               }

               if ((class136_27.field1880 & class126_3.field1666) != 0 && !this.method3194(i_7, i_4, i_5, class136_27.field1880)) {
                  class136_27.field1884.vmethod3258(0, field1827, field1801, field1829, field1830, class136_27.field1876 - field1824, class136_27.field1879 - field1816, class136_27.field1877 - field1826, class136_27.field1882);
               }
            }
         }

         class126 class126_30;
         if (i_6 < this.field1802 - 1) {
            class126_30 = this.field1853[i_6 + 1][i_4][i_5];
            if (class126_30 != null && class126_30.field1661) {
               field1846.method4917(class126_30);
            }
         }

         if (i_4 < field1849) {
            class126_30 = arr_8[i_4 + 1][i_5];
            if (class126_30 != null && class126_30.field1661) {
               field1846.method4917(class126_30);
            }
         }

         if (i_5 < field1823) {
            class126_30 = arr_8[i_4][i_5 + 1];
            if (class126_30 != null && class126_30.field1661) {
               field1846.method4917(class126_30);
            }
         }

         if (i_4 > field1849) {
            class126_30 = arr_8[i_4 - 1][i_5];
            if (class126_30 != null && class126_30.field1661) {
               field1846.method4917(class126_30);
            }
         }

         if (i_5 > field1823) {
            class126_30 = arr_8[i_4][i_5 - 1];
            if (class126_30 != null && class126_30.field1661) {
               field1846.method4917(class126_30);
            }
         }
      }
   }

   public long method3095(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      return class126_4 != null && class126_4.field1664 != null ? class126_4.field1664.field1617 : 0L;
   }

   public int method3096(int i_1, int i_2, int i_3, long long_4) {
      class126 class126_6 = this.field1853[i_1][i_2][i_3];
      if (class126_6 == null) {
         return -1;
      } else if (class126_6.field1656 != null && class126_6.field1656.field1882 == long_4) {
         return class126_6.field1656.field1883 & 0xff;
      } else if (class126_6.field1652 != null && class126_6.field1652.field1917 == long_4) {
         return class126_6.field1652.field1921 & 0xff;
      } else if (class126_6.field1664 != null && class126_6.field1664.field1617 == long_4) {
         return class126_6.field1664.field1616 & 0xff;
      } else {
         for (int i_7 = 0; i_7 < class126_6.field1655; i_7++) {
            if (class126_6.field1663[i_7].field1941 == long_4) {
               return class126_6.field1663[i_7].field1942 & 0xff;
            }
         }

         return -1;
      }
   }

   public void method3232(int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      class126 class126_7 = this.field1853[i_4][i_5][i_6];
      if (class126_7 != null) {
         class131 class131_8 = class126_7.field1646;
         int i_10;
         if (class131_8 != null) {
            int i_9 = class131_8.field1794;
            if (i_9 != 0) {
               for (i_10 = 0; i_10 < 4; i_10++) {
                  ints_1[i_2] = i_9;
                  ints_1[i_2 + 1] = i_9;
                  ints_1[i_2 + 2] = i_9;
                  ints_1[i_2 + 3] = i_9;
                  i_2 += i_3;
               }

            }
         } else {
            class122 class122_18 = class126_7.field1650;
            if (class122_18 != null) {
               i_10 = class122_18.field1596;
               int i_11 = class122_18.field1601;
               int i_12 = class122_18.field1602;
               int i_13 = class122_18.field1603;
               int[] ints_14 = this.field1858[i_10];
               int[] ints_15 = this.field1836[i_11];
               int i_16 = 0;
               int i_17;
               if (i_12 != 0) {
                  for (i_17 = 0; i_17 < 4; i_17++) {
                     ints_1[i_2] = ints_14[ints_15[i_16++]] == 0 ? i_12 : i_13;
                     ints_1[i_2 + 1] = ints_14[ints_15[i_16++]] == 0 ? i_12 : i_13;
                     ints_1[i_2 + 2] = ints_14[ints_15[i_16++]] == 0 ? i_12 : i_13;
                     ints_1[i_2 + 3] = ints_14[ints_15[i_16++]] == 0 ? i_12 : i_13;
                     i_2 += i_3;
                  }
               } else {
                  for (i_17 = 0; i_17 < 4; i_17++) {
                     if (ints_14[ints_15[i_16++]] != 0) {
                        ints_1[i_2] = i_13;
                     }

                     if (ints_14[ints_15[i_16++]] != 0) {
                        ints_1[i_2 + 1] = i_13;
                     }

                     if (ints_14[ints_15[i_16++]] != 0) {
                        ints_1[i_2 + 2] = i_13;
                     }

                     if (ints_14[ints_15[i_16++]] != 0) {
                        ints_1[i_2 + 3] = i_13;
                     }

                     i_2 += i_3;
                  }
               }

            }
         }
      }
   }

   public void method3066() {
      int i_1;
      int i_2;
      for (i_1 = 0; i_1 < this.field1802; i_1++) {
         for (i_2 = 0; i_2 < this.field1803; i_2++) {
            for (int i_3 = 0; i_3 < this.field1804; i_3++) {
               this.field1853[i_1][i_2][i_3] = null;
            }
         }
      }

      for (i_1 = 0; i_1 < field1841; i_1++) {
         for (i_2 = 0; i_2 < field1832[i_1]; i_2++) {
            field1843[i_1][i_2] = null;
         }

         field1832[i_1] = 0;
      }

      for (i_1 = 0; i_1 < this.field1859; i_1++) {
         this.field1866[i_1] = null;
      }

      this.field1859 = 0;

      for (i_1 = 0; i_1 < field1831.length; i_1++) {
         field1831[i_1] = null;
      }

   }

   public class136 method3088(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      return class126_4 == null ? null : class126_4.field1656;
   }

   public class141 method3118(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      return class126_4 == null ? null : class126_4.field1652;
   }

   public class142 method3195(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      if (class126_4 == null) {
         return null;
      } else {
         for (int i_5 = 0; i_5 < class126_4.field1655; i_5++) {
            class142 class142_6 = class126_4.field1663[i_5];
            long long_8 = class142_6.field1941;
            boolean bool_7 = class28.method420(long_8) == 2;
            if (bool_7 && i_2 == class142_6.field1935 && i_3 == class142_6.field1930) {
               return class142_6;
            }
         }

         return null;
      }
   }

   public class123 method3091(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      return class126_4 != null && class126_4.field1664 != null ? class126_4.field1664 : null;
   }

   public boolean method3077(int i_1, int i_2, int i_3, int i_4, int i_5, class135 class135_6, int i_7, long long_8, boolean bool_10) {
      if (class135_6 == null) {
         return true;
      } else {
         int i_11 = i_2 - i_5;
         int i_12 = i_3 - i_5;
         int i_13 = i_5 + i_2;
         int i_14 = i_3 + i_5;
         if (bool_10) {
            if (i_7 > 640 && i_7 < 1408) {
               i_14 += 128;
            }

            if (i_7 > 1152 && i_7 < 1920) {
               i_13 += 128;
            }

            if (i_7 > 1664 || i_7 < 384) {
               i_12 -= 128;
            }

            if (i_7 > 128 && i_7 < 896) {
               i_11 -= 128;
            }
         }

         i_11 /= 128;
         i_12 /= 128;
         i_13 /= 128;
         i_14 /= 128;
         return this.method3157(i_1, i_11, i_12, i_13 - i_11 + 1, i_14 - i_12 + 1, i_2, i_3, i_4, class135_6, i_7, true, long_8, 0);
      }
   }

   public void method3208(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      if (class126_4 != null) {
         class126_4.field1656 = null;
      }
   }

   public boolean method3079(int i_1, int i_2, int i_3, int i_4, int i_5, class135 class135_6, int i_7, long long_8, int i_10, int i_11, int i_12, int i_13) {
      return class135_6 == null ? true : this.method3157(i_1, i_10, i_11, i_12 - i_10 + 1, i_13 - i_11 + 1, i_2, i_3, i_4, class135_6, i_7, true, long_8, 0);
   }

   public void method3084(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      if (class126_4 != null) {
         class126_4.field1652 = null;
      }
   }

   public void method3154(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      if (class126_4 != null) {
         for (int i_5 = 0; i_5 < class126_4.field1655; i_5++) {
            class142 class142_6 = class126_4.field1663[i_5];
            long long_8 = class142_6.field1941;
            boolean bool_7 = class28.method420(long_8) == 2;
            if (bool_7 && i_2 == class142_6.field1935 && i_3 == class142_6.field1930) {
               this.method3081(class142_6);
               return;
            }
         }

      }
   }

   public void method3201(int i_1, int i_2, int i_3) {
      class126 class126_4 = this.field1853[i_1][i_2][i_3];
      if (class126_4 != null) {
         class126_4.field1664 = null;
      }
   }

   public void method3072(int i_1, int i_2, int i_3, int i_4, class135 class135_5, long long_6, int i_8) {
      if (class135_5 != null) {
         class123 class123_9 = new class123();
         class123_9.field1614 = class135_5;
         class123_9.field1612 = i_2 * 128 + 64;
         class123_9.field1613 = i_3 * 128 + 64;
         class123_9.field1618 = i_4;
         class123_9.field1617 = long_6;
         class123_9.field1616 = i_8;
         if (this.field1853[i_1][i_2][i_3] == null) {
            this.field1853[i_1][i_2][i_3] = new class126(i_1, i_2, i_3);
         }

         this.field1853[i_1][i_2][i_3].field1664 = class123_9;
      }
   }

   public boolean method3076(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, class135 class135_7, int i_8, long long_9, int i_11) {
      if (class135_7 == null) {
         return true;
      } else {
         int i_12 = i_5 * 64 + i_2 * 128;
         int i_13 = i_6 * 64 + i_3 * 128;
         return this.method3157(i_1, i_2, i_3, i_5, i_6, i_12, i_13, i_4, class135_7, i_8, false, long_9, i_11);
      }
   }

   public void method3093(int i_1, int i_2, int i_3, int i_4, class135 class135_5, class135 class135_6, int i_7, int i_8, long long_9, int i_11) {
      if (class135_5 != null || class135_6 != null) {
         class136 class136_12 = new class136();
         class136_12.field1882 = long_9;
         class136_12.field1883 = i_11;
         class136_12.field1876 = i_2 * 128 + 64;
         class136_12.field1877 = i_3 * 128 + 64;
         class136_12.field1879 = i_4;
         class136_12.field1884 = class135_5;
         class136_12.field1881 = class135_6;
         class136_12.field1880 = i_7;
         class136_12.field1878 = i_8;

         for (int i_13 = i_1; i_13 >= 0; --i_13) {
            if (this.field1853[i_13][i_2][i_3] == null) {
               this.field1853[i_13][i_2][i_3] = new class126(i_13, i_2, i_3);
            }
         }

         this.field1853[i_1][i_2][i_3].field1656 = class136_12;
      }
   }

   public void method3142(int i_1, int i_2, int i_3, int i_4, class135 class135_5, class135 class135_6, int i_7, int i_8, int i_9, int i_10, long long_11, int i_13) {
      if (class135_5 != null) {
         class141 class141_14 = new class141();
         class141_14.field1917 = long_11;
         class141_14.field1921 = i_13;
         class141_14.field1918 = i_2 * 128 + 64;
         class141_14.field1920 = i_3 * 128 + 64;
         class141_14.field1923 = i_4;
         class141_14.field1924 = class135_5;
         class141_14.field1925 = class135_6;
         class141_14.field1926 = i_7;
         class141_14.field1919 = i_8;
         class141_14.field1922 = i_9;
         class141_14.field1927 = i_10;

         for (int i_15 = i_1; i_15 >= 0; --i_15) {
            if (this.field1853[i_15][i_2][i_3] == null) {
               this.field1853[i_15][i_2][i_3] = new class126(i_15, i_2, i_3);
            }
         }

         this.field1853[i_1][i_2][i_3].field1652 = class141_14;
      }
   }

   public void method3067(int i_1) {
      this.field1807 = i_1;

      for (int i_2 = 0; i_2 < this.field1803; i_2++) {
         for (int i_3 = 0; i_3 < this.field1804; i_3++) {
            if (this.field1853[i_1][i_2][i_3] == null) {
               this.field1853[i_1][i_2][i_3] = new class126(i_1, i_2, i_3);
            }
         }
      }

   }

   public void method3092(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      if (i_1 < 0) {
         i_1 = 0;
      } else if (i_1 >= this.field1803 * 128) {
         i_1 = this.field1803 * 128 - 1;
      }

      if (i_3 < 0) {
         i_3 = 0;
      } else if (i_3 >= this.field1804 * 128) {
         i_3 = this.field1804 * 128 - 1;
      }

      if (i_4 < 128) {
         i_4 = 128;
      } else if (i_4 > 383) {
         i_4 = 383;
      }

      ++field1808;
      field1827 = class130.field1787[i_4];
      field1801 = class130.field1784[i_4];
      field1829 = class130.field1787[i_5];
      field1830 = class130.field1784[i_5];
      field1861 = field1860[(i_4 - 128) / 32][i_5 / 64];
      field1824 = i_1;
      field1816 = i_2;
      field1826 = i_3;
      field1849 = i_1 / 128;
      field1823 = i_3 / 128;
      field1839 = i_6;
      field1818 = field1849 - 25;
      if (field1818 < 0) {
         field1818 = 0;
      }

      field1820 = field1823 - 25;
      if (field1820 < 0) {
         field1820 = 0;
      }

      field1819 = field1849 + 25;
      if (field1819 > this.field1803) {
         field1819 = this.field1803;
      }

      field1851 = field1823 + 25;
      if (field1851 > this.field1804) {
         field1851 = this.field1804;
      }

      this.method3113();
      field1821 = 0;

      int i_7;
      class126[][] arr_8;
      int i_9;
      int i_10;
      for (i_7 = this.field1807; i_7 < this.field1802; i_7++) {
         arr_8 = this.field1853[i_7];

         for (i_9 = field1818; i_9 < field1819; i_9++) {
            for (i_10 = field1820; i_10 < field1851; i_10++) {
               class126 class126_11 = arr_8[i_9][i_10];
               if (class126_11 != null) {
                  if (class126_11.field1659 > i_6 || !field1861[i_9 - field1849 + 25][i_10 - field1823 + 25] && this.field1857[i_7][i_9][i_10] - i_2 < 2000) {
                     class126_11.field1660 = false;
                     class126_11.field1661 = false;
                     class126_11.field1654 = 0;
                  } else {
                     class126_11.field1660 = true;
                     class126_11.field1661 = true;
                     if (class126_11.field1655 > 0) {
                        class126_11.field1662 = true;
                     } else {
                        class126_11.field1662 = false;
                     }

                     ++field1821;
                  }
               }
            }
         }
      }

      int i_12;
      int i_13;
      int i_14;
      class126 class126_15;
      int i_16;
      for (i_7 = this.field1807; i_7 < this.field1802; i_7++) {
         arr_8 = this.field1853[i_7];

         for (i_9 = -25; i_9 <= 0; i_9++) {
            i_10 = i_9 + field1849;
            i_16 = field1849 - i_9;
            if (i_10 >= field1818 || i_16 < field1819) {
               for (i_12 = -25; i_12 <= 0; i_12++) {
                  i_13 = i_12 + field1823;
                  i_14 = field1823 - i_12;
                  if (i_10 >= field1818) {
                     if (i_13 >= field1820) {
                        class126_15 = arr_8[i_10][i_13];
                        if (class126_15 != null && class126_15.field1660) {
                           this.method3108(class126_15, true);
                        }
                     }

                     if (i_14 < field1851) {
                        class126_15 = arr_8[i_10][i_14];
                        if (class126_15 != null && class126_15.field1660) {
                           this.method3108(class126_15, true);
                        }
                     }
                  }

                  if (i_16 < field1819) {
                     if (i_13 >= field1820) {
                        class126_15 = arr_8[i_16][i_13];
                        if (class126_15 != null && class126_15.field1660) {
                           this.method3108(class126_15, true);
                        }
                     }

                     if (i_14 < field1851) {
                        class126_15 = arr_8[i_16][i_14];
                        if (class126_15 != null && class126_15.field1660) {
                           this.method3108(class126_15, true);
                        }
                     }
                  }

                  if (field1821 == 0) {
                     field1822 = false;
                     return;
                  }
               }
            }
         }
      }

      for (i_7 = this.field1807; i_7 < this.field1802; i_7++) {
         arr_8 = this.field1853[i_7];

         for (i_9 = -25; i_9 <= 0; i_9++) {
            i_10 = i_9 + field1849;
            i_16 = field1849 - i_9;
            if (i_10 >= field1818 || i_16 < field1819) {
               for (i_12 = -25; i_12 <= 0; i_12++) {
                  i_13 = i_12 + field1823;
                  i_14 = field1823 - i_12;
                  if (i_10 >= field1818) {
                     if (i_13 >= field1820) {
                        class126_15 = arr_8[i_10][i_13];
                        if (class126_15 != null && class126_15.field1660) {
                           this.method3108(class126_15, false);
                        }
                     }

                     if (i_14 < field1851) {
                        class126_15 = arr_8[i_10][i_14];
                        if (class126_15 != null && class126_15.field1660) {
                           this.method3108(class126_15, false);
                        }
                     }
                  }

                  if (i_16 < field1819) {
                     if (i_13 >= field1820) {
                        class126_15 = arr_8[i_16][i_13];
                        if (class126_15 != null && class126_15.field1660) {
                           this.method3108(class126_15, false);
                        }
                     }

                     if (i_14 < field1851) {
                        class126_15 = arr_8[i_16][i_14];
                        if (class126_15 != null && class126_15.field1660) {
                           this.method3108(class126_15, false);
                        }
                     }
                  }

                  if (field1821 == 0) {
                     field1822 = false;
                     return;
                  }
               }
            }
         }
      }

      field1822 = false;
   }

   public void method3115() {
      for (int i_1 = 0; i_1 < this.field1859; i_1++) {
         class142 class142_2 = this.field1866[i_1];
         this.method3081(class142_2);
         this.field1866[i_1] = null;
      }

      this.field1859 = 0;
   }

   public void method3097(int i_1, int i_2, int i_3) {
      for (int i_4 = 0; i_4 < this.field1802; i_4++) {
         for (int i_5 = 0; i_5 < this.field1803; i_5++) {
            for (int i_6 = 0; i_6 < this.field1804; i_6++) {
               class126 class126_7 = this.field1853[i_4][i_5][i_6];
               if (class126_7 != null) {
                  class136 class136_8 = class126_7.field1656;
                  Model model_10;
                  if (class136_8 != null && class136_8.field1884 instanceof Model) {
                     Model model_9 = (Model) class136_8.field1884;
                     this.method3099(model_9, i_4, i_5, i_6, 1, 1);
                     if (class136_8.field1881 instanceof Model) {
                        model_10 = (Model) class136_8.field1881;
                        this.method3099(model_10, i_4, i_5, i_6, 1, 1);
                        Model.method2790(model_9, model_10, 0, 0, 0, false);
                        class136_8.field1881 = model_10.applyLighting(model_10.field1580, model_10.field1577, i_1, i_2, i_3);
                     }

                     class136_8.field1884 = model_9.applyLighting(model_9.field1580, model_9.field1577, i_1, i_2, i_3);
                  }

                  for (int i_12 = 0; i_12 < class126_7.field1655; i_12++) {
                     class142 class142_14 = class126_7.field1663[i_12];
                     if (class142_14 != null && class142_14.field1933 instanceof Model) {
                        Model model_11 = (Model) class142_14.field1933;
                        this.method3099(model_11, i_4, i_5, i_6, class142_14.field1936 - class142_14.field1935 + 1, class142_14.field1938 - class142_14.field1930 + 1);
                        class142_14.field1933 = model_11.applyLighting(model_11.field1580, model_11.field1577, i_1, i_2, i_3);
                     }
                  }

                  class123 class123_13 = class126_7.field1664;
                  if (class123_13 != null && class123_13.field1614 instanceof Model) {
                     model_10 = (Model) class123_13.field1614;
                     this.method3120(model_10, i_4, i_5, i_6);
                     class123_13.field1614 = model_10.applyLighting(model_10.field1580, model_10.field1577, i_1, i_2, i_3);
                  }
               }
            }
         }
      }

   }

   public void method3068(int i_1, int i_2) {
      class126 class126_3 = this.field1853[0][i_1][i_2];

      for (int i_4 = 0; i_4 < 3; i_4++) {
         class126 class126_5 = this.field1853[i_4][i_1][i_2] = this.field1853[i_4 + 1][i_1][i_2];
         if (class126_5 != null) {
            --class126_5.field1670;

            for (int i_6 = 0; i_6 < class126_5.field1655; i_6++) {
               class142 class142_7 = class126_5.field1663[i_6];
               long long_9 = class142_7.field1941;
               boolean bool_8 = class28.method420(long_9) == 2;
               if (bool_8 && class142_7.field1935 == i_1 && i_2 == class142_7.field1930) {
                  --class142_7.field1937;
               }
            }
         }
      }

      if (this.field1853[0][i_1][i_2] == null) {
         this.field1853[0][i_1][i_2] = new class126(0, i_1, i_2);
      }

      this.field1853[0][i_1][i_2].field1667 = class126_3;
      this.field1853[3][i_1][i_2] = null;
   }

   public void method3074(int i_1, int i_2, int i_3, int i_4) {
      class126 class126_5 = this.field1853[i_1][i_2][i_3];
      if (class126_5 != null) {
         this.field1853[i_1][i_2][i_3].field1659 = i_4;
      }
   }

   public void method3104() {
      field1838 = true;
   }

   public void method3082(int i_1, int i_2, int i_3, int i_4) {
      class126 class126_5 = this.field1853[i_1][i_2][i_3];
      if (class126_5 != null) {
         class141 class141_6 = class126_5.field1652;
         if (class141_6 != null) {
            class141_6.field1922 = i_4 * class141_6.field1922 / 16;
            class141_6.field1927 = i_4 * class141_6.field1927 / 16;
         }
      }
   }

   public void method3071(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, int i_17, int i_18, int i_19, int i_20) {
      class131 class131_21;
      int i_22;
      if (i_4 == 0) {
         class131_21 = new class131(i_11, i_12, i_13, i_14, -1, i_19, false);

         for (i_22 = i_1; i_22 >= 0; --i_22) {
            if (this.field1853[i_22][i_2][i_3] == null) {
               this.field1853[i_22][i_2][i_3] = new class126(i_22, i_2, i_3);
            }
         }

         this.field1853[i_1][i_2][i_3].field1646 = class131_21;
      } else if (i_4 != 1) {
         class122 class122_23 = new class122(i_4, i_5, i_6, i_2, i_3, i_7, i_8, i_9, i_10, i_11, i_12, i_13, i_14, i_15, i_16, i_17, i_18, i_19, i_20);

         for (i_22 = i_1; i_22 >= 0; --i_22) {
            if (this.field1853[i_22][i_2][i_3] == null) {
               this.field1853[i_22][i_2][i_3] = new class126(i_22, i_2, i_3);
            }
         }

         this.field1853[i_1][i_2][i_3].field1650 = class122_23;
      } else {
         class131_21 = new class131(i_15, i_16, i_17, i_18, i_6, i_20, i_8 == i_7 && i_7 == i_9 && i_10 == i_7);

         for (i_22 = i_1; i_22 >= 0; --i_22) {
            if (this.field1853[i_22][i_2][i_3] == null) {
               this.field1853[i_22][i_2][i_3] = new class126(i_22, i_2, i_3);
            }
         }

         this.field1853[i_1][i_2][i_3].field1646 = class131_21;
      }
   }

   public static boolean method3105() {
      return field1838 && field1850 != -1;
   }

   static boolean method3238(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      if (i_1 < i_2 && i_1 < i_3 && i_1 < i_4) {
         return false;
      } else if (i_1 > i_2 && i_1 > i_3 && i_1 > i_4) {
         return false;
      } else if (i_0 < i_5 && i_0 < i_6 && i_0 < i_7) {
         return false;
      } else if (i_0 > i_5 && i_0 > i_6 && i_0 > i_7) {
         return false;
      } else {
         int i_8 = (i_1 - i_2) * (i_6 - i_5) - (i_0 - i_5) * (i_3 - i_2);
         int i_9 = (i_7 - i_6) * (i_1 - i_3) - (i_0 - i_6) * (i_4 - i_3);
         int i_10 = (i_5 - i_7) * (i_1 - i_4) - (i_2 - i_4) * (i_0 - i_7);
         return i_8 == 0 ? (i_9 != 0 ? (i_9 < 0 ? i_10 <= 0 : i_10 >= 0) : true) : (i_8 < 0 ? i_9 <= 0 && i_10 <= 0 : i_9 >= 0 && i_10 >= 0);
      }
   }

   static final int method3111(int i_0, int i_1) {
      i_1 = (i_0 & 0x7f) * i_1 >> 7;
      if (i_1 < 2) {
         i_1 = 2;
      } else if (i_1 > 126) {
         i_1 = 126;
      }

      return (i_0 & 0xff80) + i_1;
   }

   public static void method3101(int[] ints_0, int i_1, int i_2, int i_3, int i_4) {
      field1864 = 0;
      field1834 = 0;
      field1805 = i_3;
      field1867 = i_4;
      field1862 = i_3 / 2;
      field1863 = i_4 / 2;
      boolean[][][][] bools_5 = new boolean[ints_0.length][32][53][53];

      int i_6;
      int i_7;
      int i_8;
      int i_9;
      int i_11;
      int i_12;
      for (i_6 = 128; i_6 <= 383; i_6 += 32) {
         for (i_7 = 0; i_7 < 2048; i_7 += 64) {
            field1827 = class130.field1787[i_6];
            field1801 = class130.field1784[i_6];
            field1829 = class130.field1787[i_7];
            field1830 = class130.field1784[i_7];
            i_8 = (i_6 - 128) / 32;
            i_9 = i_7 / 64;

            for (int i_10 = -26; i_10 < 26; i_10++) {
               for (i_11 = -26; i_11 < 26; i_11++) {
                  i_12 = i_10 * 128;
                  int i_13 = i_11 * 128;
                  boolean bool_14 = false;

                  for (int i_15 = -i_1; i_15 <= i_2; i_15 += 128) {
                     if (method3187(i_12, ints_0[i_8] + i_15, i_13)) {
                        bool_14 = true;
                        break;
                     }
                  }

                  bools_5[i_8][i_9][i_10 + 1 + 25][i_11 + 1 + 25] = bool_14;
               }
            }
         }
      }

      for (i_6 = 0; i_6 < 8; i_6++) {
         for (i_7 = 0; i_7 < 32; i_7++) {
            for (i_8 = -25; i_8 < 25; i_8++) {
               for (i_9 = -25; i_9 < 25; i_9++) {
                  boolean bool_16 = false;

                  label76:
                  for (i_11 = -1; i_11 <= 1; i_11++) {
                     for (i_12 = -1; i_12 <= 1; i_12++) {
                        if (bools_5[i_6][i_7][i_8 + i_11 + 1 + 25][i_9 + i_12 + 1 + 25]) {
                           bool_16 = true;
                           break label76;
                        }

                        if (bools_5[i_6][(i_7 + 1) % 31][i_8 + i_11 + 1 + 25][i_9 + i_12 + 1 + 25]) {
                           bool_16 = true;
                           break label76;
                        }

                        if (bools_5[i_6 + 1][i_7][i_8 + i_11 + 1 + 25][i_9 + i_12 + 1 + 25]) {
                           bool_16 = true;
                           break label76;
                        }

                        if (bools_5[i_6 + 1][(i_7 + 1) % 31][i_8 + i_11 + 1 + 25][i_9 + i_12 + 1 + 25]) {
                           bool_16 = true;
                           break label76;
                        }
                     }
                  }

                  field1860[i_6][i_7][i_8 + 25][i_9 + 25] = bool_16;
               }
            }
         }
      }

   }

   public static void method3222() {
      field1850 = -1;
      field1838 = false;
   }

   public static void method3112(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      class140 class140_8 = new class140();
      class140_8.field1901 = i_2 / 128;
      class140_8.field1905 = i_3 / 128;
      class140_8.field1908 = i_4 / 128;
      class140_8.field1899 = i_5 / 128;
      class140_8.field1896 = i_1;
      class140_8.field1904 = i_2;
      class140_8.field1902 = i_3;
      class140_8.field1903 = i_4;
      class140_8.field1897 = i_5;
      class140_8.field1898 = i_6;
      class140_8.field1906 = i_7;
      field1843[i_0][field1832[i_0]++] = class140_8;
   }

   static boolean method3187(int i_0, int i_1, int i_2) {
      int i_3 = i_0 * field1830 + i_2 * field1829 >> 16;
      int i_4 = i_2 * field1830 - i_0 * field1829 >> 16;
      int i_5 = i_4 * field1801 + field1827 * i_1 >> 16;
      int i_6 = field1801 * i_1 - i_4 * field1827 >> 16;
      if (i_5 >= 50 && i_5 <= 3500) {
         int i_7 = i_3 * 128 / i_5 + field1862;
         int i_8 = i_6 * 128 / i_5 + field1863;
         return i_7 >= field1864 && i_7 <= field1805 && i_8 >= field1834 && i_8 <= field1867;
      } else {
         return false;
      }
   }

}
