https://yoloaeee.tistory.com/273

============================================

class Solution
{
    public int[] solution(String s)
    {
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(i==0)
            {
                answer[i] = -1;
            }
            else
            {
                for(int j=i-1; j>=0; j--)
                {
                    if(c==s.charAt(j))
                    {
                        answer[i] = Math.abs(i-j);
                        break;
                    }
                    
                    answer[i] = -1;
                }
            }
        }
