/**
 * A node in a doubly-linked list structure.
 * This is a base class that provides intrusive linked list functionality,
 * meaning objects can be part of the list structure directly.
 *
 * @author jagex, refactored by conditions
 */
public class LinkedListNode {

    /**
     * A hash or unique identifier for this node.
     * Could also be a key, timestamp, or priority value.
     */
    public long hash;

    /**
     * Reference to the next node in the linked list.
     */
    public LinkedListNode next;

    /**
     * Reference to the previous node in the linked list.
     */
    public LinkedListNode previous;

    /**
     * Removes this node from the linked list it's currently in.
     * This method unlinks the node by updating the adjacent nodes'
     * references to skip over this node.
     */
    public void unlink() {
        if (this.previous != null) {
            this.previous.next = this.next;
            this.next.previous = this.previous;
            this.next = null;
            this.previous = null;
        }
    }

    /**
     * Checks if this node is currently linked in a list.
     *
     * @return true if the node is part of a linked list, false otherwise
     */
    public boolean isLinked() {
        return this.previous != null;
    }
}