import java.util.Comparator;

public class class315 implements Comparator {

   final boolean field3847;

   public class315(boolean bool_1) {
      this.field3847 = bool_1;
   }

   int method5918(User user_1, User user_2, byte b_3) {
      return this.field3847 ? user_1.method5041().method5198(user_2.method5041()) : user_2.method5041().method5198(user_1.method5041());
   }

   public int compare(Object object_1, Object object_2) {
      return this.method5918((User) object_1, (User) object_2, (byte) -66);
   }

   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

}
