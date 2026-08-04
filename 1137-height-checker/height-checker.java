class Solution {
    public int heightChecker(int[] heights) {
        int []c=heights.clone();
        Arrays.sort(c);
        int count=0;
        for(int i=0;i<c.length;i++)
        {
            if(heights[i]!=c[i])
            {
                count++;
            }
        }
        
        return count;
    }
}