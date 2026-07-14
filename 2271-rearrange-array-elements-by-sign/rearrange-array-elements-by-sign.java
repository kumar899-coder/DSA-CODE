class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int p=0;
        int ne=1;
        for(int x:nums)
        {
            if(x>0)
            {
                ans[p]=x;
                p=p+2;
            }
            else
            {
                ans[ne]=x;
                ne=ne+2;
            }
        }
        return ans;

        
    }
}