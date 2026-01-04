import java.util.Scanner;
public class Sum_till_N {
    public static void printSum(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        if(n<0){
            System.out.println("Invalid input! Enter a Positive Number!");
            return;
        }
        printSum(n-1, sum+n);
    }

    public static void main(String[] args){
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printSum(n, 0);
        sc.close();
    }
}
