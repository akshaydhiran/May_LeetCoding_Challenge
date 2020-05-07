package May_LeetCoding_Challenge.Day4_NumberComplement;
class Solution {
    public int findComplement(int num) {
        int result = 0;
        //use set to set the value of result in each bit
        int set = 1;
        while(num != 0) {
            //if last bit is 0 , set corresponding position of result to 1
            if((num&1)== 0) {
                result |= set;
            }
            //if last bit of num is 1, then do not need to set result
            set <<= 1; // left shift 1 bit
            num >>= 1;//right shift num, move right 1 bit
        }
        return result;
    }
}