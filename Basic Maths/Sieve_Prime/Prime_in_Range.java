import java.util.Arrays;

public class Prime_in_Range {
    int countPrimes(int L, int R) {
        //! Sieve of Eratosthenes
        if (R < 2) return 0;
        
        boolean[] isPrime = new boolean[R + 1]; // size just bigger than R
        Arrays.fill(isPrime, true); // assume all are prime
        isPrime[0] = isPrime[1] = false; // 0,1 are not prime

        for (int i = 2; i * i <= R; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= R; j += i) { // inner loop starts from i*i skipping a lot of numbers for optimization
                    isPrime[j] = false; // mark all multiples as not prime
                }
            }
        }

        int count = 0;
        for (int i = Math.max(2, L); i <= R; i++) { // iterate to count all primes
            if (isPrime[i]) count++;
        }
        return count;
    }
}
