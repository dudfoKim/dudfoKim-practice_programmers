https://yoloaeee.tistory.com/201

===============================================================================
  
import java.util.Queue;
import java.util.LinkedList;

class Solution
{
    // 상하좌우 4방향 체크
    static int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    
    // BFS 실행
    public static int makeChk(int[][] picture, boolean[][] visit, int[] start, int m, int n)
    {
        int cnt = 0;
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(start);
        visit[start[0]][start[1]] = true;
        
        while(!q.isEmpty())
        {
            cnt++;
            int[] temp = q.poll();
            int y = temp[0];
            int x = temp[1];
            int value = picture[y][x];
            
            for(int i=0; i<4; i++)
            {
                y += dir[i][0];
                x += dir[i][1];
                
                // BFS 실행 시작 좌표의 값과 같은 값을 가지는 좌표만 큐에 넣기
                if(y>=0 && y<m && x>=0 && x<n && value==picture[y][x] && !visit[y][x])
                {
                    q.add(new int[]{y, x});
                    visit[y][x] = true;
                }
                
                y -= dir[i][0];
                x -= dir[i][1];
            }
        }
        
        // 이 영역의 개수를 리턴
        return cnt;
    }
    public int[] solution(int m, int n, int[][] picture)
    {
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        boolean[][] visit = new boolean[m][n];
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(!visit[i][j] && picture[i][j]!=0)
                {
                    // 영역별 최대값 구하기
                    max = Math.max(max, makeChk(picture, visit, new int[]{i, j}, m, n));
                    cnt++;
                }
            }
        }
        
        return new int[]{cnt, max};
    }
}
