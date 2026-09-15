class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> yo=new HashMap<>();
        yo.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(yo.containsKey(sum-k))
            {
                count=count+yo.get(sum-k);
            }
            if(yo.containsKey(sum))
            {
                yo.put(sum,yo.get(sum)+1);
            }
            else
            {
                yo.put(sum,1);
            }
        }
        return count;
    }
}