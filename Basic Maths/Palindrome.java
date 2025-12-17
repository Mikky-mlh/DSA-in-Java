public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int rev = 0, temp = x;
        while(x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return temp == rev;
    }
}
