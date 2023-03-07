https://yoloaeee.tistory.com/302

==============================================
  
class Solution
{
    public String solution(String s, String skip, int index)
    {
        String answer = "";
        
        for(int i=0; i<s.length(); i++)
        {
            char temp = (char)(s.charAt(i));
            int cnt = 0;
            
            while(cnt<index)
            {
                cnt++;
                temp++;
                
                if(temp>'z')
                {
                    temp -= 26;
                }
                for(int j=0; j<skip.length(); j++)
                {
                    if(temp==skip.charAt(j))
                    {
                        cnt--;
                        break;
                    }
                }
            }
            
            answer += temp;
        }
        
        return answer;
    }
}
