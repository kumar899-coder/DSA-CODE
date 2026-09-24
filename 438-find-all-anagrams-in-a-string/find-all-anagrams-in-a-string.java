class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ar=new ArrayList<>();
        int i=0;
        int j=0;
        char pp[]=p.toCharArray();
        int len=p.length();
        Arrays.sort(pp);
        while(j<s.length())
        {
            if(j-i+1==len)
            {
                String str=s.substring(i,j+1);
                char ch[]=str.toCharArray();
                Arrays.sort(ch);
                if(Arrays.equals(ch,pp))
                {
                    ar.add(i);
                }
                i++;
            }
            j++;
        }
        return ar;
    }
}