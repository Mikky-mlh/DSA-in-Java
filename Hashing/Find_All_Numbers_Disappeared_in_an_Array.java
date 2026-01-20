/*
! Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
*/

import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> result = new java.util.ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
    /*
    * Better:

        int len = nums.length;

        List<Integer> res = new ArrayList<>();
        boolean exist[] = new boolean[len+1];

        for(int i:nums){
            exist[i] = true;
        }
        for(int i = 1; i <= len; i++){
            if(!exist[i]) res.add(i);
        }
        return res;
    
    */
}
