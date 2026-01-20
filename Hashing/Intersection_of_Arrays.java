/*
import java.util.HashMap;
! Given two integer arrays nums1 and nums2, return an array of their intersection.
! Each element in the result must be unique and you may return the result in any order.
*/

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int x : nums1) set1.add(x);
        for (int y : nums2) {
            if (set1.contains(y)) set2.add(y);
        }

        int[] intersection = new int[set2.size()];
        int i = 0;
        for (int x : set2) intersection[i++] = x;
        return intersection;
    }
}
