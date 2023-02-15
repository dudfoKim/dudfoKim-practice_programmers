https://yoloaeee.tistory.com/284

==============================================
  
class Solution
{
    public int solution(String a, String b)
    {
        int answer = 0;
        
        while(answer<=100)
        {
            if(a.equals(b))
            {
                return answer;
            }
            
            answer++;
            a = a.charAt(a.length()-1) + a.substring(0, a.length()-1);
        }
        
        return -1;
    }
}
