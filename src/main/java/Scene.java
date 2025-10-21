public class Scene {

   public static boolean field1848 = true;
   static int field1821 = 0;
   static int field1839 = 0;
   public static int clickTileX = -1;
   public static int clickTileZ = -1;
   static int field1833 = 0;
   static int field1825 = 0;
   static int field1835 = 0;
   static GameObject[] field1831 = new GameObject[100];
   static boolean takingInput = false;
   static boolean field1838 = false;
   static int planesCount = 4;
   static int[] planeOccluderCounts;
   static SceneOccluder[][] planeSceneOccluders;
   static int activeOccluderCount;
   static SceneOccluder[] activeOccluders;
   static NodeDeque field1846;
   static final int[] field1847;
   static final int[] field1815;
   static final int[] field1809;
   static final int[] field1844;
   static final int[] field1828;
   static final int[] field1852;
   static final int[] field1842;
   static boolean[][][][] visibilityMatrix;
   static int drawnCycle;
   static boolean[][] visibleTiles;
   static int cameraX;
   static int sinEyePitch;
   static int cosEyePitch;
   int field1802;
   int field1803;
   int field1804;
   static int sinEyeYaw;
   static int cosEyeYaw;
   static int cameraY;
   static int cameraZ;
   static int cameraXTile;
   static int cameraYTile;
   static int viewportLeft;
   static int viewportTop;
   static int viewportRight;
   static int viewportBottom;
   static int viewportCenterX;
   static int viewportCenterY;
   static int field1818;
   static int field1820;
   static int field1819;
   static int field1851;

   static {
      planeOccluderCounts = new int[planesCount];
      planeSceneOccluders = new SceneOccluder[planesCount][500];
      activeOccluderCount = 0;
      activeOccluders = new SceneOccluder[500];
      field1846 = new NodeDeque();
      field1847 = new int[] {19, 55, 38, 155, 255, 110, 137, 205, 76};
      field1815 = new int[] {160, 192, 80, 96, 0, 144, 80, 48, 160};
      field1809 = new int[] {76, 8, 137, 4, 0, 1, 38, 2, 19};
      field1844 = new int[] {0, 0, 2, 0, 0, 2, 1, 1, 0};
      field1828 = new int[] {2, 0, 0, 2, 0, 0, 0, 4, 4};
      field1852 = new int[] {0, 4, 4, 8, 0, 0, 8, 0, 0};
      field1842 = new int[] {1, 1, 0, 0, 0, 8, 0, 0, 8};
      visibilityMatrix = new boolean[8][32][51][51];
   }

   int[][][] levelTileOcclusionCycles;
   int minPlane = 0;
   int tempGameObjectsCount = 0;
   GameObject[] tempGameObjects = new GameObject[5000];
   int[][] tileShape2D = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] tileRotation2D = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   Tile[][][] tiles;
   int[][][] levelHeightmaps;

   public Scene(int var1, int var2, int var3, int[][][] var4) {
      this.field1802 = var1;
      this.field1803 = var2;
      this.field1804 = var3;
      this.tiles = new Tile[var1][var2][var3];
      this.levelTileOcclusionCycles = new int[var1][var2 + 1][var3 + 1];
      this.levelHeightmaps = var4;
      this.clear();
   }

   public static void addOccluder(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      SceneOccluder sceneOccluder_8 = new SceneOccluder();
      sceneOccluder_8.minTileX = i_2 / 128;
      sceneOccluder_8.maxTileX = i_3 / 128;
      sceneOccluder_8.minTileY = i_4 / 128;
      sceneOccluder_8.maxTileY = i_5 / 128;
      sceneOccluder_8.type = i_1;
      sceneOccluder_8.minX = i_2;
      sceneOccluder_8.maxX = i_3;
      sceneOccluder_8.minZ = i_4;
      sceneOccluder_8.maxZ = i_5;
      sceneOccluder_8.minY = i_6;
      sceneOccluder_8.maxY = i_7;
      planeSceneOccluders[i_0][planeOccluderCounts[i_0]++] = sceneOccluder_8;
   }

   public static void initVisibilityMatrix(int[] pitchDistance, int yDisMin, int yDisMax, int i_3, int i_4) {
      viewportLeft = 0;
      viewportTop = 0;
      viewportRight = i_3;
      viewportBottom = i_4;
      viewportCenterX = i_3 / 2;
      viewportCenterY = i_4 / 2;
      boolean[][][][] matrix = new boolean[pitchDistance.length][32][53][53];

      int pitchLevel;
      int yawLevel;
      int x;
      int z;
      int dz;
      int x2;
      for (pitchLevel = 128; pitchLevel <= 383; pitchLevel += 32) {
         for (yawLevel = 0; yawLevel < 2048; yawLevel += 64) {
            sinEyePitch = Rasterizer3D.sine[pitchLevel];
            cosEyePitch = Rasterizer3D.cosine[pitchLevel];
            sinEyeYaw = Rasterizer3D.sine[yawLevel];
            cosEyeYaw = Rasterizer3D.cosine[yawLevel];
            x = (pitchLevel - 128) / 32;
            z = yawLevel / 64;

            for (int dx = -26; dx < 26; dx++) {
               for (dz = -26; dz < 26; dz++) {
                  x2 = dx * 128;
                  int z2 = dz * 128;
                  boolean visible = false;

                  for (int y = -yDisMin; y <= yDisMax; y += 128) {
                     if (testPoint(x2, pitchDistance[x] + y, z2)) {
                        visible = true;
                        break;
                     }
                  }

                  matrix[x][z][dx + 1 + 25][dz + 1 + 25] = visible;
               }
            }
         }
      }

      for (pitchLevel = 0; pitchLevel < 8; pitchLevel++) {
         for (yawLevel = 0; yawLevel < 32; yawLevel++) {
            for (x = -25; x < 25; x++) {
               for (z = -25; z < 25; z++) {
                  boolean visible = false;

                  for (dz = -1; dz <= 1; dz++) {
                     for (x2 = -1; x2 <= 1; x2++) {
                        if (matrix[pitchLevel][yawLevel][x + dz + 1 + 25][z + x2 + 1 + 25]) {
                           visible = true;
                        }

                        if (matrix[pitchLevel][(yawLevel + 1) % 31][x + dz + 1 + 25][z + x2 + 1 + 25]) {
                           visible = true;
                        }

                        if (matrix[pitchLevel + 1][yawLevel][x + dz + 1 + 25][z + x2 + 1 + 25]) {
                           visible = true;
                        }

                        if (matrix[pitchLevel + 1][(yawLevel + 1) % 31][x + dz + 1 + 25][z + x2 + 1 + 25]) {
                           visible = true;
                        }
                     }
                  }

                  visibilityMatrix[pitchLevel][yawLevel][x + 25][z + 25] = visible;
               }
            }
         }
      }
   }

   static boolean testPoint(int x, int y, int z) {
      int px = x * cosEyeYaw + z * sinEyeYaw >> 16;
      int tmp = z * cosEyeYaw - x * sinEyeYaw >> 16;
      int i_5 = tmp * cosEyePitch + sinEyePitch * y >> 16;
      int i_6 = cosEyePitch * y - tmp * sinEyePitch >> 16;
      if (i_5 >= 50 && i_5 <= 3500) {
         int viewportX = px * 128 / i_5 + viewportCenterX;
         int viewportY = i_6 * 128 / i_5 + viewportCenterY;
         return viewportX >= viewportLeft && viewportX <= viewportRight && viewportY >= viewportTop && viewportY <= viewportBottom;
      } else {
         return false;
      }
   }

   public static boolean method3105() {
      return field1838 && clickTileX != -1;
   }

   public static void method3222() {
      clickTileX = -1;
      field1838 = false;
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

   boolean tileVisible(int level, int x, int z) {
      int cycle = this.levelTileOcclusionCycles[level][x][z];
      if (cycle == -drawnCycle) {
         return false;
      } else if (cycle == drawnCycle) {
         return true;
      } else {
         int sx = x << 7;
         int sz = z << 7;
         if (this.occluded(sx + 1, this.levelHeightmaps[level][x][z], sz + 1) && this.occluded(sx + 128 - 1, this.levelHeightmaps[level][x + 1][z], sz + 1) && this.occluded(sx + 128 - 1, this.levelHeightmaps[level][x + 1][z + 1], sz + 128 - 1) && this.occluded(sx + 1, this.levelHeightmaps[level][x][z + 1], sz + 128 - 1)) {
            this.levelTileOcclusionCycles[level][x][z] = drawnCycle;
            return true;
         } else {
            this.levelTileOcclusionCycles[level][x][z] = -drawnCycle;
            return false;
         }
      }
   }

   boolean method3157(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, Entity entity_9, int i_10, boolean bool_11, long long_12, int i_14) {
      int i_16;
      for (int i_15 = i_2; i_15 < i_2 + i_4; i_15++) {
         for (i_16 = i_3; i_16 < i_3 + i_5; i_16++) {
            if (i_15 < 0 || i_16 < 0 || i_15 >= this.field1803 || i_16 >= this.field1804) {
               return false;
            }

            Tile tile_22 = this.tiles[i_1][i_15][i_16];
            if (tile_22 != null && tile_22.gameObjectsCount >= 5) {
               return false;
            }
         }
      }

      GameObject fileSystem_21 = new GameObject();
      fileSystem_21.field1941 = long_12;
      fileSystem_21.flags = i_14;
      fileSystem_21.field1937 = i_1;
      fileSystem_21.field1931 = i_6;
      fileSystem_21.field1929 = i_7;
      fileSystem_21.field1932 = i_8;
      fileSystem_21.field1933 = entity_9;
      fileSystem_21.field1934 = i_10;
      fileSystem_21.field1935 = i_2;
      fileSystem_21.field1930 = i_3;
      fileSystem_21.field1936 = i_2 + i_4 - 1;
      fileSystem_21.field1938 = i_3 + i_5 - 1;

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
               if (this.tiles[i_19][i_16][i_17] == null) {
                  this.tiles[i_19][i_16][i_17] = new Tile(i_19, i_16, i_17);
               }
            }

            Tile tile_23 = this.tiles[i_1][i_16][i_17];
            tile_23.gameObjects[tile_23.gameObjectsCount] = fileSystem_21;
            tile_23.field1657[tile_23.gameObjectsCount] = i_18;
            tile_23.field1658 |= i_18;
            ++tile_23.gameObjectsCount;
         }
      }

      if (bool_11) {
         this.tempGameObjects[this.tempGameObjectsCount++] = fileSystem_21;
      }

      return true;
   }

   public void click(int i_1, int i_2, int i_3, boolean bool_4) {
      if (!method3105() || bool_4) {
         takingInput = true;
         field1838 = bool_4;
         field1833 = i_1;
         field1825 = i_2;
         field1835 = i_3;
         clickTileX = -1;
         clickTileZ = -1;
      }
   }

   void method3081(GameObject fileSystem_1) {
      for (int i_2 = fileSystem_1.field1935; i_2 <= fileSystem_1.field1936; i_2++) {
         for (int i_3 = fileSystem_1.field1930; i_3 <= fileSystem_1.field1938; i_3++) {
            Tile tile_4 = this.tiles[fileSystem_1.field1937][i_2][i_3];
            if (tile_4 != null) {
               int i_5;
               for (i_5 = 0; i_5 < tile_4.gameObjectsCount; i_5++) {
                  if (tile_4.gameObjects[i_5] == fileSystem_1) {
                     --tile_4.gameObjectsCount;

                     for (int i_6 = i_5; i_6 < tile_4.gameObjectsCount; i_6++) {
                        tile_4.gameObjects[i_6] = tile_4.gameObjects[i_6 + 1];
                        tile_4.field1657[i_6] = tile_4.field1657[i_6 + 1];
                     }

                     tile_4.gameObjects[tile_4.gameObjectsCount] = null;
                     break;
                  }
               }

               tile_4.field1658 = 0;

               for (i_5 = 0; i_5 < tile_4.gameObjectsCount; i_5++) {
                  tile_4.field1658 |= tile_4.field1657[i_5];
               }
            }
         }
      }

   }

   boolean occluded(int x, int y, int z) {
      for (int i = 0; i < activeOccluderCount; i++) {
         SceneOccluder sceneOccluder_5 = activeOccluders[i];
         int dx;
         int minX;
         int maxX;
         int minY;
         int maxY;
         if (sceneOccluder_5.mode == 1) {
            dx = sceneOccluder_5.minX - x;
            if (dx > 0) {
               minX = (dx * sceneOccluder_5.field1900 >> 8) + sceneOccluder_5.minZ;
               maxX = (dx * sceneOccluder_5.field1911 >> 8) + sceneOccluder_5.maxZ;
               minY = (dx * sceneOccluder_5.minDeltaY >> 8) + sceneOccluder_5.minY;
               maxY = (dx * sceneOccluder_5.maxDeltaY >> 8) + sceneOccluder_5.maxY;
               if (z >= minX && z <= maxX && y >= minY && y <= maxY) {
                  return true;
               }
            }
         } else if (sceneOccluder_5.mode == 2) {
            dx = x - sceneOccluder_5.minX;
            if (dx > 0) {
               minX = (dx * sceneOccluder_5.field1900 >> 8) + sceneOccluder_5.minZ;
               maxX = (dx * sceneOccluder_5.field1911 >> 8) + sceneOccluder_5.maxZ;
               minY = (dx * sceneOccluder_5.minDeltaY >> 8) + sceneOccluder_5.minY;
               maxY = (dx * sceneOccluder_5.maxDeltaY >> 8) + sceneOccluder_5.maxY;
               if (z >= minX && z <= maxX && y >= minY && y <= maxY) {
                  return true;
               }
            }
         } else if (sceneOccluder_5.mode == 3) {
            dx = sceneOccluder_5.minZ - z;
            if (dx > 0) {
               minX = (dx * sceneOccluder_5.minDeltaX >> 8) + sceneOccluder_5.minX;
               maxX = (dx * sceneOccluder_5.maxDeltaX >> 8) + sceneOccluder_5.maxX;
               minY = (dx * sceneOccluder_5.minDeltaY >> 8) + sceneOccluder_5.minY;
               maxY = (dx * sceneOccluder_5.maxDeltaY >> 8) + sceneOccluder_5.maxY;
               if (x >= minX && x <= maxX && y >= minY && y <= maxY) {
                  return true;
               }
            }
         } else if (sceneOccluder_5.mode == 4) {
            dx = z - sceneOccluder_5.minZ;
            if (dx > 0) {
               minX = (dx * sceneOccluder_5.minDeltaX >> 8) + sceneOccluder_5.minX;
               maxX = (dx * sceneOccluder_5.maxDeltaX >> 8) + sceneOccluder_5.maxX;
               minY = (dx * sceneOccluder_5.minDeltaY >> 8) + sceneOccluder_5.minY;
               maxY = (dx * sceneOccluder_5.maxDeltaY >> 8) + sceneOccluder_5.maxY;
               if (x >= minX && x <= maxX && y >= minY && y <= maxY) {
                  return true;
               }
            }
         } else if (sceneOccluder_5.mode == 5) {
            dx = y - sceneOccluder_5.minY;
            if (dx > 0) {
               minX = (dx * sceneOccluder_5.minDeltaX >> 8) + sceneOccluder_5.minX;
               maxX = (dx * sceneOccluder_5.maxDeltaX >> 8) + sceneOccluder_5.maxX;
               minY = (dx * sceneOccluder_5.field1900 >> 8) + sceneOccluder_5.minZ;
               maxY = (dx * sceneOccluder_5.field1911 >> 8) + sceneOccluder_5.maxZ;
               if (x >= minX && x <= maxX && z >= minY && z <= maxY) {
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
                        Tile tile_15 = this.tiles[i_12][i_13][i_14];
                        if (tile_15 != null) {
                           int i_16 = (this.levelHeightmaps[i_12][i_13 + 1][i_14] + this.levelHeightmaps[i_12][i_13 + 1][i_14 + 1] + this.levelHeightmaps[i_12][i_13][i_14] + this.levelHeightmaps[i_12][i_13][i_14 + 1]) / 4 - (this.levelHeightmaps[i_2][i_3 + 1][i_4] + this.levelHeightmaps[i_2][i_3][i_4] + this.levelHeightmaps[i_2][i_3 + 1][i_4 + 1] + this.levelHeightmaps[i_2][i_3][i_4 + 1]) / 4;
                           class136 class136_17 = tile_15.field1656;
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

                           for (int i_23 = 0; i_23 < tile_15.gameObjectsCount; i_23++) {
                              GameObject fileSystem_19 = tile_15.gameObjects[i_23];
                              if (fileSystem_19 != null && fileSystem_19.field1933 instanceof Model) {
                                 Model model_20 = (Model) fileSystem_19.field1933;
                                 int i_21 = fileSystem_19.field1936 - fileSystem_19.field1935 + 1;
                                 int i_22 = fileSystem_19.field1938 - fileSystem_19.field1930 + 1;
                                 Model.method2790(model_1, model_20, (i_21 - i_5) * 64 + (fileSystem_19.field1935 - i_3) * 128, i_16, (fileSystem_19.field1930 - i_4) * 128 + (i_22 - i_6) * 64, bool_7);
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
      if (!this.tileVisible(i_1, i_2, i_3)) {
         return false;
      } else {
         int i_5 = i_2 << 7;
         int i_6 = i_3 << 7;
         int i_7 = this.levelHeightmaps[i_1][i_2][i_3] - 1;
         int i_8 = i_7 - 120;
         int i_9 = i_7 - 230;
         int i_10 = i_7 - 238;
         if (i_4 < 16) {
            if (i_4 == 1) {
               if (i_5 > cameraX) {
                  if (!this.occluded(i_5, i_7, i_6)) {
                     return false;
                  }

                  if (!this.occluded(i_5, i_7, i_6 + 128)) {
                     return false;
                  }
               }

               if (i_1 > 0) {
                  if (!this.occluded(i_5, i_8, i_6)) {
                     return false;
                  }

                  if (!this.occluded(i_5, i_8, i_6 + 128)) {
                     return false;
                  }
               }

               if (!this.occluded(i_5, i_9, i_6)) {
                  return false;
               }

               if (!this.occluded(i_5, i_9, i_6 + 128)) {
                  return false;
               }

               return true;
            }

            if (i_4 == 2) {
               if (i_6 < cameraZ) {
                  if (!this.occluded(i_5, i_7, i_6 + 128)) {
                     return false;
                  }

                  if (!this.occluded(i_5 + 128, i_7, i_6 + 128)) {
                     return false;
                  }
               }

               if (i_1 > 0) {
                  if (!this.occluded(i_5, i_8, i_6 + 128)) {
                     return false;
                  }

                  if (!this.occluded(i_5 + 128, i_8, i_6 + 128)) {
                     return false;
                  }
               }

               if (!this.occluded(i_5, i_9, i_6 + 128)) {
                  return false;
               }

               if (!this.occluded(i_5 + 128, i_9, i_6 + 128)) {
                  return false;
               }

               return true;
            }

            if (i_4 == 4) {
               if (i_5 < cameraX) {
                  if (!this.occluded(i_5 + 128, i_7, i_6)) {
                     return false;
                  }

                  if (!this.occluded(i_5 + 128, i_7, i_6 + 128)) {
                     return false;
                  }
               }

               if (i_1 > 0) {
                  if (!this.occluded(i_5 + 128, i_8, i_6)) {
                     return false;
                  }

                  if (!this.occluded(i_5 + 128, i_8, i_6 + 128)) {
                     return false;
                  }
               }

               if (!this.occluded(i_5 + 128, i_9, i_6)) {
                  return false;
               }

               if (!this.occluded(i_5 + 128, i_9, i_6 + 128)) {
                  return false;
               }

               return true;
            }

            if (i_4 == 8) {
               if (i_6 > cameraZ) {
                  if (!this.occluded(i_5, i_7, i_6)) {
                     return false;
                  }

                  if (!this.occluded(i_5 + 128, i_7, i_6)) {
                     return false;
                  }
               }

               if (i_1 > 0) {
                  if (!this.occluded(i_5, i_8, i_6)) {
                     return false;
                  }

                  if (!this.occluded(i_5 + 128, i_8, i_6)) {
                     return false;
                  }
               }

               if (!this.occluded(i_5, i_9, i_6)) {
                  return false;
               }

               if (!this.occluded(i_5 + 128, i_9, i_6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.occluded(i_5 + 64, i_10, i_6 + 64) ? false : (i_4 == 16 ? this.occluded(i_5, i_9, i_6 + 128) : (i_4 == 32 ? this.occluded(i_5 + 128, i_9, i_6 + 128) : (i_4 == 64 ? this.occluded(i_5 + 128, i_9, i_6) : (i_4 == 128 ? this.occluded(i_5, i_9, i_6) : true))));
      }
   }

   void method3065(class131 class131_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
      int i_9;
      int i_10 = i_9 = (i_7 << 7) - cameraX;
      int i_11;
      int i_12 = i_11 = (i_8 << 7) - cameraZ;
      int i_13;
      int i_14 = i_13 = i_10 + 128;
      int i_15;
      int i_16 = i_15 = i_12 + 128;
      int i_17 = this.levelHeightmaps[i_2][i_7][i_8] - cameraY;
      int i_18 = this.levelHeightmaps[i_2][i_7 + 1][i_8] - cameraY;
      int i_19 = this.levelHeightmaps[i_2][i_7 + 1][i_8 + 1] - cameraY;
      int i_20 = this.levelHeightmaps[i_2][i_7][i_8 + 1] - cameraY;
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
                  int i_22 = i_10 * Rasterizer3D.field1773 / i_12 + Rasterizer3D.field1774;
                  int i_23 = i_17 * Rasterizer3D.field1773 / i_12 + Rasterizer3D.field1775;
                  int i_24 = i_14 * Rasterizer3D.field1773 / i_11 + Rasterizer3D.field1774;
                  int i_25 = i_18 * Rasterizer3D.field1773 / i_11 + Rasterizer3D.field1775;
                  int i_26 = i_13 * Rasterizer3D.field1773 / i_16 + Rasterizer3D.field1774;
                  int i_27 = i_19 * Rasterizer3D.field1773 / i_16 + Rasterizer3D.field1775;
                  int i_28 = i_9 * Rasterizer3D.field1773 / i_15 + Rasterizer3D.field1774;
                  int i_29 = i_21 * Rasterizer3D.field1773 / i_15 + Rasterizer3D.field1775;
                  Rasterizer3D.field1766 = 0;
                  int i_30;
                  if ((i_26 - i_28) * (i_25 - i_29) - (i_27 - i_29) * (i_24 - i_28) > 0) {
                     Rasterizer3D.field1763 = false;
                     if (i_26 < 0 || i_28 < 0 || i_24 < 0 || i_26 > Rasterizer3D.field1788 || i_28 > Rasterizer3D.field1788 || i_24 > Rasterizer3D.field1788) {
                        Rasterizer3D.field1763 = true;
                     }

                     if (takingInput && method3238(field1825, field1835, i_27, i_29, i_25, i_26, i_28, i_24)) {
                        clickTileX = i_7;
                        clickTileZ = i_8;
                     }

                     if (class131_1.field1789 == -1) {
                        if (class131_1.field1791 != 12345678) {
                           Rasterizer3D.method3020(i_27, i_29, i_25, i_26, i_28, i_24, class131_1.field1791, class131_1.field1792, class131_1.field1793);
                        }
                     } else if (!field1848) {
                        if (class131_1.field1790) {
                           Rasterizer3D.method2988(i_27, i_29, i_25, i_26, i_28, i_24, class131_1.field1791, class131_1.field1792, class131_1.field1793, i_10, i_14, i_9, i_17, i_18, i_21, i_12, i_11, i_15, class131_1.field1789);
                        } else {
                           Rasterizer3D.method2988(i_27, i_29, i_25, i_26, i_28, i_24, class131_1.field1791, class131_1.field1792, class131_1.field1793, i_13, i_9, i_14, i_19, i_21, i_18, i_16, i_15, i_11, class131_1.field1789);
                        }
                     } else {
                        i_30 = Rasterizer3D.field1781.vmethod3284(class131_1.field1789, 2075031290);
                        Rasterizer3D.method3020(i_27, i_29, i_25, i_26, i_28, i_24, method3111(i_30, class131_1.field1791), method3111(i_30, class131_1.field1792), method3111(i_30, class131_1.field1793));
                     }
                  }

                  if ((i_22 - i_24) * (i_29 - i_25) - (i_23 - i_25) * (i_28 - i_24) > 0) {
                     Rasterizer3D.field1763 = false;
                     if (i_22 < 0 || i_24 < 0 || i_28 < 0 || i_22 > Rasterizer3D.field1788 || i_24 > Rasterizer3D.field1788 || i_28 > Rasterizer3D.field1788) {
                        Rasterizer3D.field1763 = true;
                     }

                     if (takingInput && method3238(field1825, field1835, i_23, i_25, i_29, i_22, i_24, i_28)) {
                        clickTileX = i_7;
                        clickTileZ = i_8;
                     }

                     if (class131_1.field1789 == -1) {
                        if (class131_1.field1795 != 12345678) {
                           Rasterizer3D.method3020(i_23, i_25, i_29, i_22, i_24, i_28, class131_1.field1795, class131_1.field1793, class131_1.field1792);
                        }
                     } else if (!field1848) {
                        Rasterizer3D.method2988(i_23, i_25, i_29, i_22, i_24, i_28, class131_1.field1795, class131_1.field1793, class131_1.field1792, i_10, i_14, i_9, i_17, i_18, i_21, i_12, i_11, i_15, class131_1.field1789);
                     } else {
                        i_30 = Rasterizer3D.field1781.vmethod3284(class131_1.field1789, 908756120);
                        Rasterizer3D.method3020(i_23, i_25, i_29, i_22, i_24, i_28, method3111(i_30, class131_1.field1795), method3111(i_30, class131_1.field1793), method3111(i_30, class131_1.field1792));
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
         i_10 = class122_1.field1604[i_9] - cameraX;
         i_11 = class122_1.field1590[i_9] - cameraY;
         i_12 = class122_1.field1591[i_9] - cameraZ;
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

         class122.field1606[i_9] = i_10 * Rasterizer3D.field1773 / i_12 + Rasterizer3D.field1774;
         class122.field1605[i_9] = i_13 * Rasterizer3D.field1773 / i_12 + Rasterizer3D.field1775;
      }

      Rasterizer3D.field1766 = 0;
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
            Rasterizer3D.field1763 = false;
            if (i_13 < 0 || i_14 < 0 || i_15 < 0 || i_13 > Rasterizer3D.field1788 || i_14 > Rasterizer3D.field1788 || i_15 > Rasterizer3D.field1788) {
               Rasterizer3D.field1763 = true;
            }

            if (takingInput && method3238(field1825, field1835, i_16, i_17, i_18, i_13, i_14, i_15)) {
               clickTileX = i_6;
               clickTileZ = i_7;
            }

            if (class122_1.field1598 != null && class122_1.field1598[i_9] != -1) {
               if (!field1848) {
                  if (class122_1.field1599) {
                     Rasterizer3D.method2988(i_16, i_17, i_18, i_13, i_14, i_15, class122_1.field1600[i_9], class122_1.field1593[i_9], class122_1.field1609[i_9], class122.field1594[0], class122.field1594[1], class122.field1594[3], class122.field1607[0], class122.field1607[1], class122.field1607[3], class122.field1608[0], class122.field1608[1], class122.field1608[3], class122_1.field1598[i_9]);
                  } else {
                     Rasterizer3D.method2988(i_16, i_17, i_18, i_13, i_14, i_15, class122_1.field1600[i_9], class122_1.field1593[i_9], class122_1.field1609[i_9], class122.field1594[i_10], class122.field1594[i_11], class122.field1594[i_12], class122.field1607[i_10], class122.field1607[i_11], class122.field1607[i_12], class122.field1608[i_10], class122.field1608[i_11], class122.field1608[i_12], class122_1.field1598[i_9]);
                  }
               } else {
                  int i_19 = Rasterizer3D.field1781.vmethod3284(class122_1.field1598[i_9], 835805814);
                  Rasterizer3D.method3020(i_16, i_17, i_18, i_13, i_14, i_15, method3111(i_19, class122_1.field1600[i_9]), method3111(i_19, class122_1.field1593[i_9]), method3111(i_19, class122_1.field1609[i_9]));
               }
            } else if (class122_1.field1600[i_9] != 12345678) {
               Rasterizer3D.method3020(i_16, i_17, i_18, i_13, i_14, i_15, class122_1.field1600[i_9], class122_1.field1593[i_9], class122_1.field1609[i_9]);
            }
         }
      }

   }

   void method3120(Model model_1, int i_2, int i_3, int i_4) {
      Tile tile_5;
      Model model_6;
      if (i_3 < this.field1803) {
         tile_5 = this.tiles[i_2][i_3 + 1][i_4];
         if (tile_5 != null && tile_5.field1664 != null && tile_5.field1664.field1614 instanceof Model) {
            model_6 = (Model) tile_5.field1664.field1614;
            Model.method2790(model_1, model_6, 128, 0, 0, true);
         }
      }

      if (i_4 < this.field1803) {
         tile_5 = this.tiles[i_2][i_3][i_4 + 1];
         if (tile_5 != null && tile_5.field1664 != null && tile_5.field1664.field1614 instanceof Model) {
            model_6 = (Model) tile_5.field1664.field1614;
            Model.method2790(model_1, model_6, 0, 0, 128, true);
         }
      }

      if (i_3 < this.field1803 && i_4 < this.field1804) {
         tile_5 = this.tiles[i_2][i_3 + 1][i_4 + 1];
         if (tile_5 != null && tile_5.field1664 != null && tile_5.field1664.field1614 instanceof Model) {
            model_6 = (Model) tile_5.field1664.field1614;
            Model.method2790(model_1, model_6, 128, 0, 128, true);
         }
      }

      if (i_3 < this.field1803 && i_4 > 0) {
         tile_5 = this.tiles[i_2][i_3 + 1][i_4 - 1];
         if (tile_5 != null && tile_5.field1664 != null && tile_5.field1664.field1614 instanceof Model) {
            model_6 = (Model) tile_5.field1664.field1614;
            Model.method2790(model_1, model_6, 128, 0, -128, true);
         }
      }

   }

   boolean method3116(int i_1, int i_2, int i_3, int i_4) {
      if (!this.tileVisible(i_1, i_2, i_3)) {
         return false;
      } else {
         int i_5 = i_2 << 7;
         int i_6 = i_3 << 7;
         return this.occluded(i_5 + 1, this.levelHeightmaps[i_1][i_2][i_3] - i_4, i_6 + 1) && this.occluded(i_5 + 128 - 1, this.levelHeightmaps[i_1][i_2 + 1][i_3] - i_4, i_6 + 1) && this.occluded(i_5 + 128 - 1, this.levelHeightmaps[i_1][i_2 + 1][i_3 + 1] - i_4, i_6 + 128 - 1) && this.occluded(i_5 + 1, this.levelHeightmaps[i_1][i_2][i_3 + 1] - i_4, i_6 + 128 - 1);
      }
   }

   boolean method3117(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      int i_7;
      int i_8;
      if (i_3 == i_2 && i_5 == i_4) {
         if (!this.tileVisible(i_1, i_2, i_4)) {
            return false;
         } else {
            i_7 = i_2 << 7;
            i_8 = i_4 << 7;
            return this.occluded(i_7 + 1, this.levelHeightmaps[i_1][i_2][i_4] - i_6, i_8 + 1) && this.occluded(i_7 + 128 - 1, this.levelHeightmaps[i_1][i_2 + 1][i_4] - i_6, i_8 + 1) && this.occluded(i_7 + 128 - 1, this.levelHeightmaps[i_1][i_2 + 1][i_4 + 1] - i_6, i_8 + 128 - 1) && this.occluded(i_7 + 1, this.levelHeightmaps[i_1][i_2][i_4 + 1] - i_6, i_8 + 128 - 1);
         }
      } else {
         for (i_7 = i_2; i_7 <= i_3; i_7++) {
            for (i_8 = i_4; i_8 <= i_5; i_8++) {
               if (this.levelTileOcclusionCycles[i_1][i_7][i_8] == -drawnCycle) {
                  return false;
               }
            }
         }

         i_7 = (i_2 << 7) + 1;
         i_8 = (i_4 << 7) + 2;
         int i_9 = this.levelHeightmaps[i_1][i_2][i_4] - i_6;
         if (!this.occluded(i_7, i_9, i_8)) {
            return false;
         } else {
            int i_10 = (i_3 << 7) - 1;
            if (!this.occluded(i_10, i_9, i_8)) {
               return false;
            } else {
               int i_11 = (i_5 << 7) - 1;
               if (!this.occluded(i_7, i_9, i_11)) {
                  return false;
               } else if (!this.occluded(i_10, i_9, i_11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   void method3113() {
      int i_1 = planeOccluderCounts[field1839];
      SceneOccluder[] arr_2 = planeSceneOccluders[field1839];
      activeOccluderCount = 0;

      for (int i_3 = 0; i_3 < i_1; i_3++) {
         SceneOccluder sceneOccluder_4 = arr_2[i_3];
         int i_5;
         int i_6;
         int i_7;
         int i_9;
         boolean bool_13;
         if (sceneOccluder_4.type == 1) {
            i_5 = sceneOccluder_4.minTileX - cameraXTile + 25;
            if (i_5 >= 0 && i_5 <= 50) {
               i_6 = sceneOccluder_4.minTileY - cameraYTile + 25;
               if (i_6 < 0) {
                  i_6 = 0;
               }

               i_7 = sceneOccluder_4.maxTileY - cameraYTile + 25;
               if (i_7 > 50) {
                  i_7 = 50;
               }

               bool_13 = false;

               while (i_6 <= i_7) {
                  if (visibleTiles[i_5][i_6++]) {
                     bool_13 = true;
                     break;
                  }
               }

               if (bool_13) {
                  i_9 = cameraX - sceneOccluder_4.minX;
                  if (i_9 > 32) {
                     sceneOccluder_4.mode = 1;
                  } else {
                     if (i_9 >= -32) {
                        continue;
                     }

                     sceneOccluder_4.mode = 2;
                     i_9 = -i_9;
                  }

                  sceneOccluder_4.field1900 = (sceneOccluder_4.minZ - cameraZ << 8) / i_9;
                  sceneOccluder_4.field1911 = (sceneOccluder_4.maxZ - cameraZ << 8) / i_9;
                  sceneOccluder_4.minDeltaY = (sceneOccluder_4.minY - cameraY << 8) / i_9;
                  sceneOccluder_4.maxDeltaY = (sceneOccluder_4.maxY - cameraY << 8) / i_9;
                  activeOccluders[activeOccluderCount++] = sceneOccluder_4;
               }
            }
         } else if (sceneOccluder_4.type == 2) {
            i_5 = sceneOccluder_4.minTileY - cameraYTile + 25;
            if (i_5 >= 0 && i_5 <= 50) {
               i_6 = sceneOccluder_4.minTileX - cameraXTile + 25;
               if (i_6 < 0) {
                  i_6 = 0;
               }

               i_7 = sceneOccluder_4.maxTileX - cameraXTile + 25;
               if (i_7 > 50) {
                  i_7 = 50;
               }

               bool_13 = false;

               while (i_6 <= i_7) {
                  if (visibleTiles[i_6++][i_5]) {
                     bool_13 = true;
                     break;
                  }
               }

               if (bool_13) {
                  i_9 = cameraZ - sceneOccluder_4.minZ;
                  if (i_9 > 32) {
                     sceneOccluder_4.mode = 3;
                  } else {
                     if (i_9 >= -32) {
                        continue;
                     }

                     sceneOccluder_4.mode = 4;
                     i_9 = -i_9;
                  }

                  sceneOccluder_4.minDeltaX = (sceneOccluder_4.minX - cameraX << 8) / i_9;
                  sceneOccluder_4.maxDeltaX = (sceneOccluder_4.maxX - cameraX << 8) / i_9;
                  sceneOccluder_4.minDeltaY = (sceneOccluder_4.minY - cameraY << 8) / i_9;
                  sceneOccluder_4.maxDeltaY = (sceneOccluder_4.maxY - cameraY << 8) / i_9;
                  activeOccluders[activeOccluderCount++] = sceneOccluder_4;
               }
            }
         } else if (sceneOccluder_4.type == 4) {
            i_5 = sceneOccluder_4.minY - cameraY;
            if (i_5 > 128) {
               i_6 = sceneOccluder_4.minTileY - cameraYTile + 25;
               if (i_6 < 0) {
                  i_6 = 0;
               }

               i_7 = sceneOccluder_4.maxTileY - cameraYTile + 25;
               if (i_7 > 50) {
                  i_7 = 50;
               }

               if (i_6 <= i_7) {
                  int i_8 = sceneOccluder_4.minTileX - cameraXTile + 25;
                  if (i_8 < 0) {
                     i_8 = 0;
                  }

                  i_9 = sceneOccluder_4.maxTileX - cameraXTile + 25;
                  if (i_9 > 50) {
                     i_9 = 50;
                  }

                  boolean bool_10 = false;

                  label144:
                  for (int i_11 = i_8; i_11 <= i_9; i_11++) {
                     for (int i_12 = i_6; i_12 <= i_7; i_12++) {
                        if (visibleTiles[i_11][i_12]) {
                           bool_10 = true;
                           break label144;
                        }
                     }
                  }

                  if (bool_10) {
                     sceneOccluder_4.mode = 5;
                     sceneOccluder_4.minDeltaX = (sceneOccluder_4.minX - cameraX << 8) / i_5;
                     sceneOccluder_4.maxDeltaX = (sceneOccluder_4.maxX - cameraX << 8) / i_5;
                     sceneOccluder_4.field1900 = (sceneOccluder_4.minZ - cameraZ << 8) / i_5;
                     sceneOccluder_4.field1911 = (sceneOccluder_4.maxZ - cameraZ << 8) / i_5;
                     activeOccluders[activeOccluderCount++] = sceneOccluder_4;
                  }
               }
            }
         }
      }

   }

   public void method3087(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      if (tile_4 != null) {
         tile_4.tileItemPile = null;
      }
   }

   public long method3130(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      return tile_4 != null && tile_4.field1656 != null ? tile_4.field1656.field1882 : 0L;
   }

   public long method3180(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      return tile_4 != null && tile_4.field1652 != null ? tile_4.field1652.field1917 : 0L;
   }

   public void newGroundItemPile(int i_1, int i_2, int i_3, int i_4, Entity entity_5, long long_6, Entity entity_8, Entity entity_9) {
      class120 class120_10 = new class120();
      class120_10.field1543 = entity_5;
      class120_10.field1541 = i_2 * 128 + 64;
      class120_10.field1540 = i_3 * 128 + 64;
      class120_10.field1547 = i_4;
      class120_10.field1544 = long_6;
      class120_10.field1542 = entity_8;
      class120_10.field1545 = entity_9;
      int i_11 = 0;
      Tile var12 = this.tiles[i_1][i_2][i_3];
      if (var12 != null) {
         for (int i_13 = 0; i_13 < var12.gameObjectsCount; i_13++) {
            if ((var12.gameObjects[i_13].flags & 0x100/*256*/) == 256 && var12.gameObjects[i_13].field1933 instanceof class127) {
               class127 class127_14 = (class127) var12.gameObjects[i_13].field1933;
               class127_14.method2899();
               if (class127_14.height > i_11) {
                  i_11 = class127_14.height;
               }
            }
         }
      }

      class120_10.height = i_11;
      if (this.tiles[i_1][i_2][i_3] == null) {
         this.tiles[i_1][i_2][i_3] = new Tile(i_1, i_2, i_3);
      }

      this.tiles[i_1][i_2][i_3].tileItemPile = class120_10;
   }

   public long method3094(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      if (tile_4 == null) {
         return 0L;
      } else {
         for (int i_5 = 0; i_5 < tile_4.gameObjectsCount; i_5++) {
            GameObject fileSystem_6 = tile_4.gameObjects[i_5];
            long long_8 = fileSystem_6.field1941;
            boolean bool_7 = class28.method420(long_8) == 2;
            if (bool_7 && i_2 == fileSystem_6.field1935 && i_3 == fileSystem_6.field1930) {
               return fileSystem_6.field1941;
            }
         }

         return 0L;
      }
   }

   void method3108(Tile tile_1, boolean bool_2) {
      field1846.addFirst(tile_1);

      while (true) {
         Tile tile_3;
         int i_4;
         int i_5;
         int i_6;
         int i_7;
         Tile[][] arr_8;
         Tile tile_9;
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
                              GameObject fileSystem_12;
                              int i_17;
                              int i_18;
                              boolean bool_20;
                              int i_21;
                              Tile tile_36;
                              while (true) {
                                 do {
                                    tile_3 = (Tile) field1846.method4900();
                                    if (tile_3 == null) {
                                       return;
                                    }
                                 } while (!tile_3.field1661);

                                 i_4 = tile_3.field1668;
                                 i_5 = tile_3.field1653;
                                 i_6 = tile_3.field1670;
                                 i_7 = tile_3.field1648;
                                 arr_8 = this.tiles[i_6];
                                 if (!tile_3.field1660) {
                                    break;
                                 }

                                 if (bool_2) {
                                    if (i_6 > 0) {
                                       tile_9 = this.tiles[i_6 - 1][i_4][i_5];
                                       if (tile_9 != null && tile_9.field1661) {
                                          continue;
                                       }
                                    }

                                    if (i_4 <= cameraXTile && i_4 > field1818) {
                                       tile_9 = arr_8[i_4 - 1][i_5];
                                       if (tile_9 != null && tile_9.field1661 && (tile_9.field1660 || (tile_3.field1658 & 0x1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (i_4 >= cameraXTile && i_4 < field1819 - 1) {
                                       tile_9 = arr_8[i_4 + 1][i_5];
                                       if (tile_9 != null && tile_9.field1661 && (tile_9.field1660 || (tile_3.field1658 & 0x4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (i_5 <= cameraYTile && i_5 > field1820) {
                                       tile_9 = arr_8[i_4][i_5 - 1];
                                       if (tile_9 != null && tile_9.field1661 && (tile_9.field1660 || (tile_3.field1658 & 0x8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (i_5 >= cameraYTile && i_5 < field1851 - 1) {
                                       tile_9 = arr_8[i_4][i_5 + 1];
                                       if (tile_9 != null && tile_9.field1661 && (tile_9.field1660 || (tile_3.field1658 & 0x2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    bool_2 = true;
                                 }

                                 tile_3.field1660 = false;
                                 if (tile_3.field1667 != null) {
                                    tile_9 = tile_3.field1667;
                                    if (tile_9.field1646 != null) {
                                       if (!this.tileVisible(0, i_4, i_5)) {
                                          this.method3065(tile_9.field1646, 0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, i_4, i_5);
                                       }
                                    } else if (tile_9.field1650 != null && !this.tileVisible(0, i_4, i_5)) {
                                       this.method3110(tile_9.field1650, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, i_4, i_5);
                                    }

                                    class136_10 = tile_9.field1656;
                                    if (class136_10 != null) {
                                       class136_10.field1884.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class136_10.field1876 - cameraX, class136_10.field1879 - cameraY, class136_10.field1877 - cameraZ, class136_10.field1882);
                                    }

                                    for (i_11 = 0; i_11 < tile_9.gameObjectsCount; i_11++) {
                                       fileSystem_12 = tile_9.gameObjects[i_11];
                                       if (fileSystem_12 != null) {
                                          fileSystem_12.field1933.vmethod3258(fileSystem_12.field1934, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, fileSystem_12.field1931 - cameraX, fileSystem_12.field1932 - cameraY, fileSystem_12.field1929 - cameraZ, fileSystem_12.field1941);
                                       }
                                    }
                                 }

                                 bool_20 = false;
                                 if (tile_3.field1646 != null) {
                                    if (!this.tileVisible(i_7, i_4, i_5)) {
                                       bool_20 = true;
                                       if (tile_3.field1646.field1791 != 12345678 || takingInput && i_6 <= field1833) {
                                          this.method3065(tile_3.field1646, i_7, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, i_4, i_5);
                                       }
                                    }
                                 } else if (tile_3.field1650 != null && !this.tileVisible(i_7, i_4, i_5)) {
                                    bool_20 = true;
                                    this.method3110(tile_3.field1650, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, i_4, i_5);
                                 }

                                 i_21 = 0;
                                 i_11 = 0;
                                 class136 class136_31 = tile_3.field1656;
                                 class141 class141_13 = tile_3.field1652;
                                 if (class136_31 != null || class141_13 != null) {
                                    if (i_4 == cameraXTile) {
                                       ++i_21;
                                    } else if (cameraXTile < i_4) {
                                       i_21 += 2;
                                    }

                                    if (i_5 == cameraYTile) {
                                       i_21 += 3;
                                    } else if (cameraYTile > i_5) {
                                       i_21 += 6;
                                    }

                                    i_11 = field1847[i_21];
                                    tile_3.field1666 = field1809[i_21];
                                 }

                                 if (class136_31 != null) {
                                    if ((class136_31.field1880 & field1815[i_21]) != 0) {
                                       if (class136_31.field1880 == 16) {
                                          tile_3.field1654 = 3;
                                          tile_3.field1651 = field1844[i_21];
                                          tile_3.field1665 = 3 - tile_3.field1651;
                                       } else if (class136_31.field1880 == 32) {
                                          tile_3.field1654 = 6;
                                          tile_3.field1651 = field1828[i_21];
                                          tile_3.field1665 = 6 - tile_3.field1651;
                                       } else if (class136_31.field1880 == 64) {
                                          tile_3.field1654 = 12;
                                          tile_3.field1651 = field1852[i_21];
                                          tile_3.field1665 = 12 - tile_3.field1651;
                                       } else {
                                          tile_3.field1654 = 9;
                                          tile_3.field1651 = field1842[i_21];
                                          tile_3.field1665 = 9 - tile_3.field1651;
                                       }
                                    } else {
                                       tile_3.field1654 = 0;
                                    }

                                    if ((class136_31.field1880 & i_11) != 0 && !this.method3194(i_7, i_4, i_5, class136_31.field1880)) {
                                       class136_31.field1884.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class136_31.field1876 - cameraX, class136_31.field1879 - cameraY, class136_31.field1877 - cameraZ, class136_31.field1882);
                                    }

                                    if ((class136_31.field1878 & i_11) != 0 && !this.method3194(i_7, i_4, i_5, class136_31.field1878)) {
                                       class136_31.field1881.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class136_31.field1876 - cameraX, class136_31.field1879 - cameraY, class136_31.field1877 - cameraZ, class136_31.field1882);
                                    }
                                 }

                                 if (class141_13 != null && !this.method3116(i_7, i_4, i_5, class141_13.field1924.height)) {
                                    if ((class141_13.field1926 & i_11) != 0) {
                                       class141_13.field1924.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class141_13.field1918 - cameraX + class141_13.field1922, class141_13.field1923 - cameraY, class141_13.field1920 - cameraZ + class141_13.field1927, class141_13.field1917);
                                    } else if (class141_13.field1926 == 256) {
                                       i_14 = class141_13.field1918 - cameraX;
                                       i_15 = class141_13.field1923 - cameraY;
                                       i_16 = class141_13.field1920 - cameraZ;
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
                                          class141_13.field1924.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, i_14 + class141_13.field1922, i_15, i_16 + class141_13.field1927, class141_13.field1917);
                                       } else if (class141_13.field1925 != null) {
                                          class141_13.field1925.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, i_14, i_15, i_16, class141_13.field1917);
                                       }
                                    }
                                 }

                                 if (bool_20) {
                                    class123 class123_22 = tile_3.field1664;
                                    if (class123_22 != null) {
                                       class123_22.field1614.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class123_22.field1612 - cameraX, class123_22.field1618 - cameraY, class123_22.field1613 - cameraZ, class123_22.field1617);
                                    }

                                    class120 class120_23 = tile_3.tileItemPile;
                                    if (class120_23 != null && class120_23.height == 0) {
                                       if (class120_23.field1542 != null) {
                                          class120_23.field1542.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class120_23.field1541 - cameraX, class120_23.field1547 - cameraY, class120_23.field1540 - cameraZ, class120_23.field1544);
                                       }

                                       if (class120_23.field1545 != null) {
                                          class120_23.field1545.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class120_23.field1541 - cameraX, class120_23.field1547 - cameraY, class120_23.field1540 - cameraZ, class120_23.field1544);
                                       }

                                       if (class120_23.field1543 != null) {
                                          class120_23.field1543.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class120_23.field1541 - cameraX, class120_23.field1547 - cameraY, class120_23.field1540 - cameraZ, class120_23.field1544);
                                       }
                                    }
                                 }

                                 i_14 = tile_3.field1658;
                                 if (i_14 != 0) {
                                    if (i_4 < cameraXTile && (i_14 & 0x4) != 0) {
                                       tile_36 = arr_8[i_4 + 1][i_5];
                                       if (tile_36 != null && tile_36.field1661) {
                                          field1846.addFirst(tile_36);
                                       }
                                    }

                                    if (i_5 < cameraYTile && (i_14 & 0x2) != 0) {
                                       tile_36 = arr_8[i_4][i_5 + 1];
                                       if (tile_36 != null && tile_36.field1661) {
                                          field1846.addFirst(tile_36);
                                       }
                                    }

                                    if (i_4 > cameraXTile && (i_14 & 0x1) != 0) {
                                       tile_36 = arr_8[i_4 - 1][i_5];
                                       if (tile_36 != null && tile_36.field1661) {
                                          field1846.addFirst(tile_36);
                                       }
                                    }

                                    if (i_5 > cameraYTile && (i_14 & 0x8) != 0) {
                                       tile_36 = arr_8[i_4][i_5 - 1];
                                       if (tile_36 != null && tile_36.field1661) {
                                          field1846.addFirst(tile_36);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (tile_3.field1654 != 0) {
                                 bool_20 = true;

                                 for (i_21 = 0; i_21 < tile_3.gameObjectsCount; i_21++) {
                                    if (tile_3.gameObjects[i_21].field1940 != drawnCycle && (tile_3.field1657[i_21] & tile_3.field1654) == tile_3.field1651) {
                                       bool_20 = false;
                                       break;
                                    }
                                 }

                                 if (bool_20) {
                                    class136_10 = tile_3.field1656;
                                    if (!this.method3194(i_7, i_4, i_5, class136_10.field1880)) {
                                       class136_10.field1884.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class136_10.field1876 - cameraX, class136_10.field1879 - cameraY, class136_10.field1877 - cameraZ, class136_10.field1882);
                                    }

                                    tile_3.field1654 = 0;
                                 }
                              }

                              if (!tile_3.field1662) {
                                 break;
                              }

                              try {
                                 int i_34 = tile_3.gameObjectsCount;
                                 tile_3.field1662 = false;
                                 i_21 = 0;

                                 label563:
                                 for (i_11 = 0; i_11 < i_34; i_11++) {
                                    fileSystem_12 = tile_3.gameObjects[i_11];
                                    if (fileSystem_12.field1940 != drawnCycle) {
                                       for (i_24 = fileSystem_12.field1935; i_24 <= fileSystem_12.field1936; i_24++) {
                                          for (i_14 = fileSystem_12.field1930; i_14 <= fileSystem_12.field1938; i_14++) {
                                             tile_36 = arr_8[i_24][i_14];
                                             if (tile_36.field1660) {
                                                tile_3.field1662 = true;
                                                continue label563;
                                             }

                                             if (tile_36.field1654 != 0) {
                                                i_16 = 0;
                                                if (i_24 > fileSystem_12.field1935) {
                                                   ++i_16;
                                                }

                                                if (i_24 < fileSystem_12.field1936) {
                                                   i_16 += 4;
                                                }

                                                if (i_14 > fileSystem_12.field1930) {
                                                   i_16 += 8;
                                                }

                                                if (i_14 < fileSystem_12.field1938) {
                                                   i_16 += 2;
                                                }

                                                if ((i_16 & tile_36.field1654) == tile_3.field1665) {
                                                   tile_3.field1662 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field1831[i_21++] = fileSystem_12;
                                       i_24 = cameraXTile - fileSystem_12.field1935;
                                       i_14 = fileSystem_12.field1936 - cameraXTile;
                                       if (i_14 > i_24) {
                                          i_24 = i_14;
                                       }

                                       i_15 = cameraYTile - fileSystem_12.field1930;
                                       i_16 = fileSystem_12.field1938 - cameraYTile;
                                       if (i_16 > i_15) {
                                          fileSystem_12.field1939 = i_24 + i_16;
                                       } else {
                                          fileSystem_12.field1939 = i_24 + i_15;
                                       }
                                    }
                                 }

                                 while (i_21 > 0) {
                                    i_11 = -50;
                                    i_25 = -1;

                                    for (i_24 = 0; i_24 < i_21; i_24++) {
                                       GameObject fileSystem_35 = field1831[i_24];
                                       if (fileSystem_35.field1940 != drawnCycle) {
                                          if (fileSystem_35.field1939 > i_11) {
                                             i_11 = fileSystem_35.field1939;
                                             i_25 = i_24;
                                          } else if (i_11 == fileSystem_35.field1939) {
                                             i_15 = fileSystem_35.field1931 - cameraX;
                                             i_16 = fileSystem_35.field1929 - cameraZ;
                                             i_17 = field1831[i_25].field1931 - cameraX;
                                             i_18 = field1831[i_25].field1929 - cameraZ;
                                             if (i_15 * i_15 + i_16 * i_16 > i_17 * i_17 + i_18 * i_18) {
                                                i_25 = i_24;
                                             }
                                          }
                                       }
                                    }

                                    if (i_25 == -1) {
                                       break;
                                    }

                                    GameObject fileSystem_33 = field1831[i_25];
                                    fileSystem_33.field1940 = drawnCycle;
                                    if (!this.method3117(i_7, fileSystem_33.field1935, fileSystem_33.field1936, fileSystem_33.field1930, fileSystem_33.field1938, fileSystem_33.field1933.height)) {
                                       fileSystem_33.field1933.vmethod3258(fileSystem_33.field1934, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, fileSystem_33.field1931 - cameraX, fileSystem_33.field1932 - cameraY, fileSystem_33.field1929 - cameraZ, fileSystem_33.field1941);
                                    }

                                    for (i_14 = fileSystem_33.field1935; i_14 <= fileSystem_33.field1936; i_14++) {
                                       for (i_15 = fileSystem_33.field1930; i_15 <= fileSystem_33.field1938; i_15++) {
                                          Tile tile_26 = arr_8[i_14][i_15];
                                          if (tile_26.field1654 != 0) {
                                             field1846.addFirst(tile_26);
                                          } else if ((i_14 != i_4 || i_15 != i_5) && tile_26.field1661) {
                                             field1846.addFirst(tile_26);
                                          }
                                       }
                                    }
                                 }

                                 if (!tile_3.field1662) {
                                    break;
                                 }
                              } catch (Exception exception_28) {
                                 tile_3.field1662 = false;
                                 break;
                              }
                           }
                        } while (!tile_3.field1661);
                     } while (tile_3.field1654 != 0);

                     if (i_4 > cameraXTile || i_4 <= field1818) {
                        break;
                     }

                     tile_9 = arr_8[i_4 - 1][i_5];
                  } while (tile_9 != null && tile_9.field1661);

                  if (i_4 < cameraXTile || i_4 >= field1819 - 1) {
                     break;
                  }

                  tile_9 = arr_8[i_4 + 1][i_5];
               } while (tile_9 != null && tile_9.field1661);

               if (i_5 > cameraYTile || i_5 <= field1820) {
                  break;
               }

               tile_9 = arr_8[i_4][i_5 - 1];
            } while (tile_9 != null && tile_9.field1661);

            if (i_5 < cameraYTile || i_5 >= field1851 - 1) {
               break;
            }

            tile_9 = arr_8[i_4][i_5 + 1];
         } while (tile_9 != null && tile_9.field1661);

         tile_3.field1661 = false;
         --field1821;
         class120 class120_32 = tile_3.tileItemPile;
         if (class120_32 != null && class120_32.height != 0) {
            if (class120_32.field1542 != null) {
               class120_32.field1542.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class120_32.field1541 - cameraX, class120_32.field1547 - cameraY - class120_32.height, class120_32.field1540 - cameraZ, class120_32.field1544);
            }

            if (class120_32.field1545 != null) {
               class120_32.field1545.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class120_32.field1541 - cameraX, class120_32.field1547 - cameraY - class120_32.height, class120_32.field1540 - cameraZ, class120_32.field1544);
            }

            if (class120_32.field1543 != null) {
               class120_32.field1543.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class120_32.field1541 - cameraX, class120_32.field1547 - cameraY - class120_32.height, class120_32.field1540 - cameraZ, class120_32.field1544);
            }
         }

         if (tile_3.field1666 != 0) {
            class141 class141_29 = tile_3.field1652;
            if (class141_29 != null && !this.method3116(i_7, i_4, i_5, class141_29.field1924.height)) {
               if ((class141_29.field1926 & tile_3.field1666) != 0) {
                  class141_29.field1924.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class141_29.field1918 - cameraX + class141_29.field1922, class141_29.field1923 - cameraY, class141_29.field1920 - cameraZ + class141_29.field1927, class141_29.field1917);
               } else if (class141_29.field1926 == 256) {
                  i_11 = class141_29.field1918 - cameraX;
                  i_25 = class141_29.field1923 - cameraY;
                  i_24 = class141_29.field1920 - cameraZ;
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
                     class141_29.field1924.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, i_11 + class141_29.field1922, i_25, i_24 + class141_29.field1927, class141_29.field1917);
                  } else if (class141_29.field1925 != null) {
                     class141_29.field1925.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, i_11, i_25, i_24, class141_29.field1917);
                  }
               }
            }

            class136 class136_27 = tile_3.field1656;
            if (class136_27 != null) {
               if ((class136_27.field1878 & tile_3.field1666) != 0 && !this.method3194(i_7, i_4, i_5, class136_27.field1878)) {
                  class136_27.field1881.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class136_27.field1876 - cameraX, class136_27.field1879 - cameraY, class136_27.field1877 - cameraZ, class136_27.field1882);
               }

               if ((class136_27.field1880 & tile_3.field1666) != 0 && !this.method3194(i_7, i_4, i_5, class136_27.field1880)) {
                  class136_27.field1884.vmethod3258(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, class136_27.field1876 - cameraX, class136_27.field1879 - cameraY, class136_27.field1877 - cameraZ, class136_27.field1882);
               }
            }
         }

         Tile tile_30;
         if (i_6 < this.field1802 - 1) {
            tile_30 = this.tiles[i_6 + 1][i_4][i_5];
            if (tile_30 != null && tile_30.field1661) {
               field1846.addFirst(tile_30);
            }
         }

         if (i_4 < cameraXTile) {
            tile_30 = arr_8[i_4 + 1][i_5];
            if (tile_30 != null && tile_30.field1661) {
               field1846.addFirst(tile_30);
            }
         }

         if (i_5 < cameraYTile) {
            tile_30 = arr_8[i_4][i_5 + 1];
            if (tile_30 != null && tile_30.field1661) {
               field1846.addFirst(tile_30);
            }
         }

         if (i_4 > cameraXTile) {
            tile_30 = arr_8[i_4 - 1][i_5];
            if (tile_30 != null && tile_30.field1661) {
               field1846.addFirst(tile_30);
            }
         }

         if (i_5 > cameraYTile) {
            tile_30 = arr_8[i_4][i_5 - 1];
            if (tile_30 != null && tile_30.field1661) {
               field1846.addFirst(tile_30);
            }
         }
      }
   }

   public long method3095(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      return tile_4 != null && tile_4.field1664 != null ? tile_4.field1664.field1617 : 0L;
   }

   public int method3096(int i_1, int i_2, int i_3, long long_4) {
      Tile tile_6 = this.tiles[i_1][i_2][i_3];
      if (tile_6 == null) {
         return -1;
      } else if (tile_6.field1656 != null && tile_6.field1656.field1882 == long_4) {
         return tile_6.field1656.field1883 & 0xff;
      } else if (tile_6.field1652 != null && tile_6.field1652.field1917 == long_4) {
         return tile_6.field1652.field1921 & 0xff;
      } else if (tile_6.field1664 != null && tile_6.field1664.field1617 == long_4) {
         return tile_6.field1664.field1616 & 0xff;
      } else {
         for (int i_7 = 0; i_7 < tile_6.gameObjectsCount; i_7++) {
            if (tile_6.gameObjects[i_7].field1941 == long_4) {
               return tile_6.gameObjects[i_7].flags & 0xff;
            }
         }

         return -1;
      }
   }

   public void method3232(int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      Tile tile_7 = this.tiles[i_4][i_5][i_6];
      if (tile_7 != null) {
         class131 class131_8 = tile_7.field1646;
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
            class122 class122_18 = tile_7.field1650;
            if (class122_18 != null) {
               i_10 = class122_18.field1596;
               int i_11 = class122_18.field1601;
               int i_12 = class122_18.field1602;
               int i_13 = class122_18.field1603;
               int[] ints_14 = this.tileShape2D[i_10];
               int[] ints_15 = this.tileRotation2D[i_11];
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

   public void clear() {
      int i_1;
      int i_2;
      for (i_1 = 0; i_1 < this.field1802; i_1++) {
         for (i_2 = 0; i_2 < this.field1803; i_2++) {
            for (int i_3 = 0; i_3 < this.field1804; i_3++) {
               this.tiles[i_1][i_2][i_3] = null;
            }
         }
      }

      for (i_1 = 0; i_1 < planesCount; i_1++) {
         for (i_2 = 0; i_2 < planeOccluderCounts[i_1]; i_2++) {
            planeSceneOccluders[i_1][i_2] = null;
         }

         planeOccluderCounts[i_1] = 0;
      }

      for (i_1 = 0; i_1 < this.tempGameObjectsCount; i_1++) {
         this.tempGameObjects[i_1] = null;
      }

      this.tempGameObjectsCount = 0;

      for (i_1 = 0; i_1 < field1831.length; i_1++) {
         field1831[i_1] = null;
      }

   }

   public class136 method3088(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      return tile_4 == null ? null : tile_4.field1656;
   }

   public class141 method3118(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      return tile_4 == null ? null : tile_4.field1652;
   }

   public GameObject method3195(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      if (tile_4 == null) {
         return null;
      } else {
         for (int i_5 = 0; i_5 < tile_4.gameObjectsCount; i_5++) {
            GameObject fileSystem_6 = tile_4.gameObjects[i_5];
            long long_8 = fileSystem_6.field1941;
            boolean bool_7 = class28.method420(long_8) == 2;
            if (bool_7 && i_2 == fileSystem_6.field1935 && i_3 == fileSystem_6.field1930) {
               return fileSystem_6;
            }
         }

         return null;
      }
   }

   public class123 method3091(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      return tile_4 != null && tile_4.field1664 != null ? tile_4.field1664 : null;
   }

   public boolean method3077(int i_1, int i_2, int i_3, int i_4, int i_5, Entity entity_6, int i_7, long long_8, boolean bool_10) {
      if (entity_6 == null) {
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
         return this.method3157(i_1, i_11, i_12, i_13 - i_11 + 1, i_14 - i_12 + 1, i_2, i_3, i_4, entity_6, i_7, true, long_8, 0);
      }
   }

   public void method3208(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      if (tile_4 != null) {
         tile_4.field1656 = null;
      }
   }

   public boolean method3079(int i_1, int i_2, int i_3, int i_4, int i_5, Entity entity_6, int i_7, long long_8, int i_10, int i_11, int i_12, int i_13) {
      return entity_6 == null ? true : this.method3157(i_1, i_10, i_11, i_12 - i_10 + 1, i_13 - i_11 + 1, i_2, i_3, i_4, entity_6, i_7, true, long_8, 0);
   }

   public void method3084(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      if (tile_4 != null) {
         tile_4.field1652 = null;
      }
   }

   public void method3154(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      if (tile_4 != null) {
         for (int i_5 = 0; i_5 < tile_4.gameObjectsCount; i_5++) {
            GameObject fileSystem_6 = tile_4.gameObjects[i_5];
            long long_8 = fileSystem_6.field1941;
            boolean bool_7 = class28.method420(long_8) == 2;
            if (bool_7 && i_2 == fileSystem_6.field1935 && i_3 == fileSystem_6.field1930) {
               this.method3081(fileSystem_6);
               return;
            }
         }

      }
   }

   public void method3201(int i_1, int i_2, int i_3) {
      Tile tile_4 = this.tiles[i_1][i_2][i_3];
      if (tile_4 != null) {
         tile_4.field1664 = null;
      }
   }

   public void method3072(int i_1, int i_2, int i_3, int i_4, Entity entity_5, long long_6, int i_8) {
      if (entity_5 != null) {
         class123 class123_9 = new class123();
         class123_9.field1614 = entity_5;
         class123_9.field1612 = i_2 * 128 + 64;
         class123_9.field1613 = i_3 * 128 + 64;
         class123_9.field1618 = i_4;
         class123_9.field1617 = long_6;
         class123_9.field1616 = i_8;
         if (this.tiles[i_1][i_2][i_3] == null) {
            this.tiles[i_1][i_2][i_3] = new Tile(i_1, i_2, i_3);
         }

         this.tiles[i_1][i_2][i_3].field1664 = class123_9;
      }
   }

   public boolean method3076(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Entity entity_7, int i_8, long long_9, int i_11) {
      if (entity_7 == null) {
         return true;
      } else {
         int i_12 = i_5 * 64 + i_2 * 128;
         int i_13 = i_6 * 64 + i_3 * 128;
         return this.method3157(i_1, i_2, i_3, i_5, i_6, i_12, i_13, i_4, entity_7, i_8, false, long_9, i_11);
      }
   }

   public void method3093(int i_1, int i_2, int i_3, int i_4, Entity entity_5, Entity entity_6, int i_7, int i_8, long long_9, int i_11) {
      if (entity_5 != null || entity_6 != null) {
         class136 class136_12 = new class136();
         class136_12.field1882 = long_9;
         class136_12.field1883 = i_11;
         class136_12.field1876 = i_2 * 128 + 64;
         class136_12.field1877 = i_3 * 128 + 64;
         class136_12.field1879 = i_4;
         class136_12.field1884 = entity_5;
         class136_12.field1881 = entity_6;
         class136_12.field1880 = i_7;
         class136_12.field1878 = i_8;

         for (int i_13 = i_1; i_13 >= 0; --i_13) {
            if (this.tiles[i_13][i_2][i_3] == null) {
               this.tiles[i_13][i_2][i_3] = new Tile(i_13, i_2, i_3);
            }
         }

         this.tiles[i_1][i_2][i_3].field1656 = class136_12;
      }
   }

   public void method3142(int i_1, int i_2, int i_3, int i_4, Entity entity_5, Entity entity_6, int i_7, int i_8, int i_9, int i_10, long long_11, int i_13) {
      if (entity_5 != null) {
         class141 class141_14 = new class141();
         class141_14.field1917 = long_11;
         class141_14.field1921 = i_13;
         class141_14.field1918 = i_2 * 128 + 64;
         class141_14.field1920 = i_3 * 128 + 64;
         class141_14.field1923 = i_4;
         class141_14.field1924 = entity_5;
         class141_14.field1925 = entity_6;
         class141_14.field1926 = i_7;
         class141_14.field1919 = i_8;
         class141_14.field1922 = i_9;
         class141_14.field1927 = i_10;

         for (int i_15 = i_1; i_15 >= 0; --i_15) {
            if (this.tiles[i_15][i_2][i_3] == null) {
               this.tiles[i_15][i_2][i_3] = new Tile(i_15, i_2, i_3);
            }
         }

         this.tiles[i_1][i_2][i_3].field1652 = class141_14;
      }
   }

   public void method3067(int i_1) {
      this.minPlane = i_1;

      for (int i_2 = 0; i_2 < this.field1803; i_2++) {
         for (int i_3 = 0; i_3 < this.field1804; i_3++) {
            if (this.tiles[i_1][i_2][i_3] == null) {
               this.tiles[i_1][i_2][i_3] = new Tile(i_1, i_2, i_3);
            }
         }
      }

   }

   public void method3115() {
      for (int i_1 = 0; i_1 < this.tempGameObjectsCount; i_1++) {
         GameObject fileSystem_2 = this.tempGameObjects[i_1];
         this.method3081(fileSystem_2);
         this.tempGameObjects[i_1] = null;
      }

      this.tempGameObjectsCount = 0;
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

      ++drawnCycle;
      sinEyePitch = Rasterizer3D.sine[i_4];
      cosEyePitch = Rasterizer3D.cosine[i_4];
      sinEyeYaw = Rasterizer3D.sine[i_5];
      cosEyeYaw = Rasterizer3D.cosine[i_5];
      visibleTiles = visibilityMatrix[(i_4 - 128) / 32][i_5 / 64];
      cameraX = i_1;
      cameraY = i_2;
      cameraZ = i_3;
      cameraXTile = i_1 / 128;
      cameraYTile = i_3 / 128;
      field1839 = i_6;
      field1818 = cameraXTile - 25;
      if (field1818 < 0) {
         field1818 = 0;
      }

      field1820 = cameraYTile - 25;
      if (field1820 < 0) {
         field1820 = 0;
      }

      field1819 = cameraXTile + 25;
      if (field1819 > this.field1803) {
         field1819 = this.field1803;
      }

      field1851 = cameraYTile + 25;
      if (field1851 > this.field1804) {
         field1851 = this.field1804;
      }

      this.method3113();
      field1821 = 0;

      int i_7;
      Tile[][] arr_8;
      int i_9;
      int i_10;
      for (i_7 = this.minPlane; i_7 < this.field1802; i_7++) {
         arr_8 = this.tiles[i_7];

         for (i_9 = field1818; i_9 < field1819; i_9++) {
            for (i_10 = field1820; i_10 < field1851; i_10++) {
               Tile tile_11 = arr_8[i_9][i_10];
               if (tile_11 != null) {
                  if (tile_11.field1659 > i_6 || !visibleTiles[i_9 - cameraXTile + 25][i_10 - cameraYTile + 25] && this.levelHeightmaps[i_7][i_9][i_10] - i_2 < 2000) {
                     tile_11.field1660 = false;
                     tile_11.field1661 = false;
                     tile_11.field1654 = 0;
                  } else {
                     tile_11.field1660 = true;
                     tile_11.field1661 = true;
                     if (tile_11.gameObjectsCount > 0) {
                        tile_11.field1662 = true;
                     } else {
                        tile_11.field1662 = false;
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
      Tile tile_15;
      int i_16;
      for (i_7 = this.minPlane; i_7 < this.field1802; i_7++) {
         arr_8 = this.tiles[i_7];

         for (i_9 = -25; i_9 <= 0; i_9++) {
            i_10 = i_9 + cameraXTile;
            i_16 = cameraXTile - i_9;
            if (i_10 >= field1818 || i_16 < field1819) {
               for (i_12 = -25; i_12 <= 0; i_12++) {
                  i_13 = i_12 + cameraYTile;
                  i_14 = cameraYTile - i_12;
                  if (i_10 >= field1818) {
                     if (i_13 >= field1820) {
                        tile_15 = arr_8[i_10][i_13];
                        if (tile_15 != null && tile_15.field1660) {
                           this.method3108(tile_15, true);
                        }
                     }

                     if (i_14 < field1851) {
                        tile_15 = arr_8[i_10][i_14];
                        if (tile_15 != null && tile_15.field1660) {
                           this.method3108(tile_15, true);
                        }
                     }
                  }

                  if (i_16 < field1819) {
                     if (i_13 >= field1820) {
                        tile_15 = arr_8[i_16][i_13];
                        if (tile_15 != null && tile_15.field1660) {
                           this.method3108(tile_15, true);
                        }
                     }

                     if (i_14 < field1851) {
                        tile_15 = arr_8[i_16][i_14];
                        if (tile_15 != null && tile_15.field1660) {
                           this.method3108(tile_15, true);
                        }
                     }
                  }

                  if (field1821 == 0) {
                     takingInput = false;
                     return;
                  }
               }
            }
         }
      }

      for (i_7 = this.minPlane; i_7 < this.field1802; i_7++) {
         arr_8 = this.tiles[i_7];

         for (i_9 = -25; i_9 <= 0; i_9++) {
            i_10 = i_9 + cameraXTile;
            i_16 = cameraXTile - i_9;
            if (i_10 >= field1818 || i_16 < field1819) {
               for (i_12 = -25; i_12 <= 0; i_12++) {
                  i_13 = i_12 + cameraYTile;
                  i_14 = cameraYTile - i_12;
                  if (i_10 >= field1818) {
                     if (i_13 >= field1820) {
                        tile_15 = arr_8[i_10][i_13];
                        if (tile_15 != null && tile_15.field1660) {
                           this.method3108(tile_15, false);
                        }
                     }

                     if (i_14 < field1851) {
                        tile_15 = arr_8[i_10][i_14];
                        if (tile_15 != null && tile_15.field1660) {
                           this.method3108(tile_15, false);
                        }
                     }
                  }

                  if (i_16 < field1819) {
                     if (i_13 >= field1820) {
                        tile_15 = arr_8[i_16][i_13];
                        if (tile_15 != null && tile_15.field1660) {
                           this.method3108(tile_15, false);
                        }
                     }

                     if (i_14 < field1851) {
                        tile_15 = arr_8[i_16][i_14];
                        if (tile_15 != null && tile_15.field1660) {
                           this.method3108(tile_15, false);
                        }
                     }
                  }

                  if (field1821 == 0) {
                     takingInput = false;
                     return;
                  }
               }
            }
         }
      }

      takingInput = false;
   }

   public void method3104() {
      field1838 = true;
   }

   public void method3097(int i_1, int i_2, int i_3) {
      for (int i_4 = 0; i_4 < this.field1802; i_4++) {
         for (int i_5 = 0; i_5 < this.field1803; i_5++) {
            for (int i_6 = 0; i_6 < this.field1804; i_6++) {
               Tile tile_7 = this.tiles[i_4][i_5][i_6];
               if (tile_7 != null) {
                  class136 class136_8 = tile_7.field1656;
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

                  for (int i_12 = 0; i_12 < tile_7.gameObjectsCount; i_12++) {
                     GameObject fileSystem_14 = tile_7.gameObjects[i_12];
                     if (fileSystem_14 != null && fileSystem_14.field1933 instanceof Model) {
                        Model model_11 = (Model) fileSystem_14.field1933;
                        this.method3099(model_11, i_4, i_5, i_6, fileSystem_14.field1936 - fileSystem_14.field1935 + 1, fileSystem_14.field1938 - fileSystem_14.field1930 + 1);
                        fileSystem_14.field1933 = model_11.applyLighting(model_11.field1580, model_11.field1577, i_1, i_2, i_3);
                     }
                  }

                  class123 class123_13 = tile_7.field1664;
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
      Tile tile_3 = this.tiles[0][i_1][i_2];

      for (int i_4 = 0; i_4 < 3; i_4++) {
         Tile tile_5 = this.tiles[i_4][i_1][i_2] = this.tiles[i_4 + 1][i_1][i_2];
         if (tile_5 != null) {
            --tile_5.field1670;

            for (int i_6 = 0; i_6 < tile_5.gameObjectsCount; i_6++) {
               GameObject fileSystem_7 = tile_5.gameObjects[i_6];
               long long_9 = fileSystem_7.field1941;
               boolean bool_8 = class28.method420(long_9) == 2;
               if (bool_8 && fileSystem_7.field1935 == i_1 && i_2 == fileSystem_7.field1930) {
                  --fileSystem_7.field1937;
               }
            }
         }
      }

      if (this.tiles[0][i_1][i_2] == null) {
         this.tiles[0][i_1][i_2] = new Tile(0, i_1, i_2);
      }

      this.tiles[0][i_1][i_2].field1667 = tile_3;
      this.tiles[3][i_1][i_2] = null;
   }

   public void method3074(int i_1, int i_2, int i_3, int i_4) {
      Tile tile_5 = this.tiles[i_1][i_2][i_3];
      if (tile_5 != null) {
         this.tiles[i_1][i_2][i_3].field1659 = i_4;
      }
   }

   public void method3082(int i_1, int i_2, int i_3, int i_4) {
      Tile tile_5 = this.tiles[i_1][i_2][i_3];
      if (tile_5 != null) {
         class141 class141_6 = tile_5.field1652;
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
            if (this.tiles[i_22][i_2][i_3] == null) {
               this.tiles[i_22][i_2][i_3] = new Tile(i_22, i_2, i_3);
            }
         }

         this.tiles[i_1][i_2][i_3].field1646 = class131_21;
      } else if (i_4 != 1) {
         class122 class122_23 = new class122(i_4, i_5, i_6, i_2, i_3, i_7, i_8, i_9, i_10, i_11, i_12, i_13, i_14, i_15, i_16, i_17, i_18, i_19, i_20);

         for (i_22 = i_1; i_22 >= 0; --i_22) {
            if (this.tiles[i_22][i_2][i_3] == null) {
               this.tiles[i_22][i_2][i_3] = new Tile(i_22, i_2, i_3);
            }
         }

         this.tiles[i_1][i_2][i_3].field1650 = class122_23;
      } else {
         class131_21 = new class131(i_15, i_16, i_17, i_18, i_6, i_20, i_8 == i_7 && i_7 == i_9 && i_10 == i_7);

         for (i_22 = i_1; i_22 >= 0; --i_22) {
            if (this.tiles[i_22][i_2][i_3] == null) {
               this.tiles[i_22][i_2][i_3] = new Tile(i_22, i_2, i_3);
            }
         }

         this.tiles[i_1][i_2][i_3].field1646 = class131_21;
      }
   }

}
