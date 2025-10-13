public class CollisionMap {

   public static int field2078;
   public int xInset = 0;
   public int yInset = 0;
   public int[][] flags;
   int xSize;
   int ySize;

   public CollisionMap(int var1, int i_2) {
      this.xSize = var1;
      this.ySize = i_2;
      this.flags = new int[this.xSize][this.ySize];
      this.clear();
   }

   void setFlag33(int i_1, int i_2, int i_3) {
      this.flags[i_1][i_2] &= ~i_3;
   }

   void setFlagOff(int var1, int var2, int var3) {
      this.flags[var1][var2] |= var3;
   }

   public void clear() {
      for (int var1 = 0; var1 < this.xSize; var1++) {
         for (int var2 = 0; var2 < this.ySize; var2++) {
            if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
               this.flags[var1][var2] = 0x1000000;
            } else {
               this.flags[var1][var2] = 0xffffff;
            }
         }
      }

   }

   public void method3564(int var1, int var2, int i_3, int i_4, boolean bool_5) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      if (i_3 == 0) {
         if (i_4 == 0) {
            this.setFlag33(var1, var2, 128);
            this.setFlag33(var1 - 1, var2, 8);
         }

         if (i_4 == 1) {
            this.setFlag33(var1, var2, 2);
            this.setFlag33(var1, var2 + 1, 32);
         }

         if (i_4 == 2) {
            this.setFlag33(var1, var2, 8);
            this.setFlag33(var1 + 1, var2, 128);
         }

         if (i_4 == 3) {
            this.setFlag33(var1, var2, 32);
            this.setFlag33(var1, var2 - 1, 2);
         }
      }

      if (i_3 == 1 || i_3 == 3) {
         if (i_4 == 0) {
            this.setFlag33(var1, var2, 1);
            this.setFlag33(var1 - 1, var2 + 1, 16);
         }

         if (i_4 == 1) {
            this.setFlag33(var1, var2, 4);
            this.setFlag33(var1 + 1, var2 + 1, 64);
         }

         if (i_4 == 2) {
            this.setFlag33(var1, var2, 16);
            this.setFlag33(var1 + 1, var2 - 1, 1);
         }

         if (i_4 == 3) {
            this.setFlag33(var1, var2, 64);
            this.setFlag33(var1 - 1, var2 - 1, 4);
         }
      }

      if (i_3 == 2) {
         if (i_4 == 0) {
            this.setFlag33(var1, var2, 130);
            this.setFlag33(var1 - 1, var2, 8);
            this.setFlag33(var1, var2 + 1, 32);
         }

         if (i_4 == 1) {
            this.setFlag33(var1, var2, 10);
            this.setFlag33(var1, var2 + 1, 32);
            this.setFlag33(var1 + 1, var2, 128);
         }

         if (i_4 == 2) {
            this.setFlag33(var1, var2, 40);
            this.setFlag33(var1 + 1, var2, 128);
            this.setFlag33(var1, var2 - 1, 2);
         }

         if (i_4 == 3) {
            this.setFlag33(var1, var2, 160);
            this.setFlag33(var1, var2 - 1, 2);
            this.setFlag33(var1 - 1, var2, 8);
         }
      }

      if (bool_5) {
         if (i_3 == 0) {
            if (i_4 == 0) {
               this.setFlag33(var1, var2, 65536);
               this.setFlag33(var1 - 1, var2, 4096);
            }

            if (i_4 == 1) {
               this.setFlag33(var1, var2, 1024);
               this.setFlag33(var1, var2 + 1, 16384);
            }

            if (i_4 == 2) {
               this.setFlag33(var1, var2, 4096);
               this.setFlag33(var1 + 1, var2, 65536);
            }

            if (i_4 == 3) {
               this.setFlag33(var1, var2, 16384);
               this.setFlag33(var1, var2 - 1, 1024);
            }
         }

         if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
               this.setFlag33(var1, var2, 512);
               this.setFlag33(var1 - 1, var2 + 1, 8192);
            }

            if (i_4 == 1) {
               this.setFlag33(var1, var2, 2048);
               this.setFlag33(var1 + 1, var2 + 1, 32768);
            }

            if (i_4 == 2) {
               this.setFlag33(var1, var2, 8192);
               this.setFlag33(var1 + 1, var2 - 1, 512);
            }

            if (i_4 == 3) {
               this.setFlag33(var1, var2, 32768);
               this.setFlag33(var1 - 1, var2 - 1, 2048);
            }
         }

         if (i_3 == 2) {
            if (i_4 == 0) {
               this.setFlag33(var1, var2, 66560);
               this.setFlag33(var1 - 1, var2, 4096);
               this.setFlag33(var1, var2 + 1, 16384);
            }

            if (i_4 == 1) {
               this.setFlag33(var1, var2, 5120);
               this.setFlag33(var1, var2 + 1, 16384);
               this.setFlag33(var1 + 1, var2, 65536);
            }

            if (i_4 == 2) {
               this.setFlag33(var1, var2, 20480);
               this.setFlag33(var1 + 1, var2, 65536);
               this.setFlag33(var1, var2 - 1, 1024);
            }

            if (i_4 == 3) {
               this.setFlag33(var1, var2, 81920);
               this.setFlag33(var1, var2 - 1, 1024);
               this.setFlag33(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void setBlockedByUnknown(int i_1, int i_2) {
      i_1 -= this.xInset;
      i_2 -= this.yInset;
      this.flags[i_1][i_2] &= ~0x40000;
   }

   public void method3565(int i_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
      int i_8 = 256;
      if (bool_6) {
         i_8 += 131072;
      }

      i_1 -= this.xInset;
      i_2 -= this.yInset;
      int i_9;
      if (i_5 == 1 || i_5 == 3) {
         i_9 = i_3;
         i_3 = i_4;
         i_4 = i_9;
      }

      for (i_9 = i_1; i_9 < i_3 + i_1; i_9++) {
         if (i_9 >= 0 && i_9 < this.xSize) {
            for (int i_10 = i_2; i_10 < i_2 + i_4; i_10++) {
               if (i_10 >= 0 && i_10 < this.ySize) {
                  this.setFlag33(i_9, i_10, i_8);
               }
            }
         }
      }

   }

   public void setBlockedByFloorDec(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      this.flags[var1][var2] |= 0x40000;
   }

   public void addGameObject(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
      int var6 = 256;
      if (bool_5) {
         var6 += 131072;
      }

      i_1 -= this.xInset;
      i_2 -= this.yInset;

      for (int var7 = i_1; var7 < i_3 + i_1; var7++) {
         if (var7 >= 0 && var7 < this.xSize) {
            for (int var8 = i_2; var8 < i_2 + i_4; var8++) {
               if (var8 >= 0 && var8 < this.ySize) {
                  this.setFlagOff(var7, var8, var6);
               }
            }
         }
      }

   }

   public void method3559(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
      i_1 -= this.xInset;
      i_2 -= this.yInset;
      if (i_3 == 0) {
         if (i_4 == 0) {
            this.setFlagOff(i_1, i_2, 128);
            this.setFlagOff(i_1 - 1, i_2, 8);
         }

         if (i_4 == 1) {
            this.setFlagOff(i_1, i_2, 2);
            this.setFlagOff(i_1, i_2 + 1, 32);
         }

         if (i_4 == 2) {
            this.setFlagOff(i_1, i_2, 8);
            this.setFlagOff(i_1 + 1, i_2, 128);
         }

         if (i_4 == 3) {
            this.setFlagOff(i_1, i_2, 32);
            this.setFlagOff(i_1, i_2 - 1, 2);
         }
      }

      if (i_3 == 1 || i_3 == 3) {
         if (i_4 == 0) {
            this.setFlagOff(i_1, i_2, 1);
            this.setFlagOff(i_1 - 1, i_2 + 1, 16);
         }

         if (i_4 == 1) {
            this.setFlagOff(i_1, i_2, 4);
            this.setFlagOff(i_1 + 1, i_2 + 1, 64);
         }

         if (i_4 == 2) {
            this.setFlagOff(i_1, i_2, 16);
            this.setFlagOff(i_1 + 1, i_2 - 1, 1);
         }

         if (i_4 == 3) {
            this.setFlagOff(i_1, i_2, 64);
            this.setFlagOff(i_1 - 1, i_2 - 1, 4);
         }
      }

      if (i_3 == 2) {
         if (i_4 == 0) {
            this.setFlagOff(i_1, i_2, 130);
            this.setFlagOff(i_1 - 1, i_2, 8);
            this.setFlagOff(i_1, i_2 + 1, 32);
         }

         if (i_4 == 1) {
            this.setFlagOff(i_1, i_2, 10);
            this.setFlagOff(i_1, i_2 + 1, 32);
            this.setFlagOff(i_1 + 1, i_2, 128);
         }

         if (i_4 == 2) {
            this.setFlagOff(i_1, i_2, 40);
            this.setFlagOff(i_1 + 1, i_2, 128);
            this.setFlagOff(i_1, i_2 - 1, 2);
         }

         if (i_4 == 3) {
            this.setFlagOff(i_1, i_2, 160);
            this.setFlagOff(i_1, i_2 - 1, 2);
            this.setFlagOff(i_1 - 1, i_2, 8);
         }
      }

      if (bool_5) {
         if (i_3 == 0) {
            if (i_4 == 0) {
               this.setFlagOff(i_1, i_2, 65536);
               this.setFlagOff(i_1 - 1, i_2, 4096);
            }

            if (i_4 == 1) {
               this.setFlagOff(i_1, i_2, 1024);
               this.setFlagOff(i_1, i_2 + 1, 16384);
            }

            if (i_4 == 2) {
               this.setFlagOff(i_1, i_2, 4096);
               this.setFlagOff(i_1 + 1, i_2, 65536);
            }

            if (i_4 == 3) {
               this.setFlagOff(i_1, i_2, 16384);
               this.setFlagOff(i_1, i_2 - 1, 1024);
            }
         }

         if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
               this.setFlagOff(i_1, i_2, 512);
               this.setFlagOff(i_1 - 1, i_2 + 1, 8192);
            }

            if (i_4 == 1) {
               this.setFlagOff(i_1, i_2, 2048);
               this.setFlagOff(i_1 + 1, i_2 + 1, 32768);
            }

            if (i_4 == 2) {
               this.setFlagOff(i_1, i_2, 8192);
               this.setFlagOff(i_1 + 1, i_2 - 1, 512);
            }

            if (i_4 == 3) {
               this.setFlagOff(i_1, i_2, 32768);
               this.setFlagOff(i_1 - 1, i_2 - 1, 2048);
            }
         }

         if (i_3 == 2) {
            if (i_4 == 0) {
               this.setFlagOff(i_1, i_2, 66560);
               this.setFlagOff(i_1 - 1, i_2, 4096);
               this.setFlagOff(i_1, i_2 + 1, 16384);
            }

            if (i_4 == 1) {
               this.setFlagOff(i_1, i_2, 5120);
               this.setFlagOff(i_1, i_2 + 1, 16384);
               this.setFlagOff(i_1 + 1, i_2, 65536);
            }

            if (i_4 == 2) {
               this.setFlagOff(i_1, i_2, 20480);
               this.setFlagOff(i_1 + 1, i_2, 65536);
               this.setFlagOff(i_1, i_2 - 1, 1024);
            }

            if (i_4 == 3) {
               this.setFlagOff(i_1, i_2, 81920);
               this.setFlagOff(i_1, i_2 - 1, 1024);
               this.setFlagOff(i_1 - 1, i_2, 4096);
            }
         }
      }

   }

   public void setBlockedByFloor(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      this.flags[var1][var2] |= 0x200000;
   }

}
