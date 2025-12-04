public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        
        /* ═══════════════════════════════════════════════════════════════
         * 🦋 BUTTERFLY PATTERN - Mirror Wings
         * ═══════════════════════════════════════════════════════════════
         * Output (n=5):
         * *        *
         * **      **
         * ***    ***
         * ****  ****
         * **********
         * ****  ****
         * ***    ***
         * **      **
         * *        *
         * 
         * 🎯 ANALYSIS:
         * - TWO parts: upper half + lower half
         * - Each row has: left stars + middle spaces + right stars
         * - Upper: stars increase, spaces decrease
         * - Lower: stars decrease, spaces increase
         * 
         * 🔧 FORMULA (Upper Half):
         * Row | Left* | Spaces | Right*
         *  1  |   1   |   8    |   1
         *  2  |   2   |   6    |   2
         *  3  |   3   |   4    |   3
         *  4  |   4   |   2    |   4
         *  5  |   5   |   0    |   5
         * 
         * 📐 Left/Right stars: i
         * 📐 Middle spaces: 2*(n-i)
         * 
         * 💡 KEY: Need 3 inner loops per row + 2 outer loops
         * ═══════════════════════════════════════════════════════════════
         */
        
        // 🔁 OUTER LOOP 1: Upper half (increasing)
        for(int i = 1; i <= n; i++){
            // 🔁 INNER LOOP 1: Left wing stars
            for(int j = 1; j <= i; j++) System.out.print("*");
            
            // 🔁 INNER LOOP 2: Middle spaces
            for(int j = 1; j <= 2*(n-i); j++) System.out.print(" ");
            
            // 🔁 INNER LOOP 3: Right wing stars
            for(int j = 1; j <= i; j++) System.out.print("*");
            
            System.out.println();
        }
        
        // 🔁 OUTER LOOP 2: Lower half (decreasing - mirror of upper)
        for(int i = n; i >= 1; i--){
            // Same 3 inner loops as upper half
            for(int j = 1; j <= i; j++) System.out.print("*");
            for(int j = 1; j <= 2*(n-i); j++) System.out.print(" ");
            for(int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
