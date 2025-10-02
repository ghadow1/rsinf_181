public class class251 extends class175 {

   static int field3324;
   public static class233 field3314;
   static class145 field3315 = new class145(64);
   public String field3318 = "null";
   public int field3320 = 0;
   public char field3317;
   public char field3321;
   public int field3319;
   public int[] field3316;
   public String[] field3323;
   public int[] field3322;

   void method4537(class300 class300_1, int i_2, byte b_3) {
      if (i_2 == 1) {
         this.field3317 = (char)class300_1.readUByte();
      } else if (i_2 == 2) {
         this.field3321 = (char)class300_1.readUByte();
      } else if (i_2 == 3) {
         this.field3318 = class300_1.readNullTermString();
      } else if (i_2 == 4) {
         this.field3319 = class300_1.readIntMedEndian();
      } else {
         int i_4;
         if (i_2 == 5) {
            this.field3320 = class300_1.readShortUBigEndian();
            this.field3316 = new int[this.field3320];
            this.field3323 = new String[this.field3320];

            for (i_4 = 0; i_4 < this.field3320; i_4++) {
               this.field3316[i_4] = class300_1.readIntMedEndian();
               this.field3323[i_4] = class300_1.readNullTermString();
            }
         } else if (i_2 == 6) {
            this.field3320 = class300_1.readShortUBigEndian();
            this.field3316 = new int[this.field3320];
            this.field3322 = new int[this.field3320];

            for (i_4 = 0; i_4 < this.field3320; i_4++) {
               this.field3316[i_4] = class300_1.readIntMedEndian();
               this.field3322[i_4] = class300_1.readIntMedEndian();
            }
         }
      }

   }

   public int method4535(byte b_1) {
      return this.field3320;
   }

   void method4533(class300 class300_1, byte b_2) {
      while (true) {
         int i_3 = class300_1.readUByte();
         if (i_3 == 0) {
            return;
         }

         this.method4537(class300_1, i_3, (byte) 19);
      }
   }

   public static final void method4550(long long_0) {
      if (long_0 > 0L) {
         if (long_0 % 10L == 0L) {
            long long_2 = long_0 - 1L;

            try {
               Thread.sleep(long_2);
            } catch (InterruptedException interruptedexception_8) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException interruptedexception_7) {
               ;
            }
         } else {
            try {
               Thread.sleep(long_0);
            } catch (InterruptedException interruptedexception_6) {
               ;
            }
         }

      }
   }

   static int method4532(int i_0, class92 class92_1, boolean bool_2, int i_3) {
      int i_4;
      int i_5;
      if (i_0 == 4000) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_5 + i_4;
         return 1;
      } else if (i_0 == 4001) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_4 - i_5;
         return 1;
      } else if (i_0 == 4002) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_4 * i_5;
         return 1;
      } else if (i_0 == 4003) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_4 / i_5;
         return 1;
      } else if (i_0 == 4004) {
         i_4 = class76.field1098[--class70.field1014];
         class76.field1098[++class70.field1014 - 1] = (int)(Math.random() * (double)i_4);
         return 1;
      } else if (i_0 == 4005) {
         i_4 = class76.field1098[--class70.field1014];
         class76.field1098[++class70.field1014 - 1] = (int)(Math.random() * (double)(i_4 + 1));
         return 1;
      } else if (i_0 == 4006) {
         class70.field1014 -= 5;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         int i_6 = class76.field1098[class70.field1014 + 2];
         int i_7 = class76.field1098[class70.field1014 + 3];
         int i_8 = class76.field1098[class70.field1014 + 4];
         class76.field1098[++class70.field1014 - 1] = i_4 + (i_8 - i_6) * (i_5 - i_4) / (i_7 - i_6);
         return 1;
      } else if (i_0 == 4007) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_4 + i_5 * i_4 / 100;
         return 1;
      } else if (i_0 == 4008) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_4 | 1 << i_5;
         return 1;
      } else if (i_0 == 4009) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_4 & -1 - (1 << i_5);
         return 1;
      } else if (i_0 == 4010) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = (i_4 & 1 << i_5) != 0 ? 1 : 0;
         return 1;
      } else if (i_0 == 4011) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_4 % i_5;
         return 1;
      } else if (i_0 == 4012) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         if (i_4 == 0) {
            class76.field1098[++class70.field1014 - 1] = 0;
         } else {
            class76.field1098[++class70.field1014 - 1] = (int)Math.pow((double)i_4, (double)i_5);
         }

         return 1;
      } else if (i_0 == 4013) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         if (i_4 == 0) {
            class76.field1098[++class70.field1014 - 1] = 0;
            return 1;
         } else {
            switch(i_5) {
            case 0:
               class76.field1098[++class70.field1014 - 1] = Integer.MAX_VALUE;
               break;
            case 1:
               class76.field1098[++class70.field1014 - 1] = i_4;
               break;
            case 2:
               class76.field1098[++class70.field1014 - 1] = (int)Math.sqrt((double)i_4);
               break;
            case 3:
               class76.field1098[++class70.field1014 - 1] = (int)Math.cbrt((double)i_4);
               break;
            case 4:
               class76.field1098[++class70.field1014 - 1] = (int)Math.sqrt(Math.sqrt((double)i_4));
               break;
            default:
               class76.field1098[++class70.field1014 - 1] = (int)Math.pow((double)i_4, 1.0D / (double)i_5);
            }

            return 1;
         }
      } else if (i_0 == 4014) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_4 & i_5;
         return 1;
      } else if (i_0 == 4015) {
         class70.field1014 -= 2;
         i_4 = class76.field1098[class70.field1014];
         i_5 = class76.field1098[class70.field1014 + 1];
         class76.field1098[++class70.field1014 - 1] = i_4 | i_5;
         return 1;
      } else if (i_0 == 4018) {
         class70.field1014 -= 3;
         long long_10 = (long)class76.field1098[class70.field1014];
         long long_12 = (long)class76.field1098[class70.field1014 + 1];
         long long_14 = (long)class76.field1098[class70.field1014 + 2];
         class76.field1098[++class70.field1014 - 1] = (int)(long_14 * long_10 / long_12);
         return 1;
      } else {
         return 2;
      }
   }

}
