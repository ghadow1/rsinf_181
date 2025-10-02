import java.io.IOException;

public class class95 {

   ServerPacketProt field1321;
   ServerPacketProt field1317;
   public class328 field1313;
   ServerPacketProt field1309;
   class260 field1316 = new class260();
   int field1311 = 0;
   ByteBuffer field1312 = new ByteBuffer(5000);
   class299 field1314 = new class299(40000);
   ServerPacketProt inPacketType = null;
   int field1315 = 0;
   boolean field1322 = true;
   int field1318 = 0;
   int field1319 = 0;
   class305 field1320;

   class305 method2223() {
      return this.field1320;
   }

   void method2233() {
      if (this.field1320 != null) {
         this.field1320.vmethod5830(-768440649);
         this.field1320 = null;
      }

   }

   void method2224() {
      this.field1320 = null;
   }

   final void method2218() {
      this.field1316.method4803();
      this.field1311 = 0;
   }

   public final void copy(class187 class187_1) {
      this.field1316.method4819(class187_1);
      class187_1.field2331 = class187_1.field2333.position;
      class187_1.field2333.position = 0;
      this.field1311 += class187_1.field2331;
   }

   void method2221(class305 class305_1) {
      this.field1320 = class305_1;
   }

   final void method2234() throws IOException {
      if (this.field1320 != null && this.field1311 > 0) {
         this.field1312.position = 0;

         while (true) {
            class187 class187_2 = (class187) this.field1316.method4838();
            if (class187_2 == null || class187_2.field2331 > this.field1312.buffer.length - this.field1312.position) {
               this.field1320.vmethod5829(this.field1312.buffer, 0, this.field1312.position, -1696227994);
               this.field1319 = 0;
               break;
            }

            this.field1312.writeBytes(class187_2.field2333.buffer, 0, class187_2.field2331);
            this.field1311 -= class187_2.field2331;
            class187_2.method3607();
            class187_2.field2333.release();
            class187_2.method3620((byte) -108);
         }
      }

   }

   static final void method2245() {
      for (class86 class86_1 = (class86) client.field670.method4892(); class86_1 != null; class86_1 = (class86) client.field670.method4894()) {
         if (class86_1.field1215 == class42.field372 && client.field881 <= class86_1.field1240) {
            if (client.field881 >= class86_1.field1217) {
               if (class86_1.field1224 > 0) {
                  class79 class79_2 = client.field694[class86_1.field1224 - 1];
                  if (class79_2 != null && class79_2.field1005 >= 0 && class79_2.field1005 < 13312 && class79_2.field949 >= 0 && class79_2.field949 < 13312) {
                     class86_1.method2033(class79_2.field1005, class79_2.field949, class62.method1130(class79_2.field1005, class79_2.field949, class86_1.field1215) - class86_1.field1225, client.field881, -653530834);
                  }
               }

               if (class86_1.field1224 < 0) {
                  int i_3 = -class86_1.field1224 - 1;
                  class66 class66_4;
                  if (i_3 == client.field770) {
                     class66_4 = client.field657;
                  } else {
                     class66_4 = client.field909[i_3];
                  }

                  if (class66_4 != null && class66_4.field1005 >= 0 && class66_4.field1005 < 13312 && class66_4.field949 >= 0 && class66_4.field949 < 13312) {
                     class86_1.method2033(class66_4.field1005, class66_4.field949, class62.method1130(class66_4.field1005, class66_4.field949, class86_1.field1215) - class86_1.field1225, client.field881, -1906132151);
                  }
               }

               class86_1.method2043(client.field718, (byte) -4);
               class5.field22.method3077(class42.field372, (int)class86_1.field1218, (int)class86_1.field1227, (int)class86_1.field1228, 60, class86_1, class86_1.field1234, -1L, false);
            }
         } else {
            class86_1.method3607();
         }
      }

   }

   static boolean method2244(int i_0) {
      for (int i_2 = 0; i_2 < client.field754; i_2++) {
         if (client.field921[i_2] == i_0) {
            return true;
         }
      }

      return false;
   }

}
