public final class Projectile extends Entity {

   boolean isMoving = false;
   int seqFrame = 0;
   int seqCycle = 0;
   int field1235;
   int field1215;
   int sourceX;
   int sourceZ;
   int sourceY;
   int field1217;
   int cycleEnd;
   int slope;
   int startHeight;
   int field1224;
   int field1225;
   class258 sequenceAnim;
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

   Projectile(int i_1, int i_2, int sourceX, int sourceZ, int sourceY, int i_6, int cycleEnd, int slope, int startHeight, int i_10, int i_11) {
      this.field1235 = i_1;
      this.field1215 = i_2;
      this.sourceX = sourceX;
      this.sourceZ = sourceZ;
      this.sourceY = sourceY;
      this.field1217 = i_6;
      this.cycleEnd = cycleEnd;
      this.slope = slope;
      this.startHeight = startHeight;
      this.field1224 = i_10;
      this.field1225 = i_11;
      this.isMoving = false;
      int i_12 = SceneSound.method3887(this.field1235).field3238;
      if (i_12 != -1) {
         this.sequenceAnim = class7.method81(i_12);
      } else {
         this.sequenceAnim = null;
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

   protected final class127 vmethod3253(int i_1) {
      class243 class243_2 = SceneSound.method3887(this.field1235);
      class127 class127_3 = class243_2.method4406(this.seqFrame);
      if (class127_3 == null) {
         return null;
      } else {
         class127_3.method2863(this.pitch);
         return class127_3;
      }
   }

   final void update(int delta) {
      this.isMoving = true;
      this.x += (double) delta * this.velocityX;
      this.z += (double) delta * this.velocityZ;
      this.y += (double) delta * this.velocityY + 0.5D * this.accelerationZ * (double) delta * (double) delta;
      this.velocityY += (double) delta * this.accelerationZ;
      this.yaw = (int) (Math.atan2(this.velocityX, this.velocityZ) * 325.949D) + 1024 & 0x7ff;
      this.pitch = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 0x7ff;
      if (this.sequenceAnim != null) {
         this.seqCycle += delta;

         while (true) {
            do {
               do {
                  if (this.seqCycle <= this.sequenceAnim.duration[this.seqFrame]) {
                     return;
                  }

                  this.seqCycle -= this.sequenceAnim.duration[this.seqFrame];
                  ++this.seqFrame;
               } while (this.seqFrame < this.sequenceAnim.frameCount.length);

               this.seqFrame -= this.sequenceAnim.field3515;
            } while (this.seqFrame >= 0 && this.seqFrame < this.sequenceAnim.frameCount.length);

            this.seqFrame = 0;
         }
      }
   }

   final void updateVelocity(int dstX, int dstZ, int dstY, int cycle) {
      double dx;
      if (!this.isMoving) {
         dx = dstX - this.sourceX;
         double dz = dstZ - this.sourceZ;
         double d = Math.sqrt(dx * dx + dz * dz);
         this.x = (double) this.sourceX + (double) this.startHeight * dx / d;
         this.z = (double) this.startHeight * dz / d + (double) this.sourceZ;
         this.y = (double) this.sourceY;
      }

      dx = this.cycleEnd + 1 - cycle;
      this.velocityX = ((double) dstX - this.x) / dx;
      this.velocityZ = ((double) dstZ - this.z) / dx;
      this.velocity = Math.sqrt(this.velocityZ * this.velocityZ + this.velocityX * this.velocityX);
      if (!this.isMoving) {
         this.velocityY = -this.velocity * Math.tan(0.02454369D * (double) this.slope);
      }

      this.accelerationZ = 2.0D * ((double) dstY - this.y - dx * this.velocityY) / (dx * dx);
   }

}
