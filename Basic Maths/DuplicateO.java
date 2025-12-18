import java.util.HashSet;
//! Good optimization
public class DuplicateO {
    public boolean containsDuplicate(int[] nums) {
        // 📦 Track seen numbers
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            // Check if the number 'num' is already in the 'set' HashSet.
            // If it is, return true, otherwise continue to the next iteration.
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
