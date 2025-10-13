public class class337 {

   static final int[] field4046 = new int[2048];
   static final int[] field4047 = new int[2048];

   static {
      double d_0 = 0.0030679615757712823D;

      for (int i_2 = 0; i_2 < 2048; i_2++) {
         field4046[i_2] = (int)(65536.0D * Math.sin((double)i_2 * d_0));
         field4047[i_2] = (int)(65536.0D * Math.cos(d_0 * (double)i_2));
      }

   }

}
