public class class152 extends class275 {

   final boolean field1975;

   public class152(boolean bool_1) {
      this.field1975 = bool_1;
   }

   int method3384(class279 class279_1, class279 class279_2, int i_3) {
      return client.field807 == class279_1.field3636 && class279_2.field3636 == client.field807 ? (this.field1975 ? class279_1.method5041(-156755920).method5198(class279_2.method5041(-156755920), (byte) -28) : class279_2.method5041(-156755920).method5198(class279_1.method5041(-156755920), (byte) -73)) : this.method5061(class279_1, class279_2, 191415789);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3384((class279) object_1, (class279) object_2, 1918476759);
   }

   static class310[] method3383(int i_0) {
      return new class310[] {class310.field3817, class310.field3816, class310.field3818};
   }

   static int method3389(int i_0, class92 class92_1, boolean bool_2, short s_3) {
      boolean bool_4 = true;
      class217 class217_5;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         class217_5 = class80.fetchSomething(class76.field1098[--class70.field1014]);
         bool_4 = false;
      } else {
         class217_5 = bool_2 ? class76.field1111 : class207.field2507;
      }

      int i_12;
      if (i_0 == 1300) {
         i_12 = class76.field1098[--class70.field1014] - 1;
         if (i_12 >= 0 && i_12 <= 9) {
            class217_5.method4041(i_12, class76.field1093[--class221.field2747], (short) -20428);
            return 1;
         } else {
            --class221.field2747;
            return 1;
         }
      } else {
         int i_7;
         if (i_0 == 1301) {
            class70.field1014 -= 2;
            i_12 = class76.field1098[class70.field1014];
            i_7 = class76.field1098[class70.field1014 + 1];
            class217_5.field2645 = client.method1649(i_12, i_7, -1376178564);
            return 1;
         } else if (i_0 == 1302) {
            class217_5.field2648 = class76.field1098[--class70.field1014] == 1;
            return 1;
         } else if (i_0 == 1303) {
            class217_5.field2646 = class76.field1098[--class70.field1014];
            return 1;
         } else if (i_0 == 1304) {
            class217_5.field2647 = class76.field1098[--class70.field1014];
            return 1;
         } else if (i_0 == 1305) {
            class217_5.field2643 = class76.field1093[--class221.field2747];
            return 1;
         } else if (i_0 == 1306) {
            class217_5.field2657 = class76.field1093[--class221.field2747];
            return 1;
         } else if (i_0 == 1307) {
            class217_5.field2644 = null;
            return 1;
         } else if (i_0 == 1308) {
            class217_5.field2691 = class76.field1098[--class70.field1014] == 1;
            return 1;
         } else {
            int i_8;
            byte[] bytes_10;
            if (i_0 != 1350) {
               byte b_6;
               if (i_0 == 1351) {
                  class70.field1014 -= 2;
                  b_6 = 10;
                  bytes_10 = new byte[] {(byte)class76.field1098[class70.field1014]};
                  byte[] bytes_11 = new byte[] {(byte)class76.field1098[class70.field1014 + 1]};
                  class257.method4756(class217_5, b_6, bytes_10, bytes_11, 610677249);
                  return 1;
               } else if (i_0 == 1352) {
                  class70.field1014 -= 3;
                  i_12 = class76.field1098[class70.field1014] - 1;
                  i_7 = class76.field1098[class70.field1014 + 1];
                  i_8 = class76.field1098[class70.field1014 + 2];
                  if (i_12 >= 0 && i_12 <= 9) {
                     class14.method153(class217_5, i_12, i_7, i_8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (i_0 == 1353) {
                  b_6 = 10;
                  i_7 = class76.field1098[--class70.field1014];
                  i_8 = class76.field1098[--class70.field1014];
                  class14.method153(class217_5, b_6, i_7, i_8);
                  return 1;
               } else if (i_0 == 1354) {
                  --class70.field1014;
                  i_12 = class76.field1098[class70.field1014] - 1;
                  if (i_12 >= 0 && i_12 <= 9) {
                     class35.method600(class217_5, i_12, (byte) 75);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (i_0 == 1355) {
                  b_6 = 10;
                  class35.method600(class217_5, b_6, (byte) 67);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] bytes_9 = null;
               bytes_10 = null;
               if (bool_4) {
                  class70.field1014 -= 10;

                  for (i_8 = 0; i_8 < 10 && class76.field1098[i_8 + class70.field1014] >= 0; i_8 += 2) {
                     ;
                  }

                  if (i_8 > 0) {
                     bytes_9 = new byte[i_8 / 2];
                     bytes_10 = new byte[i_8 / 2];

                     for (i_8 -= 2; i_8 >= 0; i_8 -= 2) {
                        bytes_9[i_8 / 2] = (byte)class76.field1098[i_8 + class70.field1014];
                        bytes_10[i_8 / 2] = (byte)class76.field1098[i_8 + class70.field1014 + 1];
                     }
                  }
               } else {
                  class70.field1014 -= 2;
                  bytes_9 = new byte[] {(byte)class76.field1098[class70.field1014]};
                  bytes_10 = new byte[] {(byte)class76.field1098[class70.field1014 + 1]};
               }

               i_8 = class76.field1098[--class70.field1014] - 1;
               if (i_8 >= 0 && i_8 <= 9) {
                  class257.method4756(class217_5, i_8, bytes_9, bytes_10, 861360409);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

}
