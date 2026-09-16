class Solution {
    public int maxProduct(int[] nums) {
        int maxp=Integer.MIN_VALUE;
        int pre=1,sef=1;
        int n=nums.length;
        for(int x:nums)
        {
            maxp=Math.max(maxp,x);
        }
        for(int i=0;i<n;i++)
        {
            if(pre==0)
            {
                pre=1;
            }
            if(sef==0)
            {
                sef=1;
            }
            pre*=nums[i];
            sef*=nums[n-1-i];
            maxp=Math.max(maxp,Math.max(pre,sef));
        }
        return maxp;
    }
}