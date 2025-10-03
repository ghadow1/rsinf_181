import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class309 implements Runnable {

   int field3811 = 0;
   int field3812 = 0;
   InputStream field3808;
   int field3814;
   byte[] field3810;
   Thread field3813;
   IOException field3809;

   class309(InputStream inputstream_1, int i_2) {
      this.field3808 = inputstream_1;
      this.field3814 = i_2 + 1;
      this.field3810 = new byte[this.field3814];
      this.field3813 = new Thread(this);
      this.field3813.setDaemon(true);
      this.field3813.start();
   }

   boolean method5874(int i_1, int i_2) throws IOException {
      if (i_1 == 0) {
         return true;
      } else if (i_1 > 0 && i_1 < this.field3814) {
         synchronized(this) {
            int i_4;
            if (this.field3811 <= this.field3812) {
               i_4 = this.field3812 - this.field3811;
            } else {
               i_4 = this.field3814 - this.field3811 + this.field3812;
            }

            if (i_4 < i_1) {
               if (this.field3809 != null) {
                  throw new IOException(this.field3809.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method5876(int i_1) throws IOException {
      synchronized(this) {
         if (this.field3812 == this.field3811) {
            if (this.field3809 != null) {
               throw new IOException(this.field3809.toString());
            } else {
               return -1;
            }
         } else {
            int i_3 = this.field3810[this.field3811] & 0xff;
            this.field3811 = (this.field3811 + 1) % this.field3814;
            this.notifyAll();
            return i_3;
         }
      }
   }

   int method5877(int i_1) throws IOException {
      synchronized(this) {
         int i_3;
         if (this.field3811 <= this.field3812) {
            i_3 = this.field3812 - this.field3811;
         } else {
            i_3 = this.field3814 - this.field3811 + this.field3812;
         }

         if (i_3 <= 0 && this.field3809 != null) {
            throw new IOException(this.field3809.toString());
         } else {
            this.notifyAll();
            return i_3;
         }
      }
   }

   int method5879(byte[] bytes_1, int i_2, int i_3, short s_4) throws IOException {
      if (i_3 >= 0 && i_2 >= 0 && i_3 + i_2 <= bytes_1.length) {
         synchronized(this) {
            int i_6;
            if (this.field3811 <= this.field3812) {
               i_6 = this.field3812 - this.field3811;
            } else {
               i_6 = this.field3814 - this.field3811 + this.field3812;
            }

            if (i_3 > i_6) {
               i_3 = i_6;
            }

            if (i_3 == 0 && this.field3809 != null) {
               throw new IOException(this.field3809.toString());
            } else {
               if (i_3 + this.field3811 <= this.field3814) {
                  System.arraycopy(this.field3810, this.field3811, bytes_1, i_2, i_3);
               } else {
                  int i_7 = this.field3814 - this.field3811;
                  System.arraycopy(this.field3810, this.field3811, bytes_1, i_2, i_7);
                  System.arraycopy(this.field3810, 0, bytes_1, i_7 + i_2, i_3 - i_7);
               }

               this.field3811 = (i_3 + this.field3811) % this.field3814;
               this.notifyAll();
               return i_3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method5890(int i_1) {
      synchronized(this) {
         if (this.field3809 == null) {
            this.field3809 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field3813.join();
      } catch (InterruptedException interruptedexception_4) {
         ;
      }

   }

   public void run() {
      while (true) {
         int i_1;
         synchronized(this) {
            while (true) {
               if (this.field3809 != null) {
                  return;
               }

               if (this.field3811 == 0) {
                  i_1 = this.field3814 - this.field3812 - 1;
               } else if (this.field3811 <= this.field3812) {
                  i_1 = this.field3814 - this.field3812;
               } else {
                  i_1 = this.field3811 - this.field3812 - 1;
               }

               if (i_1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException interruptedexception_10) {
                  ;
               }
            }
         }

         int i_7;
         try {
            i_7 = this.field3808.read(this.field3810, this.field3812, i_1);
            if (i_7 == -1) {
               throw new EOFException();
            }
         } catch (IOException ioexception_11) {
            IOException ioexception_3 = ioexception_11;
            synchronized(this) {
               this.field3809 = ioexception_3;
               return;
            }
         }

         synchronized(this) {
            this.field3812 = (i_7 + this.field3812) % this.field3814;
         }
      }
   }

   static void method5892(class233 class233_0, class233 class233_1, boolean bool_2, int i_3, int i_4) {
      if (Login.field1179) {
         if (i_3 == 4) {
            Login.loginIndex = 4;
         }

      } else {
         Login.loginIndex = i_3;
         class321.method6022();
         byte[] bytes_5 = class233_0.method4163("title.jpg", "", 1900657492);
         class5.field23 = class158.method3435(bytes_5, (byte) -3);
         class79.field1135 = class5.field23.method6112();
         if ((Client.field653 & 0x20000000) != 0) {
            class87.field1243 = SoundSystem.method4021(class233_1, "logo_deadman_mode", "");
         } else {
            class87.field1243 = SoundSystem.method4021(class233_1, "logo", "");
         }

         Login.field1194 = SoundSystem.method4021(class233_1, "titlebox", "");
         class240.field3207 = SoundSystem.method4021(class233_1, "titlebutton", "");
         int i_7 = class233_1.method4160("runes");
         int i_8 = class233_1.method4161(i_7, "");
         class324[] arr_6 = class289.method5281(class233_1, i_7, i_8, 1740775565);
         Login.field1181 = arr_6;
         i_8 = class233_1.method4160("title_mute");
         int i_9 = class233_1.method4161(i_8, "");
         class324[] arr_10 = class289.method5281(class233_1, i_8, i_9, 1982525323);
         Login.field1183 = arr_10;
         Login.field1178 = SoundSystem.method4021(class233_1, "options_radio_buttons,0", "");
         Message.field606 = SoundSystem.method4021(class233_1, "options_radio_buttons,4", "");
         class112.field1466 = SoundSystem.method4021(class233_1, "options_radio_buttons,2", "");
         Login.field1185 = SoundSystem.method4021(class233_1, "options_radio_buttons,6", "");
         class237.field3191 = Login.field1178.field3897;
         class25.field212 = Login.field1178.field3893;
         class278.field3631 = new class72(Login.field1181);
         if (bool_2) {
            Login.field1180 = "";
            Login.Login_password = "";
         }

         class9.field65 = 0;
         class36.field328 = "";
         Login.field1201 = true;
         Login.field1205 = false;
         if (!class17.field117.field1063) {
            class29.method533(2, class29.field253, "scape main", "", 255, false, -2137956496);
         } else {
            FontName.method729(2, (byte) 65);
         }

         if (class236.field3176 != null) {
            try {
               ByteBuffer class300_11 = new ByteBuffer(4);
               class300_11.writeByte(3);
               class300_11.write24BitInt(0);
               class236.field3176.vmethod5829(class300_11.buffer, 0, 4, -1696227994);
            } catch (IOException ioexception_14) {
               try {
                  class236.field3176.close();
               } catch (Exception exception_13) {
                  ;
               }

               ++class236.field3178;
               class236.field3176 = null;
            }
         }

         Login.field1179 = true;
         Login.field1208 = (class7.field46 - 765) / 2;
         Login.field1187 = Login.field1208 + 202;
         class62.field585 = Login.field1187 + 180;
         class5.field23.method6121(Login.field1208, 0);
         class79.field1135.method6121(Login.field1208 + 382, 0);
         class87.field1243.method6101(Login.field1208 + 382 - class87.field1243.field3897 / 2, 18);
      }
   }

}
