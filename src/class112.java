public class class112 {

   static class324 field1466;
   int field1465;
   int field1463;
   int[][] field1464;

   public class112(int i_1, int i_2) {
      if (i_2 != i_1) {
         int i_3 = class74.method1819(i_1, i_2, 1745629182);
         i_1 /= i_3;
         i_2 /= i_3;
         this.field1465 = i_1;
         this.field1463 = i_2;
         this.field1464 = new int[i_1][14];

         for (int i_4 = 0; i_4 < i_1; i_4++) {
            int[] ints_5 = this.field1464[i_4];
            double d_6 = (double)i_4 / (double)i_1 + 6.0D;
            int i_8 = (int)Math.floor(1.0D + (d_6 - 7.0D));
            if (i_8 < 0) {
               i_8 = 0;
            }

            int i_9 = (int)Math.ceil(7.0D + d_6);
            if (i_9 > 14) {
               i_9 = 14;
            }

            for (double d_10 = (double)i_2 / (double)i_1; i_8 < i_9; i_8++) {
               double d_12 = 3.141592653589793D * ((double)i_8 - d_6);
               double d_14 = d_10;
               if (d_12 < -1.0E-4D || d_12 > 1.0E-4D) {
                  d_14 = d_10 * (Math.sin(d_12) / d_12);
               }

               d_14 *= 0.54D + 0.46D * Math.cos(((double)i_8 - d_6) * 0.2243994752564138D);
               ints_5[i_8] = (int)Math.floor(0.5D + d_14 * 65536.0D);
            }
         }

      }
   }

   byte[] method2504(byte[] bytes_1, byte b_2) {
      if (this.field1464 != null) {
         int i_3 = (int)((long)this.field1463 * (long)bytes_1.length / (long)this.field1465) + 14;
         int[] ints_4 = new int[i_3];
         int i_5 = 0;
         int i_6 = 0;

         int i_7;
         for (i_7 = 0; i_7 < bytes_1.length; i_7++) {
            byte b_8 = bytes_1[i_7];
            int[] ints_9 = this.field1464[i_6];

            int i_10;
            for (i_10 = 0; i_10 < 14; i_10++) {
               ints_4[i_5 + i_10] += b_8 * ints_9[i_10];
            }

            i_6 += this.field1463;
            i_10 = i_6 / this.field1465;
            i_5 += i_10;
            i_6 -= i_10 * this.field1465;
         }

         bytes_1 = new byte[i_3];

         for (i_7 = 0; i_7 < i_3; i_7++) {
            int i_11 = ints_4[i_7] + 32768 >> 16;
            if (i_11 < -128) {
               bytes_1[i_7] = -128;
            } else if (i_11 > 127) {
               bytes_1[i_7] = 127;
            } else {
               bytes_1[i_7] = (byte)i_11;
            }
         }
      }

      return bytes_1;
   }

   int method2505(int i_1, int i_2) {
      if (this.field1464 != null) {
         i_1 = (int)((long)i_1 * (long)this.field1463 / (long)this.field1465);
      }

      return i_1;
   }

   int method2516(int i_1, int i_2) {
      if (this.field1464 != null) {
         i_1 = (int)((long)i_1 * (long)this.field1463 / (long)this.field1465) + 6;
      }

      return i_1;
   }

   static void method2510(int i_0, int i_1) {
      client.field916 = new class82();
      client.field916.field1157 = client.field792[i_0];
      client.field916.field1156 = client.field793[i_0];
      client.field916.field1155 = client.field794[i_0];
      client.field916.field1158 = client.field795[i_0];
      client.field916.field1159 = client.field796[i_0];
   }

   static final void method2506(class69 class69_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
      if (class69_0 != null && class69_0.vmethod1965(531981561)) {
         if (class69_0 instanceof class79) {
            class256 class256_7 = ((class79) class69_0).field1134;
            if (class256_7.field3476 != null) {
               class256_7 = class256_7.method4709(942859640);
            }

            if (class256_7 == null) {
               return;
            }
         }

         int i_76 = class89.field1255;
         int[] ints_8 = class89.field1257;
         byte b_9 = 0;
         class66 class66_11;
         if (i_1 < i_76 && class69_0.field953 == client.field881) {
            class66_11 = (class66) class69_0;
            boolean bool_10;
            if (client.field774 == 0) {
               bool_10 = false;
            } else {
               boolean bool_79;
               if (class66_11 != client.field657) {
                  bool_79 = (client.field774 & 0x4) != 0;
                  boolean bool_80 = bool_79;
                  boolean bool_14;
                  if (!bool_79) {
                     bool_14 = (client.field774 & 0x1) != 0;
                     bool_80 = bool_14 && class66_11.method1181(-1900430541);
                  }

                  bool_14 = bool_80;
                  if (!bool_80) {
                     boolean bool_81 = (client.field774 & 0x2) != 0;
                     bool_14 = bool_81 && class66_11.method1184((byte) 12);
                  }

                  bool_10 = bool_14;
               } else {
                  bool_79 = (client.field774 & 0x8) != 0;
                  bool_10 = bool_79;
               }
            }

            if (bool_10) {
               class66 class66_12 = (class66) class69_0;
               if (i_1 < i_76) {
                  class219.method4113(class69_0, class69_0.field999 + 15, 1386416846);
                  class296 class296_13 = (class296) client.field704.get(class292.field3677);
                  byte b_93 = 9;
                  class296_13.method5341(class66_12.field621.method5197((byte) 112), i_2 + client.field752, i_3 + client.field753 - b_93, 16777215, 0);
                  b_9 = 18;
               }
            }
         }

         int i_88 = -2;
         int i_16;
         int i_23;
         int i_24;
         if (!class69_0.field954.method4810()) {
            class219.method4113(class69_0, class69_0.field999 + 15, 1386416846);

            for (class78 class78_89 = (class78) class69_0.field954.method4838(); class78_89 != null; class78_89 = (class78) class69_0.field954.method4808()) {
               class70 class70_90 = class78_89.method1950(client.field881, (byte) 41);
               if (class70_90 == null) {
                  if (class78_89.method1960(-16711936)) {
                     class78_89.unlink();
                  }
               } else {
                  class246 class246_92 = class78_89.field1128;
                  class325 class325_77 = class246_92.method4466(879066493);
                  class325 class325_15 = class246_92.method4465((byte) 39);
                  int i_17 = 0;
                  if (class325_77 != null && class325_15 != null) {
                     if (class246_92.field3289 * 2 < class325_15.field3899) {
                        i_17 = class246_92.field3289;
                     }

                     i_16 = class325_15.field3899 - i_17 * 2;
                  } else {
                     i_16 = class246_92.field3288;
                  }

                  int i_18 = 255;
                  boolean bool_19 = true;
                  int i_20 = client.field881 - class70_90.field1016;
                  int i_21 = i_16 * class70_90.field1012 / class246_92.field3288;
                  int i_22;
                  int i_94;
                  if (class70_90.field1010 > i_20) {
                     i_22 = class246_92.field3277 == 0 ? 0 : class246_92.field3277 * (i_20 / class246_92.field3277);
                     i_23 = i_16 * class70_90.field1011 / class246_92.field3288;
                     i_94 = i_22 * (i_21 - i_23) / class70_90.field1010 + i_23;
                  } else {
                     i_94 = i_21;
                     i_22 = class70_90.field1010 + class246_92.field3285 - i_20;
                     if (class246_92.field3283 >= 0) {
                        i_18 = (i_22 << 8) / (class246_92.field3285 - class246_92.field3283);
                     }
                  }

                  if (class70_90.field1012 > 0 && i_94 < 1) {
                     i_94 = 1;
                  }

                  if (class325_77 != null && class325_15 != null) {
                     if (i_94 == i_16) {
                        i_94 += i_17 * 2;
                     } else {
                        i_94 += i_17;
                     }

                     i_22 = class325_77.field3900;
                     i_88 += i_22;
                     i_23 = i_2 + client.field752 - (i_16 >> 1);
                     i_24 = i_3 + client.field753 - i_88;
                     i_23 -= i_17;
                     if (i_18 >= 0 && i_18 < 255) {
                        class325_77.method6129(i_23, i_24, i_18);
                        class321.method5998(i_23, i_24, i_94 + i_23, i_22 + i_24);
                        class325_15.method6129(i_23, i_24, i_18);
                     } else {
                        class325_77.method6126(i_23, i_24);
                        class321.method5998(i_23, i_24, i_94 + i_23, i_22 + i_24);
                        class325_15.method6126(i_23, i_24);
                     }

                     class321.method5997(i_2, i_3, i_2 + i_4, i_3 + i_5);
                     i_88 += 2;
                  } else {
                     i_88 += 5;
                     if (client.field752 > -1) {
                        i_22 = i_2 + client.field752 - (i_16 >> 1);
                        i_23 = i_3 + client.field753 - i_88;
                        class321.method6012(i_22, i_23, i_94, 5, 65280);
                        class321.method6012(i_22 + i_94, i_23, i_16 - i_94, 5, 16711680);
                     }

                     i_88 += 2;
                  }
               }
            }
         }

         if (i_88 == -2) {
            i_88 += 7;
         }

         i_88 += b_9;
         if (i_1 < i_76) {
            class66_11 = (class66) class69_0;
            if (class66_11.field628) {
               return;
            }

            if (class66_11.field635 != -1 || class66_11.field615 != -1) {
               class219.method4113(class69_0, class69_0.field999 + 15, 1386416846);
               if (client.field752 > -1) {
                  if (class66_11.field635 != -1) {
                     i_88 += 25;
                     class157.field1989[class66_11.field635].method6126(i_2 + client.field752 - 12, i_3 + client.field753 - i_88);
                  }

                  if (class66_11.field615 != -1) {
                     i_88 += 25;
                     class108.field1442[class66_11.field615].method6126(i_2 + client.field752 - 12, i_3 + client.field753 - i_88);
                  }
               }
            }

            if (i_1 >= 0 && client.field708 == 10 && ints_8[i_1] == client.field689) {
               class219.method4113(class69_0, class69_0.field999 + 15, 1386416846);
               if (client.field752 > -1) {
                  i_88 += class173.field2096[1].field3900;
                  class173.field2096[1].method6126(i_2 + client.field752 - 12, i_3 + client.field753 - i_88);
               }
            }
         } else {
            class256 class256_91 = ((class79) class69_0).field1134;
            if (class256_91.field3476 != null) {
               class256_91 = class256_91.method4709(942859640);
            }

            if (class256_91.field3491 >= 0 && class256_91.field3491 < class108.field1442.length) {
               class219.method4113(class69_0, class69_0.field999 + 15, 1386416846);
               if (client.field752 > -1) {
                  class108.field1442[class256_91.field3491].method6126(i_2 + client.field752 - 12, i_3 + client.field753 - 30);
               }
            }

            if (client.field708 == 1 && client.field696[i_1 - i_76] == client.field824 && client.field881 % 20 < 10) {
               class219.method4113(class69_0, class69_0.field999 + 15, 1386416846);
               if (client.field752 > -1) {
                  class173.field2096[0].method6126(i_2 + client.field752 - 12, i_3 + client.field753 - 28);
               }
            }
         }

         if (class69_0.field977 != null && (i_1 >= i_76 || !class69_0.field998 && (client.field907 == 4 || !class69_0.field963 && (client.field907 == 0 || client.field907 == 3 || client.field907 == 1 && ((class66) class69_0).method1181(-1900430541))))) {
            class219.method4113(class69_0, class69_0.field999, 1386416846);
            if (client.field752 > -1 && client.field740 < client.field867) {
               client.field676[client.field740] = class23.field193.method5417(class69_0.field977) / 2;
               client.field744[client.field740] = class23.field193.field3709;
               client.field742[client.field740] = client.field752;
               client.field743[client.field740] = client.field753;
               client.field702[client.field740] = class69_0.field966;
               client.field805[client.field740] = class69_0.field982;
               client.field748[client.field740] = class69_0.field1002;
               client.field749[client.field740] = class69_0.field977;
               ++client.field740;
            }
         }

         for (int i_78 = 0; i_78 < 4; i_78++) {
            int i_97 = class69_0.field971[i_78];
            int i_98 = class69_0.field969[i_78];
            class252 class252_96 = null;
            int i_99 = 0;
            if (i_98 >= 0) {
               if (i_97 <= client.field881) {
                  continue;
               }

               class252_96 = class86.method2046(class69_0.field969[i_78], (byte) 0);
               i_99 = class252_96.field3344;
               if (class252_96 != null && class252_96.field3345 != null) {
                  class252_96 = class252_96.method4554((byte) 0);
                  if (class252_96 == null) {
                     class69_0.field971[i_78] = -1;
                     continue;
                  }
               }
            } else if (i_97 < 0) {
               continue;
            }

            i_16 = class69_0.field972[i_78];
            class252 class252_82 = null;
            if (i_16 >= 0) {
               class252_82 = class86.method2046(i_16, (byte) 0);
               if (class252_82 != null && class252_82.field3345 != null) {
                  class252_82 = class252_82.method4554((byte) 0);
               }
            }

            if (i_97 - i_99 <= client.field881) {
               if (class252_96 == null) {
                  class69_0.field971[i_78] = -1;
               } else {
                  class219.method4113(class69_0, class69_0.field999 / 2, 1386416846);
                  if (client.field752 > -1) {
                     if (i_78 == 1) {
                        client.field753 -= 20;
                     }

                     if (i_78 == 2) {
                        client.field752 -= 15;
                        client.field753 -= 10;
                     }

                     if (i_78 == 3) {
                        client.field752 += 15;
                        client.field753 -= 10;
                     }

                     class325 class325_83 = null;
                     class325 class325_84 = null;
                     class325 class325_85 = null;
                     class325 class325_86 = null;
                     i_23 = 0;
                     i_24 = 0;
                     int i_25 = 0;
                     int i_26 = 0;
                     int i_27 = 0;
                     int i_28 = 0;
                     int i_29 = 0;
                     int i_30 = 0;
                     class325 class325_31 = null;
                     class325 class325_32 = null;
                     class325 class325_33 = null;
                     class325 class325_34 = null;
                     int i_35 = 0;
                     int i_36 = 0;
                     int i_37 = 0;
                     int i_38 = 0;
                     int i_39 = 0;
                     int i_40 = 0;
                     int i_41 = 0;
                     int i_42 = 0;
                     int i_43 = 0;
                     class325_83 = class252_96.method4551(-1354583226);
                     int i_44;
                     if (class325_83 != null) {
                        i_23 = class325_83.field3899;
                        i_44 = class325_83.field3900;
                        if (i_44 > i_43) {
                           i_43 = i_44;
                        }

                        i_27 = class325_83.field3901;
                     }

                     class325_84 = class252_96.method4557(-2099712719);
                     if (class325_84 != null) {
                        i_24 = class325_84.field3899;
                        i_44 = class325_84.field3900;
                        if (i_44 > i_43) {
                           i_43 = i_44;
                        }

                        i_28 = class325_84.field3901;
                     }

                     class325_85 = class252_96.method4558((byte) -48);
                     if (class325_85 != null) {
                        i_25 = class325_85.field3899;
                        i_44 = class325_85.field3900;
                        if (i_44 > i_43) {
                           i_43 = i_44;
                        }

                        i_29 = class325_85.field3901;
                     }

                     class325_86 = class252_96.method4583(-1606516448);
                     if (class325_86 != null) {
                        i_26 = class325_86.field3899;
                        i_44 = class325_86.field3900;
                        if (i_44 > i_43) {
                           i_43 = i_44;
                        }

                        i_30 = class325_86.field3901;
                     }

                     if (class252_82 != null) {
                        class325_31 = class252_82.method4551(1324383932);
                        if (class325_31 != null) {
                           i_35 = class325_31.field3899;
                           i_44 = class325_31.field3900;
                           if (i_44 > i_43) {
                              i_43 = i_44;
                           }

                           i_39 = class325_31.field3901;
                        }

                        class325_32 = class252_82.method4557(-2096560428);
                        if (class325_32 != null) {
                           i_36 = class325_32.field3899;
                           i_44 = class325_32.field3900;
                           if (i_44 > i_43) {
                              i_43 = i_44;
                           }

                           i_40 = class325_32.field3901;
                        }

                        class325_33 = class252_82.method4558((byte) -120);
                        if (class325_33 != null) {
                           i_37 = class325_33.field3899;
                           i_44 = class325_33.field3900;
                           if (i_44 > i_43) {
                              i_43 = i_44;
                           }

                           i_41 = class325_33.field3901;
                        }

                        class325_34 = class252_82.method4583(-1606516448);
                        if (class325_34 != null) {
                           i_38 = class325_34.field3899;
                           i_44 = class325_34.field3900;
                           if (i_44 > i_43) {
                              i_43 = i_44;
                           }

                           i_42 = class325_34.field3901;
                        }
                     }

                     class295 class295_87 = class252_96.method4565(-1472977599);
                     if (class295_87 == null) {
                        class295_87 = class213.field2529;
                     }

                     class295 class295_45;
                     if (class252_82 != null) {
                        class295_45 = class252_82.method4565(-1472977599);
                        if (class295_45 == null) {
                           class295_45 = class213.field2529;
                        }
                     } else {
                        class295_45 = class213.field2529;
                     }

                     String string_46 = null;
                     String string_47 = null;
                     boolean bool_48 = false;
                     int i_49 = 0;
                     string_46 = class252_96.method4555(class69_0.field980[i_78], -1319187584);
                     int i_95 = class295_87.method5417(string_46);
                     if (class252_82 != null) {
                        string_47 = class252_82.method4555(class69_0.field970[i_78], -1319187584);
                        i_49 = class295_45.method5417(string_47);
                     }

                     int i_50 = 0;
                     int i_51 = 0;
                     if (i_24 > 0) {
                        if (class325_85 == null && class325_86 == null) {
                           i_50 = 1;
                        } else {
                           i_50 = i_95 / i_24 + 1;
                        }
                     }

                     if (class252_82 != null && i_36 > 0) {
                        if (class325_33 == null && class325_34 == null) {
                           i_51 = 1;
                        } else {
                           i_51 = i_49 / i_36 + 1;
                        }
                     }

                     int i_52 = 0;
                     int i_53 = i_52;
                     if (i_23 > 0) {
                        i_52 += i_23;
                     }

                     i_52 += 2;
                     int i_54 = i_52;
                     if (i_25 > 0) {
                        i_52 += i_25;
                     }

                     int i_55 = i_52;
                     int i_56 = i_52;
                     int i_57;
                     if (i_24 > 0) {
                        i_57 = i_24 * i_50;
                        i_52 += i_57;
                        i_56 += (i_57 - i_95) / 2;
                     } else {
                        i_52 += i_95;
                     }

                     i_57 = i_52;
                     if (i_26 > 0) {
                        i_52 += i_26;
                     }

                     int i_58 = 0;
                     int i_59 = 0;
                     int i_60 = 0;
                     int i_61 = 0;
                     int i_62 = 0;
                     int i_63;
                     if (class252_82 != null) {
                        i_52 += 2;
                        i_58 = i_52;
                        if (i_35 > 0) {
                           i_52 += i_35;
                        }

                        i_52 += 2;
                        i_59 = i_52;
                        if (i_37 > 0) {
                           i_52 += i_37;
                        }

                        i_60 = i_52;
                        i_62 = i_52;
                        if (i_36 > 0) {
                           i_63 = i_51 * i_36;
                           i_52 += i_63;
                           i_62 += (i_63 - i_49) / 2;
                        } else {
                           i_52 += i_49;
                        }

                        i_61 = i_52;
                        if (i_38 > 0) {
                           i_52 += i_38;
                        }
                     }

                     i_63 = class69_0.field971[i_78] - client.field881;
                     int i_64 = class252_96.field3335 - i_63 * class252_96.field3335 / class252_96.field3344;
                     int i_65 = i_63 * class252_96.field3340 / class252_96.field3344 + -class252_96.field3340;
                     int i_66 = i_64 + (i_2 + client.field752 - (i_52 >> 1));
                     int i_67 = i_3 + client.field753 - 12 + i_65;
                     int i_68 = i_67;
                     int i_69 = i_43 + i_67;
                     int i_70 = i_67 + class252_96.field3328 + 15;
                     int i_71 = i_70 - class295_87.field3714;
                     int i_72 = i_70 + class295_87.field3707;
                     if (i_71 < i_67) {
                        i_68 = i_71;
                     }

                     if (i_72 > i_69) {
                        i_69 = i_72;
                     }

                     int i_73 = 0;
                     int i_74;
                     int i_75;
                     if (class252_82 != null) {
                        i_73 = i_67 + class252_82.field3328 + 15;
                        i_74 = i_73 - class295_45.field3714;
                        i_75 = i_73 + class295_45.field3707;
                        if (i_74 < i_68) {
                           ;
                        }

                        if (i_75 > i_69) {
                           ;
                        }
                     }

                     i_74 = 255;
                     if (class252_96.field3341 >= 0) {
                        i_74 = (i_63 << 8) / (class252_96.field3344 - class252_96.field3341);
                     }

                     if (i_74 >= 0 && i_74 < 255) {
                        if (class325_83 != null) {
                           class325_83.method6129(i_66 + i_53 - i_27, i_67, i_74);
                        }

                        if (class325_85 != null) {
                           class325_85.method6129(i_66 + i_54 - i_29, i_67, i_74);
                        }

                        if (class325_84 != null) {
                           for (i_75 = 0; i_75 < i_50; i_75++) {
                              class325_84.method6129(i_24 * i_75 + (i_55 + i_66 - i_28), i_67, i_74);
                           }
                        }

                        if (class325_86 != null) {
                           class325_86.method6129(i_57 + i_66 - i_30, i_67, i_74);
                        }

                        class295_87.method5347(string_46, i_56 + i_66, i_70, class252_96.field3333, 0, i_74);
                        if (class252_82 != null) {
                           if (class325_31 != null) {
                              class325_31.method6129(i_66 + i_58 - i_39, i_67, i_74);
                           }

                           if (class325_33 != null) {
                              class325_33.method6129(i_66 + i_59 - i_41, i_67, i_74);
                           }

                           if (class325_32 != null) {
                              for (i_75 = 0; i_75 < i_51; i_75++) {
                                 class325_32.method6129(i_75 * i_36 + (i_66 + i_60 - i_40), i_67, i_74);
                              }
                           }

                           if (class325_34 != null) {
                              class325_34.method6129(i_61 + i_66 - i_42, i_67, i_74);
                           }

                           class295_45.method5347(string_47, i_66 + i_62, i_73, class252_82.field3333, 0, i_74);
                        }
                     } else {
                        if (class325_83 != null) {
                           class325_83.method6126(i_53 + i_66 - i_27, i_67);
                        }

                        if (class325_85 != null) {
                           class325_85.method6126(i_54 + i_66 - i_29, i_67);
                        }

                        if (class325_84 != null) {
                           for (i_75 = 0; i_75 < i_50; i_75++) {
                              class325_84.method6126(i_75 * i_24 + (i_66 + i_55 - i_28), i_67);
                           }
                        }

                        if (class325_86 != null) {
                           class325_86.method6126(i_66 + i_57 - i_30, i_67);
                        }

                        class295_87.method5346(string_46, i_66 + i_56, i_70, class252_96.field3333 | ~0xffffff, 0);
                        if (class252_82 != null) {
                           if (class325_31 != null) {
                              class325_31.method6126(i_58 + i_66 - i_39, i_67);
                           }

                           if (class325_33 != null) {
                              class325_33.method6126(i_59 + i_66 - i_41, i_67);
                           }

                           if (class325_32 != null) {
                              for (i_75 = 0; i_75 < i_51; i_75++) {
                                 class325_32.method6126(i_75 * i_36 + (i_66 + i_60 - i_40), i_67);
                              }
                           }

                           if (class325_34 != null) {
                              class325_34.method6126(i_61 + i_66 - i_42, i_67);
                           }

                           class295_45.method5346(string_47, i_62 + i_66, i_73, class252_82.field3333 | ~0xffffff, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   static final int method2517(int i_0, int i_1, byte b_2) {
      if (i_0 == -2) {
         return 12345678;
      } else if (i_0 == -1) {
         if (i_1 < 2) {
            i_1 = 2;
         } else if (i_1 > 126) {
            i_1 = 126;
         }

         return i_1;
      } else {
         i_1 = (i_0 & 0x7f) * i_1 / 128;
         if (i_1 < 2) {
            i_1 = 2;
         } else if (i_1 > 126) {
            i_1 = 126;
         }

         return (i_0 & 0xff80) + i_1;
      }
   }

}
