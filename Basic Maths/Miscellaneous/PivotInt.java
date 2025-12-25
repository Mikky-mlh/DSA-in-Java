public class PivotInt {
    public int pivotInteger(int n) {
        //! Find pivot x where: sum(1 to x) = sum(x to n)
        //* Formula: x(x+1)/2 = totalSum - x(x-1)/2
        // Simplifies to: x² = totalSum
        
        int totalSum = n * (n + 1) / 2; // Sum of 1 to n
        
        int x = (int) Math.sqrt(totalSum); // Check if totalSum is a perfect square
        
        if (x * x == totalSum) { // If yes, x is the pivot!
            return x;
        }
        
        return -1; // No pivot exists
    }
}
