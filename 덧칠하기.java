https://yoloaeee.tistory.com/300

===========================================
  
import java.util.Arrays;

class Solution
{
    public int solution(int n, int m, int[] section)
    {
        int answer = 0;
        int[] paint = new int[n];
        int index = 0;
        Arrays.fill(paint, 1);
        
        for(int i=section.length-1; i>=0; i--)
        {
            paint[section[i]-1] = 0;
        }
        for(int i=0; i<n; i++)
        {
            if(paint[i]==0)
            {
                index = i;
                answer++;
                
                for(int j=index; j<index+m; j++)
                {
                    if(j<n && paint[j]==0)
                    {
                        paint[j] = 1;
                    }
                }
            }
        }
        
        return answer;
    }
}
