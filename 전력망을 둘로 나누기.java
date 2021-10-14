https://yoloaeee.tistory.com/129

=====================================================================================
  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

class Solution
{
    public static void dfs(ArrayList<int[]> list, Stack<Integer> s, int[][] graph, boolean[] visit, int n, int start)
    {
        int cnt = 0;
        s.add(start);
        visit[start] = true;
        
        // dfs 실행
        while(!s.isEmpty())
        {
            cnt++;
            int index = s.pop();
            
            for(int i=0; i<graph[index].length; i++)
            {
                if(graph[index][i]!=0 && !visit[i])
                {
                    visit[i] = true;
                    s.add(i);
                }
            }
        }
        
        // 없앤 송전탑의 인덱스를 기준으로, 양 송전탑 집합의 개수 차이를 리스트에 삽입
        list.add(new int[]{start, Math.abs(cnt-(n-cnt))});
    }
    public int solution(int n, int[][] wires)
    {
        // 예외처리 : 송전탑이 2개일 경우 무조건 0 출력
        if(n==2)
        {
            return 0;
        }
        
        // dfs 실행을 위한 초기값 설정
        boolean[] visit = new boolean[n];
        int[][] graph = new int[n][n];
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<int[]> list = new ArrayList<int[]>();
        
        // wires 배열로 받은 값을 graph 배열로 설정
        for(int i=0; i<wires.length; i++)
        {
            graph[wires[i][0]-1][wires[i][1]-1] = 1;
            graph[wires[i][1]-1][wires[i][0]-1] = 1;
        }
        
        for(int i=0; i<wires.length; i++)
        {
            // wires의 인덱스에 따라 하나씩 값을 없애고 dfs 실행
            graph[wires[i][0]-1][wires[i][1]-1] = 0;
            graph[wires[i][1]-1][wires[i][0]-1] = 0;
            dfs(list, s, graph, visit, n, i);
            
            // 값을 없애기 전 단계로 초기화 설정
            Arrays.fill(visit, false);
            graph[wires[i][0]-1][wires[i][1]-1] = 1;
            graph[wires[i][1]-1][wires[i][0]-1] = 1;
        }
        
        // 송전탑 집합의 차를 기준으로 오름차순 정렬
        Collections.sort(list, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2)
            {
                if(o1[1]!=o2[1])
                {
                    return o1[1]>o2[1]==true?1:-1;
                }
                else
                {
                    return 0;
                }
            }
        });
        
        // 제일 차이가 적은 값을 출력
        return list.get(0)[1];
    }
}
