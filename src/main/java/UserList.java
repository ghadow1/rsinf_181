import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class UserList {

   final int capacity;
   int positionCount = 0;
   Comparator sortComparator = null;
   User[] user_list;
   HashMap first_key;
   HashMap second_key;

   UserList(int size) {
      this.capacity = size;
      this.user_list = this.vmethod5230(size);
      this.first_key = new HashMap(size / 8);
      this.second_key = new HashMap(size / 8);
   }

   public User method5082(Username username_1) {
      User user_3 = this.method5138(username_1);
      return user_3 != null ? user_3 : this.method5084(username_1);
   }

   User method5088(Username username_1, Username username_2) {
      if (this.method5138(username_1) != null) {
         throw new IllegalStateException();
      } else {
         User user_4 = this.vmethod5229();
         user_4.method5048(username_1, username_2);
         this.method5129(user_4);
         this.method5095(user_4);
         return user_4;
      }
   }

   final int method5101(User user_1) {
      for (int i_3 = 0; i_3 < this.positionCount; i_3++) {
         if (this.user_list[i_3] == user_1) {
            return i_3;
         }
      }

      return -1;
   }

   final void method5093(User user_1) {
      if (this.first_key.remove(user_1.field3615) == null) {
         throw new IllegalStateException();
      } else {
         if (user_1.field3614 != null) {
            this.second_key.remove(user_1.field3614);
         }

      }
   }

   User method5138(Username username_1) {
      return !username_1.method5205() ? null : (User) this.first_key.get(username_1);
   }

   public int method5079() {
      return this.positionCount;
   }

   public boolean method5106() {
      return this.capacity == this.positionCount;
   }

   public final void method5133() {
      if (this.sortComparator == null) {
         Arrays.sort(this.user_list, 0, this.positionCount);
      } else {
         Arrays.sort(this.user_list, 0, this.positionCount, this.sortComparator);
      }

   }

   public boolean method5081(Username username_1) {
      return !username_1.method5205() ? false : (this.first_key.containsKey(username_1) ? true : this.second_key.containsKey(username_1));
   }

   User method5084(Username username_1) {
      return !username_1.method5205() ? null : (User) this.second_key.get(username_1);
   }

   abstract User vmethod5229();

   public void method5096() {
      this.positionCount = 0;
      Arrays.fill(this.user_list, (Object) null);
      this.first_key.clear();
      this.second_key.clear();
   }

   final void method5098(int i_1) {
      --this.positionCount;
      if (i_1 < this.positionCount) {
         System.arraycopy(this.user_list, i_1 + 1, this.user_list, i_1, this.positionCount - i_1);
      }

   }

   final void removeEntry(User user_1) {
      int i_3 = this.method5101(user_1);
      if (i_3 != -1) {
         this.method5098(i_3);
         this.method5093(user_1);
      }
   }

   public final User method5151(int i_1) {
      if (i_1 >= 0 && i_1 < this.positionCount) {
         return this.user_list[i_1];
      } else {
         throw new ArrayIndexOutOfBoundsException(i_1);
      }
   }

   final void method5095(User user_1) {
      this.first_key.put(user_1.field3615, user_1);
      if (user_1.field3614 != null) {
         User user_3 = (User) this.second_key.put(user_1.field3614, user_1);
         if (user_3 != null && user_3 != user_1) {
            user_3.field3614 = null;
         }
      }

   }

   abstract User[] vmethod5230(int var1);

   public final boolean method5085(Username username_1) {
      User user_3 = this.method5138(username_1);
      if (user_3 == null) {
         return false;
      } else {
         this.removeEntry(user_3);
         return true;
      }
   }

   final void method5129(User user_1) {
      this.user_list[++this.positionCount - 1] = user_1;
   }

   User method5087(Username username_1) {
      return this.method5088(username_1, (Username) null);
   }

   final void method5083(User user_1, Username username_2, Username username_3) {
      this.method5093(user_1);
      user_1.method5048(username_2, username_3);
      this.method5095(user_1);
   }

   public final void method5099() {
      this.sortComparator = null;
   }

   public final void addCompare(Comparator comparator_1) {
      if (this.sortComparator == null) {
         this.sortComparator = comparator_1;
      } else if (this.sortComparator instanceof ChainedComparator) {
         ((ChainedComparator) this.sortComparator).addToChain(comparator_1);
      }

   }

}
