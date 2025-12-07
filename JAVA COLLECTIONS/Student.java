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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }

    

}