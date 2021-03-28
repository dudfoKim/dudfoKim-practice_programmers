package lv1_20210323;

import java.util.*;

public class lv1_CenterChar 
{

    public static String solution(String s)
    {
        String answer = "";
        int length = s.length();
        
        if(length%2==1)
        {
            answer += s.charAt(length/2);
        }
        else
        {
            answer += s.charAt((length/2)-1) + "" + s.charAt(length/2);
        }
        
        return answer;
    }
    
	public static void main(String[] args)
	{
		String input = "abc";
		System.out.println(solution(input));
	}
}