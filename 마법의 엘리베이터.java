https://yoloaeee.tistory.com/294

====================================

class Solution
{
    public int solution(int storey)
    {
        int answer = 0;
        
        while(storey!=0)
        {
            int cnt = storey%10;
            
            if(cnt>5)
            {
                cnt -= 10;
                cnt = Math.abs(cnt);
                storey += cnt;
            }
            else if(cnt==5)
            {
                if((storey/10)%10>=5)
                {
                    cnt = 5;
                    storey += cnt;
                }
            }
            
            storey /= 10;
            answer += cnt;
        }
        
        return answer;
    }
}
