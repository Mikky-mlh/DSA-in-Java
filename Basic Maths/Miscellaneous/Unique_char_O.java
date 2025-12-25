public class Unique_char_O {
    public int firstUniqChar(String str) {
        //! Find index of first non-repeating character in O(n) time
        //! Use frequency array to count occurrences

        int[] occ = new int[128]; // ASCII characters (0-127)
        
        for(int i = 0; i < str.length(); i++){ // Count frequency of each char
            occ[str.charAt(i)]++;
        }
        
        for(int i = 0; i < str.length(); i++){ // Find first char with frequency 1
            if(occ[str.charAt(i)] == 1){
                return i; // Return index
            }
        }
        
        return -1; // No unique character found
    }
}