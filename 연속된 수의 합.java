https://yoloaeee.tistory.com/270

=====================================

import java.util.ArrayList;

class Solution
{
    public int[] solution(int num, int total)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int start = -1;
        int end = -1;
        
        if(total%num==0)
        {
            start = (total/num) - (num/2);
            end = (total/num) + (num/2);
        }
        else
        {
            if(num%2==1)
            {
                start = (total/num) - (num/2);
                end = (total/num) + (num/2);
            }
            else
            {
                start = (int)(Math.floor(total/num)) - (num/2) + 1;
                end = (int)(Math.floor(total/num)+1) + (num/2) - 1;
            }
        }
        
        for(int i=start; i<=end; i++)
        {
            list.add(i);
        }
        
        int[] answer = new int[num];
        
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
