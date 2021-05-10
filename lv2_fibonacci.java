package lv2_20210510;

public class lv2_fibonacci 
{
	public static int solution(int n)
	{
		int answer = 0;
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2; i<=n; i++)
		{
			dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
		}
		
		answer = dp[n];
		return answer;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(solution(3));
		System.out.println(solution(5));
	}
}