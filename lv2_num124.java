package lv2_20210507;

public class lv2_num124 
{
	public static String solution(int n) 
    {
        String[] numbers = {"4", "1", "2"};
        String answer = "";
        
        while(n>0)
        {
            answer = numbers[n%3] + answer;
            
            if(n%3==0)
            {
                n--;
            }
            
            n /= 3;
        } 
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		for(int i=1; i<=15; i++)
		{
			System.out.println(solution(i));
		}
	}
}