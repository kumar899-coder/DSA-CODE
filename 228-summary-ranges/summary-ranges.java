class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ar=new ArrayList<>();
        int i=0;
        // fuck you
        while(i<nums.length)
        {
            int st=nums[i];
            while(i+1<nums.length && nums[i+1]==nums[i]+1)
            {
                i++;

            }
            int end=nums[i];
            if(st==end)
            {
                ar.add(st + "");

            }
            else
            {
                ar.add(st+"->"+end);
            }
            i++;
        }
        return ar;
    }
}