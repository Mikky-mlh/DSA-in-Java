import java.util.*;

public class SPFQ {
    //! SPF = Smallest Prime Factor for each number
    //! Precompute SPF using sieve, then factorize in O(log n)
    
    static int[] spf;

    static void sieve(int MAX) {
        spf = new int[MAX + 1];
        
        for (int i = 2; i <= MAX; i++) spf[i] = i; // Initialize: each number is its own SPF
        
        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) { // i is prime
                for (int j = i * i; j <= MAX; j += i) { // Mark multiples
                    if (spf[j] == j) spf[j] = i; // Set SPF to smallest prime
                }
            }
        }
    }

    static List<Integer> getFactorization(int n) {
        //! Get prime factorization by repeatedly dividing by SPF
        
        List<Integer> factors = new ArrayList<>();
        
        while (n != 1) {
            factors.add(spf[n]); // Add smallest prime factor
            n /= spf[n]; // Divide by SPF
        }
        
        return factors;
    }

    public static void main(String[] args) {
        //TESTCASES
        sieve(1000);
        System.out.println(getFactorization(120));
        System.out.println(getFactorization(37));
    }
}