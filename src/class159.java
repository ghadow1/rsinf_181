import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class159 extends ChainedComparator {

   static class312 field1995;
   final boolean field1997;

   public class159(boolean bool_1) {
      this.field1997 = bool_1;
   }

   int method3442(Categorizable categorizable_1, Categorizable categorizable_2) {
      return categorizable_1.category != 0 && categorizable_2.category != 0 ? (this.field1997 ? categorizable_1.method5041().method5198(categorizable_2.method5041()) : categorizable_2.method5041().method5198(categorizable_1.method5041())) : this.compareWithNext(categorizable_1, categorizable_2);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3442((Categorizable) object_1, (Categorizable) object_2);
   }

   public static void method3440(String string_0, String string_1, int i_2, int i_3) throws IOException {
      FontName.field350 = i_3;
      class119.field1539 = i_2;

      try {
         class62.field586 = System.getProperty("os.name");
      } catch (Exception exception_15) {
         class62.field586 = "Unknown";
      }

      class67.field647 = class62.field586.toLowerCase();

      try {
         GameState.field3095 = System.getProperty("user.home");
         if (GameState.field3095 != null) {
            GameState.field3095 = GameState.field3095 + "/";
         }
      } catch (Exception exception_14) {
         ;
      }

      try {
         if (class67.field647.startsWith("win")) {
            if (GameState.field3095 == null) {
               GameState.field3095 = System.getenv("USERPROFILE");
            }
         } else if (GameState.field3095 == null) {
            GameState.field3095 = System.getenv("HOME");
         }

         if (GameState.field3095 != null) {
            GameState.field3095 = GameState.field3095 + "/";
         }
      } catch (Exception exception_13) {
         ;
      }

      if (GameState.field3095 == null) {
         GameState.field3095 = "~/";
      }

      class167.field2043 = new String[] {"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", GameState.field3095, "/tmp/", ""};
      class184.field2309 = new String[] {".jagex_cache_" + class119.field1539, ".file_store_" + class119.field1539};
      int i_10 = 0;

      int i_8;
      File file_9;
      label135:
      while (i_10 < 4) {
         class1.field2 = class119.method2760(string_0, string_1, i_10);
         if (!class1.field2.exists()) {
            class1.field2.mkdirs();
         }

         File[] arr_6 = class1.field2.listFiles();
         if (arr_6 == null) {
            break;
         }

         File[] arr_7 = arr_6;
         i_8 = 0;

         while (true) {
            if (i_8 >= arr_7.length) {
               break label135;
            }

            file_9 = arr_7[i_8];
            if (!class186.method3618(file_9, false, (short) 25650)) {
               ++i_10;
               break;
            }

            ++i_8;
         }
      }

      File file_5 = class1.field2;
      class169.field2050 = file_5;
      if (!class169.field2050.exists()) {
         throw new RuntimeException("");
      } else {
         class169.field2055 = true;

         try {
            File file_17 = new File(GameState.field3095, "random.dat");
            if (file_17.exists()) {
               class167.field2040 = new class342(new class343(file_17, "rw", 25L), 24, 0);
            } else {
               label115:
               for (int i_11 = 0; i_11 < class184.field2309.length; i_11++) {
                  for (i_8 = 0; i_8 < class167.field2043.length; i_8++) {
                     file_9 = new File(class167.field2043[i_8] + class184.field2309[i_11] + File.separatorChar + "random.dat");
                     if (file_9.exists()) {
                        class167.field2040 = new class342(new class343(file_9, "rw", 25L), 24, 0);
                        break label115;
                     }
                  }
               }
            }

            if (class167.field2040 == null) {
               RandomAccessFile randomaccessfile_18 = new RandomAccessFile(file_17, "rw");
               i_8 = randomaccessfile_18.read();
               randomaccessfile_18.seek(0L);
               randomaccessfile_18.write(i_8);
               randomaccessfile_18.seek(0L);
               randomaccessfile_18.close();
               class167.field2040 = new class342(new class343(file_17, "rw", 25L), 24, 0);
            }
         } catch (IOException ioexception_16) {
            ;
         }

         class167.field2042 = new class342(new class343(class65.method1177("main_file_cache.dat2", -46052492), "rw", 1048576000L), 5200, 0);
         class167.field2039 = new class342(new class343(class65.method1177("main_file_cache.idx255", -46052492), "rw", 1048576L), 6000, 0);
         class167.field2041 = new class342[FontName.field350];

         for (int i_12 = 0; i_12 < FontName.field350; i_12++) {
            class167.field2041[i_12] = new class342(new class343(class65.method1177("main_file_cache.idx" + i_12, -46052492), "rw", 1048576L), 6000, 0);
         }

      }
   }

   static int method3436(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      if (i_0 == 5306) {
         MouseRecorder.field1098[++class70.field1014 - 1] = class34.method598();
         return 1;
      } else {
         int i_4;
         if (i_0 == 5307) {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            if (i_4 == 1 || i_4 == 2) {
               class170.method3515(i_4);
            }

            return 1;
         } else if (i_0 == 5308) {
            MouseRecorder.field1098[++class70.field1014 - 1] = class17.field117.field1064;
            return 1;
         } else if (i_0 != 5309) {
            if (i_0 == 5310) {
               --class70.field1014;
               return 1;
            } else {
               return 2;
            }
         } else {
            i_4 = MouseRecorder.field1098[--class70.field1014];
            if (i_4 == 1 || i_4 == 2) {
               class17.field117.field1064 = i_4;
               class97.method2268(2084017992);
            }

            return 1;
         }
      }
   }

}
