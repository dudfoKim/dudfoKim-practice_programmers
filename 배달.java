package prac;

import java.util.Arrays;

public class prac
{
public static int solution(int N, int[][] road, int K)
    {
    // 필요 배열 및 변수 선언
    int answer = 0;
    int[][] path = new int[N][N];
    int cost[] = new int[N];
    boolean chk[] = new boolean[N];

    // 그래프, 거리 배열 초기값 설정
    Arrays.fill(cost, Integer.MAX_VALUE);

    for(int i=0; i<road.length; i++)
    {
        // 시작마을 - 도착마을 - 거리
        int start = road[i][0]-1;
        int end = road[i][1]-1;
        int weight = road[i][2];

        // 중복된 간선일 경우 최소값 설정
        if(path[start][end]!=0)
        {
            path[start][end] = Math.min(road[i][2], path[start][end]);
            path[end][start] = Math.min(road[i][2], path[end][start]);
        }
        else
        {
            path[start][end] = road[i][2];
            path[end][start] = road[i][2];
        }
    }

    // dijkstra 알고리즘 초기값 설정
    for(int i=0; i<N; i++)
    {
        if(!chk[i] && path[0][i]!=0)
        {
            cost[i] = path[0][i];
        }
    }

    cost[0] = 0;
    chk[0] = true;

    // dijkstra 알고리즘 적용
    for(int a=0; a<N-1; a++)
    {
        int min = Integer.MAX_VALUE;
        int index = 0;

        for(int i=0; i<N; i++)
        {
            if(!chk[i] && min>cost[i])
            {
                min= cost[i];
                index = i;
            }
        }

        chk[index] = true;

        for(int i=0; i<N; i++)
        {
            if(!chk[i] && path[index][i] != 0)
            {
                if(cost[i]>cost[index]+path[index][i])
                {
                    cost[i] = cost[index]+path[index][i];
                }
            }
        }
    }

    // 방문길이 충족 마을 카운트
    for(int i=0; i<N; i++)
    {
        if(cost[i]<=K)
        {
            answer++;
        }
    }

    return answer;
}
