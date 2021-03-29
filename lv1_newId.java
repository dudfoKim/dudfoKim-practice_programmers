package lv1_20210329;

// 프로그래머스 레벨1 신규 아이디 추천
public class lv1_newId 
{
	public static String solution(String new_id) 
    {
        String temp = "";
        temp = new_id.toLowerCase().replaceAll("[^a-z0-9._-]",  "").
        							replaceAll("[.]{2,}", ".").
        							replaceAll("^\\.|\\.$", "");
        
        if(temp.isEmpty())
        {
        	temp = "a";
        }
        if(temp.length()>15)
        {
        	temp = temp.substring(0, 15).replaceAll("\\.$", "");
        }
        
        while(temp.length()<3)
        {
        	temp += temp.charAt(temp.length()-1);
        }
        
        return temp;
    }
	
	public static void main(String[] args) 
	{
		String input = "BaT#*..y.abcdefghijklm";
		System.out.println(solution(input));
	}
}