class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
     ArrayList<Integer> ar=new ArrayList<>();
     for(;left<=right;left++)
     {
        int selcount=0;
        int count=0;
        int temp=left;
        while(temp>0)
        {
            int d=temp%10;
            selcount++;
            if(d==0)
            {
                count=-1;
                break;
            }
            if(left%d==0)
            {
                count++;
            }
            temp=temp/10;
        }
        if(selcount==count)
        {
            ar.add(left);
        }
     }  
     return ar;
    }
}