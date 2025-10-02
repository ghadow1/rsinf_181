import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class277 {

   int field3623 = 0;
   Comparator field3622 = null;
   final int field3627;
   class274[] field3624;
   HashMap field3626;
   HashMap field3625;

   class277(int i_1) {
      this.field3627 = i_1;
      this.field3624 = this.vmethod5230(i_1, 2126056206);
      this.field3626 = new HashMap(i_1 / 8);
      this.field3625 = new HashMap(i_1 / 8);
   }

   public class274 method5082(class283 class283_1, byte b_2) {
      class274 class274_3 = this.method5138(class283_1, 2083171527);
      return class274_3 != null ? class274_3 : this.method5084(class283_1, (byte) 9);
   }

   class274 method5088(class283 class283_1, class283 class283_2, byte b_3) {
      if (this.method5138(class283_1, 2083171527) != null) {
         throw new IllegalStateException();
      } else {
         class274 class274_4 = this.vmethod5229(2016619159);
         class274_4.method5048(class283_1, class283_2, (byte) 46);
         this.method5129(class274_4, (byte) 3);
         this.method5095(class274_4, (byte) 1);
         return class274_4;
      }
   }

   final int method5101(class274 class274_1, int i_2) {
      for (int i_3 = 0; i_3 < this.field3623; i_3++) {
         if (this.field3624[i_3] == class274_1) {
            return i_3;
         }
      }

      return -1;
   }

   final void method5093(class274 class274_1, int i_2) {
      if (this.field3626.remove(class274_1.field3615) == null) {
         throw new IllegalStateException();
      } else {
         if (class274_1.field3614 != null) {
            this.field3625.remove(class274_1.field3614);
         }

      }
   }

   class274 method5138(class283 class283_1, int i_2) {
      return !class283_1.method5205((byte) -63) ? null : (class274) this.field3626.get(class283_1);
   }

   public int method5079(int i_1) {
      return this.field3623;
   }

   public boolean method5106(int i_1) {
      return this.field3627 == this.field3623;
   }

   public final void method5133(short s_1) {
      if (this.field3622 == null) {
         Arrays.sort(this.field3624, 0, this.field3623);
      } else {
         Arrays.sort(this.field3624, 0, this.field3623, this.field3622);
      }

   }

   public boolean method5081(class283 class283_1, int i_2) {
      return !class283_1.method5205((byte) -12) ? false : (this.field3626.containsKey(class283_1) ? true : this.field3625.containsKey(class283_1));
   }

   class274 method5084(class283 class283_1, byte b_2) {
      return !class283_1.method5205((byte) -121) ? null : (class274) this.field3625.get(class283_1);
   }

   abstract class274 vmethod5229(int var1);

   public void method5096(int i_1) {
      this.field3623 = 0;
      Arrays.fill(this.field3624, (Object) null);
      this.field3626.clear();
      this.field3625.clear();
   }

   final void method5098(int i_1, byte b_2) {
      --this.field3623;
      if (i_1 < this.field3623) {
         System.arraycopy(this.field3624, i_1 + 1, this.field3624, i_1, this.field3623 - i_1);
      }

   }

   final void method5086(class274 class274_1, int i_2) {
      int i_3 = this.method5101(class274_1, 403420808);
      if (i_3 != -1) {
         this.method5098(i_3, (byte) 57);
         this.method5093(class274_1, -1244348671);
      }
   }

   public final class274 method5151(int i_1, int i_2) {
      if (i_1 >= 0 && i_1 < this.field3623) {
         return this.field3624[i_1];
      } else {
         throw new ArrayIndexOutOfBoundsException(i_1);
      }
   }

   final void method5095(class274 class274_1, byte b_2) {
      this.field3626.put(class274_1.field3615, class274_1);
      if (class274_1.field3614 != null) {
         class274 class274_3 = (class274) this.field3625.put(class274_1.field3614, class274_1);
         if (class274_3 != null && class274_3 != class274_1) {
            class274_3.field3614 = null;
         }
      }

   }

   abstract class274[] vmethod5230(int var1, int var2);

   public final boolean method5085(class283 class283_1, byte b_2) {
      class274 class274_3 = this.method5138(class283_1, 2083171527);
      if (class274_3 == null) {
         return false;
      } else {
         this.method5086(class274_3, 951866693);
         return true;
      }
   }

   final void method5129(class274 class274_1, byte b_2) {
      this.field3624[++this.field3623 - 1] = class274_1;
   }

   class274 method5087(class283 class283_1, byte b_2) {
      return this.method5088(class283_1, (class283) null, (byte) -9);
   }

   final void method5083(class274 class274_1, class283 class283_2, class283 class283_3, int i_4) {
      this.method5093(class274_1, -1244348671);
      class274_1.method5048(class283_2, class283_3, (byte) 46);
      this.method5095(class274_1, (byte) 1);
   }

   public final void method5099(int i_1) {
      this.field3622 = null;
   }

   public final void method5100(Comparator comparator_1, int i_2) {
      if (this.field3622 == null) {
         this.field3622 = comparator_1;
      } else if (this.field3622 instanceof ChainedComparator) {
         ((ChainedComparator) this.field3622).addToChain(comparator_1);
      }

   }

}
