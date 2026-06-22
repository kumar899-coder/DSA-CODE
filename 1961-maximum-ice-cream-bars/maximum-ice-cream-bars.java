class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        for(int c:costs)
        {
            max=Math.max(max,c);
        }
        int [] count=new int[max+1];
        for(int c:costs)
        {
            count[c]++;
        }
        int ans=0;
        for(int p=1;p<=max && coins>=p;p++)
        {
            if(count[p]==0)
            continue;
            int canbuy=Math.min(count[p], coins/p);
            ans+=canbuy;
            coins-=canbuy*p;
        }
        return ans;
        
    }
}