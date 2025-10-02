import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class class70 extends LinkedListNode {

   static class305 field1015;
   static int field1017;
   static int field1014;
   int field1016;
   int field1011;
   int field1012;
   int field1010;

   class70(int i_1, int i_2, int i_3, int i_4) {
      this.field1016 = i_1;
      this.field1011 = i_2;
      this.field1012 = i_3;
      this.field1010 = i_4;
   }

   void method1672(int i_1, int i_2, int i_3, int i_4, int i_5) {
      this.field1016 = i_1;
      this.field1011 = i_2;
      this.field1012 = i_3;
      this.field1010 = i_4;
   }

   static final byte[] method1678(byte[] bytes_0) {
      ByteBuffer class300_2 = new ByteBuffer(bytes_0);
      int i_3 = class300_2.readUnsignedByte();
      int i_4 = class300_2.readIntMedEndian();
      if (i_4 < 0 || class233.field3143 != 0 && i_4 > class233.field3143) {
         throw new RuntimeException();
      } else if (i_3 == 0) {
         byte[] bytes_5 = new byte[i_4];
         class300_2.readBytes(bytes_5, 0, i_4);
         return bytes_5;
      } else {
         int i_7 = class300_2.readIntMedEndian();
         if (i_7 < 0 || class233.field3143 != 0 && i_7 > class233.field3143) {
            throw new RuntimeException();
         } else {
            byte[] bytes_6 = new byte[i_7];
            if (i_3 == 1) {
               class304.method5772(bytes_6, i_7, bytes_0, i_4, 9);
            } else {
               class233.field3139.method6497(class300_2, bytes_6, 1327705943);
            }

            return bytes_6;
         }
      }
   }

   public static void method1671(class299 class299_0) {
      class97 class97_2 = (class97) class96.field1324.method4838();
      if (class97_2 != null) {
         int i_3 = class299_0.position;
         class299_0.writeIntBigEndian(class97_2.field1340);

         for (int i_4 = 0; i_4 < class97_2.field1330; i_4++) {
            if (class97_2.field1332[i_4] != 0) {
               class299_0.writeByte(class97_2.field1332[i_4]);
            } else {
               try {
                  int i_5 = class97_2.field1331[i_4];
                  Field field_6;
                  int i_7;
                  if (i_5 == 0) {
                     field_6 = class97_2.field1333[i_4];
                     i_7 = field_6.getInt((Object) null);
                     class299_0.writeByte(0);
                     class299_0.writeIntBigEndian(i_7);
                  } else if (i_5 == 1) {
                     field_6 = class97_2.field1333[i_4];
                     field_6.setInt((Object) null, class97_2.field1329[i_4]);
                     class299_0.writeByte(0);
                  } else if (i_5 == 2) {
                     field_6 = class97_2.field1333[i_4];
                     i_7 = field_6.getModifiers();
                     class299_0.writeByte(0);
                     class299_0.writeIntBigEndian(i_7);
                  }

                  Method method_26;
                  if (i_5 != 3) {
                     if (i_5 == 4) {
                        method_26 = class97_2.field1335[i_4];
                        i_7 = method_26.getModifiers();
                        class299_0.writeByte(0);
                        class299_0.writeIntBigEndian(i_7);
                     }
                  } else {
                     method_26 = class97_2.field1335[i_4];
                     byte[][] bytes_11 = class97_2.field1336[i_4];
                     Object[] arr_8 = new Object[bytes_11.length];

                     for (int i_9 = 0; i_9 < bytes_11.length; i_9++) {
                        ObjectInputStream objectinputstream_10 = new ObjectInputStream(new ByteArrayInputStream(bytes_11[i_9]));
                        arr_8[i_9] = objectinputstream_10.readObject();
                     }

                     Object object_12 = method_26.invoke((Object) null, arr_8);
                     if (object_12 == null) {
                        class299_0.writeByte(0);
                     } else if (object_12 instanceof Number) {
                        class299_0.writeByte(1);
                        class299_0.writeLongBigEndian(((Number) object_12).longValue());
                     } else if (object_12 instanceof String) {
                        class299_0.writeByte(2);
                        class299_0.writeNullTerminatedString((String) object_12);
                     } else {
                        class299_0.writeByte(4);
                     }
                  }
               } catch (ClassNotFoundException classnotfoundexception_14) {
                  class299_0.writeByte(-10);
               } catch (InvalidClassException invalidclassexception_15) {
                  class299_0.writeByte(-11);
               } catch (StreamCorruptedException streamcorruptedexception_16) {
                  class299_0.writeByte(-12);
               } catch (OptionalDataException optionaldataexception_17) {
                  class299_0.writeByte(-13);
               } catch (IllegalAccessException illegalaccessexception_18) {
                  class299_0.writeByte(-14);
               } catch (IllegalArgumentException illegalargumentexception_19) {
                  class299_0.writeByte(-15);
               } catch (InvocationTargetException invocationtargetexception_20) {
                  class299_0.writeByte(-16);
               } catch (SecurityException securityexception_21) {
                  class299_0.writeByte(-17);
               } catch (IOException ioexception_22) {
                  class299_0.writeByte(-18);
               } catch (NullPointerException nullpointerexception_23) {
                  class299_0.writeByte(-19);
               } catch (Exception exception_24) {
                  class299_0.writeByte(-20);
               } catch (Throwable throwable_25) {
                  class299_0.writeByte(-21);
               }
            }
         }

         class299_0.writeCRC32Checksum(i_3);
         class97_2.unlink();
      }
   }

   static void method1677(int i_0) {
      class187 class187_1 = class235.method4265(class183.field2238, Client.field880.field1313, 1775123545);
      class187_1.field2333.writeByte(class34.method598((byte) -18));
      class187_1.field2333.writeShortBigEndian(class7.field46);
      class187_1.field2333.writeShortBigEndian(class249.field3308);
      Client.field880.copy(class187_1);
   }

   static boolean method1676(String string_0, int i_1) {
      if (string_0 == null) {
         return false;
      } else {
         try {
            new URL(string_0);
            return true;
         } catch (MalformedURLException malformedurlexception_3) {
            return false;
         }
      }
   }

}
