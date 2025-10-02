import java.util.HashMap;

public class class293 {

   static int[] field3689;
   class233 field3688;
   class233 field3687;
   HashMap field3690;

   public class293(class233 class233_1, class233 class233_2) {
      this.field3688 = class233_1;
      this.field3687 = class233_2;
      this.field3690 = new HashMap();
   }

   public HashMap method5321(class292[] arr_1, int i_2) {
      HashMap hashmap_3 = new HashMap();
      class292[] arr_4 = arr_1;

      for (int i_5 = 0; i_5 < arr_4.length; i_5++) {
         class292 class292_6 = arr_4[i_5];
         if (this.field3690.containsKey(class292_6)) {
            hashmap_3.put(class292_6, this.field3690.get(class292_6));
         } else {
            class295 class295_7 = class287.method5258(this.field3688, this.field3687, class292_6.field3682, "", -2097439358);
            if (class295_7 != null) {
               this.field3690.put(class292_6, class295_7);
               hashmap_3.put(class292_6, class295_7);
            }
         }
      }

      return hashmap_3;
   }

}
