public class User implements Comparable {

   Username field3615;
   Username field3614;

   static Class method5059(String string_0) throws ClassNotFoundException {
      return string_0.equals("B") ? Byte.TYPE : (string_0.equals("I") ? Integer.TYPE : (string_0.equals("S") ? Short.TYPE : (string_0.equals("J") ? Long.TYPE : (string_0.equals("Z") ? Boolean.TYPE : (string_0.equals("F") ? Float.TYPE : (string_0.equals("D") ? Double.TYPE : (string_0.equals("C") ? Character.TYPE : (string_0.equals("void") ? Void.TYPE : Class.forName(string_0)))))))));
   }

   public int vmethod5221(User user_1) {
      return this.field3615.method5198(user_1.field3615);
   }

   public Username method5041() {
      return this.field3615;
   }

   void method5048(Username username_1, Username username_2) {
      if (username_1 == null) {
         throw new NullPointerException();
      } else {
         this.field3615 = username_1;
         this.field3614 = username_2;
      }
   }

   public String method5042() {
      return this.field3615 == null ? "" : this.field3615.method5197();
   }

   public int compareTo(Object object_1) {
      return this.vmethod5221((User) object_1);
   }

   public String method5043() {
      return this.field3614 == null ? "" : this.field3614.method5197();
   }

}
