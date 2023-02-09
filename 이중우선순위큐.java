https://yoloaeee.tistory.com/279

==========================================
  
import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public Object[] solution(String[] operations)
    {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0; i<operations.length; i++)
        {
            String[] temp = operations[i].split(" ");
            
            if(temp[0].equals("I"))
            {
                answer.add(Integer.parseInt(temp[1]));
            }
            else
            {
                if(!answer.isEmpty())
                {
                    if(temp[1].equals("1"))
                    {
                        answer.remove(answer.size()-1);
                    }
                    else
                    {
                        answer.remove(0);
                    }
                }
            }
            
            Collections.sort(answer);
        }
        
        if(answer.isEmpty())
        {
            return new Object[]{0, 0};
        }
        else
        {
            return new Object[]{answer.get(answer.size()-1), answer.get(0)};
        }
    }
}
