import java.net.URL;

public class class157 extends ChainedComparator {

   static class325[] field1989;
   final boolean field1990;

   public class157(boolean bool_1) {
      this.field1990 = bool_1;
   }

   int method3422(Categorizable categorizable_1, Categorizable categorizable_2) {
      return categorizable_2.category != categorizable_1.category ? (this.field1990 ? categorizable_1.category - categorizable_2.category : categorizable_2.category - categorizable_1.category) : this.compareWithNext(categorizable_1, categorizable_2);
   }

   public int compare(Object object_1, Object object_2) {
      return this.method3422((Categorizable) object_1, (Categorizable) object_2);
   }

   static boolean method3428() {
      try {
         if (World.field1027 == null) {
            World.field1027 = SequenceAnimation.field3534.method3296(new URL(item.field213), (byte) 78);
         } else if (World.field1027.method3307()) {
            byte[] bytes_1 = World.field1027.method3308();
            ByteBuffer class300_2 = new ByteBuffer(bytes_1);
            class300_2.readIntMedEndian();
            World.field1022 = class300_2.readUnsignedShort();
            World.field1031 = new World[World.field1022];

            World world_4;
            for (int i_3 = 0; i_3 < World.field1022; world_4.field1034 = i_3++) {
               world_4 = World.field1031[i_3] = new World();
               world_4.id = class300_2.readUnsignedShort();
               world_4.properties = class300_2.readIntMedEndian();
               world_4.host = class300_2.readNullTerminatedString();
               world_4.field1028 = class300_2.readNullTerminatedString();
               world_4.field1032 = class300_2.readUnsignedByte();
               world_4.field1030 = class300_2.readSignedShortBigEndian();
            }

            Client.method1651(World.field1031, 0, World.field1031.length - 1, World.field1026, World.field1018);
            World.field1027 = null;
            return true;
         }
      } catch (Exception exception_5) {
         exception_5.printStackTrace();
         World.field1027 = null;
      }

      return false;
   }

}
