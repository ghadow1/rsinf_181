import java.io.EOFException;
import java.io.IOException;

public final class class308 {

   static byte[] field3804 = new byte[520];
   class342 field3803 = null;
   class342 field3802 = null;
   int field3806 = 65000;
   int field3805;

   public class308(int i_1, class342 class342_2, class342 class342_3, int i_4) {
      this.field3805 = i_1;
      this.field3803 = class342_2;
      this.field3802 = class342_3;
      this.field3806 = i_4;
   }

   public static byte[] method5873(Object object_0, boolean bool_1) {
      if (object_0 == null) {
         return null;
      } else if (object_0 instanceof byte[]) {
         byte[] bytes_7 = (byte[]) ((byte[]) object_0);
         if (bool_1) {
            int i_5 = bytes_7.length;
            byte[] bytes_6 = new byte[i_5];
            System.arraycopy(bytes_7, 0, bytes_6, 0, i_5);
            return bytes_6;
         } else {
            return bytes_7;
         }
      } else if (object_0 instanceof class205) {
         class205 class205_3 = (class205) object_0;
         return class205_3.vmethod3935();
      } else {
         throw new IllegalArgumentException();
      }
   }

   public boolean method5866(int i_1, byte[] bytes_2, int i_3) {
      class342 class342_5 = this.field3803;
      synchronized (this.field3803) {
         if (i_3 >= 0 && i_3 <= this.field3806) {
            boolean bool_6 = this.method5872(i_1, bytes_2, i_3, true);
            if (!bool_6) {
               bool_6 = this.method5872(i_1, bytes_2, i_3, false);
            }

            return bool_6;
         } else {
            throw new IllegalArgumentException("" + this.field3805 + ',' + i_1 + ',' + i_3);
         }
      }
   }

   boolean method5872(int i_1, byte[] bytes_2, int i_3, boolean bool_4) {
      class342 class342_6 = this.field3803;
      synchronized(this.field3803) {
         try {
            int i_7;
            boolean bool_10000;
            if (bool_4) {
               if (this.field3802.method6520() < (long)(i_1 * 6 + 6)) {
                  bool_10000 = false;
                  return bool_10000;
               }

               this.field3802.method6521((long)(i_1 * 6));
               this.field3802.method6522(field3804, 0, 6);
               i_7 = (field3804[5] & 0xff) + ((field3804[3] & 0xff) << 16) + ((field3804[4] & 0xff) << 8);
               if (i_7 <= 0 || (long)i_7 > this.field3803.method6520() / 520L) {
                  bool_10000 = false;
                  return bool_10000;
               }
            } else {
               i_7 = (int)((this.field3803.method6520() + 519L) / 520L);
               if (i_7 == 0) {
                  i_7 = 1;
               }
            }

            field3804[0] = (byte)(i_3 >> 16);
            field3804[1] = (byte)(i_3 >> 8);
            field3804[2] = (byte)i_3;
            field3804[3] = (byte)(i_7 >> 16);
            field3804[4] = (byte)(i_7 >> 8);
            field3804[5] = (byte)i_7;
            this.field3802.method6521((long)(i_1 * 6));
            this.field3802.method6524(field3804, 0, 6);
            int i_8 = 0;
            int i_9 = 0;

            while (true) {
               if (i_8 < i_3) {
                  label171: {
                     int i_10 = 0;
                     int i_11;
                     if (bool_4) {
                        this.field3803.method6521((long)i_7 * 520L);
                        int i_12;
                        int i_13;
                        if (i_1 > 65535) {
                           try {
                              this.field3803.method6522(field3804, 0, 10);
                           } catch (EOFException eofexception_18) {
                              break label171;
                           }

                           i_11 = ((field3804[1] & 0xff) << 16) + ((field3804[0] & 0xff) << 24) + (field3804[3] & 0xff) + ((field3804[2] & 0xff) << 8);
                           i_12 = (field3804[5] & 0xff) + ((field3804[4] & 0xff) << 8);
                           i_10 = (field3804[8] & 0xff) + ((field3804[7] & 0xff) << 8) + ((field3804[6] & 0xff) << 16);
                           i_13 = field3804[9] & 0xff;
                        } else {
                           try {
                              this.field3803.method6522(field3804, 0, 8);
                           } catch (EOFException eofexception_17) {
                              break label171;
                           }

                           i_11 = (field3804[1] & 0xff) + ((field3804[0] & 0xff) << 8);
                           i_12 = (field3804[3] & 0xff) + ((field3804[2] & 0xff) << 8);
                           i_10 = ((field3804[5] & 0xff) << 8) + ((field3804[4] & 0xff) << 16) + (field3804[6] & 0xff);
                           i_13 = field3804[7] & 0xff;
                        }

                        if (i_11 != i_1 || i_9 != i_12 || i_13 != this.field3805) {
                           bool_10000 = false;
                           return bool_10000;
                        }

                        if (i_10 < 0 || (long)i_10 > this.field3803.method6520() / 520L) {
                           bool_10000 = false;
                           return bool_10000;
                        }
                     }

                     if (i_10 == 0) {
                        bool_4 = false;
                        i_10 = (int)((this.field3803.method6520() + 519L) / 520L);
                        if (i_10 == 0) {
                           ++i_10;
                        }

                        if (i_7 == i_10) {
                           ++i_10;
                        }
                     }

                     if (i_1 > 65535) {
                        if (i_3 - i_8 <= 510) {
                           i_10 = 0;
                        }

                        field3804[0] = (byte)(i_1 >> 24);
                        field3804[1] = (byte)(i_1 >> 16);
                        field3804[2] = (byte)(i_1 >> 8);
                        field3804[3] = (byte)i_1;
                        field3804[4] = (byte)(i_9 >> 8);
                        field3804[5] = (byte)i_9;
                        field3804[6] = (byte)(i_10 >> 16);
                        field3804[7] = (byte)(i_10 >> 8);
                        field3804[8] = (byte)i_10;
                        field3804[9] = (byte)this.field3805;
                        this.field3803.method6521((long)i_7 * 520L);
                        this.field3803.method6524(field3804, 0, 10);
                        i_11 = i_3 - i_8;
                        if (i_11 > 510) {
                           i_11 = 510;
                        }

                        this.field3803.method6524(bytes_2, i_8, i_11);
                        i_8 += i_11;
                     } else {
                        if (i_3 - i_8 <= 512) {
                           i_10 = 0;
                        }

                        field3804[0] = (byte)(i_1 >> 8);
                        field3804[1] = (byte)i_1;
                        field3804[2] = (byte)(i_9 >> 8);
                        field3804[3] = (byte)i_9;
                        field3804[4] = (byte)(i_10 >> 16);
                        field3804[5] = (byte)(i_10 >> 8);
                        field3804[6] = (byte)i_10;
                        field3804[7] = (byte)this.field3805;
                        this.field3803.method6521(520L * (long)i_7);
                        this.field3803.method6524(field3804, 0, 8);
                        i_11 = i_3 - i_8;
                        if (i_11 > 512) {
                           i_11 = 512;
                        }

                        this.field3803.method6524(bytes_2, i_8, i_11);
                        i_8 += i_11;
                     }

                     i_7 = i_10;
                     ++i_9;
                     continue;
                  }
               }

               bool_10000 = true;
               return bool_10000;
            }
         } catch (IOException ioexception_19) {
            return false;
         }
      }
   }

   public String toString() {
      return "" + this.field3805;
   }

   public byte[] method5865(int i_1) {
      class342 class342_3 = this.field3803;
      synchronized(this.field3803) {
         try {
            Object obj_10000;
            if (this.field3802.method6520() < (long)(i_1 * 6 + 6)) {
               obj_10000 = null;
               return (byte[]) obj_10000;
            } else {
               this.field3802.method6521((long)(i_1 * 6));
               this.field3802.method6522(field3804, 0, 6);
               int i_4 = ((field3804[0] & 0xff) << 16) + (field3804[2] & 0xff) + ((field3804[1] & 0xff) << 8);
               int i_5 = (field3804[5] & 0xff) + ((field3804[3] & 0xff) << 16) + ((field3804[4] & 0xff) << 8);
               if (i_4 < 0 || i_4 > this.field3806) {
                  obj_10000 = null;
                  return (byte[]) obj_10000;
               } else if (i_5 <= 0 || (long)i_5 > this.field3803.method6520() / 520L) {
                  obj_10000 = null;
                  return (byte[]) obj_10000;
               } else {
                  byte[] bytes_6 = new byte[i_4];
                  int i_7 = 0;

                  for (int i_8 = 0; i_7 < i_4; i_8++) {
                     if (i_5 == 0) {
                        obj_10000 = null;
                        return (byte[]) obj_10000;
                     }

                     this.field3803.method6521(520L * (long)i_5);
                     int i_9 = i_4 - i_7;
                     int i_10;
                     int i_11;
                     int i_12;
                     int i_13;
                     byte b_14;
                     if (i_1 > 65535) {
                        if (i_9 > 510) {
                           i_9 = 510;
                        }

                        b_14 = 10;
                        this.field3803.method6522(field3804, 0, i_9 + b_14);
                        i_10 = ((field3804[1] & 0xff) << 16) + ((field3804[0] & 0xff) << 24) + (field3804[3] & 0xff) + ((field3804[2] & 0xff) << 8);
                        i_11 = (field3804[5] & 0xff) + ((field3804[4] & 0xff) << 8);
                        i_12 = (field3804[8] & 0xff) + ((field3804[7] & 0xff) << 8) + ((field3804[6] & 0xff) << 16);
                        i_13 = field3804[9] & 0xff;
                     } else {
                        if (i_9 > 512) {
                           i_9 = 512;
                        }

                        b_14 = 8;
                        this.field3803.method6522(field3804, 0, b_14 + i_9);
                        i_10 = (field3804[1] & 0xff) + ((field3804[0] & 0xff) << 8);
                        i_11 = (field3804[3] & 0xff) + ((field3804[2] & 0xff) << 8);
                        i_12 = ((field3804[5] & 0xff) << 8) + ((field3804[4] & 0xff) << 16) + (field3804[6] & 0xff);
                        i_13 = field3804[7] & 0xff;
                     }

                     if (i_10 != i_1 || i_8 != i_11 || i_13 != this.field3805) {
                        obj_10000 = null;
                        return (byte[]) obj_10000;
                     }

                     if (i_12 < 0 || (long)i_12 > this.field3803.method6520() / 520L) {
                        obj_10000 = null;
                        return (byte[]) obj_10000;
                     }

                     int i_15 = i_9 + b_14;

                     for (int i_16 = b_14; i_16 < i_15; i_16++) {
                        bytes_6[i_7++] = field3804[i_16];
                     }

                     i_5 = i_12;
                  }

                  byte[] bytes_21 = bytes_6;
                  return bytes_21;
               }
            }
         } catch (IOException ioexception_19) {
            return null;
         }
      }
   }
}
