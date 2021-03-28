package lv1_20210322;

import java.util.*;

public class lv1_hidePhoneNumber 
{
	public static String solution(String phone_number) 
    {
        String answer = "";
        
        for(int i=0; i<phone_number.length(); i++)
        {
            if(i>phone_number.length()-5)
            {
                answer += phone_number.charAt(i);
            }
            else
            {
                answer += "*";
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args)
    {
    	System.out.println(solution("01012345678"));
    }
}