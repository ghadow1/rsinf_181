public class User implements Comparable {

   class283 field3615;
   class283 field3614;

   static Class method5059(String string_0) throws ClassNotFoundException {
      return string_0.equals("B") ? Byte.TYPE : (string_0.equals("I") ? Integer.TYPE : (string_0.equals("S") ? Short.TYPE : (string_0.equals("J") ? Long.TYPE : (string_0.equals("Z") ? Boolean.TYPE : (string_0.equals("F") ? Float.TYPE : (string_0.equals("D") ? Double.TYPE : (string_0.equals("C") ? Character.TYPE : (string_0.equals("void") ? Void.TYPE : Class.forName(string_0)))))))));
   }

   public int vmethod5221(User user_1, int i_2) {
      return this.field3615.method5198(user_1.field3615);
   }

   public class283 method5041() {
      return this.field3615;
   }

   void method5048(class283 class283_1, class283 class283_2) {
      if (class283_1 == null) {
         throw new NullPointerException();
      } else {
         this.field3615 = class283_1;
         this.field3614 = class283_2;
      }
   }

   public String method5042() {
      return this.field3615 == null ? "" : this.field3615.method5197();
   }

   public int compareTo(Object object_1) {
      return this.vmethod5221((User) object_1, -1938562722);
   }

   public String method5043() {
      return this.field3614 == null ? "" : this.field3614.method5197();
   }

}
