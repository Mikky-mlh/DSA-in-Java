public class Tribonnaci {
    //! Iterative
    /* 
    int x=0;
    int y=1;
    int z=1;
    int temp = 0;
    if(n==2 || n==1){
        return 1;
    }
    while(n>2){
        temp = x+y+z;
        x=y;
        y=z;
        z=temp;
        n--;
    }
    return temp;
    */
    //! Recursive
    public int tribonacci(int n) {
        int[] memo = new int[n + 1];
        return solve(n, memo);
    }

    private int solve(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        if (memo[n] != 0) return memo[n];

        memo[n] = solve(n - 1, memo) + solve(n - 2, memo) + solve(n - 3, memo);
        return memo[n];
    }
}
