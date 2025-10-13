public class Username implements Comparable {

   String field3647;
   String field3646;

   public Username(String string_1, class338 class338_2) {
      this.field3647 = string_1;
      this.field3646 = class291.method5315(string_1, class338_2);
   }

   public int method5198(Username username_1) {
      return this.field3646 == null ? (username_1.field3646 == null ? 0 : 1) : (username_1.field3646 == null ? -1 : this.field3646.compareTo(username_1.field3646));
   }

   public String method5197() {
      return this.field3647;
   }

   public boolean method5205() {
      return this.field3646 != null;
   }

   public boolean equals(Object object_1) {
      if (object_1 instanceof Username) {
         Username username_2 = (Username) object_1;
         return this.field3646 == null ? username_2.field3646 == null : (username_2.field3646 == null ? false : (this.hashCode() != username_2.hashCode() ? false : this.field3646.equals(username_2.field3646)));
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field3646 == null ? 0 : this.field3646.hashCode();
   }

   public int compareTo(Object object_1) {
      return this.method5198((Username) object_1);
   }

   public String toString() {
      return this.method5197();
   }

   public static final int method5217(double d_0, double d_2, double d_4) {
      double d_6 = d_4;
      double d_8 = d_4;
      double d_10 = d_4;
      if (d_2 != 0.0D) {
         double d_12;
         if (d_4 < 0.5D) {
            d_12 = d_4 * (d_2 + 1.0D);
         } else {
            d_12 = d_4 + d_2 - d_2 * d_4;
         }

         double d_14 = d_4 * 2.0D - d_12;
         double d_16 = 0.3333333333333333D + d_0;
         if (d_16 > 1.0D) {
            --d_16;
         }

         double d_20 = d_0 - 0.3333333333333333D;
         if (d_20 < 0.0D) {
            ++d_20;
         }

         if (d_16 * 6.0D < 1.0D) {
            d_6 = 6.0D * (d_12 - d_14) * d_16 + d_14;
         } else if (d_16 * 2.0D < 1.0D) {
            d_6 = d_12;
         } else if (3.0D * d_16 < 2.0D) {
            d_6 = d_14 + (0.6666666666666666D - d_16) * (d_12 - d_14) * 6.0D;
         } else {
            d_6 = d_14;
         }

         if (6.0D * d_0 < 1.0D) {
            d_8 = (d_12 - d_14) * 6.0D * d_0 + d_14;
         } else if (2.0D * d_0 < 1.0D) {
            d_8 = d_12;
         } else if (d_0 * 3.0D < 2.0D) {
            d_8 = d_14 + 6.0D * (d_12 - d_14) * (0.6666666666666666D - d_0);
         } else {
            d_8 = d_14;
         }

         if (d_20 * 6.0D < 1.0D) {
            d_10 = d_20 * (d_12 - d_14) * 6.0D + d_14;
         } else if (2.0D * d_20 < 1.0D) {
            d_10 = d_12;
         } else if (3.0D * d_20 < 2.0D) {
            d_10 = 6.0D * (0.6666666666666666D - d_20) * (d_12 - d_14) + d_14;
         } else {
            d_10 = d_14;
         }
      }

      int i_22 = (int)(d_6 * 256.0D);
      int i_13 = (int)(256.0D * d_8);
      int i_23 = (int)(d_10 * 256.0D);
      int i_15 = i_23 + (i_13 << 8) + (i_22 << 16);
      return i_15;
   }

}
