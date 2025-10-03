public class class9 {

   static int field65;
   byte field62;
   public int field59;
   public int field60;
   public int field61;
   public int field58;
   public int field63;

   public class9() {
   }

   public class9(ByteBuffer class300_1, boolean bool_2) {
      this.field62 = class300_1.readSignedByte();
      this.field59 = class300_1.readUnsignedShort();
      this.field60 = class300_1.readIntMedEndian();
      this.field61 = class300_1.readIntMedEndian();
      this.field58 = class300_1.readIntMedEndian();
      this.field63 = class300_1.readIntMedEndian();
   }

   void method115(int i_1, byte b_2) {
      this.field62 &= ~0x7;
      this.field62 = (byte)(this.field62 | i_1 & 0x7);
   }

   void method100(int i_1, int i_2) {
      this.field62 &= ~0x8;
      if (i_1 == 1) {
         this.field62 = (byte)(this.field62 | 0x8);
      }

   }

   public int method98(int i_1) {
      return (this.field62 & 0x8) == 8 ? 1 : 0;
   }

   public int method97(byte b_1) {
      return this.field62 & 0x7;
   }

   static final void method99(boolean bool_0, int i_1) {
      if (bool_0) {
         Client.field690 = Login.field1201 ? class160.field2004 : class160.field2002;
      } else {
         Client.field690 = class17.field117.field1067.containsKey(Integer.valueOf(class128.method2971(Login.field1180, -1497982672))) ? class160.field2005 : class160.field2001;
      }

   }

   static int method114(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      int i_4;
      if (i_0 == 6600) {
         i_4 = ItemContainer_2.plane;
         int i_10 = (Client.localPlayer.x >> 7) + class196.field2389;
         int i_6 = (Client.localPlayer.y >> 7) + class1.field1;
         class31.method538(-1838562089).method6309(i_4, i_10, i_6, true, (byte) -35);
         return 1;
      } else {
         class26 class26_12;
         if (i_0 == 6601) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            String str_17 = "";
            class26_12 = class31.method538(1201574134).method6327(i_4, -733609439);
            if (class26_12 != null) {
               str_17 = class26_12.method335();
            }

            MouseRecorder.field1093[++class221.field2747 - 1] = str_17;
            return 1;
         } else if (i_0 == 6602) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            class31.method538(630425441).method6310(i_4, -2081966255);
            return 1;
         } else if (i_0 == 6603) {
            MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(-435363843).method6451((byte) 58);
            return 1;
         } else if (i_0 == 6604) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            class31.method538(618306857).method6485(i_4, 1089841292);
            return 1;
         } else if (i_0 == 6605) {
            MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(826208873).method6326(1852688720) ? 1 : 0;
            return 1;
         } else {
            class213 class213_16;
            if (i_0 == 6606) {
               class213_16 = new class213(MouseRecorder.field1098[--class70.field1014]);
               class31.method538(54225408).method6369(class213_16.field2530, class213_16.field2528, -1604144136);
               return 1;
            } else if (i_0 == 6607) {
               class213_16 = new class213(MouseRecorder.field1098[--class70.field1014]);
               class31.method538(-1682778046).method6380(class213_16.field2530, class213_16.field2528, 2147035195);
               return 1;
            } else if (i_0 == 6608) {
               class213_16 = new class213(MouseRecorder.field1098[--class70.field1014]);
               class31.method538(1640139719).method6330(class213_16.field2531, class213_16.field2530, class213_16.field2528, -1252480817);
               return 1;
            } else if (i_0 == 6609) {
               class213_16 = new class213(MouseRecorder.field1098[--class70.field1014]);
               class31.method538(-1966209690).method6389(class213_16.field2531, class213_16.field2530, class213_16.field2528, -1225675746);
               return 1;
            } else if (i_0 == 6610) {
               MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(-1895814187).method6332(-786263367);
               MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(-226281637).method6333(-2026899768);
               return 1;
            } else {
               class26 class26_14;
               if (i_0 == 6611) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class26_14 = class31.method538(1618536047).method6327(i_4, 371370924);
                  if (class26_14 == null) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                  } else {
                     MouseRecorder.field1098[++class70.field1014 - 1] = class26_14.method345().method3971();
                  }

                  return 1;
               } else if (i_0 == 6612) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class26_14 = class31.method538(-364103985).method6327(i_4, 454428349);
                  if (class26_14 == null) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                  } else {
                     MouseRecorder.field1098[++class70.field1014 - 1] = (class26_14.method339() - class26_14.method338(-225927464) + 1) * 64;
                     MouseRecorder.field1098[++class70.field1014 - 1] = (class26_14.method341() - class26_14.method340(-187266563) + 1) * 64;
                  }

                  return 1;
               } else if (i_0 == 6613) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class26_14 = class31.method538(-744211055).method6327(i_4, -295785202);
                  if (class26_14 == null) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                     MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                  } else {
                     MouseRecorder.field1098[++class70.field1014 - 1] = class26_14.method338(-528143039) * 64;
                     MouseRecorder.field1098[++class70.field1014 - 1] = class26_14.method340(-1424093929) * 64;
                     MouseRecorder.field1098[++class70.field1014 - 1] = class26_14.method339() * 64 + 64 - 1;
                     MouseRecorder.field1098[++class70.field1014 - 1] = class26_14.method341() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (i_0 == 6614) {
                  i_4 = MouseRecorder.field1098[--class70.field1014];
                  class26_14 = class31.method538(-590456922).method6327(i_4, -855691194);
                  if (class26_14 == null) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                  } else {
                     MouseRecorder.field1098[++class70.field1014 - 1] = class26_14.method337(30465795);
                  }

                  return 1;
               } else if (i_0 == 6615) {
                  class213_16 = class31.method538(-1239684121).method6415((byte) 19);
                  if (class213_16 == null) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                     MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                  } else {
                     MouseRecorder.field1098[++class70.field1014 - 1] = class213_16.field2530;
                     MouseRecorder.field1098[++class70.field1014 - 1] = class213_16.field2528;
                  }

                  return 1;
               } else if (i_0 == 6616) {
                  MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(1463361745).method6311((byte) 89);
                  return 1;
               } else if (i_0 == 6617) {
                  class213_16 = new class213(MouseRecorder.field1098[--class70.field1014]);
                  class26_14 = class31.method538(283440833).method6312((byte) -121);
                  if (class26_14 == null) {
                     MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                     MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                     return 1;
                  } else {
                     int[] ints_15 = class26_14.method330(class213_16.field2531, class213_16.field2530, class213_16.field2528, -160232063);
                     if (ints_15 == null) {
                        MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                        MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                     } else {
                        MouseRecorder.field1098[++class70.field1014 - 1] = ints_15[0];
                        MouseRecorder.field1098[++class70.field1014 - 1] = ints_15[1];
                     }

                     return 1;
                  }
               } else {
                  class213 class213_8;
                  if (i_0 == 6618) {
                     class213_16 = new class213(MouseRecorder.field1098[--class70.field1014]);
                     class26_14 = class31.method538(1284187727).method6312((byte) -48);
                     if (class26_14 == null) {
                        MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                        MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                        return 1;
                     } else {
                        class213_8 = class26_14.method331(class213_16.field2530, class213_16.field2528, 1895950349);
                        if (class213_8 == null) {
                           MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                        } else {
                           MouseRecorder.field1098[++class70.field1014 - 1] = class213_8.method3971();
                        }

                        return 1;
                     }
                  } else {
                     class213 class213_13;
                     if (i_0 == 6619) {
                        class70.field1014 -= 2;
                        i_4 = MouseRecorder.field1098[class70.field1014];
                        class213_13 = new class213(MouseRecorder.field1098[class70.field1014 + 1]);
                        class75.method1824(i_4, class213_13, false, (byte) 22);
                        return 1;
                     } else if (i_0 == 6620) {
                        class70.field1014 -= 2;
                        i_4 = MouseRecorder.field1098[class70.field1014];
                        class213_13 = new class213(MouseRecorder.field1098[class70.field1014 + 1]);
                        class75.method1824(i_4, class213_13, true, (byte) 22);
                        return 1;
                     } else if (i_0 == 6621) {
                        class70.field1014 -= 2;
                        i_4 = MouseRecorder.field1098[class70.field1014];
                        class213_13 = new class213(MouseRecorder.field1098[class70.field1014 + 1]);
                        class26_12 = class31.method538(-105530254).method6327(i_4, -710920521);
                        if (class26_12 == null) {
                           MouseRecorder.field1098[++class70.field1014 - 1] = 0;
                           return 1;
                        } else {
                           MouseRecorder.field1098[++class70.field1014 - 1] = class26_12.method373(class213_13.field2531, class213_13.field2530, class213_13.field2528, -709559880) ? 1 : 0;
                           return 1;
                        }
                     } else if (i_0 == 6622) {
                        MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(-2041526184).method6412(-1379152210);
                        MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(-500873461).method6461((byte) 86);
                        return 1;
                     } else if (i_0 == 6623) {
                        class213_16 = new class213(MouseRecorder.field1098[--class70.field1014]);
                        class26_14 = class31.method538(630959442).method6308(class213_16.field2531, class213_16.field2530, class213_16.field2528, (byte) 68);
                        if (class26_14 == null) {
                           MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                        } else {
                           MouseRecorder.field1098[++class70.field1014 - 1] = class26_14.method347((byte) 11);
                        }

                        return 1;
                     } else if (i_0 == 6624) {
                        class31.method538(1378979231).method6337(MouseRecorder.field1098[--class70.field1014], 1678064633);
                        return 1;
                     } else if (i_0 == 6625) {
                        class31.method538(371217338).method6338((byte) 18);
                        return 1;
                     } else if (i_0 == 6626) {
                        class31.method538(-1829766960).method6339(MouseRecorder.field1098[--class70.field1014], 127822739);
                        return 1;
                     } else if (i_0 == 6627) {
                        class31.method538(1127804538).method6340(-244117630);
                        return 1;
                     } else {
                        boolean bool_11;
                        if (i_0 == 6628) {
                           bool_11 = MouseRecorder.field1098[--class70.field1014] == 1;
                           class31.method538(-56773412).method6492(bool_11, 1836786082);
                           return 1;
                        } else if (i_0 == 6629) {
                           i_4 = MouseRecorder.field1098[--class70.field1014];
                           class31.method538(-1518660393).method6341(i_4, -1761276065);
                           return 1;
                        } else if (i_0 == 6630) {
                           i_4 = MouseRecorder.field1098[--class70.field1014];
                           class31.method538(727083284).method6342(i_4, -685614117);
                           return 1;
                        } else if (i_0 == 6631) {
                           class31.method538(-1757032437).method6343(1910993188);
                           return 1;
                        } else if (i_0 == 6632) {
                           bool_11 = MouseRecorder.field1098[--class70.field1014] == 1;
                           class31.method538(-1129863147).method6403(bool_11, (byte) 35);
                           return 1;
                        } else {
                           boolean bool_5;
                           if (i_0 == 6633) {
                              class70.field1014 -= 2;
                              i_4 = MouseRecorder.field1098[class70.field1014];
                              bool_5 = MouseRecorder.field1098[class70.field1014 + 1] == 1;
                              class31.method538(-238646402).method6345(i_4, bool_5, (byte) -69);
                              return 1;
                           } else if (i_0 == 6634) {
                              class70.field1014 -= 2;
                              i_4 = MouseRecorder.field1098[class70.field1014];
                              bool_5 = MouseRecorder.field1098[class70.field1014 + 1] == 1;
                              class31.method538(-94405151).method6476(i_4, bool_5, -1036879778);
                              return 1;
                           } else if (i_0 == 6635) {
                              MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(-958575024).method6347((short) -27155) ? 1 : 0;
                              return 1;
                           } else if (i_0 == 6636) {
                              i_4 = MouseRecorder.field1098[--class70.field1014];
                              MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(1728852855).method6348(i_4, (byte) -85) ? 1 : 0;
                              return 1;
                           } else if (i_0 == 6637) {
                              i_4 = MouseRecorder.field1098[--class70.field1014];
                              MouseRecorder.field1098[++class70.field1014 - 1] = class31.method538(-8211560).method6349(i_4, -120988361) ? 1 : 0;
                              return 1;
                           } else if (i_0 == 6638) {
                              class70.field1014 -= 2;
                              i_4 = MouseRecorder.field1098[class70.field1014];
                              class213_13 = new class213(MouseRecorder.field1098[class70.field1014 + 1]);
                              class213_8 = class31.method538(128080394).method6352(i_4, class213_13, 719601861);
                              if (class213_8 == null) {
                                 MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                              } else {
                                 MouseRecorder.field1098[++class70.field1014 - 1] = class213_8.method3971();
                              }

                              return 1;
                           } else {
                              class34 class34_9;
                              if (i_0 == 6639) {
                                 class34_9 = class31.method538(739076011).method6346(1843313611);
                                 if (class34_9 == null) {
                                    MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                                    MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                                 } else {
                                    MouseRecorder.field1098[++class70.field1014 - 1] = class34_9.vmethod597(-1120177907);
                                    MouseRecorder.field1098[++class70.field1014 - 1] = class34_9.field297.method3971();
                                 }

                                 return 1;
                              } else if (i_0 == 6640) {
                                 class34_9 = class31.method538(-548343524).method6355((byte) 64);
                                 if (class34_9 == null) {
                                    MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                                    MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                                 } else {
                                    MouseRecorder.field1098[++class70.field1014 - 1] = class34_9.vmethod597(2025770205);
                                    MouseRecorder.field1098[++class70.field1014 - 1] = class34_9.field297.method3971();
                                 }

                                 return 1;
                              } else {
                                 class241 class241_7;
                                 if (i_0 == 6693) {
                                    i_4 = MouseRecorder.field1098[--class70.field1014];
                                    class241_7 = class222.method4118(i_4);
                                    if (class241_7.field3216 == null) {
                                       MouseRecorder.field1093[++class221.field2747 - 1] = "";
                                    } else {
                                       MouseRecorder.field1093[++class221.field2747 - 1] = class241_7.field3216;
                                    }

                                    return 1;
                                 } else if (i_0 == 6694) {
                                    i_4 = MouseRecorder.field1098[--class70.field1014];
                                    class241_7 = class222.method4118(i_4);
                                    MouseRecorder.field1098[++class70.field1014 - 1] = class241_7.field3218;
                                    return 1;
                                 } else if (i_0 == 6695) {
                                    i_4 = MouseRecorder.field1098[--class70.field1014];
                                    class241_7 = class222.method4118(i_4);
                                    if (class241_7 == null) {
                                       MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                                    } else {
                                       MouseRecorder.field1098[++class70.field1014 - 1] = class241_7.field3230;
                                    }

                                    return 1;
                                 } else if (i_0 == 6696) {
                                    i_4 = MouseRecorder.field1098[--class70.field1014];
                                    class241_7 = class222.method4118(i_4);
                                    if (class241_7 == null) {
                                       MouseRecorder.field1098[++class70.field1014 - 1] = -1;
                                    } else {
                                       MouseRecorder.field1098[++class70.field1014 - 1] = class241_7.field3220;
                                    }

                                    return 1;
                                 } else if (i_0 == 6697) {
                                    MouseRecorder.field1098[++class70.field1014 - 1] = class18.field121.field355;
                                    return 1;
                                 } else if (i_0 == 6698) {
                                    MouseRecorder.field1098[++class70.field1014 - 1] = class18.field121.field357.method3971();
                                    return 1;
                                 } else if (i_0 == 6699) {
                                    MouseRecorder.field1098[++class70.field1014 - 1] = class18.field121.field354.method3971();
                                    return 1;
                                 } else {
                                    return 2;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static void method112(int i_0, int i_1, int i_2, boolean bool_3, int i_4, boolean bool_5, byte b_6) {
      if (i_0 < i_1) {
         int i_7 = (i_0 + i_1) / 2;
         int i_8 = i_0;
         World world_9 = World.field1031[i_7];
         World.field1031[i_7] = World.field1031[i_1];
         World.field1031[i_1] = world_9;

         for (int i_10 = i_0; i_10 < i_1; i_10++) {
            World world_12 = World.field1031[i_10];
            int i_13 = class93.method2200(world_12, world_9, i_2, bool_3, (byte) 24);
            int i_11;
            if (i_13 != 0) {
               if (bool_3) {
                  i_11 = -i_13;
               } else {
                  i_11 = i_13;
               }
            } else if (i_4 == -1) {
               i_11 = 0;
            } else {
               int i_14 = class93.method2200(world_12, world_9, i_4, bool_5, (byte) 9);
               if (bool_5) {
                  i_11 = -i_14;
               } else {
                  i_11 = i_14;
               }
            }

            if (i_11 <= 0) {
               World world_15 = World.field1031[i_10];
               World.field1031[i_10] = World.field1031[i_8];
               World.field1031[i_8++] = world_15;
            }
         }

         World.field1031[i_1] = World.field1031[i_8];
         World.field1031[i_8] = world_9;
         method112(i_0, i_8 - 1, i_2, bool_3, i_4, bool_5, (byte) 1);
         method112(i_8 + 1, i_1, i_2, bool_3, i_4, bool_5, (byte) 1);
      }

   }

   static void method105(String[] arr_0, short[] shorts_1, int i_2, int i_3, byte b_4) {
      if (i_2 < i_3) {
         int i_5 = (i_3 + i_2) / 2;
         int i_6 = i_2;
         String string_7 = arr_0[i_5];
         arr_0[i_5] = arr_0[i_3];
         arr_0[i_3] = string_7;
         short s_8 = shorts_1[i_5];
         shorts_1[i_5] = shorts_1[i_3];
         shorts_1[i_3] = s_8;

         for (int i_9 = i_2; i_9 < i_3; i_9++) {
            if (string_7 == null || arr_0[i_9] != null && arr_0[i_9].compareTo(string_7) < (i_9 & 0x1)) {
               String string_10 = arr_0[i_9];
               arr_0[i_9] = arr_0[i_6];
               arr_0[i_6] = string_10;
               short s_11 = shorts_1[i_9];
               shorts_1[i_9] = shorts_1[i_6];
               shorts_1[i_6++] = s_11;
            }
         }

         arr_0[i_3] = arr_0[i_6];
         arr_0[i_6] = string_7;
         shorts_1[i_3] = shorts_1[i_6];
         shorts_1[i_6] = s_8;
         method105(arr_0, shorts_1, i_2, i_6 - 1, (byte) 32);
         method105(arr_0, shorts_1, i_6 + 1, i_3, (byte) 32);
      }

   }

}
