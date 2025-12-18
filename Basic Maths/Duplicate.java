import java.util.HashSet;
//! Not good not bad
public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        // Track seen numbers
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            // Find duplicate
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
