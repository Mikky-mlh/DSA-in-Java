import java.util.Arrays;


public class L08ArrayCollections {
    public static void main(String[] args) {
        // 1. Array Declaration and Initialization
        int[] intArray = new int[5]; // Declares an array of 5 integers, initialized to 0
        String[] stringArray = {"apple", "banana", "cherry"}; // Declares and initializes with values

        System.out.println("Initial intArray: " + Arrays.toString(intArray));
        System.out.println("stringArray: " + Arrays.toString(stringArray));

        // 2. Accessing and Modifying Elements
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        System.out.println("Modified intArray: " + Arrays.toString(intArray));
        System.out.println("Element at index 1: " + intArray[1]);

        // 3. Array Length
        System.out.println("Length of intArray: " + intArray.length);
        System.out.println("Length of stringArray: " + stringArray.length);

        // 4. Iterating through Arrays
        System.out.print("Iterating intArray: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        System.out.print("Iterating stringArray (enhanced for loop): ");
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 5. Copying Arrays
        int[] copiedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Copied intArray: " + Arrays.toString(copiedArray));

        int[] partialCopy = Arrays.copyOf(intArray, 3); // Copy first 3 elements
        System.out.println("Partial copy of intArray: " + Arrays.toString(partialCopy));

        int[] largerCopy = Arrays.copyOf(intArray, 7); // Copy and pad with default values (0 for int)
        System.out.println("Larger copy of intArray: " + Arrays.toString(largerCopy));

        int[] rangeCopy = Arrays.copyOfRange(intArray, 1, 4); // Copy from index 1 to 3
        System.out.println("Range copy of intArray: " + Arrays.toString(rangeCopy));

        // 6. Sorting Arrays
        Arrays.sort(intArray);
        System.out.println("Sorted intArray: " + Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray)); // intArray will not be printed without toString()

        Arrays.sort(stringArray);
        System.out.println("Sorted stringArray: " + Arrays.toString(stringArray));

        // 7. Searching Arrays
        System.out.println("Binary Search for 20 in intArray: " + Arrays.binarySearch(intArray, 20));
    }
}
