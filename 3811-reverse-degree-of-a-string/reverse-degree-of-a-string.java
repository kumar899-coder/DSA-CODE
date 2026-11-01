class Solution {
    public int reverseDegree(String s) {
       int res=0;
       char[]ar=s.toCharArray();
       for(int i=0;i<ar.length;i++)
       {
        int ans=26-(ar[i]-'a');
        res+=ans*(i+1);
       } 
       return res;
    }
}