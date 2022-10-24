https://yoloaeee.tistory.com/266

===============================================
  
class Solution 
{
    static int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
    
    public static void makeone(int[][] board, int maxx, int maxy, int x, int y)
    {
        for(int k=0; k<dir.length; k++)
        {
            x += dir[k][0];
            y += dir[k][1];
            
            if(x>=0 && x<maxx && y>=0 && y<maxy)
            {
                board[x][y] = 1;
            }
            
            x -= dir[k][0];
            y -= dir[k][1];
        }
    }
    public int solution(int[][] board)
    {
        int answer = 0;
        int maxx = board.length;
        int maxy = board[0].length;
        boolean[][] visit = new boolean[board.length][board[0].length];
        
        for(int i=0; i<maxx; i++)
        {
            for(int j=0; j<maxy; j++)
            {
                if(board[i][j]==0)
                {
                    visit[i][j] = true;
                }
            }
        }
        for(int i=0; i<maxx; i++)
        {
            int x = i;
            
            for(int j=0; j<maxy; j++)
            {
                int y = j;
                
                if(!visit[i][j] && board[x][y]==1)
                {
                    visit[i][j] = true;
                    makeone(board, maxx, maxy, x, y);
                }
            }
        }
        for(int i=0; i<maxx; i++)
        {
            for(int j=0; j<maxy; j++)
            {
                if(board[i][j]==0)
                {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
