package lv1_20210327;

import java.util.*;

//���α׷��ӽ� ����1 ������ �������� ���� �迭

public class lv1_divideArray
{
    public static int[] solution(int[] arr, int divisor) 
    {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = 0;
        
        for(int i=0; i<arr.length; i++)
        {
        	if(arr[i]%divisor==0)
        	{
        		size++;
        		list.add(arr[i]);
        	}
        }
        
        if(size==0)
        {
        	answer = new int[1];
        	answer[0] = -1;
        }
        else
        {
	        answer = new int[size];
	        
	        for(int i=0; i<size; i++)
	        {
	        	answer[i] = list.get(i);
	        }
	        
	        Arrays.sort(answer);
        }

    	return answer;
    }
    
	public static void main(String[] args) 
	{
		int input[] = {3,2,36,1,3};
		int divisor = 10;
		int result[] = solution(input, divisor);
		
		for(int temp : result)
		{
			System.out.print(temp + " ");
		}
	}
}