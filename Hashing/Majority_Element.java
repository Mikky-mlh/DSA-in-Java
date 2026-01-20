/*
import java.util.HashMap;
import java.util.Map;
! Given an array nums of size n, return the majority element.

! The majority element is the element that appears more than ⌊n / 2⌋ times.

!You may assume that the majority element always exists in the array.
*/

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > majorityCount) {
                return num;
            }
        }
        return -1;
    }
}