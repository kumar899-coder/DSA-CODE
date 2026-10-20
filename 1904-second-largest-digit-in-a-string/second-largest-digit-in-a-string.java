class Solution {
    public int secondHighest(String s) {
        int arr[]=new int[s.length()];
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                arr[count]=Character.getNumericValue(s.charAt(i));
                count++;
            }
        }
        if(count<2)
        {
            return -1;
        }
        Arrays.sort(arr,0,count);
        int lar=arr[count-1];
        for(int i=count-1;i>=0;i--)
        {
            if(arr[i]!=lar)
            {
                return arr[i];
            }

        }
        return -1;
    }
}