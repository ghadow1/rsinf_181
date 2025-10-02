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

   public static ServerPacketProt[] method1934(int i_0) {
      return new ServerPacketProt[] {ServerPacketProt.field2160, ServerPacketProt.logoutFullMessage, ServerPacketProt.field2117, ServerPacketProt.messageGameMessage, ServerPacketProt.varpLargeMessage, ServerPacketProt.field2165, ServerPacketProt.locAddChangeMessage, ServerPacketProt.field2122, ServerPacketProt.mapAnimMessage, ServerPacketProt.field2176, ServerPacketProt.field2141, ServerPacketProt.mapProjAnimMessage, ServerPacketProt.soundAreaMessage, ServerPacketProt.locDelMessage, ServerPacketProt.objDelMessage, ServerPacketProt.objCountMessage, ServerPacketProt.field2131, ServerPacketProt.updateZonePartialEnclosedMessage, ServerPacketProt.field2133, ServerPacketProt.ifSetTextMessage, ServerPacketProt.ifSetObjectMessage, ServerPacketProt.ifSetHideMessage, ServerPacketProt.updateStatMessage, ServerPacketProt.midiSongMessage, ServerPacketProt.field2139, ServerPacketProt.field2140, ServerPacketProt.field2137, ServerPacketProt.field2135, ServerPacketProt.field2143, ServerPacketProt.field2144, ServerPacketProt.ifSetPlayerHeadMessage, ServerPacketProt.field2175, ServerPacketProt.field2147, ServerPacketProt.field2148, ServerPacketProt.field2149, ServerPacketProt.ifSetNpcHeadMessage, ServerPacketProt.field2151, ServerPacketProt.field2202, ServerPacketProt.field2180, ServerPacketProt.field2154, ServerPacketProt.field2155, ServerPacketProt.field2156, ServerPacketProt.field2157, ServerPacketProt.field2162, ServerPacketProt.updateInvPartialMessage, ServerPacketProt.field2189, ServerPacketProt.field2161, ServerPacketProt.field2150, ServerPacketProt.ifSetEventsMessage, ServerPacketProt.field2164, ServerPacketProt.field2123, ServerPacketProt.rebuildRegionMessage, ServerPacketProt.triggerOnDialogAbortMessage, ServerPacketProt.field2153, ServerPacketProt.field2142, ServerPacketProt.field2170, ServerPacketProt.field2171, ServerPacketProt.field2172, ServerPacketProt.field2132, ServerPacketProt.field2174, ServerPacketProt.updateRunEnergyMessage, ServerPacketProt.field2124, ServerPacketProt.runClientScriptMessage, ServerPacketProt.varpSmallMessage, ServerPacketProt.updateZonePartialFollowsMessage, ServerPacketProt.synthSoundMessage, ServerPacketProt.setOpPlayerMessage, ServerPacketProt.setMapFlagMessage, ServerPacketProt.field2183, ServerPacketProt.field2184, ServerPacketProt.updateInvFullMessage, ServerPacketProt.updateRunWeightMessage, ServerPacketProt.updateRebootTimerMessage, ServerPacketProt.field2188, ServerPacketProt.field2115, ServerPacketProt.field2121, ServerPacketProt.field2145, ServerPacketProt.ifOpenSubMessage, ServerPacketProt.field2193, ServerPacketProt.field2194, ServerPacketProt.field2195, ServerPacketProt.field2196, ServerPacketProt.ifMoveSubMessage, ServerPacketProt.field2198, ServerPacketProt.ifOpenTopMessage, ServerPacketProt.field2200};
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
