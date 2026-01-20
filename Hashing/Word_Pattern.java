/*
import java.util.HashMap;
import java.util.Map;
! Given a pattern and a string s, find if s follows the same pattern.

! Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. 

! Specifically:

! Each letter in pattern maps to exactly one unique word in s.
! Each unique word in s maps to exactly one letter in pattern.
! No two letters map to the same word, and no two words map to the same letter.
*/

import java.util.HashMap;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");

        if(str.length != pattern.length()) return false;

        for(int i = 0 ; i < str.length ; i++) {
            char c = pattern.charAt(i);
            if(map.containsKey(c)) {
                if(!map.get(c).equals(str[i])) {
                    return false;
                }
            }else {
                if(map.containsValue(str[i])) {
                    return false;
                }
                map.put(c, str[i]);
            }
        }

        return true;
    }
}