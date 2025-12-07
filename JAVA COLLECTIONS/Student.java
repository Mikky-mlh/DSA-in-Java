import java.util.Objects;

// Student class for HashSet demonstration - shows proper equals/hashCode implementation
public class Student{
    String name;
    int rollNo;
    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override // Custom string representation
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override // Two students equal if same rollNo - required for HashSet duplicate detection
    public boolean equals(Object o) {
        if(this == o) return true;  // Same object reference - definitely equal
        if(o == null || getClass() != o.getClass()) return false;  // Null or different class - not equal
        Student student = (Student) o;  // Safe cast after class check
        return rollNo == student.rollNo;  // Compare rollNo only - business logic for equality
    }

    @Override // Hash based on rollNo for HashSet compatibility
    public int hashCode() {
        return Objects.hash(rollNo);
    }

}