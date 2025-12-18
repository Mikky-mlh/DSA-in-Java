public class LCM {
    // Brute force approach
    public int findLcm(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        // Start from max, increment by max each time
        for (int i = max; i <= a*b; i+=max) {
            // First number divisible by both is LCM
            if (i % min == 0) {
                return i;
            }
        }
        return a*b;
    }
}