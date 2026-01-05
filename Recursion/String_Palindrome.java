public class String_Palindrome {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        //! Loop Approach

        /*
        int L = 0;
        int R = result.length() - 1;
        
        while (L < R) {
            
            if (result.charAt(L) != result.charAt(R)) {
                return false;
            }
            
            L++;
            R--;
        }
        return true;
        */

        //! Recursion Approach
        int n = result.length();

        return checkPalindrome(0, result);
    }
    private boolean checkPalindrome(int i, String res) {
        int n = res.length();

        if (i >= n / 2) return true;
        if (res.charAt(i) != res.charAt(n - i - 1)) return false;
        return checkPalindrome(i + 1, res);
    }
}