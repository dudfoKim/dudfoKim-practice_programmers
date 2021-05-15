package lv2_20210515;

import java.util.ArrayList;
import java.util.HashMap;

public class lv2_openChat 
{
	public static String[] solution(String[] record) 
	{
        String[] answer = {};
        String[] printAnswer = new String[2];
        String name = "";
        int arrCnt = 0;
        HashMap<String, String> map = new HashMap<String, String>();
        ArrayList<String> print = new ArrayList<String>();
        
        for(int i=0; i<record.length; i++)
        {
        	String[] temp = record[i].split(" ");
        	
        	if(temp[0].equals("Enter"))
        	{
        		if(map.containsKey(temp[1]))
        		{
        			map.replace(temp[1], temp[2]);
        			name = temp[2];
        		}
        		else
        		{
        			name = temp[1];
            		map.put(temp[1], temp[2]);
        		}

        		print.add("Enter " + temp[1]);
        		arrCnt++;
        	}
        	else if(temp[0].equals("Leave"))
        	{
        		print.add("Leave " + temp[1]);
        		arrCnt++;
        	}
        	else if(temp[0].equals("Change"))
        	{
        		if(map.containsKey(temp[1]))
        		{
        			map.replace(temp[1], temp[2]);
        		}
        	}
        }

        answer = new String[arrCnt];
        
        for(int i=0; i<print.size(); i++)
        {
        	printAnswer = print.get(i).split(" ");
    		name = map.get(printAnswer[1]);
    		
        	if(printAnswer[0].equals("Enter"))
        	{
        		answer[i] = name + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
        	}
        	else if(printAnswer[0].equals("Leave"))
        	{
        		answer[i] = name + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
        	}
        }
        
        
        return answer;
    }
	
	public static void main(String[] args)
	{
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] result = solution(record);
		
		for(String data : result)
		{
			System.out.println(data + " ");
		}
	}
}