/*
! Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

! Each letter in magazine can only be used once in ransomNote.
*/

public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] hash = new int[26];
        for(char c : magazine.toCharArray()) hash[c-'a']++;
        for(char c : ransomNote.toCharArray()) {
            if(hash[c-'a'] == 0) return false;
            hash[c-'a']--;
        }
        return true;
    }
}
