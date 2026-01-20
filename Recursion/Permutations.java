import java.util.*;

/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
*/

public class Permutations{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; 
        backtrack(nums, new ArrayList<>(), used, results);
        return results;
    }
    
    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> results) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            current.add(nums[i]);

            backtrack(nums, current, used, results);

            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}