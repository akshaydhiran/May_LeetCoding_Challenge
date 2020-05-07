package May_LeetCoding_Challenge.Day5_FirstUniqueCharacter;
class Solution {
    public int firstUniqChar(String s) {
         int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }
        
        int result = Integer.MAX_VALUE;
        for(int i = 0; i< 26; i++){
            if(arr[i] == 1){
                result = Math.min(result, s.indexOf(i + 'a'));
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}