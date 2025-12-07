import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class L09Collections{
    public static void main(String[] args) {
        // 1. emptyList(): Returns an immutable empty list.
        System.out.println("Empty list: " + Collections.emptyList());

        // 2. singletonList(E o): Returns an immutable list containing only the specified object.
        System.out.println("Singleton list: " + Collections.singletonList("Hello"));

        // 3. unmodifiableList(List<? extends E> list): Returns an immutable list containing the elements of the specified list.
        System.out.println("Unmodifiable list: " + Collections.unmodifiableList(Collections.singletonList("Immutable")));

        // 4. emptyMap(): Returns an immutable empty map.
        System.out.println("Empty map: " + Collections.emptyMap());

        // 5. singletonMap(K key, V value): Returns an immutable map containing only the specified key-value mapping.
        System.out.println("Singleton map: " + Collections.singletonMap("Key", "Value"));

        // 6. unmodifiableMap(Map<? extends K, ? extends V> map): Returns an immutable map containing the mappings of the specified map.
        System.out.println("Unmodifiable map: " + Collections.unmodifiableMap(Collections.singletonMap("Key", "Value")));

        //! 7. Collections with lists and arrays

        List<Integer> list = new ArrayList<>();
        list.add(41);
        list.add(26);
        list.add(48);
        list.add(26);
        list.add(13);
        list.add(26);
        list.add(13);
        list.add(26);
        
        System.out.println("Original list: " + list);

        System.out.println("Min element: " + Collections.min(list));
        System.out.println("Max element: " + Collections.max(list));

        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        Collections.reverse(list);
        System.out.println("Reversed list: " + list); // reverse previous list

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Sorted reversed Comparator list: " + list); //  reverse list by sorting


        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);

        System.out.println("Frequency of 26: " + Collections.frequency(list, 26));

    }
}