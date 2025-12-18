public class Palindrome {
    public boolean isPalindrome(int x) {
        // Negative numbers can't be palindromes
        if(x < 0) {
            return false;
        }
        // Store original number
        int rev = 0, temp = x;
        // Reverse the number
        while(x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        // Compare original with reversed
        return temp == rev;
    }
}
