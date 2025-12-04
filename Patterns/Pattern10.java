public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        
        /* ═══════════════════════════════════════════════════════════════
         * 💎 DIAMOND PATTERN - Centered, Increasing then Decreasing
         * ═══════════════════════════════════════════════════════════════
         * Output:
         *     
         *    * 
         *   * * 
         *  * * * 
         * * * * * 
         *  * * * 
         *   * * 
         *    * 
         *     
         * 
         * 🎯 ANALYSIS:
         * - Total rows: 2*n (10 rows for n=5)
         * - Row 0-4: stars increase (0,1,2,3,4,5)
         * - Row 5-9: stars decrease (4,3,2,1,0)
         * - Pattern is CENTERED (needs leading spaces)
         * 
         * 🔧 FORMULA DERIVATION:
         * Row | Stars | Spaces
         *  0  |   0   |   5
         *  1  |   1   |   4
         *  2  |   2   |   3
         *  3  |   3   |   2
         *  4  |   4   |   1
         *  5  |   5   |   0     ← Middle (row = n)
         *  6  |   4   |   1
         *  7  |   3   |   2
         *  8  |   2   |   3
         *  9  |   1   |   4
         * 
         * 📐 Stars formula: row > n ? 2*n-row : row
         *    (If past middle, mirror back)
         * 📐 Spaces formula: n - totalStars
         * ═══════════════════════════════════════════════════════════════
         */
        
        // 🔁 OUTER LOOP: Iterate through all rows (0 to 2*n-1)
        for(int row = 0; row < 2*n; row++){
            
            // 🧮 Calculate stars for this row using ternary operator
            // First half (row <= n): stars = row
            // Second half (row > n): stars = 2*n - row (mirror effect)
            int totalcolinrow = row > n ? 2*n-row : row;
            
            // 🧮 Calculate leading spaces for centering
            int spaces = n - totalcolinrow;
            
            // 🔁 INNER LOOP 1: Print leading spaces
            for(int s = 0; s < spaces; s++) System.out.print(" ");
            
            // 🔁 INNER LOOP 2: Print stars
            for(int col = 0; col < totalcolinrow; col++) System.out.print("* ");
            
            System.out.println();
        }
    }
}
