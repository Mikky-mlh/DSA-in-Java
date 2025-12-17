public class LCM {
    // Brute force approach
    public int findLcm(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for (int i = max; i <= a*b; i+=max) {
            if (i % min == 0) {
                return i;
            }
        }
        return a*b;
    }
}