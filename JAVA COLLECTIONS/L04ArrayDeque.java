import java.util.ArrayDeque;
import java.util.Iterator;

// ArrayDeque: Resizable array-based double-ended queue
// Features: Both ends access, no nulls, not thread-safe, faster than LinkedList
public class L04ArrayDeque{
    public static void main(String[] args){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        
        // Adding elements
        adq.offer(90);       // Add to tail
        adq.offer(20);
        adq.offer(30);
        adq.offer(40);
        adq.offerFirst(50);  // Add to head
        adq.offerLast(60);   // Add to tail
        
        System.out.println("ArrayDeque: " + adq);
        
        // Peeking (no removal)
        System.out.println("peek(): " + adq.peek());         // Head element
        System.out.println("peekFirst(): " + adq.peekFirst()); // Head element
        System.out.println("peekLast(): " + adq.peekLast());   // Tail element
        
        // Removing elements
        System.out.println("poll(): " + adq.poll());         // Remove from head
        System.out.println("After poll: " + adq);
        System.out.println("pollFirst(): " + adq.pollFirst()); // Remove from head
        System.out.println("After pollFirst: " + adq);
        System.out.println("pollLast(): " + adq.pollLast());   // Remove from tail
        System.out.println("After pollLast: " + adq);
        
        // Clear
        adq.clear();
        System.out.println("After clear: " + adq);
        
        // Stack operations (LIFO)
        adq.push(100);    // Add to head
        adq.push(200);
        System.out.println("After push: " + adq);
        System.out.println("pop(): " + adq.pop());  // Remove from head
        
        // Queue operations (FIFO)
        adq.add(300);     // Add to tail
        System.out.println("After add: " + adq);
        System.out.println("remove(): " + adq.remove()); // Remove from head
        
        // Direct access
        System.out.println("element(): " + adq.element()); // Head (throws if empty)
        System.out.println("getFirst(): " + adq.getFirst()); // Head
        System.out.println("getLast(): " + adq.getLast());   // Tail
        
        // Utility methods
        System.out.println("size(): " + adq.size());
        System.out.println("isEmpty(): " + adq.isEmpty());
        System.out.println("contains(30): " + adq.contains(30));
        
        // Iteration
        System.out.print("Forward: ");
        for(Integer num : adq) System.out.print(num + " ");
        System.out.println();
        
        System.out.print("Reverse: ");
        Iterator<Integer> iter = adq.descendingIterator();
        while(iter.hasNext()) System.out.print(iter.next() + " ");
        System.out.println();
        
        // Array conversion and clear
        System.out.println("toArray(): " + java.util.Arrays.toString(adq.toArray()));
        adq.clear();
        System.out.println("After clear isEmpty(): " + adq.isEmpty());
        
        // Use cases: Stack (push/pop), Queue (offer/poll), Deque (both ends)
        // Preferred over LinkedList and legacy Stack class
    }
}