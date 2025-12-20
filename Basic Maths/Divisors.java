import java.util.*;

public class Divisors {
    public int[] divisors(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                list.add(i);
                if(i!=n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(x -> x).toArray();
    }
}
