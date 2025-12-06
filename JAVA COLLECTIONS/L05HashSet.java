import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Iterator;

// HashSet: Hash table based Set implementation
// Features: No duplicates, no order, O(1) operations, allows null, not thread-safe
public class L05HashSet{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        
        // Adding elements
        set.add(32);
        set.add(85);
        set.add(99);
        set.add(74);
        System.out.println("Initial set: " + set);
        
        set.add(99); // No effect - duplicates ignored
        System.out.println("After duplicate add: " + set);
        
        // Removing elements
        set.remove(85);
        System.out.println("After remove: " + set);
        
        // Checking existence
        System.out.println("contains(100): " + set.contains(100));
        System.out.println("contains(99): " + set.contains(99));
        
        // Size operations
        System.out.println("size(): " + set.size());
        System.out.println("isEmpty(): " + set.isEmpty());
        
        // Additional methods
        Set<Integer> set2 = new HashSet<>(Arrays.asList(99, 100, 200));
        System.out.println("set2: " + set2);
        
        // Set operations
        Set<Integer> union = new HashSet<>(set);
        union.addAll(set2);  // Union
        System.out.println("Union: " + union);
        
        Set<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(set2);  // Intersection
        System.out.println("Intersection: " + intersection);
        
        Set<Integer> difference = new HashSet<>(set);
        difference.removeAll(set2);  // Difference
        System.out.println("Difference: " + difference);
        
        // Bulk operations
        System.out.println("containsAll([99, 32]): " + set.containsAll(Arrays.asList(99, 32)));
        
        // Iteration
        System.out.print("Iteration: ");
        for(Integer num : set) System.out.print(num + " ");
        System.out.println();
        
        // Iterator with removal
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            if(iter.next() == 99) iter.remove();  // Safe removal during iteration
        }
        System.out.println("After iterator removal: " + set);
        
        // Array conversion
        Object[] array = set.toArray();
        System.out.println("toArray(): " + Arrays.toString(array));
        
        Integer[] typedArray = set.toArray(new Integer[0]);
        System.out.println("toArray(Integer[]): " + Arrays.toString(typedArray));
        
        // Clear and final state
        set.clear();
        System.out.println("After clear - size: " + set.size());
        System.out.println("Final set: " + set);
        
        // Use cases: Unique elements, fast lookup, set operations
        
        // LinkedHashSet: Combines HashSet (no duplicates, O(1)) + LinkedList (insertion order)
        Set<Integer> linkedSet = new LinkedHashSet<>(Arrays.asList(5, 2, 8, 2, 1));
        System.out.println("LinkedHashSet maintains order: " + linkedSet); // [5, 2, 8, 1]
        
        // TreeSet: Red-Black tree based Set, no duplicates, sorted order, O(log n) operations
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(5, 2, 8, 2, 1));
        System.out.println("TreeSet sorted order: " + treeSet); // [1, 2, 5, 8]
    }
}