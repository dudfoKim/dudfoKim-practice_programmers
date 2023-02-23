https://yoloaeee.tistory.com/291

================================
  
import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    public String solution(String[] cards1, String[] cards2, String[] goal)
    {
        Queue<String> one = new LinkedList<String>();
        Queue<String> two = new LinkedList<String>();
        Queue<String> target = new LinkedList<String>();
        
        for(int i=0; i<cards1.length; i++)
        {
            one.add(cards1[i]);
        }
        for(int i=0; i<cards2.length; i++)
        {
            two.add(cards2[i]);
        }
        for(int i=0; i<goal.length; i++)
        {
            target.add(goal[i]);
        }
        while(!target.isEmpty())
        {
            if(one.size()!=0 && one.peek().equals(target.peek()))
            {
                one.poll();
                target.poll();
            }
            else if(two.size()!=0 && two.peek().equals(target.peek()))
            {
                two.poll();
                target.poll();
            }
            else
            {
                return "No";
            }
        }
        
        return "Yes";
    }
}
