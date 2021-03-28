package lv1_20210325;

public class lv1_kolachGuess
{
	public static int solution(int num) 
    {
        int answer = 0;
        long temp = num;
        
        while(temp!=1)
        {
            answer++;
            
            if(temp%2==0)
            {
                temp /= 2;
            }
            else
            {
                temp = (temp*3) + 1;
            }
        }
        
        if(answer>500)
        {
            return -1;
        }
        
        return answer;
    }

	public static void main(String[] args) 
	{
		System.out.println(solution(6));

	}
}