public class FontName {

   static class63 field348;
   static class338 loginType;
   public static int field350;
   int field344;
   byte[][][] field343;

   FontName(int i_1) {
      this.field344 = i_1;
   }

   void method702(byte b_1) {
      byte[] bytes_2 = new byte[this.field344 * this.field344];
      int i_3 = 0;

      int i_4;
      int i_5;
      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 <= i_4) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[0][0] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 <= i_4) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[0][1] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 >= i_4) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[0][2] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 >= i_4) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[0][3] = bytes_2;
   }

   int method699(int i_1, int i_2, int i_3) {
      if (i_2 == 9) {
         i_1 = i_1 + 1 & 0x3;
      }

      if (i_2 == 10) {
         i_1 = i_1 + 3 & 0x3;
      }

      if (i_2 == 11) {
         i_1 = i_1 + 3 & 0x3;
      }

      return i_1;
   }

   void method734(int i_1) {
      byte[] bytes_2 = new byte[this.field344 * this.field344];
      int i_3 = 0;

      int i_4;
      int i_5;
      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 <= i_4 >> 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[1][0] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_3 >= 0 && i_3 < bytes_2.length) {
               if (i_5 >= i_4 << 1) {
                  bytes_2[i_3] = -1;
               }

               ++i_3;
            } else {
               ++i_3;
            }
         }
      }

      this.field343[1][1] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 <= i_4 >> 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[1][2] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 >= i_4 << 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[1][3] = bytes_2;
   }

   int method712(int i_1, byte b_2) {
      return i_1 != 9 && i_1 != 10 ? (i_1 == 11 ? 8 : i_1) : 1;
   }

   void method704(int i_1) {
      byte[] bytes_2 = new byte[this.field344 * this.field344];
      int i_3 = 0;

      int i_4;
      int i_5;
      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 <= i_4 >> 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[2][0] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 >= i_4 << 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[2][1] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 <= i_4 >> 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[2][2] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 >= i_4 << 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[2][3] = bytes_2;
   }

   void method705(int i_1) {
      byte[] bytes_2 = new byte[this.field344 * this.field344];
      int i_3 = 0;

      int i_4;
      int i_5;
      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 >= i_4 >> 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[3][0] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 <= i_4 << 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[3][1] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 >= i_4 >> 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[3][2] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 <= i_4 << 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[3][3] = bytes_2;
   }

   void method713(int i_1) {
      byte[] bytes_2 = new byte[this.field344 * this.field344];
      int i_3 = 0;

      int i_4;
      int i_5;
      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 >= i_4 >> 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[4][0] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 <= i_4 << 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[4][1] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 >= i_4 >> 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[4][2] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_3 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 <= i_4 << 1) {
               bytes_2[i_3] = -1;
            }

            ++i_3;
         }
      }

      this.field343[4][3] = bytes_2;
   }

   void method707(int i_1) {
      byte[] bytes_2 = new byte[this.field344 * this.field344];
      boolean bool_3 = false;
      bytes_2 = new byte[this.field344 * this.field344];
      int i_6 = 0;

      int i_4;
      int i_5;
      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 <= this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[5][0] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_6 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_4 <= this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[5][1] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_6 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 >= this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[5][2] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_6 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_4 >= this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[5][3] = bytes_2;
   }

   void method706(int i_1) {
      byte[] bytes_2 = new byte[this.field344 * this.field344];
      boolean bool_3 = false;
      bytes_2 = new byte[this.field344 * this.field344];
      int i_6 = 0;

      int i_4;
      int i_5;
      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 <= i_4 - this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[6][0] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_6 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 <= i_4 - this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[6][1] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_6 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 <= i_4 - this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[6][2] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_6 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 <= i_4 - this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[6][3] = bytes_2;
   }

   void method723(byte b_1) {
      byte[] bytes_2 = new byte[this.field344 * this.field344];
      boolean bool_3 = false;
      bytes_2 = new byte[this.field344 * this.field344];
      int i_6 = 0;

      int i_4;
      int i_5;
      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 >= i_4 - this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[7][0] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_6 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = 0; i_5 < this.field344; i_5++) {
            if (i_5 >= i_4 - this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[7][1] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_6 = 0;

      for (i_4 = this.field344 - 1; i_4 >= 0; --i_4) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 >= i_4 - this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[7][2] = bytes_2;
      bytes_2 = new byte[this.field344 * this.field344];
      i_6 = 0;

      for (i_4 = 0; i_4 < this.field344; i_4++) {
         for (i_5 = this.field344 - 1; i_5 >= 0; --i_5) {
            if (i_5 >= i_4 - this.field344 / 2) {
               bytes_2[i_6] = -1;
            }

            ++i_6;
         }
      }

      this.field343[7][3] = bytes_2;
   }

   void method719(byte b_1) {
      if (this.field343 == null) {
         this.field343 = new byte[8][4][];
         this.method702((byte) -21);
         this.method734(-566933569);
         this.method704(1948794690);
         this.method705(501834296);
         this.method713(-413902072);
         this.method707(448498588);
         this.method706(-1961864087);
         this.method723((byte) 0);
      }
   }

   void method698(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
      if (i_7 != 0 && this.field344 != 0 && this.field343 != null) {
         i_8 = this.method699(i_8, i_7, -500571874);
         i_7 = this.method712(i_7, (byte) -128);
         Rasterizer2D.drawGradientPixels(i_1, i_2, i_5, i_6, i_3, i_4, this.field343[i_7 - 1][i_8], this.field344);
      }
   }

   public static void method729(int i_0, byte b_1) {
      class197.field2402 = 1;
      class11.field76 = null;
      class197.field2403 = -1;
      class197.field2407 = -1;
      class56.field529 = 0;
      class158.field1992 = false;
      class197.field2404 = i_0;
   }

   static int method700(int i_0, byte b_1) {
      return i_0 * 3 + 600;
   }

   static final void method703(Widget widget_0, int i_1, int i_2, int i_3) {
      if (widget_0.field2567 == 1) {
         class188.method3644(widget_0.field2573, "", 24, 0, 0, widget_0.field2688);
      }

      String string_4;
      if (widget_0.field2567 == 2 && !Client.isSpellSelected) {
         string_4 = class292.method5318(widget_0, (byte) 126);
         if (string_4 != null) {
            class188.method3644(string_4, class73.colorStartTag(65280) + widget_0.field2686, 25, 0, -1, widget_0.field2688);
         }
      }

      if (widget_0.field2567 == 3) {
         class188.method3644("Close", "", 26, 0, 0, widget_0.field2688);
      }

      if (widget_0.field2567 == 4) {
         class188.method3644(widget_0.field2573, "", 28, 0, 0, widget_0.field2688);
      }

      if (widget_0.field2567 == 5) {
         class188.method3644(widget_0.field2573, "", 29, 0, 0, widget_0.field2688);
      }

      if (widget_0.field2567 == 6 && Client.field850 == null) {
         class188.method3644(widget_0.field2573, "", 30, 0, -1, widget_0.field2688);
      }

      int i_5;
      int i_14;
      if (widget_0.field2566 == 2) {
         i_14 = 0;

         for (i_5 = 0; i_5 < widget_0.field2667; i_5++) {
            for (int i_6 = 0; i_6 < widget_0.field2579; i_6++) {
               int i_7 = (widget_0.field2631 + 32) * i_6;
               int i_8 = (widget_0.field2632 + 32) * i_5;
               if (i_14 < 20) {
                  i_7 += widget_0.field2633[i_14];
                  i_8 += widget_0.field2634[i_14];
               }

               if (i_1 >= i_7 && i_2 >= i_8 && i_1 < i_7 + 32 && i_2 < i_8 + 32) {
                  Client.field764 = i_14;
                  class294.field3697 = widget_0;
                  if (widget_0.field2560[i_14] > 0) {
                     ItemDefinition itemDefinition_9 = item.getDefinition(widget_0.field2560[i_14] - 1);
                     if (Client.isItemSelected == 1 && class92.method2185(class268.method4987(widget_0))) {
                        if (widget_0.field2688 != class63.field594 || i_14 != class23.field182) {
                           class188.method3644("Use", Client.selectedItemName + " " + "->" + " " + class73.colorStartTag(16748608) + itemDefinition_9.name, 31, itemDefinition_9.field3410, i_14, widget_0.field2688);
                        }
                     } else if (Client.isSpellSelected && class92.method2185(class268.method4987(widget_0))) {
                        if ((WorldMapCacheName.field301 & 0x10) == 16) {
                           class188.method3644(Client.field813, Client.selectedSpellName + " " + "->" + " " + class73.colorStartTag(16748608) + itemDefinition_9.name, 32, itemDefinition_9.field3410, i_14, widget_0.field2688);
                        }
                     } else {
                        String[] arr_10 = itemDefinition_9.inventoryActions;
                        int i_11 = -1;
                        if (Client.field800) {
                           boolean bool_12 = Client.flag_23 || class45.field395[81];
                           if (bool_12) {
                              i_11 = itemDefinition_9.method4652();
                           }
                        }

                        int i_17;
                        if (class92.method2185(class268.method4987(widget_0))) {
                           for (i_17 = 4; i_17 >= 3; --i_17) {
                              if (i_17 != i_11) {
                                 class22.method276(widget_0, itemDefinition_9, i_14, i_17, false, 212040129);
                              }
                           }
                        }

                        if (class195.method3685(class268.method4987(widget_0))) {
                           class188.method3644("Use", class73.colorStartTag(16748608) + itemDefinition_9.name, 38, itemDefinition_9.field3410, i_14, widget_0.field2688);
                        }

                        if (class92.method2185(class268.method4987(widget_0))) {
                           for (i_17 = 2; i_17 >= 0; --i_17) {
                              if (i_11 != i_17) {
                                 class22.method276(widget_0, itemDefinition_9, i_14, i_17, false, 1577647186);
                              }
                           }

                           if (i_11 >= 0) {
                              class22.method276(widget_0, itemDefinition_9, i_14, i_11, true, 106659698);
                           }
                        }

                        arr_10 = widget_0.field2680;
                        if (arr_10 != null) {
                           for (i_17 = 4; i_17 >= 0; --i_17) {
                              if (arr_10[i_17] != null) {
                                 byte b_13 = 0;
                                 if (i_17 == 0) {
                                    b_13 = 39;
                                 }

                                 if (i_17 == 1) {
                                    b_13 = 40;
                                 }

                                 if (i_17 == 2) {
                                    b_13 = 41;
                                 }

                                 if (i_17 == 3) {
                                    b_13 = 42;
                                 }

                                 if (i_17 == 4) {
                                    b_13 = 43;
                                 }

                                 class188.method3644(arr_10[i_17], class73.colorStartTag(16748608) + itemDefinition_9.name, b_13, itemDefinition_9.field3410, i_14, widget_0.field2688);
                              }
                           }
                        }

                        class188.method3644("Examine", class73.colorStartTag(16748608) + itemDefinition_9.name, 1005, itemDefinition_9.field3410, i_14, widget_0.field2688);
                     }
                  }
               }

               ++i_14;
            }
         }
      }

      if (widget_0.field2563) {
         if (Client.isSpellSelected) {
            if (class96.method2266(class268.method4987(widget_0), -2113880295) && (WorldMapCacheName.field301 & 0x20) == 32) {
               class188.method3644(Client.field813, Client.selectedSpellName + " " + "->" + " " + widget_0.field2643, 58, 0, widget_0.field2565, widget_0.field2688);
            }
         } else {
            for (i_14 = 9; i_14 >= 5; --i_14) {
               String string_15 = class154.method3407(widget_0, i_14, (short) 255);
               if (string_15 != null) {
                  class188.method3644(string_15, widget_0.field2643, 1007, i_14 + 1, widget_0.field2565, widget_0.field2688);
               }
            }

            string_4 = class292.method5318(widget_0, (byte) 86);
            if (string_4 != null) {
               class188.method3644(string_4, widget_0.field2643, 25, 0, widget_0.field2565, widget_0.field2688);
            }

            for (i_5 = 4; i_5 >= 0; --i_5) {
               String string_16 = class154.method3407(widget_0, i_5, (short) 255);
               if (string_16 != null) {
                  Entity.method3260(string_16, widget_0.field2643, 57, i_5 + 1, widget_0.field2565, widget_0.field2688, widget_0.field2691);
               }
            }

            if (class61.method1119(class268.method4987(widget_0), -673878359)) {
               class188.method3644("Continue", "", 30, 0, widget_0.field2565, widget_0.field2688);
            }
         }
      }

   }

}
