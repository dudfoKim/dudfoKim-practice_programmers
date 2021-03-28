package lv1_20210325;

public class lv1_PnY
{
	private static boolean solution(String s) 
    {
        boolean answer = true;
        char temp;
        int[] count = new int[2];
        
        for(int i=0; i<s.length(); i++)
        {
            temp = s.charAt(i);
            
            if(temp=='p' || temp=='P')
            {
                count[0]++;
            }
            else if(temp=='y' || temp=='Y')
            {
                count[1]++;
            }
        }
        
        if(count[0]!=count[1])
        {
            return false;
        }

        return answer;
    }
	
	public static void main(String[] args) 
	{
		System.out.println(solution("PpYy"));
	}
}