import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Array {
    public void reverseArray(List<Integer> arr) {
        Collections.reverse(arr);
    }

    public void reverseArray(int[] arr) {
        int L = 0;
        int R = arr.length - 1;
        while (L < R) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
    }

    public static void main(String[] args) {
        Reverse_Array obj = new Reverse_Array();

        // Test with List
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        obj.reverseArray(arr1);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test with array
        int[] arr2 = {1, 2, 3, 4, 5};
        obj.reverseArray(arr2);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
