class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,hi=Arrays.stream(piles).max().getAsInt();
        int ans=hi;
        while(l<=hi)
        {
            int m=l+(hi-l)/2;
            long hour=0;
            for(int p:piles)
                hour+=(p+m-1)/m;
            if(hour<=h)
            {
                ans=m;
                hi=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return ans;
    }
}