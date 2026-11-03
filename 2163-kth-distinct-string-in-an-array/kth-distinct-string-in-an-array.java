class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> guru=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            guru.put(arr[i],guru.getOrDefault(arr[i],0)+1);
        }
        
        // Fuck you Asshole!!

        for(int i=0;i<arr.length;i++)
        {
            if(guru.get(arr[i])==1)
            {
                k--;
                if(k==0)
                {
                    return arr[i];
                }
            }
        }
        return "";
    }
}