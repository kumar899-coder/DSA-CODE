class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean in=true;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                in=false;
                break;
            }
            
        }
        if(in)
        {
            return true;
        }
        boolean dec=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                dec=false;
                break;
            }
        }
        if(dec)
        {
            return true;
        }
        return dec;
        
    }
}