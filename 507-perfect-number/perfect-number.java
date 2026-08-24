class Solution {
    public boolean checkPerfectNumber(int num) {
        int temp=num;
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(temp%i==0)
            {
                sum+=i;
            }

        }
        if(num==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}