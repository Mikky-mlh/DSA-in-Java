public class ReverseString {
    //! Iterative
    /*
    public void reverseString(char[] s) {
        int left = 0, right = s.length-1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right]; 
            s[right] = temp;
            left++;
            right--;
        }
    }
    */
    //! Recursive
    public void reverseString(char[] s) {
        reverseHelper(s, 0, s.length - 1);
    }
    private void reverseHelper(char[] arr, int L, int R) {
        if (L >= R) return;
        char temp = arr[L];
        arr[L] = arr[R];
        arr[R] = temp;
        reverseHelper(arr, L + 1, R - 1);
    }
}
