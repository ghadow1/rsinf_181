import java.io.IOException;

public class PacketWriter {

   ServerPacketProt field1321;
   ServerPacketProt field1317;
   public class328 field1313;
   ServerPacketProt field1309;
   class260 field1316 = new class260();
   int field1311 = 0;
   ByteBuffer field1312 = new ByteBuffer(5000);
   PacketBuffer packetBuffer = new PacketBuffer(40000);
   ServerPacketProt serverPacket = null;
   int serverPacketLength = 0;
   boolean field1322 = true;
   int field1318 = 0;
   int field1319 = 0;
   AbstractSocket field1320;

   AbstractSocket getSocket() {
      return this.field1320;
   }

   void method2233() {
      if (this.field1320 != null) {
         this.field1320.close();
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
      class187_1.field2331 = class187_1.outBuffer.position;
      class187_1.outBuffer.position = 0;
      this.field1311 += class187_1.field2331;
   }

   void method2221(AbstractSocket class305_1) {
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

            this.field1312.writeBytes(class187_2.outBuffer.buffer, 0, class187_2.field2331);
            this.field1311 -= class187_2.field2331;
            class187_2.unlink();
            class187_2.outBuffer.release();
            class187_2.method3620((byte) -108);
         }
      }

   }

   static final void method2245() {
      for (Projectile projectile_1 = (Projectile) Client.projectiles.method4892(); projectile_1 != null; projectile_1 = (Projectile) Client.projectiles.method4894()) {
         if (projectile_1.targetPlane == WorldMapRectangle.plane && Client.cycle <= projectile_1.endCycle) {
            if (Client.cycle >= projectile_1.startCycle) {
               if (projectile_1.targetX > 0) {
                  NPC NPC_2 = Client.npcs[projectile_1.targetX - 1];
                  if (NPC_2 != null && NPC_2.x >= 0 && NPC_2.x < 13312 && NPC_2.y >= 0 && NPC_2.y < 13312) {
                     projectile_1.updateVelocity(NPC_2.x, NPC_2.y, MusicPatchPcmStream.getTileHeight(NPC_2.x, NPC_2.y, projectile_1.targetPlane) - projectile_1.targetZ, Client.cycle);
                  }
               }

               if (projectile_1.targetX < 0) {
                  int i_3 = -projectile_1.targetX - 1;
                  class66 class66_4;
                  if (i_3 == Client.field770) {
                     class66_4 = Client.localPlayer;
                  } else {
                     class66_4 = Client.field909[i_3];
                  }

                  if (class66_4 != null && class66_4.x >= 0 && class66_4.x < 13312 && class66_4.y >= 0 && class66_4.y < 13312) {
                     projectile_1.updateVelocity(class66_4.x, class66_4.y, MusicPatchPcmStream.getTileHeight(class66_4.x, class66_4.y, projectile_1.targetPlane) - projectile_1.targetZ, Client.cycle);
                  }
               }

               projectile_1.update(Client.field718);
               class5.field22.method3077(WorldMapRectangle.plane, (int) projectile_1.x, (int) projectile_1.z, (int) projectile_1.y, 60, projectile_1, projectile_1.yaw, -1L, false);
            }
         } else {
            projectile_1.unlink();
         }
      }

   }

   static boolean method2244(int i_0) {
      for (int i_2 = 0; i_2 < Client.field754; i_2++) {
         if (Client.field921[i_2] == i_0) {
            return true;
         }
      }

      return false;
   }

}
