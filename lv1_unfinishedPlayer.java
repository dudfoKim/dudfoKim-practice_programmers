package lv1_20210324;

import java.util.*;

public class lv1_unfinishedPlayer
{
	public static String solution(String[] participant, String[] completion) 
    {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String chamga : participant)
        {
            if(!map.containsKey(chamga))
            {
                map.put(chamga, 1);
            }
            else
            {
                map.put(chamga, map.get(chamga)+1);
            }
        }
        
        for(String wanju : completion)
        {
            map.put(wanju, map.get(wanju)-1);
        }
        
        for(String result : participant)
        {
            if(map.get(result)!=0)
            {
                answer += result;
                break;
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args)
	{
		String[] parti = {"a","b","c","d"};
		String[] compl = {"b","c","a"};
		String result = "";
		
		System.out.println(result = solution(parti, compl));
	}
}