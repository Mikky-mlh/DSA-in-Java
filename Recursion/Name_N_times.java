import java.util.*;
public class Name_N_times {

    public static void print(String name, int n){
        if(n==0){
            return;
        }
        System.out.println(name);
        print(name, n-1);
    }

    public static void main(String[] args){
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print("Yuvraj", n);
        sc.close();
    }
}