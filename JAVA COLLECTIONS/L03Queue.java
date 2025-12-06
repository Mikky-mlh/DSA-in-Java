import java.util.Queue;
import java.util.LinkedList;

// A Queue is a FIFO (First-In, First-Out) data structure.
// Add from rear, delete from front

public class L03Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(39);
        queue.offer(52);
        queue.offer(67);

        System.out.println("Queue: " + queue);

        System.out.println("Poll: " + queue.poll()); // poll removes the first element in the queue
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek()); // peek returns the first element in the queue without removing it
        System.out.println("Size: " + queue.size());
        System.out.println("IsEmpty: " + queue.isEmpty());

        System.out.println("Contains 39: " + queue.contains(39));

        // add() - Similar to offer() but throws exception if capacity restricted
        queue.add(88);
        System.out.println("After add(88): " + queue);

        // remove() - Similar to poll() but throws exception if queue is empty
        System.out.println("Remove: " + queue.remove());
        System.out.println("After remove(): " + queue);

        // element() - Similar to peek() but throws exception if queue is empty
        System.out.println("Element: " + queue.element());

        // toArray() - Convert queue to array for iteration or processing
        Object[] arr = queue.toArray();
        System.out.println("ToArray length: " + arr.length);

        // addAll() - Add all elements from another collection
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.offer(100);
        queue2.offer(200);
        queue.addAll(queue2);
        System.out.println("After addAll: " + queue);

        // removeAll() - Remove all elements that exist in another collection
        queue.removeAll(queue2);
        System.out.println("After removeAll: " + queue);

        // retainAll() - Keep only elements that exist in another collection
        Queue<Integer> keepThese = new LinkedList<>();
        keepThese.offer(52);
        queue.retainAll(keepThese);
        System.out.println("After retainAll: " + queue);

        queue.clear();
        System.out.println("Clear Queue: " + queue);
        System.out.println("IsEmpty after clear: " + queue.isEmpty());
    

    }
}