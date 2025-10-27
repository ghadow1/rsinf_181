import java.security.SecureRandom;

public class class23 extends class34 {

   static Font fontBold12;
   static SecureRandom field187;
   static Widget[] field188;
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
      this.field184 = class128.method2970(this.field195).method4595().field3378;
      this.field191 = this.field183.method451(class222.method4118(this.field184), 1686665284);
      class241 class241_2 = class222.method4118(this.vmethod597(-1800055467));
      class325 class325_3 = class241_2.method4379();
      if (class325_3 != null) {
         this.field189 = class325_3.field3899;
         this.field186 = class325_3.field3900;
      } else {
         this.field189 = 0;
         this.field186 = 0;
      }

   }

   int vmethod577() {
      return this.field189;
   }

   int vmethod593() {
      return this.field186;
   }

   static void loginResponseAction(int i_0) {
      if (i_0 == -3) {
         class268.loginResponseMessages("Connection timed out.", "Please try using a different world.", "");
      } else if (i_0 == -2) {
         class268.loginResponseMessages("", "Error connecting to server.", "");
      } else if (i_0 == -1) {
         class268.loginResponseMessages("No response from server.", "Please try using a different world.", "");
      } else if (i_0 == 3) {
         Login.loginIndex = 3;
         Login.field1212 = 1;
      } else if (i_0 == 4) {
         class63.method1137(0);
      } else if (i_0 == 5) {
         Login.field1212 = 2;
         class268.loginResponseMessages("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if (i_0 == 68 || !Client.field658 && i_0 == 6) {
         class268.loginResponseMessages("RuneScape has been updated!", "Please reload this page.", "");
      } else if (i_0 == 7) {
         class268.loginResponseMessages("This world is full.", "Please use a different world.", "");
      } else if (i_0 == 8) {
         class268.loginResponseMessages("Unable to connect.", "Login server offline.", "");
      } else if (i_0 == 9) {
         class268.loginResponseMessages("Login limit exceeded.", "Too many connections from your address.", "");
      } else if (i_0 == 10) {
         class268.loginResponseMessages("Unable to connect.", "Bad session id.", "");
      } else if (i_0 == 11) {
         class268.loginResponseMessages("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
      } else if (i_0 == 12) {
         class268.loginResponseMessages("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if (i_0 == 13) {
         class268.loginResponseMessages("Could not complete login.", "Please try using a different world.", "");
      } else if (i_0 == 14) {
         class268.loginResponseMessages("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if (i_0 == 16) {
         class268.loginResponseMessages("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if (i_0 == 17) {
         class268.loginResponseMessages("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if (i_0 == 18) {
         class63.method1137(1);
      } else if (i_0 == 19) {
         class268.loginResponseMessages("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if (i_0 == 20) {
         class268.loginResponseMessages("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if (i_0 == 22) {
         class268.loginResponseMessages("Malformed login packet.", "Please try again.", "");
      } else if (i_0 == 23) {
         class268.loginResponseMessages("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if (i_0 == 24) {
         class268.loginResponseMessages("Error loading your profile.", "Please contact customer support.", "");
      } else if (i_0 == 25) {
         class268.loginResponseMessages("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if (i_0 == 26) {
         class268.loginResponseMessages("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if (i_0 == 27) {
         class268.loginResponseMessages("", "Service unavailable.", "");
      } else if (i_0 == 31) {
         class268.loginResponseMessages("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if (i_0 == 32) {
         class268.loginResponseMessages("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
      } else if (i_0 == 37) {
         class268.loginResponseMessages("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if (i_0 == 38) {
         class268.loginResponseMessages("You need to vote to play!", "Visit arios.com and vote,", "and then come back here!");
      } else if (i_0 == 55) {
         Login.loginIndex = 8;
      } else {
         if (i_0 == 56) {
            class268.loginResponseMessages("Enter the 6-digit code generated by your", "authenticator app.", "");
            class96.updateGameState(11);
            return;
         }

         if (i_0 == 57) {
            class268.loginResponseMessages("The code you entered was incorrect.", "Please try again.", "");
            class96.updateGameState(11);
            return;
         }

         if (i_0 == 61) {
            Login.loginIndex = 7;
         } else {
            class268.loginResponseMessages("Unexpected server response", "Please try using a different world.", "");
         }
      }

      class96.updateGameState(10);
   }

   public static void method286() {
      class246.field3278.method3323();
      class246.field3276.method3323();
   }

   static Message method297(int i_0) {
      return (Message) class91.field1277.method5924((long)i_0);
   }

   public static boolean method295(int i_0) {
      return (i_0 >> 20 & 0x1) != 0;
   }

}
