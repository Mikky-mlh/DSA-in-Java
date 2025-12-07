import java.util.Comparator;

// This is a separate class that implements Comparator.
// It defines a custom sorting logic for MovieComparable objects based on rating.
public class RatingComparator implements Comparator<MovieComparable> {

    @Override
    public int compare(MovieComparable m1, MovieComparable m2) {
        // Sorts movies by rating in descending order (higher ratings first).
        return Double.compare(m2.getRating(), m1.getRating());
    }
}