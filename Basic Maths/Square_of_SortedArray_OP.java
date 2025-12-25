public class Square_of_SortedArray_OP {
    public int[] sortedSquares(int[] nums) {
        //! Square each element and return sorted array in O(n) time
        //! Two-pointer approach: largest squares are at the ends (negative or positive)
        
        int n = nums.length;
        int[] sqr = new int[n];
        int l = 0; // Left pointer
        int r = n - 1; // Right pointer

        for(int i = n-1; i >= 0; i--){ // Fill result from largest to smallest
            int lsqr = nums[l] * nums[l]; // Square of leftmost
            int rsqr = nums[r] * nums[r]; // Square of rightmost

            if(lsqr > rsqr){ // Left square is larger
                sqr[i] = lsqr;
                l++; // Move left pointer right
            }
            else{ // Right square is larger or equal
                sqr[i] = rsqr;
                r--; // Move right pointer left
            }
        }
        return sqr; // Example: [-4,-1,0,3,10] → [0,1,9,16,100]
    }
}
