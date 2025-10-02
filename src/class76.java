import java.util.Calendar;

public class class76 {

   public static class198 field1099;
   static int field1112;
   static int[] field1095;
   static class217 field1111;
   static int[] field1096 = new int[5];
   static int[][] field1100 = new int[5][5000];
   static int[] field1098 = new int[1000];
   static String[] field1093 = new String[1000];
   static int field1109 = 0;
   static class56[] field1101 = new class56[50];
   static Calendar field1102 = Calendar.getInstance();
   static final String[] field1097 = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   static boolean field1104 = false;
   static boolean field1105 = false;
   static int field1106 = 0;
   static final double field1110 = Math.log(2.0D);

   static final boolean method1936(int i_0, int i_1) {
      if (i_0 < 0) {
         return false;
      } else {
         int i_2 = client.field794[i_0];
         if (i_2 >= 2000) {
            i_2 -= 2000;
         }

         return i_2 == 1007;
      }
   }

   public static class182[] method1934(int i_0) {
      return new class182[] {class182.field2160, class182.field2116, class182.field2117, class182.field2152, class182.field2119, class182.field2165, class182.field2178, class182.field2122, class182.field2190, class182.field2176, class182.field2141, class182.field2126, class182.field2127, class182.field2128, class182.field2129, class182.field2130, class182.field2131, class182.field2120, class182.field2133, class182.field2134, class182.field2125, class182.field2136, class182.field2191, class182.field2138, class182.field2139, class182.field2140, class182.field2137, class182.field2135, class182.field2143, class182.field2144, class182.field2181, class182.field2175, class182.field2147, class182.field2148, class182.field2149, class182.field2118, class182.field2151, class182.field2202, class182.field2180, class182.field2154, class182.field2155, class182.field2156, class182.field2157, class182.field2162, class182.field2159, class182.field2189, class182.field2161, class182.field2150, class182.field2163, class182.field2164, class182.field2123, class182.field2166, class182.field2167, class182.field2153, class182.field2142, class182.field2170, class182.field2171, class182.field2172, class182.field2132, class182.field2174, class182.field2169, class182.field2124, class182.field2177, class182.field2168, class182.field2179, class182.field2158, class182.field2173, class182.field2182, class182.field2183, class182.field2184, class182.field2185, class182.field2186, class182.field2187, class182.field2188, class182.field2115, class182.field2121, class182.field2145, class182.field2192, class182.field2193, class182.field2194, class182.field2195, class182.field2196, class182.field2197, class182.field2198, class182.field2199, class182.field2200};
   }

   static final void method1935(int i_0, int i_1, int i_2, int i_3, class325 class325_4, class211 class211_5, byte b_6) {
      if (class325_4 != null) {
         int i_7 = client.field722 & 0x7ff;
         int i_8 = i_3 * i_3 + i_2 * i_2;
         if (i_8 <= 6400) {
            int i_9 = class130.field1787[i_7];
            int i_10 = class130.field1784[i_7];
            int i_11 = i_10 * i_2 + i_3 * i_9 >> 16;
            int i_12 = i_3 * i_10 - i_9 * i_2 >> 16;
            if (i_8 > 2500) {
               class325_4.method6146(i_11 + class211_5.field2519 / 2 - class325_4.field3898 / 2, class211_5.field2522 / 2 - i_12 - class325_4.field3904 / 2, i_0, i_1, class211_5.field2519, class211_5.field2522, class211_5.field2521, class211_5.field2520);
            } else {
               class325_4.method6126(i_0 + i_11 + class211_5.field2519 / 2 - class325_4.field3898 / 2, class211_5.field2522 / 2 + i_1 - i_12 - class325_4.field3904 / 2);
            }

         }
      }
   }

}
