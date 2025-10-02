import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class44 implements class168, MouseWheelListener {

   int field384 = 0;

   void method772(Component component_1, byte b_2) {
      component_1.addMouseWheelListener(this);
   }

   void method773(Component component_1, int i_2) {
      component_1.removeMouseWheelListener(this);
   }

   public synchronized int vmethod3496(int i_1) {
      int i_2 = this.field384;
      this.field384 = 0;
      return i_2;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent_1) {
      this.field384 += mousewheelevent_1.getWheelRotation();
   }

}
