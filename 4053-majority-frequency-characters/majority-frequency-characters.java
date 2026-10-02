class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashMap<Integer,Integer> fr=new HashMap<>();
        for(Map.Entry<Character, Integer> entry:map.entrySet())
        {
            int val=entry.getValue();

            fr.put(val,fr.getOrDefault(val,0)+1);
        }
        int maxfr=0;
        int max = 0;
        for (Map.Entry<Integer, Integer>entry:fr.entrySet())
        {
            int freq=entry.getKey();
            int count=entry.getValue();
            if (count>max || (count == max && freq>maxfr)) 
            {
                max=count;
                maxfr=freq;
                }
            }
            String ss="";
            for (Map.Entry<Character,Integer>entry:map.entrySet())
            {
                    if (entry.getValue() == maxfr)
                    {
                        ss+=entry.getKey();
                    }
            }
            return ss;
    }
}