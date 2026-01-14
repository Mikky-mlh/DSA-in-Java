public class ClimbStairs {
    //! For loop
    /* public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int first = 1;  // Ways to reach step 1
        int second = 2; // Ways to reach step 2
        
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    } */
    //! Recursion
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return recStairs(n, memo);
    }

    private int recStairs(int n, int[] memo) {
        if (n <= 3) return n;

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = recStairs(n - 1, memo) + recStairs(n - 2, memo);
        return memo[n]; 
    }
}