package lv2_20210610;

import java.util.Arrays;

public class lv2_phoneNumber 
{
	public static boolean solution(String[] phone_book) 
    {        
        boolean answer = true;
        String pattern = "";
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length-1; i++)
        {
            pattern = phone_book[i];
            
            if(phone_book[i+1].matches(pattern + ".*"))
            {
                answer = false;
                break;
            }
        }        
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String[] input = {"119", "97674223", "1195524421"};
		System.out.println(solution(input));
	}
}