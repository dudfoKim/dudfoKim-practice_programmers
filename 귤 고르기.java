https://yoloaeee.tistory.com/331

=======================================

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

class Solution
{
public static int solution(int k, int[] tangerine)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int answer = 0;
        
        for(int i=0; i<tangerine.length; i++)
        {
            if(map.containsKey(tangerine[i]))
            {
                map.put(tangerine[i], map.get(tangerine[i])+1);
            }
            else
            {
                map.put(tangerine[i], 1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>()
        {
          @Override
          public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2)
          {
               return o2.getValue()-o1.getValue();
          }
        });
        
        for(Entry<Integer, Integer> l : list)
        {
         if(k<=0)
         {
              break;
         }
         else
         {
              k -= l.getValue();
              answer++;
         }
        }
        
        return answer;
    }

}
