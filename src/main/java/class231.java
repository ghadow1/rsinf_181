public class class231 extends LinkedListNode {

   int field3118;
   public class308 field3116;
   public byte[] field3115;
   public class235 field3117;

   public static class245 method4138(int i_0) {
      class245 class245_2 = (class245) class245.field3273.get((long)i_0);
      if (class245_2 != null) {
         return class245_2;
      } else {
         byte[] bytes_3 = class245.field3274.method4144(3, i_0);
         class245_2 = new class245();
         if (bytes_3 != null) {
            class245_2.method4449(new ByteBuffer(bytes_3));
         }

         class245.field3273.put(class245_2, (long)i_0);
         return class245_2;
      }
   }

}
