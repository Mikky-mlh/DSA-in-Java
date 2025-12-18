import java.util.*;

public class AP {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //~ Arrays with ≤2 elements always form AP
        if(arr.length <= 2) {
            return true;
        }
        //* Sort to arrange in order
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        //* Check if all consecutive differences match after finding difference
        for(int i=2; i<arr.length; i++){
            if(diff!=arr[i]-arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
