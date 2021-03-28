package lv1_20210327;

public class lv1_stringTOnum 
{
	private static int solution(String s)
	{
		String temp = "";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='-')
			{
				temp += "-";
			}
			else if(s.charAt(i)=='+')
			{
				temp += "";				
			}
			else
			{
				temp += s.charAt(i);				
			}
		}
		
		return Integer.parseInt(temp);
	}
	
	public static void main(String[] args) 
	{
		String input = "+1234";
		System.out.println(solution(input));
	}
}