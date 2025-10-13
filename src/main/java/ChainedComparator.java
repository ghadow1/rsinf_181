import java.util.Comparator;

/**
 * Abstract base class for creating chained comparators.
 * Allows multiple comparison criteria to be linked together for multi-level sorting.
 * <p>
 * Example usage:
 * - Sort by level (primary)
 * - Then by name (secondary, if levels are equal)
 * - Then by ID (tertiary, if names are equal)
 * <p>
 * This implements the Chain of Responsibility pattern for comparisons.
 */
public abstract class ChainedComparator implements Comparator {

   /**
    * The next comparator in the chain (used as a tie-breaker).
    * If this comparator returns 0 (equal), the next comparator is consulted.
    */
   Comparator nextComparator;

   /**
    * Compares two objects using the next comparator in the chain.
    * This is called by subclasses when their primary comparison yields equality.
    *
    * @param obj1 First object to compare
    * @param obj2 Second object to compare
    * @return 0 if no next comparator exists, otherwise the result from the next comparator
    */
   protected final int compareWithNext(User obj1, User obj2) {
      return this.nextComparator == null ? 0 : this.nextComparator.compare(obj1, obj2);
   }

   /**
    * Adds a comparator to the end of the comparison chain.
    * If this comparator already has a next comparator, the new one is added
    * to the end of that chain recursively.
    *
    * @param comparator The comparator to add to the chain
    */
   final void addToChain(Comparator comparator) {
      if (this.nextComparator == null) {
         this.nextComparator = comparator;
      } else if (this.nextComparator instanceof ChainedComparator) {
         ((ChainedComparator) this.nextComparator).addToChain(comparator);
      }
      // Note: If nextComparator is not a ChainedComparator, we don't add further
      // This prevents overwriting a terminal comparator
   }

   /**
    * Standard equals implementation.
    * Uses the default Object.equals() behavior (reference equality).
    */
   public boolean equals(Object object_1) {
      return super.equals(object_1);
   }

}
