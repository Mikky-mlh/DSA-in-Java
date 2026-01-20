import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
    
        for (int x : nums) {
            counts.put(x, counts.getOrDefault(x, 0) + 1);
        }
        
        for (int x : nums) {
            if (counts.get(x) == 1) {
                return x;
            }
        }
        return -1;
    }
}
