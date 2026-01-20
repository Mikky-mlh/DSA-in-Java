/*
! Problem Statement: Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
*/

import java.util.*;

public class Frequency_of_most_frequent_element {
    
    public void findFrequency(int[] arr) {
        if (arr.length == 0) return;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.merge(num, 1, Integer::sum);  // Cleaner syntax
        }

        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        int maxEle = arr[0], minEle = arr[0];  // Initialize with actual element

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) { maxFreq = count; maxEle = element; }
            if (count < minFreq) { minFreq = count; minEle = element; }
        }

        System.out.println("Highest frequency element: " + maxEle + " (appears " + maxFreq + " times)");
        System.out.println("Lowest frequency element: " + minEle + " (appears " + minFreq + " times)");
    }
}