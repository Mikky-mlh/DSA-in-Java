public class LCM2 {
    // Optimized: hcf*lcm = a*b
    int hcf(int a, int b){
        return (b == 0) ? a : hcf(b, a%b);
    }

    public int findLcm(int a, int b){
        return (a*b)/hcf(a,b);
    }
}
