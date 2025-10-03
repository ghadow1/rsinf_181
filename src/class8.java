import java.util.Comparator;

final class class8 implements Comparator {

   int method83(class7 class7_1, class7 class7_2) {
      return class7_1.field53.field61 < class7_2.field53.field61 ? -1 : (class7_2.field53.field61 == class7_1.field53.field61 ? 0 : 1);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method83((class7) object_1, (class7) object_2);
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

   static String method94(String string_0) {
      GameState[] arr_2 = PriorityComparator.getGameStates();

      for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
         GameState gameState_4 = arr_2[i_3];
         if (gameState_4.field3090 != -1 && string_0.startsWith(class33.iconTag(gameState_4.field3090))) {
            string_0 = string_0.substring(6 + Integer.toString(gameState_4.field3090).length());
            break;
         }
      }

      return string_0;
   }

   static final void method85(class217 class217_0, int i_1) {
      int i_2 = class217_0.field2568;
      if (i_2 == 324) {
         if (Client.field919 == -1) {
            Client.field919 = class217_0.field2599;
            Client.field920 = class217_0.field2600;
         }

         if (Client.field918.field2535) {
            class217_0.field2599 = Client.field919;
         } else {
            class217_0.field2599 = Client.field920;
         }

      } else if (i_2 == 325) {
         if (Client.field919 == -1) {
            Client.field919 = class217_0.field2599;
            Client.field920 = class217_0.field2600;
         }

         if (Client.field918.field2535) {
            class217_0.field2599 = Client.field920;
         } else {
            class217_0.field2599 = Client.field919;
         }

      } else if (i_2 == 327) {
         class217_0.field2615 = 150;
         class217_0.field2616 = (int)(Math.sin((double) Client.field881 / 40.0D) * 256.0D) & 0x7ff;
         class217_0.field2607 = 5;
         class217_0.field2649 = 0;
      } else if (i_2 == 328) {
         class217_0.field2615 = 150;
         class217_0.field2616 = (int)(Math.sin((double) Client.field881 / 40.0D) * 256.0D) & 0x7ff;
         class217_0.field2607 = 5;
         class217_0.field2649 = 1;
      }
   }

   static String method92(String string_0, class217 class217_1, int i_2) {
      if (string_0.indexOf("%") != -1) {
         for (int i_3 = 1; i_3 <= 5; i_3++) {
            while (true) {
               int i_4 = string_0.indexOf("%" + i_3);
               if (i_4 == -1) {
                  break;
               }

               String string_5 = string_0.substring(0, i_4);
               int i_7 = class212.method3969(class217_1, i_3 - 1, 1942801827);
               String str_6;
               if (i_7 < 999999999) {
                  str_6 = Integer.toString(i_7);
               } else {
                  str_6 = "*";
               }

               string_0 = string_5 + str_6 + string_0.substring(i_4 + 2);
            }
         }
      }

      return string_0;
   }

   static void method93(int i_0, int i_1) {
      if (i_0 == -1 && !Client.field699) {
         class171.method3553(-461767725);
      } else if (i_0 != -1 && i_0 != Client.field889 && Client.field911 != 0 && !Client.field699) {
         class235 class235_2 = class29.field253;
         int i_3 = Client.field911;
         class197.field2402 = 1;
         class11.field76 = class235_2;
         class197.field2403 = i_0;
         class197.field2407 = 0;
         class56.field529 = i_3;
         class158.field1992 = false;
         class197.field2404 = 2;
      }

      Client.field889 = i_0;
   }

}
