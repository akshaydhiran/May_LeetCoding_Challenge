package May_LeetCoding_Challenge.Day6_MajorityElement;
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
      Arrays.sort(nums);
        return nums[nums.length / 2];   
    }
}