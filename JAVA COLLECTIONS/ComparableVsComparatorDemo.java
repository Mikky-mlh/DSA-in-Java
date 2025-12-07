import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparatorDemo {
    public static void main(String[] args) {
        List<MovieComparable> movies = new ArrayList<>();
        movies.add(new MovieComparable("The Dark Knight", 2008, 9.0));
        movies.add(new MovieComparable("Inception", 2010, 8.8));
        movies.add(new MovieComparable("Parasite", 2019, 8.6));
        movies.add(new MovieComparable("The Godfather", 1972, 9.2));

        System.out.println("Original list of movies:");
        movies.forEach(System.out::println);

        // 1. Sorting using the "natural order" defined by Comparable (by year)
        System.out.println("\nSorting by natural order (year) using Comparable...");
        Collections.sort(movies);
        movies.forEach(System.out::println);

        // 2. Sorting using a custom Comparator (by rating)
        System.out.println("\nSorting by rating using RatingComparator...");
        Collections.sort(movies, new RatingComparator());
        movies.forEach(System.out::println);

        // 3. Sorting using another custom Comparator (by title) defined with a lambda
        // This shows the modern, concise way to create a Comparator on the fly.
        System.out.println("\nSorting by title using a lambda-based Comparator...");
        Comparator<MovieComparable> titleComparator = (m1, m2) -> m1.getTitle().compareTo(m2.getTitle());
        Collections.sort(movies, titleComparator);
        movies.forEach(System.out::println);

        // Even more concise way using Comparator.comparing helper method
        System.out.println("\nSorting by title using Comparator.comparing...");
        movies.sort(Comparator.comparing(MovieComparable::getTitle));
        movies.forEach(System.out::println);
    }
}