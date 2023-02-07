https://yoloaeee.tistory.com/276

==========================================================
  
import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public Object[] solution(int k, int[] score)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
                
        for(int i=0; i<score.length; i++)
        {
            temp.add(score[i]);
            Collections.sort(temp);
            
            if(temp.size()>k)
            {
                list.add(temp.get(temp.size()-k));
            }
            else
            {
                list.add(temp.get(0));
            }
        }
        
        return list.toArray();
    }
}
