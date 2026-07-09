class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int gcd=muni(max,min);
        return gcd;

    }

        private int muni(int a,int b)
        {
            while(b!=0)
            {
                int t=a%b;
                a=b;
                b=t;
            }
            return a;
        }
        
}