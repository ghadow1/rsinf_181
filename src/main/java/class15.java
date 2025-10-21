public class class15 extends class21 {

   void method160(ByteBuffer class300_1, int i_2) {
      int i_3 = class300_1.readUnsignedByte();
      if (i_3 != class31.field272.field270) {
         throw new IllegalStateException("");
      } else {
         super.field159 = class300_1.readUnsignedByte();
         super.field160 = class300_1.readUnsignedByte();
         super.field167 = class300_1.readUnsignedShort();
         super.field156 = class300_1.readUnsignedShort();
         super.field157 = class300_1.readUnsignedShort();
         super.field158 = class300_1.readUnsignedShort();
         super.field161 = class300_1.readNullableShort();
         super.field162 = class300_1.readNullableShort();
      }
   }

   void vmethod679(ByteBuffer class300_1) {
      super.field160 = Math.min(super.field160, 4);
      super.field163 = new short[1][64][64];
      super.field170 = new short[super.field160][64][64];
      super.field165 = new byte[super.field160][64][64];
      super.field166 = new byte[super.field160][64][64];
      super.field164 = new class25[super.field160][64][64][];
      int i_3 = class300_1.readUnsignedByte();
      if (i_3 != class30.field262.field260) {
         throw new IllegalStateException("");
      } else {
         int i_4 = class300_1.readUnsignedByte();
         int i_5 = class300_1.readUnsignedByte();
         if (i_4 == super.field157 && i_5 == super.field158) {
            for (int i_6 = 0; i_6 < 64; i_6++) {
               for (int i_7 = 0; i_7 < 64; i_7++) {
                  this.method247(i_6, i_7, class300_1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object object_1) {
      if (!(object_1 instanceof class15)) {
         return false;
      } else {
         class15 class15_2 = (class15) object_1;
         return class15_2.field157 == super.field157 && super.field158 == class15_2.field158;
      }
   }

   public int hashCode() {
      return super.field157 | super.field158 << 8;
   }

   public static void method173(class233 class233_0, int i_1) {
      class239.field3200 = class233_0;
   }

}
