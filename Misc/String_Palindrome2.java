public class String_Palindrome2 {
    public boolean validPalindrome(String s) {
        int L = 0;
        int R = s.length() - 1;
        while (L < R) {
            if (s.charAt(L) == s.charAt(R)) {
                L++;
                R--;
            }
            else {
                return isPalindromeRange(s, L + 1, R) || isPalindromeRange(s, L, R - 1);
            }
        }
        return true;
    }
    private boolean isPalindromeRange(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
