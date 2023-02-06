https://yoloaeee.tistory.com/275

========================================
  
import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public int solution(String t, String p)
    {
        int answer = 0;
        int len = p.length();
        ArrayList<Long> list = new ArrayList<Long>();
        
        for(int i=0; i<=t.length()-len; i++)
        {
            long temp = Long.parseLong(t.substring(i, i+len));
            list.add(temp);
        }
        
        Collections.sort(list);
        
        for(Long i : list)
        {
            if(i<=Long.parseLong(p))
            {
                answer++;
            }
            else
            {
                break;
            }
        }
        
        return answer;
    }
}
