import java.util.*;

public class SPFQ {
    static int[] spf;

    static void sieve(int MAX) {
        spf = new int[MAX + 1];
        for (int i = 2; i <= MAX; i++) spf[i] = i;
        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }
    }

    static List<Integer> getFactorization(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n != 1) {
            factors.add(spf[n]);
            n /= spf[n];
        }
        return factors;
    }

    public static void main(String[] args) {
        sieve(1000);
        System.out.println(getFactorization(120));
        System.out.println(getFactorization(37));
    }
}