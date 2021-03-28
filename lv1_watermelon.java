package lv1_20210322;

import java.util.*;

public class lv1_watermelon 
{
	public static String solution(int n) 
	{
        String answer = "";
        
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                answer += "¼ö";
            }
            else
            {
                answer += "¹Ú";
            }
        }
        return answer;
    }
    
    public static void main(String[] args)
    {
    	System.out.println(solution(3));
    }
}