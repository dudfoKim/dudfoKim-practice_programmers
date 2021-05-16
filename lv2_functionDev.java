package lv2_20210516;

import java.util.ArrayList;
import java.util.Stack;

public class lv2_functionDev 
{
	public static int[] solution(int[] progresses, int[] speeds) 
	{
        int[] answer = {};
        int goal = 100;
        int temp = 0;
        int loop = 0;
        int pop = 0;
        int stackSize = 0;
        int i = 0;
        int j = 0;
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(i=0; i<progresses.length; i++)
        {
        	temp = progresses[i];
        	loop = 0;
        	
        	while(temp<goal)
        	{
        		loop++;
        		temp = progresses[i] + (speeds[i]*loop);
        	}
        	
        	if(!stack.isEmpty())
        	{
        		pop = stack.peek();
        		
        		if(loop<pop)
        		{
        			stack.add(pop);
        		}
        		else
        		{
        			stack.add(loop);
        		}
        		stackSize++;
        	}
        	else
        	{
        		stack.add(loop);
        		stackSize++;
        	}
        }

        while(!stack.isEmpty())
        {
        	int chk = stack.pop();
        	i = 1;
        	j = 0;
        	
        	
        	while(!stack.isEmpty() && j<stack.size())
        	{
        		if(chk==stack.get(j))
        		{
        			i++;
        			stack.remove(j);
        			j = 0;
                }
        		else
        		{
        			j++;
        		}
        	}

    		list.add(i);
        }
        
        answer = new int[list.size()];
        
        for(i=0; i<list.size(); i++)
        {
        	answer[i] = list.get(list.size()-1-i);
        }
        
        return answer;
    }

	public static void main(String[] args) 
	{
		
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		int[] result = solution(progresses, speeds);
		
		for(int data : result)
		{
			System.out.print(data + " ");
		}
		
		System.out.println();
		
		int[] progresses1 = {95, 90, 99, 99, 80, 99};
		int[] speeds1 = {1, 1, 1, 1, 1, 1};
		int[] result1 = solution(progresses1, speeds1);
		
		for(int data : result1)
		{
			System.out.print(data + " ");
		}

		System.out.println();

		int[] progresses2 = {85, 88, 87};
		int[] speeds2 = {1, 1, 1};
		int[] result2 = solution(progresses2, speeds2);
		
		for(int data : result2)
		{
			System.out.print(data + " ");
		}
	}
}