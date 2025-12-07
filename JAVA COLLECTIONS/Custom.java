import java.util.HashSet;
import java.util.Set;

// Demonstrates HashSet with custom objects - requires proper equals/hashCode
public class Custom{
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Yuvraj", 1));
        students.add(new Student("Prince", 2));
        students.add(new Student("Hina", 3));
        students.add(new Student("Mikky", 1)); // Duplicate rollNo - won't be added
        System.out.println(students); // Only 3 students, Mikky rejected due to same rollNo
    }
}