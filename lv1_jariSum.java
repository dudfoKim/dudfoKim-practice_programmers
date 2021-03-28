package lv1_20210326;

public class lv1_jariSum 
{
	public static int solution(int n)
    {
        int answer = 0;

        while(n!=0)
        {
            answer += (n%10);
            n /= 10;
        }

        return answer;
    }
	
	
	public static void main(String[] args) 
	{
		System.out.println(solution(123));
	}

}