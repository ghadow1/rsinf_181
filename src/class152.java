public class class152 extends ChainedComparator {

   final boolean field1975;

   public class152(boolean bool_1) {
      this.field1975 = bool_1;
   }

   static class310[] method3383() {
      return new class310[] {class310.field3817, class310.field3816, class310.field3818};
   }

   static int method3389(int i_0, boolean bool_2) {
      boolean bool_4 = true;
      Widget widget_5;
      if (i_0 >= 2000) {
         i_0 -= 1000;
         widget_5 = WorldMapElement.getWidget(MouseRecorder.field1098[--class70.field1014]);
         bool_4 = false;
      } else {
         widget_5 = bool_2 ? MouseRecorder.field1111 : class207.field2507;
      }

      int i_12;
      if (i_0 == 1300) {
         i_12 = MouseRecorder.field1098[--class70.field1014] - 1;
         if (i_12 >= 0 && i_12 <= 9) {
            widget_5.method4041(i_12, MouseRecorder.field1093[--class221.field2747]);
            return 1;
         } else {
            --class221.field2747;
            return 1;
         }
      } else {
         int i_7;
         if (i_0 == 1301) {
            class70.field1014 -= 2;
            i_12 = MouseRecorder.field1098[class70.field1014];
            i_7 = MouseRecorder.field1098[class70.field1014 + 1];
            widget_5.field2645 = Client.method1649(i_12, i_7);
            return 1;
         } else if (i_0 == 1302) {
            widget_5.field2648 = MouseRecorder.field1098[--class70.field1014] == 1;
            return 1;
         } else if (i_0 == 1303) {
            widget_5.field2646 = MouseRecorder.field1098[--class70.field1014];
            return 1;
         } else if (i_0 == 1304) {
            widget_5.field2647 = MouseRecorder.field1098[--class70.field1014];
            return 1;
         } else if (i_0 == 1305) {
            widget_5.field2643 = MouseRecorder.field1093[--class221.field2747];
            return 1;
         } else if (i_0 == 1306) {
            widget_5.field2657 = MouseRecorder.field1093[--class221.field2747];
            return 1;
         } else if (i_0 == 1307) {
            widget_5.field2644 = null;
            return 1;
         } else if (i_0 == 1308) {
            widget_5.field2691 = MouseRecorder.field1098[--class70.field1014] == 1;
            return 1;
         } else {
            int i_8;
            byte[] bytes_10;
            if (i_0 != 1350) {
               byte b_6;
               if (i_0 == 1351) {
                  class70.field1014 -= 2;
                  b_6 = 10;
                  bytes_10 = new byte[]{(byte) MouseRecorder.field1098[class70.field1014]};
                  byte[] bytes_11 = new byte[]{(byte) MouseRecorder.field1098[class70.field1014 + 1]};
                  class257.method4756(widget_5, b_6, bytes_10, bytes_11, 610677249);
                  return 1;
               } else if (i_0 == 1352) {
                  class70.field1014 -= 3;
                  i_12 = MouseRecorder.field1098[class70.field1014] - 1;
                  i_7 = MouseRecorder.field1098[class70.field1014 + 1];
                  i_8 = MouseRecorder.field1098[class70.field1014 + 2];
                  if (i_12 >= 0 && i_12 <= 9) {
                     MilliClock.method153(widget_5, i_12, i_7, i_8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (i_0 == 1353) {
                  b_6 = 10;
                  i_7 = MouseRecorder.field1098[--class70.field1014];
                  i_8 = MouseRecorder.field1098[--class70.field1014];
                  MilliClock.method153(widget_5, b_6, i_7, i_8);
                  return 1;
               } else if (i_0 == 1354) {
                  --class70.field1014;
                  i_12 = MouseRecorder.field1098[class70.field1014] - 1;
                  if (i_12 >= 0 && i_12 <= 9) {
                     WorldMapCacheName.method600(widget_5, i_12);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (i_0 == 1355) {
                  b_6 = 10;
                  WorldMapCacheName.method600(widget_5, b_6);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] bytes_9 = null;
               bytes_10 = null;
               if (bool_4) {
                  class70.field1014 -= 10;

                  for (i_8 = 0; i_8 < 10 && MouseRecorder.field1098[i_8 + class70.field1014] >= 0; i_8 += 2) {
                     ;
                  }

                  if (i_8 > 0) {
                     bytes_9 = new byte[i_8 / 2];
                     bytes_10 = new byte[i_8 / 2];

                     for (i_8 -= 2; i_8 >= 0; i_8 -= 2) {
                        bytes_9[i_8 / 2] = (byte) MouseRecorder.field1098[i_8 + class70.field1014];
                        bytes_10[i_8 / 2] = (byte) MouseRecorder.field1098[i_8 + class70.field1014 + 1];
                     }
                  }
               } else {
                  class70.field1014 -= 2;
                  bytes_9 = new byte[]{(byte) MouseRecorder.field1098[class70.field1014]};
                  bytes_10 = new byte[]{(byte) MouseRecorder.field1098[class70.field1014 + 1]};
               }

               i_8 = MouseRecorder.field1098[--class70.field1014] - 1;
               if (i_8 >= 0 && i_8 <= 9) {
                  class257.method4756(widget_5, i_8, bytes_9, bytes_10, 861360409);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   int method3384(Categorizable categorizable_1, Categorizable categorizable_2) {
      return Client.field807 == categorizable_1.category && categorizable_2.category == Client.field807 ? (this.field1975 ? categorizable_1.method5041().method5198(categorizable_2.method5041()) : categorizable_2.method5041().method5198(categorizable_1.method5041())) : this.compareWithNext(categorizable_1, categorizable_2);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3384((Categorizable) object_1, (Categorizable) object_2);
   }

}
