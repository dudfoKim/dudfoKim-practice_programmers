https://yoloaeee.tistory.com/267

==============================================
  
class Solution
{
    public String[] solution(String[] quiz)
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<quiz.length; i++)
        {
            String[] value = quiz[i].split(" ");
            int calc = 0;
            
            if(value[1].charAt(0)=='+')
            {
                calc = Integer.parseInt(value[0]) + Integer.parseInt(value[2]);
            }
            else
            {
                calc = Integer.parseInt(value[0]) - Integer.parseInt(value[2]);
            }
            if(calc==Integer.parseInt(value[4]))
            {
                sb.append("O");
            }
            else
            {
                sb.append("X");
            }
        }
        
        String[] answer = new String[sb.length()];
        
        for(int i=0; i<sb.length(); i++)
        {
            answer[i] = (sb.charAt(i) + "");
        }
        
        return answer;
    }
}
