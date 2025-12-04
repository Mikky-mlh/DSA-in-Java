public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        
        /* ═══════════════════════════════════════════════════════════════
         * ⏳ HOURGLASS PATTERN - Reverse Pyramid + Pyramid
         * ═══════════════════════════════════════════════════════════════
         * Output (n=5):
         * *********
         *  *******
         *   *****
         *    ***
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         * 
         * 🎯 ANALYSIS:
         * - TWO parts: upper (decreasing) + lower (increasing)
         * - Both parts are centered
         * - Stars follow ODD number pattern (9,7,5,3,1,3,5,7,9)
         * 
         * 🔧 UPPER HALF FORMULA:
         * Row | Spaces | Stars
         *  0  |   0    |   9    (2*5-1)
         *  1  |   1    |   7    (2*4-1)
         *  2  |   2    |   5    (2*3-1)
         *  3  |   3    |   3    (2*2-1)
         *  4  |   4    |   1    (2*1-1)
         * 
         * 📐 Spaces: i (increasing)
         * 📐 Stars: 2*(n-i)-1 (odd decreasing)
         * 
         * 🔧 LOWER HALF FORMULA:
         * Row | Spaces | Stars
         *  1  |   3    |   3    (2*1+1)
         *  2  |   2    |   5    (2*2+1)
         *  3  |   1    |   7    (2*3+1)
         *  4  |   0    |   9    (2*4+1)
         * 
         * 📐 Spaces: n-i-1 (decreasing)
         * 📐 Stars: 2*i+1 (odd increasing)
         * 
         * 💡 KEY: Two separate loops, each with 2 inner loops
         * ═══════════════════════════════════════════════════════════════
         */
        
        // 🔁 OUTER LOOP 1: Upper half (reverse pyramid)
        for(int i = 0; i < n; i++){
            // 🔁 INNER LOOP 1: Leading spaces (increasing)
            for(int j = 0; j < i; j++) System.out.print(" ");
            
            // 🔁 INNER LOOP 2: Stars (odd decreasing)
            for(int j = 0; j < 2*(n-i)-1; j++) System.out.print("*");
            
            System.out.println();
        }
        
        // 🔁 OUTER LOOP 2: Lower half (pyramid)
        // Start from 1 to avoid duplicate middle row
        for(int i = 1; i < n; i++){
            // 🔁 INNER LOOP 1: Leading spaces (decreasing)
            for(int j = 0; j < n-i-1; j++) System.out.print(" ");
            
            // 🔁 INNER LOOP 2: Stars (odd increasing)
            for(int j = 0; j < 2*i+1; j++) System.out.print("*");
            
            System.out.println();
        }
    }
}
