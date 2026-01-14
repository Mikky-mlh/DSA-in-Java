class Pow {
    public double myPow(double x, int n) {
        return recPow(x, (long)n);
    }
    
    private double recPow(double x, long n) {
        if (n == 0) {
            return 1;
        }
        
        if(n == 1){
            return x;
        }

        if(n < 0)
        {
            n = n* -1;
            x = 1/x;
        }

        double halfPower = recPow(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }
}