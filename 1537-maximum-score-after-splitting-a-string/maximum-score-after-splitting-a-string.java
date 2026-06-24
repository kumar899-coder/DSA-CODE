class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int res=0;
        for(int i=1;i<n;i++)
        {
            int left=0,right=0;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(j)=='0')
                {
                    left++;
                }
            }
            for(int j=i;j<n;j++)
            {
                if(s.charAt(j)=='1')
                {
                    right++;
                }
            }
            res=Math.max(res,left+right);
        }
        return res;
        
    }
}