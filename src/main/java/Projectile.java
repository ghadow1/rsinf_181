public final class Projectile extends Entity {

   boolean isMoving = false;
   int animationFrame = 0;
   int animationCycle = 0;
   int graphicsId;
   int targetPlane;
   int sourceX;
   int sourceZ;
   int sourceY;
   int startCycle;
   int endCycle;
   int slope;
   int startHeight;
   int targetX;
   int targetZ;
   SequenceAnimation animation;
   double x;
   double z;
   double y;
   double velocityX;
   double velocityZ;
   double velocity;
   double velocityY;
   double accelerationZ;
   int yaw;
   int pitch;

   Projectile(int graphicsId, int plane, int sourceX, int sourceZ, int sourceY, int startCycle, int endCycle, int slope, int startHeight, int targetX, int targetZ) {
      this.graphicsId = graphicsId;
      this.targetPlane = plane;
      this.sourceX = sourceX;
      this.sourceZ = sourceZ;
      this.sourceY = sourceY;
      this.startCycle = startCycle;
      this.endCycle = endCycle;
      this.slope = slope;
      this.startHeight = startHeight;
      this.targetX = targetX;
      this.targetZ = targetZ;
      this.isMoving = false;
      int animationId = SceneSound.method3887(this.graphicsId).field3238;
      if (animationId != -1) {
         this.animation = class7.method81(animationId);
      } else {
         this.animation = null;
      }

   }

   public static ErrorHandler method2046(int i_0) {
      ErrorHandler errorHandler_2 = (ErrorHandler) ErrorHandler.field3325.get((long) i_0);
      if (errorHandler_2 != null) {
         return errorHandler_2;
      } else {
         byte[] bytes_3 = ErrorHandler.field3327.method4144(32, i_0);
         errorHandler_2 = new ErrorHandler();
         if (bytes_3 != null) {
            errorHandler_2.method4552(new ByteBuffer(bytes_3));
         }

         ErrorHandler.field3325.put(errorHandler_2, (long) i_0);
         return errorHandler_2;
      }
   }

   public static void decode(PacketBuffer buffer) {
      int sourceX;
      byte localYOffset;
      int targetX;
      int startCycle;
      int endCycle;  // Renamed from graphicsId
      int sourceY;
      int startHeight;
      int targetZOffset;
      int targetZ;
      int targetXOffset;
      int slope;
      int graphicsId;  // Renamed from endCycle
      int targetY;

      // Read projectile information
      targetZOffset = buffer.readInvertedUnsignedByte() * 4; // Target Z offset
      endCycle = buffer.readUnsignedShort(); // This is actually endCycle/speed
      graphicsId = buffer.readShortWithOffset(); // This is actually graphicsId
      startHeight = buffer.readInvertedUnsignedByte() * 4; // Start height offset
      targetX = buffer.readSignedShortLittleEndian(); // Target X coordinate
      slope = buffer.readUnsignedByte(); // Projectile arc/slope
      targetY = buffer.readInvertedUnsignedByte(); // Target Y height
      startCycle = buffer.readShortLittleEndian(); // Start cycle (delay)

      // Read projectile location (packed into single byte)
      int packedLocation = buffer.readOffsetUnsignedByte();
      sourceX = (packedLocation >> 4 & 0x7) + class311.localSceneX;
      sourceY = (packedLocation & 0x7) + UserComparator10.localSceneY;

      // Read target offsets
      localYOffset = buffer.readOffsetByte(); // Local Y offset
      byte localXOffset = buffer.readNegatedByte(); // Local X offset

      targetXOffset = localXOffset + sourceX;
      int targetYOffset = localYOffset + sourceY;

      if (sourceX >= 0 && sourceY >= 0 && sourceX < 104 && sourceY < 104
              && targetXOffset >= 0 && targetYOffset >= 0 && targetXOffset < 104 && targetYOffset < 104
              && graphicsId != 65535) {  // Changed from endCycle

         // Convert to world coordinates (128 units per tile, center at 64)
         sourceX = sourceX * 128 + 64;
         sourceY = sourceY * 128 + 64;
         targetXOffset = targetXOffset * 128 + 64;
         targetYOffset = targetYOffset * 128 + 64;

         Projectile projectile = new Projectile(
                 endCycle,
                 WorldMapRectangle.plane,
                 sourceX,
                 sourceY,
                 MusicPatchPcmStream.getTileHeight(sourceX, sourceY, WorldMapRectangle.plane) - startHeight,
                 startCycle + Client.cycle,
                 graphicsId + Client.cycle,
                 slope,
                 targetY,
                 targetX,
                 targetZOffset
         );

         projectile.updateVelocity(
                 targetXOffset,
                 targetYOffset,
                 MusicPatchPcmStream.getTileHeight(targetXOffset, targetYOffset, WorldMapRectangle.plane) - targetZOffset,
                 startCycle + Client.cycle
         );

         Client.projectiles.addFirst(projectile);

         System.out.println(String.format("PROJECTILE_DECODE: gfxId=%d speed=%d startH=%d endH=%d slope=%d delay=%d srcX=%d srcY=%d dstX=%d dstY=%d targetIdx=%d",
                 graphicsId, endCycle, startHeight, targetZOffset, slope, startCycle, sourceX / 128, sourceY / 128, targetXOffset / 128, targetYOffset / 128, targetX));
      }
   }

   protected final class127 vmethod3253(int i_1) {
      class243 graphicsDefinition = SceneSound.method3887(this.graphicsId);
      class127 model = graphicsDefinition.method4406(this.animationFrame);
      if (model == null) {
         return null;
      } else {
         model.method2863(this.pitch);
         return model;
      }
   }

   final void update(int delta) {
      this.isMoving = true;

      // Update position using velocity
      this.x += (double) delta * this.velocityX;
      this.z += (double) delta * this.velocityZ;
      this.y += (double) delta * this.velocityY + 0.5D * this.accelerationZ * (double) delta * (double) delta;
      this.velocityY += (double) delta * this.accelerationZ;

      // Update rotation angles
      this.yaw = (int) (Math.atan2(this.velocityX, this.velocityZ) * 325.949D) + 1024 & 0x7ff;
      this.pitch = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 0x7ff;

      // Update animation
      if (this.animation != null) {
         this.animationCycle += delta;

         while (true) {
            do {
               do {
                  if (this.animationCycle <= this.animation.duration[this.animationFrame]) {
                     return;
                  }

                  this.animationCycle -= this.animation.duration[this.animationFrame];
                  ++this.animationFrame;
               } while (this.animationFrame < this.animation.frameCount.length);

               this.animationFrame -= this.animation.field3515;
            } while (this.animationFrame >= 0 && this.animationFrame < this.animation.frameCount.length);

            this.animationFrame = 0;
         }
      }
   }

   final void updateVelocity(int destinationX, int destinationZ, int destinationY, int currentCycle) {
      double dx;

      // Initialize position if not yet moving
      if (!this.isMoving) {
         dx = destinationX - this.sourceX;
         double dz = destinationZ - this.sourceZ;
         double horizontalDistance = Math.sqrt(dx * dx + dz * dz);
         this.x = (double) this.sourceX + (double) this.startHeight * dx / horizontalDistance;
         this.z = (double) this.startHeight * dz / horizontalDistance + (double) this.sourceZ;
         this.y = (double) this.sourceY;
      }

      // Calculate time remaining until end
      dx = this.endCycle + 1 - currentCycle;

      // Calculate horizontal velocities
      this.velocityX = ((double) destinationX - this.x) / dx;
      this.velocityZ = ((double) destinationZ - this.z) / dx;
      this.velocity = Math.sqrt(this.velocityZ * this.velocityZ + this.velocityX * this.velocityX);

      // Calculate initial vertical velocity based on slope
      if (!this.isMoving) {
         this.velocityY = -this.velocity * Math.tan(0.02454369D * (double) this.slope);
      }

      // Calculate vertical acceleration (gravity)
      this.accelerationZ = 2.0D * ((double) destinationY - this.y - dx * this.velocityY) / (dx * dx);
   }

}