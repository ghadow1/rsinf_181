public class Model extends class135 {

   static int[] field1584 = new int[10000];
   static int[] field1585 = new int[10000];
   static int field1586 = 0;
   static int[] field1570;
   static int[] field1588;
   int field1558 = 0;
   int field1551 = 0;
   byte field1563 = 0;
   boolean field1578 = false;
   int field1555;
   int[] field1576;
   int[] field1550;
   int[] field1552;
   int[] field1569;
   int[] field1549;
   int[] field1583;
   int[] field1556;
   byte[] field1557;
   byte[] field1559;
   byte[] field1587;
   int[] field1553;
   short[] field1562;
   byte[] field1560;
   short[] field1561;
   byte[] field1565;
   short[] field1566;
   short[] field1567;
   short[] field1568;
   int[][] field1571;
   int[][] field1572;
   class129[] field1574;
   class137[] field1573;
   class129[] field1581;
   public short field1580;
   public short field1577;
   int field1579;
   int field1575;
   int field1564;
   int field1582;
   int field1554;

   static {
      field1570 = class130.field1787;
      field1588 = class130.field1784;
   }

   Model() {
   }

   public Model(Model[] arr_1, int i_2) {
      boolean bool_3 = false;
      boolean bool_4 = false;
      boolean bool_5 = false;
      boolean bool_6 = false;
      boolean bool_7 = false;
      boolean bool_8 = false;
      this.field1558 = 0;
      this.field1551 = 0;
      this.field1555 = 0;
      this.field1563 = -1;

      int i_9;
      Model model_10;
      for (i_9 = 0; i_9 < i_2; i_9++) {
         model_10 = arr_1[i_9];
         if (model_10 != null) {
            this.field1558 += model_10.field1558;
            this.field1551 += model_10.field1551;
            this.field1555 += model_10.field1555;
            if (model_10.field1559 != null) {
               bool_4 = true;
            } else {
               if (this.field1563 == -1) {
                  this.field1563 = model_10.field1563;
               }

               if (this.field1563 != model_10.field1563) {
                  bool_4 = true;
               }
            }

            bool_3 |= model_10.field1557 != null;
            bool_5 |= model_10.field1587 != null;
            bool_6 |= model_10.field1553 != null;
            bool_7 |= model_10.field1562 != null;
            bool_8 |= model_10.field1560 != null;
         }
      }

      this.field1576 = new int[this.field1558];
      this.field1550 = new int[this.field1558];
      this.field1552 = new int[this.field1558];
      this.field1569 = new int[this.field1558];
      this.field1549 = new int[this.field1551];
      this.field1583 = new int[this.field1551];
      this.field1556 = new int[this.field1551];
      if (bool_3) {
         this.field1557 = new byte[this.field1551];
      }

      if (bool_4) {
         this.field1559 = new byte[this.field1551];
      }

      if (bool_5) {
         this.field1587 = new byte[this.field1551];
      }

      if (bool_6) {
         this.field1553 = new int[this.field1551];
      }

      if (bool_7) {
         this.field1562 = new short[this.field1551];
      }

      if (bool_8) {
         this.field1560 = new byte[this.field1551];
      }

      this.field1561 = new short[this.field1551];
      if (this.field1555 > 0) {
         this.field1565 = new byte[this.field1555];
         this.field1566 = new short[this.field1555];
         this.field1567 = new short[this.field1555];
         this.field1568 = new short[this.field1555];
      }

      this.field1558 = 0;
      this.field1551 = 0;
      this.field1555 = 0;

      for (i_9 = 0; i_9 < i_2; i_9++) {
         model_10 = arr_1[i_9];
         if (model_10 != null) {
            int i_11;
            for (i_11 = 0; i_11 < model_10.field1551; i_11++) {
               if (bool_3 && model_10.field1557 != null) {
                  this.field1557[this.field1551] = model_10.field1557[i_11];
               }

               if (bool_4) {
                  if (model_10.field1559 != null) {
                     this.field1559[this.field1551] = model_10.field1559[i_11];
                  } else {
                     this.field1559[this.field1551] = model_10.field1563;
                  }
               }

               if (bool_5 && model_10.field1587 != null) {
                  this.field1587[this.field1551] = model_10.field1587[i_11];
               }

               if (bool_6 && model_10.field1553 != null) {
                  this.field1553[this.field1551] = model_10.field1553[i_11];
               }

               if (bool_7) {
                  if (model_10.field1562 != null) {
                     this.field1562[this.field1551] = model_10.field1562[i_11];
                  } else {
                     this.field1562[this.field1551] = -1;
                  }
               }

               if (bool_8) {
                  if (model_10.field1560 != null && model_10.field1560[i_11] != -1) {
                     this.field1560[this.field1551] = (byte) (this.field1555 + model_10.field1560[i_11]);
                  } else {
                     this.field1560[this.field1551] = -1;
                  }
               }

               this.field1561[this.field1551] = model_10.field1561[i_11];
               this.field1549[this.field1551] = this.method2816(model_10, model_10.field1549[i_11]);
               this.field1583[this.field1551] = this.method2816(model_10, model_10.field1583[i_11]);
               this.field1556[this.field1551] = this.method2816(model_10, model_10.field1556[i_11]);
               ++this.field1551;
            }

            for (i_11 = 0; i_11 < model_10.field1555; i_11++) {
               byte b_12 = this.field1565[this.field1555] = model_10.field1565[i_11];
               if (b_12 == 0) {
                  this.field1566[this.field1555] = (short) this.method2816(model_10, model_10.field1566[i_11]);
                  this.field1567[this.field1555] = (short) this.method2816(model_10, model_10.field1567[i_11]);
                  this.field1568[this.field1555] = (short) this.method2816(model_10, model_10.field1568[i_11]);
               }

               ++this.field1555;
            }
         }
      }

   }

   Model(byte[] bytes_1) {
      if (bytes_1[bytes_1.length - 1] == -1 && bytes_1[bytes_1.length - 2] == -1) {
         this.method2770(bytes_1);
      } else {
         this.method2793(bytes_1);
      }

   }

   public Model(Model model_1, boolean bool_2, boolean bool_3, boolean bool_4) {
      this.field1558 = model_1.field1558;
      this.field1551 = model_1.field1551;
      this.field1555 = model_1.field1555;
      int i_6;
      if (bool_2) {
         this.field1576 = model_1.field1576;
         this.field1550 = model_1.field1550;
         this.field1552 = model_1.field1552;
      } else {
         this.field1576 = new int[this.field1558];
         this.field1550 = new int[this.field1558];
         this.field1552 = new int[this.field1558];

         for (i_6 = 0; i_6 < this.field1558; i_6++) {
            this.field1576[i_6] = model_1.field1576[i_6];
            this.field1550[i_6] = model_1.field1550[i_6];
            this.field1552[i_6] = model_1.field1552[i_6];
         }
      }

      if (bool_3) {
         this.field1561 = model_1.field1561;
      } else {
         this.field1561 = new short[this.field1551];

         for (i_6 = 0; i_6 < this.field1551; i_6++) {
            this.field1561[i_6] = model_1.field1561[i_6];
         }
      }

      if (!bool_4 && model_1.field1562 != null) {
         this.field1562 = new short[this.field1551];

         for (i_6 = 0; i_6 < this.field1551; i_6++) {
            this.field1562[i_6] = model_1.field1562[i_6];
         }
      } else {
         this.field1562 = model_1.field1562;
      }

      this.field1587 = model_1.field1587;
      this.field1549 = model_1.field1549;
      this.field1583 = model_1.field1583;
      this.field1556 = model_1.field1556;
      this.field1557 = model_1.field1557;
      this.field1559 = model_1.field1559;
      this.field1560 = model_1.field1560;
      this.field1563 = model_1.field1563;
      this.field1565 = model_1.field1565;
      this.field1566 = model_1.field1566;
      this.field1567 = model_1.field1567;
      this.field1568 = model_1.field1568;
      this.field1569 = model_1.field1569;
      this.field1553 = model_1.field1553;
      this.field1571 = model_1.field1571;
      this.field1572 = model_1.field1572;
      this.field1574 = model_1.field1574;
      this.field1573 = model_1.field1573;
      this.field1581 = model_1.field1581;
      this.field1580 = model_1.field1580;
      this.field1577 = model_1.field1577;
   }

   void method2789() {
      if (!this.field1578) {
         super.field1873 = 0;
         this.field1579 = 0;
         this.field1575 = 999999;
         this.field1564 = -999999;
         this.field1582 = -99999;
         this.field1554 = 99999;

         for (int i_1 = 0; i_1 < this.field1558; i_1++) {
            int i_2 = this.field1576[i_1];
            int i_3 = this.field1550[i_1];
            int i_4 = this.field1552[i_1];
            if (i_2 < this.field1575) {
               this.field1575 = i_2;
            }

            if (i_2 > this.field1564) {
               this.field1564 = i_2;
            }

            if (i_4 < this.field1554) {
               this.field1554 = i_4;
            }

            if (i_4 > this.field1582) {
               this.field1582 = i_4;
            }

            if (-i_3 > super.field1873) {
               super.field1873 = -i_3;
            }

            if (i_3 > this.field1579) {
               this.field1579 = i_3;
            }
         }

         this.field1578 = true;
      }
   }

   public void method2787() {
      if (this.field1574 == null) {
         this.field1574 = new class129[this.field1558];

         int i_1;
         for (i_1 = 0; i_1 < this.field1558; i_1++) {
            this.field1574[i_1] = new class129();
         }

         for (i_1 = 0; i_1 < this.field1551; i_1++) {
            int i_2 = this.field1549[i_1];
            int i_3 = this.field1583[i_1];
            int i_4 = this.field1556[i_1];
            int i_5 = this.field1576[i_3] - this.field1576[i_2];
            int i_6 = this.field1550[i_3] - this.field1550[i_2];
            int i_7 = this.field1552[i_3] - this.field1552[i_2];
            int i_8 = this.field1576[i_4] - this.field1576[i_2];
            int i_9 = this.field1550[i_4] - this.field1550[i_2];
            int i_10 = this.field1552[i_4] - this.field1552[i_2];
            int i_11 = i_6 * i_10 - i_9 * i_7;
            int i_12 = i_7 * i_8 - i_10 * i_5;

            int i_13;
            for (i_13 = i_5 * i_9 - i_8 * i_6; i_11 > 8192 || i_12 > 8192 || i_13 > 8192 || i_11 < -8192 || i_12 < -8192 || i_13 < -8192; i_13 >>= 1) {
               i_11 >>= 1;
               i_12 >>= 1;
            }

            int i_14 = (int)Math.sqrt((double)(i_11 * i_11 + i_12 * i_12 + i_13 * i_13));
            if (i_14 <= 0) {
               i_14 = 1;
            }

            i_11 = i_11 * 256 / i_14;
            i_12 = i_12 * 256 / i_14;
            i_13 = i_13 * 256 / i_14;
            byte b_15;
            if (this.field1557 == null) {
               b_15 = 0;
            } else {
               b_15 = this.field1557[i_1];
            }

            if (b_15 == 0) {
               class129 class129_16 = this.field1574[i_2];
               class129_16.field1759 += i_11;
               class129_16.field1760 += i_12;
               class129_16.field1758 += i_13;
               ++class129_16.field1761;
               class129_16 = this.field1574[i_3];
               class129_16.field1759 += i_11;
               class129_16.field1760 += i_12;
               class129_16.field1758 += i_13;
               ++class129_16.field1761;
               class129_16 = this.field1574[i_4];
               class129_16.field1759 += i_11;
               class129_16.field1760 += i_12;
               class129_16.field1758 += i_13;
               ++class129_16.field1761;
            } else if (b_15 == 1) {
               if (this.field1573 == null) {
                  this.field1573 = new class137[this.field1551];
               }

               class137 class137_17 = this.field1573[i_1] = new class137();
               class137_17.field1889 = i_11;
               class137_17.field1890 = i_12;
               class137_17.field1888 = i_13;
            }
         }

      }
   }

   void method2788() {
      this.field1574 = null;
      this.field1581 = null;
      this.field1573 = null;
      this.field1578 = false;
   }

   public static Model method2769(class233 class233_0, int i_1, int i_2) {
      byte[] bytes_3 = class233_0.method4144(i_1, i_2);
      return bytes_3 == null ? null : new Model(bytes_3);
   }

   public void method2783(short s_1, short s_2) {
      for (int i_3 = 0; i_3 < this.field1551; i_3++) {
         if (this.field1561[i_3] == s_1) {
            this.field1561[i_3] = s_2;
         }
      }

   }

   public void method2786(int i_1, int i_2, int i_3) {
      for (int i_4 = 0; i_4 < this.field1558; i_4++) {
         this.field1576[i_4] = this.field1576[i_4] * i_1 / 128;
         this.field1550[i_4] = i_2 * this.field1550[i_4] / 128;
         this.field1552[i_4] = i_3 * this.field1552[i_4] / 128;
      }

      this.method2788();
   }

   void method2793(byte[] bytes_1) {
      boolean bool_2 = false;
      boolean bool_3 = false;
      ByteBuffer class300_4 = new ByteBuffer(bytes_1);
      ByteBuffer class300_5 = new ByteBuffer(bytes_1);
      ByteBuffer class300_6 = new ByteBuffer(bytes_1);
      ByteBuffer class300_7 = new ByteBuffer(bytes_1);
      ByteBuffer class300_8 = new ByteBuffer(bytes_1);
      class300_4.position = bytes_1.length - 18;
      int i_9 = class300_4.readUnsignedShortBigEndian();
      int i_10 = class300_4.readUnsignedShortBigEndian();
      int i_11 = class300_4.readUnsignedByte();
      int i_12 = class300_4.readUnsignedByte();
      int i_13 = class300_4.readUnsignedByte();
      int i_14 = class300_4.readUnsignedByte();
      int i_15 = class300_4.readUnsignedByte();
      int i_16 = class300_4.readUnsignedByte();
      int i_17 = class300_4.readUnsignedShortBigEndian();
      int i_18 = class300_4.readUnsignedShortBigEndian();
      int i_19 = class300_4.readUnsignedShortBigEndian();
      int i_20 = class300_4.readUnsignedShortBigEndian();
      byte b_21 = 0;
      int i_45 = b_21 + i_9;
      int i_23 = i_45;
      i_45 += i_10;
      int i_24 = i_45;
      if (i_13 == 255) {
         i_45 += i_10;
      }

      int i_25 = i_45;
      if (i_15 == 1) {
         i_45 += i_10;
      }

      int i_26 = i_45;
      if (i_12 == 1) {
         i_45 += i_10;
      }

      int i_27 = i_45;
      if (i_16 == 1) {
         i_45 += i_9;
      }

      int i_28 = i_45;
      if (i_14 == 1) {
         i_45 += i_10;
      }

      int i_29 = i_45;
      i_45 += i_20;
      int i_30 = i_45;
      i_45 += i_10 * 2;
      int i_31 = i_45;
      i_45 += i_11 * 6;
      int i_32 = i_45;
      i_45 += i_17;
      int i_33 = i_45;
      i_45 += i_18;
      int i_10000 = i_45 + i_19;
      this.field1558 = i_9;
      this.field1551 = i_10;
      this.field1555 = i_11;
      this.field1576 = new int[i_9];
      this.field1550 = new int[i_9];
      this.field1552 = new int[i_9];
      this.field1549 = new int[i_10];
      this.field1583 = new int[i_10];
      this.field1556 = new int[i_10];
      if (i_11 > 0) {
         this.field1565 = new byte[i_11];
         this.field1566 = new short[i_11];
         this.field1567 = new short[i_11];
         this.field1568 = new short[i_11];
      }

      if (i_16 == 1) {
         this.field1569 = new int[i_9];
      }

      if (i_12 == 1) {
         this.field1557 = new byte[i_10];
         this.field1560 = new byte[i_10];
         this.field1562 = new short[i_10];
      }

      if (i_13 == 255) {
         this.field1559 = new byte[i_10];
      } else {
         this.field1563 = (byte)i_13;
      }

      if (i_14 == 1) {
         this.field1587 = new byte[i_10];
      }

      if (i_15 == 1) {
         this.field1553 = new int[i_10];
      }

      this.field1561 = new short[i_10];
      class300_4.position = b_21;
      class300_5.position = i_32;
      class300_6.position = i_33;
      class300_7.position = i_45;
      class300_8.position = i_27;
      int i_35 = 0;
      int i_36 = 0;
      int i_37 = 0;

      int i_38;
      int i_39;
      int i_40;
      int i_41;
      int i_42;
      for (i_38 = 0; i_38 < i_9; i_38++) {
         i_39 = class300_4.readUnsignedByte();
         i_40 = 0;
         if ((i_39 & 0x1) != 0) {
            i_40 = class300_5.readSmartSignedInt();
         }

         i_41 = 0;
         if ((i_39 & 0x2) != 0) {
            i_41 = class300_6.readSmartSignedInt();
         }

         i_42 = 0;
         if ((i_39 & 0x4) != 0) {
            i_42 = class300_7.readSmartSignedInt();
         }

         this.field1576[i_38] = i_35 + i_40;
         this.field1550[i_38] = i_36 + i_41;
         this.field1552[i_38] = i_37 + i_42;
         i_35 = this.field1576[i_38];
         i_36 = this.field1550[i_38];
         i_37 = this.field1552[i_38];
         if (i_16 == 1) {
            this.field1569[i_38] = class300_8.readUnsignedByte();
         }
      }

      class300_4.position = i_30;
      class300_5.position = i_26;
      class300_6.position = i_24;
      class300_7.position = i_28;
      class300_8.position = i_25;

      for (i_38 = 0; i_38 < i_10; i_38++) {
         this.field1561[i_38] = (short)class300_4.readUnsignedShortBigEndian();
         if (i_12 == 1) {
            i_39 = class300_5.readUnsignedByte();
            if ((i_39 & 0x1) == 1) {
               this.field1557[i_38] = 1;
               bool_2 = true;
            } else {
               this.field1557[i_38] = 0;
            }

            if ((i_39 & 0x2) == 2) {
               this.field1560[i_38] = (byte)(i_39 >> 2);
               this.field1562[i_38] = this.field1561[i_38];
               this.field1561[i_38] = 127;
               if (this.field1562[i_38] != -1) {
                  bool_3 = true;
               }
            } else {
               this.field1560[i_38] = -1;
               this.field1562[i_38] = -1;
            }
         }

         if (i_13 == 255) {
            this.field1559[i_38] = class300_6.readSignedByte();
         }

         if (i_14 == 1) {
            this.field1587[i_38] = class300_7.readSignedByte();
         }

         if (i_15 == 1) {
            this.field1553[i_38] = class300_8.readUnsignedByte();
         }
      }

      class300_4.position = i_29;
      class300_5.position = i_23;
      i_38 = 0;
      i_39 = 0;
      i_40 = 0;
      i_41 = 0;

      int i_43;
      int i_44;
      for (i_42 = 0; i_42 < i_10; i_42++) {
         i_43 = class300_5.readUnsignedByte();
         if (i_43 == 1) {
            i_38 = class300_4.readSmartSignedInt() + i_41;
            i_39 = class300_4.readSmartSignedInt() + i_38;
            i_40 = class300_4.readSmartSignedInt() + i_39;
            i_41 = i_40;
            this.field1549[i_42] = i_38;
            this.field1583[i_42] = i_39;
            this.field1556[i_42] = i_40;
         }

         if (i_43 == 2) {
            i_39 = i_40;
            i_40 = class300_4.readSmartSignedInt() + i_41;
            i_41 = i_40;
            this.field1549[i_42] = i_38;
            this.field1583[i_42] = i_39;
            this.field1556[i_42] = i_40;
         }

         if (i_43 == 3) {
            i_38 = i_40;
            i_40 = class300_4.readSmartSignedInt() + i_41;
            i_41 = i_40;
            this.field1549[i_42] = i_38;
            this.field1583[i_42] = i_39;
            this.field1556[i_42] = i_40;
         }

         if (i_43 == 4) {
            i_44 = i_38;
            i_38 = i_39;
            i_39 = i_44;
            i_40 = class300_4.readSmartSignedInt() + i_41;
            i_41 = i_40;
            this.field1549[i_42] = i_38;
            this.field1583[i_42] = i_44;
            this.field1556[i_42] = i_40;
         }
      }

      class300_4.position = i_31;

      for (i_42 = 0; i_42 < i_11; i_42++) {
         this.field1565[i_42] = 0;
         this.field1566[i_42] = (short)class300_4.readUnsignedShortBigEndian();
         this.field1567[i_42] = (short)class300_4.readUnsignedShortBigEndian();
         this.field1568[i_42] = (short)class300_4.readUnsignedShortBigEndian();
      }

      if (this.field1560 != null) {
         boolean bool_46 = false;

         for (i_43 = 0; i_43 < i_10; i_43++) {
            i_44 = this.field1560[i_43] & 0xff;
            if (i_44 != 255) {
               if (this.field1549[i_43] == (this.field1566[i_44] & 0xffff) && this.field1583[i_43] == (this.field1567[i_44] & 0xffff) && this.field1556[i_43] == (this.field1568[i_44] & 0xffff)) {
                  this.field1560[i_43] = -1;
               } else {
                  bool_46 = true;
               }
            }
         }

         if (!bool_46) {
            this.field1560 = null;
         }
      }

      if (!bool_3) {
         this.field1562 = null;
      }

      if (!bool_2) {
         this.field1557 = null;
      }

   }

   public void method2784(short s_1, short s_2) {
      if (this.field1562 != null) {
         for (int i_3 = 0; i_3 < this.field1551; i_3++) {
            if (this.field1562[i_3] == s_1) {
               this.field1562[i_3] = s_2;
            }
         }

      }
   }

   static void method2790(Model model_0, Model model_1, int i_2, int i_3, int i_4, boolean bool_5) {
      model_0.method2789();
      model_0.method2787();
      model_1.method2789();
      model_1.method2787();
      ++field1586;
      int i_6 = 0;
      int[] ints_7 = model_1.field1576;
      int i_8 = model_1.field1558;

      int i_9;
      for (i_9 = 0; i_9 < model_0.field1558; i_9++) {
         class129 class129_10 = model_0.field1574[i_9];
         if (class129_10.field1761 != 0) {
            int i_11 = model_0.field1550[i_9] - i_3;
            if (i_11 <= model_1.field1579) {
               int i_12 = model_0.field1576[i_9] - i_2;
               if (i_12 >= model_1.field1575 && i_12 <= model_1.field1564) {
                  int i_13 = model_0.field1552[i_9] - i_4;
                  if (i_13 >= model_1.field1554 && i_13 <= model_1.field1582) {
                     for (int i_14 = 0; i_14 < i_8; i_14++) {
                        class129 class129_15 = model_1.field1574[i_14];
                        if (i_12 == ints_7[i_14] && i_13 == model_1.field1552[i_14] && i_11 == model_1.field1550[i_14] && class129_15.field1761 != 0) {
                           if (model_0.field1581 == null) {
                              model_0.field1581 = new class129[model_0.field1558];
                           }

                           if (model_1.field1581 == null) {
                              model_1.field1581 = new class129[i_8];
                           }

                           class129 class129_16 = model_0.field1581[i_9];
                           if (class129_16 == null) {
                              class129_16 = model_0.field1581[i_9] = new class129(class129_10);
                           }

                           class129 class129_17 = model_1.field1581[i_14];
                           if (class129_17 == null) {
                              class129_17 = model_1.field1581[i_14] = new class129(class129_15);
                           }

                           class129_16.field1759 += class129_15.field1759;
                           class129_16.field1760 += class129_15.field1760;
                           class129_16.field1758 += class129_15.field1758;
                           class129_16.field1761 += class129_15.field1761;
                           class129_17.field1759 += class129_10.field1759;
                           class129_17.field1760 += class129_10.field1760;
                           class129_17.field1758 += class129_10.field1758;
                           class129_17.field1761 += class129_10.field1761;
                           ++i_6;
                           field1584[i_9] = field1586;
                           field1585[i_14] = field1586;
                        }
                     }
                  }
               }
            }
         }
      }

      if (i_6 >= 3 && bool_5) {
         for (i_9 = 0; i_9 < model_0.field1551; i_9++) {
            if (field1584[model_0.field1549[i_9]] == field1586 && field1584[model_0.field1583[i_9]] == field1586 && field1584[model_0.field1556[i_9]] == field1586) {
               if (model_0.field1557 == null) {
                  model_0.field1557 = new byte[model_0.field1551];
               }

               model_0.field1557[i_9] = 2;
            }
         }

         for (i_9 = 0; i_9 < model_1.field1551; i_9++) {
            if (field1586 == field1585[model_1.field1549[i_9]] && field1586 == field1585[model_1.field1583[i_9]] && field1586 == field1585[model_1.field1556[i_9]]) {
               if (model_1.field1557 == null) {
                  model_1.field1557 = new byte[model_1.field1551];
               }

               model_1.field1557[i_9] = 2;
            }
         }

      }
   }

   void method2770(byte[] bytes_1) {
      ByteBuffer class300_2 = new ByteBuffer(bytes_1);
      ByteBuffer class300_3 = new ByteBuffer(bytes_1);
      ByteBuffer class300_4 = new ByteBuffer(bytes_1);
      ByteBuffer class300_5 = new ByteBuffer(bytes_1);
      ByteBuffer class300_6 = new ByteBuffer(bytes_1);
      ByteBuffer class300_7 = new ByteBuffer(bytes_1);
      ByteBuffer class300_8 = new ByteBuffer(bytes_1);
      class300_2.position = bytes_1.length - 23;
      int i_9 = class300_2.readUnsignedShortBigEndian();
      int i_10 = class300_2.readUnsignedShortBigEndian();
      int i_11 = class300_2.readUnsignedByte();
      int i_12 = class300_2.readUnsignedByte();
      int i_13 = class300_2.readUnsignedByte();
      int i_14 = class300_2.readUnsignedByte();
      int i_15 = class300_2.readUnsignedByte();
      int i_16 = class300_2.readUnsignedByte();
      int i_17 = class300_2.readUnsignedByte();
      int i_18 = class300_2.readUnsignedShortBigEndian();
      int i_19 = class300_2.readUnsignedShortBigEndian();
      int i_20 = class300_2.readUnsignedShortBigEndian();
      int i_21 = class300_2.readUnsignedShortBigEndian();
      int i_22 = class300_2.readUnsignedShortBigEndian();
      int i_23 = 0;
      int i_24 = 0;
      int i_25 = 0;
      int i_26;
      if (i_11 > 0) {
         this.field1565 = new byte[i_11];
         class300_2.position = 0;

         for (i_26 = 0; i_26 < i_11; i_26++) {
            byte b_27 = this.field1565[i_26] = class300_2.readSignedByte();
            if (b_27 == 0) {
               ++i_23;
            }

            if (b_27 >= 1 && b_27 <= 3) {
               ++i_24;
            }

            if (b_27 == 2) {
               ++i_25;
            }
         }
      }

      i_26 = i_11 + i_9;
      int i_28 = i_26;
      if (i_12 == 1) {
         i_26 += i_10;
      }

      int i_29 = i_26;
      i_26 += i_10;
      int i_30 = i_26;
      if (i_13 == 255) {
         i_26 += i_10;
      }

      int i_31 = i_26;
      if (i_15 == 1) {
         i_26 += i_10;
      }

      int i_32 = i_26;
      if (i_17 == 1) {
         i_26 += i_9;
      }

      int i_33 = i_26;
      if (i_14 == 1) {
         i_26 += i_10;
      }

      int i_34 = i_26;
      i_26 += i_21;
      int i_35 = i_26;
      if (i_16 == 1) {
         i_26 += i_10 * 2;
      }

      int i_36 = i_26;
      i_26 += i_22;
      int i_37 = i_26;
      i_26 += i_10 * 2;
      int i_38 = i_26;
      i_26 += i_18;
      int i_39 = i_26;
      i_26 += i_19;
      int i_40 = i_26;
      i_26 += i_20;
      int i_41 = i_26;
      i_26 += i_23 * 6;
      int i_42 = i_26;
      i_26 += i_24 * 6;
      int i_43 = i_26;
      i_26 += i_24 * 6;
      int i_44 = i_26;
      i_26 += i_24 * 2;
      int i_45 = i_26;
      i_26 += i_24;
      int i_46 = i_26;
      i_26 += i_24 * 2 + i_25 * 2;
      this.field1558 = i_9;
      this.field1551 = i_10;
      this.field1555 = i_11;
      this.field1576 = new int[i_9];
      this.field1550 = new int[i_9];
      this.field1552 = new int[i_9];
      this.field1549 = new int[i_10];
      this.field1583 = new int[i_10];
      this.field1556 = new int[i_10];
      if (i_17 == 1) {
         this.field1569 = new int[i_9];
      }

      if (i_12 == 1) {
         this.field1557 = new byte[i_10];
      }

      if (i_13 == 255) {
         this.field1559 = new byte[i_10];
      } else {
         this.field1563 = (byte)i_13;
      }

      if (i_14 == 1) {
         this.field1587 = new byte[i_10];
      }

      if (i_15 == 1) {
         this.field1553 = new int[i_10];
      }

      if (i_16 == 1) {
         this.field1562 = new short[i_10];
      }

      if (i_16 == 1 && i_11 > 0) {
         this.field1560 = new byte[i_10];
      }

      this.field1561 = new short[i_10];
      if (i_11 > 0) {
         this.field1566 = new short[i_11];
         this.field1567 = new short[i_11];
         this.field1568 = new short[i_11];
      }

      class300_2.position = i_11;
      class300_3.position = i_38;
      class300_4.position = i_39;
      class300_5.position = i_40;
      class300_6.position = i_32;
      int i_48 = 0;
      int i_49 = 0;
      int i_50 = 0;

      int i_51;
      int i_52;
      int i_53;
      int i_54;
      int i_55;
      for (i_51 = 0; i_51 < i_9; i_51++) {
         i_52 = class300_2.readUnsignedByte();
         i_53 = 0;
         if ((i_52 & 0x1) != 0) {
            i_53 = class300_3.readSmartSignedInt();
         }

         i_54 = 0;
         if ((i_52 & 0x2) != 0) {
            i_54 = class300_4.readSmartSignedInt();
         }

         i_55 = 0;
         if ((i_52 & 0x4) != 0) {
            i_55 = class300_5.readSmartSignedInt();
         }

         this.field1576[i_51] = i_48 + i_53;
         this.field1550[i_51] = i_49 + i_54;
         this.field1552[i_51] = i_50 + i_55;
         i_48 = this.field1576[i_51];
         i_49 = this.field1550[i_51];
         i_50 = this.field1552[i_51];
         if (i_17 == 1) {
            this.field1569[i_51] = class300_6.readUnsignedByte();
         }
      }

      class300_2.position = i_37;
      class300_3.position = i_28;
      class300_4.position = i_30;
      class300_5.position = i_33;
      class300_6.position = i_31;
      class300_7.position = i_35;
      class300_8.position = i_36;

      for (i_51 = 0; i_51 < i_10; i_51++) {
         this.field1561[i_51] = (short)class300_2.readUnsignedShortBigEndian();
         if (i_12 == 1) {
            this.field1557[i_51] = class300_3.readSignedByte();
         }

         if (i_13 == 255) {
            this.field1559[i_51] = class300_4.readSignedByte();
         }

         if (i_14 == 1) {
            this.field1587[i_51] = class300_5.readSignedByte();
         }

         if (i_15 == 1) {
            this.field1553[i_51] = class300_6.readUnsignedByte();
         }

         if (i_16 == 1) {
            this.field1562[i_51] = (short)(class300_7.readUnsignedShortBigEndian() - 1);
         }

         if (this.field1560 != null && this.field1562[i_51] != -1) {
            this.field1560[i_51] = (byte)(class300_8.readUnsignedByte() - 1);
         }
      }

      class300_2.position = i_34;
      class300_3.position = i_29;
      i_51 = 0;
      i_52 = 0;
      i_53 = 0;
      i_54 = 0;

      int i_56;
      for (i_55 = 0; i_55 < i_10; i_55++) {
         i_56 = class300_3.readUnsignedByte();
         if (i_56 == 1) {
            i_51 = class300_2.readSmartSignedInt() + i_54;
            i_52 = class300_2.readSmartSignedInt() + i_51;
            i_53 = class300_2.readSmartSignedInt() + i_52;
            i_54 = i_53;
            this.field1549[i_55] = i_51;
            this.field1583[i_55] = i_52;
            this.field1556[i_55] = i_53;
         }

         if (i_56 == 2) {
            i_52 = i_53;
            i_53 = class300_2.readSmartSignedInt() + i_54;
            i_54 = i_53;
            this.field1549[i_55] = i_51;
            this.field1583[i_55] = i_52;
            this.field1556[i_55] = i_53;
         }

         if (i_56 == 3) {
            i_51 = i_53;
            i_53 = class300_2.readSmartSignedInt() + i_54;
            i_54 = i_53;
            this.field1549[i_55] = i_51;
            this.field1583[i_55] = i_52;
            this.field1556[i_55] = i_53;
         }

         if (i_56 == 4) {
            int i_57 = i_51;
            i_51 = i_52;
            i_52 = i_57;
            i_53 = class300_2.readSmartSignedInt() + i_54;
            i_54 = i_53;
            this.field1549[i_55] = i_51;
            this.field1583[i_55] = i_57;
            this.field1556[i_55] = i_53;
         }
      }

      class300_2.position = i_41;
      class300_3.position = i_42;
      class300_4.position = i_43;
      class300_5.position = i_44;
      class300_6.position = i_45;
      class300_7.position = i_46;

      for (i_55 = 0; i_55 < i_11; i_55++) {
         i_56 = this.field1565[i_55] & 0xff;
         if (i_56 == 0) {
            this.field1566[i_55] = (short)class300_2.readUnsignedShortBigEndian();
            this.field1567[i_55] = (short)class300_2.readUnsignedShortBigEndian();
            this.field1568[i_55] = (short)class300_2.readUnsignedShortBigEndian();
         }
      }

      class300_2.position = i_26;
      i_55 = class300_2.readUnsignedByte();
      if (i_55 != 0) {
         new class134();
         class300_2.readUnsignedShortBigEndian();
         class300_2.readUnsignedShortBigEndian();
         class300_2.readUnsignedShortBigEndian();
         class300_2.readIntMedEndian();
      }

   }

   public Model method2775() {
      Model model_1 = new Model();
      if (this.field1557 != null) {
         model_1.field1557 = new byte[this.field1551];

         for (int i_2 = 0; i_2 < this.field1551; i_2++) {
            model_1.field1557[i_2] = this.field1557[i_2];
         }
      }

      model_1.field1558 = this.field1558;
      model_1.field1551 = this.field1551;
      model_1.field1555 = this.field1555;
      model_1.field1576 = this.field1576;
      model_1.field1550 = this.field1550;
      model_1.field1552 = this.field1552;
      model_1.field1549 = this.field1549;
      model_1.field1583 = this.field1583;
      model_1.field1556 = this.field1556;
      model_1.field1559 = this.field1559;
      model_1.field1587 = this.field1587;
      model_1.field1560 = this.field1560;
      model_1.field1561 = this.field1561;
      model_1.field1562 = this.field1562;
      model_1.field1563 = this.field1563;
      model_1.field1565 = this.field1565;
      model_1.field1566 = this.field1566;
      model_1.field1567 = this.field1567;
      model_1.field1568 = this.field1568;
      model_1.field1569 = this.field1569;
      model_1.field1553 = this.field1553;
      model_1.field1571 = this.field1571;
      model_1.field1572 = this.field1572;
      model_1.field1574 = this.field1574;
      model_1.field1573 = this.field1573;
      model_1.field1580 = this.field1580;
      model_1.field1577 = this.field1577;
      return model_1;
   }

   public void method2782(int i_1, int i_2, int i_3) {
      for (int i_4 = 0; i_4 < this.field1558; i_4++) {
         this.field1576[i_4] += i_1;
         this.field1550[i_4] += i_2;
         this.field1552[i_4] += i_3;
      }

      this.method2788();
   }

   void method2777() {
      int[] ints_1;
      int i_2;
      int i_3;
      int i_4;
      if (this.field1569 != null) {
         ints_1 = new int[256];
         i_2 = 0;

         for (i_3 = 0; i_3 < this.field1558; i_3++) {
            i_4 = this.field1569[i_3];
            ++ints_1[i_4];
            if (i_4 > i_2) {
               i_2 = i_4;
            }
         }

         this.field1571 = new int[i_2 + 1][];

         for (i_3 = 0; i_3 <= i_2; i_3++) {
            this.field1571[i_3] = new int[ints_1[i_3]];
            ints_1[i_3] = 0;
         }

         for (i_3 = 0; i_3 < this.field1558; this.field1571[i_4][ints_1[i_4]++] = i_3++) {
            i_4 = this.field1569[i_3];
         }

         this.field1569 = null;
      }

      if (this.field1553 != null) {
         ints_1 = new int[256];
         i_2 = 0;

         for (i_3 = 0; i_3 < this.field1551; i_3++) {
            i_4 = this.field1553[i_3];
            ++ints_1[i_4];
            if (i_4 > i_2) {
               i_2 = i_4;
            }
         }

         this.field1572 = new int[i_2 + 1][];

         for (i_3 = 0; i_3 <= i_2; i_3++) {
            this.field1572[i_3] = new int[ints_1[i_3]];
            ints_1[i_3] = 0;
         }

         for (i_3 = 0; i_3 < this.field1551; this.field1572[i_4][ints_1[i_4]++] = i_3++) {
            i_4 = this.field1553[i_3];
         }

         this.field1553 = null;
      }

   }

   public void method2785() {
      int i_1;
      for (i_1 = 0; i_1 < this.field1558; i_1++) {
         this.field1552[i_1] = -this.field1552[i_1];
      }

      for (i_1 = 0; i_1 < this.field1551; i_1++) {
         int i_2 = this.field1549[i_1];
         this.field1549[i_1] = this.field1556[i_1];
         this.field1556[i_1] = i_2;
      }

      this.method2788();
   }

   public void method2781(int i_1) {
      int i_2 = field1570[i_1];
      int i_3 = field1588[i_1];

      for (int i_4 = 0; i_4 < this.field1558; i_4++) {
         int i_5 = i_2 * this.field1552[i_4] + i_3 * this.field1576[i_4] >> 16;
         this.field1552[i_4] = i_3 * this.field1552[i_4] - i_2 * this.field1576[i_4] >> 16;
         this.field1576[i_4] = i_5;
      }

      this.method2788();
   }

   public void method2778() {
      for (int i_1 = 0; i_1 < this.field1558; i_1++) {
         int i_2 = this.field1576[i_1];
         this.field1576[i_1] = this.field1552[i_1];
         this.field1552[i_1] = -i_2;
      }

      this.method2788();
   }

   public void method2797() {
      for (int i_1 = 0; i_1 < this.field1558; i_1++) {
         this.field1576[i_1] = -this.field1576[i_1];
         this.field1552[i_1] = -this.field1552[i_1];
      }

      this.method2788();
   }

   public void method2780() {
      for (int i_1 = 0; i_1 < this.field1558; i_1++) {
         int i_2 = this.field1552[i_1];
         this.field1552[i_1] = this.field1576[i_1];
         this.field1576[i_1] = -i_2;
      }

      this.method2788();
   }

   public final class127 applyLighting(int i_1, int i_2, int i_3, int i_4, int i_5) {
      this.method2787();
      int i_6 = (int) Math.sqrt((double) (i_5 * i_5 + i_3 * i_3 + i_4 * i_4));
      int i_7 = i_6 * i_2 >> 8;
      class127 class127_8 = new class127();
      class127_8.field1697 = new int[this.field1551];
      class127_8.field1684 = new int[this.field1551];
      class127_8.field1685 = new int[this.field1551];
      if (this.field1555 > 0 && this.field1560 != null) {
         int[] ints_9 = new int[this.field1555];

         int i_10;
         for (i_10 = 0; i_10 < this.field1551; i_10++) {
            if (this.field1560[i_10] != -1) {
               ++ints_9[this.field1560[i_10] & 0xff];
            }
         }

         class127_8.field1691 = 0;

         for (i_10 = 0; i_10 < this.field1555; i_10++) {
            if (ints_9[i_10] > 0 && this.field1565[i_10] == 0) {
               ++class127_8.field1691;
            }
         }

         class127_8.field1692 = new int[class127_8.field1691];
         class127_8.field1693 = new int[class127_8.field1691];
         class127_8.field1694 = new int[class127_8.field1691];
         i_10 = 0;

         int i_11;
         for (i_11 = 0; i_11 < this.field1555; i_11++) {
            if (ints_9[i_11] > 0 && this.field1565[i_11] == 0) {
               class127_8.field1692[i_10] = this.field1566[i_11] & 0xffff;
               class127_8.field1693[i_10] = this.field1567[i_11] & 0xffff;
               class127_8.field1694[i_10] = this.field1568[i_11] & 0xffff;
               ints_9[i_11] = i_10++;
            } else {
               ints_9[i_11] = -1;
            }
         }

         class127_8.field1688 = new byte[this.field1551];

         for (i_11 = 0; i_11 < this.field1551; i_11++) {
            if (this.field1560[i_11] != -1) {
               class127_8.field1688[i_11] = (byte) ints_9[this.field1560[i_11] & 0xff];
            } else {
               class127_8.field1688[i_11] = -1;
            }
         }
      }

      for (int i_16 = 0; i_16 < this.field1551; i_16++) {
         byte b_17;
         if (this.field1557 == null) {
            b_17 = 0;
         } else {
            b_17 = this.field1557[i_16];
         }

         byte b_18;
         if (this.field1587 == null) {
            b_18 = 0;
         } else {
            b_18 = this.field1587[i_16];
         }

         short s_12;
         if (this.field1562 == null) {
            s_12 = -1;
         } else {
            s_12 = this.field1562[i_16];
         }

         if (b_18 == -2) {
            b_17 = 3;
         }

         if (b_18 == -1) {
            b_17 = 2;
         }

         class129 class129_13;
         int i_14;
         class137 class137_19;
         if (s_12 == -1) {
            if (b_17 != 0) {
               if (b_17 == 1) {
                  class137_19 = this.field1573[i_16];
                  i_14 = (i_4 * class137_19.field1890 + i_5 * class137_19.field1888 + i_3 * class137_19.field1889) / (i_7 / 2 + i_7) + i_1;
                  class127_8.field1697[i_16] = method2792(this.field1561[i_16] & 0xffff, i_14);
                  class127_8.field1685[i_16] = -1;
               } else if (b_17 == 3) {
                  class127_8.field1697[i_16] = 128;
                  class127_8.field1685[i_16] = -1;
               } else {
                  class127_8.field1685[i_16] = -2;
               }
            } else {
               int i_15 = this.field1561[i_16] & 0xffff;
               if (this.field1581 != null && this.field1581[this.field1549[i_16]] != null) {
                  class129_13 = this.field1581[this.field1549[i_16]];
               } else {
                  class129_13 = this.field1574[this.field1549[i_16]];
               }

               i_14 = (i_4 * class129_13.field1760 + i_5 * class129_13.field1758 + i_3 * class129_13.field1759) / (i_7 * class129_13.field1761) + i_1;
               class127_8.field1697[i_16] = method2792(i_15, i_14);
               if (this.field1581 != null && this.field1581[this.field1583[i_16]] != null) {
                  class129_13 = this.field1581[this.field1583[i_16]];
               } else {
                  class129_13 = this.field1574[this.field1583[i_16]];
               }

               i_14 = (i_4 * class129_13.field1760 + i_5 * class129_13.field1758 + i_3 * class129_13.field1759) / (i_7 * class129_13.field1761) + i_1;
               class127_8.field1684[i_16] = method2792(i_15, i_14);
               if (this.field1581 != null && this.field1581[this.field1556[i_16]] != null) {
                  class129_13 = this.field1581[this.field1556[i_16]];
               } else {
                  class129_13 = this.field1574[this.field1556[i_16]];
               }

               i_14 = (i_4 * class129_13.field1760 + i_5 * class129_13.field1758 + i_3 * class129_13.field1759) / (i_7 * class129_13.field1761) + i_1;
               class127_8.field1685[i_16] = method2792(i_15, i_14);
            }
         } else if (b_17 != 0) {
            if (b_17 == 1) {
               class137_19 = this.field1573[i_16];
               i_14 = (i_4 * class137_19.field1890 + i_5 * class137_19.field1888 + i_3 * class137_19.field1889) / (i_7 / 2 + i_7) + i_1;
               class127_8.field1697[i_16] = method2818(i_14);
               class127_8.field1685[i_16] = -1;
            } else {
               class127_8.field1685[i_16] = -2;
            }
         } else {
            if (this.field1581 != null && this.field1581[this.field1549[i_16]] != null) {
               class129_13 = this.field1581[this.field1549[i_16]];
            } else {
               class129_13 = this.field1574[this.field1549[i_16]];
            }

            i_14 = (i_4 * class129_13.field1760 + i_5 * class129_13.field1758 + i_3 * class129_13.field1759) / (i_7 * class129_13.field1761) + i_1;
            class127_8.field1697[i_16] = method2818(i_14);
            if (this.field1581 != null && this.field1581[this.field1583[i_16]] != null) {
               class129_13 = this.field1581[this.field1583[i_16]];
            } else {
               class129_13 = this.field1574[this.field1583[i_16]];
            }

            i_14 = (i_4 * class129_13.field1760 + i_5 * class129_13.field1758 + i_3 * class129_13.field1759) / (i_7 * class129_13.field1761) + i_1;
            class127_8.field1684[i_16] = method2818(i_14);
            if (this.field1581 != null && this.field1581[this.field1556[i_16]] != null) {
               class129_13 = this.field1581[this.field1556[i_16]];
            } else {
               class129_13 = this.field1574[this.field1556[i_16]];
            }

            i_14 = (i_4 * class129_13.field1760 + i_5 * class129_13.field1758 + i_3 * class129_13.field1759) / (i_7 * class129_13.field1761) + i_1;
            class127_8.field1685[i_16] = method2818(i_14);
         }
      }

      this.method2777();
      class127_8.field1675 = this.field1558;
      class127_8.field1676 = this.field1576;
      class127_8.field1677 = this.field1550;
      class127_8.field1678 = this.field1552;
      class127_8.field1679 = this.field1551;
      class127_8.field1680 = this.field1549;
      class127_8.field1681 = this.field1583;
      class127_8.field1682 = this.field1556;
      class127_8.field1712 = this.field1559;
      class127_8.field1687 = this.field1587;
      class127_8.field1690 = this.field1563;
      class127_8.field1695 = this.field1571;
      class127_8.field1709 = this.field1572;
      class127_8.field1689 = this.field1562;
      return class127_8;
   }

   public Model method2776(int[][] ints_1, int i_2, int i_3, int i_4, int i_6) {
      this.method2789();
      int i_7 = i_2 + this.field1575;
      int i_8 = i_2 + this.field1564;
      int i_9 = i_4 + this.field1554;
      int i_10 = i_4 + this.field1582;
      if (i_7 >= 0 && i_8 + 128 >> 7 < ints_1.length && i_9 >= 0 && i_10 + 128 >> 7 < ints_1[0].length) {
         i_7 >>= 7;
         i_8 = i_8 + 127 >> 7;
         i_9 >>= 7;
         i_10 = i_10 + 127 >> 7;
         if (i_3 == ints_1[i_7][i_9] && i_3 == ints_1[i_8][i_9] && i_3 == ints_1[i_7][i_10] && i_3 == ints_1[i_8][i_10]) {
            return this;
         } else {
            Model model_11 = new Model();
            model_11.field1558 = this.field1558;
            model_11.field1551 = this.field1551;
            model_11.field1555 = this.field1555;
            model_11.field1576 = this.field1576;
            model_11.field1552 = this.field1552;
            model_11.field1549 = this.field1549;
            model_11.field1583 = this.field1583;
            model_11.field1556 = this.field1556;
            model_11.field1557 = this.field1557;
            model_11.field1559 = this.field1559;
            model_11.field1587 = this.field1587;
            model_11.field1560 = this.field1560;
            model_11.field1561 = this.field1561;
            model_11.field1562 = this.field1562;
            model_11.field1563 = this.field1563;
            model_11.field1565 = this.field1565;
            model_11.field1566 = this.field1566;
            model_11.field1567 = this.field1567;
            model_11.field1568 = this.field1568;
            model_11.field1569 = this.field1569;
            model_11.field1553 = this.field1553;
            model_11.field1571 = this.field1571;
            model_11.field1572 = this.field1572;
            model_11.field1580 = this.field1580;
            model_11.field1577 = this.field1577;
            model_11.field1550 = new int[model_11.field1558];
            int i_12;
            int i_13;
            int i_14;
            int i_15;
            int i_16;
            int i_17;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            if (i_6 == 0) {
               for (i_12 = 0; i_12 < model_11.field1558; i_12++) {
                  i_13 = i_2 + this.field1576[i_12];
                  i_14 = i_4 + this.field1552[i_12];
                  i_15 = i_13 & 0x7f;
                  i_16 = i_14 & 0x7f;
                  i_17 = i_13 >> 7;
                  i_18 = i_14 >> 7;
                  i_19 = ints_1[i_17][i_18] * (128 - i_15) + ints_1[i_17 + 1][i_18] * i_15 >> 7;
                  i_20 = ints_1[i_17][i_18 + 1] * (128 - i_15) + i_15 * ints_1[i_17 + 1][i_18 + 1] >> 7;
                  i_21 = i_19 * (128 - i_16) + i_20 * i_16 >> 7;
                  model_11.field1550[i_12] = i_21 + this.field1550[i_12] - i_3;
               }
            } else {
               for (i_12 = 0; i_12 < model_11.field1558; i_12++) {
                  i_13 = (-this.field1550[i_12] << 16) / super.field1873;
                  if (i_13 < i_6) {
                     i_14 = i_2 + this.field1576[i_12];
                     i_15 = i_4 + this.field1552[i_12];
                     i_16 = i_14 & 0x7f;
                     i_17 = i_15 & 0x7f;
                     i_18 = i_14 >> 7;
                     i_19 = i_15 >> 7;
                     i_20 = ints_1[i_18][i_19] * (128 - i_16) + ints_1[i_18 + 1][i_19] * i_16 >> 7;
                     i_21 = ints_1[i_18][i_19 + 1] * (128 - i_16) + i_16 * ints_1[i_18 + 1][i_19 + 1] >> 7;
                     int i_22 = i_20 * (128 - i_17) + i_21 * i_17 >> 7;
                     model_11.field1550[i_12] = (i_6 - i_13) * (i_22 - i_3) / i_6 + this.field1550[i_12];
                  }
               }
            }

            model_11.method2788();
            return model_11;
         }
      } else {
         return this;
      }
   }

   final int method2816(Model model_1, int i_2) {
      int i_3 = -1;
      int i_4 = model_1.field1576[i_2];
      int i_5 = model_1.field1550[i_2];
      int i_6 = model_1.field1552[i_2];

      for (int i_7 = 0; i_7 < this.field1558; i_7++) {
         if (i_4 == this.field1576[i_7] && i_5 == this.field1550[i_7] && i_6 == this.field1552[i_7]) {
            i_3 = i_7;
            break;
         }
      }

      if (i_3 == -1) {
         this.field1576[this.field1558] = i_4;
         this.field1550[this.field1558] = i_5;
         this.field1552[this.field1558] = i_6;
         if (model_1.field1569 != null) {
            this.field1569[this.field1558] = model_1.field1569[i_2];
         }

         i_3 = this.field1558++;
      }

      return i_3;
   }

   static final int method2818(int i_0) {
      if (i_0 < 2) {
         i_0 = 2;
      } else if (i_0 > 126) {
         i_0 = 126;
      }

      return i_0;
   }

   static final int method2792(int i_0, int i_1) {
      i_1 = (i_0 & 0x7f) * i_1 >> 7;
      if (i_1 < 2) {
         i_1 = 2;
      } else if (i_1 > 126) {
         i_1 = 126;
      }

      return (i_0 & 0xff80) + i_1;
   }

}
