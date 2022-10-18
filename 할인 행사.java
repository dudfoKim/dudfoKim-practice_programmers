https://yoloaeee.tistory.com/263

===================================
  
import java.util.HashMap;
import java.util.Map.Entry;

class Solution
{
    public int solution(String[] want, int[] number, String[] discount)
    {
        int answer = 0;
        HashMap<String, Integer> buy = new HashMap<String, Integer>();
        HashMap<String, Integer> market = new HashMap<String, Integer>();
        int day = 0;
        boolean chk = true;
        
        for(Integer i : number)
        {
            day += i;
        }
        for(int i=0; i<want.length; i++)
        {
            buy.put(want[i],number[i]);
        }
        for(int i=0; i<=discount.length-day; i++)
        {
            market.clear();
            chk = true;
            
            for(int j=i; j<i+day; j++)
            {
                if(market.containsKey(discount[j]))
                {
                    market.put(discount[j], market.get(discount[j])+1);
                }
                else
                {
                    market.put(discount[j], 1);
                }
            }
            for(Entry<String, Integer> e : buy.entrySet())
            {
                if(!market.containsKey(e.getKey()))
                {
                    chk = false;
                    break;
                }
                else
                {
                    if(market.get(e.getKey())!=buy.get(e.getKey()))
                    {
                        chk = false;
                        break;
                    }
                }
            }
            if(chk)
            {
                answer++;
            }
        }
        
        return answer;
    }
}
