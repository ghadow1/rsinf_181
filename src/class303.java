import java.io.IOException;
import java.net.Socket;

public final class class303 {

   byte[] field3777;
   byte[] field3750;
   int field3752;
   int field3757;
   int field3756;
   int field3754;
   int field3753;
   int field3758;
   int field3759;
   int field3766;
   int field3755;
   byte field3741;
   int field3760;
   int field3749;
   int field3761;
   int field3776;
   final int field3748 = 4096;
   final int field3743 = 16;
   final int field3779 = 258;
   final int field3778 = 6;
   final int field3745 = 50;
   final int field3746 = 18002;
   int field3742 = 0;
   int field3751 = 0;
   int[] field3762 = new int[256];
   int[] field3764 = new int[257];
   boolean[] field3747 = new boolean[256];
   boolean[] field3767 = new boolean[16];
   byte[] field3768 = new byte[256];
   byte[] field3769 = new byte[4096];
   int[] field3770 = new int[16];
   byte[] field3771 = new byte[18002];
   byte[] field3772 = new byte[18002];
   byte[][] field3773 = new byte[6][258];
   int[][] field3774 = new int[6][258];
   int[][] field3775 = new int[6][258];
   int[][] field3763 = new int[6][258];
   int[] field3744 = new int[6];

   public static Stream method5770(Socket socket_0, int i_1, int i_2, byte b_3) throws IOException {
      return new class306(socket_0, i_1, i_2);
   }

}
