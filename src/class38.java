import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class38 extends class26 {

   static class319 field332;
   List field331;
   HashSet field333;
   HashSet field330;

   void method670(ByteBuffer class300_1, boolean bool_2, int i_3) {
      this.field331 = new LinkedList();
      int i_4 = class300_1.readUnsignedShortBigEndian();

      for (int i_5 = 0; i_5 < i_4; i_5++) {
         int i_6 = class300_1.readNullableShort();
         class213 class213_7 = new class213(class300_1.readIntMedEndian());
         boolean bool_8 = class300_1.readUnsignedByte() == 1;
         if (bool_2 || !bool_8) {
            this.field331.add(new class18((class213) null, class213_7, i_6, (class28) null));
         }
      }

   }

   void method666(ByteBuffer class300_1, ByteBuffer class300_2, int i_3, boolean bool_4, byte b_5) {
      this.method344(class300_1, i_3, (byte) 0);
      int i_6 = class300_2.readUnsignedShortBigEndian();
      this.field333 = new HashSet(i_6);

      int i_7;
      for (i_7 = 0; i_7 < i_6; i_7++) {
         class15 class15_8 = new class15();

         try {
            class15_8.method160(class300_2, 1977594384);
         } catch (IllegalStateException illegalstateexception_13) {
            continue;
         }

         this.field333.add(class15_8);
      }

      i_7 = class300_2.readUnsignedShortBigEndian();
      this.field330 = new HashSet(i_7);

      for (int i_11 = 0; i_11 < i_7; i_11++) {
         class39 class39_9 = new class39();

         try {
            class39_9.method674(class300_2, 1442686433);
         } catch (IllegalStateException illegalstateexception_12) {
            continue;
         }

         this.field330.add(class39_9);
      }

      this.method670(class300_2, bool_4, 2146657354);
   }

   static class174 method667(int i_0, int i_1, int i_2) {
      client.field735.field2098 = i_0;
      client.field735.field2101 = i_1;
      client.field735.field2099 = 1;
      client.field735.field2097 = 1;
      return client.field735;
   }

}
