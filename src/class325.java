public final class class325 extends class321 {

   public int[] field3908;
   public int field3898;
   public int field3899;
   public int field3904;
   public int field3900;
   int field3902;
   public int field3901;

   public class325(int[] ints_1, int i_2, int i_3) {
      this.field3908 = ints_1;
      this.field3899 = this.field3898 = i_2;
      this.field3900 = this.field3904 = i_3;
      this.field3902 = 0;
      this.field3901 = 0;
   }

   public class325(int i_1, int i_2) {
      this(new int[i_2 * i_1], i_1, i_2);
   }

   class325() {
   }

   public void method6126(int i_1, int i_2) {
      i_1 += this.field3901;
      i_2 += this.field3902;
      int i_3 = i_1 + i_2 * class321.field3875;
      int i_4 = 0;
      int i_5 = this.field3900;
      int i_6 = this.field3899;
      int i_7 = class321.field3875 - i_6;
      int i_8 = 0;
      int i_9;
      if (i_2 < class321.field3870) {
         i_9 = class321.field3870 - i_2;
         i_5 -= i_9;
         i_2 = class321.field3870;
         i_4 += i_9 * i_6;
         i_3 += i_9 * class321.field3875;
      }

      if (i_5 + i_2 > class321.field3873) {
         i_5 -= i_5 + i_2 - class321.field3873;
      }

      if (i_1 < class321.field3874) {
         i_9 = class321.field3874 - i_1;
         i_6 -= i_9;
         i_1 = class321.field3874;
         i_4 += i_9;
         i_3 += i_9;
         i_8 += i_9;
         i_7 += i_9;
      }

      if (i_6 + i_1 > class321.field3872) {
         i_9 = i_6 + i_1 - class321.field3872;
         i_6 -= i_9;
         i_8 += i_9;
         i_7 += i_9;
      }

      if (i_6 > 0 && i_5 > 0) {
         method6124(class321.field3869, this.field3908, 0, i_4, i_3, i_6, i_5, i_7, i_8);
      }
   }

   void method6143(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      if (i_6 != 0) {
         i_1 -= this.field3901 << 4;
         i_2 -= this.field3902 << 4;
         double d_7 = (double)(i_5 & 0xffff) * 9.587379924285257E-5D;
         int i_9 = (int)Math.floor(Math.sin(d_7) * (double)i_6 + 0.5D);
         int i_10 = (int)Math.floor(Math.cos(d_7) * (double)i_6 + 0.5D);
         int i_11 = i_10 * -i_1 + -i_2 * i_9;
         int i_12 = -i_2 * i_10 + i_9 * -(-i_1);
         int i_13 = i_10 * ((this.field3899 << 4) - i_1) + -i_2 * i_9;
         int i_14 = i_9 * -((this.field3899 << 4) - i_1) + -i_2 * i_10;
         int i_15 = ((this.field3900 << 4) - i_2) * i_9 + i_10 * -i_1;
         int i_16 = ((this.field3900 << 4) - i_2) * i_10 + i_9 * -(-i_1);
         int i_17 = ((this.field3900 << 4) - i_2) * i_9 + i_10 * ((this.field3899 << 4) - i_1);
         int i_18 = ((this.field3900 << 4) - i_2) * i_10 + i_9 * -((this.field3899 << 4) - i_1);
         int i_19;
         int i_20;
         if (i_11 < i_13) {
            i_19 = i_11;
            i_20 = i_13;
         } else {
            i_19 = i_13;
            i_20 = i_11;
         }

         if (i_15 < i_19) {
            i_19 = i_15;
         }

         if (i_17 < i_19) {
            i_19 = i_17;
         }

         if (i_15 > i_20) {
            i_20 = i_15;
         }

         if (i_17 > i_20) {
            i_20 = i_17;
         }

         int i_21;
         int i_22;
         if (i_12 < i_14) {
            i_21 = i_12;
            i_22 = i_14;
         } else {
            i_21 = i_14;
            i_22 = i_12;
         }

         if (i_16 < i_21) {
            i_21 = i_16;
         }

         if (i_18 < i_21) {
            i_21 = i_18;
         }

         if (i_16 > i_22) {
            i_22 = i_16;
         }

         if (i_18 > i_22) {
            i_22 = i_18;
         }

         i_19 >>= 12;
         i_20 = i_20 + 4095 >> 12;
         i_21 >>= 12;
         i_22 = i_22 + 4095 >> 12;
         i_19 += i_3;
         i_20 += i_3;
         i_21 += i_4;
         i_22 += i_4;
         i_19 >>= 4;
         i_20 = i_20 + 15 >> 4;
         i_21 >>= 4;
         i_22 = i_22 + 15 >> 4;
         if (i_19 < class321.field3874) {
            i_19 = class321.field3874;
         }

         if (i_20 > class321.field3872) {
            i_20 = class321.field3872;
         }

         if (i_21 < class321.field3870) {
            i_21 = class321.field3870;
         }

         if (i_22 > class321.field3873) {
            i_22 = class321.field3873;
         }

         i_20 = i_19 - i_20;
         if (i_20 < 0) {
            i_22 = i_21 - i_22;
            if (i_22 < 0) {
               int i_23 = i_19 + i_21 * class321.field3875;
               double d_24 = 1.6777216E7D / (double)i_6;
               int i_26 = (int)Math.floor(Math.sin(d_7) * d_24 + 0.5D);
               int i_27 = (int)Math.floor(Math.cos(d_7) * d_24 + 0.5D);
               int i_28 = (i_19 << 4) + 8 - i_3;
               int i_29 = (i_21 << 4) + 8 - i_4;
               int i_30 = (i_1 << 8) - (i_29 * i_26 >> 4);
               int i_31 = (i_29 * i_27 >> 4) + (i_2 << 8);
               int i_32;
               int i_33;
               int i_34;
               int i_35;
               int i_36;
               int i_37;
               int i_38;
               if (i_27 == 0) {
                  if (i_26 == 0) {
                     for (i_33 = i_22; i_33 < 0; i_23 += class321.field3875) {
                        i_34 = i_23;
                        i_35 = i_30;
                        i_36 = i_31;
                        i_37 = i_20;
                        if (i_30 >= 0 && i_31 >= 0 && i_30 - (this.field3899 << 12) < 0 && i_31 - (this.field3900 << 12) < 0) {
                           for (; i_37 < 0; i_37++) {
                              i_38 = this.field3908[(i_35 >> 12) + (i_36 >> 12) * this.field3899];
                              if (i_38 != 0) {
                                 class321.field3869[i_34++] = i_38;
                              } else {
                                 ++i_34;
                              }
                           }
                        }

                        ++i_33;
                     }
                  } else if (i_26 < 0) {
                     for (i_33 = i_22; i_33 < 0; i_23 += class321.field3875) {
                        i_34 = i_23;
                        i_35 = i_30;
                        i_36 = (i_28 * i_26 >> 4) + i_31;
                        i_37 = i_20;
                        if (i_30 >= 0 && i_30 - (this.field3899 << 12) < 0) {
                           if ((i_32 = i_36 - (this.field3900 << 12)) >= 0) {
                              i_32 = (i_26 - i_32) / i_26;
                              i_37 = i_20 + i_32;
                              i_36 += i_26 * i_32;
                              i_34 = i_23 + i_32;
                           }

                           if ((i_32 = (i_36 - i_26) / i_26) > i_37) {
                              i_37 = i_32;
                           }

                           while (i_37 < 0) {
                              i_38 = this.field3908[(i_35 >> 12) + (i_36 >> 12) * this.field3899];
                              if (i_38 != 0) {
                                 class321.field3869[i_34++] = i_38;
                              } else {
                                 ++i_34;
                              }

                              i_36 += i_26;
                              ++i_37;
                           }
                        }

                        ++i_33;
                        i_30 -= i_26;
                     }
                  } else {
                     for (i_33 = i_22; i_33 < 0; i_23 += class321.field3875) {
                        i_34 = i_23;
                        i_35 = i_30;
                        i_36 = (i_28 * i_26 >> 4) + i_31;
                        i_37 = i_20;
                        if (i_30 >= 0 && i_30 - (this.field3899 << 12) < 0) {
                           if (i_36 < 0) {
                              i_32 = (i_26 - 1 - i_36) / i_26;
                              i_37 = i_20 + i_32;
                              i_36 += i_26 * i_32;
                              i_34 = i_23 + i_32;
                           }

                           if ((i_32 = (i_36 + 1 - (this.field3900 << 12) - i_26) / i_26) > i_37) {
                              i_37 = i_32;
                           }

                           while (i_37 < 0) {
                              i_38 = this.field3908[(i_35 >> 12) + (i_36 >> 12) * this.field3899];
                              if (i_38 != 0) {
                                 class321.field3869[i_34++] = i_38;
                              } else {
                                 ++i_34;
                              }

                              i_36 += i_26;
                              ++i_37;
                           }
                        }

                        ++i_33;
                        i_30 -= i_26;
                     }
                  }
               } else if (i_27 < 0) {
                  if (i_26 == 0) {
                     for (i_33 = i_22; i_33 < 0; i_23 += class321.field3875) {
                        i_34 = i_23;
                        i_35 = (i_28 * i_27 >> 4) + i_30;
                        i_36 = i_31;
                        i_37 = i_20;
                        if (i_31 >= 0 && i_31 - (this.field3900 << 12) < 0) {
                           if ((i_32 = i_35 - (this.field3899 << 12)) >= 0) {
                              i_32 = (i_27 - i_32) / i_27;
                              i_37 = i_20 + i_32;
                              i_35 += i_27 * i_32;
                              i_34 = i_23 + i_32;
                           }

                           if ((i_32 = (i_35 - i_27) / i_27) > i_37) {
                              i_37 = i_32;
                           }

                           while (i_37 < 0) {
                              i_38 = this.field3908[(i_35 >> 12) + (i_36 >> 12) * this.field3899];
                              if (i_38 != 0) {
                                 class321.field3869[i_34++] = i_38;
                              } else {
                                 ++i_34;
                              }

                              i_35 += i_27;
                              ++i_37;
                           }
                        }

                        ++i_33;
                        i_31 += i_27;
                     }
                  } else if (i_26 < 0) {
                     for (i_33 = i_22; i_33 < 0; i_23 += class321.field3875) {
                        i_34 = i_23;
                        i_35 = (i_28 * i_27 >> 4) + i_30;
                        i_36 = (i_28 * i_26 >> 4) + i_31;
                        i_37 = i_20;
                        if ((i_32 = i_35 - (this.field3899 << 12)) >= 0) {
                           i_32 = (i_27 - i_32) / i_27;
                           i_37 = i_20 + i_32;
                           i_35 += i_27 * i_32;
                           i_36 += i_26 * i_32;
                           i_34 = i_23 + i_32;
                        }

                        if ((i_32 = (i_35 - i_27) / i_27) > i_37) {
                           i_37 = i_32;
                        }

                        if ((i_32 = i_36 - (this.field3900 << 12)) >= 0) {
                           i_32 = (i_26 - i_32) / i_26;
                           i_37 += i_32;
                           i_35 += i_27 * i_32;
                           i_36 += i_26 * i_32;
                           i_34 += i_32;
                        }

                        if ((i_32 = (i_36 - i_26) / i_26) > i_37) {
                           i_37 = i_32;
                        }

                        while (i_37 < 0) {
                           i_38 = this.field3908[(i_35 >> 12) + (i_36 >> 12) * this.field3899];
                           if (i_38 != 0) {
                              class321.field3869[i_34++] = i_38;
                           } else {
                              ++i_34;
                           }

                           i_35 += i_27;
                           i_36 += i_26;
                           ++i_37;
                        }

                        ++i_33;
                        i_30 -= i_26;
                        i_31 += i_27;
                     }
                  } else {
                     for (i_33 = i_22; i_33 < 0; i_23 += class321.field3875) {
                        i_34 = i_23;
                        i_35 = (i_28 * i_27 >> 4) + i_30;
                        i_36 = (i_28 * i_26 >> 4) + i_31;
                        i_37 = i_20;
                        if ((i_32 = i_35 - (this.field3899 << 12)) >= 0) {
                           i_32 = (i_27 - i_32) / i_27;
                           i_37 = i_20 + i_32;
                           i_35 += i_27 * i_32;
                           i_36 += i_26 * i_32;
                           i_34 = i_23 + i_32;
                        }

                        if ((i_32 = (i_35 - i_27) / i_27) > i_37) {
                           i_37 = i_32;
                        }

                        if (i_36 < 0) {
                           i_32 = (i_26 - 1 - i_36) / i_26;
                           i_37 += i_32;
                           i_35 += i_27 * i_32;
                           i_36 += i_26 * i_32;
                           i_34 += i_32;
                        }

                        if ((i_32 = (i_36 + 1 - (this.field3900 << 12) - i_26) / i_26) > i_37) {
                           i_37 = i_32;
                        }

                        while (i_37 < 0) {
                           i_38 = this.field3908[(i_35 >> 12) + (i_36 >> 12) * this.field3899];
                           if (i_38 != 0) {
                              class321.field3869[i_34++] = i_38;
                           } else {
                              ++i_34;
                           }

                           i_35 += i_27;
                           i_36 += i_26;
                           ++i_37;
                        }

                        ++i_33;
                        i_30 -= i_26;
                        i_31 += i_27;
                     }
                  }
               } else if (i_26 == 0) {
                  for (i_33 = i_22; i_33 < 0; i_23 += class321.field3875) {
                     i_34 = i_23;
                     i_35 = (i_28 * i_27 >> 4) + i_30;
                     i_36 = i_31;
                     i_37 = i_20;
                     if (i_31 >= 0 && i_31 - (this.field3900 << 12) < 0) {
                        if (i_35 < 0) {
                           i_32 = (i_27 - 1 - i_35) / i_27;
                           i_37 = i_20 + i_32;
                           i_35 += i_27 * i_32;
                           i_34 = i_23 + i_32;
                        }

                        if ((i_32 = (i_35 + 1 - (this.field3899 << 12) - i_27) / i_27) > i_37) {
                           i_37 = i_32;
                        }

                        while (i_37 < 0) {
                           i_38 = this.field3908[(i_35 >> 12) + (i_36 >> 12) * this.field3899];
                           if (i_38 != 0) {
                              class321.field3869[i_34++] = i_38;
                           } else {
                              ++i_34;
                           }

                           i_35 += i_27;
                           ++i_37;
                        }
                     }

                     ++i_33;
                     i_31 += i_27;
                  }
               } else if (i_26 < 0) {
                  for (i_33 = i_22; i_33 < 0; i_23 += class321.field3875) {
                     i_34 = i_23;
                     i_35 = (i_28 * i_27 >> 4) + i_30;
                     i_36 = (i_28 * i_26 >> 4) + i_31;
                     i_37 = i_20;
                     if (i_35 < 0) {
                        i_32 = (i_27 - 1 - i_35) / i_27;
                        i_37 = i_20 + i_32;
                        i_35 += i_27 * i_32;
                        i_36 += i_26 * i_32;
                        i_34 = i_23 + i_32;
                     }

                     if ((i_32 = (i_35 + 1 - (this.field3899 << 12) - i_27) / i_27) > i_37) {
                        i_37 = i_32;
                     }

                     if ((i_32 = i_36 - (this.field3900 << 12)) >= 0) {
                        i_32 = (i_26 - i_32) / i_26;
                        i_37 += i_32;
                        i_35 += i_27 * i_32;
                        i_36 += i_26 * i_32;
                        i_34 += i_32;
                     }

                     if ((i_32 = (i_36 - i_26) / i_26) > i_37) {
                        i_37 = i_32;
                     }

                     while (i_37 < 0) {
                        i_38 = this.field3908[(i_35 >> 12) + (i_36 >> 12) * this.field3899];
                        if (i_38 != 0) {
                           class321.field3869[i_34++] = i_38;
                        } else {
                           ++i_34;
                        }

                        i_35 += i_27;
                        i_36 += i_26;
                        ++i_37;
                     }

                     ++i_33;
                     i_30 -= i_26;
                     i_31 += i_27;
                  }
               } else {
                  for (i_33 = i_22; i_33 < 0; i_23 += class321.field3875) {
                     i_34 = i_23;
                     i_35 = (i_28 * i_27 >> 4) + i_30;
                     i_36 = (i_28 * i_26 >> 4) + i_31;
                     i_37 = i_20;
                     if (i_35 < 0) {
                        i_32 = (i_27 - 1 - i_35) / i_27;
                        i_37 = i_20 + i_32;
                        i_35 += i_27 * i_32;
                        i_36 += i_26 * i_32;
                        i_34 = i_23 + i_32;
                     }

                     if ((i_32 = (i_35 + 1 - (this.field3899 << 12) - i_27) / i_27) > i_37) {
                        i_37 = i_32;
                     }

                     if (i_36 < 0) {
                        i_32 = (i_26 - 1 - i_36) / i_26;
                        i_37 += i_32;
                        i_35 += i_27 * i_32;
                        i_36 += i_26 * i_32;
                        i_34 += i_32;
                     }

                     if ((i_32 = (i_36 + 1 - (this.field3900 << 12) - i_26) / i_26) > i_37) {
                        i_37 = i_32;
                     }

                     while (i_37 < 0) {
                        i_38 = this.field3908[(i_35 >> 12) + (i_36 >> 12) * this.field3899];
                        if (i_38 != 0) {
                           class321.field3869[i_34++] = i_38;
                        } else {
                           ++i_34;
                        }

                        i_35 += i_27;
                        i_36 += i_26;
                        ++i_37;
                     }

                     ++i_33;
                     i_30 -= i_26;
                     i_31 += i_27;
                  }
               }

            }
         }
      }
   }

   public void method6125(int i_1, int i_2, int i_3, int i_4) {
      if (i_3 > 0 && i_4 > 0) {
         int i_5 = this.field3899;
         int i_6 = this.field3900;
         int i_7 = 0;
         int i_8 = 0;
         int i_9 = this.field3898;
         int i_10 = this.field3904;
         int i_11 = (i_9 << 16) / i_3;
         int i_12 = (i_10 << 16) / i_4;
         int i_13;
         if (this.field3901 > 0) {
            i_13 = (i_11 + (this.field3901 << 16) - 1) / i_11;
            i_1 += i_13;
            i_7 += i_13 * i_11 - (this.field3901 << 16);
         }

         if (this.field3902 > 0) {
            i_13 = (i_12 + (this.field3902 << 16) - 1) / i_12;
            i_2 += i_13;
            i_8 += i_13 * i_12 - (this.field3902 << 16);
         }

         if (i_5 < i_9) {
            i_3 = (i_11 + ((i_5 << 16) - i_7) - 1) / i_11;
         }

         if (i_6 < i_10) {
            i_4 = (i_12 + ((i_6 << 16) - i_8) - 1) / i_12;
         }

         i_13 = i_1 + i_2 * class321.field3875;
         int i_14 = class321.field3875 - i_3;
         if (i_2 + i_4 > class321.field3873) {
            i_4 -= i_2 + i_4 - class321.field3873;
         }

         int i_15;
         if (i_2 < class321.field3870) {
            i_15 = class321.field3870 - i_2;
            i_4 -= i_15;
            i_13 += i_15 * class321.field3875;
            i_8 += i_12 * i_15;
         }

         if (i_3 + i_1 > class321.field3872) {
            i_15 = i_3 + i_1 - class321.field3872;
            i_3 -= i_15;
            i_14 += i_15;
         }

         if (i_1 < class321.field3874) {
            i_15 = class321.field3874 - i_1;
            i_3 -= i_15;
            i_13 += i_15;
            i_7 += i_11 * i_15;
            i_14 += i_15;
         }

         method6200(class321.field3869, this.field3908, 0, i_7, i_8, i_13, i_14, i_3, i_4, i_11, i_12, i_5);
      }
   }

   public void method6144(int i_1, int i_2, int i_3, int i_4) {
      if (i_3 <= this.field3898 && i_4 <= this.field3904) {
         int i_5 = i_3 * this.field3901 / this.field3898 + i_1;
         int i_6 = (i_3 * (this.field3901 + this.field3899) + this.field3898 - 1) / this.field3898 + i_1;
         int i_7 = i_2 + i_4 * this.field3902 / this.field3904;
         int i_8 = i_2 + (this.field3904 + (this.field3902 + this.field3900) * i_4 - 1) / this.field3904;
         if (i_5 < class321.field3874) {
            i_5 = class321.field3874;
         }

         if (i_6 > class321.field3872) {
            i_6 = class321.field3872;
         }

         if (i_7 < class321.field3870) {
            i_7 = class321.field3870;
         }

         if (i_8 > class321.field3873) {
            i_8 = class321.field3873;
         }

         if (i_5 < i_6 && i_7 < i_8) {
            int i_9 = i_5 + i_7 * class321.field3875;
            int i_10 = class321.field3875 - (i_6 - i_5);
            if (i_9 < class321.field3869.length) {
               for (int i_11 = i_7; i_11 < i_8; i_11++) {
                  for (int i_12 = i_5; i_12 < i_6; i_12++) {
                     int i_13 = i_12 - i_1 << 4;
                     int i_14 = i_11 - i_2 << 4;
                     int i_15 = i_13 * this.field3898 / i_3 - (this.field3901 << 4);
                     int i_16 = (i_13 + 16) * this.field3898 / i_3 - (this.field3901 << 4);
                     int i_17 = i_14 * this.field3904 / i_4 - (this.field3902 << 4);
                     int i_18 = (i_14 + 16) * this.field3904 / i_4 - (this.field3902 << 4);
                     int i_19 = (i_16 - i_15) * (i_18 - i_17) >> 1;
                     if (i_19 != 0) {
                        if (i_15 < 0) {
                           i_15 = 0;
                        }

                        if (i_16 >= this.field3899 << 4) {
                           i_16 = this.field3899 << 4;
                        }

                        if (i_17 < 0) {
                           i_17 = 0;
                        }

                        if (i_18 >= this.field3900 << 4) {
                           i_18 = this.field3900 << 4;
                        }

                        --i_16;
                        --i_18;
                        int i_20 = 16 - (i_15 & 0xf);
                        int i_21 = (i_16 & 0xf) + 1;
                        int i_22 = 16 - (i_17 & 0xf);
                        int i_23 = (i_18 & 0xf) + 1;
                        i_15 >>= 4;
                        i_16 >>= 4;
                        i_17 >>= 4;
                        i_18 >>= 4;
                        int i_24 = 0;
                        int i_25 = 0;
                        int i_26 = 0;
                        int i_27 = 0;

                        int i_28;
                        for (i_28 = i_17; i_28 <= i_18; i_28++) {
                           int i_29 = 16;
                           if (i_28 == i_17) {
                              i_29 = i_22;
                           }

                           if (i_28 == i_18) {
                              i_29 = i_23;
                           }

                           for (int i_30 = i_15; i_30 <= i_16; i_30++) {
                              int i_31 = this.field3908[i_30 + i_28 * this.field3899];
                              if (i_31 != 0) {
                                 int i_32;
                                 if (i_30 == i_15) {
                                    i_32 = i_29 * i_20;
                                 } else if (i_30 == i_16) {
                                    i_32 = i_29 * i_21;
                                 } else {
                                    i_32 = i_29 << 4;
                                 }

                                 i_27 += i_32;
                                 i_24 += i_32 * (i_31 >> 16 & 0xff);
                                 i_25 += i_32 * (i_31 >> 8 & 0xff);
                                 i_26 += (i_31 & 0xff) * i_32;
                              }
                           }
                        }

                        if (i_27 >= i_19) {
                           i_28 = i_26 / i_27 + (i_24 / i_27 << 16) + (i_25 / i_27 << 8);
                           if (i_28 == 0) {
                              i_28 = 1;
                           }

                           class321.field3869[i_9] = i_28;
                        }

                        ++i_9;
                     }
                  }

                  i_9 += i_10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method6121(int i_1, int i_2) {
      i_1 += this.field3901;
      i_2 += this.field3902;
      int i_3 = i_1 + i_2 * class321.field3875;
      int i_4 = 0;
      int i_5 = this.field3900;
      int i_6 = this.field3899;
      int i_7 = class321.field3875 - i_6;
      int i_8 = 0;
      int i_9;
      if (i_2 < class321.field3870) {
         i_9 = class321.field3870 - i_2;
         i_5 -= i_9;
         i_2 = class321.field3870;
         i_4 += i_9 * i_6;
         i_3 += i_9 * class321.field3875;
      }

      if (i_5 + i_2 > class321.field3873) {
         i_5 -= i_5 + i_2 - class321.field3873;
      }

      if (i_1 < class321.field3874) {
         i_9 = class321.field3874 - i_1;
         i_6 -= i_9;
         i_1 = class321.field3874;
         i_4 += i_9;
         i_3 += i_9;
         i_8 += i_9;
         i_7 += i_9;
      }

      if (i_6 + i_1 > class321.field3872) {
         i_9 = i_6 + i_1 - class321.field3872;
         i_6 -= i_9;
         i_8 += i_9;
         i_7 += i_9;
      }

      if (i_6 > 0 && i_5 > 0) {
         method6122(class321.field3869, this.field3908, i_4, i_3, i_6, i_5, i_7, i_8);
      }
   }

   public class325 method6113() {
      class325 class325_1 = new class325(this.field3898, this.field3904);

      for (int i_2 = 0; i_2 < this.field3900; i_2++) {
         for (int i_3 = 0; i_3 < this.field3899; i_3++) {
            class325_1.field3908[i_3 + (i_2 + this.field3902) * this.field3898 + this.field3901] = this.field3908[i_3 + i_2 * this.field3899];
         }
      }

      return class325_1;
   }

   public void method6128() {
      int[] ints_1 = new int[this.field3899 * this.field3900];
      int i_2 = 0;

      for (int i_3 = this.field3900 - 1; i_3 >= 0; --i_3) {
         for (int i_4 = 0; i_4 < this.field3899; i_4++) {
            ints_1[i_2++] = this.field3908[i_4 + i_3 * this.field3899];
         }
      }

      this.field3908 = ints_1;
      this.field3902 = this.field3904 - this.field3900 - this.field3902;
   }

   public void method6117() {
      int[] ints_1 = new int[this.field3899 * this.field3900];
      int i_2 = 0;

      for (int i_3 = 0; i_3 < this.field3900; i_3++) {
         for (int i_4 = this.field3899 - 1; i_4 >= 0; --i_4) {
            ints_1[i_2++] = this.field3908[i_4 + i_3 * this.field3899];
         }
      }

      this.field3908 = ints_1;
      this.field3901 = this.field3898 - this.field3899 - this.field3901;
   }

   public void method6114() {
      class321.method6033(this.field3908, this.field3899, this.field3900);
   }

   public void method6115(int i_1) {
      if (this.field3899 != this.field3898 || this.field3900 != this.field3904) {
         int i_2 = i_1;
         if (i_1 > this.field3901) {
            i_2 = this.field3901;
         }

         int i_3 = i_1;
         if (i_1 + this.field3901 + this.field3899 > this.field3898) {
            i_3 = this.field3898 - this.field3901 - this.field3899;
         }

         int i_4 = i_1;
         if (i_1 > this.field3902) {
            i_4 = this.field3902;
         }

         int i_5 = i_1;
         if (i_1 + this.field3902 + this.field3900 > this.field3904) {
            i_5 = this.field3904 - this.field3902 - this.field3900;
         }

         int i_6 = i_2 + i_3 + this.field3899;
         int i_7 = i_4 + i_5 + this.field3900;
         int[] ints_8 = new int[i_6 * i_7];

         for (int i_9 = 0; i_9 < this.field3900; i_9++) {
            for (int i_10 = 0; i_10 < this.field3899; i_10++) {
               ints_8[i_6 * (i_9 + i_4) + i_10 + i_2] = this.field3908[i_10 + i_9 * this.field3899];
            }
         }

         this.field3908 = ints_8;
         this.field3899 = i_6;
         this.field3900 = i_7;
         this.field3901 -= i_2;
         this.field3902 -= i_4;
      }
   }

   public void method6135(int i_1, int i_2, int i_3) {
      i_1 += this.field3901;
      i_2 += this.field3902;
      int i_4 = i_1 + i_2 * class321.field3875;
      int i_5 = 0;
      int i_6 = this.field3900;
      int i_7 = this.field3899;
      int i_8 = class321.field3875 - i_7;
      int i_9 = 0;
      int i_10;
      if (i_2 < class321.field3870) {
         i_10 = class321.field3870 - i_2;
         i_6 -= i_10;
         i_2 = class321.field3870;
         i_5 += i_10 * i_7;
         i_4 += i_10 * class321.field3875;
      }

      if (i_6 + i_2 > class321.field3873) {
         i_6 -= i_6 + i_2 - class321.field3873;
      }

      if (i_1 < class321.field3874) {
         i_10 = class321.field3874 - i_1;
         i_7 -= i_10;
         i_1 = class321.field3874;
         i_5 += i_10;
         i_4 += i_10;
         i_9 += i_10;
         i_8 += i_10;
      }

      if (i_7 + i_1 > class321.field3872) {
         i_10 = i_7 + i_1 - class321.field3872;
         i_7 -= i_10;
         i_9 += i_10;
         i_8 += i_10;
      }

      if (i_7 > 0 && i_6 > 0) {
         if (i_3 == 256) {
            method6134(0, 0, 0, class321.field3869, this.field3908, i_5, 0, i_4, 0, i_7, i_6, i_8, i_9);
         } else {
            method6119(0, 0, 0, class321.field3869, this.field3908, i_5, 0, i_4, 0, i_7, i_6, i_8, i_9, i_3);
         }

      }
   }

   public void method6217(int i_1, int i_2, int i_3, int i_4, int i_5) {
      if (i_3 > 0 && i_4 > 0) {
         int i_6 = this.field3899;
         int i_7 = this.field3900;
         int i_8 = 0;
         int i_9 = 0;
         int i_10 = this.field3898;
         int i_11 = this.field3904;
         int i_12 = (i_10 << 16) / i_3;
         int i_13 = (i_11 << 16) / i_4;
         int i_14;
         if (this.field3901 > 0) {
            i_14 = (i_12 + (this.field3901 << 16) - 1) / i_12;
            i_1 += i_14;
            i_8 += i_14 * i_12 - (this.field3901 << 16);
         }

         if (this.field3902 > 0) {
            i_14 = (i_13 + (this.field3902 << 16) - 1) / i_13;
            i_2 += i_14;
            i_9 += i_14 * i_13 - (this.field3902 << 16);
         }

         if (i_6 < i_10) {
            i_3 = (i_12 + ((i_6 << 16) - i_8) - 1) / i_12;
         }

         if (i_7 < i_11) {
            i_4 = (i_13 + ((i_7 << 16) - i_9) - 1) / i_13;
         }

         i_14 = i_1 + i_2 * class321.field3875;
         int i_15 = class321.field3875 - i_3;
         if (i_2 + i_4 > class321.field3873) {
            i_4 -= i_2 + i_4 - class321.field3873;
         }

         int i_16;
         if (i_2 < class321.field3870) {
            i_16 = class321.field3870 - i_2;
            i_4 -= i_16;
            i_14 += i_16 * class321.field3875;
            i_9 += i_13 * i_16;
         }

         if (i_3 + i_1 > class321.field3872) {
            i_16 = i_3 + i_1 - class321.field3872;
            i_3 -= i_16;
            i_15 += i_16;
         }

         if (i_1 < class321.field3874) {
            i_16 = class321.field3874 - i_1;
            i_3 -= i_16;
            i_14 += i_16;
            i_8 += i_12 * i_16;
            i_15 += i_16;
         }

         if (i_5 == 256) {
            method6111(0, 0, 0, i_8, this.field3908, class321.field3869, 0, 0, -i_4, i_9, i_14, i_15, i_3, i_12, i_13, i_6);
         } else {
            method6138(0, 0, 0, i_8, this.field3908, class321.field3869, 0, 0, -i_4, i_9, i_14, i_15, i_3, i_12, i_13, i_6, i_5);
         }

      }
   }

   public void method6133(int i_1) {
      int[] ints_2 = new int[this.field3899 * this.field3900];
      int i_3 = 0;

      for (int i_4 = 0; i_4 < this.field3900; i_4++) {
         for (int i_5 = 0; i_5 < this.field3899; i_5++) {
            int i_6 = this.field3908[i_3];
            if (i_6 == 0) {
               if (i_5 > 0 && this.field3908[i_3 - 1] != 0) {
                  i_6 = i_1;
               } else if (i_4 > 0 && this.field3908[i_3 - this.field3899] != 0) {
                  i_6 = i_1;
               } else if (i_5 < this.field3899 - 1 && this.field3908[i_3 + 1] != 0) {
                  i_6 = i_1;
               } else if (i_4 < this.field3900 - 1 && this.field3908[i_3 + this.field3899] != 0) {
                  i_6 = i_1;
               }
            }

            ints_2[i_3++] = i_6;
         }
      }

      this.field3908 = ints_2;
   }

   public void method6171(int i_1) {
      for (int i_2 = this.field3900 - 1; i_2 > 0; --i_2) {
         int i_3 = i_2 * this.field3899;

         for (int i_4 = this.field3899 - 1; i_4 > 0; --i_4) {
            if (this.field3908[i_4 + i_3] == 0 && this.field3908[i_4 + i_3 - 1 - this.field3899] != 0) {
               this.field3908[i_4 + i_3] = i_1;
            }
         }
      }

   }

   public void method6140(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int[] ints_9, int[] ints_10) {
      try {
         int i_11 = -i_3 / 2;
         int i_12 = -i_4 / 2;
         int i_13 = (int)(Math.sin((double)i_7 / 326.11D) * 65536.0D);
         int i_14 = (int)(Math.cos((double)i_7 / 326.11D) * 65536.0D);
         i_13 = i_13 * i_8 >> 8;
         i_14 = i_14 * i_8 >> 8;
         int i_15 = i_12 * i_13 + i_11 * i_14 + (i_5 << 16);
         int i_16 = i_12 * i_14 - i_11 * i_13 + (i_6 << 16);
         int i_17 = i_1 + i_2 * class321.field3875;

         for (i_2 = 0; i_2 < i_4; i_2++) {
            int i_18 = ints_9[i_2];
            int i_19 = i_17 + i_18;
            int i_20 = i_15 + i_14 * i_18;
            int i_21 = i_16 - i_13 * i_18;

            for (i_1 = -ints_10[i_2]; i_1 < 0; i_1++) {
               class321.field3869[i_19++] = this.field3908[this.field3899 * (i_21 >> 16) + (i_20 >> 16)];
               i_20 += i_14;
               i_21 -= i_13;
            }

            i_15 += i_13;
            i_16 += i_14;
            i_17 += class321.field3875;
         }
      } catch (Exception exception_23) {
         ;
      }

   }

   public void method6131(int i_1, int i_2, int i_3, int i_4, int i_5) {
      if (i_3 > 0 && i_4 > 0) {
         int i_6 = this.field3899;
         int i_7 = this.field3900;
         int i_8 = 0;
         int i_9 = 0;
         int i_10 = this.field3898;
         int i_11 = this.field3904;
         int i_12 = (i_10 << 16) / i_3;
         int i_13 = (i_11 << 16) / i_4;
         int i_14;
         if (this.field3901 > 0) {
            i_14 = (i_12 + (this.field3901 << 16) - 1) / i_12;
            i_1 += i_14;
            i_8 += i_14 * i_12 - (this.field3901 << 16);
         }

         if (this.field3902 > 0) {
            i_14 = (i_13 + (this.field3902 << 16) - 1) / i_13;
            i_2 += i_14;
            i_9 += i_14 * i_13 - (this.field3902 << 16);
         }

         if (i_6 < i_10) {
            i_3 = (i_12 + ((i_6 << 16) - i_8) - 1) / i_12;
         }

         if (i_7 < i_11) {
            i_4 = (i_13 + ((i_7 << 16) - i_9) - 1) / i_13;
         }

         i_14 = i_1 + i_2 * class321.field3875;
         int i_15 = class321.field3875 - i_3;
         if (i_2 + i_4 > class321.field3873) {
            i_4 -= i_2 + i_4 - class321.field3873;
         }

         int i_16;
         if (i_2 < class321.field3870) {
            i_16 = class321.field3870 - i_2;
            i_4 -= i_16;
            i_14 += i_16 * class321.field3875;
            i_9 += i_13 * i_16;
         }

         if (i_3 + i_1 > class321.field3872) {
            i_16 = i_3 + i_1 - class321.field3872;
            i_3 -= i_16;
            i_15 += i_16;
         }

         if (i_1 < class321.field3874) {
            i_16 = class321.field3874 - i_1;
            i_3 -= i_16;
            i_14 += i_16;
            i_8 += i_12 * i_16;
            i_15 += i_16;
         }

         method6132(class321.field3869, this.field3908, 0, i_8, i_9, i_14, i_15, i_3, i_4, i_12, i_13, i_6, i_5);
      }
   }

   public void method6186(int i_1, int i_2, int i_3, int i_4) {
      this.method6143(this.field3898 << 3, this.field3904 << 3, i_1 << 4, i_2 << 4, i_3, i_4);
   }

   public void method6129(int i_1, int i_2, int i_3) {
      i_1 += this.field3901;
      i_2 += this.field3902;
      int i_4 = i_1 + i_2 * class321.field3875;
      int i_5 = 0;
      int i_6 = this.field3900;
      int i_7 = this.field3899;
      int i_8 = class321.field3875 - i_7;
      int i_9 = 0;
      int i_10;
      if (i_2 < class321.field3870) {
         i_10 = class321.field3870 - i_2;
         i_6 -= i_10;
         i_2 = class321.field3870;
         i_5 += i_10 * i_7;
         i_4 += i_10 * class321.field3875;
      }

      if (i_6 + i_2 > class321.field3873) {
         i_6 -= i_6 + i_2 - class321.field3873;
      }

      if (i_1 < class321.field3874) {
         i_10 = class321.field3874 - i_1;
         i_7 -= i_10;
         i_1 = class321.field3874;
         i_5 += i_10;
         i_4 += i_10;
         i_9 += i_10;
         i_8 += i_10;
      }

      if (i_7 + i_1 > class321.field3872) {
         i_10 = i_7 + i_1 - class321.field3872;
         i_7 -= i_10;
         i_9 += i_10;
         i_8 += i_10;
      }

      if (i_7 > 0 && i_6 > 0) {
         method6130(class321.field3869, this.field3908, 0, i_5, i_4, i_7, i_6, i_8, i_9, i_3);
      }
   }

   public void method6145() {
      if (this.field3899 != this.field3898 || this.field3900 != this.field3904) {
         int[] ints_1 = new int[this.field3898 * this.field3904];

         for (int i_2 = 0; i_2 < this.field3900; i_2++) {
            for (int i_3 = 0; i_3 < this.field3899; i_3++) {
               ints_1[i_3 + (i_2 + this.field3902) * this.field3898 + this.field3901] = this.field3908[i_3 + i_2 * this.field3899];
            }
         }

         this.field3908 = ints_1;
         this.field3899 = this.field3898;
         this.field3900 = this.field3904;
         this.field3901 = 0;
         this.field3902 = 0;
      }
   }

   public void method6146(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int[] ints_7, int[] ints_8) {
      int i_9 = i_2 < 0 ? -i_2 : 0;
      int i_10 = i_2 + this.field3900 <= i_6 ? this.field3900 : i_6 - i_2;
      int i_11 = i_1 < 0 ? -i_1 : 0;
      int i_10000;
      if (this.field3899 + i_1 <= i_5) {
         i_10000 = this.field3899;
      } else {
         i_10000 = i_5 - i_1;
      }

      int i_13 = i_3 + i_11 + (i_9 + i_2 + i_4) * class321.field3875 + i_1;
      int i_14 = i_9 + i_2;

      for (int i_15 = i_9; i_15 < i_10; i_15++) {
         int i_16 = ints_7[i_14];
         int i_17 = ints_8[i_14++];
         int i_18 = i_13;
         int i_19;
         if (i_1 < i_16) {
            i_19 = i_16 - i_1;
            i_18 = i_13 + (i_19 - i_11);
         } else {
            i_19 = i_11;
         }

         int i_12;
         if (this.field3899 + i_1 <= i_16 + i_17) {
            i_12 = this.field3899;
         } else {
            i_12 = i_16 + i_17 - i_1;
         }

         for (int i_20 = i_19; i_20 < i_12; i_20++) {
            int i_21 = this.field3908[i_20 + i_15 * this.field3899];
            if (i_21 != 0) {
               class321.field3869[i_18++] = i_21;
            } else {
               ++i_18;
            }
         }

         i_13 += class321.field3875;
      }

   }

   public class325 method6112() {
      class325 class325_1 = new class325(this.field3899, this.field3900);
      class325_1.field3898 = this.field3898;
      class325_1.field3904 = this.field3904;
      class325_1.field3901 = this.field3898 - this.field3899 - this.field3901;
      class325_1.field3902 = this.field3902;

      for (int i_2 = 0; i_2 < this.field3900; i_2++) {
         for (int i_3 = 0; i_3 < this.field3899; i_3++) {
            class325_1.field3908[i_3 + i_2 * this.field3899] = this.field3908[i_2 * this.field3899 + this.field3899 - 1 - i_3];
         }
      }

      return class325_1;
   }

   public void method6193(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, double d_7, int i_9) {
      try {
         int i_10 = -i_3 / 2;
         int i_11 = -i_4 / 2;
         int i_12 = (int)(Math.sin(d_7) * 65536.0D);
         int i_13 = (int)(Math.cos(d_7) * 65536.0D);
         i_12 = i_12 * i_9 >> 8;
         i_13 = i_13 * i_9 >> 8;
         int i_14 = i_11 * i_12 + i_10 * i_13 + (i_5 << 16);
         int i_15 = i_11 * i_13 - i_10 * i_12 + (i_6 << 16);
         int i_16 = i_1 + i_2 * class321.field3875;

         for (i_2 = 0; i_2 < i_4; i_2++) {
            int i_17 = i_16;
            int i_18 = i_14;
            int i_19 = i_15;

            for (i_1 = -i_3; i_1 < 0; i_1++) {
               int i_20 = this.field3908[this.field3899 * (i_19 >> 16) + (i_18 >> 16)];
               if (i_20 != 0) {
                  class321.field3869[i_17++] = i_20;
               } else {
                  ++i_17;
               }

               i_18 += i_13;
               i_19 -= i_12;
            }

            i_14 += i_12;
            i_15 += i_13;
            i_16 += class321.field3875;
         }
      } catch (Exception exception_22) {
         ;
      }

   }

   public void method6127(int i_1, int i_2, int i_3, int i_4) {
      if (i_3 == 256) {
         this.method6126(i_1, i_2);
      } else {
         i_1 += this.field3901;
         i_2 += this.field3902;
         int i_5 = i_1 + i_2 * class321.field3875;
         int i_6 = 0;
         int i_7 = this.field3900;
         int i_8 = this.field3899;
         int i_9 = class321.field3875 - i_8;
         int i_10 = 0;
         int i_11;
         if (i_2 < class321.field3870) {
            i_11 = class321.field3870 - i_2;
            i_7 -= i_11;
            i_2 = class321.field3870;
            i_6 += i_11 * i_8;
            i_5 += i_11 * class321.field3875;
         }

         if (i_7 + i_2 > class321.field3873) {
            i_7 -= i_7 + i_2 - class321.field3873;
         }

         if (i_1 < class321.field3874) {
            i_11 = class321.field3874 - i_1;
            i_8 -= i_11;
            i_1 = class321.field3874;
            i_6 += i_11;
            i_5 += i_11;
            i_10 += i_11;
            i_9 += i_11;
         }

         if (i_8 + i_1 > class321.field3872) {
            i_11 = i_8 + i_1 - class321.field3872;
            i_8 -= i_11;
            i_10 += i_11;
            i_9 += i_11;
         }

         if (i_8 > 0 && i_7 > 0) {
            method6123(class321.field3869, this.field3908, 0, i_6, i_5, i_8, i_7, i_9, i_10, i_3, i_4);
         }
      }
   }

   static void method6122(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      for (int i_8 = -i_5; i_8 < 0; i_8++) {
         int i_9;
         for (i_9 = i_3 + i_4 - 3; i_3 < i_9; ints_0[i_3++] = ints_1[i_2++]) {
            ints_0[i_3++] = ints_1[i_2++];
            ints_0[i_3++] = ints_1[i_2++];
            ints_0[i_3++] = ints_1[i_2++];
         }

         for (i_9 += 3; i_3 < i_9; ints_0[i_3++] = ints_1[i_2++]) {
            ;
         }

         i_3 += i_6;
         i_2 += i_7;
      }

   }

   static void method6130(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
      int i_10 = 256 - i_9;

      for (int i_11 = -i_6; i_11 < 0; i_11++) {
         for (int i_12 = -i_5; i_12 < 0; i_12++) {
            i_2 = ints_1[i_3++];
            if (i_2 != 0) {
               int i_13 = ints_0[i_4];
               ints_0[i_4++] = ((i_13 & 0xff00ff) * i_10 + i_9 * (i_2 & 0xff00ff) & ~0xff00ff) + ((i_2 & 0xff00) * i_9 + i_10 * (i_13 & 0xff00) & 0xff0000) >> 8;
            } else {
               ++i_4;
            }
         }

         i_4 += i_7;
         i_3 += i_8;
      }

   }

   static void method6124(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
      int i_9 = -(i_5 >> 2);
      i_5 = -(i_5 & 0x3);

      for (int i_10 = -i_6; i_10 < 0; i_10++) {
         int i_11;
         for (i_11 = i_9; i_11 < 0; i_11++) {
            i_2 = ints_1[i_3++];
            if (i_2 != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }

            i_2 = ints_1[i_3++];
            if (i_2 != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }

            i_2 = ints_1[i_3++];
            if (i_2 != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }

            i_2 = ints_1[i_3++];
            if (i_2 != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }
         }

         for (i_11 = i_5; i_11 < 0; i_11++) {
            i_2 = ints_1[i_3++];
            if (i_2 != 0) {
               ints_0[i_4++] = i_2;
            } else {
               ++i_4;
            }
         }

         i_4 += i_7;
         i_3 += i_8;
      }

   }

   static void method6119(int i_0, int i_1, int i_2, int[] ints_3, int[] ints_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13) {
      for (i_8 = -i_10; i_8 < 0; i_8++) {
         for (i_6 = -i_9; i_6 < 0; i_6++) {
            i_0 = ints_4[i_5++];
            if (i_0 != 0) {
               i_1 = i_13 * (i_0 & 0xff00ff);
               i_0 = (i_1 & ~0xff00ff) + (i_13 * i_0 - i_1 & 0xff0000) >>> 8;
               i_1 = ints_3[i_7];
               i_2 = i_0 + i_1;
               i_0 = (i_0 & 0xff00ff) + (i_1 & 0xff00ff);
               i_1 = (i_0 & 0x1000100) + (i_2 - i_0 & 0x10000);
               ints_3[i_7++] = i_2 - i_1 | i_1 - (i_1 >>> 8);
            } else {
               ++i_7;
            }
         }

         i_7 += i_11;
         i_5 += i_12;
      }

   }

   static void method6123(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
      int i_11 = 256 - i_9;
      int i_12 = (i_10 & 0xff00ff) * i_11 & ~0xff00ff;
      int i_13 = (i_10 & 0xff00) * i_11 & 0xff0000;
      i_10 = (i_12 | i_13) >>> 8;

      for (int i_14 = -i_6; i_14 < 0; i_14++) {
         for (int i_15 = -i_5; i_15 < 0; i_15++) {
            i_2 = ints_1[i_3++];
            if (i_2 != 0) {
               i_12 = i_9 * (i_2 & 0xff00ff) & ~0xff00ff;
               i_13 = (i_2 & 0xff00) * i_9 & 0xff0000;
               ints_0[i_4++] = i_10 + ((i_12 | i_13) >>> 8);
            } else {
               ++i_4;
            }
         }

         i_4 += i_7;
         i_3 += i_8;
      }

   }

   static void method6134(int i_0, int i_1, int i_2, int[] ints_3, int[] ints_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
      for (i_8 = -i_10; i_8 < 0; i_8++) {
         for (i_6 = -i_9; i_6 < 0; i_6++) {
            i_0 = ints_4[i_5++];
            if (i_0 != 0) {
               i_1 = ints_3[i_7];
               i_2 = i_0 + i_1;
               i_0 = (i_0 & 0xff00ff) + (i_1 & 0xff00ff);
               i_1 = (i_0 & 0x1000100) + (i_2 - i_0 & 0x10000);
               ints_3[i_7++] = i_2 - i_1 | i_1 - (i_1 >>> 8);
            } else {
               ++i_7;
            }
         }

         i_7 += i_11;
         i_5 += i_12;
      }

   }

   static void method6132(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
      int i_13 = 256 - i_12;
      int i_14 = i_3;

      for (int i_15 = -i_8; i_15 < 0; i_15++) {
         int i_16 = i_11 * (i_4 >> 16);

         for (int i_17 = -i_7; i_17 < 0; i_17++) {
            i_2 = ints_1[(i_3 >> 16) + i_16];
            if (i_2 != 0) {
               int i_18 = ints_0[i_5];
               ints_0[i_5++] = ((i_2 & 0xff00) * i_12 + i_13 * (i_18 & 0xff00) & 0xff0000) + ((i_18 & 0xff00ff) * i_13 + i_12 * (i_2 & 0xff00ff) & ~0xff00ff) >> 8;
            } else {
               ++i_5;
            }

            i_3 += i_9;
         }

         i_4 += i_10;
         i_3 = i_14;
         i_5 += i_6;
      }

   }

   static void method6200(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
      int i_12 = i_3;

      for (int i_13 = -i_8; i_13 < 0; i_13++) {
         int i_14 = i_11 * (i_4 >> 16);

         for (int i_15 = -i_7; i_15 < 0; i_15++) {
            i_2 = ints_1[(i_3 >> 16) + i_14];
            if (i_2 != 0) {
               ints_0[i_5++] = i_2;
            } else {
               ++i_5;
            }

            i_3 += i_9;
         }

         i_4 += i_10;
         i_3 = i_12;
         i_5 += i_6;
      }

   }

   static void method6111(int i_0, int i_1, int i_2, int i_3, int[] ints_4, int[] ints_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15) {
      for (int i_16 = i_3; i_8 < 0; i_8++) {
         i_7 = i_15 * (i_9 >> 16);

         for (i_6 = -i_12; i_6 < 0; i_6++) {
            i_0 = ints_4[(i_3 >> 16) + i_7];
            if (i_0 != 0) {
               i_1 = ints_5[i_10];
               i_2 = i_0 + i_1;
               i_0 = (i_0 & 0xff00ff) + (i_1 & 0xff00ff);
               i_1 = (i_0 & 0x1000100) + (i_2 - i_0 & 0x10000);
               ints_5[i_10++] = i_2 - i_1 | i_1 - (i_1 >>> 8);
            } else {
               ++i_10;
            }

            i_3 += i_13;
         }

         i_9 += i_14;
         i_3 = i_16;
         i_10 += i_11;
      }

   }

   static void method6138(int i_0, int i_1, int i_2, int i_3, int[] ints_4, int[] ints_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16) {
      for (int i_17 = i_3; i_8 < 0; i_8++) {
         i_7 = i_15 * (i_9 >> 16);

         for (i_6 = -i_12; i_6 < 0; i_6++) {
            i_0 = ints_4[(i_3 >> 16) + i_7];
            if (i_0 != 0) {
               i_1 = (i_0 & 0xff00ff) * i_16;
               i_0 = (i_1 & ~0xff00ff) + (i_0 * i_16 - i_1 & 0xff0000) >>> 8;
               i_1 = ints_5[i_10];
               i_2 = i_0 + i_1;
               i_0 = (i_0 & 0xff00ff) + (i_1 & 0xff00ff);
               i_1 = (i_0 & 0x1000100) + (i_2 - i_0 & 0x10000);
               ints_5[i_10++] = i_2 - i_1 | i_1 - (i_1 >>> 8);
            } else {
               ++i_10;
            }

            i_3 += i_13;
         }

         i_9 += i_14;
         i_3 = i_17;
         i_10 += i_11;
      }

   }

}
