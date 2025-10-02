import java.util.zip.Inflater;

public class class334 {

   static String[] field4032;
   Inflater field4031;

   class334(int i_1, int i_2, int i_3) {
   }

   public class334() {
      this(-1, 1000000, 1000000);
   }

   public void method6497(class300 class300_1, byte[] bytes_2, int i_3) {
      if (class300_1.field3730[class300_1.field3732] == 31 && class300_1.field3730[class300_1.field3732 + 1] == -117) {
         if (this.field4031 == null) {
            this.field4031 = new Inflater(true);
         }

         try {
            this.field4031.setInput(class300_1.field3730, class300_1.field3732 + 10, class300_1.field3730.length - (class300_1.field3732 + 8 + 10));
            this.field4031.inflate(bytes_2);
         } catch (Exception exception_5) {
            this.field4031.reset();
            throw new RuntimeException("");
         }

         this.field4031.reset();
      } else {
         throw new RuntimeException("");
      }
   }

}
