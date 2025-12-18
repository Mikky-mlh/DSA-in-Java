class Number_Reversed {
    public int reverse(int x) {
        int rev = 0;
        // Remember sign
        boolean isNegative = x < 0;
        x = Math.abs(x);
        
        while(x > 0) {
            //Extract last digit
            int rem = x % 10;
            // Check for overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            // Build reversed number
            rev = rev * 10 + rem;
            x = x / 10;
        }
        
        // Apply original sign
        if (isNegative) {
            rev = -rev;
            // Check for negative overflow
            if (rev < Integer.MIN_VALUE) {
                return 0;
            }
        }
        
        return rev;
    }
}
