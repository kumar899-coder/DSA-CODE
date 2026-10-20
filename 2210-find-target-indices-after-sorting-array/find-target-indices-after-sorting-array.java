class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                ar.add(i);
            }
        }
        return ar;
    }
}