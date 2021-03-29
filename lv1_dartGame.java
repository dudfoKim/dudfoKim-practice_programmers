package lv1_20210329;

import java.util.*;

// 프로그래머스 레벨1 다트게임
public class lv1_dartGame
{
	public static int solution(String dartResult) 
	{
        int answer = 0;
        int length = dartResult.length();
        int[] score = new int[length];
        char[] bonus = new char[length];
        char[] option = new char[length];
        int index = -1;
        int calc = 0;
        int start_calc = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        char temp;
        
        for(int i=0; i<dartResult.length(); i++)
        {
        	temp = dartResult.charAt(i);
        	
        	if(temp-'0'>=0 && temp-'0'<=10)
        	{
        		index++;
        		
        		if(dartResult.charAt(i+1)-'0'>=0 && dartResult.charAt(i+1)-'0'<=10)
        		{
        			score[index] = 10;
        			i++;
        		}
        		else
        		{
	        		score[index] = ((int) temp-48);
        		}
        	}
        	else if(temp=='*' || temp=='#')
        	{
        		option[index] = temp;
        	}
        	else
        	{
        		bonus[index] = temp;
        	}
        }
        
        index = 0;
        
        while(index!=score.length)
        {
        	calc = score[index];
        	
        	if(bonus[index]=='D')
        	{
        		calc = (int) Math.pow(score[index], 2);
        	}
        	if(bonus[index]=='T')
        	{
        		calc = (int) Math.pow(score[index], 3);
        	}
        	if(option[index]=='#')
        	{
        		calc *= -1;
        	}
        	if(option[index]=='*')
        	{
        		if(index==0)
        		{
        			calc *= 2;
        		}
        		else
        		{
        			calc *= 2;
        			start_calc = list.remove(index-1) * 2;
        			list.add(start_calc);
        		}
        	}
        	
        	list.add(calc);
        	index++;
        }
        
        for(Integer point : list)
        {
        	answer += point;
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String input = "1D2S#10S";
		System.out.println(solution(input));
	}
}