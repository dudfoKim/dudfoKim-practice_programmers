package lv2_20210506;

public class lv2_numPresentation 
{
	public static int solution(int n) 
    {
        int answer = 0;
        int sum = 0;
        
        for(int i=1; i<=n; i++)
        {
            sum = 0;
            
            for(int j=i; j<=n; j++)
            {
                sum += j;
                
                if(sum==n)
                {
		    answer++;
                    sum = 0;
                    break;
                }
                if(sum>n)
                {
                    break;
                }
            }
        }
        
        return answer;
    }
	
    public static void main(String[] args)
    {
    	System.out.println(solution(15));
    }
}
