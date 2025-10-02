public class class15 extends class21 {

   void method160(class300 class300_1, int i_2) {
      int i_3 = class300_1.method5504();
      if (i_3 != class31.field272.field270) {
         throw new IllegalStateException("");
      } else {
         super.field159 = class300_1.method5504();
         super.field160 = class300_1.method5504();
         super.field167 = class300_1.method5496();
         super.field156 = class300_1.method5496();
         super.field157 = class300_1.method5496();
         super.field158 = class300_1.method5496();
         super.field161 = class300_1.method5511();
         super.field162 = class300_1.method5511();
      }
   }

   void vmethod679(class300 class300_1, int i_2) {
      super.field160 = Math.min(super.field160, 4);
      super.field163 = new short[1][64][64];
      super.field170 = new short[super.field160][64][64];
      super.field165 = new byte[super.field160][64][64];
      super.field166 = new byte[super.field160][64][64];
      super.field164 = new class25[super.field160][64][64][];
      int i_3 = class300_1.method5504();
      if (i_3 != class30.field262.field260) {
         throw new IllegalStateException("");
      } else {
         int i_4 = class300_1.method5504();
         int i_5 = class300_1.method5504();
         if (i_4 == super.field157 && i_5 == super.field158) {
            for (int i_6 = 0; i_6 < 64; i_6++) {
               for (int i_7 = 0; i_7 < 64; i_7++) {
                  this.method247(i_6, i_7, class300_1, -1521348339);
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
