import java.util.Objects;

// A simple POJO (Plain Old Java Object) to represent a student.
// It no longer implements Comparable, making it a more reusable data-only class.
public class Custom_Collections {
    String name;
    int rollNo;
    public Custom_Collections(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Custom_Collections other = (Custom_Collections) obj;
        return rollNo == other.rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    // Provides a clear string representation of the object.
    @Override
    public String toString() {
        return name + "(" + rollNo + ")";
    }
}
