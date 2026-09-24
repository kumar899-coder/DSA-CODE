class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
          int n=nums[i];
          int ss=0;
          while(nums[i]>0)
          {
            int temp=nums[i]%10;
            ss+=temp;
            nums[i]=nums[i]/10;
          }
          if(ss==i)
          {
            return i;
          }  
        }
        return -1;
    }
}