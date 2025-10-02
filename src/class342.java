import java.io.EOFException;
import java.io.IOException;

public class class342 {

   long field4069 = -1L;
   long field4077 = -1L;
   int field4076 = 0;
   class343 field4070;
   long field4074;
   long field4079;
   byte[] field4071;
   byte[] field4075;
   long field4072;
   long field4080;
   int field4073;

   public class342(class343 class343_1, int i_2, int i_3) throws IOException {
      this.field4070 = class343_1;
      this.field4079 = this.field4074 = class343_1.method6552();
      this.field4071 = new byte[i_2];
      this.field4075 = new byte[i_3];
      this.field4072 = 0L;
   }

   public void method6522(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
      try {
         if (i_3 + i_2 > bytes_1.length) {
            throw new ArrayIndexOutOfBoundsException(i_3 + i_2 - bytes_1.length);
         }

         if (this.field4077 != -1L && this.field4072 >= this.field4077 && this.field4072 + (long)i_3 <= this.field4077 + (long)this.field4076) {
            System.arraycopy(this.field4075, (int)(this.field4072 - this.field4077), bytes_1, i_2, i_3);
            this.field4072 += (long)i_3;
            return;
         }

         long long_5 = this.field4072;
         int i_8 = i_3;
         int i_9;
         if (this.field4072 >= this.field4069 && this.field4072 < this.field4069 + (long)this.field4073) {
            i_9 = (int)((long)this.field4073 - (this.field4072 - this.field4069));
            if (i_9 > i_3) {
               i_9 = i_3;
            }

            System.arraycopy(this.field4071, (int)(this.field4072 - this.field4069), bytes_1, i_2, i_9);
            this.field4072 += (long)i_9;
            i_2 += i_9;
            i_3 -= i_9;
         }

         if (i_3 > this.field4071.length) {
            this.field4070.method6551(this.field4072);

            for (this.field4080 = this.field4072; i_3 > 0; i_3 -= i_9) {
               i_9 = this.field4070.method6554(bytes_1, i_2, i_3);
               if (i_9 == -1) {
                  break;
               }

               this.field4080 += (long)i_9;
               this.field4072 += (long)i_9;
               i_2 += i_9;
            }
         } else if (i_3 > 0) {
            this.method6518(-364747525);
            i_9 = i_3;
            if (i_3 > this.field4073) {
               i_9 = this.field4073;
            }

            System.arraycopy(this.field4071, 0, bytes_1, i_2, i_9);
            i_2 += i_9;
            i_3 -= i_9;
            this.field4072 += (long)i_9;
         }

         if (this.field4077 != -1L) {
            if (this.field4077 > this.field4072 && i_3 > 0) {
               i_9 = i_2 + (int)(this.field4077 - this.field4072);
               if (i_9 > i_3 + i_2) {
                  i_9 = i_3 + i_2;
               }

               while (i_2 < i_9) {
                  bytes_1[i_2++] = 0;
                  --i_3;
                  ++this.field4072;
               }
            }

            long long_14 = -1L;
            long long_11 = -1L;
            if (this.field4077 >= long_5 && this.field4077 < long_5 + (long)i_8) {
               long_14 = this.field4077;
            } else if (long_5 >= this.field4077 && long_5 < this.field4077 + (long)this.field4076) {
               long_14 = long_5;
            }

            if (this.field4077 + (long)this.field4076 > long_5 && this.field4077 + (long)this.field4076 <= long_5 + (long)i_8) {
               long_11 = (long)this.field4076 + this.field4077;
            } else if (long_5 + (long)i_8 > this.field4077 && (long)i_8 + long_5 <= this.field4077 + (long)this.field4076) {
               long_11 = long_5 + (long)i_8;
            }

            if (long_14 > -1L && long_11 > long_14) {
               int i_13 = (int)(long_11 - long_14);
               System.arraycopy(this.field4075, (int)(long_14 - this.field4077), bytes_1, (int)(long_14 - long_5) + i_2, i_13);
               if (long_11 > this.field4072) {
                  i_3 = (int)((long)i_3 - (long_11 - this.field4072));
                  this.field4072 = long_11;
               }
            }
         }
      } catch (IOException ioexception_17) {
         this.field4080 = -1L;
         throw ioexception_17;
      }

      if (i_3 > 0) {
         throw new EOFException();
      }
   }

   void method6523(int i_1) throws IOException {
      if (this.field4077 != -1L) {
         if (this.field4077 != this.field4080) {
            this.field4070.method6551(this.field4077);
            this.field4080 = this.field4077;
         }

         this.field4070.method6561(this.field4075, 0, this.field4076);
         this.field4080 += -299149629L * (long)(this.field4076 * -1383888405);
         if (this.field4080 > this.field4074) {
            this.field4074 = this.field4080;
         }

         long long_2 = -1L;
         long long_4 = -1L;
         if (this.field4077 >= this.field4069 && this.field4077 < this.field4069 + (long)this.field4073) {
            long_2 = this.field4077;
         } else if (this.field4069 >= this.field4077 && this.field4069 < this.field4077 + (long)this.field4076) {
            long_2 = this.field4069;
         }

         if ((long)this.field4076 + this.field4077 > this.field4069 && this.field4077 + (long)this.field4076 <= (long)this.field4073 + this.field4069) {
            long_4 = this.field4077 + (long)this.field4076;
         } else if (this.field4069 + (long)this.field4073 > this.field4077 && this.field4069 + (long)this.field4073 <= this.field4077 + (long)this.field4076) {
            long_4 = (long)this.field4073 + this.field4069;
         }

         if (long_2 > -1L && long_4 > long_2) {
            int i_6 = (int)(long_4 - long_2);
            System.arraycopy(this.field4075, (int)(long_2 - this.field4077), this.field4071, (int)(long_2 - this.field4069), i_6);
         }

         this.field4077 = -1L;
         this.field4076 = 0;
      }

   }

   public long method6520(short s_1) {
      return this.field4079;
   }

   public void method6521(long long_1) throws IOException {
      if (long_1 < 0L) {
         throw new IOException("");
      } else {
         this.field4072 = long_1;
      }
   }

   public void method6524(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
      try {
         if (this.field4072 + (long)i_3 > this.field4079) {
            this.field4079 = this.field4072 + (long)i_3;
         }

         if (this.field4077 != -1L && (this.field4072 < this.field4077 || this.field4072 > (long)this.field4076 + this.field4077)) {
            this.method6523(2095113071);
         }

         if (this.field4077 != -1L && this.field4072 + (long)i_3 > this.field4077 + (long)this.field4075.length) {
            int i_5 = (int)((long)this.field4075.length - (this.field4072 - this.field4077));
            System.arraycopy(bytes_1, i_2, this.field4075, (int)(this.field4072 - this.field4077), i_5);
            this.field4072 += (long)i_5;
            i_2 += i_5;
            i_3 -= i_5;
            this.field4076 = this.field4075.length;
            this.method6523(1384161636);
         }

         if (i_3 <= this.field4075.length) {
            if (i_3 > 0) {
               if (this.field4077 == -1L) {
                  this.field4077 = this.field4072;
               }

               System.arraycopy(bytes_1, i_2, this.field4075, (int)(this.field4072 - this.field4077), i_3);
               this.field4072 += (long)i_3;
               if (this.field4072 - this.field4077 > (long)this.field4076) {
                  this.field4076 = (int)(this.field4072 - this.field4077);
               }

            }
         } else {
            if (this.field4080 != this.field4072) {
               this.field4070.method6551(this.field4072);
               this.field4080 = this.field4072;
            }

            this.field4070.method6561(bytes_1, i_2, i_3);
            this.field4080 += (long)i_3;
            if (this.field4080 > this.field4074) {
               this.field4074 = this.field4080;
            }

            long long_10 = -1L;
            long long_7 = -1L;
            if (this.field4072 >= this.field4069 && this.field4072 < (long)this.field4073 + this.field4069) {
               long_10 = this.field4072;
            } else if (this.field4069 >= this.field4072 && this.field4069 < (long)i_3 + this.field4072) {
               long_10 = this.field4069;
            }

            if (this.field4072 + (long)i_3 > this.field4069 && this.field4072 + (long)i_3 <= (long)this.field4073 + this.field4069) {
               long_7 = (long)i_3 + this.field4072;
            } else if (this.field4069 + (long)this.field4073 > this.field4072 && (long)this.field4073 + this.field4069 <= this.field4072 + (long)i_3) {
               long_7 = (long)this.field4073 + this.field4069;
            }

            if (long_10 > -1L && long_7 > long_10) {
               int i_9 = (int)(long_7 - long_10);
               System.arraycopy(bytes_1, (int)(long_10 + (long)i_2 - this.field4072), this.field4071, (int)(long_10 - this.field4069), i_9);
            }

            this.field4072 += (long)i_3;
         }
      } catch (IOException ioexception_13) {
         this.field4080 = -1L;
         throw ioexception_13;
      }
   }

   void method6518(int i_1) throws IOException {
      this.field4073 = 0;
      if (this.field4072 != this.field4080) {
         this.field4070.method6551(this.field4072);
         this.field4080 = this.field4072;
      }

      int i_3;
      for (this.field4069 = this.field4072; this.field4073 < this.field4071.length; this.field4073 += i_3) {
         int i_2 = this.field4071.length - this.field4073;
         if (i_2 > 200000000) {
            i_2 = 200000000;
         }

         i_3 = this.field4070.method6554(this.field4071, this.field4073, i_2);
         if (i_3 == -1) {
            break;
         }

         this.field4080 += (long)i_3;
      }

   }

   public void method6540(byte b_1) throws IOException {
      this.method6523(813445771);
      this.field4070.method6550();
   }

   public void method6547(byte[] bytes_1, int i_2) throws IOException {
      this.method6522(bytes_1, 0, bytes_1.length, 1346906762);
   }

   static int method6528(int i_0, int i_1, int i_2) {
      class59 class59_3 = (class59) class59.field552.method5952((long)i_0);
      if (class59_3 == null) {
         return 0;
      } else if (i_1 == -1) {
         return 0;
      } else {
         int i_4 = 0;

         for (int i_5 = 0; i_5 < class59_3.field551.length; i_5++) {
            if (class59_3.field550[i_5] == i_1) {
               i_4 += class59_3.field551[i_5];
            }
         }

         return i_4;
      }
   }

}
