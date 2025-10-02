public abstract class class233 {

   static class334 field3139 = new class334();
   static int field3143 = 0;
   boolean field3141;
   boolean field3130;
   public int field3136;
   int field3142;
   int[] field3128;
   int[] field3131;
   int[] field3132;
   int[] field3133;
   int[][] field3137;
   Object[] field3126;
   Object[][] field3138;
   int[] field3129;
   class335 field3135;
   int[][] field3127;
   class335[] field3140;

   class233(boolean bool_1, boolean bool_2) {
      this.field3141 = bool_1;
      this.field3130 = bool_2;
   }

   public int[] method4153(int i_1) {
      return i_1 >= 0 && i_1 < this.field3137.length ? this.field3137[i_1] : null;
   }

   public byte[] method4181(int i_1, int i_2, int[] ints_3) {
      if (i_1 >= 0 && i_1 < this.field3138.length && this.field3138[i_1] != null && i_2 >= 0 && i_2 < this.field3138[i_1].length) {
         if (this.field3138[i_1][i_2] == null) {
            boolean bool_5 = this.method4235(i_1, ints_3);
            if (!bool_5) {
               this.vmethod4260(i_1, (short) 5225);
               bool_5 = this.method4235(i_1, ints_3);
               if (!bool_5) {
                  return null;
               }
            }
         }

         byte[] bytes_6 = class308.method5873(this.field3138[i_1][i_2], false);
         if (this.field3130) {
            this.field3138[i_1][i_2] = null;
         }

         return bytes_6;
      } else {
         return null;
      }
   }

   public int method4232() {
      return this.field3138.length;
   }

   public byte[] method4208(int i_1) {
      if (this.field3138.length == 1) {
         return this.method4144(0, i_1);
      } else if (this.field3138[i_1].length == 1) {
         return this.method4144(i_1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] method4150(int i_1, int i_2) {
      if (i_1 >= 0 && i_1 < this.field3138.length && this.field3138[i_1] != null && i_2 >= 0 && i_2 < this.field3138[i_1].length) {
         if (this.field3138[i_1][i_2] == null) {
            boolean bool_4 = this.method4235(i_1, (int[]) null);
            if (!bool_4) {
               this.vmethod4260(i_1, (short) 27347);
               bool_4 = this.method4235(i_1, (int[]) null);
               if (!bool_4) {
                  return null;
               }
            }
         }

         byte[] bytes_5 = class308.method5873(this.field3138[i_1][i_2], false);
         return bytes_5;
      } else {
         return null;
      }
   }

   public boolean method4146(int i_1, int i_2) {
      if (i_1 >= 0 && i_1 < this.field3138.length && this.field3138[i_1] != null && i_2 >= 0 && i_2 < this.field3138[i_1].length) {
         if (this.field3138[i_1][i_2] != null) {
            return true;
         } else if (this.field3126[i_1] != null) {
            return true;
         } else {
            this.vmethod4260(i_1, (short) 6542);
            return this.field3126[i_1] != null;
         }
      } else {
         return false;
      }
   }

   public byte[] method4144(int i_1, int i_2) {
      return this.method4181(i_1, i_2, (int[]) null);
   }

   void vmethod4260(int i_1, short s_2) {
   }

   public byte[] method4216(int i_1) {
      if (this.field3138.length == 1) {
         return this.method4150(0, i_1);
      } else if (this.field3138[i_1].length == 1) {
         return this.method4150(i_1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public int method4154(int i_1, int i_2) {
      return this.field3138[i_1].length;
   }

   int vmethod4266(int i_1, byte b_2) {
      return this.field3126[i_1] != null ? 100 : 0;
   }

   void method4142(byte[] bytes_1, int i_2) {
      int i_4 = bytes_1.length;
      int i_3 = class2.method18(bytes_1, 0, i_4, 1766587749);
      this.field3136 = i_3;
      ByteBuffer class300_5 = new ByteBuffer(class70.method1678(bytes_1));
      int i_6 = class300_5.readUnsignedByte();
      if (i_6 >= 5 && i_6 <= 7) {
         if (i_6 >= 6) {
            class300_5.readIntMedEndian();
         }

         int i_7 = class300_5.readUnsignedByte();
         if (i_6 >= 7) {
            this.field3142 = class300_5.readUnsignedSmartShort();
         } else {
            this.field3142 = class300_5.readUnsignedShortBigEndian();
         }

         int i_8 = 0;
         int i_9 = -1;
         this.field3128 = new int[this.field3142];
         int i_10;
         if (i_6 >= 7) {
            for (i_10 = 0; i_10 < this.field3142; i_10++) {
               this.field3128[i_10] = i_8 += class300_5.readUnsignedSmartShort();
               if (this.field3128[i_10] > i_9) {
                  i_9 = this.field3128[i_10];
               }
            }
         } else {
            for (i_10 = 0; i_10 < this.field3142; i_10++) {
               this.field3128[i_10] = i_8 += class300_5.readUnsignedShortBigEndian();
               if (this.field3128[i_10] > i_9) {
                  i_9 = this.field3128[i_10];
               }
            }
         }

         this.field3131 = new int[i_9 + 1];
         this.field3132 = new int[i_9 + 1];
         this.field3133 = new int[i_9 + 1];
         this.field3137 = new int[i_9 + 1][];
         this.field3126 = new Object[i_9 + 1];
         this.field3138 = new Object[i_9 + 1][];
         if (i_7 != 0) {
            this.field3129 = new int[i_9 + 1];

            for (i_10 = 0; i_10 < this.field3142; i_10++) {
               this.field3129[this.field3128[i_10]] = class300_5.readIntMedEndian();
            }

            this.field3135 = new class335(this.field3129);
         }

         for (i_10 = 0; i_10 < this.field3142; i_10++) {
            this.field3131[this.field3128[i_10]] = class300_5.readIntMedEndian();
         }

         for (i_10 = 0; i_10 < this.field3142; i_10++) {
            this.field3132[this.field3128[i_10]] = class300_5.readIntMedEndian();
         }

         for (i_10 = 0; i_10 < this.field3142; i_10++) {
            this.field3133[this.field3128[i_10]] = class300_5.readUnsignedShortBigEndian();
         }

         int i_11;
         int i_12;
         int i_13;
         int i_14;
         int i_15;
         if (i_6 >= 7) {
            for (i_10 = 0; i_10 < this.field3142; i_10++) {
               i_11 = this.field3128[i_10];
               i_12 = this.field3133[i_11];
               i_8 = 0;
               i_13 = -1;
               this.field3137[i_11] = new int[i_12];

               for (i_14 = 0; i_14 < i_12; i_14++) {
                  i_15 = this.field3137[i_11][i_14] = i_8 += class300_5.readUnsignedSmartShort();
                  if (i_15 > i_13) {
                     i_13 = i_15;
                  }
               }

               this.field3138[i_11] = new Object[i_13 + 1];
            }
         } else {
            for (i_10 = 0; i_10 < this.field3142; i_10++) {
               i_11 = this.field3128[i_10];
               i_12 = this.field3133[i_11];
               i_8 = 0;
               i_13 = -1;
               this.field3137[i_11] = new int[i_12];

               for (i_14 = 0; i_14 < i_12; i_14++) {
                  i_15 = this.field3137[i_11][i_14] = i_8 += class300_5.readUnsignedShortBigEndian();
                  if (i_15 > i_13) {
                     i_13 = i_15;
                  }
               }

               this.field3138[i_11] = new Object[i_13 + 1];
            }
         }

         if (i_7 != 0) {
            this.field3127 = new int[i_9 + 1][];
            this.field3140 = new class335[i_9 + 1];

            for (i_10 = 0; i_10 < this.field3142; i_10++) {
               i_11 = this.field3128[i_10];
               i_12 = this.field3133[i_11];
               this.field3127[i_11] = new int[this.field3138[i_11].length];

               for (i_13 = 0; i_13 < i_12; i_13++) {
                  this.field3127[i_11][this.field3137[i_11][i_13]] = class300_5.readIntMedEndian();
               }

               this.field3140[i_11] = new class335(this.field3127[i_11]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public boolean method4164(String string_1, String string_2, int i_3) {
      string_1 = string_1.toLowerCase();
      string_2 = string_2.toLowerCase();
      int i_4 = this.field3135.method6501(class12.method148(string_1, (byte) 65), 1528091447);
      int i_5 = this.field3140[i_4].method6501(class12.method148(string_2, (byte) -37), 1528091447);
      return this.method4146(i_4, i_5);
   }

   void vmethod4278(int i_1, int i_2) {
   }

   public boolean method4199(int i_1, int i_2) {
      if (this.field3126[i_1] != null) {
         return true;
      } else {
         this.vmethod4260(i_1, (short) 12163);
         return this.field3126[i_1] != null;
      }
   }

   public boolean method4162(String string_1, String string_2, byte b_3) {
      string_1 = string_1.toLowerCase();
      string_2 = string_2.toLowerCase();
      int i_4 = this.field3135.method6501(class12.method148(string_1, (byte) -27), 1528091447);
      if (i_4 < 0) {
         return false;
      } else {
         int i_5 = this.field3140[i_4].method6501(class12.method148(string_2, (byte) 37), 1528091447);
         return i_5 >= 0;
      }
   }

   public int method4160(String string_1) {
      string_1 = string_1.toLowerCase();
      return this.field3135.method6501(class12.method148(string_1, (byte) -78), 1528091447);
   }

   public int method4161(int i_1, String string_2) {
      string_2 = string_2.toLowerCase();
      return this.field3140[i_1].method6501(class12.method148(string_2, (byte) 16), 1528091447);
   }

   public boolean method4147(int i_1) {
      if (this.field3138.length == 1) {
         return this.method4146(0, i_1);
      } else if (this.field3138[i_1].length == 1) {
         return this.method4146(i_1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   boolean method4235(int i_1, int[] ints_2) {
      if (this.field3126[i_1] == null) {
         return false;
      } else {
         int i_4 = this.field3133[i_1];
         int[] ints_5 = this.field3137[i_1];
         Object[] arr_6 = this.field3138[i_1];
         boolean bool_7 = true;

         for (int i_8 = 0; i_8 < i_4; i_8++) {
            if (arr_6[ints_5[i_8]] == null) {
               bool_7 = false;
               break;
            }
         }

         if (bool_7) {
            return true;
         } else {
            byte[] bytes_22;
            if (ints_2 == null || ints_2[0] == 0 && ints_2[1] == 0 && ints_2[2] == 0 && ints_2[3] == 0) {
               bytes_22 = class308.method5873(this.field3126[i_1], false);
            } else {
               bytes_22 = class308.method5873(this.field3126[i_1], true);
               ByteBuffer class300_9 = new ByteBuffer(bytes_22);
               class300_9.decryptTEA(ints_2, 5, class300_9.buffer.length);
            }

            byte[] bytes_26 = class70.method1678(bytes_22);
            if (this.field3141) {
               this.field3126[i_1] = null;
            }

            int i_11;
            if (i_4 > 1) {
               int i_10 = bytes_26.length;
               --i_10;
               i_11 = bytes_26[i_10] & 0xff;
               i_10 -= i_11 * i_4 * 4;
               ByteBuffer class300_12 = new ByteBuffer(bytes_26);
               int[] ints_13 = new int[i_4];
               class300_12.position = i_10;

               int i_15;
               int i_16;
               for (int i_14 = 0; i_14 < i_11; i_14++) {
                  i_15 = 0;

                  for (i_16 = 0; i_16 < i_4; i_16++) {
                     i_15 += class300_12.readIntMedEndian();
                     ints_13[i_16] += i_15;
                  }
               }

               byte[][] bytes_24 = new byte[i_4][];

               for (i_15 = 0; i_15 < i_4; i_15++) {
                  bytes_24[i_15] = new byte[ints_13[i_15]];
                  ints_13[i_15] = 0;
               }

               class300_12.position = i_10;
               i_15 = 0;

               int i_18;
               for (i_16 = 0; i_16 < i_11; i_16++) {
                  int i_17 = 0;

                  for (i_18 = 0; i_18 < i_4; i_18++) {
                     i_17 += class300_12.readIntMedEndian();
                     System.arraycopy(bytes_26, i_15, bytes_24[i_18], ints_13[i_18], i_17);
                     ints_13[i_18] += i_17;
                     i_15 += i_17;
                  }
               }

               for (i_16 = 0; i_16 < i_4; i_16++) {
                  if (!this.field3130) {
                     i_18 = ints_5[i_16];
                     byte[] bytes_20 = bytes_24[i_16];
                     Object obj_19;
                     if (bytes_20 == null) {
                        obj_19 = null;
                     } else if (bytes_20.length > 136) {
                        class206 class206_21 = new class206();
                        class206_21.vmethod3934(bytes_20, 273645110);
                        obj_19 = class206_21;
                     } else {
                        obj_19 = bytes_20;
                     }

                     arr_6[i_18] = obj_19;
                  } else {
                     arr_6[ints_5[i_16]] = bytes_24[i_16];
                  }
               }
            } else if (!this.field3130) {
               i_11 = ints_5[0];
               Object obj_27;
               if (bytes_26 == null) {
                  obj_27 = null;
               } else if (bytes_26.length > 136) {
                  class206 class206_28 = new class206();
                  class206_28.vmethod3934(bytes_26, 1190005446);
                  obj_27 = class206_28;
               } else {
                  obj_27 = bytes_26;
               }

               arr_6[i_11] = obj_27;
            } else {
               arr_6[ints_5[0]] = bytes_26;
            }

            return true;
         }
      }
   }

   public byte[] method4163(String string_1, String string_2, int i_3) {
      string_1 = string_1.toLowerCase();
      string_2 = string_2.toLowerCase();
      int i_4 = this.field3135.method6501(class12.method148(string_1, (byte) -63), 1528091447);
      int i_5 = this.field3140[i_4].method6501(class12.method148(string_2, (byte) -24), 1528091447);
      return this.method4144(i_4, i_5);
   }

   public void method4156(int i_1) {
      for (int i_2 = 0; i_2 < this.field3126.length; i_2++) {
         this.field3126[i_2] = null;
      }

   }

   public void method4158(int i_1) {
      for (int i_2 = 0; i_2 < this.field3138.length; i_2++) {
         if (this.field3138[i_2] != null) {
            for (int i_3 = 0; i_3 < this.field3138[i_2].length; i_3++) {
               this.field3138[i_2][i_3] = null;
            }
         }
      }

   }

   public boolean method4148(int i_1) {
      boolean bool_2 = true;

      for (int i_3 = 0; i_3 < this.field3128.length; i_3++) {
         int i_4 = this.field3128[i_3];
         if (this.field3126[i_4] == null) {
            this.vmethod4260(i_4, (short) 3211);
            if (this.field3126[i_4] == null) {
               bool_2 = false;
            }
         }
      }

      return bool_2;
   }

   public boolean method4165(String string_1, int i_2) {
      string_1 = string_1.toLowerCase();
      int i_3 = this.field3135.method6501(class12.method148(string_1, (byte) 72), 1528091447);
      return this.method4199(i_3, -43766791);
   }

   public int method4238(String string_1, byte b_2) {
      string_1 = string_1.toLowerCase();
      int i_3 = this.field3135.method6501(class12.method148(string_1, (byte) 36), 1528091447);
      return this.vmethod4266(i_3, (byte) 0);
   }

   public void method4157(int i_1, int i_2) {
      for (int i_3 = 0; i_3 < this.field3138[i_1].length; i_3++) {
         this.field3138[i_1][i_3] = null;
      }

   }

   public void method4166(String string_1, byte b_2) {
      string_1 = string_1.toLowerCase();
      int i_3 = this.field3135.method6501(class12.method148(string_1, (byte) 88), 1528091447);
      if (i_3 >= 0) {
         this.vmethod4278(i_3, 2144523901);
      }
   }

   static class84[] method4141(byte b_0) {
      return new class84[] {class84.field1167, class84.field1170, class84.field1173, class84.field1169};
   }

   static int method4172(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      if (i_0 == 3200) {
         class70.field1014 -= 3;
         class81.method1989(class76.field1098[class70.field1014], class76.field1098[class70.field1014 + 1], class76.field1098[class70.field1014 + 2]);
         return 1;
      } else if (i_0 == 3201) {
         class8.method93(class76.field1098[--class70.field1014], 486411267);
         return 1;
      } else if (i_0 == 3202) {
         class70.field1014 -= 2;
         class17.method188(class76.field1098[class70.field1014], class76.field1098[class70.field1014 + 1], -211024130);
         return 1;
      } else {
         return 2;
      }
   }

}
