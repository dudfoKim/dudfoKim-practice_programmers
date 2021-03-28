package lv1_20210325;

public class lv1_strangeString 
{
	public static String solution(String s)
	{
        String answer = "";
        char temp;
        int j = 0;
        
        for(int i=0; i<s.length(); i++)
        {
            temp = s.charAt(i);
            
            if(temp==' ')
            {
                j = 0;
            }
            else
            {
                if(j%2==0)
                {
                    if(temp>=97 && temp<=122)
                    {
                        temp -= 32;
                    }
                }
                else
                {
                    if(temp>=65 && temp<=90)
                    {
                        temp += 32;
                    }
                }
                
                j++;
            }
            
            answer += temp;
        }
        return answer;
    }
	
	public static void main(String[] args) 
	{
		System.out.println(solution("tRy HelLo"));
	}
}