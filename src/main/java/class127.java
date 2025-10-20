public class class127 extends Entity {

   static class127 field1703 = new class127();
   static byte[] field1705 = new byte[1];
   static class127 field1708 = new class127();
   static byte[] field1722 = new byte[1];
   static boolean[] field1710 = new boolean[4700];
   static boolean[] field1723 = new boolean[4700];
   static int[] field1719 = new int[4700];
   static int[] field1713 = new int[4700];
   static int[] field1714 = new int[4700];
   static int[] field1715 = new int[4700];
   static int[] field1716 = new int[4700];
   static int[] field1717 = new int[4700];
   static int[] field1711 = new int[1600];
   static int[][] field1720 = new int[1600][512];
   static int[] field1721 = new int[12];
   static int[][] field1729 = new int[12][2000];
   static int[] field1739 = new int[2000];
   static int[] field1724 = new int[2000];
   static int[] field1725 = new int[12];
   static int[] field1726 = new int[10];
   static int[] field1699 = new int[10];
   static int[] field1728 = new int[10];
   static boolean field1732 = true;
   static int[] field1683;
   static int[] field1736;
   static int[] field1737;
   static int[] field1738;
   int field1675 = 0;
   int field1679 = 0;
   byte field1690 = 0;
   int field1691 = 0;
   public boolean field1730 = false;
   int field1671 = -1;
   int field1707 = -1;
   int field1674 = -1;
   int[] field1676;
   int[] field1677;
   int[] field1678;
   int[] field1680;
   int[] field1681;
   int[] field1682;
   int[] field1697;
   int[] field1684;
   int[] field1685;
   byte[] field1712;
   byte[] field1687;
   short[] field1689;
   byte[] field1688;
   int[] field1692;
   int[] field1693;
   int[] field1694;
   int field1698;
   int field1706;
   int field1673;
   int field1702;
   int field1701;
   static int field1727;
   static int field1672;
   static int field1731;
   int[][] field1695;
   int[][] field1709;
   int field1734;
   int field1704;
   int field1700;

   static {
      field1683 = Rasterizer3D.sine;
      field1736 = Rasterizer3D.cosine;
      field1737 = Rasterizer3D.field1783;
      field1738 = Rasterizer3D.field1786;
   }

   class127() {
   }

   public class127(class127[] arr_1, int i_2) {
      boolean bool_3 = false;
      boolean bool_4 = false;
      boolean bool_5 = false;
      boolean bool_6 = false;
      this.field1675 = 0;
      this.field1679 = 0;
      this.field1691 = 0;
      this.field1690 = -1;

      int i_7;
      class127 class127_8;
      for (i_7 = 0; i_7 < i_2; i_7++) {
         class127_8 = arr_1[i_7];
         if (class127_8 != null) {
            this.field1675 += class127_8.field1675;
            this.field1679 += class127_8.field1679;
            this.field1691 += class127_8.field1691;
            if (class127_8.field1712 != null) {
               bool_3 = true;
            } else {
               if (this.field1690 == -1) {
                  this.field1690 = class127_8.field1690;
               }

               if (this.field1690 != class127_8.field1690) {
                  bool_3 = true;
               }
            }

            bool_4 |= class127_8.field1687 != null;
            bool_5 |= class127_8.field1689 != null;
            bool_6 |= class127_8.field1688 != null;
         }
      }

      this.field1676 = new int[this.field1675];
      this.field1677 = new int[this.field1675];
      this.field1678 = new int[this.field1675];
      this.field1680 = new int[this.field1679];
      this.field1681 = new int[this.field1679];
      this.field1682 = new int[this.field1679];
      this.field1697 = new int[this.field1679];
      this.field1684 = new int[this.field1679];
      this.field1685 = new int[this.field1679];
      if (bool_3) {
         this.field1712 = new byte[this.field1679];
      }

      if (bool_4) {
         this.field1687 = new byte[this.field1679];
      }

      if (bool_5) {
         this.field1689 = new short[this.field1679];
      }

      if (bool_6) {
         this.field1688 = new byte[this.field1679];
      }

      if (this.field1691 > 0) {
         this.field1692 = new int[this.field1691];
         this.field1693 = new int[this.field1691];
         this.field1694 = new int[this.field1691];
      }

      this.field1675 = 0;
      this.field1679 = 0;
      this.field1691 = 0;

      for (i_7 = 0; i_7 < i_2; i_7++) {
         class127_8 = arr_1[i_7];
         if (class127_8 != null) {
            int i_9;
            for (i_9 = 0; i_9 < class127_8.field1679; i_9++) {
               this.field1680[this.field1679] = this.field1675 + class127_8.field1680[i_9];
               this.field1681[this.field1679] = this.field1675 + class127_8.field1681[i_9];
               this.field1682[this.field1679] = this.field1675 + class127_8.field1682[i_9];
               this.field1697[this.field1679] = class127_8.field1697[i_9];
               this.field1684[this.field1679] = class127_8.field1684[i_9];
               this.field1685[this.field1679] = class127_8.field1685[i_9];
               if (bool_3) {
                  if (class127_8.field1712 != null) {
                     this.field1712[this.field1679] = class127_8.field1712[i_9];
                  } else {
                     this.field1712[this.field1679] = class127_8.field1690;
                  }
               }

               if (bool_4 && class127_8.field1687 != null) {
                  this.field1687[this.field1679] = class127_8.field1687[i_9];
               }

               if (bool_5) {
                  if (class127_8.field1689 != null) {
                     this.field1689[this.field1679] = class127_8.field1689[i_9];
                  } else {
                     this.field1689[this.field1679] = -1;
                  }
               }

               if (bool_6) {
                  if (class127_8.field1688 != null && class127_8.field1688[i_9] != -1) {
                     this.field1688[this.field1679] = (byte)(this.field1691 + class127_8.field1688[i_9]);
                  } else {
                     this.field1688[this.field1679] = -1;
                  }
               }

               ++this.field1679;
            }

            for (i_9 = 0; i_9 < class127_8.field1691; i_9++) {
               this.field1692[this.field1691] = this.field1675 + class127_8.field1692[i_9];
               this.field1693[this.field1691] = this.field1675 + class127_8.field1693[i_9];
               this.field1694[this.field1691] = this.field1675 + class127_8.field1694[i_9];
               ++this.field1691;
            }

            for (i_9 = 0; i_9 < class127_8.field1675; i_9++) {
               this.field1676[this.field1675] = class127_8.field1676[i_9];
               this.field1677[this.field1675] = class127_8.field1677[i_9];
               this.field1678[this.field1675] = class127_8.field1678[i_9];
               ++this.field1675;
            }
         }
      }

   }

   public void method2899() {
      if (this.field1698 != 1) {
         this.field1698 = 1;
         super.height = 0;
         this.field1706 = 0;
         this.field1673 = 0;

         for (int i_1 = 0; i_1 < this.field1675; i_1++) {
            int i_2 = this.field1676[i_1];
            int i_3 = this.field1677[i_1];
            int i_4 = this.field1678[i_1];
            if (-i_3 > super.height) {
               super.height = -i_3;
            }

            if (i_3 > this.field1706) {
               this.field1706 = i_3;
            }

            int i_5 = i_2 * i_2 + i_4 * i_4;
            if (i_5 > this.field1673) {
               this.field1673 = i_5;
            }
         }

         this.field1673 = (int)(Math.sqrt((double)this.field1673) + 0.99D);
         this.field1702 = (int)(Math.sqrt((double)(this.field1673 * this.field1673 + super.height * super.height)) + 0.99D);
         this.field1701 = this.field1702 + (int)(Math.sqrt((double)(this.field1673 * this.field1673 + this.field1706 * this.field1706)) + 0.99D);
      }
   }

   public void method2888(class138 class138_1, int i_2) {
      if (this.field1695 != null) {
         if (i_2 != -1) {
            class125 class125_3 = class138_1.field1893[i_2];
            class132 class132_4 = class125_3.field1634;
            field1727 = 0;
            field1672 = 0;
            field1731 = 0;

            for (int i_5 = 0; i_5 < class125_3.field1637; i_5++) {
               int i_6 = class125_3.field1640[i_5];
               this.method2868(class132_4.field1798[i_6], class132_4.field1796[i_6], class125_3.field1641[i_5], class125_3.field1642[i_5], class125_3.field1643[i_5]);
            }

            this.method2865();
         }
      }
   }

   void method2865() {
      this.field1698 = 0;
      this.field1671 = -1;
   }

   final void method2880(int i_1) {
      int i_2 = Rasterizer3D.field1774;
      int i_3 = Rasterizer3D.field1775;
      int i_4 = 0;
      int i_5 = this.field1680[i_1];
      int i_6 = this.field1681[i_1];
      int i_7 = this.field1682[i_1];
      int i_8 = field1717[i_5];
      int i_9 = field1717[i_6];
      int i_10 = field1717[i_7];
      if (this.field1687 == null) {
         Rasterizer3D.field1766 = 0;
      } else {
         Rasterizer3D.field1766 = this.field1687[i_1] & 0xff;
      }

      int i_11;
      int i_12;
      int i_13;
      int i_14;
      if (i_8 >= 50) {
         field1726[i_4] = field1719[i_5];
         field1699[i_4] = field1713[i_5];
         field1728[i_4++] = this.field1697[i_1];
      } else {
         i_11 = field1715[i_5];
         i_12 = field1716[i_5];
         i_13 = this.field1697[i_1];
         if (i_10 >= 50) {
            i_14 = field1738[i_10 - i_8] * (50 - i_8);
            field1726[i_4] = i_2 + Rasterizer3D.field1773 * (i_11 + ((field1715[i_7] - i_11) * i_14 >> 16)) / 50;
            field1699[i_4] = i_3 + Rasterizer3D.field1773 * (i_12 + ((field1716[i_7] - i_12) * i_14 >> 16)) / 50;
            field1728[i_4++] = i_13 + ((this.field1685[i_1] - i_13) * i_14 >> 16);
         }

         if (i_9 >= 50) {
            i_14 = field1738[i_9 - i_8] * (50 - i_8);
            field1726[i_4] = i_2 + Rasterizer3D.field1773 * (i_11 + ((field1715[i_6] - i_11) * i_14 >> 16)) / 50;
            field1699[i_4] = i_3 + Rasterizer3D.field1773 * (i_12 + ((field1716[i_6] - i_12) * i_14 >> 16)) / 50;
            field1728[i_4++] = i_13 + ((this.field1684[i_1] - i_13) * i_14 >> 16);
         }
      }

      if (i_9 >= 50) {
         field1726[i_4] = field1719[i_6];
         field1699[i_4] = field1713[i_6];
         field1728[i_4++] = this.field1684[i_1];
      } else {
         i_11 = field1715[i_6];
         i_12 = field1716[i_6];
         i_13 = this.field1684[i_1];
         if (i_8 >= 50) {
            i_14 = field1738[i_8 - i_9] * (50 - i_9);
            field1726[i_4] = i_2 + Rasterizer3D.field1773 * (i_11 + ((field1715[i_5] - i_11) * i_14 >> 16)) / 50;
            field1699[i_4] = i_3 + Rasterizer3D.field1773 * (i_12 + ((field1716[i_5] - i_12) * i_14 >> 16)) / 50;
            field1728[i_4++] = i_13 + ((this.field1697[i_1] - i_13) * i_14 >> 16);
         }

         if (i_10 >= 50) {
            i_14 = field1738[i_10 - i_9] * (50 - i_9);
            field1726[i_4] = i_2 + Rasterizer3D.field1773 * (i_11 + ((field1715[i_7] - i_11) * i_14 >> 16)) / 50;
            field1699[i_4] = i_3 + Rasterizer3D.field1773 * (i_12 + ((field1716[i_7] - i_12) * i_14 >> 16)) / 50;
            field1728[i_4++] = i_13 + ((this.field1685[i_1] - i_13) * i_14 >> 16);
         }
      }

      if (i_10 >= 50) {
         field1726[i_4] = field1719[i_7];
         field1699[i_4] = field1713[i_7];
         field1728[i_4++] = this.field1685[i_1];
      } else {
         i_11 = field1715[i_7];
         i_12 = field1716[i_7];
         i_13 = this.field1685[i_1];
         if (i_9 >= 50) {
            i_14 = field1738[i_9 - i_10] * (50 - i_10);
            field1726[i_4] = i_2 + Rasterizer3D.field1773 * (i_11 + ((field1715[i_6] - i_11) * i_14 >> 16)) / 50;
            field1699[i_4] = i_3 + Rasterizer3D.field1773 * (i_12 + ((field1716[i_6] - i_12) * i_14 >> 16)) / 50;
            field1728[i_4++] = i_13 + ((this.field1684[i_1] - i_13) * i_14 >> 16);
         }

         if (i_8 >= 50) {
            i_14 = field1738[i_8 - i_10] * (50 - i_10);
            field1726[i_4] = i_2 + Rasterizer3D.field1773 * (i_11 + ((field1715[i_5] - i_11) * i_14 >> 16)) / 50;
            field1699[i_4] = i_3 + Rasterizer3D.field1773 * (i_12 + ((field1716[i_5] - i_12) * i_14 >> 16)) / 50;
            field1728[i_4++] = i_13 + ((this.field1697[i_1] - i_13) * i_14 >> 16);
         }
      }

      i_11 = field1726[0];
      i_12 = field1726[1];
      i_13 = field1726[2];
      i_14 = field1699[0];
      int i_15 = field1699[1];
      int i_16 = field1699[2];
      Rasterizer3D.field1763 = false;
      int i_17;
      int i_18;
      int i_19;
      int i_20;
      if (i_4 == 3) {
         if (i_11 < 0 || i_12 < 0 || i_13 < 0 || i_11 > Rasterizer3D.field1788 || i_12 > Rasterizer3D.field1788 || i_13 > Rasterizer3D.field1788) {
            Rasterizer3D.field1763 = true;
         }

         if (this.field1689 != null && this.field1689[i_1] != -1) {
            if (this.field1688 != null && this.field1688[i_1] != -1) {
               i_20 = this.field1688[i_1] & 0xff;
               i_17 = this.field1692[i_20];
               i_18 = this.field1693[i_20];
               i_19 = this.field1694[i_20];
            } else {
               i_17 = i_5;
               i_18 = i_6;
               i_19 = i_7;
            }

            if (this.field1685[i_1] == -1) {
               Rasterizer3D.method2986(i_14, i_15, i_16, i_11, i_12, i_13, this.field1697[i_1], this.field1697[i_1], this.field1697[i_1], field1715[i_17], field1715[i_18], field1715[i_19], field1716[i_17], field1716[i_18], field1716[i_19], field1717[i_17], field1717[i_18], field1717[i_19], this.field1689[i_1]);
            } else {
               Rasterizer3D.method2986(i_14, i_15, i_16, i_11, i_12, i_13, field1728[0], field1728[1], field1728[2], field1715[i_17], field1715[i_18], field1715[i_19], field1716[i_17], field1716[i_18], field1716[i_19], field1717[i_17], field1717[i_18], field1717[i_19], this.field1689[i_1]);
            }
         } else if (this.field1685[i_1] == -1) {
            Rasterizer3D.method3007(i_14, i_15, i_16, i_11, i_12, i_13, field1737[this.field1697[i_1]]);
         } else {
            Rasterizer3D.method3020(i_14, i_15, i_16, i_11, i_12, i_13, field1728[0], field1728[1], field1728[2]);
         }
      }

      if (i_4 == 4) {
         if (i_11 < 0 || i_12 < 0 || i_13 < 0 || i_11 > Rasterizer3D.field1788 || i_12 > Rasterizer3D.field1788 || i_13 > Rasterizer3D.field1788 || field1726[3] < 0 || field1726[3] > Rasterizer3D.field1788) {
            Rasterizer3D.field1763 = true;
         }

         if (this.field1689 != null && this.field1689[i_1] != -1) {
            if (this.field1688 != null && this.field1688[i_1] != -1) {
               i_20 = this.field1688[i_1] & 0xff;
               i_17 = this.field1692[i_20];
               i_18 = this.field1693[i_20];
               i_19 = this.field1694[i_20];
            } else {
               i_17 = i_5;
               i_18 = i_6;
               i_19 = i_7;
            }

            short s_21 = this.field1689[i_1];
            if (this.field1685[i_1] == -1) {
               Rasterizer3D.method2986(i_14, i_15, i_16, i_11, i_12, i_13, this.field1697[i_1], this.field1697[i_1], this.field1697[i_1], field1715[i_17], field1715[i_18], field1715[i_19], field1716[i_17], field1716[i_18], field1716[i_19], field1717[i_17], field1717[i_18], field1717[i_19], s_21);
               Rasterizer3D.method2986(i_14, i_16, field1699[3], i_11, i_13, field1726[3], this.field1697[i_1], this.field1697[i_1], this.field1697[i_1], field1715[i_17], field1715[i_18], field1715[i_19], field1716[i_17], field1716[i_18], field1716[i_19], field1717[i_17], field1717[i_18], field1717[i_19], s_21);
            } else {
               Rasterizer3D.method2986(i_14, i_15, i_16, i_11, i_12, i_13, field1728[0], field1728[1], field1728[2], field1715[i_17], field1715[i_18], field1715[i_19], field1716[i_17], field1716[i_18], field1716[i_19], field1717[i_17], field1717[i_18], field1717[i_19], s_21);
               Rasterizer3D.method2986(i_14, i_16, field1699[3], i_11, i_13, field1726[3], field1728[0], field1728[2], field1728[3], field1715[i_17], field1715[i_18], field1715[i_19], field1716[i_17], field1716[i_18], field1716[i_19], field1717[i_17], field1717[i_18], field1717[i_19], s_21);
            }
         } else if (this.field1685[i_1] == -1) {
            i_17 = field1737[this.field1697[i_1]];
            Rasterizer3D.method3007(i_14, i_15, i_16, i_11, i_12, i_13, i_17);
            Rasterizer3D.method3007(i_14, i_16, field1699[3], i_11, i_13, field1726[3], i_17);
         } else {
            Rasterizer3D.method3020(i_14, i_15, i_16, i_11, i_12, i_13, field1728[0], field1728[1], field1728[2]);
            Rasterizer3D.method3020(i_14, i_16, field1699[3], i_11, i_13, field1726[3], field1728[0], field1728[2], field1728[3]);
         }
      }

   }

   class127 method2930(boolean bool_1, class127 class127_2, byte[] bytes_3) {
      class127_2.field1675 = this.field1675;
      class127_2.field1679 = this.field1679;
      class127_2.field1691 = this.field1691;
      if (class127_2.field1676 == null || class127_2.field1676.length < this.field1675) {
         class127_2.field1676 = new int[this.field1675 + 100];
         class127_2.field1677 = new int[this.field1675 + 100];
         class127_2.field1678 = new int[this.field1675 + 100];
      }

      int i_4;
      for (i_4 = 0; i_4 < this.field1675; i_4++) {
         class127_2.field1676[i_4] = this.field1676[i_4];
         class127_2.field1677[i_4] = this.field1677[i_4];
         class127_2.field1678[i_4] = this.field1678[i_4];
      }

      if (bool_1) {
         class127_2.field1687 = this.field1687;
      } else {
         class127_2.field1687 = bytes_3;
         if (this.field1687 == null) {
            for (i_4 = 0; i_4 < this.field1679; i_4++) {
               class127_2.field1687[i_4] = 0;
            }
         } else {
            for (i_4 = 0; i_4 < this.field1679; i_4++) {
               class127_2.field1687[i_4] = this.field1687[i_4];
            }
         }
      }

      class127_2.field1680 = this.field1680;
      class127_2.field1681 = this.field1681;
      class127_2.field1682 = this.field1682;
      class127_2.field1697 = this.field1697;
      class127_2.field1684 = this.field1684;
      class127_2.field1685 = this.field1685;
      class127_2.field1712 = this.field1712;
      class127_2.field1688 = this.field1688;
      class127_2.field1689 = this.field1689;
      class127_2.field1690 = this.field1690;
      class127_2.field1692 = this.field1692;
      class127_2.field1693 = this.field1693;
      class127_2.field1694 = this.field1694;
      class127_2.field1695 = this.field1695;
      class127_2.field1709 = this.field1709;
      class127_2.field1730 = this.field1730;
      class127_2.method2865();
      return class127_2;
   }

   void method2861(int i_1) {
      if (this.field1671 == -1) {
         int i_2 = 0;
         int i_3 = 0;
         int i_4 = 0;
         int i_5 = 0;
         int i_6 = 0;
         int i_7 = 0;
         int i_8 = field1736[i_1];
         int i_9 = field1683[i_1];

         for (int i_10 = 0; i_10 < this.field1675; i_10++) {
            int i_11 = Rasterizer3D.method3040(this.field1676[i_10], this.field1678[i_10], i_8, i_9);
            int i_12 = this.field1677[i_10];
            int i_13 = Rasterizer3D.method3061(this.field1676[i_10], this.field1678[i_10], i_8, i_9);
            if (i_11 < i_2) {
               i_2 = i_11;
            }

            if (i_11 > i_5) {
               i_5 = i_11;
            }

            if (i_12 < i_3) {
               i_3 = i_12;
            }

            if (i_12 > i_6) {
               i_6 = i_12;
            }

            if (i_13 < i_4) {
               i_4 = i_13;
            }

            if (i_13 > i_7) {
               i_7 = i_13;
            }
         }

         this.field1734 = (i_5 + i_2) / 2;
         this.field1704 = (i_6 + i_3) / 2;
         this.field1700 = (i_7 + i_4) / 2;
         this.field1671 = (i_5 - i_2 + 1) / 2;
         this.field1707 = (i_6 - i_3 + 1) / 2;
         this.field1674 = (i_7 - i_4 + 1) / 2;
         if (this.field1671 < 32) {
            this.field1671 = 32;
         }

         if (this.field1674 < 32) {
            this.field1674 = 32;
         }

         if (this.field1730) {
            this.field1671 += 8;
            this.field1674 += 8;
         }

      }
   }

   public class127 method2859(boolean bool_1) {
      if (!bool_1 && field1705.length < this.field1679) {
         field1705 = new byte[this.field1679 + 100];
      }

      return this.method2930(bool_1, field1703, field1705);
   }

   void method2910() {
      if (this.field1698 != 2) {
         this.field1698 = 2;
         this.field1673 = 0;

         for (int i_1 = 0; i_1 < this.field1675; i_1++) {
            int i_2 = this.field1676[i_1];
            int i_3 = this.field1677[i_1];
            int i_4 = this.field1678[i_1];
            int i_5 = i_2 * i_2 + i_4 * i_4 + i_3 * i_3;
            if (i_5 > this.field1673) {
               this.field1673 = i_5;
            }
         }

         this.field1673 = (int)(Math.sqrt((double)this.field1673) + 0.99D);
         this.field1702 = this.field1673;
         this.field1701 = this.field1673 + this.field1673;
      }
   }

   public class127 method2860(boolean bool_1) {
      if (!bool_1 && field1722.length < this.field1679) {
         field1722 = new byte[this.field1679 + 100];
      }

      return this.method2930(bool_1, field1708, field1722);
   }

   public void method2863(int i_1) {
      int i_2 = field1683[i_1];
      int i_3 = field1736[i_1];

      for (int i_4 = 0; i_4 < this.field1675; i_4++) {
         int i_5 = i_3 * this.field1677[i_4] - i_2 * this.field1678[i_4] >> 16;
         this.field1678[i_4] = i_2 * this.field1677[i_4] + i_3 * this.field1678[i_4] >> 16;
         this.field1677[i_4] = i_5;
      }

      this.method2865();
   }

   public class127 method2858(int[][] ints_1, int i_2, int i_3, int i_4, boolean bool_5, int i_6) {
      this.method2899();
      int i_7 = i_2 - this.field1673;
      int i_8 = i_2 + this.field1673;
      int i_9 = i_4 - this.field1673;
      int i_10 = i_4 + this.field1673;
      if (i_7 >= 0 && i_8 + 128 >> 7 < ints_1.length && i_9 >= 0 && i_10 + 128 >> 7 < ints_1[0].length) {
         i_7 >>= 7;
         i_8 = i_8 + 127 >> 7;
         i_9 >>= 7;
         i_10 = i_10 + 127 >> 7;
         if (i_3 == ints_1[i_7][i_9] && i_3 == ints_1[i_8][i_9] && i_3 == ints_1[i_7][i_10] && i_3 == ints_1[i_8][i_10]) {
            return this;
         } else {
            class127 class127_11;
            if (bool_5) {
               class127_11 = new class127();
               class127_11.field1675 = this.field1675;
               class127_11.field1679 = this.field1679;
               class127_11.field1691 = this.field1691;
               class127_11.field1676 = this.field1676;
               class127_11.field1678 = this.field1678;
               class127_11.field1680 = this.field1680;
               class127_11.field1681 = this.field1681;
               class127_11.field1682 = this.field1682;
               class127_11.field1697 = this.field1697;
               class127_11.field1684 = this.field1684;
               class127_11.field1685 = this.field1685;
               class127_11.field1712 = this.field1712;
               class127_11.field1687 = this.field1687;
               class127_11.field1688 = this.field1688;
               class127_11.field1689 = this.field1689;
               class127_11.field1690 = this.field1690;
               class127_11.field1692 = this.field1692;
               class127_11.field1693 = this.field1693;
               class127_11.field1694 = this.field1694;
               class127_11.field1695 = this.field1695;
               class127_11.field1709 = this.field1709;
               class127_11.field1730 = this.field1730;
               class127_11.field1677 = new int[class127_11.field1675];
            } else {
               class127_11 = this;
            }

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
               for (i_12 = 0; i_12 < class127_11.field1675; i_12++) {
                  i_13 = i_2 + this.field1676[i_12];
                  i_14 = i_4 + this.field1678[i_12];
                  i_15 = i_13 & 0x7f;
                  i_16 = i_14 & 0x7f;
                  i_17 = i_13 >> 7;
                  i_18 = i_14 >> 7;
                  i_19 = ints_1[i_17][i_18] * (128 - i_15) + ints_1[i_17 + 1][i_18] * i_15 >> 7;
                  i_20 = ints_1[i_17][i_18 + 1] * (128 - i_15) + i_15 * ints_1[i_17 + 1][i_18 + 1] >> 7;
                  i_21 = i_19 * (128 - i_16) + i_20 * i_16 >> 7;
                  class127_11.field1677[i_12] = i_21 + this.field1677[i_12] - i_3;
               }
            } else {
               for (i_12 = 0; i_12 < class127_11.field1675; i_12++) {
                  i_13 = (-this.field1677[i_12] << 16) / super.height;
                  if (i_13 < i_6) {
                     i_14 = i_2 + this.field1676[i_12];
                     i_15 = i_4 + this.field1678[i_12];
                     i_16 = i_14 & 0x7f;
                     i_17 = i_15 & 0x7f;
                     i_18 = i_14 >> 7;
                     i_19 = i_15 >> 7;
                     i_20 = ints_1[i_18][i_19] * (128 - i_16) + ints_1[i_18 + 1][i_19] * i_16 >> 7;
                     i_21 = ints_1[i_18][i_19 + 1] * (128 - i_16) + i_16 * ints_1[i_18 + 1][i_19 + 1] >> 7;
                     int i_22 = i_20 * (128 - i_17) + i_21 * i_17 >> 7;
                     class127_11.field1677[i_12] = (i_6 - i_13) * (i_22 - i_3) / i_6 + this.field1677[i_12];
                  }
               }
            }

            class127_11.method2865();
            return class127_11;
         }
      } else {
         return this;
      }
   }

   void vmethod3258(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, long long_9) {
      field1711[0] = -1;
      if (this.field1698 != 1) {
         this.method2899();
      }

      this.method2861(i_1);
      int i_11 = i_5 * i_8 - i_4 * i_6 >> 16;
      int i_12 = i_2 * i_7 + i_3 * i_11 >> 16;
      int i_13 = i_3 * this.field1673 >> 16;
      int i_14 = i_12 + i_13;
      if (i_14 > 50 && i_12 < 3500) {
         int i_15 = i_8 * i_4 + i_5 * i_6 >> 16;
         int i_16 = (i_15 - this.field1673) * Rasterizer3D.field1773;
         if (i_16 / i_14 < Rasterizer3D.field1779) {
            int i_17 = (i_15 + this.field1673) * Rasterizer3D.field1773;
            if (i_17 / i_14 > Rasterizer3D.field1778) {
               int i_18 = i_3 * i_7 - i_11 * i_2 >> 16;
               int i_19 = i_2 * this.field1673 >> 16;
               int i_20 = (i_18 + i_19) * Rasterizer3D.field1773;
               if (i_20 / i_14 > Rasterizer3D.field1780) {
                  int i_21 = (i_3 * super.height >> 16) + i_19;
                  int i_22 = (i_18 - i_21) * Rasterizer3D.field1773;
                  if (i_22 / i_14 < Rasterizer3D.field1777) {
                     int i_23 = i_13 + (i_2 * super.height >> 16);
                     boolean bool_24 = false;
                     boolean bool_25 = false;
                     if (i_12 - i_23 <= 50) {
                        bool_25 = true;
                     }

                     boolean bool_26 = bool_25 || this.field1691 > 0;
                     int i_27 = class128.field1742;
                     int i_29 = class128.field1743;
                     boolean bool_31 = class128.field1753;
                     boolean bool_34 = long_9 != 0L;
                     boolean bool_35;
                     if (bool_34) {
                        bool_35 = (int)(long_9 >>> 16 & 0x1L) == 1;
                        bool_34 = !bool_35;
                     }

                     bool_35 = false;
                     int i_37;
                     int i_38;
                     int i_39;
                     if (bool_34 && bool_31) {
                        boolean bool_36 = false;
                        if (field1732) {
                           bool_36 = class138.method3275(this, i_6, i_7, i_8);
                        } else {
                           i_37 = i_12 - i_13;
                           if (i_37 <= 50) {
                              i_37 = 50;
                           }

                           if (i_15 > 0) {
                              i_16 /= i_14;
                              i_17 /= i_37;
                           } else {
                              i_17 /= i_14;
                              i_16 /= i_37;
                           }

                           if (i_18 > 0) {
                              i_22 /= i_14;
                              i_20 /= i_37;
                           } else {
                              i_20 /= i_14;
                              i_22 /= i_37;
                           }

                           i_38 = i_27 - Rasterizer3D.field1774;
                           i_39 = i_29 - Rasterizer3D.field1775;
                           if (i_38 > i_16 && i_38 < i_17 && i_39 > i_22 && i_39 < i_20) {
                              bool_36 = true;
                           }
                        }

                        if (bool_36) {
                           if (this.field1730) {
                              class128.field1750[++class128.field1748 - 1] = long_9;
                           } else {
                              bool_35 = true;
                           }
                        }
                     }

                     int i_49 = Rasterizer3D.field1774;
                     i_37 = Rasterizer3D.field1775;
                     i_38 = 0;
                     i_39 = 0;
                     if (i_1 != 0) {
                        i_38 = field1683[i_1];
                        i_39 = field1736[i_1];
                     }

                     for (int i_40 = 0; i_40 < this.field1675; i_40++) {
                        int i_41 = this.field1676[i_40];
                        int i_42 = this.field1677[i_40];
                        int i_43 = this.field1678[i_40];
                        int i_44;
                        if (i_1 != 0) {
                           i_44 = i_43 * i_38 + i_41 * i_39 >> 16;
                           i_43 = i_43 * i_39 - i_41 * i_38 >> 16;
                           i_41 = i_44;
                        }

                        i_41 += i_6;
                        i_42 += i_7;
                        i_43 += i_8;
                        i_44 = i_43 * i_4 + i_5 * i_41 >> 16;
                        i_43 = i_5 * i_43 - i_41 * i_4 >> 16;
                        i_41 = i_44;
                        i_44 = i_3 * i_42 - i_43 * i_2 >> 16;
                        i_43 = i_42 * i_2 + i_3 * i_43 >> 16;
                        field1714[i_40] = i_43 - i_12;
                        if (i_43 >= 50) {
                           field1719[i_40] = i_41 * Rasterizer3D.field1773 / i_43 + i_49;
                           field1713[i_40] = i_44 * Rasterizer3D.field1773 / i_43 + i_37;
                        } else {
                           field1719[i_40] = -5000;
                           bool_24 = true;
                        }

                        if (bool_26) {
                           field1715[i_40] = i_41;
                           field1716[i_40] = i_44;
                           field1717[i_40] = i_43;
                        }
                     }

                     try {
                        this.method2878(bool_24, bool_35, this.field1730, long_9);
                     } catch (Exception exception_48) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   public void method2871() {
      for (int i_1 = 0; i_1 < this.field1675; i_1++) {
         int i_2 = this.field1678[i_1];
         this.field1678[i_1] = this.field1676[i_1];
         this.field1676[i_1] = -i_2;
      }

      this.method2865();
   }

   public void method2944(int i_1, int i_2, int i_3) {
      for (int i_4 = 0; i_4 < this.field1675; i_4++) {
         this.field1676[i_4] = this.field1676[i_4] * i_1 / 128;
         this.field1677[i_4] = i_2 * this.field1677[i_4] / 128;
         this.field1678[i_4] = i_3 * this.field1678[i_4] / 128;
      }

      this.method2865();
   }

   public void method2870() {
      for (int i_1 = 0; i_1 < this.field1675; i_1++) {
         this.field1676[i_1] = -this.field1676[i_1];
         this.field1678[i_1] = -this.field1678[i_1];
      }

      this.method2865();
   }

   public void method2869() {
      for (int i_1 = 0; i_1 < this.field1675; i_1++) {
         int i_2 = this.field1676[i_1];
         this.field1676[i_1] = this.field1678[i_1];
         this.field1678[i_1] = -i_2;
      }

      this.method2865();
   }

   final void method2879(int i_1) {
      if (field1723[i_1]) {
         this.method2880(i_1);
      } else {
         int i_2 = this.field1680[i_1];
         int i_3 = this.field1681[i_1];
         int i_4 = this.field1682[i_1];
         Rasterizer3D.field1763 = field1710[i_1];
         if (this.field1687 == null) {
            Rasterizer3D.field1766 = 0;
         } else {
            Rasterizer3D.field1766 = this.field1687[i_1] & 0xff;
         }

         if (this.field1689 != null && this.field1689[i_1] != -1) {
            int i_5;
            int i_6;
            int i_7;
            if (this.field1688 != null && this.field1688[i_1] != -1) {
               int i_8 = this.field1688[i_1] & 0xff;
               i_5 = this.field1692[i_8];
               i_6 = this.field1693[i_8];
               i_7 = this.field1694[i_8];
            } else {
               i_5 = i_2;
               i_6 = i_3;
               i_7 = i_4;
            }

            if (this.field1685[i_1] == -1) {
               Rasterizer3D.method2986(field1713[i_2], field1713[i_3], field1713[i_4], field1719[i_2], field1719[i_3], field1719[i_4], this.field1697[i_1], this.field1697[i_1], this.field1697[i_1], field1715[i_5], field1715[i_6], field1715[i_7], field1716[i_5], field1716[i_6], field1716[i_7], field1717[i_5], field1717[i_6], field1717[i_7], this.field1689[i_1]);
            } else {
               Rasterizer3D.method2986(field1713[i_2], field1713[i_3], field1713[i_4], field1719[i_2], field1719[i_3], field1719[i_4], this.field1697[i_1], this.field1684[i_1], this.field1685[i_1], field1715[i_5], field1715[i_6], field1715[i_7], field1716[i_5], field1716[i_6], field1716[i_7], field1717[i_5], field1717[i_6], field1717[i_7], this.field1689[i_1]);
            }
         } else if (this.field1685[i_1] == -1) {
            Rasterizer3D.method3007(field1713[i_2], field1713[i_3], field1713[i_4], field1719[i_2], field1719[i_3], field1719[i_4], field1737[this.field1697[i_1]]);
         } else {
            Rasterizer3D.method3020(field1713[i_2], field1713[i_3], field1713[i_4], field1719[i_2], field1719[i_3], field1719[i_4], this.field1697[i_1], this.field1684[i_1], this.field1685[i_1]);
         }

      }
   }

   public void method2867(class138 class138_1, int i_2, class138 class138_3, int i_4, int[] ints_5) {
      if (i_2 != -1) {
         if (ints_5 != null && i_4 != -1) {
            class125 class125_6 = class138_1.field1893[i_2];
            class125 class125_7 = class138_3.field1893[i_4];
            class132 class132_8 = class125_6.field1634;
            field1727 = 0;
            field1672 = 0;
            field1731 = 0;
            byte b_9 = 0;
            int i_13 = b_9 + 1;
            int i_10 = ints_5[b_9];

            int i_11;
            int i_12;
            for (i_11 = 0; i_11 < class125_6.field1637; i_11++) {
               for (i_12 = class125_6.field1640[i_11]; i_12 > i_10; i_10 = ints_5[i_13++]) {
                  ;
               }

               if (i_12 != i_10 || class132_8.field1798[i_12] == 0) {
                  this.method2868(class132_8.field1798[i_12], class132_8.field1796[i_12], class125_6.field1641[i_11], class125_6.field1642[i_11], class125_6.field1643[i_11]);
               }
            }

            field1727 = 0;
            field1672 = 0;
            field1731 = 0;
            b_9 = 0;
            i_13 = b_9 + 1;
            i_10 = ints_5[b_9];

            for (i_11 = 0; i_11 < class125_7.field1637; i_11++) {
               for (i_12 = class125_7.field1640[i_11]; i_12 > i_10; i_10 = ints_5[i_13++]) {
                  ;
               }

               if (i_12 == i_10 || class132_8.field1798[i_12] == 0) {
                  this.method2868(class132_8.field1798[i_12], class132_8.field1796[i_12], class125_7.field1641[i_11], class125_7.field1642[i_11], class125_7.field1643[i_11]);
               }
            }

            this.method2865();
         } else {
            this.method2888(class138_1, i_2);
         }
      }
   }

   void method2868(int i_1, int[] ints_2, int i_3, int i_4, int i_5) {
      int i_6 = ints_2.length;
      int i_7;
      int i_8;
      int i_11;
      int i_12;
      if (i_1 == 0) {
         i_7 = 0;
         field1727 = 0;
         field1672 = 0;
         field1731 = 0;

         for (i_8 = 0; i_8 < i_6; i_8++) {
            int i_9 = ints_2[i_8];
            if (i_9 < this.field1695.length) {
               int[] ints_10 = this.field1695[i_9];

               for (i_11 = 0; i_11 < ints_10.length; i_11++) {
                  i_12 = ints_10[i_11];
                  field1727 += this.field1676[i_12];
                  field1672 += this.field1677[i_12];
                  field1731 += this.field1678[i_12];
                  ++i_7;
               }
            }
         }

         if (i_7 > 0) {
            field1727 = i_3 + field1727 / i_7;
            field1672 = i_4 + field1672 / i_7;
            field1731 = i_5 + field1731 / i_7;
         } else {
            field1727 = i_3;
            field1672 = i_4;
            field1731 = i_5;
         }

      } else {
         int[] ints_18;
         int i_19;
         if (i_1 == 1) {
            for (i_7 = 0; i_7 < i_6; i_7++) {
               i_8 = ints_2[i_7];
               if (i_8 < this.field1695.length) {
                  ints_18 = this.field1695[i_8];

                  for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                     i_11 = ints_18[i_19];
                     this.field1676[i_11] += i_3;
                     this.field1677[i_11] += i_4;
                     this.field1678[i_11] += i_5;
                  }
               }
            }

         } else if (i_1 == 2) {
            for (i_7 = 0; i_7 < i_6; i_7++) {
               i_8 = ints_2[i_7];
               if (i_8 < this.field1695.length) {
                  ints_18 = this.field1695[i_8];

                  for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                     i_11 = ints_18[i_19];
                     this.field1676[i_11] -= field1727;
                     this.field1677[i_11] -= field1672;
                     this.field1678[i_11] -= field1731;
                     i_12 = (i_3 & 0xff) * 8;
                     int i_13 = (i_4 & 0xff) * 8;
                     int i_14 = (i_5 & 0xff) * 8;
                     int i_15;
                     int i_16;
                     int i_17;
                     if (i_14 != 0) {
                        i_15 = field1683[i_14];
                        i_16 = field1736[i_14];
                        i_17 = i_15 * this.field1677[i_11] + i_16 * this.field1676[i_11] >> 16;
                        this.field1677[i_11] = i_16 * this.field1677[i_11] - i_15 * this.field1676[i_11] >> 16;
                        this.field1676[i_11] = i_17;
                     }

                     if (i_12 != 0) {
                        i_15 = field1683[i_12];
                        i_16 = field1736[i_12];
                        i_17 = i_16 * this.field1677[i_11] - i_15 * this.field1678[i_11] >> 16;
                        this.field1678[i_11] = i_15 * this.field1677[i_11] + i_16 * this.field1678[i_11] >> 16;
                        this.field1677[i_11] = i_17;
                     }

                     if (i_13 != 0) {
                        i_15 = field1683[i_13];
                        i_16 = field1736[i_13];
                        i_17 = i_15 * this.field1678[i_11] + i_16 * this.field1676[i_11] >> 16;
                        this.field1678[i_11] = i_16 * this.field1678[i_11] - i_15 * this.field1676[i_11] >> 16;
                        this.field1676[i_11] = i_17;
                     }

                     this.field1676[i_11] += field1727;
                     this.field1677[i_11] += field1672;
                     this.field1678[i_11] += field1731;
                  }
               }
            }

         } else if (i_1 == 3) {
            for (i_7 = 0; i_7 < i_6; i_7++) {
               i_8 = ints_2[i_7];
               if (i_8 < this.field1695.length) {
                  ints_18 = this.field1695[i_8];

                  for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                     i_11 = ints_18[i_19];
                     this.field1676[i_11] -= field1727;
                     this.field1677[i_11] -= field1672;
                     this.field1678[i_11] -= field1731;
                     this.field1676[i_11] = i_3 * this.field1676[i_11] / 128;
                     this.field1677[i_11] = i_4 * this.field1677[i_11] / 128;
                     this.field1678[i_11] = i_5 * this.field1678[i_11] / 128;
                     this.field1676[i_11] += field1727;
                     this.field1677[i_11] += field1672;
                     this.field1678[i_11] += field1731;
                  }
               }
            }

         } else if (i_1 == 5) {
            if (this.field1709 != null && this.field1687 != null) {
               for (i_7 = 0; i_7 < i_6; i_7++) {
                  i_8 = ints_2[i_7];
                  if (i_8 < this.field1709.length) {
                     ints_18 = this.field1709[i_8];

                     for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                        i_11 = ints_18[i_19];
                        i_12 = (this.field1687[i_11] & 0xff) + i_3 * 8;
                        if (i_12 < 0) {
                           i_12 = 0;
                        } else if (i_12 > 255) {
                           i_12 = 255;
                        }

                        this.field1687[i_11] = (byte)i_12;
                     }
                  }
               }
            }

         }
      }
   }

   final void method2878(boolean bool_1, boolean bool_2, boolean bool_3, long long_4) {
      if (this.field1701 < 1600) {
         int i_6;
         for (i_6 = 0; i_6 < this.field1701; i_6++) {
            field1711[i_6] = 0;
         }

         i_6 = bool_3 ? 20 : 5;

         int i_7;
         int i_8;
         int i_10;
         int i_11;
         int i_12;
         int i_13;
         int i_15;
         int i_16;
         int i_18;
         int i_27;
         for (i_7 = 0; i_7 < this.field1679; i_7++) {
            if (this.field1685[i_7] != -2) {
               i_8 = this.field1680[i_7];
               i_27 = this.field1681[i_7];
               i_10 = this.field1682[i_7];
               i_11 = field1719[i_8];
               i_12 = field1719[i_27];
               i_13 = field1719[i_10];
               int i_14;
               int i_17;
               if (!bool_1 || i_11 != -5000 && i_12 != -5000 && i_13 != -5000) {
                  if (bool_2) {
                     i_15 = field1713[i_8];
                     i_16 = field1713[i_27];
                     i_17 = field1713[i_10];
                     i_18 = i_6 + class128.field1743;
                     boolean bool_34;
                     if (i_18 < i_15 && i_18 < i_16 && i_18 < i_17) {
                        bool_34 = false;
                     } else {
                        i_18 = class128.field1743 - i_6;
                        if (i_18 > i_15 && i_18 > i_16 && i_18 > i_17) {
                           bool_34 = false;
                        } else {
                           i_18 = i_6 + class128.field1742;
                           if (i_18 < i_11 && i_18 < i_12 && i_18 < i_13) {
                              bool_34 = false;
                           } else {
                              i_18 = class128.field1742 - i_6;
                              if (i_18 > i_11 && i_18 > i_12 && i_18 > i_13) {
                                 bool_34 = false;
                              } else {
                                 bool_34 = true;
                              }
                           }
                        }
                     }

                     if (bool_34) {
                        class128.field1750[++class128.field1748 - 1] = long_4;
                        bool_2 = false;
                     }
                  }

                  if ((i_11 - i_12) * (field1713[i_10] - field1713[i_27]) - (i_13 - i_12) * (field1713[i_8] - field1713[i_27]) > 0) {
                     field1723[i_7] = false;
                     if (i_11 >= 0 && i_12 >= 0 && i_13 >= 0 && i_11 <= Rasterizer3D.field1788 && i_12 <= Rasterizer3D.field1788 && i_13 <= Rasterizer3D.field1788) {
                        field1710[i_7] = false;
                     } else {
                        field1710[i_7] = true;
                     }

                     i_14 = (field1714[i_8] + field1714[i_27] + field1714[i_10]) / 3 + this.field1702;
                     field1720[i_14][field1711[i_14]++] = i_7;
                  }
               } else {
                  i_14 = field1715[i_8];
                  i_15 = field1715[i_27];
                  i_16 = field1715[i_10];
                  i_17 = field1716[i_8];
                  i_18 = field1716[i_27];
                  int i_19 = field1716[i_10];
                  int i_20 = field1717[i_8];
                  int i_21 = field1717[i_27];
                  int i_22 = field1717[i_10];
                  i_14 -= i_15;
                  i_16 -= i_15;
                  i_17 -= i_18;
                  i_19 -= i_18;
                  i_20 -= i_21;
                  i_22 -= i_21;
                  int i_23 = i_17 * i_22 - i_20 * i_19;
                  int i_24 = i_20 * i_16 - i_14 * i_22;
                  int i_25 = i_14 * i_19 - i_17 * i_16;
                  if (i_15 * i_23 + i_18 * i_24 + i_21 * i_25 > 0) {
                     field1723[i_7] = true;
                     int i_26 = (field1714[i_8] + field1714[i_27] + field1714[i_10]) / 3 + this.field1702;
                     field1720[i_26][field1711[i_26]++] = i_7;
                  }
               }
            }
         }

         int[] ints_9;
         if (this.field1712 == null) {
            for (i_7 = this.field1701 - 1; i_7 >= 0; --i_7) {
               i_8 = field1711[i_7];
               if (i_8 > 0) {
                  ints_9 = field1720[i_7];

                  for (i_10 = 0; i_10 < i_8; i_10++) {
                     this.method2879(ints_9[i_10]);
                  }
               }
            }

         } else {
            for (i_7 = 0; i_7 < 12; i_7++) {
               field1721[i_7] = 0;
               field1725[i_7] = 0;
            }

            for (i_7 = this.field1701 - 1; i_7 >= 0; --i_7) {
               i_8 = field1711[i_7];
               if (i_8 > 0) {
                  ints_9 = field1720[i_7];

                  for (i_10 = 0; i_10 < i_8; i_10++) {
                     i_11 = ints_9[i_10];
                     byte b_33 = this.field1712[i_11];
                     i_13 = field1721[b_33]++;
                     field1729[b_33][i_13] = i_11;
                     if (b_33 < 10) {
                        field1725[b_33] += i_7;
                     } else if (b_33 == 10) {
                        field1739[i_13] = i_7;
                     } else {
                        field1724[i_13] = i_7;
                     }
                  }
               }
            }

            i_7 = 0;
            if (field1721[1] > 0 || field1721[2] > 0) {
               i_7 = (field1725[1] + field1725[2]) / (field1721[1] + field1721[2]);
            }

            i_8 = 0;
            if (field1721[3] > 0 || field1721[4] > 0) {
               i_8 = (field1725[3] + field1725[4]) / (field1721[3] + field1721[4]);
            }

            i_27 = 0;
            if (field1721[6] > 0 || field1721[8] > 0) {
               i_27 = (field1725[8] + field1725[6]) / (field1721[8] + field1721[6]);
            }

            i_11 = 0;
            i_12 = field1721[10];
            int[] ints_30 = field1729[10];
            int[] ints_31 = field1739;
            if (i_11 == i_12) {
               i_11 = 0;
               i_12 = field1721[11];
               ints_30 = field1729[11];
               ints_31 = field1724;
            }

            if (i_11 < i_12) {
               i_10 = ints_31[i_11];
            } else {
               i_10 = -1000;
            }

            for (i_15 = 0; i_15 < 10; i_15++) {
               while (i_15 == 0 && i_10 > i_7) {
                  this.method2879(ints_30[i_11++]);
                  if (i_11 == i_12 && ints_30 != field1729[11]) {
                     i_11 = 0;
                     i_12 = field1721[11];
                     ints_30 = field1729[11];
                     ints_31 = field1724;
                  }

                  if (i_11 < i_12) {
                     i_10 = ints_31[i_11];
                  } else {
                     i_10 = -1000;
                  }
               }

               while (i_15 == 3 && i_10 > i_8) {
                  this.method2879(ints_30[i_11++]);
                  if (i_11 == i_12 && ints_30 != field1729[11]) {
                     i_11 = 0;
                     i_12 = field1721[11];
                     ints_30 = field1729[11];
                     ints_31 = field1724;
                  }

                  if (i_11 < i_12) {
                     i_10 = ints_31[i_11];
                  } else {
                     i_10 = -1000;
                  }
               }

               while (i_15 == 5 && i_10 > i_27) {
                  this.method2879(ints_30[i_11++]);
                  if (i_11 == i_12 && ints_30 != field1729[11]) {
                     i_11 = 0;
                     i_12 = field1721[11];
                     ints_30 = field1729[11];
                     ints_31 = field1724;
                  }

                  if (i_11 < i_12) {
                     i_10 = ints_31[i_11];
                  } else {
                     i_10 = -1000;
                  }
               }

               i_16 = field1721[i_15];
               int[] ints_32 = field1729[i_15];

               for (i_18 = 0; i_18 < i_16; i_18++) {
                  this.method2879(ints_32[i_18]);
               }
            }

            while (i_10 != -1000) {
               this.method2879(ints_30[i_11++]);
               if (i_11 == i_12 && ints_30 != field1729[11]) {
                  i_11 = 0;
                  ints_30 = field1729[11];
                  i_12 = field1721[11];
                  ints_31 = field1724;
               }

               if (i_11 < i_12) {
                  i_10 = ints_31[i_11];
               } else {
                  i_10 = -1000;
               }
            }

         }
      }
   }

   public void method2901(int i_1, int i_2, int i_3) {
      for (int i_4 = 0; i_4 < this.field1675; i_4++) {
         this.field1676[i_4] += i_1;
         this.field1677[i_4] += i_2;
         this.field1678[i_4] += i_3;
      }

      this.method2865();
   }

   public final void method2866(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
      field1711[0] = -1;
      if (this.field1698 != 2 && this.field1698 != 1) {
         this.method2910();
      }

      int i_8 = Rasterizer3D.field1774;
      int i_9 = Rasterizer3D.field1775;
      int i_10 = field1683[i_1];
      int i_11 = field1736[i_1];
      int i_12 = field1683[i_2];
      int i_13 = field1736[i_2];
      int i_14 = field1683[i_3];
      int i_15 = field1736[i_3];
      int i_16 = field1683[i_4];
      int i_17 = field1736[i_4];
      int i_18 = i_16 * i_6 + i_17 * i_7 >> 16;

      for (int i_19 = 0; i_19 < this.field1675; i_19++) {
         int i_20 = this.field1676[i_19];
         int i_21 = this.field1677[i_19];
         int i_22 = this.field1678[i_19];
         int i_23;
         if (i_3 != 0) {
            i_23 = i_21 * i_14 + i_20 * i_15 >> 16;
            i_21 = i_21 * i_15 - i_20 * i_14 >> 16;
            i_20 = i_23;
         }

         if (i_1 != 0) {
            i_23 = i_21 * i_11 - i_22 * i_10 >> 16;
            i_22 = i_21 * i_10 + i_22 * i_11 >> 16;
            i_21 = i_23;
         }

         if (i_2 != 0) {
            i_23 = i_22 * i_12 + i_20 * i_13 >> 16;
            i_22 = i_22 * i_13 - i_20 * i_12 >> 16;
            i_20 = i_23;
         }

         i_20 += i_5;
         i_21 += i_6;
         i_22 += i_7;
         i_23 = i_21 * i_17 - i_22 * i_16 >> 16;
         i_22 = i_21 * i_16 + i_22 * i_17 >> 16;
         field1714[i_19] = i_22 - i_18;
         field1719[i_19] = i_20 * Rasterizer3D.field1773 / i_22 + i_8;
         field1713[i_19] = i_23 * Rasterizer3D.field1773 / i_22 + i_9;
         if (this.field1691 > 0) {
            field1715[i_19] = i_20;
            field1716[i_19] = i_23;
            field1717[i_19] = i_22;
         }
      }

      try {
         this.method2878(false, false, false, 0L);
      } catch (Exception exception_25) {
         ;
      }

   }

   public final void method2876(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
      field1711[0] = -1;
      if (this.field1698 != 2 && this.field1698 != 1) {
         this.method2910();
      }

      int i_9 = Rasterizer3D.field1774;
      int i_10 = Rasterizer3D.field1775;
      int i_11 = field1683[i_1];
      int i_12 = field1736[i_1];
      int i_13 = field1683[i_2];
      int i_14 = field1736[i_2];
      int i_15 = field1683[i_3];
      int i_16 = field1736[i_3];
      int i_17 = field1683[i_4];
      int i_18 = field1736[i_4];
      int i_19 = i_17 * i_6 + i_18 * i_7 >> 16;

      for (int i_20 = 0; i_20 < this.field1675; i_20++) {
         int i_21 = this.field1676[i_20];
         int i_22 = this.field1677[i_20];
         int i_23 = this.field1678[i_20];
         int i_24;
         if (i_3 != 0) {
            i_24 = i_22 * i_15 + i_21 * i_16 >> 16;
            i_22 = i_22 * i_16 - i_21 * i_15 >> 16;
            i_21 = i_24;
         }

         if (i_1 != 0) {
            i_24 = i_22 * i_12 - i_23 * i_11 >> 16;
            i_23 = i_22 * i_11 + i_23 * i_12 >> 16;
            i_22 = i_24;
         }

         if (i_2 != 0) {
            i_24 = i_23 * i_13 + i_21 * i_14 >> 16;
            i_23 = i_23 * i_14 - i_21 * i_13 >> 16;
            i_21 = i_24;
         }

         i_21 += i_5;
         i_22 += i_6;
         i_23 += i_7;
         i_24 = i_22 * i_18 - i_23 * i_17 >> 16;
         i_23 = i_22 * i_17 + i_23 * i_18 >> 16;
         field1714[i_20] = i_23 - i_19;
         field1719[i_20] = i_9 + i_21 * Rasterizer3D.field1773 / i_8;
         field1713[i_20] = i_10 + i_24 * Rasterizer3D.field1773 / i_8;
         if (this.field1691 > 0) {
            field1715[i_20] = i_21;
            field1716[i_20] = i_24;
            field1717[i_20] = i_23;
         }
      }

      try {
         this.method2878(false, false, false, 0L);
      } catch (Exception exception_26) {
         ;
      }

   }

   public int method2864() {
      this.method2899();
      return this.field1673;
   }

}
