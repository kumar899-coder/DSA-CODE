class Solution {
    public int[] frequencySort(int[] nums) {
        int f[]=new int[201];
        for(int n:nums)
        {
            f[n+100]++;
        }
        int ans[]=new int[nums.length];
        int k=0;
        for(int i=1;i<=nums.length;i++)
        {
            for(int v=100;v>=-100;v--)
            {
                if(f[v+100]==i)
                {
                    for(int j=0;j<i;j++)
                    {
                        ans[k++]=v;
                    }
                }
            }
        }
        return ans;
    }
}