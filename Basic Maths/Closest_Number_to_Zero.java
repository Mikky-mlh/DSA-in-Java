public class Closest_Number_to_Zero {
    public int findClosestNumber(int[] nums) {
        // Start with first element as closest
        int closest=nums[0];
        
        for(int i=0; i<nums.length; i++){
            // Update if current is closer to zero
            if(Math.abs(closest) > Math.abs(nums[i])){
                closest = nums[i];
            }
            // If equal distance, prefer positive number
            else if (Math.abs(nums[i]) == Math.abs(closest)) {
                closest = Math.max(closest, nums[i]);
            }
        }
        return closest;
    }
}
