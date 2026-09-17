class Solution {
    public String removeStars(String s) {
        ArrayList<Character> ar=new ArrayList<>();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='*')
            {
                ar.remove(ar.size()-1);
            }
            else
            {
                ar.add(c[i]);
            }
        }
        String ss="";
        for(char x:ar)
        {
            ss+=x;
        }
        return ss;
    }
}