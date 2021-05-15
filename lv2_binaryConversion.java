package lv2_20210515;

public class lv2_binaryConversion 
{
	public static int[] solution(String s)
	{
        int[] answer = new int[2];
        int oneCnt = 0;
        int zeroCnt = 0;
        int loopCnt = 0;
        int i = 0;
        
        while(!s.equals("1"))
        {
        	oneCnt = 0;
        	
        	for(i=0; i<s.length(); i++)
        	{
        		if(s.charAt(i)=='0')
        		{
        			zeroCnt++;
        		}
        		else
        		{
        			oneCnt++;
        		}
        	}
        	
        	loopCnt++;
        	s = toBinary(oneCnt);
        }
        
        answer[0] = loopCnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
	
	public static String toBinary(int input)
	{
		String result = "";
		
		if(input==0)
		{
			return result;
		}
		else
		{
			result += toBinary(input/2) + input%2;
		}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		int[] result = solution("110010101001");

		for(int data : result)
		{
			System.out.print(data + " ");
		}
	}
}