import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class L01ARRAYLIST {
    public static void main(String[] args) {
        // Create ArrayList - dynamic resizable array
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Yuvraj"); // Add element

        List<Integer> marks = new ArrayList<>();
        marks.add(90); // Add elements
        marks.add(80);

        System.out.println(studentsName);
        System.out.println(marks);
        marks.add(100); // Add to end
        System.out.println(marks);

        marks.add(1, 99); // Insert at index 1
        System.out.println(marks);

        List<String> newList = new ArrayList<>();
        newList.add("Mikky");
        newList.add("Prince");
        
        System.out.println(studentsName);
        System.out.println(newList);
        studentsName.addAll(newList); // Add all elements from another list
        System.out.println(studentsName);

        System.out.println(studentsName.contains("Yuvraj")); // Check if exists
        System.out.println(studentsName.contains("Mikky"));

        System.out.println(marks.get(2)); // Get element at index
        marks.remove(2); // Remove by index
        System.out.println(marks.get(2));
        System.out.println(marks);
        marks.remove(Integer.valueOf(100)); // Remove by value
        System.out.println(marks);
        System.out.println(marks.size()); // Get size

        studentsName.clear(); // Remove all elements
        System.out.println(studentsName);

        System.out.println(studentsName.isEmpty()); // Check if empty
        System.out.println(marks.isEmpty());

        System.out.println(marks.containsAll(studentsName)); // Check if contains all
        System.out.println(studentsName.containsAll(marks));

        System.out.println(marks);
        marks.set(0, 400); // Update element at index
        marks.set(1, 500);
        System.out.println(marks);

        // Iteration methods
        for(int i=0; i<marks.size(); i++){ // Traditional for loop
            System.out.println("The element is " + marks.get(i));
        }

        for(Integer element: marks){ // Enhanced for loop
            System.out.println("Foreach element is " + element);
        }

        Iterator<Integer> it = marks.iterator(); // Iterator

        while(it.hasNext()){ // hasNext will run until there is no more element to run
            System.out.println("Iterator element is " + it.next());
        }

        // Additional ArrayList operations
        marks.add(400); // Add duplicate for testing
        System.out.println(marks.indexOf(400)); // Find first occurrence index
        System.out.println(marks.lastIndexOf(400)); // Find last occurrence index
        
        List<Integer> subMarks = marks.subList(0, 2); // Get sublist (from index 0 to 1)
        System.out.println("Sublist: " + subMarks);
        
        Object[] array = marks.toArray(); // Convert to array
        System.out.println("Array length: " + array.length);
        
        ArrayList<Integer> clonedMarks = (ArrayList<Integer>) ((ArrayList<Integer>) marks).clone(); // Clone ArrayList
        System.out.println("Cloned: " + clonedMarks);
        
        ((ArrayList<Integer>) marks).ensureCapacity(20); // Ensure minimum capacity
        ((ArrayList<Integer>) marks).trimToSize(); // Trim capacity to current size
        
        System.out.println("Final marks: " + marks);

    }
}