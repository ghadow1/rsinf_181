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
      this.method3558();
   }

   void method3566(int i_1, int i_2, int i_3) {
      this.field2085[i_1][i_2] &= ~i_3;
   }

   void method3568(int i_1, int i_2, int i_3) {
      this.field2085[i_1][i_2] |= i_3;
   }

   public void method3558() {
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
            this.method3566(i_1, i_2, 128);
            this.method3566(i_1 - 1, i_2, 8);
         }

         if (i_4 == 1) {
            this.method3566(i_1, i_2, 2);
            this.method3566(i_1, i_2 + 1, 32);
         }

         if (i_4 == 2) {
            this.method3566(i_1, i_2, 8);
            this.method3566(i_1 + 1, i_2, 128);
         }

         if (i_4 == 3) {
            this.method3566(i_1, i_2, 32);
            this.method3566(i_1, i_2 - 1, 2);
         }
      }

      if (i_3 == 1 || i_3 == 3) {
         if (i_4 == 0) {
            this.method3566(i_1, i_2, 1);
            this.method3566(i_1 - 1, i_2 + 1, 16);
         }

         if (i_4 == 1) {
            this.method3566(i_1, i_2, 4);
            this.method3566(i_1 + 1, i_2 + 1, 64);
         }

         if (i_4 == 2) {
            this.method3566(i_1, i_2, 16);
            this.method3566(i_1 + 1, i_2 - 1, 1);
         }

         if (i_4 == 3) {
            this.method3566(i_1, i_2, 64);
            this.method3566(i_1 - 1, i_2 - 1, 4);
         }
      }

      if (i_3 == 2) {
         if (i_4 == 0) {
            this.method3566(i_1, i_2, 130);
            this.method3566(i_1 - 1, i_2, 8);
            this.method3566(i_1, i_2 + 1, 32);
         }

         if (i_4 == 1) {
            this.method3566(i_1, i_2, 10);
            this.method3566(i_1, i_2 + 1, 32);
            this.method3566(i_1 + 1, i_2, 128);
         }

         if (i_4 == 2) {
            this.method3566(i_1, i_2, 40);
            this.method3566(i_1 + 1, i_2, 128);
            this.method3566(i_1, i_2 - 1, 2);
         }

         if (i_4 == 3) {
            this.method3566(i_1, i_2, 160);
            this.method3566(i_1, i_2 - 1, 2);
            this.method3566(i_1 - 1, i_2, 8);
         }
      }

      if (bool_5) {
         if (i_3 == 0) {
            if (i_4 == 0) {
               this.method3566(i_1, i_2, 65536);
               this.method3566(i_1 - 1, i_2, 4096);
            }

            if (i_4 == 1) {
               this.method3566(i_1, i_2, 1024);
               this.method3566(i_1, i_2 + 1, 16384);
            }

            if (i_4 == 2) {
               this.method3566(i_1, i_2, 4096);
               this.method3566(i_1 + 1, i_2, 65536);
            }

            if (i_4 == 3) {
               this.method3566(i_1, i_2, 16384);
               this.method3566(i_1, i_2 - 1, 1024);
            }
         }

         if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
               this.method3566(i_1, i_2, 512);
               this.method3566(i_1 - 1, i_2 + 1, 8192);
            }

            if (i_4 == 1) {
               this.method3566(i_1, i_2, 2048);
               this.method3566(i_1 + 1, i_2 + 1, 32768);
            }

            if (i_4 == 2) {
               this.method3566(i_1, i_2, 8192);
               this.method3566(i_1 + 1, i_2 - 1, 512);
            }

            if (i_4 == 3) {
               this.method3566(i_1, i_2, 32768);
               this.method3566(i_1 - 1, i_2 - 1, 2048);
            }
         }

         if (i_3 == 2) {
            if (i_4 == 0) {
               this.method3566(i_1, i_2, 66560);
               this.method3566(i_1 - 1, i_2, 4096);
               this.method3566(i_1, i_2 + 1, 16384);
            }

            if (i_4 == 1) {
               this.method3566(i_1, i_2, 5120);
               this.method3566(i_1, i_2 + 1, 16384);
               this.method3566(i_1 + 1, i_2, 65536);
            }

            if (i_4 == 2) {
               this.method3566(i_1, i_2, 20480);
               this.method3566(i_1 + 1, i_2, 65536);
               this.method3566(i_1, i_2 - 1, 1024);
            }

            if (i_4 == 3) {
               this.method3566(i_1, i_2, 81920);
               this.method3566(i_1, i_2 - 1, 1024);
               this.method3566(i_1 - 1, i_2, 4096);
            }
         }
      }

   }

   public void method3567(int i_1, int i_2) {
      i_1 -= this.field2071;
      i_2 -= this.field2082;
      this.field2085[i_1][i_2] &= ~0x40000;
   }

   public void method3565(int i_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
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
                  this.method3566(i_9, i_10, i_8);
               }
            }
         }
      }

   }

   public void method3562(int i_1, int i_2) {
      i_1 -= this.field2071;
      i_2 -= this.field2082;
      this.field2085[i_1][i_2] |= 0x40000;
   }

   public void method3560(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
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
                  this.method3568(i_8, i_9, i_7);
               }
            }
         }
      }

   }

   public void method3559(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
      i_1 -= this.field2071;
      i_2 -= this.field2082;
      if (i_3 == 0) {
         if (i_4 == 0) {
            this.method3568(i_1, i_2, 128);
            this.method3568(i_1 - 1, i_2, 8);
         }

         if (i_4 == 1) {
            this.method3568(i_1, i_2, 2);
            this.method3568(i_1, i_2 + 1, 32);
         }

         if (i_4 == 2) {
            this.method3568(i_1, i_2, 8);
            this.method3568(i_1 + 1, i_2, 128);
         }

         if (i_4 == 3) {
            this.method3568(i_1, i_2, 32);
            this.method3568(i_1, i_2 - 1, 2);
         }
      }

      if (i_3 == 1 || i_3 == 3) {
         if (i_4 == 0) {
            this.method3568(i_1, i_2, 1);
            this.method3568(i_1 - 1, i_2 + 1, 16);
         }

         if (i_4 == 1) {
            this.method3568(i_1, i_2, 4);
            this.method3568(i_1 + 1, i_2 + 1, 64);
         }

         if (i_4 == 2) {
            this.method3568(i_1, i_2, 16);
            this.method3568(i_1 + 1, i_2 - 1, 1);
         }

         if (i_4 == 3) {
            this.method3568(i_1, i_2, 64);
            this.method3568(i_1 - 1, i_2 - 1, 4);
         }
      }

      if (i_3 == 2) {
         if (i_4 == 0) {
            this.method3568(i_1, i_2, 130);
            this.method3568(i_1 - 1, i_2, 8);
            this.method3568(i_1, i_2 + 1, 32);
         }

         if (i_4 == 1) {
            this.method3568(i_1, i_2, 10);
            this.method3568(i_1, i_2 + 1, 32);
            this.method3568(i_1 + 1, i_2, 128);
         }

         if (i_4 == 2) {
            this.method3568(i_1, i_2, 40);
            this.method3568(i_1 + 1, i_2, 128);
            this.method3568(i_1, i_2 - 1, 2);
         }

         if (i_4 == 3) {
            this.method3568(i_1, i_2, 160);
            this.method3568(i_1, i_2 - 1, 2);
            this.method3568(i_1 - 1, i_2, 8);
         }
      }

      if (bool_5) {
         if (i_3 == 0) {
            if (i_4 == 0) {
               this.method3568(i_1, i_2, 65536);
               this.method3568(i_1 - 1, i_2, 4096);
            }

            if (i_4 == 1) {
               this.method3568(i_1, i_2, 1024);
               this.method3568(i_1, i_2 + 1, 16384);
            }

            if (i_4 == 2) {
               this.method3568(i_1, i_2, 4096);
               this.method3568(i_1 + 1, i_2, 65536);
            }

            if (i_4 == 3) {
               this.method3568(i_1, i_2, 16384);
               this.method3568(i_1, i_2 - 1, 1024);
            }
         }

         if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
               this.method3568(i_1, i_2, 512);
               this.method3568(i_1 - 1, i_2 + 1, 8192);
            }

            if (i_4 == 1) {
               this.method3568(i_1, i_2, 2048);
               this.method3568(i_1 + 1, i_2 + 1, 32768);
            }

            if (i_4 == 2) {
               this.method3568(i_1, i_2, 8192);
               this.method3568(i_1 + 1, i_2 - 1, 512);
            }

            if (i_4 == 3) {
               this.method3568(i_1, i_2, 32768);
               this.method3568(i_1 - 1, i_2 - 1, 2048);
            }
         }

         if (i_3 == 2) {
            if (i_4 == 0) {
               this.method3568(i_1, i_2, 66560);
               this.method3568(i_1 - 1, i_2, 4096);
               this.method3568(i_1, i_2 + 1, 16384);
            }

            if (i_4 == 1) {
               this.method3568(i_1, i_2, 5120);
               this.method3568(i_1, i_2 + 1, 16384);
               this.method3568(i_1 + 1, i_2, 65536);
            }

            if (i_4 == 2) {
               this.method3568(i_1, i_2, 20480);
               this.method3568(i_1 + 1, i_2, 65536);
               this.method3568(i_1, i_2 - 1, 1024);
            }

            if (i_4 == 3) {
               this.method3568(i_1, i_2, 81920);
               this.method3568(i_1, i_2 - 1, 1024);
               this.method3568(i_1 - 1, i_2, 4096);
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
