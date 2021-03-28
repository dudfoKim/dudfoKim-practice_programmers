package lv1_20210325;

public class lv1_XnN 
{
	public static long[] solution(long x, int n) 
    {
        long[] answer = new long[n];
        long mokpyo = x*n;
        long sum = x;
        int count = 0;
        answer[count] = x;
        
        while(x!=mokpyo)
        {
            count++;
            x += sum;
            answer[count] = x;
        }

        return answer;
    }
	
	public static void main(String[] args) 
	{
		long[] result = solution(10000, 5);
		
		for(long temp : result)
		{
			System.out.print(temp + " ");
		}
	}
}