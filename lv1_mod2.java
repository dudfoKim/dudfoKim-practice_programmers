package lv1_20210325;

public class lv1_mod2
{
    public static String solution(int num) 
    {
        String answer = "";
        
        answer = num%2==0?"Even":"Odd";
        return answer;
    }
    
	public static void main(String[] args) 
	{
		System.out.println(solution(2));
	}
}