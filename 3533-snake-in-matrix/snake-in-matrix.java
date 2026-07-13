class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x=0, y=0;
        int g=commands.size();
        for(int i=0;i<g;i++)
        {
            String command=commands.get(i);
            if(command.equals("UP"))
            {
                x--;
            }else if(command.equals("DOWN"))
            {
                x++;
            }else if(command.equals("RIGHT"))
            {
                y++;
            }else if(command.equals("LEFT"))
            {
                y--;
            }
        }
        return (x*n)+y;
        
    }
}