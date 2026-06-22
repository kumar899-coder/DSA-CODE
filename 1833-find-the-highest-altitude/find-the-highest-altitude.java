class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0,max=0;
        for(int m:gain)
        {
            ans+=m;
            max=Math.max(ans,max);
        }
        return max;
        
    }
}