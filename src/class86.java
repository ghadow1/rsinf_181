public final class class86 extends class135 {

   boolean field1220 = false;
   int field1237 = 0;
   int field1238 = 0;
   int field1235;
   int field1215;
   int field1231;
   int field1214;
   int field1239;
   int field1217;
   int field1240;
   int field1222;
   int field1223;
   int field1224;
   int field1225;
   class258 field1236;
   double field1218;
   double field1227;
   double field1228;
   double field1229;
   double field1230;
   double field1221;
   double field1232;
   double field1233;
   int field1234;
   int field1226;

   class86(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
      this.field1235 = i_1;
      this.field1215 = i_2;
      this.field1231 = i_3;
      this.field1214 = i_4;
      this.field1239 = i_5;
      this.field1217 = i_6;
      this.field1240 = i_7;
      this.field1222 = i_8;
      this.field1223 = i_9;
      this.field1224 = i_10;
      this.field1225 = i_11;
      this.field1220 = false;
      int i_12 = class201.method3887(this.field1235, (byte) -4).field3238;
      if (i_12 != -1) {
         this.field1236 = class7.method81(i_12, (byte) 1);
      } else {
         this.field1236 = null;
      }

   }

   protected final class127 vmethod3253(int i_1) {
      class243 class243_2 = class201.method3887(this.field1235, (byte) -12);
      class127 class127_3 = class243_2.method4406(this.field1237, 1645713423);
      if (class127_3 == null) {
         return null;
      } else {
         class127_3.method2863(this.field1226);
         return class127_3;
      }
   }

   final void method2033(int i_1, int i_2, int i_3, int i_4, int i_5) {
      double d_6;
      if (!this.field1220) {
         d_6 = (double)(i_1 - this.field1231);
         double d_8 = (double)(i_2 - this.field1214);
         double d_10 = Math.sqrt(d_6 * d_6 + d_8 * d_8);
         this.field1218 = (double)this.field1231 + (double)this.field1223 * d_6 / d_10;
         this.field1227 = (double)this.field1223 * d_8 / d_10 + (double)this.field1214;
         this.field1228 = (double)this.field1239;
      }

      d_6 = (double)(this.field1240 + 1 - i_4);
      this.field1229 = ((double)i_1 - this.field1218) / d_6;
      this.field1230 = ((double)i_2 - this.field1227) / d_6;
      this.field1221 = Math.sqrt(this.field1230 * this.field1230 + this.field1229 * this.field1229);
      if (!this.field1220) {
         this.field1232 = -this.field1221 * Math.tan(0.02454369D * (double)this.field1222);
      }

      this.field1233 = 2.0D * ((double)i_3 - this.field1228 - d_6 * this.field1232) / (d_6 * d_6);
   }

   final void method2043(int i_1, byte b_2) {
      this.field1220 = true;
      this.field1218 += (double)i_1 * this.field1229;
      this.field1227 += (double)i_1 * this.field1230;
      this.field1228 += (double)i_1 * this.field1232 + 0.5D * this.field1233 * (double)i_1 * (double)i_1;
      this.field1232 += (double)i_1 * this.field1233;
      this.field1234 = (int)(Math.atan2(this.field1229, this.field1230) * 325.949D) + 1024 & 0x7ff;
      this.field1226 = (int)(Math.atan2(this.field1232, this.field1221) * 325.949D) & 0x7ff;
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

   public static class252 method2046(int i_0, byte b_1) {
      class252 class252_2 = (class252) class252.field3325.method3320((long)i_0);
      if (class252_2 != null) {
         return class252_2;
      } else {
         byte[] bytes_3 = class252.field3327.method4144(32, i_0, 1474728982);
         class252_2 = new class252();
         if (bytes_3 != null) {
            class252_2.method4552(new class300(bytes_3), (byte) 1);
         }

         class252.field3325.method3322(class252_2, (long)i_0);
         return class252_2;
      }
   }

}
