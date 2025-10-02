public class class172 {

   public static int field2078;
   public int field2071 = 0;
   public int field2082 = 0;
   int field2083;
   int field2079;
   public int[][] field2085;

   public class172(int i_1, int i_2) {
      this.field2083 = i_1;
      this.field2079 = i_2;
      this.field2085 = new int[this.field2083][this.field2079];
      this.method3558(1508777517);
   }

   void method3566(int i_1, int i_2, int i_3, int i_4) {
      this.field2085[i_1][i_2] &= ~i_3;
   }

   void method3568(int i_1, int i_2, int i_3, int i_4) {
      this.field2085[i_1][i_2] |= i_3;
   }

   public void method3558(int i_1) {
      for (int i_2 = 0; i_2 < this.field2083; i_2++) {
         for (int i_3 = 0; i_3 < this.field2079; i_3++) {
            if (i_2 != 0 && i_3 != 0 && i_2 < this.field2083 - 5 && i_3 < this.field2079 - 5) {
               this.field2085[i_2][i_3] = 16777216;
            } else {
               this.field2085[i_2][i_3] = 16777215;
            }
         }
      }

   }

   public void method3564(int i_1, int i_2, int i_3, int i_4, boolean bool_5, int i_6) {
      i_1 -= this.field2071;
      i_2 -= this.field2082;
      if (i_3 == 0) {
         if (i_4 == 0) {
            this.method3566(i_1, i_2, 128, -1617846942);
            this.method3566(i_1 - 1, i_2, 8, -1617846942);
         }

         if (i_4 == 1) {
            this.method3566(i_1, i_2, 2, -1617846942);
            this.method3566(i_1, i_2 + 1, 32, -1617846942);
         }

         if (i_4 == 2) {
            this.method3566(i_1, i_2, 8, -1617846942);
            this.method3566(i_1 + 1, i_2, 128, -1617846942);
         }

         if (i_4 == 3) {
            this.method3566(i_1, i_2, 32, -1617846942);
            this.method3566(i_1, i_2 - 1, 2, -1617846942);
         }
      }

      if (i_3 == 1 || i_3 == 3) {
         if (i_4 == 0) {
            this.method3566(i_1, i_2, 1, -1617846942);
            this.method3566(i_1 - 1, i_2 + 1, 16, -1617846942);
         }

         if (i_4 == 1) {
            this.method3566(i_1, i_2, 4, -1617846942);
            this.method3566(i_1 + 1, i_2 + 1, 64, -1617846942);
         }

         if (i_4 == 2) {
            this.method3566(i_1, i_2, 16, -1617846942);
            this.method3566(i_1 + 1, i_2 - 1, 1, -1617846942);
         }

         if (i_4 == 3) {
            this.method3566(i_1, i_2, 64, -1617846942);
            this.method3566(i_1 - 1, i_2 - 1, 4, -1617846942);
         }
      }

      if (i_3 == 2) {
         if (i_4 == 0) {
            this.method3566(i_1, i_2, 130, -1617846942);
            this.method3566(i_1 - 1, i_2, 8, -1617846942);
            this.method3566(i_1, i_2 + 1, 32, -1617846942);
         }

         if (i_4 == 1) {
            this.method3566(i_1, i_2, 10, -1617846942);
            this.method3566(i_1, i_2 + 1, 32, -1617846942);
            this.method3566(i_1 + 1, i_2, 128, -1617846942);
         }

         if (i_4 == 2) {
            this.method3566(i_1, i_2, 40, -1617846942);
            this.method3566(i_1 + 1, i_2, 128, -1617846942);
            this.method3566(i_1, i_2 - 1, 2, -1617846942);
         }

         if (i_4 == 3) {
            this.method3566(i_1, i_2, 160, -1617846942);
            this.method3566(i_1, i_2 - 1, 2, -1617846942);
            this.method3566(i_1 - 1, i_2, 8, -1617846942);
         }
      }

      if (bool_5) {
         if (i_3 == 0) {
            if (i_4 == 0) {
               this.method3566(i_1, i_2, 65536, -1617846942);
               this.method3566(i_1 - 1, i_2, 4096, -1617846942);
            }

            if (i_4 == 1) {
               this.method3566(i_1, i_2, 1024, -1617846942);
               this.method3566(i_1, i_2 + 1, 16384, -1617846942);
            }

            if (i_4 == 2) {
               this.method3566(i_1, i_2, 4096, -1617846942);
               this.method3566(i_1 + 1, i_2, 65536, -1617846942);
            }

            if (i_4 == 3) {
               this.method3566(i_1, i_2, 16384, -1617846942);
               this.method3566(i_1, i_2 - 1, 1024, -1617846942);
            }
         }

         if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
               this.method3566(i_1, i_2, 512, -1617846942);
               this.method3566(i_1 - 1, i_2 + 1, 8192, -1617846942);
            }

            if (i_4 == 1) {
               this.method3566(i_1, i_2, 2048, -1617846942);
               this.method3566(i_1 + 1, i_2 + 1, 32768, -1617846942);
            }

            if (i_4 == 2) {
               this.method3566(i_1, i_2, 8192, -1617846942);
               this.method3566(i_1 + 1, i_2 - 1, 512, -1617846942);
            }

            if (i_4 == 3) {
               this.method3566(i_1, i_2, 32768, -1617846942);
               this.method3566(i_1 - 1, i_2 - 1, 2048, -1617846942);
            }
         }

         if (i_3 == 2) {
            if (i_4 == 0) {
               this.method3566(i_1, i_2, 66560, -1617846942);
               this.method3566(i_1 - 1, i_2, 4096, -1617846942);
               this.method3566(i_1, i_2 + 1, 16384, -1617846942);
            }

            if (i_4 == 1) {
               this.method3566(i_1, i_2, 5120, -1617846942);
               this.method3566(i_1, i_2 + 1, 16384, -1617846942);
               this.method3566(i_1 + 1, i_2, 65536, -1617846942);
            }

            if (i_4 == 2) {
               this.method3566(i_1, i_2, 20480, -1617846942);
               this.method3566(i_1 + 1, i_2, 65536, -1617846942);
               this.method3566(i_1, i_2 - 1, 1024, -1617846942);
            }

            if (i_4 == 3) {
               this.method3566(i_1, i_2, 81920, -1617846942);
               this.method3566(i_1, i_2 - 1, 1024, -1617846942);
               this.method3566(i_1 - 1, i_2, 4096, -1617846942);
            }
         }
      }

   }

   public void method3567(int i_1, int i_2, byte b_3) {
      i_1 -= this.field2071;
      i_2 -= this.field2082;
      this.field2085[i_1][i_2] &= ~0x40000;
   }

   public void method3565(int i_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6, byte b_7) {
      int i_8 = 256;
      if (bool_6) {
         i_8 += 131072;
      }

      i_1 -= this.field2071;
      i_2 -= this.field2082;
      int i_9;
      if (i_5 == 1 || i_5 == 3) {
         i_9 = i_3;
         i_3 = i_4;
         i_4 = i_9;
      }

      for (i_9 = i_1; i_9 < i_3 + i_1; i_9++) {
         if (i_9 >= 0 && i_9 < this.field2083) {
            for (int i_10 = i_2; i_10 < i_2 + i_4; i_10++) {
               if (i_10 >= 0 && i_10 < this.field2079) {
                  this.method3566(i_9, i_10, i_8, -1617846942);
               }
            }
         }
      }

   }

   public void method3562(int i_1, int i_2, int i_3) {
      i_1 -= this.field2071;
      i_2 -= this.field2082;
      this.field2085[i_1][i_2] |= 0x40000;
   }

   public void method3560(int i_1, int i_2, int i_3, int i_4, boolean bool_5, int i_6) {
      int i_7 = 256;
      if (bool_5) {
         i_7 += 131072;
      }

      i_1 -= this.field2071;
      i_2 -= this.field2082;

      for (int i_8 = i_1; i_8 < i_3 + i_1; i_8++) {
         if (i_8 >= 0 && i_8 < this.field2083) {
            for (int i_9 = i_2; i_9 < i_2 + i_4; i_9++) {
               if (i_9 >= 0 && i_9 < this.field2079) {
                  this.method3568(i_8, i_9, i_7, -883048141);
               }
            }
         }
      }

   }

   public void method3559(int i_1, int i_2, int i_3, int i_4, boolean bool_5, byte b_6) {
      i_1 -= this.field2071;
      i_2 -= this.field2082;
      if (i_3 == 0) {
         if (i_4 == 0) {
            this.method3568(i_1, i_2, 128, -1910602363);
            this.method3568(i_1 - 1, i_2, 8, -1240441183);
         }

         if (i_4 == 1) {
            this.method3568(i_1, i_2, 2, -1848912522);
            this.method3568(i_1, i_2 + 1, 32, -759931117);
         }

         if (i_4 == 2) {
            this.method3568(i_1, i_2, 8, -180081242);
            this.method3568(i_1 + 1, i_2, 128, -254299526);
         }

         if (i_4 == 3) {
            this.method3568(i_1, i_2, 32, -745966587);
            this.method3568(i_1, i_2 - 1, 2, -1414258985);
         }
      }

      if (i_3 == 1 || i_3 == 3) {
         if (i_4 == 0) {
            this.method3568(i_1, i_2, 1, -2118433584);
            this.method3568(i_1 - 1, i_2 + 1, 16, -1076659686);
         }

         if (i_4 == 1) {
            this.method3568(i_1, i_2, 4, -1146304526);
            this.method3568(i_1 + 1, i_2 + 1, 64, -409003919);
         }

         if (i_4 == 2) {
            this.method3568(i_1, i_2, 16, -1733461299);
            this.method3568(i_1 + 1, i_2 - 1, 1, -628491297);
         }

         if (i_4 == 3) {
            this.method3568(i_1, i_2, 64, -2124497678);
            this.method3568(i_1 - 1, i_2 - 1, 4, -1885506538);
         }
      }

      if (i_3 == 2) {
         if (i_4 == 0) {
            this.method3568(i_1, i_2, 130, -160359391);
            this.method3568(i_1 - 1, i_2, 8, -451186014);
            this.method3568(i_1, i_2 + 1, 32, -2008855311);
         }

         if (i_4 == 1) {
            this.method3568(i_1, i_2, 10, -759178939);
            this.method3568(i_1, i_2 + 1, 32, -1343072133);
            this.method3568(i_1 + 1, i_2, 128, -2143369500);
         }

         if (i_4 == 2) {
            this.method3568(i_1, i_2, 40, -1763903326);
            this.method3568(i_1 + 1, i_2, 128, -38819267);
            this.method3568(i_1, i_2 - 1, 2, -34335744);
         }

         if (i_4 == 3) {
            this.method3568(i_1, i_2, 160, -335802066);
            this.method3568(i_1, i_2 - 1, 2, -1665548417);
            this.method3568(i_1 - 1, i_2, 8, -566214490);
         }
      }

      if (bool_5) {
         if (i_3 == 0) {
            if (i_4 == 0) {
               this.method3568(i_1, i_2, 65536, -2007447330);
               this.method3568(i_1 - 1, i_2, 4096, -156474679);
            }

            if (i_4 == 1) {
               this.method3568(i_1, i_2, 1024, -1816874437);
               this.method3568(i_1, i_2 + 1, 16384, -820906363);
            }

            if (i_4 == 2) {
               this.method3568(i_1, i_2, 4096, -1141193606);
               this.method3568(i_1 + 1, i_2, 65536, -1897287819);
            }

            if (i_4 == 3) {
               this.method3568(i_1, i_2, 16384, -929174413);
               this.method3568(i_1, i_2 - 1, 1024, -1179418018);
            }
         }

         if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
               this.method3568(i_1, i_2, 512, -561193460);
               this.method3568(i_1 - 1, i_2 + 1, 8192, -1782674793);
            }

            if (i_4 == 1) {
               this.method3568(i_1, i_2, 2048, -1356765908);
               this.method3568(i_1 + 1, i_2 + 1, 32768, -1792981346);
            }

            if (i_4 == 2) {
               this.method3568(i_1, i_2, 8192, -148265112);
               this.method3568(i_1 + 1, i_2 - 1, 512, -614667126);
            }

            if (i_4 == 3) {
               this.method3568(i_1, i_2, 32768, -431500023);
               this.method3568(i_1 - 1, i_2 - 1, 2048, -479205746);
            }
         }

         if (i_3 == 2) {
            if (i_4 == 0) {
               this.method3568(i_1, i_2, 66560, -1178869986);
               this.method3568(i_1 - 1, i_2, 4096, -760177977);
               this.method3568(i_1, i_2 + 1, 16384, -1058116545);
            }

            if (i_4 == 1) {
               this.method3568(i_1, i_2, 5120, -1114258126);
               this.method3568(i_1, i_2 + 1, 16384, -62318045);
               this.method3568(i_1 + 1, i_2, 65536, -2005095154);
            }

            if (i_4 == 2) {
               this.method3568(i_1, i_2, 20480, -1397540895);
               this.method3568(i_1 + 1, i_2, 65536, -590848429);
               this.method3568(i_1, i_2 - 1, 1024, -1929546521);
            }

            if (i_4 == 3) {
               this.method3568(i_1, i_2, 81920, -357823040);
               this.method3568(i_1, i_2 - 1, 1024, -158099094);
               this.method3568(i_1 - 1, i_2, 4096, -334272236);
            }
         }
      }

   }

   public void method3561(int i_1, int i_2, int i_3) {
      i_1 -= this.field2071;
      i_2 -= this.field2082;
      this.field2085[i_1][i_2] |= 0x200000;
   }

}
