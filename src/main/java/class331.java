public class class331 extends LinkedListNode {

   int[] field3960 = new int[3];
   int field3938;
   boolean field3939;
   int field3953;
   int field3941;
   int field3942;
   int field3961;
   int field3944;
   boolean field3945;
   int field3962;
   int field3943;
   int field3948;
   int field3949;
   String field3934;
   String field3951;
   String field3952;
   String field3946;
   int field3936;
   int field3955;
   int field3956;
   int field3957;
   String field3947;
   String field3959;
   int field3935;
   String field3931;

   class331(int i_1, boolean bool_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8, int i_9, int i_10, int i_11, int i_12, String string_13, String string_14, String string_15, String string_16, int i_17, int i_18, int i_19, int i_20, String string_21, String string_22, int[] ints_23, int i_24, String string_25) {
      this.field3938 = i_1;
      this.field3939 = bool_2;
      this.field3953 = i_3;
      this.field3941 = i_4;
      this.field3942 = i_5;
      this.field3961 = i_6;
      this.field3944 = i_7;
      this.field3945 = bool_8;
      this.field3962 = i_9;
      this.field3943 = i_10;
      this.field3948 = i_11;
      this.field3949 = i_12;
      this.field3934 = string_13;
      this.field3951 = string_14;
      this.field3952 = string_15;
      this.field3946 = string_16;
      this.field3936 = i_17;
      this.field3955 = i_18;
      this.field3956 = i_19;
      this.field3957 = i_20;
      this.field3947 = string_21;
      this.field3959 = string_22;
      this.field3960 = ints_23;
      this.field3935 = i_24;
      this.field3931 = string_25;
   }

   public int method6282() {
      byte b_2 = 39;
      int i_3 = b_2 + class13.method152(this.field3934);
      i_3 += class13.method152(this.field3951);
      i_3 += class13.method152(this.field3952);
      i_3 += class13.method152(this.field3946);
      i_3 += class13.method152(this.field3947);
      i_3 += class13.method152(this.field3959);
      i_3 += class13.method152(this.field3931);
      return i_3;
   }

   public void method6281(ByteBuffer class300_1) {
      class300_1.writeByte(8);
      class300_1.writeByte(this.field3938);
      class300_1.writeByte(this.field3939 ? 1 : 0);
      class300_1.writeShortBigEndian(this.field3953);
      class300_1.writeByte(this.field3941);
      class300_1.writeByte(this.field3942);
      class300_1.writeByte(this.field3961);
      class300_1.writeByte(this.field3944);
      class300_1.writeByte(this.field3945 ? 1 : 0);
      class300_1.writeShortBigEndian(this.field3962);
      class300_1.writeByte(this.field3943);
      class300_1.write24BitInt(this.field3948);
      class300_1.writeShortBigEndian(this.field3949);
      class300_1.writeWrappedString(this.field3934);
      class300_1.writeWrappedString(this.field3951);
      class300_1.writeWrappedString(this.field3952);
      class300_1.writeWrappedString(this.field3946);
      class300_1.writeByte(this.field3955);
      class300_1.writeShortBigEndian(this.field3936);
      class300_1.writeWrappedString(this.field3947);
      class300_1.writeWrappedString(this.field3959);
      class300_1.writeByte(this.field3956);
      class300_1.writeByte(this.field3957);

      for (int i_3 = 0; i_3 < this.field3960.length; i_3++) {
         class300_1.writeIntBigEndian(this.field3960[i_3]);
      }

      class300_1.writeIntBigEndian(this.field3935);
      class300_1.writeWrappedString(this.field3931);
   }

}
