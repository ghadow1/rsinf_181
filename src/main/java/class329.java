public class class329 implements class330 {

   int field3930;
   int field3928;
   int field3926;

   void method6260(String string_1, byte b_2) {
      String[] arr_3 = string_1.split("\\.");

      try {
         this.field3930 = Integer.parseInt(arr_3[1]);
         arr_3 = arr_3[2].split("_");
         this.field3928 = Integer.parseInt(arr_3[0]);
         this.field3926 = Integer.parseInt(arr_3[1]);
      } catch (Exception exception_5) {
         ;
      }

   }

   void method6261(String string_1, int i_2) {
      String[] arr_3 = string_1.split("\\.");

      try {
         this.field3930 = Integer.parseInt(arr_3[0]);
         this.field3928 = Integer.parseInt(arr_3[1]);
         this.field3926 = Integer.parseInt(arr_3[2]);
      } catch (Exception exception_5) {
         ;
      }

   }

   void method6258(String string_1, int i_2) {
      if (string_1.startsWith("1.")) {
         this.method6260(string_1, (byte) 93);
      } else {
         this.method6261(string_1, -265029998);
      }

   }

   public class331 vmethod6276(int i_1) {
      byte b_2;
      if (class67.field647.startsWith("win")) {
         b_2 = 1;
      } else if (class67.field647.startsWith("mac")) {
         b_2 = 2;
      } else if (class67.field647.startsWith("linux")) {
         b_2 = 3;
      } else {
         b_2 = 4;
      }

      String string_3;
      try {
         string_3 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception exception_28) {
         string_3 = "";
      }

      String string_4;
      try {
         string_4 = System.getProperty("os.version").toLowerCase();
      } catch (Exception exception_27) {
         string_4 = "";
      }

      String str_5 = "Unknown";
      String str_6 = "1.1";

      try {
         str_5 = System.getProperty("java.vendor");
         str_6 = System.getProperty("java.version");
      } catch (Exception exception_26) {
         ;
      }

      boolean bool_25;
      if (!string_3.startsWith("amd64") && !string_3.startsWith("x86_64")) {
         bool_25 = false;
      } else {
         bool_25 = true;
      }

      byte b_8 = 0;
      if (b_2 == 1) {
         if (string_4.indexOf("4.0") != -1) {
            b_8 = 1;
         } else if (string_4.indexOf("4.1") != -1) {
            b_8 = 2;
         } else if (string_4.indexOf("4.9") != -1) {
            b_8 = 3;
         } else if (string_4.indexOf("5.0") != -1) {
            b_8 = 4;
         } else if (string_4.indexOf("5.1") != -1) {
            b_8 = 5;
         } else if (string_4.indexOf("5.2") != -1) {
            b_8 = 8;
         } else if (string_4.indexOf("6.0") != -1) {
            b_8 = 6;
         } else if (string_4.indexOf("6.1") != -1) {
            b_8 = 7;
         } else if (string_4.indexOf("6.2") != -1) {
            b_8 = 9;
         } else if (string_4.indexOf("6.3") != -1) {
            b_8 = 10;
         } else if (string_4.indexOf("10.0") != -1) {
            b_8 = 11;
         }
      } else if (b_2 == 2) {
         if (string_4.indexOf("10.4") != -1) {
            b_8 = 20;
         } else if (string_4.indexOf("10.5") != -1) {
            b_8 = 21;
         } else if (string_4.indexOf("10.6") != -1) {
            b_8 = 22;
         } else if (string_4.indexOf("10.7") != -1) {
            b_8 = 23;
         } else if (string_4.indexOf("10.8") != -1) {
            b_8 = 24;
         } else if (string_4.indexOf("10.9") != -1) {
            b_8 = 25;
         } else if (string_4.indexOf("10.10") != -1) {
            b_8 = 26;
         } else if (string_4.indexOf("10.11") != -1) {
            b_8 = 27;
         } else if (string_4.indexOf("10.12") != -1) {
            b_8 = 28;
         } else if (string_4.indexOf("10.13") != -1) {
            b_8 = 29;
         }
      }

      byte b_9;
      if (str_5.toLowerCase().indexOf("sun") != -1) {
         b_9 = 1;
      } else if (str_5.toLowerCase().indexOf("microsoft") != -1) {
         b_9 = 2;
      } else if (str_5.toLowerCase().indexOf("apple") != -1) {
         b_9 = 3;
      } else if (str_5.toLowerCase().indexOf("oracle") != -1) {
         b_9 = 5;
      } else {
         b_9 = 4;
      }

      this.method6258(str_6, -1874796410);
      int i_11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int i_12;
      if (this.field3930 > 3) {
         i_12 = Runtime.getRuntime().availableProcessors();
      } else {
         i_12 = 0;
      }

      byte b_13 = 0;
      String str_14 = "";
      String str_15 = "";
      String str_16 = "";
      String str_17 = "";
      String str_18 = "";
      String str_19 = "";
      int[] ints_24 = new int[3];
      return new class331(b_2, bool_25, b_8, b_9, this.field3930, this.field3928, this.field3926, false, i_11, i_12, b_13, 0, str_14, str_15, str_16, str_17, 0, 0, 0, 0, str_18, str_19, ints_24, 0, "");
   }

}
