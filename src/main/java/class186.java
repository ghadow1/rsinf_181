import java.io.File;
import java.io.RandomAccessFile;

public class class186 {

   static final void method3619(byte b_0) {
      if (class190.field2361 != null) {
         class190.field2361.cleanup();
      }

      if (WorldMapElement.field1144 != null) {
         WorldMapElement.field1144.cleanup();
      }

   }

   static boolean method3618(File file_0, boolean bool_1, short s_2) {
      try {
         RandomAccessFile randomaccessfile_3 = new RandomAccessFile(file_0, "rw");
         int i_4 = randomaccessfile_3.read();
         randomaccessfile_3.seek(0L);
         randomaccessfile_3.write(i_4);
         randomaccessfile_3.seek(0L);
         randomaccessfile_3.close();
         if (bool_1) {
            file_0.delete();
         }

         return true;
      } catch (Exception exception_5) {
         return false;
      }
   }

}
