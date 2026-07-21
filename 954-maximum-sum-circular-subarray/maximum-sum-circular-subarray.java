class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int cur=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cur=Math.max(nums[i],cur+nums[i]);
            max=Math.max(max,cur);
        }
        if(max<0)
        {
            return max;
        }
        int cur1=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cur1=Math.min(nums[i],cur1+nums[i]);
            min=Math.min(min,cur1);
        }
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        int circularsum=total-min;
        int ans=Math.max(max,circularsum);
        return ans;
        
    }
}