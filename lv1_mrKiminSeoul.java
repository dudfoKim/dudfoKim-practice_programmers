package lv1_20210322;

import java.util.*;

public class lv1_mrKiminSeoul 
{
	public static String solution(String[] seoul) 
    {
        String answer = "";
        String kim = "Kim";
        
        for(int i=0; i<seoul.length; i++)
        {
            if(kim.equals(seoul[i]))
            {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
    
    public static void main(String[] args)
    {
    	String input[] = {"Jane", "Kim", "012345"};
    	System.out.println(solution(input));
    }
}