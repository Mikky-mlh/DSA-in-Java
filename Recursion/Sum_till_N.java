import java.util.Scanner;
public class Sum_till_N {
    public static int printSum(int n){
        if(n==0){
            return 0;
        }
        return n + printSum(n-1);
    }

    public static void main(String[] args){
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(printSum(n));
        sc.close();
    }
}
