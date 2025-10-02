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
         int i_3 = class212.field2525[i_0];
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

            if (s_4 != client.field911) {
               if (client.field911 == 0 && client.field889 != -1) {
                  class169.method3503(class29.field253, client.field889, 0, s_4, false, 210229460);
                  client.field699 = false;
               } else if (s_4 == 0) {
                  class171.method3553(401790387);
                  client.field699 = false;
               } else if (class197.field2402 != 0) {
                  class56.field529 = s_4;
               } else {
                  class76.field1099.method3706(s_4, 1964595873);
               }

               client.field911 = s_4;
            }
         }

         if (i_5 == 4) {
            if (i_3 == 0) {
               client.field891 = 127;
            }

            if (i_3 == 1) {
               client.field891 = 96;
            }

            if (i_3 == 2) {
               client.field891 = 64;
            }

            if (i_3 == 3) {
               client.field891 = 32;
            }

            if (i_3 == 4) {
               client.field891 = 0;
            }
         }

         if (i_5 == 5) {
            client.field789 = i_3;
         }

         if (i_5 == 6) {
            client.field819 = i_3;
         }

         if (i_5 == 9) {
            client.field809 = i_3;
         }

         if (i_5 == 10) {
            if (i_3 == 0) {
               client.field892 = 127;
            }

            if (i_3 == 1) {
               client.field892 = 96;
            }

            if (i_3 == 2) {
               client.field892 = 64;
            }

            if (i_3 == 3) {
               client.field892 = 32;
            }

            if (i_3 == 4) {
               client.field892 = 0;
            }
         }

         if (i_5 == 17) {
            client.field825 = i_3 & 0xffff;
         }

         if (i_5 == 18) {
            client.field678 = (class84) class107.method2476(class233.method4141((byte) -27), i_3);
            if (client.field678 == null) {
               client.field678 = class84.field1173;
            }
         }

         if (i_5 == 19) {
            if (i_3 == -1) {
               client.field781 = -1;
            } else {
               client.field781 = i_3 & 0x7ff;
            }
         }

         if (i_5 == 22) {
            client.field679 = (class84) class107.method2476(class233.method4141((byte) 48), i_3);
            if (client.field679 == null) {
               client.field679 = class84.field1173;
            }
         }

      }
   }

}
