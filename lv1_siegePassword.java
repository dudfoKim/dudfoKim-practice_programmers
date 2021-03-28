package lv1_20210324;

public class lv1_siegePassword 
{
	public static String solution(String s, int n)
	{
        String answer = "";
        
        for(int i=0; i<s.length(); i++)
        {
            char temp = s.charAt(i);
            char plus = (char)(temp+n);
            
            if(temp==' ')
            {
                answer += " ";
            }
            else
            {
                if(plus>90 && temp>=65 && temp<=90)
                {
                    temp = (char)(plus-26);
                }
                else if(plus>122 && temp>=97 && temp<=122)
                {
                    temp = (char)(plus-26);
                }
                else
                {
                    temp = (char)(plus);
                }
                
                answer += temp;
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args)
	{
		String result = solution(" a B c", 1);

		for(int i=0; i<result.length(); i++)
		{
			System.out.print(result.charAt(i));
		}
	}
}