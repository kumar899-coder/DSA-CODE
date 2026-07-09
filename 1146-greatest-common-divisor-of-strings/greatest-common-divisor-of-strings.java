class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }
        int gcd=muni(str1.length(),str2.length());
        return str1.substring(0,gcd);
    }

        private int muni(int a1,int b1)
        {
            while(b1!=0)
            {
                int t=a1%b1;
                a1=b1;
                b1=t;
            }
            return a1;
        }
}
        