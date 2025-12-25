import java.util.Arrays;

public class Prime_in_Range {
    int countPrimes(int L, int R) {
        if (R < 2) return 0;
        
        boolean[] isPrime = new boolean[R + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= R; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= R; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = Math.max(2, L); i <= R; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}
