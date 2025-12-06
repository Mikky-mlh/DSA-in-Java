import java.util.Stack;

// A Stack is a LIFO (Last-In, First-Out) data structure.

public class L02Stacks{
    public static void main(String[] args){
        Stack<String> animals = new Stack<>();

        animals.push("Dog");   // Pushes an item onto the top of this stack.
        animals.push("Cat");   // "Cat" is now at the top.
        animals.push("Horse"); // "Horse" is now at the top.

        System.out.println("Stack: " + animals);
        System.out.println("Peek: " + animals.peek()); // Looks at the object at the top of this stack without removing it.
        animals.pop(); // Removes the object at the top of this stack ("Horse").
        System.out.println("Pop Stack: " + animals);
        System.out.println("Size: " + animals.size()); // Returns the number of components in this vector.
        System.out.println("IsEmpty: " + animals.isEmpty()); // Tests if this stack is empty (from Vector). Returns true if size is 0.
        
        System.out.println("Contains 'Cat': " + animals.contains("Cat")); // Returns true if the specified object is a component in this vector.

        // indexOf returns the 0-based index from the BOTTOM of the stack (like a list).
        System.out.println("Index of Horse: " + animals.indexOf("Horse")); // Returns -1 as "Horse" was popped.
        System.out.println("Index of Cat: " + animals.indexOf("Cat"));     // Returns 1 (Dog is at 0, Cat is at 1).
        System.out.println("Index of Dog: " + animals.indexOf("Dog"));     // Returns 0.

        // search returns the 1-based position from the TOP of the stack.
        System.out.println("Search Horse: " + animals.search("Horse")); // Returns -1 as it's not in the stack.
        System.out.println("Search Cat: " + animals.search("Cat"));     // Returns 1 as it's at the top.
        System.out.println("Search Dog: " + animals.search("Dog"));     // Returns 2 as it's the second item from the top.

        animals.clear(); // Removes all of the elements from this Vector.
        System.out.println("Clear Stack: " + animals);
        System.out.println("IsEmpty after clear: " + animals.isEmpty());
    }
}