https://yoloaeee.tistory.com/271

============================================
  
class Solution
{
    public int solution(int a, int b, int n)
    {
        int answer = 0;
        
        while(n>=a)
        {
            int rtn = n/a;
            n = n%a;
            answer += rtn*b;
            n += rtn*b;
        }
        
        return answer;
    }
}
