public class HCF {
    static int Hcf(int A , int B) {
        return findHcf(A, B);
    }

    public static int findHcf(int a, int b){
        if(b == 0){
            return a;
        }
        if(a == 0){
            return b;
        }
        return findHcf(b, a % b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int ans = Hcf(a, b);
        System.out.println("HCF is : " + ans);
    }
}
