public class class63 implements Runnable {

   static int field594;
   boolean field590 = true;
   Object field589 = new Object();
   int field592 = 0;
   int[] field591 = new int[500];
   int[] field588 = new int[500];
   long[] field593 = new long[500];

   static final void method1138() {
      String str_1 = "Your friend list is full. Max of 200 for free users, and 400 for members";
      MusicPatchPcmStream.method1132(30, "", str_1);
   }

   static void method1137(int i_0) {
      Login.loginIndex = 12;
      Login.field1182 = i_0;
   }

   public static void method1134() {
      class241.field3215.method3323();
   }

   static final void method1141() {
      for (int i_1 = 0; i_1 < Client.npcCount; i_1++) {
         int i_2 = Client.npcIndices[i_1];
         NPC NPC_3 = Client.npcs[i_2];
         if (NPC_3 != null) {
            class250.method4531(NPC_3, NPC_3.definition.field3469, (byte) 16);
         }
      }

   }

   static void method1139(class66 class66_0, int i_1, int i_2) {
      if (class66_0.field981 == i_1 && i_1 != -1) {
         int i_4 = class7.method81(i_1).field3529;
         if (i_4 == 1) {
            class66_0.field951 = 0;
            class66_0.field974 = 0;
            class66_0.field984 = i_2;
            class66_0.field985 = 0;
         }

         if (i_4 == 2) {
            class66_0.field985 = 0;
         }
      } else if (i_1 == -1 || class66_0.field981 == -1 || class7.method81(i_1).field3533 >= class7.method81(class66_0.field981).field3533) {
         class66_0.field981 = i_1;
         class66_0.field951 = 0;
         class66_0.field974 = 0;
         class66_0.field984 = i_2;
         class66_0.field985 = 0;
         class66_0.field1008 = class66_0.field1003;
      }

   }

   public void run() {
      for (; this.field590; class251.method4550(50L)) {
         synchronized (this.field589) {
            if (this.field592 < 500) {
               this.field591[this.field592] = MouseHandler.MouseHandler_x;
               this.field588[this.field592] = MouseHandler.MouseHandler_y;
               this.field593[this.field592] = MouseHandler.field482;
               ++this.field592;
            }
         }
      }

   }

}
