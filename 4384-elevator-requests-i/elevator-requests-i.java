class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sec=0;
        int num=0;
        for(int i:requests)
        {
            sec+=Math.abs(num-i);
            num=i;
        }
        return sec;
        
    }
}