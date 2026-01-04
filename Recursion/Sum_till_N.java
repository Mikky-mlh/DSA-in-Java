import java.util.Scanner;
public class Sum_till_N {
    public static int printSum(int n){
        //* Functional Recursion
        if(n==0){
            return 0;
        }
        return n + printSum(n-1);
    }

    public static void printSumParam(int n, int sum){
        //* Parameterised Recursion
        if(n==0){
            System.out.println(sum);
            return;
        }
        printSumParam(n-1, sum+n);
    }

    public static void main(String[] args){
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(printSum(n));
        printSumParam(n, 0);
        sc.close();
    }
}
