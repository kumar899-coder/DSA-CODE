class Solution {
    public char findTheDifference(String s, String t) {
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s1.length;i++)
        {
            sum1+=s1[i];
        }
        for(int i=0;i<t1.length;i++)
        {
            sum2+=t1[i];
        }
        return (char)(sum2-sum1);
    }
}