import java.util.HashMap;
import java.util.Map;

/*
 * L06HashMap demonstrates the usage of HashMap in Java.
 * A HashMap stores data in (Key, Value) pairs. It is part of the Java Collections Framework.
 *
 * Key Characteristics of HashMap:
 * - Unordered: It does not guarantee the order of elements.
 * - Fast: Provides constant-time performance O(1) for basic operations (get and put), assuming no hash collisions.
 * - Nulls: Allows one null key and multiple null values.
 * - Not Synchronized: It is not thread-safe. For a thread-safe alternative, use ConcurrentHashMap.
 */
public class L06HashMap {
    public static void main(String[] args) {
        // Create a new HashMap instance where keys are Strings and values are Integers.
        Map<String, Integer> map = new HashMap<>();

        // 1. put(K key, V value): Associates the specified value with the specified key.
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        System.out.println("Initial HashMap: " + map);

        // 2. get(Object key): Returns the value to which the specified key is mapped.
        System.out.println("Value of 'one': " + map.get("one"));
        System.out.println("Value of 'three': " + map.get("three"));

        // 3. containsKey(Object key): Returns true if the map contains a mapping for the specified key.
        System.out.println("Contains key 'one'? " + map.containsKey("one"));
        System.out.println("Contains key 'six'? " + map.containsKey("six"));

        // 4. containsValue(Object value): Returns true if the map maps one or more keys to the specified value.
        System.out.println("Contains value 1? " + map.containsValue(1));
        System.out.println("Contains value 6? " + map.containsValue(6));

        // 5. keySet(): Returns a Set view of the keys contained in this map.
        System.out.println("All keys: " + map.keySet());

        // 6. values(): Returns a Collection view of the values contained in this map.
        System.out.println("All values: " + map.values());

        // 7. remove(Object key): Removes the mapping for a key from this map if it is present.
        map.remove("one");
        System.out.println("Map after removing 'one': " + map);

        // Example of checking for a key before putting it in the map
        if (!map.containsKey("twenty-two")) {
            map.put("twenty-two", 22);
        }
        System.out.println("Map after adding 'twenty-two': " + map);

        // 8. putIfAbsent(K key, V value): If the specified key is not already associated with a value, associates it.
        map.putIfAbsent("eleven", 11); // "eleven" is not present, so it gets added.
        System.out.println("Map after putIfAbsent 'eleven': " + map);

        map.putIfAbsent("two", 200); // "two" is already present, so the map remains unchanged.
        System.out.println("Map after putIfAbsent 'two' again: " + map);

        // 9. entrySet(): Returns a Set view of the mappings contained in this map.
        // Useful for iterating over both keys and values.
        System.out.println("\nIterating and updating values using entrySet():");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(entry.getValue() * 10); // Multiply each value by 10
            System.out.println("Key: " + entry.getKey() + ", New Value: " + entry.getValue());
        }

        // 10. getOrDefault(Object key, V defaultValue): Returns the value for a key, or a default value if the key is not found.
        System.out.println("\nUsing getOrDefault:");
        System.out.println("Value for 'two': " + map.getOrDefault("two", 0)); // Key exists, returns 20
        System.out.println("Value for 'one': " + map.getOrDefault("one", -1)); // Key doesn't exist, returns default value -1

        // 11. size(): Returns the number of key-value mappings in this map.
        System.out.println("\nCurrent size of the map: " + map.size());

        // 12. isEmpty(): Returns true if this map contains no key-value mappings.
        System.out.println("Is the map empty? " + map.isEmpty());

        // 13. clear(): Removes all of the mappings from this map.
        map.clear();
        System.out.println("\nMap after clearing: " + map);
        System.out.println("Is the map empty now? " + map.isEmpty());
    }
}