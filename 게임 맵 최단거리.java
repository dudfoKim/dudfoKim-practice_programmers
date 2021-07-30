import java.util.Queue;

import java.util.LinkedList;

 

class Solution

{

    public int solution(int[][] maps)

    {

        int n = maps.length;

        int m = maps[0].length;

        int[][] visit = new int[n][m];

        Queue&LT;int[]&GT; q = new LinkedList&LT;int[]&GT;();

        int x = 0;

        int y = 0;

        

        visit[0][0] = 1;

        q.add(new int[]{0,0});

        

        while(!q.isEmpty())

        {

            int[] temp = q.poll();

            x = temp[0];

            y = temp[1];

            

            if((x+1&LT;n) &AMP;&AMP; maps[x+1][y]==1 &AMP;&AMP; visit[x+1][y]==0)

            {

                visit[x+1][y] = visit[x][y]+1;

                q.add(new int[]{x+1, y});

            }

            if((x-1&GT;=0) &AMP;&AMP; maps[x-1][y]==1 &AMP;&AMP; visit[x-1][y]==0)

            {

                visit[x-1][y] = visit[x][y]+1;

                q.add(new int[]{x-1, y});

            }

            if((y+1&LT;m) &AMP;&AMP; maps[x][y+1]==1 &AMP;&AMP; visit[x][y+1]==0)

            {

                visit[x][y+1] = visit[x][y]+1;

                q.add(new int[]{x, y+1});

            }

            if((y-1&GT;=0) &AMP;&AMP; maps[x][y-1]==1 &AMP;&AMP; visit[x][y-1]==0)

            {

                visit[x][y-1] = visit[x][y]+1;

                q.add(new int[]{x, y-1});

            }

        }

        

        return visit[n-1][m-1]==0?-1:visit[n-1][m-1];

    }

}
