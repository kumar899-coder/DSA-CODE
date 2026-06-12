class Solution {
    public int[] rearrangeArray(int[] nums) {
        boolean increase = nums[0] < nums[1];
        for (int i = 1; i < nums.length - 1; i++) {
            if ((increase && nums[i] < nums[i + 1]) ||
                (!increase && nums[i] > nums[i + 1])) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
            increase = !increase;
        }

        return nums;
    }
}