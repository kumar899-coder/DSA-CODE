class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder st=new StringBuilder();
        for(String w:words)
        {
            st.append(w);
            if(st.toString().equals(s))
            {
                return true;
            }
            if(st.length()>s.length())
            {
                return false;
            }
        }
        return false;
    }
}