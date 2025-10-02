import java.util.Comparator;

final class class10 implements Comparator {

   public static String field69;

   int method120(class7 class7_1, class7 class7_2, byte b_3) {
      return class7_1.field53.field60 < class7_2.field53.field60 ? -1 : (class7_2.field53.field60 == class7_1.field53.field60 ? 0 : 1);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method120((class7) object_1, (class7) object_2, (byte) -46);
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

   static final void method124(int i_0) {
      class65.method1176((byte) -51);

      for (class75 class75_2 = (class75) class75.field1080.method4892(); class75_2 != null; class75_2 = (class75) class75.field1080.method4894()) {
         if (class75_2.field1087 != null) {
            class75_2.method1821();
         }
      }

      int i_5 = class5.method61(i_0).field3206;
      if (i_5 != 0) {
         int i_3 = class212.var_configurations[i_0];
         if (i_5 == 1) {
            if (i_3 == 1) {
               class130.method2978(0.9D);
               ((class119) class130.field1781).method2745(0.9D);
            }

            if (i_3 == 2) {
               class130.method2978(0.8D);
               ((class119) class130.field1781).method2745(0.8D);
            }

            if (i_3 == 3) {
               class130.method2978(0.7D);
               ((class119) class130.field1781).method2745(0.7D);
            }

            if (i_3 == 4) {
               class130.method2978(0.6D);
               ((class119) class130.field1781).method2745(0.6D);
            }

            class292.method5317(-201583329);
         }

         if (i_5 == 3) {
            short s_4 = 0;
            if (i_3 == 0) {
               s_4 = 255;
            }

            if (i_3 == 1) {
               s_4 = 192;
            }

            if (i_3 == 2) {
               s_4 = 128;
            }

            if (i_3 == 3) {
               s_4 = 64;
            }

            if (i_3 == 4) {
               s_4 = 0;
            }

            if (s_4 != Client.field911) {
               if (Client.field911 == 0 && Client.field889 != -1) {
                  class169.method3503(class29.field253, Client.field889, 0, s_4, false, 210229460);
                  Client.field699 = false;
               } else if (s_4 == 0) {
                  class171.method3553(401790387);
                  Client.field699 = false;
               } else if (class197.field2402 != 0) {
                  class56.field529 = s_4;
               } else {
                  class76.field1099.method3706(s_4, 1964595873);
               }

               Client.field911 = s_4;
            }
         }

         if (i_5 == 4) {
            if (i_3 == 0) {
               Client.field891 = 127;
            }

            if (i_3 == 1) {
               Client.field891 = 96;
            }

            if (i_3 == 2) {
               Client.field891 = 64;
            }

            if (i_3 == 3) {
               Client.field891 = 32;
            }

            if (i_3 == 4) {
               Client.field891 = 0;
            }
         }

         if (i_5 == 5) {
            Client.field789 = i_3;
         }

         if (i_5 == 6) {
            Client.field819 = i_3;
         }

         if (i_5 == 9) {
            Client.field809 = i_3;
         }

         if (i_5 == 10) {
            if (i_3 == 0) {
               Client.field892 = 127;
            }

            if (i_3 == 1) {
               Client.field892 = 96;
            }

            if (i_3 == 2) {
               Client.field892 = 64;
            }

            if (i_3 == 3) {
               Client.field892 = 32;
            }

            if (i_3 == 4) {
               Client.field892 = 0;
            }
         }

         if (i_5 == 17) {
            Client.field825 = i_3 & 0xffff;
         }

         if (i_5 == 18) {
            Client.field678 = (class84) MemoryManager.findById(class233.method4141((byte) -27), i_3);
            if (Client.field678 == null) {
               Client.field678 = class84.field1173;
            }
         }

         if (i_5 == 19) {
            if (i_3 == -1) {
               Client.field781 = -1;
            } else {
               Client.field781 = i_3 & 0x7ff;
            }
         }

         if (i_5 == 22) {
            Client.field679 = (class84) MemoryManager.findById(class233.method4141((byte) 48), i_3);
            if (Client.field679 == null) {
               Client.field679 = class84.field1173;
            }
         }

      }
   }

}
