import java.util.ArrayList;
import java.util.List;

public class Self_Dividing_number {
    public List<Integer> selfDividingNumbers(int left, int right) {
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
            int digit = temp % 10;
            
            if (digit == 0 || i % digit != 0) {
                return false; 
            }
            temp /= 10;
        }
        return true; 
    }
}
