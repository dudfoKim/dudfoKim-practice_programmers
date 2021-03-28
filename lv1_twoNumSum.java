package lv1_20210327;

public class lv1_twoNumSum 
{
	public static long solution(int a, int b)
	{
		long answer = 0;
		long x = (long)a;
		long y = (long)b;
		long temp = x;
		x = Math.min(a, b);
		y = Math.max(temp, b);
		
		for(long i=x; i<=y; i++)
		{
			answer += (long)i;
		}
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(solution(3,5));
	}
}