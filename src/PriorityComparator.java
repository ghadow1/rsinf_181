public class PriorityComparator extends ChainedComparator {

   static String cachedValue;
   final boolean prioritizeNonZero;

   public PriorityComparator(boolean bool_1) {
      this.prioritizeNonZero = bool_1;
   }

   /**
    * Returns an array of enum values or configuration options.
    * This appears to be an unrelated utility method (possibly misplaced).
    * <p>
    * Could represent:
    * - Quest types
    * - Item categories
    * - Player states
    * - UI tab types
    *
    * @return Array of enum/configuration values
    */
   public static GameState[] getGameStates() {
      return new GameState[]{GameState.field3084, GameState.field3085, GameState.field3093, GameState.field3096, GameState.field3087, GameState.field3088};
   }

   /**
    * Sets a client-side flag or state.
    * Another utility method that seems unrelated to comparison logic.
    *
    * @param enabled The boolean state to set
    */
   static void setClientFlag(boolean enabled) {
      Client.flag_23 = enabled;
   }

   /**
    * Compares two objects based on their category/priority field.
    * <p>
    * Logic:
    * - If obj1 has category != 0 and obj2 has category == 0:
    * Return -1 (obj1 first) if prioritizeNonZero, else 1 (obj2 first)
    * - If obj1 has category == 0 and obj2 has category != 0:
    * Return 1 (obj2 first) if prioritizeNonZero, else -1 (obj1 first)
    * - If both have same category status (both 0 or both non-0):
    * Delegate to next comparator in chain
    *
    * @param obj1 First object to compare
    * @param obj2 Second object to compare
    * @return Comparison result (-1, 0, or 1)
    */
   int compareByCategory(Categorizable obj1, Categorizable obj2) {
      if (obj1.category != 0) {
         if (obj2.category == 0) {
            return this.prioritizeNonZero ? -1 : 1;
         }
      } else if (obj2.category != 0) {
         return this.prioritizeNonZero ? 1 : -1;
      }

      return this.compareWithNext(obj1, obj2);
   }

   /**
    * Required compare implementation for Comparator interface.
    * Delegates to the type-safe compareByCategory method.
    */
   public int compare(Object object_1, Object object_2) {
      return this.compareByCategory((Categorizable) object_1, (Categorizable) object_2);
   }

}
