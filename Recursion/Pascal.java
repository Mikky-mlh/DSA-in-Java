import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal {
    //! Recursion

    public static void main(String[] args) {
        Pascal p = new Pascal();
        System.out.println(p.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();

        List<List<Integer>> triangle = generate(numRows - 1);
        
        if (numRows == 1) {
            triangle.add(Arrays.asList(1));
            return triangle;
        }

        List<Integer> prevRow = triangle.get(numRows - 2);
        List<Integer> newRow = new ArrayList<>();
        
        newRow.add(1);
        for (int i = 1; i < numRows - 1; i++) {
            newRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }
        
        newRow.add(1);
        
        triangle.add(newRow);
        return triangle;
    }
    //! Iterative
    /*
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
    
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
    
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    
                    int left = triangle.get(i - 1).get(j - 1);
                    int right = triangle.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
    */
}
