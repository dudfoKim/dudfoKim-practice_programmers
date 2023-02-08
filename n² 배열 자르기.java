https://yoloaeee.tistory.com/278

==================================

import java.util.ArrayList;

class Solution
{
    public Object[] solution(int n, long left, long right)
    {
        ArrayList<Long> answer = new ArrayList<Long>();
        
        if(n==1)
        {
            return new Object[]{1};
        }
        for(long i=left; i<=right; i++)
        {
            long row = i/n;
            long col = i%n;
            answer.add(Math.max(row, col)+1);
        }
        
        return answer.toArray();
    }
}
