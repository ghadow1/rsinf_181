public class class250 extends DualNode {

   static class233 field3309;
   public static class145 field3311 = new class145(64);
   class316 field3310;

   void method4513(ByteBuffer class300_1, int i_2) {
      if (i_2 == 249) {
         this.field3310 = item.method403(class300_1, this.field3310);
      }

   }

   public int method4514(int i_1, int i_2) {
      class316 class316_5 = this.field3310;
      int i_4;
      if (class316_5 == null) {
         i_4 = i_2;
      } else {
         class179 class179_6 = (class179) class316_5.method5924((long)i_1);
         if (class179_6 == null) {
            i_4 = i_2;
         } else {
            i_4 = class179_6.field2111;
         }
      }

      return i_4;
   }

   public String method4515(int i_1, String string_2) {
      return class5.method54(this.field3310, i_1, string_2, (byte) -34);
   }

   void method4512() {
   }

   void method4516(ByteBuffer class300_1) {
      while (true) {
         int i_3 = class300_1.readUnsignedByte();
         if (i_3 == 0) {
            return;
         }

         this.method4513(class300_1, i_3);
      }
   }

   static final void method4530() {
      PacketBuffer buffer3_1 = Client.data.packetBuffer;
      buffer3_1.method5438();
      int i_2 = buffer3_1.method5445(8);
      int i_3;
      if (i_2 < Client.npcCount) {
         for (i_3 = i_2; i_3 < Client.npcCount; i_3++) {
            Client.field776[++Client.field775 - 1] = Client.npcIndices[i_3];
         }
      }

      if (i_2 > Client.npcCount) {
         throw new RuntimeException("");
      } else {
         Client.npcCount = 0;

         for (i_3 = 0; i_3 < i_2; i_3++) {
            int i_4 = Client.npcIndices[i_3];
            NPC NPC_5 = Client.npcs[i_4];
            int i_6 = buffer3_1.method5445(1);
            if (i_6 == 0) {
               Client.npcIndices[++Client.npcCount - 1] = i_4;
               NPC_5.field973 = Client.cycle;
            } else {
               int i_7 = buffer3_1.method5445(2);
               if (i_7 == 0) {
                  Client.npcIndices[++Client.npcCount - 1] = i_4;
                  NPC_5.field973 = Client.cycle;
                  Client.field859[++Client.field697 - 1] = i_4;
               } else {
                  int i_8;
                  int i_9;
                  if (i_7 == 1) {
                     Client.npcIndices[++Client.npcCount - 1] = i_4;
                     NPC_5.field973 = Client.cycle;
                     i_8 = buffer3_1.method5445(3);
                     NPC_5.method1974(i_8, (byte) 1);
                     i_9 = buffer3_1.method5445(1);
                     if (i_9 == 1) {
                        Client.field859[++Client.field697 - 1] = i_4;
                     }
                  } else if (i_7 == 2) {
                     Client.npcIndices[++Client.npcCount - 1] = i_4;
                     NPC_5.field973 = Client.cycle;
                     i_8 = buffer3_1.method5445(3);
                     NPC_5.method1974(i_8, (byte) 2);
                     i_9 = buffer3_1.method5445(3);
                     NPC_5.method1974(i_9, (byte) 2);
                     int i_10 = buffer3_1.method5445(1);
                     if (i_10 == 1) {
                        Client.field859[++Client.field697 - 1] = i_4;
                     }
                  } else if (i_7 == 3) {
                     Client.field776[++Client.field775 - 1] = i_4;
                  }
               }
            }
         }

      }
   }

   static final void method4531(class69 class69_0, int i_1, byte b_2) {
      int i_3;
      int i_4;
      int i_5;
      class258 class258_12;
      if (class69_0.field995 > Client.cycle) {
         i_3 = class69_0.field995 - Client.cycle;
         i_4 = class69_0.field991 * 128 + class69_0.field952 * 64;
         i_5 = class69_0.field993 * 128 + class69_0.field952 * 64;
         class69_0.x += (i_4 - class69_0.x) / i_3;
         class69_0.y += (i_5 - class69_0.y) / i_3;
         class69_0.field1007 = 0;
         class69_0.field1000 = class69_0.field997;
      } else {
         int i_6;
         int i_8;
         if (class69_0.field996 >= Client.cycle) {
            if (class69_0.field996 == Client.cycle || class69_0.field981 == -1 || class69_0.field984 != 0 || class69_0.field974 + 1 > class7.method81(class69_0.field981).field3522[class69_0.field951]) {
               i_3 = class69_0.field996 - class69_0.field995;
               i_4 = Client.cycle - class69_0.field995;
               i_5 = class69_0.field991 * 128 + class69_0.field952 * 64;
               i_6 = class69_0.field993 * 128 + class69_0.field952 * 64;
               int i_7 = class69_0.field992 * 128 + class69_0.field952 * 64;
               i_8 = class69_0.field983 * 128 + class69_0.field952 * 64;
               class69_0.x = (i_7 * i_4 + i_5 * (i_3 - i_4)) / i_3;
               class69_0.y = (i_8 * i_4 + i_6 * (i_3 - i_4)) / i_3;
            }

            class69_0.field1007 = 0;
            class69_0.field1000 = class69_0.field997;
            class69_0.field950 = class69_0.field1000;
         } else {
            class69_0.field978 = class69_0.field1004;
            if (class69_0.field1003 == 0) {
               class69_0.field1007 = 0;
            } else {
               label434: {
                  if (class69_0.field981 != -1 && class69_0.field984 == 0) {
                     class258_12 = class7.method81(class69_0.field981);
                     if (class69_0.field1008 > 0 && class258_12.field3525 == 0) {
                        ++class69_0.field1007;
                        break label434;
                     }

                     if (class69_0.field1008 <= 0 && class258_12.field3532 == 0) {
                        ++class69_0.field1007;
                        break label434;
                     }
                  }

                  i_3 = class69_0.x;
                  i_4 = class69_0.y;
                  i_5 = class69_0.field994[class69_0.field1003 - 1] * 128 + class69_0.field952 * 64;
                  i_6 = class69_0.field962[class69_0.field1003 - 1] * 128 + class69_0.field952 * 64;
                  if (i_3 < i_5) {
                     if (i_4 < i_6) {
                        class69_0.field1000 = 1280;
                     } else if (i_4 > i_6) {
                        class69_0.field1000 = 1792;
                     } else {
                        class69_0.field1000 = 1536;
                     }
                  } else if (i_3 > i_5) {
                     if (i_4 < i_6) {
                        class69_0.field1000 = 768;
                     } else if (i_4 > i_6) {
                        class69_0.field1000 = 256;
                     } else {
                        class69_0.field1000 = 512;
                     }
                  } else if (i_4 < i_6) {
                     class69_0.field1000 = 1024;
                  } else if (i_4 > i_6) {
                     class69_0.field1000 = 0;
                  }

                  byte b_14 = class69_0.field1006[class69_0.field1003 - 1];
                  if (i_5 - i_3 <= 256 && i_5 - i_3 >= -256 && i_6 - i_4 <= 256 && i_6 - i_4 >= -256) {
                     i_8 = class69_0.field1000 - class69_0.field950 & 0x7ff;
                     if (i_8 > 1024) {
                        i_8 -= 2048;
                     }

                     int i_9 = class69_0.field958;
                     if (i_8 >= -256 && i_8 <= 256) {
                        i_9 = class69_0.field957;
                     } else if (i_8 >= 256 && i_8 < 768) {
                        i_9 = class69_0.field960;
                     } else if (i_8 >= -768 && i_8 <= -256) {
                        i_9 = class69_0.field959;
                     }

                     if (i_9 == -1) {
                        i_9 = class69_0.field957;
                     }

                     class69_0.field978 = i_9;
                     int i_10 = 4;
                     boolean bool_11 = true;
                     if (class69_0 instanceof NPC) {
                        bool_11 = ((NPC) class69_0).definition.field3497;
                     }

                     if (bool_11) {
                        if (class69_0.field1000 != class69_0.field950 && class69_0.field975 == -1 && class69_0.field948 != 0) {
                           i_10 = 2;
                        }

                        if (class69_0.field1003 > 2) {
                           i_10 = 6;
                        }

                        if (class69_0.field1003 > 3) {
                           i_10 = 8;
                        }

                        if (class69_0.field1007 > 0 && class69_0.field1003 > 1) {
                           i_10 = 8;
                           --class69_0.field1007;
                        }
                     } else {
                        if (class69_0.field1003 > 1) {
                           i_10 = 6;
                        }

                        if (class69_0.field1003 > 2) {
                           i_10 = 8;
                        }

                        if (class69_0.field1007 > 0 && class69_0.field1003 > 1) {
                           i_10 = 8;
                           --class69_0.field1007;
                        }
                     }

                     if (b_14 == 2) {
                        i_10 <<= 1;
                     }

                     if (i_10 >= 8 && class69_0.field957 == class69_0.field978 && class69_0.field961 != -1) {
                        class69_0.field978 = class69_0.field961;
                     }

                     if (i_3 != i_5 || i_4 != i_6) {
                        if (i_3 < i_5) {
                           class69_0.x += i_10;
                           if (class69_0.x > i_5) {
                              class69_0.x = i_5;
                           }
                        } else if (i_3 > i_5) {
                           class69_0.x -= i_10;
                           if (class69_0.x < i_5) {
                              class69_0.x = i_5;
                           }
                        }

                        if (i_4 < i_6) {
                           class69_0.y += i_10;
                           if (class69_0.y > i_6) {
                              class69_0.y = i_6;
                           }
                        } else if (i_4 > i_6) {
                           class69_0.y -= i_10;
                           if (class69_0.y < i_6) {
                              class69_0.y = i_6;
                           }
                        }
                     }

                     if (i_5 == class69_0.x && i_6 == class69_0.y) {
                        --class69_0.field1003;
                        if (class69_0.field1008 > 0) {
                           --class69_0.field1008;
                        }
                     }
                  } else {
                     class69_0.x = i_5;
                     class69_0.y = i_6;
                     --class69_0.field1003;
                     if (class69_0.field1008 > 0) {
                        --class69_0.field1008;
                     }
                  }
               }
            }
         }
      }

      if (class69_0.x < 128 || class69_0.y < 128 || class69_0.x >= 13184 || class69_0.y >= 13184) {
         class69_0.field981 = -1;
         class69_0.field986 = -1;
         class69_0.field995 = 0;
         class69_0.field996 = 0;
         class69_0.x = class69_0.field994[0] * 128 + class69_0.field952 * 64;
         class69_0.y = class69_0.field962[0] * 128 + class69_0.field952 * 64;
         class69_0.method1658(-1575805976);
      }

      if (Client.localPlayer == class69_0 && (class69_0.x < 1536 || class69_0.y < 1536 || class69_0.x >= 11776 || class69_0.y >= 11776)) {
         class69_0.field981 = -1;
         class69_0.field986 = -1;
         class69_0.field995 = 0;
         class69_0.field996 = 0;
         class69_0.x = class69_0.field994[0] * 128 + class69_0.field952 * 64;
         class69_0.y = class69_0.field962[0] * 128 + class69_0.field952 * 64;
         class69_0.method1658(-2042789311);
      }

      class284.method5226(class69_0);
      class69_0.field967 = false;
      if (class69_0.field978 != -1) {
         class258_12 = class7.method81(class69_0.field978);
         if (class258_12 != null && class258_12.field3520 != null) {
            ++class69_0.field1001;
            if (class69_0.field979 < class258_12.field3520.length && class69_0.field1001 > class258_12.field3522[class69_0.field979]) {
               class69_0.field1001 = 1;
               ++class69_0.field979;
               class19.method224(class258_12, class69_0.field979, class69_0.x, class69_0.y, -837687849);
            }

            if (class69_0.field979 >= class258_12.field3520.length) {
               class69_0.field1001 = 0;
               class69_0.field979 = 0;
               class19.method224(class258_12, class69_0.field979, class69_0.x, class69_0.y, -272321099);
            }
         } else {
            class69_0.field978 = -1;
         }
      }

      if (class69_0.field986 != -1 && Client.cycle >= class69_0.field989) {
         if (class69_0.field987 < 0) {
            class69_0.field987 = 0;
         }

         i_3 = SceneSound.method3887(class69_0.field986).field3238;
         if (i_3 != -1) {
            class258 class258_13 = class7.method81(i_3);
            if (class258_13 != null && class258_13.field3520 != null) {
               ++class69_0.field988;
               if (class69_0.field987 < class258_13.field3520.length && class69_0.field988 > class258_13.field3522[class69_0.field987]) {
                  class69_0.field988 = 1;
                  ++class69_0.field987;
                  class19.method224(class258_13, class69_0.field987, class69_0.x, class69_0.y, 282707669);
               }

               if (class69_0.field987 >= class258_13.field3520.length && (class69_0.field987 < 0 || class69_0.field987 >= class258_13.field3520.length)) {
                  class69_0.field986 = -1;
               }
            } else {
               class69_0.field986 = -1;
            }
         } else {
            class69_0.field986 = -1;
         }
      }

      if (class69_0.field981 != -1 && class69_0.field984 <= 1) {
         class258_12 = class7.method81(class69_0.field981);
         if (class258_12.field3525 == 1 && class69_0.field1008 > 0 && class69_0.field995 <= Client.cycle && class69_0.field996 < Client.cycle) {
            class69_0.field984 = 1;
            return;
         }
      }

      if (class69_0.field981 != -1 && class69_0.field984 == 0) {
         class258_12 = class7.method81(class69_0.field981);
         if (class258_12 != null && class258_12.field3520 != null) {
            ++class69_0.field974;
            if (class69_0.field951 < class258_12.field3520.length && class69_0.field974 > class258_12.field3522[class69_0.field951]) {
               class69_0.field974 = 1;
               ++class69_0.field951;
               class19.method224(class258_12, class69_0.field951, class69_0.x, class69_0.y, 1833355104);
            }

            if (class69_0.field951 >= class258_12.field3520.length) {
               class69_0.field951 -= class258_12.field3515;
               ++class69_0.field985;
               if (class69_0.field985 >= class258_12.field3535) {
                  class69_0.field981 = -1;
               } else if (class69_0.field951 >= 0 && class69_0.field951 < class258_12.field3520.length) {
                  class19.method224(class258_12, class69_0.field951, class69_0.x, class69_0.y, -720755355);
               } else {
                  class69_0.field981 = -1;
               }
            }

            class69_0.field967 = class258_12.field3526;
         } else {
            class69_0.field981 = -1;
         }
      }

      if (class69_0.field984 > 0) {
         --class69_0.field984;
      }

   }

}
