import java.util.*;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        //! Perfect number are numbers that are equal to the sum of their proper divisors
        
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                seen.add(i);
            }
        }
        int sum=0;
        for (Integer n : seen) {
            sum += n;
        }
        return sum == num;
    }
}
