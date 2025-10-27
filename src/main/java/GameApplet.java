import java.applet.Applet;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class GameApplet extends Applet implements Runnable, FocusListener, WindowListener {


   static GameApplet applet = null;
   int field476;
   int field459;
   Frame applicationFrame;
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
   static long lastGCTime = -1L;
   static long lastCheckTime = -1L;
   boolean field446 = false;
   int field456 = 0;
   int field451 = 0;
   volatile boolean field464 = true;
   boolean field450 = false;
   volatile boolean field467 = false;
   volatile long field468 = 0L;
   final EventQueue field471;
   Canvas canvas;
   protected int field454;
   protected int field455;
   class44 field469;
   protected static class166 field463;
   Clipboard field470;
   int field473;
   int field461;
   static class170 field447;
   static int field449;

   protected GameApplet() {
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

   public static NPCDefinition method1005(int i_0) {
      NPCDefinition NPCDefinition_2 = (NPCDefinition) NPCDefinition.field3465.get((long) i_0);
      if (NPCDefinition_2 != null) {
         return NPCDefinition_2;
      } else {
         byte[] bytes_3 = NPCDefinition.field3484.method4144(9, i_0);
         NPCDefinition_2 = new NPCDefinition();
         NPCDefinition_2.field3467 = i_0;
         if (bytes_3 != null) {
            NPCDefinition_2.method4703(new ByteBuffer(bytes_3));
         }

         NPCDefinition_2.method4704();
         NPCDefinition.field3465.put(NPCDefinition_2, (long) i_0);
         return NPCDefinition_2;
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

   public final synchronized void paint(Graphics graphics_1) {
      if (this == applet && !field445) {
         this.field464 = true;
         if (TimeUtils.getAdjustedTimeMillis() - this.field468 > 1000L) {
            Rectangle rectangle_2 = graphics_1.getClipBounds();
            if (rectangle_2 == null || rectangle_2.width >= class7.clientWidth && rectangle_2.height >= ParamComposition.clientHeight) {
               this.field467 = true;
            }
         }

      }
   }

   public final void destroy() {
      if (this == applet && !field445) {
         field444 = TimeUtils.getAdjustedTimeMillis();
         class251.method4550(5000L);
         this.method891();
      }
   }

   class319 method903() {
      Container container_2 = this.method902();
      int i_3 = Math.max(container_2.getWidth(), this.field476);
      int i_4 = Math.max(container_2.getHeight(), this.field459);
      if (this.applicationFrame != null) {
         Insets insets_5 = this.applicationFrame.getInsets();
         i_3 -= insets_5.left + insets_5.right;
         i_4 -= insets_5.bottom + insets_5.top;
      }

      return new class319(i_3, i_4);
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

   Container method902() {
      return (Container) (this.applicationFrame != null ? this.applicationFrame : this);
   }

   final synchronized void method891() {
      if (!field445) {
         field445 = true;

         try {
            this.canvas.removeFocusListener(this);
         } catch (Exception exception_6) {
            ;
         }

         try {
            this.vmethod1608();
         } catch (Exception exception_5) {
            ;
         }

         if (this.applicationFrame != null) {
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

   protected abstract void vmethod1608();

   final synchronized void method1003() {
      Container container_2 = this.method902();
      if (this.canvas != null) {
         this.canvas.removeFocusListener(this);
         container_2.remove(this.canvas);
      }

      class7.clientWidth = Math.max(container_2.getWidth(), this.field476);
      ParamComposition.clientHeight = Math.max(container_2.getHeight(), this.field459);
      Insets insets_3;
      if (this.applicationFrame != null) {
         insets_3 = this.applicationFrame.getInsets();
         class7.clientWidth -= insets_3.right + insets_3.left;
         ParamComposition.clientHeight -= insets_3.top + insets_3.bottom;
      }

      this.canvas = new class48(this);
      container_2.setBackground(Color.BLACK);
      container_2.setLayout((LayoutManager) null);
      container_2.add(this.canvas);
      this.canvas.setSize(class7.clientWidth, ParamComposition.clientHeight);
      this.canvas.setVisible(true);
      this.canvas.setBackground(Color.BLACK);
      if (container_2 == this.applicationFrame) {
         insets_3 = this.applicationFrame.getInsets();
         this.canvas.setLocation(this.field456 + insets_3.left, insets_3.top + this.field451);
      } else {
         this.canvas.setLocation(this.field456, this.field451);
      }

      this.canvas.addFocusListener(this);
      this.canvas.requestFocus();
      this.field464 = true;
      if (class202.field2486 != null && class7.clientWidth == class202.field2486.field3877 && ParamComposition.clientHeight == class202.field2486.field3878) {
         ((class52) class202.field2486).method856(this.canvas);
         class202.field2486.vmethod6077(0, 0);
      } else {
         class202.field2486 = new class52(class7.clientWidth, ParamComposition.clientHeight, this.canvas);
      }

      this.field467 = false;
      this.field468 = TimeUtils.getAdjustedTimeMillis();
   }

   protected abstract void vmethod1243(int var1);

   protected abstract void vmethod1273(int var1);

   protected final void method885(byte b_1) {
      GrandExchangeOfferUnitPriceComparator.field3125 = null;
      WorldMapData_1.fontHelvetica13 = null;
      HealthBarUpdate.loginScreenFontMetrics = null;
   }

   protected final void drawInitial(int i_1, String string_2, boolean bool_3) {
      try {
         Graphics graphics_5 = this.canvas.getGraphics();
         if (WorldMapData_1.fontHelvetica13 == null) {
            WorldMapData_1.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
            HealthBarUpdate.loginScreenFontMetrics = this.canvas.getFontMetrics(WorldMapData_1.fontHelvetica13);
         }

         if (bool_3) {
            graphics_5.setColor(Color.black);
            graphics_5.fillRect(0, 0, class7.clientWidth, ParamComposition.clientHeight);
         }

         Color color_6 = new Color(140, 17, 17);

         try {
            if (GrandExchangeOfferUnitPriceComparator.field3125 == null) {
               GrandExchangeOfferUnitPriceComparator.field3125 = this.canvas.createImage(304, 34);
            }

            Graphics graphics_7 = GrandExchangeOfferUnitPriceComparator.field3125.getGraphics();
            graphics_7.setColor(color_6);
            graphics_7.drawRect(0, 0, 303, 33);
            graphics_7.fillRect(2, 2, i_1 * 3, 30);
            graphics_7.setColor(Color.black);
            graphics_7.drawRect(1, 1, 301, 31);
            graphics_7.fillRect(i_1 * 3 + 2, 2, 300 - i_1 * 3, 30);
            graphics_7.setFont(WorldMapData_1.fontHelvetica13);
            graphics_7.setColor(Color.white);
            graphics_7.drawString(string_2, (304 - HealthBarUpdate.loginScreenFontMetrics.stringWidth(string_2)) / 2, 22);
            graphics_5.drawImage(GrandExchangeOfferUnitPriceComparator.field3125, class7.clientWidth / 2 - 152, ParamComposition.clientHeight / 2 - 18, (ImageObserver) null);
         } catch (Exception exception_10) {
            int i_8 = class7.clientWidth / 2 - 152;
            int i_9 = ParamComposition.clientHeight / 2 - 18;
            graphics_5.setColor(color_6);
            graphics_5.drawRect(i_8, i_9, 303, 33);
            graphics_5.fillRect(i_8 + 2, i_9 + 2, i_1 * 3, 30);
            graphics_5.setColor(Color.black);
            graphics_5.drawRect(i_8 + 1, i_9 + 1, 301, 31);
            graphics_5.fillRect(i_8 + i_1 * 3 + 2, i_9 + 2, 300 - i_1 * 3, 30);
            graphics_5.setFont(WorldMapData_1.fontHelvetica13);
            graphics_5.setColor(Color.white);
            graphics_5.drawString(string_2, i_8 + (304 - HealthBarUpdate.loginScreenFontMetrics.stringWidth(string_2)) / 2, i_9 + 22);
         }
      } catch (Exception exception_11) {
         this.canvas.repaint();
      }

   }

   protected abstract void vmethod1599();

   final void method882() {
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

         class7.clientWidth = Math.min(this.field454, this.field473);
         ParamComposition.clientHeight = Math.min(this.field455, this.field461);
         this.field456 = (this.field454 - class7.clientWidth) / 2;
         this.field451 = 0;
         this.canvas.setSize(class7.clientWidth, ParamComposition.clientHeight);
         class202.field2486 = new class52(class7.clientWidth, ParamComposition.clientHeight, this.canvas);
         if (container_2 == this.applicationFrame) {
            Insets insets_4 = this.applicationFrame.getInsets();
            this.canvas.setLocation(insets_4.left + this.field456, this.field451 + insets_4.top);
         } else {
            this.canvas.setLocation(this.field456, this.field451);
         }

         this.field464 = true;
         this.vmethod1252();
      }
   }

   void method953() {
      long long_2 = TimeUtils.getAdjustedTimeMillis();
      long long_4 = field453[class243.field3248];
      field453[class243.field3248] = long_2;
      class243.field3248 = class243.field3248 + 1 & 0x1f;
      if (long_4 != 0L && long_2 > long_4) {
         ;
      }

      synchronized (this) {
         class267.field3557 = field472;
      }

      this.vmethod1599();
   }

   final void method968(Object object_1) {
      if (this.field471 != null) {
         for (int i_3 = 0; i_3 < 50 && this.field471.peekEvent() != null; i_3++) {
            class251.method4550(1L);
         }

         if (object_1 != null) {
            this.field471.postEvent(new ActionEvent(object_1, 1001, "dummy"));
         }

      }
   }

   void method910() {
      Container container_2 = this.method902();
      long long_3 = TimeUtils.getAdjustedTimeMillis();
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
         this.canvas.setSize(class7.clientWidth, ParamComposition.clientHeight);
         this.canvas.setVisible(true);
         if (container_2 == this.applicationFrame) {
            Insets insets_8 = this.applicationFrame.getInsets();
            this.canvas.setLocation(this.field456 + insets_8.left, insets_8.top + this.field451);
         } else {
            this.canvas.setLocation(this.field456, this.field451);
         }
      }

      if (this.field467) {
         this.method908();
      }

      this.method970();
      this.vmethod1493(this.field464);
      if (this.field464) {
         this.method927();
      }

      this.field464 = false;
   }

   protected final void method972() {
      if (class166.appletVendor.toLowerCase().indexOf("microsoft") != -1) {
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

      class81.method1990(this.canvas);
   }

   protected final void method932() {
      Buffer.method200(this.canvas);
   }

   protected class168 method877() {
      if (this.field469 == null) {
         this.field469 = new class44();
         this.field469.method772(this.canvas);
      }

      return this.field469;
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

   protected abstract void vmethod1252();

   protected final void startThread(int i_1, int i_2, int i_3) {
      try {
         if (applet != null) {
            ++field466;
            if (field466 >= 3) {
               this.loadingError("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         applet = this;
         class7.clientWidth = i_1;
         ParamComposition.clientHeight = i_2;
         GZipDecompressor.field4065 = i_3;
         GZipDecompressor.field4064 = this;
         if (field463 == null) {
            field463 = new class166();
         }

         field463.method3472(this, 1);
      } catch (Exception exception_6) {
         ErrorHandler.logError(null, exception_6);
         this.loadingError("crash");
      }

   }

   final void method970() {
      class319 class319_2 = this.method903();
      if (this.field454 != class319_2.field3865 || class319_2.field3866 != this.field455 || this.field450) {
         this.method882();
         this.field450 = false;
      }

   }

   protected abstract void vmethod1493(boolean var1);

   final void method908() {
      Canvas canvas_2 = this.canvas;
      canvas_2.removeKeyListener(class45.field392);
      canvas_2.removeFocusListener(class45.field392);
      class45.field398 = -1;
      Canvas canvas_3 = this.canvas;
      canvas_3.removeMouseListener(MouseHandler.field479);
      canvas_3.removeMouseMotionListener(MouseHandler.field479);
      canvas_3.removeFocusListener(MouseHandler.field479);
      MouseHandler.field481 = 0;
      if (this.field469 != null) {
         this.field469.method773(this.canvas);
      }

      this.method1003();
      class81.method1990(this.canvas);
      Buffer.method200(this.canvas);
      if (this.field469 != null) {
         this.field469.method772(this.canvas);
      }

      this.method890();
   }

   protected void method879(String string_1) {
      this.field470.setContents(new StringSelection(string_1), (ClipboardOwner) null);
   }

   void method927() {
      int i_2 = this.field456;
      int i_3 = this.field451;
      int i_4 = this.field454 - class7.clientWidth - i_2;
      int i_5 = this.field455 - ParamComposition.clientHeight - i_3;
      if (i_2 > 0 || i_4 > 0 || i_3 > 0 || i_5 > 0) {
         try {
            Container container_6 = this.method902();
            int i_7 = 0;
            int i_8 = 0;
            if (container_6 == this.applicationFrame) {
               Insets insets_9 = this.applicationFrame.getInsets();
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

   protected final boolean method931() {
      return this.applicationFrame != null;
   }

   public final void windowDeiconified(WindowEvent windowevent_1) {
   }

   public void run() {
      try {
         if (class166.appletVendor != null) {
            String string_1 = class166.appletVendor.toLowerCase();
            if (string_1.indexOf("sun") != -1 || string_1.indexOf("apple") != -1) {
               String string_2 = class166.appletVersion;
               if (string_2.equals("1.1") || string_2.startsWith("1.1.") || string_2.equals("1.2") || string_2.startsWith("1.2.") || string_2.equals("1.3") || string_2.startsWith("1.3.") || string_2.equals("1.4") || string_2.startsWith("1.4.") || string_2.equals("1.5") || string_2.startsWith("1.5.") || string_2.equals("1.6.0")) {
                  this.loadingError("wrongjava");
                  return;
               }

               if (string_2.startsWith("1.6.0_")) {
                  int i_3;
                  for (i_3 = 6; i_3 < string_2.length() && ItemContainer.method818(string_2.charAt(i_3)); i_3++) {
                     ;
                  }

                  String string_4 = string_2.substring(6, i_3);
                  if (class192.method3677(string_4) && class3.method38(string_4) < 10) {
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

         while (field444 == 0L || TimeUtils.getAdjustedTimeMillis() < field444) {
            field449 = field447.vmethod3506(field448, field443, -333181863);

            for (int i_5 = 0; i_5 < field449; i_5++) {
               this.method953();
            }

            this.method910();
            this.method968(this.canvas);
         }
      } catch (Exception exception_6) {
         ErrorHandler.logError(null, exception_6);
         this.loadingError("crash");
      }

      this.method891();
   }

   public final void start() {
      if (this == applet && !field445) {
         field444 = 0L;
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

   public final void stop() {
      if (this == applet && !field445) {
         field444 = TimeUtils.getAdjustedTimeMillis() + 4000L;
      }
   }

}
