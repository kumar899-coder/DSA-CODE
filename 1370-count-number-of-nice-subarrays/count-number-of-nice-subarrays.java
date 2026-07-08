class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        int oc=0;
        int ans=0;
        for(int num:nums)
        {
            if(num%2==1)
            {
                oc++;
            }
            if(map.containsKey(oc-k))
            {
                ans+=map.get(oc-k);
            }
            map.put(oc,map.getOrDefault(oc,0)+1);

        }
        return ans;
        
    }
}