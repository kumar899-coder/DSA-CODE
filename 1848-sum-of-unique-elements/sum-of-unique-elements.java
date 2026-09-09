class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
        {
            if(map.containsKey(x))
            {
                map.put(x,map.get(x)+1);
            }
            else
            {
                map.put(x,1);
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>n:map.entrySet())
        {
            if(n.getValue()==1)
            {
                sum+=n.getKey();
            }
        }
        return sum;
        
    }
}