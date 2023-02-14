https://yoloaeee.tistory.com/283

=====================================
  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution
{
    public Object[] solution(int[] numlist, int n)
    {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        final Integer fix = new Integer(n);
        
        for(int i=0; i<numlist.length; i++)
        {
            answer.add(numlist[i]);
        }
        
        Collections.sort(answer, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b)
            {
                if(Math.abs(a-fix)!=Math.abs(b-fix))
                {
                    return Math.abs(a-fix)-Math.abs(b-fix);
                }
                else
                {
                    return b-a;
                }
            }
        });
        
        return answer.toArray();
    }
}
