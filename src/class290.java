public class class290 {

   static char[] field3673 = new char[64];
   static char[] field3672;
   static char[] field3674;
   static int[] field3671;

   static {
      int i_0;
      for (i_0 = 0; i_0 < 26; i_0++) {
         field3673[i_0] = (char)(i_0 + 65);
      }

      for (i_0 = 26; i_0 < 52; i_0++) {
         field3673[i_0] = (char)(i_0 + 97 - 26);
      }

      for (i_0 = 52; i_0 < 62; i_0++) {
         field3673[i_0] = (char)(i_0 + 48 - 52);
      }

      field3673[62] = 43;
      field3673[63] = 47;
      field3672 = new char[64];

      for (i_0 = 0; i_0 < 26; i_0++) {
         field3672[i_0] = (char)(i_0 + 65);
      }

      for (i_0 = 26; i_0 < 52; i_0++) {
         field3672[i_0] = (char)(i_0 + 97 - 26);
      }

      for (i_0 = 52; i_0 < 62; i_0++) {
         field3672[i_0] = (char)(i_0 + 48 - 52);
      }

      field3672[62] = 42;
      field3672[63] = 45;
      field3674 = new char[64];

      for (i_0 = 0; i_0 < 26; i_0++) {
         field3674[i_0] = (char)(i_0 + 65);
      }

      for (i_0 = 26; i_0 < 52; i_0++) {
         field3674[i_0] = (char)(i_0 + 97 - 26);
      }

      for (i_0 = 52; i_0 < 62; i_0++) {
         field3674[i_0] = (char)(i_0 + 48 - 52);
      }

      field3674[62] = 45;
      field3674[63] = 95;
      field3671 = new int[128];

      for (i_0 = 0; i_0 < field3671.length; i_0++) {
         field3671[i_0] = -1;
      }

      for (i_0 = 65; i_0 <= 90; i_0++) {
         field3671[i_0] = i_0 - 65;
      }

      for (i_0 = 97; i_0 <= 122; i_0++) {
         field3671[i_0] = i_0 - 97 + 26;
      }

      for (i_0 = 48; i_0 <= 57; i_0++) {
         field3671[i_0] = i_0 - 48 + 52;
      }

      int[] ints_2 = field3671;
      field3671[43] = 62;
      ints_2[42] = 62;
      int[] ints_1 = field3671;
      field3671[47] = 63;
      ints_1[45] = 63;
   }

}
