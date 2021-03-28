package lv1_20210325;

public class lv1_average
{
	public static double solution(int[] arr) 
    {
        double answer = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            answer += arr[i];
        }
        
        answer /= arr.length;
        return answer;
    }

	public static void main(String[] args) 
	{
		int[] input = {1,2,3,4,5,5};
		double result;
		
		System.out.println(result=solution(input));
	}
}