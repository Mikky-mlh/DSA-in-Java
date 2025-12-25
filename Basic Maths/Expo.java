class Expo {
    public double myPow(double x, int n) {
        double ans=1;
        int m=n;
        if(n<0){
            n=-n;
        }
        while(n>0){
            if(n%2==1){
                ans=ans*x;
                n=n-1;
            }
            else{
                n=n/2;
                x=x*x;
            }
        }
        if(m<0){
            ans=1/ans;
        }
        return ans;
    }
}