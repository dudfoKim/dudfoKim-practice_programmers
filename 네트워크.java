https://yoloaeee.tistory.com/195

====================================

import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    // 시작 노드를 기준으로 BFS 실행
    public static int makegraph(int[][] computers, boolean[] visit, int n, int start)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        visit[start] = true;
        
        while(!q.isEmpty())
        {
            int index = q.poll();
            
            for(int i=0; i<n; i++)
            {
                if(computers[index][i]==1 && !visit[i])
                {
                    visit[i] = true;
                    q.add(i);
                }
            }
        }
        
        return 1;
    }
    public int solution(int n, int[][] computers)
    {
        boolean[] visit = new boolean[n];
        int answer = 0;
        
        // 방문하지 않은 정점을 시작 인덱스로 하는 BFS 호출
        for(int i=0; i<n; i++)
        {
            if(!visit[i])
            {
                answer += makegraph(computers, visit, n, i);
            }
        }
        
        return answer;
    }
}
