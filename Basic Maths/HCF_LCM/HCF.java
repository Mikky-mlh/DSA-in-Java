/*
 * Euclidean Algorithm: HCF(a,b) = HCF(b, a%b)
 * Example: HCF(48, 18)
 * → HCF(18, 12)  [48%18=12]
 * → HCF(12, 6)   [18%12=6]
 * → HCF(6, 0)    [12%6=0]
 * → Result: 6 ✅
 */
public class HCF {
    public int findHcf(int a, int b){
        // Base cases: when one number is zero
        if(b == 0){
            return a;
        }
        if(a == 0){
            return b;
        }
        // Euclidean algorithm: recursively reduce
        return findHcf(b, a % b);
    }
}
