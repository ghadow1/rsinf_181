import java.util.LinkedList;

public abstract class class21 {

   static int field155;
   int field158;
   int field157;
   int field160;
   int field159;
   int field167;
   int field156;
   int field161 = -1;
   int field162 = -1;
   boolean field168;
   boolean field169;
   short[][][] field163;
   short[][][] field170;
   byte[][][] field165;
   byte[][][] field166;
   class25[][][][] field164;

   class21() {
      new LinkedList();
      this.field168 = false;
      this.field169 = false;
   }

   boolean method244(int i_1) {
      return this.field168 && this.field169;
   }

   void method246(int i_1) {
      this.field163 = null;
      this.field170 = null;
      this.field165 = null;
      this.field166 = null;
      this.field164 = null;
      this.field168 = false;
      this.field169 = false;
   }

   void method253(int i_1, int i_2, class300 class300_3, int i_4, byte b_5) {
      int i_6 = ((i_4 & 0x18) >> 3) + 1;
      boolean bool_7 = (i_4 & 0x2) != 0;
      boolean bool_8 = (i_4 & 0x4) != 0;
      this.field163[0][i_1][i_2] = (short)class300_3.method5504((byte) 66);
      int i_9;
      int i_10;
      int i_12;
      if (bool_7) {
         i_9 = class300_3.method5504((byte) 74);

         for (i_10 = 0; i_10 < i_9; i_10++) {
            int i_11 = class300_3.method5504((byte) 43);
            if (i_11 != 0) {
               this.field170[i_10][i_1][i_2] = (short)i_11;
               i_12 = class300_3.method5504((byte) 100);
               this.field165[i_10][i_1][i_2] = (byte)(i_12 >> 2);
               this.field166[i_10][i_1][i_2] = (byte)(i_12 & 0x3);
            }
         }
      }

      if (bool_8) {
         for (i_9 = 0; i_9 < i_6; i_9++) {
            i_10 = class300_3.method5504((byte) 105);
            if (i_10 != 0) {
               class25[] arr_15 = this.field164[i_9][i_1][i_2] = new class25[i_10];

               for (i_12 = 0; i_12 < i_10; i_12++) {
                  int i_13 = class300_3.method5511((byte) -34);
                  int i_14 = class300_3.method5504((byte) 20);
                  arr_15[i_12] = new class25(i_13, i_14 >> 2, i_14 & 0x3);
               }
            }
         }
      }

   }

   void method258(int i_1, int i_2, class300 class300_3, int i_4, byte b_5) {
      boolean bool_6 = (i_4 & 0x2) != 0;
      if (bool_6) {
         this.field170[0][i_1][i_2] = (short)class300_3.method5504((byte) 56);
      }

      this.field163[0][i_1][i_2] = (short)class300_3.method5504((byte) 9);
   }

   void method245(class233 class233_1, int i_2) {
      if (!this.method244(-613524686)) {
         byte[] bytes_3 = class233_1.method4144(this.field161, this.field162, -1787309856);
         if (bytes_3 != null) {
            this.vmethod679(new class300(bytes_3), -1951934103);
            this.field168 = true;
            this.field169 = true;
         }

      }
   }

   int method250(int i_1) {
      return this.field157;
   }

   int method251(int i_1) {
      return this.field158;
   }

   abstract void vmethod679(class300 var1, int var2);

   void method247(int i_1, int i_2, class300 class300_3, int i_4) {
      int i_5 = class300_3.method5504((byte) 11);
      if (i_5 != 0) {
         if ((i_5 & 0x1) != 0) {
            this.method258(i_1, i_2, class300_3, i_5, (byte) 0);
         } else {
            this.method253(i_1, i_2, class300_3, i_5, (byte) 44);
         }

      }
   }

   static final void method272(class256 class256_0, int i_1, int i_2, int i_3, int i_4) {
      if (client.field791 < 400) {
         if (class256_0.field3476 != null) {
            class256_0 = class256_0.method4709(942859640);
         }

         if (class256_0 != null) {
            if (class256_0.field3496) {
               if (!class256_0.field3498 || client.field825 == i_1) {
                  String string_5 = class256_0.field3468;
                  int i_8;
                  int i_9;
                  if (class256_0.field3478 != 0) {
                     i_8 = class256_0.field3478;
                     i_9 = client.field657.field618;
                     int i_10 = i_9 - i_8;
                     String string_7;
                     if (i_10 < -9) {
                        string_7 = class73.method1756(16711680, -844505624);
                     } else if (i_10 < -6) {
                        string_7 = class73.method1756(16723968, -844505624);
                     } else if (i_10 < -3) {
                        string_7 = class73.method1756(16740352, -844505624);
                     } else if (i_10 < 0) {
                        string_7 = class73.method1756(16756736, -844505624);
                     } else if (i_10 > 9) {
                        string_7 = class73.method1756(65280, -844505624);
                     } else if (i_10 > 6) {
                        string_7 = class73.method1756(4259584, -844505624);
                     } else if (i_10 > 3) {
                        string_7 = class73.method1756(8453888, -844505624);
                     } else if (i_10 > 0) {
                        string_7 = class73.method1756(12648192, -844505624);
                     } else {
                        string_7 = class73.method1756(16776960, -844505624);
                     }

                     string_5 = string_5 + string_7 + " " + " (" + "level-" + class256_0.field3478 + ")";
                  }

                  if (class256_0.field3498 && client.field799) {
                     class188.method3644("Examine", class73.method1756(16776960, -844505624) + string_5, 1003, i_1, i_2, i_3, 1154358453);
                  }

                  if (client.field900 == 1) {
                     class188.method3644("Use", client.field738 + " " + "->" + " " + class73.method1756(16776960, -844505624) + string_5, 7, i_1, i_2, i_3, 1492323075);
                  } else if (client.field810) {
                     if ((class35.field301 & 0x2) == 2) {
                        class188.method3644(client.field813, client.field814 + " " + "->" + " " + class73.method1756(16776960, -844505624) + string_5, 8, i_1, i_2, i_3, 1830552502);
                     }
                  } else {
                     int i_11 = class256_0.field3498 && client.field799 ? 2000 : 0;
                     String[] arr_12 = class256_0.field3483;
                     if (arr_12 != null) {
                        for (i_8 = 4; i_8 >= 0; --i_8) {
                           if (arr_12[i_8] != null && !arr_12[i_8].equalsIgnoreCase("Attack")) {
                              i_9 = 0;
                              if (i_8 == 0) {
                                 i_9 = i_11 + 9;
                              }

                              if (i_8 == 1) {
                                 i_9 = i_11 + 10;
                              }

                              if (i_8 == 2) {
                                 i_9 = i_11 + 11;
                              }

                              if (i_8 == 3) {
                                 i_9 = i_11 + 12;
                              }

                              if (i_8 == 4) {
                                 i_9 = i_11 + 13;
                              }

                              class188.method3644(arr_12[i_8], class73.method1756(16776960, -844505624) + string_5, i_9, i_1, i_2, i_3, 906687769);
                           }
                        }
                     }

                     if (arr_12 != null) {
                        for (i_8 = 4; i_8 >= 0; --i_8) {
                           if (arr_12[i_8] != null && arr_12[i_8].equalsIgnoreCase("Attack")) {
                              short s_13 = 0;
                              if (class84.field1170 != client.field679) {
                                 if (client.field679 == class84.field1167 || class84.field1173 == client.field679 && class256_0.field3478 > client.field657.field618) {
                                    s_13 = 2000;
                                 }

                                 i_9 = 0;
                                 if (i_8 == 0) {
                                    i_9 = s_13 + 9;
                                 }

                                 if (i_8 == 1) {
                                    i_9 = s_13 + 10;
                                 }

                                 if (i_8 == 2) {
                                    i_9 = s_13 + 11;
                                 }

                                 if (i_8 == 3) {
                                    i_9 = s_13 + 12;
                                 }

                                 if (i_8 == 4) {
                                    i_9 = s_13 + 13;
                                 }

                                 class188.method3644(arr_12[i_8], class73.method1756(16776960, -844505624) + string_5, i_9, i_1, i_2, i_3, -555124761);
                              }
                           }
                        }
                     }

                     if (!class256_0.field3498 || !client.field799) {
                        class188.method3644("Examine", class73.method1756(16776960, -844505624) + string_5, 1003, i_1, i_2, i_3, -1913385031);
                     }
                  }

               }
            }
         }
      }
   }

   static int method274(int i_0, int i_1, byte b_2) {
      class59 class59_3 = (class59) class59.field552.method5952((long)i_0);
      return class59_3 == null ? -1 : (i_1 >= 0 && i_1 < class59_3.field550.length ? class59_3.field550[i_1] : -1);
   }

   static final void method273(int i_0, int i_1, int i_2, int i_3, int i_4) {
      class75.method1826(1435918510);
   }

}
