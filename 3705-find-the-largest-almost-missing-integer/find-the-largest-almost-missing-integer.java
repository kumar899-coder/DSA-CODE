class Solution {
    public int largestInteger(int[] nums, int k) {
        int []c=new int[51];
        for(int i=0;i<=nums.length-k;i++)
        {
            boolean seen[]=new boolean[51];
            for(int j=i;j<i+k;j++)
            {
                if(!seen[nums[j]])
                {
                    seen[nums[j]]=true;
                    c[nums[j]]++;
                }
            }
        }
        int res=-1;
        for(int i=0;i<51;i++)
        {
            if(c[i]==1)
            {
                res=i;
            }
        }
        return res;

        
    }
}