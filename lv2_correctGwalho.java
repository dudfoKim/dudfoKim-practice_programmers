package lv2_20210506;

import java.util.Stack;

public class lv2_correctGwalho 
{
	 public static boolean solution(String s) 
	 {
	        Stack stack = new Stack<Object>();
	        
	        for(int i=0; i<s.length(); i++)
	        {
	            if(s.charAt(i)=='(')
	            {
	                stack.add(s.charAt(i));
	            }
	            else
	            {
	                if(stack.size()==0)
	                {
	                    return false;
	                }
	                else
	                {
	                    stack.pop();
	                }
	            }
	        }

	        return (stack.size()==0?true:false);
	    }

	public static void main(String[] args) 
	{
		System.out.println(solution("()()()"));
		System.out.println(solution("()())"));
	}
}