/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    package May_LeetCoding_Challenge.Day1_FirstBadVersion;
    import java.util.*;
    public class Solution extends VersionControl
    {
        public int firstBadVersion(int n) 
        {
            int l = 0;
            int h = n-1;
    
            while(l < h)
            {
                int mid = l+(h-l)/2;
            
                if(isBadVersion(mid+1))
                {
                    h = mid;
                }
                else
                {
                    l = mid+1;
                }
            }
            return l+1;
        }
    }