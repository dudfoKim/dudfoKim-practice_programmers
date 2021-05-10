package lv2_20210510;

import java.util.Arrays;

public class lv2_minNum 
{
    public static int solution(int []a, int []b)
    {
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0; i<a.length; i++)
        {
            answer += a[i] * b[b.length-i-1];
        }

        return answer;
    }
    
	public static void main(String[] args) 
	{
		int[] a = {1, 4, 2};
		int[] b = new int[] {5, 4, 4};
		
		System.out.println(solution(a, b));
	}
}