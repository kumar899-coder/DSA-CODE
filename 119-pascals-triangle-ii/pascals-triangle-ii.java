class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result =new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            ArrayList<Integer> row=new ArrayList<>();
            long val=1;
            for(int j=0;j<=i;j++)
            {
                row.add((int)val);
                val=val*(i-j)/(j+1);

            }
            result.add(row);

        }
        return result.get(rowIndex);
        
    }
}