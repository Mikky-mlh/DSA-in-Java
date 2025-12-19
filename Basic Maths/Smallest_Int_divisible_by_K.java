public class Smallest_Int_divisible_by_K {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0){
            return -1;
        }
        int rem=1;
        int count=1;
        while(rem%k!=0){
            rem=(rem*10+1)%k; // ((previous rem * 10) + 1) (mod of x) = (a+b) (mod of x)
            count++;
        }
        return count;
    }
}
