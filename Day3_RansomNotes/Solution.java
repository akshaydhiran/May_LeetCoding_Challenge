package May_LeetCoding_Challenge.Day3_RansomNotes;
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
          int R = ransomNote.length();
        int M = magazine.length();
        int i;
        
        int[] magazineLetters = new int[26];
        int[] ransomLetters = new int[26];
        
        for(i = 0; i < R; i++){
            ransomLetters[ransomNote.charAt(i) - 'a']++;
        }
        
        for(i = 0; i < M; i++){
            magazineLetters[magazine.charAt(i) - 'a']++;
        }
        
        for(i = 0; i < 26; i++){
            if(ransomLetters[i] > magazineLetters[i])
                return false;
        }
        
        return true;
    }
}