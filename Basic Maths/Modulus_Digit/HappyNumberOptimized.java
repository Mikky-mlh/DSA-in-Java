public class HappyNumberOptimized {
    public boolean isHappy(int n) {
        // Keep looping until we reach 1 (happy) or 4 (cycle detected - unhappy)
        // All unhappy numbers eventually enter a cycle that includes 4
        while(n != 1 && n != 4){
            int sum = 0;

            while(n > 0){
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
