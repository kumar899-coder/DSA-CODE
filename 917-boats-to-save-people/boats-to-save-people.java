class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        boolean f[]=new boolean[people.length];
        Arrays.sort(people);
        for(int i=people.length-1;i>=0;i--)
        {
            if(f[i])
            {
                continue;
            }
            f[i]=true;
            for(int j=0;j<i;j++)
            {
            if(!f[j] && people[i]+people[j]<=limit)
            {
                f[j]=true;
                break;
            }
            }
            count++;

        }
        return count;
        
    }
}