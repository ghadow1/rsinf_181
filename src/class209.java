public class class209 {

   int[] field2511;
   byte[] field2513;
   int[] field2512;

   public class209(byte[] bytes_1) {
      int i_2 = bytes_1.length;
      this.field2511 = new int[i_2];
      this.field2513 = bytes_1;
      int[] ints_3 = new int[33];
      this.field2512 = new int[8];
      int i_4 = 0;

      for (int i_5 = 0; i_5 < i_2; i_5++) {
         byte b_6 = bytes_1[i_5];
         if (b_6 != 0) {
            int i_7 = 1 << 32 - b_6;
            int i_8 = ints_3[b_6];
            this.field2511[i_5] = i_8;
            int i_9;
            int i_10;
            int i_11;
            int i_12;
            if ((i_8 & i_7) != 0) {
               i_9 = ints_3[b_6 - 1];
            } else {
               i_9 = i_8 | i_7;

               for (i_10 = b_6 - 1; i_10 >= 1; --i_10) {
                  i_11 = ints_3[i_10];
                  if (i_11 != i_8) {
                     break;
                  }

                  i_12 = 1 << 32 - i_10;
                  if ((i_11 & i_12) != 0) {
                     ints_3[i_10] = ints_3[i_10 - 1];
                     break;
                  }

                  ints_3[i_10] = i_11 | i_12;
               }
            }

            ints_3[b_6] = i_9;

            for (i_10 = b_6 + 1; i_10 <= 32; i_10++) {
               if (i_8 == ints_3[i_10]) {
                  ints_3[i_10] = i_9;
               }
            }

            i_10 = 0;

            for (i_11 = 0; i_11 < b_6; i_11++) {
               i_12 = Integer.MIN_VALUE >>> i_11;
               if ((i_8 & i_12) != 0) {
                  if (this.field2512[i_10] == 0) {
                     this.field2512[i_10] = i_4;
                  }

                  i_10 = this.field2512[i_10];
               } else {
                  ++i_10;
               }

               if (i_10 >= this.field2512.length) {
                  int[] ints_13 = new int[this.field2512.length * 2];

                  for (int i_14 = 0; i_14 < this.field2512.length; i_14++) {
                     ints_13[i_14] = this.field2512[i_14];
                  }

                  this.field2512 = ints_13;
               }

               i_12 >>>= 1;
            }

            this.field2512[i_10] = ~i_5;
            if (i_10 >= i_4) {
               i_4 = i_10 + 1;
            }
         }
      }

   }

   int method3944(byte[] bytes_1, int i_2, byte[] bytes_3, int i_4, int i_5, int i_6) {
      if (i_5 == 0) {
         return 0;
      } else {
         int i_7 = 0;
         i_5 += i_4;
         int i_8 = i_2;

         while (true) {
            byte b_9 = bytes_1[i_8];
            if (b_9 < 0) {
               i_7 = this.field2512[i_7];
            } else {
               ++i_7;
            }

            int i_10;
            if ((i_10 = this.field2512[i_7]) < 0) {
               bytes_3[i_4++] = (byte)(~i_10);
               if (i_4 >= i_5) {
                  break;
               }

               i_7 = 0;
            }

            if ((b_9 & 0x40) != 0) {
               i_7 = this.field2512[i_7];
            } else {
               ++i_7;
            }

            if ((i_10 = this.field2512[i_7]) < 0) {
               bytes_3[i_4++] = (byte)(~i_10);
               if (i_4 >= i_5) {
                  break;
               }

               i_7 = 0;
            }

            if ((b_9 & 0x20) != 0) {
               i_7 = this.field2512[i_7];
            } else {
               ++i_7;
            }

            if ((i_10 = this.field2512[i_7]) < 0) {
               bytes_3[i_4++] = (byte)(~i_10);
               if (i_4 >= i_5) {
                  break;
               }

               i_7 = 0;
            }

            if ((b_9 & 0x10) != 0) {
               i_7 = this.field2512[i_7];
            } else {
               ++i_7;
            }

            if ((i_10 = this.field2512[i_7]) < 0) {
               bytes_3[i_4++] = (byte)(~i_10);
               if (i_4 >= i_5) {
                  break;
               }

               i_7 = 0;
            }

            if ((b_9 & 0x8) != 0) {
               i_7 = this.field2512[i_7];
            } else {
               ++i_7;
            }

            if ((i_10 = this.field2512[i_7]) < 0) {
               bytes_3[i_4++] = (byte)(~i_10);
               if (i_4 >= i_5) {
                  break;
               }

               i_7 = 0;
            }

            if ((b_9 & 0x4) != 0) {
               i_7 = this.field2512[i_7];
            } else {
               ++i_7;
            }

            if ((i_10 = this.field2512[i_7]) < 0) {
               bytes_3[i_4++] = (byte)(~i_10);
               if (i_4 >= i_5) {
                  break;
               }

               i_7 = 0;
            }

            if ((b_9 & 0x2) != 0) {
               i_7 = this.field2512[i_7];
            } else {
               ++i_7;
            }

            if ((i_10 = this.field2512[i_7]) < 0) {
               bytes_3[i_4++] = (byte)(~i_10);
               if (i_4 >= i_5) {
                  break;
               }

               i_7 = 0;
            }

            if ((b_9 & 0x1) != 0) {
               i_7 = this.field2512[i_7];
            } else {
               ++i_7;
            }

            if ((i_10 = this.field2512[i_7]) < 0) {
               bytes_3[i_4++] = (byte)(~i_10);
               if (i_4 >= i_5) {
                  break;
               }

               i_7 = 0;
            }

            ++i_8;
         }

         return i_8 + 1 - i_2;
      }
   }

   int method3942(byte[] bytes_1, int i_2, int i_3, byte[] bytes_4, int i_5, int i_6) {
      int i_7 = 0;
      int i_8 = i_5 << 3;

      for (i_3 += i_2; i_2 < i_3; i_2++) {
         int i_9 = bytes_1[i_2] & 0xff;
         int i_10 = this.field2511[i_9];
         byte b_11 = this.field2513[i_9];
         if (b_11 == 0) {
            throw new RuntimeException("" + i_9);
         }

         int i_12 = i_8 >> 3;
         int i_13 = i_8 & 0x7;
         i_7 &= -i_13 >> 31;
         int i_14 = (i_13 + b_11 - 1 >> 3) + i_12;
         i_13 += 24;
         bytes_4[i_12] = (byte)(i_7 |= i_10 >>> i_13);
         if (i_12 < i_14) {
            ++i_12;
            i_13 -= 8;
            bytes_4[i_12] = (byte)(i_7 = i_10 >>> i_13);
            if (i_12 < i_14) {
               ++i_12;
               i_13 -= 8;
               bytes_4[i_12] = (byte)(i_7 = i_10 >>> i_13);
               if (i_12 < i_14) {
                  ++i_12;
                  i_13 -= 8;
                  bytes_4[i_12] = (byte)(i_7 = i_10 >>> i_13);
                  if (i_12 < i_14) {
                     ++i_12;
                     i_13 -= 8;
                     bytes_4[i_12] = (byte)(i_7 = i_10 << -i_13);
                  }
               }
            }
         }

         i_8 += b_11;
      }

      return (i_8 + 7 >> 3) - i_5;
   }

   static int method3948(int i_0, int i_1) {
      long long_3 = (long)((i_0 << 16) + i_1);
      return class226.field3071 != null && class226.field3071.hash == long_3 ? class240.field3209.position * 99 / (class240.field3209.buffer.length - class226.field3071.field3122) + 1 : 0;
   }

   public static int method3945(String string_0) {
      return string_0.length() + 1;
   }

   static final boolean method3947(byte[] bytes_0, int i_1, int i_2) {
      boolean bool_4 = true;
      ByteBuffer class300_5 = new ByteBuffer(bytes_0);
      int i_6 = -1;

      label71:
      while (true) {
         int i_7 = class300_5.readExtendedSmartInt();
         if (i_7 == 0) {
            return bool_4;
         }

         i_6 += i_7;
         int i_8 = 0;
         boolean bool_9 = false;

         while (true) {
            int i_10;
            while (!bool_9) {
               i_10 = class300_5.readSmartInt();
               if (i_10 == 0) {
                  continue label71;
               }

               i_8 += i_10 - 1;
               int i_11 = i_8 & 0x3f;
               int i_12 = i_8 >> 6 & 0x3f;
               int i_13 = class300_5.readUnsignedByte() >> 2;
               int i_14 = i_12 + i_1;
               int i_15 = i_11 + i_2;
               if (i_14 > 0 && i_15 > 0 && i_14 < 103 && i_15 < 103) {
                  class253 class253_16 = class128.method2970(i_6, (short) 4095);
                  if (i_13 != 22 || !Client.field656 || class253_16.field3369 != 0 || class253_16.field3382 == 1 || class253_16.field3388) {
                     if (!class253_16.method4608(-275510577)) {
                        ++Client.field707;
                        bool_4 = false;
                     }

                     bool_9 = true;
                  }
               }
            }

            i_10 = class300_5.readSmartInt();
            if (i_10 == 0) {
               break;
            }

            class300_5.readUnsignedByte();
         }
      }
   }

}
