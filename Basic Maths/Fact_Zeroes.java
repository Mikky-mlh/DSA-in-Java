public class Fact_Zeroes {
    public int trailingZeroes(int n) {
        //! Count trailing zeros in n! (factorial)

        //* Formula: n/5 + n/25 + n/125 + ... (count 5, 25=5², 125=5³, etc.)
        
        int count = 0;
        
        while(n >= 5){
            n /= 5; // Divide by 5 to count multiples of 5, 25, 125...
            count += n; // Add count of current power of 5
        }
        
        return count; // Example: 25! has 6 zeros (5 from 5,10,15,20,25 + 1 extra from 25)
    }
}
