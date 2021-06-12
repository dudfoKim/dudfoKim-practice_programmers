package lv2_20210612;

import java.util.HashMap;

public class lv2_fakeDress 
{
	public static int solution(String[][] clothes) 
    {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<clothes.length; i++)
        {
            if(!map.containsKey(clothes[i][1]))
            {
                map.put(clothes[i][1], 1);
            }
            else
            {
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }
        }
        
        for(String keys : map.keySet())
        {
            answer *= map.get(keys)+1;
        }
        
        return answer-1;
    }
	
	public static void main(String[] args) 
	{
		String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}
}