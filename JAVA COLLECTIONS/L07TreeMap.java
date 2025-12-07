import java.util.Map;
import java.util.TreeMap;

public class L07TreeMap {

    public static void main(String[] args) {
        //! TreeMap: Red-Black tree based Map implementation
        // Features: Sorted by keys (natural order or custom comparator), O(log n) operations
        // No null keys, allows null values
        
        Map<String, Integer> treeMap = new TreeMap<>();
        
        // Adding elements
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);
        treeMap.put("Date", 4);
        
        System.out.println("TreeMap (sorted by keys): " + treeMap); // Keys are sorted alphabetically
        
        // Accessing elements
        System.out.println("Value for Apple: " + treeMap.get("Apple"));
        System.out.println("Contains key 'Cherry': " + treeMap.containsKey("Cherry"));
        System.out.println("Contains value 4: " + treeMap.containsValue(4));
        
        // Removing elements
        treeMap.remove("Banana");
        System.out.println("After removing Banana: " + treeMap);
        
        // Iterating through TreeMap (keys are always sorted)
        System.out.println("Iterating through entries:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        System.out.println("Keys: " + treeMap.keySet());
        System.out.println("Values: " + treeMap.values());
        
        // NavigableMap methods (specific to TreeMap)
        System.out.println("First entry: " + ((TreeMap<String, Integer>) treeMap).firstEntry());
        System.out.println("Last entry: " + ((TreeMap<String, Integer>) treeMap).lastEntry());
        System.out.println("Ceiling entry for 'C': " + ((TreeMap<String, Integer>) treeMap).ceilingEntry("C")); // >= C (smallest key >= given key)
        System.out.println("Floor entry for 'C': " + ((TreeMap<String, Integer>) treeMap).floorEntry("C")); // <= C (largest key <= given key)
        System.out.println("Higher entry for 'Cherry': " + ((TreeMap<String, Integer>) treeMap).higherEntry("Cherry")); // > Cherry
        System.out.println("Lower entry for 'Cherry': " + ((TreeMap<String, Integer>) treeMap).lowerEntry("Cherry"));   // < Cherry

        // Submaps
        System.out.println("\nSubMap from Apple (inclusive) to Date (exclusive): " + ((TreeMap<String, Integer>) treeMap).subMap("Apple", "Date"));

        // Polling (removing) first and last entries
        System.out.println("\nPolling first entry: " + ((TreeMap<String, Integer>) treeMap).pollFirstEntry());
        System.out.println("Map after polling first: " + treeMap);

        System.out.println("Polling last entry: " + ((TreeMap<String, Integer>) treeMap).pollLastEntry());
        System.out.println("Map after polling last: " + treeMap);

        // Descending order view: returns reverse-ordered view of the map
        treeMap.put("Fig", 5);
        treeMap.put("Grape", 6);
        System.out.println("\nOriginal map: " + treeMap);
        System.out.println("Descending map view: " + ((TreeMap<String, Integer>) treeMap).descendingMap());
    }
}

