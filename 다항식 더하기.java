https://yoloaeee.tistory.com/268

===========================================
  
import java.util.TreeMap;
import java.util.Map.Entry;

class Solution
{
    public String solution(String polynomial)
    {
        if(polynomial.equals(" ") || polynomial.equals(""))
        {
            return "0";
        }
        else if(polynomial.length()==1)
        {
            return polynomial;
        }
        
        StringBuilder answer = new StringBuilder();
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        int cnt = 0;
        String[] value = polynomial.split("\\+");
        
        for(String s : value)
        {
            s = s.trim();
            int temp = -1;
            
            if(s.contains("x"))
            {
                if(s.length()==1)
                {
                    s = "1x";
                }
                
                temp = Integer.parseInt(s.replace("x",""));
                
                if(map.containsKey("-1"))
                {
                    map.put("-1", map.get("-1") + temp);
                }
                else
                {
                    map.put("-1", temp);
                }
            }
            else
            {
                temp = Integer.parseInt(s);
                
                if(map.containsKey("1"))
                {
                    map.put("1", map.get("1") + temp);
                }
                else
                {
                    map.put("1", temp);
                }
            }
        }
        
        for(Entry<String, Integer> e : map.entrySet())
        {
            if(e.getKey().equals("-1"))
            {
                if(e.getValue()!=1)
                {
                    answer.append(e.getValue());
                }
                answer.append("x");
                cnt++;
            }
            else
            {
                if(cnt!=0)
                {
                    answer.append(" + ");
                }
                
                answer.append(e.getValue());
            }
        }
        
        return answer.toString();
    }
}
