// This class implements Comparable to define its "natural" sorting order.
// The natural order here is based on the release year.
public class MovieComparable implements Comparable<MovieComparable> {
    private final String title;
    private final int year;
    private final double rating;

    public MovieComparable(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" + "title='" + title + '\'' + ", year=" + year + ", rating=" + rating + '}';
    }

    // This is the single method from the Comparable interface.
    // It defines the natural sorting order for MovieComparable objects.
    @Override
    public int compareTo(MovieComparable other) {
        // Sorts movies by their release year (ascending).
        return Integer.compare(this.year, other.year);
    }
}