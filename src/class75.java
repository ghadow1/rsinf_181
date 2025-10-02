public final class class75 extends LinkedListNode {

   static int field1092;
   class253 field1087;
   int field1077;
   int field1083;
   int field1082;
   int field1090;
   int field1078;
   class113 field1084;
   int field1089;
   static class261 field1080 = new class261();
   int field1079;
   int field1091;
   int field1086;
   int field1081;
   int[] field1088;
   class113 field1085;

   void method1821() {
      int i_2 = this.field1079;
      class253 class253_3 = this.field1087.method4595();
      if (class253_3 != null) {
         this.field1079 = class253_3.field3394;
         this.field1091 = class253_3.field3399 * 128;
         this.field1086 = class253_3.field3392;
         this.field1081 = class253_3.field3397;
         this.field1088 = class253_3.field3367;
      } else {
         this.field1079 = -1;
         this.field1091 = 0;
         this.field1086 = 0;
         this.field1081 = 0;
         this.field1088 = null;
      }

      if (i_2 != this.field1079 && this.field1085 != null) {
         class57.field532.method2293(this.field1085);
         this.field1085 = null;
      }

   }

   static void method1827() {
      if (class68.field944 != null) {
         Client.field924 = Client.field881;
         class68.field944.method4320();

         for (int i_1 = 0; i_1 < Client.field909.length; i_1++) {
            if (Client.field909[i_1] != null) {
               class68.field944.method4316((Client.field909[i_1].field1005 >> 7) + class196.field2389, (Client.field909[i_1].field949 >> 7) + class1.field1);
            }
         }
      }

   }

   static class92 method1828(int i_0, int i_1, int i_2, short s_3) {
      int i_4 = (i_1 << 8) + i_0;
      class92 class92_6 = class49.method821(i_4);
      if (class92_6 != null) {
         return class92_6;
      } else {
         int i_5 = class312.method5899(i_2, i_0, (byte) -122);
         class92_6 = class49.method821(i_5);
         return class92_6 != null ? class92_6 : null;
      }
   }

   static final void method1826(int i_0) {
      Client.field767 = 0;
      int i_1 = (Client.field657.field1005 >> 7) + class196.field2389;
      int i_2 = (Client.field657.field949 >> 7) + class1.field1;
      if (i_1 >= 3053 && i_1 <= 3156 && i_2 >= 3056 && i_2 <= 3136) {
         Client.field767 = 1;
      }

      if (i_1 >= 3072 && i_1 <= 3118 && i_2 >= 9492 && i_2 <= 9535) {
         Client.field767 = 1;
      }

      if (Client.field767 == 1 && i_1 >= 3139 && i_1 <= 3199 && i_2 >= 3008 && i_2 <= 3062) {
         Client.field767 = 0;
      }

   }

   static void method1824(int i_0, class213 class213_1, boolean bool_2, byte b_3) {
      class26 class26_4 = class31.method538(868064378).method6327(i_0, -1144902380);
      int i_5 = Client.field657.field629;
      int i_6 = (Client.field657.field1005 >> 7) + class196.field2389;
      int i_7 = (Client.field657.field949 >> 7) + class1.field1;
      class213 class213_8 = new class213(i_5, i_6, i_7);
      class31.method538(-1492208120).method6315(class26_4, class213_8, class213_1, bool_2, 1469825217);
   }

}
