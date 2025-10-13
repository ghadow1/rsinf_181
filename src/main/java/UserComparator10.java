import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class UserComparator10 {

   static int localSceneY;
   Message[] messages = new Message[100];
   int count;

   static final boolean runCs1(Widget widget_0) {
      if (widget_0.field2683 == null) {
         return false;
      } else {
         for (int i_2 = 0; i_2 < widget_0.field2683.length; i_2++) {
            int i_3 = class212.method3969(widget_0, i_2);
            int i_4 = widget_0.field2684[i_2];
            if (widget_0.field2683[i_2] == 2) {
               if (i_3 >= i_4) {
                  return false;
               }
            } else if (widget_0.field2683[i_2] == 3) {
               if (i_3 <= i_4) {
                  return false;
               }
            } else if (widget_0.field2683[i_2] == 4) {
               if (i_3 == i_4) {
                  return false;
               }
            } else if (i_3 != i_4) {
               return false;
            }
         }

         return true;
      }
   }

   static final void method2215(int i_0, int i_1, int i_2, int i_3) {
      for (int i_5 = 0; i_5 < Client.field858; i_5++) {
         if (Client.field808[i_5] + Client.field865[i_5] > i_0 && Client.field808[i_5] < i_0 + i_2 && Client.field860[i_5] + Client.field864[i_5] > i_1 && Client.field864[i_5] < i_3 + i_1) {
            Client.field843[i_5] = true;
         }
      }

   }

   static void method2214() {
      if (class157.method3428()) {
         Login.field1205 = true;
         Login.field1190 = 0;
         Login.field1186 = 0;
      }

   }

   public static void method2213(ByteBuffer class300_0) {
      class97 class97_3 = new class97();
      class97_3.field1330 = class300_0.readUnsignedByte();
      class97_3.field1340 = class300_0.readIntMedEndian();
      class97_3.field1331 = new int[class97_3.field1330];
      class97_3.field1332 = new int[class97_3.field1330];
      class97_3.field1333 = new Field[class97_3.field1330];
      class97_3.field1329 = new int[class97_3.field1330];
      class97_3.field1335 = new Method[class97_3.field1330];
      class97_3.field1336 = new byte[class97_3.field1330][][];

      for (int i_4 = 0; i_4 < class97_3.field1330; i_4++) {
         try {
            int i_5 = class300_0.readUnsignedByte();
            String string_6;
            String string_7;
            int i_8;
            if (i_5 != 0 && i_5 != 1 && i_5 != 2) {
               if (i_5 == 3 || i_5 == 4) {
                  string_6 = class300_0.readNullTerminatedString();
                  string_7 = class300_0.readNullTerminatedString();
                  i_8 = class300_0.readUnsignedByte();
                  String[] arr_9 = new String[i_8];

                  for (int i_10 = 0; i_10 < i_8; i_10++) {
                     arr_9[i_10] = class300_0.readNullTerminatedString();
                  }

                  String string_21 = class300_0.readNullTerminatedString();
                  byte[][] bytes_11 = new byte[i_8][];
                  int i_13;
                  if (i_5 == 3) {
                     for (int i_12 = 0; i_12 < i_8; i_12++) {
                        i_13 = class300_0.readIntMedEndian();
                        bytes_11[i_12] = new byte[i_13];
                        class300_0.readBytes(bytes_11[i_12], 0, i_13);
                     }
                  }

                  class97_3.field1331[i_4] = i_5;
                  Class[] arr_22 = new Class[i_8];

                  for (i_13 = 0; i_13 < i_8; i_13++) {
                     arr_22[i_13] = User.method5059(arr_9[i_13]);
                  }

                  Class class_23 = User.method5059(string_21);
                  if (User.method5059(string_6).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] arr_14 = User.method5059(string_6).getDeclaredMethods();
                  Method[] arr_15 = arr_14;

                  for (int i_16 = 0; i_16 < arr_15.length; i_16++) {
                     Method method_17 = arr_15[i_16];
                     if (method_17.getName().equals(string_7)) {
                        Class[] arr_18 = method_17.getParameterTypes();
                        if (arr_18.length == arr_22.length) {
                           boolean bool_19 = true;

                           for (int i_20 = 0; i_20 < arr_22.length; i_20++) {
                              if (arr_18[i_20] != arr_22[i_20]) {
                                 bool_19 = false;
                                 break;
                              }
                           }

                           if (bool_19 && class_23 == method_17.getReturnType()) {
                              class97_3.field1335[i_4] = method_17;
                           }
                        }
                     }
                  }

                  class97_3.field1336[i_4] = bytes_11;
               }
            } else {
               string_6 = class300_0.readNullTerminatedString();
               string_7 = class300_0.readNullTerminatedString();
               i_8 = 0;
               if (i_5 == 1) {
                  i_8 = class300_0.readIntMedEndian();
               }

               class97_3.field1331[i_4] = i_5;
               class97_3.field1329[i_4] = i_8;
               if (User.method5059(string_6).getClassLoader() == null) {
                  throw new SecurityException();
               }

               class97_3.field1333[i_4] = User.method5059(string_6).getDeclaredField(string_7);
            }
         } catch (ClassNotFoundException classnotfoundexception_25) {
            class97_3.field1332[i_4] = -1;
         } catch (SecurityException securityexception_26) {
            class97_3.field1332[i_4] = -2;
         } catch (NullPointerException nullpointerexception_27) {
            class97_3.field1332[i_4] = -3;
         } catch (Exception exception_28) {
            class97_3.field1332[i_4] = -4;
         } catch (Throwable throwable_29) {
            class97_3.field1332[i_4] = -5;
         }
      }

      class96.field1324.method4819(class97_3);
   }

   Message addMessage(int i_1, String string_2, String string_3, String string_4) {
      Message message_6 = this.messages[99];

      for (int i_7 = this.count; i_7 > 0; --i_7) {
         if (i_7 != 100) {
            this.messages[i_7] = this.messages[i_7 - 1];
         }
      }

      if (message_6 == null) {
         message_6 = new Message(i_1, string_2, string_4, string_3);
      } else {
         message_6.unlink();
         message_6.removeDual();
         message_6.set(i_1, string_2, string_4, string_3);
      }

      this.messages[0] = message_6;
      if (this.count < 100) {
         ++this.count;
      }

      return message_6;
   }

   Message getMessage(int i_1) {
      return i_1 >= 0 && i_1 < this.count ? this.messages[i_1] : null;
   }

   int size() {
      return this.count;
   }

}
