import java.util.Scanner;
public class Palindrome {
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
    
        int rem,rev,temp;
        if(x<0){
            return false;
        }
        rev=0;
        temp=x;
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;;
            x/=10;
        }
        if(temp==rev){
            return true;
        }
        else{
        return false;
        }
    }
}
