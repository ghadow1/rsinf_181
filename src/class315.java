import java.util.Comparator;

public class class315 implements Comparator {

   final boolean field3847;

   public class315(boolean bool_1) {
      this.field3847 = bool_1;
   }

   int method5918(class274 class274_1, class274 class274_2, byte b_3) {
      return this.field3847 ? class274_1.method5041(-156755920).method5198(class274_2.method5041(-156755920), (byte) -109) : class274_2.method5041(-156755920).method5198(class274_1.method5041(-156755920), (byte) -127);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method5918((class274) object_1, (class274) object_2, (byte) -66);
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

}
