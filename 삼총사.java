

==========================================================
  
import java.util.ArrayList;

class Solution
{
    static int cnt = 0;
    
    public static void make(int[] number, ArrayList<Integer> list, boolean[] visit, int max, int index)
    {
        if(list.size()==max)
        {
            int temp = 0;
            
            for(Integer i : list)
            {
                temp += i;
            }
            if(temp==0)
            {
                cnt++;
            }
            
            return;
        }
        
        for(int i=index; i<number.length; i++)
        {
            if(!visit[i])
            {
                visit[i] = true;
                list.add(number[i]);
                make(number, list, visit, max, i);
                list.remove(list.size()-1);
                visit[i] = false;
            }
        }
    }
    public int solution(int[] number)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] visit = new boolean[number.length];
        make(number, list, visit, 3, 0);
        
        return cnt;
    }
}
