import java.util.Arrays;
//! BAD BECAUSE SLOW AS FUCK
public class DuplicateB {
    public boolean containsDuplicate(int[] nums) {
        // Sort first (O(n log n) - slow!)
        Arrays.sort(nums);
        // Check adjacent elements for duplicates
        for(int i=1; i< nums.length; i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
