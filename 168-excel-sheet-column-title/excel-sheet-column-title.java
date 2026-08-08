class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder st=new StringBuilder();
        while(columnNumber>0)
        {
            columnNumber--;
            int r=columnNumber%26;
            char c=(char)('A'+r);
            st.append(c);
            columnNumber=columnNumber/26;
        }
        return st.reverse().toString();
        
    }
}