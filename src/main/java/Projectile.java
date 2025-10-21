public final class Projectile extends Entity {

   boolean isMoving = false;
   int field1237 = 0;
   int field1238 = 0;
   int field1235;
   int field1215;
   int sourceX;
   int sourceY;
   int sourceZ;
   int field1217;
   int cycleEnd;
   int slope;
   int startHeight;
   int field1224;
   int field1225;
   class258 field1236;
   double x;
   double y;
   double z;
   double speedX;
   double speedY;
   double speed;
   double speedZ;
   double accelerationZ;
   int field1234;
   int field1226;

   Projectile(int i_1, int i_2, int sourceX, int sourceY, int sourceZ, int i_6, int cycleEnd, int slope, int startHeight, int i_10, int i_11) {
      this.field1235 = i_1;
      this.field1215 = i_2;
      this.sourceX = sourceX;
      this.sourceY = sourceY;
      this.sourceZ = sourceZ;
      this.field1217 = i_6;
      this.cycleEnd = cycleEnd;
      this.slope = slope;
      this.startHeight = startHeight;
      this.field1224 = i_10;
      this.field1225 = i_11;
      this.isMoving = false;
      int i_12 = SceneSound.method3887(this.field1235).field3238;
      if (i_12 != -1) {
         this.field1236 = class7.method81(i_12);
      } else {
         this.field1236 = null;
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
            errorHandler_2.method4552(new ByteBuffer(bytes_3), (byte) 1);
         }

         ErrorHandler.field3325.put(errorHandler_2, (long) i_0);
         return errorHandler_2;
      }
   }

   protected final class127 vmethod3253(int i_1) {
      class243 class243_2 = SceneSound.method3887(this.field1235);
      class127 class127_3 = class243_2.method4406(this.field1237);
      if (class127_3 == null) {
         return null;
      } else {
         class127_3.method2863(this.field1226);
         return class127_3;
      }
   }

   final void method2043(int i_1) {
      this.isMoving = true;
      this.x += (double) i_1 * this.speedX;
      this.y += (double) i_1 * this.speedY;
      this.z += (double) i_1 * this.speedZ + 0.5D * this.accelerationZ * (double) i_1 * (double) i_1;
      this.speedZ += (double) i_1 * this.accelerationZ;
      this.field1234 = (int) (Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 0x7ff;
      this.field1226 = (int) (Math.atan2(this.speedZ, this.speed) * 325.949D) & 0x7ff;
      if (this.field1236 != null) {
         this.field1238 += i_1;

         while (true) {
            do {
               do {
                  if (this.field1238 <= this.field1236.field3522[this.field1237]) {
                     return;
                  }

                  this.field1238 -= this.field1236.field3522[this.field1237];
                  ++this.field1237;
               } while (this.field1237 < this.field1236.field3520.length);

               this.field1237 -= this.field1236.field3515;
            } while (this.field1237 >= 0 && this.field1237 < this.field1236.field3520.length);

            this.field1237 = 0;
         }
      }
   }

   final void setDestination(int var1, int var2, int i_3, int i_4) {
      double var5;
      if (!this.isMoving) {
         var5 = (double) (var1 - this.sourceX);
         double d_8 = (double) (var2 - this.sourceY);
         double d_10 = Math.sqrt(var5 * var5 + d_8 * d_8);
         this.x = (double) this.sourceX + (double) this.startHeight * var5 / d_10;
         this.y = (double) this.startHeight * d_8 / d_10 + (double) this.sourceY;
         this.z = (double) this.sourceZ;
      }

      var5 = (double) (this.cycleEnd + 1 - i_4);
      this.speedX = ((double) var1 - this.x) / var5;
      this.speedY = ((double) var2 - this.y) / var5;
      this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
      if (!this.isMoving) {
         this.speedZ = -this.speed * Math.tan(0.02454369D * (double) this.slope);
      }

      this.accelerationZ = 2.0D * ((double) i_3 - this.z - var5 * this.speedZ) / (var5 * var5);
   }

}
