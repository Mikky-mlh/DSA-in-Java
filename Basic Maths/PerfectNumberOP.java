public class PerfectNumberOP {
    public boolean checkPerfectNumber(int num) {
        //! OPTIMIZED
        if (num <= 1) return false;
        
        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor i
                
                // Add corresponding divisor num/i (avoid duplicates for perfect squares)
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        
        return sum == num;
    }
}
