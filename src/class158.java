import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class class158 extends class275 {

   public static boolean field1992;
   final boolean field1993;

   public class158(boolean bool_1) {
      this.field1993 = bool_1;
   }

   int method3431(class279 class279_1, class279 class279_2, int i_3) {
      return class279_2.field3634 != class279_1.field3634 ? (this.field1993 ? class279_1.field3634 - class279_2.field3634 : class279_2.field3634 - class279_1.field3634) : this.method5061(class279_1, class279_2, -2083963023);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3431((class279) object_1, (class279) object_2, -813496584);
   }

   public static final class325 method3435(byte[] bytes_0, byte b_1) {
      BufferedImage bufferedimage_2 = null;

      try {
         bufferedimage_2 = ImageIO.read(new ByteArrayInputStream(bytes_0));
         int i_3 = bufferedimage_2.getWidth();
         int i_4 = bufferedimage_2.getHeight();
         int[] ints_5 = new int[i_3 * i_4];
         PixelGrabber pixelgrabber_6 = new PixelGrabber(bufferedimage_2, 0, 0, i_3, i_4, ints_5, 0, i_3);
         pixelgrabber_6.grabPixels();
         return new class325(ints_5, i_3, i_4);
      } catch (IOException ioexception_8) {
         ;
      } catch (InterruptedException interruptedexception_9) {
         ;
      }

      return new class325(0, 0);
   }

}
