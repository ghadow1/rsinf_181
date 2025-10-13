import java.io.File;
import java.io.IOException;

public class class119 implements class139 {

   static int field1539;
   NodeDeque field1537 = new NodeDeque();
   int field1533 = 0;
   double field1534 = 1.0D;
   int field1535 = 128;
   class233 field1536;
   int field1530;
   class124[] field1531;

   public class119(class233 class233_1, class233 class233_2, int i_3, double d_4, int i_6) {
      this.field1536 = class233_2;
      this.field1530 = i_3;
      this.field1533 = this.field1530;
      this.field1534 = d_4;
      this.field1535 = i_6;
      int[] ints_7 = class233_1.method4153(0);
      int i_8 = ints_7.length;
      this.field1531 = new class124[class233_1.method4154(0)];

      for (int i_9 = 0; i_9 < i_8; i_9++) {
         ByteBuffer class300_10 = new ByteBuffer(class233_1.method4144(0, ints_7[i_9]));
         this.field1531[ints_7[i_9]] = new class124(class300_10);
      }

   }

   public void method2762(int i_1) {
      for (int i_2 = 0; i_2 < this.field1531.length; i_2++) {
         if (this.field1531[i_2] != null) {
            this.field1531[i_2].method2844();
         }
      }

      this.field1537 = new NodeDeque();
      this.field1533 = this.field1530;
   }

   public int vmethod3284(int i_1, int i_2) {
      return this.field1531[i_1] != null ? this.field1531[i_1].field1623 : 0;
   }

   public int[] vmethod3287(int i_1, int i_2) {
      class124 class124_3 = this.field1531[i_1];
      if (class124_3 != null) {
         if (class124_3.field1631 != null) {
            this.field1537.method4888(class124_3);
            class124_3.field1633 = true;
            return class124_3.field1631;
         }

         boolean bool_4 = class124_3.method2846(this.field1534, this.field1535, this.field1536);
         if (bool_4) {
            if (this.field1533 == 0) {
               class124 class124_5 = (class124) this.field1537.method4891();
               class124_5.method2844();
            } else {
               --this.field1533;
            }

            this.field1537.method4888(class124_3);
            class124_3.field1633 = true;
            return class124_3.field1631;
         }
      }

      return null;
   }

   public void method2745(double d_1) {
      this.field1534 = d_1;
      this.method2762(169512565);
   }

   public boolean vmethod3279(int i_1, byte b_2) {
      return this.field1535 == 64;
   }

   public boolean vmethod3278(int i_1, byte b_2) {
      return this.field1531[i_1].field1624;
   }

   public int method2763() {
      int i_2 = 0;
      int i_3 = 0;
      class124[] arr_4 = this.field1531;

      for (int i_5 = 0; i_5 < arr_4.length; i_5++) {
         class124 class124_6 = arr_4[i_5];
         if (class124_6 != null && class124_6.field1632 != null) {
            i_2 += class124_6.field1632.length;
            int[] ints_7 = class124_6.field1632;

            for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
               int i_9 = ints_7[i_8];
               if (this.field1536.method4147(i_9)) {
                  ++i_3;
               }
            }
         }
      }

      if (i_2 == 0) {
         return 0;
      } else {
         return i_3 * 100 / i_2;
      }
   }

   public void method2736(int i_1) {
      for (int i_3 = 0; i_3 < this.field1531.length; i_3++) {
         class124 class124_4 = this.field1531[i_3];
         if (class124_4 != null && class124_4.field1629 != 0 && class124_4.field1633) {
            class124_4.method2845(i_1);
            class124_4.field1633 = false;
         }
      }

   }

   public static synchronized byte[] method2729(int i_0) {
      return BufferPool.method5761(i_0, false, (byte) 58);
   }

   static File method2760(String string_0, String string_1, int i_2) {
      String str_4 = i_2 == 0 ? "" : "" + i_2;
      class167.field2038 = new File(GameState.field3095, "jagex_cl_" + string_0 + "_" + string_1 + str_4 + ".dat");
      String string_5 = null;
      String string_6 = null;
      boolean bool_7 = false;
      ByteBuffer class300_9;
      File file_24;
      if (class167.field2038.exists()) {
         try {
            class343 class343_8 = new class343(class167.field2038, "rw", 10000L);

            int i_10;
            for (class300_9 = new ByteBuffer((int)class343_8.method6552()); class300_9.position < class300_9.buffer.length; class300_9.position += i_10) {
               i_10 = class343_8.method6554(class300_9.buffer, class300_9.position, class300_9.buffer.length - class300_9.position);
               if (i_10 == -1) {
                  throw new IOException();
               }
            }

            class300_9.position = 0;
            i_10 = class300_9.readUnsignedByte();
            if (i_10 < 1 || i_10 > 3) {
               throw new IOException("" + i_10);
            }

            int i_11 = 0;
            if (i_10 > 1) {
               i_11 = class300_9.readUnsignedByte();
            }

            if (i_10 <= 2) {
               string_5 = class300_9.readPrefixedNullTerminatedString();
               if (i_11 == 1) {
                  string_6 = class300_9.readPrefixedNullTerminatedString();
               }
            } else {
               string_5 = class300_9.readLengthPrefixedString();
               if (i_11 == 1) {
                  string_6 = class300_9.readLengthPrefixedString();
               }
            }

            class343_8.method6550();
         } catch (IOException ioexception_22) {
            ioexception_22.printStackTrace();
         }

         if (string_5 != null) {
            file_24 = new File(string_5);
            if (!file_24.exists()) {
               string_5 = null;
            }
         }

         if (string_5 != null) {
            file_24 = new File(string_5, "test.dat");
            if (!class186.method3618(file_24, true, (short) 2889)) {
               string_5 = null;
            }
         }
      }

      if (string_5 == null && i_2 == 0) {
         label139:
         for (int i_16 = 0; i_16 < class184.field2309.length; i_16++) {
            for (int i_17 = 0; i_17 < class167.field2043.length; i_17++) {
               File file_18 = new File(class167.field2043[i_17] + class184.field2309[i_16] + File.separatorChar + string_0 + File.separatorChar);
               if (file_18.exists() && class186.method3618(new File(file_18, "test.dat"), true, (short) 30279)) {
                  string_5 = file_18.toString();
                  bool_7 = true;
                  break label139;
               }
            }
         }
      }

      if (string_5 == null) {
         string_5 = GameState.field3095 + File.separatorChar + "jagexcache" + str_4 + File.separatorChar + string_0 + File.separatorChar + string_1 + File.separatorChar;
         bool_7 = true;
      }

      File file_23;
      if (string_6 != null) {
         file_23 = new File(string_6);
         file_24 = new File(string_5);

         try {
            File[] arr_25 = file_23.listFiles();
            File[] arr_19 = arr_25;

            for (int i_12 = 0; i_12 < arr_19.length; i_12++) {
               File file_13 = arr_19[i_12];
               File file_14 = new File(file_24, file_13.getName());
               boolean bool_15 = file_13.renameTo(file_14);
               if (!bool_15) {
                  throw new IOException();
               }
            }
         } catch (Exception exception_21) {
            exception_21.printStackTrace();
         }

         bool_7 = true;
      }

      if (bool_7) {
         file_23 = new File(string_5);
         class300_9 = null;

         try {
            class343 class343_26 = new class343(class167.field2038, "rw", 10000L);
            ByteBuffer class300_27 = new ByteBuffer(500);
            class300_27.writeByte(3);
            class300_27.writeByte(0);
            class300_27.writeUTF8String(file_23.getPath());

            class343_26.method6561(class300_27.buffer, 0, class300_27.position);
            class343_26.method6550();
         } catch (IOException ioexception_20) {
            ioexception_20.printStackTrace();
         }
      }

      return new File(string_5);
   }

   public static void method2761(class233 class233_0, String string_1, String string_2, int i_3, boolean bool_4, byte b_5) {
      int i_6 = class233_0.method4160(string_1);
      int i_7 = class233_0.method4161(i_6, string_2);
      class169.method3503(class233_0, i_6, i_7, i_3, bool_4);
   }

   static int method2743(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      Widget widget_4 = WorldMapElement.getWidget(MouseRecorder.field1098[--class70.field1014]);
      if (i_0 == 2600) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2585;
         return 1;
      } else if (i_0 == 2601) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2586;
         return 1;
      } else if (i_0 == 2602) {
         MouseRecorder.field1093[++class221.field2747 - 1] = widget_4.field2601;
         return 1;
      } else if (i_0 == 2603) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2687;
         return 1;
      } else if (i_0 == 2604) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2569;
         return 1;
      } else if (i_0 == 2605) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2618;
         return 1;
      } else if (i_0 == 2606) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2615;
         return 1;
      } else if (i_0 == 2607) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2640;
         return 1;
      } else if (i_0 == 2608) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2616;
         return 1;
      } else if (i_0 == 2609) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2595;
         return 1;
      } else if (i_0 == 2610) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2596;
         return 1;
      } else if (i_0 == 2611) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2695;
         return 1;
      } else if (i_0 == 2612) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2639;
         return 1;
      } else if (i_0 == 2613) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2693.getId(1137104764);
         return 1;
      } else if (i_0 == 2614) {
         MouseRecorder.field1098[++class70.field1014 - 1] = widget_4.field2564 ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

}
