import java.util.Stack;
import java.util.Scanner;

public class L02Stacks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Cat");
        animals.push("Horse");

        System.out.println("Stack: " + animals);
        System.out.println("Peek: " + animals.peek());
        animals.pop();
        System.out.println("Pop Stack: " + animals);
        System.out.println("Size: " + animals.size());
        System.out.println("IsEmpty: " + animals.isEmpty());
        System.out.println("Contains: " + animals.contains("Cat"));
        System.out.println("Index of Horse: " + animals.indexOf("Horse"));
        System.out.println("Index of Cat: " + animals.indexOf("Cat"));
        System.out.println("Index of Dog: " + animals.indexOf("Dog"));
        System.out.println("Search Horse: " + animals.search("Horse")); 
        System.out.println("Search Cat: " + animals.search("Cat")); 
        System.out.println("Search Dog: " + animals.search("Dog")); 
        animals.clear();
        System.out.println("Clear Stack: " + animals);
        System.out.println("IsEmpty: " + animals.isEmpty());
    }
}