package lv1_20210327;

//프로그래머스 레벨1 문자열 다루기 기본

public class lv1_stringBasic 
{
	public static boolean solution(String s)
    {
        boolean[] answer = new boolean[s.length()];
        boolean result = false;
        
        if(s.length()==4 || s.length()==6)
        {
            for(int i=0; i<s.length(); i++)
            {
            	int temp = s.charAt(i);
            	
                if(s.charAt(i)>=48 && s.charAt(i)<=57)
                {
                    answer[i] = true;
                }
            }
        }
        
        for(int i=0; i<s.length(); i++)
        {
        	if(!answer[i])
        	{
        		result = false;
        		break;
        	}
        	else
        	{
        		result = true;
        	}
        }
        
        return result;
    }
	
	public static void main(String[] args) 
	{
		System.out.println(solution("0000"));
	}
}