https://yoloaeee.tistory.com/272

========================================================
 

class Solution
{
    public String solution(int[] food)
    {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int num = 1;
        
        for(int i=1; i<food.length; i++)
        {
            int cnt = food[i]/2;
            
            for(int j=1; j<=cnt; j++)
            {
                sb.append(num);
            }
            
            num++;
        }
        
        answer = sb.toString();
        sb.append("0");
        sb.reverse();
        
        return answer + sb.toString();
    }
}
