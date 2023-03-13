https://yoloaeee.tistory.com/307

====================================================
  
class Solution 
{
    public int solution(int[][] lines)
    {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<lines.length; i++)
        {
            min = Math.min(min, lines[i][0]);
            max = Math.max(max, lines[i][1]);
        }
        
        int[] graph = new int[max-min+1];
        
        for(int i=0; i<lines.length; i++)
        {
            int s = lines[i][0]-min;
            int e = lines[i][1]-min;
            
            for(int j=s; j<e; j++)
            {
                graph[j]++;
            }
        }
        for(int i=0; i<graph.length; i++)
        {
            if(graph[i]>1)
            {
                answer++;
            }
        }
        
        return answer;
    }
}
