class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                ar.add(i);
            }
        }
        return ar;
    }
}