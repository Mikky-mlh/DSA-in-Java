import java.util.*;

public class Square_of_SortedArray {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> sqr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int square=nums[i]*nums[i];
            sqr.add(square);
        }
        Collections.sort(sqr);
        int[] result = new int[sqr.size()];
        for (int i = 0; i < sqr.size(); i++) {
            result[i] = sqr.get(i);
        }
        
        return result;
    }
}
