public class class180 {

   public long field2113;
   public class180 field2114;
   public class180 field2112;

   public void method3607() {
      if (this.field2112 != null) {
         this.field2112.field2114 = this.field2114;
         this.field2114.field2112 = this.field2112;
         this.field2114 = null;
         this.field2112 = null;
      }
   }

   public boolean method3606() {
      return this.field2112 != null;
   }

}
