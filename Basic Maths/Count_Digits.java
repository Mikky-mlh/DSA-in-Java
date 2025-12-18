public class Count_Digits {
    public int countDigits(int n) {
        int count = 0;
        // Remove last digit each iteration
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
