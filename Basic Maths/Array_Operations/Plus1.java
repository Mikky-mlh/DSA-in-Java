public class Plus1 {
    public int[] plusOne(int[] digits) {
        //! Add 1 to a number represented as an array of digits
        //* Example: [1,2,3] + 1 = [1,2,4]; [9,9,9] + 1 = [1,0,0,0]
        
        for(int i = digits.length - 1; i >= 0; i--){ // Traverse from right to left
            if(digits[i] < 9){ // No carry over needed
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // Carry over: 9 becomes 0
        }
        
        // All digits were 9 (e.g., 999 → 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Rest are 0 by default
        return result;
    }
}
