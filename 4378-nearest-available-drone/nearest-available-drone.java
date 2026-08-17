class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int sum=Integer.MAX_VALUE;
        int cur=-1;
        for(int i=0;i<drones.length;i++)
        {
                int sums=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
                if(sums<=drones[i][2])
                {
                if(sums<sum)
                {
                    sum=sums;
                    cur=i;
                }
            }
        }
        return cur;
    }
}