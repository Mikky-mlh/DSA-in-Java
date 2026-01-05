public class Fibbonacci {
    public int fib(int n) {
        //! Recursive Fibbonacci
        if(n<=1) return n;
        int last = fib(n-1);
        int slast = fib(n-2);

        return last + slast;
        //! Looped Fibbonacci
        /*
        if(n<=1) return n;
        int f = 0;
        int s = 1;
        for(int i=1; i<=n; i++){
            int t = f+s;
            f=s;
            s=t;
        }
        return f;
        */
    }
}
