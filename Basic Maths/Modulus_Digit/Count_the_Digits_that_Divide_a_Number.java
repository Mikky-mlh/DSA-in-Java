public class Count_the_Digits_that_Divide_a_Number {
    public int countDigits(int num) {
        int count=0;
        // Store original number
        int temp=num;
        while(num>0){
            // Extract last digit
            int d = num%10;
            // Check if digit divides original number (skip zero)
            if(d!=0 && temp%d==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}
