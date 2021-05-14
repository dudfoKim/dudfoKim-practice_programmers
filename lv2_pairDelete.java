package lv2_20210514;

import java.util.Stack;

public class lv2_pairDelete 
{
	public static int solution(String s)
    {
        int i = 0;
        int answer = 0;
        char temp = 0;
        Stack<Character> stack = new Stack<Character>();
        
        if(s.length()!=0)
        {
        	stack.add(s.charAt(0));
        	i++;
        	
        	while(i!=s.length())
        	{
        		if(!stack.isEmpty())
        		{
        			temp = stack.peek();
        		
	        		if(temp==s.charAt(i))
	        		{
	        			stack.pop();
	        		}
	        		else
	        		{
	        			stack.add(s.charAt(i));
	        		}
        		}
        		else
        		{
        			stack.add(s.charAt(i));
        		}
        		
    			i++;
        	}

            return stack.isEmpty()==true?1:0;
        }
        else
        {
        	return 1;
        }
    }

	public static void main(String[] args) 
	{
		System.out.println(solution("baabaa"));
	}
}