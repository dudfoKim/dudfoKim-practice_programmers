https://yoloaeee.tistory.com/264

==========================================
  
class Solution
{
    static String max = "";
    
    public static void round(int now,int[][] dungeons, boolean[] visit, int cnt, String result)
    {
        if(cnt==dungeons.length)
        {
            if(max.length()<result.length())
            {
                max = result;
            }
            
            return;
        }
        for(int i=0; i<dungeons.length; i++)
        {
            if(now>=dungeons[i][0])
            {
                if(!visit[i])
                {
                    visit[i] = true;
                    round(now-dungeons[i][1], dungeons, visit, cnt+1, result+i+"");
                    visit[i] = false;
                }
            }
            else
            {
                if(max.length()<result.length())
                {
                    max = result;
                }
            }
        }
    }
    public int solution(int k, int[][] dungeons)
    {
        boolean[] visit = new boolean[dungeons.length];
        round(k, dungeons, visit, 0, "");
        return max.length();
    }
}
