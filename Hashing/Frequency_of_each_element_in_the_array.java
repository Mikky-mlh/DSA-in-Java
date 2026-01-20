//! Problem Statement: Given an array, we have found the number of occurrences of each element in the array.

import java.util.*;

public class Frequency_of_each_element_in_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.util.in);
        
        if (!sc.hasNextInt()) return; 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.merge(num, 1, Integer::sum);
        }

        map.forEach((key, value) -> System.out.println(key + " " + value));
        
        sc.close();
    }
}
