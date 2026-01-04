import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}