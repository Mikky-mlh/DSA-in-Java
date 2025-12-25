public class Prime {
    public boolean isPrime(int n) {
        //! basic approach but I used Sieve of Eratosthenes fo or other problems to reduce time complexity
        //! This solution is only applied here and not anywhere else
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}