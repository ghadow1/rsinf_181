import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class class45 implements KeyListener, FocusListener {

   public static class45 field392 = new class45();
   public static boolean[] field395 = new boolean[112];
   public static int[] field391 = new int[128];
   public static int field388 = 0;
   public static int field398 = 0;
   static char[] field399 = new char[128];
   static int[] field400 = new int[128];
   public static int[] field401 = new int[128];
   public static int field386 = 0;
   public static int field396 = 0;
   public static int field404 = 0;
   public static int field385 = 0;
   public static volatile int field406 = 0;
   static int[] field407 = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

   public final synchronized void keyPressed(KeyEvent keyevent_1) {
      if (field392 != null) {
         int i_2 = keyevent_1.getKeyCode();
         if (i_2 >= 0 && i_2 < field407.length) {
            i_2 = field407[i_2];
            if ((i_2 & 0x80) != 0) {
               i_2 = -1;
            }
         } else {
            i_2 = -1;
         }

         if (field398 >= 0 && i_2 >= 0) {
            field391[field398] = i_2;
            field398 = field398 + 1 & 0x7f;
            if (field398 == field388) {
               field398 = -1;
            }
         }

         int i_3;
         if (i_2 >= 0) {
            i_3 = field404 + 1 & 0x7f;
            if (i_3 != field396) {
               field400[field404] = i_2;
               field399[field404] = 0;
               field404 = i_3;
            }
         }

         i_3 = keyevent_1.getModifiers();
         if ((i_3 & 0xa) != 0 || i_2 == 85 || i_2 == 10) {
            keyevent_1.consume();
         }
      }

   }

   public final synchronized void keyReleased(KeyEvent keyevent_1) {
      if (field392 != null) {
         int i_2 = keyevent_1.getKeyCode();
         if (i_2 >= 0 && i_2 < field407.length) {
            i_2 = field407[i_2] & ~0x80;
         } else {
            i_2 = -1;
         }

         if (field398 >= 0 && i_2 >= 0) {
            field391[field398] = ~i_2;
            field398 = field398 + 1 & 0x7f;
            if (field388 == field398) {
               field398 = -1;
            }
         }
      }

      keyevent_1.consume();
   }

   public final void focusGained(FocusEvent focusevent_1) {
   }

   public final synchronized void focusLost(FocusEvent focusevent_1) {
      if (field392 != null) {
         field398 = -1;
      }

   }

   public final void keyTyped(KeyEvent keyevent_1) {
      if (field392 != null) {
         char var_2 = keyevent_1.getKeyChar();
         if (var_2 != 0 && var_2 != 65535 && class240.method4366(var_2, -17259877)) {
            int i_3 = field404 + 1 & 0x7f;
            if (i_3 != field396) {
               field400[field404] = -1;
               field399[field404] = var_2;
               field404 = i_3;
            }
         }
      }

      keyevent_1.consume();
   }

   static final void method801(int i_0) {
      if (class7.field49) {
         if (class46.field410 != null) {
            class46.field410.method5133((short) 128);
         }

         for (int i_1 = 0; i_1 < class89.field1255; i_1++) {
            class66 class66_2 = client.field909[class89.field1257[i_1]];
            class66_2.method1185(-2115191954);
         }

         class7.field49 = false;
      }

   }

   public static void method794(class233 class233_0, int i_1) {
      class249.field3307 = class233_0;
   }

   static void method787(int i_0) {
      class55.field504 = null;
      class55.field505 = null;
      class55.field506 = null;
      class268.field3561 = null;
      class137.field1887 = null;
      class32.field282 = null;
      class55.field515 = null;
      class229.field3103 = null;
      class55.field508 = null;
      class55.field507 = null;
      class93.field1301 = null;
      class293.field3689 = null;
   }

}
