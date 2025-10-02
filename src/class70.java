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

public class class70 extends class180 {

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

   static final byte[] method1678(byte[] bytes_0, int i_1) {
      class300 class300_2 = new class300(bytes_0);
      int i_3 = class300_2.method5504((byte) 118);
      int i_4 = class300_2.method5499((byte) -90);
      if (i_4 < 0 || class233.field3143 != 0 && i_4 > class233.field3143) {
         throw new RuntimeException();
      } else if (i_3 == 0) {
         byte[] bytes_5 = new byte[i_4];
         class300_2.method5697(bytes_5, 0, i_4, (byte) 1);
         return bytes_5;
      } else {
         int i_7 = class300_2.method5499((byte) -65);
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

   public static void method1671(class299 class299_0, int i_1) {
      class97 class97_2 = (class97) class96.field1324.method4838();
      if (class97_2 != null) {
         int i_3 = class299_0.field3732;
         class299_0.method5481(class97_2.field1340, -890185318);

         for (int i_4 = 0; i_4 < class97_2.field1330; i_4++) {
            if (class97_2.field1332[i_4] != 0) {
               class299_0.method5655(class97_2.field1332[i_4], 706961807);
            } else {
               try {
                  int i_5 = class97_2.field1331[i_4];
                  Field field_6;
                  int i_7;
                  if (i_5 == 0) {
                     field_6 = class97_2.field1333[i_4];
                     i_7 = field_6.getInt((Object) null);
                     class299_0.method5655(0, 1117423719);
                     class299_0.method5481(i_7, -433478698);
                  } else if (i_5 == 1) {
                     field_6 = class97_2.field1333[i_4];
                     field_6.setInt((Object) null, class97_2.field1329[i_4]);
                     class299_0.method5655(0, 319831057);
                  } else if (i_5 == 2) {
                     field_6 = class97_2.field1333[i_4];
                     i_7 = field_6.getModifiers();
                     class299_0.method5655(0, 1194584478);
                     class299_0.method5481(i_7, 1096227411);
                  }

                  Method method_26;
                  if (i_5 != 3) {
                     if (i_5 == 4) {
                        method_26 = class97_2.field1335[i_4];
                        i_7 = method_26.getModifiers();
                        class299_0.method5655(0, 934492629);
                        class299_0.method5481(i_7, -1472155018);
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
                        class299_0.method5655(0, 2115258477);
                     } else if (object_12 instanceof Number) {
                        class299_0.method5655(1, 193457688);
                        class299_0.method5483(((Number) object_12).longValue());
                     } else if (object_12 instanceof String) {
                        class299_0.method5655(2, 1376685025);
                        class299_0.method5485((String) object_12, 2144354933);
                     } else {
                        class299_0.method5655(4, 318411229);
                     }
                  }
               } catch (ClassNotFoundException classnotfoundexception_14) {
                  class299_0.method5655(-10, 1227964477);
               } catch (InvalidClassException invalidclassexception_15) {
                  class299_0.method5655(-11, 249377365);
               } catch (StreamCorruptedException streamcorruptedexception_16) {
                  class299_0.method5655(-12, 910929731);
               } catch (OptionalDataException optionaldataexception_17) {
                  class299_0.method5655(-13, 1905279899);
               } catch (IllegalAccessException illegalaccessexception_18) {
                  class299_0.method5655(-14, 728561144);
               } catch (IllegalArgumentException illegalargumentexception_19) {
                  class299_0.method5655(-15, 682420811);
               } catch (InvocationTargetException invocationtargetexception_20) {
                  class299_0.method5655(-16, 329127298);
               } catch (SecurityException securityexception_21) {
                  class299_0.method5655(-17, 840058657);
               } catch (IOException ioexception_22) {
                  class299_0.method5655(-18, 219074797);
               } catch (NullPointerException nullpointerexception_23) {
                  class299_0.method5655(-19, 1743410973);
               } catch (Exception exception_24) {
                  class299_0.method5655(-20, 1000824353);
               } catch (Throwable throwable_25) {
                  class299_0.method5655(-21, 2133807152);
               }
            }
         }

         class299_0.method5529(i_3, 1250667479);
         class97_2.method3607();
      }
   }

   static void method1677(int i_0) {
      class187 class187_1 = class235.method4265(class183.field2238, client.field880.field1313, 1775123545);
      class187_1.field2333.method5655(class34.method598((byte) -18), 1634534091);
      class187_1.field2333.method5479(class7.field46, (byte) 112);
      class187_1.field2333.method5479(class249.field3308, (byte) -85);
      client.field880.method2219(class187_1, 2067459847);
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
