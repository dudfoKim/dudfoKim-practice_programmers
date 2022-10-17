https://yoloaeee.tistory.com/260

==============================================
  
class Solution
{
    public String solution(String[] survey, int[] choices)
    {
        char[][] category = new char[][]{{'R','T'},{'C','F'},{'J','M'},{'A','N'}};
        int[] score = new int['Z'-'A'+1];
        String result = "";
        
        for(int i=0; i<survey.length; i++)
        {
            if(choices[i]!=4)
            {
                String input = survey[i];
                
                if(choices[i]<4)
                {
                    score[input.charAt(0)-'A'] += Math.abs(4-choices[i]);
                }
                else
                {
                    score[input.charAt(1)-'A'] += Math.abs(4-choices[i]);
                }
            }
        }
        for(int i=0; i<category.length; i++)
        {
            int fir = score[(int)(category[i][0])-(int)'A'];
            int sec = score[(int)(category[i][1])-(int)'A'];
            
            if(fir<sec)
            {
                result += category[i][1];
            }
            else
            {
                result += category[i][0];
            }
        }
        
        return result;
    }
}
