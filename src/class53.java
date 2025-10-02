import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class class53 extends Applet implements Runnable, FocusListener, WindowListener {

   Frame field441;
   int field476;
   int field459;
   static class53 field442 = null;
   static int field466 = 0;
   static long field444 = 0L;
   static boolean field445 = false;
   static int field448 = 20;
   static int field443 = 1;
   protected static int field462 = 0;
   static long[] field452 = new long[32];
   static long[] field453 = new long[32];
   static int field465 = 500;
   static volatile boolean field472 = true;
   static long field458 = -1L;
   static long field474 = -1L;
   boolean field446 = false;
   int field456 = 0;
   int field451 = 0;
   volatile boolean field464 = true;
   boolean field450 = false;
   volatile boolean field467 = false;
   volatile long field468 = 0L;
   final EventQueue field471;
   Canvas field460;
   protected int field454;
   protected int field455;
   class44 field469;
   protected static class166 field463;
   Clipboard field470;
   int field473;
   int field461;
   static class170 field447;
   static int field449;

   protected class53() {
      EventQueue eventqueue_1 = null;

      try {
         eventqueue_1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable throwable_3) {
         ;
      }

      this.field471 = eventqueue_1;
      class46 class46_2 = new class46();
      class32.field277 = class46_2;
   }

   public final synchronized void paint(Graphics graphics_1) {
      if (this == field442 && !field445) {
         this.field464 = true;
         if (class206.getAdjustedTimeMillis() - this.field468 > 1000L) {
            Rectangle rectangle_2 = graphics_1.getClipBounds();
            if (rectangle_2 == null || rectangle_2.width >= class7.field46 && rectangle_2.height >= class249.field3308) {
               this.field467 = true;
            }
         }

      }
   }

   protected final boolean getHost() {
      String string_2 = this.getDocumentBase().getHost().toLowerCase();
      if (!string_2.equals("jagex.com") && !string_2.endsWith(".jagex.com")) {
         if (!string_2.equals("runescape.com") && !string_2.endsWith(".runescape.com")) {
            if (string_2.endsWith("127.0.0.1")) {
               return true;
            } else {
               while (string_2.length() > 0 && string_2.charAt(string_2.length() - 1) >= 48 && string_2.charAt(string_2.length() - 1) <= 57) {
                  string_2 = string_2.substring(0, string_2.length() - 1);
               }

               if (string_2.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.loadingError("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public final void destroy() {
      if (this == field442 && !field445) {
         field444 = class206.getAdjustedTimeMillis();
         class251.method4550(5000L);
         this.method891();
      }
   }

   class319 method903() {
      Container container_2 = this.method902();
      int i_3 = Math.max(container_2.getWidth(), this.field476);
      int i_4 = Math.max(container_2.getHeight(), this.field459);
      if (this.field441 != null) {
         Insets insets_5 = this.field441.getInsets();
         i_3 -= insets_5.left + insets_5.right;
         i_4 -= insets_5.bottom + insets_5.top;
      }

      return new class319(i_3, i_4);
   }

   Container method902() {
      return (Container) (this.field441 != null ? this.field441 : this) ;
   }

   protected void loadingError(String string_1) {
      if (!this.field446) {
         this.field446 = true;
         System.out.println("error_game_" + string_1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + string_1 + ".ws"), "_self");
         } catch (Exception exception_4) {
            ;
         }

      }
   }

   final void method890() {
      this.field450 = true;
   }

   final synchronized void method891() {
      if (!field445) {
         field445 = true;

         try {
            this.field460.removeFocusListener(this);
         } catch (Exception exception_6) {
            ;
         }

         try {
            this.vmethod1608(1344457794);
         } catch (Exception exception_5) {
            ;
         }

         if (this.field441 != null) {
            try {
               System.exit(0);
            } catch (Throwable throwable_4) {
               ;
            }
         }

         if (field463 != null) {
            try {
               field463.method3469();
            } catch (Exception exception_3) {
               ;
            }
         }

         this.vmethod1273(-779141254);
      }
   }

   final synchronized void method1003() {
      Container container_2 = this.method902();
      if (this.field460 != null) {
         this.field460.removeFocusListener(this);
         container_2.remove(this.field460);
      }

      class7.field46 = Math.max(container_2.getWidth(), this.field476);
      class249.field3308 = Math.max(container_2.getHeight(), this.field459);
      Insets insets_3;
      if (this.field441 != null) {
         insets_3 = this.field441.getInsets();
         class7.field46 -= insets_3.right + insets_3.left;
         class249.field3308 -= insets_3.top + insets_3.bottom;
      }

      this.field460 = new class48(this);
      container_2.setBackground(Color.BLACK);
      container_2.setLayout((LayoutManager) null);
      container_2.add(this.field460);
      this.field460.setSize(class7.field46, class249.field3308);
      this.field460.setVisible(true);
      this.field460.setBackground(Color.BLACK);
      if (container_2 == this.field441) {
         insets_3 = this.field441.getInsets();
         this.field460.setLocation(this.field456 + insets_3.left, insets_3.top + this.field451);
      } else {
         this.field460.setLocation(this.field456, this.field451);
      }

      this.field460.addFocusListener(this);
      this.field460.requestFocus();
      this.field464 = true;
      if (class202.field2486 != null && class7.field46 == class202.field2486.field3877 && class249.field3308 == class202.field2486.field3878) {
         ((class52) class202.field2486).method856(this.field460, (byte) 0);
         class202.field2486.vmethod6077(0, 0, -1942972544);
      } else {
         class202.field2486 = new class52(class7.field46, class249.field3308, this.field460);
      }

      this.field467 = false;
      this.field468 = class206.getAdjustedTimeMillis();
   }

   protected abstract void vmethod1608(int var1);

   final void method882(int i_1) {
      Container container_2 = this.method902();
      if (container_2 != null) {
         class319 class319_3 = this.method903();
         this.field454 = Math.max(class319_3.field3865, this.field476);
         this.field455 = Math.max(class319_3.field3866, this.field459);
         if (this.field454 <= 0) {
            this.field454 = 1;
         }

         if (this.field455 <= 0) {
            this.field455 = 1;
         }

         class7.field46 = Math.min(this.field454, this.field473);
         class249.field3308 = Math.min(this.field455, this.field461);
         this.field456 = (this.field454 - class7.field46) / 2;
         this.field451 = 0;
         this.field460.setSize(class7.field46, class249.field3308);
         class202.field2486 = new class52(class7.field46, class249.field3308, this.field460);
         if (container_2 == this.field441) {
            Insets insets_4 = this.field441.getInsets();
            this.field460.setLocation(insets_4.left + this.field456, this.field451 + insets_4.top);
         } else {
            this.field460.setLocation(this.field456, this.field451);
         }

         this.field464 = true;
         this.vmethod1252(869486116);
      }
   }

   protected abstract void vmethod1243(int var1);

   protected abstract void vmethod1273(int var1);

   protected final void method885(byte b_1) {
      class232.field3125 = null;
      class313.field3844 = null;
      class12.field80 = null;
   }

   protected final void method899(int i_1, String string_2, boolean bool_3, byte b_4) {
      try {
         Graphics graphics_5 = this.field460.getGraphics();
         if (class313.field3844 == null) {
            class313.field3844 = new Font("Helvetica", 1, 13);
            class12.field80 = this.field460.getFontMetrics(class313.field3844);
         }

         if (bool_3) {
            graphics_5.setColor(Color.black);
            graphics_5.fillRect(0, 0, class7.field46, class249.field3308);
         }

         Color color_6 = new Color(140, 17, 17);

         try {
            if (class232.field3125 == null) {
               class232.field3125 = this.field460.createImage(304, 34);
            }

            Graphics graphics_7 = class232.field3125.getGraphics();
            graphics_7.setColor(color_6);
            graphics_7.drawRect(0, 0, 303, 33);
            graphics_7.fillRect(2, 2, i_1 * 3, 30);
            graphics_7.setColor(Color.black);
            graphics_7.drawRect(1, 1, 301, 31);
            graphics_7.fillRect(i_1 * 3 + 2, 2, 300 - i_1 * 3, 30);
            graphics_7.setFont(class313.field3844);
            graphics_7.setColor(Color.white);
            graphics_7.drawString(string_2, (304 - class12.field80.stringWidth(string_2)) / 2, 22);
            graphics_5.drawImage(class232.field3125, class7.field46 / 2 - 152, class249.field3308 / 2 - 18, (ImageObserver) null);
         } catch (Exception exception_10) {
            int i_8 = class7.field46 / 2 - 152;
            int i_9 = class249.field3308 / 2 - 18;
            graphics_5.setColor(color_6);
            graphics_5.drawRect(i_8, i_9, 303, 33);
            graphics_5.fillRect(i_8 + 2, i_9 + 2, i_1 * 3, 30);
            graphics_5.setColor(Color.black);
            graphics_5.drawRect(i_8 + 1, i_9 + 1, 301, 31);
            graphics_5.fillRect(i_8 + i_1 * 3 + 2, i_9 + 2, 300 - i_1 * 3, 30);
            graphics_5.setFont(class313.field3844);
            graphics_5.setColor(Color.white);
            graphics_5.drawString(string_2, i_8 + (304 - class12.field80.stringWidth(string_2)) / 2, i_9 + 22);
         }
      } catch (Exception exception_11) {
         this.field460.repaint();
      }

   }

   protected abstract void vmethod1599(byte var1);

   void method910(int i_1) {
      Container container_2 = this.method902();
      long long_3 = class206.getAdjustedTimeMillis();
      long long_5 = field452[class238.field3192];
      field452[class238.field3192] = long_3;
      class238.field3192 = class238.field3192 + 1 & 0x1f;
      if (long_5 != 0L && long_3 > long_5) {
         int i_7 = (int)(long_3 - long_5);
         field462 = ((i_7 >> 1) + 32000) / i_7;
      }

      if (++field465 - 1 > 50) {
         field465 -= 50;
         this.field464 = true;
         this.field460.setSize(class7.field46, class249.field3308);
         this.field460.setVisible(true);
         if (container_2 == this.field441) {
            Insets insets_8 = this.field441.getInsets();
            this.field460.setLocation(this.field456 + insets_8.left, insets_8.top + this.field451);
         } else {
            this.field460.setLocation(this.field456, this.field451);
         }
      }

      if (this.field467) {
         this.method908();
      }

      this.method970(-2058666477);
      this.vmethod1493(this.field464, (byte) -5);
      if (this.field464) {
         this.method927((byte) -42);
      }

      this.field464 = false;
   }

   void method953(int i_1) {
      long long_2 = class206.getAdjustedTimeMillis();
      long long_4 = field453[class243.field3248];
      field453[class243.field3248] = long_2;
      class243.field3248 = class243.field3248 + 1 & 0x1f;
      if (long_4 != 0L && long_2 > long_4) {
         ;
      }

      synchronized(this) {
         class267.field3557 = field472;
      }

      this.vmethod1599((byte) -3);
   }

   final void method968(Object object_1, int i_2) {
      if (this.field471 != null) {
         for (int i_3 = 0; i_3 < 50 && this.field471.peekEvent() != null; i_3++) {
            class251.method4550(1L);
         }

         if (object_1 != null) {
            this.field471.postEvent(new ActionEvent(object_1, 1001, "dummy"));
         }

      }
   }

   protected final void method972(int i_1) {
      if (class166.field2029.toLowerCase().indexOf("microsoft") != -1) {
         class45.field407[186] = 57;
         class45.field407[187] = 27;
         class45.field407[188] = 71;
         class45.field407[189] = 26;
         class45.field407[190] = 72;
         class45.field407[191] = 73;
         class45.field407[192] = 58;
         class45.field407[219] = 42;
         class45.field407[220] = 74;
         class45.field407[221] = 43;
         class45.field407[222] = 59;
         class45.field407[223] = 28;
      } else {
         class45.field407[44] = 71;
         class45.field407[45] = 26;
         class45.field407[46] = 72;
         class45.field407[47] = 73;
         class45.field407[59] = 57;
         class45.field407[61] = 27;
         class45.field407[91] = 42;
         class45.field407[92] = 74;
         class45.field407[93] = 43;
         class45.field407[192] = 28;
         class45.field407[222] = 58;
         class45.field407[520] = 59;
      }

      class81.method1990(this.field460);
   }

   protected final void method932(int i_1) {
      class18.method200(this.field460, (byte) 103);
   }

   protected class168 method877(byte b_1) {
      if (this.field469 == null) {
         this.field469 = new class44();
         this.field469.method772(this.field460, (byte) 31);
      }

      return this.field469;
   }

   protected final void method996(int i_1, int i_2, int i_3, int i_4) {
      try {
         if (field442 != null) {
            ++field466;
            if (field466 >= 3) {
               this.loadingError("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field442 = this;
         class7.field46 = i_1;
         class249.field3308 = i_2;
         class341.field4065 = i_3;
         class341.field4064 = this;
         if (field463 == null) {
            field463 = new class166();
         }

         field463.method3472(this, 1, 193419386);
      } catch (Exception exception_6) {
         class252.method4556((String) null, exception_6, (byte) 89);
         this.loadingError("crash");
      }

   }

   protected void method878() {
      this.field470 = this.getToolkit().getSystemClipboard();
   }

   protected final void method988(int i_1, int i_2) {
      if (this.field473 != i_1 || i_2 != this.field461) {
         this.method890();
      }

      this.field473 = i_1;
      this.field461 = i_2;
   }

   protected abstract void vmethod1252(int var1);

   final void method908() {
      Canvas canvas_2 = this.field460;
      canvas_2.removeKeyListener(class45.field392);
      canvas_2.removeFocusListener(class45.field392);
      class45.field398 = -1;
      Canvas canvas_3 = this.field460;
      canvas_3.removeMouseListener(class54.field479);
      canvas_3.removeMouseMotionListener(class54.field479);
      canvas_3.removeFocusListener(class54.field479);
      class54.field481 = 0;
      if (this.field469 != null) {
         this.field469.method773(this.field460, -325226469);
      }

      this.method1003();
      class81.method1990(this.field460);
      class18.method200(this.field460, (byte) 109);
      if (this.field469 != null) {
         this.field469.method772(this.field460, (byte) 13);
      }

      this.method890();
   }

   final void method970(int i_1) {
      class319 class319_2 = this.method903();
      if (this.field454 != class319_2.field3865 || class319_2.field3866 != this.field455 || this.field450) {
         this.method882(-517749579);
         this.field450 = false;
      }

   }

   protected abstract void vmethod1493(boolean var1, byte var2);

   void method927(byte b_1) {
      int i_2 = this.field456;
      int i_3 = this.field451;
      int i_4 = this.field454 - class7.field46 - i_2;
      int i_5 = this.field455 - class249.field3308 - i_3;
      if (i_2 > 0 || i_4 > 0 || i_3 > 0 || i_5 > 0) {
         try {
            Container container_6 = this.method902();
            int i_7 = 0;
            int i_8 = 0;
            if (container_6 == this.field441) {
               Insets insets_9 = this.field441.getInsets();
               i_7 = insets_9.left;
               i_8 = insets_9.top;
            }

            Graphics graphics_11 = container_6.getGraphics();
            graphics_11.setColor(Color.black);
            if (i_2 > 0) {
               graphics_11.fillRect(i_7, i_8, i_2, this.field455);
            }

            if (i_3 > 0) {
               graphics_11.fillRect(i_7, i_8, this.field454, i_3);
            }

            if (i_4 > 0) {
               graphics_11.fillRect(i_7 + this.field454 - i_4, i_8, i_4, this.field455);
            }

            if (i_5 > 0) {
               graphics_11.fillRect(i_7, i_8 + this.field455 - i_5, this.field454, i_5);
            }
         } catch (Exception exception_10) {
            ;
         }
      }

   }

   protected void method879(String string_1, byte b_2) {
      this.field470.setContents(new StringSelection(string_1), (ClipboardOwner) null);
   }

   protected final boolean method931(int i_1) {
      return this.field441 != null;
   }

   public void run() {
      try {
         if (class166.field2029 != null) {
            String string_1 = class166.field2029.toLowerCase();
            if (string_1.indexOf("sun") != -1 || string_1.indexOf("apple") != -1) {
               String string_2 = class166.field2028;
               if (string_2.equals("1.1") || string_2.startsWith("1.1.") || string_2.equals("1.2") || string_2.startsWith("1.2.") || string_2.equals("1.3") || string_2.startsWith("1.3.") || string_2.equals("1.4") || string_2.startsWith("1.4.") || string_2.equals("1.5") || string_2.startsWith("1.5.") || string_2.equals("1.6.0")) {
                  this.loadingError("wrongjava");
                  return;
               }

               if (string_2.startsWith("1.6.0_")) {
                  int i_3;
                  for (i_3 = 6; i_3 < string_2.length() && class49.method818(string_2.charAt(i_3), (short) 8230); i_3++) {
                     ;
                  }

                  String string_4 = string_2.substring(6, i_3);
                  if (class192.method3677(string_4) && class3.method38(string_4, (byte) 0) < 10) {
                     this.loadingError("wrongjava");
                     return;
                  }
               }

               field443 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method1003();
         this.vmethod1243(2070235141);
         field447 = class173.method3589(-1483717574);

         while (field444 == 0L || class206.getAdjustedTimeMillis() < field444) {
            field449 = field447.vmethod3506(field448, field443, -333181863);

            for (int i_5 = 0; i_5 < field449; i_5++) {
               this.method953(-1989434416);
            }

            this.method910(-1190727122);
            this.method968(this.field460, 1151565468);
         }
      } catch (Exception exception_6) {
         class252.method4556((String) null, exception_6, (byte) 40);
         this.loadingError("crash");
      }

      this.method891();
   }

   public final void windowDeiconified(WindowEvent windowevent_1) {
   }

   public final void start() {
      if (this == field442 && !field445) {
         field444 = 0L;
      }
   }

   public final void stop() {
      if (this == field442 && !field445) {
         field444 = class206.getAdjustedTimeMillis() + 4000L;
      }
   }

   public final void update(Graphics graphics_1) {
      this.paint(graphics_1);
   }

   public final void focusGained(FocusEvent focusevent_1) {
      field472 = true;
      this.field464 = true;
   }

   public final void focusLost(FocusEvent focusevent_1) {
      field472 = false;
   }

   public final void windowActivated(WindowEvent windowevent_1) {
   }

   public final void windowClosed(WindowEvent windowevent_1) {
   }

   public final void windowClosing(WindowEvent windowevent_1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent windowevent_1) {
   }

   public final void windowOpened(WindowEvent windowevent_1) {
   }

   public final void windowIconified(WindowEvent windowevent_1) {
   }

   public abstract void init();

   public static class256 method1005(int i_0, byte b_1) {
      class256 class256_2 = (class256) class256.field3465.method3320((long)i_0);
      if (class256_2 != null) {
         return class256_2;
      } else {
         byte[] bytes_3 = class256.field3484.method4144(9, i_0);
         class256_2 = new class256();
         class256_2.field3467 = i_0;
         if (bytes_3 != null) {
            class256_2.method4703(new ByteBuffer(bytes_3));
         }

         class256_2.method4704();
         class256.field3465.method3322(class256_2, (long)i_0);
         return class256_2;
      }
   }

}
