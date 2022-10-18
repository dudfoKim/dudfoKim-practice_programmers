https://yoloaeee.tistory.com/262

==========================================
  
import java.util.TreeMap;

class Solution
{
    public String solution(String X, String Y)
    {
        StringBuilder sb = new StringBuilder();
        boolean change = false;
        int[] valuex = new int[10];
        int[] valuey = new int[10];
        
        for(int i=0; i<X.length(); i++)
        {
            valuex[(int)X.charAt(i)-'0']++;
        }
        for(int i=0; i<Y.length(); i++)
        {
            valuey[(int)Y.charAt(i)-'0']++;
        }
        for(int i=valuex.length-1; i>=0; i--)
        {
            int cnt = 0;
            int num = 0;
            
            if(valuex[i]!=0 && valuey[i]!=0)
            {
                cnt = Math.min(valuex[i], valuey[i]);
                num = valuex[i];
                
                for(int j=0; j<cnt; j++)
                {
                    sb.append(i);
                }
                
                change = true;
            }
        }
        if(!change)
        {
            return "-1";
        }
        else if(sb.toString().charAt(0)=='0')
        {
            return "0";
        }
        else
        {
            return sb.toString();
        }
    }
}
