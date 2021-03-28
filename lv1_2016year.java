package lv1_20210322;

import java.util.*;

public class lv1_2016year 
{
    public static String solution(int a, int b)
    {
        String answer = "";
        int plus = 0;
        int day[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        String yoil[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        for(int i=0; i<a-1; i++)
        {
            plus += day[i];
        }
        
        plus = plus + (b-1);
        int temp = plus%7;
        
        answer = yoil[temp];
        
        return answer;
    }
    
    public static void main(String[] args)
    {
    	System.out.println(solution(5, 24));
    }
}