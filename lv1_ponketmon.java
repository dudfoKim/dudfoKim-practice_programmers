package lv1_20210327;

import java.util.*;

// ���α׷��ӽ� ����1 ���ϸ�
public class lv1_ponketmon 
{
    public static int solution(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++)
        {
        	set.add(nums[i]);
        }
        
    	return Math.min(set.size(), nums.length/2);
    }
    
	public static void main(String[] args) 
	{
		int[] input = {3,3,3,3};
		int temp = solution(input);
		
		System.out.print(temp);
	}
}