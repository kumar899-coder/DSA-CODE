class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        if(n%2!=0)
        {
            int ll=1;
            arr[0]=0;
            for(int i=1;i<n;i=i+2)
            {
                arr[i]=ll;
                arr[i+1]=ll*-1;
                ll++;
            }
        }
        else
        {
            int ll=1;
            for(int i=0;i<n;i=i+2)
            {
                arr[i]=ll;
                arr[i+1]=ll*-1;
                ll++;
            }

        }
        return arr;

    }
}