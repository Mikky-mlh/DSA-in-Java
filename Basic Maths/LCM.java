public class LCM {

    static int Lcm(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for (int i = max; i <= a*b; i+=max) { // increase a temp by max value until it is divisible by min value
        // the number of times it is increased is the LCM
            if (i % min == 0) {
                return i;
            }
        }
        return a*b;
    }

    /*
    * optimized:
        hcf*lcm = a*b
        hcf = gcd(a,b)
        lcm = (a*b)/hcf
    */

    static int hcf(int a, int b){
        return (b == 0) ? a : hcf(b, a%b);
        // does not require extra confirmation for a==0
    }

    static int OLcm(int a, int b){
        return (a*b)/hcf(a,b);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 34;
        int ans = Lcm(a, b);
        int ans2 = OLcm(a, b);
        System.out.println("LCM is : " + ans);
        System.out.println("OLCM is : " + ans2);

    }
}