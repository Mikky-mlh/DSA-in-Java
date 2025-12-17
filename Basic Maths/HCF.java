public class HCF {
    public int findHcf(int a, int b){
        if(b == 0){
            return a;
        }
        if(a == 0){
            return b;
        }
        return findHcf(b, a % b);
    }
}
