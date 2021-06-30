import java.util.Arrays;

class Solution 
{
    public int solution(int[] d, int budget) 
    {
        int sum = 0;
        int i = 0;
        
        Arrays.sort(d);
        
        if(d[0]>budget)
        {
            i = 0;
        }
        else
        {
            while(true)
            {
                sum += d[i];
                i++;

                if(i>d.length-1 || budget<sum+d[i])
                {
                    break;
                }
            }
        }
        
        return i;
    }
}
