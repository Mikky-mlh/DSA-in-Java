public class Ugly_Number {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        int[] fact = {2, 3, 5};
        for(int f : fact){
            while(n%f==0){
                n/=f;
            }
        }
        return n==1;
    }
}
