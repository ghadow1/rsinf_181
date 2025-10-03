public class class138 extends DualNode {

   public static int[] field1895;
   class125[] field1893;

   class138(class233 class233_1, class233 class233_2, int i_3, boolean bool_4) {
      NodeDeque nodeDeque_5 = new NodeDeque();
      int i_6 = class233_1.method4154(i_3);
      this.field1893 = new class125[i_6];
      int[] ints_7 = class233_1.method4153(i_3);

      for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
         byte[] bytes_9 = class233_1.method4144(i_3, ints_7[i_8]);
         class132 class132_10 = null;
         int i_11 = (bytes_9[0] & 0xff) << 8 | bytes_9[1] & 0xff;

         for (class132 class132_12 = (class132) nodeDeque_5.method4892(); class132_12 != null; class132_12 = (class132) nodeDeque_5.method4894()) {
            if (i_11 == class132_12.field1799) {
               class132_10 = class132_12;
               break;
            }
         }

         if (class132_10 == null) {
            byte[] bytes_13;
            if (bool_4) {
               bytes_13 = class233_2.method4150(0, i_11);
            } else {
               bytes_13 = class233_2.method4150(i_11, 0);
            }

            class132_10 = new class132(i_11, bytes_13);
            nodeDeque_5.method4917(class132_10);
         }

         this.field1893[ints_7[i_8]] = new class125(bytes_9, class132_10);
      }

   }

   public boolean method3268(int i_1, int i_2) {
      return this.field1893[i_1].field1644;
   }

   static final boolean method3275(class127 class127_0, int i_1, int i_2, int i_3, byte b_4) {
      boolean bool_5 = class128.field1753;
      if (!bool_5) {
         return false;
      } else {
         int i_6;
         int i_7;
         int i_8;
         int i_9;
         int i_12;
         int i_13;
         int i_14;
         int i_17;
         int i_18;
         if (!class128.field1744) {
            i_6 = Scene.sinEyePitch;
            i_7 = Scene.cosEyePitch;
            i_8 = Scene.sinEyeYaw;
            i_9 = Scene.cosEyeYaw;
            byte b_10 = 50;
            short s_11 = 3500;
            i_12 = (class128.field1742 - Rasterizer3D.field1774) * b_10 / Rasterizer3D.field1773;
            i_13 = (class128.field1743 - Rasterizer3D.field1775) * b_10 / Rasterizer3D.field1773;
            i_14 = (class128.field1742 - Rasterizer3D.field1774) * s_11 / Rasterizer3D.field1773;
            int i_15 = (class128.field1743 - Rasterizer3D.field1775) * s_11 / Rasterizer3D.field1773;
            int i_16 = Rasterizer3D.method2995(i_13, b_10, i_7, i_6);
            i_17 = Rasterizer3D.method2996(i_13, b_10, i_7, i_6);
            i_13 = i_16;
            i_16 = Rasterizer3D.method2995(i_15, s_11, i_7, i_6);
            i_18 = Rasterizer3D.method2996(i_15, s_11, i_7, i_6);
            i_15 = i_16;
            i_16 = Rasterizer3D.method2982(i_12, i_17, i_9, i_8);
            i_17 = Rasterizer3D.method2994(i_12, i_17, i_9, i_8);
            i_12 = i_16;
            i_16 = Rasterizer3D.method2982(i_14, i_18, i_9, i_8);
            i_18 = Rasterizer3D.method2994(i_14, i_18, i_9, i_8);
            class134.field1871 = (i_12 + i_16) / 2;
            class128.field1745 = (i_13 + i_15) / 2;
            class128.field1746 = (i_17 + i_18) / 2;
            class87.field1242 = (i_16 - i_12) / 2;
            class7.field48 = (i_15 - i_13) / 2;
            class48.field422 = (i_18 - i_17) / 2;
            class56.field527 = Math.abs(class87.field1242);
            class128.field1741 = Math.abs(class7.field48);
            class82.field1160 = Math.abs(class48.field422);
         }

         i_6 = class127_0.field1734 + i_1;
         i_7 = i_2 + class127_0.field1704;
         i_8 = i_3 + class127_0.field1700;
         i_9 = class127_0.field1671;
         i_17 = class127_0.field1707;
         i_18 = class127_0.field1674;
         i_12 = class134.field1871 - i_6;
         i_13 = class128.field1745 - i_7;
         i_14 = class128.field1746 - i_8;
         return Math.abs(i_12) > i_9 + class56.field527 ? false : (Math.abs(i_13) > i_17 + class128.field1741 ? false : (Math.abs(i_14) > i_18 + class82.field1160 ? false : (Math.abs(i_14 * class7.field48 - i_13 * class48.field422) > i_18 * class128.field1741 + i_17 * class82.field1160 ? false : (Math.abs(i_12 * class48.field422 - i_14 * class87.field1242) > i_9 * class82.field1160 + i_18 * class56.field527 ? false : Math.abs(i_13 * class87.field1242 - i_12 * class7.field48) <= i_17 * class56.field527 + i_9 * class128.field1741))));
      }
   }

   public static final boolean method3267(int i_0, int i_1, ParamDefinition paramDefinition_2, CollisionMap collisionMap_3, int i_4) {
      int i_5 = i_0;
      int i_6 = i_1;
      byte b_7 = 64;
      byte b_8 = 64;
      int i_9 = i_0 - b_7;
      int i_10 = i_1 - b_8;
      class173.field2089[b_7][b_8] = 99;
      class173.field2090[b_7][b_8] = 0;
      byte b_11 = 0;
      int i_12 = 0;
      class173.field2092[b_11] = i_0;
      byte b_10001 = b_11;
      int i_19 = b_11 + 1;
      class173.field2094[b_10001] = i_1;
      int[][] ints_13 = collisionMap_3.flags;

      while (i_12 != i_19) {
         i_5 = class173.field2092[i_12];
         i_6 = class173.field2094[i_12];
         i_12 = i_12 + 1 & 0xfff;
         int i_17 = i_5 - i_9;
         int i_18 = i_6 - i_10;
         int i_14 = i_5 - collisionMap_3.xInset;
         int i_15 = i_6 - collisionMap_3.yInset;
         if (paramDefinition_2.vmethod3594(2, i_5, i_6, collisionMap_3, -1888775070)) {
            class173.field2088 = i_5;
            class218.field2707 = i_6;
            return true;
         }

         int i_16 = class173.field2090[i_17][i_18] + 1;
         if (i_17 > 0 && class173.field2089[i_17 - 1][i_18] == 0 && (ints_13[i_14 - 1][i_15] & 0x124010e) == 0 && (ints_13[i_14 - 1][i_15 + 1] & 0x1240138) == 0) {
            class173.field2092[i_19] = i_5 - 1;
            class173.field2094[i_19] = i_6;
            i_19 = i_19 + 1 & 0xfff;
            class173.field2089[i_17 - 1][i_18] = 2;
            class173.field2090[i_17 - 1][i_18] = i_16;
         }

         if (i_17 < 126 && class173.field2089[i_17 + 1][i_18] == 0 && (ints_13[i_14 + 2][i_15] & 0x1240183) == 0 && (ints_13[i_14 + 2][i_15 + 1] & 0x12401e0) == 0) {
            class173.field2092[i_19] = i_5 + 1;
            class173.field2094[i_19] = i_6;
            i_19 = i_19 + 1 & 0xfff;
            class173.field2089[i_17 + 1][i_18] = 8;
            class173.field2090[i_17 + 1][i_18] = i_16;
         }

         if (i_18 > 0 && class173.field2089[i_17][i_18 - 1] == 0 && (ints_13[i_14][i_15 - 1] & 0x124010e) == 0 && (ints_13[i_14 + 1][i_15 - 1] & 0x1240183) == 0) {
            class173.field2092[i_19] = i_5;
            class173.field2094[i_19] = i_6 - 1;
            i_19 = i_19 + 1 & 0xfff;
            class173.field2089[i_17][i_18 - 1] = 1;
            class173.field2090[i_17][i_18 - 1] = i_16;
         }

         if (i_18 < 126 && class173.field2089[i_17][i_18 + 1] == 0 && (ints_13[i_14][i_15 + 2] & 0x1240138) == 0 && (ints_13[i_14 + 1][i_15 + 2] & 0x12401e0) == 0) {
            class173.field2092[i_19] = i_5;
            class173.field2094[i_19] = i_6 + 1;
            i_19 = i_19 + 1 & 0xfff;
            class173.field2089[i_17][i_18 + 1] = 4;
            class173.field2090[i_17][i_18 + 1] = i_16;
         }

         if (i_17 > 0 && i_18 > 0 && class173.field2089[i_17 - 1][i_18 - 1] == 0 && (ints_13[i_14 - 1][i_15] & 0x124013e) == 0 && (ints_13[i_14 - 1][i_15 - 1] & 0x124010e) == 0 && (ints_13[i_14][i_15 - 1] & 0x124018f) == 0) {
            class173.field2092[i_19] = i_5 - 1;
            class173.field2094[i_19] = i_6 - 1;
            i_19 = i_19 + 1 & 0xfff;
            class173.field2089[i_17 - 1][i_18 - 1] = 3;
            class173.field2090[i_17 - 1][i_18 - 1] = i_16;
         }

         if (i_17 < 126 && i_18 > 0 && class173.field2089[i_17 + 1][i_18 - 1] == 0 && (ints_13[i_14 + 1][i_15 - 1] & 0x124018f) == 0 && (ints_13[i_14 + 2][i_15 - 1] & 0x1240183) == 0 && (ints_13[i_14 + 2][i_15] & 0x12401e3) == 0) {
            class173.field2092[i_19] = i_5 + 1;
            class173.field2094[i_19] = i_6 - 1;
            i_19 = i_19 + 1 & 0xfff;
            class173.field2089[i_17 + 1][i_18 - 1] = 9;
            class173.field2090[i_17 + 1][i_18 - 1] = i_16;
         }

         if (i_17 > 0 && i_18 < 126 && class173.field2089[i_17 - 1][i_18 + 1] == 0 && (ints_13[i_14 - 1][i_15 + 1] & 0x124013e) == 0 && (ints_13[i_14 - 1][i_15 + 2] & 0x1240138) == 0 && (ints_13[i_14][i_15 + 2] & 0x12401f8) == 0) {
            class173.field2092[i_19] = i_5 - 1;
            class173.field2094[i_19] = i_6 + 1;
            i_19 = i_19 + 1 & 0xfff;
            class173.field2089[i_17 - 1][i_18 + 1] = 6;
            class173.field2090[i_17 - 1][i_18 + 1] = i_16;
         }

         if (i_17 < 126 && i_18 < 126 && class173.field2089[i_17 + 1][i_18 + 1] == 0 && (ints_13[i_14 + 1][i_15 + 2] & 0x12401f8) == 0 && (ints_13[i_14 + 2][i_15 + 2] & 0x12401e0) == 0 && (ints_13[i_14 + 2][i_15 + 1] & 0x12401e3) == 0) {
            class173.field2092[i_19] = i_5 + 1;
            class173.field2094[i_19] = i_6 + 1;
            i_19 = i_19 + 1 & 0xfff;
            class173.field2089[i_17 + 1][i_18 + 1] = 12;
            class173.field2090[i_17 + 1][i_18 + 1] = i_16;
         }
      }

      class173.field2088 = i_5;
      class218.field2707 = i_6;
      return false;
   }

}
