import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    public int compare(String a, String b)
    {
        int result = 0;
        
        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                result++;
            }
        }
        
        return result;
    }
    
    public int solution(String begin, String target, String[] words)
    {
        int answer = 0;
        boolean[] chk = new boolean[words.length];
        boolean contain = false;
        Queue<String[]> q = new LinkedList<String[]>();
        q.add(new String[]{begin, answer + ""});
        
        for(int i=0; i<words.length; i++)
        {
            if(target.equals(words[i]))
            {
                contain = true;
            }
        }
        
        if(!contain)
        {
            return 0;
        }
        
        while(true)
        {
            begin = q.peek()[0];
            answer = Integer.parseInt(q.poll()[1]);
            
            if(begin.equals(target))
            {
                break;
            }
            
            for(int i=0; i<words.length; i++)
            {
                if(!chk[i] && compare(begin, words[i])==1)
                {
                    chk[i] = true;
                    q.add(new String[]{words[i], (answer+1) + ""});
                }
            }
        }
        
        return answer;
    }
}
