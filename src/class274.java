public class class274 implements Comparable {

   class283 field3615;
   class283 field3614;

   public int vmethod5221(class274 class274_1, int i_2) {
      return this.field3615.method5198(class274_1.field3615, (byte) 0);
   }

   public class283 method5041(int i_1) {
      return this.field3615;
   }

   void method5048(class283 class283_1, class283 class283_2, byte b_3) {
      if (class283_1 == null) {
         throw new NullPointerException();
      } else {
         this.field3615 = class283_1;
         this.field3614 = class283_2;
      }
   }

   public String method5042(int i_1) {
      return this.field3615 == null ? "" : this.field3615.method5197((byte) 58);
   }

   public String method5043(int i_1) {
      return this.field3614 == null ? "" : this.field3614.method5197((byte) 72);
   }

   public int compareTo(Object object_1) {
      return this.vmethod5221((class274) object_1, -1938562722);
   }

   static Class method5059(String string_0, int i_1) throws ClassNotFoundException {
      return string_0.equals("B") ? Byte.TYPE : (string_0.equals("I") ? Integer.TYPE : (string_0.equals("S") ? Short.TYPE : (string_0.equals("J") ? Long.TYPE : (string_0.equals("Z") ? Boolean.TYPE : (string_0.equals("F") ? Float.TYPE : (string_0.equals("D") ? Double.TYPE : (string_0.equals("C") ? Character.TYPE : (string_0.equals("void") ? Void.TYPE : Class.forName(string_0)))))))));
   }

}
