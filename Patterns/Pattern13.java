public class Pattern13 {
    public static void main(String[] args) {
        int n = 5, num = 1;
        
        /* ═══════════════════════════════════════════════════════════════
         * 🔢 FLOYD'S TRIANGLE - Sequential Numbers
         * ═══════════════════════════════════════════════════════════════
         * Output (n=5):
         * 1 
         * 2 3 
         * 4 5 6 
         * 7 8 9 10 
         * 11 12 13 14 15 
         * 
         * 🎯 ANALYSIS:
         * - Left-aligned triangle
         * - Numbers are sequential (1,2,3,4...)
         * - Each row has increasing count of numbers
         * 
         * 🔧 PATTERN:
         * Row | Count | Numbers
         *  1  |   1   | 1
         *  2  |   2   | 2,3
         *  3  |   3   | 4,5,6
         *  4  |   4   | 7,8,9,10
         *  5  |   5   | 11,12,13,14,15
         * 
         * 💡 KEY: Use EXTERNAL counter that persists across rows
         *         Increment after each print (num++)
         * ═══════════════════════════════════════════════════════════════
         */
        
        // 🔁 OUTER LOOP: Row number (1 to n)
        for(int i = 1; i <= n; i++){
            
            // 🔁 INNER LOOP: Print 'i' numbers in row 'i'
            for(int j = 1; j <= i; j++){
                System.out.print(num++ + " ");  // Print and increment counter
            }
            System.out.println();
        }
    }
}
