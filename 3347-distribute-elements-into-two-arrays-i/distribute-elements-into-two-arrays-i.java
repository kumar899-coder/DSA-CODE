class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1))
            {
                arr1.add(nums[i]);
            }
            else
            {
                arr2.add(nums[i]);
            }
        }
        res.addAll(arr1);
        res.addAll(arr2);
        int result[]=new int[res.size()];
        for(int i=0;i<result.length;i++)
        {
            result[i]=res.get(i);
        }
        return result;

    }
}