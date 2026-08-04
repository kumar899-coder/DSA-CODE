class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long upc=0;
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            if(nums[left]+nums[right]<=upper)
            {
                upc+=(right-left);
                left++;
            }
            else
            {
                right--;
            }
        }
        long lpc=0;
        left=0;
        right=nums.length-1;
        while(left<right)
        {
            if(nums[left]+nums[right]<=lower-1)
            {
                lpc+=(right-left);
                left++;
            }
            else
            {
                right--;
            }
        }
        return upc-lpc;
    }
}