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

   void method253(int i_1, int i_2, ByteBuffer class300_3, int i_4, byte b_5) {
      int i_6 = ((i_4 & 0x18) >> 3) + 1;
      boolean bool_7 = (i_4 & 0x2) != 0;
      boolean bool_8 = (i_4 & 0x4) != 0;
      this.field163[0][i_1][i_2] = (short)class300_3.readUnsignedByte();
      int i_9;
      int i_10;
      int i_12;
      if (bool_7) {
         i_9 = class300_3.readUnsignedByte();

         for (i_10 = 0; i_10 < i_9; i_10++) {
            int i_11 = class300_3.readUnsignedByte();
            if (i_11 != 0) {
               this.field170[i_10][i_1][i_2] = (short)i_11;
               i_12 = class300_3.readUnsignedByte();
               this.field165[i_10][i_1][i_2] = (byte)(i_12 >> 2);
               this.field166[i_10][i_1][i_2] = (byte)(i_12 & 0x3);
            }
         }
      }

      if (bool_8) {
         for (i_9 = 0; i_9 < i_6; i_9++) {
            i_10 = class300_3.readUnsignedByte();
            if (i_10 != 0) {
               class25[] arr_15 = this.field164[i_9][i_1][i_2] = new class25[i_10];

               for (i_12 = 0; i_12 < i_10; i_12++) {
                  int i_13 = class300_3.readNullableShort();
                  int i_14 = class300_3.readUnsignedByte();
                  arr_15[i_12] = new class25(i_13, i_14 >> 2, i_14 & 0x3);
               }
            }
         }
      }

   }

   void method258(int i_1, int i_2, ByteBuffer class300_3, int i_4, byte b_5) {
      boolean bool_6 = (i_4 & 0x2) != 0;
      if (bool_6) {
         this.field170[0][i_1][i_2] = (short)class300_3.readUnsignedByte();
      }

      this.field163[0][i_1][i_2] = (short)class300_3.readUnsignedByte();
   }

   void method245(class233 class233_1, int i_2) {
      if (!this.method244(-613524686)) {
         byte[] bytes_3 = class233_1.method4144(this.field161, this.field162);
         if (bytes_3 != null) {
            this.vmethod679(new ByteBuffer(bytes_3), -1951934103);
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

   abstract void vmethod679(ByteBuffer var1, int var2);

   void method247(int i_1, int i_2, ByteBuffer class300_3, int i_4) {
      int i_5 = class300_3.readUnsignedByte();
      if (i_5 != 0) {
         if ((i_5 & 0x1) != 0) {
            this.method258(i_1, i_2, class300_3, i_5, (byte) 0);
         } else {
            this.method253(i_1, i_2, class300_3, i_5, (byte) 44);
         }

      }
   }

   static final void method272(NPCDefinition NPCDefinition_0, int i_1, int i_2, int i_3, int i_4) {
      if (Client.menuOptionsCount < 400) {
         if (NPCDefinition_0.field3476 != null) {
            NPCDefinition_0 = NPCDefinition_0.transform();
         }

         if (NPCDefinition_0 != null) {
            if (NPCDefinition_0.field3496) {
               if (!NPCDefinition_0.field3498 || Client.field825 == i_1) {
                  String string_5 = NPCDefinition_0.field3468;
                  int i_8;
                  int i_9;
                  if (NPCDefinition_0.field3478 != 0) {
                     i_8 = NPCDefinition_0.field3478;
                     i_9 = Client.localPlayer.field618;
                     int i_10 = i_9 - i_8;
                     String string_7;
                     if (i_10 < -9) {
                        string_7 = class73.colorStartTag(16711680);
                     } else if (i_10 < -6) {
                        string_7 = class73.colorStartTag(16723968);
                     } else if (i_10 < -3) {
                        string_7 = class73.colorStartTag(16740352);
                     } else if (i_10 < 0) {
                        string_7 = class73.colorStartTag(16756736);
                     } else if (i_10 > 9) {
                        string_7 = class73.colorStartTag(65280);
                     } else if (i_10 > 6) {
                        string_7 = class73.colorStartTag(4259584);
                     } else if (i_10 > 3) {
                        string_7 = class73.colorStartTag(8453888);
                     } else if (i_10 > 0) {
                        string_7 = class73.colorStartTag(12648192);
                     } else {
                        string_7 = class73.colorStartTag(16776960);
                     }

                     string_5 = string_5 + string_7 + " " + " (" + "level-" + NPCDefinition_0.field3478 + ")";
                  }

                  if (NPCDefinition_0.field3498 && Client.field799) {
                     class188.method3644("Examine", class73.colorStartTag(16776960) + string_5, 1003, i_1, i_2, i_3);
                  }

                  if (Client.isItemSelected == 1) {
                     class188.method3644("Use", Client.selectedItemName + " " + "->" + " " + class73.colorStartTag(16776960) + string_5, 7, i_1, i_2, i_3);
                  } else if (Client.isSpellSelected) {
                     if ((WorldMapCacheName.field301 & 0x2) == 2) {
                        class188.method3644(Client.field813, Client.selectedSpellName + " " + "->" + " " + class73.colorStartTag(16776960) + string_5, 8, i_1, i_2, i_3);
                     }
                  } else {
                     int i_11 = NPCDefinition_0.field3498 && Client.field799 ? 2000 : 0;
                     String[] arr_12 = NPCDefinition_0.field3483;
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

                              class188.method3644(arr_12[i_8], class73.colorStartTag(16776960) + string_5, i_9, i_1, i_2, i_3);
                           }
                        }
                     }

                     if (arr_12 != null) {
                        for (i_8 = 4; i_8 >= 0; --i_8) {
                           if (arr_12[i_8] != null && arr_12[i_8].equalsIgnoreCase("Attack")) {
                              short s_13 = 0;
                              if (class84.field1170 != Client.field679) {
                                 if (Client.field679 == class84.field1167 || class84.field1173 == Client.field679 && NPCDefinition_0.field3478 > Client.localPlayer.field618) {
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

                                 class188.method3644(arr_12[i_8], class73.colorStartTag(16776960) + string_5, i_9, i_1, i_2, i_3);
                              }
                           }
                        }
                     }

                     if (!NPCDefinition_0.field3498 || !Client.field799) {
                        class188.method3644("Examine", class73.colorStartTag(16776960) + string_5, 1003, i_1, i_2, i_3);
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
