import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class54 implements MouseListener, MouseMotionListener, FocusListener {

   static int field499;
   public static class54 field479 = new class54();
   public static volatile int field480 = 0;
   public static volatile int field481 = 0;
   public static volatile int field488 = -1;
   public static volatile int field477 = -1;
   public static volatile long field484 = -1L;
   public static int field485 = 0;
   public static int field492 = 0;
   public static int field487 = 0;
   public static long field482 = 0L;
   public static volatile int field489 = 0;
   public static volatile int field490 = 0;
   public static volatile int field491 = 0;
   public static volatile long field500 = 0L;
   public static int field493 = 0;
   public static int field483 = 0;
   public static int field495 = 0;
   public static long field497 = 0L;

   public final synchronized void mouseMoved(MouseEvent mouseevent_1) {
      if (field479 != null) {
         field480 = 0;
         field488 = mouseevent_1.getX();
         field477 = mouseevent_1.getY();
         field484 = mouseevent_1.getWhen();
      }

   }

   final int method1007(MouseEvent mouseevent_1, int i_2) {
      int i_3 = mouseevent_1.getButton();
      return !mouseevent_1.isAltDown() && i_3 != 2 ? (!mouseevent_1.isMetaDown() && i_3 != 3 ? 1 : 2) : 4;
   }

   public final synchronized void mousePressed(MouseEvent mouseevent_1) {
      if (field479 != null) {
         field480 = 0;
         field490 = mouseevent_1.getX();
         field491 = mouseevent_1.getY();
         field500 = TimeUtils.getAdjustedTimeMillis();
         field489 = this.method1007(mouseevent_1, -1900631244);
         if (field489 != 0) {
            field481 = field489;
         }
      }

      if (mouseevent_1.isPopupTrigger()) {
         mouseevent_1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent mouseevent_1) {
      if (field479 != null) {
         field480 = 0;
         field481 = 0;
      }

      if (mouseevent_1.isPopupTrigger()) {
         mouseevent_1.consume();
      }

   }

   public final void mouseClicked(MouseEvent mouseevent_1) {
      if (mouseevent_1.isPopupTrigger()) {
         mouseevent_1.consume();
      }

   }

   public final synchronized void mouseDragged(MouseEvent mouseevent_1) {
      this.mouseMoved(mouseevent_1);
   }

   public final synchronized void focusLost(FocusEvent focusevent_1) {
      if (field479 != null) {
         field481 = 0;
      }

   }

   public final synchronized void mouseExited(MouseEvent mouseevent_1) {
      if (field479 != null) {
         field480 = 0;
         field488 = -1;
         field477 = -1;
         field484 = mouseevent_1.getWhen();
      }

   }

   public final void focusGained(FocusEvent focusevent_1) {
   }

   public final synchronized void mouseEntered(MouseEvent mouseevent_1) {
      this.mouseMoved(mouseevent_1);
   }

   public static int method1009(int i_0, int i_1) {
      int i_3;
      for (i_3 = 1; i_1 > 1; i_1 >>= 1) {
         if ((i_1 & 0x1) != 0) {
            i_3 = i_0 * i_3;
         }

         i_0 *= i_0;
      }

      if (i_1 == 1) {
         return i_0 * i_3;
      } else {
         return i_3;
      }
   }

   static final void method1037(class299 class299_0) {
      int i_2 = 0;
      class299_0.method5438();

      int i_3;
      int i_4;
      int i_5;
      for (i_3 = 0; i_3 < class89.field1255; i_3++) {
         i_4 = class89.field1257[i_3];
         if ((class89.field1252[i_4] & 0x1) == 0) {
            if (i_2 > 0) {
               --i_2;
               class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
            } else {
               i_5 = class299_0.method5445(1);
               if (i_5 == 0) {
                  i_2 = class71.method1686(class299_0);
                  class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
               } else {
                  class18.method210(class299_0, i_4, 164873785);
               }
            }
         }
      }

      class299_0.method5446();
      if (i_2 != 0) {
         throw new RuntimeException();
      } else {
         class299_0.method5438();

         for (i_3 = 0; i_3 < class89.field1255; i_3++) {
            i_4 = class89.field1257[i_3];
            if ((class89.field1252[i_4] & 0x1) != 0) {
               if (i_2 > 0) {
                  --i_2;
                  class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
               } else {
                  i_5 = class299_0.method5445(1);
                  if (i_5 == 0) {
                     i_2 = class71.method1686(class299_0);
                     class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
                  } else {
                     class18.method210(class299_0, i_4, 164873785);
                  }
               }
            }
         }

         class299_0.method5446();
         if (i_2 != 0) {
            throw new RuntimeException();
         } else {
            class299_0.method5438();

            for (i_3 = 0; i_3 < class89.field1251; i_3++) {
               i_4 = class89.field1258[i_3];
               if ((class89.field1252[i_4] & 0x1) != 0) {
                  if (i_2 > 0) {
                     --i_2;
                     class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
                  } else {
                     i_5 = class299_0.method5445(1);
                     if (i_5 == 0) {
                        i_2 = class71.method1686(class299_0);
                        class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
                     } else if (class226.method4123(class299_0, i_4, -352047926)) {
                        class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
                     }
                  }
               }
            }

            class299_0.method5446();
            if (i_2 != 0) {
               throw new RuntimeException();
            } else {
               class299_0.method5438();

               for (i_3 = 0; i_3 < class89.field1251; i_3++) {
                  i_4 = class89.field1258[i_3];
                  if ((class89.field1252[i_4] & 0x1) == 0) {
                     if (i_2 > 0) {
                        --i_2;
                        class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
                     } else {
                        i_5 = class299_0.method5445(1);
                        if (i_5 == 0) {
                           i_2 = class71.method1686(class299_0);
                           class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
                        } else if (class226.method4123(class299_0, i_4, -352047926)) {
                           class89.field1252[i_4] = (byte)(class89.field1252[i_4] | 0x2);
                        }
                     }
                  }
               }

               class299_0.method5446();
               if (i_2 != 0) {
                  throw new RuntimeException();
               } else {
                  class89.field1255 = 0;
                  class89.field1251 = 0;

                  for (i_3 = 1; i_3 < 2048; i_3++) {
                     class89.field1252[i_3] = (byte)(class89.field1252[i_3] >> 1);
                     class66 class66_6 = Client.field909[i_3];
                     if (class66_6 != null) {
                        class89.field1257[++class89.field1255 - 1] = i_3;
                     } else {
                        class89.field1258[++class89.field1251 - 1] = i_3;
                     }
                  }

               }
            }
         }
      }
   }

   static void method1039(byte b_0) {
      class85.field1209 = 24;
      class268.loginResponseMessages("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
   }

   static final int method1021(int i_0, int i_1, int i_2) {
      int i_3 = i_0 + i_1 * 57;
      i_3 ^= i_3 << 13;
      int i_4 = (i_3 * i_3 * 15731 + 789221) * i_3 + 1376312589 & 0x7fffffff;
      return i_4 >> 19 & 0xff;
   }

}
