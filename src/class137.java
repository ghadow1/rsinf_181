public class class137 {

   static int[][][] field1887;
   int field1889;
   int field1890;
   int field1888;

   public static class271[] method3265() {
      return new class271[] {class271.field3593, class271.field3589, class271.field3594, class271.field3591, class271.field3600, class271.field3599, class271.field3592, class271.field3595, class271.field3585, class271.field3587, class271.field3582, class271.field3586, class271.field3581, class271.field3598, class271.field3590, class271.field3588, class271.field3584, class271.field3596, class271.field3583};
   }

   static void method3266(boolean bool_0) {
      Login.Login_response1 = "";
      Login.Login_response2 = "Enter your username/email & password.";
      Login.Login_response3 = "";
      Login.loginIndex = 2;
      if (bool_0) {
         Login.Login_password = "";
      }

      ItemContainer.method815();
      if (Client.field691 && Login.field1180 != null && Login.field1180.length() > 0) {
         Login.field1202 = 1;
      } else {
         Login.field1202 = 0;
      }

   }

   public static void method3263(class233 class233_0, class233 class233_1, byte b_2) {
      NPCDefinition.field3484 = class233_0;
      NPCDefinition.field3464 = class233_1;
   }

   static void method3264(int i_0) {
      Client.field663 = 1L;
      FontName.field348.field592 = 0;
      class267.field3557 = true;
      Client.field667 = true;
      Client.field879 = -1L;
      class192.method3678();
      Client.data.method2218();
      Client.data.packetBuffer.position = 0;
      Client.data.serverPacket = null;
      Client.data.field1309 = null;
      Client.data.field1321 = null;
      Client.data.field1317 = null;
      Client.data.serverPacketLength = 0;
      Client.data.field1318 = 0;
      Client.field669 = 0;
      Client.field700 = 0;
      Client.field708 = 0;
      FriendSystem.method4121();
      MouseHandler.field480 = 0;
      class91.field1279.clear();
      class91.field1277.method5926();
      class91.field1278.method4949();
      class91.field1282 = 0;
      Client.isItemSelected = 0;
      Client.isSpellSelected = false;
      Client.field893 = 0;
      Client.camAngleY = 0;
      Client.field727 = 0;
      class68.field944 = null;
      Client.minimapState = 0;
      Client.field747 = -1;
      Client.destinationX = 0;
      Client.destinationY = 0;
      Client.field678 = class84.field1170;
      Client.field679 = class84.field1170;
      Client.npcCount = 0;
      class89.field1255 = 0;

      int i_1;
      for (i_1 = 0; i_1 < 2048; i_1++) {
         class89.field1254[i_1] = null;
         class89.field1250[i_1] = 1;
      }

      for (i_1 = 0; i_1 < 2048; i_1++) {
         Client.field909[i_1] = null;
      }

      for (i_1 = 0; i_1 < 32768; i_1++) {
         Client.npcs[i_1] = null;
      }

      Client.field781 = -1;
      Client.field670.method4886();
      Client.field785.method4886();

      int i_3;
      for (i_1 = 0; i_1 < 4; i_1++) {
         for (int i_2 = 0; i_2 < 104; i_2++) {
            for (i_3 = 0; i_3 < 104; i_3++) {
               Client.groundItems[i_1][i_2][i_3] = null;
            }
         }
      }

      Client.field783 = new NodeDeque();
      class58.field546.method1780((short) 487);

      for (i_1 = 0; i_1 < class240.field3203; i_1++) {
         class240 class240_4 = class5.method61(i_1);
         if (class240_4 != null) {
            class212.field2524[i_1] = 0;
            class212.var_configurations[i_1] = 0;
         }
      }

      class170.field2057.method2101(1717605874);
      Client.field825 = -1;
      if (Client.field905 != -1) {
         i_1 = Client.field905;
         if (i_1 != -1 && class128.field1755[i_1]) {
            Widget.field2557.method4157(i_1);
            if (Widget.field2556[i_1] != null) {
               boolean bool_6 = true;

               for (i_3 = 0; i_3 < Widget.field2556[i_1].length; i_3++) {
                  if (Widget.field2556[i_1][i_3] != null) {
                     if (Widget.field2556[i_1][i_3].field2566 != 2) {
                        Widget.field2556[i_1][i_3] = null;
                     } else {
                        bool_6 = false;
                     }
                  }
               }

               if (bool_6) {
                  Widget.field2556[i_1] = null;
               }

               class128.field1755[i_1] = false;
            }
         }
      }

      for (class61 class61_5 = (class61) Client.field816.method5950(); class61_5 != null; class61_5 = (class61) Client.field816.method5953()) {
         class197.method3697(class61_5, true);
      }

      Client.field905 = -1;
      Client.field816 = new class318(8);
      Client.field850 = null;
      FriendSystem.method4121();
      Client.field918.method4009(null, new int[]{0, 0, 0, 0, 0}, false, -1);

      for (i_1 = 0; i_1 < 8; i_1++) {
         Client.field778[i_1] = null;
         Client.field779[i_1] = false;
      }

      class59.field552 = new class318(32);
      Client.field661 = true;

      for (i_1 = 0; i_1 < 100; i_1++) {
         Client.field843[i_1] = true;
      }

      class70.writeOutgoingWindowMode();
      class46.field410 = null;

      for (i_1 = 0; i_1 < 8; i_1++) {
         Client.field866[i_1] = new class9();
      }

      class68.field942 = null;
   }

}
