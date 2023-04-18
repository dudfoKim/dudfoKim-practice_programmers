https://yoloaeee.tistory.com/334

=================================================================
  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Solution
{
    public static int solution(int k, int m, int[] score)
	 {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 int answer = 0;
		 
		 for(int i=0; i<score.length; i++)
		 {
			 if(map.containsKey(score[i]))
			 {
				 map.put(score[i], map.get(score[i])+1);
			 }
			 else
			 {
				 map.put(score[i], 1);
			 }
		 }

		 List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		 Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
		 {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2)
			{
				return o2.getKey()-o1.getKey();
			}
		 });
		 
		 int min = Integer.MAX_VALUE;
		 int cnt = 0;
				 
		 for(int i=0; i<list.size(); i++)
		 {
			 cnt += list.get(i).getValue();
			 min = Math.min(min, list.get(i).getKey());
			 
			 if(cnt>=m)
			 {
				 answer += (cnt/m)*m*min;
			 }
			 
			 cnt %= m;
			 
			 if(cnt!=0)
			 {
				 min = Math.min(min, list.get(i).getKey());
			 }
		 }
		 
		 System.out.println(answer);
		 return answer;
	}
}
