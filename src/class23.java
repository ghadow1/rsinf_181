import java.security.SecureRandom;

public class class23 extends class34 {

   static class295 field193;
   static SecureRandom field187;
   static class217[] field188;
   static int field182;
   final int field195;
   final class29 field183;
   int field184;
   class28 field191;
   int field189;
   int field186;

   class23(class213 class213_1, class213 class213_2, int i_3, class29 class29_4) {
      super(class213_1, class213_2);
      this.field195 = i_3;
      this.field183 = class29_4;
      this.method289((byte) 1);
   }

   class28 vmethod575(int i_1) {
      return this.field191;
   }

   public int vmethod597(int i_1) {
      return this.field184;
   }

   void method289(byte b_1) {
      this.field184 = class128.method2970(this.field195, (short) 4095).method4595((byte) 125).field3378;
      this.field191 = this.field183.method451(class222.method4118(this.field184, -673469339), 1686665284);
      class241 class241_2 = class222.method4118(this.vmethod597(-1800055467), -673469339);
      class325 class325_3 = class241_2.method4379(false, 1274763949);
      if (class325_3 != null) {
         this.field189 = class325_3.field3899;
         this.field186 = class325_3.field3900;
      } else {
         this.field189 = 0;
         this.field186 = 0;
      }

   }

   int vmethod577(byte b_1) {
      return this.field189;
   }

   int vmethod593(byte b_1) {
      return this.field186;
   }

   static void method296(int i_0, byte b_1) {
      if (i_0 == -3) {
         class268.method4988("Connection timed out.", "Please try using a different world.", "", 1547798935);
      } else if (i_0 == -2) {
         class268.method4988("", "Error connecting to server.", "", 1414327239);
      } else if (i_0 == -1) {
         class268.method4988("No response from server.", "Please try using a different world.", "", 2110028671);
      } else if (i_0 == 3) {
         class85.field1209 = 3;
         class85.field1212 = 1;
      } else if (i_0 == 4) {
         class63.method1137(0, 1823729833);
      } else if (i_0 == 5) {
         class85.field1212 = 2;
         class268.method4988("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.", 1293771561);
      } else if (i_0 == 68 || !client.field658 && i_0 == 6) {
         class268.method4988("RuneScape has been updated!", "Please reload this page.", "", 1502985849);
      } else if (i_0 == 7) {
         class268.method4988("This world is full.", "Please use a different world.", "", 1979089170);
      } else if (i_0 == 8) {
         class268.method4988("Unable to connect.", "Login server offline.", "", 1741578340);
      } else if (i_0 == 9) {
         class268.method4988("Login limit exceeded.", "Too many connections from your address.", "", 1852116173);
      } else if (i_0 == 10) {
         class268.method4988("Unable to connect.", "Bad session id.", "", 1694789647);
      } else if (i_0 == 11) {
         class268.method4988("We suspect someone knows your password.", "Press \'change your password\' on front page.", "", 1294820154);
      } else if (i_0 == 12) {
         class268.method4988("You need a members account to login to this world.", "Please subscribe, or use a different world.", "", 1621746055);
      } else if (i_0 == 13) {
         class268.method4988("Could not complete login.", "Please try using a different world.", "", 1428329280);
      } else if (i_0 == 14) {
         class268.method4988("The server is being updated.", "Please wait 1 minute and try again.", "", 1493252797);
      } else if (i_0 == 16) {
         class268.method4988("Too many login attempts.", "Please wait a few minutes before trying again.", "", 1795532174);
      } else if (i_0 == 17) {
         class268.method4988("You are standing in a members-only area.", "To play on this world move to a free area first", "", 2053194059);
      } else if (i_0 == 18) {
         class63.method1137(1, 1736065240);
      } else if (i_0 == 19) {
         class268.method4988("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.", 1276810351);
      } else if (i_0 == 20) {
         class268.method4988("Invalid loginserver requested.", "Please try using a different world.", "", 1955506524);
      } else if (i_0 == 22) {
         class268.method4988("Malformed login packet.", "Please try again.", "", 1453521599);
      } else if (i_0 == 23) {
         class268.method4988("No reply from loginserver.", "Please wait 1 minute and try again.", "", 1604762756);
      } else if (i_0 == 24) {
         class268.method4988("Error loading your profile.", "Please contact customer support.", "", 1956007739);
      } else if (i_0 == 25) {
         class268.method4988("Unexpected loginserver response.", "Please try using a different world.", "", 1612374516);
      } else if (i_0 == 26) {
         class268.method4988("This computers address has been blocked", "as it was used to break our rules.", "", 1953966249);
      } else if (i_0 == 27) {
         class268.method4988("", "Service unavailable.", "", 1815496596);
      } else if (i_0 == 31) {
         class268.method4988("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.", 1902684822);
      } else if (i_0 == 32) {
         class268.method4988("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.", 1563367525);
      } else if (i_0 == 37) {
         class268.method4988("Your account is currently inaccessible.", "Please try again in a few minutes.", "", 1575764173);
      } else if (i_0 == 38) {
         class268.method4988("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!", 1507432819);
      } else if (i_0 == 55) {
         class85.field1209 = 8;
      } else {
         if (i_0 == 56) {
            class268.method4988("Enter the 6-digit code generated by your", "authenticator app.", "", 1609019916);
            class96.method2265(11, (short) -7568);
            return;
         }

         if (i_0 == 57) {
            class268.method4988("The code you entered was incorrect.", "Please try again.", "", 1501596951);
            class96.method2265(11, (short) -22900);
            return;
         }

         if (i_0 == 61) {
            class85.field1209 = 7;
         } else {
            class268.method4988("Unexpected server response", "Please try using a different world.", "", 2087428447);
         }
      }

      class96.method2265(10, (short) -28845);
   }

   public static void method286(int i_0) {
      class246.field3278.method3323();
      class246.field3276.method3323();
   }

   static class64 method297(int i_0, int i_1) {
      return (class64) class91.field1277.method5924((long)i_0);
   }

   public static boolean method295(int i_0, int i_1) {
      return (i_0 >> 20 & 0x1) != 0;
   }

}
