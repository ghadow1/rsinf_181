import java.util.Comparator;

final class class5 implements Comparator {

   static class133 field22;
   static class325 field23;

   public static class240 method61(int i_0) {
      class240 class240_2 = (class240) class240.field3205.get((long)i_0);
      if (class240_2 != null) {
         return class240_2;
      } else {
         byte[] bytes_3 = class240.field3204.method4144(16, i_0);
         class240_2 = new class240();
         if (bytes_3 != null) {
            class240_2.method4353(new ByteBuffer(bytes_3), -927981442);
         }

         class240.field3205.put(class240_2, (long)i_0);
         return class240_2;
      }
   }

   static final void method60(int i_0, int i_1) {
      NodeDeque nodeDeque_3 = Client.groundItems[ItemContainer_2.plane][i_0][i_1];
      if (nodeDeque_3 == null) {
         field22.method3087(ItemContainer_2.plane, i_0, i_1);
      } else {
         long long_4 = -99999999L;
         class87 class87_6 = null;

         class87 class87_7;
         for (class87_7 = (class87) nodeDeque_3.method4892(); class87_7 != null; class87_7 = (class87) nodeDeque_3.method4894()) {
            ItemDefinition itemDefinition_8 = class26.method404(class87_7.field1244);
            long long_9 = (long) itemDefinition_8.price;
            if (itemDefinition_8.isStackable == 1) {
               long_9 *= (long)(class87_7.field1245 + 1);
            }

            if (long_9 > long_4) {
               long_4 = long_9;
               class87_6 = class87_7;
            }
         }

         if (class87_6 == null) {
            field22.method3087(ItemContainer_2.plane, i_0, i_1);
         } else {
            nodeDeque_3.method4888(class87_6);
            class87 class87_13 = null;
            class87 class87_12 = null;

            for (class87_7 = (class87) nodeDeque_3.method4892(); class87_7 != null; class87_7 = (class87) nodeDeque_3.method4894()) {
               if (class87_6.field1244 != class87_7.field1244) {
                  if (class87_13 == null) {
                     class87_13 = class87_7;
                  }

                  if (class87_7.field1244 != class87_13.field1244 && class87_12 == null) {
                     class87_12 = class87_7;
                  }
               }
            }

            long long_10 = class126.method2854(i_0, i_1, 3, false, 0);
            field22.method3073(ItemContainer_2.plane, i_0, i_1, class62.method1130(i_0 * 128 + 64, i_1 * 128 + 64, ItemContainer_2.plane), class87_6, long_10, class87_13, class87_12);
         }
      }
   }

   static String method54(class316 class316_0, int i_1, String string_2, byte b_3) {
      if (class316_0 == null) {
         return string_2;
      } else {
         class176 class176_4 = (class176) class316_0.method5924((long) i_1);
         return class176_4 == null ? string_2 : (String) class176_4.field2107;
      }
   }

   public static void method50(String string_0, boolean bool_1, boolean bool_2) {
      class326.method6243(string_0, bool_1, "openjs", bool_2, (byte) 38);
   }

   public static void method62(class233 class233_0) {
      class242.field3233 = class233_0;
   }

   public static String method63(CharSequence charsequence_0) {
      int i_2 = charsequence_0.length();
      StringBuilder stringbuilder_3 = new StringBuilder(i_2);

      for (int i_4 = 0; i_4 < i_2; i_4++) {
         char var_5 = charsequence_0.charAt(i_4);
         if ((var_5 < 97 || var_5 > 122) && (var_5 < 65 || var_5 > 90) && (var_5 < 48 || var_5 > 57) && var_5 != 46 && var_5 != 45 && var_5 != 42 && var_5 != 95) {
            if (var_5 == 32) {
               stringbuilder_3.append('+');
            } else {
               byte b_6 = ItemDefinition.encodeStringCp1252(var_5);
               stringbuilder_3.append('%');
               int i_7 = b_6 >> 4 & 0xf;
               if (i_7 >= 10) {
                  stringbuilder_3.append((char)(i_7 + 55));
               } else {
                  stringbuilder_3.append((char)(i_7 + 48));
               }

               i_7 = b_6 & 0xf;
               if (i_7 >= 10) {
                  stringbuilder_3.append((char)(i_7 + 55));
               } else {
                  stringbuilder_3.append((char)(i_7 + 48));
               }
            }
         } else {
            stringbuilder_3.append(var_5);
         }
      }

      return stringbuilder_3.toString();
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

   int method51(class7 class7_1, class7 class7_2) {
      return class7_1.field51 < class7_2.field51 ? -1 : (class7_2.field51 == class7_1.field51 ? 0 : 1);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method51((class7) object_1, (class7) object_2);
   }

}
