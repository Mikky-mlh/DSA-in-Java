import java.util.Scanner;

class Number_Reversed {
    public int reverse(int x) {
        int rev = 0;
        boolean isNegative = x < 0;
        x = Math.abs(x);
        
        while(x > 0) {
            int rem = x % 10;
            // Check for overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            rev = rev * 10 + rem;
            x = x / 10;
        }
        
        if (isNegative) {
            rev = -rev;
            // Check for negative overflow
            if (rev < Integer.MIN_VALUE) {
                return 0;
            }
        }
        
        return rev;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number_Reversed nr = new Number_Reversed();
        
        int x = sc.nextInt();
        int result = nr.reverse(x);
        System.out.println(result);
        
        sc.close();
    }
}
