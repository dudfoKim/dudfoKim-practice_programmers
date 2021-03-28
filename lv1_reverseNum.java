package lv1_20210325;

import java.util.*;

public class lv1_reverseNum 
{
	public static int[] solution(long n) 
	{
        int[] answer = {};
        int temp = 0;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n!=0)
        {
            temp = (int)(n%10);
            list.add(temp);
            n /= 10;
            index++;
        }
        
        answer = new int[index];
        
        for(int i=0; i<index; i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		int[] result = solution(12345);
		
		for(int temp : result)
		{
			System.out.print(temp);
		}
	}
}