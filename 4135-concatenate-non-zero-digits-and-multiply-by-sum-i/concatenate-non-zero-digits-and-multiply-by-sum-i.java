class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        String temp="";
        while(n>0)
        {
            int d=n%10;
            if(d!=0)
            {
                sum+=d;
                temp=d+temp;
            }
            n=n/10;
        }
        if(temp.equals(""))
        {
            return 0;
        }
        long ns=Long.parseLong(temp);
        long ans = (long) ns*sum;
        return ans;
        
    }
}