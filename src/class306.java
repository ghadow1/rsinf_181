import java.io.IOException;
import java.net.Socket;

public class class306 extends class305 {

   Socket field3791;
   class309 field3789;
   class307 field3790;

   class306(Socket socket_1, int i_2, int i_3) throws IOException {
      this.field3791 = socket_1;
      this.field3791.setSoTimeout(30000);
      this.field3791.setTcpNoDelay(true);
      this.field3791.setReceiveBufferSize(65536);
      this.field3791.setSendBufferSize(65536);
      this.field3789 = new class309(this.field3791.getInputStream(), i_2);
      this.field3790 = new class307(this.field3791.getOutputStream(), i_3);
   }

   public void vmethod5830(int i_1) {
      this.field3790.method5853(1881137071);

      try {
         this.field3791.close();
      } catch (IOException ioexception_3) {
         ;
      }

      this.field3789.method5890(-1361407903);
   }

   public boolean vmethod5847(int i_1, int i_2) throws IOException {
      return this.field3789.method5874(i_1, -1294773775);
   }

   public int vmethod5828(byte[] bytes_1, int i_2, int i_3, byte b_4) throws IOException {
      return this.field3789.method5879(bytes_1, i_2, i_3, (short) 28253);
   }

   public void vmethod5829(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
      this.field3790.method5857(bytes_1, i_2, i_3, (byte) 37);
   }

   public int vmethod5826(byte b_1) throws IOException {
      return this.field3789.method5877(-72711599);
   }

   public int vmethod5825(byte b_1) throws IOException {
      return this.field3789.method5876(797723305);
   }

   protected void finalize() {
      this.vmethod5830(-1234856296);
   }

}
