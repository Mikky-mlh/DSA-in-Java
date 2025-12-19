public class Square_of_SortedArray_OP {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        int[] sqr = new int[n];
        int l=0;
        int r= n-1;

        for(int i=n-1; i>=0; i--){
            int lsqr = nums[l]*nums[l];
            int rsqr = nums[r]*nums[r];

            if(lsqr>rsqr){
                sqr[i] = lsqr;
                l++;
            }
            else{
                sqr[i] = rsqr;
                r--;
            }
        }
        return sqr;
    }
}
