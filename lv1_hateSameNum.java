package lv1_20210324;

import java.util.*;

public class lv1_hateSameNum 
{
	 public static int[] solution(int []arr) 
	 {
		 int[] answer = {};
		 int temp = arr[0];
		 int sIndex = 0;
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 list.add(temp);
		 
		 for(int i=1; i<arr.length; i++)
		 {
			 temp = arr[i];
			 
			 if(temp!=arr[i-1] && sIndex<i)
			 {
				 list.add(arr[i]);
				 sIndex = i;
	         }
		 }

		 answer = new int[list.size()];
		 
		 for(int i=0; i<list.size(); i++)
		 {
			 answer[i] = list.get(i);
		 }

		 return answer;
	 } 
	 
	public static void main(String[] args)
	{
		int[] input = {1,1,3,3,0,1,1};
		int[] result;
		
		result = solution(input);
		
		for(int temp : result)
		{
			System.out.print(temp + " ");
		}
	}
}