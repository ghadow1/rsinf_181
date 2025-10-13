public final class class291 {

   public static String method5315(CharSequence charsequence_0, class338 class338_1) {
      if (charsequence_0 == null) {
         return null;
      } else {
         int i_3 = 0;

         int i_4;
         boolean bool_5;
         char var_6;
         for (i_4 = charsequence_0.length(); i_3 < i_4; i_3++) {
            var_6 = charsequence_0.charAt(i_3);
            bool_5 = var_6 == 160 || var_6 == 32 || var_6 == 95 || var_6 == 45;
            if (!bool_5) {
               break;
            }
         }

         while (i_4 > i_3) {
            var_6 = charsequence_0.charAt(i_4 - 1);
            bool_5 = var_6 == 160 || var_6 == 32 || var_6 == 95 || var_6 == 45;
            if (!bool_5) {
               break;
            }

            --i_4;
         }

         int i_15 = i_4 - i_3;
         if (i_15 >= 1) {
            byte b_7;
            if (class338_1 == null) {
               b_7 = 12;
            } else {
               switch(class338_1.field4057) {
               case 8:
                  b_7 = 20;
                  break;
               default:
                  b_7 = 12;
               }
            }

            if (i_15 <= b_7) {
               StringBuilder stringbuilder_13 = new StringBuilder(i_15);

               for (int i_16 = i_3; i_16 < i_4; i_16++) {
                  char var_8 = charsequence_0.charAt(i_16);
                  boolean bool_9;
                  if (Character.isISOControl(var_8)) {
                     bool_9 = false;
                  } else if (class67.method1231(var_8)) {
                     bool_9 = true;
                  } else {
                     char[] arr_14 = class339.field4061;
                     int i_11 = 0;

                     label118:
                     while (true) {
                        char var_12;
                        if (i_11 >= arr_14.length) {
                           arr_14 = class339.field4062;

                           for (i_11 = 0; i_11 < arr_14.length; i_11++) {
                              var_12 = arr_14[i_11];
                              if (var_12 == var_8) {
                                 bool_9 = true;
                                 break label118;
                              }
                           }

                           bool_9 = false;
                           break;
                        }

                        var_12 = arr_14[i_11];
                        if (var_12 == var_8) {
                           bool_9 = true;
                           break;
                        }

                        ++i_11;
                     }
                  }

                  if (bool_9) {
                     char var_10;
                     switch(var_8) {
                     case ' ':
                     case '-':
                     case '_':
                     case ' ':
                        var_10 = 95;
                        break;
                     case '#':
                     case '[':
                     case ']':
                        var_10 = var_8;
                        break;
                     case 'À':
                     case 'Á':
                     case 'Â':
                     case 'Ã':
                     case 'Ä':
                     case 'à':
                     case 'á':
                     case 'â':
                     case 'ã':
                     case 'ä':
                        var_10 = 97;
                        break;
                     case 'Ç':
                     case 'ç':
                        var_10 = 99;
                        break;
                     case 'È':
                     case 'É':
                     case 'Ê':
                     case 'Ë':
                     case 'è':
                     case 'é':
                     case 'ê':
                     case 'ë':
                        var_10 = 101;
                        break;
                     case 'Í':
                     case 'Î':
                     case 'Ï':
                     case 'í':
                     case 'î':
                     case 'ï':
                        var_10 = 105;
                        break;
                     case 'Ñ':
                     case 'ñ':
                        var_10 = 110;
                        break;
                     case 'Ò':
                     case 'Ó':
                     case 'Ô':
                     case 'Õ':
                     case 'Ö':
                     case 'ò':
                     case 'ó':
                     case 'ô':
                     case 'õ':
                     case 'ö':
                        var_10 = 111;
                        break;
                     case 'Ù':
                     case 'Ú':
                     case 'Û':
                     case 'Ü':
                     case 'ù':
                     case 'ú':
                     case 'û':
                     case 'ü':
                        var_10 = 117;
                        break;
                     case 'ß':
                        var_10 = 98;
                        break;
                     case 'ÿ':
                     case 'Ÿ':
                        var_10 = 121;
                        break;
                     default:
                        var_10 = Character.toLowerCase(var_8);
                     }

                     if (var_10 != 0) {
                        stringbuilder_13.append(var_10);
                     }
                  }
               }

               if (stringbuilder_13.length() == 0) {
                  return null;
               }

               return stringbuilder_13.toString();
            }
         }

         return null;
      }
   }

}
