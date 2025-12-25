import java.util.*;

public class Self_Dividing_number {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //! Find all self-dividing numbers in range [left, right]
        //! Self-dividing: divisible by each of its digits (e.g., 128: 128%1=0, 128%2=0, 128%8=0)
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    
    private boolean isSelfDividing(int i) {
        int temp = i;
        
        while (temp > 0) {
            int digit = temp % 10; // Extract last digit
            
            if (digit == 0 || i % digit != 0) { // Contains 0 or not divisible
                return false;
            }
            temp /= 10; // Remove last digit
        }
        return true;
    }
}
