class Solution {
    public int sortPermutation(int[] nums) {
        int n=nums.length;
        int ans=-1;
        boolean f=true;
        for(int i=0;i<n;i++)
        {
            if(i!=nums[i])
            {
                f=false;
                ans&=nums[i];
            }
        }
        if(f)
        {
            return 0;
        }
        return ans;
    }
}