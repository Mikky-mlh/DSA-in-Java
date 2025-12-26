public class SQRT{
    public int mySqrt(int x) {
        if (x < 2) return x;

        long r = x;
        while (r * r > x) {
            // Newton's formula: r = (r + x/r) / 2
            r = (r + x / r) / 2;
        }
        return (int) r;
        //! (int) Math.sqrt(x) is cheating!
    }
}