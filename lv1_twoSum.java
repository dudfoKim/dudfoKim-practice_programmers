package lv1_20210330;

import java.util.*;

// ���α׷��ӽ� ����1 �� �� �̾Ƽ� ���ϱ�
public class lv1_twoSum 
{
	public static int[] solution(int[] numbers) 
	{
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length; i++)
        {
        	for(int j=0; j<numbers.length; j++)
        	{
        		if(i!=j && !list.contains(numbers[i]+numbers[j]))
        		{
        			list.add(numbers[i]+numbers[j]);
        		}
        	}
        }
        
        Collections.sort(list);
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
        {
        	answer[i] = list.get(i);
        }

        return answer;
    }
	
	public static void main(String[] args) 
	{
		int[] numbers = {5,0,2,7};
		int[] result = solution(numbers);
		
		for(int temp : result)
		{
			System.out.println(temp);
		}
	}
}