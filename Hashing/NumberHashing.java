import java.util.*;
public class NumberHashing{
    public int[] hashArray(int[] arr) {
        int[] hash = new int[13];
        for(int i=0; i<arr.length; i++){
            hash[arr[i]] += 1;
        }
        return hash;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]] += 1;
        }

        int q = sc.nextInt();
        while(q-- != 0){
            int x = sc.nextInt();
            System.out.println(hash[x]);
        }
        sc.close();
    }
}