package lv2_20210511;

import java.util.ArrayList;

public class lv2_wordChain 
{
	public static int[] solution(int n, String[] words) 
	{
        int[] answer = new int[2];
        int i = -1;
        boolean chk = false;
        ArrayList<String> s = new ArrayList<String>();

        for(String data : words)
        {
            i++;
            
            if(i==0)
            {
                s.add(data);
            }
            else
            {
                if(s.get(i-1).charAt(s.get(i-1).length()-1)!=data.charAt(0))
                {
                    chk = true;
                    break;
                }
                else if(s.contains(data))
                {
                    chk = true;
                    break;
                }
                else
                {
                    s.add(data);
                }
            }
        }
        
        i++;
        
        if(!chk)
        {
            answer[0] = 0;
            answer[1] = 0;
        }
        else
        {
            if(i%n==0)
            {
                answer[0] = n;
                answer[1] = i/n;                
            }
            else
            {
                answer[0] = i%n;
                answer[1] = (i/n)+1;
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String[] n = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		int[] result = solution(5, n);
		
		for(int data : result)
		{
			System.out.print(data + " ");
		}
	}
}