class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=Integer.MIN_VALUE, cand2=Integer.MIN_VALUE;
        int cnt1=0,cnt2=0;
        for(int x:nums)
        {
            if(x==cand1)
            {
                cnt1++;
            }
            else if(x==cand2)
            {
                cnt2++;
            }
            else if(cnt1==0)
            {
                cand1=x;
                cnt1=1;
            }
            else if(cnt2==0)
            {
                cand2=x;
                cnt2=1;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int x:nums)
        {
            if(x==cand1)
            {
                cnt1++;
            }
            else if(x==cand2)
            {
                cnt2++;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        int min=nums.length/3+1;
        if(cnt1>=min)
        {
            res.add(cand1);
        }
        if(cnt2>=min)
        {
            res.add(cand2);
        }
        return res;
    }
}