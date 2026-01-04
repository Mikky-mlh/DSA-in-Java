import java.util.Scanner;

public class Number_from_1_to_n {
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args){
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);
        sc.close();
    }
}
