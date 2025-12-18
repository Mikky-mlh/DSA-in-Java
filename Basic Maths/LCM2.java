public class LCM2 {
    // Optimized: hcf*lcm = a*b
    // Euclidean algorithm for HCF
    int hcf(int a, int b){
        return (b == 0) ? a : hcf(b, a%b);
    }

    // ⚡ Formula: LCM = (a*b)/HCF - much faster!
    public int findLcm(int a, int b){
        return (a*b)/hcf(a,b);
    }
}
