https://yoloaeee.tistory.com/305

=========================================
  
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    static int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    
    public static void traverse(char[][] map, int[] start, int maxX, int maxY, LinkedList<Integer> list)
    {
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{start[0], start[1]});
        int sum = 0;
        sum += map[start[0]][start[1]] - '0';
        map[start[0]][start[1]] = 'X';
        
        while(!q.isEmpty())
        {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            
            for(int i=0; i<dir.length; i++)
            {
                x += dir[i][0];
                y += dir[i][1];
                
                if(x>=0 && x<maxX && y>=0 && y<maxY && map[x][y]!='X')
                {
                    q.add(new int[]{x,y});
                    sum += map[x][y] - '0';
                    map[x][y] = 'X';
                }
                
                x -= dir[i][0];
                y -= dir[i][1];
            }
        }
        
        list.add(sum);
    }
    public static Object[] solution(String[] maps)
    {
        char[][] map = new char[maps.length][maps[0].length()];
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for(int i=0; i<maps.length; i++)
        {
            map[i] = maps[i].toCharArray();
        }
        for(int i=0; i<map.length; i++)
        {
            for(int j=0; j<map[0].length; j++)
            {
                if(map[i][j]!='X')
                {
                    traverse(map, new int[]{i,j}, map.length, map[i].length, list);
                }
            }
        }
        
        if(list.isEmpty())
        {
            return new Object[]{-1};
        }
        
        Collections.sort(list);
        return list.toArray();
    }
}
