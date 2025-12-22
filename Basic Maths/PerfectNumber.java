import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
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
