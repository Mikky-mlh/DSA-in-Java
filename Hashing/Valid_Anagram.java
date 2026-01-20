
import java.util.Map;
import java.util.HashMap;

//! Given two strings s and t, return true if t is an anagram of s, and false otherwise.

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }
        return map.isEmpty();
    }
    /*
    ! Without Maps (FASTER)
        int[] letters = new int[256];

            if(s.length() != t.length()) return false;

            for(char a : s.toCharArray()) {
                letters[a]++;
            }
            for(char b : t.toCharArray()) {
                if (--letters[b] < 0) return false;
            }
            return true;
    */
}
